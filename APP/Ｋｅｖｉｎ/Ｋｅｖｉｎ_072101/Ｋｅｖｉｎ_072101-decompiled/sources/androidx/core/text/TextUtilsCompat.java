package androidx.core.text;

/* JADX INFO: loaded from: classes2.dex */
public final class TextUtilsCompat {
    private static final java.lang.String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final java.lang.String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final java.util.Locale ROOT = null;

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getLayoutDirectionFromLocale(java.util.Locale r1) {
                int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
                return r0
        }
    }

    static {
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = ""
            r0.<init>(r1, r1)
            androidx.core.text.TextUtilsCompat.ROOT = r0
            return
    }

    private TextUtilsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getLayoutDirectionFromFirstChar(java.util.Locale r2) {
            java.lang.String r0 = r2.getDisplayName(r2)
            r1 = 0
            char r0 = r0.charAt(r1)
            byte r0 = java.lang.Character.getDirectionality(r0)
            switch(r0) {
                case 1: goto L11;
                case 2: goto L11;
                default: goto L10;
            }
        L10:
            return r1
        L11:
            r0 = 1
            return r0
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale r1) {
            int r0 = androidx.core.text.TextUtilsCompat.Api17Impl.getLayoutDirectionFromLocale(r1)
            return r0
    }

    public static java.lang.String htmlEncode(java.lang.String r1) {
            java.lang.String r0 = android.text.TextUtils.htmlEncode(r1)
            return r0
    }
}
