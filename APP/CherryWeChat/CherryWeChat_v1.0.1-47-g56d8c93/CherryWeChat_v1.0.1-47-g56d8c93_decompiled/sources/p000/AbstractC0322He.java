package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: He */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0322He {

    /* JADX INFO: renamed from: a */
    public static final Field f1089a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f1089a = declaredField;
    }
}
