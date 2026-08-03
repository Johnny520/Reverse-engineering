package ac;

import af.C0081d;
import android.view.MotionEvent;
import androidx.lifecycle.C0119x;
import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import okio.Utf8;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p020b5.C0184c;
import p068eh.AbstractC0921a;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p084ff.C1219e;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1237r;
import p090g2.AbstractC1292a;
import p096g8.C1361b;
import p131j0.C2046b;
import p136j8.C2104o;
import p141jf.C2128d;
import p141jf.C2131g;
import p150k5.C2246b0;
import p150k5.C2270u;
import p150k5.C2275z;
import p172lg.C2564d;
import p201o.AbstractC3026b;
import p207o5.AbstractC3055j;
import p207o5.C3053h;
import p207o5.C3054i;
import p251r.C3623h;
import p265s.AbstractC3847o;
import p265s.C3830g;
import p265s.C3835i;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p357y1.InterfaceC5905l2;

/* JADX INFO: renamed from: ac.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058k implements InterfaceC4685e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f175g;

    /* JADX INFO: renamed from: h */
    public int f176h;

    /* JADX INFO: renamed from: i */
    public Object f177i;

    /* JADX INFO: renamed from: j */
    public Object f178j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[LOOP:1: B:27:0x00c0->B:33:0x00e2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0058k(C2564d c2564d, C3623h c3623h) {
        Object c3830g;
        this.f175g = 10;
        C0058k c0058k = c3623h.f11683a;
        int i9 = c2564d.f8312g;
        if (i9 < 0) {
            AbstractC3026b.m6430c("negative nearestRange.first");
        }
        int iMin = Math.min(c2564d.f8313h, c0058k.f176h - 1);
        if (iMin < i9) {
            C0925b0 c0925b0 = AbstractC0951o0.f2997a;
            c0925b0.getClass();
            this.f177i = c0925b0;
            this.f178j = new Object[0];
            this.f176h = 0;
            return;
        }
        int i10 = (iMin - i9) + 1;
        this.f178j = new Object[i10];
        this.f176h = i9;
        C0925b0 c0925b02 = new C0925b0(i10);
        C2046b c2046b = (C2046b) c0058k.f177i;
        if (i9 < 0 || i9 >= c0058k.f176h) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Index ", ", size ");
            sbM2257t.append(c0058k.f176h);
            AbstractC3026b.m6432e(sbM2257t.toString());
        }
        if (iMin < 0 || iMin >= c0058k.f176h) {
            StringBuilder sbM2257t2 = AbstractC0921a.m2257t(iMin, "Index ", ", size ");
            sbM2257t2.append(c0058k.f176h);
            AbstractC3026b.m6432e(sbM2257t2.toString());
        }
        if (iMin < i9) {
            AbstractC3026b.m6428a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i9 + ')');
        }
        int iM8018e = AbstractC3847o.m8018e(i9, c2046b);
        int i11 = ((C3835i) c2046b.f6891g[iM8018e]).f12562a;
        while (i11 <= iMin) {
            C3835i c3835i = (C3835i) c2046b.f6891g[iM8018e];
            InterfaceC1231l interfaceC1231l = (InterfaceC1231l) c3835i.f12564c.f469a;
            int i12 = c3835i.f12562a;
            int iMax = Math.max(i9, i12);
            int iMin2 = Math.min(iMin, (c3835i.f12563b + i12) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (interfaceC1231l == null) {
                        c3830g = new C3830g(iMax);
                        c0925b02.m2273g(iMax, c3830g);
                        ((Object[]) this.f178j)[iMax - this.f176h] = c3830g;
                        iMax = iMax == iMin2 ? iMax + 1 : iMax;
                    } else {
                        c3830g = interfaceC1231l.invoke(Integer.valueOf(iMax - i12));
                        if (c3830g == null) {
                        }
                        c0925b02.m2273g(iMax, c3830g);
                        ((Object[]) this.f178j)[iMax - this.f176h] = c3830g;
                        if (iMax == iMin2) {
                            break;
                        }
                    }
                }
            }
            i11 += c3835i.f12563b;
            iM8018e++;
        }
        this.f177i = c0925b02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m334f(int[] iArr, int i9, int i10) {
        int i11 = -1;
        int i12 = i9;
        while (i12 - i11 > 1) {
            int i13 = (i12 + i11) / 2;
            if (iArr[i13] < i10) {
                i11 = i13;
            } else {
                i12 = i13;
            }
        }
        return i12 == i9 ? ~i9 : iArr[i12] == i10 ? i12 : ~i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m335x(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = i9 + 1;
            char cCharAt = str.charAt(i9);
            if (cCharAt < 128) {
                i10++;
            } else if (cCharAt < 2048) {
                i10 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i10 += 3;
            } else {
                i9 += 2;
                i10 += 4;
            }
            i9 = i11;
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void m336B(int i9) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public void m337C(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f178j, this.f176h, length);
            this.f176h += length;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public void m338D(int i9) {
        byte[] bArr = (byte[]) this.f178j;
        int i10 = this.f176h;
        int i11 = i10 + 1;
        this.f176h = i11;
        bArr[i10] = (byte) i9;
        int i12 = i10 + 2;
        this.f176h = i12;
        bArr[i11] = (byte) (i9 >> 8);
        int i13 = i10 + 3;
        this.f176h = i13;
        bArr[i12] = (byte) (i9 >> 16);
        this.f176h = i10 + 4;
        bArr[i13] = (byte) (i9 >> 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public void m339E(int i9, int i10) {
        byte[] bArr = (byte[]) this.f178j;
        bArr[i9] = (byte) i10;
        bArr[i9 + 1] = (byte) (i10 >> 8);
        bArr[i9 + 2] = (byte) (i10 >> 16);
        bArr[i9 + 3] = (byte) (i10 >> 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public void m340F(int i9, long j3) {
        byte[] bArr = (byte[]) this.f178j;
        bArr[i9] = (byte) j3;
        bArr[i9 + 1] = (byte) (j3 >> 8);
        bArr[i9 + 2] = (byte) (j3 >> 16);
        bArr[i9 + 3] = (byte) (j3 >> 24);
        bArr[i9 + 4] = (byte) (j3 >> 32);
        bArr[i9 + 5] = (byte) (j3 >> 40);
        bArr[i9 + 6] = (byte) (j3 >> 48);
        bArr[i9 + 7] = (byte) (j3 >> 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public void m341G(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f178j;
        int i9 = this.f176h;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                bArr[i9] = (byte) cCharAt;
                i9++;
            } else if (cCharAt < 2048) {
                int i12 = i9 + 1;
                bArr[i9] = (byte) ((cCharAt >>> 6) | Opcodes.CHECKCAST);
                i9 += 2;
                bArr[i12] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i9] = (byte) ((cCharAt >>> '\f') | 224);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i9 += 3;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
            } else {
                i10 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i11)) - 56613888;
                bArr[i9] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i9 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i14 = i9 + 3;
                bArr[i9 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i9 += 4;
                bArr[i14] = (byte) ((iCharAt & 63) | 128);
            }
            i10 = i11;
        }
        this.f176h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public void m342H() {
        ((ByteBuffer) this.f177i).getInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public int m343I() {
        int i9;
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        do {
            int iM345K = m345K();
            i10 |= (iM345K & 127) << (i12 * 7);
            i11 <<= 7;
            i12++;
            i9 = iM345K & 128;
            if (i9 != 128) {
                break;
            }
        } while (i12 < 5);
        if (i9 != 128) {
            return ((i11 >> 1) & i10) != 0 ? i10 | i11 : i10;
        }
        throw new C0081d("Invalid LEB128 sequence");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public List m344J() {
        int i9 = ((ByteBuffer) this.f177i).getInt();
        if (i9 == 0) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = m346L();
        }
        ArrayList arrayList = new ArrayList(i9);
        for (int i11 = 0; i11 < i9; i11++) {
            arrayList.add(m373y(iArr[i11]));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public int m345K() {
        return ((ByteBuffer) this.f177i).get() & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public int m346L() {
        return ((ByteBuffer) this.f177i).getShort() & 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public void m347M(int i9) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f177i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public void m348N(int i9, boolean z9) {
        int i10 = i9 & 33554431;
        long[] jArr = (long[]) this.f177i;
        int i11 = this.f176h;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j3 = jArr[i13];
            if ((((int) j3) & 33554431) == i10) {
                long j4 = z9 ? 1L : 0L;
                jArr[i13] = (j4 * Long.MIN_VALUE) | (8070450532247928831L & j3) | (1152921504606846976L * j4);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public void m349O(int i9, int i10, long j3) {
        int i11;
        char c10;
        char c11;
        long[] jArr = (long[]) this.f177i;
        long[] jArr2 = (long[]) this.f178j;
        jArr2[0] = j3;
        int i12 = 1;
        while (i12 > 0) {
            i12--;
            long j4 = jArr2[i12];
            int i13 = 33554431;
            int i14 = ((int) j4) & 33554431;
            char c12 = 25;
            int i15 = ((int) (j4 >> 25)) & 33554431;
            char c13 = '2';
            int i16 = ((int) (j4 >> 50)) & 1023;
            int i17 = i16 == 1023 ? this.f176h : (i16 * 3) + i15;
            if (i15 < 0) {
                return;
            }
            while (i15 < jArr.length - 2 && i15 < i17) {
                int i18 = i15 + 2;
                long j5 = jArr[i18];
                if ((((int) (j5 >> c12)) & i13) == i14) {
                    long j10 = jArr[i15];
                    int i19 = i15 + 1;
                    i11 = i13;
                    c10 = c12;
                    long j11 = jArr[i19];
                    c11 = c13;
                    jArr[i15] = (((long) (((int) j10) + i10)) & 4294967295L) | (((long) (((int) (j10 >> 32)) + i9)) << 32);
                    jArr[i19] = (((long) (((int) j11) + i10)) & 4294967295L) | (((long) (((int) (j11 >> 32)) + i9)) << 32);
                    jArr[i18] = (((j5 >> 63) & 1) << 60) | j5;
                    if ((((int) (j5 >> c11)) & 1023) > 0) {
                        jArr2[i12] = (AbstractC1292a.f4312b & j5) | (((long) ((i15 + 3) & i11)) << c10);
                        i12++;
                    }
                } else {
                    i11 = i13;
                    c10 = c12;
                    c11 = c13;
                }
                i15 += 3;
                i13 = i11;
                c12 = c10;
                c13 = c11;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public void m350P(int i9, InterfaceC1237r interfaceC1237r) {
        int i10 = i9 & 33554431;
        long[] jArr = (long[]) this.f177i;
        int i11 = this.f176h;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 33554431) == i10) {
                long j3 = jArr[i12];
                long j4 = jArr[i12 + 1];
                interfaceC1237r.mo3355c(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m351a(int i9) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m352b(int i9, C0184c c0184c) {
        if (i9 < 0) {
            AbstractC3026b.m6428a("size should be >=0");
        }
        if (i9 == 0) {
            return;
        }
        C3835i c3835i = new C3835i(this.f176h, i9, c0184c);
        this.f176h += i9;
        ((C2046b) this.f177i).m5056b(c3835i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m353c(int i9, int i10) {
        int i11 = this.f176h;
        if (i11 != 0) {
            int[] iArr = (int[]) this.f177i;
            if (i9 <= iArr[i11 - 1]) {
                int iM334f = m334f(iArr, i11, i9);
                if (iM334f >= 0) {
                    ((int[]) this.f178j)[iM334f] = i10;
                    return;
                }
                int i12 = ~iM334f;
                int i13 = this.f176h;
                int[] iArr2 = (int[]) this.f177i;
                if (i13 >= iArr2.length) {
                    int iMax = Math.max(i13 + 1, iArr2.length * 2);
                    int[] iArr3 = new int[iMax];
                    int[] iArr4 = new int[iMax];
                    int[] iArr5 = (int[]) this.f177i;
                    System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
                    int[] iArr6 = (int[]) this.f178j;
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    this.f177i = iArr3;
                    this.f178j = iArr4;
                }
                int i14 = this.f176h - i12;
                if (i14 != 0) {
                    int[] iArr7 = (int[]) this.f177i;
                    int i15 = i12 + 1;
                    System.arraycopy(iArr7, i12, iArr7, i15, i14);
                    int[] iArr8 = (int[]) this.f178j;
                    System.arraycopy(iArr8, i12, iArr8, i15, this.f176h - i12);
                }
                ((int[]) this.f177i)[i12] = i9;
                ((int[]) this.f178j)[i12] = i10;
                this.f176h++;
                return;
            }
        }
        int[] iArr9 = (int[]) this.f177i;
        if (i11 >= iArr9.length) {
            int iMax2 = Math.max(i11 + 1, iArr9.length * 2);
            int[] iArr10 = new int[iMax2];
            int[] iArr11 = new int[iMax2];
            int[] iArr12 = (int[]) this.f177i;
            System.arraycopy(iArr12, 0, iArr10, 0, iArr12.length);
            int[] iArr13 = (int[]) this.f178j;
            System.arraycopy(iArr13, 0, iArr11, 0, iArr13.length);
            this.f177i = iArr10;
            this.f178j = iArr11;
        }
        ((int[]) this.f177i)[i11] = i9;
        ((int[]) this.f178j)[i11] = i10;
        this.f176h = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4685e
    /* JADX INFO: renamed from: d */
    public InterfaceC4685e mo354d(C4683c c4683c) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4685e
    /* JADX INFO: renamed from: e */
    public boolean mo355e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C0058k m356g() {
        return new C0058k((C1219e) this.f178j, this.f176h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4685e
    public C4683c getType(int i9) {
        return ((C4453d0) ((C4455e0) this.f178j).m8906l(((C1361b) this.f177i).m3659g(i9 * 2))).f14784g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public synchronized String m357h(byte[] bArr, int i9, int i10) {
        char[] cArr;
        int i11;
        int i12;
        try {
            cArr = (char[]) this.f177i;
            if (cArr == null) {
                cArr = i10 <= 256 ? new char[Opcodes.ACC_NATIVE] : new char[Opcodes.ACC_STRICT];
                this.f177i = cArr;
            } else if (cArr.length < i10) {
                cArr = new char[Opcodes.ACC_STRICT];
                this.f177i = cArr;
            }
            int i13 = i10 + i9;
            i11 = 0;
            while (i9 < i13) {
                int i14 = i9 + 1;
                byte b10 = bArr[i9];
                if (b10 > 0) {
                    cArr[i11] = (char) b10;
                    i11++;
                    i9 = i14;
                } else {
                    if (b10 < -32) {
                        i9 += 2;
                        byte b11 = bArr[i14];
                        if (b10 < -62 || b11 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i12 = i11 + 1;
                        cArr[i11] = (char) ((b11 & 63) | ((b10 & 31) << 6));
                    } else {
                        if (b10 >= -16) {
                            byte b12 = bArr[i14];
                            int i15 = i9 + 3;
                            byte b13 = bArr[i9 + 2];
                            i9 += 4;
                            byte b14 = bArr[i15];
                            if (b12 <= -65) {
                                if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && b13 <= -65 && b14 <= -65) {
                                    int i16 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                    int i17 = i11 + 1;
                                    cArr[i11] = (char) ((i16 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                    i11 += 2;
                                    cArr[i17] = (char) ((i16 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i18 = i9 + 2;
                        byte b15 = bArr[i14];
                        i9 += 3;
                        byte b16 = bArr[i18];
                        if ((b10 == -32 && b15 < -96) || ((b10 == -19 && b15 >= -96) || b15 > -65 || b16 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i12 = i11 + 1;
                        cArr[i11] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                    }
                    i11 = i12;
                }
            }
            if (i9 > i13) {
                throw new IllegalArgumentException("Invalid String");
            }
        } finally {
        }
        return new String(cArr, 0, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m358i() {
        File file = (File) this.f178j;
        if (file == null || file.delete()) {
            return;
        }
        file.deleteOnExit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public int m359j(C2128d c2128d, int i9) {
        m351a((i9 * 8) + ((C1219e) this.f178j).f4087d.f7101e);
        int iM346L = m346L();
        int iM346L2 = m346L();
        int i10 = ((ByteBuffer) this.f177i).getInt();
        c2128d.f7092c = m373y(iM346L2);
        c2128d.f7093d = m371v(i10);
        return iM346L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public int m360k(int i9) {
        int iM334f = m334f((int[]) this.f177i, this.f176h, i9);
        if (iM334f < 0) {
            return -1;
        }
        return ((int[]) this.f178j)[iM334f];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C3835i m361l(int i9) {
        if (i9 < 0 || i9 >= this.f176h) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Index ", ", size ");
            sbM2257t.append(this.f176h);
            AbstractC3026b.m6432e(sbM2257t.toString());
        }
        C3835i c3835i = (C3835i) this.f178j;
        if (c3835i != null) {
            int i10 = c3835i.f12562a;
            if (i9 < c3835i.f12563b + i10 && i10 <= i9) {
                return c3835i;
            }
        }
        C2046b c2046b = (C2046b) this.f177i;
        C3835i c3835i2 = (C3835i) c2046b.f6891g[AbstractC3847o.m8018e(i9, c2046b)];
        this.f178j = c3835i2;
        return c3835i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public long m362m(int i9, int i10) {
        long jM367r = 0;
        if (i10 <= 0) {
            return 0L;
        }
        int i11 = i10 >> 3;
        int i12 = i10 & 7;
        int i13 = 0;
        int i14 = i9;
        for (int i15 = 0; i15 < i11; i15++) {
            jM367r ^= m367r(i14);
            i14 += 8;
        }
        int i16 = i12 << 3;
        while (i13 < i16) {
            jM367r ^= (((long) ((byte[]) this.f178j)[i14]) & 255) << i13;
            i13 += 8;
            i14++;
        }
        int i17 = (i9 & 7) << 3;
        return (jM367r >>> (64 - i17)) | (jM367r << i17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public AbstractC3055j m363n() {
        C2275z c2275z = (C2275z) this.f178j;
        C2270u c2270u = (C2270u) this.f177i;
        int iM579J = c2270u.f7532b.m579J(this.f176h + 8);
        C3054i c3054i = C3054i.f9888g;
        if (iM579J == -1 || iM579J == 0) {
            return c3054i;
        }
        if (iM579J < 0) {
            System.err.println(c2275z + ": Invalid debug offset");
            return c3054i;
        }
        if (iM579J < ((byte[]) c2270u.f7531a.f310h).length) {
            return iM579J == 0 ? c3054i : new C3053h(c2270u, iM579J, this);
        }
        System.err.println(c2275z + ": Invalid debug offset");
        return c3054i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public int m364o(Object obj) {
        C0925b0 c0925b0 = (C0925b0) this.f177i;
        int iM2270d = c0925b0.m2270d(obj);
        if (iM2270d >= 0) {
            return c0925b0.f2896c[iM2270d];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public C2246b0 m365p() {
        C0119x c0119x = ((C2270u) this.f177i).f7532b;
        int i9 = this.f176h;
        int iM583N = c0119x.m583N(i9 + 12);
        int i10 = i9 + 16;
        return new C2246b0(this, i10, (iM583N * 2) + i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public int m366q() {
        byte[] bArr = (byte[]) this.f178j;
        int i9 = this.f176h;
        int i10 = i9 + 1;
        this.f176h = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.f176h = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i9 + 3;
        this.f176h = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f176h = i9 + 4;
        return (bArr[i14] << 24) | i15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public long m367r(int i9) {
        byte[] bArr = (byte[]) this.f178j;
        int i10 = i9 + 6;
        return (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i10]) & 255) << 48) | (((long) bArr[i9 + 7]) << 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public C2131g m368s(int i9) {
        List listM344J;
        m351a((i9 * 12) + ((C1219e) this.f178j).f4087d.f7102f);
        m347M(4);
        ByteBuffer byteBuffer = (ByteBuffer) this.f177i;
        int i10 = byteBuffer.getInt();
        int i11 = byteBuffer.getInt();
        if (i11 == 0) {
            listM344J = Collections.EMPTY_LIST;
        } else {
            m351a(i11);
            listM344J = m344J();
        }
        return new C2131g(listM344J, m373y(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4685e
    public int size() {
        return this.f176h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public int m369t() {
        return ((C2270u) this.f177i).f7532b.m585P(this.f176h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f175g) {
            case 5:
                return "SectionReader{buf=" + String.valueOf((ByteBuffer) this.f177i) + ", offset=" + this.f176h + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public short m370u() {
        byte[] bArr = (byte[]) this.f178j;
        int i9 = this.f176h;
        int i10 = i9 + 1;
        this.f176h = i10;
        int i11 = bArr[i9] & 255;
        this.f176h = i9 + 2;
        return (short) ((bArr[i10] << 8) | i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public String m371v(int i9) {
        if (i9 == -1) {
            return null;
        }
        m351a((i9 * 4) + ((C1219e) this.f178j).f4087d.f7099c);
        m351a(((ByteBuffer) this.f177i).getInt());
        char[] cArr = new char[AbstractC0000a.m14H0(this)];
        int i10 = 0;
        while (true) {
            char cM345K = (char) (m345K() & 255);
            if (cM345K == 0) {
                return new String(cArr, 0, i10);
            }
            cArr[i10] = cM345K;
            if (cM345K >= 128) {
                if ((cM345K & 224) == 192) {
                    int iM345K = m345K();
                    if ((iM345K & Opcodes.CHECKCAST) != 128) {
                        throw new C0081d("Bad second byte");
                    }
                    cArr[i10] = (char) (((cM345K & 31) << 6) | (iM345K & 63));
                } else {
                    if ((cM345K & 240) != 224) {
                        throw new C0081d("Bad byte");
                    }
                    int iM345K2 = m345K();
                    int iM345K3 = m345K();
                    if ((iM345K2 & Opcodes.CHECKCAST) != 128 || (iM345K3 & Opcodes.CHECKCAST) != 128) {
                        break;
                    }
                    cArr[i10] = (char) (((cM345K & 15) << 12) | ((iM345K2 & 63) << 6) | (iM345K3 & 63));
                }
            }
            i10++;
        }
        throw new C0081d("Bad second or third byte");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public String m372w(int i9) {
        if (i9 < 0) {
            return null;
        }
        if (i9 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] bArr = (byte[]) this.f178j;
        String str = i9 > 2048 ? new String(bArr, this.f176h, i9, StandardCharsets.UTF_8) : m357h(bArr, this.f176h, i9);
        this.f176h += i9;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public String m373y(int i9) {
        if (i9 == -1) {
            return null;
        }
        m351a((i9 * 4) + ((C1219e) this.f178j).f4087d.f7100d);
        return m371v(((ByteBuffer) this.f177i).getInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m374z(int i9, int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10, boolean z11, int i15) {
        long[] jArr = (long[]) this.f177i;
        int i16 = this.f176h;
        int i17 = i16 + 3;
        this.f176h = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            this.f177i = Arrays.copyOf(jArr, iMax);
            this.f178j = Arrays.copyOf((long[]) this.f178j, iMax);
        }
        long[] jArr2 = (long[]) this.f177i;
        jArr2[i16] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        jArr2[i16 + 1] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
        int i18 = i14 & 33554431;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | ((z9 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i18) << 25) | ((long) (i9 & 33554431));
        if (i14 < 0) {
            return;
        }
        for (int i19 = i15 != -1 ? i15 : i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j3 = jArr2[i20];
            if ((((int) j3) & 33554431) == i18) {
                jArr2[i20] = (j3 & AbstractC1292a.f4311a) | (((long) Math.min((i16 - i19) / 3, 1023)) << 50);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0058k(int i9) {
        this(new byte[i9], 0);
        this.f175g = 0;
    }

    public C0058k(byte[] bArr, int i9) {
        this.f175g = 0;
        this.f177i = null;
        this.f178j = bArr;
        this.f176h = i9;
    }

    public C0058k(C1219e c1219e, int i9) {
        this.f175g = 5;
        this.f178j = c1219e;
        this.f176h = i9;
        ByteBuffer byteBufferDuplicate = c1219e.f4086c.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        this.f177i = byteBufferDuplicate;
    }

    public C0058k(ArrayList arrayList, int i9, MotionEvent motionEvent) {
        this.f175g = 8;
        this.f177i = arrayList;
        this.f176h = i9;
        this.f178j = motionEvent;
        if (arrayList.isEmpty()) {
            C2104o.m5294t("changes cannot be empty");
            throw null;
        }
    }

    public C0058k(byte b10, int i9) {
        this.f175g = i9;
        switch (i9) {
            case 9:
                this.f177i = new C2046b(new C3835i[16]);
                break;
            default:
                this.f177i = new int[0];
                this.f178j = new int[0];
                this.f176h = 0;
                break;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [g2.b.<init>(y1.t):void, w0.m.<clinit>():void] */
    public /* synthetic */ C0058k(int i9, char c10) {
        this.f175g = i9;
    }

    public C0058k(C2270u c2270u, C2275z c2275z, int i9) {
        this.f175g = 7;
        this.f177i = c2270u;
        this.f178j = c2275z;
        this.f176h = i9;
    }

    public C0058k(InterfaceC5905l2 interfaceC5905l2) {
        this.f175g = 3;
        this.f177i = interfaceC5905l2;
    }

    public C0058k(C1361b c1361b, int i9, int i10, C4455e0 c4455e0) {
        this.f175g = 6;
        if (i10 >= 0) {
            C1361b c1361bM3666n = c1361b.m3666n(i9, (i10 * 2) + i9);
            this.f177i = c1361bM3666n;
            this.f176h = i10;
            this.f178j = c4455e0;
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                } catch (ClassCastException e6) {
                    C0086a.m457p("bogus class cpi", e6);
                    throw null;
                }
            }
            return;
        }
        C2104o.m5294t("size < 0");
        throw null;
    }

    public C0058k(File file, int i9, File file2) {
        this.f175g = 4;
        this.f177i = file;
        this.f176h = i9;
        this.f178j = file2;
    }
}
