package p022E;

import p007B0.C0185S;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0276b extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f896f;

    /* JADX INFO: renamed from: g */
    public int f897g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f898h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1601c f899i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0276b(InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f896f = i5;
        this.f899i = interfaceC1601c;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C0185S c0185s = (C0185S) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f896f) {
            case 0:
                return ((C0276b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
            default:
                ((C0276b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f896f) {
            case 0:
                C0276b c0276b = new C0276b(this.f899i, interfaceC1046d, 0);
                c0276b.f898h = obj;
                return c0276b;
            default:
                C0276b c0276b2 = new C0276b(this.f899i, interfaceC1046d, 1);
                c0276b2.f898h = obj;
                return c0276b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f896f
            switch(r0) {
                case 0: goto L44;
                default: goto L5;
            }
        L5:
            int r0 = r6.f897g
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 != r1) goto L14
            java.lang.Object r0 = r6.f898h
            B0.S r0 = (p007B0.C0185S) r0
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L33
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            p127Z2.AbstractC1784a.m3205S(r7)
            java.lang.Object r7 = r6.f898h
            B0.S r7 = (p007B0.C0185S) r7
            r0 = r7
        L24:
            r6.f898h = r0
            r6.f897g = r1
            B0.o r7 = p007B0.EnumC0201o.f702d
            java.lang.Object r7 = r0.m271a(r7, r6)
            P2.a r2 = p079P2.EnumC1152a.f3788d
            if (r7 != r2) goto L33
            return r2
        L33:
            B0.n r7 = (p007B0.C0200n) r7
            boolean r7 = p179i4.AbstractC2352g.m4210x(r7)
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            W2.c r2 = r6.f899i
            r2.mo1h(r7)
            goto L24
        L44:
            int r0 = r6.f897g
            r1 = 2
            r2 = 1
            P2.a r3 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L64
            if (r0 == r2) goto L5c
            if (r0 != r1) goto L54
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L96
        L54:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L5c:
            java.lang.Object r0 = r6.f898h
            B0.S r0 = (p007B0.C0185S) r0
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L77
        L64:
            p127Z2.AbstractC1784a.m3205S(r7)
            java.lang.Object r7 = r6.f898h
            r0 = r7
            B0.S r0 = (p007B0.C0185S) r0
            r6.f898h = r0
            r6.f897g = r2
            java.lang.Object r7 = com.bumptech.glide.AbstractC1923e.m3468f(r0, r6)
            if (r7 != r3) goto L77
            goto L9f
        L77:
            B0.w r7 = (p007B0.C0209w) r7
            r7.m320a()
            long r4 = r7.f713c
            n0.b r7 = new n0.b
            r7.<init>(r4)
            W2.c r2 = r6.f899i
            r2.mo1h(r7)
            r7 = 0
            r6.f898h = r7
            r6.f897g = r1
            B0.o r7 = p007B0.EnumC0201o.f703e
            java.lang.Object r7 = p227r.AbstractC2958J0.m5162f(r0, r7, r6)
            if (r7 != r3) goto L96
            goto L9f
        L96:
            B0.w r7 = (p007B0.C0209w) r7
            if (r7 == 0) goto L9d
            r7.m320a()
        L9d:
            K2.q r3 = p056K2.C0891q.f2780a
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p022E.C0276b.mo8p(java.lang.Object):java.lang.Object");
    }
}
