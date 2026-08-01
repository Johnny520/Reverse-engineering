package p041H0;

import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: H0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0570O extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0572Q f1766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f1768g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0622u0 f1769h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570O(AbstractC0572Q abstractC0572Q, long j5, long j6, C0622u0 c0622u0) {
        super(0);
        this.f1766e = abstractC0572Q;
        this.f1767f = j5;
        this.f1768g = j6;
        this.f1769h = c0622u0;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        AbstractC0572Q abstractC0572Q = this.f1766e;
        abstractC0572Q.m881C0().f1762d = false;
        abstractC0572Q.m881C0().f1763e = this.f1767f;
        abstractC0572Q.m881C0().f1764f = this.f1768g;
        InterfaceC1601c interfaceC1601cMo610d = this.f1769h.f1987d.mo610d();
        if (interfaceC1601cMo610d != null) {
            interfaceC1601cMo610d.mo1h(abstractC0572Q.m881C0());
        }
        return C0891q.f2780a;
    }
}
