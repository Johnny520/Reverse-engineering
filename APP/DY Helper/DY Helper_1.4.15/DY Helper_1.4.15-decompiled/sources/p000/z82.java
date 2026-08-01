package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class z82 {
    /* JADX INFO: renamed from: α */
    public static android.view.WindowInsets m7116(android.view.View r0, android.view.WindowInsets r1) {
            android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.CharSequence m7117(android.view.View r0) {
            java.lang.CharSequence r0 = r0.getStateDescription()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m7118(android.view.View r0, java.lang.CharSequence r1) {
            r0.setStateDescription(r1)
            return
    }
}
