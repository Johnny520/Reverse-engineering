package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲇᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1670 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f8523;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int[] f8524 = new int[10];

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3416() {
        if ((this.f8523 & 16) != 0) {
            return this.f8524[4];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3417(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f8524;
            if (i >= iArr.length) {
                return;
            }
            this.f8523 = (1 << i) | this.f8523;
            iArr[i] = i2;
        }
    }
}
