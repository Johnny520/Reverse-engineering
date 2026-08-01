package p118X3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p149d3.AbstractC1976d;
import p202m4.AbstractC2617a;

/* JADX INFO: renamed from: X3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1709s {

    /* JADX INFO: renamed from: a */
    public final String f5868a;

    /* JADX INFO: renamed from: b */
    public final String f5869b;

    /* JADX INFO: renamed from: c */
    public final String f5870c;

    /* JADX INFO: renamed from: d */
    public final String f5871d;

    /* JADX INFO: renamed from: e */
    public final int f5872e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5873f;

    /* JADX INFO: renamed from: g */
    public final List f5874g;

    /* JADX INFO: renamed from: h */
    public final String f5875h;

    /* JADX INFO: renamed from: i */
    public final String f5876i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1709s(String str, String str2, String str3, String str4, int i5, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f5868a = str;
        this.f5869b = str2;
        this.f5870c = str3;
        this.f5871d = str4;
        this.f5872e = i5;
        this.f5873f = arrayList;
        this.f5874g = arrayList2;
        this.f5875h = str5;
        this.f5876i = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3046a() {
        if (this.f5870c.length() == 0) {
            return "";
        }
        int length = this.f5868a.length() + 3;
        String str = this.f5876i;
        String strSubstring = str.substring(AbstractC1976d.m3634b0(str, ':', length, 4) + 1, AbstractC1976d.m3634b0(str, '@', 0, 6));
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3047b() {
        int length = this.f5868a.length() + 3;
        String str = this.f5876i;
        int iM3634b0 = AbstractC1976d.m3634b0(str, '/', length, 4);
        String strSubstring = str.substring(iM3634b0, AbstractC1774e.m3163d(str, iM3634b0, "?#", str.length()));
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ArrayList m3048c() {
        int length = this.f5868a.length() + 3;
        String str = this.f5876i;
        int iM3634b0 = AbstractC1976d.m3634b0(str, '/', length, 4);
        int iM3163d = AbstractC1774e.m3163d(str, iM3634b0, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iM3634b0 < iM3163d) {
            int i5 = iM3634b0 + 1;
            int iM3162c = AbstractC1774e.m3162c(str, '/', i5, iM3163d);
            String strSubstring = str.substring(i5, iM3162c);
            AbstractC1665j.m2984d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM3634b0 = iM3162c;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m3049d() {
        if (this.f5874g == null) {
            return null;
        }
        String str = this.f5876i;
        int iM3634b0 = AbstractC1976d.m3634b0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iM3634b0, AbstractC1774e.m3162c(str, '#', iM3634b0, str.length()));
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m3050e() {
        if (this.f5869b.length() == 0) {
            return "";
        }
        int length = this.f5868a.length() + 3;
        String str = this.f5876i;
        String strSubstring = str.substring(length, AbstractC1774e.m3163d(str, length, ":@", str.length()));
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1709s) && AbstractC1665j.m2981a(((C1709s) obj).f5876i, this.f5876i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C1708r m3051f(String str) {
        AbstractC1665j.m2985e(str, "link");
        try {
            C1708r c1708r = new C1708r();
            c1708r.m3045c(this, str);
            return c1708r;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m3052g() {
        C1708r c1708rM3051f = m3051f("/...");
        AbstractC1665j.m2982b(c1708rM3051f);
        c1708rM3051f.f5861b = AbstractC2617a.m4567a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        c1708rM3051f.f5862c = AbstractC2617a.m4567a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return c1708rM3051f.m3043a().f5876i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final URI m3053h() {
        String strSubstring;
        String strReplaceAll;
        C1708r c1708r = new C1708r();
        String str = this.f5868a;
        c1708r.f5860a = str;
        c1708r.f5861b = m3050e();
        c1708r.f5862c = m3046a();
        c1708r.f5863d = this.f5871d;
        AbstractC1665j.m2985e(str, "scheme");
        int i5 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i6 = this.f5872e;
        c1708r.f5864e = i6 != i5 ? i6 : -1;
        ArrayList arrayList = c1708r.f5865f;
        arrayList.clear();
        arrayList.addAll(m3048c());
        String strM3049d = m3049d();
        c1708r.f5866g = strM3049d != null ? C1708r.m3042d(AbstractC2617a.m4567a(strM3049d, 0, 0, " \"'<>#", 83)) : null;
        if (this.f5875h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f5876i;
            strSubstring = str2.substring(AbstractC1976d.m3634b0(str2, '#', 0, 6) + 1);
            AbstractC1665j.m2984d(strSubstring, "substring(...)");
        }
        c1708r.f5867h = strSubstring;
        String str3 = c1708r.f5863d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1665j.m2984d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            AbstractC1665j.m2984d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c1708r.f5863d = strReplaceAll;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.set(i7, AbstractC2617a.m4567a((String) arrayList.get(i7), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = c1708r.f5866g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String str4 = (String) arrayList2.get(i8);
                arrayList2.set(i8, str4 != null ? AbstractC2617a.m4567a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = c1708r.f5867h;
        c1708r.f5867h = str5 != null ? AbstractC2617a.m4567a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = c1708r.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1665j.m2984d(patternCompile2, "compile(...)");
                AbstractC1665j.m2985e(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC1665j.m2984d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC1665j.m2982b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5876i.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f5876i;
    }
}
