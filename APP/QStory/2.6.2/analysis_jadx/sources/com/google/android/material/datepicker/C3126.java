package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3126 implements InterfaceC3124 {
    @Override // com.google.android.material.datepicker.InterfaceC3124
    public final int getId() {
        return 2;
    }

    @Override // com.google.android.material.datepicker.InterfaceC3124
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7151(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.mo7104(j)) {
                return false;
            }
        }
        return true;
    }
}
