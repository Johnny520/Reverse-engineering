package p000;

/* JADX INFO: renamed from: j8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0422j8 {

    /* JADX INFO: renamed from: α */
    public final float f5357;

    /* JADX INFO: renamed from: β */
    public final float f5358;

    /* JADX INFO: renamed from: γ */
    public final float f5359;

    /* JADX INFO: renamed from: δ */
    public final int f5360;

    public C0422j8(android.window.BackEvent r5) {
            r4 = this;
            k4 r0 = p000.C0456k4.f5750
            float r1 = r0.m3159(r5)
            float r2 = r0.m3160(r5)
            float r3 = r0.m3157(r5)
            int r5 = r0.m3158(r5)
            r4.<init>()
            r4.f5357 = r1
            r4.f5358 = r2
            r4.f5359 = r3
            r4.f5360 = r5
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackEventCompat{touchX="
            r0.<init>(r1)
            float r1 = r2.f5357
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r2.f5358
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r2.f5359
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r2 = r2.f5360
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
