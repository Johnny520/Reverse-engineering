package p215;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8698 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float[] f21972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f21973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f21975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f21976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String[] f21977;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int[] f21978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean[] f21979;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21981;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int[] f21982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13786(int i, boolean z) {
        int i2 = this.f21980;
        int[] iArr = this.f21982;
        if (i2 >= iArr.length) {
            this.f21982 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f21979;
            this.f21979 = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f21982;
        int i3 = this.f21980;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f21979;
        this.f21980 = i3 + 1;
        zArr2[i3] = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13787(int i, String str) {
        int i2 = this.f21981;
        int[] iArr = this.f21978;
        if (i2 >= iArr.length) {
            this.f21978 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f21977;
            this.f21977 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f21978;
        int i3 = this.f21981;
        iArr2[i3] = i;
        String[] strArr2 = this.f21977;
        this.f21981 = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13788(int i, int i2) {
        int i3 = this.f21974;
        int[] iArr = this.f21976;
        if (i3 >= iArr.length) {
            this.f21976 = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f21975;
            this.f21975 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f21976;
        int i4 = this.f21974;
        iArr3[i4] = i;
        int[] iArr4 = this.f21975;
        this.f21974 = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13789(float f, int i) {
        int i2 = this.f21971;
        int[] iArr = this.f21973;
        if (i2 >= iArr.length) {
            this.f21973 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21972;
            this.f21972 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21973;
        int i3 = this.f21971;
        iArr2[i3] = i;
        float[] fArr2 = this.f21972;
        this.f21971 = i3 + 1;
        fArr2[i3] = f;
    }
}
