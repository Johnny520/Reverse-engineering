package bsh;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.io.Reader;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2624 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public char[] f7869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public char[] f7870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f7871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Reader f7873;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f7874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f7876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f7878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f7879;

    public C2624(Reader reader) {
        m5306(1, 1);
        this.f7872 = -1;
        this.f7870 = new char[4096];
        this.f7873 = reader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m5299(char c) throws IOException {
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
    public final void m5300(char c) {
        this.f7876++;
        if (this.f7871) {
            this.f7871 = false;
            this.f7876 = 1;
            this.f7879++;
        } else if (this.f7877) {
            this.f7877 = false;
            if (c == '\n') {
                this.f7871 = true;
            } else {
                this.f7876 = 1;
                this.f7879++;
            }
        }
        if (c == '\t') {
            int i = this.f7876 - 1;
            this.f7876 = (1 - (i % 1)) + i;
        } else if (c == '\n') {
            this.f7871 = true;
        } else if (c == '\r') {
            this.f7877 = true;
        }
        int i2 = this.f7879;
        int i3 = this.f7876;
        int[] iArr = this.f7874;
        int i4 = this.f7867;
        iArr[i4] = i2;
        this.f7878[i4] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5301() {
        int i = this.f7868;
        int i2 = i / 2;
        int i3 = this.f7866;
        int i4 = this.f7865;
        if (i3 != i) {
            if (i3 > i4) {
                this.f7866 = i;
                return;
            } else if (i4 - i3 < i2) {
                m5303(true);
                return;
            } else {
                this.f7866 = i4;
                return;
            }
        }
        if (i4 < 0) {
            this.f7867 = 0;
            this.f7875 = 0;
        } else {
            if (i4 <= i2) {
                m5303(false);
                return;
            }
            this.f7867 = 0;
            this.f7875 = 0;
            this.f7866 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m5302() {
        int i = this.f7867;
        int i2 = this.f7865;
        char[] cArr = this.f7869;
        return i >= i2 ? new String(cArr, i2, (i - i2) + 1) : new String(cArr, i2, this.f7868 - i2).concat(new String(this.f7869, 0, this.f7867 + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5303(boolean z) {
        int i = this.f7868;
        int i2 = i * 2;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.f7865;
        int i4 = i - i3;
        char[] cArr2 = this.f7869;
        if (z) {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            System.arraycopy(this.f7869, 0, cArr, i4, this.f7867);
            this.f7869 = cArr;
            System.arraycopy(this.f7874, this.f7865, iArr, 0, i4);
            System.arraycopy(this.f7874, 0, iArr, i4, this.f7867);
            this.f7874 = iArr;
            System.arraycopy(this.f7878, this.f7865, iArr2, 0, i4);
            System.arraycopy(this.f7878, 0, iArr2, i4, this.f7867);
            this.f7878 = iArr2;
            this.f7867 += i4;
        } else {
            System.arraycopy(cArr2, i3, cArr, 0, i4);
            this.f7869 = cArr;
            System.arraycopy(this.f7874, this.f7865, iArr, 0, i4);
            this.f7874 = iArr;
            System.arraycopy(this.f7878, this.f7865, iArr2, 0, i4);
            this.f7878 = iArr2;
            this.f7867 -= this.f7865;
        }
        this.f7868 = i2;
        this.f7866 = i2;
        this.f7865 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5304(int i) {
        int i2 = this.f7868;
        if (i > i2) {
            C5925.m11311(AbstractC0053.m147(AbstractC0053.m150(i, "Cannot back ", " chars which is larger than the internal buffer size ("), ")", this.f7868));
            return;
        }
        this.f7864 += i;
        int i3 = this.f7867 - i;
        this.f7867 = i3;
        if (i3 < 0) {
            this.f7867 = i3 + i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final char m5305() throws IOException {
        int i = this.f7872 + 1;
        this.f7872 = i;
        int i2 = this.f7875;
        if (i >= i2) {
            if (i2 == 4096) {
                this.f7875 = 0;
                this.f7872 = 0;
            }
            try {
                char[] cArr = this.f7870;
                int i3 = this.f7875;
                int i4 = this.f7873.read(cArr, i3, 4096 - i3);
                if (i4 == -1) {
                    this.f7873.close();
                    throw new IOException();
                }
                this.f7875 += i4;
            } catch (IOException e) {
                int i5 = this.f7867;
                if (i5 != 0) {
                    this.f7867 = i5 - 1;
                    m5304(0);
                } else {
                    int i6 = this.f7879;
                    int i7 = this.f7876;
                    this.f7874[i5] = i6;
                    this.f7878[i5] = i7;
                }
                throw e;
            }
        }
        return this.f7870[this.f7872];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5306(int i, int i2) {
        this.f7879 = i;
        this.f7876 = i2 - 1;
        this.f7877 = false;
        this.f7871 = false;
        char[] cArr = this.f7869;
        if (cArr == null || 4096 != cArr.length) {
            this.f7868 = 4096;
            this.f7866 = 4096;
            this.f7869 = new char[4096];
            this.f7874 = new int[4096];
            this.f7878 = new int[4096];
        }
        this.f7875 = 0;
        this.f7864 = 0;
        this.f7865 = 0;
        this.f7867 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final char m5307() throws IOException {
        char cM5305;
        char cM53052;
        int i = this.f7864;
        if (i > 0) {
            this.f7864 = i - 1;
            int i2 = this.f7867 + 1;
            this.f7867 = i2;
            if (i2 == this.f7868) {
                this.f7867 = 0;
            }
            return this.f7869[this.f7867];
        }
        int i3 = this.f7867 + 1;
        this.f7867 = i3;
        if (i3 == this.f7866) {
            m5301();
        }
        char cM53053 = m5305();
        this.f7869[this.f7867] = cM53053;
        if (cM53053 != '\\') {
            m5300(cM53053);
            return cM53053;
        }
        m5300(cM53053);
        int i4 = 1;
        while (true) {
            int i5 = this.f7867 + 1;
            this.f7867 = i5;
            if (i5 == this.f7866) {
                m5301();
            }
            try {
                cM5305 = m5305();
                this.f7869[this.f7867] = cM5305;
                if (cM5305 != '\\') {
                    break;
                }
                m5300(cM5305);
                i4++;
            } catch (IOException unused) {
                if (i4 > 1) {
                    m5304(i4 - 1);
                }
                return '\\';
            }
        }
        m5300(cM5305);
        if (cM5305 != 'u' || (i4 & 1) != 1) {
            m5304(i4);
            return '\\';
        }
        int i6 = this.f7867 - 1;
        this.f7867 = i6;
        if (i6 < 0) {
            this.f7867 = this.f7868 - 1;
        }
        while (true) {
            try {
                cM53052 = m5305();
                if (cM53052 != 'u') {
                    break;
                }
                m5300(cM53052);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder("Invalid escape character at line ");
                sb.append(this.f7879);
                sb.append(" column ");
                C5925.m11311(AbstractC0053.m147(sb, ".", this.f7876));
                return (char) 0;
            }
        }
        char cM53054 = m5305();
        char cM53055 = m5305();
        char cM53056 = m5305();
        char cM5299 = (char) ((m5299(cM53052) << 12) | (m5299(cM53054) << 8) | (m5299(cM53055) << 4) | m5299(cM53056));
        this.f7869[this.f7867] = cM5299;
        m5300(cM53052);
        m5300(cM53054);
        m5300(cM53055);
        m5300(cM53056);
        if (i4 == 1) {
            return cM5299;
        }
        m5304(i4 - 1);
        return '\\';
    }
}
