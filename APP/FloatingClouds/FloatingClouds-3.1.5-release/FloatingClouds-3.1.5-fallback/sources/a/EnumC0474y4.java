package a;

/* JADX INFO: renamed from: a.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0474y4 extends java.lang.Enum<a.EnumC0474y4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0474y4 f767a = null;
    public static final /* synthetic */ a.EnumC0474y4[] b = null;

    static {
            a.y4 r0 = new a.y4
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            a.EnumC0474y4.f767a = r0
            a.y4 r1 = new a.y4
            java.lang.String r2 = "UNDECIDED"
            r3 = 1
            r1.<init>(r2, r3)
            a.y4 r2 = new a.y4
            java.lang.String r3 = "RESUMED"
            r4 = 2
            r2.<init>(r3, r4)
            a.y4[] r0 = new a.EnumC0474y4[]{r0, r1, r2}
            a.EnumC0474y4.b = r0
            return
    }

    EnumC0474y4() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0474y4 valueOf(java.lang.String r1) {
            java.lang.Class<a.y4> r0 = a.EnumC0474y4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.y4 r1 = (a.EnumC0474y4) r1
            return r1
    }

    public static a.EnumC0474y4[] values() {
            a.y4[] r0 = a.EnumC0474y4.b
            java.lang.Object r0 = r0.clone()
            a.y4[] r0 = (a.EnumC0474y4[]) r0
            return r0
    }
}
