package p176i1;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p136b0.C1843e;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2296l extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2282C f7481e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f7482f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2283D f7483g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1843e f7484h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7485i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7486j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2296l(InterfaceC2282C interfaceC2282C, InterfaceC1599a interfaceC1599a, C2283D c2283d, C1843e c1843e, int i5, int i6) {
        super(2);
        this.f7481e = interfaceC2282C;
        this.f7482f = interfaceC1599a;
        this.f7483g = c2283d;
        this.f7484h = c1843e;
        this.f7485i = i5;
        this.f7486j = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC2298n.m4122a(this.f7481e, this.f7482f, this.f7483g, this.f7484h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f7485i | 1), this.f7486j);
        return C0891q.f2780a;
    }
}
