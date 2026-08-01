package p099y;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: y.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1056U {

    /* JADX INFO: renamed from: a */
    public static final Field f3670a;

    /* JADX INFO: renamed from: b */
    public static final Field f3671b;

    /* JADX INFO: renamed from: c */
    public static final Field f3672c;

    /* JADX INFO: renamed from: d */
    public static final boolean f3673d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3670a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3671b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3672c = declaredField3;
            declaredField3.setAccessible(true);
            f3673d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
