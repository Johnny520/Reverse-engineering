package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
public class C3792 extends C3791 {
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final char m10477(int i) {
        if (new C5458(0, 9).m16971(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException("Int " + i + " is not a decimal digit");
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final char m10478(int i, int i2) {
        if (!new C5458(2, 36).m16971(i2)) {
            throw new IllegalArgumentException("Invalid radix: " + i2 + ". Valid radix values are in range 2..36");
        }
        if (i >= 0 && i < i2) {
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i + " does not represent a valid digit in radix " + i2);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int m10479(char c) {
        int iM837 = C3791.m837(c, 10);
        if (iM837 >= 0) {
            return iM837;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int m10480(char c, int i) {
        Integer numM10482 = m10482(c, i);
        if (numM10482 != null) {
            return numM10482.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final Integer m10481(char c) {
        Integer numValueOf = Integer.valueOf(C3791.m837(c, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final Integer m10482(char c, int i) {
        C3791.m836(i);
        Integer numValueOf = Integer.valueOf(C3791.m837(c, i));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final boolean m10483(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10484(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m10483(c, c2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final boolean m10485(char c) {
        return new C3784((char) 55296, (char) 57343).m10385(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final String m10486(char c, String str) {
        C5499.m17103(str, "other");
        return c + str;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final String m10487(char c) {
        return C8583.m4553(c);
    }
}
