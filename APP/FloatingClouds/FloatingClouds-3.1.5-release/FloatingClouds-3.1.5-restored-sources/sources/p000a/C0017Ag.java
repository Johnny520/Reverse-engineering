package p000a;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: a.Ag */
/* JADX INFO: loaded from: classes.dex */
public final class C0017Ag {

    /* JADX INFO: renamed from: a */
    public static boolean f54a = true;

    /* JADX INFO: renamed from: a.Ag$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m51a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        /* JADX INFO: renamed from: b */
        public static void m52b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m50a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m52b(viewGroup, z);
        } else if (f54a) {
            try {
                a.m52b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f54a = false;
            }
        }
    }
}
