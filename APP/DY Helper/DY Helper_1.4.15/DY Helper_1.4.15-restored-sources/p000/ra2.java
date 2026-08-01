package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Field f9316;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f9317;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f9318;

    public ra2(java.lang.reflect.Field r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3) {
            r0 = this;
            r0.<init>()
            r0.f9316 = r1
            r0.f9317 = r2
            r0.f9318 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.ra2
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ra2 r3 = (p000.ra2) r3
            java.lang.reflect.Field r0 = r2.f9316
            java.lang.reflect.Field r1 = r3.f9316
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.reflect.Field r0 = r2.f9317
            java.lang.reflect.Field r1 = r3.f9317
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.reflect.Field r2 = r2.f9318
            java.lang.reflect.Field r3 = r3.f9318
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.reflect.Field r0 = r3.f9316
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Field r2 = r3.f9317
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Field r3 = r3.f9318
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CommentAudioEventFields(fileField="
            r0.<init>(r1)
            java.lang.reflect.Field r1 = r2.f9316
            r0.append(r1)
            java.lang.String r1 = ", durationField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f9317
            r0.append(r1)
            java.lang.String r1 = ", waveField="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f9318
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
