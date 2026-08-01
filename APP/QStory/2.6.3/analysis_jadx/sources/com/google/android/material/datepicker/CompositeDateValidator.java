package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f10243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3125 f10244;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3128 f10242 = new C3128();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C3127 f10241 = new C3127();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C3126();

    public CompositeDateValidator(ArrayList arrayList, InterfaceC3125 interfaceC3125) {
        this.f10243 = arrayList;
        this.f10244 = interfaceC3125;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f10243.equals(compositeDateValidator.f10243) && this.f10244.getId() == compositeDateValidator.f10244.getId();
    }

    public final int hashCode() {
        return this.f10243.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f10243);
        parcel.writeInt(this.f10244.getId());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo7091(long j) {
        return this.f10244.mo7138(this.f10243, j);
    }
}
