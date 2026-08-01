// QStory   24-4-19
//  25-11-15

// https://artistic-sword-1d7.notion.site/QStory-Java-17771ec59b8c4a46993bfbcc55feb4d9


public void onMsg(Object msg) {
    String text = msg.MessageContent;
    String qq = msg.UserUin;
    String qun = msg.GroupUin;

    if (text.equals("") && qq.equals(myUin)) {

		String reply = "TGhttps://t.me/QStoryPluginBackup\n:979938489\n---------\n   \n\n\n";

        if (msg.IsGroup)
        {
            sendMsg(qun,"",reply);
        }
        else
        {
            sendMsg("",qq,reply);
        }
    }

    if (text.equals("") && msg.IsGroup && qq.equals(myUin)) {
        sendMsg(qun,"","[AtQQ="+qq+"] ");
    }

    if (text.equals("") && msg.IsGroup && qq.equals(myUin)) {
        sendReply(qun,msg,"");
    }

    if (text.equals("")) {
        sendMsg(qun,qq,"");
    }

    //+ "@xxx 1"
    // && 
    if(msg.IsSend //
    && msg.MessageContent.matches(" ?@[\\s\\S]+[0-9]+(|||||)") //"@xxx 1"
    && msg.mAtList.size()>=1// 1
    ) {
        int banTime = parseTimeBymessage(msg);
        if(banTime>=60*60*24*30+1) {
            sendMsg(msg.GroupUin,"","30");
            return;
        } else {
            for(String atUin : msg.mAtList) {
                forbidden(msg.GroupUin,atUin,banTime);
            }
        }

    }


}

//"@xxx 1" 84600
public int parseTimeBymessage(Object msg){
	int timeStartIndex = msg.MessageContent.lastIndexOf(" ");
	String date = msg.MessageContent.substring(timeStartIndex +1);
	date = date.trim();
	String t="";
	if(date != null && !"".equals(date)){
		for(int i=0;i<date.length();i++){
			if(date.charAt(i)>=48 && date.charAt(i)<=57){
				t +=date.charAt(i);
			}
		}
	}
    int time=Integer.parseInt(t);
	if(date.contains("")){
		return time*60*60*24;
	}
	else if(date.contains("") || date.contains("") ){
	 	return 60*60*time;
	}
	else if(date.contains("") || date.contains("") ){
		return 60*time;
    }
    return time;
}


//
addItem("","");
// "" 
public void (String s)
{
    //getString  Key
    if(getString("","")==null) {
	    putString("","","");
        toast("");
    } else {
	    putString("","",null);
	    toast("");
	}
}
if (getString("","")==null)
toast(" \"\" ");


import java.text.SimpleDateFormat;
import java.util.Date;

// 2024-3-10
public String getTodayDate() {
	Date date=new Date();//date
	SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");//--
	return dateFormat.format(date);
}

//
String like = "2971017318";
if (getBoolean("like_"+getTodayDate(),like,false)) return;
putBoolean("like_"+getTodayDate(),like,true);
sendLike(like,20);

// 