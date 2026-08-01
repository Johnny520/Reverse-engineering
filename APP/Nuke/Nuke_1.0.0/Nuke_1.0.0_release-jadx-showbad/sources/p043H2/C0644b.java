package p043H2;

import p007B0.C0185S;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p216p.C2847h;

/* JADX INFO: renamed from: H2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0644b extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2051f;

    /* JADX INFO: renamed from: g */
    public int f2052g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2053h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2054i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0644b(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2051f = i5;
        this.f2054i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C0185S c0185s = (C0185S) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2051f) {
            case 0:
                ((C0644b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            default:
                return ((C0644b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2051f) {
            case 0:
                C0644b c0644b = new C0644b((InterfaceC1347Y) this.f2054i, interfaceC1046d, 0);
                c0644b.f2053h = obj;
                return c0644b;
            default:
                C0644b c0644b2 = new C0644b((C2847h) this.f2054i, interfaceC1046d, 1);
                c0644b2.f2053h = obj;
                return c0644b2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e2 -> B:51:0x00e5). Please report as a decompilation issue!!! */
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
    */
    public final java.lang.Object mo8p(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f2051f
            switch(r0) {
                case 0: goto Lbc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f2054i
            p.h r0 = (p216p.C2847h) r0
            int r1 = r11.f2052g
            r2 = 2
            r3 = 1
            P2.a r4 = p079P2.EnumC1152a.f3788d
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r11.f2053h
            B0.S r1 = (p007B0.C0185S) r1
            p127Z2.AbstractC1784a.m3205S(r12)
            goto L58
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            java.lang.Object r1 = r11.f2053h
            B0.S r1 = (p007B0.C0185S) r1
            p127Z2.AbstractC1784a.m3205S(r12)
            goto L41
        L2d:
            p127Z2.AbstractC1784a.m3205S(r12)
            java.lang.Object r12 = r11.f2053h
            r1 = r12
            B0.S r1 = (p007B0.C0185S) r1
            r11.f2053h = r1
            r11.f2052g = r3
            java.lang.Object r12 = p227r.AbstractC2958J0.m5158b(r1, r11, r2)
            if (r12 != r4) goto L41
            goto Lbb
        L41:
            B0.w r12 = (p007B0.C0209w) r12
            long r5 = r12.f711a
            r0.f8949h = r5
            long r5 = r12.f713c
            r0.f8943b = r5
        L4b:
            r11.f2053h = r1
            r11.f2052g = r2
            B0.o r12 = p007B0.EnumC0201o.f703e
            java.lang.Object r12 = r1.m271a(r12, r11)
            if (r12 != r4) goto L58
            goto Lbb
        L58:
            B0.n r12 = (p007B0.C0200n) r12
            java.lang.Object r12 = r12.f696a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L6b:
            if (r7 >= r5) goto L7e
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            B0.w r9 = (p007B0.C0209w) r9
            boolean r9 = r9.f714d
            if (r9 == 0) goto L7b
            r3.add(r8)
        L7b:
            int r7 = r7 + 1
            goto L6b
        L7e:
            int r12 = r3.size()
        L82:
            if (r6 >= r12) goto L99
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            B0.w r7 = (p007B0.C0209w) r7
            long r7 = r7.f711a
            long r9 = r0.f8949h
            boolean r7 = p007B0.AbstractC0208v.m315e(r7, r9)
            if (r7 == 0) goto L96
            goto L9a
        L96:
            int r6 = r6 + 1
            goto L82
        L99:
            r5 = 0
        L9a:
            B0.w r5 = (p007B0.C0209w) r5
            if (r5 != 0) goto La5
            java.lang.Object r12 = p061L2.AbstractC0973m.m2013T(r3)
            r5 = r12
            B0.w r5 = (p007B0.C0209w) r5
        La5:
            if (r5 == 0) goto Laf
            long r6 = r5.f711a
            r0.f8949h = r6
            long r5 = r5.f713c
            r0.f8943b = r5
        Laf:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L4b
            r1 = -1
            r0.f8949h = r1
            K2.q r4 = p056K2.C0891q.f2780a
        Lbb:
            return r4
        Lbc:
            java.lang.Object r0 = r11.f2053h
            B0.S r0 = (p007B0.C0185S) r0
            int r1 = r11.f2052g
            r2 = 1
            if (r1 == 0) goto Ld3
            if (r1 != r2) goto Lcb
            p127Z2.AbstractC1784a.m3205S(r12)
            goto Le5
        Lcb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        Ld3:
            p127Z2.AbstractC1784a.m3205S(r12)
        Ld6:
            r11.f2053h = r0
            r11.f2052g = r2
            B0.o r12 = p007B0.EnumC0201o.f703e
            java.lang.Object r12 = r0.m271a(r12, r11)
            P2.a r1 = p079P2.EnumC1152a.f3788d
            if (r12 != r1) goto Le5
            return r1
        Le5:
            B0.n r12 = (p007B0.C0200n) r12
            java.lang.Object r12 = r12.f696a
            java.lang.Object r12 = p061L2.AbstractC0973m.m2013T(r12)
            B0.w r12 = (p007B0.C0209w) r12
            if (r12 == 0) goto Ld6
            java.lang.Object r1 = r11.f2054i
            T.Y r1 = (p095T.InterfaceC1347Y) r1
            long r3 = r12.f713c
            n0.b r12 = new n0.b
            r12.<init>(r3)
            r1.setValue(r12)
            goto Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: p043H2.C0644b.mo8p(java.lang.Object):java.lang.Object");
    }
}
