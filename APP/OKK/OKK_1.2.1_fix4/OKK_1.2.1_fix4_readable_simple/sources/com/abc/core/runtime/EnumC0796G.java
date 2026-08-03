package com.abc.core.runtime;

/* JADX INFO: renamed from: f0.G */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0796G extends Enum {

    /* JADX INFO: renamed from: d */
    public static final EnumC0796G f2883d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0796G f2884e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC0796G f2885f = null;

    /* JADX INFO: renamed from: g */
    public static final EnumC0796G f2886g = null;

    /* JADX INFO: renamed from: h */
    public static final EnumC0796G f2887h = null;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0796G[] f2888i = null;

    /* JADX INFO: renamed from: a */
    public final String f2889a;

    /* JADX INFO: renamed from: b */
    public final String f2890b;

    /* JADX INFO: renamed from: c */
    public final String f2891c;

    static {
        EnumC0796G r6 = new EnumC0796G("Chat", 0, "聊天增强", "💬", "#2F8A4E");
        f2883d = r6;
        EnumC0796G r02 = new EnumC0796G("Protect", 1, "朋友圈防护", "⭕", "#2B6CB0");
        f2884e = r02;
        EnumC0796G r1 = new EnumC0796G("Beauty", 2, "视觉外观", "✨", "#805AD5");
        f2885f = r1;
        EnumC0796G r2 = new EnumC0796G("Assist", 3, "增强辅助", "⚡", "#DD6B20");
        f2886g = r2;
        EnumC0796G r3 = new EnumC0796G("Interface", 4, "界面细节", "📐", "#319795");
        f2887h = r3;
        f2888i = new EnumC0796G[]{r6, r02, r1, r2, r3};
    }

    EnumC0796G(String r1, int r2, String r3, String r4, String r5) {
        this.f2889a = r3;
        this.f2890b = r4;
        this.f2891c = r5;
    }

    public static EnumC0796G valueOf(String r1) {
        return (EnumC0796G) Enum.valueOf(EnumC0796G.class, r1);
    }

    public static EnumC0796G[] values() {
        return (EnumC0796G[]) f2888i.clone();
    }
}
