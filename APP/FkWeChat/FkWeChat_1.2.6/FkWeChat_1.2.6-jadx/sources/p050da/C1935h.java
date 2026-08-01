package p050da;

import gb.AbstractC2650c1;
import p010a9.InterfaceC0184l;
import p112hb.AbstractC2949h;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: da.h */
/* JADX INFO: loaded from: classes2.dex */
public class C1935h implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5995e f5406q;

    /* JADX INFO: renamed from: r */
    public final C1936i f5407r;

    /* JADX INFO: renamed from: s */
    public final AbstractC2650c1 f5408s;

    /* JADX INFO: renamed from: t */
    public final C1928a f5409t;

    public C1935h(InterfaceC5995e interfaceC5995e, C1936i c1936i, AbstractC2650c1 abstractC2650c1, C1928a c1928a) {
        this.f5406q = interfaceC5995e;
        this.f5407r = c1936i;
        this.f5408s = abstractC2650c1;
        this.f5409t = c1928a;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return C1936i.m7019k(this.f5406q, this.f5407r, this.f5408s, this.f5409t, (AbstractC2949h) obj);
    }
}
