package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.util.C2187;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import p251.AbstractC8174;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<C2187> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C3133(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Long f10269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Long f10270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Long f10271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Long f10272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public String f10273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7131(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C3134 c3134) {
        Long l = rangeDateSelector.f10270;
        if (l == null || rangeDateSelector.f10269 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f10273.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            c3134.m7153();
        } else if (l.longValue() <= rangeDateSelector.f10269.longValue()) {
            Long l2 = rangeDateSelector.f10270;
            rangeDateSelector.f10271 = l2;
            Long l3 = rangeDateSelector.f10269;
            rangeDateSelector.f10272 = l3;
            c3134.m7152(new C2187(l2, l3));
        } else {
            textInputLayout.setError(rangeDateSelector.f10273);
            textInputLayout2.setError(" ");
            c3134.m7153();
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
        parcel.writeValue(this.f10271);
        parcel.writeValue(this.f10272);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo7106(long j) {
        Long l = this.f10271;
        if (l == null) {
            this.f10271 = Long.valueOf(j);
        } else if (this.f10272 == null && l.longValue() <= j) {
            this.f10272 = Long.valueOf(j);
        } else {
            this.f10272 = null;
            this.f10271 = Long.valueOf(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo7107(android.view.LayoutInflater r13, android.view.ViewGroup r14, com.google.android.material.datepicker.CalendarConstraints r15, com.google.android.material.datepicker.C3134 r16) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.mo7107(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final boolean mo7108() {
        Long l = this.f10271;
        return (l == null || this.f10272 == null || l.longValue() > this.f10272.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo7109(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AbstractC8174.m13595(context, C3135.class.getCanonicalName(), Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final String mo7110(Context context) {
        Resources resources = context.getResources();
        C2187 c2187M6682 = AbstractC3056.m6682(this.f10271, this.f10272);
        Object obj = c2187M6682.f6459;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = c2187M6682.f6458;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final Object mo7111() {
        return new C2187(this.f10271, this.f10272);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final ArrayList mo7112() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f10271;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f10272;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final String mo7113(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10271;
        if (l == null && this.f10272 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f10272;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, AbstractC3056.m6686(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, AbstractC3056.m6686(l2.longValue()));
        }
        C2187 c2187M6682 = AbstractC3056.m6682(l, l2);
        return resources.getString(R.string.mtrl_picker_range_header_selected, c2187M6682.f6459, c2187M6682.f6458);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final ArrayList mo7114() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2187(this.f10271, this.f10272));
        return arrayList;
    }
}
