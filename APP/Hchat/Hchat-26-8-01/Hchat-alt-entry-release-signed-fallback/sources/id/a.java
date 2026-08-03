package id;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f6661a;

    public a(int r2) {
            r1 = this;
            switch(r2) {
                case 2: goto Le;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6661a = r2
            return
        Le:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 32
            r2.<init>(r0)
            r1.f6661a = r2
            return
    }

    public d6.l a() {
            r10 = this;
            java.util.ArrayList r0 = r10.f6661a
            b8.c r1 = new b8.c
            r2 = 1
            r1.<init>(r2)
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            r3 = 0
        L1e:
            int r4 = r0.size()
            if (r3 >= r4) goto Ld4
            java.lang.Object r4 = r0.get(r3)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            d6.i r4 = (d6.i) r4
            if (r3 <= 0) goto Lc0
            int r5 = r3 + (-1)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            d6.i r5 = (d6.i) r5
            boolean r6 = r4.e(r5)
            if (r6 == 0) goto Lc0
            java.lang.Comparable r6 = r4.f2024b
            java.lang.Comparable r7 = r4.f2023a
            boolean r8 = r4.e(r5)
            if (r8 != 0) goto L53
            r6 = 0
            goto Lb0
        L53:
            boolean r8 = r4.c()
            if (r8 == 0) goto L77
            boolean r8 = r5.c()
            java.lang.Comparable r9 = r5.f2023a
            if (r8 != 0) goto L62
            goto L77
        L62:
            boolean r8 = java.util.Objects.equals(r7, r9)
            if (r8 == 0) goto L70
            boolean r7 = r4.f2025c
            if (r7 == 0) goto L6e
        L6c:
            r7 = r4
            goto L7e
        L6e:
            r7 = r5
            goto L7e
        L70:
            int r7 = r7.compareTo(r9)
            if (r7 <= 0) goto L6e
            goto L6c
        L77:
            boolean r7 = r4.c()
            if (r7 == 0) goto L6e
            goto L6c
        L7e:
            boolean r8 = r4.d()
            if (r8 == 0) goto L9d
            boolean r8 = r5.d()
            java.lang.Comparable r9 = r5.f2024b
            if (r8 != 0) goto L8d
            goto L9d
        L8d:
            boolean r8 = java.util.Objects.equals(r6, r9)
            if (r8 == 0) goto L95
        L93:
            r6 = r5
            goto La4
        L95:
            int r6 = r6.compareTo(r9)
            if (r6 >= 0) goto L93
        L9b:
            r6 = r4
            goto La4
        L9d:
            boolean r6 = r4.d()
            if (r6 == 0) goto L93
            goto L9b
        La4:
            d6.i r8 = new d6.i
            java.lang.Comparable r9 = r7.f2023a
            java.lang.Comparable r6 = r6.f2024b
            boolean r7 = r7.f2025c
            r8.<init>(r9, r6, r7)
            r6 = r8
        Lb0:
            boolean r6 = r6.f()
            if (r6 == 0) goto Lb7
            goto Lc0
        Lb7:
            java.lang.String r0 = "Overlapping ranges: range "
            java.lang.String r1 = " overlaps with entry "
            j8.o.m(r0, r5, r1, r4)
            r0 = 0
            return r0
        Lc0:
            r1.add(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            r2.add(r4)
            int r3 = r3 + 1
            goto L1e
        Ld4:
            d6.l r0 = new d6.l
            r0.<init>(r1, r2)
            return r0
    }

    public void b(float r9, float r10, float r11, float r12, float r13, float r14) {
            r8 = this;
            java.util.ArrayList r0 = r8.f6661a
            m1.k r1 = new m1.k
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
            return
    }

    public void c(float r3, float r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.f6661a
            m1.m r1 = new m1.m
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public void d(d6.i r3, java.lang.Short r4) {
            r2 = this;
            boolean r0 = r3.f()
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = r2.f6661a
            d6.k r1 = new d6.k
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        L11:
            java.lang.String r3 = "Ranges cannot be empty"
            j8.o.t(r3)
            return
    }
}
