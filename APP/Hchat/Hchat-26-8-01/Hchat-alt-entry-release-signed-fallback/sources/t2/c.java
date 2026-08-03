package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12997a;

    public c(long r3) {
            r2 = this;
            r2.<init>()
            r2.f12997a = r3
            r0 = 16
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto Lc
            return
        Lc:
            java.lang.String r3 = "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead."
            o2.a.a(r3)
            return
    }

    @Override // t2.o
    public final float a() {
            r2 = this;
            long r0 = r2.f12997a
            float r0 = f1.w.d(r0)
            return r0
    }

    @Override // t2.o
    public final long b() {
            r2 = this;
            long r0 = r2.f12997a
            return r0
    }

    @Override // t2.o
    public final f1.s c() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof t2.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.c r8 = (t2.c) r8
            long r3 = r7.f12997a
            long r5 = r8.f12997a
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = r2.f12997a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColorStyle(value="
            r0.<init>(r1)
            long r1 = r3.f12997a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
