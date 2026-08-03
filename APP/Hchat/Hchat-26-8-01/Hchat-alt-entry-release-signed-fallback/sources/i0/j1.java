package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends w0.v implements android.os.Parcelable, w0.n {
    public static final android.os.Parcelable.Creator<i0.j1> CREATOR = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.e f5940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i0.j2 f5941i;

    static {
            i0.i1 r0 = new i0.i1
            r0.<init>()
            i0.j1.CREATOR = r0
            return
    }

    public j1(java.lang.Object r4, i0.e r5) {
            r3 = this;
            r3.<init>()
            r3.f5940h = r5
            w0.f r5 = w0.m.j()
            i0.j2 r0 = new i0.j2
            long r1 = r5.g()
            r0.<init>(r4, r1)
            boolean r5 = r5 instanceof w0.a
            if (r5 != 0) goto L1f
            i0.j2 r5 = new i0.j2
            r1 = 1
            long r1 = (long) r1
            r5.<init>(r4, r1)
            r0.f14825b = r5
        L1f:
            r3.f5941i = r0
            return
    }

    @Override // w0.u
    public final w0.w a() {
            r1 = this;
            i0.j2 r0 = r1.f5941i
            return r0
    }

    @Override // w0.n
    public final i0.e b() {
            r1 = this;
            i0.e r0 = r1.f5940h
            return r0
    }

    @Override // w0.u
    public final void c(w0.w r1) {
            r0 = this;
            r1.getClass()
            i0.j2 r1 = (i0.j2) r1
            r0.f5941i = r1
            return
    }

    @Override // w0.u
    public final w0.w d(w0.w r2, w0.w r3, w0.w r4) {
            r1 = this;
            i0.j2 r2 = (i0.j2) r2
            r2 = r3
            i0.j2 r2 = (i0.j2) r2
            i0.j2 r4 = (i0.j2) r4
            java.lang.Object r2 = r2.f5942c
            java.lang.Object r4 = r4.f5942c
            i0.e r0 = r1.f5940h
            boolean r2 = r0.b(r2, r4)
            if (r2 == 0) goto L14
            return r3
        L14:
            r2 = 0
            return r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.j2 r0 = r1.f5941i
            w0.w r0 = w0.m.t(r0, r1)
            i0.j2 r0 = (i0.j2) r0
            java.lang.Object r0 = r0.f5942c
            return r0
    }

    @Override // i0.a1
    public final void setValue(java.lang.Object r5) {
            r4 = this;
            i0.j2 r0 = r4.f5941i
            w0.w r0 = w0.m.h(r0)
            i0.j2 r0 = (i0.j2) r0
            i0.e r1 = r4.f5940h
            java.lang.Object r2 = r0.f5942c
            boolean r1 = r1.b(r2, r5)
            if (r1 != 0) goto L2b
            i0.j2 r1 = r4.f5941i
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.f r3 = w0.m.j()     // Catch: java.lang.Throwable -> L28
            w0.w r0 = w0.m.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L28
            i0.j2 r0 = (i0.j2) r0     // Catch: java.lang.Throwable -> L28
            r0.f5942c = r5     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)
            w0.m.n(r3, r4)
            return
        L28:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L2b:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            i0.j2 r0 = r3.f5941i
            w0.w r0 = w0.m.h(r0)
            i0.j2 r0 = (i0.j2) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableState(value="
            r1.<init>(r2)
            java.lang.Object r0 = r0.f5942c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.Object r3 = r1.getValue()
            r2.writeValue(r3)
            i0.e r3 = i0.e.f5867j
            i0.e r0 = r1.f5940h
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L13
            r3 = 0
            goto L26
        L13:
            i0.e r3 = i0.e.f5870m
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L1d
            r3 = 1
            goto L26
        L1d:
            i0.e r3 = i0.e.f5868k
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L2a
            r3 = 2
        L26:
            r2.writeInt(r3)
            return
        L2a:
            java.lang.String r2 = "Only known types of MutableState's SnapshotMutationPolicy are supported"
            j8.o.A(r2)
            return
    }
}
