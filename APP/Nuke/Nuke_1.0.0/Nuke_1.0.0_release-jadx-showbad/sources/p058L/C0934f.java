package p058L;

import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p147d1.EnumC1960j;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: L.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0934f implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2928d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f2929e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2930f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2931g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2932h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0934f(InterfaceC2207p interfaceC2207p, InterfaceC1599a interfaceC1599a, boolean z5, int i5) {
        this.f2931g = interfaceC2207p;
        this.f2932h = interfaceC1599a;
        this.f2929e = z5;
        this.f2930f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2928d) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2609A = AbstractC1385s.m2609A(this.f2930f | 1);
                AbstractC1923e.m3467e((InterfaceC2207p) this.f2931g, (InterfaceC1599a) this.f2932h, this.f2929e, (InterfaceC1373m) obj, iM2609A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2609A2 = AbstractC1385s.m2609A(this.f2930f | 1);
                AbstractC1922d.m3426e(this.f2929e, (EnumC1960j) this.f2931g, (C0920W) this.f2932h, (InterfaceC1373m) obj, iM2609A2);
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0934f(boolean z5, EnumC1960j enumC1960j, C0920W c0920w, int i5) {
        this.f2929e = z5;
        this.f2931g = enumC1960j;
        this.f2932h = c0920w;
        this.f2930f = i5;
    }
}
