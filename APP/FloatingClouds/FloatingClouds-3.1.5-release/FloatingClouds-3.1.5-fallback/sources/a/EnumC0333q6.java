package a;

/* JADX INFO: renamed from: a.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0333q6 extends java.lang.Enum<a.EnumC0333q6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0333q6 f652a = null;
    public static final a.EnumC0333q6 b = null;
    public static final a.EnumC0333q6 c = null;
    public static final /* synthetic */ a.EnumC0333q6[] d = null;

    static {
            a.q6 r0 = new a.q6
            java.lang.String r1 = "ACTIVE"
            r2 = 0
            r0.<init>(r1, r2)
            a.EnumC0333q6.f652a = r0
            a.q6 r1 = new a.q6
            java.lang.String r2 = "ISOLATED"
            r3 = 1
            r1.<init>(r2, r3)
            a.EnumC0333q6.b = r1
            a.q6 r2 = new a.q6
            java.lang.String r3 = "DISABLED"
            r4 = 2
            r2.<init>(r3, r4)
            a.EnumC0333q6.c = r2
            a.q6[] r0 = new a.EnumC0333q6[]{r0, r1, r2}
            a.EnumC0333q6.d = r0
            return
    }

    EnumC0333q6() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0333q6 valueOf(java.lang.String r1) {
            java.lang.Class<a.q6> r0 = a.EnumC0333q6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.q6 r1 = (a.EnumC0333q6) r1
            return r1
    }

    public static a.EnumC0333q6[] values() {
            a.q6[] r0 = a.EnumC0333q6.d
            java.lang.Object r0 = r0.clone()
            a.q6[] r0 = (a.EnumC0333q6[]) r0
            return r0
    }
}
