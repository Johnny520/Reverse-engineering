package yyds;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᛲᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0082 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String f663;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f664;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f665;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f666;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f667;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f668;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final List f669;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f670;

    public C0082(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f665 = str;
        this.f666 = str2;
        this.f668 = str3;
        this.f670 = str4;
        this.f664 = i;
        this.f669 = arrayList;
        this.f667 = str5;
        this.f663 = str6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0082) && ((C0082) obj).f663.equals(this.f663);
    }

    public final int hashCode() {
        return this.f663.hashCode();
    }

    public final String toString() {
        return this.f663;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final URI m475() {
        C0074 c0074M481 = m481();
        ArrayList arrayList = (ArrayList) c0074M481.f638;
        String str = (String) c0074M481.f645;
        c0074M481.f645 = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC0879.m1971(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) c0074M481.f639;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC0879.m1971(0, 0, 67, str2, "\\^`{|}") : null);
            }
        }
        String str3 = (String) c0074M481.f643;
        c0074M481.f643 = str3 != null ? AbstractC0879.m1971(0, 0, 35, str3, " \"#<>\\^`{|}") : null;
        String string = c0074M481.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m476() {
        if (this.f666.length() == 0) {
            return "";
        }
        int length = this.f665.length() + 3;
        String str = this.f663;
        return str.substring(length, AbstractC1429.m2923(length, str.length(), str, ":@"));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m477() {
        if (this.f668.length() == 0) {
            return "";
        }
        int length = this.f665.length() + 3;
        String str = this.f663;
        return str.substring(AbstractC0473.m1290(str, ':', length, 4) + 1, AbstractC0473.m1290(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m478() {
        int length = this.f665.length() + 3;
        String str = this.f663;
        int iM1290 = AbstractC0473.m1290(str, '/', length, 4);
        return str.substring(iM1290, AbstractC1429.m2923(iM1290, str.length(), str, "?#"));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String m479() {
        C0074 c0074;
        try {
            c0074 = new C0074();
            c0074.m465(this, "/...");
        } catch (IllegalArgumentException unused) {
            c0074 = null;
        }
        c0074.getClass();
        c0074.f646 = AbstractC0879.m1971(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        c0074.f640 = AbstractC0879.m1971(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return c0074.m462().f663;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList m480() {
        int length = this.f665.length() + 3;
        String str = this.f663;
        int iM1290 = AbstractC0473.m1290(str, '/', length, 4);
        int iM2923 = AbstractC1429.m2923(iM1290, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM1290 < iM2923) {
            int i = iM1290 + 1;
            int iM2925 = AbstractC1429.m2925(str, '/', i, iM2923);
            arrayList.add(str.substring(i, iM2925));
            iM1290 = iM2925;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0074 m481() {
        C0074 c0074 = new C0074();
        ArrayList arrayList = (ArrayList) c0074.f638;
        String str = this.f665;
        c0074.f644 = str;
        c0074.f646 = m476();
        c0074.f640 = m477();
        c0074.f645 = this.f670;
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f664;
        c0074.f642 = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(m480());
        String strM482 = m482();
        String strSubstring = null;
        c0074.f639 = strM482 != null ? C0074.m460(AbstractC0879.m1971(0, 0, 83, strM482, " \"'<>#")) : null;
        if (this.f667 != null) {
            String str2 = this.f663;
            strSubstring = str2.substring(AbstractC0473.m1290(str2, '#', 0, 6) + 1);
        }
        c0074.f643 = strSubstring;
        return c0074;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m482() {
        if (this.f669 == null) {
            return null;
        }
        String str = this.f663;
        int iM1290 = AbstractC0473.m1290(str, '?', 0, 6) + 1;
        return str.substring(iM1290, AbstractC1429.m2925(str, '#', iM1290, str.length()));
    }
}
