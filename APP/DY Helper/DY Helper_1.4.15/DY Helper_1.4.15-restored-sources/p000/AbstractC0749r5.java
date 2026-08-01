package p000;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0749r5 {
    /* JADX INFO: renamed from: α */
    public static void m5066(android.widget.ThemedSpinnerAdapter r1, android.content.res.Resources.Theme r2) {
            android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto Ld
            r1.setDropDownViewTheme(r2)
        Ld:
            return
    }
}
