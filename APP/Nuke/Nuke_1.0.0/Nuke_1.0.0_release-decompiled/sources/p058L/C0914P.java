package p058L;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: L.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0914P extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2843h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0920W f2844i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0914P(C0920W c0920w, InterfaceC1046d interfaceC1046d, int i5) {
        super(1, interfaceC1046d);
        this.f2843h = i5;
        this.f2844i = c0920w;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj;
        switch (this.f2843h) {
            case 0:
                C0914P c0914p = new C0914P(this.f2844i, interfaceC1046d, 0);
                C0891q c0891q = C0891q.f2780a;
                c0914p.mo8p(c0891q);
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0914P c0914p2 = new C0914P(this.f2844i, interfaceC1046d, 1);
                C0891q c0891q2 = C0891q.f2780a;
                c0914p2.mo8p(c0891q2);
                return c0891q2;
            case 2:
                C0914P c0914p3 = new C0914P(this.f2844i, interfaceC1046d, 2);
                C0891q c0891q3 = C0891q.f2780a;
                c0914p3.mo8p(c0891q3);
                return c0891q3;
            default:
                C0914P c0914p4 = new C0914P(this.f2844i, interfaceC1046d, 3);
                C0891q c0891q4 = C0891q.f2780a;
                c0914p4.mo8p(c0891q4);
                return c0891q4;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f2843h;
        C0891q c0891q = C0891q.f2780a;
        C0920W c0920w = this.f2844i;
        switch (i5) {
            case 0:
                AbstractC1784a.m3205S(obj);
                c0920w.f2864A = false;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1784a.m3205S(obj);
                c0920w.m1931f();
                break;
            case 2:
                AbstractC1784a.m3205S(obj);
                c0920w.m1930d(c0920w.f2864A);
                break;
            default:
                AbstractC1784a.m3205S(obj);
                c0920w.m1941p();
                break;
        }
        return c0891q;
    }
}
