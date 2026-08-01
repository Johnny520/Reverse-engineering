package p285;

import android.util.Log;
import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8389 f23244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ByteBuffer f23245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f23246 = new byte[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23243 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13958() {
        int iM13961;
        do {
            iM13961 = m13961();
            this.f23245.position(Math.min(this.f23245.position() + iM13961, this.f23245.limit()));
        } while (iM13961 > 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int[] m13959(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f23245.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & DefaultClassResolver.NAME;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & DefaultClassResolver.NAME;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & DefaultClassResolver.NAME);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f23244.f23251 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13960() {
        int iM13961 = m13961();
        this.f23243 = iM13961;
        if (iM13961 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f23243;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f23245.get(this.f23246, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM149 = AbstractC0053.m149(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbM149.append(this.f23243);
                    Log.d("GifHeaderParser", sbM149.toString(), e);
                }
                this.f23244.f23251 = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13961() {
        try {
            return this.f23245.get() & DefaultClassResolver.NAME;
        } catch (Exception unused) {
            this.f23244.f23251 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8389 m13962() {
        byte[] bArr;
        if (this.f23245 == null) {
            C5925.m11311("You must call setData() before parseHeader()");
            return null;
        }
        if (m13963()) {
            return this.f23244;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m13961());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        C8389 c8389 = this.f23244;
        if (zStartsWith) {
            c8389.f23247 = this.f23245.getShort();
            this.f23244.f23254 = this.f23245.getShort();
            int iM13961 = m13961();
            C8389 c83892 = this.f23244;
            c83892.f23253 = (iM13961 & 128) != 0;
            c83892.f23256 = (int) Math.pow(2.0d, (iM13961 & 7) + 1);
            this.f23244.f23257 = m13961();
            C8389 c83893 = this.f23244;
            m13961();
            c83893.getClass();
            if (this.f23244.f23253 && !m13963()) {
                C8389 c83894 = this.f23244;
                c83894.f23252 = m13959(c83894.f23256);
                C8389 c83895 = this.f23244;
                c83895.f23255 = c83895.f23252[c83895.f23257];
            }
        } else {
            c8389.f23251 = 1;
        }
        if (!m13963()) {
            boolean z = false;
            while (!z && !m13963() && this.f23244.f23250 <= Integer.MAX_VALUE) {
                int iM139612 = m13961();
                if (iM139612 == 33) {
                    int iM139613 = m13961();
                    if (iM139613 == 1) {
                        m13958();
                    } else if (iM139613 == 249) {
                        this.f23244.f23249 = new C8390();
                        m13961();
                        int iM139614 = m13961();
                        C8390 c8390 = this.f23244.f23249;
                        int i2 = (iM139614 & 28) >> 2;
                        c8390.f23265 = i2;
                        if (i2 == 0) {
                            c8390.f23265 = 1;
                        }
                        c8390.f23258 = (iM139614 & 1) != 0;
                        short s = this.f23245.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C8390 c83902 = this.f23244.f23249;
                        c83902.f23267 = s * 10;
                        c83902.f23264 = m13961();
                        m13961();
                    } else if (iM139613 == 254) {
                        m13958();
                    } else if (iM139613 != 255) {
                        m13958();
                    } else {
                        m13960();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f23246;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m13960();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f23244.getClass();
                                }
                                if (this.f23243 > 0) {
                                }
                            } while (!m13963());
                        } else {
                            m13958();
                        }
                    }
                } else if (iM139612 == 44) {
                    C8389 c83896 = this.f23244;
                    if (c83896.f23249 == null) {
                        c83896.f23249 = new C8390();
                    }
                    c83896.f23249.f23263 = this.f23245.getShort();
                    this.f23244.f23249.f23262 = this.f23245.getShort();
                    this.f23244.f23249.f23261 = this.f23245.getShort();
                    this.f23244.f23249.f23260 = this.f23245.getShort();
                    int iM139615 = m13961();
                    boolean z2 = (iM139615 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM139615 & 7) + 1);
                    C8390 c83903 = this.f23244.f23249;
                    c83903.f23259 = (iM139615 & 64) != 0;
                    if (z2) {
                        c83903.f23266 = m13959(iPow);
                    } else {
                        c83903.f23266 = null;
                    }
                    this.f23244.f23249.f23268 = this.f23245.position();
                    m13961();
                    m13958();
                    if (!m13963()) {
                        C8389 c83897 = this.f23244;
                        c83897.f23250++;
                        c83897.f23248.add(c83897.f23249);
                    }
                } else if (iM139612 != 59) {
                    this.f23244.f23251 = 1;
                } else {
                    z = true;
                }
            }
            C8389 c83898 = this.f23244;
            if (c83898.f23250 < 0) {
                c83898.f23251 = 1;
            }
        }
        return this.f23244;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13963() {
        return this.f23244.f23251 != 0;
    }
}
