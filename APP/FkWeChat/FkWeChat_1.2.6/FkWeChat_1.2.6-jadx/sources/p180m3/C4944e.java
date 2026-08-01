package p180m3;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: renamed from: m3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4944e {

    /* JADX INFO: renamed from: a */
    public static final C4944e f15020a = new C4944e();

    /* JADX INFO: renamed from: a */
    public final int m19987a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        return i10 - m19988b(window, i10);
    }

    /* JADX INFO: renamed from: b */
    public final int m19988b(Window window, int i10) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i11 = rect.top;
        int i12 = rect.bottom;
        return i11 + (i12 > i10 ? i12 - i10 : 0);
    }
}
