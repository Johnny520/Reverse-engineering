package yyds;

/* JADX INFO: renamed from: yyds.ᛸᲇᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1897 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1281 f9607 = new C1281(151);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static AbstractC0333 m3678(String str) {
        return (AbstractC0333) f9607.m2548(str);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static AbstractC0333 m3679() {
        AbstractC0333 abstractC0333M3678 = m3678("android.permission.READ_EXTERNAL_STORAGE");
        if (abstractC0333M3678 != null) {
            return abstractC0333M3678;
        }
        C1098 c1098 = new C1098();
        f9607.m2556("android.permission.READ_EXTERNAL_STORAGE", c1098);
        return c1098;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static AbstractC0333 m3680() {
        AbstractC0333 abstractC0333M3678 = m3678("android.permission.READ_MEDIA_AUDIO");
        if (abstractC0333M3678 != null) {
            return abstractC0333M3678;
        }
        C2157 c2157 = new C2157();
        f9607.m2556("android.permission.READ_MEDIA_AUDIO", c2157);
        return c2157;
    }
}
