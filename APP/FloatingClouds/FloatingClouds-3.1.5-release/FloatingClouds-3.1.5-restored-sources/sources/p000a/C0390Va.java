package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.Va */
/* JADX INFO: loaded from: classes.dex */
public final class C0390Va extends C0794r1 {
    /* JADX INFO: renamed from: h */
    public static int m1021h(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p000a.C0794r1, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C0955za.m2245b(context, C1247R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C1247R.styleable.MaterialTextAppearance);
            int iM1021h = m1021h(getContext(), typedArrayObtainStyledAttributes, C1247R.styleable.MaterialTextAppearance_android_lineHeight, C1247R.styleable.MaterialTextAppearance_lineHeight);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1021h >= 0) {
                setLineHeight(iM1021h);
            }
        }
    }
}
