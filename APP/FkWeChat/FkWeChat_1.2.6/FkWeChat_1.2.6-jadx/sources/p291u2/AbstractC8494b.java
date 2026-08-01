package p291u2;

import p172l8.C4688c0;

/* JADX INFO: renamed from: u2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8494b {

    /* JADX INFO: renamed from: a */
    public static final long f28357a = C4688c0.m18729c(C4688c0.m18729c(C4688c0.m18729c(1023) << 50) ^ (-1));

    /* JADX INFO: renamed from: b */
    public static final long f28358b = C4688c0.m18729c((-1) ^ C4688c0.m18729c(C4688c0.m18729c(33554431) << 25));

    /* JADX INFO: renamed from: c */
    public static final long f28359c;

    static {
        long j10 = 33554431;
        f28359c = j10 | (((long) Math.min(0, 1023)) << 50) | (j10 << 25);
    }

    /* JADX INFO: renamed from: a */
    public static final long m32688a() {
        return f28357a;
    }

    /* JADX INFO: renamed from: b */
    public static final long m32689b() {
        return f28358b;
    }

    /* JADX INFO: renamed from: c */
    public static final long m32690c() {
        return f28359c;
    }
}
