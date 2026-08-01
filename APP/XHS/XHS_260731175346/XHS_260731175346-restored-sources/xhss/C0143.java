package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0143 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.util.List f612;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public android.app.Activity f613;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0885 f614;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0584 f615;

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            java.util.List r0 = r0.f612
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            java.util.List r0 = r0.f612
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
            r12 = this;
            android.app.Activity r15 = r12.f613
            xhss.ᲀᛸᛷᛱ r0 = r12.f614
            r1 = 0
            if (r14 != 0) goto L5a
            xhss.ᛲᛱᛶᛶ r14 = new xhss.ᛲᛱᛶᛶ
            r14.<init>()
            android.view.LayoutInflater r2 = xhss.AbstractC0968.m1604(r15)
            xhss.ᛶᛵᲇᛸ r3 = r0.f95
            r3.getClass()
            xhss.ᛶᛵᲇᛸ r3 = r0.f95
            r3.getClass()
            r0.mo50()
            r12.getCount()
            r3 = 1678442540(0x640b002c, float:1.0256439E22)
            android.view.View r2 = r2.inflate(r3, r1)
            r3 = 1678246021(0x64080085, float:1.0035179E22)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r14.f547 = r3
            r3 = 1678246022(0x64080086, float:1.003518E22)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r14.f545 = r3
            r3 = 1678246180(0x64080124, float:1.0035358E22)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14.f546 = r3
            r3 = 1678246129(0x640800f1, float:1.00353E22)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Space r3 = (android.widget.Space) r3
            r14.f548 = r3
            r2.setTag(r14)
            r11 = r2
            r2 = r14
            r14 = r11
            goto L60
        L5a:
            java.lang.Object r2 = r14.getTag()
            xhss.ᛲᛱᛶᛶ r2 = (xhss.C0123) r2
        L60:
            r0.getClass()
            xhss.ᛶᛵᲇᛸ r3 = r0.f95
            java.util.HashMap r4 = r0.f2846
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = 1
            if (r4 != 0) goto L76
            r4 = r5
            goto L7a
        L76:
            boolean r4 = r4.booleanValue()
        L7a:
            if (r4 != 0) goto L83
            r4 = 1053609165(0x3ecccccd, float:0.4)
            r14.setAlpha(r4)
            goto L88
        L83:
            r4 = 1065353216(0x3f800000, float:1.0)
            r14.setAlpha(r4)
        L88:
            int r4 = r0.f2852
            r6 = 2
            r7 = 8
            r8 = 0
            if (r4 != r6) goto Lbe
            android.widget.ImageView r4 = r2.f545
            if (r4 == 0) goto Lfe
            int r6 = r0.f2850
            if (r6 != r13) goto Laa
            r4.setVisibility(r8)
            r3.getClass()
            r0.mo50()
            r4 = 1678508038(0x640c0006, float:1.0330183E22)
            android.widget.ImageView r6 = r2.f545
            r6.setImageResource(r4)
            goto Lfe
        Laa:
            r3.getClass()
            r0.mo50()
            android.widget.ImageView r4 = r2.f545
            r6 = 1678508037(0x640c0005, float:1.0330182E22)
            r4.setVisibility(r8)
            android.widget.ImageView r4 = r2.f545
            r4.setImageResource(r6)
            goto Lfe
        Lbe:
            r6 = 3
            if (r4 != r6) goto Lf9
            android.widget.ImageView r4 = r2.f545
            if (r4 == 0) goto Lfe
            java.util.ArrayList r4 = r0.f2844
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto Le5
            android.widget.ImageView r4 = r2.f545
            r4.setVisibility(r8)
            r3.getClass()
            r0.mo50()
            r4 = 1678508035(0x640c0003, float:1.033018E22)
            android.widget.ImageView r6 = r2.f545
            r6.setImageResource(r4)
            goto Lfe
        Le5:
            r3.getClass()
            r0.mo50()
            android.widget.ImageView r4 = r2.f545
            r6 = 1678508036(0x640c0004, float:1.0330181E22)
            r4.setVisibility(r8)
            android.widget.ImageView r4 = r2.f545
            r4.setImageResource(r6)
            goto Lfe
        Lf9:
            android.widget.ImageView r4 = r2.f545
            r4.setVisibility(r7)
        Lfe:
            r3.getClass()
            r3.getClass()
            r0.mo50()
            java.util.List r4 = r12.f612
            java.lang.Object r13 = r4.get(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r0.mo50()
            r3.getClass()
            r3.getClass()
            r0.mo50()
            r3.getClass()
            boolean r4 = r0.mo50()
            if (r4 == 0) goto L128
            r4 = 1678049325(0x6405002d, float:9.813719E21)
            goto L12b
        L128:
            r4 = 1678049428(0x64050094, float:9.813834E21)
        L12b:
            if (r13 == 0) goto L1b7
            xhss.ᛶᛸᛸᛵ r6 = r12.f615
            if (r6 != 0) goto L185
            xhss.ᛶᛸᛸᛵ r6 = new xhss.ᛶᛸᛸᛵ
            r6.<init>()
            android.widget.TextView r9 = r2.f546
            android.text.TextUtils$TruncateAt r9 = r9.getEllipsize()
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            if (r9 != r10) goto L141
            goto L142
        L141:
            r5 = r8
        L142:
            r6.f2039 = r5
            android.widget.TextView r5 = r2.f546
            android.content.res.ColorStateList r5 = r5.getTextColors()
            int r5 = r5.getDefaultColor()
            r6.f2035 = r5
            android.widget.TextView r5 = r2.f546
            android.text.TextPaint r5 = r5.getPaint()
            boolean r5 = r5.isFakeBoldText()
            r6.f2038 = r5
            android.widget.TextView r5 = r2.f546
            float r5 = r5.getTextSize()
            android.content.res.Resources r8 = r15.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 / r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r8
            int r5 = (int) r5
            r6.f2037 = r5
            android.widget.TextView r5 = r2.f546
            int r5 = r5.getGravity()
            r6.f2034 = r5
            android.widget.TextView r5 = r2.f546
            int r5 = r5.getMaxLines()
            r6.f2036 = r5
            r12.f615 = r6
        L185:
            android.widget.TextView r12 = r2.f546
            r12.setText(r13)
            android.widget.TextView r12 = r2.f546
            android.content.res.Resources r13 = r15.getResources()
            int r13 = r13.getColor(r4)
            r12.setTextColor(r13)
            xhss.ᛶᛵᲇᛸ r12 = xhss.AbstractC1069.f3451
            android.widget.ImageView r12 = r2.f545
            if (r12 == 0) goto L1ab
            r3.getClass()
            r3.getClass()
            r0.mo50()
            android.widget.ImageView r12 = r2.f545
            r12.setImageTintList(r1)
        L1ab:
            android.widget.ImageView r12 = r2.f547
            r12.setVisibility(r7)
            android.widget.Space r12 = r2.f548
            if (r12 == 0) goto L1b7
            r12.setVisibility(r7)
        L1b7:
            return r14
    }
}
