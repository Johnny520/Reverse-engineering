package defpackage;

/* JADX INFO: renamed from: ᛸᛵᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1497 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1371 f6594 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = defpackage.AbstractC1249.f5578
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            ᛷᛷᛳᲁ r0 = new ᛷᛷᛳᲁ     // Catch: java.lang.Throwable -> L7e
            r0.<init>()     // Catch: java.lang.Throwable -> L7e
            ᛷᛷᛳᲁ[] r0 = new defpackage.C1312[]{r0}     // Catch: java.lang.Throwable -> L7e
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7e
            ᛵᲀᛱᲈ r2 = new ᛵᲀᛱᲈ
            r3 = 2
            r2.<init>(r3, r0)
            ᛳᛶᛷᛵ r0 = new ᛳᛶᛷᛵ
            r0.<init>(r2)
            java.util.List r0 = defpackage.AbstractC0591.m1392(r0)
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
            ᛷᛷᛳᲁ r2 = (defpackage.C1312) r2
            r2.getClass()
        L4c:
            java.lang.Object r2 = r0.next()
            ᛷᛷᛳᲁ r2 = (defpackage.C1312) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L4c
        L5b:
            ᛷᛷᛳᲁ r1 = (defpackage.C1312) r1
            if (r1 == 0) goto L78
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L72
            ᛷᲁᛷᛵ r1 = new ᛷᲁᛷᛵ
            android.os.Handler r0 = defpackage.AbstractC0344.m1031(r0)
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.AbstractC1497.f6594 = r1
            return
        L72:
            java.lang.String r0 = "The main looper is not available"
            defpackage.C2264.m3676(r0)
            return
        L78:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            defpackage.C2264.m3676(r0)
            return
        L7e:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
