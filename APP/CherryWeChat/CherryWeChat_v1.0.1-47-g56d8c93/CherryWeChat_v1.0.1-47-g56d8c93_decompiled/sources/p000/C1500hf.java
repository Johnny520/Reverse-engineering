package p000;

/* JADX INFO: renamed from: hf */
/* JADX INFO: loaded from: classes.dex */
public final class C1500hf {

    /* JADX INFO: renamed from: e */
    public static final long[] f5283e = new long[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f5284a;

    /* JADX INFO: renamed from: b */
    public final C2551tm f5285b;

    /* JADX INFO: renamed from: c */
    public long f5286c;

    /* JADX INFO: renamed from: d */
    public final long[] f5287d;

    public C1500hf(InterfaceC0126Cx interfaceC0126Cx, C2551tm c2551tm) {
        this.f5284a = interfaceC0126Cx;
        this.f5285b = c2551tm;
        int iMo205d = interfaceC0126Cx.mo205d();
        if (iMo205d <= 64) {
            this.f5286c = iMo205d != 64 ? (-1) << iMo205d : 0L;
            this.f5287d = f5283e;
            return;
        }
        this.f5286c = 0L;
        int i = (iMo205d - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo205d & 63) != 0) {
            jArr[i - 1] = (-1) << iMo205d;
        }
        this.f5287d = jArr;
    }
}
