package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C3966(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Long f10624;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f10624);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo7652(long j) {
        this.f10624 = Long.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo7653(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C3967 c3967) {
        View viewInflate = layoutInflater.inflate(C0328R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C0328R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer numM10605 = AbstractC5894.m10605(viewInflate.getContext(), C0328R.attr.colorOnSurfaceVariant);
        if (numM10605 != null) {
            editText.setHintTextColor(numM10605.intValue());
        }
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
            editText.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung")) {
            }
        }
        SimpleDateFormat simpleDateFormatM7690 = AbstractC3953.m7690();
        String strM7689 = AbstractC3953.m7689(viewInflate.getResources(), simpleDateFormatM7690);
        SpannableString spannableString = new SpannableString(strM7689);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l = this.f10624;
        if (l != null) {
            editText.setText(simpleDateFormatM7690.format(l));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(new C3955(this, strM7689, simpleDateFormatM7690, textInputLayout, calendarConstraints, c3967, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        DateSelector.m7651(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final boolean mo7654() {
        return this.f10624 != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo7655(Context context) {
        return AbstractC7390.m12626(context, C3968.class.getCanonicalName(), C0328R.attr.materialCalendarTheme).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final Object mo7656() {
        return this.f10624;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final ArrayList mo7657() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f10624;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final String mo7658(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10624;
        return resources.getString(C0328R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(C0328R.string.mtrl_picker_announce_current_selection_none) : AbstractC3400.m5625(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final String mo7659(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10624;
        return l == null ? resources.getString(C0328R.string.mtrl_picker_date_header_unselected) : resources.getString(C0328R.string.mtrl_picker_date_header_selected, AbstractC3400.m5625(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final ArrayList mo7660() {
        return new ArrayList();
    }
}
