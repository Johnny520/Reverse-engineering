package com.google.android.material.datepicker;

import Yue.InterfaceC6391;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.C1980R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
final class CalendarStyle {

    @InterfaceC6391
    final CalendarItemStyle day;

    @InterfaceC6391
    final CalendarItemStyle invalidDay;

    @InterfaceC6391
    final Paint rangeFill;

    @InterfaceC6391
    final CalendarItemStyle selectedDay;

    @InterfaceC6391
    final CalendarItemStyle selectedYear;

    @InterfaceC6391
    final CalendarItemStyle todayDay;

    @InterfaceC6391
    final CalendarItemStyle todayYear;

    @InterfaceC6391
    final CalendarItemStyle year;

    public CalendarStyle(@InterfaceC6391 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C1980R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C1980R.styleable.MaterialCalendar);
        this.day = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_dayStyle, 0));
        this.invalidDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.selectedDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.todayDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialCalendar_rangeFillColor);
        this.year = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_yearStyle, 0));
        this.selectedYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.todayYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
