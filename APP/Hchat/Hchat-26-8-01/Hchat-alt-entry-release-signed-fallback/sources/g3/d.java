package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f4194a;

    public d(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.f4194a = r1
            return
    }

    public final b3.a a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r0 = r2.f4194a
            android.graphics.Insets r0 = b2.b.b(r0)
            b3.a r0 = b3.a.c(r0)
            return r0
        L11:
            b3.a r0 = b3.a.f444e
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<g3.d> r0 = g3.d.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            g3.d r3 = (g3.d) r3
            android.view.DisplayCutout r0 = r2.f4194a
            android.view.DisplayCutout r3 = r3.f4194a
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.f4194a
            int r0 = b0.b0.D(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r1 = r2.f4194a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
