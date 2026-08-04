package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛷᛳᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1517 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public String[] f7324;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f7325;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float[] f7326;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int[] f7327;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int[] f7328;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int[] f7329;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean[] f7330;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f7331;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int[] f7332;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f7333;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f7334;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int[] f7335;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3137(int i, float f) {
        int i2 = this.f7334;
        int[] iArr = this.f7335;
        if (i2 >= iArr.length) {
            this.f7335 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7326;
            this.f7326 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7335;
        int i3 = this.f7334;
        iArr2[i3] = i;
        float[] fArr2 = this.f7326;
        this.f7334 = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3138(int i, int i2) {
        int i3 = this.f7333;
        int[] iArr = this.f7327;
        if (i3 >= iArr.length) {
            this.f7327 = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f7328;
            this.f7328 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7327;
        int i4 = this.f7333;
        iArr3[i4] = i;
        int[] iArr4 = this.f7328;
        this.f7333 = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3139(int i, String str) {
        int i2 = this.f7325;
        int[] iArr = this.f7329;
        if (i2 >= iArr.length) {
            this.f7329 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7324;
            this.f7324 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f7329;
        int i3 = this.f7325;
        iArr2[i3] = i;
        String[] strArr2 = this.f7324;
        this.f7325 = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3140(int i, boolean z) {
        int i2 = this.f7331;
        int[] iArr = this.f7332;
        if (i2 >= iArr.length) {
            this.f7332 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f7330;
            this.f7330 = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f7332;
        int i3 = this.f7331;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f7330;
        this.f7331 = i3 + 1;
        zArr2[i3] = z;
    }
}
