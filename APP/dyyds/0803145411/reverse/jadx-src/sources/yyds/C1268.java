package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛱᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final boolean f5839;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1268 f5840;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C2120 f5842;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1268 f5844;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1268 f5845;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5846;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1268 f5841 = new C1268(2);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1268 f5843 = new C1268(0);

    static {
        C1268 c1268 = new C1268(1);
        f5845 = c1268;
        f5840 = new C1268(3);
        f5844 = c1268;
        f5842 = C2120.m4039(c1268, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f5839 = true;
    }

    public /* synthetic */ C1268(int i) {
        this.f5846 = i;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m2541(int i, int i2, int i3, int i4) {
        switch (this.f5846) {
            case 0:
                if (m2542(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return f5841.m2541(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return f5839 ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float m2542(int i, int i2, int i3, int i4) {
        switch (this.f5846) {
            case 0:
                return Math.min(1.0f, f5841.m2542(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f5839) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
            default:
                return 1.0f;
        }
    }
}
