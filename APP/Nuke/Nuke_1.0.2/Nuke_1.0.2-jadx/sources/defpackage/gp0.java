package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 {
    public ByteBuffer b;
    public fp0 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.c.b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fp0 b() {
        byte[] bArr;
        if (this.b == null) {
            s.l("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        fp0 fp0Var = this.c;
        if (zStartsWith) {
            fp0Var.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            fp0 fp0Var2 = this.c;
            fp0Var2.h = (iC & 128) != 0;
            fp0Var2.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            fp0 fp0Var3 = this.c;
            c();
            fp0Var3.getClass();
            if (this.c.h && !a()) {
                fp0 fp0Var4 = this.c;
                fp0Var4.a = e(fp0Var4.i);
                fp0 fp0Var5 = this.c;
                fp0Var5.k = fp0Var5.a[fp0Var5.j];
            }
        } else {
            fp0Var.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new bp0();
                        c();
                        int iC4 = c();
                        bp0 bp0Var = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        bp0Var.g = i2;
                        if (i2 == 0) {
                            bp0Var.g = 1;
                        }
                        bp0Var.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        bp0 bp0Var2 = this.c.d;
                        bp0Var2.i = s * 10;
                        bp0Var2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    fp0 fp0Var6 = this.c;
                    if (fp0Var6.d == null) {
                        fp0Var6.d = new bp0();
                    }
                    fp0Var6.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    bp0 bp0Var3 = this.c.d;
                    bp0Var3.e = (iC5 & 64) != 0;
                    if (z2) {
                        bp0Var3.k = e(iPow);
                    } else {
                        bp0Var3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        fp0 fp0Var7 = this.c;
                        fp0Var7.c++;
                        fp0Var7.e.add(fp0Var7.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            fp0 fp0Var8 = this.c;
            if (fp0Var8.c < 0) {
                fp0Var8.b = 1;
            }
        }
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbK = hk1.k("Error Reading Block n: ", i, i2, " count: ", " blockSize: ");
                    sbK.append(this.d);
                    Log.d("GifHeaderParser", sbK.toString(), e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
