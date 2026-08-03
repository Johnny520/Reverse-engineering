package p010k;

import p011l.C0195c;
import p013n.C0200b;

/* JADX INFO: renamed from: k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0190t extends AbstractC0192v {

    /* JADX INFO: renamed from: a */
    private final String f697a;

    /* JADX INFO: renamed from: b */
    private final C0200b f698b;

    static {
        new C0190t("");
    }

    public C0190t(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f697a = str.intern();
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i2] = (byte) cCharAt;
                i2++;
            } else if (cCharAt < 2048) {
                bArr[i2] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i2 + 1] = (byte) ((cCharAt & '?') | 128);
                i2 += 2;
            } else {
                bArr[i2] = (byte) (((cCharAt >> '\f') & 15) | 224);
                bArr[i2 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i2 + 2] = (byte) ((cCharAt & '?') | 128);
                i2 += 3;
            }
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f698b = new C0200b(bArr2);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        String str;
        String str2 = this.f697a;
        int length = str2.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt < ' ' || cCharAt >= 127) {
                if (cCharAt <= 127) {
                    if (cCharAt == '\t') {
                        str = "\\t";
                    } else if (cCharAt == '\n') {
                        str = "\\n";
                    } else if (cCharAt != '\r') {
                        char cCharAt2 = i2 < length + (-1) ? str2.charAt(i2 + 1) : (char) 0;
                        boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                        sb.append('\\');
                        for (int i3 = 6; i3 >= 0; i3 -= 3) {
                            char c2 = (char) (((cCharAt >> i3) & 7) + 48);
                            if (c2 != '0' || z) {
                                sb.append(c2);
                                z = true;
                            }
                        }
                        if (!z) {
                            sb.append('0');
                        }
                        i2++;
                    } else {
                        str = "\\r";
                    }
                    sb.append(str);
                    i2++;
                } else {
                    sb.append("\\u");
                    sb.append(Character.forDigit(cCharAt >> '\f', 16));
                    sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                    sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                    cCharAt = Character.forDigit(cCharAt & 15, 16);
                }
            } else if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                sb.append('\\');
            }
            sb.append(cCharAt);
            i2++;
        }
        return sb.toString();
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f777v;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        return this.f697a.compareTo(((C0190t) abstractC0171a).f697a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0190t)) {
            return false;
        }
        return this.f697a.equals(((C0190t) obj).f697a);
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "utf8";
    }

    /* JADX INFO: renamed from: g */
    public final C0200b m444g() {
        return this.f698b;
    }

    /* JADX INFO: renamed from: h */
    public final String m445h() {
        return this.f697a;
    }

    public final int hashCode() {
        return this.f697a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m446i() {
        return this.f697a.length();
    }

    /* JADX INFO: renamed from: j */
    public final int m447j() {
        return this.f698b.m478b();
    }

    /* JADX INFO: renamed from: k */
    public final String m448k() {
        return "\"" + mo107a() + '\"';
    }

    public final String toString() {
        return "string{\"" + mo107a() + "\"}";
    }
}
