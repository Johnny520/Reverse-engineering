package p057g;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: g.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0893b0 {

    /* JADX INFO: renamed from: a */
    public static final Field f3168a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f3168a = declaredField;
    }
}
