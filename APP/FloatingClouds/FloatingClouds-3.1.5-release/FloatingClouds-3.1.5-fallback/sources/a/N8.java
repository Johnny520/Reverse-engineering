package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N8 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184a;
    public final /* synthetic */ a.R8 b;

    public /* synthetic */ N8(a.R8 r1, int r2) {
            r0 = this;
            r0.f184a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f184a
            io.github.libxposed.api.XposedInterface$Chain r8 = (io.github.libxposed.api.XposedInterface.Chain) r8
            switch(r0) {
                case 0: goto L204;
                case 1: goto L1e8;
                case 2: goto L1c8;
                case 3: goto L1ac;
                case 4: goto L190;
                case 5: goto L174;
                case 6: goto L157;
                case 7: goto L13a;
                case 8: goto L11e;
                case 9: goto L102;
                case 10: goto Le6;
                case 11: goto L68;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            java.lang.Object r0 = r8.getThisObject()
            boolean r1 = r0 instanceof android.widget.PopupWindow
            r2 = 0
            if (r1 == 0) goto L18
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 != 0) goto L20
            java.lang.Object r2 = r8.proceed()
            goto L67
        L20:
            android.view.View r0 = r0.getContentView()
            if (r0 != 0) goto L2b
            java.lang.Object r2 = r8.proceed()
            goto L67
        L2b:
            a.R8 r1 = r7.b
            r1.getClass()
            java.util.ArrayList r0 = a.R8.b(r0)
            r1 = 62
            java.lang.String r3 = " "
            java.lang.String r0 = a.C0383t3.p0(r0, r3, r2, r1)
            java.lang.String[] r1 = a.R8.e
            int r3 = r1.length
            r4 = 0
        L40:
            if (r4 >= r3) goto L63
            r5 = r1[r4]
            r6 = 1
            boolean r5 = a.Be.I(r0, r5, r6)
            if (r5 == 0) goto L60
            boolean r1 = a.C0074bh.b()
            if (r1 == 0) goto L5b
            java.lang.String r8 = "PopupWindow.showAtLocation suppressed text="
            java.lang.String r8 = r8.concat(r0)
            a.R8.r(r8)
            goto L67
        L5b:
            java.lang.Object r2 = r8.proceed()
            goto L67
        L60:
            int r4 = r4 + 1
            goto L40
        L63:
            java.lang.Object r2 = r8.proceed()
        L67:
            return r2
        L68:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            java.lang.Object r0 = r8.getThisObject()
            boolean r1 = r0 instanceof android.app.Dialog
            r2 = 0
            if (r1 == 0) goto L79
            android.app.Dialog r0 = (android.app.Dialog) r0
            goto L7a
        L79:
            r0 = r2
        L7a:
            if (r0 != 0) goto L81
            java.lang.Object r2 = r8.proceed()
            goto Le5
        L81:
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto Le1
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L8e
            goto Le1
        L8e:
            a.R8 r1 = r7.b
            r1.getClass()
            java.util.ArrayList r0 = a.R8.b(r0)
            r1 = 62
            java.lang.String r3 = " "
            java.lang.String r0 = a.C0383t3.p0(r0, r3, r2, r1)
            java.lang.String[] r1 = a.R8.e
            int r3 = r1.length
            r4 = 0
        La3:
            if (r4 >= r3) goto Ldc
            r5 = r1[r4]
            r6 = 1
            boolean r5 = a.Be.I(r0, r5, r6)
            if (r5 == 0) goto Ld9
            java.lang.String r1 = a.C0074bh.a()
            boolean r3 = a.C0074bh.b()
            if (r3 == 0) goto Ld4
            if (r1 == 0) goto Ld4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Dialog.show suppressed for active intercept user="
            r8.<init>(r3)
            r8.append(r1)
            java.lang.String r1 = " text="
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            a.R8.r(r8)
            goto Le5
        Ld4:
            java.lang.Object r2 = r8.proceed()
            goto Le5
        Ld9:
            int r4 = r4 + 1
            goto La3
        Ldc:
            java.lang.Object r2 = r8.proceed()
            goto Le5
        Le1:
            java.lang.Object r2 = r8.proceed()
        Le5:
            return r2
        Le6:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto Lfd
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress Vibrator.vibrate(VibrationEffect)"
            a.R8.r(r8)
            r8 = 0
            goto L101
        Lfd:
            java.lang.Object r8 = r8.proceed()
        L101:
            return r8
        L102:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L119
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress Vibrator.vibrate(long[], int)"
            a.R8.r(r8)
            r8 = 0
            goto L11d
        L119:
            java.lang.Object r8 = r8.proceed()
        L11d:
            return r8
        L11e:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L135
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress Vibrator.vibrate(long)"
            a.R8.r(r8)
            r8 = 0
            goto L139
        L135:
            java.lang.Object r8 = r8.proceed()
        L139:
            return r8
        L13a:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L152
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress ToneGenerator.startTone(int,int)"
            a.R8.r(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L156
        L152:
            java.lang.Object r8 = r8.proceed()
        L156:
            return r8
        L157:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L16f
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress ToneGenerator.startTone(int)"
            a.R8.r(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L173
        L16f:
            java.lang.Object r8 = r8.proceed()
        L173:
            return r8
        L174:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L18b
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress AudioTrack.start"
            a.R8.r(r8)
            r8 = 0
            goto L18f
        L18b:
            java.lang.Object r8 = r8.proceed()
        L18f:
            return r8
        L190:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L1a7
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress AudioTrack.play"
            a.R8.r(r8)
            r8 = 0
            goto L1ab
        L1a7:
            java.lang.Object r8 = r8.proceed()
        L1ab:
            return r8
        L1ac:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L1c3
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress Ringtone.play"
            a.R8.r(r8)
            r8 = 0
            goto L1c7
        L1c3:
            java.lang.Object r8 = r8.proceed()
        L1c7:
            return r8
        L1c8:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L1e3
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress SoundPool.play"
            a.R8.r(r8)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L1e7
        L1e3:
            java.lang.Object r8 = r8.proceed()
        L1e7:
            return r8
        L1e8:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            boolean r0 = a.C0074bh.f()
            if (r0 == 0) goto L1ff
            a.R8 r8 = r7.b
            r8.getClass()
            java.lang.String r8 = "suppress MediaPlayer.start"
            a.R8.r(r8)
            r8 = 0
            goto L203
        L1ff:
            java.lang.Object r8 = r8.proceed()
        L203:
            return r8
        L204:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r8, r0)
            a.R8 r0 = r7.b
            r0.getClass()
            java.lang.Object r8 = a.R8.j(r8)
            return r8
    }
}
