package p006D;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: D.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0098e0 {

    /* JADX INFO: renamed from: a */
    public static final Field f253a;

    /* JADX INFO: renamed from: b */
    public static final Field f254b;

    /* JADX INFO: renamed from: c */
    public static final Field f255c;

    /* JADX INFO: renamed from: d */
    public static final boolean f256d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f253a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f254b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f255c = declaredField3;
            declaredField3.setAccessible(true);
            f256d = true;
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
    }
}
