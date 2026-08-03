package Yue;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7746 {

    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7745 f3057 = new C7749(null, false);

    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC7745 f3058 = new C7749(null, true);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC7745 f23282;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7745 f23283;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7745 f23284;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7745 f23285;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23286 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f23287 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f23288 = 2;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ */
    public static class C1343 implements InterfaceC7747 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final C1343 f3059 = new C1343(true);

        /* JADX INFO: renamed from: ۥ */
        public final boolean f3060;

        public C1343(boolean z) {
            this.f3060 = z;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0023 */
        @Override // Yue.C7746.InterfaceC7747
        /* JADX INFO: renamed from: ۥ */
        public int mo3844(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iM3842 = C7746.m3842(Character.getDirectionality(charSequence.charAt(i)));
                if (iM3842 != 0) {
                    if (iM3842 != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f3060) {
                        return 1;
                    }
                } else if (this.f3060) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f3060 ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟ */
    public static class C1344 implements InterfaceC7747 {

        /* JADX INFO: renamed from: ۥ */
        public static final C1344 f3061 = new C1344();

        @Override // Yue.C7746.InterfaceC7747
        /* JADX INFO: renamed from: ۥ */
        public int mo3844(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iM3843 = 2;
            while (i < i3 && iM3843 == 2) {
                iM3843 = C7746.m3843(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iM3843;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7747 {
        /* JADX INFO: renamed from: ۥ */
        int mo3844(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7748 implements InterfaceC7745 {

        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC7747 f3062;

        public AbstractC7748(InterfaceC7747 interfaceC7747) {
            this.f3062 = interfaceC7747;
        }

        @Override // Yue.InterfaceC7745
        /* JADX INFO: renamed from: ۥ */
        public boolean mo3840(char[] cArr, int i, int i2) {
            return mo3841(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // Yue.InterfaceC7745
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo3841(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f3062 == null ? mo24625() : m24626(charSequence, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract boolean mo24625();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m24626(CharSequence charSequence, int i, int i2) {
            int iMo3844 = this.f3062.mo3844(charSequence, i, i2);
            if (iMo3844 == 0) {
                return true;
            }
            if (iMo3844 != 1) {
                return mo24625();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7749 extends AbstractC7748 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f3063;

        public C7749(InterfaceC7747 interfaceC7747, boolean z) {
            super(interfaceC7747);
            this.f3063 = z;
        }

        @Override // Yue.C7746.AbstractC7748
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo24625() {
            return this.f3063;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7750 extends AbstractC7748 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final C7750 f3064 = new C7750();

        public C7750() {
            super(null);
        }

        @Override // Yue.C7746.AbstractC7748
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo24625() {
            return C7758.m3849(Locale.getDefault()) == 1;
        }
    }

    static {
        C1344 c1344 = C1344.f3061;
        f23282 = new C7749(c1344, false);
        f23283 = new C7749(c1344, true);
        f23284 = new C7749(C1343.f3059, false);
        f23285 = C7750.f3064;
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m3842(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3843(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
