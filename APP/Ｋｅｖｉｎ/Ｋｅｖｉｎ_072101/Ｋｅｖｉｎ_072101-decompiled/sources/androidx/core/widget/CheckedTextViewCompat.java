package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckedTextViewCompat {
    private static final java.lang.String TAG = "CheckedTextViewCompat";

    private static class Api14Impl {
        private static java.lang.reflect.Field sCheckMarkDrawableField;
        private static boolean sResolved;

        private Api14Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView r4) {
                boolean r0 = androidx.core.widget.CheckedTextViewCompat.Api14Impl.sResolved
                java.lang.String r1 = "CheckedTextViewCompat"
                if (r0 != 0) goto L1f
                r0 = 1
                java.lang.Class<android.widget.CheckedTextView> r2 = android.widget.CheckedTextView.class
                java.lang.String r3 = "mCheckMarkDrawable"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L17
                androidx.core.widget.CheckedTextViewCompat.Api14Impl.sCheckMarkDrawableField = r2     // Catch: java.lang.NoSuchFieldException -> L17
                java.lang.reflect.Field r2 = androidx.core.widget.CheckedTextViewCompat.Api14Impl.sCheckMarkDrawableField     // Catch: java.lang.NoSuchFieldException -> L17
                r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L17
                goto L1d
            L17:
                r2 = move-exception
                java.lang.String r3 = "Failed to retrieve mCheckMarkDrawable field"
                android.util.Log.i(r1, r3, r2)
            L1d:
                androidx.core.widget.CheckedTextViewCompat.Api14Impl.sResolved = r0
            L1f:
                java.lang.reflect.Field r0 = androidx.core.widget.CheckedTextViewCompat.Api14Impl.sCheckMarkDrawableField
                r2 = 0
                if (r0 == 0) goto L35
                java.lang.reflect.Field r0 = androidx.core.widget.CheckedTextViewCompat.Api14Impl.sCheckMarkDrawableField     // Catch: java.lang.IllegalAccessException -> L2d
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L2d
                android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.IllegalAccessException -> L2d
                return r0
            L2d:
                r0 = move-exception
                java.lang.String r3 = "Failed to get check mark drawable via reflection"
                android.util.Log.i(r1, r3, r0)
                androidx.core.widget.CheckedTextViewCompat.Api14Impl.sCheckMarkDrawableField = r2
            L35:
                return r2
        }
    }

    private static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView r1) {
                android.graphics.drawable.Drawable r0 = r1.getCheckMarkDrawable()
                return r0
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView r1) {
                android.content.res.ColorStateList r0 = r1.getCheckMarkTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getCheckMarkTintMode()
                return r0
        }

        static void setCheckMarkTintList(android.widget.CheckedTextView r0, android.content.res.ColorStateList r1) {
                r0.setCheckMarkTintList(r1)
                return
        }

        static void setCheckMarkTintMode(android.widget.CheckedTextView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setCheckMarkTintMode(r1)
                return
        }
    }

    private CheckedTextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView r1) {
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CheckedTextViewCompat.Api16Impl.getCheckMarkDrawable(r1)
            return r0
    }

    public static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView r1) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView r1) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintMode(r1)
            return r0
    }

    public static void setCheckMarkTintList(android.widget.CheckedTextView r0, android.content.res.ColorStateList r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintList(r0, r1)
            return
    }

    public static void setCheckMarkTintMode(android.widget.CheckedTextView r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintMode(r0, r1)
            return
    }
}
