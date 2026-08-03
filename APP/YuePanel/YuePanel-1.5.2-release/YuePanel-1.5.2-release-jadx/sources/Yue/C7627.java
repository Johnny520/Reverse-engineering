package Yue;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,805:1\n1174#2,2:806\n1#3:808\n1726#4,3:809\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:806,2\n600#1:809,3\n*E\n"})
public class C7627 extends C7626 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final String m23941(StringBuffer stringBuffer) {
        C5499.m17103(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final String m23942(StringBuilder sb) {
        C5499.m17103(sb, "stringBuilder");
        return new String(sb);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final String m23943(byte[] bArr) {
        C5499.m17103(bArr, "bytes");
        return new String(bArr, C3794.f505);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final String m23944(byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "bytes");
        return new String(bArr, i, i2, C3794.f505);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final String m23945(byte[] bArr, int i, int i2, Charset charset) {
        C5499.m17103(bArr, "bytes");
        C5499.m17103(charset, "charset");
        return new String(bArr, i, i2, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final String m23946(byte[] bArr, Charset charset) {
        C5499.m17103(bArr, "bytes");
        C5499.m17103(charset, "charset");
        return new String(bArr, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String m23947(char[] cArr) {
        C5499.m17103(cArr, "chars");
        return new String(cArr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final String m23948(char[] cArr, int i, int i2) {
        C5499.m17103(cArr, "chars");
        return new String(cArr, i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final String m23949(int[] iArr, int i, int i2) {
        C5499.m17103(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC6399
    @InterfaceC4372(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC7097(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final String m23950(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        Locale locale = Locale.getDefault();
        C5499.m17102(locale, "getDefault()");
        return m23951(str, locale);
    }

    @InterfaceC6399
    @InterfaceC4372(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC7097(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @InterfaceC7470(version = "1.4")
    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5890
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final String m23951(@InterfaceC6399 String str, @InterfaceC6399 Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final int m23952(String str, int i) {
        C5499.m17103(str, "<this>");
        return str.codePointAt(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final int m23953(String str, int i) {
        C5499.m17103(str, "<this>");
        return str.codePointBefore(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final int m23954(String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        return str.codePointCount(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final int m23955(@InterfaceC6399 String str, @InterfaceC6399 String str2, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "other");
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ int m23956(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m23955(str, str2, z);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static String m23957(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return new String(cArr);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static String m23958(@InterfaceC6399 char[] cArr, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        AbstractC2986.f4328.m51(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ String m23959(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return m23958(cArr, i, i2);
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final boolean m23960(@InterfaceC6489 CharSequence charSequence, @InterfaceC6489 CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? C7628.m24037(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final boolean m23961(@InterfaceC6489 CharSequence charSequence, @InterfaceC6489 CharSequence charSequence2, boolean z) {
        return z ? C7628.m24036(charSequence, charSequence2) : m23960(charSequence, charSequence2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final boolean m23962(String str, CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final boolean m23963(String str, StringBuffer stringBuffer) {
        C5499.m17103(str, "<this>");
        C5499.m17103(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC6399
    @InterfaceC4372(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC7097(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final String m23964(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @InterfaceC6399
    @InterfaceC4372(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC7097(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @InterfaceC7470(version = "1.4")
    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5890
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final String m23965(@InterfaceC6399 String str, @InterfaceC6399 Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final String m23966(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return new String(bArr, C3794.f505);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final String m23967(@InterfaceC6399 byte[] bArr, int i, int i2, boolean z) {
        C5499.m17103(bArr, "<this>");
        AbstractC2986.f4328.m51(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, C3794.f505);
        }
        CharsetDecoder charsetDecoderNewDecoder = C3794.f505.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        C5499.m17102(string, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ String m23968(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m23967(bArr, i, i2, z);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final byte[] m23969(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        byte[] bytes = str.getBytes(C3794.f505);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final byte[] m23970(@InterfaceC6399 String str, int i, int i2, boolean z) throws CharacterCodingException {
        C5499.m17103(str, "<this>");
        AbstractC2986.f4328.m51(i, i2, str.length());
        if (!z) {
            String strSubstring = str.substring(i, i2);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C3794.f505;
            C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = C3794.f505.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            C5499.m17100(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                C5499.m17102(bArrArray2, "{\n        byteBuffer.array()\n    }");
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ byte[] m23971(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m23970(str, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static boolean m23972(@InterfaceC6399 String str, @InterfaceC6399 String str2, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "suffix");
        return !z ? str.endsWith(str2) : m23991(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m23973(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m23972(str, str2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static boolean m23974(@InterfaceC6489 String str, @InterfaceC6489 String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m23975(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m23974(str, str2, z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final String m23976(C7610 c7610, String str, Object... objArr) {
        C5499.m17103(c7610, "<this>");
        C5499.m17103(str, "format");
        C5499.m17103(objArr, "args");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C5499.m17102(str2, "format(format, *args)");
        return str2;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final String m23977(C7610 c7610, Locale locale, String str, Object... objArr) {
        C5499.m17103(c7610, "<this>");
        C5499.m17103(str, "format");
        C5499.m17103(objArr, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C5499.m17102(str2, "format(locale, format, *args)");
        return str2;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final String m23978(String str, Locale locale, Object... objArr) {
        C5499.m17103(str, "<this>");
        C5499.m17103(objArr, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C5499.m17102(str2, "format(locale, this, *args)");
        return str2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final String m23979(String str, Object... objArr) {
        C5499.m17103(str, "<this>");
        C5499.m17103(objArr, "args");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C5499.m17102(str2, "format(this, *args)");
        return str2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static Comparator<String> m23980(@InterfaceC6399 C7610 c7610) {
        C5499.m17103(c7610, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C5499.m17102(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final String m23981(String str) {
        C5499.m17103(str, "<this>");
        String strIntern = str.intern();
        C5499.m17102(strIntern, "this as java.lang.String).intern()");
        return strIntern;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final boolean m23982(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable iterableM24047 = C7628.m24047(charSequence);
            if (!(iterableM24047 instanceof Collection) || !((Collection) iterableM24047).isEmpty()) {
                Iterator it = iterableM24047.iterator();
                while (it.hasNext()) {
                    if (!C3791.m10465(charSequence.charAt(((AbstractC5455) it).mo471()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static final String m23983(String str) {
        C5499.m17103(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final String m23984(String str, Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final int m23985(String str, char c, int i) {
        C5499.m17103(str, "<this>");
        return str.indexOf(c, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final int m23986(String str, String str2, int i) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "str");
        return str.indexOf(str2, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final int m23987(String str, char c, int i) {
        C5499.m17103(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final int m23988(String str, String str2, int i) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final int m23989(String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final boolean m23990(@InterfaceC6399 CharSequence charSequence, int i, @InterfaceC6399 CharSequence charSequence2, int i2, int i3, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? m23991((String) charSequence, i, (String) charSequence2, i2, i3, z) : C7628.m24092(charSequence, i, charSequence2, i2, i3, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static boolean m23991(@InterfaceC6399 String str, int i, @InterfaceC6399 String str2, int i2, int i3, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m23992(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m23990(charSequence, i, charSequence2, i2, i3, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m23993(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m23991(str, i, str2, i2, i3, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static String m23994(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        AbstractC5455 abstractC5455M16967 = new C5458(1, i).iterator();
        while (abstractC5455M16967.hasNext()) {
            abstractC5455M16967.mo471();
            sb.append(charSequence);
        }
        String string = sb.toString();
        C5499.m17102(string, "{\n                    va…tring()\n                }");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final String m23995(@InterfaceC6399 String str, char c, char c2, boolean z) {
        C5499.m17103(str, "<this>");
        if (!z) {
            String strReplace = str.replace(c, c2);
            C5499.m17102(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (C3792.m10483(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final String m23996(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "oldValue");
        C5499.m17103(str3, "newValue");
        int i = 0;
        int iM24053 = C7628.m24053(str, str2, 0, z);
        if (iM24053 < 0) {
            return str;
        }
        int length = str2.length();
        int iM21661 = C7007.m21661(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iM24053);
            sb.append(str3);
            i = iM24053 + length;
            if (iM24053 >= str.length()) {
                break;
            }
            iM24053 = C7628.m24053(str, str2, iM24053 + iM21661, z);
        } while (iM24053 > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        C5499.m17102(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static /* synthetic */ String m23997(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m23995(str, c, c2, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ String m23998(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m23996(str, str2, str3, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢ۠ۢۥ.ۥ۟۠ۨۧ(java.lang.CharSequence, char, int, boolean, int, java.lang.Object):int */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final String m23999(@InterfaceC6399 String str, char c, char c2, boolean z) {
        C5499.m17103(str, "<this>");
        int iM24056 = C7628.m24056(str, c, 0, z, 2, null);
        return iM24056 < 0 ? str : C7628.m24126(str, iM24056, iM24056 + 1, String.valueOf(c2)).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final String m24000(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "oldValue");
        C5499.m17103(str3, "newValue");
        int iM24057 = C7628.m24057(str, str2, 0, z, 2, null);
        return iM24057 < 0 ? str : C7628.m24126(str, iM24057, str2.length() + iM24057, str3).toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ String m24001(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m23999(str, c, c2, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ String m24002(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m24000(str, str2, str3, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final List<String> m24003(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Pattern pattern, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(pattern, "regex");
        C7628.m24130(i);
        if (i == 0) {
            i = -1;
        }
        String[] strArrSplit = pattern.split(charSequence, i);
        C5499.m17102(strArrSplit, "regex.split(this, if (limit == 0) -1 else limit)");
        return C3404.m7069(strArrSplit);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ List m24004(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m24003(charSequence, pattern, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static boolean m24005(@InterfaceC6399 String str, @InterfaceC6399 String str2, int i, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "prefix");
        return !z ? str.startsWith(str2, i) : m23991(str, i, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static boolean m24006(@InterfaceC6399 String str, @InterfaceC6399 String str2, boolean z) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "prefix");
        return !z ? str.startsWith(str2) : m23991(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24007(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24005(str, str2, i, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24008(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24006(str, str2, z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final String m24009(String str, int i) {
        C5499.m17103(str, "<this>");
        String strSubstring = str.substring(i);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final String m24010(String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        String strSubstring = str.substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final byte[] m24011(String str, Charset charset) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m24012(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(str, "<this>");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final char[] m24013(String str) {
        C5499.m17103(str, "<this>");
        char[] charArray = str.toCharArray();
        C5499.m17102(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static final char[] m24014(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        AbstractC2986.f4328.m51(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final char[] m24015(String str, char[] cArr, int i, int i2, int i3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static /* synthetic */ char[] m24016(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m24014(str, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ char[] m24017(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        C5499.m17103(str, "<this>");
        C5499.m17103(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use lowercase() instead.", replaceWith = @InterfaceC7097(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final String m24018(String str) {
        C5499.m17103(str, "<this>");
        String lowerCase = str.toLowerCase();
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use lowercase() instead.", replaceWith = @InterfaceC7097(expression = "lowercase(locale)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static final String m24019(String str, Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final Pattern m24020(String str, int i) {
        C5499.m17103(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i);
        C5499.m17102(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static /* synthetic */ Pattern m24021(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        C5499.m17103(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i);
        C5499.m17102(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use uppercase() instead.", replaceWith = @InterfaceC7097(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final String m24022(String str) {
        C5499.m17103(str, "<this>");
        String upperCase = str.toUpperCase();
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC5438
    @InterfaceC4372(message = "Use uppercase() instead.", replaceWith = @InterfaceC7097(expression = "uppercase(locale)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final String m24023(String str, Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final String m24024(String str) {
        C5499.m17103(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final String m24025(String str, Locale locale) {
        C5499.m17103(str, "<this>");
        C5499.m17103(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
