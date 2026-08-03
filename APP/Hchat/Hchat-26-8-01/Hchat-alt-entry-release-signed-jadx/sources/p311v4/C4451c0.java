package p311v4;

import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p096g8.C1361b;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4451c0 extends AbstractC4457f0 {

    /* JADX INFO: renamed from: g */
    public final String f14760g;

    /* JADX INFO: renamed from: h */
    public final C1361b f14761h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C4451c0(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4451c0(C1361b c1361b) {
        char c10;
        this.f14761h = c1361b;
        int i9 = c1361b.f4512c;
        char[] cArr = new char[i9];
        int i10 = 0;
        int i11 = 0;
        while (i9 > 0) {
            int iM3657e = c1361b.m3657e(i11);
            switch (iM3657e >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i9--;
                    if (iM3657e == 0) {
                        m8900k(iM3657e, i11);
                        throw null;
                    }
                    c10 = (char) iM3657e;
                    i11++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m8900k(iM3657e, i11);
                    throw null;
                case 12:
                case 13:
                    i9 -= 2;
                    if (i9 < 0) {
                        m8900k(iM3657e, i11);
                        throw null;
                    }
                    int i12 = i11 + 1;
                    int iM3657e2 = c1361b.m3657e(i12);
                    if ((iM3657e2 & Opcodes.CHECKCAST) != 128) {
                        m8900k(iM3657e2, i12);
                        throw null;
                    }
                    int i13 = ((iM3657e & 31) << 6) | (iM3657e2 & 63);
                    if (i13 != 0 && i13 < 128) {
                        m8900k(iM3657e2, i12);
                        throw null;
                    }
                    c10 = (char) i13;
                    i11 += 2;
                    break;
                    break;
                case 14:
                    i9 -= 3;
                    if (i9 < 0) {
                        m8900k(iM3657e, i11);
                        throw null;
                    }
                    int i14 = i11 + 1;
                    int iM3657e3 = c1361b.m3657e(i14);
                    int i15 = iM3657e3 & Opcodes.CHECKCAST;
                    if (i15 != 128) {
                        m8900k(iM3657e3, i14);
                        throw null;
                    }
                    int i16 = i11 + 2;
                    int iM3657e4 = c1361b.m3657e(i16);
                    if (i15 != 128) {
                        m8900k(iM3657e4, i16);
                        throw null;
                    }
                    int i17 = ((iM3657e & 15) << 12) | ((iM3657e3 & 63) << 6) | (iM3657e4 & 63);
                    if (i17 < 2048) {
                        m8900k(iM3657e4, i16);
                        throw null;
                    }
                    c10 = (char) i17;
                    i11 += 3;
                    break;
                    break;
            }
            cArr[i10] = c10;
            i10++;
        }
        this.f14760g = new String(cArr, 0, i10).intern();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m8900k(int i9, int i10) {
        throw new IllegalArgumentException("bad utf-8 byte " + AbstractC0000a.m44W0(i9) + " at offset " + AbstractC0000a.m48Y0(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        String str = this.f14760g;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder((length * 3) / 2);
        int i9 = 0;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb2.append('\\');
                }
                sb2.append(cCharAt);
            } else if (cCharAt > 127) {
                sb2.append("\\u");
                sb2.append(Character.forDigit(cCharAt >> '\f', 16));
                sb2.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb2.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb2.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt != '\r') {
                char cCharAt2 = i9 < length + (-1) ? str.charAt(i9 + 1) : (char) 0;
                boolean z9 = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb2.append('\\');
                for (int i10 = 6; i10 >= 0; i10 -= 3) {
                    char c10 = (char) (((cCharAt >> i10) & 7) + 48);
                    if (c10 != '0' || z9) {
                        sb2.append(c10);
                        z9 = true;
                    }
                }
                if (!z9) {
                    sb2.append('0');
                }
            } else {
                sb2.append("\\r");
            }
            i9++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        return this.f14760g.compareTo(((C4451c0) abstractC4446a).f14760g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4451c0)) {
            return false;
        }
        return this.f14760g.equals(((C4451c0) obj).f14760g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15615G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14760g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "utf8";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m8901l() {
        return "\"" + mo4901a() + '\"';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "string{\"" + mo4901a() + "\"}";
    }

    public C4451c0(String str) {
        if (str != null) {
            this.f14760g = str.intern();
            int length = str.length();
            byte[] bArr = new byte[length * 3];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != 0 && cCharAt < 128) {
                    bArr[i9] = (byte) cCharAt;
                    i9++;
                } else if (cCharAt < 2048) {
                    bArr[i9] = (byte) (((cCharAt >> 6) & 31) | Opcodes.CHECKCAST);
                    bArr[i9 + 1] = (byte) ((cCharAt & '?') | 128);
                    i9 += 2;
                } else {
                    bArr[i9] = (byte) (((cCharAt >> '\f') & 15) | 224);
                    bArr[i9 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                    bArr[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    i9 += 3;
                }
            }
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, 0, bArr2, 0, i9);
            this.f14761h = new C1361b(bArr2, 3, (byte) 0);
            return;
        }
        C0353j.m1305c("string == null");
        throw null;
    }
}
