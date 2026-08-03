package jf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.k f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.r f6867b;

    static {
            java.lang.Class<jf.b> r0 = jf.b.class
            mh.d.b(r0)
            return
    }

    public b(ac.k r1, f.r r2) {
            r0 = this;
            r0.<init>()
            r0.f6866a = r1
            r0.f6867b = r2
            return
    }

    public final java.util.ArrayList a() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 16
            ac.k r2 = r5.f6866a
            r2.B(r1)
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            java.lang.String r1 = r2.v(r1)
            if (r1 == 0) goto L28
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L28
            pc.k r3 = new pc.k
            r3.<init>(r1)
            r0.add(r3)
        L28:
            java.lang.String r1 = r5.b()
            r3 = 20
            r2.B(r3)
            java.lang.Object r2 = r2.f178i
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt()
            f.r r3 = r5.f6867b
            r3.e(r2)
            int r2 = r3.f2889b
            if (r2 != 0) goto L45
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L58
        L45:
            java.lang.Object r4 = r3.f2893f
            ac.k r4 = (ac.k) r4
            r4.a(r2)
            java.lang.Object r2 = r4.f178i
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt()
            java.util.List r2 = r3.d(r2)
        L58:
            jf.a.a(r1, r0, r2)
            return r0
    }

    public final java.lang.String b() {
            r2 = this;
            r0 = 0
            ac.k r1 = r2.f6866a
            r1.B(r0)
            java.lang.Object r0 = r1.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            java.lang.String r0 = r1.y(r0)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.String r0 = "Unknown class type"
            bsh.j.c(r0)
            r0 = 0
            return r0
    }

    public final void c(qc.e r8, ac.k r9, jf.d r10, int r11, java.util.Map r12, boolean r13) {
            r7 = this;
            r0 = 0
            ac.k r1 = r7.f6866a
            if (r13 == 0) goto L29
            ac.k r2 = r9.g()
            r3 = 28
            r1.B(r3)
            java.lang.Object r3 = r1.f178i
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt()
            if (r3 != 0) goto L1b
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L2a
        L1b:
            r2.a(r3)
            f.r r3 = r7.f6867b
            java.lang.Object r3 = r3.f2894g
            ac.k r3 = (ac.k) r3
            java.util.ArrayList r2 = a7.a.H(r2, r3)
            goto L2a
        L29:
            r2 = r0
        L2a:
            r3 = 0
            r4 = r3
            r5 = r4
        L2d:
            if (r4 >= r11) goto L69
            int r6 = a.a.H0(r9)
            int r5 = r5 + r6
            int r6 = a.a.H0(r9)
            r1.j(r10, r5)
            r10.f6874e = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r12.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L4e
            int r6 = r6.intValue()
            goto L4f
        L4e:
            r6 = r3
        L4f:
            r10.f6875f = r6
            if (r13 == 0) goto L60
            int r6 = r2.size()
            if (r4 >= r6) goto L60
            java.lang.Object r6 = r2.get(r4)
            nc.a r6 = (nc.a) r6
            goto L61
        L60:
            r6 = r0
        L61:
            r10.f6876g = r6
            r8.accept(r10)
            int r4 = r4 + 1
            goto L2d
        L69:
            return
    }

    public final void d(qc.e r14, ac.k r15, jf.f r16, int r17, java.util.Map r18, java.util.Map r19) {
            r13 = this;
            r0 = r16
            a5.a r1 = new a5.a
            ac.k r2 = r13.f6866a
            ac.k r3 = r2.g()
            r1.<init>(r3)
            r3 = 0
            r4 = r17
            r5 = r3
            r6 = r5
        L12:
            if (r5 >= r4) goto L83
            int r7 = a.a.H0(r15)
            int r6 = r6 + r7
            int r7 = a.a.H0(r15)
            int r8 = a.a.H0(r15)
            jf.h r9 = r0.f6887b
            r10 = 0
            r9.f6895b = r10
            r9.f6896c = r10
            r9.f6897d = r10
            r9.f6898e = r10
            java.lang.Object r11 = r2.f179j
            ff.e r11 = (ff.e) r11
            int r11 = r11.f3931a
            r12 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r12
            int r11 = r11 << 16
            r12 = r12 & r6
            r11 = r11 | r12
            r9.f6894a = r11
            r9.f6899f = r6
            r9.f6900g = r2
            r0.f6888c = r7
            if (r8 != 0) goto L47
            r0.f6891f = r10
            goto L51
        L47:
            r1.f56h = r6
            java.lang.Object r7 = r1.f57i
            ac.k r7 = (ac.k) r7
            r7.f177h = r8
            r0.f6891f = r1
        L51:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = r18
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L64
            int r7 = r7.intValue()
            goto L65
        L64:
            r7 = r3
        L65:
            r0.f6889d = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9 = r19
            java.lang.Object r7 = r9.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L7a
            int r7 = r7.intValue()
            goto L7b
        L7a:
            r7 = r3
        L7b:
            r0.f6890e = r7
            r14.accept(r0)
            int r5 = r5 + 1
            goto L12
        L83:
            return
    }

    public final void e(qc.e r19, qc.e r20) {
            r18 = this;
            r0 = r18
            f.r r7 = r0.f6867b
            java.lang.Object r1 = r7.f2893f
            r8 = r1
            ac.k r8 = (ac.k) r8
            r1 = 24
            ac.k r2 = r0.f6866a
            r2.B(r1)
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            if (r1 != 0) goto L1b
            return
        L1b:
            ac.k r3 = new ac.k
            java.lang.Object r4 = r2.f179j
            ff.e r4 = (ff.e) r4
            r3.<init>(r4, r1)
            int r4 = a.a.H0(r3)
            int r9 = a.a.H0(r3)
            int r10 = a.a.H0(r3)
            int r11 = a.a.H0(r3)
            int r1 = r4 + r9
            if (r1 != 0) goto L3d
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L3a:
            r5 = r19
            goto L44
        L3d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r1 = r5
            goto L3a
        L44:
            r5.f10864b = r1
            int r1 = r10 + r11
            if (r1 != 0) goto L4f
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L4c:
            r12 = r20
            goto L56
        L4f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            r1 = r6
            goto L4c
        L56:
            r12.f10864b = r1
            r1 = 20
            r2.B(r1)
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            r7.e(r1)
            int r1 = r7.f2890c
            r14 = 16
            if (r1 != 0) goto L72
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
        L70:
            r2 = r3
            goto L9d
        L72:
            r8.B(r14)
            java.lang.Object r1 = r8.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.util.HashMap r2 = new java.util.HashMap
            int r6 = r7.f2890c
            r2.<init>(r6)
            r6 = 0
        L81:
            int r15 = r7.f2890c
            if (r6 >= r15) goto L9b
            int r15 = r1.getInt()
            int r16 = r1.getInt()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r2.put(r15, r13)
            int r6 = r6 + 1
            goto L81
        L9b:
            r1 = r2
            goto L70
        L9d:
            jf.d r3 = new jf.d
            r3.<init>(r7)
            java.lang.String r6 = r0.b()
            r3.f6871b = r6
            r6 = 1
            r17 = r5
            r5 = r1
            r1 = r17
            r0.c(r1, r2, r3, r4, r5, r6)
            r6 = 0
            r0 = r18
            r1 = r19
            r4 = r9
            r0.c(r1, r2, r3, r4, r5, r6)
            jf.f r3 = new jf.f
            r3.<init>(r7)
            jf.h r0 = new jf.h
            r0.<init>()
            r3.f6887b = r0
            int r0 = r7.f2891d
            if (r0 != 0) goto Lce
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r5 = r0
            goto Lfd
        Lce:
            int r0 = r7.f2890c
            int r0 = r0 * 8
            int r0 = r0 + r14
            r8.B(r0)
            java.lang.Object r0 = r8.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.util.HashMap r1 = new java.util.HashMap
            int r4 = r7.f2891d
            r1.<init>(r4)
            r4 = 0
        Le2:
            int r5 = r7.f2891d
            if (r4 >= r5) goto Lfc
            int r5 = r0.getInt()
            int r6 = r0.getInt()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.put(r5, r6)
            int r4 = r4 + 1
            goto Le2
        Lfc:
            r5 = r1
        Lfd:
            int r0 = r7.f2892e
            if (r0 != 0) goto L109
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r6 = r0
            r4 = r10
            r1 = r12
            r0 = r18
            goto L141
        L109:
            int r0 = r7.f2890c
            int r0 = r0 * 8
            int r0 = r0 + r14
            int r1 = r7.f2891d
            int r1 = r1 * 8
            int r1 = r1 + r0
            r8.B(r1)
            java.lang.Object r0 = r8.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.util.HashMap r1 = new java.util.HashMap
            int r4 = r7.f2892e
            r1.<init>(r4)
            r13 = 0
        L122:
            int r4 = r7.f2892e
            if (r13 >= r4) goto L13c
            int r4 = r0.getInt()
            int r6 = r0.getInt()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.put(r4, r6)
            int r13 = r13 + 1
            goto L122
        L13c:
            r6 = r1
            r0 = r18
            r4 = r10
            r1 = r12
        L141:
            r0.d(r1, r2, r3, r4, r5, r6)
            r4 = r11
            r0.d(r1, r2, r3, r4, r5, r6)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.b()
            return r0
    }
}
