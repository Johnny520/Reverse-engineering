package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.v f10392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f10394d;

    public l(java.lang.String r1, p8.v r2, java.lang.Object r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.f10391a = r1
            r0.f10392b = r2
            r0.f10393c = r3
            r0.f10394d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p8.l
            if (r0 != 0) goto L8
            goto L35
        L8:
            p8.l r3 = (p8.l) r3
            java.lang.String r0 = r2.f10391a
            java.lang.String r1 = r3.f10391a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            p8.v r0 = r2.f10392b
            p8.v r1 = r3.f10392b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.Object r0 = r2.f10393c
            java.lang.Object r1 = r3.f10393c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.ref.WeakReference r0 = r2.f10394d
            java.lang.ref.WeakReference r3 = r3.f10394d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f10391a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            p8.v r2 = r3.f10392b
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.f10393c
            if (r1 != 0) goto L1c
            r1 = r0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.ref.WeakReference r1 = r3.f10394d
            if (r1 != 0) goto L28
            goto L2c
        L28:
            int r0 = r1.hashCode()
        L2c:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SnsContextMenuTarget(snsId="
            r0.<init>(r1)
            java.lang.String r1 = r2.f10391a
            r0.append(r1)
            java.lang.String r1 = ", snapshot="
            r0.append(r1)
            p8.v r1 = r2.f10392b
            r0.append(r1)
            java.lang.String r1 = ", nativeInfo="
            r0.append(r1)
            java.lang.Object r1 = r2.f10393c
            r0.append(r1)
            java.lang.String r1 = ", anchorView="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r2.f10394d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
