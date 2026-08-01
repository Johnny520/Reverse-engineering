package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0649 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f3171 = 0;

    static {
            r0 = 30
            android.os.ext.SdkExtensions.getExtensionVersion(r0)
            r0 = 31
            android.os.ext.SdkExtensions.getExtensionVersion(r0)
            r0 = 33
            android.os.ext.SdkExtensions.getExtensionVersion(r0)
            r0 = 1000000(0xf4240, float:1.401298E-39)
            android.os.ext.SdkExtensions.getExtensionVersion(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean m1482() {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L60
            r3 = 32
            if (r2 < r3) goto L5f
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "REL"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L1a
            goto L5f
        L1a:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = r2.toUpperCase(r3)
            java.lang.String r5 = "BAKLAVA"
            boolean r4 = r4.equals(r5)
            r6 = 0
            if (r4 == 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r6
        L2c:
            java.lang.String r7 = "Tiramisu"
            java.lang.String r8 = r7.toUpperCase(r3)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L39
            goto L3a
        L39:
            r1 = r6
        L3a:
            if (r4 == 0) goto L49
            if (r1 == 0) goto L49
            int r2 = r4.intValue()
            int r1 = r1.intValue()
            if (r2 < r1) goto L5f
            goto L60
        L49:
            if (r4 != 0) goto L5c
            if (r1 != 0) goto L5c
            java.lang.String r1 = r2.toUpperCase(r3)
            java.lang.String r2 = r7.toUpperCase(r3)
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L5f
            goto L60
        L5c:
            if (r4 == 0) goto L5f
            goto L60
        L5f:
            return r0
        L60:
            r0 = 1
            return r0
    }
}
