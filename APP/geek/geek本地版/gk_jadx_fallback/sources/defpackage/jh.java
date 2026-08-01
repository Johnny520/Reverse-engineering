package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jh {
    public static final java.lang.reflect.Field a = null;

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
            defpackage.jh.a = r0
            return
    }
}
