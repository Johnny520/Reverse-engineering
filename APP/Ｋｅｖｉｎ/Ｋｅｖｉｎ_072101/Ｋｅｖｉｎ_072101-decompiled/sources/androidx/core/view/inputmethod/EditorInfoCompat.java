package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes2.dex */
public final class EditorInfoCompat {
    private static final java.lang.String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final java.lang.String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final java.lang.String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r1, int r2) {
                java.lang.CharSequence r0 = r1.getInitialSelectedText(r2)
                return r0
        }

        static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r1, int r2, int r3) {
                java.lang.CharSequence r0 = r1.getInitialTextAfterCursor(r2, r3)
                return r0
        }

        static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r1, int r2, int r3) {
                java.lang.CharSequence r0 = r1.getInitialTextBeforeCursor(r2, r3)
                return r0
        }

        static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r0, java.lang.CharSequence r1, int r2) {
                r0.setInitialSurroundingSubText(r1, r2)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public EditorInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo r2) {
            java.lang.String[] r0 = r2.contentMimeTypes
            if (r0 == 0) goto L7
            r1 = r0
            goto L9
        L7:
            java.lang.String[] r1 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
        L9:
            return r1
    }

    public static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r8, int r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialSelectedText(r8, r9)
            return r0
        Lb:
            android.os.Bundle r0 = r8.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r8.initialSelStart
            int r2 = r8.initialSelEnd
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r8.initialSelStart
            int r3 = r8.initialSelEnd
            int r2 = java.lang.Math.max(r2, r3)
            android.os.Bundle r3 = r8.extras
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r4)
            android.os.Bundle r4 = r8.extras
            java.lang.String r5 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r4 = r4.getInt(r5)
            int r5 = r2 - r0
            int r6 = r8.initialSelStart
            if (r6 < 0) goto L59
            int r6 = r8.initialSelEnd
            if (r6 < 0) goto L59
            int r6 = r4 - r3
            if (r6 == r5) goto L40
            goto L59
        L40:
            android.os.Bundle r6 = r8.extras
            java.lang.String r7 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r6 = r6.getCharSequence(r7)
            if (r6 != 0) goto L4b
            return r1
        L4b:
            r1 = r9 & 1
            if (r1 == 0) goto L54
            java.lang.CharSequence r1 = r6.subSequence(r3, r4)
            goto L58
        L54:
            java.lang.String r1 = android.text.TextUtils.substring(r6, r3, r4)
        L58:
            return r1
        L59:
            return r1
    }

    public static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextAfterCursor(r4, r5, r6)
            return r0
        Lb:
            android.os.Bundle r0 = r4.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r1 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r1 = r1.getInt(r2)
            int r2 = r0.length()
            int r2 = r2 - r1
            int r2 = java.lang.Math.min(r5, r2)
            r3 = r6 & 1
            if (r3 == 0) goto L38
            int r3 = r1 + r2
            java.lang.CharSequence r3 = r0.subSequence(r1, r3)
            goto L3e
        L38:
            int r3 = r1 + r2
            java.lang.String r3 = android.text.TextUtils.substring(r0, r1, r3)
        L3e:
            return r3
    }

    public static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextBeforeCursor(r4, r5, r6)
            return r0
        Lb:
            android.os.Bundle r0 = r4.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r1 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r1 = r1.getInt(r2)
            int r2 = java.lang.Math.min(r5, r1)
            r3 = r6 & 1
            if (r3 == 0) goto L33
            int r3 = r1 - r2
            java.lang.CharSequence r3 = r0.subSequence(r3, r1)
            goto L39
        L33:
            int r3 = r1 - r2
            java.lang.String r3 = android.text.TextUtils.substring(r0, r3, r1)
        L39:
            return r3
    }

    static int getProtocol(android.view.inputmethod.EditorInfo r1) {
            r0 = 1
            return r0
    }

    private static boolean isCutOnSurrogate(java.lang.CharSequence r1, int r2, int r3) {
            switch(r3) {
                case 0: goto Le;
                case 1: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            return r0
        Le:
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            return r0
    }

    private static boolean isPasswordInputType(int r2) {
            r0 = r2 & 4095(0xfff, float:5.738E-42)
            r1 = 129(0x81, float:1.81E-43)
            if (r0 == r1) goto L11
            r1 = 225(0xe1, float:3.15E-43)
            if (r0 == r1) goto L11
            r1 = 18
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    public static void setContentMimeTypes(android.view.inputmethod.EditorInfo r0, java.lang.String[] r1) {
            r0.contentMimeTypes = r1
            return
    }

    public static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r6, java.lang.CharSequence r7, int r8) {
            androidx.core.util.Preconditions.checkNotNull(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(r6, r7, r8)
            return
        Ld:
            int r0 = r6.initialSelStart
            int r1 = r6.initialSelEnd
            if (r0 <= r1) goto L17
            int r0 = r6.initialSelEnd
            int r0 = r0 - r8
            goto L1a
        L17:
            int r0 = r6.initialSelStart
            int r0 = r0 - r8
        L1a:
            int r1 = r6.initialSelStart
            int r2 = r6.initialSelEnd
            if (r1 <= r2) goto L25
            int r1 = r6.initialSelStart
            int r1 = r1 - r8
            goto L28
        L25:
            int r1 = r6.initialSelEnd
            int r1 = r1 - r8
        L28:
            int r2 = r7.length()
            r3 = 0
            r4 = 0
            if (r8 < 0) goto L4e
            if (r0 < 0) goto L4e
            if (r1 <= r2) goto L36
            goto L4e
        L36:
            int r5 = r6.inputType
            boolean r5 = isPasswordInputType(r5)
            if (r5 == 0) goto L42
            setSurroundingText(r6, r3, r4, r4)
            return
        L42:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 > r3) goto L4a
            setSurroundingText(r6, r7, r0, r1)
            return
        L4a:
            trimLongSurroundingText(r6, r7, r0, r1)
            return
        L4e:
            setSurroundingText(r6, r3, r4, r4)
            return
    }

    public static void setInitialSurroundingText(android.view.inputmethod.EditorInfo r3, java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto Lb
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(r3, r4, r2)
            goto Le
        Lb:
            setInitialSurroundingSubText(r3, r4, r2)
        Le:
            return
    }

    private static void setSurroundingText(android.view.inputmethod.EditorInfo r3, java.lang.CharSequence r4, int r5, int r6) {
            android.os.Bundle r0 = r3.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3.extras = r0
        Lb:
            if (r4 == 0) goto L13
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r4)
            goto L14
        L13:
            r0 = 0
        L14:
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            r1.putCharSequence(r2, r0)
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            r1.putInt(r2, r5)
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            r1.putInt(r2, r6)
            return
    }

    private static void trimLongSurroundingText(android.view.inputmethod.EditorInfo r12, java.lang.CharSequence r13, int r14, int r15) {
            int r0 = r15 - r14
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r0 <= r1) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r0
        La:
            int r3 = r13.length()
            int r3 = r3 - r15
            int r4 = 2048 - r1
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r7 = (double) r4
            double r7 = r7 * r5
            int r5 = (int) r7
            int r5 = java.lang.Math.min(r14, r5)
            int r6 = r4 - r5
            int r6 = java.lang.Math.min(r3, r6)
            int r7 = r4 - r6
            int r7 = java.lang.Math.min(r14, r7)
            int r8 = r14 - r7
            int r9 = r14 - r7
            boolean r2 = isCutOnSurrogate(r13, r9, r2)
            if (r2 == 0) goto L37
            int r8 = r8 + 1
            int r7 = r7 + (-1)
        L37:
            int r2 = r15 + r6
            r9 = 1
            int r2 = r2 - r9
            boolean r2 = isCutOnSurrogate(r13, r2, r9)
            if (r2 == 0) goto L43
            int r6 = r6 + (-1)
        L43:
            int r2 = r7 + r1
            int r2 = r2 + r6
            if (r1 == r0) goto L5d
            int r9 = r8 + r7
            java.lang.CharSequence r9 = r13.subSequence(r8, r9)
            int r10 = r15 + r6
            java.lang.CharSequence r10 = r13.subSequence(r15, r10)
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[]{r9, r10}
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r11)
            goto L63
        L5d:
            int r9 = r8 + r2
            java.lang.CharSequence r9 = r13.subSequence(r8, r9)
        L63:
            r8 = 0
            int r10 = r8 + r7
            int r11 = r10 + r1
            setSurroundingText(r12, r9, r10, r11)
            return
    }
}
