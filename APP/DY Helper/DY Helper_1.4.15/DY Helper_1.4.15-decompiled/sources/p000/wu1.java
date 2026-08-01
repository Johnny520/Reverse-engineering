package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f11868;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.LayoutInflater f11869;

    public wu1(android.view.LayoutInflater r1) {
            r0 = this;
            r0.f11869 = r1
            r0.<init>()
            jz r1 = p000.C0450jz.f5672
            r0.f11868 = r1
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            java.lang.Object r0 = r0.f11868
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.f11868
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            java.lang.Object r2 = r2.f11868
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r3, r2)
            ux$α r2 = (p000.C0888ux.C1157) r2
            if (r2 == 0) goto L19
            long r0 = r2.m6006()
            java.lang.String r2 = r2.m6002()
            int r2 = r2.hashCode()
            long r2 = (long) r2
            long r2 = r2 ^ r0
            return r2
        L19:
            long r2 = (long) r3
            return r2
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
            r12 = this;
            r15.getClass()
            r0 = 0
            if (r14 != 0) goto L1b
            android.view.LayoutInflater r14 = r12.f11869
            r1 = 2131492940(0x7f0c004c, float:1.8609346E38)
            android.view.View r14 = r14.inflate(r1, r15, r0)
            r14.getClass()
            vu1 r15 = new vu1
            r15.<init>(r14)
            r14.setTag(r15)
            goto L24
        L1b:
            java.lang.Object r15 = r14.getTag()
            r15.getClass()
            vu1 r15 = (p000.vu1) r15
        L24:
            android.widget.TextView r1 = r15.f11411
            android.widget.TextView r2 = r15.f11410
            android.widget.TextView r3 = r15.f11408
            android.widget.TextView r4 = r15.f11409
            android.widget.TextView r15 = r15.f11412
            java.lang.Object r12 = r12.f11868
            java.lang.Object r12 = r12.get(r13)
            ux$α r12 = (p000.C0888ux.C1157) r12
            java.lang.String r13 = r12.m6001()
            java.lang.String r5 = "E"
            boolean r6 = p000.ln0.m3626(r13, r5)
            r7 = 0
            java.lang.String r8 = "D"
            java.lang.String r9 = "theme"
            if (r6 == 0) goto L52
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L4e
            java.lang.String r13 = r13.f9131
            goto L69
        L4e:
            p000.ln0.m3650(r9)
            throw r7
        L52:
            boolean r13 = p000.ln0.m3626(r13, r8)
            if (r13 == 0) goto L63
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L5f
            java.lang.String r13 = r13.f9127
            goto L69
        L5f:
            p000.ln0.m3650(r9)
            throw r7
        L63:
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L1aa
            java.lang.String r13 = r13.f9125
        L69:
            java.lang.String r6 = r12.m6001()
            boolean r5 = p000.ln0.m3626(r6, r5)
            if (r5 == 0) goto L7e
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto L7a
            java.lang.String r5 = r5.f9132
            goto L95
        L7a:
            p000.ln0.m3650(r9)
            throw r7
        L7e:
            boolean r5 = p000.ln0.m3626(r6, r8)
            if (r5 == 0) goto L8f
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto L8b
            java.lang.String r5 = r5.f9128
            goto L95
        L8b:
            p000.ln0.m3650(r9)
            throw r7
        L8f:
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto L1a6
            java.lang.String r5 = r5.f9126
        L95:
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            bv1 r8 = p000.bv1.f1853
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L1a2
            java.lang.String r8 = r8.f9118
            int r8 = android.graphics.Color.parseColor(r8)
            r6.setColor(r8)
            android.content.Context r8 = r14.getContext()
            r8.getClass()
            r10 = 10
            int r8 = p000.bv1.m1076(r8, r10)
            float r8 = (float) r8
            r6.setCornerRadius(r8)
            android.content.Context r8 = r14.getContext()
            r8.getClass()
            r10 = 1
            int r8 = p000.bv1.m1076(r8, r10)
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L19e
            java.lang.String r10 = r10.f9136
            int r10 = android.graphics.Color.parseColor(r10)
            r6.setStroke(r8, r10)
            r14.setBackground(r6)
            long r10 = r12.m6006()
            java.lang.String r6 = p000.C0888ux.m5983(r10)
            r3.setText(r6)
            qu1 r6 = p000.bv1.f1856
            if (r6 == 0) goto L19a
            java.lang.String r6 = r6.f9124
            int r6 = android.graphics.Color.parseColor(r6)
            r3.setTextColor(r6)
            java.lang.String r3 = r12.m6001()
            r4.setText(r3)
            int r13 = android.graphics.Color.parseColor(r13)
            r4.setTextColor(r13)
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            r13.<init>()
            int r3 = android.graphics.Color.parseColor(r5)
            r13.setColor(r3)
            android.content.Context r3 = r14.getContext()
            r3.getClass()
            r5 = 7
            int r3 = p000.bv1.m1076(r3, r5)
            float r3 = (float) r3
            r13.setCornerRadius(r3)
            r4.setBackground(r13)
            java.lang.String r13 = r12.m6003()
            r2.setText(r13)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L196
            java.lang.String r13 = r13.f9123
            int r13 = android.graphics.Color.parseColor(r13)
            r2.setTextColor(r13)
            java.lang.String r13 = r12.m6004()
            java.lang.String r2 = r12.m6002()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "["
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r13 = "] "
            r3.append(r13)
            r3.append(r2)
            java.lang.String r13 = r3.toString()
            r1.setText(r13)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L192
            java.lang.String r13 = r13.f9122
            int r13 = android.graphics.Color.parseColor(r13)
            r1.setTextColor(r13)
            java.lang.String r12 = r12.m6005()
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            boolean r13 = p000.q02.m4671(r12)
            if (r13 == 0) goto L17a
            r12 = 8
            r15.setVisibility(r12)
            java.lang.String r12 = ""
            r15.setText(r12)
            return r14
        L17a:
            r15.setVisibility(r0)
            r15.setText(r12)
            qu1 r12 = p000.bv1.f1856
            if (r12 == 0) goto L18e
            java.lang.String r12 = r12.f9131
            int r12 = android.graphics.Color.parseColor(r12)
            r15.setTextColor(r12)
            return r14
        L18e:
            p000.ln0.m3650(r9)
            throw r7
        L192:
            p000.ln0.m3650(r9)
            throw r7
        L196:
            p000.ln0.m3650(r9)
            throw r7
        L19a:
            p000.ln0.m3650(r9)
            throw r7
        L19e:
            p000.ln0.m3650(r9)
            throw r7
        L1a2:
            p000.ln0.m3650(r9)
            throw r7
        L1a6:
            p000.ln0.m3650(r9)
            throw r7
        L1aa:
            p000.ln0.m3650(r9)
            throw r7
    }
}
