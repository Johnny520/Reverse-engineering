package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1759 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0052 f8833;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f8834 = 0;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f8835 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f8836 = -1;

    public C1759(C0052 c0052) {
        this.f8833 = c0052;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3493() {
        int i = this.f8834;
        if (i == 0) {
            return;
        }
        C0052 c0052 = this.f8833;
        if (i == 1) {
            c0052.m392(this.f8835, this.f8836);
        } else if (i == 2) {
            c0052.m383(this.f8835, this.f8836);
        } else if (i == 3) {
            ((AbstractC0387) c0052.f551).f1869.m1869(this.f8835, this.f8836);
        }
        this.f8834 = 0;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3494(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f8834 == 3 && i <= (i4 = this.f8836 + (i3 = this.f8835)) && (i5 = i + i2) >= i3) {
            this.f8835 = Math.min(i, i3);
            this.f8836 = Math.max(i4, i5) - this.f8835;
        } else {
            m3493();
            this.f8835 = i;
            this.f8836 = i2;
            this.f8834 = 3;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3495(int i, int i2) {
        m3493();
        ((AbstractC0387) this.f8833.f551).f1869.m1868(i, i2);
    }
}
