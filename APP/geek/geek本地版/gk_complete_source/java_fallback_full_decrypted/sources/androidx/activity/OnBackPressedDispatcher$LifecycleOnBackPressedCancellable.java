package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements defpackage.mq, defpackage.h8 {
    public final androidx.lifecycle.a a;
    public final defpackage.sl b;
    public defpackage.ww c;
    public final /* synthetic */ androidx.activity.a d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(androidx.activity.a r2, androidx.lifecycle.a r3, defpackage.sl r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "onBackPressedCallback"
            defpackage.ip.o(r0, r4)
            r1.d = r2
            r1.a = r3
            r1.b = r4
            r3.a(r1)
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r4, defpackage.iq r5) {
            r3 = this;
            iq r4 = defpackage.iq.ON_START
            if (r5 != r4) goto L2d
            androidx.activity.a r4 = r3.d
            r4.getClass()
            java.lang.String r5 = "onBackPressedCallback"
            sl r0 = r3.b
            defpackage.ip.o(r5, r0)
            k6 r5 = r4.b
            r5.addLast(r0)
            ww r5 = new ww
            r5.<init>(r4, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.b
            r1.add(r5)
            r4.d()
            xw r1 = new xw
            r2 = 1
            r1.<init>(r2, r4)
            r0.c = r1
            r3.c = r5
            return
        L2d:
            iq r4 = defpackage.iq.ON_STOP
            if (r5 != r4) goto L39
            ww r4 = r3.c
            if (r4 == 0) goto L40
            r4.cancel()
            return
        L39:
            iq r4 = defpackage.iq.ON_DESTROY
            if (r5 != r4) goto L40
            r3.cancel()
        L40:
            return
    }

    @Override // defpackage.h8
    public final void cancel() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.a
            r0.f(r1)
            sl r0 = r1.b
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.b
            r0.remove(r1)
            ww r0 = r1.c
            if (r0 == 0) goto L13
            r0.cancel()
        L13:
            r0 = 0
            r1.c = r0
            return
    }
}
