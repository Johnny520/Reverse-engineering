package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C3134(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f10269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f10270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f10271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10273;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM7132 = AbstractC3121.m7132(calendar);
        this.f10273 = calendarM7132;
        this.f10271 = calendarM7132.get(2);
        this.f10272 = calendarM7132.get(1);
        this.f10268 = calendarM7132.getMaximum(7);
        this.f10267 = calendarM7132.getActualMaximum(5);
        this.f10269 = calendarM7132.getTimeInMillis();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Month m7114(long j) {
        Calendar calendarM7135 = AbstractC3121.m7135(null);
        calendarM7135.setTimeInMillis(j);
        return new Month(calendarM7135);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Month m7115(int i, int i2) {
        Calendar calendarM7135 = AbstractC3121.m7135(null);
        calendarM7135.set(1, i);
        calendarM7135.set(2, i2);
        return new Month(calendarM7135);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f10273.compareTo(month.f10273);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f10271 == month.f10271 && this.f10272 == month.f10272;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10271), Integer.valueOf(this.f10272)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10272);
        parcel.writeInt(this.f10271);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7116(Month month) {
        if (this.f10273 instanceof GregorianCalendar) {
            return (month.f10271 - this.f10271) + ((month.f10272 - this.f10272) * 12);
        }
        C5925.m11310("Only Gregorian calendars are supported.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7117() {
        if (this.f10270 == null) {
            this.f10270 = AbstractC3121.m7133("yMMMM", Locale.getDefault()).format(new Date(this.f10273.getTimeInMillis()));
        }
        return this.f10270;
    }
}
