package p000a;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: a.kg */
/* JADX INFO: loaded from: classes.dex */
public final class C0676kg {

    /* JADX INFO: renamed from: a */
    public final String f2526a;

    /* JADX INFO: renamed from: b */
    public final String f2527b;

    /* JADX INFO: renamed from: c */
    public final String f2528c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f2529d;

    /* JADX INFO: renamed from: e */
    public final Object f2530e;

    /* JADX INFO: renamed from: a.kg$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m1546a(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            if (str.equals("true") || str.equals("false")) {
                return "patchEnabled";
            }
            Pattern patternCompile = Pattern.compile("0x[0-9A-Fa-f]+");
            C0631i9.m1481d(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).matches()) {
                return "bVer";
            }
            if (C0034Be.m94I(str, "RELEASE", false)) {
                return "tag";
            }
            Pattern patternCompile2 = Pattern.compile(".*#\\d+.*");
            C0631i9.m1481d(patternCompile2, "compile(...)");
            if (patternCompile2.matcher(str).matches()) {
                return "tag";
            }
            Pattern patternCompile3 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}.*");
            C0631i9.m1481d(patternCompile3, "compile(...)");
            if (patternCompile3.matcher(str).matches()) {
                return "time";
            }
            Pattern patternCompile4 = Pattern.compile("[0-9a-f]{32,}");
            C0631i9.m1481d(patternCompile4, "compile(...)");
            if (patternCompile4.matcher(str).matches()) {
                return "rev";
            }
            int length = str.length();
            if (1 > length || length >= 41 || C0034Be.m95J(str, ' ')) {
                return null;
            }
            return "patchAppend";
        }
    }

    public C0676kg(String str, String str2, String str3, ArrayList arrayList, List list) {
        this.f2526a = str;
        this.f2527b = str2;
        this.f2528c = str3;
        this.f2529d = arrayList;
        this.f2530e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676kg)) {
            return false;
        }
        C0676kg c0676kg = (C0676kg) obj;
        return this.f2526a.equals(c0676kg.f2526a) && C0631i9.m1478a(this.f2527b, c0676kg.f2527b) && C0631i9.m1478a(this.f2528c, c0676kg.f2528c) && this.f2529d.equals(c0676kg.f2529d) && this.f2530e.equals(c0676kg.f2530e);
    }

    public final int hashCode() {
        int iHashCode = this.f2526a.hashCode() * 31;
        String str = this.f2527b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2528c;
        return this.f2530e.hashCode() + ((this.f2529d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "VersionSymbols(zClass=" + this.f2526a + ", zFormatMethod=" + this.f2527b + ", mp0Class=" + this.f2528c + ", zStaticStringFields=" + this.f2529d + ", mp0StaticStringFields=" + this.f2530e + ")";
    }
}
