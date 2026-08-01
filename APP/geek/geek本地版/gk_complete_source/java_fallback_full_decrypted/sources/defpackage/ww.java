package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww implements defpackage.h8 {
    public final defpackage.sl a;
    public final /* synthetic */ androidx.activity.a b;

    public ww(androidx.activity.a r2, defpackage.sl r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "onBackPressedCallback"
            defpackage.ip.o(r0, r3)
            r1.b = r2
            r1.a = r3
            return
    }

    @Override // defpackage.h8
    public final void cancel() {
            r4 = this;
            androidx.activity.a r0 = r4.b
            k6 r1 = r0.b
            sl r2 = r4.a
            r1.remove(r2)
            sl r1 = r0.c
            boolean r1 = defpackage.ip.i(r1, r2)
            r3 = 0
            if (r1 == 0) goto L17
            r2.getClass()
            r0.c = r3
        L17:
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.b
            r0.remove(r4)
            xw r0 = r2.c
            if (r0 == 0) goto L23
            r0.a()
        L23:
            r2.c = r3
            return
    }
}
