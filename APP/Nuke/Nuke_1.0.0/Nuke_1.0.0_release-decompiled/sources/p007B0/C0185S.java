package p007B0;

import com.bumptech.glide.AbstractC1923e;
import p041H0.AbstractC0601k;
import p047I0.InterfaceC0697T0;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1176a;
import p153e1.InterfaceC2007c;
import p160f3.C2135g;

/* JADX INFO: renamed from: B0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0185S implements InterfaceC2007c, InterfaceC1046d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0186T f640d;

    /* JADX INFO: renamed from: e */
    public final C2135g f641e;

    /* JADX INFO: renamed from: f */
    public C2135g f642f;

    /* JADX INFO: renamed from: g */
    public EnumC0201o f643g = EnumC0201o.f703e;

    /* JADX INFO: renamed from: h */
    public final C1052j f644h = C1052j.f3286d;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0186T f645i;

    public C0185S(C0186T c0186t, C2135g c2135g) {
        this.f645i = c0186t;
        this.f640d = c0186t;
        this.f641e = c2135g;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f640d.mo266C(f2);
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f640d.mo267E(j5);
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f640d.mo272b() * f2;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f640d.mo269M(j5);
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f640d.mo270S(f2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m271a(EnumC0201o enumC0201o, AbstractC1176a abstractC1176a) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(abstractC1176a));
        c2135g.m3968t();
        this.f643g = enumC0201o;
        this.f642f = c2135g;
        return c2135g.m3967r();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f640d.mo272b();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f640d.mo273c0(j5);
    }

    /* JADX INFO: renamed from: d */
    public final long m274d() {
        C0186T c0186t = this.f645i;
        c0186t.getClass();
        long jMo273c0 = c0186t.mo273c0(AbstractC0601k.m1044t(c0186t).f1694E.mo778g());
        long j5 = c0186t.f647B;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 >> 32)) - ((int) (j5 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo273c0 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f644h;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f640d.mo276e0(j5);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0697T0 m277f() {
        C0186T c0186t = this.f645i;
        c0186t.getClass();
        return AbstractC0601k.m1044t(c0186t).f1694E;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        C0186T c0186t = this.f645i;
        synchronized (c0186t.f655y) {
            c0186t.f654x.m2761j(this);
        }
        this.f641e.mo278i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [f3.S] */
    /* JADX WARN: Type inference failed for: r6v4, types: [f3.S] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [W2.e] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m279j(long r6, p112W2.InterfaceC1603e r8, p084Q2.AbstractC1178c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p007B0.C0182O
            if (r0 == 0) goto L13
            r0 = r9
            B0.O r0 = (p007B0.C0182O) r0
            int r1 = r0.f632j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f632j = r1
            goto L18
        L13:
            B0.O r0 = new B0.O
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f630h
            int r1 = r0.f632j
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            f3.g0 r6 = r0.f629g
            p127Z2.AbstractC1784a.m3205S(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p127Z2.AbstractC1784a.m3205S(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            f3.g r9 = r5.f642f
            if (r9 == 0) goto L4a
            B0.p r1 = new B0.p
            r1.<init>(r6)
            K2.j r1 = p127Z2.AbstractC1784a.m3229o(r1)
            r9.mo278i(r1)
        L4a:
            B0.T r9 = r5.f645i
            f3.t r9 = r9.m4023x0()
            B0.P r1 = new B0.P
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            f3.g0 r6 = p160f3.AbstractC2162v.m3994p(r9, r3, r1, r6)
            r0.f629g = r6     // Catch: java.lang.Throwable -> L27
            r0.f632j = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.mo0g(r5, r0)     // Catch: java.lang.Throwable -> L27
            P2.a r7 = p079P2.EnumC1152a.f3788d
            if (r9 != r7) goto L68
            return r7
        L68:
            B0.b r7 = p007B0.C0188b.f658e
            r6.mo3905c(r7)
            return r9
        L6e:
            B0.b r8 = p007B0.C0188b.f658e
            r6.mo3905c(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0185S.m279j(long, W2.e, Q2.c):java.lang.Object");
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f640d.mo280k0(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m281l(long r5, p112W2.InterfaceC1603e r7, p084Q2.AbstractC1176a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p007B0.C0184Q
            if (r0 == 0) goto L13
            r0 = r8
            B0.Q r0 = (p007B0.C0184Q) r0
            int r1 = r0.f639i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f639i = r1
            goto L18
        L13:
            B0.Q r0 = new B0.Q
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f637g
            int r1 = r0.f639i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            p127Z2.AbstractC1784a.m3205S(r8)     // Catch: p007B0.C0202p -> L3c
            return r8
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            p127Z2.AbstractC1784a.m3205S(r8)
            r0.f639i = r2     // Catch: p007B0.C0202p -> L3c
            java.lang.Object r5 = r4.m279j(r5, r7, r0)     // Catch: p007B0.C0202p -> L3c
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r5 != r6) goto L3b
            return r6
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0185S.m281l(long, W2.e, Q2.a):java.lang.Object");
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f640d.mo282p();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f640d.mo283q0(i5);
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return f2 / this.f640d.mo272b();
    }
}
