package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupMenuCompat {

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.View.OnTouchListener getDragToOpenListener(android.widget.PopupMenu r1) {
                android.view.View$OnTouchListener r0 = r1.getDragToOpenListener()
                return r0
        }
    }

    private PopupMenuCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(java.lang.Object r1) {
            r0 = r1
            android.widget.PopupMenu r0 = (android.widget.PopupMenu) r0
            android.view.View$OnTouchListener r0 = androidx.core.widget.PopupMenuCompat.Api19Impl.getDragToOpenListener(r0)
            return r0
    }
}
