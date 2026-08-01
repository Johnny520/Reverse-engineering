package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0685 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.List f2318 = null;

    static {
            r0 = 0
            r1 = 1
            java.lang.String r2 = "java.sql.Date"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto L35
            xhss.ᛸᲀᲁᲀ r2 = new xhss.ᛸᲀᲁᲀ
            java.lang.Class<java.sql.Date> r3 = java.sql.Date.class
            r2.<init>(r3, r0)
            xhss.ᛸᲀᲁᲀ r2 = new xhss.ᛸᲀᲁᲀ
            java.lang.Class<java.sql.Timestamp> r3 = java.sql.Timestamp.class
            r2.<init>(r3, r1)
            r2 = 3
            xhss.ᛴᛲᲀᛵ[] r2 = new xhss.InterfaceC0341[r2]
            xhss.ᛱᲁᛴᛶ$ᛷᛵᛵᲈ r3 = xhss.C0097.f453
            r2[r0] = r3
            xhss.ᛱᛵᛳᛵ$ᛷᛵᛵᲈ r0 = xhss.C0043.f283
            r2[r1] = r0
            xhss.ᲀᲇᛱᛴ r0 = xhss.C0583.f2032
            r1 = 2
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            xhss.AbstractC0685.f2318 = r0
            goto L39
        L35:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            xhss.AbstractC0685.f2318 = r0
        L39:
            return
    }
}
