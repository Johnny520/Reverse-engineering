package p285;

import android.util.Log;
import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8388 f23245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ByteBuffer f23246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f23247 = new byte[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23244 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13941() {
        int iM13944;
        do {
            iM13944 = m13944();
            this.f23246.position(Math.min(this.f23246.position() + iM13944, this.f23246.limit()));
        } while (iM13944 > 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int[] m13942(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f23246.get(bArr);
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
            this.f23245.f23252 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13943() {
        int iM13944 = m13944();
        this.f23244 = iM13944;
        if (iM13944 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f23244;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f23246.get(this.f23247, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM151 = AbstractC0053.m151(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbM151.append(this.f23244);
                    Log.d("GifHeaderParser", sbM151.toString(), e);
                }
                this.f23245.f23252 = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13944() {
        try {
            return this.f23246.get() & DefaultClassResolver.NAME;
        } catch (Exception unused) {
            this.f23245.f23252 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8388 m13945() {
        byte[] bArr;
        if (this.f23246 == null) {
            C5919.m11250("You must call setData() before parseHeader()");
            return null;
        }
        if (m13946()) {
            return this.f23245;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m13944());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        C8388 c8388 = this.f23245;
        if (zStartsWith) {
            c8388.f23248 = this.f23246.getShort();
            this.f23245.f23255 = this.f23246.getShort();
            int iM13944 = m13944();
            C8388 c83882 = this.f23245;
            c83882.f23254 = (iM13944 & 128) != 0;
            c83882.f23257 = (int) Math.pow(2.0d, (iM13944 & 7) + 1);
            this.f23245.f23258 = m13944();
            C8388 c83883 = this.f23245;
            m13944();
            c83883.getClass();
            if (this.f23245.f23254 && !m13946()) {
                C8388 c83884 = this.f23245;
                c83884.f23253 = m13942(c83884.f23257);
                C8388 c83885 = this.f23245;
                c83885.f23256 = c83885.f23253[c83885.f23258];
            }
        } else {
            c8388.f23252 = 1;
        }
        if (!m13946()) {
            boolean z = false;
            while (!z && !m13946() && this.f23245.f23251 <= Integer.MAX_VALUE) {
                int iM139442 = m13944();
                if (iM139442 == 33) {
                    int iM139443 = m13944();
                    if (iM139443 == 1) {
                        m13941();
                    } else if (iM139443 == 249) {
                        this.f23245.f23250 = new C8389();
                        m13944();
                        int iM139444 = m13944();
                        C8389 c8389 = this.f23245.f23250;
                        int i2 = (iM139444 & 28) >> 2;
                        c8389.f23266 = i2;
                        if (i2 == 0) {
                            c8389.f23266 = 1;
                        }
                        c8389.f23259 = (iM139444 & 1) != 0;
                        short s = this.f23246.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C8389 c83892 = this.f23245.f23250;
                        c83892.f23268 = s * 10;
                        c83892.f23265 = m13944();
                        m13944();
                    } else if (iM139443 == 254) {
                        m13941();
                    } else if (iM139443 != 255) {
                        m13941();
                    } else {
                        m13943();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f23247;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m13943();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f23245.getClass();
                                }
                                if (this.f23244 > 0) {
                                }
                            } while (!m13946());
                        } else {
                            m13941();
                        }
                    }
                } else if (iM139442 == 44) {
                    C8388 c83886 = this.f23245;
                    if (c83886.f23250 == null) {
                        c83886.f23250 = new C8389();
                    }
                    c83886.f23250.f23264 = this.f23246.getShort();
                    this.f23245.f23250.f23263 = this.f23246.getShort();
                    this.f23245.f23250.f23262 = this.f23246.getShort();
                    this.f23245.f23250.f23261 = this.f23246.getShort();
                    int iM139445 = m13944();
                    boolean z2 = (iM139445 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM139445 & 7) + 1);
                    C8389 c83893 = this.f23245.f23250;
                    c83893.f23260 = (iM139445 & 64) != 0;
                    if (z2) {
                        c83893.f23267 = m13942(iPow);
                    } else {
                        c83893.f23267 = null;
                    }
                    this.f23245.f23250.f23269 = this.f23246.position();
                    m13944();
                    m13941();
                    if (!m13946()) {
                        C8388 c83887 = this.f23245;
                        c83887.f23251++;
                        c83887.f23249.add(c83887.f23250);
                    }
                } else if (iM139442 != 59) {
                    this.f23245.f23252 = 1;
                } else {
                    z = true;
                }
            }
            C8388 c83888 = this.f23245;
            if (c83888.f23251 < 0) {
                c83888.f23252 = 1;
            }
        }
        return this.f23245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13946() {
        return this.f23245.f23252 != 0;
    }
}
