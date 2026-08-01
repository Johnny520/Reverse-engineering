package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛳᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0457 extends xhss.AbstractC0831 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.content.Context f1634;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f1635;

    public C0457() {
            r6 = this;
            r6.<init>()
            xhss.ᛲᲀᲇᛳ r0 = new xhss.ᛲᲀᲇᛳ
            r0.<init>()
            xhss.ᲁᛷᛲᲁ r1 = new xhss.ᲁᛷᛲᲁ
            xhss.ᛳᛴᲀᲁ r2 = xhss.C1115.f3594
            r1.<init>(r2)
            xhss.ᲁᛷᛲᲁ r2 = new xhss.ᲁᛷᛲᲁ
            xhss.ᲁᲀᲇᛶ r3 = xhss.C0746.f2500
            r2.<init>(r3)
            xhss.ᲁᛷᛲᲁ r3 = new xhss.ᲁᛷᛲᲁ
            xhss.ᲀᛵᛷᛵ r4 = xhss.C0859.f2776
            r3.<init>(r4)
            r4 = 4
            xhss.ᲈᲀᛳᲇ[] r4 = new xhss.InterfaceC1173[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.ArrayList r0 = xhss.AbstractC0193.m449(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            r3 = r2
            xhss.ᲈᲀᛳᲇ r3 = (xhss.InterfaceC1173) r3
            boolean r3 = r3.mo468()
            if (r3 == 0) goto L39
            r1.add(r2)
            goto L39
        L50:
            r6.f1635 = r1
            return
    }
}
