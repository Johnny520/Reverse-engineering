package p336x3;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: x3.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9434x {

    /* JADX INFO: renamed from: x3.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m36706a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: x3.x$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m36707a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* JADX INFO: renamed from: x3.x$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m36708a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m36705a(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.m36708a(window, z10);
        } else if (i10 >= 30) {
            b.m36707a(window, z10);
        } else {
            a.m36706a(window, z10);
        }
    }
}
