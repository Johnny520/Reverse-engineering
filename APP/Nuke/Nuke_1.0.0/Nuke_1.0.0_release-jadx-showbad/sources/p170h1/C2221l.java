package p170h1;

import com.bumptech.glide.AbstractC1922d;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p176i1.C2307w;

/* JADX INFO: renamed from: h1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2221l extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7263e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7264f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0877c f7265g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7266h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f7267i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2221l(InterfaceC1599a interfaceC1599a, C2307w c2307w, C1843e c1843e, int i5) {
        super(2);
        this.f7265g = interfaceC1599a;
        this.f7266h = c2307w;
        this.f7267i = c1843e;
        this.f7264f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f7263e;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Number) obj2).intValue();
        switch (i5) {
            case 0:
                AbstractC2219j.m4030b((InterfaceC1601c) this.f7265g, (InterfaceC2207p) this.f7267i, (InterfaceC1601c) this.f7266h, interfaceC1373m, AbstractC1385s.m2609A(this.f7264f | 1));
                break;
            default:
                AbstractC1922d.m3422a((InterfaceC1599a) this.f7265g, (C2307w) this.f7266h, (C1843e) this.f7267i, interfaceC1373m, AbstractC1385s.m2609A(this.f7264f | 1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2221l(InterfaceC1601c interfaceC1601c, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c2, int i5) {
        super(2);
        this.f7265g = interfaceC1601c;
        this.f7267i = interfaceC2207p;
        this.f7266h = interfaceC1601c2;
        this.f7264f = i5;
    }
}
