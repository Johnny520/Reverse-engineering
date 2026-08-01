package p176i1;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: renamed from: i1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2299o {

    /* JADX INFO: renamed from: a */
    public static final C2299o f7492a = new C2299o();

    /* JADX INFO: renamed from: a */
    public final int m4124a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i6 = rect.top;
        int i7 = rect.bottom;
        return i5 - (i6 + (i7 > i5 ? i7 - i5 : 0));
    }
}
