package Yue;

import android.text.TextUtils;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C4301 {
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static String[] m1257(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m1258(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }
}
