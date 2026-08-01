package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0982 {

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ int f4397 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f4398;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean f4399;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean f4400;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f4401;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f4402;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public java.lang.String f4403;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f4404;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4405;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f4406;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final boolean f4407;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f4408;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f4409;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f4410;

    static {
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r0 = 2147483647(0x7fffffff, float:NaN)
            ᛸᛸᲁᛵ r1 = defpackage.EnumC1551.f6877
            long r2 = defpackage.AbstractC0498.m1274(r0, r1)
            long r0 = defpackage.AbstractC0984.m1927(r2, r1)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            return
        L16:
            java.lang.String r2 = "maxStale < 0: "
            defpackage.C2264.m3672(r2, r0)
            return
    }

    public C0982(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.f4406 = r1
            r0.f4408 = r2
            r0.f4405 = r3
            r0.f4404 = r4
            r0.f4402 = r5
            r0.f4409 = r6
            r0.f4410 = r7
            r0.f4398 = r8
            r0.f4401 = r9
            r0.f4407 = r10
            r0.f4399 = r11
            r0.f4400 = r12
            r0.f4403 = r13
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f4403
            if (r0 != 0) goto Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.f4406
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r5.f4408
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            java.lang.String r1 = ", "
            r2 = -1
            int r3 = r5.f4405
            if (r3 == r2) goto L2d
            java.lang.String r4 = "max-age="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L2d:
            int r3 = r5.f4404
            if (r3 == r2) goto L3c
            java.lang.String r4 = "s-maxage="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L3c:
            boolean r3 = r5.f4402
            if (r3 == 0) goto L45
            java.lang.String r3 = "private, "
            r0.append(r3)
        L45:
            boolean r3 = r5.f4409
            if (r3 == 0) goto L4e
            java.lang.String r3 = "public, "
            r0.append(r3)
        L4e:
            boolean r3 = r5.f4410
            if (r3 == 0) goto L57
            java.lang.String r3 = "must-revalidate, "
            r0.append(r3)
        L57:
            int r3 = r5.f4398
            if (r3 == r2) goto L66
            java.lang.String r4 = "max-stale="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L66:
            int r3 = r5.f4401
            if (r3 == r2) goto L75
            java.lang.String r2 = "min-fresh="
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
        L75:
            boolean r1 = r5.f4407
            if (r1 == 0) goto L7e
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L7e:
            boolean r1 = r5.f4399
            if (r1 == 0) goto L87
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L87:
            boolean r1 = r5.f4400
            if (r1 == 0) goto L90
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L90:
            int r1 = r0.length()
            if (r1 != 0) goto L99
            java.lang.String r5 = ""
            return r5
        L99:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            r5.f4403 = r0
        Lac:
            return r0
    }
}
