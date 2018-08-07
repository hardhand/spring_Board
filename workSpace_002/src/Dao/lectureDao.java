package Dao;

import java.util.List;

import Model.lecture;
import Model.lectureComment;
import Model.lectureRecomment;

public interface lectureDao {

	public List<lecture> searchLecture(String searchWord, int type);
	public int	insertLecture(lecture lecture);
	public int	updateLecture(int no);
	public int	deleteLecture(int no);
	public lecture	selectOneLecture(int no);
	public int	insertAttendants(int no, String id);
	public List<lecture>	selectRecentLectureA();
	public List<lecture>	selectRecentLectureG();
	public List<lecture>	selectAllLectureA();
	public List<lecture>	selectAllLectureG();
	public int	insertLectureComment(lectureComment lectureComment);
	public int	insertLectureRecomment(lectureRecomment lectureRecomment);
	public List<lectureComment>	selectLectureComment(int no);
	public List<lectureRecomment>	selectLectureRecomment(int commentNo);

	
}
