package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C3130();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10234;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month f10235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f10236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f10237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Month f10238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DateValidator f10239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Month f10240;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        boolean mo7091(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f10240 = month;
        this.f10238 = month2;
        this.f10235 = month3;
        this.f10234 = i;
        this.f10239 = dateValidator;
        if (month3 != null && month.f10273.compareTo(month3.f10273) > 0) {
            C5925.m11310("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f10273.compareTo(month2.f10273) > 0) {
            C5925.m11310("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > AbstractC3121.m7135(null).getMaximum(7)) {
            C5925.m11310("firstDayOfWeek is not valid");
            throw null;
        }
        this.f10237 = month.m7116(month2) + 1;
        this.f10236 = (month2.f10272 - month.f10272) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f10240.equals(calendarConstraints.f10240) && this.f10238.equals(calendarConstraints.f10238) && Objects.equals(this.f10235, calendarConstraints.f10235) && this.f10234 == calendarConstraints.f10234 && this.f10239.equals(calendarConstraints.f10239);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10240, this.f10238, this.f10235, Integer.valueOf(this.f10234), this.f10239});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10240, 0);
        parcel.writeParcelable(this.f10238, 0);
        parcel.writeParcelable(this.f10235, 0);
        parcel.writeParcelable(this.f10239, 0);
        parcel.writeInt(this.f10234);
    }
}
