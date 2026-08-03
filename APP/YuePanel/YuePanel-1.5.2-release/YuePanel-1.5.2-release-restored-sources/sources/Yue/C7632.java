package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
public class C7632 extends C7628 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۡ, reason: contains not printable characters */
    public static final char m24196(CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ Character m24197(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return C7633.m24293(charSequence);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m24198(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ Character m24199(CharSequence charSequence, Comparator comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        return C7633.m24295(charSequence, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ Character m24200(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return C7633.m24307(charSequence);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m24201(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ Character m24202(CharSequence charSequence, Comparator comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        return C7633.m24309(charSequence, comparator);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۡۥ, reason: contains not printable characters */
    public static final BigDecimal m24203(CharSequence charSequence, InterfaceC5124<? super Character, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۡۦ, reason: contains not printable characters */
    public static final BigInteger m24204(CharSequence charSequence, InterfaceC5124<? super Character, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡۧ, reason: contains not printable characters */
    public static final SortedSet<Character> m24205(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return (SortedSet) C7633.m24360(charSequence, new TreeSet());
    }
}
