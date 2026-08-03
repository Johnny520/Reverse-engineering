package p346x9;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: x9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5736c {
    KEYWORD("keyword_notify_keyword_title", "keyword_notify_keyword_content", "keyword_notify_keyword_toast", "keyword_notify_keyword_sound", "keyword_notify_keyword_vibrate", "keyword_notify_keyword_ringtone", "关键词通知 %sender%", "收到关注消息"),
    AT_ME("keyword_notify_at_me_title", "keyword_notify_at_me_content", "keyword_notify_at_me_toast", "keyword_notify_at_me_sound", "keyword_notify_at_me_vibrate", "keyword_notify_at_me_ringtone", "有人@我 %sender%", "有人 @ 你"),
    AT_ALL("keyword_notify_at_all_title", "keyword_notify_at_all_content", "keyword_notify_at_all_toast", "keyword_notify_at_all_sound", "keyword_notify_at_all_vibrate", "keyword_notify_at_all_ringtone", "%keyword% %sender%", "%keyword%");


    /* JADX INFO: renamed from: g */
    public final String f23369g;

    /* JADX INFO: renamed from: h */
    public final String f23370h;

    /* JADX INFO: renamed from: i */
    public final String f23371i;

    /* JADX INFO: renamed from: j */
    public final String f23372j;

    /* JADX INFO: renamed from: k */
    public final String f23373k;

    /* JADX INFO: renamed from: l */
    public final String f23374l;

    /* JADX INFO: renamed from: m */
    public final String f23375m;

    /* JADX INFO: renamed from: n */
    public final String f23376n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC5736c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f23369g = str;
        this.f23370h = str2;
        this.f23371i = str3;
        this.f23372j = str4;
        this.f23373k = str5;
        this.f23374l = str6;
        this.f23375m = str7;
        this.f23376n = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5736c valueOf(String str) {
        return (EnumC5736c) AbstractC2091b.m5160g(EnumC5736c.class, str);
    }
}
