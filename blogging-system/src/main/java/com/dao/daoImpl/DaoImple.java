package BlogComment;

import org.hibernate.Session;

import model.Comment;
import util.MyUtil;

public class DaoImple implements ComDAO {
	private Session session;	
@Override
public void createComment(Comment comment) {
	this.session=MyUtil.getSesso();
	session.beginTransaction();
	session.save(comment);
	session.getTransaction().commit();
	session.close();
}

/*@Override
public Comment findComment(long pk) {
	Comment com1=null;
	this.session=MyUtil.getSesso();
	session.beginTransaction();
	com1=(Comment) session.get(Comment.class,pk);
	//session.getTransaction().commit();
	return com1;
}*/

/*@Override
public void update(Comment comment, long pk) {
	this.session=MyUtil.getSesso();
	session.beginTransaction();
	session.save(comment);
	session.getTransaction().commit();
	
}*/

/*@Override
public List<Comment> getComments() {
	List<Comment> com2;
	this.session=MyUtil.getSesso();
	session.beginTransaction();
	com2 = session.createSQLQuery("SELECT * FROM users").list();
	//user = (List<User>) session.createCriteria(User.class).list();
	return com2;
}*/

/*@Override
public void removeComment(long pk) {
	// TODO Auto-generated method stub
	
}*/

/*@Override
public void removeComment(Comment comment) {
	Comment com3=new Comment();
	this.session=MyUtil.getSesso();
	session.beginTransaction();
	com3 = (Comment)session.get(Comment.class,comment);
    session.delete(com3);
    session.flush();
//	user3.setUsername(comment);;
//	session.delete(com3);
	session.getTransaction().commit();
}*/

}
