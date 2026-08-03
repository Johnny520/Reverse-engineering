package Yue;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3530 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7745 f5987;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final char f5988 = 8234;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final char f5989 = 8235;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final char f5990 = 8236;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final char f5991 = 8206;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final char f5992 = 8207;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f5993;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f5994;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f5995 = "";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f5996 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f5997 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C3530 f5998;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final C3530 f5999;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f6000 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f6001 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f6002 = 1;

    /* JADX INFO: renamed from: ۥ */
    public final boolean f366;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f367;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC7745 f6003;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۨ$ۥ۟ */
    public static class C0172 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f6005 = 1792;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final byte[] f6006 = new byte[f6005];

        /* JADX INFO: renamed from: ۥ */
        public final CharSequence f370;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f371;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f6007;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f6008;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public char f6009;

        static {
            for (int i = 0; i < 1792; i++) {
                f6006[i] = Character.getDirectionality(i);
            }
        }

        public C0172(CharSequence charSequence, boolean z) {
            this.f370 = charSequence;
            this.f371 = z;
            this.f6007 = charSequence.length();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static byte m9478(char c) {
            return c < 1792 ? f6006[c] : Character.getDirectionality(c);
        }

        /* JADX INFO: renamed from: ۥ */
        public byte m601() {
            char cCharAt = this.f370.charAt(this.f6008 - 1);
            this.f6009 = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f370, this.f6008);
                this.f6008 -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f6008--;
            byte bM9478 = m9478(this.f6009);
            if (!this.f371) {
                return bM9478;
            }
            char c = this.f6009;
            return c == '>' ? m9483() : c == ';' ? m9481() : bM9478;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public byte m602() {
            char cCharAt = this.f370.charAt(this.f6008);
            this.f6009 = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f370, this.f6008);
                this.f6008 += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f6008++;
            byte bM9478 = m9478(this.f6009);
            if (!this.f371) {
                return bM9478;
            }
            char c = this.f6009;
            return c == '<' ? m9484() : c == '&' ? m9482() : bM9478;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m9479() {
            this.f6008 = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f6008 < this.f6007 && i == 0) {
                byte bM602 = m602();
                if (bM602 != 0) {
                    if (bM602 == 1 || bM602 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bM602 != 9) {
                        switch (bM602) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f6008 > 0) {
                switch (m601()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m9480() {
            this.f6008 = this.f6007;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f6008 > 0) {
                    byte bM601 = m601();
                    if (bM601 == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bM601 == 1 || bM601 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bM601 != 9) {
                        switch (bM601) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final byte m9481() {
            char cCharAt;
            int i = this.f6008;
            do {
                int i2 = this.f6008;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f370;
                int i3 = i2 - 1;
                this.f6008 = i3;
                cCharAt = charSequence.charAt(i3);
                this.f6009 = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f6008 = i;
            this.f6009 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
            return (byte) 13;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final byte m9482() {
            char cCharAt;
            do {
                int i = this.f6008;
                if (i >= this.f6007) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f370;
                this.f6008 = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f6009 = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final byte m9483() {
            char cCharAt;
            int i = this.f6008;
            while (true) {
                int i2 = this.f6008;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f370;
                int i3 = i2 - 1;
                this.f6008 = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f6009 = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f6008;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f370;
                            int i5 = i4 - 1;
                            this.f6008 = i5;
                            cCharAt = charSequence2.charAt(i5);
                            this.f6009 = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f6008 = i;
            this.f6009 = C8039.f23876;
            return (byte) 13;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final byte m9484() {
            char cCharAt;
            int i = this.f6008;
            while (true) {
                int i2 = this.f6008;
                if (i2 >= this.f6007) {
                    this.f6008 = i;
                    this.f6009 = C8039.f23875;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f370;
                this.f6008 = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f6009 = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f6008;
                        if (i3 < this.f6007) {
                            CharSequence charSequence2 = this.f370;
                            this.f6008 = i3 + 1;
                            cCharAt = charSequence2.charAt(i3);
                            this.f6009 = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        InterfaceC7745 interfaceC7745 = C7746.f23282;
        f5987 = interfaceC7745;
        f5993 = Character.toString(f5991);
        f5994 = Character.toString(f5992);
        f5998 = new C3530(false, 2, interfaceC7745);
        f5999 = new C3530(true, 2, interfaceC7745);
    }

    public C3530(boolean z, int i, InterfaceC7745 interfaceC7745) {
        this.f366 = z;
        this.f367 = i;
        this.f6003 = interfaceC7745;
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m597(CharSequence charSequence) {
        return new C0172(charSequence, false).m9479();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m598(CharSequence charSequence) {
        return new C0172(charSequence, false).m9480();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C3530 m9457() {
        return new C0171().m600();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C3530 m9458(Locale locale) {
        return new C0171(locale).m600();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3530 m9459(boolean z) {
        return new C0171(z).m600();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m9460(Locale locale) {
        return C7758.m3849(locale) == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m9461() {
        return (this.f367 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m9462(CharSequence charSequence) {
        return this.f6003.mo3841(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m9463(String str) {
        return m9462(str);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m9464() {
        return this.f366;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final String m9465(CharSequence charSequence, InterfaceC7745 interfaceC7745) {
        boolean zMo3841 = interfaceC7745.mo3841(charSequence, 0, charSequence.length());
        return (this.f366 || !(zMo3841 || m598(charSequence) == 1)) ? this.f366 ? (!zMo3841 || m598(charSequence) == -1) ? f5994 : "" : "" : f5993;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final String m9466(CharSequence charSequence, InterfaceC7745 interfaceC7745) {
        boolean zMo3841 = interfaceC7745.mo3841(charSequence, 0, charSequence.length());
        return (this.f366 || !(zMo3841 || m597(charSequence) == 1)) ? this.f366 ? (!zMo3841 || m597(charSequence) == -1) ? f5994 : "" : "" : f5993;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public CharSequence m9467(CharSequence charSequence) {
        return m9469(charSequence, this.f6003, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public CharSequence m9468(CharSequence charSequence, InterfaceC7745 interfaceC7745) {
        return m9469(charSequence, interfaceC7745, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public CharSequence m9469(CharSequence charSequence, InterfaceC7745 interfaceC7745, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo3841 = interfaceC7745.mo3841(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m9461() && z) {
            spannableStringBuilder.append((CharSequence) m9466(charSequence, zMo3841 ? C7746.f3058 : C7746.f3057));
        }
        if (zMo3841 != this.f366) {
            spannableStringBuilder.append(zMo3841 ? f5989 : f5988);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f5990);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m9465(charSequence, zMo3841 ? C7746.f3058 : C7746.f3057));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public CharSequence m9470(CharSequence charSequence, boolean z) {
        return m9469(charSequence, this.f6003, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public String m9471(String str) {
        return m9473(str, this.f6003, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public String m9472(String str, InterfaceC7745 interfaceC7745) {
        return m9473(str, interfaceC7745, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public String m9473(String str, InterfaceC7745 interfaceC7745, boolean z) {
        if (str == null) {
            return null;
        }
        return m9469(str, interfaceC7745, z).toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m9474(String str, boolean z) {
        return m9473(str, this.f6003, z);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۨ$ۥ */
    public static final class C0171 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f368;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f369;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InterfaceC7745 f6004;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0171() {
            m9475(C3530.m9460(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static C3530 m599(boolean z) {
            return z ? C3530.f5999 : C3530.f5998;
        }

        /* JADX INFO: renamed from: ۥ */
        public C3530 m600() {
            return (this.f369 == 2 && this.f6004 == C3530.f5987) ? m599(this.f368) : new C3530(this.f368, this.f369, this.f6004);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m9475(boolean z) {
            this.f368 = z;
            this.f6004 = C3530.f5987;
            this.f369 = 2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C0171 m9476(InterfaceC7745 interfaceC7745) {
            this.f6004 = interfaceC7745;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C0171 m9477(boolean z) {
            if (z) {
                this.f369 |= 2;
            } else {
                this.f369 &= -3;
            }
            return this;
        }

        public C0171(boolean z) {
            m9475(z);
        }

        public C0171(Locale locale) {
            m9475(C3530.m9460(locale));
        }
    }
}
