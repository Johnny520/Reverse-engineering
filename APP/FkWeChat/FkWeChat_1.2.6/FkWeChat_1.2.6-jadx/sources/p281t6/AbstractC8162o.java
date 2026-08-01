package p281t6;

import java.util.Set;
import p185m8.AbstractC5068b1;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;

/* JADX INFO: renamed from: t6.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8162o {

    /* JADX INFO: renamed from: a */
    public static final Set f27294a = AbstractC5068b1.m20487i('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');

    /* JADX INFO: renamed from: b */
    public static final boolean m31649b(String str) {
        if (str.length() < 2 || AbstractC8625h0.m33178x1(str) != '\"' || AbstractC8625h0.m33180z1(str) != '\"') {
            return false;
        }
        int i10 = 1;
        while (true) {
            String str2 = str;
            int iM33150m0 = AbstractC8621f0.m33150m0(str2, '\"', i10, false, 4, null);
            if (iM33150m0 == AbstractC8621f0.m33140h0(str2)) {
                break;
            }
            int i11 = 0;
            for (int i12 = iM33150m0 - 1; str2.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = iM33150m0 + 1;
            if (i10 >= str2.length()) {
                break;
            }
            str = str2;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31650c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (m31649b(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f27294a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final String m31651d(String str) {
        str.getClass();
        StringBuilder sb2 = new StringBuilder();
        m31652e(str, sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static final void m31652e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                sb2.append(cCharAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append("\"");
    }
}
