package p282t7;

import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t7.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8179c0 {
    /* JADX INFO: renamed from: a */
    public static final C8186j m31843a(String str) {
        str.getClass();
        return new C8186j(str);
    }

    /* JADX INFO: renamed from: b */
    public static final char m31844b(char c10) {
        return ('A' > c10 || c10 >= '[') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 + ' ');
    }

    /* JADX INFO: renamed from: c */
    public static final String m31845c(String str) {
        str.getClass();
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (m31844b(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iM33140h0 = AbstractC8621f0.m33140h0(str);
        if (i10 <= iM33140h0) {
            while (true) {
                sb2.append(m31844b(str.charAt(i10)));
                if (i10 == iM33140h0) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }
}
