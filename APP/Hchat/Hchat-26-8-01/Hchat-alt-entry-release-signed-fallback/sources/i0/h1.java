package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends w0.v implements android.os.Parcelable, w0.n, i0.l2, i0.a1 {
    public static final android.os.Parcelable.Creator<i0.h1> CREATOR = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0.i2 f5920h;

    static {
            i0.e1 r0 = new i0.e1
            r1 = 2
            r0.<init>(r1)
            i0.h1.CREATOR = r0
            return
    }

    public h1(long r5) {
            r4 = this;
            r4.<init>()
            w0.f r0 = w0.m.j()
            i0.i2 r1 = new i0.i2
            long r2 = r0.g()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof w0.a
            if (r0 != 0) goto L1d
            i0.i2 r0 = new i0.i2
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r2, r5)
            r1.f14825b = r0
        L1d:
            r4.f5920h = r1
            return
    }

    @Override // w0.u
    public final w0.w a() {
            r1 = this;
            i0.i2 r0 = r1.f5920h
            return r0
    }

    @Override // w0.n
    public final i0.e b() {
            r1 = this;
            i0.e r0 = i0.e.f5870m
            return r0
    }

    @Override // w0.u
    public final void c(w0.w r1) {
            r0 = this;
            r1.getClass()
            i0.i2 r1 = (i0.i2) r1
            r0.f5920h = r1
            return
    }

    @Override // w0.u
    public final w0.w d(w0.w r5, w0.w r6, w0.w r7) {
            r4 = this;
            r5 = r6
            i0.i2 r5 = (i0.i2) r5
            i0.i2 r7 = (i0.i2) r7
            long r0 = r5.f5929c
            long r2 = r7.f5929c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r6
        Le:
            r5 = 0
            return r5
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final long g() {
            r2 = this;
            i0.i2 r0 = r2.f5920h
            w0.w r0 = w0.m.t(r0, r2)
            i0.i2 r0 = (i0.i2) r0
            long r0 = r0.f5929c
            return r0
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r2 = this;
            long r0 = r2.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public final void h(long r5) {
            r4 = this;
            i0.i2 r0 = r4.f5920h
            w0.w r0 = w0.m.h(r0)
            i0.i2 r0 = (i0.i2) r0
            long r1 = r0.f5929c
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            i0.i2 r1 = r4.f5920h
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.f r3 = w0.m.j()     // Catch: java.lang.Throwable -> L24
            w0.w r0 = w0.m.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L24
            i0.i2 r0 = (i0.i2) r0     // Catch: java.lang.Throwable -> L24
            r0.f5929c = r5     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            w0.m.n(r3, r4)
            return
        L24:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L27:
            return
    }

    @Override // i0.a1
    public final void setValue(java.lang.Object r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            r2.h(r0)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            i0.i2 r0 = r4.f5920h
            w0.w r0 = w0.m.h(r0)
            i0.i2 r0 = (i0.i2) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableLongState(value="
            r1.<init>(r2)
            long r2 = r0.f5929c
            r1.append(r2)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r0 = r4.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.g()
            r3.writeLong(r0)
            return
    }
}
