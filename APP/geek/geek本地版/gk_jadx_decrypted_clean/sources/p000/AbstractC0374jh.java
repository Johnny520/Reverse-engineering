package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: jh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0374jh {

    /* JADX INFO: renamed from: a */
    public static final Field f2633a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f2633a = declaredField;
    }
}
