package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f576f;

    public j(android.graphics.drawable.Drawable r1, int r2, int r3, int r4, int r5, java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.f571a = r1
            r0.f572b = r2
            r0.f573c = r3
            r0.f574d = r4
            r0.f575e = r5
            r0.f576f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof ba.j
            if (r0 != 0) goto L8
            goto L3b
        L8:
            ba.j r3 = (ba.j) r3
            android.graphics.drawable.Drawable r0 = r2.f571a
            android.graphics.drawable.Drawable r1 = r3.f571a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L3b
        L15:
            int r0 = r2.f572b
            int r1 = r3.f572b
            if (r0 == r1) goto L1c
            goto L3b
        L1c:
            int r0 = r2.f573c
            int r1 = r3.f573c
            if (r0 == r1) goto L23
            goto L3b
        L23:
            int r0 = r2.f574d
            int r1 = r3.f574d
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            int r0 = r2.f575e
            int r1 = r3.f575e
            if (r0 == r1) goto L31
            goto L3b
        L31:
            java.lang.Object r0 = r2.f576f
            java.lang.Object r3 = r3.f576f
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3d
        L3b:
            r3 = 0
            return r3
        L3d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f571a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f572b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f573c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f574d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f575e
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.Object r1 = r3.f576f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OriginalState(background="
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r5.f571a
            r0.append(r1)
            java.lang.String r1 = ", paddingLeft="
            r0.append(r1)
            int r1 = r5.f572b
            r0.append(r1)
            java.lang.String r1 = ", paddingTop="
            r0.append(r1)
            java.lang.String r1 = ", paddingRight="
            java.lang.String r2 = ", paddingBottom="
            int r3 = r5.f573c
            int r4 = r5.f574d
            wb.en.p(r0, r3, r1, r4, r2)
            int r1 = r5.f575e
            r0.append(r1)
            java.lang.String r1 = ", textColorStates="
            r0.append(r1)
            java.lang.Object r1 = r5.f576f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
