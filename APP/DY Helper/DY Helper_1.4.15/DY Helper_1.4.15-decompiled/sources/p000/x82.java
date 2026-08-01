package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class x82 {
    /* JADX INFO: renamed from: α */
    public static java.lang.CharSequence m6519(android.view.View r0) {
            java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m6520(android.view.View r0) {
            boolean r0 = r0.isAccessibilityHeading()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m6521(android.view.View r0) {
            boolean r0 = r0.isScreenReaderFocusable()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static void m6522(android.view.View r0, java.lang.CharSequence r1) {
            r0.setAccessibilityPaneTitle(r1)
            return
    }
}
