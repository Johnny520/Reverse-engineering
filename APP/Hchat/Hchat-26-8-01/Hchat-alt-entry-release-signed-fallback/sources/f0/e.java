package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2.z f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2.s f2947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.q0 f2948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b5.k f2950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.d1 f2951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n2.j f2952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d1.v f2953h;

    public e(n2.z r1, n2.s r2, w.q0 r3, boolean r4, b5.k r5, h0.d1 r6, n2.j r7, d1.v r8) {
            r0 = this;
            r0.<init>()
            r0.f2946a = r1
            r0.f2947b = r2
            r0.f2948c = r3
            r0.f2949d = r4
            r0.f2950e = r5
            r0.f2951f = r6
            r0.f2952g = r7
            r0.f2953h = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5f
        L3:
            boolean r0 = r3 instanceof f0.e
            if (r0 != 0) goto L8
            goto L5d
        L8:
            f0.e r3 = (f0.e) r3
            n2.z r0 = r2.f2946a
            n2.z r1 = r3.f2946a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L5d
        L15:
            n2.s r0 = r2.f2947b
            n2.s r1 = r3.f2947b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L5d
        L20:
            w.q0 r0 = r2.f2948c
            w.q0 r1 = r3.f2948c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L5d
        L2b:
            boolean r0 = r2.f2949d
            boolean r1 = r3.f2949d
            if (r0 == r1) goto L32
            goto L5d
        L32:
            b5.k r0 = r2.f2950e
            b5.k r1 = r3.f2950e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3d
            goto L5d
        L3d:
            h0.d1 r0 = r2.f2951f
            h0.d1 r1 = r3.f2951f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L5d
        L48:
            n2.j r0 = r2.f2952g
            n2.j r1 = r3.f2952g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L53
            goto L5d
        L53:
            d1.v r0 = r2.f2953h
            d1.v r3 = r3.f2953h
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L5f
        L5d:
            r3 = 0
            return r3
        L5f:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            f0.i r0 = new f0.i
            r0.<init>()
            n2.z r1 = r4.f2946a
            r0.f2960w = r1
            n2.s r1 = r4.f2947b
            r0.f2961x = r1
            w.q0 r1 = r4.f2948c
            r0.f2962y = r1
            boolean r1 = r4.f2949d
            r0.f2963z = r1
            b5.k r1 = r4.f2950e
            r0.A = r1
            h0.d1 r1 = r4.f2951f
            r0.B = r1
            n2.j r2 = r4.f2952g
            r0.C = r2
            d1.v r2 = r4.f2953h
            r0.D = r2
            f0.f r2 = new f0.f
            r3 = 4
            r2.<init>(r0, r3)
            r1.f4852f = r2
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            f0.i r9 = (f0.i) r9
            boolean r0 = r9.f2963z
            n2.j r1 = r9.C
            h0.d1 r2 = r9.B
            n2.z r3 = r8.f2946a
            r9.f2960w = r3
            n2.s r3 = r8.f2947b
            r9.f2961x = r3
            w.q0 r4 = r8.f2948c
            r9.f2962y = r4
            boolean r4 = r8.f2949d
            r9.f2963z = r4
            b5.k r5 = r8.f2950e
            r9.A = r5
            h0.d1 r5 = r8.f2951f
            r9.B = r5
            n2.j r6 = r8.f2952g
            r9.C = r6
            d1.v r7 = r8.f2953h
            r9.D = r7
            if (r4 != r0) goto L3a
            if (r4 != r0) goto L3a
            boolean r0 = gg.l.a(r6, r1)
            if (r0 == 0) goto L3a
            long r0 = r3.f8977b
            boolean r0 = i2.m0.c(r0)
            if (r0 != 0) goto L3d
        L3a:
            x1.k.n(r9)
        L3d:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L4b
            f0.f r0 = new f0.f
            r1 = 0
            r0.<init>(r9, r1)
            r5.f4852f = r0
        L4b:
            return
    }

    public final int hashCode() {
            r4 = this;
            n2.z r0 = r4.f2946a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            n2.s r2 = r4.f2947b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            w.q0 r0 = r4.f2948c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            boolean r3 = r4.f2949d
            int r0 = eh.a.h(r0, r1, r3)
            int r0 = eh.a.h(r0, r1, r2)
            b5.k r2 = r4.f2950e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            h0.d1 r0 = r4.f2951f
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            n2.j r2 = r4.f2952g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            d1.v r0 = r4.f2953h
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoreTextFieldSemanticsModifier(transformedText="
            r0.<init>(r1)
            n2.z r1 = r2.f2946a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            n2.s r1 = r2.f2947b
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            w.q0 r1 = r2.f2948c
            r0.append(r1)
            java.lang.String r1 = ", readOnly=false, enabled="
            r0.append(r1)
            boolean r1 = r2.f2949d
            r0.append(r1)
            java.lang.String r1 = ", isPassword=false, offsetMapping="
            r0.append(r1)
            b5.k r1 = r2.f2950e
            r0.append(r1)
            java.lang.String r1 = ", manager="
            r0.append(r1)
            h0.d1 r1 = r2.f2951f
            r0.append(r1)
            java.lang.String r1 = ", imeOptions="
            r0.append(r1)
            n2.j r1 = r2.f2952g
            r0.append(r1)
            java.lang.String r1 = ", focusRequester="
            r0.append(r1)
            d1.v r1 = r2.f2953h
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
