package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3127 implements InterfaceC3125 {
    @Override // com.google.android.material.datepicker.InterfaceC3125
    public final int getId() {
        return 2;
    }

    @Override // com.google.android.material.datepicker.InterfaceC3125
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7138(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.mo7091(j)) {
                return false;
            }
        }
        return true;
    }
}
