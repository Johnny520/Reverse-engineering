package q9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10770c;

    public h(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f10768a = r1
            r0.f10769b = r2
            r0.f10770c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof q9.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q9.h r5 = (q9.h) r5
            java.lang.String r1 = r4.f10768a
            java.lang.String r3 = r5.f10768a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f10769b
            java.lang.String r3 = r5.f10769b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f10770c
            java.lang.String r5 = r5.f10770c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10768a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10769b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f10770c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", templateId="
            java.lang.String r2 = "GroupRenameTemplateBinding(groupId="
            java.lang.String r3 = r5.f10768a
            java.lang.String r4 = r5.f10769b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f10770c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
