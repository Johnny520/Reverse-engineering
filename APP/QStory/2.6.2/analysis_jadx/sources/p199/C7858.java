package p199;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7858 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final SparseIntArray f21504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f21505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f21506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f21508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f21509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f21510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f21511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f21513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f21514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f21515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f21516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f21517;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21504 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13185(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7861.f21530);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f21504.get(index)) {
                case 1:
                    this.f21510 = typedArrayObtainStyledAttributes.getFloat(index, this.f21510);
                    break;
                case 2:
                    this.f21509 = typedArrayObtainStyledAttributes.getFloat(index, this.f21509);
                    break;
                case 3:
                    this.f21508 = typedArrayObtainStyledAttributes.getFloat(index, this.f21508);
                    break;
                case 4:
                    this.f21507 = typedArrayObtainStyledAttributes.getFloat(index, this.f21507);
                    break;
                case 5:
                    this.f21506 = typedArrayObtainStyledAttributes.getFloat(index, this.f21506);
                    break;
                case 6:
                    this.f21505 = typedArrayObtainStyledAttributes.getDimension(index, this.f21505);
                    break;
                case 7:
                    this.f21513 = typedArrayObtainStyledAttributes.getDimension(index, this.f21513);
                    break;
                case 8:
                    this.f21516 = typedArrayObtainStyledAttributes.getDimension(index, this.f21516);
                    break;
                case 9:
                    this.f21517 = typedArrayObtainStyledAttributes.getDimension(index, this.f21517);
                    break;
                case 10:
                    this.f21514 = typedArrayObtainStyledAttributes.getDimension(index, this.f21514);
                    break;
                case 11:
                    this.f21515 = true;
                    this.f21511 = typedArrayObtainStyledAttributes.getDimension(index, this.f21511);
                    break;
                case 12:
                    this.f21512 = C7862.m13187(typedArrayObtainStyledAttributes, index, this.f21512);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
