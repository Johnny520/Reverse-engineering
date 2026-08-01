package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0217 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0499 f799 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = xhss.AbstractC0903.f2932
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            xhss.ᲈᲁᲈᛵ r0 = new xhss.ᲈᲁᲈᛵ     // Catch: java.lang.Throwable -> L7e
            r0.<init>()     // Catch: java.lang.Throwable -> L7e
            xhss.ᲈᲁᲈᛵ[] r0 = new xhss.C1190[]{r0}     // Catch: java.lang.Throwable -> L7e
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7e
            xhss.ᲈᛱᛱᲀ r2 = new xhss.ᲈᛱᛱᲀ
            r3 = 3
            r2.<init>(r3, r0)
            xhss.ᛸᲀᛶᛳ r0 = new xhss.ᛸᲀᛶᛳ
            r0.<init>(r2)
            java.util.List r0 = xhss.AbstractC0646.m1132(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L3b
            goto L5b
        L3b:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L46
            goto L5b
        L46:
            r2 = r1
            xhss.ᲈᲁᲈᛵ r2 = (xhss.C1190) r2
            r2.getClass()
        L4c:
            java.lang.Object r2 = r0.next()
            xhss.ᲈᲁᲈᛵ r2 = (xhss.C1190) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L4c
        L5b:
            xhss.ᲈᲁᲈᛵ r1 = (xhss.C1190) r1
            if (r1 == 0) goto L78
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L72
            xhss.ᛵᛷᲈᛲ r1 = new xhss.ᛵᛷᲈᛲ
            android.os.Handler r0 = xhss.AbstractC0550.m978(r0)
            r2 = 0
            r1.<init>(r0, r2)
            xhss.AbstractC0217.f799 = r1
            return
        L72:
            java.lang.String r0 = "The main looper is not available"
            xhss.C0532.m950(r0)
            return
        L78:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            xhss.C0532.m950(r0)
            return
        L7e:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
