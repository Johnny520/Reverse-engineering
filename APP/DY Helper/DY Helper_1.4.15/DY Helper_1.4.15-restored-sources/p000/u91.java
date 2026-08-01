package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class u91 extends p000.j02 implements android.os.Parcelable, p000.ex1, p000.c02, p000.g21 {
    public static final android.os.Parcelable.Creator<p000.u91> CREATOR = null;

    /* JADX INFO: renamed from: ζ */
    public p000.cx1 f10657;

    static {
            j r0 = new j
            r1 = 12
            r0.<init>(r1)
            p000.u91.CREATOR = r0
            return
    }

    public u91(int r5) {
            r4 = this;
            r4.<init>()
            tw1 r0 = p000.ax1.m628()
            cx1 r1 = new cx1
            long r2 = r0.mo5759()
            r1.<init>(r5, r2)
            boolean r0 = r0 instanceof p000.sa0
            if (r0 != 0) goto L1d
            cx1 r0 = new cx1
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r5, r2)
            r1.f5698 = r0
        L1d:
            r4.f10657 = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.c02
    public final java.lang.Object getValue() {
            r0 = this;
            int r0 = r0.m5837()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // p000.g21
    public final void setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.m5838(r1)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            cx1 r0 = r3.f10657
            k02 r0 = p000.ax1.m626(r0)
            cx1 r0 = (p000.cx1) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableIntState(value="
            r1.<init>(r2)
            int r0 = r0.f2795
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r0 = r0.m5837()
            r1.writeInt(r0)
            return
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: α */
    public final p000.k02 mo2200() {
            r0 = this;
            cx1 r0 = r0.f10657
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: β */
    public final p000.k02 mo2578(p000.k02 r1, p000.k02 r2, p000.k02 r3) {
            r0 = this;
            r0 = r2
            cx1 r0 = (p000.cx1) r0
            cx1 r3 = (p000.cx1) r3
            int r0 = r0.f2795
            int r1 = r3.f2795
            if (r0 != r1) goto Lc
            return r2
        Lc:
            r0 = 0
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: γ */
    public final void mo2201(p000.k02 r1) {
            r0 = this;
            r1.getClass()
            cx1 r1 = (p000.cx1) r1
            r0.f10657 = r1
            return
    }

    @Override // p000.ex1
    /* JADX INFO: renamed from: δ */
    public final p000.xn0 mo1977() {
            r0 = this;
            xn0 r0 = p000.xn0.f12220
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final int m5837() {
            r1 = this;
            cx1 r0 = r1.f10657
            k02 r1 = p000.ax1.m638(r0, r1)
            cx1 r1 = (p000.cx1) r1
            int r1 = r1.f2795
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public final void m5838(int r5) {
            r4 = this;
            cx1 r0 = r4.f10657
            k02 r0 = p000.ax1.m626(r0)
            cx1 r0 = (p000.cx1) r0
            int r1 = r0.f2795
            if (r1 == r5) goto L25
            cx1 r1 = r4.f10657
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            tw1 r3 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L22
            k02 r0 = p000.ax1.m633(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L22
            cx1 r0 = (p000.cx1) r0     // Catch: java.lang.Throwable -> L22
            r0.f2795 = r5     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            p000.ax1.m632(r3, r4)
            return
        L22:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L25:
            return
    }
}
