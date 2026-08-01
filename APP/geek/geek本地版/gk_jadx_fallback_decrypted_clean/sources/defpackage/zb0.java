package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 {
    public final android.view.WindowId a;

    public zb0(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            android.view.WindowId r1 = r1.getWindowId()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.zb0
            if (r0 == 0) goto L12
            zb0 r2 = (defpackage.zb0) r2
            android.view.WindowId r2 = r2.a
            android.view.WindowId r0 = r1.a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.view.WindowId r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }
}
