package p314vb;

/* JADX INFO: renamed from: vb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8896c {

    /* JADX INFO: renamed from: a */
    public static final boolean f29490a = false;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal[] f29491b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f29491b = threadLocalArr;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m34133a() {
        return f29490a;
    }
}
