package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: mc */
/* JADX INFO: loaded from: classes.dex */
public final class C0480mc {

    /* JADX INFO: renamed from: a */
    public int f3190a;

    /* JADX INFO: renamed from: b */
    public int f3191b;

    /* JADX INFO: renamed from: c */
    public float f3192c;

    /* JADX INFO: renamed from: d */
    public float f3193d;

    /* JADX INFO: renamed from: a */
    public final void m1818a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0688ry.f4354f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3192c = typedArrayObtainStyledAttributes.getFloat(index, this.f3192c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f3190a);
                this.f3190a = i2;
                this.f3190a = C0554oc.f3524d[i2];
            } else if (index == 4) {
                this.f3191b = typedArrayObtainStyledAttributes.getInt(index, this.f3191b);
            } else if (index == 3) {
                this.f3193d = typedArrayObtainStyledAttributes.getFloat(index, this.f3193d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
