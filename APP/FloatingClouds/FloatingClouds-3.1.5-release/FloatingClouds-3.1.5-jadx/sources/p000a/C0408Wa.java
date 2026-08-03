package p000a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.Wa */
/* JADX INFO: loaded from: classes.dex */
public final class C0408Wa {

    /* JADX INFO: renamed from: a */
    public static final int[] f1555a = {R.attr.theme, C1247R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f1556b = {C1247R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m1054a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1556b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0455Z3) && ((C0455Z3) context).f1715a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0455Z3 c0455z3 = new C0455Z3(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1555a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0455z3.getTheme().applyStyle(resourceId2, true);
        }
        return c0455z3;
    }
}
