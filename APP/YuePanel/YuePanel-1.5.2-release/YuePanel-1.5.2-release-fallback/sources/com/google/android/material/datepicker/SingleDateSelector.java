package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class SingleDateSelector implements com.google.android.material.datepicker.DateSelector<java.lang.Long> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.SingleDateSelector> CREATOR = null;

    @Yue.InterfaceC4544
    private java.lang.CharSequence error;

    @Yue.InterfaceC4544
    private java.lang.Long selectedItem;

    @Yue.InterfaceC4544
    private java.text.SimpleDateFormat textInputFormat;



    static {
            com.google.android.material.datepicker.SingleDateSelector$2 r0 = new com.google.android.material.datepicker.SingleDateSelector$2
            r0.<init>()
            com.google.android.material.datepicker.SingleDateSelector.CREATOR = r0
            return
    }

    public SingleDateSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(com.google.android.material.datepicker.SingleDateSelector r0) {
            r0.clearSelection()
            return
    }

    public static /* synthetic */ java.lang.CharSequence access$102(com.google.android.material.datepicker.SingleDateSelector r0, java.lang.CharSequence r1) {
            r0.error = r1
            return r1
    }

    public static /* synthetic */ java.lang.Long access$202(com.google.android.material.datepicker.SingleDateSelector r0, java.lang.Long r1) {
            r0.selectedItem = r1
            return r1
    }

    private void clearSelection() {
            r1 = this;
            r0 = 0
            r1.selectedItem = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context r3) {
            r2 = this;
            int r0 = com.google.android.material.R.attr.materialCalendarTheme
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r3 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.mtrl_picker_date_header_title
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4544
    public java.lang.String getError() {
            r1 = this;
            java.lang.CharSequence r0 = r1.error
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.CharSequence r0 = r1.error
            java.lang.String r0 = r0.toString()
        L10:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4410
    public java.util.Collection<java.lang.Long> getSelectedDays() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r2.selectedItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4410
    public java.util.Collection<Yue.C4678<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4544
    public java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4544
    public /* bridge */ /* synthetic */ java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4410
    public java.lang.String getSelectionContentDescription(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Long r0 = r2.selectedItem
            if (r0 != 0) goto Lf
            int r0 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r0 = r3.getString(r0)
            goto L17
        Lf:
            long r0 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getYearMonthDay(r0)
        L17:
            int r1 = com.google.android.material.R.string.mtrl_picker_announce_current_selection
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r3.getString(r1, r0)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Yue.InterfaceC4410
    public java.lang.String getSelectionDisplayString(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Long r0 = r2.selectedItem
            if (r0 != 0) goto Lf
            int r0 = com.google.android.material.R.string.mtrl_picker_date_header_unselected
            java.lang.String r3 = r3.getString(r0)
            return r3
        Lf:
            long r0 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getYearMonthDay(r0)
            int r1 = com.google.android.material.R.string.mtrl_picker_date_header_selected
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r3.getString(r1, r0)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(@Yue.InterfaceC4410 android.view.LayoutInflater r10, @Yue.InterfaceC4544 android.view.ViewGroup r11, @Yue.InterfaceC4544 android.os.Bundle r12, com.google.android.material.datepicker.CalendarConstraints r13, @Yue.InterfaceC4410 com.google.android.material.datepicker.OnSelectionChangedListener<java.lang.Long> r14) {
            r9 = this;
            int r12 = com.google.android.material.R.layout.mtrl_picker_text_input_date
            r0 = 0
            android.view.View r10 = r10.inflate(r12, r11, r0)
            int r11 = com.google.android.material.R.id.mtrl_picker_text_input_date
            android.view.View r11 = r10.findViewById(r11)
            r8 = r11
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            android.widget.EditText r11 = r8.getEditText()
            boolean r12 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r12 == 0) goto L1f
            r12 = 17
            r11.setInputType(r12)
        L1f:
            java.text.SimpleDateFormat r12 = r9.textInputFormat
            if (r12 == 0) goto L24
            r0 = 1
        L24:
            if (r0 == 0) goto L28
        L26:
            r4 = r12
            goto L2d
        L28:
            java.text.SimpleDateFormat r12 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputFormat()
            goto L26
        L2d:
            if (r0 == 0) goto L35
            java.lang.String r12 = r4.toPattern()
        L33:
            r3 = r12
            goto L3e
        L35:
            android.content.res.Resources r12 = r10.getResources()
            java.lang.String r12 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputHint(r12, r4)
            goto L33
        L3e:
            r8.setPlaceholderText(r3)
            java.lang.Long r12 = r9.selectedItem
            if (r12 == 0) goto L4c
            java.lang.String r12 = r4.format(r12)
            r11.setText(r12)
        L4c:
            com.google.android.material.datepicker.SingleDateSelector$1 r12 = new com.google.android.material.datepicker.SingleDateSelector$1
            r1 = r12
            r2 = r9
            r5 = r8
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r11.addTextChangedListener(r12)
            android.widget.EditText[] r11 = new android.widget.EditText[]{r11}
            com.google.android.material.datepicker.DateSelector.showKeyboardWithAutoHideBehavior(r11)
            return r10
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.selectedItem = r1
            return
    }

    /* JADX INFO: renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(@Yue.InterfaceC4544 java.lang.Long r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L10
        L4:
            long r0 = r3.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L10:
            r2.selectedItem = r3
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(@Yue.InterfaceC4544 java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.setSelection2(r1)
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Yue.InterfaceC4544 java.text.SimpleDateFormat r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.text.DateFormat r1 = com.google.android.material.datepicker.UtcDates.getNormalizedFormat(r1)
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
        L8:
            r0.textInputFormat = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Long r2 = r0.selectedItem
            r1.writeValue(r2)
            return
    }
}
