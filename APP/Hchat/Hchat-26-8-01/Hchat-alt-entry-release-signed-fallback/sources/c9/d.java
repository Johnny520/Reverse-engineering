package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f1125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.o2 f1126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.l f1127c;

    public d(java.lang.ref.WeakReference r1, c9.o2 r2, fg.l r3) {
            r0 = this;
            r0.<init>()
            r0.f1125a = r1
            r0.f1126b = r2
            r0.f1127c = r3
            return
    }

    public final void a(c9.p2 r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.f1125a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L13
            ac.l r1 = new ac.l
            r2 = 2
            r1.<init>(r0, r3, r4, r2)
            r0.runOnUiThread(r1)
        L13:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof c9.d
            if (r0 != 0) goto L8
            goto L2a
        L8:
            c9.d r3 = (c9.d) r3
            java.lang.ref.WeakReference r0 = r2.f1125a
            java.lang.ref.WeakReference r1 = r3.f1125a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            c9.o2 r0 = r2.f1126b
            c9.o2 r1 = r3.f1126b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            fg.l r0 = r2.f1127c
            fg.l r3 = r3.f1127c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.f1125a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            c9.o2 r1 = r2.f1126b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            fg.l r0 = r2.f1127c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pending(activity="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r2.f1125a
            r0.append(r1)
            java.lang.String r1 = ", operation="
            r0.append(r1)
            c9.o2 r1 = r2.f1126b
            r0.append(r1)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            fg.l r1 = r2.f1127c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
