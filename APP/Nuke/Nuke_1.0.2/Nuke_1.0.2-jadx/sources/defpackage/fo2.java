package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo2 {
    public static final hh1 b;
    public static final hh1 c;
    public static final hh1 d;
    public static final hh1 e;
    public static final int a = tl.Y("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);
    public static final int f = tl.Y("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 19;
        b = new hh1(i, "PERMIT");
        c = new hh1(i, "TAKEN");
        d = new hh1(i, "BROKEN");
        e = new hh1(i, "CANCELLED");
    }
}
