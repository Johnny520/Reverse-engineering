package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: yyds.ᛶᲇᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1457 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final SparseIntArray f6940;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6941;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public float f6942;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f6943;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f6944;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public float f6945;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f6946;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public float f6947;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public float f6948;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f6949;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public float f6950;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public float f6951;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public float f6952;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f6953;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6940 = sparseIntArray;
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
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2964(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1164.f5352);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f6940.get(index)) {
                case 1:
                    this.f6945 = typedArrayObtainStyledAttributes.getFloat(index, this.f6945);
                    break;
                case 2:
                    this.f6946 = typedArrayObtainStyledAttributes.getFloat(index, this.f6946);
                    break;
                case 3:
                    this.f6951 = typedArrayObtainStyledAttributes.getFloat(index, this.f6951);
                    break;
                case 4:
                    this.f6953 = typedArrayObtainStyledAttributes.getFloat(index, this.f6953);
                    break;
                case 5:
                    this.f6944 = typedArrayObtainStyledAttributes.getFloat(index, this.f6944);
                    break;
                case 6:
                    this.f6952 = typedArrayObtainStyledAttributes.getDimension(index, this.f6952);
                    break;
                case 7:
                    this.f6947 = typedArrayObtainStyledAttributes.getDimension(index, this.f6947);
                    break;
                case 8:
                    this.f6943 = typedArrayObtainStyledAttributes.getDimension(index, this.f6943);
                    break;
                case 9:
                    this.f6950 = typedArrayObtainStyledAttributes.getDimension(index, this.f6950);
                    break;
                case 10:
                    this.f6948 = typedArrayObtainStyledAttributes.getDimension(index, this.f6948);
                    break;
                case 11:
                    this.f6949 = true;
                    this.f6942 = typedArrayObtainStyledAttributes.getDimension(index, this.f6942);
                    break;
                case 12:
                    this.f6941 = C0595.m1470(typedArrayObtainStyledAttributes, index, this.f6941);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
