package com.google.android.material.datepicker;

import Yue.InterfaceC6391;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public DateValidatorPointForward createFromParcel(@InterfaceC6391 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    };
    private final long point;

    @InterfaceC6391
    public static DateValidatorPointForward from(long j) {
        return new DateValidatorPointForward(j);
    }

    @InterfaceC6391
    public static DateValidatorPointForward now() {
        return from(UtcDates.getTodayCalendar().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.point == ((DateValidatorPointForward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return j >= this.point;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private DateValidatorPointForward(long j) {
        this.point = j;
    }
}
