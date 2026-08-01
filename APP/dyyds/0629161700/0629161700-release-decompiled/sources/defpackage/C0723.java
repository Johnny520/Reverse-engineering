package defpackage;

/* JADX INFO: renamed from: ᛴᛸᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0723 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Throwable f3441;

    public C0723(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.f3441 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0723
            if (r0 == 0) goto L12
            ᛴᛸᛲᲀ r2 = (defpackage.C0723) r2
            java.lang.Throwable r2 = r2.f3441
            java.lang.Throwable r1 = r1.f3441
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Throwable r0 = r0.f3441
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.f3441
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
