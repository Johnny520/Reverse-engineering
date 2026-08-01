package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0918 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.InterfaceC0654 f2958 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = xhss.AbstractC0903.f2932
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L17
            xhss.ᛵᲈᛳᲀ r0 = xhss.RunnableC0528.f1929
            goto L21
        L17:
            xhss.ᛲᛱᛶᲇ r0 = xhss.AbstractC0326.f1237
            xhss.ᛵᛷᲈᛲ r0 = xhss.AbstractC0217.f799
            xhss.ᛵᛷᲈᛲ r1 = r0.f1815
            if (r0 != 0) goto L21
            xhss.ᛵᲈᛳᲀ r0 = xhss.RunnableC0528.f1929
        L21:
            xhss.AbstractC0918.f2958 = r0
            return
    }
}
