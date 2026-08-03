package Yue;

import Yue.AbstractC7853;
import java.util.Arrays;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7865 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final char f23517 = 65533;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final char[] f23518;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f23519 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int[] f23520;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23521 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f23522 = false;

    /* JADX INFO: renamed from: ۥ */
    public final C3787 f3123;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C6614 f3124;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AbstractC7853.C7859 f23529;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final AbstractC7853.C7858 f23530;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public AbstractC7853.AbstractC7860 f23531;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public String f23535;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public String f23536;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f23537;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public EnumC7866 f23523 = EnumC7866.f23541;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC7853 f23524 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f23525 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String f23526 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final StringBuilder f23527 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final StringBuilder f23528 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final AbstractC7853.C7854 f23532 = new AbstractC7853.C7854();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final AbstractC7853.C7856 f23533 = new AbstractC7853.C7856();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final AbstractC7853.C7855 f23534 = new AbstractC7853.C7855();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f23538 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final int[] f23539 = new int[1];

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int[] f23540 = new int[2];

    /* JADX INFO: renamed from: Yue.ۥۢۡۧۤ$ۥ */
    public static /* synthetic */ class C1381 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3125;

        static {
            int[] iArr = new int[EnumC7866.values().length];
            f3125 = iArr;
            try {
                iArr[EnumC7866.f23548.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3125[EnumC7866.f23541.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', C8039.f23875, C8039.f23874};
        f23518 = cArr;
        f23520 = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArr);
    }

    public C7865(AbstractC7998 abstractC7998) {
        AbstractC7853.C7859 c7859 = new AbstractC7853.C7859(abstractC7998);
        this.f23529 = c7859;
        this.f23531 = c7859;
        this.f23530 = new AbstractC7853.C7858(abstractC7998);
        this.f3123 = abstractC7998.f3184;
        this.f3124 = abstractC7998.f3183.m3085();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m25000() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3945(EnumC7866 enumC7866) {
        m25025(enumC7866);
        this.f3123.m834();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3946() {
        return this.f23535;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m25001() {
        if (this.f23536 == null) {
            this.f23536 = "</" + this.f23535;
        }
        return this.f23536;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m25002(String str, Object... objArr) {
        if (this.f3124.m20989()) {
            this.f3124.add(new C6613(this.f3123, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int[] m25003(Character ch, boolean z) {
        int iIntValue;
        if (this.f3123.m10413()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f3123.m10412()) || this.f3123.m10425(f23518)) {
            return null;
        }
        int[] iArr = this.f23539;
        this.f3123.m10419();
        if (this.f3123.m10420("#")) {
            boolean zM10421 = this.f3123.m10421("X");
            C3787 c3787 = this.f3123;
            String strM10401 = zM10421 ? c3787.m10401() : c3787.m10400();
            if (strM10401.length() == 0) {
                m25002("numeric reference with no numerals", new Object[0]);
                this.f3123.m10436();
                return null;
            }
            this.f3123.m10440();
            if (!this.f3123.m10420(";")) {
                m25002("missing semicolon on [&#%s]", strM10401);
            }
            try {
                iIntValue = Integer.valueOf(strM10401, zM10421 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || iIntValue > 1114111) {
                m25002("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr2 = f23520;
                    if (iIntValue < iArr2.length + 128) {
                        m25002("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = iArr2[iIntValue - 128];
                    }
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        String strM10403 = this.f3123.m10403();
        boolean zM10422 = this.f3123.m10422(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        if (!C4645.m13971(strM10403) && (!C4645.m13972(strM10403) || !zM10422)) {
            this.f3123.m10436();
            if (zM10422) {
                m25002("invalid named reference [%s]", strM10403);
            }
            return null;
        }
        if (z && (this.f3123.m10429() || this.f3123.m10427() || this.f3123.m10424(SignatureVisitor.INSTANCEOF, SignatureVisitor.SUPER, '_'))) {
            this.f3123.m10436();
            return null;
        }
        this.f3123.m10440();
        if (!this.f3123.m10420(";")) {
            m25002("missing semicolon on [&%s]", strM10403);
        }
        int iM13966 = C4645.m13966(strM10403, this.f23540);
        if (iM13966 == 1) {
            iArr[0] = this.f23540[0];
            return iArr;
        }
        if (iM13966 == 2) {
            return this.f23540;
        }
        C8159.m26899("Unexpected characters returned for " + strM10403);
        return this.f23540;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m25004() {
        this.f23534.mo24935();
        this.f23534.f23482 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m25005() {
        this.f23534.mo24935();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m25006() {
        this.f23533.mo24935();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public AbstractC7853.AbstractC7860 m25007(boolean z) {
        AbstractC7853.AbstractC7860 abstractC7860Mo24935 = z ? this.f23529.mo24935() : this.f23530.mo24935();
        this.f23531 = abstractC7860Mo24935;
        return abstractC7860Mo24935;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m25008() {
        AbstractC7853.m24920(this.f23528);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m25009(char c) {
        if (this.f23526 == null) {
            this.f23526 = String.valueOf(c);
        } else {
            if (this.f23527.length() == 0) {
                this.f23527.append(this.f23526);
            }
            this.f23527.append(c);
        }
        this.f23532.m24937(this.f23538);
        this.f23532.m24927(this.f3123.m10432());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m25010(AbstractC7853 abstractC7853) {
        C8159.m26901(this.f23525);
        this.f23524 = abstractC7853;
        this.f23525 = true;
        abstractC7853.m24937(this.f23537);
        abstractC7853.m24927(this.f3123.m10432());
        this.f23538 = -1;
        AbstractC7853.EnumC7861 enumC7861 = abstractC7853.f23476;
        if (enumC7861 == AbstractC7853.EnumC7861.StartTag) {
            this.f23535 = ((AbstractC7853.C7859) abstractC7853).f23490;
            this.f23536 = null;
        } else if (enumC7861 == AbstractC7853.EnumC7861.EndTag) {
            AbstractC7853.C7858 c7858 = (AbstractC7853.C7858) abstractC7853;
            if (c7858.m24965()) {
                m25021("Attributes incorrectly present on end tag [/%s]", c7858.m24970());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m25011(String str) {
        if (this.f23526 == null) {
            this.f23526 = str;
        } else {
            if (this.f23527.length() == 0) {
                this.f23527.append(this.f23526);
            }
            this.f23527.append(str);
        }
        this.f23532.m24937(this.f23538);
        this.f23532.m24927(this.f3123.m10432());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m25012(StringBuilder sb) {
        if (this.f23526 == null) {
            this.f23526 = sb.toString();
        } else {
            if (this.f23527.length() == 0) {
                this.f23527.append(this.f23526);
            }
            this.f23527.append((CharSequence) sb);
        }
        this.f23532.m24937(this.f23538);
        this.f23532.m24927(this.f3123.m10432());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m25013(char[] cArr) {
        m25011(String.valueOf(cArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m25014(int[] iArr) {
        m25011(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m25015() {
        m25010(this.f23534);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m25016() {
        m25010(this.f23533);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m25017() {
        this.f23531.m24962();
        m25010(this.f23531);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m25018(EnumC7866 enumC7866) {
        if (this.f3124.m20989()) {
            this.f3124.add(new C6613(this.f3123, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC7866));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m25019(EnumC7866 enumC7866) {
        if (this.f3124.m20989()) {
            C6614 c6614 = this.f3124;
            C3787 c3787 = this.f3123;
            c6614.add(new C6613(c3787, "Unexpected character '%s' in input state [%s]", Character.valueOf(c3787.m10412()), enumC7866));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m25020(String str) {
        if (this.f3124.m20989()) {
            this.f3124.add(new C6613(this.f3123, str));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m25021(String str, Object... objArr) {
        if (this.f3124.m20989()) {
            this.f3124.add(new C6613(this.f3123, str, objArr));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public EnumC7866 m25022() {
        return this.f23523;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m25023() {
        return this.f23535 != null && this.f23531.m24968().equalsIgnoreCase(this.f23535);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public AbstractC7853 m25024() {
        while (!this.f23525) {
            this.f23523.mo25038(this, this.f3123);
        }
        StringBuilder sb = this.f23527;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            AbstractC7853.C7854 c7854M24940 = this.f23532.m24940(string);
            this.f23526 = null;
            return c7854M24940;
        }
        String str = this.f23526;
        if (str == null) {
            this.f23525 = false;
            return this.f23524;
        }
        AbstractC7853.C7854 c7854M249402 = this.f23532.m24940(str);
        this.f23526 = null;
        return c7854M249402;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m25025(EnumC7866 enumC7866) {
        int i = C1381.f3125[enumC7866.ordinal()];
        if (i == 1) {
            this.f23537 = this.f3123.m10432();
        } else if (i == 2 && this.f23538 == -1) {
            this.f23538 = this.f3123.m10432();
        }
        this.f23523 = enumC7866;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public String m25026(boolean z) {
        StringBuilder sbM3765 = C7615.m3765();
        while (!this.f3123.m10413()) {
            sbM3765.append(this.f3123.m10406(C8039.f23874));
            if (this.f3123.m10422(C8039.f23874)) {
                this.f3123.m10397();
                int[] iArrM25003 = m25003(null, z);
                if (iArrM25003 == null || iArrM25003.length == 0) {
                    sbM3765.append(C8039.f23874);
                } else {
                    sbM3765.appendCodePoint(iArrM25003[0]);
                    if (iArrM25003.length == 2) {
                        sbM3765.appendCodePoint(iArrM25003[1]);
                    }
                }
            }
        }
        return C7615.m23825(sbM3765);
    }
}
