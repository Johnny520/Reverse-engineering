package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f12230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f12231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f12232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler f12233d;

    public g0(java.lang.Object r3, java.lang.Object r4, java.lang.Object[] r5, androidx.compose.ui.input.pointer.PointerInputEventHandler r6, int r7) {
            r2 = this;
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r7 = r7 & 4
            if (r7 == 0) goto L10
            r5 = r1
        L10:
            r2.<init>()
            r2.f12230a = r3
            r2.f12231b = r4
            r2.f12232c = r5
            r2.f12233d = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof s1.g0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s1.g0 r5 = (s1.g0) r5
            java.lang.Object r1 = r5.f12230a
            java.lang.Object r3 = r4.f12230a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.f12231b
            java.lang.Object r3 = r5.f12231b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object[] r1 = r5.f12232c
            java.lang.Object[] r3 = r4.f12232c
            if (r3 == 0) goto L32
            if (r1 != 0) goto L2b
            return r2
        L2b:
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 != 0) goto L35
            return r2
        L32:
            if (r1 == 0) goto L35
            return r2
        L35:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r4.f12233d
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.f12233d
            if (r1 != r5) goto L3c
            return r0
        L3c:
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r5 = this;
            s1.l0 r0 = new s1.l0
            java.lang.Object[] r1 = r5.f12232c
            androidx.compose.ui.input.pointer.PointerInputEventHandler r2 = r5.f12233d
            java.lang.Object r3 = r5.f12230a
            java.lang.Object r4 = r5.f12231b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r6) {
            r5 = this;
            s1.l0 r6 = (s1.l0) r6
            java.lang.Object r0 = r6.f12278u
            java.lang.Object r1 = r5.f12230a
            boolean r0 = gg.l.a(r0, r1)
            r2 = 1
            r0 = r0 ^ r2
            r6.f12278u = r1
            java.lang.Object r1 = r6.f12279v
            java.lang.Object r3 = r5.f12231b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L19
            r0 = r2
        L19:
            r6.f12279v = r3
            java.lang.Object[] r1 = r6.f12280w
            java.lang.Object[] r3 = r5.f12232c
            if (r1 == 0) goto L24
            if (r3 != 0) goto L24
            r0 = r2
        L24:
            if (r1 != 0) goto L29
            if (r3 == 0) goto L29
            r0 = r2
        L29:
            if (r1 == 0) goto L34
            if (r3 == 0) goto L34
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 != 0) goto L34
            r0 = r2
        L34:
            r6.f12280w = r3
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r6.f12281x
            java.lang.Class r1 = r1.getClass()
            androidx.compose.ui.input.pointer.PointerInputEventHandler r3 = r5.f12233d
            java.lang.Class r4 = r3.getClass()
            if (r1 == r4) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            if (r2 == 0) goto L4b
            r6.m1()
        L4b:
            r6.f12281x = r3
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f12230a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f12231b
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object[] r2 = r3.f12232c
            if (r2 == 0) goto L22
            int r0 = java.util.Arrays.hashCode(r2)
        L22:
            int r1 = r1 + r0
            int r1 = r1 * 31
            androidx.compose.ui.input.pointer.PointerInputEventHandler r0 = r3.f12233d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
