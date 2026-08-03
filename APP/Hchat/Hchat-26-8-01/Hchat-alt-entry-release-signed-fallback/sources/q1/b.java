package q1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.KeyEvent f10597a;

    public /* synthetic */ b(android.view.KeyEvent r1) {
            r0 = this;
            r0.<init>()
            r0.f10597a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof q1.b
            if (r0 != 0) goto L5
            goto L11
        L5:
            q1.b r2 = (q1.b) r2
            android.view.KeyEvent r2 = r2.f10597a
            android.view.KeyEvent r0 = r1.f10597a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.view.KeyEvent r0 = r1.f10597a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KeyEvent(nativeKeyEvent="
            r0.<init>(r1)
            android.view.KeyEvent r1 = r2.f10597a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
