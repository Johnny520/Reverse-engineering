package p000;

/* JADX INFO: loaded from: classes.dex */
public enum g1 extends java.lang.Enum<p000.g1> implements p000.w3 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final p000.g1 f390 = null;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ p000.g1[] f391 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f392;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f393;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.Object f394;

    static {
            ۟.g1 r0 = new ۟.g1
            r1 = 4
            byte[] r2 = new byte[r1]
            r2 = {x0036: FILL_ARRAY_DATA , data: [90, -103, 86, 74} // fill-array
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x003c: FILL_ARRAY_DATA , data: [20, -52, 26, 6, -13, 73} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            byte[] r1 = new byte[r1]
            r1 = {x0044: FILL_ARRAY_DATA , data: [16, 35, -54, 81} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x004a: FILL_ARRAY_DATA , data: [126, 86, -90, 61, 13, 85} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.<init>(r2, r1, r3)
            p000.g1.f390 = r0
            r1 = 1
            ۟.g1[] r1 = new p000.g1[r1]
            r2 = 0
            r1[r2] = r0
            p000.g1.f391 = r1
            ۟.q2 r0 = new ۟.q2
            r0.<init>(r1)
            return
    }

    g1(java.lang.String r2, java.lang.String r3, java.lang.Boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.f392 = r4
            r1.f393 = r3
            r1.f394 = r4
            return
    }

    public static p000.g1 valueOf(java.lang.String r1) {
            java.lang.Class<۟.g1> r0 = p000.g1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ۟.g1 r1 = (p000.g1) r1
            return r1
    }

    public static p000.g1[] values() {
            ۟.g1[] r0 = p000.g1.f391
            java.lang.Object r0 = r0.clone()
            ۟.g1[] r0 = (p000.g1[]) r0
            return r0
    }

    @Override // p000.w3
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.f393
            return r0
    }

    @Override // p000.w3
    /* JADX INFO: renamed from: ۥ */
    public final java.lang.Object mo97() {
            r1 = this;
            java.lang.Object r0 = r1.f394
            return r0
    }
}
