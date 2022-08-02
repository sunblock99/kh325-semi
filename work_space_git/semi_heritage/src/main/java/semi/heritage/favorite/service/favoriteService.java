package semi.heritage.favorite.service;

import static semi.heritage.common.jdbc.JDBCTemplate.commit;
import static semi.heritage.common.jdbc.JDBCTemplate.getConnection;
import static semi.heritage.common.jdbc.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import semi.heritage.favorite.dao.favoriteDao;
import semi.heritage.favorite.vo.favoriteMyPageVO;
import semi.heritage.heritageInfo.vo.HeritageMainVO;

public class favoriteService {

	private favoriteDao dao = new favoriteDao();
	private Connection conn = null;
	
	public favoriteService() {
		conn = getConnection();
	}
	
	// 문화재 찜 insert
	public int insert(int uNo, int no) {
		int result = dao.insert(conn, uNo, no);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	// 문화재 찜 delete
	public int delete(int uNo, int no) {
		int result = dao.delete(conn, uNo, no);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
	
	// 마이페이지 문화재 찜목록 출력
	public List<favoriteMyPageVO> selectAll(int uNo) {
		return dao.selectAll(conn, uNo);
	}
	
	// 문화재 번호로 찜 개수 구하기
	public int CountFavoriteByNo(int no){
		return dao.CountFavoriteByNo(conn, no);
	}

	public static void main(String[] args) {
		List<HeritageMainVO> list = new ArrayList<HeritageMainVO>();
		int no = 0;
		favoriteDao d = new favoriteDao();
		Connection conn = getConnection();
		for (int j = 0; j < list.size(); j++) {
			no = d.CountFavoriteByNo(conn, list.get(j).getNo());
		}
	}
}
