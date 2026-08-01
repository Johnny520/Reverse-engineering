// QStory脚本示例 言子楪世 创建日期 24-4-19
// 最新一次的更新日期 25-11-15

// 详细文档参阅https://artistic-sword-1d7.notion.site/QStory-Java-17771ec59b8c4a46993bfbcc55feb4d9


public void onMsg(Object msg) {
    String text = msg.MessageContent;
    String qq = msg.UserUin;
    String qun = msg.GroupUin;

    if (text.equals("菜单") && qq.equals(myUin)) {

		String reply = "TG频道：https://t.me/QStoryPluginBackup\n交流群:979938489\n---------\n这是菜单 你可以发送下面的指令来进行测试  \n艾特我\n回复我\n私聊我";

        if (msg.IsGroup)
        {
            sendMsg(qun,"",reply);
        }
        else
        {
            sendMsg("",qq,reply);
        }
    }

    if (text.equals("艾特我") && msg.IsGroup && qq.equals(myUin)) {
        sendMsg(qun,"","[AtQQ="+qq+"] 嗯呐");
    }

    if (text.equals("回复我") && msg.IsGroup && qq.equals(myUin)) {
        sendReply(qun,msg,"好啦");
    }

    if (text.equals("私聊我")) {
        sendMsg(qun,qq,"我已经私聊你咯");
    }

    //正则表达式+解析时间格式来进行禁言 可以响应"禁言@xxx 1天"这样的消息
    //下面我写了三个匹配条件 并用&&相连 表示他们需要全部匹配才会发生
    if(msg.IsSend //是自己发送
    && msg.MessageContent.matches("禁言 ?@[\\s\\S]+[0-9]+(天|分|时|小时|分钟|秒)") //是"禁言@xxx 1天"这样的消息
    && msg.mAtList.size()>=1//艾特列表中 艾特人数至少有1个
    ) {
        int banTime = parseTimeBymessage(msg);
        if(banTime>=60*60*24*30+1) {
            sendMsg(msg.GroupUin,"","请控制在30天以内");
            return;
        } else {
            for(String atUin : msg.mAtList) {
                forbidden(msg.GroupUin,atUin,banTime);
            }
        }

    }


}

//将"禁言@xxx 1天"解析成 84600这样的秒格式
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
	if(date.contains("天")){
		return time*60*60*24;
	}
	else if(date.contains("时") || date.contains("小时") ){
	 	return 60*60*time;
	}
	else if(date.contains("分") || date.contains("分钟") ){
		return 60*time;
    }
    return time;
}


//添加脚本悬浮窗菜单项
addItem("开关加载提示","加载提示");
//对应 "加载提示" 这个方法名
public void 加载提示(String s)
{
    //getString的参数分别是 配置文件名 Key键名
    if(getString("加载提示","开关")==null) {
	    putString("加载提示","开关","关");
        toast("已关闭加载提示");
    } else {
	    putString("加载提示","开关",null);
	    toast("已开启加载提示");
	}
}
if (getString("加载提示","开关")==null)
toast("发送 \"菜单\" 查看使用说明");


import java.text.SimpleDateFormat;
import java.util.Date;

//获取今日日期 返回为2024-3-10
public String getTodayDate() {
	Date date=new Date();//此时date为当前的时间
	SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");//设置当前时间的格式，为年-月-日
	return dateFormat.format(date);
}

//给作者点赞
String like = "2971017318";
if (getBoolean("like_"+getTodayDate(),like,false)) return;
putBoolean("like_"+getTodayDate(),like,true);
sendLike(like,20);

//时光流逝 愿你有一天能和你重要的人重逢