package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: renamed from: bsh.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1126a {

    /* JADX INFO: renamed from: b */
    public char[] f3424b;

    /* JADX INFO: renamed from: c */
    public int f3425c;

    /* JADX INFO: renamed from: d */
    public int f3426d;

    /* JADX INFO: renamed from: e */
    public int f3427e;

    /* JADX INFO: renamed from: f */
    public int f3428f;

    /* JADX INFO: renamed from: g */
    public int f3429g;

    /* JADX INFO: renamed from: h */
    public int f3430h;

    /* JADX INFO: renamed from: i */
    public int[] f3431i;

    /* JADX INFO: renamed from: j */
    public int[] f3432j;

    /* JADX INFO: renamed from: k */
    public int f3433k;

    /* JADX INFO: renamed from: l */
    public int f3434l;

    /* JADX INFO: renamed from: m */
    public boolean f3435m;

    /* JADX INFO: renamed from: n */
    public boolean f3436n;

    /* JADX INFO: renamed from: a */
    public int f3423a = 1;

    /* JADX INFO: renamed from: o */
    public boolean f3437o = true;

    public AbstractC1126a(int i10, int i11, int i12) {
        m4037p(i10, i11, i12);
    }

    /* JADX INFO: renamed from: k */
    public static final int m4022k(char c10) throws IOException {
        switch (c10) {
            case '0':
                return 0;
            case '1':
                return 1;
            case Opcodes.AALOAD /* 50 */:
                return 2;
            case Opcodes.BALOAD /* 51 */:
                return 3;
            case '4':
                return 4;
            case Opcodes.SALOAD /* 53 */:
                return 5;
            case Opcodes.ISTORE /* 54 */:
                return 6;
            case Opcodes.LSTORE /* 55 */:
                return 7;
            case Opcodes.FSTORE /* 56 */:
                return 8;
            case Opcodes.DSTORE /* 57 */:
                return 9;
            default:
                switch (c10) {
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
                        switch (c10) {
                            case Opcodes.LADD /* 97 */:
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                return 15;
                            default:
                                throw new IOException("Invalid hex char '" + c10 + "' (=" + ((int) c10) + ") provided!");
                        }
                }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4023a(int i10) {
        int i11 = this.f3425c;
        if (i10 <= i11) {
            this.f3429g += i10;
            int i12 = this.f3426d - i10;
            this.f3426d = i12;
            if (i12 < 0) {
                this.f3426d = i12 + i11;
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot back " + i10 + " chars which is larger than the internal buffer size (" + this.f3425c + ")");
    }

    /* JADX INFO: renamed from: b */
    public void m4024b(boolean z10) {
        int iM4027e = m4027e();
        char[] cArr = new char[iM4027e];
        int[] iArr = new int[iM4027e];
        int[] iArr2 = new int[iM4027e];
        int i10 = this.f3425c;
        int i11 = this.f3428f;
        int i12 = i10 - i11;
        char[] cArr2 = this.f3424b;
        if (z10) {
            System.arraycopy(cArr2, i11, cArr, 0, i12);
            System.arraycopy(this.f3424b, 0, cArr, i12, this.f3426d);
            this.f3424b = cArr;
            System.arraycopy(this.f3431i, this.f3428f, iArr, 0, i12);
            System.arraycopy(this.f3431i, 0, iArr, i12, this.f3426d);
            this.f3431i = iArr;
            System.arraycopy(this.f3432j, this.f3428f, iArr2, 0, i12);
            System.arraycopy(this.f3432j, 0, iArr2, i12, this.f3426d);
            this.f3432j = iArr2;
            this.f3426d += i12;
        } else {
            System.arraycopy(cArr2, i11, cArr, 0, i12);
            this.f3424b = cArr;
            System.arraycopy(this.f3431i, this.f3428f, iArr, 0, i12);
            this.f3431i = iArr;
            System.arraycopy(this.f3432j, this.f3428f, iArr2, 0, i12);
            this.f3432j = iArr2;
            this.f3426d -= this.f3428f;
        }
        this.f3425c = iM4027e;
        this.f3427e = iM4027e;
        this.f3428f = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m4025c() {
        return this.f3432j[this.f3428f];
    }

    /* JADX INFO: renamed from: d */
    public int m4026d() {
        return this.f3431i[this.f3428f];
    }

    /* JADX INFO: renamed from: e */
    public int m4027e() {
        return this.f3425c * 2;
    }

    /* JADX INFO: renamed from: f */
    public final int m4028f() {
        return this.f3434l;
    }

    /* JADX INFO: renamed from: g */
    public int m4029g() {
        return this.f3432j[this.f3426d];
    }

    /* JADX INFO: renamed from: h */
    public int m4030h() {
        return this.f3431i[this.f3426d];
    }

    /* JADX INFO: renamed from: i */
    public String m4031i() {
        int i10 = this.f3426d;
        int i11 = this.f3428f;
        char[] cArr = this.f3424b;
        return i10 >= i11 ? new String(cArr, i11, (i10 - i11) + 1) : new String(cArr, i11, this.f3425c - i11).concat(new String(this.f3424b, 0, this.f3426d + 1));
    }

    /* JADX INFO: renamed from: j */
    public final int m4032j() {
        return this.f3433k;
    }

    /* JADX INFO: renamed from: l */
    public final void m4033l() {
        int i10 = this.f3425c;
        int i11 = i10 / 2;
        int i12 = this.f3427e;
        int i13 = this.f3428f;
        if (i12 != i10) {
            if (i12 > i13) {
                this.f3427e = i10;
                return;
            } else if (i13 - i12 < i11) {
                m4024b(true);
                return;
            } else {
                this.f3427e = i13;
                return;
            }
        }
        if (i13 < 0) {
            this.f3426d = 0;
            this.f3430h = 0;
        } else {
            if (i13 <= i11) {
                m4024b(false);
                return;
            }
            this.f3426d = 0;
            this.f3430h = 0;
            this.f3427e = i13;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4034m(int i10, int i11) {
        int[] iArr = this.f3431i;
        int i12 = this.f3426d;
        iArr[i12] = i10;
        this.f3432j[i12] = i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m4035n(char c10) {
        this.f3434l++;
        if (this.f3436n) {
            this.f3436n = false;
            this.f3434l = 1;
            this.f3433k++;
        } else if (this.f3435m) {
            this.f3435m = false;
            if (c10 == '\n') {
                this.f3436n = true;
            } else {
                this.f3434l = 1;
                this.f3433k++;
            }
        }
        if (c10 == '\t') {
            int i10 = this.f3434l - 1;
            this.f3434l = i10;
            int i11 = this.f3423a;
            this.f3434l = i10 + (i11 - (i10 % i11));
        } else if (c10 == '\n') {
            this.f3436n = true;
        } else if (c10 == '\r') {
            this.f3435m = true;
        }
        m4034m(this.f3433k, this.f3434l);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4036o() {
        return this.f3437o;
    }

    /* JADX INFO: renamed from: p */
    public final void m4037p(int i10, int i11, int i12) {
        this.f3433k = i10;
        this.f3434l = i11 - 1;
        this.f3435m = false;
        this.f3436n = false;
        char[] cArr = this.f3424b;
        if (cArr == null || i12 != cArr.length) {
            this.f3425c = i12;
            this.f3427e = i12;
            this.f3424b = new char[i12];
            this.f3431i = new int[i12];
            this.f3432j = new int[i12];
        }
        this.f3430h = 0;
        this.f3429g = 0;
        this.f3428f = 0;
        this.f3426d = -1;
    }
}
