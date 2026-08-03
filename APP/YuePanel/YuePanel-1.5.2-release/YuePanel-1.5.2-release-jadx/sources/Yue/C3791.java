package Yue;

import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3791 {
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ */
    public static int m836(int i) {
        if (new C5458(2, 36).m16971(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C5458(2, 36));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m837(char c, int i) {
        return Character.digit((int) c, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final EnumC3776 m10450(char c) {
        return EnumC3776.f6892.m818(Character.getType(c));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final EnumC3780 m10451(char c) {
        return EnumC3780.f6936.m826(Character.getDirectionality(c));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m10452(char c) {
        return Character.isDefined(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m10453(char c) {
        return Character.isDigit(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m10454(char c) {
        return Character.isHighSurrogate(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m10455(char c) {
        return Character.isISOControl(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m10456(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m10457(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m10458(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m10459(char c) {
        return Character.isLetter(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m10460(char c) {
        return Character.isLetterOrDigit(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m10461(char c) {
        return Character.isLowSurrogate(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean m10462(char c) {
        return Character.isLowerCase(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean m10463(char c) {
        return Character.isTitleCase(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m10464(char c) {
        return Character.isUpperCase(c);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean m10465(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String m10466(char c) {
        String strValueOf = String.valueOf(c);
        C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String m10467(char c, @InterfaceC6399 Locale locale) {
        C5499.m17103(locale, "locale");
        String strValueOf = String.valueOf(c);
        C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final char m10468(char c) {
        return Character.toLowerCase(c);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String m10469(char c, @InterfaceC6399 Locale locale) {
        C5499.m17103(locale, "locale");
        String strM10475 = m10475(c, locale);
        if (strM10475.length() <= 1) {
            String strValueOf = String.valueOf(c);
            C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !C5499.m17094(strM10475, upperCase) ? strM10475 : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return strM10475;
        }
        char cCharAt = strM10475.charAt(0);
        C5499.m17101(strM10475, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strM10475.substring(1);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final char m10470(char c) {
        return Character.toTitleCase(c);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use lowercaseChar() instead.", replaceWith = @InterfaceC7097(expression = "lowercaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final char m10471(char c) {
        return Character.toLowerCase(c);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use titlecaseChar() instead.", replaceWith = @InterfaceC7097(expression = "titlecaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final char m10472(char c) {
        return Character.toTitleCase(c);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use uppercaseChar() instead.", replaceWith = @InterfaceC7097(expression = "uppercaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final char m10473(char c) {
        return Character.toUpperCase(c);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String m10474(char c) {
        String strValueOf = String.valueOf(c);
        C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String m10475(char c, @InterfaceC6399 Locale locale) {
        C5499.m17103(locale, "locale");
        String strValueOf = String.valueOf(c);
        C5499.m17101(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final char m10476(char c) {
        return Character.toUpperCase(c);
    }
}
