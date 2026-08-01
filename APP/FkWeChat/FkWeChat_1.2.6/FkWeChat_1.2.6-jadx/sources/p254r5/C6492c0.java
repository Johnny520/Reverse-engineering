package p254r5;

import bsh.C1259t2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.url._UrlKt;
import p269s5.C7188c;
import p309v5.AbstractC8826h;
import p309v5.C8822d;

/* JADX INFO: renamed from: r5.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6492c0 extends AbstractC6500g0 {

    /* JADX INFO: renamed from: s */
    public static final C6492c0 f20377s = new C6492c0(_UrlKt.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: q */
    public final String f20378q;

    /* JADX INFO: renamed from: r */
    public final C8822d f20379r;

    public C6492c0(String str) {
        if (str == null) {
            C1259t2.m5095a("string == null");
            throw null;
        }
        this.f20378q = str.intern();
        this.f20379r = new C8822d(m25737t(str));
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m25737t(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else if (cCharAt < 2048) {
                bArr[i10] = (byte) (((cCharAt >> 6) & 31) | Opcodes.CHECKCAST);
                bArr[i10 + 1] = (byte) ((cCharAt & '?') | 128);
                i10 += 2;
            } else {
                bArr[i10] = (byte) (((cCharAt >> '\f') & 15) | 224);
                bArr[i10 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt & '?') | 128);
                i10 += 3;
            }
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    /* JADX INFO: renamed from: u */
    public static String m25738u(int i10, int i11) {
        throw new IllegalArgumentException("bad utf-8 byte " + AbstractC8826h.m33897f(i10) + " at offset " + AbstractC8826h.m33901j(i11));
    }

    /* JADX INFO: renamed from: x */
    public static String m25739x(C8822d c8822d) {
        char c10;
        int iM33861q = c8822d.m33861q();
        char[] cArr = new char[iM33861q];
        int i10 = 0;
        int i11 = 0;
        while (iM33861q > 0) {
            int iM33856l = c8822d.m33856l(i11);
            switch (iM33856l >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM33861q--;
                    if (iM33856l == 0) {
                        return m25738u(iM33856l, i11);
                    }
                    c10 = (char) iM33856l;
                    i11++;
                    break;
                case 8:
                case 9:
                case 10:
                case Opcodes.FCONST_0 /* 11 */:
                default:
                    return m25738u(iM33856l, i11);
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.FCONST_2 /* 13 */:
                    iM33861q -= 2;
                    if (iM33861q < 0) {
                        return m25738u(iM33856l, i11);
                    }
                    int i12 = i11 + 1;
                    int iM33856l2 = c8822d.m33856l(i12);
                    if ((iM33856l2 & Opcodes.CHECKCAST) != 128) {
                        return m25738u(iM33856l2, i12);
                    }
                    int i13 = ((iM33856l & 31) << 6) | (iM33856l2 & 63);
                    if (i13 != 0 && i13 < 128) {
                        return m25738u(iM33856l2, i12);
                    }
                    c10 = (char) i13;
                    i11 += 2;
                    break;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    iM33861q -= 3;
                    if (iM33861q < 0) {
                        return m25738u(iM33856l, i11);
                    }
                    int i14 = i11 + 1;
                    int iM33856l3 = c8822d.m33856l(i14);
                    int i15 = iM33856l3 & Opcodes.CHECKCAST;
                    if (i15 != 128) {
                        return m25738u(iM33856l3, i14);
                    }
                    int i16 = i11 + 2;
                    int iM33856l4 = c8822d.m33856l(i16);
                    if (i15 != 128) {
                        return m25738u(iM33856l4, i16);
                    }
                    int i17 = ((iM33856l & 15) << 12) | ((iM33856l3 & 63) << 6) | (iM33856l4 & 63);
                    if (i17 < 2048) {
                        return m25738u(iM33856l4, i16);
                    }
                    c10 = (char) i17;
                    i11 += 3;
                    break;
            }
            cArr[i10] = c10;
            i10++;
        }
        return new String(cArr, 0, i10);
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return this.f20378q.compareTo(((C6492c0) abstractC6487a).f20378q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6492c0) {
            return this.f20378q.equals(((C6492c0) obj).f20378q);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        int length = this.f20378q.length();
        StringBuilder sb2 = new StringBuilder((length * 3) / 2);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = this.f20378q.charAt(i10);
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
                char cCharAt2 = i10 < length + (-1) ? this.f20378q.charAt(i10 + 1) : (char) 0;
                boolean z10 = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb2.append('\\');
                for (int i11 = 6; i11 >= 0; i11 -= 3) {
                    char c10 = (char) (((cCharAt >> i11) & 7) + 48);
                    if (c10 != '0' || z10) {
                        sb2.append(c10);
                        z10 = true;
                    }
                }
                if (!z10) {
                    sb2.append('0');
                }
            } else {
                sb2.append("\\r");
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23839R;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return this.f20378q.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "utf8";
    }

    /* JADX INFO: renamed from: k */
    public C8822d m25740k() {
        return this.f20379r;
    }

    /* JADX INFO: renamed from: n */
    public String m25741n() {
        return this.f20378q;
    }

    /* JADX INFO: renamed from: p */
    public int m25742p() {
        return this.f20378q.length();
    }

    /* JADX INFO: renamed from: s */
    public int m25743s() {
        return this.f20379r.m33861q();
    }

    public String toString() {
        return "string{\"" + mo6828g() + "\"}";
    }

    /* JADX INFO: renamed from: v */
    public String m25744v() {
        return "\"" + mo6828g() + '\"';
    }

    /* JADX INFO: renamed from: w */
    public String m25745w(int i10) {
        String str;
        String strMo6828g = mo6828g();
        if (strMo6828g.length() <= i10 - 2) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            strMo6828g = strMo6828g.substring(0, i10 - 5);
            str = "...";
        }
        return "\"" + strMo6828g + str + '\"';
    }

    public C6492c0(C8822d c8822d) {
        if (c8822d != null) {
            this.f20379r = c8822d;
            this.f20378q = m25739x(c8822d).intern();
        } else {
            C1259t2.m5095a("bytes == null");
            throw null;
        }
    }
}
