package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.C0756p1;

/* JADX INFO: renamed from: a.of */
/* JADX INFO: loaded from: classes.dex */
public final class C0751of {

    /* JADX INFO: renamed from: a */
    public final Context f2959a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f2960b;

    /* JADX INFO: renamed from: c */
    public TypedValue f2961c;

    public C0751of(Context context, TypedArray typedArray) {
        this.f2959a = context;
        this.f2960b = typedArray;
    }

    /* JADX INFO: renamed from: e */
    public static C0751of m1768e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0751of(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: a */
    public final ColorStateList m1769a(int i) {
        int resourceId;
        ColorStateList colorStateListM1091a;
        TypedArray typedArray = this.f2960b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1091a = C0437Y3.m1091a(this.f2959a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1091a;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m1770b(int i) {
        int resourceId;
        TypedArray typedArray = this.f2960b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : C0889w1.m2115A(this.f2959a, resourceId);
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m1771c(int i) {
        int resourceId;
        Drawable drawableM1810d;
        if (!this.f2960b.hasValue(i) || (resourceId = this.f2960b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0434Y0 c0434y0M1080a = C0434Y0.m1080a();
        Context context = this.f2959a;
        synchronized (c0434y0M1080a) {
            drawableM1810d = c0434y0M1080a.f1632a.m1810d(context, resourceId, true);
        }
        return drawableM1810d;
    }

    /* JADX INFO: renamed from: d */
    public final Typeface m1772d(int i, int i2, C0756p1.a aVar) {
        int resourceId = this.f2960b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2961c == null) {
            this.f2961c = new TypedValue();
        }
        TypedValue typedValue = this.f2961c;
        ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
        Context context = this.f2959a;
        if (context.isRestricted()) {
            return null;
        }
        return C0787qd.m1838b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m1773f() {
        this.f2960b.recycle();
    }
}
