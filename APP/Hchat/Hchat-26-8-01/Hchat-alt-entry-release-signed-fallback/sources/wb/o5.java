package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends wb.q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.k5 f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.t5 f17999b;

    public o5(wb.k5 r1, wb.t5 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f17998a = r1
            r0.f17999b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.o5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.o5 r5 = (wb.o5) r5
            wb.k5 r1 = r4.f17998a
            wb.k5 r3 = r5.f17998a
            if (r1 == r3) goto L13
            return r2
        L13:
            wb.t5 r1 = r4.f17999b
            wb.t5 r5 = r5.f17999b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            wb.k5 r0 = r2.f17998a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.t5 r1 = r2.f17999b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contacts(filter="
            r0.<init>(r1)
            wb.k5 r1 = r2.f17998a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            wb.t5 r1 = r2.f17999b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
