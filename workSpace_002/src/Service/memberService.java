package Service;

import java.util.HashMap;
import java.util.List;

import Model.art;
import Model.lecture;
import Model.member;
import Model.pay;

public interface memberService {

	public	member	selectOneMember	(String id);
	public	int	insertMember	(member member);
	public	List<member>	searchMember	(String searchWord, int isCheck);
	public	List<member>	searchApproveArtist	(String searchWord);
	public	List<member>	selectAllMember	(boolean torf);
	public	int	deleteMember	(String id);
	public	int	blackList	(String id, boolean state);
	public	int	updateApproveArtist	(String id);
	public	int	updateRefuseArtist	(String id);
	public	int	updateMember	(member member);
	public	List<lecture>	selectMyAttendLec	(String id);
	public	List<lecture>	selectGatherLec	(String id);
	public	List<pay>	selectOnePay	(String id);
	public	int	insertLecturePay	(pay pay);
	public	int	insertArt	(art art);
	public	List<art>	selectArtistArt	(String id);
	public	int	updateArt	(int no, String file, String title, String content);
	public	int	deleteArt	(int no, String id);
	public	List<lecture>	selectRequestLec	(String id, int state);
	public	List<lecture>	selectApproveLec	(String id, int state);
	public	List<art>	selectSellingArt	(String id);
	public	HashMap<String, String>	selectSoldArt	(String id);
	public	List<art>	selectBuyingArt	(String id);
	public	int	updateDelivery	(int no, String id, int state);

	
}
