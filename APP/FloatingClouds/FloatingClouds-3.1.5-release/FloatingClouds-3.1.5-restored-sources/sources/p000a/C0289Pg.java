package p000a;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.Pg */
/* JADX INFO: loaded from: classes.dex */
public final class C0289Pg {

    /* JADX INFO: renamed from: a */
    public static boolean f985a;

    /* JADX INFO: renamed from: b */
    public static Method f986b;

    /* JADX INFO: renamed from: a.Pg$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m785a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }
}
