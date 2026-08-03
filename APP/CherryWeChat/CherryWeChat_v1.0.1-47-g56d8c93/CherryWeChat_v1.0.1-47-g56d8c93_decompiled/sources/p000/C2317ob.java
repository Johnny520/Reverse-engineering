package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: ob */
/* JADX INFO: loaded from: classes.dex */
public final class C2317ob {

    /* JADX INFO: renamed from: a */
    public int f8160a;

    /* JADX INFO: renamed from: b */
    public int f8161b;

    /* JADX INFO: renamed from: c */
    public float f8162c;

    /* JADX INFO: renamed from: d */
    public float f8163d;

    /* JADX INFO: renamed from: a */
    public final void m4726a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2041h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f8162c = typedArrayObtainStyledAttributes.getFloat(index, this.f8162c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f8160a);
                this.f8160a = i2;
                this.f8160a = C2411qb.f8451d[i2];
            } else if (index == 4) {
                this.f8161b = typedArrayObtainStyledAttributes.getInt(index, this.f8161b);
            } else if (index == 3) {
                this.f8163d = typedArrayObtainStyledAttributes.getFloat(index, this.f8163d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
