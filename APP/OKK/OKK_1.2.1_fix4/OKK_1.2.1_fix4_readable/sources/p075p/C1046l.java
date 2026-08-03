package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: p.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1046l {

    /* JADX INFO: renamed from: a */
    public int f4028a;

    /* JADX INFO: renamed from: b */
    public int f4029b;

    /* JADX INFO: renamed from: c */
    public float f4030c;

    /* JADX INFO: renamed from: d */
    public float f4031d;

    /* JADX INFO: renamed from: a */
    public final void m2523a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1052r.f4055f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f4030c = typedArrayObtainStyledAttributes.getFloat(index, this.f4030c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f4028a);
                this.f4028a = i3;
                this.f4028a = C1048n.f4045d[i3];
            } else if (index == 4) {
                this.f4029b = typedArrayObtainStyledAttributes.getInt(index, this.f4029b);
            } else if (index == 3) {
                this.f4031d = typedArrayObtainStyledAttributes.getFloat(index, this.f4031d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
