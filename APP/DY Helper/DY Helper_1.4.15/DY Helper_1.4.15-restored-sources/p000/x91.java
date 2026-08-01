package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x91 extends p000.j02 implements android.os.Parcelable, p000.ex1 {
    public static final android.os.Parcelable.Creator<p000.x91> CREATOR = null;

    /* JADX INFO: renamed from: ζ */
    public final p000.xn0 f12081;

    /* JADX INFO: renamed from: η */
    public p000.fx1 f12082;

    static {
            w91 r0 = new w91
            r1 = 0
            r0.<init>(r1)
            p000.x91.CREATOR = r0
            return
    }

    public x91(java.lang.Object r4, p000.xn0 r5) {
            r3 = this;
            r3.<init>()
            r3.f12081 = r5
            tw1 r5 = p000.ax1.m628()
            fx1 r0 = new fx1
            long r1 = r5.mo5759()
            r0.<init>(r1, r4)
            boolean r5 = r5 instanceof p000.sa0
            if (r5 != 0) goto L1f
            fx1 r5 = new fx1
            r1 = 1
            long r1 = (long) r1
            r5.<init>(r1, r4)
            r0.f5698 = r5
        L1f:
            r3.f12082 = r0
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
            r1 = this;
            fx1 r0 = r1.f12082
            k02 r1 = p000.ax1.m638(r0, r1)
            fx1 r1 = (p000.fx1) r1
            java.lang.Object r1 = r1.f4164
            return r1
    }

    @Override // p000.g21
    public final void setValue(java.lang.Object r5) {
            r4 = this;
            fx1 r0 = r4.f12082
            k02 r0 = p000.ax1.m626(r0)
            fx1 r0 = (p000.fx1) r0
            xn0 r1 = r4.f12081
            java.lang.Object r2 = r0.f4164
            boolean r1 = r1.m6759(r2, r5)
            if (r1 != 0) goto L2b
            fx1 r1 = r4.f12082
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            tw1 r3 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L28
            k02 r0 = p000.ax1.m633(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L28
            fx1 r0 = (p000.fx1) r0     // Catch: java.lang.Throwable -> L28
            r0.f4164 = r5     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)
            p000.ax1.m632(r3, r4)
            return
        L28:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L2b:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            fx1 r0 = r3.f12082
            k02 r0 = p000.ax1.m626(r0)
            fx1 r0 = (p000.fx1) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableState(value="
            r1.<init>(r2)
            java.lang.Object r0 = r0.f4164
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
            java.lang.Object r2 = r0.getValue()
            r1.writeValue(r2)
            xn0 r2 = p000.xn0.f12230
            xn0 r0 = r0.f12081
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L13
            r0 = 0
            goto L26
        L13:
            xn0 r2 = p000.xn0.f12220
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L1d
            r0 = 1
            goto L26
        L1d:
            xn0 r2 = p000.xn0.f12218
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L2a
            r0 = 2
        L26:
            r1.writeInt(r0)
            return
        L2a:
            java.lang.String r0 = "Only known types of MutableState's SnapshotMutationPolicy are supported"
            p000.C1080.m7279(r0)
            return
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: α */
    public final p000.k02 mo2200() {
            r0 = this;
            fx1 r0 = r0.f12082
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: β */
    public final p000.k02 mo2578(p000.k02 r1, p000.k02 r2, p000.k02 r3) {
            r0 = this;
            fx1 r1 = (p000.fx1) r1
            r1 = r2
            fx1 r1 = (p000.fx1) r1
            fx1 r3 = (p000.fx1) r3
            java.lang.Object r1 = r1.f4164
            java.lang.Object r3 = r3.f4164
            xn0 r0 = r0.f12081
            boolean r0 = r0.m6759(r1, r3)
            if (r0 == 0) goto L14
            return r2
        L14:
            r0 = 0
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: γ */
    public final void mo2201(p000.k02 r1) {
            r0 = this;
            r1.getClass()
            fx1 r1 = (p000.fx1) r1
            r0.f12082 = r1
            return
    }

    @Override // p000.ex1
    /* JADX INFO: renamed from: δ */
    public final p000.xn0 mo1977() {
            r0 = this;
            xn0 r0 = r0.f12081
            return r0
    }
}
