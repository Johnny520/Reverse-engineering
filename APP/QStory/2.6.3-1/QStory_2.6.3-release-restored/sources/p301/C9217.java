package p301;

import android.util.Log;
import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C9218 f23589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ByteBuffer f23590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f23591 = new byte[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23588 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14517() {
        int iM14520;
        do {
            iM14520 = m14520();
            this.f23590.position(Math.min(this.f23590.position() + iM14520, this.f23590.limit()));
        } while (iM14520 > 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int[] m14518(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f23590.get(bArr);
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
            this.f23589.f23596 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14519() {
        int iM14520 = m14520();
        this.f23588 = iM14520;
        if (iM14520 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f23588;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f23590.get(this.f23591, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM709 = AbstractC0900.m709(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbM709.append(this.f23588);
                    Log.d("GifHeaderParser", sbM709.toString(), e);
                }
                this.f23589.f23596 = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14520() {
        try {
            return this.f23590.get() & DefaultClassResolver.NAME;
        } catch (Exception unused) {
            this.f23589.f23596 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9218 m14521() {
        byte[] bArr;
        if (this.f23590 == null) {
            C6755.m11870("You must call setData() before parseHeader()");
            return null;
        }
        if (m14522()) {
            return this.f23589;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m14520());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        C9218 c9218 = this.f23589;
        if (zStartsWith) {
            c9218.f23592 = this.f23590.getShort();
            this.f23589.f23599 = this.f23590.getShort();
            int iM14520 = m14520();
            C9218 c92182 = this.f23589;
            c92182.f23598 = (iM14520 & 128) != 0;
            c92182.f23601 = (int) Math.pow(2.0d, (iM14520 & 7) + 1);
            this.f23589.f23602 = m14520();
            C9218 c92183 = this.f23589;
            m14520();
            c92183.getClass();
            if (this.f23589.f23598 && !m14522()) {
                C9218 c92184 = this.f23589;
                c92184.f23597 = m14518(c92184.f23601);
                C9218 c92185 = this.f23589;
                c92185.f23600 = c92185.f23597[c92185.f23602];
            }
        } else {
            c9218.f23596 = 1;
        }
        if (!m14522()) {
            boolean z = false;
            while (!z && !m14522() && this.f23589.f23595 <= Integer.MAX_VALUE) {
                int iM145202 = m14520();
                if (iM145202 == 33) {
                    int iM145203 = m14520();
                    if (iM145203 == 1) {
                        m14517();
                    } else if (iM145203 == 249) {
                        this.f23589.f23594 = new C9219();
                        m14520();
                        int iM145204 = m14520();
                        C9219 c9219 = this.f23589.f23594;
                        int i2 = (iM145204 & 28) >> 2;
                        c9219.f23610 = i2;
                        if (i2 == 0) {
                            c9219.f23610 = 1;
                        }
                        c9219.f23603 = (iM145204 & 1) != 0;
                        short s = this.f23590.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C9219 c92192 = this.f23589.f23594;
                        c92192.f23612 = s * 10;
                        c92192.f23609 = m14520();
                        m14520();
                    } else if (iM145203 == 254) {
                        m14517();
                    } else if (iM145203 != 255) {
                        m14517();
                    } else {
                        m14519();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f23591;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m14519();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f23589.getClass();
                                }
                                if (this.f23588 > 0) {
                                }
                            } while (!m14522());
                        } else {
                            m14517();
                        }
                    }
                } else if (iM145202 == 44) {
                    C9218 c92186 = this.f23589;
                    if (c92186.f23594 == null) {
                        c92186.f23594 = new C9219();
                    }
                    c92186.f23594.f23608 = this.f23590.getShort();
                    this.f23589.f23594.f23607 = this.f23590.getShort();
                    this.f23589.f23594.f23606 = this.f23590.getShort();
                    this.f23589.f23594.f23605 = this.f23590.getShort();
                    int iM145205 = m14520();
                    boolean z2 = (iM145205 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM145205 & 7) + 1);
                    C9219 c92193 = this.f23589.f23594;
                    c92193.f23604 = (iM145205 & 64) != 0;
                    if (z2) {
                        c92193.f23611 = m14518(iPow);
                    } else {
                        c92193.f23611 = null;
                    }
                    this.f23589.f23594.f23613 = this.f23590.position();
                    m14520();
                    m14517();
                    if (!m14522()) {
                        C9218 c92187 = this.f23589;
                        c92187.f23595++;
                        c92187.f23593.add(c92187.f23594);
                    }
                } else if (iM145202 != 59) {
                    this.f23589.f23596 = 1;
                } else {
                    z = true;
                }
            }
            C9218 c92188 = this.f23589;
            if (c92188.f23595 < 0) {
                c92188.f23596 = 1;
            }
        }
        return this.f23589;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m14522() {
        return this.f23589.f23596 != 0;
    }
}
