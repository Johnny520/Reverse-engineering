package p215;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final SparseIntArray f21846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f21847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f21848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f21850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f21851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f21852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f21853;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f21855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f21856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f21857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f21858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f21859;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21846 = sparseIntArray;
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
    public final void m13772(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8691.f21872);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f21846.get(index)) {
                case 1:
                    this.f21852 = typedArrayObtainStyledAttributes.getFloat(index, this.f21852);
                    break;
                case 2:
                    this.f21851 = typedArrayObtainStyledAttributes.getFloat(index, this.f21851);
                    break;
                case 3:
                    this.f21850 = typedArrayObtainStyledAttributes.getFloat(index, this.f21850);
                    break;
                case 4:
                    this.f21849 = typedArrayObtainStyledAttributes.getFloat(index, this.f21849);
                    break;
                case 5:
                    this.f21848 = typedArrayObtainStyledAttributes.getFloat(index, this.f21848);
                    break;
                case 6:
                    this.f21847 = typedArrayObtainStyledAttributes.getDimension(index, this.f21847);
                    break;
                case 7:
                    this.f21855 = typedArrayObtainStyledAttributes.getDimension(index, this.f21855);
                    break;
                case 8:
                    this.f21858 = typedArrayObtainStyledAttributes.getDimension(index, this.f21858);
                    break;
                case 9:
                    this.f21859 = typedArrayObtainStyledAttributes.getDimension(index, this.f21859);
                    break;
                case 10:
                    this.f21856 = typedArrayObtainStyledAttributes.getDimension(index, this.f21856);
                    break;
                case 11:
                    this.f21857 = true;
                    this.f21853 = typedArrayObtainStyledAttributes.getDimension(index, this.f21853);
                    break;
                case 12:
                    this.f21854 = C8692.m13774(typedArrayObtainStyledAttributes, index, this.f21854);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
