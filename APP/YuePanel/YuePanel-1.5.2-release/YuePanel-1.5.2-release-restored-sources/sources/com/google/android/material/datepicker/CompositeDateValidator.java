package com.google.android.material.datepicker;

import Yue.C6740;
import Yue.InterfaceC6391;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;

    @InterfaceC6391
    private final Operator operator;

    @InterfaceC6391
    private final List<CalendarConstraints.DateValidator> validators;
    private static final Operator ANY_OPERATOR = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@InterfaceC6391 List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }
    };
    private static final Operator ALL_OPERATOR = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@InterfaceC6391 List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public CompositeDateValidator createFromParcel(@InterfaceC6391 Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            Operator operator = (i != 2 && i == 1) ? CompositeDateValidator.ANY_OPERATOR : CompositeDateValidator.ALL_OPERATOR;
            return new CompositeDateValidator((List) C6740.m21415(arrayList), operator);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    };

    public interface Operator {
        int getId();

        boolean isValid(@InterfaceC6391 List<CalendarConstraints.DateValidator> list, long j);
    }

    @InterfaceC6391
    public static CalendarConstraints.DateValidator allOf(@InterfaceC6391 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    @InterfaceC6391
    public static CalendarConstraints.DateValidator anyOf(@InterfaceC6391 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return this.operator.isValid(this.validators, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private CompositeDateValidator(@InterfaceC6391 List<CalendarConstraints.DateValidator> list, Operator operator) {
        this.validators = list;
        this.operator = operator;
    }
}
