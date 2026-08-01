package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1599 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.reflect.Field f7053 = null;

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
            defpackage.AbstractC1599.f7053 = r0
            return
    }
}
