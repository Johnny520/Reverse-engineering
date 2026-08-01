package p129;

import p164.C7664;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7499 extends AbstractC7498 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7664[] f20337;

    public AbstractC7499(AbstractC7499 abstractC7499) {
        this.f20337 = null;
        this.f20335 = 0;
        this.f20336 = abstractC7499.f20336;
        C7664[] c7664Arr = abstractC7499.f20337;
        C7664[] c7664Arr2 = new C7664[c7664Arr.length];
        for (int i = 0; i < c7664Arr.length; i++) {
            c7664Arr2[i] = new C7664(c7664Arr[i]);
        }
        this.f20337 = c7664Arr2;
    }

    public C7664[] getPathData() {
        return this.f20337;
    }

    public String getPathName() {
        return this.f20336;
    }

    public void setPathData(C7664[] c7664Arr) {
        C7664[] c7664Arr2 = this.f20337;
        if (c7664Arr2 != null && c7664Arr != null && c7664Arr2.length == c7664Arr.length) {
            for (int i = 0; i < c7664Arr2.length; i++) {
                C7664 c7664 = c7664Arr2[i];
                char c = c7664.f20805;
                C7664 c76642 = c7664Arr[i];
                if (c == c76642.f20805 && c7664.f20804.length == c76642.f20804.length) {
                }
            }
            C7664[] c7664Arr3 = this.f20337;
            for (int i2 = 0; i2 < c7664Arr.length; i2++) {
                c7664Arr3[i2].f20805 = c7664Arr[i2].f20805;
                int i3 = 0;
                while (true) {
                    float[] fArr = c7664Arr[i2].f20804;
                    if (i3 < fArr.length) {
                        c7664Arr3[i2].f20804[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        C7664[] c7664Arr4 = new C7664[c7664Arr.length];
        for (int i4 = 0; i4 < c7664Arr.length; i4++) {
            c7664Arr4[i4] = new C7664(c7664Arr[i4]);
        }
        this.f20337 = c7664Arr4;
    }

    public AbstractC7499() {
        this.f20337 = null;
        this.f20335 = 0;
    }
}
