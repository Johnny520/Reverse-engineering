package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: wc */
/* JADX INFO: loaded from: classes.dex */
public final class C0851wc {

    /* JADX INFO: renamed from: m */
    public static final SparseIntArray f5080m;

    /* JADX INFO: renamed from: a */
    public float f5081a;

    /* JADX INFO: renamed from: b */
    public float f5082b;

    /* JADX INFO: renamed from: c */
    public float f5083c;

    /* JADX INFO: renamed from: d */
    public float f5084d;

    /* JADX INFO: renamed from: e */
    public float f5085e;

    /* JADX INFO: renamed from: f */
    public float f5086f;

    /* JADX INFO: renamed from: g */
    public float f5087g;

    /* JADX INFO: renamed from: h */
    public float f5088h;

    /* JADX INFO: renamed from: i */
    public float f5089i;

    /* JADX INFO: renamed from: j */
    public float f5090j;

    /* JADX INFO: renamed from: k */
    public boolean f5091k;

    /* JADX INFO: renamed from: l */
    public float f5092l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5080m = sparseIntArray;
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
    public final void m2606a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947yy.f5516h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f5080m.get(index)) {
                case Base64.NO_PADDING /* 1 */:
                    this.f5081a = typedArrayObtainStyledAttributes.getFloat(index, this.f5081a);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    this.f5082b = typedArrayObtainStyledAttributes.getFloat(index, this.f5082b);
                    break;
                case 3:
                    this.f5083c = typedArrayObtainStyledAttributes.getFloat(index, this.f5083c);
                    break;
                case 4:
                    this.f5084d = typedArrayObtainStyledAttributes.getFloat(index, this.f5084d);
                    break;
                case 5:
                    this.f5085e = typedArrayObtainStyledAttributes.getFloat(index, this.f5085e);
                    break;
                case 6:
                    this.f5086f = typedArrayObtainStyledAttributes.getDimension(index, this.f5086f);
                    break;
                case 7:
                    this.f5087g = typedArrayObtainStyledAttributes.getDimension(index, this.f5087g);
                    break;
                case 8:
                    this.f5088h = typedArrayObtainStyledAttributes.getDimension(index, this.f5088h);
                    break;
                case 9:
                    this.f5089i = typedArrayObtainStyledAttributes.getDimension(index, this.f5089i);
                    break;
                case 10:
                    this.f5090j = typedArrayObtainStyledAttributes.getDimension(index, this.f5090j);
                    break;
                case 11:
                    this.f5091k = true;
                    this.f5092l = typedArrayObtainStyledAttributes.getDimension(index, this.f5092l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
