package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: lc */
/* JADX INFO: loaded from: classes.dex */
public final class C0443lc {

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f3041e;

    /* JADX INFO: renamed from: a */
    public int f3042a;

    /* JADX INFO: renamed from: b */
    public int f3043b;

    /* JADX INFO: renamed from: c */
    public float f3044c;

    /* JADX INFO: renamed from: d */
    public float f3045d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3041e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m1757a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0688ry.f4353e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f3041e.get(index)) {
                case Base64.NO_PADDING /* 1 */:
                    this.f3045d = typedArrayObtainStyledAttributes.getFloat(index, this.f3045d);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    this.f3043b = typedArrayObtainStyledAttributes.getInt(index, this.f3043b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC0222ff.f1946m[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3042a = C0554oc.m2008f(typedArrayObtainStyledAttributes, index, this.f3042a);
                    break;
                case 6:
                    this.f3044c = typedArrayObtainStyledAttributes.getFloat(index, this.f3044c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
