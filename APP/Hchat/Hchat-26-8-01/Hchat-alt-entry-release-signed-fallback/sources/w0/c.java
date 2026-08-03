package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w0.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0.b f14757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14758p;

    public c(long r1, w0.j r3, fg.l r4, fg.l r5, w0.b r6) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5)
            r1 = r0
            r1.f14757o = r6
            r6.k()
            return
    }

    @Override // w0.b, w0.f
    public final void c() {
            r1 = this;
            boolean r0 = r1.f14765c
            if (r0 != 0) goto L13
            super.c()
            boolean r0 = r1.f14758p
            if (r0 != 0) goto L13
            r0 = 1
            r1.f14758p = r0
            w0.b r0 = r1.f14757o
            r0.l()
        L13:
            return
    }

    @Override // w0.b
    public final w0.q w() {
            r11 = this;
            w0.b r0 = r11.f14757o
            boolean r1 = r0.f14756m
            if (r1 != 0) goto La
            boolean r1 = r0.f14765c
            if (r1 == 0) goto Ld
        La:
            r2 = r11
            goto Lfa
        Ld:
            f.l0 r5 = r11.f14751h
            long r8 = r11.f14764b
            r1 = 0
            if (r5 == 0) goto L24
            long r2 = r0.g()
            w0.b r0 = r11.f14757o
            w0.j r0 = r0.d()
            java.util.HashMap r0 = w0.m.b(r2, r11, r0)
            r6 = r0
            goto L25
        L24:
            r6 = r1
        L25:
            java.lang.Object r10 = w0.m.f14786c
            monitor-enter(r10)
            w0.m.c(r11)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L31
            int r0 = r5.f2858d     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L33
        L31:
            r2 = r11
            goto L69
        L33:
            w0.b r0 = r11.f14757o     // Catch: java.lang.Throwable -> L65
            long r3 = r0.g()     // Catch: java.lang.Throwable -> L65
            w0.b r0 = r11.f14757o     // Catch: java.lang.Throwable -> L65
            w0.j r7 = r0.d()     // Catch: java.lang.Throwable -> L65
            r2 = r11
            w0.q r0 = r2.z(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L5a
            w0.h r3 = w0.h.f14768b     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L4e
            monitor-exit(r10)
            return r0
        L4e:
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            f.l0 r0 = r0.x()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5d
            r0.j(r5)     // Catch: java.lang.Throwable -> L5a
            goto L6c
        L5a:
            r0 = move-exception
            goto Lf8
        L5d:
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            r0.B(r5)     // Catch: java.lang.Throwable -> L5a
            r2.f14751h = r1     // Catch: java.lang.Throwable -> L5a
            goto L6c
        L65:
            r0 = move-exception
            r2 = r11
            goto Lf8
        L69:
            r11.a()     // Catch: java.lang.Throwable -> L5a
        L6c:
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            long r0 = r0.g()     // Catch: java.lang.Throwable -> L5a
            int r0 = gg.l.d(r0, r8)     // Catch: java.lang.Throwable -> L5a
            if (r0 >= 0) goto L7d
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            r0.v()     // Catch: java.lang.Throwable -> L5a
        L7d:
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            w0.j r1 = r0.d()     // Catch: java.lang.Throwable -> L5a
            w0.j r1 = r1.c(r8)     // Catch: java.lang.Throwable -> L5a
            w0.j r3 = r2.f14753j     // Catch: java.lang.Throwable -> L5a
            w0.j r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L5a
            r0.r(r1)     // Catch: java.lang.Throwable -> L5a
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            r0.A(r8)     // Catch: java.lang.Throwable -> L5a
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            int r1 = r2.f14766d     // Catch: java.lang.Throwable -> L5a
            r3 = -1
            r2.f14766d = r3     // Catch: java.lang.Throwable -> L5a
            if (r1 < 0) goto Laf
            int[] r3 = r0.f14754k     // Catch: java.lang.Throwable -> L5a
            r3.getClass()     // Catch: java.lang.Throwable -> L5a
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5a
            int r5 = r4 + 1
            int[] r3 = java.util.Arrays.copyOf(r3, r5)     // Catch: java.lang.Throwable -> L5a
            r3[r4] = r1     // Catch: java.lang.Throwable -> L5a
            r0.f14754k = r3     // Catch: java.lang.Throwable -> L5a
            goto Lb2
        Laf:
            r0.getClass()     // Catch: java.lang.Throwable -> L5a
        Lb2:
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            w0.j r1 = r2.f14753j     // Catch: java.lang.Throwable -> L5a
            r0.getClass()     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L5a
            w0.j r3 = r0.f14753j     // Catch: java.lang.Throwable -> Lf5
            w0.j r1 = r3.e(r1)     // Catch: java.lang.Throwable -> Lf5
            r0.f14753j = r1     // Catch: java.lang.Throwable -> Lf5
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            w0.b r0 = r2.f14757o     // Catch: java.lang.Throwable -> L5a
            int[] r1 = r2.f14754k     // Catch: java.lang.Throwable -> L5a
            r0.getClass()     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto Lce
            goto Le3
        Lce:
            int[] r3 = r0.f14754k     // Catch: java.lang.Throwable -> L5a
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto Ld4
            goto Le1
        Ld4:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5a
            int r5 = r1.length     // Catch: java.lang.Throwable -> L5a
            int r6 = r4 + r5
            int[] r3 = java.util.Arrays.copyOf(r3, r6)     // Catch: java.lang.Throwable -> L5a
            r6 = 0
            java.lang.System.arraycopy(r1, r6, r3, r4, r5)     // Catch: java.lang.Throwable -> L5a
            r1 = r3
        Le1:
            r0.f14754k = r1     // Catch: java.lang.Throwable -> L5a
        Le3:
            monitor-exit(r10)
            r0 = 1
            r2.f14756m = r0
            boolean r1 = r2.f14758p
            if (r1 != 0) goto Lf2
            r2.f14758p = r0
            w0.b r0 = r2.f14757o
            r0.l()
        Lf2:
            w0.h r0 = w0.h.f14768b
            return r0
        Lf5:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        Lf8:
            monitor-exit(r10)
            throw r0
        Lfa:
            w0.g r0 = new w0.g
            r0.<init>(r11)
            return r0
    }
}
