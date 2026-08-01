package p199;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float[] f21630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f21631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f21633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f21634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String[] f21635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int[] f21636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean[] f21637;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21638;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21639;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int[] f21640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13199(int i, boolean z) {
        int i2 = this.f21638;
        int[] iArr = this.f21640;
        if (i2 >= iArr.length) {
            this.f21640 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f21637;
            this.f21637 = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f21640;
        int i3 = this.f21638;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f21637;
        this.f21638 = i3 + 1;
        zArr2[i3] = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13200(int i, String str) {
        int i2 = this.f21639;
        int[] iArr = this.f21636;
        if (i2 >= iArr.length) {
            this.f21636 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f21635;
            this.f21635 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f21636;
        int i3 = this.f21639;
        iArr2[i3] = i;
        String[] strArr2 = this.f21635;
        this.f21639 = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13201(int i, int i2) {
        int i3 = this.f21632;
        int[] iArr = this.f21634;
        if (i3 >= iArr.length) {
            this.f21634 = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f21633;
            this.f21633 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f21634;
        int i4 = this.f21632;
        iArr3[i4] = i;
        int[] iArr4 = this.f21633;
        this.f21632 = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13202(float f, int i) {
        int i2 = this.f21629;
        int[] iArr = this.f21631;
        if (i2 >= iArr.length) {
            this.f21631 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21630;
            this.f21630 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21631;
        int i3 = this.f21629;
        iArr2[i3] = i;
        float[] fArr2 = this.f21630;
        this.f21629 = i3 + 1;
        fArr2[i3] = f;
    }
}
