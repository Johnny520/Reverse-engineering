package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0164 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.InterfaceC1925 f1140 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = defpackage.AbstractC1249.f5578
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
            ᲀᲁᲁᛳ r0 = defpackage.RunnableC1761.f7778
            goto L21
        L17:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛷᲁᛷᛵ r1 = r0.f5999
            if (r0 != 0) goto L21
            ᲀᲁᲁᛳ r0 = defpackage.RunnableC1761.f7778
        L21:
            defpackage.AbstractC0164.f1140 = r0
            return
    }
}
