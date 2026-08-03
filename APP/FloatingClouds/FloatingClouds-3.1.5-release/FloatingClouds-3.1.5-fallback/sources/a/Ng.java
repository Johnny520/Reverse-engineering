package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ng implements a.Tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.C0418v2 f190a;
    public final /* synthetic */ a.Rg.a b;

    public Ng(a.C0418v2 r1, a.Rg.a r2) {
            r0 = this;
            r0.<init>()
            r0.f190a = r1
            r0.b = r2
            return
    }

    @Override // a.Tb
    public final a.nh a(android.view.View r17, a.nh r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            a.Rg$a r3 = r0.b
            int r4 = r3.f250a
            a.v2 r5 = r0.f190a
            a.nh$k r6 = r2.f603a
            r7 = 7
            a.a9 r7 = r6.f(r7)
            r8 = 32
            a.a9 r6 = r6.f(r8)
            int r8 = r7.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r5.b
            r9.w = r8
            boolean r8 = a.Rg.a(r1)
            int r10 = r1.getPaddingBottom()
            int r11 = r1.getPaddingLeft()
            int r12 = r1.getPaddingRight()
            boolean r13 = r9.o
            if (r13 == 0) goto L3c
            int r10 = r2.a()
            r9.v = r10
            int r14 = r3.c
            int r10 = r10 + r14
        L3c:
            int r3 = r3.b
            boolean r14 = r9.p
            int r15 = r7.f399a
            if (r14 == 0) goto L4a
            if (r8 == 0) goto L48
            r11 = r3
            goto L49
        L48:
            r11 = r4
        L49:
            int r11 = r11 + r15
        L4a:
            boolean r14 = r9.q
            int r0 = r7.c
            if (r14 == 0) goto L56
            if (r8 == 0) goto L53
            goto L54
        L53:
            r4 = r3
        L54:
            int r12 = r4 + r0
        L56:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.s
            r8 = 1
            if (r4 == 0) goto L69
            int r4 = r3.leftMargin
            if (r4 == r15) goto L69
            r3.leftMargin = r15
            r4 = r8
            goto L6a
        L69:
            r4 = 0
        L6a:
            boolean r14 = r9.t
            if (r14 == 0) goto L75
            int r14 = r3.rightMargin
            if (r14 == r0) goto L75
            r3.rightMargin = r0
            r4 = r8
        L75:
            boolean r0 = r9.u
            if (r0 == 0) goto L82
            int r0 = r3.topMargin
            int r7 = r7.b
            if (r0 == r7) goto L82
            r3.topMargin = r7
            goto L83
        L82:
            r8 = r4
        L83:
            if (r8 == 0) goto L88
            r1.setLayoutParams(r3)
        L88:
            int r0 = r1.getPaddingTop()
            r1.setPadding(r11, r0, r12, r10)
            boolean r0 = r5.f729a
            if (r0 == 0) goto L97
            int r1 = r6.d
            r9.m = r1
        L97:
            if (r13 != 0) goto L9d
            if (r0 == 0) goto L9c
            goto L9d
        L9c:
            return r2
        L9d:
            r9.J()
            return r2
    }
}
