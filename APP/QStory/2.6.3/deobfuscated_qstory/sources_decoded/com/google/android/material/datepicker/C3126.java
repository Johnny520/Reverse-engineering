package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3126 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
        int i = parcel.readInt();
        InterfaceC3125 interfaceC3125 = CompositeDateValidator.f10241;
        if (i != 2 && i == 1) {
            interfaceC3125 = CompositeDateValidator.f10242;
        }
        arrayList.getClass();
        return new CompositeDateValidator(arrayList, interfaceC3125);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CompositeDateValidator[i];
    }
}
