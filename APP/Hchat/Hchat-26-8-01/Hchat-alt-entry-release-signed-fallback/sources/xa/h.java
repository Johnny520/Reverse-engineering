package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f21434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f21435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f21436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21437d;

    public h(java.lang.ref.WeakReference r1, java.lang.String r2, android.view.View.OnLongClickListener r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f21434a = r1
            r0.f21435b = r2
            r0.f21436c = r3
            r0.f21437d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof xa.h
            if (r0 != 0) goto L8
            goto L31
        L8:
            xa.h r3 = (xa.h) r3
            java.lang.ref.WeakReference r0 = r2.f21434a
            java.lang.ref.WeakReference r1 = r3.f21434a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f21435b
            java.lang.String r1 = r3.f21435b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            android.view.View$OnLongClickListener r0 = r2.f21436c
            android.view.View$OnLongClickListener r1 = r3.f21436c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            boolean r0 = r2.f21437d
            boolean r3 = r3.f21437d
            if (r0 == r3) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.f21434a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21435b
            int r0 = eh.a.g(r0, r1, r2)
            android.view.View$OnLongClickListener r2 = r3.f21436c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r1 = r3.f21437d
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f21434a
            java.lang.String r1 = r4.f21435b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AvatarBinding(activity="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", talker="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", originalListener="
            r2.append(r0)
            android.view.View$OnLongClickListener r0 = r4.f21436c
            r2.append(r0)
            java.lang.String r0 = ", originalLongClickable="
            r2.append(r0)
            boolean r0 = r4.f21437d
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
