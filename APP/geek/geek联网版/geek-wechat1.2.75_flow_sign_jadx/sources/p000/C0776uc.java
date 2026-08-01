package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: uc */
/* JADX INFO: loaded from: classes.dex */
public final class C0776uc {

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4809e;

    /* JADX INFO: renamed from: a */
    public int f4810a;

    /* JADX INFO: renamed from: b */
    public int f4811b;

    /* JADX INFO: renamed from: c */
    public float f4812c;

    /* JADX INFO: renamed from: d */
    public float f4813d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4809e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m2471a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947yy.f5513e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f4809e.get(index)) {
                case Base64.NO_PADDING /* 1 */:
                    this.f4813d = typedArrayObtainStyledAttributes.getFloat(index, this.f4813d);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    this.f4811b = typedArrayObtainStyledAttributes.getInt(index, this.f4811b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC0259gf.f1968m[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4810a = C0888xc.m2677f(typedArrayObtainStyledAttributes, index, this.f4810a);
                    break;
                case 6:
                    this.f4812c = typedArrayObtainStyledAttributes.getFloat(index, this.f4812c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
