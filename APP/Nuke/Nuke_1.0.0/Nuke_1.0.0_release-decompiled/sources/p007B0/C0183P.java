package p007B0;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2160t;
import p170h1.AbstractC2218i;
import p203n.C2647c;

/* JADX INFO: renamed from: B0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0183P extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f633h;

    /* JADX INFO: renamed from: i */
    public int f634i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f635j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f636k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183P(long j5, C0185S c0185s, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f633h = 0;
        this.f635j = j5;
        this.f636k = c0185s;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f633h) {
        }
        return ((C0183P) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f633h) {
            case 0:
                return new C0183P(this.f635j, (C0185S) this.f636k, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0183P((C2647c) this.f636k, this.f635j, interfaceC1046d, 1);
            default:
                return new C0183P((AbstractC2218i) this.f636k, this.f635j, interfaceC1046d, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f633h
            switch(r0) {
                case 0: goto L68;
                case 1: goto L31;
                default: goto L5;
            }
        L5:
            int r0 = r11.f634i
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L10
            p127Z2.AbstractC1784a.m3205S(r12)
            goto L2e
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            p127Z2.AbstractC1784a.m3205S(r12)
            java.lang.Object r12 = r11.f636k
            h1.i r12 = (p170h1.AbstractC2218i) r12
            A0.e r12 = r12.f7231d
            r11.f634i = r1
            long r0 = r11.f635j
            java.lang.Object r12 = r12.m138b(r0, r11)
            P2.a r0 = p079P2.EnumC1152a.f3788d
            if (r12 != r0) goto L2e
            goto L30
        L2e:
            K2.q r0 = p056K2.C0891q.f2780a
        L30:
            return r0
        L31:
            int r0 = r11.f634i
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 != r1) goto L3d
            p127Z2.AbstractC1784a.m3205S(r12)
            r6 = r11
            goto L65
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L45:
            p127Z2.AbstractC1784a.m3205S(r12)
            java.lang.Object r12 = r11.f636k
            r2 = r12
            n.c r2 = (p203n.C2647c) r2
            n0.b r3 = new n0.b
            long r4 = r11.f635j
            r3.<init>(r4)
            n.I r4 = p058L.AbstractC0907I.f2823d
            r11.f634i = r1
            r5 = 0
            r7 = 12
            r6 = r11
            java.lang.Object r12 = p203n.C2647c.m4604c(r2, r3, r4, r5, r6, r7)
            P2.a r0 = p079P2.EnumC1152a.f3788d
            if (r12 != r0) goto L65
            goto L67
        L65:
            K2.q r0 = p056K2.C0891q.f2780a
        L67:
            return r0
        L68:
            r6 = r11
            int r0 = r6.f634i
            r1 = 8
            long r3 = r6.f635j
            r5 = 2
            r7 = 1
            P2.a r8 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L89
            if (r0 == r7) goto L85
            if (r0 != r5) goto L7d
            p127Z2.AbstractC1784a.m3205S(r12)
            goto La0
        L7d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L85:
            p127Z2.AbstractC1784a.m3205S(r12)
            goto L97
        L89:
            p127Z2.AbstractC1784a.m3205S(r12)
            long r9 = r3 - r1
            r6.f634i = r7
            java.lang.Object r12 = p160f3.AbstractC2162v.m3983e(r9, r11)
            if (r12 != r8) goto L97
            goto Lb6
        L97:
            r6.f634i = r5
            java.lang.Object r12 = p160f3.AbstractC2162v.m3983e(r1, r11)
            if (r12 != r8) goto La0
            goto Lb6
        La0:
            java.lang.Object r12 = r6.f636k
            B0.S r12 = (p007B0.C0185S) r12
            f3.g r12 = r12.f642f
            if (r12 == 0) goto Lb4
            B0.p r0 = new B0.p
            r0.<init>(r3)
            K2.j r0 = p127Z2.AbstractC1784a.m3229o(r0)
            r12.mo278i(r0)
        Lb4:
            K2.q r8 = p056K2.C0891q.f2780a
        Lb6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0183P.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0183P(Object obj, long j5, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f633h = i5;
        this.f636k = obj;
        this.f635j = j5;
    }
}
