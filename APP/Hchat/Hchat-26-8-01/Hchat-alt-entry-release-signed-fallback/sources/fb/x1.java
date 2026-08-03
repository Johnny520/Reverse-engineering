package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3851c;

    public x1(java.lang.Integer r1, java.util.ArrayList r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f3849a = r1
            r0.f3850b = r2
            r0.f3851c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof fb.x1
            if (r0 != 0) goto L8
            goto L26
        L8:
            fb.x1 r3 = (fb.x1) r3
            java.lang.Integer r0 = r2.f3849a
            java.lang.Integer r1 = r3.f3849a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.util.ArrayList r0 = r2.f3850b
            java.util.ArrayList r1 = r3.f3850b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f3851c
            boolean r3 = r3.f3851c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Integer r0 = r2.f3849a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f3850b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f3851c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Hunk(oldStart="
            r0.<init>(r1)
            java.lang.Integer r1 = r3.f3849a
            r0.append(r1)
            java.lang.String r1 = ", lines="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f3850b
            r0.append(r1)
            java.lang.String r1 = ", endOfFile="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f3851c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
