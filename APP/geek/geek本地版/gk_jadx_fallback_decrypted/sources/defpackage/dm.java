package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.View b;

    public /* synthetic */ dm(android.view.View r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "6A==\n"
            java.lang.String r1 = "nlpUvfOEITw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r3)
            return
        L11:
            android.view.View r3 = r2.b
            r3.removeOnAttachStateChangeListener(r2)
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.w90.c(r3)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L64;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "ww==\n"
            java.lang.String r1 = "tYESqIBtmwc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r4)
            r0 = 2115043329(0x7e110001, float:4.818452E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.h40
            r2 = 0
            if (r1 == 0) goto L1f
            h40 r0 = (defpackage.h40) r0
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L25
            r0.c()
        L25:
            r0 = 2115043330(0x7e110002, float:4.8184525E37)
            java.lang.Object r4 = r4.getTag(r0)
            boolean r0 = r4 instanceof defpackage.h40
            if (r0 == 0) goto L33
            h40 r4 = (defpackage.h40) r4
            goto L34
        L33:
            r4 = r2
        L34:
            if (r4 == 0) goto L39
            r4.c()
        L39:
            android.view.View r4 = r3.b
            if (r4 == 0) goto L64
            r0 = 2115043331(0x7e110003, float:4.818453E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L4b
            h40 r0 = (defpackage.h40) r0
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L51
            r0.c()
        L51:
            r0 = 2115043332(0x7e110004, float:4.8184535E37)
            java.lang.Object r4 = r4.getTag(r0)
            boolean r0 = r4 instanceof defpackage.h40
            if (r0 == 0) goto L5f
            r2 = r4
            h40 r2 = (defpackage.h40) r2
        L5f:
            if (r2 == 0) goto L64
            r2.c()
        L64:
            return
    }
}
