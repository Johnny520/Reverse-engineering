package fun.box001.internal.dexformat.output;

import fun.box001.internal.error.DexGenerationException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0202d implements InterfaceC0199a {

    /* JADX INFO: renamed from: a */
    private final boolean f792a;

    /* JADX INFO: renamed from: b */
    private byte[] f793b;

    /* JADX INFO: renamed from: c */
    private int f794c;

    /* JADX INFO: renamed from: d */
    private boolean f795d;

    /* JADX INFO: renamed from: e */
    private ArrayList f796e;

    /* JADX INFO: renamed from: f */
    private int f797f;

    /* JADX INFO: renamed from: g */
    private int f798g;

    public C0202d() {
        this(new byte[1000], true);
    }

    /* JADX INFO: renamed from: g */
    private void m481g(int i2) {
        byte[] bArr = this.f793b;
        if (bArr.length < i2) {
            byte[] bArr2 = new byte[(i2 * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f794c);
            this.f793b = bArr2;
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m482l() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: a */
    public final void m483a(int i2) {
        int i3 = i2 - 1;
        if (i2 < 0 || (i2 & i3) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i4 = (this.f794c + i3) & (~i3);
        if (this.f792a) {
            m481g(i4);
        } else if (i4 > this.f793b.length) {
            m482l();
            throw null;
        }
        Arrays.fill(this.f793b, this.f794c, i4, (byte) 0);
        this.f794c = i4;
    }

    /* JADX INFO: renamed from: b */
    public final void m484b(int i2, String str) {
        if (this.f796e == null) {
            return;
        }
        m488f();
        int size = this.f796e.size();
        int iM479a = size == 0 ? 0 : ((C0201c) this.f796e.get(size - 1)).m479a();
        int i3 = this.f794c;
        if (iM479a <= i3) {
            iM479a = i3;
        }
        this.f796e.add(new C0201c(str, iM479a, i2 + iM479a));
    }

    /* JADX INFO: renamed from: c */
    public final void m485c(String str) {
        if (this.f796e == null) {
            return;
        }
        m488f();
        this.f796e.add(new C0201c(str, this.f794c, Integer.MAX_VALUE));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m486d() {
        return this.f796e != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m487e(int i2) {
        if (this.f794c == i2) {
            return;
        }
        throw new DexGenerationException("expected cursor " + i2 + "; actual value: " + this.f794c, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m488f() {
        int size;
        ArrayList arrayList = this.f796e;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((C0201c) this.f796e.get(size - 1)).m480b(this.f794c);
    }

    /* JADX INFO: renamed from: h */
    public final int m489h() {
        int i2 = this.f798g;
        return this.f797f - ((i2 / 2) + ((i2 * 2) + 8));
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m490i() {
        return this.f793b;
    }

    /* JADX INFO: renamed from: j */
    public final int m491j() {
        return this.f794c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m492k() {
        return this.f795d;
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m493m() {
        int i2 = this.f794c;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f793b, 0, bArr, 0, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: n */
    public final void m494n(C0200b c0200b) {
        int iM478b = c0200b.m478b();
        int i2 = this.f794c;
        int i3 = iM478b + i2;
        if (this.f792a) {
            m481g(i3);
        } else if (i3 > this.f793b.length) {
            m482l();
            throw null;
        }
        c0200b.m477a(this.f793b, i2);
        this.f794c = i3;
    }

    /* JADX INFO: renamed from: o */
    public final void m495o(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f794c;
        int i3 = i2 + length;
        int i4 = 0 + length;
        if ((0 | length | i3) < 0 || i4 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i3);
        }
        if (this.f792a) {
            m481g(i3);
        } else if (i3 > this.f793b.length) {
            m482l();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f793b, i2, length);
        this.f794c = i3;
    }

    /* JADX INFO: renamed from: p */
    public final void m496p(int i2) {
        int i3 = this.f794c;
        int i4 = i3 + 1;
        if (this.f792a) {
            m481g(i4);
        } else if (i4 > this.f793b.length) {
            m482l();
            throw null;
        }
        this.f793b[i3] = (byte) i2;
        this.f794c = i4;
    }

    /* JADX INFO: renamed from: q */
    public final void m497q(int i2) {
        int i3 = this.f794c;
        int i4 = i3 + 4;
        if (this.f792a) {
            m481g(i4);
        } else if (i4 > this.f793b.length) {
            m482l();
            throw null;
        }
        byte[] bArr = this.f793b;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.f794c = i4;
    }

    /* JADX INFO: renamed from: r */
    public final void m498r(int i2) {
        int i3 = this.f794c;
        int i4 = i3 + 2;
        if (this.f792a) {
            m481g(i4);
        } else if (i4 > this.f793b.length) {
            m482l();
            throw null;
        }
        byte[] bArr = this.f793b;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        this.f794c = i4;
    }

    /* JADX INFO: renamed from: s */
    public final void m499s(int i2) {
        if (this.f792a) {
            m481g(this.f794c + 5);
        }
        int i3 = i2 >> 7;
        int i4 = (Integer.MIN_VALUE & i2) == 0 ? 0 : -1;
        boolean z = true;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i2 = i5;
            if (!z) {
                return;
            }
            z = (i2 == i4 && (i2 & 1) == ((i6 >> 6) & 1)) ? false : true;
            m496p((byte) ((i6 & 127) | (z ? 128 : 0)));
            i3 = i2 >> 7;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m500t(int i2) {
        if (this.f792a) {
            m481g(this.f794c + 5);
        }
        int i3 = this.f794c;
        while (true) {
            int i4 = i2 >>> 7;
            int i5 = i2 & 127;
            if (i4 == 0) {
                m496p((byte) i5);
                return this.f794c - i3;
            }
            m496p((byte) (i5 | 128));
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m501u(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i3 = this.f794c + i2;
        if (this.f792a) {
            m481g(i3);
        } else if (i3 > this.f793b.length) {
            m482l();
            throw null;
        }
        Arrays.fill(this.f793b, this.f794c, i3, (byte) 0);
        this.f794c = i3;
    }

    public C0202d(byte[] bArr) {
        this(bArr, false);
    }

    private C0202d(byte[] bArr, boolean z) {
        this.f792a = z;
        this.f793b = bArr;
        this.f794c = 0;
        this.f795d = false;
        this.f796e = null;
        this.f797f = 0;
        this.f798g = 0;
    }
}
