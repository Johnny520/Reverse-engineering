package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class MarginLayoutParamsCompat {

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams r1) {
                int r0 = r1.getLayoutDirection()
                return r0
        }

        static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams r1) {
                int r0 = r1.getMarginEnd()
                return r0
        }

        static int getMarginStart(android.view.ViewGroup.MarginLayoutParams r1) {
                int r0 = r1.getMarginStart()
                return r0
        }

        static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams r1) {
                boolean r0 = r1.isMarginRelative()
                return r0
        }

        static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.resolveLayoutDirection(r1)
                return
        }

        static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setLayoutDirection(r1)
                return
        }

        static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setMarginEnd(r1)
                return
        }

        static void setMarginStart(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setMarginStart(r1)
                return
        }
    }

    private MarginLayoutParamsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getLayoutDirection(r2)
            if (r0 == 0) goto Lb
            r1 = 1
            if (r0 == r1) goto Lb
            r0 = 0
        Lb:
            return r0
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams r1) {
            int r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginEnd(r1)
            return r0
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams r1) {
            int r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginStart(r1)
            return r0
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams r1) {
            boolean r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.isMarginRelative(r1)
            return r0
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.resolveLayoutDirection(r0, r1)
            return
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setLayoutDirection(r0, r1)
            return
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginEnd(r0, r1)
            return
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginStart(r0, r1)
            return
    }
}
