package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C3962();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month f10580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f10581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f10582;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Month f10583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DateValidator f10584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Month f10585;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        boolean mo7650(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f10585 = month;
        this.f10583 = month2;
        this.f10580 = month3;
        this.f10579 = i;
        this.f10584 = dateValidator;
        if (month3 != null && month.f10618.compareTo(month3.f10618) > 0) {
            C6755.m11869("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f10618.compareTo(month2.f10618) > 0) {
            C6755.m11869("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > AbstractC3953.m7694(null).getMaximum(7)) {
            C6755.m11869("firstDayOfWeek is not valid");
            throw null;
        }
        this.f10582 = month.m7675(month2) + 1;
        this.f10581 = (month2.f10617 - month.f10617) + 1;
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
        return this.f10585.equals(calendarConstraints.f10585) && this.f10583.equals(calendarConstraints.f10583) && Objects.equals(this.f10580, calendarConstraints.f10580) && this.f10579 == calendarConstraints.f10579 && this.f10584.equals(calendarConstraints.f10584);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10585, this.f10583, this.f10580, Integer.valueOf(this.f10579), this.f10584});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10585, 0);
        parcel.writeParcelable(this.f10583, 0);
        parcel.writeParcelable(this.f10580, 0);
        parcel.writeParcelable(this.f10584, 0);
        parcel.writeInt(this.f10579);
    }
}
