package p000;

/* JADX INFO: renamed from: re */
/* JADX INFO: loaded from: classes.dex */
public final class C2457re {

    /* JADX INFO: renamed from: b */
    public static final C2457re f8656b = null;

    /* JADX INFO: renamed from: c */
    public static final C2457re f8657c = null;

    /* JADX INFO: renamed from: d */
    public static final C2457re f8658d = null;

    /* JADX INFO: renamed from: e */
    public static final C2457re f8659e = null;

    /* JADX INFO: renamed from: f */
    public static final C2457re f8660f = null;

    /* JADX INFO: renamed from: g */
    public static final C2601ut f8661g = null;

    /* JADX INFO: renamed from: h */
    public static final boolean f8662h = false;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8663a;

    static {
        f8656b = new C2457re(2);
        f8657c = new C2457re(0);
        C2457re r0 = new C2457re(1);
        f8658d = r0;
        f8659e = new C2457re(3);
        f8660f = r0;
        f8661g = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", r0);
        f8662h = true;
    }

    public /* synthetic */ C2457re(int r1) {
        this.f8663a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final int m4948a(int r3, int r4, int r5, int r6) {
        switch(this.f8663a) {
            case 0: goto L14;
            case 1: goto L11;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return 2;
    L11:
        return 2;
    L7:
        if (f8662h == false) goto L9;
        return 2;
    L9:
        return 1;
    L14:
        if (m4949b(r3, r4, r5, r6) != 1.0f) goto L17;
        return 2;
    L17:
        return f8656b.m4948a(r3, r4, r5, r6);
    }

    /* JADX INFO: renamed from: b */
    public final float m4949b(int r2, int r3, int r4, int r5) {
        switch(this.f8663a) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return 1.0f;
    L7:
        if (f8662h == false) goto L10;
        return Math.min(r4 / r2, r5 / r3);
    L10:
        if (Math.max(r3 / r5, r2 / r4) != 0) goto L13;
        return 1.0f;
    L13:
        return 1.0f / Integer.highestOneBit(r2);
    L15:
        return Math.max(r4 / r2, r5 / r3);
    L17:
        return Math.min(1.0f, f8656b.m4949b(r2, r3, r4, r5));
    }
}
