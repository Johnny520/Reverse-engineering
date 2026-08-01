package p176i1;

import com.bumptech.glide.AbstractC1922d;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: i1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2290f extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f7464e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1603e f7465f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7466g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2290f(InterfaceC2207p interfaceC2207p, InterfaceC1603e interfaceC1603e, int i5) {
        super(2);
        this.f7464e = interfaceC2207p;
        this.f7465f = interfaceC1603e;
        this.f7466g = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM2609A = AbstractC1385s.m2609A(this.f7466g | 1);
        AbstractC1922d.m3427f(this.f7464e, this.f7465f, (InterfaceC1373m) obj, iM2609A);
        return C0891q.f2780a;
    }
}
