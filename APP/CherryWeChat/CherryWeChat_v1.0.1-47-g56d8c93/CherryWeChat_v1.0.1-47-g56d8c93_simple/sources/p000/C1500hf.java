package p000;

/* JADX INFO: renamed from: hf */
/* JADX INFO: loaded from: classes.dex */
public final class C1500hf {

    /* JADX INFO: renamed from: e */
    public static final long[] f5283e = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f5284a;

    /* JADX INFO: renamed from: b */
    public final C2551tm f5285b;

    /* JADX INFO: renamed from: c */
    public long f5286c;

    /* JADX INFO: renamed from: d */
    public final long[] f5287d;

    static {
        f5283e = new long[0];
    }

    public C1500hf(InterfaceC0126Cx r5, C2551tm r6) {
        this.f5284a = r5;
        this.f5285b = r6;
        int r52 = r5.mo205d();
        long r2 = 0;
        if (r52 > 64) goto L9;
        if (r52 == 64) goto L7;
        r2 = (-1) << r52;
    L7:
        this.f5286c = r2;
        this.f5287d = f5283e;
        return;
    L9:
        this.f5286c = 0;
        int r62 = (r52 - 1) >>> 6;
        long[] r3 = new long[r62];
        if ((r52 & 63) == 0) goto L12;
        r3[r62 - 1] = (-1) << r52;
    L12:
        this.f5287d = r3;
    }
}
