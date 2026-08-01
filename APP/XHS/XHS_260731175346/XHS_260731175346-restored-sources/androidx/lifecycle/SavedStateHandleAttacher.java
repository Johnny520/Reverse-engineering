package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0170 f62;

    public SavedStateHandleAttacher(xhss.C0170 r1) {
            r0 = this;
            r0.<init>()
            r0.f62 = r1
            return
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r2, xhss.EnumC1174 r3) {
            r1 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_CREATE
            if (r3 != r0) goto L38
            androidx.lifecycle.ᛷᛵᛵᲈ r2 = r2.mo63()
            r2.m29(r1)
            xhss.ᛲᛶᛱᲁ r1 = r1.f62
            boolean r2 = r1.f683
            if (r2 != 0) goto L37
            xhss.ᲇᛸᛲᲁ r2 = r1.f685
            java.lang.String r3 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r2 = r2.m1720(r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r0 = r1.f684
            if (r0 == 0) goto L25
            r3.putAll(r0)
        L25:
            if (r2 == 0) goto L2a
            r3.putAll(r2)
        L2a:
            r1.f684 = r3
            r2 = 1
            r1.f683 = r2
            xhss.ᛴᛷᛱ r1 = r1.f686
            java.lang.Object r1 = r1.m734()
            xhss.ᲀᲀᛸᛸ r1 = (xhss.C0899) r1
        L37:
            return
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Next event must be ON_CREATE, it was "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }
}
