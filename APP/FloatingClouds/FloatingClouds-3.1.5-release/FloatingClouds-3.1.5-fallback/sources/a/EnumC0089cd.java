package a;

/* JADX INFO: renamed from: a.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0089cd extends java.lang.Enum<a.EnumC0089cd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0089cd f426a = null;
    public static final a.EnumC0089cd b = null;
    public static final a.EnumC0089cd c = null;
    public static final /* synthetic */ a.EnumC0089cd[] d = null;

    static {
            a.cd r0 = new a.cd
            java.lang.String r1 = "DEXKIT_PRIMARY"
            r2 = 0
            r0.<init>(r1, r2)
            a.EnumC0089cd.f426a = r0
            a.cd r1 = new a.cd
            java.lang.String r2 = "LITERAL_FALLBACK"
            r3 = 1
            r1.<init>(r2, r3)
            a.EnumC0089cd.b = r1
            a.cd r2 = new a.cd
            java.lang.String r3 = "CACHE_HIT"
            r4 = 2
            r2.<init>(r3, r4)
            a.EnumC0089cd.c = r2
            a.cd[] r0 = new a.EnumC0089cd[]{r0, r1, r2}
            a.EnumC0089cd.d = r0
            return
    }

    EnumC0089cd() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0089cd valueOf(java.lang.String r1) {
            java.lang.Class<a.cd> r0 = a.EnumC0089cd.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.cd r1 = (a.EnumC0089cd) r1
            return r1
    }

    public static a.EnumC0089cd[] values() {
            a.cd[] r0 = a.EnumC0089cd.d
            java.lang.Object r0 = r0.clone()
            a.cd[] r0 = (a.EnumC0089cd[]) r0
            return r0
    }
}
