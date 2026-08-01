package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.util.C3020;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<C3020> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C3966(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Long f10619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Long f10620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Long f10621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Long f10622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public String f10623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7677(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C3967 c3967) {
        Long l = rangeDateSelector.f10620;
        if (l == null || rangeDateSelector.f10619 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f10623.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            c3967.m7699();
        } else if (l.longValue() <= rangeDateSelector.f10619.longValue()) {
            Long l2 = rangeDateSelector.f10620;
            rangeDateSelector.f10621 = l2;
            Long l3 = rangeDateSelector.f10619;
            rangeDateSelector.f10622 = l3;
            c3967.m7698(new C3020(l2, l3));
        } else {
            textInputLayout.setError(rangeDateSelector.f10623);
            textInputLayout2.setError(" ");
            c3967.m7699();
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
        parcel.writeValue(this.f10621);
        parcel.writeValue(this.f10622);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo7652(long j) {
        Long l = this.f10621;
        if (l == null) {
            this.f10621 = Long.valueOf(j);
        } else if (this.f10622 == null && l.longValue() <= j) {
            this.f10622 = Long.valueOf(j);
        } else {
            this.f10622 = null;
            this.f10621 = Long.valueOf(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo7653(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C3967 c3967) {
        View viewInflate = layoutInflater.inflate(C0328R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C0328R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(C0328R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numM10605 = AbstractC5894.m10605(viewInflate.getContext(), C0328R.attr.colorOnSurfaceVariant);
        if (numM10605 != null) {
            editText.setHintTextColor(numM10605.intValue());
            editText2.setHintTextColor(numM10605.intValue());
        }
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
            editText.setInputType(17);
            editText2.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung")) {
            }
        }
        this.f10623 = viewInflate.getResources().getString(C0328R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatM7690 = AbstractC3953.m7690();
        Long l = this.f10621;
        if (l != null) {
            editText.setText(simpleDateFormatM7690.format(l));
            this.f10620 = this.f10621;
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        Long l2 = this.f10622;
        if (l2 != null) {
            editText2.setText(simpleDateFormatM7690.format(l2));
            this.f10619 = this.f10622;
        }
        String strM7689 = AbstractC3953.m7689(viewInflate.getResources(), simpleDateFormatM7690);
        SpannableString spannableString = new SpannableString(strM7689);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        textInputLayout2.setPlaceholderText(spannableString);
        editText.addTextChangedListener(new C3956(this, strM7689, simpleDateFormatM7690, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, c3967, 0));
        editText2.addTextChangedListener(new C3956(this, strM7689, simpleDateFormatM7690, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, c3967, 1));
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        DateSelector.m7651(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final boolean mo7654() {
        Long l = this.f10621;
        return (l == null || this.f10622 == null || l.longValue() > this.f10622.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo7655(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AbstractC7390.m12626(context, C3968.class.getCanonicalName(), Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C0328R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C0328R.attr.materialCalendarTheme : C0328R.attr.materialCalendarFullscreenTheme).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final Object mo7656() {
        return new C3020(this.f10621, this.f10622);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final ArrayList mo7657() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f10621;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f10622;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final String mo7658(Context context) {
        Resources resources = context.getResources();
        C3020 c3020M5645 = AbstractC3400.m5645(this.f10621, this.f10622);
        Object obj = c3020M5645.f6805;
        String string = obj == null ? resources.getString(C0328R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = c3020M5645.f6804;
        return resources.getString(C0328R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(C0328R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final String mo7659(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10621;
        if (l == null && this.f10622 == null) {
            return resources.getString(C0328R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f10622;
        if (l2 == null) {
            return resources.getString(C0328R.string.mtrl_picker_range_header_only_start_selected, AbstractC3400.m5646(l.longValue()));
        }
        if (l == null) {
            return resources.getString(C0328R.string.mtrl_picker_range_header_only_end_selected, AbstractC3400.m5646(l2.longValue()));
        }
        C3020 c3020M5645 = AbstractC3400.m5645(l, l2);
        return resources.getString(C0328R.string.mtrl_picker_range_header_selected, c3020M5645.f6805, c3020M5645.f6804);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final ArrayList mo7660() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3020(this.f10621, this.f10622));
        return arrayList;
    }
}
