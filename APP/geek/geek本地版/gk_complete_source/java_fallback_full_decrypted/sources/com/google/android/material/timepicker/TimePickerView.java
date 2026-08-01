package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int q = 0;
    public final com.google.android.material.chip.Chip p;

    public TimePickerView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r6, r0)
            com.google.android.material.timepicker.e r6 = new com.google.android.material.timepicker.e
            r6.<init>(r4)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r0 = 2131492925(0x7f0c003d, float:1.8609316E38)
            r5.inflate(r0, r4)
            r5 = 2131296472(0x7f0900d8, float:1.8210862E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.timepicker.ClockFaceView r5 = (com.google.android.material.timepicker.ClockFaceView) r5
            r5 = 2131296477(0x7f0900dd, float:1.8210872E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButtonToggleGroup r5 = (com.google.android.material.button.MaterialButtonToggleGroup) r5
            com.google.android.material.timepicker.d r0 = new com.google.android.material.timepicker.d
            r0.<init>()
            java.util.LinkedHashSet r5 = r5.c
            r5.add(r0)
            r5 = 2131296482(0x7f0900e2, float:1.8210882E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r0 = 2131296479(0x7f0900df, float:1.8210876E38)
            android.view.View r0 = r4.findViewById(r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r4.p = r0
            r1 = 2131296473(0x7f0900d9, float:1.8210864E38)
            android.view.View r1 = r4.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.content.Context r2 = r4.getContext()
            com.google.android.material.timepicker.f r3 = new com.google.android.material.timepicker.f
            r3.<init>(r4)
            r1.<init>(r2, r3)
            jr r2 = new jr
            r3 = 1
            r2.<init>(r3, r1)
            r5.setOnTouchListener(r2)
            r0.setOnTouchListener(r2)
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2131296607(0x7f09015f, float:1.8211135E38)
            r5.setTag(r2, r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTag(r2, r1)
            r5.setOnClickListener(r6)
            r0.setOnClickListener(r6)
            java.lang.String r6 = "android.view.View"
            r5.setAccessibilityClassName(r6)
            r0.setAccessibilityClassName(r6)
            return
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r1 != r0) goto Le
            if (r2 != 0) goto Le
            com.google.android.material.chip.Chip r1 = r0.p
            r2 = 8
            r1.sendAccessibilityEvent(r2)
        Le:
            return
    }
}
