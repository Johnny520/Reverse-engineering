package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f6721a;

    /* JADX INFO: renamed from: b */
    public int f6722b;

    /* JADX INFO: renamed from: c */
    public int f6723c;

    /* JADX INFO: renamed from: d */
    public boolean f6724d;

    /* JADX INFO: renamed from: e */
    public final boolean f6725e;

    /* JADX INFO: renamed from: f */
    public mm2 f6726f;

    /* JADX INFO: renamed from: g */
    public mm2 f6727g;

    public mm2(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f6721a = bArr;
        this.f6722b = i;
        this.f6723c = i2;
        this.f6724d = z;
        this.f6725e = false;
    }

    /* JADX INFO: renamed from: a */
    public final mm2 m3133a() {
        mm2 mm2Var = this.f6726f;
        if (mm2Var == this) {
            mm2Var = null;
        }
        mm2 mm2Var2 = this.f6727g;
        mm2Var2.getClass();
        mm2Var2.f6726f = this.f6726f;
        mm2 mm2Var3 = this.f6726f;
        mm2Var3.getClass();
        mm2Var3.f6727g = this.f6727g;
        this.f6726f = null;
        this.f6727g = null;
        return mm2Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m3134b(mm2 mm2Var) {
        mm2Var.getClass();
        mm2Var.f6727g = this;
        mm2Var.f6726f = this.f6726f;
        mm2 mm2Var2 = this.f6726f;
        mm2Var2.getClass();
        mm2Var2.f6727g = mm2Var;
        this.f6726f = mm2Var;
    }

    /* JADX INFO: renamed from: c */
    public final mm2 m3135c() {
        this.f6724d = true;
        return new mm2(this.f6721a, this.f6722b, this.f6723c, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m3136d(mm2 mm2Var, int i) {
        mm2Var.getClass();
        if (!mm2Var.f6725e) {
            C0676s.m4653l("only owner can write");
            return;
        }
        int i2 = mm2Var.f6723c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (mm2Var.f6724d) {
                throw new IllegalArgumentException();
            }
            int i4 = mm2Var.f6722b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = mm2Var.f6721a;
            AbstractC0460mg.m3089d0(bArr, bArr, 0, i4, i2, 2);
            mm2Var.f6723c -= mm2Var.f6722b;
            mm2Var.f6722b = 0;
        }
        byte[] bArr2 = mm2Var.f6721a;
        int i5 = mm2Var.f6723c;
        int i6 = this.f6722b;
        AbstractC0460mg.m3085Z(this.f6721a, bArr2, i5, i6, i6 + i);
        mm2Var.f6723c += i;
        this.f6722b += i;
    }

    public mm2() {
        this.f6721a = new byte[8192];
        this.f6725e = true;
        this.f6724d = false;
    }
}
