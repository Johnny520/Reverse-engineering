package p000A;

import java.util.List;
import p007B0.InterfaceC0169B;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: A.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0084r0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f383h = 0;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f384i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f385j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084r0(InterfaceC0169B interfaceC0169B, InterfaceC0092v0 interfaceC0092v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f385j = interfaceC0169B;
        this.f386k = interfaceC0092v0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f383h) {
            case 0:
                return ((C0084r0) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
            default:
                C0084r0 c0084r0 = (C0084r0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q = C0891q.f2780a;
                c0084r0.mo8p(c0891q);
                return c0891q;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f383h) {
            case 0:
                C0084r0 c0084r0 = new C0084r0((InterfaceC0169B) this.f385j, (InterfaceC0092v0) this.f386k, interfaceC1046d);
                c0084r0.f384i = obj;
                return c0084r0;
            default:
                return new C0084r0((String) this.f384i, (InterfaceC1347Y) this.f385j, (InterfaceC1347Y) this.f386k, interfaceC1046d);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f383h;
        Object obj2 = this.f386k;
        Object obj3 = this.f385j;
        switch (i5) {
            case 0:
                AbstractC1784a.m3205S(obj);
                InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f384i;
                InterfaceC0169B interfaceC0169B = (InterfaceC0169B) obj3;
                InterfaceC0092v0 interfaceC0092v0 = (InterfaceC0092v0) obj2;
                InterfaceC1046d interfaceC1046d = null;
                AbstractC2162v.m3994p(interfaceC2160t, null, new C0037T(interfaceC0169B, interfaceC0092v0, interfaceC1046d, 1), 1);
                return AbstractC2162v.m3994p(interfaceC2160t, null, new C0037T(interfaceC0169B, interfaceC0092v0, interfaceC1046d, 2), 1);
            default:
                AbstractC1784a.m3205S(obj);
                List list = AbstractC1543P.f5365a;
                if (((Boolean) ((InterfaceC1347Y) obj3).getValue()).booleanValue()) {
                    ((InterfaceC1347Y) obj2).setValue((String) this.f384i);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084r0(String str, InterfaceC1347Y interfaceC1347Y, InterfaceC1347Y interfaceC1347Y2, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f384i = str;
        this.f385j = interfaceC1347Y;
        this.f386k = interfaceC1347Y2;
    }
}
