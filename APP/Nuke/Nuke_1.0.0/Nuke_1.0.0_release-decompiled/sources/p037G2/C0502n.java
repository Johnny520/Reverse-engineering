package p037G2;

import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: G2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0502n extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1575h = 1;

    /* JADX INFO: renamed from: i */
    public int f1576i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f1577j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502n(C0920W c0920w, boolean z5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1578k = c0920w;
        this.f1577j = z5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f1575h) {
        }
        return ((C0502n) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f1575h) {
            case 0:
                return new C0502n(this.f1577j, (InterfaceC1347Y) this.f1578k, interfaceC1046d);
            default:
                return new C0502n((C0920W) this.f1578k, this.f1577j, interfaceC1046d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p037G2.C0502n.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502n(boolean z5, InterfaceC1347Y interfaceC1347Y, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1577j = z5;
        this.f1578k = interfaceC1347Y;
    }
}
