package Yue;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4662 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ */
    public static final class C0466 extends AbstractC4662 {
        public String toString() {
            return InterfaceC5949.f14892;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 10;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟ */
    public static final class C0467 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1041;

        public C0467(String str) {
            this.f1041 = str;
        }

        public String toString() {
            return String.format("[%s]", this.f1041);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1041);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC4663 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1042;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f1043;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC4663(String str, String str2) {
            this(str, str2, true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC4663(String str, String str2, boolean z) {
            C8159.m26907(str);
            C8159.m26907(str2);
            this.f1042 = C6396.m2840(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.f1043 = z ? C6396.m2840(str2) : C6396.m19949(str2, z2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4664 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1044;

        public C4664(String str) {
            C8159.m26910(str);
            this.f1044 = C6396.m2839(str);
        }

        public String toString() {
            return String.format("[^%s]", this.f1044);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 6;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            Iterator<C3454> it = c46052.mo13685().m9189().iterator();
            while (it.hasNext()) {
                if (C6396.m2839(it.next().getKey()).startsWith(this.f1044)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4665 extends AbstractC4663 {
        public C4665(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s=%s]", this.f1042, this.f1043);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 3;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1042) && this.f1043.equalsIgnoreCase(c46052.mo17594(this.f1042).trim());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4666 extends AbstractC4663 {
        public C4666(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f1042, this.f1043);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 6;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1042) && C6396.m2839(c46052.mo17594(this.f1042)).contains(this.f1043);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4667 extends AbstractC4663 {
        public C4667(String str, String str2) {
            super(str, str2, false);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f1042, this.f1043);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 4;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1042) && C6396.m2839(c46052.mo17594(this.f1042)).endsWith(this.f1043);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4668 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1045;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Pattern f1046;

        public C4668(String str, Pattern pattern) {
            this.f1045 = C6396.m2840(str);
            this.f1046 = pattern;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f1045, this.f1046.toString());
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 8;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1045) && this.f1046.matcher(c46052.mo17594(this.f1045)).find();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C4669 extends AbstractC4663 {
        public C4669(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f1042, this.f1043);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 3;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return !this.f1043.equalsIgnoreCase(c46052.mo17594(this.f1042));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C4670 extends AbstractC4663 {
        public C4670(String str, String str2) {
            super(str, str2, false);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f1042, this.f1043);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 4;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo17595(this.f1042) && C6396.m2839(c46052.mo17594(this.f1042)).startsWith(this.f1043);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class C4671 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1047;

        public C4671(String str) {
            this.f1047 = str;
        }

        public String toString() {
            return String.format(".%s", this.f1047);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 6;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m13771(this.f1047);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final class C4672 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1048;

        public C4672(String str) {
            this.f1048 = C6396.m2839(str);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f1048);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return C6396.m2839(c46052.m13733()).contains(this.f1048);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C4673 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1049;

        public C4673(String str) {
            this.f1049 = C6396.m2839(C7615.m23822(str));
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f1049);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return C6396.m2839(c46052.m13789()).contains(this.f1049);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final class C4674 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1050;

        public C4674(String str) {
            this.f1050 = C6396.m2839(C7615.m23822(str));
        }

        public String toString() {
            return String.format(":contains(%s)", this.f1050);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 10;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return C6396.m2839(c46052.m13817()).contains(this.f1050);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠, reason: contains not printable characters */
    public static final class C4675 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1051;

        public C4675(String str) {
            this.f1051 = str;
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.f1051);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m13823().contains(this.f1051);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static final class C4676 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1052;

        public C4676(String str) {
            this.f1052 = str;
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.f1052);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 10;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m13824().contains(this.f1052);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final class C4678 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1055;

        public C4678(String str) {
            this.f1055 = str;
        }

        public String toString() {
            return String.format("#%s", this.f1055);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f1055.equals(c46052.m13776());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final class C4679 extends AbstractC4680 {
        public C4679(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f1056));
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m13738() == this.f1056;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC4680 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final int f1056;

        public AbstractC4680(int i) {
            this.f1056 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final class C4681 extends AbstractC4680 {
        public C4681(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f1056));
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m13738() > this.f1056;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final class C4682 extends AbstractC4680 {
        public C4682(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f1056));
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c4605 != c46052 && c46052.m13738() < this.f1056;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final class C4683 extends AbstractC4662 {
        public String toString() {
            return ":empty";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            for (AbstractC6381 abstractC6381 : c46052.m19903()) {
                if (abstractC6381 instanceof C7755) {
                    return ((C7755) abstractC6381).m24632();
                }
                if (!(abstractC6381 instanceof C3929) && !(abstractC6381 instanceof C8566) && !(abstractC6381 instanceof C4486)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final class C4684 extends AbstractC4662 {
        public String toString() {
            return ":first-child";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            return (c4605Mo13701 == null || (c4605Mo13701 instanceof C4483) || c46052 != c4605Mo13701.m13744()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final class C4685 extends C4691 {
        public C4685() {
            super(0, 1);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        public String toString() {
            return ":first-of-type";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ, reason: contains not printable characters */
    public static final class C4686 extends AbstractC4662 {
        public String toString() {
            return ":last-child";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            return (c4605Mo13701 == null || (c4605Mo13701 instanceof C4483) || c46052 != c4605Mo13701.m13784()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final class C4687 extends C4690 {
        public C4687() {
            super(0, 1);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        public String toString() {
            return ":last-of-type";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final class C4688 extends AbstractC4677 {
        public C4688(int i, int i2) {
            super(i, i2);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo14005(C4605 c4605, C4605 c46052) {
            return c46052.m13738() + 1;
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public String mo14006() {
            return "nth-child";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final class C4689 extends AbstractC4677 {
        public C4689(int i, int i2) {
            super(i, i2);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo14005(C4605 c4605, C4605 c46052) {
            if (c46052.mo13701() == null) {
                return 0;
            }
            return c46052.mo13701().m13724() - c46052.m13738();
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public String mo14006() {
            return "nth-last-child";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static class C4690 extends AbstractC4677 {
        public C4690(int i, int i2) {
            super(i, i2);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo14005(C4605 c4605, C4605 c46052) {
            int i = 0;
            if (c46052.mo13701() == null) {
                return 0;
            }
            for (C4605 c4605M13786 = c46052; c4605M13786 != null; c4605M13786 = c4605M13786.m13786()) {
                if (c4605M13786.mo13700().equals(c46052.mo13700())) {
                    i++;
                }
            }
            return i;
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public String mo14006() {
            return "nth-last-of-type";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static class C4691 extends AbstractC4677 {
        public C4691(int i, int i2) {
            super(i, i2);
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo14005(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            if (c4605Mo13701 == null) {
                return 0;
            }
            int iMo13689 = c4605Mo13701.mo13689();
            int i = 0;
            for (int i2 = 0; i2 < iMo13689; i2++) {
                AbstractC6381 abstractC6381M19902 = c4605Mo13701.m19902(i2);
                if (abstractC6381M19902.mo13700().equals(c46052.mo13700())) {
                    i++;
                }
                if (abstractC6381M19902 == c46052) {
                    break;
                }
            }
            return i;
        }

        @Override // Yue.AbstractC4662.AbstractC4677
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public String mo14006() {
            return "nth-of-type";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final class C4692 extends AbstractC4662 {
        public String toString() {
            return ":only-child";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            return (c4605Mo13701 == null || (c4605Mo13701 instanceof C4483) || !c46052.m13811().isEmpty()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final class C4693 extends AbstractC4662 {
        public String toString() {
            return ":only-of-type";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            if (c4605Mo13701 == null || (c4605Mo13701 instanceof C4483)) {
                return false;
            }
            int i = 0;
            for (C4605 c4605M13744 = c4605Mo13701.m13744(); c4605M13744 != null; c4605M13744 = c4605M13744.m13786()) {
                if (c4605M13744.mo13700().equals(c46052.mo13700())) {
                    i++;
                }
                if (i > 1) {
                    break;
                }
            }
            return i == 1;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final class C4694 extends AbstractC4662 {
        public String toString() {
            return ":root";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 1;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            if (c4605 instanceof C4483) {
                c4605 = c4605.m13744();
            }
            return c46052 == c4605;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final class C4695 extends AbstractC4662 {
        public String toString() {
            return ":matchText";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return -1;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            if (c46052 instanceof C6838) {
                return true;
            }
            for (C7755 c7755 : c46052.m13818()) {
                C6838 c6838 = new C6838(C7719.m24546(c46052.m13816(), c46052.m13813().m24557(), C6616.f16979), c46052.mo13686(), c46052.mo13685());
                c7755.m19927(c6838);
                c6838.m13710(c7755);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final class C4696 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final Pattern f1057;

        public C4696(Pattern pattern) {
            this.f1057 = pattern;
        }

        public String toString() {
            return String.format(":matches(%s)", this.f1057);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 8;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f1057.matcher(c46052.m13817()).find();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ, reason: contains not printable characters */
    public static final class C4697 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final Pattern f1058;

        public C4697(Pattern pattern) {
            this.f1058 = pattern;
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f1058);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 7;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f1058.matcher(c46052.m13789()).find();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final class C4698 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final Pattern f1059;

        public C4698(Pattern pattern) {
            this.f1059 = pattern;
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.f1059);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 7;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f1059.matcher(c46052.m13823()).find();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final class C4699 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final Pattern f1060;

        public C4699(Pattern pattern) {
            this.f1060 = pattern;
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.f1060);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 8;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f1060.matcher(c46052.m13824()).find();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final class C4700 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1061;

        public C4700(String str) {
            this.f1061 = str;
        }

        public String toString() {
            return String.format("%s", this.f1061);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 1;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.m19913(this.f1061);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final class C4701 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1062;

        public C4701(String str) {
            this.f1062 = str;
        }

        public String toString() {
            return String.format("%s", this.f1062);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c46052.mo13700().endsWith(this.f1062);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Predicate<C4605> m1617(final C4605 c4605) {
        return new Predicate() { // from class: Yue.ۥۣ۠ۡ۠
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f1039.m14004(c4605, (C4605) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo11185() {
        return 5;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: merged with bridge method [inline-methods] */
    public abstract boolean m14004(C4605 c4605, C4605 c46052);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo11186() {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static abstract class AbstractC4677 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final int f1053;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1054;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC4677(int i, int i2) {
            this.f1053 = i;
            this.f1054 = i2;
        }

        public String toString() {
            return this.f1053 == 0 ? String.format(":%s(%d)", mo14006(), Integer.valueOf(this.f1054)) : this.f1054 == 0 ? String.format(":%s(%dn)", mo14006(), Integer.valueOf(this.f1053)) : String.format(":%s(%dn%+d)", mo14006(), Integer.valueOf(this.f1053), Integer.valueOf(this.f1054));
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701 = c46052.mo13701();
            if (c4605Mo13701 == null || (c4605Mo13701 instanceof C4483)) {
                return false;
            }
            int iMo14005 = mo14005(c4605, c46052);
            int i = this.f1053;
            if (i == 0) {
                return iMo14005 == this.f1054;
            }
            int i2 = this.f1054;
            return (iMo14005 - i2) * i >= 0 && (iMo14005 - i2) % i == 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public abstract int mo14005(C4605 c4605, C4605 c46052);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public abstract String mo14006();

        public AbstractC4677(int i) {
            this(0, i);
        }
    }
}
