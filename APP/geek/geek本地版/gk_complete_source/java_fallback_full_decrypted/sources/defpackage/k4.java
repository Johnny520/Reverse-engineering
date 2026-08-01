package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ k4(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r4 = this;
            int r0 = r4.a
            java.lang.Object r1 = r4.b
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L68;
                case 2: goto L28;
                default: goto L7;
            }
        L7:
            q40 r1 = (defpackage.q40) r1
            bv r0 = r1.h
            boolean r2 = r1.b()
            if (r2 == 0) goto L27
            boolean r2 = r0.y
            if (r2 != 0) goto L27
            android.view.View r2 = r1.m
            if (r2 == 0) goto L24
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L20
            goto L24
        L20:
            r0.f()
            goto L27
        L24:
            r1.dismiss()
        L27:
            return
        L28:
            t8 r1 = (defpackage.t8) r1
            java.util.ArrayList r0 = r1.h
            boolean r2 = r1.b()
            if (r2 == 0) goto L67
            int r2 = r0.size()
            if (r2 <= 0) goto L67
            r2 = 0
            java.lang.Object r3 = r0.get(r2)
            s8 r3 = (defpackage.s8) r3
            bv r3 = r3.a
            boolean r3 = r3.y
            if (r3 != 0) goto L67
            android.view.View r3 = r1.o
            if (r3 == 0) goto L64
            boolean r3 = r3.isShown()
            if (r3 != 0) goto L50
            goto L64
        L50:
            int r1 = r0.size()
        L54:
            if (r2 >= r1) goto L67
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            s8 r3 = (defpackage.s8) r3
            bv r3 = r3.a
            r3.f()
            goto L54
        L64:
            r1.dismiss()
        L67:
            return
        L68:
            s4 r1 = (defpackage.s4) r1
            v4 r0 = r1.G
            r1.getClass()
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r2 = defpackage.v90.b(r0)
            if (r2 == 0) goto L86
            android.graphics.Rect r2 = r1.E
            boolean r0 = r0.getGlobalVisibleRect(r2)
            if (r0 == 0) goto L86
            r1.s()
            r1.f()
            goto L89
        L86:
            r1.dismiss()
        L89:
            return
        L8a:
            v4 r1 = (defpackage.v4) r1
            u4 r0 = r1.getInternalPopup()
            boolean r0 = r0.b()
            if (r0 != 0) goto La3
            u4 r0 = r1.f
            int r2 = defpackage.m4.b(r1)
            int r3 = defpackage.m4.a(r1)
            r0.e(r2, r3)
        La3:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            if (r0 == 0) goto Lac
            defpackage.l4.a(r0, r4)
        Lac:
            return
    }
}
