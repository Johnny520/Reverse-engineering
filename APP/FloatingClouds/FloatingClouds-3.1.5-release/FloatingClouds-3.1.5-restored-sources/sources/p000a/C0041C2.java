package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.C1247R;
import java.util.WeakHashMap;
import p000a.C0354Ta;

/* JADX INFO: renamed from: a.C2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0041C2 {

    /* JADX INFO: renamed from: a */
    public final Rect f158a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f159b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f160c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f161d;

    /* JADX INFO: renamed from: e */
    public final int f162e;

    /* JADX INFO: renamed from: f */
    public final C0393Vd f163f;

    public C0041C2(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C0393Vd c0393Vd, Rect rect) {
        C0726n9.m1664g(rect.left);
        C0726n9.m1664g(rect.top);
        C0726n9.m1664g(rect.right);
        C0726n9.m1664g(rect.bottom);
        this.f158a = rect;
        this.f159b = colorStateList2;
        this.f160c = colorStateList;
        this.f161d = colorStateList3;
        this.f162e = i;
        this.f163f = c0393Vd;
    }

    /* JADX INFO: renamed from: a */
    public static C0041C2 m123a(Context context, int i) {
        C0726n9.m1663f("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1247R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListM925b = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListM925b2 = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListM925b3 = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        C0393Vd c0393VdM1028a = C0393Vd.m1022a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C0811s(0)).m1028a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0041C2(colorStateListM925b, colorStateListM925b2, colorStateListM925b3, dimensionPixelSize, c0393VdM1028a, rect);
    }

    /* JADX INFO: renamed from: b */
    public final void m124b(TextView textView) {
        C0354Ta c0354Ta = new C0354Ta();
        C0354Ta c0354Ta2 = new C0354Ta();
        C0393Vd c0393Vd = this.f163f;
        c0354Ta.setShapeAppearanceModel(c0393Vd);
        c0354Ta2.setShapeAppearanceModel(c0393Vd);
        c0354Ta.m967k(this.f160c);
        c0354Ta.f1310a.f1343j = this.f162e;
        c0354Ta.invalidateSelf();
        C0354Ta.b bVar = c0354Ta.f1310a;
        ColorStateList colorStateList = bVar.f1337d;
        ColorStateList colorStateList2 = this.f161d;
        if (colorStateList != colorStateList2) {
            bVar.f1337d = colorStateList2;
            c0354Ta.onStateChange(c0354Ta.getState());
        }
        ColorStateList colorStateList3 = this.f159b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), c0354Ta, c0354Ta2);
        Rect rect = this.f158a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        textView.setBackground(insetDrawable);
    }
}
