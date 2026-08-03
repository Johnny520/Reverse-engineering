package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f584b;

    public l(android.view.View r1, android.widget.TextView r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f583a = r1
            r0.f584b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ba.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ba.l r5 = (ba.l) r5
            android.view.View r1 = r4.f583a
            android.view.View r3 = r5.f583a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            android.widget.TextView r1 = r4.f584b
            android.widget.TextView r5 = r5.f584b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f583a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f584b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextTarget(owner="
            r0.<init>(r1)
            android.view.View r1 = r2.f583a
            r0.append(r1)
            java.lang.String r1 = ", textView="
            r0.append(r1)
            android.widget.TextView r1 = r2.f584b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
