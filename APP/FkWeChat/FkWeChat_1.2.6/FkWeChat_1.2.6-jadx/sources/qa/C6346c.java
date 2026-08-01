package qa;

import bsh.C1189h4;
import qa.AbstractC6348e;

/* JADX INFO: renamed from: qa.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6346c extends C6359p {

    /* JADX INFO: renamed from: t */
    public final int f19961t;

    /* JADX INFO: renamed from: u */
    public final int f19962u;

    /* JADX INFO: renamed from: qa.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements AbstractC6348e.a {

        /* JADX INFO: renamed from: q */
        public int f19963q;

        /* JADX INFO: renamed from: r */
        public final int f19964r;

        public b() {
            int iMo25029D = C6346c.this.mo25029D();
            this.f19963q = iMo25029D;
            this.f19964r = iMo25029D + C6346c.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo25033c());
        }

        @Override // qa.AbstractC6348e.a
        /* JADX INFO: renamed from: c */
        public byte mo25033c() {
            int i10 = this.f19963q;
            if (i10 >= this.f19964r) {
                C1189h4.m4429a();
                return (byte) 0;
            }
            byte[] bArr = C6346c.this.f20027r;
            this.f19963q = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19963q < this.f19964r;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6346c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f19961t = i10;
            this.f19962u = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // qa.C6359p
    /* JADX INFO: renamed from: D */
    public int mo25029D() {
        return this.f19961t;
    }

    @Override // qa.C6359p, java.lang.Iterable
    /* JADX INFO: renamed from: F */
    public AbstractC6348e.a iterator() {
        return new b();
    }

    @Override // qa.C6359p, qa.AbstractC6348e
    /* JADX INFO: renamed from: p */
    public void mo25031p(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f20027r, mo25029D() + i10, bArr, i11, i12);
    }

    @Override // qa.C6359p, qa.AbstractC6348e
    public int size() {
        return this.f19962u;
    }
}
