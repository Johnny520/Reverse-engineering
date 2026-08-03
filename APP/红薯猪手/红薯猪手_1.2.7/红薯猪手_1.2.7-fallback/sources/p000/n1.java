package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends androidx.recyclerview.widget.RecyclerView.Adapter<۟.n1.b> {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int f812 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.List<p000.p0> f813;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public p000.f3<p000.vb> f814;

    public static final class a {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m293() {
                int r0 = p000.n1.f812
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m294() {
                int r0 = p000.n1.f812
                return
        }
    }

    public static final class b extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.TextView f815;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final p000.h8 f816;

        public b(android.view.View r6) {
                r5 = this;
                r0 = 4
                byte[] r0 = new byte[r0]
                r0 = {x0052: FILL_ARRAY_DATA , data: [121, -98, -118, -67} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x0058: FILL_ARRAY_DATA , data: [15, -9, -17, -54, 14, -10} // fill-array
                p000.oa.m332(r0, r2)
                r5.<init>(r6)
                int r0 = p000.n1.f812
                ۟.n1.a.m294()
                android.view.View r0 = r6.findViewById(r1)
                r2 = 17
                byte[] r3 = new byte[r2]
                r3 = {x0060: FILL_ARRAY_DATA , data: [97, -95, -30, 108, -91, -84, 98, -65, -50, 113, -70, -95, 47, -26, -94, 38, -38} // fill-array
                byte[] r4 = new byte[r1]
                r4 = {x006e: FILL_ARRAY_DATA , data: [7, -56, -116, 8, -13, -59} // fill-array
                java.lang.String r3 = p000.oa.m332(r3, r4)
                p000.h4.m188(r3, r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f815 = r0
                ۟.n1.a.m293()
                r0 = 1638(0x666, float:2.295E-42)
                android.view.View r6 = r6.findViewById(r0)
                byte[] r0 = new byte[r2]
                r0 = {x0076: FILL_ARRAY_DATA , data: [18, 91, 56, 29, -82, -110, 17, 69, 20, 0, -79, -97, 92, 28, 120, 87, -47} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0084: FILL_ARRAY_DATA , data: [116, 50, 86, 121, -8, -5} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m188(r0, r6)
                ۟.h8 r6 = (p000.h8) r6
                r5.f816 = r6
                return
        }
    }

    public n1(java.util.List<? extends p000.p0> r3) {
            r2 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-5, -65, 65, 93, -54, 44, -29, -73} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [-105, -42, 50, 41, -114, 77} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            r2.<init>()
            r2.f813 = r3
            return
    }

    public final int getItemCount() {
            r1 = this;
            java.util.List<۟.p0> r0 = r1.f813
            int r0 = r0.size()
            return r0
    }

    public final int getItemViewType(int r2) {
            r1 = this;
            java.util.List<۟.p0> r0 = r1.f813
            java.lang.Object r2 = r0.get(r2)
            ۟.p0 r2 = (p000.p0) r2
            boolean r0 = r2.f876
            if (r0 == 0) goto Le
            r2 = 4
            goto L1f
        Le:
            java.lang.String r0 = r2.f869
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            r2 = 3
            goto L1f
        L18:
            boolean r2 = r2.f870
            if (r2 == 0) goto L1e
            r2 = 2
            goto L1f
        L1e:
            r2 = 1
        L1f:
            return r2
    }

    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
            r4 = this;
            ۟.n1$b r5 = (۟.n1.b) r5
            r0 = 6
            byte[] r1 = new byte[r0]
            r1 = {x0060: FILL_ARRAY_DATA , data: [55, 126, -92, 60, -109, -66} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [95, 17, -56, 88, -10, -52} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            p000.h4.m189(r0, r5)
            java.util.List<۟.p0> r0 = r4.f813
            java.lang.Object r6 = r0.get(r6)
            ۟.p0 r6 = (p000.p0) r6
            android.widget.TextView r0 = r5.f815
            java.lang.CharSequence r1 = r6.f866
            r0.setText(r1)
            java.lang.Boolean r0 = r6.f874
            if (r0 == 0) goto L57
            ۟.h8 r0 = r5.f816
            r1 = 0
            r0.setVisibility(r1)
            ۟.h8 r0 = r5.f816
            r2 = 0
            r0.setOnCheckedChangeListener(r2)
            ۟.h8 r0 = r5.f816
            java.lang.Boolean r2 = r6.f874
            p000.h4.m186(r2)
            boolean r2 = r2.booleanValue()
            r0.m193(r2)
            ۟.h8 r0 = r5.f816
            ۟.y r2 = new ۟.y
            r3 = 1
            r2.<init>(r6, r4, r3)
            r0.setOnCheckedChangeListener(r2)
            android.view.View r0 = r5.itemView
            ۟.m1 r2 = new ۟.m1
            r2.<init>(r5, r6, r1)
            r0.setOnClickListener(r2)
            goto L5e
        L57:
            ۟.h8 r5 = r5.f816
            r6 = 8
            r5.setVisibility(r6)
        L5e:
            return
    }

    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r13, int r14) {
            r12 = this;
            r0 = 6
            byte[] r1 = new byte[r0]
            r1 = {x0102: FILL_ARRAY_DATA , data: [-65, 56, -119, 88, -58, 18} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x010a: FILL_ARRAY_DATA , data: [-49, 89, -5, 61, -88, 102} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r13)
            r1 = -1
            r2 = 4
            if (r14 != r2) goto L46
            android.view.View r14 = new android.view.View
            android.content.Context r13 = r13.getContext()
            r14.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            int r2 = p000.ya.f1208
            r13.<init>(r1, r2)
            r14.setLayoutParams(r13)
            r13 = 7
            byte[] r13 = new byte[r13]
            r13 = {x0112: FILL_ARRAY_DATA , data: [59, 75, -116, -21, -70, 76, 93} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x011a: FILL_ARRAY_DATA , data: [24, 14, -55, -82, -1, 9} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r0)
            int r13 = android.graphics.Color.parseColor(r13)
            r14.setBackgroundColor(r13)
            ۟.n1$b r13 = new ۟.n1$b
            r13.<init>(r14)
            goto L101
        L46:
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            android.content.Context r3 = r13.getContext()
            r2.<init>(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r3.<init>(r1, r4)
            r2.setLayoutParams(r3)
            int r3 = p000.ya.f1208
            int r5 = p000.ya.f1207
            r2.setPadding(r3, r5, r3, r5)
            android.graphics.drawable.StateListDrawable r6 = new android.graphics.drawable.StateListDrawable
            r6.<init>()
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>(r1)
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            int r1 = p000.tb.m424(r1)
            r8.<init>(r1)
            r1 = 1
            int[] r9 = new int[r1]
            r10 = 16842919(0x10100a7, float:2.3694026E-38)
            r11 = 0
            r9[r11] = r10
            r6.addState(r9, r8)
            int[] r1 = new int[r1]
            r8 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            r1[r11] = r8
            r6.addState(r1, r7)
            r2.setBackground(r6)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r6 = r13.getContext()
            r1.<init>(r6)
            r1.setId(r0)
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setTextColor(r0)
            float r0 = p000.ya.f1209
            r1.setTextSize(r0)
            r0 = 16
            r1.setGravity(r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r6 = p000.ya.f1212
            r0.<init>(r4, r6)
            r4 = 9
            r0.addRule(r4)
            r1.setLayoutParams(r0)
            r2.addView(r1)
            ۟.h8 r0 = new ۟.h8
            android.content.Context r13 = r13.getContext()
            r0.<init>(r13)
            r13 = 1638(0x666, float:2.295E-42)
            r0.setId(r13)
            r0.setCircle(r11)
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
            r4 = 1101004800(0x41a00000, float:20.0)
            int r6 = p000.tb.m427(r4)
            int r4 = p000.tb.m427(r4)
            r13.<init>(r6, r4)
            r4 = 11
            r13.addRule(r4)
            int r4 = p000.ya.f1217
            int r6 = p000.ya.f1216
            r13.setMargins(r11, r4, r6, r11)
            r0.setLayoutParams(r13)
            r2.addView(r0)
            r13 = 2
            if (r14 != r13) goto Lfc
            r14 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r14)
            int r14 = p000.ya.f1215
            r1.setTextColor(r14)
            int r5 = r5 / r13
            r2.setPadding(r3, r5, r3, r5)
        Lfc:
            ۟.n1$b r13 = new ۟.n1$b
            r13.<init>(r2)
        L101:
            return r13
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m292(۟.d0.a r1) {
            r0 = this;
            r0.f814 = r1
            return
    }
}
