package Yue;

import Yue.C4555;
import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
public final class C4558 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f969 = 1000000;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long f970 = 4611686018426999999L;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f9808 = 4611686018427387903L;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long f9809 = 4611686018426L;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m13539(long j, int i) {
        return C4555.m13395((j << 1) + ((long) i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m13540(long j) {
        return C4555.m13395((j << 1) + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m13541(long j) {
        return new C5883(-4611686018426L, f9809).m18199(j) ? m13542(m13586(j)) : m13540(C7007.m21677(j, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m13542(long j) {
        return C4555.m13395(j << 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m13543(long j) {
        return new C5883(-4611686018426999999L, f970).m18199(j) ? m13542(j) : m13540(m13587(j));
    }

    @InterfaceC4372(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ void m13547(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m13548(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13549(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m13553(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m13554(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m13555(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m13559(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13560(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m13561(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m13565(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m13566(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13567(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13571(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13572(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m13573(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ void m13577(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m13578(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m13579(long j) {
    }

    @InterfaceC4372(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m13583(double d) {
    }

    @InterfaceC4372(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m13584(int i) {
    }

    @InterfaceC4372(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @InterfaceC7097(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @InterfaceC4774
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m13585(long j) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final long m13586(long j) {
        return j * ((long) 1000000);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final long m13587(long j) {
        return j / ((long) 1000000);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final long m13588(String str, boolean z) {
        boolean z2;
        long jM13442;
        int i;
        boolean z3;
        int i2;
        String str2 = str;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        C4555.C0439 c0439 = C4555.f9803;
        long jM13508 = c0439.m13508();
        char cCharAt = str2.charAt(0);
        boolean z4 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z5 = length2 > 0;
        boolean z6 = z5 && C7628.m24147(str2, SignatureVisitor.SUPER, false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = '9';
        char c2 = '0';
        if (str2.charAt(length2) == 'P') {
            int i3 = length2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            boolean z7 = false;
            EnumC4559 enumC4559 = null;
            while (i3 < length) {
                if (str2.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (true) {
                        if (i4 >= str.length()) {
                            i2 = length;
                            break;
                        }
                        char cCharAt2 = str2.charAt(i4);
                        if (!new C3784(c2, c).m10385(cCharAt2)) {
                            i2 = length;
                            if (!C7628.m24034("+-.", cCharAt2, false, 2, null)) {
                                break;
                            }
                        } else {
                            i2 = length;
                        }
                        i4++;
                        length = i2;
                        c2 = '0';
                        c = '9';
                    }
                    C5499.m17101(str2, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str2.substring(i3, i4);
                    C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i3 + strSubstring.length();
                    if (length3 < 0 || length3 > C7628.m24048(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str2.charAt(length3);
                    i3 = length3 + 1;
                    EnumC4559 enumC4559M13602 = C4562.m13602(cCharAt3, z7);
                    if (enumC4559 != null && enumC4559.compareTo(enumC4559M13602) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iM24056 = C7628.m24056(strSubstring, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, false, 6, null);
                    if (enumC4559M13602 != EnumC4559.f9813 || iM24056 <= 0) {
                        jM13508 = C4555.m13442(jM13508, m13596(m13589(strSubstring), enumC4559M13602));
                    } else {
                        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iM24056);
                        C5499.m17102(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        long jM134422 = C4555.m13442(jM13508, m13596(m13589(strSubstring2), enumC4559M13602));
                        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iM24056);
                        C5499.m17102(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        jM13508 = C4555.m13442(jM134422, m13594(Double.parseDouble(strSubstring3), enumC4559M13602));
                    }
                    enumC4559 = enumC4559M13602;
                    length = i2;
                    c2 = '0';
                    c = '9';
                    z4 = true;
                    str2 = str;
                } else {
                    if (z7 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z7 = z4;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str3 = "Unexpected order of duration components";
            char c3 = '9';
            if (C7627.m23991(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM13508 = c0439.m13491();
            } else {
                boolean z8 = !z5;
                if (z5 && str.charAt(length2) == '(' && C7633.m24271(str) == ')') {
                    length2++;
                    int i5 = length - 1;
                    if (length2 == i5) {
                        throw new IllegalArgumentException("No components");
                    }
                    i = i5;
                    jM13442 = jM13508;
                    z3 = false;
                    z2 = true;
                } else {
                    z2 = z8;
                    jM13442 = jM13508;
                    i = length;
                    z3 = false;
                }
                EnumC4559 enumC45592 = null;
                while (length2 < i) {
                    if (z3 && z2) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i6 = length2;
                    while (i6 < str.length()) {
                        char cCharAt4 = str.charAt(i6);
                        if (!new C3784('0', c3).m10385(cCharAt4) && cCharAt4 != '.') {
                            break;
                        }
                        i6++;
                    }
                    C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i6);
                    C5499.m17102(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i7 = length4;
                    while (i7 < str.length()) {
                        if (!new C3784('a', 'z').m10385(str.charAt(i7))) {
                            break;
                        }
                        i7++;
                    }
                    C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i7);
                    C5499.m17102(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                    length2 = length4 + strSubstring5.length();
                    EnumC4559 enumC4559M13603 = C4562.m13603(strSubstring5);
                    if (enumC45592 != null && enumC45592.compareTo(enumC4559M13603) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    String str4 = str3;
                    int iM240562 = C7628.m24056(strSubstring4, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, false, 6, null);
                    if (iM240562 > 0) {
                        C5499.m17101(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iM240562);
                        C5499.m17102(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
                        long jM134423 = C4555.m13442(jM13442, m13596(Long.parseLong(strSubstring6), enumC4559M13603));
                        C5499.m17101(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iM240562);
                        C5499.m17102(strSubstring7, "this as java.lang.String).substring(startIndex)");
                        jM13442 = C4555.m13442(jM134423, m13594(Double.parseDouble(strSubstring7), enumC4559M13603));
                        if (length2 < i) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM13442 = C4555.m13442(jM13442, m13596(Long.parseLong(strSubstring4), enumC4559M13603));
                    }
                    str3 = str4;
                    enumC45592 = enumC4559M13603;
                    z3 = true;
                    c3 = '9';
                }
                jM13508 = jM13442;
            }
        }
        return z6 ? C4555.m13459(jM13508) : jM13508;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final long m13589(String str) {
        int length = str.length();
        int i = (length <= 0 || !C7628.m24034("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable c5458 = new C5458(i, C7628.m24048(str));
            if (!(c5458 instanceof Collection) || !((Collection) c5458).isEmpty()) {
                Iterator it = c5458.iterator();
                while (it.hasNext()) {
                    if (!new C3784('0', '9').m10385(str.charAt(((AbstractC5455) it).mo471()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (C7627.m24008(str, InterfaceC5949.f14893, false, 2, null)) {
            str = C7633.m24226(str, 1);
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int m13590(String str, int i, InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        while (i < str.length() && interfaceC5124.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final String m13591(String str, int i, InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        int i2 = i;
        while (i2 < str.length() && interfaceC5124.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final long m13592(double d, long j) {
        return C4555.m13443(j, d);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final long m13593(int i, long j) {
        return C4555.m13444(j, i);
    }

    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final long m13594(double d, @InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        double dM1509 = C4561.m1509(d, enumC4559, EnumC4559.f9810);
        if (!(!Double.isNaN(dM1509))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jM18816 = C6131.m18816(dM1509);
        return new C5883(-4611686018426999999L, f970).m18199(jM18816) ? m13542(jM18816) : m13541(C6131.m18816(C4561.m1509(d, enumC4559, EnumC4559.f9812)));
    }

    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final long m13595(int i, @InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        return enumC4559.compareTo(EnumC4559.f9813) <= 0 ? m13542(C4561.m13599(i, enumC4559, EnumC4559.f9810)) : m13596(i, enumC4559);
    }

    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final long m13596(long j, @InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        EnumC4559 enumC45592 = EnumC4559.f9810;
        long jM13599 = C4561.m13599(f970, enumC45592, enumC4559);
        return new C5883(-jM13599, jM13599).m18199(j) ? m13542(C4561.m13599(j, enumC4559, enumC45592)) : m13540(C7007.m21677(C4561.m1510(j, enumC4559, EnumC4559.f9812), -4611686018427387903L, 4611686018427387903L));
    }
}
