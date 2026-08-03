package p150k5;

import androidx.lifecycle.C0119x;
import com.alibaba.fastjson2.JSONB;
import p005a5.C0016a;
import p046d6.AbstractC0717n;
import p046d6.C0716m;

/* JADX INFO: renamed from: k5.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2268s extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7529g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2270u f7530h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2268s(C2270u c2270u, int i9) {
        this.f7529g = i9;
        this.f7530h = c2270u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m5521b(int i9) {
        int i10;
        char c10;
        switch (this.f7529g) {
            case 0:
                int iM5522c = m5522c(i9);
                C2270u c2270u = this.f7530h;
                int iM583N = c2270u.f7531a.m583N(iM5522c);
                C0119x c0119x = c2270u.f7532b;
                c0119x.getClass();
                C0016a c0016a = new C0016a(iM583N, 5, c0119x);
                int i11 = 0;
                int iM211o = c0016a.m211o(false);
                int[] iArr = new int[1];
                byte[] bArr = (byte[]) c0119x.f310h;
                int i12 = c0016a.f55h;
                C0716m c0716m = AbstractC0717n.f2154a;
                char[] cArr = (char[]) c0716m.get();
                if (cArr == null || cArr.length < iM211o) {
                    cArr = new char[iM211o];
                    c0716m.set(cArr);
                }
                int i13 = 0;
                int i14 = i12;
                while (iM211o > 0) {
                    byte b10 = bArr[i14];
                    int i15 = b10 & 255;
                    switch (i15 >> 4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i10 = i11;
                            if (i15 == 0) {
                                AbstractC0717n.m1890a(i15, i14);
                                throw null;
                            }
                            c10 = (char) i15;
                            i14++;
                            break;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        default:
                            AbstractC0717n.m1890a(i15, i14);
                            throw null;
                        case 12:
                        case 13:
                            i10 = i11;
                            int i16 = i14 + 1;
                            byte b11 = bArr[i16];
                            int i17 = b11 & 255;
                            if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                AbstractC0717n.m1890a(i17, i16);
                                throw null;
                            }
                            int i18 = ((b10 & 31) << 6) | (b11 & 63);
                            if (i18 != 0 && i18 < 128) {
                                AbstractC0717n.m1890a(i17, i16);
                                throw null;
                            }
                            c10 = (char) i18;
                            i14 += 2;
                            break;
                            break;
                        case 14:
                            int i19 = i14 + 1;
                            byte b12 = bArr[i19];
                            int i20 = b12 & 255;
                            if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                AbstractC0717n.m1890a(i20, i19);
                                throw null;
                            }
                            int i21 = i14 + 2;
                            byte b13 = bArr[i21];
                            int i22 = b13 & 255;
                            i10 = i11;
                            if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                AbstractC0717n.m1890a(i22, i21);
                                throw null;
                            }
                            int i23 = ((b10 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                            if (i23 < 2048) {
                                AbstractC0717n.m1890a(i22, i21);
                                throw null;
                            }
                            c10 = (char) i23;
                            i14 += 3;
                            break;
                            break;
                    }
                    cArr[i13] = c10;
                    i13++;
                    iM211o--;
                    i11 = i10;
                }
                int i24 = i11;
                int i25 = i14 - i12;
                iArr[i24] = i25;
                iArr[i24] = i25;
                String str = new String(cArr, i24, i13);
                c0016a.f55h += iArr[i24];
                return str;
            default:
                int iM5522c2 = m5522c(i9);
                C2270u c2270u2 = this.f7530h;
                return c2270u2.f7548r.m5521b(c2270u2.f7531a.m583N(iM5522c2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5522c(int i9) {
        int i10;
        switch (this.f7529g) {
            case 0:
                C2270u c2270u = this.f7530h;
                int i11 = c2270u.f7534d;
                if (i9 < 0 || i9 >= i11) {
                    throw new IndexOutOfBoundsException(String.format("Invalid string index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i11)));
                }
                i10 = c2270u.f7535e;
                break;
            default:
                C2270u c2270u2 = this.f7530h;
                int i12 = c2270u2.f7536f;
                if (i9 < 0 || i9 >= i12) {
                    throw new IndexOutOfBoundsException(String.format("Invalid type index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i12)));
                }
                i10 = c2270u2.f7537g;
                break;
        }
        return (i9 * 4) + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m5523d(int i9) {
        switch (this.f7529g) {
            case 0:
                if (i9 != -1) {
                    break;
                }
                break;
            default:
                if (i9 != -1) {
                    break;
                }
                break;
        }
        return m5521b(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p150k5.AbstractC2269t, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        switch (this.f7529g) {
        }
        return m5521b(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f7529g) {
            case 0:
                return this.f7530h.f7534d;
            default:
                return this.f7530h.f7536f;
        }
    }
}
