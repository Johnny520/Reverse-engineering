package bsh;

import androidx.activity.AbstractC0900;
import java.io.IOException;
import java.io.Reader;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f8209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f8210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f8211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f8212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f8213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public char[] f8214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char[] f8215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f8216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f8217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Reader f8218;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f8219;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f8220;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f8221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f8222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f8223;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f8224;

    public C3457(Reader reader) {
        m5866(1, 1);
        this.f8217 = -1;
        this.f8215 = new char[4096];
        this.f8218 = reader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m5859(char c) throws IOException {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new IOException("Invalid hex char '" + c + "' (=" + ((int) c) + ") provided!");
                        }
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5860(char c) {
        this.f8221++;
        if (this.f8216) {
            this.f8216 = false;
            this.f8221 = 1;
            this.f8224++;
        } else if (this.f8222) {
            this.f8222 = false;
            if (c == '\n') {
                this.f8216 = true;
            } else {
                this.f8221 = 1;
                this.f8224++;
            }
        }
        if (c == '\t') {
            int i = this.f8221 - 1;
            this.f8221 = (1 - (i % 1)) + i;
        } else if (c == '\n') {
            this.f8216 = true;
        } else if (c == '\r') {
            this.f8222 = true;
        }
        int i2 = this.f8224;
        int i3 = this.f8221;
        int[] iArr = this.f8219;
        int i4 = this.f8212;
        iArr[i4] = i2;
        this.f8223[i4] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5861() {
        int i = this.f8213;
        int i2 = i / 2;
        int i3 = this.f8211;
        int i4 = this.f8210;
        if (i3 != i) {
            if (i3 > i4) {
                this.f8211 = i;
                return;
            } else if (i4 - i3 < i2) {
                m5863(true);
                return;
            } else {
                this.f8211 = i4;
                return;
            }
        }
        if (i4 < 0) {
            this.f8212 = 0;
            this.f8220 = 0;
        } else {
            if (i4 <= i2) {
                m5863(false);
                return;
            }
            this.f8212 = 0;
            this.f8220 = 0;
            this.f8211 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m5862() {
        int i = this.f8212;
        int i2 = this.f8210;
        char[] cArr = this.f8214;
        return i >= i2 ? new String(cArr, i2, (i - i2) + 1) : new String(cArr, i2, this.f8213 - i2).concat(new String(this.f8214, 0, this.f8212 + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5863(boolean z) {
        int i = this.f8213;
        int i2 = i * 2;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.f8210;
        int i4 = i - i3;
        char[] cArr2 = this.f8214;
        if (z) {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            System.arraycopy(this.f8214, 0, cArr, i4, this.f8212);
            this.f8214 = cArr;
            System.arraycopy(this.f8219, this.f8210, iArr, 0, i4);
            System.arraycopy(this.f8219, 0, iArr, i4, this.f8212);
            this.f8219 = iArr;
            System.arraycopy(this.f8223, this.f8210, iArr2, 0, i4);
            System.arraycopy(this.f8223, 0, iArr2, i4, this.f8212);
            this.f8223 = iArr2;
            this.f8212 += i4;
        } else {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            this.f8214 = cArr;
            System.arraycopy(this.f8219, this.f8210, iArr, 0, i4);
            this.f8219 = iArr;
            System.arraycopy(this.f8223, this.f8210, iArr2, 0, i4);
            this.f8223 = iArr2;
            this.f8212 -= this.f8210;
        }
        this.f8213 = i2;
        this.f8211 = i2;
        this.f8210 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5864(int i) {
        int i2 = this.f8213;
        if (i > i2) {
            C6755.m11870(AbstractC0900.m707(AbstractC0900.m710(i, "Cannot back ", " chars which is larger than the internal buffer size ("), ")", this.f8213));
            return;
        }
        this.f8209 += i;
        int i3 = this.f8212 - i;
        this.f8212 = i3;
        if (i3 < 0) {
            this.f8212 = i3 + i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final char m5865() throws IOException {
        int i = this.f8217 + 1;
        this.f8217 = i;
        int i2 = this.f8220;
        if (i >= i2) {
            if (i2 == 4096) {
                this.f8220 = 0;
                this.f8217 = 0;
            }
            try {
                char[] cArr = this.f8215;
                int i3 = this.f8220;
                int i4 = this.f8218.read(cArr, i3, 4096 - i3);
                if (i4 == -1) {
                    this.f8218.close();
                    throw new IOException();
                }
                this.f8220 += i4;
            } catch (IOException e) {
                int i5 = this.f8212;
                if (i5 != 0) {
                    this.f8212 = i5 - 1;
                    m5864(0);
                } else {
                    int i6 = this.f8224;
                    int i7 = this.f8221;
                    this.f8219[i5] = i6;
                    this.f8223[i5] = i7;
                }
                throw e;
            }
        }
        return this.f8215[this.f8217];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5866(int i, int i2) {
        this.f8224 = i;
        this.f8221 = i2 - 1;
        this.f8222 = false;
        this.f8216 = false;
        char[] cArr = this.f8214;
        if (cArr == null || 4096 != cArr.length) {
            this.f8213 = 4096;
            this.f8211 = 4096;
            this.f8214 = new char[4096];
            this.f8219 = new int[4096];
            this.f8223 = new int[4096];
        }
        this.f8220 = 0;
        this.f8209 = 0;
        this.f8210 = 0;
        this.f8212 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final char m5867() throws IOException {
        char cM5865;
        char cM58652;
        int i = this.f8209;
        if (i > 0) {
            this.f8209 = i - 1;
            int i2 = this.f8212 + 1;
            this.f8212 = i2;
            if (i2 == this.f8213) {
                this.f8212 = 0;
            }
            return this.f8214[this.f8212];
        }
        int i3 = this.f8212 + 1;
        this.f8212 = i3;
        if (i3 == this.f8211) {
            m5861();
        }
        char cM58653 = m5865();
        this.f8214[this.f8212] = cM58653;
        if (cM58653 != '\\') {
            m5860(cM58653);
            return cM58653;
        }
        m5860(cM58653);
        int i4 = 1;
        while (true) {
            int i5 = this.f8212 + 1;
            this.f8212 = i5;
            if (i5 == this.f8211) {
                m5861();
            }
            try {
                cM5865 = m5865();
                this.f8214[this.f8212] = cM5865;
                if (cM5865 != '\\') {
                    break;
                }
                m5860(cM5865);
                i4++;
            } catch (IOException unused) {
                if (i4 > 1) {
                    m5864(i4 - 1);
                }
                return '\\';
            }
        }
        m5860(cM5865);
        if (cM5865 != 'u' || (i4 & 1) != 1) {
            m5864(i4);
            return '\\';
        }
        int i6 = this.f8212 - 1;
        this.f8212 = i6;
        if (i6 < 0) {
            this.f8212 = this.f8213 - 1;
        }
        while (true) {
            try {
                cM58652 = m5865();
                if (cM58652 != 'u') {
                    break;
                }
                m5860(cM58652);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder("Invalid escape character at line ");
                sb.append(this.f8224);
                sb.append(" column ");
                C6755.m11870(AbstractC0900.m707(sb, ".", this.f8221));
                return (char) 0;
            }
        }
        char cM58654 = m5865();
        char cM58655 = m5865();
        char cM58656 = m5865();
        char cM5859 = (char) ((m5859(cM58652) << 12) | (m5859(cM58654) << 8) | (m5859(cM58655) << 4) | m5859(cM58656));
        this.f8214[this.f8212] = cM5859;
        m5860(cM58652);
        m5860(cM58654);
        m5860(cM58655);
        m5860(cM58656);
        if (i4 == 1) {
            return cM5859;
        }
        m5864(i4 - 1);
        return '\\';
    }
}
