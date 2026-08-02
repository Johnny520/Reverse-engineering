package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yw0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(pv2.p0(str, ':', length, 4) + 1, pv2.p0(str, '@', 0, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iP0 = pv2.p0(str, '/', length, 4);
        return str.substring(iP0, ug3.d(str, iP0, "?#", str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iP0 = pv2.p0(str, '/', length, 4);
        int iD = ug3.d(str, iP0, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iP0 < iD) {
            int i = iP0 + 1;
            int iC = ug3.c(str, '/', i, iD);
            arrayList.add(str.substring(i, iC));
            iP0 = iC;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iP0 = pv2.p0(str, '?', 0, 6) + 1;
        return str.substring(iP0, ug3.c(str, '#', iP0, str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, ug3.d(str, length, ":@", str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof yw0) && ((yw0) obj).i.equals(this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xw0 f() {
        xw0 xw0Var = new xw0();
        String str = this.a;
        xw0Var.a = str;
        xw0Var.b = e();
        xw0Var.c = a();
        xw0Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        xw0Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = xw0Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        xw0Var.g = strD != null ? xw0.h(ci0.w(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(pv2.p0(str2, '#', 0, 6) + 1);
        }
        xw0Var.h = strSubstring;
        return xw0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        xw0 xw0Var;
        try {
            xw0Var = new xw0();
            xw0Var.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            xw0Var = null;
        }
        xw0Var.getClass();
        xw0Var.b = ci0.w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        xw0Var.c = ci0.w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return xw0Var.b().i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final URI h() {
        String strReplaceAll;
        xw0 xw0VarF = f();
        ArrayList arrayList = xw0VarF.f;
        String str = xw0VarF.d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        xw0VarF.d = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ci0.w((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = xw0VarF.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? ci0.w(str2, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str3 = xw0VarF.h;
        xw0VarF.h = str3 != null ? ci0.w(str3, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = xw0VarF.toString();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.i;
    }
}
