package p000;

/* JADX INFO: renamed from: pb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0681pb {

    /* JADX INFO: renamed from: α */
    public android.graphics.drawable.Drawable f8481;

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.C0681pb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pb r4 = (p000.C0681pb) r4
            android.graphics.drawable.Drawable r3 = r3.f8481
            android.graphics.drawable.Drawable r4 = r4.f8481
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8481
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            android.graphics.drawable.Drawable r2 = r2.f8481
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LiquidGlassNativeBackgroundState(drawable="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
