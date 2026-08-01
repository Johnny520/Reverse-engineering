package p088s0;

import android.app.Activity;
import android.view.View;
import com.p055lu.wxmask.bean.OptionData;
import java.util.concurrent.atomic.AtomicBoolean;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p069i.C0709q1;
import p069i.C0716t;
import p090t0.C1010e;

/* JADX INFO: renamed from: s0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1000v implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0976J f3590c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC1000v(C0976J c0976j, int i2) {
        this.f3589b = i2;
        this.f3590c = c0976j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3589b) {
            case 0:
                C0976J c0976j = this.f3590c;
                C0973G c0973g = new C0973G("隐藏消息角标", "隐藏头像红点和顶部未读消息数量", new C1002x(c0976j, 13), null, new C1002x(c0976j, 15));
                int iM183g = AbstractC0079h.m183g(c0976j.f3494l.getHiddenMessageVibrateMode(), 0, 3);
                String strConcat = "密友来消息时触发单独震动提醒，当前 ".concat(iM183g != 0 ? iM183g != 2 ? iM183g != 3 ? "默认" : "连续" : "强烈" : "轻微");
                C1002x c1002x = new C1002x(c0976j, 16);
                C1002x c1002x2 = new C1002x(c0976j, 17);
                AbstractC0223g.m418e(strConcat, "desc");
                c0976j.m2176O("消息提醒", AbstractC0120h.m252Z(new C0973G[]{c0973g, new C0973G("密友消息震动", strConcat, c1002x, new C1002x(c0976j, 18), c1002x2), new C0973G("密友消息顶部加粗", "密友来消息时让顶部微信标题加粗提示", new C1002x(c0976j, 19), null, new C1002x(c0976j, 20))}));
                break;
            case 1:
                C0976J c0976j2 = this.f3590c;
                c0976j2.m2176O("实验室", AbstractC0120h.m252Z(new C0973G[]{new C0973G("防撤回", "阻止对方撤回消息，并在聊天页显示本地提示", new C1004z(c0976j2, 9), null, new C1004z(c0976j2, 10)), new C0973G("修改本地好友头像", "开启后选择联系人并从相册设置本地头像", new C1004z(c0976j2, 11), new C1004z(c0976j2, 13), new C1004z(c0976j2, 12)), new C0973G("阻止微信热更新", "阻止微信 Tinker 热补丁加载，降低热更新导致适配失效的概率", new C1004z(c0976j2, 14), null, new C1004z(c0976j2, 15)), new C0973G("使用全屏配置页", "开启后配置页面占满屏幕；关闭后以居中卡片方式显示", new C1004z(c0976j2, 16), null, new C1004z(c0976j2, 17))}));
                break;
            case 2:
                this.f3590c.mo2182a();
                break;
            case 3:
                Activity activity = this.f3590c.getActivity();
                AbstractC0223g.m415b(activity);
                C0709q1 c0709q1 = new C0709q1(activity);
                if (!((AtomicBoolean) c0709q1.f2401g).get()) {
                    ((C1010e) c0709q1.f2395a).m2209g();
                    break;
                }
                break;
            case 4:
                C0976J c0976j3 = this.f3590c;
                C0973G c0973g2 = new C0973G("摇一摇隐藏", "临时解除后摇一摇手机即可恢复隐藏", new C1004z(c0976j3, 0), null, new C1004z(c0976j3, 1));
                OptionData optionData = c0976j3.f3494l;
                String searchCommandText = optionData.getSearchCommandText();
                if (AbstractC0307q.m534d0(searchCommandText)) {
                    searchCommandText = "#hide";
                }
                String searchListCommandText = optionData.getSearchListCommandText();
                if (AbstractC0307q.m534d0(searchListCommandText)) {
                    searchListCommandText = "#list";
                }
                c0976j3.m2176O("快捷功能", AbstractC0120h.m252Z(new C0973G[]{c0973g2, new C0973G("搜索框命令监听", "搜索框快捷打开配置面板 " + ((Object) searchCommandText) + "，管理名单 " + ((Object) searchListCommandText), new C1004z(c0976j3, 2), new C1004z(c0976j3, 3), new C1004z(c0976j3, 4)), new C0973G("快捷加入名单", "在会话列表和通讯录长按菜单中显示加入名单", new C1004z(c0976j3, 5), null, new C1004z(c0976j3, 6)), new C0973G("聊天页面输入框口令监听", "监听聊天输入框中的隐藏/删除等口令", new C1004z(c0976j3, 7), null, new C1004z(c0976j3, 8))}));
                break;
            case 5:
                C0976J c0976j4 = this.f3590c;
                C0973G c0973g3 = new C0973G("隐藏密友", "隐藏会话列表中的密友，关闭后密友会恢复显示", new C1002x(c0976j4, 0), null, new C1002x(c0976j4, 4));
                C0973G c0973g4 = new C0973G("隐藏通讯录好友", "隐藏通讯录中的密友联系人", new C1002x(c0976j4, 5), null, new C1002x(c0976j4, 6));
                OptionData optionData2 = c0976j4.f3494l;
                c0976j4.m2176O("密友功能", AbstractC0120h.m252Z(new C0973G[]{c0973g3, c0973g4, new C0973G("隐藏聊天记录", "进入密友聊天页时隐藏历史聊天内容，" + AbstractC0079h.m183g(optionData2.getChatHistoryQuickUnhideClickCount(), 2, 8) + " 击聊天页面快速解除，窗口 " + AbstractC0079h.m183g(optionData2.getChatHistoryQuickUnhideDurationMs(), 300, 5000) + "ms", new C1002x(c0976j4, 7), new C1002x(c0976j4, 8), new C1002x(c0976j4, 9)), new C0973G("存储空间聊天记录隐藏", "隐藏微信存储空间聊天记录管理中的密友会话", new C1002x(c0976j4, 10), null, new C1002x(c0976j4, 11)), new C0973G("隐藏状态页密友", "隐藏微信状态页中的密友状态分组", new C1002x(c0976j4, 12), null, new C1002x(c0976j4, 1)), new C0973G("隐藏语音/视频通话", "密友来语音或视频时拦截通话界面和提醒", new C1002x(c0976j4, 2), null, new C1002x(c0976j4, 3))}));
                break;
            case 6:
                C0976J c0976j5 = this.f3590c;
                c0976j5.m2176O("搜索隐藏", AbstractC0120h.m252Z(new C0973G[]{new C0973G("主页搜索隐藏", "隐藏密友在微信主页搜索中的结果", new C1004z(c0976j5, 18), null, new C1004z(c0976j5, 19)), new C0973G("单聊搜索隐藏", "隐藏密友在聊天页搜索中的记录", new C1004z(c0976j5, 20), null, new C1004z(c0976j5, 21))}));
                break;
            default:
                Activity activity2 = this.f3590c.getActivity();
                if (activity2 != null) {
                    ((C1010e) new C0716t(activity2).f2422f).m2209g();
                    break;
                }
                break;
        }
    }
}
