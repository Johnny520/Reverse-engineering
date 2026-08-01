package p000;

/* JADX INFO: renamed from: lg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0511lg implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6616;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0511lg(int r1) {
            r0 = this;
            r0.f6616 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            int r2 = r2.f6616
            r3.getClass()
            switch(r2) {
                case 0: goto L26;
                case 1: goto L20;
                case 2: goto L1a;
                case 3: goto Ld;
                case 4: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            p000.cp0.m1602(r3)
            return
        Ld:
            android.os.Handler r2 = p000.AbstractC0871ug.f10780
            jb r0 = new jb
            r1 = 18
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L1a:
            tg r2 = p000.AbstractC0871ug.f10771
            r2.m5705(r3)
            return
        L20:
            tg r2 = p000.AbstractC0871ug.f10771
            r2.m5705(r3)
            return
        L26:
            tg r2 = p000.AbstractC0871ug.f10771
            java.lang.String r0 = "attached"
            r2.m5706(r3, r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            int r0 = r3.f6616
            r4.getClass()
            switch(r0) {
                case 0: goto L58;
                case 1: goto L50;
                case 2: goto L48;
                case 3: goto L3c;
                case 4: goto L2e;
                default: goto L8;
            }
        L8:
            r4.removeOnAttachStateChangeListener(r3)
            java.util.concurrent.atomic.AtomicReference r3 = p000.a01.f6
            java.lang.Object r0 = r3.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r2 = r0.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 != r4) goto L2d
        L20:
            boolean r4 = r3.compareAndSet(r0, r1)
            if (r4 == 0) goto L27
            goto L2d
        L27:
            java.lang.Object r4 = r3.get()
            if (r4 == r0) goto L20
        L2d:
            return
        L2e:
            java.util.Set r3 = p000.cp0.f2706
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            wk0 r0 = new wk0
            r1 = 2
            r0.<init>(r4, r1)
            p000.AbstractC0984xh.m6652(r3, r0)
            return
        L3c:
            android.os.Handler r3 = p000.AbstractC0871ug.f10780
            s0 r4 = new s0
            r0 = 6
            r4.<init>(r0)
            r3.post(r4)
            return
        L48:
            r3 = 2131618538(0x7f0deaea, float:1.886409E38)
            r0 = 0
            r4.setTag(r3, r0)
            return
        L50:
            r3 = 2131618538(0x7f0deaea, float:1.886409E38)
            r0 = 0
            r4.setTag(r3, r0)
            return
        L58:
            r3 = 2131618533(0x7f0deae5, float:1.8864079E38)
            r0 = 0
            r4.setTag(r3, r0)
            return
    }
}
