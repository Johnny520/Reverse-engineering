package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C3133(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f10262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f10264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f10265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f10266;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10268;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM7145 = AbstractC3120.m7145(calendar);
        this.f10268 = calendarM7145;
        this.f10266 = calendarM7145.get(2);
        this.f10267 = calendarM7145.get(1);
        this.f10263 = calendarM7145.getMaximum(7);
        this.f10262 = calendarM7145.getActualMaximum(5);
        this.f10264 = calendarM7145.getTimeInMillis();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Month m7127(long j) {
        Calendar calendarM7148 = AbstractC3120.m7148(null);
        calendarM7148.setTimeInMillis(j);
        return new Month(calendarM7148);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Month m7128(int i, int i2) {
        Calendar calendarM7148 = AbstractC3120.m7148(null);
        calendarM7148.set(1, i);
        calendarM7148.set(2, i2);
        return new Month(calendarM7148);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f10268.compareTo(month.f10268);
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
        return this.f10266 == month.f10266 && this.f10267 == month.f10267;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10266), Integer.valueOf(this.f10267)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10267);
        parcel.writeInt(this.f10266);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7129(Month month) {
        if (this.f10268 instanceof GregorianCalendar) {
            return (month.f10266 - this.f10266) + ((month.f10267 - this.f10267) * 12);
        }
        C5919.m11249("Only Gregorian calendars are supported.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7130() {
        if (this.f10265 == null) {
            this.f10265 = AbstractC3120.m7146("yMMMM", Locale.getDefault()).format(new Date(this.f10268.getTimeInMillis()));
        }
        return this.f10265;
    }
}
