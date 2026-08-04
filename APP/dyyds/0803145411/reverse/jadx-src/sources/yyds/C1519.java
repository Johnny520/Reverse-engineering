package yyds;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛷᛳᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 implements InterfaceC0124 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0574 f7336;

    public C1519(C0574 c0574) {
        this.f7336 = c0574;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7336.close();
    }

    @Override // yyds.InterfaceC0124
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public final boolean mo574() {
        return this.f7336.m1444();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    @Override // yyds.InterfaceC0124
    /* JADX INFO: renamed from: ᲀᛲᛱᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1212 mo575(String str) {
        int iM1290;
        int i;
        C0574 c0574 = this.f7336;
        C0805 c0805 = null;
        if (!c0574.isOpen()) {
            AbstractC2328.m4346(21, "connection is closed");
            throw null;
        }
        String upperCase = AbstractC0473.m1314(str).toString().toUpperCase(Locale.ROOT);
        int i2 = 2;
        int length = upperCase.length() - 2;
        if (length < 0) {
            iM1290 = -1;
        } else {
            iM1290 = 0;
            loop0: while (iM1290 < length) {
                char cCharAt = upperCase.charAt(iM1290);
                if (AbstractC1544.m3197(cCharAt, 32) > 0) {
                    if (cCharAt == '-') {
                        if (upperCase.charAt(iM1290 + 1) != '-') {
                            break;
                        }
                        iM1290 = AbstractC0473.m1290(upperCase, '\n', iM1290 + 2, 4);
                        if (iM1290 < 0) {
                            break;
                        }
                    } else {
                        if (cCharAt != '/') {
                            break;
                        }
                        int iM12902 = iM1290 + 1;
                        if (upperCase.charAt(iM12902) != '*') {
                            break;
                        }
                        do {
                            iM12902 = AbstractC0473.m1290(upperCase, '*', iM12902 + 1, 4);
                            if (iM12902 < 0) {
                                break loop0;
                            }
                            i = iM12902 + 1;
                            if (i >= length) {
                                break;
                            }
                        } while (upperCase.charAt(i) != '/');
                        iM1290 = iM12902 + 2;
                    }
                }
                iM1290++;
            }
            iM1290 = -1;
        }
        String strSubstring = (iM1290 < 0 || iM1290 > upperCase.length()) ? null : upperCase.substring(iM1290, Math.min(iM1290 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new C1707(c0574, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    i2 = 0;
                } else if (!AbstractC0473.m1301(upperCase, "EXCLUSIVE", false)) {
                    i2 = !AbstractC0473.m1301(upperCase, "IMMEDIATE", false) ? 5 : 4;
                } else {
                    i2 = 3;
                }
                break;
            case 66913:
                i2 = !strSubstring.equals("COM") ? 0 : 1;
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    i2 = 0;
                    break;
                }
                break;
            case 81327:
                if (!strSubstring.equals("ROL") || AbstractC0473.m1301(upperCase, " TO ", false)) {
                    i2 = 0;
                }
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            return new C1699(c0574, str, i2);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            int iM1311 = AbstractC0473.m1311(lowerCase, "journal_mode", 0, false, 6);
            if (AbstractC0473.m1301(iM1311 == -1 ? "" : lowerCase.substring(12 + iM1311, lowerCase.length()), "=", false)) {
                c0805 = C0805.f3692;
            }
        }
        if (c0805 != null) {
            return new C1707(c0574, str, new C2643(c0574, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new C1707(c0574, str) : new C2643(c0574, str);
    }
}
