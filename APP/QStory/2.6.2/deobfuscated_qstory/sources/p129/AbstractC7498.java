package p129;

import p164.C7663;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7498 extends AbstractC7497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7663[] f20342;

    public AbstractC7498(AbstractC7498 abstractC7498) {
        this.f20342 = null;
        this.f20340 = 0;
        this.f20341 = abstractC7498.f20341;
        C7663[] c7663Arr = abstractC7498.f20342;
        C7663[] c7663Arr2 = new C7663[c7663Arr.length];
        for (int i = 0; i < c7663Arr.length; i++) {
            c7663Arr2[i] = new C7663(c7663Arr[i]);
        }
        this.f20342 = c7663Arr2;
    }

    public C7663[] getPathData() {
        return this.f20342;
    }

    public String getPathName() {
        return this.f20341;
    }

    public void setPathData(C7663[] c7663Arr) {
        C7663[] c7663Arr2 = this.f20342;
        if (c7663Arr2 != null && c7663Arr != null && c7663Arr2.length == c7663Arr.length) {
            for (int i = 0; i < c7663Arr2.length; i++) {
                C7663 c7663 = c7663Arr2[i];
                char c = c7663.f20810;
                C7663 c76632 = c7663Arr[i];
                if (c == c76632.f20810 && c7663.f20809.length == c76632.f20809.length) {
                }
            }
            C7663[] c7663Arr3 = this.f20342;
            for (int i2 = 0; i2 < c7663Arr.length; i2++) {
                c7663Arr3[i2].f20810 = c7663Arr[i2].f20810;
                int i3 = 0;
                while (true) {
                    float[] fArr = c7663Arr[i2].f20809;
                    if (i3 < fArr.length) {
                        c7663Arr3[i2].f20809[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        C7663[] c7663Arr4 = new C7663[c7663Arr.length];
        for (int i4 = 0; i4 < c7663Arr.length; i4++) {
            c7663Arr4[i4] = new C7663(c7663Arr[i4]);
        }
        this.f20342 = c7663Arr4;
    }

    public AbstractC7498() {
        this.f20342 = null;
        this.f20340 = 0;
    }
}
