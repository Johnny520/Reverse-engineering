package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 {

    /* JADX INFO: renamed from: a */
    public final String f13641a;

    /* JADX INFO: renamed from: b */
    public final String f13642b;

    /* JADX INFO: renamed from: c */
    public final String f13643c;

    /* JADX INFO: renamed from: d */
    public final String f13644d;

    /* JADX INFO: renamed from: e */
    public final int f13645e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13646f;

    /* JADX INFO: renamed from: g */
    public final List f13647g;

    /* JADX INFO: renamed from: h */
    public final String f13648h;

    /* JADX INFO: renamed from: i */
    public final String f13649i;

    public yw0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f13641a = str;
        this.f13642b = str2;
        this.f13643c = str3;
        this.f13644d = str4;
        this.f13645e = i;
        this.f13646f = arrayList;
        this.f13647g = arrayList2;
        this.f13648h = str5;
        this.f13649i = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m6355a() {
        if (this.f13643c.length() == 0) {
            return "";
        }
        int length = this.f13641a.length() + 3;
        String str = this.f13649i;
        return str.substring(pv2.m4003p0(str, ':', length, 4) + 1, pv2.m4003p0(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: b */
    public final String m6356b() {
        int length = this.f13641a.length() + 3;
        String str = this.f13649i;
        int iM4003p0 = pv2.m4003p0(str, '/', length, 4);
        return str.substring(iM4003p0, ug3.m5496d(str, iM4003p0, "?#", str.length()));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m6357c() {
        int length = this.f13641a.length() + 3;
        String str = this.f13649i;
        int iM4003p0 = pv2.m4003p0(str, '/', length, 4);
        int iM5496d = ug3.m5496d(str, iM4003p0, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iM4003p0 < iM5496d) {
            int i = iM4003p0 + 1;
            int iM5495c = ug3.m5495c(str, '/', i, iM5496d);
            arrayList.add(str.substring(i, iM5495c));
            iM4003p0 = iM5495c;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m6358d() {
        if (this.f13647g == null) {
            return null;
        }
        String str = this.f13649i;
        int iM4003p0 = pv2.m4003p0(str, '?', 0, 6) + 1;
        return str.substring(iM4003p0, ug3.m5495c(str, '#', iM4003p0, str.length()));
    }

    /* JADX INFO: renamed from: e */
    public final String m6359e() {
        if (this.f13642b.length() == 0) {
            return "";
        }
        int length = this.f13641a.length() + 3;
        String str = this.f13649i;
        return str.substring(length, ug3.m5496d(str, length, ":@", str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yw0) && ((yw0) obj).f13649i.equals(this.f13649i);
    }

    /* JADX INFO: renamed from: f */
    public final xw0 m6360f() {
        xw0 xw0Var = new xw0();
        String str = this.f13641a;
        xw0Var.f13200a = str;
        xw0Var.f13201b = m6359e();
        xw0Var.f13202c = m6355a();
        xw0Var.f13203d = this.f13644d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f13645e;
        xw0Var.f13204e = i2 != i ? i2 : -1;
        ArrayList arrayList = xw0Var.f13205f;
        arrayList.clear();
        arrayList.addAll(m6357c());
        String strM6358d = m6358d();
        String strSubstring = null;
        xw0Var.f13206g = strM6358d != null ? xw0.m6191h(ci0.m822w(strM6358d, 0, 0, " \"'<>#", 83)) : null;
        if (this.f13648h != null) {
            String str2 = this.f13649i;
            strSubstring = str2.substring(pv2.m4003p0(str2, '#', 0, 6) + 1);
        }
        xw0Var.f13207h = strSubstring;
        return xw0Var;
    }

    /* JADX INFO: renamed from: g */
    public final String m6361g() {
        xw0 xw0Var;
        try {
            xw0Var = new xw0();
            xw0Var.m6196e(this, "/...");
        } catch (IllegalArgumentException unused) {
            xw0Var = null;
        }
        xw0Var.getClass();
        xw0Var.f13201b = ci0.m822w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        xw0Var.f13202c = ci0.m822w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return xw0Var.m6193b().f13649i;
    }

    /* JADX INFO: renamed from: h */
    public final URI m6362h() {
        String strReplaceAll;
        xw0 xw0VarM6360f = m6360f();
        ArrayList arrayList = xw0VarM6360f.f13205f;
        String str = xw0VarM6360f.f13203d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        xw0VarM6360f.f13203d = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ci0.m822w((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = xw0VarM6360f.f13206g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? ci0.m822w(str2, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str3 = xw0VarM6360f.f13207h;
        xw0VarM6360f.f13207h = str3 != null ? ci0.m822w(str3, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = xw0VarM6360f.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.f13649i.hashCode();
    }

    public final String toString() {
        return this.f13649i;
    }
}
