package a;

/* JADX INFO: loaded from: classes.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C2 f54a;
    public final a.C2 b;
    public final a.C2 c;
    public final a.C2 d;
    public final a.C2 e;
    public final a.C2 f;
    public final a.C2 g;
    public final android.graphics.Paint h;

    public D2(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            int r0 = com.google.android.material.R.attr.materialCalendarStyle
            java.lang.Class<com.google.android.material.datepicker.c> r1 = com.google.android.material.datepicker.c.class
            java.lang.String r1 = r1.getCanonicalName()
            android.util.TypedValue r0 = a.C0498za.c(r5, r0, r1)
            int r0 = r0.data
            int[] r1 = com.google.android.material.R.styleable.MaterialCalendar
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayStyle
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            a.C2 r1 = a.C2.a(r5, r1)
            r4.f54a = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayInvalidStyle
            int r1 = r0.getResourceId(r1, r2)
            a.C2 r1 = a.C2.a(r5, r1)
            r4.g = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_daySelectedStyle
            int r1 = r0.getResourceId(r1, r2)
            a.C2 r1 = a.C2.a(r5, r1)
            r4.b = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayTodayStyle
            int r1 = r0.getResourceId(r1, r2)
            a.C2 r1 = a.C2.a(r5, r1)
            r4.c = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_rangeFillColor
            android.content.res.ColorStateList r1 = a.Sa.b(r5, r0, r1)
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearStyle
            int r3 = r0.getResourceId(r3, r2)
            a.C2 r3 = a.C2.a(r5, r3)
            r4.d = r3
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearSelectedStyle
            int r3 = r0.getResourceId(r3, r2)
            a.C2 r3 = a.C2.a(r5, r3)
            r4.e = r3
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearTodayStyle
            int r2 = r0.getResourceId(r3, r2)
            a.C2 r5 = a.C2.a(r5, r2)
            r4.f = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.h = r5
            int r1 = r1.getDefaultColor()
            r5.setColor(r1)
            r0.recycle()
            return
    }
}
