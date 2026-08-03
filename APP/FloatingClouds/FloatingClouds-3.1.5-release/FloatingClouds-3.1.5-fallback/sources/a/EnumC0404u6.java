package a;

/* JADX INFO: renamed from: a.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0404u6 extends java.lang.Enum<a.EnumC0404u6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0404u6 f709a = null;
    public static final a.EnumC0404u6 b = null;
    public static final /* synthetic */ a.EnumC0404u6[] c = null;

    static {
            a.u6 r0 = new a.u6
            java.lang.String r1 = "Read"
            r2 = 0
            r0.<init>(r1, r2)
            a.EnumC0404u6.f709a = r0
            a.u6 r1 = new a.u6
            java.lang.String r2 = "Write"
            r3 = 1
            r1.<init>(r2, r3)
            a.EnumC0404u6.b = r1
            a.u6[] r0 = new a.EnumC0404u6[]{r0, r1}
            a.EnumC0404u6.c = r0
            return
    }

    EnumC0404u6() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0404u6 valueOf(java.lang.String r1) {
            java.lang.Class<a.u6> r0 = a.EnumC0404u6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.u6 r1 = (a.EnumC0404u6) r1
            return r1
    }

    public static a.EnumC0404u6[] values() {
            a.u6[] r0 = a.EnumC0404u6.c
            java.lang.Object r0 = r0.clone()
            a.u6[] r0 = (a.EnumC0404u6[]) r0
            return r0
    }
}
