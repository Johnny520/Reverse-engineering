package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Appendable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.StringBuilder f6259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f6260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6261i;

    public d() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            r2.f6259g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f6260h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f6261i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return
    }

    public d(i2.g r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    public final void a(i2.g r9) {
            r8 = this;
            java.lang.StringBuilder r0 = r8.f6259g
            int r1 = r0.length()
            java.lang.String r2 = r9.f6314h
            r0.append(r2)
            java.util.List r9 = r9.f6313g
            if (r9 == 0) goto L33
            int r0 = r9.size()
            r2 = 0
        L14:
            if (r2 >= r0) goto L33
            java.lang.Object r3 = r9.get(r2)
            i2.e r3 = (i2.e) r3
            i2.c r4 = new i2.c
            java.lang.Object r5 = r3.f6288a
            int r6 = r3.f6289b
            int r6 = r6 + r1
            int r7 = r3.f6290c
            int r7 = r7 + r1
            java.lang.String r3 = r3.f6291d
            r4.<init>(r3, r6, r7, r5)
            java.util.ArrayList r3 = r8.f6261i
            r3.add(r4)
            int r2 = r2 + 1
            goto L14
        L33:
            return
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f6259g
            r0.append(r2)
            return r1
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof i2.g
            if (r0 == 0) goto La
            i2.g r2 = (i2.g) r2
            r1.a(r2)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.f6259g
            r0.append(r2)
            return r1
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r7 instanceof i2.g
            java.lang.StringBuilder r1 = r6.f6259g
            if (r0 == 0) goto L3d
            i2.g r7 = (i2.g) r7
            int r0 = r1.length()
            java.lang.String r2 = r7.f6314h
            r1.append(r2, r8, r9)
            r1 = 0
            java.util.List r7 = i2.h.a(r7, r8, r9, r1)
            if (r7 == 0) goto L3c
            int r8 = r7.size()
            r9 = 0
        L1d:
            if (r9 >= r8) goto L3c
            java.lang.Object r1 = r7.get(r9)
            i2.e r1 = (i2.e) r1
            i2.c r2 = new i2.c
            java.lang.Object r3 = r1.f6288a
            int r4 = r1.f6289b
            int r4 = r4 + r0
            int r5 = r1.f6290c
            int r5 = r5 + r0
            java.lang.String r1 = r1.f6291d
            r2.<init>(r1, r4, r5, r3)
            java.util.ArrayList r1 = r6.f6261i
            r1.add(r2)
            int r9 = r9 + 1
            goto L1d
        L3c:
            return r6
        L3d:
            r1.append(r7, r8, r9)
            return r6
    }

    public final void b() {
            r2 = this;
            java.util.ArrayList r0 = r2.f6260h
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r1 = "Nothing to pop."
            o2.a.b(r1)
        Ld:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            i2.c r0 = (i2.c) r0
            java.lang.StringBuilder r1 = r2.f6259g
            int r1 = r1.length()
            r0.f6255c = r1
            return
    }

    public final void c(int r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.f6260h
            int r1 = r0.size()
            if (r4 >= r1) goto L9
            goto L24
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = " should be less than "
            r1.append(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            o2.a.b(r1)
        L24:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 < r4) goto L30
            r3.b()
            goto L24
        L30:
            return
    }

    public final int d(i2.f0 r5) {
            r4 = this;
            i2.c r0 = new i2.c
            java.lang.StringBuilder r1 = r4.f6259g
            int r1 = r1.length()
            r2 = 0
            r3 = 12
            r0.<init>(r5, r1, r2, r3)
            java.util.ArrayList r5 = r4.f6260h
            r5.add(r0)
            java.util.ArrayList r1 = r4.f6261i
            r1.add(r0)
            int r5 = r5.size()
            int r5 = r5 + (-1)
            return r5
    }

    public final i2.g e() {
            r8 = this;
            java.lang.StringBuilder r0 = r8.f6259g
            java.lang.String r1 = r0.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = r8.f6261i
            int r4 = r3.size()
            r2.<init>(r4)
            int r4 = r3.size()
            r5 = 0
        L16:
            if (r5 >= r4) goto L2c
            java.lang.Object r6 = r3.get(r5)
            i2.c r6 = (i2.c) r6
            int r7 = r0.length()
            i2.e r6 = r6.a(r7)
            r2.add(r6)
            int r5 = r5 + 1
            goto L16
        L2c:
            i2.g r0 = new i2.g
            r0.<init>(r1, r2)
            return r0
    }
}
