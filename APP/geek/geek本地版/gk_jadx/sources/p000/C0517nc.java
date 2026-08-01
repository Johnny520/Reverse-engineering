package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: nc */
/* JADX INFO: loaded from: classes.dex */
public final class C0517nc {

    /* JADX INFO: renamed from: m */
    public static final SparseIntArray f3372m;

    /* JADX INFO: renamed from: a */
    public float f3373a;

    /* JADX INFO: renamed from: b */
    public float f3374b;

    /* JADX INFO: renamed from: c */
    public float f3375c;

    /* JADX INFO: renamed from: d */
    public float f3376d;

    /* JADX INFO: renamed from: e */
    public float f3377e;

    /* JADX INFO: renamed from: f */
    public float f3378f;

    /* JADX INFO: renamed from: g */
    public float f3379g;

    /* JADX INFO: renamed from: h */
    public float f3380h;

    /* JADX INFO: renamed from: i */
    public float f3381i;

    /* JADX INFO: renamed from: j */
    public float f3382j;

    /* JADX INFO: renamed from: k */
    public boolean f3383k;

    /* JADX INFO: renamed from: l */
    public float f3384l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3372m = sparseIntArray;
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
    public final void m1926a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0688ry.f4356h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f3372m.get(index)) {
                case Base64.NO_PADDING /* 1 */:
                    this.f3373a = typedArrayObtainStyledAttributes.getFloat(index, this.f3373a);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    this.f3374b = typedArrayObtainStyledAttributes.getFloat(index, this.f3374b);
                    break;
                case 3:
                    this.f3375c = typedArrayObtainStyledAttributes.getFloat(index, this.f3375c);
                    break;
                case 4:
                    this.f3376d = typedArrayObtainStyledAttributes.getFloat(index, this.f3376d);
                    break;
                case 5:
                    this.f3377e = typedArrayObtainStyledAttributes.getFloat(index, this.f3377e);
                    break;
                case 6:
                    this.f3378f = typedArrayObtainStyledAttributes.getDimension(index, this.f3378f);
                    break;
                case 7:
                    this.f3379g = typedArrayObtainStyledAttributes.getDimension(index, this.f3379g);
                    break;
                case 8:
                    this.f3380h = typedArrayObtainStyledAttributes.getDimension(index, this.f3380h);
                    break;
                case 9:
                    this.f3381i = typedArrayObtainStyledAttributes.getDimension(index, this.f3381i);
                    break;
                case 10:
                    this.f3382j = typedArrayObtainStyledAttributes.getDimension(index, this.f3382j);
                    break;
                case 11:
                    this.f3383k = true;
                    this.f3384l = typedArrayObtainStyledAttributes.getDimension(index, this.f3384l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
