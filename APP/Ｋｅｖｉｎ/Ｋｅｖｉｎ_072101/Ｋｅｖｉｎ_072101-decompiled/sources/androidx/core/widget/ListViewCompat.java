package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ListViewCompat {

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canScrollList(android.widget.ListView r1, int r2) {
                boolean r0 = r1.canScrollList(r2)
                return r0
        }

        static void scrollListBy(android.widget.ListView r0, int r1) {
                r0.scrollListBy(r1)
                return
        }
    }

    private ListViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canScrollList(android.widget.ListView r1, int r2) {
            boolean r0 = androidx.core.widget.ListViewCompat.Api19Impl.canScrollList(r1, r2)
            return r0
    }

    public static void scrollListBy(android.widget.ListView r0, int r1) {
            androidx.core.widget.ListViewCompat.Api19Impl.scrollListBy(r0, r1)
            return
    }
}
