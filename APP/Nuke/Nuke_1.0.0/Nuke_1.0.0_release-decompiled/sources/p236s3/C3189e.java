package p236s3;

import p117X2.AbstractC1665j;
import p170h1.C2229t;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3189e {

    /* JADX INFO: renamed from: e */
    public static final long[] f9941e = new long[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC2933d f9942a;

    /* JADX INFO: renamed from: b */
    public final C2229t f9943b;

    /* JADX INFO: renamed from: c */
    public long f9944c;

    /* JADX INFO: renamed from: d */
    public final long[] f9945d;

    public C3189e(InterfaceC2933d interfaceC2933d, C2229t c2229t) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        this.f9942a = interfaceC2933d;
        this.f9943b = c2229t;
        int iMo5133d = interfaceC2933d.mo5133d();
        if (iMo5133d <= 64) {
            this.f9944c = iMo5133d != 64 ? (-1) << iMo5133d : 0L;
            this.f9945d = f9941e;
            return;
        }
        this.f9944c = 0L;
        int i5 = (iMo5133d - 1) >>> 6;
        long[] jArr = new long[i5];
        if ((iMo5133d & 63) != 0) {
            jArr[i5 - 1] = (-1) << iMo5133d;
        }
        this.f9945d = jArr;
    }
}
