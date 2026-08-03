package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1047m {

    /* JADX INFO: renamed from: m */
    public static final SparseIntArray f4032m;

    /* JADX INFO: renamed from: a */
    public float f4033a;

    /* JADX INFO: renamed from: b */
    public float f4034b;

    /* JADX INFO: renamed from: c */
    public float f4035c;

    /* JADX INFO: renamed from: d */
    public float f4036d;

    /* JADX INFO: renamed from: e */
    public float f4037e;

    /* JADX INFO: renamed from: f */
    public float f4038f;

    /* JADX INFO: renamed from: g */
    public float f4039g;

    /* JADX INFO: renamed from: h */
    public float f4040h;

    /* JADX INFO: renamed from: i */
    public float f4041i;

    /* JADX INFO: renamed from: j */
    public float f4042j;

    /* JADX INFO: renamed from: k */
    public boolean f4043k;

    /* JADX INFO: renamed from: l */
    public float f4044l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4032m = sparseIntArray;
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
    }

    /* JADX INFO: renamed from: a */
    public final void m2524a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1052r.f4057h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f4032m.get(index)) {
                case 1:
                    this.f4033a = typedArrayObtainStyledAttributes.getFloat(index, this.f4033a);
                    break;
                case 2:
                    this.f4034b = typedArrayObtainStyledAttributes.getFloat(index, this.f4034b);
                    break;
                case 3:
                    this.f4035c = typedArrayObtainStyledAttributes.getFloat(index, this.f4035c);
                    break;
                case 4:
                    this.f4036d = typedArrayObtainStyledAttributes.getFloat(index, this.f4036d);
                    break;
                case 5:
                    this.f4037e = typedArrayObtainStyledAttributes.getFloat(index, this.f4037e);
                    break;
                case 6:
                    this.f4038f = typedArrayObtainStyledAttributes.getDimension(index, this.f4038f);
                    break;
                case 7:
                    this.f4039g = typedArrayObtainStyledAttributes.getDimension(index, this.f4039g);
                    break;
                case 8:
                    this.f4040h = typedArrayObtainStyledAttributes.getDimension(index, this.f4040h);
                    break;
                case 9:
                    this.f4041i = typedArrayObtainStyledAttributes.getDimension(index, this.f4041i);
                    break;
                case 10:
                    this.f4042j = typedArrayObtainStyledAttributes.getDimension(index, this.f4042j);
                    break;
                case 11:
                    this.f4043k = true;
                    this.f4044l = typedArrayObtainStyledAttributes.getDimension(index, this.f4044l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
