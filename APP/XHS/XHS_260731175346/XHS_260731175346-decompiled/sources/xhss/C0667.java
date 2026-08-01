package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛶᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0667 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public float f2276;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public float f2277;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f2278;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1147(xhss.C0523 r3, xhss.C0158 r4) {
            r2 = this;
            if (r3 == 0) goto L28
            if (r4 == 0) goto L28
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.f655
            if (r0 == 0) goto L28
            xhss.ᛵᛳᛶᛷ r1 = r4.f653
            if (r1 != 0) goto Ld
            goto L28
        Ld:
            boolean r1 = r3.m934()
            if (r1 == 0) goto L1c
            xhss.ᛳᛸᛴ r1 = new xhss.ᛳᛸᛴ
            r1.<init>(r2, r3, r4, r0)
            r0.setOnTouchListener(r1)
            return
        L1c:
            xhss.ᛵᛳᛶᛷ r2 = r4.f653
            if (r2 == 0) goto L24
            r3 = 0
            r2.mo66(r3)
        L24:
            r2 = 0
            r0.setOnTouchListener(r2)
        L28:
            return
    }
}
