package p259ra;

import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p213oa.C5693d;
import p213oa.C5695f;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: ra.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6562g0 {
    /* JADX INFO: renamed from: a */
    public static final String m25877a(C5693d c5693d) {
        c5693d.getClass();
        return m25879c(c5693d.m23012h());
    }

    /* JADX INFO: renamed from: b */
    public static final String m25878b(C5695f c5695f) {
        c5695f.getClass();
        boolean zM25881e = m25881e(c5695f);
        String strM23030c = c5695f.m23030c();
        strM23030c.getClass();
        if (!zM25881e) {
            return strM23030c;
        }
        return ("`" + strM23030c).concat("`");
    }

    /* JADX INFO: renamed from: c */
    public static final String m25879c(List list) {
        list.getClass();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5695f c5695f = (C5695f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(m25878b(c5695f));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static final String m25880d(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (AbstractC8611a0.m33075T(str, str2, false, 2, null) && AbstractC8611a0.m33075T(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            String strSubstring2 = str3.substring(str4.length());
            String str6 = str5 + strSubstring;
            if (AbstractC1061t.m3842c(strSubstring, strSubstring2)) {
                return str6;
            }
            if (m25882f(strSubstring, strSubstring2)) {
                return str6.concat("!");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m25881e(C5695f c5695f) {
        String strM23030c = c5695f.m23030c();
        strM23030c.getClass();
        if (AbstractC6552b0.f20514a.contains(strM23030c)) {
            return true;
        }
        for (int i10 = 0; i10 < strM23030c.length(); i10++) {
            char cCharAt = strM23030c.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strM23030c.length() == 0 || !Character.isJavaIdentifierStart(strM23030c.codePointAt(0));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m25882f(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (AbstractC1061t.m3842c(str, AbstractC8611a0.m33069N(str2, "?", _UrlKt.FRAGMENT_ENCODE_SET, false, 4, null))) {
            return true;
        }
        if (AbstractC8611a0.m33060E(str2, "?", false, 2, null)) {
            if (AbstractC1061t.m3842c(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return AbstractC1061t.m3842c(sb2.toString(), str2);
    }
}
