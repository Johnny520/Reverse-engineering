package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends r4.z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.x f11405h;

    public g0(v4.x r1) {
            r0 = this;
            r0.<init>()
            r0.f11405h = r1
            return
    }

    @Override // r4.a0
    public final void a(r4.p r2) {
            r1 = this;
            r4.h0 r2 = r2.f11489n
            v4.x r0 = r1.f11405h
            r2.q(r0)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11365r
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r9, z4.d r10) {
            r8 = this;
            int r0 = r8.i(r9)
            v4.x r1 = r8.f11405h
            int r2 = r1.f14128g
            boolean r3 = r10.d()
            r4 = 0
            if (r3 == 0) goto Lbc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r8.f()
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            java.lang.String r5 = r1.toString()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r10.b(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = " // "
            r3.<init>(r5)
            java.lang.String[] r6 = v4.x.f14127i
            r6 = r6[r2]
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "type:     "
            r6.<init>(r7)
            java.lang.String r7 = a.a.X0(r2)
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r6 = 2
            r10.b(r6, r3)
            java.lang.String r3 = a.a.X0(r4)
            java.lang.String r7 = "reserved: "
            java.lang.String r3 = r7.concat(r3)
            r10.b(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            v4.a r5 = r1.f14129h
            java.lang.String r5 = r5.toString()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            int r1 = r1.f14128g
            boolean r1 = v4.x.k(r1)
            if (r1 == 0) goto L99
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "fieldId:  "
            r1.<init>(r5)
            java.lang.String r0 = a.a.X0(r0)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r10.b(r6, r0)
            goto Lb1
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "methodId: "
            r1.<init>(r5)
            java.lang.String r0 = a.a.X0(r0)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r10.b(r6, r0)
        Lb1:
            java.lang.String r0 = a.a.X0(r4)
            java.lang.String r0 = r7.concat(r0)
            r10.b(r6, r0)
        Lbc:
            r10.l(r2)
            r10.l(r4)
            int r9 = r8.i(r9)
            r10.l(r9)
            r10.l(r4)
            return
    }

    public final int i(r4.p r4) {
            r3 = this;
            v4.x r0 = r3.f11405h
            v4.a r1 = r0.f14129h
            int r2 = r0.f14128g
            boolean r2 = v4.x.k(r2)
            if (r2 == 0) goto L15
            r4.w r4 = r4.f11484i
            v4.m r1 = (v4.m) r1
            int r4 = r4.l(r1)
            return r4
        L15:
            int r0 = r0.f14128g
            switch(r0) {
                case 4: goto L21;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto L1a;
            }
        L1a:
            java.lang.String r4 = "Unhandled invocation type"
            j8.o.A(r4)
            r4 = 0
            return r4
        L21:
            boolean r0 = r1 instanceof v4.p
            if (r0 == 0) goto L2b
            v4.p r1 = (v4.p) r1
            v4.y r1 = r1.l()
        L2b:
            r4.j0 r4 = r4.f11485j
            v4.e r1 = (v4.e) r1
            int r4 = r4.l(r1)
            return r4
    }
}
