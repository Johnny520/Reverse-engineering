package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ut<S> extends defpackage.px {
    public int S;
    public defpackage.c8 T;
    public defpackage.zv U;
    public int V;
    public defpackage.d4 W;
    public androidx.recyclerview.widget.RecyclerView X;
    public androidx.recyclerview.widget.RecyclerView Y;
    public android.view.View Z;
    public android.view.View a0;
    public android.view.View b0;
    public android.view.View c0;

    public ut() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void D(defpackage.zv r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.Y
            fz r0 = r0.getAdapter()
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.c) r0
            c8 r1 = r0.c
            zv r1 = r1.a
            int r1 = r1.d(r7)
            zv r2 = r6.U
            c8 r0 = r0.c
            zv r0 = r0.a
            int r0 = r0.d(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L27
            r2 = r5
            goto L28
        L27:
            r2 = r4
        L28:
            if (r0 <= 0) goto L2b
            r4 = r5
        L2b:
            r6.U = r7
            if (r2 == 0) goto L44
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r7 = r6.Y
            int r0 = r1 + (-3)
            r7.Y(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.Y
            e8 r0 = new e8
            r2 = 2
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
        L44:
            if (r2 == 0) goto L59
            androidx.recyclerview.widget.RecyclerView r7 = r6.Y
            int r0 = r1 + 3
            r7.Y(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.Y
            e8 r0 = new e8
            r2 = 2
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
        L59:
            androidx.recyclerview.widget.RecyclerView r7 = r6.Y
            e8 r0 = new e8
            r2 = 2
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
    }

    public final void E(int r5) {
            r4 = this;
            r4.V = r5
            r0 = 2
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L3b
            androidx.recyclerview.widget.RecyclerView r5 = r4.X
            nz r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.X
            fz r0 = r0.getAdapter()
            fd0 r0 = (defpackage.fd0) r0
            zv r3 = r4.U
            int r3 = r3.c
            ut r0 = r0.c
            c8 r0 = r0.T
            zv r0 = r0.a
            int r0 = r0.c
            int r3 = r3 - r0
            r5.l0(r3)
            android.view.View r5 = r4.b0
            r5.setVisibility(r2)
            android.view.View r5 = r4.c0
            r5.setVisibility(r1)
            android.view.View r5 = r4.Z
            r5.setVisibility(r1)
            android.view.View r5 = r4.a0
            r5.setVisibility(r1)
            return
        L3b:
            r0 = 1
            if (r5 != r0) goto L57
            android.view.View r5 = r4.b0
            r5.setVisibility(r1)
            android.view.View r5 = r4.c0
            r5.setVisibility(r2)
            android.view.View r5 = r4.Z
            r5.setVisibility(r2)
            android.view.View r5 = r4.a0
            r5.setVisibility(r2)
            zv r5 = r4.U
            r4.D(r5)
        L57:
            return
    }

    @Override // defpackage.ml
    public final void m(android.os.Bundle r2) {
            r1 = this;
            super.m(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.S = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            c8 r0 = (defpackage.c8) r0
            r1.T = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            zv r2 = (defpackage.zv) r2
            r1.U = r2
            return
        L34:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
        L3a:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }

    @Override // defpackage.ml
    public final android.view.View n(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
            r11 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r11.h()
            int r2 = r11.S
            r0.<init>(r1, r2)
            d4 r1 = new d4
            r1.<init>(r0)
            r11.W = r1
            android.view.LayoutInflater r12 = r12.cloneInContext(r0)
            c8 r1 = r11.T
            zv r1 = r1.a
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = defpackage.bu.G(r0, r2)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L2a
            r3 = 2131492943(0x7f0c004f, float:1.8609352E38)
            r6 = r5
            goto L2e
        L2a:
            r3 = 2131492938(0x7f0c004a, float:1.8609342E38)
            r6 = r4
        L2e:
            android.view.View r12 = r12.inflate(r3, r13, r4)
            android.content.Context r13 = r11.z()
            android.content.res.Resources r13 = r13.getResources()
            r3 = 2131165830(0x7f070286, float:1.7945888E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r7 = 2131165831(0x7f070287, float:1.794589E38)
            int r7 = r13.getDimensionPixelOffset(r7)
            int r7 = r7 + r3
            r3 = 2131165829(0x7f070285, float:1.7945886E38)
            int r3 = r13.getDimensionPixelOffset(r3)
            int r3 = r3 + r7
            r7 = 2131165814(0x7f070276, float:1.7945856E38)
            int r7 = r13.getDimensionPixelSize(r7)
            int r8 = defpackage.aw.d
            r9 = 2131165809(0x7f070271, float:1.7945846E38)
            int r9 = r13.getDimensionPixelSize(r9)
            int r9 = r9 * r8
            int r8 = r8 - r5
            r10 = 2131165828(0x7f070284, float:1.7945884E38)
            int r10 = r13.getDimensionPixelOffset(r10)
            int r10 = r10 * r8
            int r10 = r10 + r9
            r8 = 2131165806(0x7f07026e, float:1.794584E38)
            int r13 = r13.getDimensionPixelOffset(r8)
            int r3 = r3 + r7
            int r3 = r3 + r10
            int r3 = r3 + r13
            r12.setMinimumHeight(r3)
            r13 = 2131296503(0x7f0900f7, float:1.8210925E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.GridView r13 = (android.widget.GridView) r13
            qt r3 = new qt
            r7 = 0
            r3.<init>(r7)
            defpackage.ja0.l(r13, r3)
            c8 r3 = r11.T
            int r3 = r3.e
            df r7 = new df
            if (r3 <= 0) goto L97
            r7.<init>(r3)
            goto L9a
        L97:
            r7.<init>()
        L9a:
            r13.setAdapter(r7)
            int r1 = r1.d
            r13.setNumColumns(r1)
            r13.setEnabled(r4)
            r13 = 2131296506(0x7f0900fa, float:1.821093E38)
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r11.Y = r13
            rt r13 = new rt
            r13.<init>(r11, r6, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.Y
            r1.setLayoutManager(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.Y
            java.lang.String r1 = "MONTHS_VIEW_GROUP_TAG"
            r13.setTag(r1)
            com.google.android.material.datepicker.c r13 = new com.google.android.material.datepicker.c
            c8 r1 = r11.T
            l0 r3 = new l0
            r4 = 19
            r3.<init>(r4, r11)
            r13.<init>(r0, r1, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r11.Y
            r1.setAdapter(r13)
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131361842(0x7f0a0032, float:1.8343448E38)
            int r1 = r1.getInteger(r3)
            r3 = 2131296509(0x7f0900fd, float:1.8210937E38)
            android.view.View r4 = r12.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r11.X = r4
            if (r4 == 0) goto L114
            r4.setHasFixedSize(r5)
            androidx.recyclerview.widget.RecyclerView r4 = r11.X
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r1)
            r4.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.X
            fd0 r4 = new fd0
            r4.<init>(r11)
            r1.setAdapter(r4)
            androidx.recyclerview.widget.RecyclerView r1 = r11.X
            st r4 = new st
            r4.<init>()
            r6 = 0
            defpackage.u80.c(r6)
            defpackage.u80.c(r6)
            r1.g(r4)
        L114:
            r1 = 2131296496(0x7f0900f0, float:1.821091E38)
            android.view.View r4 = r12.findViewById(r1)
            if (r4 == 0) goto L191
            android.view.View r1 = r12.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r4 = "SELECTOR_TOGGLE_TAG"
            r1.setTag(r4)
            aa r4 = new aa
            r6 = 2
            r4.<init>(r6, r11)
            defpackage.ja0.l(r1, r4)
            r4 = 2131296498(0x7f0900f2, float:1.8210914E38)
            android.view.View r4 = r12.findViewById(r4)
            r11.Z = r4
            java.lang.String r6 = "NAVIGATION_PREV_TAG"
            r4.setTag(r6)
            r4 = 2131296497(0x7f0900f1, float:1.8210912E38)
            android.view.View r4 = r12.findViewById(r4)
            r11.a0 = r4
            java.lang.String r6 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r6)
            android.view.View r3 = r12.findViewById(r3)
            r11.b0 = r3
            r3 = 2131296502(0x7f0900f6, float:1.8210922E38)
            android.view.View r3 = r12.findViewById(r3)
            r11.c0 = r3
            r11.E(r5)
            zv r3 = r11.U
            java.lang.String r3 = r3.c()
            r1.setText(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r11.Y
            tt r4 = new tt
            r4.<init>(r11, r13, r1)
            r3.h(r4)
            x0 r3 = new x0
            r4 = 2
            r3.<init>(r4, r11)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.a0
            pt r3 = new pt
            r4 = 1
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.Z
            pt r3 = new pt
            r4 = 0
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
        L191:
            boolean r0 = defpackage.bu.G(r0, r2)
            if (r0 != 0) goto L1e4
            hx r0 = new hx
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r11.Y
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            if (r2 != r1) goto L1a3
            goto L1e4
        L1a3:
            w30 r3 = r0.b
            if (r2 == 0) goto L1b4
            java.util.ArrayList r2 = r2.e0
            if (r2 == 0) goto L1ae
            r2.remove(r3)
        L1ae:
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            r4 = 0
            r2.setOnFlingListener(r4)
        L1b4:
            r0.a = r1
            if (r1 == 0) goto L1e4
            pz r1 = r1.getOnFlingListener()
            if (r1 != 0) goto L1dc
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.h(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.setOnFlingListener(r0)
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            android.content.Context r2 = r2.getContext()
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.<init>(r2, r3)
            r0.f()
            goto L1e4
        L1dc:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An instance of OnFlingListener already set."
            r12.<init>(r13)
            throw r12
        L1e4:
            androidx.recyclerview.widget.RecyclerView r0 = r11.Y
            zv r1 = r11.U
            c8 r13 = r13.c
            zv r13 = r13.a
            int r13 = r13.d(r1)
            r0.Y(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.Y
            qt r0 = new qt
            r1 = 1
            r0.<init>(r1)
            defpackage.ja0.l(r13, r0)
            return r12
    }

    @Override // defpackage.ml
    public final void r(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r3.S
            r4.putInt(r0, r1)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            r1 = 0
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            c8 r2 = r3.T
            r4.putParcelable(r0, r2)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            zv r1 = r3.U
            r4.putParcelable(r0, r1)
            return
    }
}
