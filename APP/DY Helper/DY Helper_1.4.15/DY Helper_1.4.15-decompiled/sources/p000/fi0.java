package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3946;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.li0 f3947;

    public /* synthetic */ fi0(p000.ji0 r1, p000.li0 r2) {
            r0 = this;
            r1 = 2
            r0.f3946 = r1
            r0.<init>()
            r0.f3947 = r2
            return
    }

    public /* synthetic */ fi0(p000.li0 r1, int r2) {
            r0 = this;
            r0.f3946 = r2
            r0.f3947 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f3946
            switch(r0) {
                case 0: goto L181;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            li0 r11 = r11.f3947
            vh0 r0 = p000.vh0.f11270     // Catch: java.lang.Throwable -> L11
            java.lang.ClassLoader r11 = r11.f6660     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "conversation_delete_complete"
            r2 = 1
            r0.m6245(r11, r1, r2)     // Catch: java.lang.Throwable -> L11
        L11:
            return
        L12:
            jz r0 = p000.C0450jz.f5672
            li0 r11 = r11.f3947
            java.lang.ClassLoader r1 = r11.f6660
            java.lang.String r2 = ""
            r3 = 0
            r1.getClass()     // Catch: java.lang.Throwable -> La0
            vh0 r4 = p000.vh0.f11270     // Catch: java.lang.Throwable -> La0
            java.util.List r4 = r4.m6243(r1)     // Catch: java.lang.Throwable -> La0
            nz r5 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> La0
            gj0 r6 = new gj0     // Catch: java.lang.Throwable -> La0
            f7 r7 = new f7     // Catch: java.lang.Throwable -> La0
            r8 = 1
            r7.<init>(r8, r4)     // Catch: java.lang.Throwable -> La0
            ej0 r4 = new ej0     // Catch: java.lang.Throwable -> La0
            r8 = 0
            r4.<init>(r1, r5, r8)     // Catch: java.lang.Throwable -> La0
            y30 r4 = p000.us1.m5943(r7, r4)     // Catch: java.lang.Throwable -> La0
            fj0 r5 = new fj0     // Catch: java.lang.Throwable -> La0
            r7 = 0
            r5.<init>(r7)     // Catch: java.lang.Throwable -> La0
            uh0 r7 = new uh0     // Catch: java.lang.Throwable -> La0
            r8 = 2
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La0
            ye r8 = new ye     // Catch: java.lang.Throwable -> La0
            r9 = 16
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> La0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0
            r7.<init>()     // Catch: java.lang.Throwable -> La0
            bu r9 = new bu     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> La0
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> La0
        L59:
            boolean r4 = r9.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L67
            java.lang.Object r4 = r9.next()     // Catch: java.lang.Throwable -> La0
            r7.add(r4)     // Catch: java.lang.Throwable -> La0
            goto L59
        L67:
            p000.AbstractC0019ai.m168(r7, r8)     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r4 = r7.iterator()     // Catch: java.lang.Throwable -> La0
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r5 != 0) goto L76
            r4 = r0
            goto L9c
        L76:
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> La0
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r7 != 0) goto L85
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)     // Catch: java.lang.Throwable -> La0
            goto L9c
        L85:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0
            r7.<init>()     // Catch: java.lang.Throwable -> La0
            r7.add(r5)     // Catch: java.lang.Throwable -> La0
        L8d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> La0
            r7.add(r5)     // Catch: java.lang.Throwable -> La0
            goto L8d
        L9b:
            r4 = r7
        L9c:
            r6.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> La0
            goto La6
        La0:
            r2 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r2)
        La6:
            boolean r2 = r6 instanceof p000.eo1
            r4 = 0
            if (r2 == 0) goto Lac
            r6 = r4
        Lac:
            gj0 r6 = (p000.gj0) r6
            if (r6 == 0) goto Lc1
            java.util.List r2 = r6.f4385
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lc1
            gi0 r2 = new gi0
            r5 = 0
            r2.<init>(r11, r6, r5)
            r11.m3571(r2)
        Lc1:
            η r2 = new η     // Catch: java.lang.Throwable -> L151
            r5 = 12
            r2.<init>(r5, r11)     // Catch: java.lang.Throwable -> L151
            r1.getClass()     // Catch: java.lang.Throwable -> L151
            lj0 r2 = p000.AbstractC0782s1.m5340(r1, r2)     // Catch: java.lang.Throwable -> L151
            gj0 r5 = new gj0     // Catch: java.lang.Throwable -> L151
            java.util.List r7 = r2.f6686     // Catch: java.lang.Throwable -> L151
            java.lang.Object r8 = r2.f6687     // Catch: java.lang.Throwable -> L151
            f7 r9 = new f7     // Catch: java.lang.Throwable -> L151
            r10 = 1
            r9.<init>(r10, r7)     // Catch: java.lang.Throwable -> L151
            ej0 r7 = new ej0     // Catch: java.lang.Throwable -> L151
            r10 = 0
            r7.<init>(r1, r8, r10)     // Catch: java.lang.Throwable -> L151
            y30 r1 = p000.us1.m5943(r9, r7)     // Catch: java.lang.Throwable -> L151
            fj0 r7 = new fj0     // Catch: java.lang.Throwable -> L151
            r8 = 0
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L151
            uh0 r8 = new uh0     // Catch: java.lang.Throwable -> L151
            r9 = 2
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L151
            ye r9 = new ye     // Catch: java.lang.Throwable -> L151
            r10 = 16
            r9.<init>(r10, r8)     // Catch: java.lang.Throwable -> L151
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L151
            r8.<init>()     // Catch: java.lang.Throwable -> L151
            bu r10 = new bu     // Catch: java.lang.Throwable -> L151
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L151
            r10.<init>(r1, r7)     // Catch: java.lang.Throwable -> L151
        L106:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L151
            if (r1 == 0) goto L114
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L151
            r8.add(r1)     // Catch: java.lang.Throwable -> L151
            goto L106
        L114:
            p000.AbstractC0019ai.m168(r8, r9)     // Catch: java.lang.Throwable -> L151
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L151
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L151
            if (r7 != 0) goto L123
            r1 = r0
            goto L149
        L123:
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L151
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L151
            if (r8 != 0) goto L132
            java.util.List r1 = p000.AbstractC1021yh.m6896(r7)     // Catch: java.lang.Throwable -> L151
            goto L149
        L132:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L151
            r8.<init>()     // Catch: java.lang.Throwable -> L151
            r8.add(r7)     // Catch: java.lang.Throwable -> L151
        L13a:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L151
            if (r7 == 0) goto L148
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L151
            r8.add(r7)     // Catch: java.lang.Throwable -> L151
            goto L13a
        L148:
            r1 = r8
        L149:
            boolean r7 = r2.f6689     // Catch: java.lang.Throwable -> L151
            java.lang.String r2 = r2.f6690     // Catch: java.lang.Throwable -> L151
            r5.<init>(r1, r7, r2)     // Catch: java.lang.Throwable -> L151
            goto L157
        L151:
            r1 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r1)
        L157:
            java.lang.Throwable r1 = p000.fo1.m2190(r5)
            if (r1 != 0) goto L15e
            goto L175
        L15e:
            gj0 r5 = new gj0
            if (r6 == 0) goto L164
            java.util.List r4 = r6.f4385
        L164:
            if (r4 != 0) goto L167
            goto L168
        L167:
            r0 = r4
        L168:
            java.lang.String r1 = p000.mi0.m3828(r1)
            java.lang.String r2 = "会话加载失败："
            java.lang.String r1 = r2.concat(r1)
            r5.<init>(r0, r3, r1)
        L175:
            gj0 r5 = (p000.gj0) r5
            gi0 r0 = new gi0
            r1 = 1
            r0.<init>(r11, r5, r1)
            r11.m3571(r0)
            return
        L181:
            li0 r11 = r11.f3947
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f6679
            android.app.Activity r1 = r11.f6659
            android.widget.EditText r2 = r11.f6664
            boolean r0 = r0.get()
            if (r0 != 0) goto L1bc
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L1bc
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L19c
            goto L1bc
        L19c:
            r2.requestFocus()
            r0 = 1
            r2.setCursorVisible(r0)
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r1 = r1.getSystemService(r3)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L1b0
            r1.showSoftInput(r2, r0)
        L1b0:
            w1 r0 = new w1
            r3 = 28
            r0.<init>(r11, r3, r1)
            r3 = 80
            r2.postDelayed(r0, r3)
        L1bc:
            return
    }
}
