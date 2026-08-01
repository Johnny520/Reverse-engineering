package defpackage;

/* JADX INFO: renamed from: ᲇᲈᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2165 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f9224;

    public /* synthetic */ C2165(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f9224 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.Throwable m3569(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.C0723
            if (r0 == 0) goto L9
            ᛴᛸᛲᲀ r1 = (defpackage.C0723) r1
            java.lang.Throwable r1 = r1.f3441
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C2165
            if (r0 != 0) goto L5
            goto L11
        L5:
            ᲇᲈᛸᛶ r2 = (defpackage.C2165) r2
            java.lang.Object r2 = r2.f9224
            java.lang.Object r1 = r1.f9224
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.f9224
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r2 = r2.f9224
            boolean r0 = r2 instanceof defpackage.C0723
            if (r0 == 0) goto Ld
            ᛴᛸᛲᲀ r2 = (defpackage.C0723) r2
            java.lang.String r2 = r2.toString()
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Success("
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
