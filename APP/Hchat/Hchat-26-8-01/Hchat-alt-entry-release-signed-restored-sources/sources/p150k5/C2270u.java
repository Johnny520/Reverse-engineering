package p150k5;

import af.C0081d;
import androidx.lifecycle.C0119x;
import bsh.C0353j;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import p046d6.AbstractC0707d;
import p068eh.AbstractC0921a;
import p074f5.C1071g;
import p136j8.C2104o;
import p180m5.AbstractC2780a;
import p180m5.C2781b;

/* JADX INFO: renamed from: k5.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2270u {

    /* JADX INFO: renamed from: a */
    public final C0119x f7531a;

    /* JADX INFO: renamed from: b */
    public final C0119x f7532b;

    /* JADX INFO: renamed from: c */
    public final C1071g f7533c;

    /* JADX INFO: renamed from: d */
    public final int f7534d;

    /* JADX INFO: renamed from: e */
    public final int f7535e;

    /* JADX INFO: renamed from: f */
    public final int f7536f;

    /* JADX INFO: renamed from: g */
    public final int f7537g;

    /* JADX INFO: renamed from: h */
    public final int f7538h;

    /* JADX INFO: renamed from: i */
    public final int f7539i;

    /* JADX INFO: renamed from: j */
    public final int f7540j;

    /* JADX INFO: renamed from: k */
    public final int f7541k;

    /* JADX INFO: renamed from: l */
    public final int f7542l;

    /* JADX INFO: renamed from: m */
    public final int f7543m;

    /* JADX INFO: renamed from: n */
    public final int f7544n;

    /* JADX INFO: renamed from: o */
    public final int f7545o;

    /* JADX INFO: renamed from: p */
    public final int f7546p;

    /* JADX INFO: renamed from: q */
    public final int f7547q;

    /* JADX INFO: renamed from: r */
    public final C2268s f7548r = new C2268s(this, 0);

    /* JADX INFO: renamed from: s */
    public final C2268s f7549s = new C2268s(this, 1);

    /* JADX INFO: renamed from: t */
    public final C2265p f7550t = new C2265p(this, 3);

    /* JADX INFO: renamed from: u */
    public final C2265p f7551u = new C2265p(this, 4);

    /* JADX INFO: renamed from: v */
    public final C2265p f7552v = new C2265p(this, 5);

    /* JADX INFO: renamed from: w */
    public final C2265p f7553w = new C2265p(this, 0);

    /* JADX INFO: renamed from: x */
    public final C2265p f7554x = new C2265p(this, 1);

    /* JADX INFO: renamed from: y */
    public final C2265p f7555y = new C2265p(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2270u(byte[] bArr) {
        int i9;
        C0119x c0119x = new C0119x(bArr, 28);
        this.f7531a = c0119x;
        this.f7532b = new C0119x(bArr, 28);
        int iM6158a = AbstractC2780a.m6158a(bArr);
        switch (iM6158a) {
            case 35:
                i9 = 23;
                break;
            case 36:
            default:
                i9 = -1;
                break;
            case 37:
                i9 = 25;
                break;
            case 38:
                i9 = 27;
                break;
            case 39:
                i9 = 29;
                break;
            case 40:
                i9 = 34;
                break;
            case 41:
                i9 = 35;
                break;
        }
        if (i9 == -1) {
            C0353j.m1309g(AbstractC0921a.m2249l(iM6158a, "Unsupported dex version "));
            throw null;
        }
        this.f7533c = new C1071g(i9);
        c0119x.m583N(32);
        this.f7534d = c0119x.m583N(56);
        this.f7535e = c0119x.m583N(60);
        this.f7536f = c0119x.m583N(64);
        this.f7537g = c0119x.m583N(68);
        this.f7538h = c0119x.m583N(72);
        this.f7539i = c0119x.m583N(76);
        this.f7540j = c0119x.m583N(80);
        this.f7541k = c0119x.m583N(84);
        this.f7542l = c0119x.m583N(88);
        this.f7543m = c0119x.m583N(92);
        this.f7544n = c0119x.m583N(96);
        this.f7545o = c0119x.m583N(100);
        this.f7546p = c0119x.m583N(52);
        C2781b c2781bM5525b = m5525b(61440);
        if (c2781bM5525b != null) {
            this.f7547q = c2781bM5525b.f9021a.f7532b.m583N(c2781bM5525b.f9022b + 8);
        } else {
            this.f7547q = 0;
        }
        if ((iM6158a >= 41 ? c0119x.m583N(116) : 0) != 0) {
            throw new C0081d("Unexpected container offset in header");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2270u m5524a(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArrM1874a;
        if (!bufferedInputStream.markSupported()) {
            C2104o.m5294t("InputStream must support mark");
            return null;
        }
        bufferedInputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                AbstractC0707d.m1879f(bufferedInputStream, bArr);
                bufferedInputStream.reset();
                int iM6158a = AbstractC2780a.m6158a(bArr);
                if (iM6158a == -1) {
                    StringBuilder sb2 = new StringBuilder("Not a valid dex magic value:");
                    for (int i9 = 0; i9 < 8; i9++) {
                        sb2.append(String.format(" %02x", Byte.valueOf(bArr[i9])));
                    }
                    throw new C0081d(sb2.toString());
                }
                switch (iM6158a) {
                    case 35:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        int i10 = (bArr[43] << 24) | (bArr[40] & 255) | ((bArr[41] & 255) << 8) | ((bArr[42] & 255) << 16);
                        if (i10 == 2018915346) {
                            throw new C0081d("Big endian dex files are not supported");
                        }
                        if (i10 != 305419896) {
                            throw new C0081d(String.format("Invalid endian tag: 0x%x", Integer.valueOf(i10)));
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(20);
                        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
                        int i11 = 0;
                        while (true) {
                            if (i11 < 2147483639) {
                                int iMin2 = Math.min(iMin, 2147483639 - i11);
                                byte[] bArr2 = new byte[iMin2];
                                arrayDeque.add(bArr2);
                                int i12 = 0;
                                while (i12 < iMin2) {
                                    int i13 = bufferedInputStream.read(bArr2, i12, iMin2 - i12);
                                    if (i13 == -1) {
                                        bArrM1874a = AbstractC0707d.m1874a(arrayDeque, i11);
                                    } else {
                                        i12 += i13;
                                        i11 += i13;
                                    }
                                }
                                long j3 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
                                iMin = j3 > 2147483647L ? Integer.MAX_VALUE : j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
                            } else {
                                if (bufferedInputStream.read() != -1) {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrM1874a = AbstractC0707d.m1874a(arrayDeque, 2147483639);
                            }
                        }
                        return new C2270u(bArrM1874a);
                    case 36:
                    default:
                        throw new C0081d(String.format("Dex version %03d is not supported", Integer.valueOf(iM6158a)));
                }
            } catch (EOFException unused) {
                throw new C0081d("File is too short");
            }
        } catch (Throwable th2) {
            bufferedInputStream.reset();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2781b m5525b(int i9) {
        for (C2781b c2781b : new C2267r(this.f7532b.m583N(this.f7546p), 0, this)) {
            if (c2781b.f9021a.f7532b.m585P(c2781b.f9022b) == i9) {
                return c2781b;
            }
        }
        return null;
    }
}
