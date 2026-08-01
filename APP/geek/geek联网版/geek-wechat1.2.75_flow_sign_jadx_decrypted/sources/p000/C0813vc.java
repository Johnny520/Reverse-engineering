package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: vc */
/* JADX INFO: loaded from: classes.dex */
public final class C0813vc {

    /* JADX INFO: renamed from: a */
    public int f4936a;

    /* JADX INFO: renamed from: b */
    public int f4937b;

    /* JADX INFO: renamed from: c */
    public float f4938c;

    /* JADX INFO: renamed from: d */
    public float f4939d;

    /* JADX INFO: renamed from: a */
    public final void m2561a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947yy.f5514f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4938c = typedArrayObtainStyledAttributes.getFloat(index, this.f4938c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f4936a);
                this.f4936a = i2;
                this.f4936a = C0888xc.f5231d[i2];
            } else if (index == 4) {
                this.f4937b = typedArrayObtainStyledAttributes.getInt(index, this.f4937b);
            } else if (index == 3) {
                this.f4939d = typedArrayObtainStyledAttributes.getFloat(index, this.f4939d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
