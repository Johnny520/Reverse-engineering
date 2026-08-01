package p145;

import p180.C8493;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8328 extends AbstractC8327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8493[] f20682;

    public AbstractC8328(AbstractC8328 abstractC8328) {
        this.f20682 = null;
        this.f20680 = 0;
        this.f20681 = abstractC8328.f20681;
        C8493[] c8493Arr = abstractC8328.f20682;
        C8493[] c8493Arr2 = new C8493[c8493Arr.length];
        for (int i = 0; i < c8493Arr.length; i++) {
            c8493Arr2[i] = new C8493(c8493Arr[i]);
        }
        this.f20682 = c8493Arr2;
    }

    public C8493[] getPathData() {
        return this.f20682;
    }

    public String getPathName() {
        return this.f20681;
    }

    public void setPathData(C8493[] c8493Arr) {
        C8493[] c8493Arr2 = this.f20682;
        if (c8493Arr2 != null && c8493Arr != null && c8493Arr2.length == c8493Arr.length) {
            for (int i = 0; i < c8493Arr2.length; i++) {
                C8493 c8493 = c8493Arr2[i];
                char c = c8493.f21150;
                C8493 c84932 = c8493Arr[i];
                if (c == c84932.f21150 && c8493.f21149.length == c84932.f21149.length) {
                }
            }
            C8493[] c8493Arr3 = this.f20682;
            for (int i2 = 0; i2 < c8493Arr.length; i2++) {
                c8493Arr3[i2].f21150 = c8493Arr[i2].f21150;
                int i3 = 0;
                while (true) {
                    float[] fArr = c8493Arr[i2].f21149;
                    if (i3 < fArr.length) {
                        c8493Arr3[i2].f21149[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        C8493[] c8493Arr4 = new C8493[c8493Arr.length];
        for (int i4 = 0; i4 < c8493Arr.length; i4++) {
            c8493Arr4[i4] = new C8493(c8493Arr[i4]);
        }
        this.f20682 = c8493Arr4;
    }

    public AbstractC8328() {
        this.f20682 = null;
        this.f20680 = 0;
    }
}
