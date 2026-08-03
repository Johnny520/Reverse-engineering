package Yue;

import android.view.View;
import android.widget.ListPopupWindow;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5735 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static View.OnTouchListener m2412(@InterfaceC6391 ListPopupWindow listPopupWindow, @InterfaceC6391 View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static View.OnTouchListener m2413(Object obj, View view) {
        return m2412((ListPopupWindow) obj, view);
    }
}
