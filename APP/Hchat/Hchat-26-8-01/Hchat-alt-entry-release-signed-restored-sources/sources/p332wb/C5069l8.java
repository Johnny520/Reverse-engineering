package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.l8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5069l8 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18574g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f18575h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5069l8(SharedPreferences sharedPreferences, int i9) {
        this.f18574g = i9;
        this.f18575h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18574g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    SharedPreferences sharedPreferences = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences, "hide_chat_avatar_self", "隐藏自己的头像", "在群聊和私聊中隐藏自己发送消息的头像", false, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences, "hide_chat_avatar_other", "隐藏对方的头像", "在群聊和私聊中隐藏对方发送消息的头像", false, c1836h0, 28080);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    SharedPreferences sharedPreferences2 = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences2, "plus_menu_enable", "注入加号菜单", "在微信右上角加号菜单中显示 Hchat 入口，重启微信后生效", false, c1836h02, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences2, "plus_long_press_enable", "长按加号入口", "长按微信右上角加号打开 Hchat 设置，重启微信后生效", false, c1836h02, 28080);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "remove_forward_limit_enable", "移除转发限制", "允许微信原生转发选择超过 9 个会话；大量目标仍受微信发送能力限制", false, c1836h03, 28080);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "auto_original_image_enable", "自动勾选原图", "进入聊天图片发送界面时自动选择原图", false, c1836h04, 28080);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "hide_wechat_bottom_bar_enable", "隐藏微信底栏", "隐藏底部的微信、通讯录、发现和我", false, c1836h05, 28080);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "message_text_color_enable", "启用消息文本颜色", "处理聊天里的文本消息和引用消息正文", false, c1836h06, 28080);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "message_forward_favorite_enable", "转发收藏", "长按收藏后显示转发[H]", false, c1836h07, 28080);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    SharedPreferences sharedPreferences3 = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences3, "drag_read_enable", "拖拽已读", "在微信底部未读角标向上拖动后，清空全部会话未读", false, c1836h08, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "plus_menu_read_enable", "注入加号菜单已读", "在右上角加号菜单添加“全部已读”，重启微信后生效", false, c1836h08, 28080);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "quick_terminate_enable", "快捷终止", "在微信右上角加号菜单中添加快捷终止，重启微信后生效", false, c1836h09, 28080);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "disable_pat_enable", "禁止拍一拍", "双击聊天头像时不发送拍一拍", false, c1836h010, 28080);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "swipe_quote_enable", "左滑引用回复", "左滑消息后调用微信原生引用入口", false, c1836h011, 28080);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    SharedPreferences sharedPreferences4 = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences4, "swipe_repeat_enable", "右滑复读", "右滑消息后复读到当前聊天", false, c1836h012, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h012, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences4, "repeat_menu_enable", "长按菜单复读", "长按消息后点击 +1 复读到当前聊天", false, c1836h012, 28080);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "quick_contact_edit_enable", "快捷设置备注和标签", "长按私聊会话或好友朋友圈头像时显示备注和标签设置入口", false, c1836h013, 28080);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "block_typing_report_enable", "拦截正在输入上报", "输入文字时不向对方显示正在输入状态", false, c1836h014, 28080);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 14:
                C1836h0 c1836h015 = (C1836h0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "call_media_limit_enable", "移除通话媒体限制", "通话时允许播放语音和视频，并打开聊天拍摄", false, c1836h015, 28080);
                } else {
                    c1836h015.m4519V();
                }
                break;
            case 15:
                C1836h0 c1836h016 = (C1836h0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "status_text_limit_enable", "解除状态词长度限制", "开启后个人状态词可超过微信默认 10 字限制", false, c1836h016, 28080);
                } else {
                    c1836h016.m4519V();
                }
                break;
            case 16:
                C1836h0 c1836h017 = (C1836h0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c1836h017.m4516S(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "multi_recall_enable", "多选撤回", "在多选消息的分享菜单中显示批量撤回", false, c1836h017, 28080);
                } else {
                    c1836h017.m4519V();
                }
                break;
            case 17:
                C1836h0 c1836h018 = (C1836h0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c1836h018.m4516S(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    SharedPreferences sharedPreferences5 = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences5, "enable", "实名尾字", "在群聊昵称后显示已查询到的实名尾字", false, c1836h018, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h018, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences5, "message_query", "消息触发查询", "收到群成员消息后自动补查", true, c1836h018, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h018, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences5, "visible_query", "可见成员查询", "聊天页出现未缓存成员时自动补查", true, c1836h018, 28080);
                } else {
                    c1836h018.m4519V();
                }
                break;
            case 18:
                C1836h0 c1836h019 = (C1836h0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c1836h019.m4516S(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "enable", "视频号媒体下载", "在视频号分享菜单增加复制链接和下载入口，媒体保存到 Hchat/Finder", false, c1836h019, 28080);
                } else {
                    c1836h019.m4519V();
                }
                break;
            case 19:
                C1836h0 c1836h020 = (C1836h0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c1836h020.m4516S(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "tablet_enable", "平板模式", "开启平板模式，退出微信登陆生效", false, c1836h020, 28080);
                } else {
                    c1836h020.m4519V();
                }
                break;
            case 20:
                C1836h0 c1836h021 = (C1836h0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c1836h021.m4516S(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "plugin_agent_plus_menu_enable", "插件 Agent 入口", "在微信右上角加号菜单中显示插件 Agent，重启微信后生效", false, c1836h021, 28080);
                } else {
                    c1836h021.m4519V();
                }
                break;
            case 21:
                C1836h0 c1836h022 = (C1836h0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "remove_moments_ads_enable", "去除朋友圈广告", "阻止朋友圈广告信息解析和展示", false, c1836h022, 28080);
                } else {
                    c1836h022.m4519V();
                }
                break;
            case 22:
                C1836h0 c1836h023 = (C1836h0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c1836h023.m4516S(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "message_forward_sns_enable", "朋友圈转发", "在发现页或好友个人主页长按朋友圈后显示转发[H]", false, c1836h023, 28080);
                } else {
                    c1836h023.m4519V();
                }
                break;
            case 23:
                C1836h0 c1836h024 = (C1836h0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (c1836h024.m4516S(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "emoji_save_enable", "保存表情", "长按聊天表情后显示保存入口", false, c1836h024, 28080);
                } else {
                    c1836h024.m4519V();
                }
                break;
            case 24:
                C1836h0 c1836h025 = (C1836h0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (c1836h025.m4516S(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "profile_id_enable", "显示好友/群聊ID", "在好友和群聊资料页显示可点击复制的 ID", false, c1836h025, 28080);
                } else {
                    c1836h025.m4519V();
                }
                break;
            case 25:
                C1836h0 c1836h026 = (C1836h0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (c1836h026.m4516S(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "edit_message_enable", "修改聊天记录", "长按文字、引用或转账消息后可修改本地记录", false, c1836h026, 28080);
                } else {
                    c1836h026.m4519V();
                }
                break;
            case 26:
                C1836h0 c1836h027 = (C1836h0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (c1836h027.m4516S(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "quote_delete_clear_enable", "删除键清引用", "输入框为空且已引用消息时，按输入法删除键直接取消引用", false, c1836h027, 28080);
                } else {
                    c1836h027.m4519V();
                }
                break;
            case 27:
                C1836h0 c1836h028 = (C1836h0) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (c1836h028.m4516S(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    SharedPreferences sharedPreferences6 = this.f18575h;
                    AbstractC4955ho.m9402O3(sharedPreferences6, "message_forward_enable", "转发菜单", "在消息长按菜单中显示转发[H]", false, c1836h028, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h028, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences6, "message_forward_multi_moments_enable", "多选转发到朋友圈", "在多选消息菜单中显示转发到朋友圈[H]", false, c1836h028, 28080);
                } else {
                    c1836h028.m4519V();
                }
                break;
            case 28:
                C1836h0 c1836h029 = (C1836h0) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (c1836h029.m4516S(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "disable_hot_update_enable", "屏蔽热更新", "阻止微信加载和应用热更新补丁", false, c1836h029, 28080);
                } else {
                    c1836h029.m4519V();
                }
                break;
            default:
                C1836h0 c1836h030 = (C1836h0) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (c1836h030.m4516S(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(this.f18575h, "fake_scan_camera_enable", "模拟相机扫码", "让相册识别二维码按相机扫码来源处理", false, c1836h030, 28080);
                } else {
                    c1836h030.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
