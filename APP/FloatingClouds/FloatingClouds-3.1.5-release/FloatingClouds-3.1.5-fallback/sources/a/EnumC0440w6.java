package a;

/* JADX INFO: renamed from: a.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0440w6 extends java.lang.Enum<a.EnumC0440w6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0440w6 f748a = null;
    public static final /* synthetic */ a.EnumC0440w6[] b = null;

    static {
            a.w6 r0 = new a.w6
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            a.w6 r1 = new a.w6
            java.lang.String r2 = "BOTTOM_UP"
            r3 = 1
            r1.<init>(r2, r3)
            a.EnumC0440w6.f748a = r1
            a.w6[] r0 = new a.EnumC0440w6[]{r0, r1}
            a.EnumC0440w6.b = r0
            return
    }

    EnumC0440w6() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0440w6 valueOf(java.lang.String r1) {
            java.lang.Class<a.w6> r0 = a.EnumC0440w6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.w6 r1 = (a.EnumC0440w6) r1
            return r1
    }

    public static a.EnumC0440w6[] values() {
            a.w6[] r0 = a.EnumC0440w6.b
            java.lang.Object r0 = r0.clone()
            a.w6[] r0 = (a.EnumC0440w6[]) r0
            return r0
    }
}
