package defpackage;

/* JADX INFO: renamed from: ᲇᲇᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2146 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0279 f9119;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.util.List f9120;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9121;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public com.kongzue.dialogx.interfaces.AbstractC0008 f9122;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.content.Context f9123;

    public /* synthetic */ C2146(int r1) {
            r0 = this;
            r0.f9121 = r1
            r0.<init>()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            int r0 = r1.f9121
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.List r1 = r1.f9120
            int r1 = r1.size()
            return r1
        Lc:
            java.util.List r1 = r1.f9120
            int r1 = r1.size()
            return r1
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            int r0 = r1.f9121
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.util.List r1 = r1.f9120
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
        Le:
            java.util.List r1 = r1.f9120
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            int r0 = r0.f9121
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            long r0 = (long) r1
            return r0
        L7:
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f9121
            r11 = 2
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r14 = 1711866799(0x660903af, float:1.6175804E23)
            r15 = 1711867060(0x660904b4, float:1.6176274E23)
            r20 = 1056964608(0x3f000000, float:0.5)
            r3 = 1711866399(0x6609021f, float:1.6175083E23)
            r4 = 1711866398(0x6609021e, float:1.6175082E23)
            r5 = 1712062573(0x660c006d, float:1.6528479E23)
            r7 = 0
            r16 = 1
            switch(r2) {
                case 0: goto L1cf;
                default: goto L23;
            }
        L23:
            android.content.Context r2 = r0.f9123
            android.app.Activity r2 = (android.app.Activity) r2
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r8 = r0.f9122
            ᲀᲇᲈᛳ r8 = (defpackage.C1776) r8
            if (r19 != 0) goto L6e
            ᲀᛷᛷᛳ r9 = new ᲀᛷᛷᛳ
            r9.<init>()
            android.view.LayoutInflater r10 = defpackage.AbstractC1668.m3063(r2)
            ᲈᛴᛵᲈ r6 = r8.f375
            r6.getClass()
            ᲈᛴᛵᲈ r6 = r8.f375
            r6.getClass()
            r8.mo270()
            r0.getCount()
            android.view.View r5 = r10.inflate(r5, r7)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r9.f7617 = r4
            android.view.View r3 = r5.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r9.f7618 = r3
            android.view.View r3 = r5.findViewById(r15)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f7616 = r3
            android.view.View r3 = r5.findViewById(r14)
            android.widget.Space r3 = (android.widget.Space) r3
            r9.f7615 = r3
            r5.setTag(r9)
            goto L77
        L6e:
            java.lang.Object r3 = r19.getTag()
            r9 = r3
            ᲀᛷᛷᛳ r9 = (defpackage.C1712) r9
            r5 = r19
        L77:
            r8.getClass()
            ᲈᛴᛵᲈ r3 = r8.f375
            java.util.HashMap r4 = r8.f7847
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.get(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 != 0) goto L8d
            r4 = r16
            goto L91
        L8d:
            boolean r4 = r4.booleanValue()
        L91:
            if (r4 != 0) goto L97
            r5.setAlpha(r13)
            goto L9a
        L97:
            r5.setAlpha(r12)
        L9a:
            int r4 = r8.f7851
            if (r4 != r11) goto Lce
            android.widget.ImageView r4 = r9.f7618
            if (r4 == 0) goto L112
            int r6 = r8.f7848
            if (r6 != r1) goto Lb9
            r6 = 0
            r4.setVisibility(r6)
            r3.getClass()
            r8.mo270()
            android.widget.ImageView r4 = r9.f7618
            r10 = 1712128006(0x660d0006, float:1.6646353E23)
            r4.setImageResource(r10)
            goto L112
        Lb9:
            r6 = 0
            r3.getClass()
            r8.mo270()
            android.widget.ImageView r4 = r9.f7618
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r9.f7618
            r6 = 1712128005(0x660d0005, float:1.664635E23)
            r4.setImageResource(r6)
            goto L112
        Lce:
            r6 = 3
            if (r4 != r6) goto L10b
            android.widget.ImageView r4 = r9.f7618
            if (r4 == 0) goto L112
            java.util.ArrayList r4 = r8.f7853
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto Lf6
            android.widget.ImageView r4 = r9.f7618
            r6 = 0
            r4.setVisibility(r6)
            r3.getClass()
            r8.mo270()
            android.widget.ImageView r4 = r9.f7618
            r10 = 1712128003(0x660d0003, float:1.6646347E23)
            r4.setImageResource(r10)
            goto L112
        Lf6:
            r6 = 0
            r3.getClass()
            r8.mo270()
            android.widget.ImageView r4 = r9.f7618
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r9.f7618
            r6 = 1712128004(0x660d0004, float:1.6646349E23)
            r4.setImageResource(r6)
            goto L112
        L10b:
            android.widget.ImageView r4 = r9.f7618
            r6 = 8
            r4.setVisibility(r6)
        L112:
            r3.getClass()
            r3.getClass()
            r8.mo270()
            java.util.List r4 = r0.f9120
            java.lang.Object r1 = r4.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.mo270()
            r3.getClass()
            r3.getClass()
            r8.mo270()
            r3.getClass()
            boolean r4 = r8.mo270()
            if (r4 == 0) goto L13c
            r4 = 1711669302(0x66060036, float:1.5820025E23)
            goto L13f
        L13c:
            r4 = 1711669528(0x66060118, float:1.5820432E23)
        L13f:
            if (r1 == 0) goto L1ce
            ᛲᛴᛲᛴ r6 = r0.f9119
            if (r6 != 0) goto L19a
            ᛲᛴᛲᛴ r6 = new ᛲᛴᛲᛴ
            r6.<init>()
            android.widget.TextView r10 = r9.f7616
            android.text.TextUtils$TruncateAt r10 = r10.getEllipsize()
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            if (r10 != r11) goto L157
            r10 = r16
            goto L158
        L157:
            r10 = 0
        L158:
            r6.f1560 = r10
            android.widget.TextView r10 = r9.f7616
            android.content.res.ColorStateList r10 = r10.getTextColors()
            int r10 = r10.getDefaultColor()
            r6.f1557 = r10
            android.widget.TextView r10 = r9.f7616
            android.text.TextPaint r10 = r10.getPaint()
            boolean r10 = r10.isFakeBoldText()
            r6.f1556 = r10
            android.widget.TextView r10 = r9.f7616
            float r10 = r10.getTextSize()
            android.content.res.Resources r11 = r2.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 / r11
            float r10 = r10 + r20
            int r10 = (int) r10
            r6.f1558 = r10
            android.widget.TextView r10 = r9.f7616
            int r10 = r10.getGravity()
            r6.f1559 = r10
            android.widget.TextView r10 = r9.f7616
            int r10 = r10.getMaxLines()
            r6.f1555 = r10
            r0.f9119 = r6
        L19a:
            android.widget.TextView r0 = r9.f7616
            r0.setText(r1)
            android.widget.TextView r0 = r9.f7616
            android.content.res.Resources r1 = r2.getResources()
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            android.widget.ImageView r0 = r9.f7618
            if (r0 == 0) goto L1c0
            r3.getClass()
            r3.getClass()
            r8.mo270()
            android.widget.ImageView r0 = r9.f7618
            r0.setImageTintList(r7)
        L1c0:
            android.widget.ImageView r0 = r9.f7617
            r6 = 8
            r0.setVisibility(r6)
            android.widget.Space r0 = r9.f7615
            if (r0 == 0) goto L1ce
            r0.setVisibility(r6)
        L1ce:
            return r5
        L1cf:
            android.content.Context r2 = r0.f9123
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r6 = r0.f9122
            ᲀᲀᛲᛴ r6 = (defpackage.C1732) r6
            if (r19 != 0) goto L218
            ᛲᲈᛴᲀ r8 = new ᛲᲈᛴᲀ
            r8.<init>()
            android.view.LayoutInflater r9 = defpackage.AbstractC1668.m3063(r2)
            ᲈᛴᛵᲈ r10 = r6.f375
            r10.getClass()
            ᲈᛴᛵᲈ r10 = r6.f375
            r10.getClass()
            r6.mo270()
            r0.getCount()
            android.view.View r5 = r9.inflate(r5, r7)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r8.f2000 = r4
            android.view.View r3 = r5.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r8.f2001 = r3
            android.view.View r3 = r5.findViewById(r15)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r8.f1999 = r3
            android.view.View r3 = r5.findViewById(r14)
            android.widget.Space r3 = (android.widget.Space) r3
            r8.f1998 = r3
            r5.setTag(r8)
            goto L221
        L218:
            java.lang.Object r3 = r19.getTag()
            r8 = r3
            ᛲᲈᛴᲀ r8 = (defpackage.C0384) r8
            r5 = r19
        L221:
            java.util.ArrayList r3 = r6.f7666
            ᲈᛴᛵᲈ r4 = r6.f375
            if (r3 == 0) goto L23c
            if (r1 < 0) goto L23c
            int r3 = r3.size()
            if (r1 >= r3) goto L23c
            java.util.ArrayList r3 = r6.f7666
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L23d
        L23c:
            r3 = r1
        L23d:
            java.util.HashMap r9 = r6.f7682
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            java.lang.Object r9 = r9.get(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 != 0) goto L24e
            r9 = r16
            goto L252
        L24e:
            boolean r9 = r9.booleanValue()
        L252:
            if (r9 != 0) goto L258
            r5.setAlpha(r13)
            goto L25b
        L258:
            r5.setAlpha(r12)
        L25b:
            int r9 = r6.f7681
            if (r9 != r11) goto L291
            android.widget.ImageView r9 = r8.f2001
            if (r9 == 0) goto L28f
            int r10 = r6.f7667
            if (r10 != r3) goto L27b
            r3 = 0
            r9.setVisibility(r3)
            r4.getClass()
            r6.mo270()
            android.widget.ImageView r9 = r8.f2001
            r10 = 1712128006(0x660d0006, float:1.6646353E23)
            r9.setImageResource(r10)
            r9 = r3
            goto L2d6
        L27b:
            r3 = 0
            r4.getClass()
            r6.mo270()
            android.widget.ImageView r9 = r8.f2001
            r9.setVisibility(r3)
            android.widget.ImageView r3 = r8.f2001
            r9 = 1712128005(0x660d0005, float:1.664635E23)
            r3.setImageResource(r9)
        L28f:
            r9 = 0
            goto L2d6
        L291:
            r10 = 3
            if (r9 != r10) goto L2ce
            android.widget.ImageView r9 = r8.f2001
            if (r9 == 0) goto L28f
            java.util.ArrayList r9 = r6.f7668
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r9.contains(r3)
            if (r3 == 0) goto L2b9
            android.widget.ImageView r3 = r8.f2001
            r9 = 0
            r3.setVisibility(r9)
            r4.getClass()
            r6.mo270()
            android.widget.ImageView r3 = r8.f2001
            r10 = 1712128003(0x660d0003, float:1.6646347E23)
            r3.setImageResource(r10)
            goto L2d6
        L2b9:
            r9 = 0
            r4.getClass()
            r6.mo270()
            android.widget.ImageView r3 = r8.f2001
            r3.setVisibility(r9)
            android.widget.ImageView r3 = r8.f2001
            r10 = 1712128004(0x660d0004, float:1.6646349E23)
            r3.setImageResource(r10)
            goto L2d6
        L2ce:
            r9 = 0
            android.widget.ImageView r3 = r8.f2001
            r10 = 8
            r3.setVisibility(r10)
        L2d6:
            r4.getClass()
            r4.getClass()
            r6.mo270()
            java.util.List r3 = r0.f9120
            java.lang.Object r1 = r3.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.mo270()
            r4.getClass()
            r4.getClass()
            r6.mo270()
            r4.getClass()
            boolean r3 = r6.mo270()
            if (r3 == 0) goto L300
            r3 = 1711669302(0x66060036, float:1.5820025E23)
            goto L303
        L300:
            r3 = 1711669528(0x66060118, float:1.5820432E23)
        L303:
            if (r1 == 0) goto L390
            ᛲᛴᛲᛴ r10 = r0.f9119
            if (r10 != 0) goto L35c
            ᛲᛴᛲᛴ r10 = new ᛲᛴᛲᛴ
            r10.<init>()
            android.widget.TextView r11 = r8.f1999
            android.text.TextUtils$TruncateAt r11 = r11.getEllipsize()
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            if (r11 != r12) goto L31a
            r9 = r16
        L31a:
            r10.f1560 = r9
            android.widget.TextView r9 = r8.f1999
            android.content.res.ColorStateList r9 = r9.getTextColors()
            int r9 = r9.getDefaultColor()
            r10.f1557 = r9
            android.widget.TextView r9 = r8.f1999
            android.text.TextPaint r9 = r9.getPaint()
            boolean r9 = r9.isFakeBoldText()
            r10.f1556 = r9
            android.widget.TextView r9 = r8.f1999
            float r9 = r9.getTextSize()
            android.content.res.Resources r11 = r2.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r9 = r9 / r11
            float r9 = r9 + r20
            int r9 = (int) r9
            r10.f1558 = r9
            android.widget.TextView r9 = r8.f1999
            int r9 = r9.getGravity()
            r10.f1559 = r9
            android.widget.TextView r9 = r8.f1999
            int r9 = r9.getMaxLines()
            r10.f1555 = r9
            r0.f9119 = r10
        L35c:
            android.widget.TextView r0 = r8.f1999
            r0.setText(r1)
            android.widget.TextView r0 = r8.f1999
            android.content.res.Resources r1 = r2.getResources()
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            android.widget.ImageView r0 = r8.f2001
            if (r0 == 0) goto L382
            r4.getClass()
            r4.getClass()
            r6.mo270()
            android.widget.ImageView r0 = r8.f2001
            r0.setImageTintList(r7)
        L382:
            android.widget.ImageView r0 = r8.f2000
            r6 = 8
            r0.setVisibility(r6)
            android.widget.Space r0 = r8.f1998
            if (r0 == 0) goto L390
            r0.setVisibility(r6)
        L390:
            return r5
    }
}
