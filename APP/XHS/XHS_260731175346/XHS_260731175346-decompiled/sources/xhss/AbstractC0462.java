package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛳᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0462 {
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m836(android.view.View r1, xhss.InterfaceC0725 r2) {
            if (r2 == 0) goto L8
            xhss.ᛲᲀᛳᲇ r0 = new xhss.ᛲᲀᛳᲇ
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r2 = 1678246144(0x64080100, float:1.0035317E22)
            java.lang.Object r2 = r1.getTag(r2)
            if (r2 == 0) goto L13
            return
        L13:
            if (r0 == 0) goto L19
            r1.setOnApplyWindowInsetsListener(r0)
            return
        L19:
            r2 = 1678246160(0x64080110, float:1.0035335E22)
            java.lang.Object r2 = r1.getTag(r2)
            android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
            r1.setOnApplyWindowInsetsListener(r2)
            return
    }
}
