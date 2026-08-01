package p208n4;

import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2717p {

    /* JADX INFO: renamed from: a */
    public final byte[] f8653a;

    /* JADX INFO: renamed from: b */
    public int f8654b;

    /* JADX INFO: renamed from: c */
    public int f8655c;

    /* JADX INFO: renamed from: d */
    public boolean f8656d;

    /* JADX INFO: renamed from: e */
    public final boolean f8657e;

    /* JADX INFO: renamed from: f */
    public C2717p f8658f;

    /* JADX INFO: renamed from: g */
    public C2717p f8659g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2717p() {
        this.f8653a = new byte[8192];
        this.f8657e = true;
        this.f8656d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2717p m4757a() {
        C2717p c2717p = this.f8658f;
        if (c2717p == this) {
            c2717p = null;
        }
        C2717p c2717p2 = this.f8659g;
        AbstractC1665j.m2982b(c2717p2);
        c2717p2.f8658f = this.f8658f;
        C2717p c2717p3 = this.f8658f;
        AbstractC1665j.m2982b(c2717p3);
        c2717p3.f8659g = this.f8659g;
        this.f8658f = null;
        this.f8659g = null;
        return c2717p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4758b(C2717p c2717p) {
        AbstractC1665j.m2985e(c2717p, "segment");
        c2717p.f8659g = this;
        c2717p.f8658f = this.f8658f;
        C2717p c2717p2 = this.f8658f;
        AbstractC1665j.m2982b(c2717p2);
        c2717p2.f8659g = c2717p;
        this.f8658f = c2717p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2717p m4759c() {
        this.f8656d = true;
        return new C2717p(this.f8653a, this.f8654b, this.f8655c, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4760d(C2717p c2717p, int i5) {
        AbstractC1665j.m2985e(c2717p, "sink");
        byte[] bArr = c2717p.f8653a;
        if (!c2717p.f8657e) {
            throw new IllegalStateException("only owner can write");
        }
        int i6 = c2717p.f8655c;
        int i7 = i6 + i5;
        if (i7 > 8192) {
            if (c2717p.f8656d) {
                throw new IllegalArgumentException();
            }
            int i8 = c2717p.f8654b;
            if (i7 - i8 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0972l.m1989M(0, i8, i6, bArr, bArr);
            c2717p.f8655c -= c2717p.f8654b;
            c2717p.f8654b = 0;
        }
        int i9 = c2717p.f8655c;
        int i10 = this.f8654b;
        AbstractC0972l.m1989M(i9, i10, i10 + i5, this.f8653a, bArr);
        c2717p.f8655c += i5;
        this.f8654b += i5;
    }

    public C2717p(byte[] bArr, int i5, int i6, boolean z5) {
        AbstractC1665j.m2985e(bArr, "data");
        this.f8653a = bArr;
        this.f8654b = i5;
        this.f8655c = i6;
        this.f8656d = z5;
        this.f8657e = false;
    }
}
