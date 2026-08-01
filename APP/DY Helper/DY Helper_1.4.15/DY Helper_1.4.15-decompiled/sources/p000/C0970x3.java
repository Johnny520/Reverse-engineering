package p000;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0970x3 implements p000.c02 {

    /* JADX INFO: renamed from: ε */
    public final p000.g62 f12019;

    /* JADX INFO: renamed from: ζ */
    public final p000.x91 f12020;

    /* JADX INFO: renamed from: η */
    public p000.AbstractC0100c4 f12021;

    /* JADX INFO: renamed from: θ */
    public long f12022;

    /* JADX INFO: renamed from: ι */
    public long f12023;

    /* JADX INFO: renamed from: κ */
    public boolean f12024;

    public C0970x3(p000.g62 r2, java.lang.Object r3, p000.AbstractC0100c4 r4, long r5, long r7, boolean r9) {
            r1 = this;
            r1.<init>()
            r1.f12019 = r2
            x91 r0 = p000.j81.m2882(r3)
            r1.f12020 = r0
            if (r4 == 0) goto L12
            c4 r2 = p000.AbstractC1021yh.m6891(r4)
            goto L1d
        L12:
            a80 r2 = r2.f4262
            java.lang.Object r2 = r2.invoke(r3)
            c4 r2 = (p000.AbstractC0100c4) r2
            r2.mo30()
        L1d:
            r1.f12021 = r2
            r1.f12022 = r5
            r1.f12023 = r7
            r1.f12024 = r9
            return
    }

    @Override // p000.c02
    public final java.lang.Object getValue() {
            r0 = this;
            x91 r0 = r0.f12020
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationState(value="
            r0.<init>(r1)
            x91 r1 = r3.f12020
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", velocity="
            r0.append(r1)
            g62 r1 = r3.f12019
            a80 r1 = r1.f4263
            c4 r2 = r3.f12021
            java.lang.Object r1 = r1.invoke(r2)
            r0.append(r1)
            java.lang.String r1 = ", isRunning="
            r0.append(r1)
            boolean r1 = r3.f12024
            r0.append(r1)
            java.lang.String r1 = ", lastFrameTimeNanos="
            r0.append(r1)
            long r1 = r3.f12022
            r0.append(r1)
            java.lang.String r1 = ", finishedTimeNanos="
            r0.append(r1)
            long r1 = r3.f12023
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
