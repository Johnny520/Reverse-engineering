package p358y2;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: renamed from: y2.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5979n {

    /* JADX INFO: renamed from: a */
    public static final C5979n f24293a = new C5979n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m10714a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i9 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.top;
        int i11 = rect.bottom;
        return i9 - (i10 + (i11 > i9 ? i11 - i9 : 0));
    }
}
