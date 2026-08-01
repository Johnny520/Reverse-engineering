package defpackage;

/* JADX INFO: renamed from: ᛵᲁᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean f4287 = false;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class f4288;

    static {
            java.lang.String r0 = "xml.stream.debug"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            defpackage.AbstractC0966.f4287 = r0     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m1913(java.lang.String r3) {
            boolean r0 = defpackage.AbstractC0966.f4287
            if (r0 == 0) goto L17
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r2 = "STREAM: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
        L17:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.Object m1914(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Provider "
            if (r3 != 0) goto Ld
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
            goto L11
        L9:
            r3 = move-exception
            goto L16
        Lb:
            r3 = move-exception
            goto L30
        Ld:
            java.lang.Class r3 = r3.loadClass(r4)     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
        L11:
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
            return r3
        L16:
            ᛵᲀᛷᛴ r1 = new ᛵᲀᛷᛴ
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = " could not be instantiated: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r3)
            throw r1
        L30:
            ᛵᲀᛷᛴ r1 = new ᛵᲀᛷᛴ
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = " not found"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r3)
            throw r1
    }
}
