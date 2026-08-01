package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0448lh {

    /* JADX INFO: renamed from: a */
    public static final Field f3003a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f3003a = declaredField;
    }
}
