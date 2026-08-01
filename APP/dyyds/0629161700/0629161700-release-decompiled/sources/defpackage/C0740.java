package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0740 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f3494;

    public C0740(java.util.ArrayList r3) {
            r2 = this;
            r0 = -137198719901230(0xffff8337ef0961d2, double:NaN)
            r2.<init>()
            r2.f3494 = r3
            return
    }

    @Override // defpackage.AbstractC1191
    public final int getItemCount() {
            r0 = this;
            java.util.ArrayList r0 = r0.f3494
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.AbstractC1191
    public final void onBindViewHolder(defpackage.AbstractC2316 r3, int r4) {
            r2 = this;
            ᛱᛷᛵ r3 = (defpackage.C0129) r3
            r0 = -137263144410670(0xffff8328ef0961d2, double:NaN)
            java.util.ArrayList r2 = r2.f3494
            java.lang.Object r2 = r2.get(r4)
            ᛳᛷᛸ r2 = (defpackage.C0515) r2
            r0 = -129678232165934(0xffff8a0eef0961d2, double:NaN)
            android.widget.TextView r4 = r3.f1062
            java.lang.String r0 = r2.f2545
            r4.setText(r0)
            java.util.List r4 = defpackage.AbstractC1253.f5590
            ᛶᲀᛵ r4 = defpackage.C1141.f5173
            r4.getClass()
            java.util.Set r4 = defpackage.C1141.m2179()
            java.lang.String r0 = r2.f2544
            boolean r4 = r4.contains(r0)
            r4 = r4 ^ 1
            r3.m644(r4)
            android.widget.TextView r4 = r3.f1063
            ᛳᛲᛶᛶ r0 = new ᛳᛲᛶᛶ
            r1 = 17
            r0.<init>(r2, r1, r3)
            r4.setOnClickListener(r0)
            return
    }

    @Override // defpackage.AbstractC1191
    public final defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r8, int r9) {
            r7 = this;
            r0 = -137224489705006(0xffff8331ef0961d2, double:NaN)
            android.content.Context r7 = r8.getContext()
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r7)
            r9 = 0
            r8.setOrientation(r9)
            r0 = 16
            r8.setGravity(r0)
            r0 = 10
            int r0 = defpackage.AbstractC2093.m3510(r0)
            r1 = 6
            int r2 = defpackage.AbstractC2093.m3510(r1)
            r3 = 8
            int r3 = defpackage.AbstractC2093.m3510(r3)
            int r4 = defpackage.AbstractC2093.m3510(r1)
            r8.setPadding(r0, r2, r3, r4)
            r0 = 1711669322(0x6606004a, float:1.5820061E23)
            int r0 = r7.getColor(r0)
            r2 = 12
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r3 = 1711669362(0x66060072, float:1.5820133E23)
            int r3 = r7.getColor(r3)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setShape(r9)
            r4.setColor(r0)
            float r0 = (float) r2
            r4.setCornerRadius(r0)
            r0 = 1
            r4.setStroke(r0, r3)
            r8.setBackground(r4)
            ᛵᛲᲁᛴ r2 = new ᛵᛲᲁᛴ
            r3 = 48
            int r3 = defpackage.AbstractC2093.m3510(r3)
            r4 = -1
            r2.<init>(r4, r3)
            int r1 = defpackage.AbstractC2093.m3510(r1)
            r2.bottomMargin = r1
            r8.setLayoutParams(r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r7)
            r2 = -137254554476078(0xffff832aef0961d2, double:NaN)
            java.lang.String r2 = "≡"
            r1.setText(r2)
            r2 = 1099956224(0x41900000, float:18.0)
            r1.setTextSize(r2)
            r2 = 17
            r1.setGravity(r2)
            r3 = 1711669487(0x660600ef, float:1.5820358E23)
            int r3 = r7.getColor(r3)
            r1.setTextColor(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r7)
            r5 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r5)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r5)
            r6 = 1711669473(0x660600e1, float:1.5820333E23)
            int r6 = r7.getColor(r6)
            r3.setTextColor(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r7)
            r7 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r7)
            r6.setTypeface(r5)
            r6.setGravity(r2)
            r6.setClickable(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = 36
            int r0 = defpackage.AbstractC2093.m3510(r0)
            r7.<init>(r0, r4)
            r8.addView(r1, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r9, r0, r1)
            r8.addView(r3, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = 60
            int r9 = defpackage.AbstractC2093.m3510(r9)
            r0 = 28
            int r0 = defpackage.AbstractC2093.m3510(r0)
            r7.<init>(r9, r0)
            r8.addView(r6, r7)
            ᛱᛷᛵ r7 = new ᛱᛷᛵ
            r7.<init>(r8, r3, r6)
            return r7
    }
}
