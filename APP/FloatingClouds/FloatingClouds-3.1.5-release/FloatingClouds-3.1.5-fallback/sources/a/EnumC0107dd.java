package a;

/* JADX INFO: renamed from: a.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0107dd extends java.lang.Enum<a.EnumC0107dd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.EnumC0107dd f439a = null;
    public static final a.EnumC0107dd b = null;
    public static final a.EnumC0107dd c = null;
    public static final a.EnumC0107dd d = null;
    public static final /* synthetic */ a.EnumC0107dd[] e = null;

    static {
            a.dd r0 = new a.dd
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2)
            a.EnumC0107dd.f439a = r0
            a.dd r1 = new a.dd
            java.lang.String r2 = "PENDING"
            r3 = 1
            r1.<init>(r2, r3)
            a.EnumC0107dd.b = r1
            a.dd r2 = new a.dd
            java.lang.String r3 = "NOT_FOUND"
            r4 = 2
            r2.<init>(r3, r4)
            a.EnumC0107dd.c = r2
            a.dd r3 = new a.dd
            java.lang.String r4 = "REFLECT_FAILED"
            r5 = 3
            r3.<init>(r4, r5)
            a.EnumC0107dd.d = r3
            a.dd r4 = new a.dd
            java.lang.String r5 = "FALLBACK"
            r6 = 4
            r4.<init>(r5, r6)
            a.dd[] r0 = new a.EnumC0107dd[]{r0, r1, r2, r3, r4}
            a.EnumC0107dd.e = r0
            return
    }

    EnumC0107dd() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.EnumC0107dd valueOf(java.lang.String r1) {
            java.lang.Class<a.dd> r0 = a.EnumC0107dd.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.dd r1 = (a.EnumC0107dd) r1
            return r1
    }

    public static a.EnumC0107dd[] values() {
            a.dd[] r0 = a.EnumC0107dd.e
            java.lang.Object r0 = r0.clone()
            a.dd[] r0 = (a.EnumC0107dd[]) r0
            return r0
    }
}
