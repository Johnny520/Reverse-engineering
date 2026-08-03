package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.C1247R;
import com.google.android.material.datepicker.C1284c;

/* JADX INFO: renamed from: a.D2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059D2 {

    /* JADX INFO: renamed from: a */
    public final C0041C2 f202a;

    /* JADX INFO: renamed from: b */
    public final C0041C2 f203b;

    /* JADX INFO: renamed from: c */
    public final C0041C2 f204c;

    /* JADX INFO: renamed from: d */
    public final C0041C2 f205d;

    /* JADX INFO: renamed from: e */
    public final C0041C2 f206e;

    /* JADX INFO: renamed from: f */
    public final C0041C2 f207f;

    /* JADX INFO: renamed from: g */
    public final C0041C2 f208g;

    /* JADX INFO: renamed from: h */
    public final Paint f209h;

    public C0059D2(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0955za.m2246c(context, C1247R.attr.materialCalendarStyle, C1284c.class.getCanonicalName()).data, C1247R.styleable.MaterialCalendar);
        this.f202a = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_dayStyle, 0));
        this.f208g = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f203b = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f204c = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListM925b = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.MaterialCalendar_rangeFillColor);
        this.f205d = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_yearStyle, 0));
        this.f206e = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f207f = C0041C2.m123a(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f209h = paint;
        paint.setColor(colorStateListM925b.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
