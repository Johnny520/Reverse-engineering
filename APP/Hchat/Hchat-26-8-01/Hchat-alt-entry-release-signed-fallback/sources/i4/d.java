package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements z4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z4.g f6452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i4.g f6453e;

    public d(int r4, int r5, int r6, z4.g r7, i4.g r8) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L52
            if (r5 < 0) goto L4b
            if (r6 <= r5) goto L44
            int r0 = r7.f22552i
            r1 = 0
        Lc:
            if (r1 >= r0) goto L30
            int r2 = r7.n(r1)
            if (r2 < 0) goto L17
            int r1 = r1 + 1
            goto Lc
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "successors["
            java.lang.String r6 = "] == "
            java.lang.StringBuilder r5 = eh.a.t(r1, r5, r6)
            int r6 = r7.n(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L30:
            if (r8 == 0) goto L3d
            r3.f6449a = r4
            r3.f6450b = r5
            r3.f6451c = r6
            r3.f6452d = r7
            r3.f6453e = r8
            return
        L3d:
            java.lang.String r4 = "catches == null"
            bsh.j.c(r4)
            r4 = 0
            throw r4
        L44:
            java.lang.String r4 = "end <= start"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L4b:
            java.lang.String r4 = "start < 0"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L52:
            java.lang.String r4 = "label < 0"
            j8.o.t(r4)
            r4 = 0
            throw r4
    }

    @Override // z4.h
    public final int a() {
            r1 = this;
            int r0 = r1.f6449a
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            int r1 = r2.f6449a
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r2.f6450b
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f6451c
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
