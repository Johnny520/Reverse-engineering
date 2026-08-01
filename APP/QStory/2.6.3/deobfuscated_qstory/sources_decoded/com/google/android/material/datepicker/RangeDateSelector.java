package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.util.C2187;
import androidx.window.area.AbstractC2567;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import p053.AbstractC6561;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<C2187> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C3134(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Long f10274;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Long f10275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Long f10276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Long f10277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public String f10278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7118(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C3135 c3135) {
        Long l = rangeDateSelector.f10275;
        if (l == null || rangeDateSelector.f10274 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f10278.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            c3135.m7140();
        } else if (l.longValue() <= rangeDateSelector.f10274.longValue()) {
            Long l2 = rangeDateSelector.f10275;
            rangeDateSelector.f10276 = l2;
            Long l3 = rangeDateSelector.f10274;
            rangeDateSelector.f10277 = l3;
            c3135.m7139(new C2187(l2, l3));
        } else {
            textInputLayout.setError(rangeDateSelector.f10278);
            textInputLayout2.setError(" ");
            c3135.m7140();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f10276);
        parcel.writeValue(this.f10277);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo7093(long j) {
        Long l = this.f10276;
        if (l == null) {
            this.f10276 = Long.valueOf(j);
        } else if (this.f10277 == null && l.longValue() <= j) {
            this.f10277 = Long.valueOf(j);
        } else {
            this.f10277 = null;
            this.f10276 = Long.valueOf(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo7094(android.view.LayoutInflater r13, android.view.ViewGroup r14, com.google.android.material.datepicker.CalendarConstraints r15, com.google.android.material.datepicker.C3135 r16) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.mo7094(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final boolean mo7095() {
        Long l = this.f10276;
        return (l == null || this.f10277 == null || l.longValue() > this.f10277.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo7096(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AbstractC6561.m12067(context, C3136.class.getCanonicalName(), Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final Object mo7097() {
        return new C2187(this.f10276, this.f10277);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final ArrayList mo7098() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f10276;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f10277;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final String mo7099(Context context) {
        Resources resources = context.getResources();
        C2187 c2187M5085 = AbstractC2567.m5085(this.f10276, this.f10277);
        Object obj = c2187M5085.f6460;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = c2187M5085.f6459;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final String mo7100(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10276;
        if (l == null && this.f10277 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f10277;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, AbstractC2567.m5086(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, AbstractC2567.m5086(l2.longValue()));
        }
        C2187 c2187M5085 = AbstractC2567.m5085(l, l2);
        return resources.getString(R.string.mtrl_picker_range_header_selected, c2187M5085.f6460, c2187M5085.f6459);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final ArrayList mo7101() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2187(this.f10276, this.f10277));
        return arrayList;
    }
}
