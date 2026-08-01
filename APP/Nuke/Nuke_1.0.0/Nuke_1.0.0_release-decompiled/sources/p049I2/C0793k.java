package p049I2;

import android.view.MotionEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import p000A.C0066i0;
import p000A.C0072l0;
import p011B4.AbstractC0231b;
import p047I0.InterfaceC0697T0;
import p082Q0.AbstractC1167a;
import p088R1.C1213n;
import p105V.C1483e;
import p112W2.InterfaceC1605g;
import p117X2.AbstractC1665j;
import p118X3.EnumC1716z;
import p186k.C2444z;
import p200m2.AbstractC2602c;
import p223q1.InterfaceC2909c;
import p238t.AbstractC3204b;
import p260x.AbstractC3429l;
import p260x.C3426i;

/* JADX INFO: renamed from: I2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0793k implements InterfaceC2909c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2536d;

    /* JADX INFO: renamed from: e */
    public int f2537e;

    /* JADX INFO: renamed from: f */
    public Object f2538f;

    /* JADX INFO: renamed from: g */
    public Object f2539g;

    public /* synthetic */ C0793k(byte b2, int i5) {
        this.f2536d = i5;
    }

    /* JADX INFO: renamed from: l */
    public static int m1337l(String str) {
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt < 128) {
                i6++;
            } else if (cCharAt < 2048) {
                i6 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i6 += 3;
            } else {
                i5 += 2;
                i6 += 4;
            }
            i5 = i7;
        }
        return i6;
    }

    @Override // p223q1.InterfaceC2909c
    /* JADX INFO: renamed from: a */
    public boolean mo97a(Object obj) {
        boolean z5;
        AbstractC1665j.m2985e(obj, "instance");
        synchronized (this.f2539g) {
            try {
                Object[] objArr = (Object[]) this.f2538f;
                int i5 = this.f2537e;
                z5 = false;
                for (int i6 = 0; i6 < i5; i6++) {
                    if (objArr[i6] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                }
                int i7 = this.f2537e;
                if (i7 < objArr.length) {
                    objArr[i7] = obj;
                    z5 = true;
                    this.f2537e = i7 + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: b */
    public void m1339b(int i5, C0072l0 c0072l0) {
        if (i5 < 0) {
            AbstractC3204b.m5475a("size should be >=0");
        }
        if (i5 == 0) {
            return;
        }
        C3426i c3426i = new C3426i(this.f2537e, i5, c0072l0);
        this.f2537e += i5;
        ((C1483e) this.f2538f).m2753b(c3426i);
    }

    @Override // p223q1.InterfaceC2909c
    /* JADX INFO: renamed from: c */
    public Object mo99c() {
        Object obj;
        synchronized (this.f2539g) {
            Object[] objArr = (Object[]) this.f2538f;
            int i5 = this.f2537e;
            obj = null;
            if (i5 > 0) {
                int i6 = i5 - 1;
                Object obj2 = objArr[i6];
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i6] = null;
                this.f2537e--;
                obj = obj2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m1340d(byte[] bArr, int i5, int i6) {
        char[] cArr;
        int i7;
        int i8;
        try {
            cArr = (char[]) this.f2538f;
            if (cArr == null) {
                cArr = i6 <= 256 ? new char[256] : new char[2048];
                this.f2538f = cArr;
            } else if (cArr.length < i6) {
                cArr = new char[2048];
                this.f2538f = cArr;
            }
            int i9 = i6 + i5;
            i7 = 0;
            while (i5 < i9) {
                int i10 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 > 0) {
                    cArr[i7] = (char) b2;
                    i7++;
                    i5 = i10;
                } else {
                    if (b2 < -32) {
                        i5 += 2;
                        byte b5 = bArr[i10];
                        if (b2 < -62 || b5 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i8 = i7 + 1;
                        cArr[i7] = (char) ((b5 & 63) | ((b2 & 31) << 6));
                    } else {
                        if (b2 >= -16) {
                            byte b6 = bArr[i10];
                            int i11 = i5 + 3;
                            byte b7 = bArr[i5 + 2];
                            i5 += 4;
                            byte b8 = bArr[i11];
                            if (b6 <= -65) {
                                if ((((b6 + 112) + (b2 << 28)) >> 30) == 0 && b7 <= -65 && b8 <= -65) {
                                    int i12 = ((b6 & 63) << 12) | ((b2 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                    int i13 = i7 + 1;
                                    cArr[i7] = (char) ((i12 >>> 10) + 55232);
                                    i7 += 2;
                                    cArr[i13] = (char) ((i12 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i14 = i5 + 2;
                        byte b9 = bArr[i10];
                        i5 += 3;
                        byte b10 = bArr[i14];
                        if ((b2 == -32 && b9 < -96) || ((b2 == -19 && b9 >= -96) || b9 > -65 || b10 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i8 = i7 + 1;
                        cArr[i7] = (char) (((b9 & 63) << 6) | ((b2 & 15) << 12) | (b10 & 63));
                    }
                    i7 = i8;
                }
            }
            if (i5 > i9) {
                throw new IllegalArgumentException("Invalid String");
            }
        } finally {
        }
        return new String(cArr, 0, i7);
    }

    /* JADX INFO: renamed from: e */
    public C3426i m1341e(int i5) {
        if (i5 < 0 || i5 >= this.f2537e) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Index ", ", size ");
            sbM404o.append(this.f2537e);
            AbstractC3204b.m5479e(sbM404o.toString());
        }
        C3426i c3426i = (C3426i) this.f2539g;
        if (c3426i != null) {
            int i6 = c3426i.f10706a;
            if (i5 < c3426i.f10707b + i6 && i6 <= i5) {
                return c3426i;
            }
        }
        C1483e c1483e = (C1483e) this.f2538f;
        C3426i c3426i2 = (C3426i) c1483e.f5181d[AbstractC3429l.m5692e(i5, c1483e)];
        this.f2539g = c3426i2;
        return c3426i2;
    }

    /* JADX INFO: renamed from: f */
    public long m1342f(int i5, int i6) {
        long jM1345i = 0;
        if (i6 <= 0) {
            return 0L;
        }
        int i7 = i6 >> 3;
        int i8 = i6 & 7;
        int i9 = 0;
        int i10 = i5;
        for (int i11 = 0; i11 < i7; i11++) {
            jM1345i ^= m1345i(i10);
            i10 += 8;
        }
        int i12 = i8 << 3;
        while (i9 < i12) {
            jM1345i ^= (((long) ((byte[]) this.f2539g)[i10]) & 255) << i9;
            i9 += 8;
            i10++;
        }
        int i13 = (i5 & 7) << 3;
        return (jM1345i >>> (64 - i13)) | (jM1345i << i13);
    }

    /* JADX INFO: renamed from: g */
    public int m1343g(Object obj) {
        C2444z c2444z = (C2444z) this.f2538f;
        int iM4364d = c2444z.m4364d(obj);
        if (iM4364d >= 0) {
            return c2444z.f7900c[iM4364d];
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public int m1344h() {
        byte[] bArr = (byte[]) this.f2539g;
        int i5 = this.f2537e;
        int i6 = i5 + 1;
        this.f2537e = i6;
        int i7 = bArr[i5] & 255;
        int i8 = i5 + 2;
        this.f2537e = i8;
        int i9 = ((bArr[i6] & 255) << 8) | i7;
        int i10 = i5 + 3;
        this.f2537e = i10;
        int i11 = i9 | ((bArr[i8] & 255) << 16);
        this.f2537e = i5 + 4;
        return (bArr[i10] << 24) | i11;
    }

    /* JADX INFO: renamed from: i */
    public long m1345i(int i5) {
        byte[] bArr = (byte[]) this.f2539g;
        int i6 = i5 + 6;
        return (((long) bArr[i5]) & 255) | ((((long) bArr[i5 + 1]) & 255) << 8) | ((((long) bArr[i5 + 2]) & 255) << 16) | ((((long) bArr[i5 + 3]) & 255) << 24) | ((((long) bArr[i5 + 4]) & 255) << 32) | ((((long) bArr[i5 + 5]) & 255) << 40) | ((((long) bArr[i6]) & 255) << 48) | (((long) bArr[i5 + 7]) << 56);
    }

    /* JADX INFO: renamed from: j */
    public short m1346j() {
        byte[] bArr = (byte[]) this.f2539g;
        int i5 = this.f2537e;
        int i6 = i5 + 1;
        this.f2537e = i6;
        int i7 = bArr[i5] & 255;
        this.f2537e = i5 + 2;
        return (short) ((bArr[i6] << 8) | i7);
    }

    /* JADX INFO: renamed from: k */
    public String m1347k(int i5) {
        if (i5 < 0) {
            return null;
        }
        if (i5 == 0) {
            return "";
        }
        String str = i5 > 2048 ? new String((byte[]) this.f2539g, this.f2537e, i5, StandardCharsets.UTF_8) : m1340d((byte[]) this.f2539g, this.f2537e, i5);
        this.f2537e += i5;
        return str;
    }

    /* JADX INFO: renamed from: m */
    public void m1348m(int i5, int i6, int i7, int i8, int i9, int i10, boolean z5, boolean z6, boolean z7, int i11) {
        long[] jArr = (long[]) this.f2538f;
        int i12 = this.f2537e;
        int i13 = i12 + 3;
        this.f2537e = i13;
        int length = jArr.length;
        if (length <= i13) {
            int iMax = Math.max(length * 2, i13);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC1665j.m2984d(jArrCopyOf, "copyOf(...)");
            this.f2538f = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f2539g, iMax);
            AbstractC1665j.m2984d(jArrCopyOf2, "copyOf(...)");
            this.f2539g = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f2538f;
        jArr2[i12] = (((long) i6) << 32) | (((long) i7) & 4294967295L);
        jArr2[i12 + 1] = (((long) i8) << 32) | (((long) i9) & 4294967295L);
        int i14 = i10 & 33554431;
        jArr2[i12 + 2] = ((z7 ? 1L : 0L) << 63) | ((z6 ? 1L : 0L) << 62) | ((z5 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i14) << 25) | ((long) (i5 & 33554431));
        if (i10 < 0) {
            return;
        }
        for (int i15 = i11 != -1 ? i11 : i12 - 3; i15 >= 0; i15 -= 3) {
            int i16 = i15 + 2;
            long j5 = jArr2[i16];
            if ((((int) j5) & 33554431) == i14) {
                jArr2[i16] = (j5 & AbstractC1167a.f3817a) | (((long) Math.min((i12 - i15) / 3, 1023)) << 50);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1349o(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f2539g, this.f2537e, length);
            this.f2537e += length;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1350p(int i5) {
        byte[] bArr = (byte[]) this.f2539g;
        int i6 = this.f2537e;
        int i7 = i6 + 1;
        this.f2537e = i7;
        bArr[i6] = (byte) i5;
        int i8 = i6 + 2;
        this.f2537e = i8;
        bArr[i7] = (byte) (i5 >> 8);
        int i9 = i6 + 3;
        this.f2537e = i9;
        bArr[i8] = (byte) (i5 >> 16);
        this.f2537e = i6 + 4;
        bArr[i9] = (byte) (i5 >> 24);
    }

    /* JADX INFO: renamed from: q */
    public void m1351q(int i5, int i6) {
        byte[] bArr = (byte[]) this.f2539g;
        bArr[i5] = (byte) i6;
        bArr[i5 + 1] = (byte) (i6 >> 8);
        bArr[i5 + 2] = (byte) (i6 >> 16);
        bArr[i5 + 3] = (byte) (i6 >> 24);
    }

    /* JADX INFO: renamed from: r */
    public void m1352r(long j5, int i5) {
        byte[] bArr = (byte[]) this.f2539g;
        bArr[i5] = (byte) j5;
        bArr[i5 + 1] = (byte) (j5 >> 8);
        bArr[i5 + 2] = (byte) (j5 >> 16);
        bArr[i5 + 3] = (byte) (j5 >> 24);
        bArr[i5 + 4] = (byte) (j5 >> 32);
        bArr[i5 + 5] = (byte) (j5 >> 40);
        bArr[i5 + 6] = (byte) (j5 >> 48);
        bArr[i5 + 7] = (byte) (j5 >> 56);
    }

    /* JADX INFO: renamed from: s */
    public void m1353s(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f2539g;
        int i5 = this.f2537e;
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            int i7 = i6 + 1;
            char cCharAt = str.charAt(i6);
            if (cCharAt < 128) {
                bArr[i5] = (byte) cCharAt;
                i5++;
            } else if (cCharAt < 2048) {
                int i8 = i5 + 1;
                bArr[i5] = (byte) ((cCharAt >>> 6) | 192);
                i5 += 2;
                bArr[i8] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i5] = (byte) ((cCharAt >>> '\f') | 224);
                int i9 = i5 + 2;
                bArr[i5 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i5 += 3;
                bArr[i9] = (byte) ((cCharAt & '?') | 128);
            } else {
                i6 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i7)) - 56613888;
                bArr[i5] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i5 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i10 = i5 + 3;
                bArr[i5 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i5 += 4;
                bArr[i10] = (byte) ((iCharAt & 63) | 128);
            }
            i6 = i7;
        }
        this.f2537e = i5;
    }

    /* JADX INFO: renamed from: t */
    public void m1354t(int i5, boolean z5) {
        int i6 = i5 & 33554431;
        long[] jArr = (long[]) this.f2538f;
        int i7 = this.f2537e;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i7; i8 += 3) {
            int i9 = i8 + 2;
            long j5 = jArr[i9];
            if ((((int) j5) & 33554431) == i6) {
                long j6 = z5 ? 1L : 0L;
                jArr[i9] = (j6 * Long.MIN_VALUE) | (8070450532247928831L & j5) | (1152921504606846976L * j6);
                return;
            }
        }
    }

    public String toString() {
        switch (this.f2536d) {
            case 4:
                StringBuilder sb = new StringBuilder();
                if (((EnumC1716z) this.f2538f) == EnumC1716z.f5944f) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f2537e);
                sb.append(' ');
                sb.append((String) this.f2539g);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1355u(int i5, int i6, long j5) {
        int i7;
        char c5;
        char c6;
        long[] jArr = (long[]) this.f2538f;
        long[] jArr2 = (long[]) this.f2539g;
        jArr2[0] = j5;
        int i8 = 1;
        while (i8 > 0) {
            i8--;
            long j6 = jArr2[i8];
            int i9 = 33554431;
            int i10 = ((int) j6) & 33554431;
            char c7 = 25;
            int i11 = ((int) (j6 >> 25)) & 33554431;
            char c8 = '2';
            int i12 = ((int) (j6 >> 50)) & 1023;
            int i13 = i12 == 1023 ? this.f2537e : (i12 * 3) + i11;
            if (i11 < 0) {
                return;
            }
            while (i11 < jArr.length - 2 && i11 < i13) {
                int i14 = i11 + 2;
                long j7 = jArr[i14];
                if ((((int) (j7 >> c7)) & i9) == i10) {
                    long j8 = jArr[i11];
                    int i15 = i11 + 1;
                    i7 = i9;
                    c5 = c7;
                    long j9 = jArr[i15];
                    c6 = c8;
                    jArr[i11] = (((long) (((int) j8) + i6)) & 4294967295L) | (((long) (((int) (j8 >> 32)) + i5)) << 32);
                    jArr[i15] = (((long) (((int) j9) + i6)) & 4294967295L) | (((long) (((int) (j9 >> 32)) + i5)) << 32);
                    jArr[i14] = (((j7 >> 63) & 1) << 60) | j7;
                    if ((((int) (j7 >> c6)) & 1023) > 0) {
                        jArr2[i8] = (AbstractC1167a.f3818b & j7) | (((long) ((i11 + 3) & i7)) << c5);
                        i8++;
                    }
                } else {
                    i7 = i9;
                    c5 = c7;
                    c6 = c8;
                }
                i11 += 3;
                i9 = i7;
                c7 = c5;
                c8 = c6;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1356v(int i5, InterfaceC1605g interfaceC1605g) {
        int i6 = i5 & 33554431;
        long[] jArr = (long[]) this.f2538f;
        int i7 = this.f2537e;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i7; i8 += 3) {
            if ((((int) jArr[i8 + 2]) & 33554431) == i6) {
                long j5 = jArr[i8];
                long j6 = jArr[i8 + 1];
                interfaceC1605g.mo1949l(Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) j5), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6));
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0793k(int i5, int i6) {
        this(0, new byte[i5]);
        this.f2536d = i6;
        switch (i6) {
            case 6:
                if (i5 <= 0) {
                    throw new IllegalArgumentException("The max pool size must be > 0");
                }
                this.f2538f = new Object[i5];
                this.f2539g = new Object();
                return;
            default:
                return;
        }
    }

    public C0793k(int i5, byte[] bArr) {
        this.f2536d = 0;
        this.f2538f = null;
        this.f2539g = bArr;
        this.f2537e = i5;
    }

    public C0793k(EnumC1716z enumC1716z, int i5, String str) {
        this.f2536d = 4;
        this.f2538f = enumC1716z;
        this.f2537e = i5;
        this.f2539g = str;
    }

    public C0793k(ArrayList arrayList, int i5, MotionEvent motionEvent) {
        this.f2536d = 9;
        this.f2538f = arrayList;
        this.f2537e = i5;
        this.f2539g = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[LOOP:1: B:27:0x00c2->B:33:0x00e4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0793k(p132a3.C1804d r13, p255w.C3375f r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049I2.C0793k.<init>(a3.d, w.f):void");
    }

    public C0793k() {
        this.f2536d = 7;
        this.f2538f = new C1483e(new C3426i[16]);
    }

    public C0793k(InterfaceC0697T0 interfaceC0697T0) {
        this.f2536d = 1;
        this.f2538f = interfaceC0697T0;
    }

    public C0793k(C1213n c1213n) {
        this.f2536d = 3;
        this.f2539g = AbstractC2602c.m4547a(150, new C0066i0(16, this));
        this.f2538f = c1213n;
    }
}
