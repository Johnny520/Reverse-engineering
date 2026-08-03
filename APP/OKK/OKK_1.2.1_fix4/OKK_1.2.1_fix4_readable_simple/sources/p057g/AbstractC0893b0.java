package p057g;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: g.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0893b0 {

    /* JADX INFO: renamed from: a */
    public static final Field f3168a = null;

    static {
        Field r02 = null;
        r02 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
        r02.setAccessible(true);     // Catch: NoSuchFieldException -> L5
    L7:
        f3168a = r02;
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }
}
