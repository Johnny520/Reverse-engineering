package a;

/* JADX INFO: renamed from: a.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0379t implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f690a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C0379t(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f690a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0379t(top.mmjz.floatingclouds.plugin.IPlugin r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f690a = r3
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r11) {
            r10 = this;
            r0 = 8
            r1 = 3
            r2 = 1
            r3 = 0
            java.lang.String r4 = "chain"
            r5 = 0
            int r6 = r10.f690a
            switch(r6) {
                case 0: goto L29b;
                case 1: goto L280;
                case 2: goto L197;
                case 3: goto Lf2;
                case 4: goto Lb3;
                case 5: goto L84;
                case 6: goto L5f;
                case 7: goto L2c;
                case 8: goto L18;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r10.b
            top.mmjz.floatingclouds.XposedEntry r0 = (top.mmjz.floatingclouds.XposedEntry) r0
            java.lang.reflect.Executable r11 = (java.lang.reflect.Executable) r11
            io.github.libxposed.api.XposedInterface$HookBuilder r11 = top.mmjz.floatingclouds.XposedEntry.f(r0, r11)
            return r11
        L18:
            a.fd r11 = (a.C0143fd) r11
            java.lang.String r0 = "ctx"
            a.C0193i9.e(r11, r0)
            a.Cd r0 = a.Cd.f49a
            java.lang.Object r1 = r10.b
            a.qb r1 = (a.C0338qb) r1
            a.gd r11 = r0.b(r1, r11)
            java.lang.Class<?> r11 = r11.b
            return r11
        L2c:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r0 = r10.b
            a.ya r0 = (a.C0480ya) r0
            a.Z7 r0 = r0.f770a
            java.lang.Object r1 = r0.f371a
            java.util.regex.Matcher r1 = (java.util.regex.Matcher) r1
            int r2 = r1.start(r11)
            int r1 = r1.end(r11)
            a.f9 r1 = a.Oc.D(r2, r1)
            int r2 = r1.f434a
            if (r2 < 0) goto L5e
            a.wa r5 = new a.wa
            java.lang.Object r0 = r0.f371a
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r11 = r0.group(r11)
            java.lang.String r0 = "group(...)"
            a.C0193i9.d(r11, r0)
            r5.<init>(r11, r1)
        L5e:
            return r5
        L5f:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r10.b
            android.content.Intent r0 = (android.content.Intent) r0
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L6f
            java.lang.Object r5 = r0.get(r11)
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = "="
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = r0.toString()
            return r11
        L84:
            io.github.libxposed.api.XposedInterface$Chain r11 = (io.github.libxposed.api.XposedInterface.Chain) r11
            a.C0193i9.e(r11, r4)
            java.lang.Object r0 = r11.proceed()
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            boolean r1 = a.K3.a.l()
            if (r1 == 0) goto Lb2
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.d
            if (r1 == 0) goto Lb2
            java.lang.Object r11 = r11.getThisObject()
            boolean r1 = r11 instanceof android.app.Activity
            if (r1 == 0) goto Lab
            r5 = r11
            android.app.Activity r5 = (android.app.Activity) r5
        Lab:
            if (r5 == 0) goto Lb2
            java.lang.Object r11 = r10.b
            a.A8.c(r5, r11)
        Lb2:
            return r0
        Lb3:
            io.github.libxposed.api.XposedInterface$Chain r11 = (io.github.libxposed.api.XposedInterface.Chain) r11
            a.C0193i9.e(r11, r4)
            r11.proceed()
            java.lang.Object r11 = r11.getThisObject()
            boolean r4 = r11 instanceof android.app.Activity
            if (r4 == 0) goto Lc6
            android.app.Activity r11 = (android.app.Activity) r11
            goto Lc7
        Lc6:
            r11 = r5
        Lc7:
            if (r11 == 0) goto Ld4
            android.view.Window r11 = r11.getWindow()
            if (r11 == 0) goto Ld4
            android.view.View r11 = r11.getDecorView()
            goto Ld5
        Ld4:
            r11 = r5
        Ld5:
            if (r11 == 0) goto Lf1
            long[] r4 = new long[r1]
            r4 = {x02c0: FILL_ARRAY_DATA , data: [200, 600, 1200} // fill-array
        Ldc:
            java.lang.Object r6 = r10.b
            a.u8 r6 = (a.C0406u8) r6
            if (r3 >= r1) goto Lee
            r7 = r4[r3]
            a.P0 r9 = new a.P0
            r9.<init>(r6, r0, r11)
            r11.postDelayed(r9, r7)
            int r3 = r3 + r2
            goto Ldc
        Lee:
            r6.c(r11)
        Lf1:
            return r5
        Lf2:
            io.github.libxposed.api.XposedInterface$Chain r11 = (io.github.libxposed.api.XposedInterface.Chain) r11
            a.C0193i9.e(r11, r4)
            java.lang.Object r1 = r10.b
            a.r8 r1 = (a.C0352r8) r1
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            boolean r4 = a.K3.a.l()
            if (r4 == 0) goto L192
            a.jc r4 = a.K3.a.i()
            boolean r4 = r4.f532a
            if (r4 == 0) goto L192
            java.lang.Object r4 = r11.getThisObject()
            java.lang.String r6 = "data"
            java.lang.Object r4 = a.A1.h(r4, r6)
            boolean r6 = r4 instanceof java.util.ArrayList
            if (r6 == 0) goto L11f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            goto L120
        L11f:
            r4 = r5
        L120:
            if (r4 != 0) goto L128
            java.lang.Object r5 = r11.proceed()
            goto L196
        L128:
            java.util.List r6 = r11.getArgs()
            java.lang.Object r2 = r6.get(r2)
            boolean r6 = r2 instanceof java.lang.Integer
            if (r6 == 0) goto L137
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L138
        L137:
            r2 = r5
        L138:
            if (r2 == 0) goto L18d
            int r2 = r2.intValue()
            if (r2 < 0) goto L188
            int r6 = r4.size()
            if (r2 < r6) goto L147
            goto L188
        L147:
            java.lang.Object r2 = r4.get(r2)
            if (r2 != 0) goto L152
            java.lang.Object r5 = r11.proceed()
            goto L196
        L152:
            r11.proceed()
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L196
            java.util.List r11 = r11.getArgs()
            java.lang.Object r11 = r11.get(r3)
            if (r11 != 0) goto L166
            goto L196
        L166:
            java.lang.String r1 = "itemView"
            java.lang.Object r11 = a.A1.h(r11, r1)
            boolean r1 = r11 instanceof android.view.View
            if (r1 == 0) goto L173
            android.view.View r11 = (android.view.View) r11
            goto L174
        L173:
            r11 = r5
        L174:
            if (r11 != 0) goto L177
            goto L196
        L177:
            r11.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 == 0) goto L196
            r0.height = r3
            r0.width = r3
            r11.setLayoutParams(r0)
            goto L196
        L188:
            java.lang.Object r5 = r11.proceed()
            goto L196
        L18d:
            java.lang.Object r5 = r11.proceed()
            goto L196
        L192:
            java.lang.Object r5 = r11.proceed()
        L196:
            return r5
        L197:
            java.lang.Object r0 = r10.b
            a.J8 r0 = (a.J8) r0
            io.github.libxposed.api.XposedInterface$Chain r11 = (io.github.libxposed.api.XposedInterface.Chain) r11
            a.C0193i9.e(r11, r4)
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            boolean r1 = a.K3.a.l()
            if (r1 != 0) goto L1b1
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L1b1:
            boolean r1 = a.K3.a.k()
            if (r1 == 0) goto L1bd
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L1bd:
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.s
            if (r1 != 0) goto L1cb
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L1cb:
            java.util.ArrayList r1 = a.K3.a.f()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1db
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L1db:
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            if (r1 != 0) goto L27b
            boolean r1 = a.C0366s4.F
            if (r1 == 0) goto L1ed
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L1ed:
            java.lang.String r1 = "com.tencent.mm.ui.chatting.ChattingUIProxy"
            java.lang.ClassLoader r4 = r0.f136a     // Catch: java.lang.Throwable -> L228
            java.lang.Class r1 = a.A1.b(r4, r1)     // Catch: java.lang.Throwable -> L228
            if (r1 != 0) goto L1f9
            goto L25b
        L1f9:
            java.lang.String r4 = "com.tencent.mm.ui.chatting.BaseChattingUIFragment"
            java.lang.ClassLoader r0 = r0.f136a     // Catch: java.lang.Throwable -> L228
            java.lang.Class r0 = a.A1.b(r0, r4)     // Catch: java.lang.Throwable -> L228
            if (r0 != 0) goto L204
            goto L25b
        L204:
            java.lang.reflect.Field r0 = a.A1.c(r1, r0)     // Catch: java.lang.Throwable -> L228
            if (r0 != 0) goto L20b
            goto L25b
        L20b:
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L228
            java.lang.Object r1 = r11.getThisObject()     // Catch: java.lang.Throwable -> L228
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L228
            if (r0 != 0) goto L219
            goto L25b
        L219:
            java.lang.String r1 = "getArguments"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L228
            java.lang.Object r1 = a.A1.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L228
            boolean r2 = r1 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L228
            if (r2 == 0) goto L22a
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Throwable -> L228
            goto L22b
        L228:
            r0 = move-exception
            goto L25e
        L22a:
            r1 = r5
        L22b:
            if (r1 != 0) goto L22e
            goto L25b
        L22e:
            java.lang.String r2 = "Chat_User"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L228
            if (r1 == 0) goto L25b
            boolean r2 = a.Be.P(r1)     // Catch: java.lang.Throwable -> L228
            if (r2 == 0) goto L23d
            goto L25b
        L23d:
            java.util.concurrent.ExecutorService r2 = a.fh.G     // Catch: java.lang.Throwable -> L228
            boolean r1 = a.fh.a.a(r1)     // Catch: java.lang.Throwable -> L228
            if (r1 == 0) goto L25b
            java.lang.String r1 = "getActivity"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L228
            java.lang.Object r0 = a.A1.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L228
            boolean r1 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L228
            if (r1 == 0) goto L254
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L228
            goto L255
        L254:
            r0 = r5
        L255:
            if (r0 == 0) goto L27f
            r0.finish()     // Catch: java.lang.Throwable -> L228
            goto L27f
        L25b:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L228
            goto L262
        L25e:
            a.wd$a r0 = a.C0465xd.a(r0)
        L262:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L276
            java.lang.String r1 = "blockEnterChat: onEnterBegin error"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
        L276:
            java.lang.Object r5 = r11.proceed()
            goto L27f
        L27b:
            java.lang.Object r5 = r11.proceed()
        L27f:
            return r5
        L280:
            java.lang.Object r0 = r10.b
            java.lang.Class r0 = (java.lang.Class) r0
            io.github.libxposed.api.XposedInterface$Chain r11 = (io.github.libxposed.api.XposedInterface.Chain) r11
            a.C0193i9.e(r11, r4)
            java.lang.Object r1 = r11.proceed()
            java.lang.Object r2 = r11.getThisObject()
            if (r2 == 0) goto L29a
            java.lang.Object r11 = r11.getThisObject()
            r0.isInstance(r11)
        L29a:
            return r1
        L29b:
            java.lang.Object r0 = r10.b
            a.u r0 = (a.AbstractC0397u) r0
            if (r11 != r0) goto L2a4
            java.lang.String r11 = "(this Collection)"
            goto L2a8
        L2a4:
            java.lang.String r11 = java.lang.String.valueOf(r11)
        L2a8:
            return r11
    }
}
