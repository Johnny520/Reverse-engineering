package p000;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0822t4 {
    /* JADX INFO: renamed from: α */
    public static android.os.LocaleList m5604(java.lang.Object r0) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            android.os.LocaleList r0 = r0.getApplicationLocales()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m5605(java.lang.Object r0, android.os.LocaleList r1) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            r0.setApplicationLocales(r1)
            return
    }
}
