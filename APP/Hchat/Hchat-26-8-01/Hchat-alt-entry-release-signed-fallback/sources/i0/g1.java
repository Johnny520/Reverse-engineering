package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends w0.v implements android.os.Parcelable, w0.n, i0.l2, i0.a1 {
    public static final android.os.Parcelable.Creator<i0.g1> CREATOR = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0.h2 f5892h;

    static {
            i0.e1 r0 = new i0.e1
            r1 = 1
            r0.<init>(r1)
            i0.g1.CREATOR = r0
            return
    }

    public g1(int r5) {
            r4 = this;
            r4.<init>()
            w0.f r0 = w0.m.j()
            i0.h2 r1 = new i0.h2
            long r2 = r0.g()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof w0.a
            if (r0 != 0) goto L1d
            i0.h2 r0 = new i0.h2
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r2, r5)
            r1.f14825b = r0
        L1d:
            r4.f5892h = r1
            return
    }

    @Override // w0.u
    public final w0.w a() {
            r1 = this;
            i0.h2 r0 = r1.f5892h
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
            i0.h2 r1 = (i0.h2) r1
            r0.f5892h = r1
            return
    }

    @Override // w0.u
    public final w0.w d(w0.w r1, w0.w r2, w0.w r3) {
            r0 = this;
            r1 = r2
            i0.h2 r1 = (i0.h2) r1
            i0.h2 r3 = (i0.h2) r3
            int r1 = r1.f5921c
            int r3 = r3.f5921c
            if (r1 != r3) goto Lc
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int g() {
            r1 = this;
            i0.h2 r0 = r1.f5892h
            w0.w r0 = w0.m.t(r0, r1)
            i0.h2 r0 = (i0.h2) r0
            int r0 = r0.f5921c
            return r0
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            int r0 = r1.g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final void h(int r5) {
            r4 = this;
            i0.h2 r0 = r4.f5892h
            w0.w r0 = w0.m.h(r0)
            i0.h2 r0 = (i0.h2) r0
            int r1 = r0.f5921c
            if (r1 == r5) goto L25
            i0.h2 r1 = r4.f5892h
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.f r3 = w0.m.j()     // Catch: java.lang.Throwable -> L22
            w0.w r0 = w0.m.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L22
            i0.h2 r0 = (i0.h2) r0     // Catch: java.lang.Throwable -> L22
            r0.f5921c = r5     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            w0.m.n(r3, r4)
            return
        L22:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L25:
            return
    }

    @Override // i0.a1
    public final void setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.h(r1)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            i0.h2 r0 = r3.f5892h
            w0.w r0 = w0.m.h(r0)
            i0.h2 r0 = (i0.h2) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableIntState(value="
            r1.<init>(r2)
            int r0 = r0.f5921c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.g()
            r1.writeInt(r2)
            return
    }
}
