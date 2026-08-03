package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b8.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f507i;

    @Override // b8.j
    public final b8.j c() {
            r1 = this;
            b8.j r0 = r1.f518g
            b8.f r0 = (b8.f) r0
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof b8.d
            r2 = 0
            if (r1 == 0) goto L1c
            b8.d r4 = (b8.d) r4
            java.lang.String r1 = r3.f506h
            java.lang.String r4 = r4.f506h
            if (r1 != r4) goto L12
            return r0
        L12:
            if (r1 == 0) goto L1c
            if (r4 != 0) goto L17
            goto L1c
        L17:
            boolean r4 = r1.equals(r4)
            return r4
        L1c:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f506h
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    @Override // b8.j
    public final void k(java.io.StringWriter r3, boolean r4) {
            r2 = this;
            r0 = 1
            java.lang.String r0 = r2.m(r0)
            r3.append(r0)
            r0 = 61
            r3.append(r0)
            r0 = 34
            if (r4 == 0) goto L14
            r3.append(r0)
        L14:
            java.lang.String r1 = r2.n()
            r3.append(r1)
            if (r4 == 0) goto L20
            r3.append(r0)
        L20:
            return
    }

    public final java.lang.String m(boolean r3) {
            r2 = this;
            java.lang.String r3 = r2.f506h
            if (r3 != 0) goto L5
            return r3
        L5:
            r0 = 58
            int r0 = r3.indexOf(r0)
            if (r0 <= 0) goto L13
            r1 = 0
            java.lang.String r0 = r3.substring(r1, r0)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1c
            java.lang.String r1 = ":"
            java.lang.String r3 = wb.en.h(r0, r1, r3)
        L1c:
            return r3
    }

    public final java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.f507i
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
            r1.f507i = r0
        L8:
            return r0
    }

    public final void o(b5.c r4) {
            r3 = this;
            java.lang.String r0 = r3.f506h
            java.lang.String r1 = r3.n()
            java.lang.Object r4 = r4.f470b
            b8.f r4 = (b8.f) r4
            b8.d r2 = new b8.d
            r2.<init>()
            r4.p(r2)
            r2.f506h = r0
            r2.f507i = r1
            b8.j r4 = r2.f518g
            b8.f r4 = (b8.f) r4
            if (r4 == 0) goto L1d
            return
        L1d:
            java.lang.String r4 = "Parent element is null"
            j8.o.t(r4)
            return
    }

    @Override // b8.j
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            java.lang.String r1 = r2.m(r1)
            r0.append(r1)
            java.lang.String r1 = "=\""
            r0.append(r1)
            java.lang.String r1 = r2.n()
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
