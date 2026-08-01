package p178i3;

import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;

/* JADX INFO: renamed from: i3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2328i extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public int f7589h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2324e f7590i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f7591j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0810b f7592k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328i(C0810b c0810b, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f7592k = c0810b;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        C2328i c2328i = new C2328i(this.f7592k, (InterfaceC1046d) obj3);
        c2328i.f7590i = (InterfaceC2324e) obj;
        c2328i.f7591j = obj2;
        return c2328i.mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.mo9c(r5, r4) == r3) goto L15;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f7589h
            r1 = 2
            r2 = 1
            P2.a r3 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            p127Z2.AbstractC1784a.m3205S(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            i3.e r0 = r4.f7590i
            p127Z2.AbstractC1784a.m3205S(r5)
            goto L32
        L1e:
            p127Z2.AbstractC1784a.m3205S(r5)
            i3.e r0 = r4.f7590i
            java.lang.Object r5 = r4.f7591j
            r4.f7590i = r0
            r4.f7589h = r2
            J.b r2 = r4.f7592k
            java.lang.Object r5 = r2.mo0g(r5, r4)
            if (r5 != r3) goto L32
            goto L3d
        L32:
            r2 = 0
            r4.f7590i = r2
            r4.f7589h = r1
            java.lang.Object r5 = r0.mo9c(r5, r4)
            if (r5 != r3) goto L3e
        L3d:
            return r3
        L3e:
            K2.q r5 = p056K2.C0891q.f2780a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2328i.mo8p(java.lang.Object):java.lang.Object");
    }
}
