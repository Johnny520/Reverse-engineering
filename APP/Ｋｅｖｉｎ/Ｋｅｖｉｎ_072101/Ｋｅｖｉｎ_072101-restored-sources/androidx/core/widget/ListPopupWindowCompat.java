package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ListPopupWindowCompat {

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow r1, android.view.View r2) {
                android.view.View$OnTouchListener r0 = r1.createDragToOpenListener(r2)
                return r0
        }
    }

    private ListPopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow r1, android.view.View r2) {
            android.view.View$OnTouchListener r0 = androidx.core.widget.ListPopupWindowCompat.Api19Impl.createDragToOpenListener(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object r1, android.view.View r2) {
            r0 = r1
            android.widget.ListPopupWindow r0 = (android.widget.ListPopupWindow) r0
            android.view.View$OnTouchListener r0 = createDragToOpenListener(r0, r2)
            return r0
    }
}
