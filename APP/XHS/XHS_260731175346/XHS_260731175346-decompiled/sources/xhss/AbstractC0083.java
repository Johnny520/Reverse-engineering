package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲀᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0083 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.InterfaceC1007 f428 = null;

    static {
            xhss.ᲈᛴᲈᛱ r0 = xhss.C1138.f3665
            xhss.ᲇᛱᲈᛱ r1 = r0.f3666
            if (r1 != 0) goto L21
            xhss.ᛷᛱᛳᲁ r2 = new xhss.ᛷᛱᛳᲁ
            r1 = 7
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = xhss.C1138.f3664
        Le:
            r1 = 0
            boolean r1 = r3.compareAndSet(r0, r1, r2)
            if (r1 == 0) goto L17
            r1 = r2
            goto L21
        L17:
            java.lang.Object r1 = r3.get(r0)
            if (r1 == 0) goto Le
            xhss.ᲈᛴᲈᛱ r0 = xhss.C1138.f3665
            xhss.ᲇᛱᲈᛱ r1 = r0.f3666
        L21:
            xhss.AbstractC0083.f428 = r1
            return
    }
}
