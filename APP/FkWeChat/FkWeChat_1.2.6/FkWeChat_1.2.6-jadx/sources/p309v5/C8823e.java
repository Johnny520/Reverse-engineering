package p309v5;

import bsh.C1259t2;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import p006a5.AbstractC0069e;
import p020b5.C0996b;
import p020b5.InterfaceC0995a;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8823e implements InterfaceC8819a, InterfaceC0995a {

    /* JADX INFO: renamed from: a */
    public final boolean f29344a;

    /* JADX INFO: renamed from: b */
    public byte[] f29345b;

    /* JADX INFO: renamed from: c */
    public int f29346c;

    /* JADX INFO: renamed from: d */
    public boolean f29347d;

    /* JADX INFO: renamed from: e */
    public ArrayList f29348e;

    /* JADX INFO: renamed from: f */
    public int f29349f;

    /* JADX INFO: renamed from: g */
    public int f29350g;

    public C8823e(byte[] bArr, boolean z10) {
        if (bArr == null) {
            C1259t2.m5095a("data == null");
            throw null;
        }
        this.f29344a = z10;
        this.f29345b = bArr;
        this.f29346c = 0;
        this.f29347d = false;
        this.f29348e = null;
        this.f29349f = 0;
        this.f29350g = 0;
    }

    /* JADX INFO: renamed from: q */
    public static void m33863q() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: a */
    public void mo33823a(String str) {
        if (this.f29348e == null) {
            return;
        }
        mo33827j();
        this.f29348e.add(new a(this.f29346c, str));
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: b */
    public int mo33824b() {
        int i10 = this.f29350g;
        return this.f29349f - (((i10 * 2) + 8) + (i10 / 2));
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: c */
    public int mo33864c() {
        return this.f29346c;
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: d */
    public void mo33825d(int i10, String str) {
        if (this.f29348e == null) {
            return;
        }
        mo33827j();
        int size = this.f29348e.size();
        int iM33878a = size == 0 ? 0 : ((a) this.f29348e.get(size - 1)).m33878a();
        int i11 = this.f29346c;
        if (iM33878a <= i11) {
            iM33878a = i11;
        }
        this.f29348e.add(new a(iM33878a, i10 + iM33878a, str));
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: e */
    public void mo33865e(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("count < 0");
            return;
        }
        int i11 = this.f29346c + i10;
        if (this.f29344a) {
            m33871n(i11);
        } else if (i11 > this.f29345b.length) {
            m33863q();
            return;
        }
        Arrays.fill(this.f29345b, this.f29346c, i11, (byte) 0);
        this.f29346c = i11;
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: f */
    public void mo33866f(int i10) {
        if (this.f29346c == i10) {
            return;
        }
        throw new C0996b("expected cursor " + i10 + "; actual value: " + this.f29346c);
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: g */
    public void mo33867g(C8822d c8822d) {
        int iM33861q = c8822d.m33861q();
        int i10 = this.f29346c;
        int i11 = iM33861q + i10;
        if (this.f29344a) {
            m33871n(i11);
        } else if (i11 > this.f29345b.length) {
            m33863q();
            return;
        }
        c8822d.m33852h(this.f29345b, i10);
        this.f29346c = i11;
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: h */
    public boolean mo33826h() {
        return this.f29347d;
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: i */
    public int mo33868i(int i10) {
        if (this.f29344a) {
            m33871n(this.f29346c + 5);
        }
        int i11 = this.f29346c;
        AbstractC0069e.m226c(this, i10);
        return this.f29346c - i11;
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: j */
    public void mo33827j() {
        int size;
        ArrayList arrayList = this.f29348e;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((a) this.f29348e.get(size - 1)).m33882e(this.f29346c);
    }

    @Override // p309v5.InterfaceC8819a
    /* JADX INFO: renamed from: k */
    public boolean mo33828k() {
        return this.f29348e != null;
    }

    @Override // p309v5.InterfaceC8836r
    /* JADX INFO: renamed from: l */
    public void mo33869l(int i10) {
        int i11 = i10 - 1;
        if (i10 < 0 || (i10 & i11) != 0) {
            C9987e.m38645a("bogus alignment");
            return;
        }
        int i12 = (this.f29346c + i11) & (~i11);
        if (this.f29344a) {
            m33871n(i12);
        } else if (i12 > this.f29345b.length) {
            m33863q();
            return;
        }
        Arrays.fill(this.f29345b, this.f29346c, i12, (byte) 0);
        this.f29346c = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r1
  0x0017: PHI (r1v3 int) = (r1v0 int), (r1v1 int) binds: [B:9:0x0015, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m33870m(int r4, boolean r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f29348e
            if (r0 != 0) goto L34
            int r0 = r3.f29346c
            if (r0 != 0) goto L34
            r0 = 40
            if (r4 < r0) goto L2e
            int r0 = r4 + (-7)
            int r0 = r0 / 15
            int r0 = r0 + 1
            r0 = r0 & (-2)
            r1 = 6
            if (r0 >= r1) goto L19
        L17:
            r0 = r1
            goto L1e
        L19:
            r1 = 10
            if (r0 <= r1) goto L1e
            goto L17
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2)
            r3.f29348e = r1
            r3.f29349f = r4
            r3.f29350g = r0
            r3.f29347d = r5
            return
        L2e:
            java.lang.String r4 = "annotationWidth < 40"
            p376zd.C9987e.m38645a(r4)
            return
        L34:
            java.lang.String r4 = "cannot enable annotations"
            bsh.C1193i2.m4438a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p309v5.C8823e.m33870m(int, boolean):void");
    }

    /* JADX INFO: renamed from: n */
    public final void m33871n(int i10) {
        byte[] bArr = this.f29345b;
        if (bArr.length < i10) {
            byte[] bArr2 = new byte[(i10 * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f29346c);
            this.f29345b = bArr2;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m33872o() {
        mo33827j();
        ArrayList arrayList = this.f29348e;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i10 = size - 1;
                a aVar = (a) this.f29348e.get(i10);
                if (aVar.m33879b() <= this.f29346c) {
                    int iM33878a = aVar.m33878a();
                    int i11 = this.f29346c;
                    if (iM33878a > i11) {
                        aVar.m33881d(i11);
                        return;
                    }
                    return;
                }
                this.f29348e.remove(i10);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public byte[] m33873p() {
        return this.f29345b;
    }

    /* JADX INFO: renamed from: r */
    public byte[] m33874r() {
        int i10 = this.f29346c;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f29345b, 0, bArr, 0, i10);
        return bArr;
    }

    /* JADX INFO: renamed from: s */
    public void m33875s(byte[] bArr, int i10, int i11) {
        int i12 = this.f29346c;
        int i13 = i12 + i11;
        int i14 = i10 + i11;
        if ((i10 | i11 | i13) < 0 || i14 > bArr.length) {
            C8825g.m33891a("bytes.length ", bArr.length, "; ", i10, "..!", i13);
            return;
        }
        if (this.f29344a) {
            m33871n(i13);
        } else if (i13 > this.f29345b.length) {
            m33863q();
            return;
        }
        System.arraycopy(bArr, i10, this.f29345b, i12, i11);
        this.f29346c = i13;
    }

    /* JADX INFO: renamed from: t */
    public void m33876t(Writer writer) {
        int i10;
        String strM33880c;
        int i11;
        C8838t c8838t = new C8838t(writer, (this.f29349f - r0) - 1, mo33824b(), "|");
        Writer writerM33937e = c8838t.m33937e();
        Writer writerM33938f = c8838t.m33938f();
        int size = this.f29348e.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = this.f29346c;
            if (i13 >= i10 || i12 >= size) {
                break;
            }
            a aVar = (a) this.f29348e.get(i12);
            int iM33879b = aVar.m33879b();
            if (i13 < iM33879b) {
                strM33880c = _UrlKt.FRAGMENT_ENCODE_SET;
                i11 = iM33879b;
                iM33879b = i13;
            } else {
                int iM33878a = aVar.m33878a();
                strM33880c = aVar.m33880c();
                i12++;
                i11 = iM33878a;
            }
            writerM33937e.write(AbstractC8826h.m33892a(this.f29345b, iM33879b, i11 - iM33879b, iM33879b, this.f29350g, 6));
            writerM33938f.write(strM33880c);
            c8838t.m33934b();
            i13 = i11;
        }
        if (i13 < i10) {
            writerM33937e.write(AbstractC8826h.m33892a(this.f29345b, i13, i10 - i13, i13, this.f29350g, 6));
        }
        while (i12 < size) {
            writerM33938f.write(((a) this.f29348e.get(i12)).m33880c());
            i12++;
        }
        c8838t.m33934b();
    }

    /* JADX INFO: renamed from: u */
    public int m33877u(int i10) {
        if (this.f29344a) {
            m33871n(this.f29346c + 5);
        }
        int i11 = this.f29346c;
        AbstractC0069e.m225b(this, i10);
        return this.f29346c - i11;
    }

    @Override // p309v5.InterfaceC8836r
    public void write(byte[] bArr) {
        m33875s(bArr, 0, bArr.length);
    }

    @Override // p309v5.InterfaceC8836r, p020b5.InterfaceC0995a
    public void writeByte(int i10) {
        int i11 = this.f29346c;
        int i12 = i11 + 1;
        if (this.f29344a) {
            m33871n(i12);
        } else if (i12 > this.f29345b.length) {
            m33863q();
            return;
        }
        this.f29345b[i11] = (byte) i10;
        this.f29346c = i12;
    }

    @Override // p309v5.InterfaceC8836r
    public void writeInt(int i10) {
        int i11 = this.f29346c;
        int i12 = i11 + 4;
        if (this.f29344a) {
            m33871n(i12);
        } else if (i12 > this.f29345b.length) {
            m33863q();
            return;
        }
        byte[] bArr = this.f29345b;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f29346c = i12;
    }

    @Override // p309v5.InterfaceC8836r
    public void writeLong(long j10) {
        int i10 = this.f29346c;
        int i11 = i10 + 8;
        if (this.f29344a) {
            m33871n(i11);
        } else if (i11 > this.f29345b.length) {
            m33863q();
            return;
        }
        int i12 = (int) j10;
        byte[] bArr = this.f29345b;
        bArr[i10] = (byte) i12;
        bArr[i10 + 1] = (byte) (i12 >> 8);
        bArr[i10 + 2] = (byte) (i12 >> 16);
        bArr[i10 + 3] = (byte) (i12 >> 24);
        int i13 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) i13;
        bArr[i10 + 5] = (byte) (i13 >> 8);
        bArr[i10 + 6] = (byte) (i13 >> 16);
        bArr[i10 + 7] = (byte) (i13 >> 24);
        this.f29346c = i11;
    }

    @Override // p309v5.InterfaceC8836r
    public void writeShort(int i10) {
        int i11 = this.f29346c;
        int i12 = i11 + 2;
        if (this.f29344a) {
            m33871n(i12);
        } else if (i12 > this.f29345b.length) {
            m33863q();
            return;
        }
        byte[] bArr = this.f29345b;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        this.f29346c = i12;
    }

    /* JADX INFO: renamed from: v5.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f29351a;

        /* JADX INFO: renamed from: b */
        public int f29352b;

        /* JADX INFO: renamed from: c */
        public final String f29353c;

        public a(int i10, int i11, String str) {
            this.f29351a = i10;
            this.f29352b = i11;
            this.f29353c = str;
        }

        /* JADX INFO: renamed from: a */
        public int m33878a() {
            return this.f29352b;
        }

        /* JADX INFO: renamed from: b */
        public int m33879b() {
            return this.f29351a;
        }

        /* JADX INFO: renamed from: c */
        public String m33880c() {
            return this.f29353c;
        }

        /* JADX INFO: renamed from: d */
        public void m33881d(int i10) {
            this.f29352b = i10;
        }

        /* JADX INFO: renamed from: e */
        public void m33882e(int i10) {
            if (this.f29352b == Integer.MAX_VALUE) {
                this.f29352b = i10;
            }
        }

        public a(int i10, String str) {
            this(i10, Integer.MAX_VALUE, str);
        }
    }

    public C8823e() {
        this(1000);
    }

    public C8823e(int i10) {
        this(new byte[i10], true);
    }

    public C8823e(byte[] bArr) {
        this(bArr, false);
    }
}
