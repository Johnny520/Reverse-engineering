package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p067l.AbstractC0978a;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1045k {

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4023e;

    /* JADX INFO: renamed from: a */
    public int f4024a;

    /* JADX INFO: renamed from: b */
    public int f4025b;

    /* JADX INFO: renamed from: c */
    public float f4026c;

    /* JADX INFO: renamed from: d */
    public float f4027d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4023e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m2522a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1052r.f4054e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f4023e.get(index)) {
                case 1:
                    this.f4027d = typedArrayObtainStyledAttributes.getFloat(index, this.f4027d);
                    break;
                case 2:
                    this.f4025b = typedArrayObtainStyledAttributes.getInt(index, this.f4025b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC0978a.f3461a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4024a = C1048n.m2527f(typedArrayObtainStyledAttributes, index, this.f4024a);
                    break;
                case 6:
                    this.f4026c = typedArrayObtainStyledAttributes.getFloat(index, this.f4026c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
