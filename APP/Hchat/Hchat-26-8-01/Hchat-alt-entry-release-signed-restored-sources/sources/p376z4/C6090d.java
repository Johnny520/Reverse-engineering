package p376z4;

import java.util.ArrayList;
import java.util.Arrays;
import p136j8.C2104o;

/* JADX INFO: renamed from: z4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6090d {

    /* JADX INFO: renamed from: a */
    public final boolean f24594a;

    /* JADX INFO: renamed from: b */
    public byte[] f24595b;

    /* JADX INFO: renamed from: c */
    public int f24596c;

    /* JADX INFO: renamed from: d */
    public boolean f24597d;

    /* JADX INFO: renamed from: e */
    public ArrayList f24598e;

    /* JADX INFO: renamed from: f */
    public int f24599f;

    /* JADX INFO: renamed from: g */
    public int f24600g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6090d(byte[] bArr, boolean z9) {
        this.f24594a = z9;
        this.f24595b = bArr;
        this.f24596c = 0;
        this.f24597d = false;
        this.f24598e = null;
        this.f24599f = 0;
        this.f24600g = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m10825g() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10826a(int i9) {
        int i10 = i9 - 1;
        if (i9 < 0 || (i9 & i10) != 0) {
            C2104o.m5294t("bogus alignment");
            return;
        }
        int i11 = (this.f24596c + i10) & (~i10);
        if (this.f24594a) {
            m10831f(i11);
        } else if (i11 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        Arrays.fill(this.f24595b, this.f24596c, i11, (byte) 0);
        this.f24596c = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10827b(int i9, String str) {
        if (this.f24598e == null) {
            return;
        }
        m10830e();
        int size = this.f24598e.size();
        int i10 = size == 0 ? 0 : ((C6089c) this.f24598e.get(size - 1)).f24593b;
        int i11 = this.f24596c;
        if (i10 <= i11) {
            i10 = i11;
        }
        this.f24598e.add(new C6089c(i10, i9 + i10, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10828c(String str) {
        if (this.f24598e == null) {
            return;
        }
        m10830e();
        this.f24598e.add(new C6089c(this.f24596c, Integer.MAX_VALUE, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m10829d() {
        return this.f24598e != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10830e() {
        int size;
        ArrayList arrayList = this.f24598e;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C6089c c6089c = (C6089c) this.f24598e.get(size - 1);
        int i9 = this.f24596c;
        if (c6089c.f24593b == Integer.MAX_VALUE) {
            c6089c.f24593b = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10831f(int i9) {
        byte[] bArr = this.f24595b;
        if (bArr.length < i9) {
            byte[] bArr2 = new byte[(i9 * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f24596c);
            this.f24595b = bArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final byte[] m10832h() {
        int i9 = this.f24596c;
        byte[] bArr = new byte[i9];
        System.arraycopy(this.f24595b, 0, bArr, 0, i9);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10833i(byte[] bArr) {
        int length = bArr.length;
        int i9 = this.f24596c;
        int i10 = i9 + length;
        if ((length | i10) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i10);
        }
        if (this.f24594a) {
            m10831f(i10);
        } else if (i10 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f24595b, i9, length);
        this.f24596c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m10834j(int i9) {
        int i10 = this.f24596c;
        int i11 = i10 + 1;
        if (this.f24594a) {
            m10831f(i11);
        } else if (i11 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        this.f24595b[i10] = (byte) i9;
        this.f24596c = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m10835k(int i9) {
        int i10 = this.f24596c;
        int i11 = i10 + 4;
        if (this.f24594a) {
            m10831f(i11);
        } else if (i11 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        byte[] bArr = this.f24595b;
        bArr[i10] = (byte) i9;
        bArr[i10 + 1] = (byte) (i9 >> 8);
        bArr[i10 + 2] = (byte) (i9 >> 16);
        bArr[i10 + 3] = (byte) (i9 >> 24);
        this.f24596c = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m10836l(int i9) {
        int i10 = this.f24596c;
        int i11 = i10 + 2;
        if (this.f24594a) {
            m10831f(i11);
        } else if (i11 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        byte[] bArr = this.f24595b;
        bArr[i10] = (byte) i9;
        bArr[i10 + 1] = (byte) (i9 >> 8);
        this.f24596c = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m10837m(int i9) {
        if (this.f24594a) {
            m10831f(this.f24596c + 5);
        }
        int i10 = i9 >> 7;
        int i11 = (Integer.MIN_VALUE & i9) == 0 ? 0 : -1;
        int i12 = i9;
        int i13 = i10;
        boolean z9 = true;
        while (z9) {
            z9 = (i13 == i11 && (i13 & 1) == ((i12 >> 6) & 1)) ? false : true;
            m10834j((byte) ((i12 & 127) | (z9 ? 128 : 0)));
            i12 = i13;
            i13 >>= 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m10838n(int i9) {
        if (this.f24594a) {
            m10831f(this.f24596c + 5);
        }
        int i10 = this.f24596c;
        while (true) {
            int i11 = i9;
            i9 >>>= 7;
            if (i9 == 0) {
                m10834j((byte) (i11 & 127));
                return this.f24596c - i10;
            }
            m10834j((byte) ((i11 & 127) | 128));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m10839o(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("count < 0");
            return;
        }
        int i10 = this.f24596c + i9;
        if (this.f24594a) {
            m10831f(i10);
        } else if (i10 > this.f24595b.length) {
            m10825g();
            throw null;
        }
        Arrays.fill(this.f24595b, this.f24596c, i10, (byte) 0);
        this.f24596c = i10;
    }

    public C6090d() {
        this(new byte[1000], true);
    }
}
