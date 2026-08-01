package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd2 {

    /* JADX INFO: renamed from: α */
    public static final android.view.ViewGroup.LayoutParams f5434 = null;

    static {
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            p000.jd2.f5434 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.hd2 m2955(androidx.compose.p001ui.platform.AbstractComposeView r7, p000.C0693pn r8, p000.C0024an r9) {
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ta0.f10262
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            wc r0 = p000.ln0.m3619(r2, r3, r0)
            h22 r4 = p000.C0345h3.f4544
            java.lang.Object r4 = r4.getValue()
            up r4 = (p000.InterfaceC0880up) r4
            mp r4 = p000.AbstractC1021yh.m6873(r4)
            ne r5 = new ne
            r5.<init>(r0, r3)
            r6 = 3
            p000.ln0.m3610(r4, r3, r5, r6)
            b0 r4 = new b0
            r5 = 10
            r4.<init>(r5, r0)
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            java.lang.Object r5 = p000.ax1.f1368     // Catch: java.lang.Throwable -> L3e
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r4 = p000.AbstractC0984xh.m6650(r4, r5)     // Catch: java.lang.Throwable -> L3e
            p000.ax1.f1368 = r4     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            p000.ax1.m619()
            goto L41
        L3e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L41:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5b
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            if (r1 == 0) goto L52
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 == 0) goto L59
            r0.setComposeViewContext(r8)
            goto L5f
        L59:
            r0 = r3
            goto L5f
        L5b:
            r7.removeAllViews()
            goto L59
        L5f:
            if (r0 != 0) goto L73
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = p000.jd2.f5434
            r7.addView(r1, r4)
        L73:
            r0.setComposeViewContext(r8)
            pn r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L82
            r8.m4554()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L82:
            r7 = 2131297167(0x7f09038f, float:1.8212271E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof p000.hd2
            if (r2 == 0) goto L90
            r3 = r1
            hd2 r3 = (p000.hd2) r3
        L90:
            if (r3 != 0) goto Laa
            hd2 r3 = new hd2
            m6 r1 = new m6
            yp0 r2 = r0.getRoot()
            r1.<init>(r2)
            un r2 = r8.f8597
            zn r4 = new zn
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Laa:
            r3.m2495(r9)
            un r7 = r8.f8597
            id2 r8 = new id2
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
    }
}
