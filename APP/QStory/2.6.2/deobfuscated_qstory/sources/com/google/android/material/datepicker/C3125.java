package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3125 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
        int i = parcel.readInt();
        InterfaceC3124 interfaceC3124 = CompositeDateValidator.f10236;
        if (i != 2 && i == 1) {
            interfaceC3124 = CompositeDateValidator.f10237;
        }
        arrayList.getClass();
        return new CompositeDateValidator(arrayList, interfaceC3124);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CompositeDateValidator[i];
    }
}
