package p332wb;

import android.content.SharedPreferences;
import java.util.Arrays;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p222p.AbstractC3199a;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.sb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5303sb implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20629g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20630h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5303sb(SharedPreferences sharedPreferences, int i9) {
        this.f20629g = 4;
        this.f20630h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20629g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f20630h, "original_moments_upload_enable", "原图上传", "发布朋友圈图片和视频时尽量跳过微信压缩", false, c1836h0, 28080);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f20630h, "auto_view_original_enable", "自动查看原图", "打开聊天图片或视频时自动查看原图或原视频", false, c1836h02, 28080);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    SharedPreferences sharedPreferences = this.f20630h;
                    AbstractC4955ho.m9402O3(sharedPreferences, "call_block_incoming_ringtone", "屏蔽通话呼入铃声", "收到微信语音或视频通话时不播放来电铃声", false, c1836h03, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences, "call_block_outgoing_ringtone", "屏蔽通话呼出铃声", "拨打微信语音或视频通话时不播放等待铃声", false, c1836h03, 28080);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    SharedPreferences sharedPreferences2 = this.f20630h;
                    AbstractC4955ho.m9296B1("已抢红包", AbstractC3199a.m6836i(sharedPreferences2.getInt("hb_stats_count", 0), " 个"), null, c1836h04, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9296B1("累计金额", String.format("%.2f 元", Arrays.copyOf(new Object[]{Double.valueOf(((double) sharedPreferences2.getInt("hb_stats_amount", 0)) / 100.0d)}, 1)), null, c1836h04, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9296B1("今日抢到", AbstractC3199a.m6836i(sharedPreferences2.getInt("hb_stats_today", 0), " 个"), null, c1836h04, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9296B1("失败次数", AbstractC3199a.m6836i(sharedPreferences2.getInt("hb_stats_failed", 0), " 次"), null, c1836h04, 6, 4);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9378L3(this.f20630h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 5:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f20630h, "message_block_enable", "启用屏蔽消息", "总开关开启后，仅命中启用模板的新消息会被拦截", false, c1836h05, 28080);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f20630h, "conversation_menu", "会话列表长按菜单", "长按好友会话时显示设置头像入口", true, c1836h06, 28080);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    SharedPreferences sharedPreferences3 = this.f20630h;
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_chat", "聊天消息", "替换群聊和私聊消息头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_conversation", "会话列表", "替换微信首页的好友头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_contacts", "通讯录", "替换通讯录中的好友头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_profile", "好友资料页", "替换好友资料页中的头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_moments", "朋友圈", "替换朋友圈中的好友头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_other_ui", "其他微信界面", "替换收藏、搜索等界面中的好友头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_notifications", "消息通知", "替换微信原生通知和 Hchat 通知中的好友头像", true, c1836h07, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "scope_moments_notifications", "朋友圈通知", "替换朋友圈发布通知中的好友头像", true, c1836h07, 28080);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    SharedPreferences sharedPreferences4 = this.f20630h;
                    AbstractC4955ho.m9402O3(sharedPreferences4, "hb_fake_packet_enable", "开启假红包", "发送假红包时修正请求和响应", false, c1836h08, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences4, "hb_fake_packet_receive_enable", "领取假红包", "收到异常群 ID 红包时尝试修正", false, c1836h08, 28080);
                } else {
                    c1836h08.m4519V();
                }
                break;
            default:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    SharedPreferences sharedPreferences5 = this.f20630h;
                    AbstractC4955ho.m9402O3(sharedPreferences5, "selected_messages_enable", "群发助手", "在多选消息菜单中显示群发助手[H]和定时转发[H]", true, c1836h09, 28080);
                    AbstractC4955ho.m9402O3(sharedPreferences5, "selected_messages_background_silent_send", "后台静默发送", "群发时不显示发送进度窗口", false, c1836h09, 28080);
                } else {
                    c1836h09.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5303sb(SharedPreferences sharedPreferences, int i9, byte b10) {
        this.f20629g = i9;
        this.f20630h = sharedPreferences;
    }
}
