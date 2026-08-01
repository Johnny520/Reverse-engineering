package com.p001mr.elaris;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsCategoryText {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsCategoryText() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String summaryOf(String str) {
        return "groupfile".equals(str) ? "文件保存、群管与群通知" : "chat_message".equals(str) ? "未读数量、消息时间、撤回与回复手势" : "repeater".equals(str) ? "复读方式、按钮显示与自定义图标" : "picture".equals(str) ? "原图、闪照、表情与图片外显" : "cleanse".equals(str) ? "主题、界面、资料卡、QQ 秀与头像挂件" : "misc".equals(str) ? "扫码、网页、调试、设备与模块配置" : "feedback".equals(str) ? "TG 频道" : "Elaris 设置";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String titleOf(String str) {
        return "groupfile".equals(str) ? "群聊" : "chat_message".equals(str) ? "消息" : "repeater".equals(str) ? "复读" : "picture".equals(str) ? "图片" : "cleanse".equals(str) ? "净化" : "misc".equals(str) ? "杂项" : "feedback".equals(str) ? "交流与反馈" : "Elaris";
    }
}
