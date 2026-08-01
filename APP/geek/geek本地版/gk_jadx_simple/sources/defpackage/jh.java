package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class jh {
    public static final Field a = null;

    static {
        Field r0 = null;
        r0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
        r0.setAccessible(true);     // Catch: NoSuchFieldException -> L5
    L7:
        a = r0;
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }
}
