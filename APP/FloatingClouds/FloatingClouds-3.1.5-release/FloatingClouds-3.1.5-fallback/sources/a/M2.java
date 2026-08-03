package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ M2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f170a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r7.f170a
            switch(r4) {
                case 0: goto L274;
                case 1: goto L26c;
                case 2: goto L264;
                case 3: goto L256;
                case 4: goto L24e;
                case 5: goto L247;
                case 6: goto L23f;
                case 7: goto L22f;
                case 8: goto L177;
                case 9: goto L167;
                case 10: goto L14c;
                case 11: goto L13d;
                case 12: goto L133;
                case 13: goto L10d;
                case 14: goto L105;
                case 15: goto Le3;
                case 16: goto L47;
                case 17: goto L3d;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r7.b
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.String r1 = "WXMaskPlugin: NativeHideService early init done (methodsReady="
            a.Gb r4 = a.Gb.f99a     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            a.Gb.b(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = a.Gb.d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L20
            java.lang.Object r0 = a.Gb.c     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L20
            r2 = r3
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L3c
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L3c
        L3c:
            return
        L3d:
            java.lang.Object r0 = r7.b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.d
            r0.requestLayout()
            return
        L47:
            java.lang.Object r0 = r7.b
            a.Ue r0 = (a.Ue) r0
            boolean r1 = r0.h
            if (r1 == 0) goto Le2
            r0.h = r2
            r0.i = r3
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            int r0 = r0.y
            java.lang.String r1 = "TempUnhideTrigger: long-press triggered (threshold="
            java.lang.String r4 = "ms)"
            java.lang.String r0 = a.C0487z.c(r0, r1, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto Le2
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.x
            if (r0 != 0) goto L7c
            goto Le2
        L7c:
            a.x8 r0 = a.C0460x8.f762a
            a.ca$c r1 = a.C0086ca.c.b
            a.ca$b r4 = a.C0086ca.b.b
            a.ca$b r5 = a.C0086ca.b.f424a
            java.util.Set r5 = java.util.Collections.singleton(r5)
            java.lang.String r6 = "singleton(...)"
            a.C0193i9.d(r5, r6)
            boolean r0 = r0.c(r4, r1, r5)
            if (r0 != 0) goto Lb4
            a.ca$b r0 = a.C0460x8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TempUnhideTrigger: long-press unhide BLOCKED (state="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            goto Le2
        Lb4:
            java.lang.String r0 = "TempUnhideTrigger: long-press unhide triggered"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            android.content.Context r0 = a.C0435w1.p
            if (r0 != 0) goto Lc6
            goto Ldf
        Lc6:
            a.jc r1 = a.K3.a.i()
            boolean r3 = r1.R
            if (r3 == 0) goto Ldf
            java.lang.String r1 = r1.S
            boolean r3 = a.Be.P(r1)
            if (r3 == 0) goto Ld8
            java.lang.String r1 = "刻舟求剑"
        Ld8:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        Ldf:
            a.C0366s4.a.a()
        Le2:
            return
        Le3:
            java.lang.Object r1 = r7.b
            com.google.android.material.sidesheet.SideSheetBehavior$c r1 = (com.google.android.material.sidesheet.SideSheetBehavior.c) r1
            r1.b = r2
            com.google.android.material.sidesheet.SideSheetBehavior r2 = r1.d
            a.zg r3 = r2.i
            if (r3 == 0) goto Lfb
            boolean r3 = r3.f()
            if (r3 == 0) goto Lfb
            int r0 = r1.f1088a
            r1.a(r0)
            goto L104
        Lfb:
            int r3 = r2.h
            if (r3 != r0) goto L104
            int r0 = r1.f1088a
            r2.s(r0)
        L104:
            return
        L105:
            java.lang.Object r0 = r7.b
            a.Mc r0 = (a.Mc) r0
            r0.f()
            return
        L10d:
            java.lang.Object r0 = r7.b
            androidx.lifecycle.j r0 = (androidx.lifecycle.j) r0
            java.lang.String r1 = "this$0"
            a.C0193i9.e(r0, r1)
            int r1 = r0.b
            androidx.lifecycle.h r2 = r0.f
            if (r1 != 0) goto L123
            r0.c = r3
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE
            r2.f(r1)
        L123:
            int r1 = r0.f936a
            if (r1 != 0) goto L132
            boolean r1 = r0.c
            if (r1 == 0) goto L132
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP
            r2.f(r1)
            r0.d = r3
        L132:
            return
        L133:
            java.lang.String r0 = "保存"
            java.lang.Object r1 = r7.b
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            return
        L13d:
            java.lang.Object r0 = r7.b
            a.h8 r0 = (a.C0174h8) r0
            r0.j()     // Catch: java.lang.Throwable -> L147
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L147
            goto L14b
        L147:
            r0 = move-exception
            a.C0465xd.a(r0)
        L14b:
            return
        L14c:
            java.lang.Object r0 = r7.b
            a.e7 r0 = (a.AbstractC0119e7) r0
            java.util.ArrayList<a.e7$h> r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L156:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L166
            java.lang.Object r1 = r0.next()
            a.e7$h r1 = (a.AbstractC0119e7.h) r1
            r1.getClass()
            goto L156
        L166:
            return
        L167:
            java.lang.Object r0 = r7.b
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            a.q7 r2 = r0.P
            android.os.Bundle r3 = r0.d
            a.Kd r2 = r2.e
            r2.b(r3)
            r0.d = r1
            return
        L177:
            java.lang.Object r1 = r7.b
            androidx.emoji2.text.e$b r1 = (androidx.emoji2.text.e.b) r1
            java.lang.String r3 = "fetchFonts result is not OK. ("
            java.lang.Object r4 = r1.d
            monitor-enter(r4)
            androidx.emoji2.text.c$h r5 = r1.h     // Catch: java.lang.Throwable -> L187
            if (r5 != 0) goto L18a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L187
            goto L22a
        L187:
            r0 = move-exception
            goto L22d
        L18a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L187
            a.T6 r4 = r1.c()     // Catch: java.lang.Throwable -> L19b
            int r5 = r4.e     // Catch: java.lang.Throwable -> L19b
            if (r5 != r0) goto L19e
            java.lang.Object r0 = r1.d     // Catch: java.lang.Throwable -> L19b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L19b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L198
            goto L19e
        L198:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L198
            throw r2     // Catch: java.lang.Throwable -> L19b
        L19b:
            r0 = move-exception
            goto L219
        L19e:
            if (r5 != 0) goto L202
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = a.Af.f16a     // Catch: java.lang.Throwable -> L1fb
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1fb
            androidx.emoji2.text.e$a r0 = r1.c     // Catch: java.lang.Throwable -> L1fb
            android.content.Context r3 = r1.f897a     // Catch: java.lang.Throwable -> L1fb
            r0.getClass()     // Catch: java.lang.Throwable -> L1fb
            a.T6[] r0 = new a.T6[]{r4}     // Catch: java.lang.Throwable -> L1fb
            a.Rf r5 = a.Mf.f178a     // Catch: java.lang.Throwable -> L1fb
            android.graphics.Typeface r0 = r5.b(r3, r0, r2)     // Catch: java.lang.Throwable -> L1fb
            android.content.Context r2 = r1.f897a     // Catch: java.lang.Throwable -> L1fb
            android.net.Uri r3 = r4.f272a     // Catch: java.lang.Throwable -> L1fb
            java.nio.MappedByteBuffer r2 = a.Sf.e(r2, r3)     // Catch: java.lang.Throwable -> L1fb
            if (r2 == 0) goto L1f3
            if (r0 == 0) goto L1f3
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L1ec
            a.kb r3 = new a.kb     // Catch: java.lang.Throwable -> L1ec
            a.jb r2 = a.C0282n9.u(r2)     // Catch: java.lang.Throwable -> L1ec
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1ec
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1fb
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19b
            java.lang.Object r0 = r1.d     // Catch: java.lang.Throwable -> L19b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L19b
            androidx.emoji2.text.c$h r2 = r1.h     // Catch: java.lang.Throwable -> L1e3
            if (r2 == 0) goto L1e5
            r2.b(r3)     // Catch: java.lang.Throwable -> L1e3
            goto L1e5
        L1e3:
            r2 = move-exception
            goto L1ea
        L1e5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e3
            r1.b()     // Catch: java.lang.Throwable -> L19b
            goto L22a
        L1ea:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e3
            throw r2     // Catch: java.lang.Throwable -> L19b
        L1ec:
            r0 = move-exception
            int r2 = a.Af.f16a     // Catch: java.lang.Throwable -> L1fb
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1fb
            throw r0     // Catch: java.lang.Throwable -> L1fb
        L1f3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1fb
            java.lang.String r2 = "Unable to open file."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1fb
            throw r0     // Catch: java.lang.Throwable -> L1fb
        L1fb:
            r0 = move-exception
            int r2 = a.Af.f16a     // Catch: java.lang.Throwable -> L19b
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19b
            throw r0     // Catch: java.lang.Throwable -> L19b
        L202:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19b
            r2.append(r5)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L19b
            throw r0     // Catch: java.lang.Throwable -> L19b
        L219:
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            androidx.emoji2.text.c$h r3 = r1.h     // Catch: java.lang.Throwable -> L224
            if (r3 == 0) goto L226
            r3.a(r0)     // Catch: java.lang.Throwable -> L224
            goto L226
        L224:
            r0 = move-exception
            goto L22b
        L226:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L224
            r1.b()
        L22a:
            return
        L22b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L224
            throw r0
        L22d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L187
            throw r0
        L22f:
            java.lang.Object r0 = r7.b
            a.F5 r0 = (a.F5) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.m = r1
            return
        L23f:
            java.lang.Object r0 = r7.b
            a.s7 r0 = (a.InterfaceC0369s7) r0
            r0.a()
            return
        L247:
            java.lang.Object r0 = r7.b
            a.e4 r0 = (a.C0116e4) r0
            r0.f450a = r1
            return
        L24e:
            java.lang.Object r0 = r7.b
            a.E3 r0 = (a.E3) r0
            a.E3.a(r0)
            return
        L256:
            java.lang.Object r0 = r7.b
            androidx.activity.ComponentActivity$f r0 = (androidx.activity.ComponentActivity.f) r0
            java.lang.Runnable r2 = r0.b
            if (r2 == 0) goto L263
            r2.run()
            r0.b = r1
        L263:
            return
        L264:
            java.lang.Object r0 = r7.b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateMenu()
            return
        L26c:
            java.lang.Object r0 = r7.b
            a.l3 r0 = (a.C0240l3) r0
            r0.t(r3)
            return
        L274:
            java.lang.Object r0 = r7.b
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.W0()
            return
    }
}
