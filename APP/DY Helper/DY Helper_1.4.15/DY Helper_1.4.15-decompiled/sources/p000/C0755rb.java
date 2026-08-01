package p000;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0755rb {

    /* JADX INFO: renamed from: α */
    public final java.util.IdentityHashMap f9319;

    /* JADX INFO: renamed from: β */
    public final java.util.IdentityHashMap f9320;

    public C0755rb() {
            r2 = this;
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r2.<init>()
            r2.f9319 = r0
            r2.f9320 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0755rb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rb r5 = (p000.C0755rb) r5
            java.util.IdentityHashMap r1 = r4.f9319
            java.util.IdentityHashMap r3 = r5.f9319
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.IdentityHashMap r4 = r4.f9320
            java.util.IdentityHashMap r5 = r5.f9320
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.IdentityHashMap r0 = r1.f9319
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.IdentityHashMap r1 = r1.f9320
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LiquidGlassNativeVisualState(tabStates="
            r0.<init>(r1)
            java.util.IdentityHashMap r1 = r2.f9319
            r0.append(r1)
            java.lang.String r1 = ", backgroundStates="
            r0.append(r1)
            java.util.IdentityHashMap r2 = r2.f9320
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
