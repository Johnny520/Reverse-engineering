package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: He */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0322He {

    /* JADX INFO: renamed from: a */
    public static final Field f1089a = null;

    static {
        Field r0 = null;
        r0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
        r0.setAccessible(true);     // Catch: NoSuchFieldException -> L5
    L7:
        f1089a = r0;
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }
}
