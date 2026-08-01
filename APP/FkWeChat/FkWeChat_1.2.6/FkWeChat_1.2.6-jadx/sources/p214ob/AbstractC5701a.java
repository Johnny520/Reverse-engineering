package p214ob;

import java.util.Iterator;
import java.util.Locale;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ob.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5701a {
    /* JADX INFO: renamed from: a */
    public static final String m23073a(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m23074b(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        return Character.toLowerCase(cCharAt) + str.substring(1);
    }

    /* JADX INFO: renamed from: c */
    public static final String m23075c(String str, boolean z10) {
        Object next;
        str.getClass();
        if (str.length() == 0 || !m23076d(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !m23076d(str, 1, z10)) {
            if (z10) {
                return m23074b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            return Character.toLowerCase(str.charAt(0)) + str.substring(1);
        }
        Iterator it = AbstractC8621f0.m33138g0(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!m23076d(str, ((Number) next).intValue(), z10)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return m23077e(str, z10);
        }
        int iIntValue = num.intValue() - 1;
        return m23077e(str.substring(0, iIntValue), z10) + str.substring(iIntValue);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m23076d(String str, int i10, boolean z10) {
        char cCharAt = str.charAt(i10);
        return z10 ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    /* JADX INFO: renamed from: e */
    public static final String m23077e(String str, boolean z10) {
        if (z10) {
            return m23078f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: f */
    public static final String m23078f(String str) {
        str.getClass();
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }
}
