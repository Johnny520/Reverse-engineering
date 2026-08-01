package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p10 {

    /* JADX INFO: renamed from: α */
    public final p000.o10 f8380;

    /* JADX INFO: renamed from: β */
    public final java.lang.ref.WeakReference f8381;

    /* JADX INFO: renamed from: γ */
    public final java.lang.ref.WeakReference f8382;

    public p10(p000.o10 r1, java.lang.ref.WeakReference r2, java.lang.ref.WeakReference r3) {
            r0 = this;
            r0.<init>()
            r0.f8380 = r1
            r0.f8381 = r2
            r0.f8382 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.p10
            if (r0 != 0) goto L8
            goto L26
        L8:
            p10 r3 = (p000.p10) r3
            o10 r0 = r2.f8380
            o10 r1 = r3.f8380
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.ref.WeakReference r0 = r2.f8381
            java.lang.ref.WeakReference r1 = r3.f8381
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.ref.WeakReference r2 = r2.f8382
            java.lang.ref.WeakReference r3 = r3.f8382
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            o10 r0 = r2.f8380
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.ref.WeakReference r1 = r2.f8381
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.ref.WeakReference r2 = r2.f8382
            if (r2 != 0) goto L17
            r2 = 0
            goto L1b
        L17:
            int r2 = r2.hashCode()
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TargetBinding(action="
            r0.<init>(r1)
            o10 r1 = r2.f8380
            r0.append(r1)
            java.lang.String r1 = ", rootRef="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r2.f8381
            r0.append(r1)
            java.lang.String r1 = ", listenerRef="
            r0.append(r1)
            java.lang.ref.WeakReference r2 = r2.f8382
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
