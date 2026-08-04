package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲁᲇᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2347 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f11526;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int[] f11527;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f11528;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11529;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4361(int i, int i2) {
        if (i < 0) {
            C0188.m798("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C0188.m798("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f11529;
        int i4 = i3 * 2;
        int[] iArr = this.f11527;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f11527 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f11527 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f11527;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f11529++;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m4362(C1213 c1213, boolean z) {
        this.f11529 = 0;
        int[] iArr = this.f11527;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2551 abstractC2551 = c1213.f5583;
        if (c1213.f5537 == null || abstractC2551 == null || !abstractC2551.f12596) {
            return;
        }
        if (z) {
            if (!c1213.f5553.m2520()) {
                abstractC2551.mo173(c1213.f5537.mo531(), this);
            }
        } else if (!c1213.m2429()) {
            abstractC2551.mo171(this.f11526, this.f11528, c1213.f5568, this);
        }
        int i = this.f11529;
        if (i > abstractC2551.f12604) {
            abstractC2551.f12604 = i;
            abstractC2551.f12602 = z;
            c1213.f5529.m4928();
        }
    }
}
