package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final com.google.android.material.chip.Chip q;

    public class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.timepicker.TimePickerView f1104a;

        public a(com.google.android.material.timepicker.TimePickerView r1) {
                r0 = this;
                r0.<init>()
                r0.f1104a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r1) {
                r0 = this;
                int r1 = com.google.android.material.timepicker.TimePickerView.r
                com.google.android.material.timepicker.TimePickerView r1 = r0.f1104a
                r1.getClass()
                return
        }
    }

    public TimePickerView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r6, r0)
            com.google.android.material.timepicker.TimePickerView$a r6 = new com.google.android.material.timepicker.TimePickerView$a
            r6.<init>(r4)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = com.google.android.material.R.layout.material_timepicker
            r5.inflate(r0, r4)
            int r5 = com.google.android.material.R.id.material_clock_face
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.timepicker.ClockFaceView r5 = (com.google.android.material.timepicker.ClockFaceView) r5
            int r5 = com.google.android.material.R.id.material_clock_period_toggle
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButtonToggleGroup r5 = (com.google.android.material.button.MaterialButtonToggleGroup) r5
            com.google.android.material.timepicker.c r0 = new com.google.android.material.timepicker.c
            r0.<init>()
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$d> r5 = r5.c
            r5.add(r0)
            int r5 = com.google.android.material.R.id.material_minute_tv
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            int r0 = com.google.android.material.R.id.material_hour_tv
            android.view.View r0 = r4.findViewById(r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r4.q = r0
            int r1 = com.google.android.material.R.id.material_clock_hand
            android.view.View r1 = r4.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.content.Context r2 = r4.getContext()
            com.google.android.material.timepicker.d r3 = new com.google.android.material.timepicker.d
            r3.<init>(r4)
            r1.<init>(r2, r3)
            a.ff r2 = new a.ff
            r2.<init>(r1)
            r5.setOnTouchListener(r2)
            r0.setOnTouchListener(r2)
            int r1 = com.google.android.material.R.id.selection_type
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.setTag(r1, r2)
            int r1 = com.google.android.material.R.id.selection_type
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
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
            com.google.android.material.chip.Chip r1 = r0.q
            r2 = 8
            r1.sendAccessibilityEvent(r2)
        Le:
            return
    }
}
