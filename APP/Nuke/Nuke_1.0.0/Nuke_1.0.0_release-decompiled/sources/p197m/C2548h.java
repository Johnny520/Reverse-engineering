package p197m;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p203n.C2642Z;

/* JADX INFO: renamed from: m.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2548h extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8142e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2642Z f8143f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1601c f8144g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1843e f8145h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8146i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8147j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f8148k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2548h(C2642Z c2642z, InterfaceC1601c interfaceC1601c, C2528M c2528m, C2529N c2529n, C1843e c1843e, int i5) {
        super(2);
        this.f8143f = c2642z;
        this.f8144g = interfaceC1601c;
        this.f8147j = c2528m;
        this.f8148k = c2529n;
        this.f8145h = c1843e;
        this.f8146i = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f8142e) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) this.f8147j;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f8148k;
                AbstractC2550j.m4475b(this.f8143f, interfaceC2207p, this.f8144g, interfaceC1601c, this.f8145h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f8146i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                C2528M c2528m = (C2528M) this.f8147j;
                C2529N c2529n = (C2529N) this.f8148k;
                AbstractC2563w.m4480c(this.f8143f, this.f8144g, c2528m, c2529n, this.f8145h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f8146i | 1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2548h(C2642Z c2642z, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, C1843e c1843e, int i5) {
        super(2);
        this.f8143f = c2642z;
        this.f8147j = interfaceC2207p;
        this.f8144g = interfaceC1601c;
        this.f8148k = interfaceC1601c2;
        this.f8145h = c1843e;
        this.f8146i = i5;
    }
}
