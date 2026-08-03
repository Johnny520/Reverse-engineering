package qa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa.b f10777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10779c;

    public c(qa.b r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f10777a = r1
            r0.f10778b = r2
            r0.f10779c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof qa.c
            if (r0 != 0) goto L8
            goto L26
        L8:
            qa.c r3 = (qa.c) r3
            qa.b r0 = r2.f10777a
            qa.b r1 = r3.f10777a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f10778b
            java.lang.String r1 = r3.f10778b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f10779c
            java.lang.String r3 = r3.f10779c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            qa.b r0 = r3.f10777a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10778b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f10779c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AmountTextState(target="
            r0.<init>(r1)
            qa.b r1 = r3.f10777a
            r0.append(r1)
            java.lang.String r1 = ", original="
            r0.append(r1)
            java.lang.String r1 = r3.f10778b
            r0.append(r1)
            java.lang.String r1 = ", rendered="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f10779c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
