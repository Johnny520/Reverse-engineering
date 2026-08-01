package p199;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p202.AbstractC7877;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final SparseIntArray f21616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f21617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f21618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21622;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f21623;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21624;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21625;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21616 = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13226(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7862.f21519);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f21616.get(index)) {
                case 1:
                    this.f21618 = typedArrayObtainStyledAttributes.getFloat(index, this.f21618);
                    break;
                case 2:
                    this.f21620 = typedArrayObtainStyledAttributes.getInt(index, this.f21620);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC7877.f21668[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f21622 = C7863.m13215(typedArrayObtainStyledAttributes, index, this.f21622);
                    break;
                case 6:
                    this.f21621 = typedArrayObtainStyledAttributes.getInteger(index, this.f21621);
                    break;
                case 7:
                    this.f21619 = typedArrayObtainStyledAttributes.getFloat(index, this.f21619);
                    break;
                case 8:
                    this.f21624 = typedArrayObtainStyledAttributes.getInteger(index, this.f21624);
                    break;
                case 9:
                    this.f21617 = typedArrayObtainStyledAttributes.getFloat(index, this.f21617);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f21625 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f21623 = string;
                        if (string.indexOf("/") > 0) {
                            this.f21625 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f21625);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
