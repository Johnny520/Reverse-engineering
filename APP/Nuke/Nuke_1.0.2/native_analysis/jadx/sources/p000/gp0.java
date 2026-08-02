package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3647b;

    /* JADX INFO: renamed from: c */
    public fp0 f3648c;

    /* JADX INFO: renamed from: a */
    public final byte[] f3646a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f3649d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m2008a() {
        return this.f3648c.f3093b != 0;
    }

    /* JADX INFO: renamed from: b */
    public final fp0 m2009b() {
        byte[] bArr;
        if (this.f3647b == null) {
            C0676s.m4653l("You must call setData() before parseHeader()");
            return null;
        }
        if (m2008a()) {
            return this.f3648c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m2010c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        fp0 fp0Var = this.f3648c;
        if (zStartsWith) {
            fp0Var.f3097f = this.f3647b.getShort();
            this.f3648c.f3098g = this.f3647b.getShort();
            int iM2010c = m2010c();
            fp0 fp0Var2 = this.f3648c;
            fp0Var2.f3099h = (iM2010c & 128) != 0;
            fp0Var2.f3100i = (int) Math.pow(2.0d, (iM2010c & 7) + 1);
            this.f3648c.f3101j = m2010c();
            fp0 fp0Var3 = this.f3648c;
            m2010c();
            fp0Var3.getClass();
            if (this.f3648c.f3099h && !m2008a()) {
                fp0 fp0Var4 = this.f3648c;
                fp0Var4.f3092a = m2012e(fp0Var4.f3100i);
                fp0 fp0Var5 = this.f3648c;
                fp0Var5.f3102k = fp0Var5.f3092a[fp0Var5.f3101j];
            }
        } else {
            fp0Var.f3093b = 1;
        }
        if (!m2008a()) {
            boolean z = false;
            while (!z && !m2008a() && this.f3648c.f3094c <= Integer.MAX_VALUE) {
                int iM2010c2 = m2010c();
                if (iM2010c2 == 33) {
                    int iM2010c3 = m2010c();
                    if (iM2010c3 == 1) {
                        m2013f();
                    } else if (iM2010c3 == 249) {
                        this.f3648c.f3095d = new bp0();
                        m2010c();
                        int iM2010c4 = m2010c();
                        bp0 bp0Var = this.f3648c.f3095d;
                        int i2 = (iM2010c4 & 28) >> 2;
                        bp0Var.f974g = i2;
                        if (i2 == 0) {
                            bp0Var.f974g = 1;
                        }
                        bp0Var.f973f = (iM2010c4 & 1) != 0;
                        short s = this.f3647b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        bp0 bp0Var2 = this.f3648c.f3095d;
                        bp0Var2.f976i = s * 10;
                        bp0Var2.f975h = m2010c();
                        m2010c();
                    } else if (iM2010c3 == 254) {
                        m2013f();
                    } else if (iM2010c3 != 255) {
                        m2013f();
                    } else {
                        m2011d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f3646a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m2011d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f3648c.getClass();
                                }
                                if (this.f3649d > 0) {
                                }
                            } while (!m2008a());
                        } else {
                            m2013f();
                        }
                    }
                } else if (iM2010c2 == 44) {
                    fp0 fp0Var6 = this.f3648c;
                    if (fp0Var6.f3095d == null) {
                        fp0Var6.f3095d = new bp0();
                    }
                    fp0Var6.f3095d.f968a = this.f3647b.getShort();
                    this.f3648c.f3095d.f969b = this.f3647b.getShort();
                    this.f3648c.f3095d.f970c = this.f3647b.getShort();
                    this.f3648c.f3095d.f971d = this.f3647b.getShort();
                    int iM2010c5 = m2010c();
                    boolean z2 = (iM2010c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM2010c5 & 7) + 1);
                    bp0 bp0Var3 = this.f3648c.f3095d;
                    bp0Var3.f972e = (iM2010c5 & 64) != 0;
                    if (z2) {
                        bp0Var3.f978k = m2012e(iPow);
                    } else {
                        bp0Var3.f978k = null;
                    }
                    this.f3648c.f3095d.f977j = this.f3647b.position();
                    m2010c();
                    m2013f();
                    if (!m2008a()) {
                        fp0 fp0Var7 = this.f3648c;
                        fp0Var7.f3094c++;
                        fp0Var7.f3096e.add(fp0Var7.f3095d);
                    }
                } else if (iM2010c2 != 59) {
                    this.f3648c.f3093b = 1;
                } else {
                    z = true;
                }
            }
            fp0 fp0Var8 = this.f3648c;
            if (fp0Var8.f3094c < 0) {
                fp0Var8.f3093b = 1;
            }
        }
        return this.f3648c;
    }

    /* JADX INFO: renamed from: c */
    public final int m2010c() {
        try {
            return this.f3647b.get() & 255;
        } catch (Exception unused) {
            this.f3648c.f3093b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2011d() {
        int iM2010c = m2010c();
        this.f3649d = iM2010c;
        if (iM2010c <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f3649d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f3647b.get(this.f3646a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM2212k = hk1.m2212k("Error Reading Block n: ", i, i2, " count: ", " blockSize: ");
                    sbM2212k.append(this.f3649d);
                    Log.d("GifHeaderParser", sbM2212k.toString(), e);
                }
                this.f3648c.f3093b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m2012e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f3647b.get(bArr);
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
            this.f3648c.f3093b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2013f() {
        int iM2010c;
        do {
            iM2010c = m2010c();
            this.f3647b.position(Math.min(this.f3647b.position() + iM2010c, this.f3647b.limit()));
        } while (iM2010c > 0);
    }
}
