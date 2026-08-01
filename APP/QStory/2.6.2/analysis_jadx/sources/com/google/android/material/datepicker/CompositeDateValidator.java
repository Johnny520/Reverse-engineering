package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f10238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3124 f10239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3127 f10237 = new C3127();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C3126 f10236 = new C3126();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C3125();

    public CompositeDateValidator(ArrayList arrayList, InterfaceC3124 interfaceC3124) {
        this.f10238 = arrayList;
        this.f10239 = interfaceC3124;
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
        return this.f10238.equals(compositeDateValidator.f10238) && this.f10239.getId() == compositeDateValidator.f10239.getId();
    }

    public final int hashCode() {
        return this.f10238.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f10238);
        parcel.writeInt(this.f10239.getId());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo7104(long j) {
        return this.f10239.mo7151(this.f10238, j);
    }
}
