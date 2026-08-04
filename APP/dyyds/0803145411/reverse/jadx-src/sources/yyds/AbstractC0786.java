package yyds;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛱᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786 extends AbstractC0598 {
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static String m1776(String str) {
        if (AbstractC0473.m1313("|")) {
            C0188.m798("marginPrefix must be non-blank string.");
            return null;
        }
        List listM1316 = AbstractC0473.m1316(str);
        int length = str.length();
        listM1316.size();
        int iM4850 = AbstractC2725.m4850(listM1316);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM1316) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2725.m4853();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == iM4850) && AbstractC0473.m1313(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC1741.m3478(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC1595.m3278(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static String m1777(String str) {
        return AbstractC1529.m3156(new C1125(new C0558(6, str), new C1302("    ", 9)), "\n");
    }
}
