package ad;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: ad.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0277n0 implements InterfaceC0292v {

    /* JADX INFO: renamed from: a */
    public char[] f678a = C0266j.f650c.m787d();

    /* JADX INFO: renamed from: b */
    public int f679b;

    @Override // ad.InterfaceC0292v
    /* JADX INFO: renamed from: a */
    public void mo829a(char c10) {
        m833e(1);
        char[] cArr = this.f678a;
        int i10 = this.f679b;
        this.f679b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // ad.InterfaceC0292v
    /* JADX INFO: renamed from: b */
    public void mo830b(String str) {
        str.getClass();
        m833e(str.length() + 2);
        char[] cArr = this.f678a;
        int i10 = this.f679b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < AbstractC0256f1.m752a().length && AbstractC0256f1.m752a()[c10] != 0) {
                m832d(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f679b = i12 + 1;
    }

    @Override // ad.InterfaceC0292v
    /* JADX INFO: renamed from: c */
    public void mo831c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m833e(length);
        str.getChars(0, str.length(), this.f678a, this.f679b);
        this.f679b += length;
    }

    /* JADX INFO: renamed from: d */
    public final void m832d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iM834f = m834f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= AbstractC0256f1.m752a().length || (b10 = AbstractC0256f1.m752a()[cCharAt]) == 0) {
                int i12 = iM834f + 1;
                this.f678a[iM834f] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = AbstractC0256f1.m753b()[cCharAt];
                    str2.getClass();
                    int iM834f2 = m834f(iM834f, str2.length());
                    str2.getChars(0, str2.length(), this.f678a, iM834f2);
                    i11 = iM834f2 + str2.length();
                    this.f679b = i11;
                } else {
                    char[] cArr = this.f678a;
                    cArr[iM834f] = '\\';
                    cArr[iM834f + 1] = (char) b10;
                    i11 = iM834f + 2;
                    this.f679b = i11;
                }
                i10++;
            }
        }
        int iM834f3 = m834f(i11, 1);
        this.f678a[iM834f3] = '\"';
        this.f679b = iM834f3 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m833e(int i10) {
        m834f(this.f679b, i10);
    }

    /* JADX INFO: renamed from: f */
    public final int m834f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f678a;
        if (cArr.length <= i12) {
            this.f678a = Arrays.copyOf(cArr, AbstractC2368o.m8578e(i12, i10 * 2));
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public void m835g() {
        C0266j.f650c.m786c(this.f678a);
    }

    public String toString() {
        return new String(this.f678a, 0, this.f679b);
    }

    @Override // ad.InterfaceC0292v
    public void writeLong(long j10) {
        mo831c(String.valueOf(j10));
    }
}
