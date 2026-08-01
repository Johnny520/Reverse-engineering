package p000;

/* JADX INFO: renamed from: qw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0739qw {

    /* JADX INFO: renamed from: α */
    public static final java.lang.reflect.Field f9150 = null;

    static {
            r0 = 0
            java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
            java.lang.String r2 = "mIsChildViewEnabled"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Le
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Le
            goto L12
        Le:
            r1 = move-exception
            r1.printStackTrace()
        L12:
            p000.AbstractC0739qw.f9150 = r0
            return
    }
}
