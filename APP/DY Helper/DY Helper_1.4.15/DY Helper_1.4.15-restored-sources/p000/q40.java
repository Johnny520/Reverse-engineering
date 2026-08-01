package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q40 {

    /* JADX INFO: renamed from: α */
    public final int f8856;

    public /* synthetic */ q40(int r1) {
            r0 = this;
            r0.<init>()
            r0.f8856 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m4765(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Next"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "Previous"
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "Left"
            return r1
        L12:
            r0 = 4
            if (r1 != r0) goto L18
            java.lang.String r1 = "Right"
            return r1
        L18:
            r0 = 5
            if (r1 != r0) goto L1e
            java.lang.String r1 = "Up"
            return r1
        L1e:
            r0 = 6
            if (r1 != r0) goto L24
            java.lang.String r1 = "Down"
            return r1
        L24:
            r0 = 7
            if (r1 != r0) goto L2a
            java.lang.String r1 = "Enter"
            return r1
        L2a:
            r0 = 8
            if (r1 != r0) goto L31
            java.lang.String r1 = "Exit"
            return r1
        L31:
            java.lang.String r1 = "Invalid FocusDirection"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.q40
            if (r0 != 0) goto L5
            goto Ld
        L5:
            q40 r2 = (p000.q40) r2
            int r2 = r2.f8856
            int r1 = r1.f8856
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f8856
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.f8856
            java.lang.String r0 = m4765(r0)
            return r0
    }
}
