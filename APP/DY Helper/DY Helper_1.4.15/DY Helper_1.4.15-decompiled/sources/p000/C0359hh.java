package p000;

/* JADX INFO: renamed from: hh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0359hh {

    /* JADX INFO: renamed from: α */
    public final java.lang.ref.WeakReference f4731;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f4732;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f4733;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f4734;

    public C0359hh(java.lang.ref.WeakReference r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r0 = this;
            r0.<init>()
            r0.f4731 = r1
            r0.f4732 = r2
            r0.f4733 = r3
            r0.f4734 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.C0359hh
            if (r0 != 0) goto L8
            goto L35
        L8:
            hh r3 = (p000.C0359hh) r3
            java.lang.ref.WeakReference r0 = r2.f4731
            java.lang.ref.WeakReference r1 = r3.f4731
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.reflect.Method r0 = r2.f4732
            java.lang.reflect.Method r1 = r3.f4732
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.reflect.Method r0 = r2.f4733
            java.lang.reflect.Method r1 = r3.f4733
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.reflect.Method r2 = r2.f4734
            java.lang.reflect.Method r3 = r3.f4734
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.f4731
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r3.f4732
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            java.lang.reflect.Method r2 = r3.f4733
            if (r2 != 0) goto L18
            r2 = r0
            goto L1c
        L18:
            int r2 = r2.hashCode()
        L1c:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r3 = r3.f4734
            if (r3 != 0) goto L24
            goto L28
        L24:
            int r0 = r3.hashCode()
        L28:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CurrentWrapperProbe(wrapperRef="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r2.f4731
            r0.append(r1)
            java.lang.String r1 = ", isPlayingMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f4732
            r0.append(r1)
            java.lang.String r1 = ", currentPositionMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f4733
            r0.append(r1)
            java.lang.String r1 = ", durationMethod="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f4734
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
