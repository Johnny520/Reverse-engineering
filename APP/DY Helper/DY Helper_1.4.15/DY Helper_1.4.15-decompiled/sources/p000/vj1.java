package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 {

    /* JADX INFO: renamed from: β */
    public static final p000.vj1 f11314 = null;

    /* JADX INFO: renamed from: α */
    public final p000.C0835th f11315;

    static {
            vj1 r0 = new vj1
            th r1 = new th
            r1.<init>()
            r0.<init>(r1)
            p000.vj1.f11314 = r0
            return
    }

    public vj1(p000.C0835th r1) {
            r0 = this;
            r0.<init>()
            r0.f11315 = r1
            r0 = 0
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "current must not be NaN"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p000.vj1
            if (r1 != 0) goto L9
            goto L15
        L9:
            vj1 r3 = (p000.vj1) r3
            th r2 = r2.f11315
            th r3 = r3.f11315
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L17
        L15:
            r2 = 0
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            th r1 = r1.f11315
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ProgressBarRangeInfo(current=0.0, range="
            r0.<init>(r1)
            th r2 = r2.f11315
            r0.append(r2)
            java.lang.String r2 = ", steps=0)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
