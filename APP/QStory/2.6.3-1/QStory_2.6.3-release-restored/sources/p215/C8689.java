package p215;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8689 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f21861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13773(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8691.f21871);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f21861 = typedArrayObtainStyledAttributes.getFloat(index, this.f21861);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f21863);
                this.f21863 = i2;
                this.f21863 = C8692.f21876[i2];
            } else if (index == 4) {
                this.f21862 = typedArrayObtainStyledAttributes.getInt(index, this.f21862);
            } else if (index == 3) {
                this.f21860 = typedArrayObtainStyledAttributes.getFloat(index, this.f21860);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
