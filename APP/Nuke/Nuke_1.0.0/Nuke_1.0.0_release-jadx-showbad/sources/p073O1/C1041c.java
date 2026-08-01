package p073O1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: O1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1041c {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3258b;

    /* JADX INFO: renamed from: c */
    public C1040b f3259c;

    /* JADX INFO: renamed from: a */
    public final byte[] f3257a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f3260d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2113a() {
        return this.f3259c.f3247b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1040b m2114b() {
        byte[] bArr;
        if (this.f3258b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m2113a()) {
            return this.f3259c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 6; i5++) {
            sb.append((char) m2115c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f3259c.f3251f = this.f3258b.getShort();
            this.f3259c.f3252g = this.f3258b.getShort();
            int iM2115c = m2115c();
            C1040b c1040b = this.f3259c;
            c1040b.f3253h = (iM2115c & 128) != 0;
            c1040b.f3254i = (int) Math.pow(2.0d, (iM2115c & 7) + 1);
            this.f3259c.f3255j = m2115c();
            C1040b c1040b2 = this.f3259c;
            m2115c();
            c1040b2.getClass();
            if (this.f3259c.f3253h && !m2113a()) {
                C1040b c1040b3 = this.f3259c;
                c1040b3.f3246a = m2117e(c1040b3.f3254i);
                C1040b c1040b4 = this.f3259c;
                c1040b4.f3256k = c1040b4.f3246a[c1040b4.f3255j];
            }
        } else {
            this.f3259c.f3247b = 1;
        }
        if (!m2113a()) {
            boolean z5 = false;
            while (!z5 && !m2113a() && this.f3259c.f3248c <= Integer.MAX_VALUE) {
                int iM2115c2 = m2115c();
                if (iM2115c2 == 33) {
                    int iM2115c3 = m2115c();
                    if (iM2115c3 == 1) {
                        m2118f();
                    } else if (iM2115c3 == 249) {
                        this.f3259c.f3249d = new C1039a();
                        m2115c();
                        int iM2115c4 = m2115c();
                        C1039a c1039a = this.f3259c.f3249d;
                        int i6 = (iM2115c4 & 28) >> 2;
                        c1039a.f3241g = i6;
                        if (i6 == 0) {
                            c1039a.f3241g = 1;
                        }
                        c1039a.f3240f = (iM2115c4 & 1) != 0;
                        short s5 = this.f3258b.getShort();
                        if (s5 < 2) {
                            s5 = 10;
                        }
                        C1039a c1039a2 = this.f3259c.f3249d;
                        c1039a2.f3243i = s5 * 10;
                        c1039a2.f3242h = m2115c();
                        m2115c();
                    } else if (iM2115c3 == 254) {
                        m2118f();
                    } else if (iM2115c3 != 255) {
                        m2118f();
                    } else {
                        m2116d();
                        StringBuilder sb2 = new StringBuilder();
                        int i7 = 0;
                        while (true) {
                            bArr = this.f3257a;
                            if (i7 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i7]);
                            i7++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m2116d();
                                if (bArr[0] == 1) {
                                    byte b2 = bArr[1];
                                    byte b5 = bArr[2];
                                    this.f3259c.getClass();
                                }
                                if (this.f3260d > 0) {
                                }
                            } while (!m2113a());
                        } else {
                            m2118f();
                        }
                    }
                } else if (iM2115c2 == 44) {
                    C1040b c1040b5 = this.f3259c;
                    if (c1040b5.f3249d == null) {
                        c1040b5.f3249d = new C1039a();
                    }
                    c1040b5.f3249d.f3235a = this.f3258b.getShort();
                    this.f3259c.f3249d.f3236b = this.f3258b.getShort();
                    this.f3259c.f3249d.f3237c = this.f3258b.getShort();
                    this.f3259c.f3249d.f3238d = this.f3258b.getShort();
                    int iM2115c5 = m2115c();
                    boolean z6 = (iM2115c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM2115c5 & 7) + 1);
                    C1039a c1039a3 = this.f3259c.f3249d;
                    c1039a3.f3239e = (iM2115c5 & 64) != 0;
                    if (z6) {
                        c1039a3.f3245k = m2117e(iPow);
                    } else {
                        c1039a3.f3245k = null;
                    }
                    this.f3259c.f3249d.f3244j = this.f3258b.position();
                    m2115c();
                    m2118f();
                    if (!m2113a()) {
                        C1040b c1040b6 = this.f3259c;
                        c1040b6.f3248c++;
                        c1040b6.f3250e.add(c1040b6.f3249d);
                    }
                } else if (iM2115c2 != 59) {
                    this.f3259c.f3247b = 1;
                } else {
                    z5 = true;
                }
            }
            C1040b c1040b7 = this.f3259c;
            if (c1040b7.f3248c < 0) {
                c1040b7.f3247b = 1;
            }
        }
        return this.f3259c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m2115c() {
        try {
            return this.f3258b.get() & 255;
        } catch (Exception unused) {
            this.f3259c.f3247b = 1;
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2116d() {
        int iM2115c = m2115c();
        this.f3260d = iM2115c;
        if (iM2115c <= 0) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            try {
                i6 = this.f3260d;
                if (i5 >= i6) {
                    return;
                }
                i6 -= i5;
                this.f3258b.get(this.f3257a, i5, i6);
                i5 += i6;
            } catch (Exception e5) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i5 + " count: " + i6 + " blockSize: " + this.f3260d, e5);
                }
                this.f3259c.f3247b = 1;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int[] m2117e(int i5) {
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = null;
        try {
            this.f3258b.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = bArr[i7] & 255;
                int i9 = i7 + 2;
                int i10 = bArr[i7 + 1] & 255;
                i7 += 3;
                int i11 = i6 + 1;
                iArr[i6] = (i10 << 8) | (i8 << 16) | (-16777216) | (bArr[i9] & 255);
                i6 = i11;
            }
            return iArr;
        } catch (BufferUnderflowException e5) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e5);
            }
            this.f3259c.f3247b = 1;
            return iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2118f() {
        int iM2115c;
        do {
            iM2115c = m2115c();
            this.f3258b.position(Math.min(this.f3258b.position() + iM2115c, this.f3258b.limit()));
        } while (iM2115c > 0);
    }
}
