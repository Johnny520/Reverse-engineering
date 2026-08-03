package p000a;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: a.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931y5 {

    /* JADX INFO: renamed from: a.y5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m2217a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* JADX INFO: renamed from: a.y5$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m2218a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2216a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C0074E.m195q(drawable)) {
            return null;
        }
        return C0074E.m182d(drawable).getColorStateList();
    }
}
