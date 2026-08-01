package p207n3;

import p121Y1.C1753n;
import p190k3.AbstractC2453a;

/* JADX INFO: renamed from: n3.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2700h {

    /* JADX INFO: renamed from: b */
    public static final C1753n f8609b;

    /* JADX INFO: renamed from: c */
    public static final C1753n f8610c;

    /* JADX INFO: renamed from: d */
    public static final C1753n f8611d;

    /* JADX INFO: renamed from: e */
    public static final C1753n f8612e;

    /* JADX INFO: renamed from: a */
    public static final int f8608a = AbstractC2453a.m4382j(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: f */
    public static final int f8613f = AbstractC2453a.m4382j(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 10;
        f8609b = new C1753n(i5, "PERMIT");
        f8610c = new C1753n(i5, "TAKEN");
        f8611d = new C1753n(i5, "BROKEN");
        f8612e = new C1753n(i5, "CANCELLED");
    }
}
