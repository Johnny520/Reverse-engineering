package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Locale;
import p251.AbstractC8174;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C3133(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Long f10274;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f10274);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo7106(long j) {
        this.f10274 = Long.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo7107(android.view.LayoutInflater r11, android.view.ViewGroup r12, com.google.android.material.datepicker.CalendarConstraints r13, com.google.android.material.datepicker.C3134 r14) {
        /*
            r10 = this;
            r0 = 604766422(0x240c00d6, float:3.035837E-17)
            r1 = 0
            android.view.View r11 = r11.inflate(r0, r12, r1)
            r12 = 604570155(0x2409022b, float:2.9708976E-17)
            android.view.View r12 = r11.findViewById(r12)
            r6 = r12
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            android.widget.EditText r12 = r6.getEditText()
            android.content.Context r0 = r11.getContext()
            r2 = 604242225(0x24040131, float:2.8623947E-17)
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.types.AbstractC4921.m9893(r0, r2)
            if (r0 == 0) goto L2a
            int r0 = r0.intValue()
            r12.setHintTextColor(r0)
        L2a:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r2 = ""
            if (r0 == 0) goto L37
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r3 = r0.toLowerCase(r3)
            goto L38
        L37:
            r3 = r2
        L38:
            java.lang.String r4 = "lge"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L50
            if (r0 == 0) goto L48
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
        L48:
            java.lang.String r0 = "samsung"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L55
        L50:
            r0 = 17
            r12.setInputType(r0)
        L55:
            java.text.SimpleDateFormat r5 = com.google.android.material.datepicker.AbstractC3120.m7144()
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r4 = com.google.android.material.datepicker.AbstractC3120.m7143(r0, r5)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r4)
            android.text.style.TtsSpan$Builder r2 = new android.text.style.TtsSpan$Builder
            java.lang.String r3 = "android.type.verbatim"
            r2.<init>(r3)
            android.text.style.TtsSpan r2 = r2.build()
            int r3 = r0.length()
            r7 = 33
            r0.setSpan(r2, r1, r3, r7)
            r6.setPlaceholderText(r0)
            java.lang.Long r0 = r10.f10274
            if (r0 == 0) goto L95
            java.lang.String r0 = r5.format(r0)
            r12.setText(r0)
            android.text.Editable r0 = r12.getText()
            if (r0 == 0) goto L95
            int r0 = r0.length()
            r12.setSelection(r0)
        L95:
            com.google.android.material.datepicker.飘花落叶言子世苏楪兰哲 r2 = new com.google.android.material.datepicker.飘花落叶言子世苏楪兰哲
            r9 = r6
            r3 = r10
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.addTextChangedListener(r2)
            android.content.Context r10 = r11.getContext()
            java.lang.String r13 = "accessibility"
            java.lang.Object r10 = r10.getSystemService(r13)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            if (r10 == 0) goto Lb6
            boolean r10 = r10.isTouchExplorationEnabled()
            if (r10 == 0) goto Lb6
            return r11
        Lb6:
            android.widget.EditText[] r10 = new android.widget.EditText[]{r12}
            com.google.android.material.datepicker.DateSelector.m7105(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.mo7107(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final boolean mo7108() {
        return this.f10274 != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo7109(Context context) {
        return AbstractC8174.m13595(context, C3135.class.getCanonicalName(), R.attr.materialCalendarTheme).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final String mo7110(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10274;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : AbstractC3056.m6666(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final Object mo7111() {
        return this.f10274;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final ArrayList mo7112() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f10274;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final String mo7113(Context context) {
        Resources resources = context.getResources();
        Long l = this.f10274;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC3056.m6666(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final ArrayList mo7114() {
        return new ArrayList();
    }
}
