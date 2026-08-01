package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0521 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final boolean f2569 = false;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0521 f2570 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0521 f2571 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0521 f2572 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0521 f2573 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0521 f2574 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C0980 f2575 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2576;

    static {
            ᛳᛸᛲᛲ r0 = new ᛳᛸᛲᛲ
            r1 = 2
            r0.<init>(r1)
            defpackage.C0521.f2573 = r0
            ᛳᛸᛲᛲ r0 = new ᛳᛸᛲᛲ
            r1 = 0
            r0.<init>(r1)
            defpackage.C0521.f2572 = r0
            ᛳᛸᛲᛲ r0 = new ᛳᛸᛲᛲ
            r1 = 1
            r0.<init>(r1)
            defpackage.C0521.f2571 = r0
            ᛳᛸᛲᛲ r2 = new ᛳᛸᛲᛲ
            r3 = 3
            r2.<init>(r3)
            defpackage.C0521.f2570 = r2
            defpackage.C0521.f2574 = r0
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"
            ᛵᲇᛳᲇ r0 = defpackage.C0980.m1921(r0, r2)
            defpackage.C0521.f2575 = r0
            defpackage.C0521.f2569 = r1
            return
    }

    public /* synthetic */ C0521(int r1) {
            r0 = this;
            r0.f2576 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1312(int r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r2.f2576
            r1 = 2
            switch(r0) {
                case 0: goto Le;
                case 1: goto Ld;
                case 2: goto L7;
                default: goto L6;
            }
        L6:
            return r1
        L7:
            boolean r2 = defpackage.C0521.f2569
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r1 = 1
        Ld:
            return r1
        Le:
            float r2 = r2.m1313(r3, r4, r5, r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L19
            goto L1f
        L19:
            ᛳᛸᛲᛲ r2 = defpackage.C0521.f2573
            int r1 = r2.m1312(r3, r4, r5, r6)
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final float m1313(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r1 = r1.f2576
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L32;
                case 1: goto L27;
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            return r0
        L8:
            boolean r1 = defpackage.C0521.f2569
            if (r1 == 0) goto L17
            float r1 = (float) r4
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r5
            float r3 = (float) r3
            float r2 = r2 / r3
            float r0 = java.lang.Math.min(r1, r2)
            goto L26
        L17:
            int r3 = r3 / r5
            int r2 = r2 / r4
            int r1 = java.lang.Math.max(r3, r2)
            if (r1 != 0) goto L20
            goto L26
        L20:
            int r1 = java.lang.Integer.highestOneBit(r1)
            float r1 = (float) r1
            float r0 = r0 / r1
        L26:
            return r0
        L27:
            float r1 = (float) r4
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r5
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            return r1
        L32:
            ᛳᛸᛲᛲ r1 = defpackage.C0521.f2573
            float r1 = r1.m1313(r2, r3, r4, r5)
            float r1 = java.lang.Math.min(r0, r1)
            return r1
    }
}
