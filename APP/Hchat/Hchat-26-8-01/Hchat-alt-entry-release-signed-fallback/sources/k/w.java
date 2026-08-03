package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class w extends k.g {
    public s1.t R;
    public p1.b S;

    public final void A1(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L6
            r1.S = r0
            goto L8
        L6:
            r1.R = r0
        L8:
            r1.r1(r2)
            return
    }

    @Override // k.g, x1.w1
    public final void P(s1.k r7, s1.l r8, long r9) {
            r6 = this;
            super.P(r7, r8, r9)
            s1.l r0 = s1.l.f12275h
            r1 = 0
            if (r8 != r0) goto L85
            s1.t r8 = r6.R
            if (r8 != 0) goto L28
            r8 = 1
            boolean r8 = m.y2.e(r7, r8)
            if (r8 == 0) goto Lb1
            java.lang.Object r7 = r7.f12262a
            java.lang.Object r7 = r7.get(r1)
            s1.t r7 = (s1.t) r7
            r7.a()
            r6.R = r7
            boolean r8 = r6.B
            if (r8 == 0) goto Lb1
            r6.u1(r7)
            return
        L28:
            java.lang.Object r7 = r7.f12262a
            int r8 = r7.size()
            r0 = r1
        L2f:
            if (r0 >= r8) goto L65
            java.lang.Object r2 = r7.get(r0)
            s1.t r2 = (s1.t) r2
            boolean r2 = s1.s.c(r2)
            if (r2 != 0) goto L62
            long r2 = r6.q1(r9)
            int r8 = r7.size()
            r0 = r1
        L46:
            if (r0 >= r8) goto Lb1
            java.lang.Object r4 = r7.get(r0)
            s1.t r4 = (s1.t) r4
            boolean r5 = r4.b()
            if (r5 != 0) goto L5e
            boolean r4 = s1.s.f(r4, r9, r2)
            if (r4 == 0) goto L5b
            goto L5e
        L5b:
            int r0 = r0 + 1
            goto L46
        L5e:
            r6.A1(r1)
            return
        L62:
            int r0 = r0 + 1
            goto L2f
        L65:
            java.lang.Object r7 = r7.get(r1)
            s1.t r7 = (s1.t) r7
            r7.a()
            boolean r7 = r6.B
            if (r7 == 0) goto L81
            s1.t r7 = r6.R
            r7.getClass()
            long r7 = r7.f12293c
            r6.s1(r7, r1)
            fg.a r7 = r6.C
            r7.invoke()
        L81:
            r7 = 0
            r6.R = r7
            return
        L85:
            s1.l r9 = s1.l.f12276i
            if (r8 != r9) goto Lb1
            s1.t r8 = r6.R
            if (r8 == 0) goto Lb1
            java.lang.Object r7 = r7.f12262a
            int r8 = r7.size()
            r9 = r1
        L94:
            if (r9 >= r8) goto Lb1
            java.lang.Object r10 = r7.get(r9)
            s1.t r10 = (s1.t) r10
            boolean r0 = r10.b()
            if (r0 == 0) goto Lae
            s1.t r0 = r6.R
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto Lae
            r6.A1(r1)
            return
        Lae:
            int r9 = r9 + 1
            goto L94
        Lb1:
            return
    }

    @Override // p1.c
    public final void T0(ac.k r10, s1.l r11) {
            r9 = this;
            java.lang.Object r10 = r10.f178i
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.v1()
            boolean r0 = r9.B
            if (r0 == 0) goto L19
            k.l0 r0 = r9.G
            if (r0 != 0) goto L19
            k.l0 r0 = new k.l0
            r0.<init>(r9)
            r9.k1(r0)
            r9.G = r0
        L19:
            s1.l r0 = s1.l.f12275h
            r1 = 1
            r2 = 0
            if (r11 != r0) goto Lc9
            p1.b r11 = r9.S
            if (r11 != 0) goto L4b
            int r11 = r10.size()
            r0 = r2
        L28:
            if (r0 >= r11) goto Lf0
            java.lang.Object r3 = r10.get(r0)
            p1.b r3 = (p1.b) r3
            boolean r3 = ac.p.j(r3)
            if (r3 == 0) goto L48
            java.lang.Object r10 = r10.get(r2)
            p1.b r10 = (p1.b) r10
            r10.f10084i = r1
            r9.S = r10
            boolean r11 = r9.B
            if (r11 == 0) goto Lf0
            r9.t1(r10)
            return
        L48:
            int r0 = r0 + 1
            goto L28
        L4b:
            int r11 = r10.size()
            r0 = r2
        L50:
            if (r0 >= r11) goto Laa
            java.lang.Object r3 = r10.get(r0)
            p1.b r3 = (p1.b) r3
            boolean r4 = r3.f10084i
            if (r4 != 0) goto L67
            boolean r4 = r3.f10083h
            if (r4 == 0) goto L67
            boolean r3 = r3.f10079d
            if (r3 != 0) goto L67
            int r0 = r0 + 1
            goto L50
        L67:
            i0.m2 r11 = y1.h1.f21958t
            java.lang.Object r11 = x1.k.h(r9, r11)
            y1.l2 r11 = (y1.l2) r11
            float r11 = r11.f()
            int r0 = r10.size()
            r3 = r2
        L78:
            if (r3 >= r0) goto Lf0
            java.lang.Object r4 = r10.get(r3)
            p1.b r4 = (p1.b) r4
            long r5 = r4.f10078c
            p1.b r7 = r9.S
            r7.getClass()
            long r7 = r7.f10078c
            long r5 = e1.b.d(r5, r7)
            float r5 = e1.b.c(r5)
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L9b
            r5 = r1
            goto L9c
        L9b:
            r5 = r2
        L9c:
            boolean r4 = r4.f10084i
            if (r4 != 0) goto La6
            if (r5 == 0) goto La3
            goto La6
        La3:
            int r3 = r3 + 1
            goto L78
        La6:
            r9.A1(r1)
            return
        Laa:
            java.lang.Object r10 = r10.get(r2)
            p1.b r10 = (p1.b) r10
            r10.f10084i = r1
            boolean r10 = r9.B
            if (r10 == 0) goto Lc5
            p1.b r10 = r9.S
            r10.getClass()
            long r10 = r10.f10078c
            r9.s1(r10, r1)
            fg.a r10 = r9.C
            r10.invoke()
        Lc5:
            r10 = 0
            r9.S = r10
            return
        Lc9:
            s1.l r0 = s1.l.f12276i
            if (r11 != r0) goto Lf0
            p1.b r11 = r9.S
            if (r11 == 0) goto Lf0
            int r11 = r10.size()
        Ld5:
            if (r2 >= r11) goto Lf0
            java.lang.Object r0 = r10.get(r2)
            p1.b r0 = (p1.b) r0
            boolean r3 = r0.f10084i
            if (r3 == 0) goto Led
            p1.b r3 = r9.S
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Led
            r9.A1(r1)
            return
        Led:
            int r2 = r2 + 1
            goto Ld5
        Lf0:
            return
    }

    @Override // k.g, x1.w1
    public final void b0() {
            r1 = this;
            super.b0()
            r0 = 0
            r1.A1(r0)
            return
    }

    @Override // k.g
    public final boolean x1(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // p1.c
    public final void y0() {
            r1 = this;
            r0 = 1
            r1.A1(r0)
            return
    }

    @Override // k.g
    public final void y1(android.view.KeyEvent r1) {
            r0 = this;
            fg.a r1 = r0.C
            r1.invoke()
            return
    }
}
