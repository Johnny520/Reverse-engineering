package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲁᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1088 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0554 f3512;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f3513;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object f3514;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Throwable f3515;

    public C1088(java.lang.Object r1, xhss.InterfaceC0554 r2, java.lang.Object r3, java.lang.Throwable r4) {
            r0 = this;
            r0.<init>()
            r0.f3514 = r1
            r0.f3512 = r2
            r0.f3513 = r3
            r0.f3515 = r4
            return
    }

    public /* synthetic */ C1088(java.lang.Object r3, xhss.InterfaceC0554 r4, java.util.concurrent.CancellationException r5, int r6) {
            r2 = this;
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 16
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            r2.<init>(r3, r4, r1, r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C1088 m1774(xhss.C1088 r2, xhss.InterfaceC0554 r3, java.util.concurrent.CancellationException r4, int r5) {
            java.lang.Object r0 = r2.f3514
            r1 = r5 & 2
            if (r1 == 0) goto L8
            xhss.ᛶᛳᲁᲈ r3 = r2.f3512
        L8:
            java.lang.Object r1 = r2.f3513
            r5 = r5 & 16
            if (r5 == 0) goto L10
            java.lang.Throwable r4 = r2.f3515
        L10:
            xhss.ᲇᲁᛲᛳ r2 = new xhss.ᲇᲁᛲᛳ
            r2.<init>(r0, r3, r1, r4)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C1088
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᲇᲁᛲᛳ r5 = (xhss.C1088) r5
            java.lang.Object r1 = r4.f3514
            java.lang.Object r3 = r5.f3514
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            xhss.ᛶᛳᲁᲈ r1 = r4.f3512
            xhss.ᛶᛳᲁᲈ r3 = r5.f3512
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object r1 = r4.f3513
            java.lang.Object r3 = r5.f3513
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Throwable r4 = r4.f3515
            java.lang.Throwable r5 = r5.f3515
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f3514
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            xhss.ᛶᛳᲁᲈ r2 = r3.f3512
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 961
            java.lang.Object r2 = r3.f3513
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r3 = r3.f3515
            if (r3 != 0) goto L2c
            goto L30
        L2c:
            int r0 = r3.hashCode()
        L30:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f3514
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            xhss.ᛶᛳᲁᲈ r1 = r2.f3512
            r0.append(r1)
            java.lang.String r1 = ", onCancellation=null, idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f3513
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f3515
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
