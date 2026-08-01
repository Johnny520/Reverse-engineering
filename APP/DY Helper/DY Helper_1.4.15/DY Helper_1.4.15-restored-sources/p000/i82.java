package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i82 {

    /* JADX INFO: renamed from: α */
    public final java.lang.ref.WeakReference f4959;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f4960;

    public i82(java.lang.ref.WeakReference r1, java.lang.reflect.Method r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f4959 = r1
            r0.f4960 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.i82
            if (r0 != 0) goto L8
            goto L1f
        L8:
            i82 r3 = (p000.i82) r3
            java.lang.ref.WeakReference r0 = r2.f4959
            java.lang.ref.WeakReference r1 = r3.f4959
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.reflect.Method r2 = r2.f4960
            java.lang.reflect.Method r3 = r3.f4960
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f4959
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.f4960
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlaybackTarget(playerRef="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r2.f4959
            r0.append(r1)
            java.lang.String r1 = ", method="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f4960
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
