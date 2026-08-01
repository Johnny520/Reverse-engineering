package androidx.core.hardware.display;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final java.util.WeakHashMap<android.content.Context, java.lang.ref.WeakReference<androidx.core.hardware.display.DisplayManagerCompat>> sInstances = null;
    private final android.content.Context mContext;

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.Display getDisplay(android.hardware.display.DisplayManager r1, int r2) {
                android.view.Display r0 = r1.getDisplay(r2)
                return r0
        }

        static android.view.Display[] getDisplays(android.hardware.display.DisplayManager r1) {
                android.view.Display[] r0 = r1.getDisplays()
                return r0
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.hardware.display.DisplayManagerCompat.sInstances = r0
            return
    }

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context r4) {
            java.util.WeakHashMap<android.content.Context, java.lang.ref.WeakReference<androidx.core.hardware.display.DisplayManagerCompat>> r0 = androidx.core.hardware.display.DisplayManagerCompat.sInstances
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, java.lang.ref.WeakReference<androidx.core.hardware.display.DisplayManagerCompat>> r1 = androidx.core.hardware.display.DisplayManagerCompat.sInstances     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L13
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L23
        L13:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L2b
            androidx.core.hardware.display.DisplayManagerCompat r3 = new androidx.core.hardware.display.DisplayManagerCompat     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r1 = r2
            java.util.WeakHashMap<android.content.Context, java.lang.ref.WeakReference<androidx.core.hardware.display.DisplayManagerCompat>> r2 = androidx.core.hardware.display.DisplayManagerCompat.sInstances     // Catch: java.lang.Throwable -> L2b
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L2b
        L23:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2b
            androidx.core.hardware.display.DisplayManagerCompat r2 = (androidx.core.hardware.display.DisplayManagerCompat) r2     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r2
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r0 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplay(r0, r3)
            return r0
    }

    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays(r0)
            return r0
    }

    public android.view.Display[] getDisplays(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays(r0)
            return r0
    }
}
