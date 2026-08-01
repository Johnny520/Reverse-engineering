package p054K;

import java.util.HashMap;
import p000A.C0099z;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p092S0.C1260M;
import p092S0.C1269g;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p137b3.InterfaceC1855c;
import p169h0.AbstractC2206o;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: K.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0873h extends AbstractC2206o implements InterfaceC0627x, InterfaceC0605m, InterfaceC0632z0 {

    /* JADX INFO: renamed from: A */
    public C0871f f2745A;

    /* JADX INFO: renamed from: B */
    public C0872g f2746B;

    /* JADX INFO: renamed from: r */
    public String f2747r;

    /* JADX INFO: renamed from: s */
    public C1260M f2748s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1580e f2749t;

    /* JADX INFO: renamed from: u */
    public int f2750u;

    /* JADX INFO: renamed from: v */
    public boolean f2751v;

    /* JADX INFO: renamed from: w */
    public int f2752w;

    /* JADX INFO: renamed from: x */
    public int f2753x;

    /* JADX INFO: renamed from: y */
    public HashMap f2754y;

    /* JADX INFO: renamed from: z */
    public C0869d f2755z;

    /* JADX INFO: renamed from: J0 */
    public final C0869d m1900J0() {
        if (this.f2755z == null) {
            this.f2755z = new C0869d(this.f2747r, this.f2748s, this.f2749t, this.f2750u, this.f2751v, this.f2752w, this.f2753x);
        }
        C0869d c0869d = this.f2755z;
        AbstractC1665j.m2982b(c0869d);
        return c0869d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo940R(p041H0.C0566K r11) {
        /*
            r10 = this;
            boolean r0 = r10.f7199q
            if (r0 != 0) goto L6
            goto L99
        L6:
            K.g r0 = r10.f2746B
            if (r0 == 0) goto L16
            boolean r1 = r0.f2743c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            K.d r0 = r0.f2744d
            if (r0 != 0) goto L1a
        L16:
            K.d r0 = r10.m1900J0()
        L1a:
            S0.a r1 = r0.f2722j
            if (r1 == 0) goto La0
            q0.b r11 = r11.f1742d
            A.l0 r11 = r11.f9185e
            o0.s r2 = r11.m106j()
            boolean r11 = r0.f2723k
            if (r11 == 0) goto L43
            long r3 = r0.f2724l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.mo4852n()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.mo4845f(r3, r4, r5, r6, r7)
        L43:
            S0.M r0 = r10.f2748s     // Catch: java.lang.Throwable -> L4f
            S0.E r0 = r0.f4540a     // Catch: java.lang.Throwable -> L4f
            d1.l r3 = r0.f4506m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            d1.l r3 = p147d1.C1962l.f6640b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L51
        L4f:
            r0 = move-exception
            goto L9a
        L51:
            o0.L r3 = r0.f4507n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L57
            o0.L r3 = p211o0.C2737L.f8703d     // Catch: java.lang.Throwable -> L4f
        L57:
            r5 = r3
            q0.c r3 = r0.f4508o     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L5e
            q0.f r3 = p222q0.C2905f.f9190b     // Catch: java.lang.Throwable -> L4f
        L5e:
            r7 = r3
            d1.o r0 = r0.f4494a     // Catch: java.lang.Throwable -> L4f
            o0.q r3 = r0.mo3621c()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L75
            S0.M r0 = r10.f2748s     // Catch: java.lang.Throwable -> L4f
            S0.E r0 = r0.f4540a     // Catch: java.lang.Throwable -> L4f
            d1.o r0 = r0.f4494a     // Catch: java.lang.Throwable -> L4f
            float r4 = r0.mo3619a()     // Catch: java.lang.Throwable -> L4f
            r1.m2352g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L94
        L75:
            long r3 = p211o0.C2762u.f8762g     // Catch: java.lang.Throwable -> L4f
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L7e
            goto L91
        L7e:
            S0.M r0 = r10.f2748s     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.m2343b()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L8f
            S0.M r0 = r10.f2748s     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.m2343b()     // Catch: java.lang.Throwable -> L4f
            goto L91
        L8f:
            long r3 = p211o0.C2762u.f8757b     // Catch: java.lang.Throwable -> L4f
        L91:
            r1.m2351f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L94:
            if (r11 == 0) goto L99
            r2.mo4851l()
        L99:
            return
        L9a:
            if (r11 == 0) goto L9f
            r2.mo4851l()
        L9f:
            throw r0
        La0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r11.<init>(r0)
            K.d r0 = r10.f2755z
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            K.g r0 = r10.f2746B
            r11.append(r0)
            r0 = 41
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p238t.AbstractC3204b.m5476b(r11)
            E4.q r11 = new E4.q
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo940R(H0.K):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo941T(p041H0.AbstractC0572Q r2, p029F0.InterfaceC0376N r3, int r4) {
        /*
            r1 = this;
            K.g r3 = r1.f2746B
            if (r3 == 0) goto L10
            boolean r0 = r3.f2743c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            K.d r3 = r3.f2744d
            if (r3 != 0) goto L14
        L10:
            K.d r3 = r1.m1900J0()
        L14:
            r3.m1898d(r2)
            e1.m r2 = r2.getLayoutDirection()
            int r2 = r3.m1895a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo941T(H0.Q, F0.N, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.f] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        C0871f c0871f = this.f2745A;
        ?? r02 = c0871f;
        if (c0871f == null) {
            final int i5 = 0;
            ?? r03 = new InterfaceC1601c(this) { // from class: K.f

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0873h f2740e;

                {
                    this.f2740e = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
                @Override // p112W2.InterfaceC1601c
                /* JADX INFO: renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object mo1h(java.lang.Object r30) {
                    /*
                        Method dump skipped, instruction units count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p054K.C0871f.mo1h(java.lang.Object):java.lang.Object");
                }
            };
            this.f2745A = r03;
            r02 = r03;
        }
        C1269g c1269g = new C1269g(this.f2747r);
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        interfaceC1136w.mo1128a(AbstractC1132s.f3723B, AbstractC2352g.m4211y(c1269g));
        C0872g c0872g = this.f2746B;
        if (c0872g != null) {
            boolean z5 = c0872g.f2743c;
            C1135v c1135v = AbstractC1132s.f3725D;
            InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
            InterfaceC1855c interfaceC1855c = interfaceC1855cArr2[17];
            interfaceC1136w.mo1128a(c1135v, Boolean.valueOf(z5));
            C1269g c1269g2 = new C1269g(c0872g.f2742b);
            C1135v c1135v2 = AbstractC1132s.f3724C;
            InterfaceC1855c interfaceC1855c2 = interfaceC1855cArr2[16];
            interfaceC1136w.mo1128a(c1135v2, c1269g2);
        }
        final int i6 = 1;
        interfaceC1136w.mo1128a(AbstractC1124k.f3687l, new C1114a(null, new InterfaceC1601c(this) { // from class: K.f

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0873h f2740e;

            {
                this.f2740e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo1h(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p054K.C0871f.mo1h(java.lang.Object):java.lang.Object");
            }
        }));
        final int i7 = 2;
        interfaceC1136w.mo1128a(AbstractC1124k.f3688m, new C1114a(null, new InterfaceC1601c(this) { // from class: K.f

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0873h f2740e;

            {
                this.f2740e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo1h(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p054K.C0871f.mo1h(java.lang.Object):java.lang.Object");
            }
        }));
        interfaceC1136w.mo1128a(AbstractC1124k.f3689n, new C1114a(null, new C0099z(10, this)));
        AbstractC1134u.m2188a(interfaceC1136w, r02);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p029F0.InterfaceC0378P mo687d(p029F0.InterfaceC0379Q r5, p029F0.InterfaceC0376N r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            K.g r0 = r4.f2746B     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L15
            boolean r1 = r0.f2743c     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            K.d r0 = r0.f2744d     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L19
        L15:
            K.d r0 = r4.m1900J0()     // Catch: java.lang.Throwable -> L4a
        L19:
            r0.m1898d(r5)     // Catch: java.lang.Throwable -> L4a
            e1.m r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r0.m1896b(r7, r1)     // Catch: java.lang.Throwable -> L4a
            S0.s r8 = r0.f2726n     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L2b
            r8.mo425b()     // Catch: java.lang.Throwable -> L4a
        L2b:
            S0.a r8 = r0.f2722j     // Catch: java.lang.Throwable -> L4a
            p117X2.AbstractC1665j.m2982b(r8)     // Catch: java.lang.Throwable -> L4a
            T0.j r8 = r8.f4548d     // Catch: java.lang.Throwable -> L4a
            long r0 = r0.f2724l     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L73
            r7 = 2
            H0.h0 r2 = p041H0.AbstractC0601k.m1042r(r4, r7)     // Catch: java.lang.Throwable -> L4a
            r2.m988Y0()     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r2 = r4.f2754y     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L4c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            r4.f2754y = r2     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r5 = move-exception
            goto L9a
        L4c:
            F0.l r7 = p029F0.AbstractC0394d.f1215a     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            float r3 = r8.m2708d(r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L4a
            F0.l r7 = p029F0.AbstractC0394d.f1216b     // Catch: java.lang.Throwable -> L4a
            int r3 = r8.f5045g     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + (-1)
            float r8 = r8.m2708d(r3)     // Catch: java.lang.Throwable -> L4a
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
        L73:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L4a
            long r0 = p127Z2.AbstractC1784a.m3233s(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L4a
            F0.b0 r6 = r6.mo648e(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r0 = r4.f2754y     // Catch: java.lang.Throwable -> L4a
            p117X2.AbstractC1665j.m2982b(r0)     // Catch: java.lang.Throwable -> L4a
            A.R0 r1 = new A.R0     // Catch: java.lang.Throwable -> L4a
            r2 = 1
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L4a
            F0.P r5 = r5.mo604f0(r7, r8, r0, r1)     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r5
        L9a:
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo687d(F0.Q, F0.N, long):F0.P");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo948j(p041H0.AbstractC0572Q r1, p029F0.InterfaceC0376N r2, int r3) {
        /*
            r0 = this;
            K.g r2 = r0.f2746B
            if (r2 == 0) goto L10
            boolean r3 = r2.f2743c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            K.d r2 = r2.f2744d
            if (r2 != 0) goto L14
        L10:
            K.d r2 = r0.m1900J0()
        L14:
            r2.m1898d(r1)
            e1.m r1 = r1.getLayoutDirection()
            S0.s r1 = r2.m1899e(r1)
            float r1 = r1.mo424a()
            int r1 = p000A.AbstractC0070k0.m83j(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo948j(H0.Q, F0.N, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo949l0(p041H0.AbstractC0572Q r2, p029F0.InterfaceC0376N r3, int r4) {
        /*
            r1 = this;
            K.g r3 = r1.f2746B
            if (r3 == 0) goto L10
            boolean r0 = r3.f2743c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            K.d r3 = r3.f2744d
            if (r3 != 0) goto L14
        L10:
            K.d r3 = r1.m1900J0()
        L14:
            r3.m1898d(r2)
            e1.m r2 = r2.getLayoutDirection()
            int r2 = r3.m1895a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo949l0(H0.Q, F0.N, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo954w0(p041H0.AbstractC0572Q r1, p029F0.InterfaceC0376N r2, int r3) {
        /*
            r0 = this;
            K.g r2 = r0.f2746B
            if (r2 == 0) goto L10
            boolean r3 = r2.f2743c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            K.d r2 = r2.f2744d
            if (r2 != 0) goto L14
        L10:
            K.d r2 = r0.m1900J0()
        L14:
            r2.m1898d(r1)
            e1.m r1 = r1.getLayoutDirection()
            S0.s r1 = r2.m1899e(r1)
            float r1 = r1.mo426c()
            int r1 = p000A.AbstractC0070k0.m83j(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0873h.mo954w0(H0.Q, F0.N, int):int");
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
