package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: G2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0475C extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1404h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1347Y f1405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0475C(InterfaceC1347Y interfaceC1347Y, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f1404h = i5;
        this.f1405i = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f1404h) {
            case 0:
                C0475C c0475c = (C0475C) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q = C0891q.f2780a;
                c0475c.mo8p(c0891q);
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0475C c0475c2 = (C0475C) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q2 = C0891q.f2780a;
                c0475c2.mo8p(c0891q2);
                return c0891q2;
            default:
                C0475C c0475c3 = (C0475C) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q3 = C0891q.f2780a;
                c0475c3.mo8p(c0891q3);
                return c0891q3;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f1404h) {
            case 0:
                return new C0475C(this.f1405i, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0475C(this.f1405i, interfaceC1046d, 1);
            default:
                return new C0475C(this.f1405i, interfaceC1046d, 2);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f1404h;
        C0891q c0891q = C0891q.f2780a;
        InterfaceC1347Y interfaceC1347Y = this.f1405i;
        switch (i5) {
            case 0:
                AbstractC1784a.m3205S(obj);
                interfaceC1347Y.setValue(Boolean.TRUE);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1784a.m3205S(obj);
                interfaceC1347Y.setValue(Boolean.TRUE);
                break;
            default:
                AbstractC1784a.m3205S(obj);
                interfaceC1347Y.setValue(Boolean.TRUE);
                break;
        }
        return c0891q;
    }
}
