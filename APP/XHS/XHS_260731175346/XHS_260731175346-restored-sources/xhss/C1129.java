package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1129 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Throwable f3646;

    public C1129(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.f3646 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C1129
            if (r0 == 0) goto L12
            xhss.ᲈᛳᛱᲇ r2 = (xhss.C1129) r2
            java.lang.Throwable r2 = r2.f3646
            java.lang.Throwable r1 = r1.f3646
            boolean r1 = xhss.AbstractC0007.m97(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Throwable r0 = r0.f3646
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.f3646
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
