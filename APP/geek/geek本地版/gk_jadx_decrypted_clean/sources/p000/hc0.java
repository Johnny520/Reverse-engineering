package p000;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc0 {

    /* JADX INFO: renamed from: a */
    public static final Field f2269a;

    /* JADX INFO: renamed from: b */
    public static final Field f2270b;

    /* JADX INFO: renamed from: c */
    public static final Field f2271c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2272d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2269a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2270b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2271c = declaredField3;
            declaredField3.setAccessible(true);
            f2272d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
