package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C3129();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month f10230;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f10231;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f10232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Month f10233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DateValidator f10234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Month f10235;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        boolean mo7104(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f10235 = month;
        this.f10233 = month2;
        this.f10230 = month3;
        this.f10229 = i;
        this.f10234 = dateValidator;
        if (month3 != null && month.f10268.compareTo(month3.f10268) > 0) {
            C5919.m11249("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f10268.compareTo(month2.f10268) > 0) {
            C5919.m11249("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > AbstractC3120.m7148(null).getMaximum(7)) {
            C5919.m11249("firstDayOfWeek is not valid");
            throw null;
        }
        this.f10232 = month.m7129(month2) + 1;
        this.f10231 = (month2.f10267 - month.f10267) + 1;
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
        return this.f10235.equals(calendarConstraints.f10235) && this.f10233.equals(calendarConstraints.f10233) && Objects.equals(this.f10230, calendarConstraints.f10230) && this.f10229 == calendarConstraints.f10229 && this.f10234.equals(calendarConstraints.f10234);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10235, this.f10233, this.f10230, Integer.valueOf(this.f10229), this.f10234});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10235, 0);
        parcel.writeParcelable(this.f10233, 0);
        parcel.writeParcelable(this.f10230, 0);
        parcel.writeParcelable(this.f10234, 0);
        parcel.writeInt(this.f10229);
    }
}
