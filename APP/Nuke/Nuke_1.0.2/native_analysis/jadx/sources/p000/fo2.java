package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo2 {

    /* JADX INFO: renamed from: b */
    public static final hh1 f3081b;

    /* JADX INFO: renamed from: c */
    public static final hh1 f3082c;

    /* JADX INFO: renamed from: d */
    public static final hh1 f3083d;

    /* JADX INFO: renamed from: e */
    public static final hh1 f3084e;

    /* JADX INFO: renamed from: a */
    public static final int f3080a = AbstractC0738tl.m5296Y("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);

    /* JADX INFO: renamed from: f */
    public static final int f3085f = AbstractC0738tl.m5296Y("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    static {
        int i = 19;
        f3081b = new hh1(i, "PERMIT");
        f3082c = new hh1(i, "TAKEN");
        f3083d = new hh1(i, "BROKEN");
        f3084e = new hh1(i, "CANCELLED");
    }
}
