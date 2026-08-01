package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0707 implements xhss.InterfaceC0554 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0257[] f2378;

    public C0707(xhss.C0257[] r1) {
            r0 = this;
            r0.<init>()
            r0.f2378 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeHandlersOnCancel["
            r0.<init>(r1)
            xhss.ᛳᛳᲈᲈ[] r2 = r2.f2378
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1226() {
            r3 = this;
            xhss.ᛳᛳᲈᲈ[] r3 = r3.f2378
            int r0 = r3.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L14
            r2 = r3[r1]
            xhss.ᛱᛲᲁᲇ r2 = r2.f949
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            r2.mo125()
            int r1 = r1 + 1
            goto L4
        L14:
            return
    }

    @Override // xhss.InterfaceC0554
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo928(java.lang.Throwable r1) {
            r0 = this;
            r0.m1226()
            return
    }
}
