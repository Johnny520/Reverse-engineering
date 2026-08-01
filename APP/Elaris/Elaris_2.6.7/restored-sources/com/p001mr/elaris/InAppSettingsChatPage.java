package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsChatPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsChatPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addChatMessage(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("消息", new View[]{inAppSettings.switchRow(Prefs.KEY_UNREAD_FULL_COUNT, "显示完整未读数", "会话列表未读数不显示为 99+"), inAppSettings.divider(), InAppSettingsCornerTimeColorPage.createTimeSwitchRow(inAppSettings), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE, "消息左侧模式", "让自己发出的消息、头像和气泡按左侧布局"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_MESSAGE_RECALL_GUARD, "防撤回", "拦截撤回消息，尽量保留原内容并显示撤回提示"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_DISABLE_REPLY_AUTO_AT, "去除回复艾特", "回复或引用消息时不自动追加 @ 对方"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_CHAT_EDGE_GUARD, "禁止聊天右滑", "在普通私聊和群聊中关闭右滑侧栏，不影响左滑回复"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_VOICE_MESSAGE_ACTIONS, "语音保存转发", "长按语音可保存或转发，底栏提供本地语音入口"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_ALBUM_VIDEO_BUBBLE, "相册视频泡泡", "点击 QQ 原泡泡消息入口，从相册选择视频发送")}));
        linearLayout.addView(inAppSettings.card("续火", new View[]{inAppSettings.keepFireCard()}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addPicture(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("图片", new View[]{inAppSettings.switchRow(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT, "默认原图", "发送图片时默认按原图处理"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_FLASH_PIC_AS_IMAGE, "闪照显示为图片", "将闪照按普通图片显示，并保留 QQ 原生保存入口"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_EMOTION_AS_PIC, "表情图片模式", "打开收藏表情时优先走图片查看器"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND, "收藏表情批量发送", "多选收藏表情后在输入框预览，并由 QQ 原生链路发送"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_CLOUD_STICKER_PANEL, "云端表情面板", "共享审核通过的公开表情，支持上传和发送"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_MEDIA_CLICK_TO_LOAD, "图片表情按需加载", "阻止图片、表情和 GIF 预下载，点开后再加载")}));
        try {
            linearLayout.addView(InAppSettingsPicSummaryPage.create(inAppSettings));
        } catch (Throwable unused) {
            linearLayout.addView(inAppSettings.card("图片外显", new View[]{inAppSettings.switchRow(Prefs.KEY_PIC_SUMMARY_ENABLED, "图片外显", "自定义图片消息在聊天列表里的外显文字")}));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addRepeater(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("复读方式", new View[]{inAppSettings.switchRow(Prefs.KEY_MESSAGE_REPEATER, "消息复读", inAppSettings.repeaterModeSummary()), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU, "菜单复读", "在消息长按菜单中显示“复读”"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_MESSAGE_REPEATER_HIDE_BUTTON, "隐藏复读图标", "隐藏同一个复读按钮的图标，只保留可点击区域")}));
        linearLayout.addView(inAppSettings.card("复读按钮图片", new View[]{inAppSettings.repeaterIconImageCard()}));
    }
}
