package Yue;

import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۢۦۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8583 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final String m4553(char c) {
        String strValueOf = String.valueOf(c);
        C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        C5499.m17101(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }
}
