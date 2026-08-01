package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1133 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0669 f3657;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0274 f3658;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0323 f3659;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f3660;

    public AbstractC1133(xhss.C0323 r1, xhss.C0669 r2) {
            r0 = this;
            r0.<init>()
            r0.f3659 = r1
            r0.f3657 = r2
            xhss.ᛳᛵᛸᲁ r2 = new xhss.ᛳᛵᛸᲁ
            xhss.ᛷᛱᛳᲁ r1 = r1.f1233
            java.lang.Object r1 = r1.f2153
            xhss.ᲁᛸᛵᛳ r1 = (xhss.C0976) r1
            xhss.ᲇᲁᲀᲇ r1 = r1.f3177
            xhss.ᛲᲁᲈᛲ r1 = r1.mo250()
            r2.<init>()
            r2.f1037 = r1
            r0.f3658 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1826(xhss.C0972 r6) {
            r5 = this;
            xhss.ᛳᲇᲁᲈ r0 = r5.f3659
            int r1 = r0.f1236
            r2 = 6
            if (r1 != r2) goto L8
            goto L2e
        L8:
            r3 = 5
            if (r1 != r3) goto L2f
            xhss.ᛳᛵᛸᲁ r1 = r5.f3658
            xhss.ᛲᲁᲈᛲ r3 = r1.f1037
            xhss.ᛳᲁᲁᛲ r4 = xhss.C0213.f787
            r1.f1037 = r4
            r3.mo480()
            r3.mo477()
            r0.f1236 = r2
            int r1 = r6.size()
            if (r1 <= 0) goto L2e
            xhss.ᛵᛸᛷᛲ r0 = r0.f1235
            if (r0 == 0) goto L2e
            xhss.ᛳᛴᲀᲁ r0 = r0.f1847
            if (r0 == 0) goto L2e
            xhss.ᛷᛶᲁᛵ r5 = r5.f3657
            xhss.AbstractC1109.m1805(r0, r5, r6)
        L2e:
            return
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r0.f1236
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᛳᛵᛸᲁ r0 = r0.f3658
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public long mo235(long r3, xhss.C0338 r5) {
            r2 = this;
            xhss.ᛳᲇᲁᲈ r0 = r2.f3659
            xhss.ᛷᛱᛳᲁ r1 = r0.f1233     // Catch: java.io.IOException -> Ld
            java.lang.Object r1 = r1.f2153     // Catch: java.io.IOException -> Ld
            xhss.ᲁᛸᛵᛳ r1 = (xhss.C0976) r1     // Catch: java.io.IOException -> Ld
            long r2 = r1.mo235(r3, r5)     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r3 = move-exception
            xhss.ᲀᲀᲁᛱ r4 = r0.f1232
            r4.mo593()
            xhss.ᲁᛸᛱᛵ r4 = xhss.C0323.f1231
            r2.m1826(r4)
            throw r3
    }
}
