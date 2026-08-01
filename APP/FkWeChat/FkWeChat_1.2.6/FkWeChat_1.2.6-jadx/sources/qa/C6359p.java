package qa;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import qa.AbstractC6348e;

/* JADX INFO: renamed from: qa.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6359p extends AbstractC6348e {

    /* JADX INFO: renamed from: r */
    public final byte[] f20027r;

    /* JADX INFO: renamed from: s */
    public int f20028s = 0;

    /* JADX INFO: renamed from: qa.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements AbstractC6348e.a {

        /* JADX INFO: renamed from: q */
        public int f20029q;

        /* JADX INFO: renamed from: r */
        public final int f20030r;

        public b() {
            this.f20029q = 0;
            this.f20030r = C6359p.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo25033c());
        }

        @Override // qa.AbstractC6348e.a
        /* JADX INFO: renamed from: c */
        public byte mo25033c() {
            try {
                byte[] bArr = C6359p.this.f20027r;
                int i10 = this.f20029q;
                this.f20029q = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20029q < this.f20030r;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6359p(byte[] bArr) {
        this.f20027r = bArr;
    }

    /* JADX INFO: renamed from: E */
    public static int m25273E(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: B */
    public void mo25042B(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f20027r, mo25029D() + i10, i11);
    }

    /* JADX INFO: renamed from: C */
    public boolean m25274C(C6359p c6359p, int i10, int i11) {
        if (i11 > c6359p.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > c6359p.size()) {
            int size2 = c6359p.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f20027r;
        byte[] bArr2 = c6359p.f20027r;
        int iMo25029D = mo25029D() + i11;
        int iMo25029D2 = mo25029D();
        int iMo25029D3 = c6359p.mo25029D() + i10;
        while (iMo25029D2 < iMo25029D) {
            if (bArr[iMo25029D2] != bArr2[iMo25029D3]) {
                return false;
            }
            iMo25029D2++;
            iMo25029D3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public int mo25029D() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC6348e.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6348e) || size() != ((AbstractC6348e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C6359p) {
            return m25274C((C6359p) obj, 0, size());
        }
        if (obj instanceof C6364u) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iMo25048u = this.f20028s;
        if (iMo25048u == 0) {
            int size = size();
            iMo25048u = mo25048u(size, 0, size);
            if (iMo25048u == 0) {
                iMo25048u = 1;
            }
            this.f20028s = iMo25048u;
        }
        return iMo25048u;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: p */
    public void mo25031p(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f20027r, i10, bArr, i11, i12);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: q */
    public int mo25045q() {
        return 0;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: r */
    public boolean mo25046r() {
        return true;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: s */
    public boolean mo25047s() {
        int iMo25029D = mo25029D();
        return AbstractC6368y.m25329f(this.f20027r, iMo25029D, size() + iMo25029D);
    }

    @Override // qa.AbstractC6348e
    public int size() {
        return this.f20027r.length;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: u */
    public int mo25048u(int i10, int i11, int i12) {
        return m25273E(i10, this.f20027r, mo25029D() + i11, i12);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: v */
    public int mo25049v(int i10, int i11, int i12) {
        int iMo25029D = mo25029D() + i11;
        return AbstractC6368y.m25330g(i10, this.f20027r, iMo25029D, i12 + iMo25029D);
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: w */
    public int mo25050w() {
        return this.f20028s;
    }

    @Override // qa.AbstractC6348e
    /* JADX INFO: renamed from: y */
    public String mo25052y(String str) {
        return new String(this.f20027r, mo25029D(), size(), str);
    }
}
