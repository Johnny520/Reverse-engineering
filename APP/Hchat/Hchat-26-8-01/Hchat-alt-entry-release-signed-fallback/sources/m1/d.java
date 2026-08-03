package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f8525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f8533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f8534j;

    public d(java.lang.String r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, java.util.List r12, int r13) {
            r3 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L6
            java.lang.String r4 = ""
        L6:
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r13 & 4
            if (r0 == 0) goto L11
            r6 = r1
        L11:
            r0 = r13 & 8
            if (r0 == 0) goto L16
            r7 = r1
        L16:
            r0 = r13 & 16
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L1d
            r8 = r2
        L1d:
            r0 = r13 & 32
            if (r0 == 0) goto L22
            r9 = r2
        L22:
            r0 = r13 & 64
            if (r0 == 0) goto L27
            r10 = r1
        L27:
            r0 = r13 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2c
            r11 = r1
        L2c:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L34
            int r12 = m1.h0.f8607a
            tf.t r12 = tf.t.f13167g
        L34:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r3.<init>()
            r3.f8525a = r4
            r3.f8526b = r5
            r3.f8527c = r6
            r3.f8528d = r7
            r3.f8529e = r8
            r3.f8530f = r9
            r3.f8531g = r10
            r3.f8532h = r11
            r3.f8533i = r12
            r3.f8534j = r13
            return
    }
}
