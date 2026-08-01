package defpackage;

/* JADX INFO: renamed from: ᲀᛷᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1716 extends android.app.Dialog {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0084 f7628;

    public DialogC1716(android.content.Context r2, defpackage.C0084 r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.f7628 = r3
            return
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r22) {
            r21 = this;
            r0 = r21
            ᛱᛴᲈᛸ r6 = r0.f7628
            java.lang.String r2 = r6.f827
            java.lang.String r7 = r6.f828
            java.lang.String r8 = r6.f829
            super.onCreate(r22)
            r9 = 1
            r0.requestWindowFeature(r9)
            android.view.Window r1 = r0.getWindow()
            r10 = 2
            r3 = 17
            r4 = -1
            if (r1 == 0) goto L30
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r1.setBackgroundDrawableResource(r5)
            r1.setLayout(r4, r4)
            r1.setGravity(r3)
            r1.addFlags(r10)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r1.setDimAmount(r5)
        L30:
            android.content.Context r1 = r0.getContext()
            r11 = -135716956184110(0xffff8490ef0961d2, double:NaN)
            android.content.res.Resources r5 = r1.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            android.content.res.Resources r11 = r1.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.widthPixels
            float r11 = (float) r11
            r12 = 1064011039(0x3f6b851f, float:0.92)
            float r11 = r11 * r12
            int r11 = (int) r11
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            r12.<init>(r1)
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r4, r4)
            r12.setLayoutParams(r13)
            ᛸᛴᲀᛴ r13 = new ᛸᛴᲀᛴ
            r14 = 5
            r13.<init>(r14, r0)
            r12.setOnClickListener(r13)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r1)
            r13.setOrientation(r9)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r15.<init>(r11, r10)
            r15.gravity = r3
            r13.setLayoutParams(r15)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r11 = 1101004800(0x41a00000, float:20.0)
            float r11 = r11 * r5
            r3.setCornerRadius(r11)
            r3.setColor(r4)
            r13.setBackground(r3)
            r13.setClipToOutline(r9)
            ᛲᲁᛱᛲ r3 = new ᛲᲁᛱᛲ
            r3.<init>(r5)
            r13.setOutlineProvider(r3)
            ᛴᲇᲀᛴ r3 = new ᛴᲇᲀᛴ
            r3.<init>(r14)
            r13.setOnClickListener(r3)
            java.lang.String r3 = r6.f830
            java.lang.String r11 = r6.f831
            int r15 = r3.length()
            r16 = 1094713344(0x41400000, float:12.0)
            r17 = 1103101952(0x41c00000, float:24.0)
            r18 = 1090519040(0x41000000, float:8.0)
            if (r15 <= 0) goto Le0
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r1)
            r15.setText(r3)
            r14 = 1102053376(0x41b00000, float:22.0)
            r15.setTextSize(r14)
            r14 = 0
            r15.setTypeface(r14, r9)
            r14 = -14606047(0xffffffffff212121, float:-2.1417772E38)
            r15.setTextColor(r14)
            float r14 = r17 * r5
            int r14 = (int) r14
            int r19 = r11.length()
            if (r19 != 0) goto Ld7
            float r9 = r18 * r5
        Ld5:
            int r9 = (int) r9
            goto Lda
        Ld7:
            float r9 = r16 * r5
            goto Ld5
        Lda:
            r15.setPadding(r14, r14, r14, r9)
            r13.addView(r15)
        Le0:
            int r9 = r11.length()
            r14 = 0
            r15 = 1098907648(0x41800000, float:16.0)
            if (r9 <= 0) goto L118
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r1)
            r9.setText(r11)
            r9.setTextSize(r15)
            r11 = -12434878(0xffffffffff424242, float:-2.5821426E38)
            r9.setTextColor(r11)
            r11 = 0
            r20 = r15
            r15 = 1069547520(0x3fc00000, float:1.5)
            r9.setLineSpacing(r11, r15)
            float r11 = r17 * r5
            int r11 = (int) r11
            int r3 = r3.length()
            if (r3 != 0) goto L10d
            r3 = r11
            goto L10e
        L10d:
            r3 = r14
        L10e:
            float r15 = r18 * r5
            int r15 = (int) r15
            r9.setPadding(r11, r3, r11, r15)
            r13.addView(r9)
            goto L11a
        L118:
            r20 = r15
        L11a:
            int r3 = r2.length()
            if (r3 <= 0) goto L121
            goto L12e
        L121:
            int r3 = r7.length()
            if (r3 <= 0) goto L128
            goto L12e
        L128:
            int r3 = r8.length()
            if (r3 <= 0) goto L19e
        L12e:
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r1)
            r9.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r4, r10)
            r9.setLayoutParams(r3)
            float r3 = r16 * r5
            int r3 = (int) r3
            float r10 = r18 * r5
            int r10 = (int) r10
            float r15 = r20 * r5
            int r11 = (int) r15
            r9.setPadding(r3, r10, r3, r11)
            android.view.View r3 = new android.view.View
            r3.<init>(r1)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r14, r4, r11)
            r3.setLayoutParams(r10)
            r9.addView(r3)
            int r3 = r2.length()
            r4 = r5
            if (r3 <= 0) goto L170
            ᛸᲈᲈᲀ r5 = new ᛸᲈᲈᲀ
            r5.<init>(r0, r14)
            r3 = 0
            android.widget.TextView r2 = r0.m3105(r1, r2, r3, r4, r5)
            r9.addView(r2)
        L170:
            int r2 = r7.length()
            if (r2 <= 0) goto L185
            ᛸᲈᲈᲀ r5 = new ᛸᲈᲈᲀ
            r2 = 1
            r5.<init>(r0, r2)
            r3 = 0
            r2 = r7
            android.widget.TextView r2 = r0.m3105(r1, r2, r3, r4, r5)
            r9.addView(r2)
        L185:
            int r2 = r8.length()
            if (r2 <= 0) goto L19b
            java.lang.Integer r3 = r6.f832
            ᛸᲈᲈᲀ r5 = new ᛸᲈᲈᲀ
            r2 = 2
            r5.<init>(r0, r2)
            r2 = r8
            android.widget.TextView r1 = r0.m3105(r1, r2, r3, r4, r5)
            r9.addView(r1)
        L19b:
            r13.addView(r9)
        L19e:
            r12.addView(r13)
            ᲁᲈᛳ r1 = new ᲁᲈᛳ
            r2 = 5
            r1.<init>(r2, r13)
            r12.post(r1)
            r0.setContentView(r12)
            boolean r1 = r6.f826
            r0.setCancelable(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.TextView m3105(android.content.Context r3, java.lang.String r4, java.lang.Integer r5, float r6, defpackage.InterfaceC1781 r7) {
            r2 = this;
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r3)
            if (r5 == 0) goto Lc
            int r3 = r5.intValue()
            goto Lf
        Lc:
            r3 = -13980690(0xffffffffff2aabee, float:-2.2686147E38)
        Lf:
            r2.setText(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r4)
            r4 = 0
            r5 = 1
            r2.setTypeface(r4, r5)
            r2.setTextColor(r3)
            r0 = 17
            r2.setGravity(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = r0 * r6
            int r0 = (int) r0
            r1 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 * r6
            int r1 = (int) r1
            r2.setPadding(r0, r1, r0, r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r0 = 436207616(0x1a000000, float:2.646978E-23)
            r3 = r3 | r0
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r0 = -135785675660846(0xffff8480ef0961d2, double:NaN)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 * r6
            r0.setCornerRadius(r1)
            r6 = -1
            r0.setColor(r6)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            r6.<init>(r3, r4, r0)
            r2.setBackground(r6)
            r2.setClickable(r5)
            r2.setFocusable(r5)
            ᛸᛴᲀᛴ r3 = new ᛸᛴᲀᛴ
            r4 = 6
            r3.<init>(r4, r7)
            r2.setOnClickListener(r3)
            return r2
    }
}
