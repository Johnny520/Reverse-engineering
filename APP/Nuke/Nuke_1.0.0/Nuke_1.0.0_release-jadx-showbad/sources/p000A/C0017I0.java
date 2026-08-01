package p000A;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p232s.C3164k;

/* JADX INFO: renamed from: A.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0017I0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f93h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f94i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1347Y f95j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017I0(InterfaceC1347Y interfaceC1347Y, boolean z5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f95j = interfaceC1347Y;
        this.f94i = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f93h) {
            case 0:
                C0017I0 c0017i0 = (C0017I0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q = C0891q.f2780a;
                c0017i0.mo8p(c0891q);
                return c0891q;
            default:
                C0017I0 c0017i02 = (C0017I0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q2 = C0891q.f2780a;
                c0017i02.mo8p(c0891q2);
                return c0891q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f93h) {
            case 0:
                return new C0017I0(this.f95j, this.f94i, interfaceC1046d);
            default:
                return new C0017I0(this.f94i, this.f95j, interfaceC1046d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f93h;
        C0891q c0891q = C0891q.f2780a;
        InterfaceC1347Y interfaceC1347Y = this.f95j;
        switch (i5) {
            case 0:
                AbstractC1784a.m3205S(obj);
                if (((C3164k) interfaceC1347Y.getValue()) != null) {
                    interfaceC1347Y.setValue(null);
                }
                break;
            default:
                AbstractC1784a.m3205S(obj);
                interfaceC1347Y.setValue(Boolean.valueOf(this.f94i));
                break;
        }
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017I0(boolean z5, InterfaceC1347Y interfaceC1347Y, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f94i = z5;
        this.f95j = interfaceC1347Y;
    }
}
