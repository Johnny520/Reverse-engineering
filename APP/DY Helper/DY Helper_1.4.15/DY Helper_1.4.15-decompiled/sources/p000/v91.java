package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v91 extends p000.j02 implements android.os.Parcelable, p000.ex1, p000.c02, p000.g21 {
    public static final android.os.Parcelable.Creator<p000.v91> CREATOR = null;

    /* JADX INFO: renamed from: ζ */
    public p000.dx1 f11188;

    static {
            j r0 = new j
            r1 = 13
            r0.<init>(r1)
            p000.v91.CREATOR = r0
            return
    }

    public v91(long r5) {
            r4 = this;
            r4.<init>()
            tw1 r0 = p000.ax1.m628()
            dx1 r1 = new dx1
            long r2 = r0.mo5759()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof p000.sa0
            if (r0 != 0) goto L1d
            dx1 r0 = new dx1
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r2, r5)
            r1.f5698 = r0
        L1d:
            r4.f11188 = r1
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
            r2 = this;
            dx1 r0 = r2.f11188
            k02 r2 = p000.ax1.m638(r0, r2)
            dx1 r2 = (p000.dx1) r2
            long r0 = r2.f3322
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    @Override // p000.g21
    public final void setValue(java.lang.Object r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            r2.m6141(r0)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            dx1 r0 = r4.f11188
            k02 r0 = p000.ax1.m626(r0)
            dx1 r0 = (p000.dx1) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableLongState(value="
            r1.<init>(r2)
            long r2 = r0.f3322
            r1.append(r2)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r4 = r4.hashCode()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            dx1 r4 = r2.f11188
            k02 r2 = p000.ax1.m638(r4, r2)
            dx1 r2 = (p000.dx1) r2
            long r0 = r2.f3322
            r3.writeLong(r0)
            return
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: α */
    public final p000.k02 mo2200() {
            r0 = this;
            dx1 r0 = r0.f11188
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: β */
    public final p000.k02 mo2578(p000.k02 r3, p000.k02 r4, p000.k02 r5) {
            r2 = this;
            r2 = r4
            dx1 r2 = (p000.dx1) r2
            dx1 r5 = (p000.dx1) r5
            long r2 = r2.f3322
            long r0 = r5.f3322
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            return r4
        Le:
            r2 = 0
            return r2
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: γ */
    public final void mo2201(p000.k02 r1) {
            r0 = this;
            r1.getClass()
            dx1 r1 = (p000.dx1) r1
            r0.f11188 = r1
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
    public final void m6141(long r5) {
            r4 = this;
            dx1 r0 = r4.f11188
            k02 r0 = p000.ax1.m626(r0)
            dx1 r0 = (p000.dx1) r0
            long r1 = r0.f3322
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            dx1 r1 = r4.f11188
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            tw1 r3 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L24
            k02 r0 = p000.ax1.m633(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L24
            dx1 r0 = (p000.dx1) r0     // Catch: java.lang.Throwable -> L24
            r0.f3322 = r5     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            p000.ax1.m632(r3, r4)
            return
        L24:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L27:
            return
    }
}
