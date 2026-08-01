package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class je0 {

    /* JADX INFO: renamed from: α */
    public final long f5438;

    /* JADX INFO: renamed from: β */
    public final long f5439;

    /* JADX INFO: renamed from: γ */
    public final float f5440;

    /* JADX INFO: renamed from: δ */
    public final long f5441;

    /* JADX INFO: renamed from: ε */
    public final long f5442;

    public je0(long r1, long r3, float r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.f5438 = r1
            r0.f5439 = r3
            r0.f5440 = r5
            r0.f5441 = r6
            r0.f5442 = r8
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HistoricalChange(uptimeMillis="
            r0.<init>(r1)
            long r1 = r3.f5438
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f5439
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.f5440
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.f5441
            java.lang.String r3 = p000.o41.m4206(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
