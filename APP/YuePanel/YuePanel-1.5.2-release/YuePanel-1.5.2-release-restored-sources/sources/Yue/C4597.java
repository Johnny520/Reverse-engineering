package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C4597 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f988 = 16777216;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f989 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String[] f9871 = new String[0];

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f9872 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f9873 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f9874 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f9875 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f9876 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f9877 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC8392
    public static final int f9878 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC8392
    public static final int f9879 = 1024;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤۨ$ۥ */
    @InterfaceC7113(30)
    public static class C0447 {
        /* JADX INFO: renamed from: ۥ */
        public static CharSequence m1557(@InterfaceC6391 EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m1558(@InterfaceC6391 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static CharSequence m13667(@InterfaceC6391 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m13668(@InterfaceC6391 EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @Deprecated
    public C4597() {
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static String[] m1555(@InterfaceC6391 EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f9871;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static CharSequence m1556(@InterfaceC6391 EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0447.m1557(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(f9875);
        int i3 = editorInfo.extras.getInt(f9876);
        int i4 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(f9874)) == null) {
            return null;
        }
        return (i & 1) != 0 ? charSequence.subSequence(i2, i3) : TextUtils.substring(charSequence, i2, i3);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static CharSequence m13655(@InterfaceC6391 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0447.m1558(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f9874)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f9876);
        int iMin = Math.min(i, charSequence.length() - i3);
        return (i2 & 1) != 0 ? charSequence.subSequence(i3, iMin + i3) : TextUtils.substring(charSequence, i3, iMin + i3);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static CharSequence m13656(@InterfaceC6391 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0447.m13667(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f9874)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f9875);
        int iMin = Math.min(i, i3);
        return (i2 & 1) != 0 ? charSequence.subSequence(i3 - iMin, i3) : TextUtils.substring(charSequence, i3 - iMin, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m13657(EditorInfo editorInfo) {
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m13658(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m13659(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m13660(@InterfaceC6391 EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(f9877);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m13661(@InterfaceC6391 EditorInfo editorInfo, @InterfaceC6490 String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m13662(@InterfaceC6391 EditorInfo editorInfo, @InterfaceC6391 CharSequence charSequence, int i) {
        C6740.m21415(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C0447.m13668(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m13665(editorInfo, null, 0, 0);
            return;
        }
        if (m13659(editorInfo.inputType)) {
            m13665(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m13665(editorInfo, charSequence, i4, i5);
        } else {
            m13666(editorInfo, charSequence, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m13663(@InterfaceC6391 EditorInfo editorInfo, @InterfaceC6391 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0447.m13668(editorInfo, charSequence, 0);
        } else {
            m13662(editorInfo, charSequence, 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m13664(@InterfaceC6391 EditorInfo editorInfo, boolean z) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(f9877, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m13665(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f9874, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f9875, i);
        editorInfo.extras.putInt(f9876, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m13666(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int iMin2 = Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (m13658(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (m13658(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        m13665(editorInfo, i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i6, iMin2 + i4 + iMin + i6), iMin2, i4 + iMin2);
    }
}
