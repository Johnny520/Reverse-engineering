package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0432 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1523;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1524;

    public /* synthetic */ RunnableC0432(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1523 = r1
            r0.f1524 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r1 = r18
            int r0 = r1.f1523
            r2 = 1
            r3 = 8
            r4 = 0
            r5 = -1
            r6 = 0
            switch(r0) {
                case 0: goto L1df;
                case 1: goto L177;
                case 2: goto L16f;
                case 3: goto L15a;
                case 4: goto L152;
                case 5: goto L138;
                case 6: goto L72;
                case 7: goto L40;
                case 8: goto L21;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r1.f1524
            xhss.ᛷᛸᲇᛸ r0 = (xhss.RunnableC0695) r0
            xhss.ᛵᛶᛲᛳ r0 = r0.f2351
            java.lang.Object r0 = r0.f1736
            xhss.ᲀᲀ r0 = (xhss.C0891) r0
            xhss.ᛳᛴᛵ r1 = r0.f2877
            int r1 = r1.f955
            if (r1 <= r5) goto L20
            r0.m1456(r4)
        L20:
            return
        L21:
            java.lang.Object r0 = r1.f1524
            xhss.ᲈᛱᛳᛲ r0 = (xhss.RunnableC1114) r0
            xhss.ᲀᲀ r0 = r0.f3593
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r0.f2871
            if (r1 == 0) goto L2e
            r1.setVisibility(r3)
        L2e:
            xhss.ᛳᛴᛵ r0 = r0.f2877
            java.lang.ref.WeakReference r0 = r0.f959
            if (r0 != 0) goto L35
            goto L3c
        L35:
            java.lang.Object r0 = r0.get()
            r4 = r0
            android.view.View r4 = (android.view.View) r4
        L3c:
            com.kongzue.dialogx.interfaces.AbstractC0001.m42(r4)
            return
        L40:
            java.lang.Object r0 = r1.f1524
            xhss.ᲀᲈᛵᛸ r0 = (xhss.C0915) r0
            java.lang.Object r0 = r0.f2956
            xhss.ᲀᲀ r0 = (xhss.C0891) r0
            xhss.ᛳᛴᛵ r1 = r0.f2877
            android.app.Activity r1 = r1.m54()
            if (r1 != 0) goto L51
            goto L71
        L51:
            xhss.ᛳᛴᛵ r1 = r0.f2877
            xhss.ᛶᲈᛴᛲ r2 = r1.f952
            if (r2 != 0) goto L5f
            xhss.ᛶᲈᛴᛲ r2 = new xhss.ᛶᲈᛴᛲ
            r3 = 2
            r2.<init>(r3, r0)
            r1.f952 = r2
        L5f:
            r2.m1078(r1)
            xhss.ᲁᛲᛸᛴ r1 = new xhss.ᲁᛲᛸᛴ
            r1.<init>()
            r1.m1529()
            xhss.ᛳᛴᛵ r0 = r0.f2877
            xhss.ᛱᛷᛸᲁ r1 = xhss.EnumC0064.f356
            r0.m55(r1)
        L71:
            return
        L72:
            java.lang.Object r0 = r1.f1524
            r3 = r0
            xhss.ᛸᛱᛴᛳ r3 = (xhss.C0723) r3
            monitor-enter(r3)
            int r0 = r3.f2450     // Catch: java.lang.Throwable -> L135
            int r0 = r0 + r2
            r3.f2450 = r0     // Catch: java.lang.Throwable -> L135
            xhss.ᛵᛳᲀᛲ r0 = r3.m1267()     // Catch: java.lang.Throwable -> L135
            monitor-exit(r3)
            if (r0 != 0) goto L86
            goto L12a
        L86:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = r3.getName()
        L8e:
            r5 = r0
            r7 = -1
            java.lang.String r0 = r5.f1638     // Catch: java.lang.Throwable -> Lb2
            r3.setName(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r1.f1524     // Catch: java.lang.Throwable -> Lb2
            xhss.ᛸᛱᛴᛳ r0 = (xhss.C0723) r0     // Catch: java.lang.Throwable -> Lb2
            java.util.logging.Logger r9 = r0.f2443     // Catch: java.lang.Throwable -> Lb2
            xhss.ᲇᲀᲀᛷ r10 = r5.f1637     // Catch: java.lang.Throwable -> Lb2
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = r9.isLoggable(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r11 == 0) goto Lb4
            xhss.ᛸᛱᛴᛳ r0 = r10.f3483     // Catch: java.lang.Throwable -> Lb2
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "starting"
            xhss.AbstractC1178.m1866(r9, r5, r10, r0)     // Catch: java.lang.Throwable -> Lb2
            goto Lb5
        Lb2:
            r0 = move-exception
            goto L115
        Lb4:
            r12 = r7
        Lb5:
            long r14 = r5.mo835()     // Catch: java.lang.Throwable -> Lf2
            if (r11 == 0) goto Ldb
            xhss.ᛸᛱᛴᛳ r0 = r10.f3483     // Catch: java.lang.Throwable -> Lb2
            long r16 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lb2
            long r16 = r16 - r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = "finished run in "
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = xhss.AbstractC1178.m1873(r16)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb2
            xhss.AbstractC1178.m1866(r9, r5, r10, r0)     // Catch: java.lang.Throwable -> Lb2
        Ldb:
            java.lang.Object r0 = r1.f1524     // Catch: java.lang.Throwable -> Lb2
            r9 = r0
            xhss.ᛸᛱᛴᛳ r9 = (xhss.C0723) r9     // Catch: java.lang.Throwable -> Lb2
            monitor-enter(r9)     // Catch: java.lang.Throwable -> Lb2
            r9.m1270(r5, r14, r2)     // Catch: java.lang.Throwable -> Lef
            xhss.ᛵᛳᲀᛲ r0 = r9.m1267()     // Catch: java.lang.Throwable -> Lef
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L8e
        Leb:
            r3.setName(r4)
            goto L12a
        Lef:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lf2:
            r0 = move-exception
            if (r11 == 0) goto L114
            xhss.ᛸᛱᛴᛳ r2 = r10.f3483     // Catch: java.lang.Throwable -> Lb2
            long r14 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lb2
            long r14 = r14 - r12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r2.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = "failed a run in "
            r2.append(r11)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = xhss.AbstractC1178.m1873(r14)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r11)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb2
            xhss.AbstractC1178.m1866(r9, r5, r10, r2)     // Catch: java.lang.Throwable -> Lb2
        L114:
            throw r0     // Catch: java.lang.Throwable -> Lb2
        L115:
            java.lang.Object r1 = r1.f1524     // Catch: java.lang.Throwable -> L12b
            xhss.ᛸᛱᛴᛳ r1 = (xhss.C0723) r1     // Catch: java.lang.Throwable -> L12b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L12b
            r1.m1270(r5, r7, r6)     // Catch: java.lang.Throwable -> L12e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12b
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L12b
            if (r1 == 0) goto L12d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L12b
            r0.interrupt()     // Catch: java.lang.Throwable -> L12b
            goto Leb
        L12a:
            return
        L12b:
            r0 = move-exception
            goto L131
        L12d:
            throw r0     // Catch: java.lang.Throwable -> L12b
        L12e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12b
            throw r0     // Catch: java.lang.Throwable -> L12b
        L131:
            r3.setName(r4)
            throw r0
        L135:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L138:
            java.lang.Object r0 = r1.f1524
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r0
            boolean r1 = r0.f7
            if (r1 == 0) goto L151
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r0, r6)
            r0.f7 = r6
        L151:
            return
        L152:
            java.lang.Object r0 = r1.f1524
            xhss.ᲀᛸᛷᛱ r0 = (xhss.C0885) r0
            r0.mo148()
            return
        L15a:
            java.lang.Object r0 = r1.f1524
            xhss.ᲁᛳᛵᛷ r0 = (xhss.C0935) r0
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r0.f3022
            if (r1 == 0) goto L165
            r1.setVisibility(r3)
        L165:
            xhss.ᛱᛴᛳᛴ r0 = r0.f3025
            android.view.View r0 = r0.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m42(r0)
            return
        L16f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has not been attached to a host."
            r0.<init>(r1)
            throw r0
        L177:
            java.lang.Object r0 = r1.f1524
            r3 = r0
            xhss.ᛵᛱᛲᛶ r3 = (xhss.C0436) r3
        L17c:
            boolean r0 = r3.f1564
            if (r0 == 0) goto L1de
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r3.f1557
            long r7 = r7 - r9
            long r9 = r3.f1556
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L1bb
            float r0 = (float) r7
            float r4 = (float) r9
            float r0 = r0 / r4
            android.view.animation.Interpolator r4 = r3.f1565
            if (r4 == 0) goto L198
            float r0 = r4.getInterpolation(r0)
        L198:
            float r4 = r3.f1563
            float r7 = r3.f1561
            float r7 = r7 - r4
            float r7 = r7 * r0
            float r7 = r7 + r4
            xhss.ᲇᛲᛵ r0 = r3.f1558
            if (r0 == 0) goto L1d2
            android.os.Handler r0 = r3.f1559
            if (r0 != 0) goto L1b2
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            r3.f1559 = r0
        L1b2:
            xhss.ᛴᛸᛲᛶ r4 = new xhss.ᛴᛸᛲᛶ
            r4.<init>(r1, r7)
            r0.post(r4)
            goto L1d2
        L1bb:
            r3.f1564 = r6
            int r0 = r3.f1560
            if (r0 == r5) goto L1c5
            int r4 = r3.f1562
            if (r4 >= r0) goto L1d2
        L1c5:
            int r0 = r3.f1562
            int r0 = r0 + r2
            r3.f1562 = r0
            long r7 = java.lang.System.currentTimeMillis()
            r3.f1557 = r7
            r3.f1564 = r2
        L1d2:
            int r0 = r3.f1566     // Catch: java.lang.InterruptedException -> L1d9
            long r7 = (long) r0     // Catch: java.lang.InterruptedException -> L1d9
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L1d9
            goto L17c
        L1d9:
            r0 = move-exception
            r0.printStackTrace()
            goto L17c
        L1de:
            return
        L1df:
            java.lang.Object r0 = r1.f1524
            xhss.ᛸᛴᛴᛶ r0 = (xhss.DialogInterfaceOnCancelListenerC0751) r0
            xhss.ᛳᛲᛶᛱ r0 = r0.f2521
            r0.getClass()
            return
    }
}
