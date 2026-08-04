package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲈᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0502 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f2442;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final byte[] f2443;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f2444;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0502 f2445;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f2446;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0502 f2447;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f2448;

    public C0502() {
        this.f2443 = new byte[8192];
        this.f2442 = true;
        this.f2448 = false;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0502 m1350() {
        C0502 c0502 = this.f2447;
        C0502 c05022 = c0502 != this ? c0502 : null;
        C0502 c05023 = this.f2445;
        c05023.f2447 = c0502;
        this.f2447.f2445 = c05023;
        this.f2447 = null;
        this.f2445 = null;
        return c05022;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1351(C0502 c0502) {
        c0502.f2445 = this;
        c0502.f2447 = this.f2447;
        this.f2447.f2445 = c0502;
        this.f2447 = c0502;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0502 m1352() {
        this.f2448 = true;
        return new C0502(this.f2443, this.f2444, this.f2446, true);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1353(C0502 c0502, int i) {
        if (!c0502.f2442) {
            C0188.m800("only owner can write");
            return;
        }
        int i2 = c0502.f2446;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c0502.f2448) {
                C1693.m3437();
                return;
            }
            int i4 = c0502.f2444;
            if (i3 - i4 > 8192) {
                C1693.m3437();
                return;
            }
            byte[] bArr = c0502.f2443;
            AbstractC2070.m3933(bArr, bArr, 0, i4, i2, 2);
            i2 = c0502.f2446 - c0502.f2444;
            c0502.f2446 = i2;
            c0502.f2444 = 0;
        }
        byte[] bArr2 = c0502.f2443;
        int i5 = this.f2444;
        AbstractC2070.m3938(this.f2443, bArr2, i2, i5, i5 + i);
        c0502.f2446 += i;
        this.f2444 += i;
    }

    public C0502(byte[] bArr, int i, int i2, boolean z) {
        this.f2443 = bArr;
        this.f2444 = i;
        this.f2446 = i2;
        this.f2448 = z;
        this.f2442 = false;
    }
}
