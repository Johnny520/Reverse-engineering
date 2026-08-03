package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f22187a = null;

    static {
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            y1.z2.f22187a = r0
            return
    }

    public static final y1.x2 a(y1.a r7, y1.f1 r8, s0.d r9) {
            java.util.concurrent.atomic.AtomicBoolean r0 = y1.n1.f22016a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            sg.c r0 = sg.j.a(r2, r0, r3)
            sf.i r4 = y1.n0.f22004s
            java.lang.Object r4 = r4.getValue()
            wf.g r4 = (wf.g) r4
            vg.c r4 = qg.v.a(r4)
            c0.m r5 = new c0.m
            r5.<init>(r0, r3)
            r6 = 3
            qg.v.q(r4, r3, r5, r6)
            b1.f r4 = new b1.f
            r5 = 25
            r4.<init>(r0, r5)
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            java.lang.Object r5 = w0.m.f14792i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r4 = tf.m.G1(r5, r4)     // Catch: java.lang.Throwable -> L3c
            w0.m.f14792i = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            w0.m.a()
            goto L3f
        L3c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3f:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L59
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof y1.t
            if (r1 == 0) goto L50
            y1.t r0 = (y1.t) r0
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 == 0) goto L57
            r0.setComposeViewContext(r8)
            goto L5d
        L57:
            r0 = r3
            goto L5d
        L59:
            r7.removeAllViews()
            goto L57
        L5d:
            if (r0 != 0) goto L71
            y1.t r0 = new y1.t
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = y1.z2.f22187a
            r7.addView(r1, r4)
        L71:
            r0.setComposeViewContext(r8)
            y1.f1 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L80
            r8.c()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L80:
            r7 = 2131099778(0x7f060082, float:1.7811919E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof y1.x2
            if (r2 == 0) goto L8e
            r3 = r1
            y1.x2 r3 = (y1.x2) r3
        L8e:
            if (r3 != 0) goto La8
            y1.x2 r3 = new y1.x2
            x1.f2 r1 = new x1.f2
            x1.f0 r2 = r0.getRoot()
            r1.<init>(r2)
            i0.o r2 = r8.f21889b
            i0.q r4 = new i0.q
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        La8:
            r3.f(r9)
            i0.o r7 = r8.f21889b
            y1.y2 r8 = new y1.y2
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
    }
}
