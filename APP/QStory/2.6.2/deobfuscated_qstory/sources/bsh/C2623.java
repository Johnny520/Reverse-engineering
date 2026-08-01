package bsh;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.io.Reader;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2623 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public char[] f7867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char[] f7868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f7869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Reader f7871;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f7872;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7873;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f7874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f7876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f7877;

    public C2623(Reader reader) {
        m5261(1, 1);
        this.f7870 = -1;
        this.f7868 = new char[4096];
        this.f7871 = reader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m5254(char c) throws IOException {
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
    public final void m5255(char c) {
        this.f7874++;
        if (this.f7869) {
            this.f7869 = false;
            this.f7874 = 1;
            this.f7877++;
        } else if (this.f7875) {
            this.f7875 = false;
            if (c == '\n') {
                this.f7869 = true;
            } else {
                this.f7874 = 1;
                this.f7877++;
            }
        }
        if (c == '\t') {
            int i = this.f7874 - 1;
            this.f7874 = (1 - (i % 1)) + i;
        } else if (c == '\n') {
            this.f7869 = true;
        } else if (c == '\r') {
            this.f7875 = true;
        }
        int i2 = this.f7877;
        int i3 = this.f7874;
        int[] iArr = this.f7872;
        int i4 = this.f7865;
        iArr[i4] = i2;
        this.f7876[i4] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5256() {
        int i = this.f7866;
        int i2 = i / 2;
        int i3 = this.f7864;
        int i4 = this.f7863;
        if (i3 != i) {
            if (i3 > i4) {
                this.f7864 = i;
                return;
            } else if (i4 - i3 < i2) {
                m5258(true);
                return;
            } else {
                this.f7864 = i4;
                return;
            }
        }
        if (i4 < 0) {
            this.f7865 = 0;
            this.f7873 = 0;
        } else {
            if (i4 <= i2) {
                m5258(false);
                return;
            }
            this.f7865 = 0;
            this.f7873 = 0;
            this.f7864 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m5257() {
        int i = this.f7865;
        int i2 = this.f7863;
        char[] cArr = this.f7867;
        return i >= i2 ? new String(cArr, i2, (i - i2) + 1) : new String(cArr, i2, this.f7866 - i2).concat(new String(this.f7867, 0, this.f7865 + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5258(boolean z) {
        int i = this.f7866;
        int i2 = i * 2;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.f7863;
        int i4 = i - i3;
        char[] cArr2 = this.f7867;
        if (z) {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            System.arraycopy(this.f7867, 0, cArr, i4, this.f7865);
            this.f7867 = cArr;
            System.arraycopy(this.f7872, this.f7863, iArr, 0, i4);
            System.arraycopy(this.f7872, 0, iArr, i4, this.f7865);
            this.f7872 = iArr;
            System.arraycopy(this.f7876, this.f7863, iArr2, 0, i4);
            System.arraycopy(this.f7876, 0, iArr2, i4, this.f7865);
            this.f7876 = iArr2;
            this.f7865 += i4;
        } else {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            this.f7867 = cArr;
            System.arraycopy(this.f7872, this.f7863, iArr, 0, i4);
            this.f7872 = iArr;
            System.arraycopy(this.f7876, this.f7863, iArr2, 0, i4);
            this.f7876 = iArr2;
            this.f7865 -= this.f7863;
        }
        this.f7866 = i2;
        this.f7864 = i2;
        this.f7863 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5259(int i) {
        int i2 = this.f7866;
        if (i > i2) {
            C5919.m11250(AbstractC0053.m147(AbstractC0053.m148(i, "Cannot back ", " chars which is larger than the internal buffer size ("), ")", this.f7866));
            return;
        }
        this.f7862 += i;
        int i3 = this.f7865 - i;
        this.f7865 = i3;
        if (i3 < 0) {
            this.f7865 = i3 + i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final char m5260() throws IOException {
        int i = this.f7870 + 1;
        this.f7870 = i;
        int i2 = this.f7873;
        if (i >= i2) {
            if (i2 == 4096) {
                this.f7873 = 0;
                this.f7870 = 0;
            }
            try {
                char[] cArr = this.f7868;
                int i3 = this.f7873;
                int i4 = this.f7871.read(cArr, i3, 4096 - i3);
                if (i4 == -1) {
                    this.f7871.close();
                    throw new IOException();
                }
                this.f7873 += i4;
            } catch (IOException e) {
                int i5 = this.f7865;
                if (i5 != 0) {
                    this.f7865 = i5 - 1;
                    m5259(0);
                } else {
                    int i6 = this.f7877;
                    int i7 = this.f7874;
                    this.f7872[i5] = i6;
                    this.f7876[i5] = i7;
                }
                throw e;
            }
        }
        return this.f7868[this.f7870];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5261(int i, int i2) {
        this.f7877 = i;
        this.f7874 = i2 - 1;
        this.f7875 = false;
        this.f7869 = false;
        char[] cArr = this.f7867;
        if (cArr == null || 4096 != cArr.length) {
            this.f7866 = 4096;
            this.f7864 = 4096;
            this.f7867 = new char[4096];
            this.f7872 = new int[4096];
            this.f7876 = new int[4096];
        }
        this.f7873 = 0;
        this.f7862 = 0;
        this.f7863 = 0;
        this.f7865 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final char m5262() throws IOException {
        char cM5260;
        char cM52602;
        int i = this.f7862;
        if (i > 0) {
            this.f7862 = i - 1;
            int i2 = this.f7865 + 1;
            this.f7865 = i2;
            if (i2 == this.f7866) {
                this.f7865 = 0;
            }
            return this.f7867[this.f7865];
        }
        int i3 = this.f7865 + 1;
        this.f7865 = i3;
        if (i3 == this.f7864) {
            m5256();
        }
        char cM52603 = m5260();
        this.f7867[this.f7865] = cM52603;
        if (cM52603 != '\\') {
            m5255(cM52603);
            return cM52603;
        }
        m5255(cM52603);
        int i4 = 1;
        while (true) {
            int i5 = this.f7865 + 1;
            this.f7865 = i5;
            if (i5 == this.f7864) {
                m5256();
            }
            try {
                cM5260 = m5260();
                this.f7867[this.f7865] = cM5260;
                if (cM5260 != '\\') {
                    break;
                }
                m5255(cM5260);
                i4++;
            } catch (IOException unused) {
                if (i4 > 1) {
                    m5259(i4 - 1);
                }
                return '\\';
            }
        }
        m5255(cM5260);
        if (cM5260 != 'u' || (i4 & 1) != 1) {
            m5259(i4);
            return '\\';
        }
        int i6 = this.f7865 - 1;
        this.f7865 = i6;
        if (i6 < 0) {
            this.f7865 = this.f7866 - 1;
        }
        while (true) {
            try {
                cM52602 = m5260();
                if (cM52602 != 'u') {
                    break;
                }
                m5255(cM52602);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder("Invalid escape character at line ");
                sb.append(this.f7877);
                sb.append(" column ");
                C5919.m11250(AbstractC0053.m147(sb, ".", this.f7874));
                return (char) 0;
            }
        }
        char cM52604 = m5260();
        char cM52605 = m5260();
        char cM52606 = m5260();
        char cM5254 = (char) ((m5254(cM52602) << 12) | (m5254(cM52604) << 8) | (m5254(cM52605) << 4) | m5254(cM52606));
        this.f7867[this.f7865] = cM5254;
        m5255(cM52602);
        m5255(cM52604);
        m5255(cM52605);
        m5255(cM52606);
        if (i4 == 1) {
            return cM5254;
        }
        m5259(i4 - 1);
        return '\\';
    }
}
