package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: a.Sa */
/* JADX INFO: loaded from: classes.dex */
public final class C0336Sa {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m924a(Context context, C0751of c0751of, int i) {
        int resourceId;
        ColorStateList colorStateListM1091a;
        TypedArray typedArray = c0751of.f2960b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1091a = C0437Y3.m1091a(context, resourceId)) == null) ? c0751of.m1769a(i) : colorStateListM1091a;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m925b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM1091a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1091a = C0437Y3.m1091a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1091a;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m926c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM2115A;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM2115A = C0889w1.m2115A(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM2115A;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m927d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
