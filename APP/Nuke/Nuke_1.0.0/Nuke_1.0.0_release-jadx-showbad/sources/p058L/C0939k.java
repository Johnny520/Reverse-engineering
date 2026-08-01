package p058L;

import com.bumptech.glide.AbstractC1923e;
import p153e1.C2014j;
import p153e1.C2015k;
import p153e1.EnumC2017m;
import p169h0.InterfaceC2195d;
import p176i1.InterfaceC2282C;

/* JADX INFO: renamed from: L.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0939k implements InterfaceC2282C {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2195d f2945d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0940l f2946e;

    /* JADX INFO: renamed from: f */
    public long f2947f = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0939k(InterfaceC2195d interfaceC2195d, InterfaceC0940l interfaceC0940l) {
        this.f2945d = interfaceC2195d;
        this.f2946e = interfaceC0940l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176i1.InterfaceC2282C
    /* JADX INFO: renamed from: e */
    public final long mo567e(C2015k c2015k, long j5, EnumC2017m enumC2017m, long j6) {
        long jMo19a = this.f2946e.mo19a();
        if ((9223372034707292159L & jMo19a) == 9205357640488583168L) {
            jMo19a = this.f2947f;
        }
        this.f2947f = jMo19a;
        return C2014j.m3702c(C2014j.m3702c((((long) c2015k.f6737a) << 32) | (((long) c2015k.f6738b) & 4294967295L), AbstractC1923e.m3457Q(jMo19a)), this.f2945d.mo4017a(j6, 0L, enumC2017m));
    }
}
