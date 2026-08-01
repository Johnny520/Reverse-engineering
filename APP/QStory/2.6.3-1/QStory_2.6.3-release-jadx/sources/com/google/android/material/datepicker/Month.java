package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C3966(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f10614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f10615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f10616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10618;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM7691 = AbstractC3953.m7691(calendar);
        this.f10618 = calendarM7691;
        this.f10616 = calendarM7691.get(2);
        this.f10617 = calendarM7691.get(1);
        this.f10613 = calendarM7691.getMaximum(7);
        this.f10612 = calendarM7691.getActualMaximum(5);
        this.f10614 = calendarM7691.getTimeInMillis();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Month m7673(long j) {
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        calendarM7694.setTimeInMillis(j);
        return new Month(calendarM7694);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Month m7674(int i, int i2) {
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        calendarM7694.set(1, i);
        calendarM7694.set(2, i2);
        return new Month(calendarM7694);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f10618.compareTo(month.f10618);
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
        return this.f10616 == month.f10616 && this.f10617 == month.f10617;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10616), Integer.valueOf(this.f10617)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10617);
        parcel.writeInt(this.f10616);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7675(Month month) {
        if (this.f10618 instanceof GregorianCalendar) {
            return (month.f10616 - this.f10616) + ((month.f10617 - this.f10617) * 12);
        }
        C6755.m11869("Only Gregorian calendars are supported.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7676() {
        if (this.f10615 == null) {
            this.f10615 = AbstractC3953.m7692("yMMMM", Locale.getDefault()).format(new Date(this.f10618.getTimeInMillis()));
        }
        return this.f10615;
    }
}
