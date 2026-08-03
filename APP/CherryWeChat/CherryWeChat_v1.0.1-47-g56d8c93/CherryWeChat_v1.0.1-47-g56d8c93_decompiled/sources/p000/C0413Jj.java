package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Jj */
/* JADX INFO: loaded from: classes.dex */
public final class C0413Jj {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f1383b;

    /* JADX INFO: renamed from: c */
    public C0370Ij f1384c;

    /* JADX INFO: renamed from: a */
    public final byte[] f1382a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f1385d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m857a() {
        return this.f1384c.f1286b != 0;
    }

    /* JADX INFO: renamed from: b */
    public final C0370Ij m858b() {
        byte[] bArr;
        if (this.f1383b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m857a()) {
            return this.f1384c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m859c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f1384c.f1290f = this.f1383b.getShort();
            this.f1384c.f1291g = this.f1383b.getShort();
            int iM859c = m859c();
            C0370Ij c0370Ij = this.f1384c;
            c0370Ij.f1292h = (iM859c & 128) != 0;
            c0370Ij.f1293i = (int) Math.pow(2.0d, (iM859c & 7) + 1);
            this.f1384c.f1294j = m859c();
            C0370Ij c0370Ij2 = this.f1384c;
            m859c();
            c0370Ij2.getClass();
            if (this.f1384c.f1292h && !m857a()) {
                C0370Ij c0370Ij3 = this.f1384c;
                c0370Ij3.f1285a = m861e(c0370Ij3.f1293i);
                C0370Ij c0370Ij4 = this.f1384c;
                c0370Ij4.f1295k = c0370Ij4.f1285a[c0370Ij4.f1294j];
            }
        } else {
            this.f1384c.f1286b = 1;
        }
        if (!m857a()) {
            boolean z = false;
            while (!z && !m857a() && this.f1384c.f1287c <= Integer.MAX_VALUE) {
                int iM859c2 = m859c();
                if (iM859c2 == 33) {
                    int iM859c3 = m859c();
                    if (iM859c3 == 1) {
                        m862f();
                    } else if (iM859c3 == 249) {
                        this.f1384c.f1288d = new C0155Dj();
                        m859c();
                        int iM859c4 = m859c();
                        C0155Dj c0155Dj = this.f1384c.f1288d;
                        int i2 = (iM859c4 & 28) >> 2;
                        c0155Dj.f425g = i2;
                        if (i2 == 0) {
                            c0155Dj.f425g = 1;
                        }
                        c0155Dj.f424f = (iM859c4 & 1) != 0;
                        short s = this.f1383b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C0155Dj c0155Dj2 = this.f1384c.f1288d;
                        c0155Dj2.f427i = s * 10;
                        c0155Dj2.f426h = m859c();
                        m859c();
                    } else if (iM859c3 == 254) {
                        m862f();
                    } else if (iM859c3 != 255) {
                        m862f();
                    } else {
                        m860d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f1382a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m860d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f1384c.getClass();
                                }
                                if (this.f1385d > 0) {
                                }
                            } while (!m857a());
                        } else {
                            m862f();
                        }
                    }
                } else if (iM859c2 == 44) {
                    C0370Ij c0370Ij5 = this.f1384c;
                    if (c0370Ij5.f1288d == null) {
                        c0370Ij5.f1288d = new C0155Dj();
                    }
                    c0370Ij5.f1288d.f419a = this.f1383b.getShort();
                    this.f1384c.f1288d.f420b = this.f1383b.getShort();
                    this.f1384c.f1288d.f421c = this.f1383b.getShort();
                    this.f1384c.f1288d.f422d = this.f1383b.getShort();
                    int iM859c5 = m859c();
                    boolean z2 = (iM859c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM859c5 & 7) + 1);
                    C0155Dj c0155Dj3 = this.f1384c.f1288d;
                    c0155Dj3.f423e = (iM859c5 & 64) != 0;
                    if (z2) {
                        c0155Dj3.f429k = m861e(iPow);
                    } else {
                        c0155Dj3.f429k = null;
                    }
                    this.f1384c.f1288d.f428j = this.f1383b.position();
                    m859c();
                    m862f();
                    if (!m857a()) {
                        C0370Ij c0370Ij6 = this.f1384c;
                        c0370Ij6.f1287c++;
                        c0370Ij6.f1289e.add(c0370Ij6.f1288d);
                    }
                } else if (iM859c2 != 59) {
                    this.f1384c.f1286b = 1;
                } else {
                    z = true;
                }
            }
            C0370Ij c0370Ij7 = this.f1384c;
            if (c0370Ij7.f1287c < 0) {
                c0370Ij7.f1286b = 1;
            }
        }
        return this.f1384c;
    }

    /* JADX INFO: renamed from: c */
    public final int m859c() {
        try {
            return this.f1383b.get() & 255;
        } catch (Exception unused) {
            this.f1384c.f1286b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m860d() {
        int iM859c = m859c();
        this.f1385d = iM859c;
        if (iM859c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f1385d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f1383b.get(this.f1382a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.f1384c.f1286b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m861e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f1383b.get(bArr);
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
        } catch (BufferUnderflowException unused) {
            this.f1384c.f1286b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m862f() {
        int iM859c;
        do {
            iM859c = m859c();
            this.f1383b.position(Math.min(this.f1383b.position() + iM859c, this.f1383b.limit()));
        } while (iM859c > 0);
    }
}
