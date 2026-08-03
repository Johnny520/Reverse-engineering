package a;

/* JADX INFO: loaded from: classes.dex */
public final class R8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static final java.lang.String[] c = null;
    public static final java.lang.String[] d = null;
    public static final java.lang.String[] e = null;
    public static final java.lang.String[] f = null;
    public static final java.util.List<java.util.regex.Pattern> g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set<java.lang.String> f244a;
    public volatile boolean b;

    static {
            java.lang.String r0 = "username=(.*?),"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "com.tencent.mm.plugin.voip.widget.VoipNewForegroundService"
            java.lang.String r1 = "com.tencent.mm.plugin.voip.widget.VoipSmallService"
            java.lang.String r2 = "com.tencent.mm.plugin.voip.widget.VoipForegroundService"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            a.R8.c = r0
            java.lang.String r5 = "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog"
            java.lang.String r6 = "com.tencent.mm.plugin.voip.ui.VoipViewFragment"
            java.lang.String r1 = "com.tencent.mm.plugin.voip.ui.VideoActivity"
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity"
            java.lang.String r3 = "com.tencent.mm.plugin.voip.ui.MMSuperAlert"
            java.lang.String r4 = "com.tencent.mm.plugin.voip.widget.InviteRemindDialog"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            a.R8.d = r0
            java.lang.String r10 = "等待接听"
            java.lang.String r11 = "接听"
            java.lang.String r1 = "voip"
            java.lang.String r2 = "call"
            java.lang.String r3 = "incoming"
            java.lang.String r4 = "语音"
            java.lang.String r5 = "视频"
            java.lang.String r6 = "通话"
            java.lang.String r7 = "呼叫"
            java.lang.String r8 = "来电"
            java.lang.String r9 = "邀请你"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            a.R8.e = r0
            java.lang.String r5 = "com.tencent.mm.plugin.voip.video.VoIPRenderTextureView"
            java.lang.String r6 = "com.tencent.mm.plugin.voip.widget.VoipBigIconButton"
            java.lang.String r1 = "com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView"
            java.lang.String r2 = "com.tencent.mm.plugin.voip.widget.BaseSmallView"
            java.lang.String r3 = "com.tencent.mm.plugin.voip.video.MovableVideoView"
            java.lang.String r4 = "com.tencent.mm.plugin.voip.video.NewMovableVideoView"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            a.R8.f = r0
            java.lang.String r0 = "(voip_)?(is_?)?out_?call[=:](true|1|yes)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r2 = "outgoing[=:](true|1|yes)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r1)
            java.lang.String r3 = "is_?caller[=:](true|1|yes)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r1)
            java.lang.String r4 = "(is_?)?from_?me[=:](true|1|yes)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r1)
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[]{r0, r2, r3, r4}
            a.C0294o3.d0(r0)
            java.lang.String r0 = "(is_?)?incoming[=:](true|1|yes)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "(voip_)?in_?call[=:](true|1|yes)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "invite[=:](true|1|yes)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "caller[=:](false|0|no)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "(is_?)?from_?me[=:](false|0|no)"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "is_?ilink_?voip[=:](true|1|yes)"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r0, r1)
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[]{r2, r3, r4, r5, r6, r7}
            java.util.List r0 = a.C0294o3.d0(r0)
            a.R8.g = r0
            return
    }

    public R8() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "com.tencent.mm.plugin.voip.ui.VideoActivity"
            java.lang.String r1 = "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = a.C0282n9.z(r0)
            r2.f244a = r0
            return
    }

    public static java.util.ArrayList a(android.app.Notification r5) {
            java.lang.CharSequence r0 = r5.tickerText
            r1 = 0
            if (r0 == 0) goto La
            java.lang.String r0 = r0.toString()
            goto Lb
        La:
            r0 = r1
        Lb:
            android.os.Bundle r2 = r5.extras
            if (r2 == 0) goto L16
            java.lang.String r3 = "android.title"
            java.lang.String r2 = r2.getString(r3)
            goto L17
        L16:
            r2 = r1
        L17:
            android.os.Bundle r3 = r5.extras
            if (r3 == 0) goto L28
            java.lang.String r4 = "android.text"
            java.lang.CharSequence r3 = r3.getCharSequence(r4)
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.toString()
            goto L29
        L28:
            r3 = r1
        L29:
            android.os.Bundle r5 = r5.extras
            if (r5 == 0) goto L39
            java.lang.String r4 = "android.bigText"
            java.lang.CharSequence r5 = r5.getCharSequence(r4)
            if (r5 == 0) goto L39
            java.lang.String r1 = r5.toString()
        L39:
            java.lang.String[] r5 = new java.lang.String[]{r0, r2, r3, r1}
            java.util.ArrayList r5 = a.N1.c0(r5)
            return r5
    }

    public static java.util.ArrayList b(android.view.View r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c(r1, r0)     // Catch: java.lang.Throwable -> Lb
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r1 = move-exception
            a.C0465xd.a(r1)
            return r0
    }

    public static void c(android.view.View r3, java.util.ArrayList r4) {
            if (r3 != 0) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L15
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r4.add(r3)
            return
        L15:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L20:
            if (r1 >= r0) goto L2c
            android.view.View r2 = r3.getChildAt(r1)
            c(r2, r4)
            int r1 = r1 + 1
            goto L20
        L2c:
            return
    }

    public static java.lang.String d(java.lang.String r5) {
            java.lang.String r0 = "(wxid_[a-zA-Z0-9_-]+|gh_[a-zA-Z0-9]+|\\d+@chatroom|[a-zA-Z0-9_-]+@openim)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r1 = r0.find()
            if (r1 == 0) goto L16
            r5 = 1
            java.lang.String r5 = r0.group(r5)
            return r5
        L16:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            a.C0193i9.d(r5, r0)
            java.lang.String r0 = "qmessage"
            java.lang.String r1 = "filehelper"
            java.lang.String r2 = "weixin"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            r1 = 0
            r2 = r1
        L2d:
            r3 = 3
            if (r2 >= r3) goto L3c
            r3 = r0[r2]
            boolean r4 = a.Be.I(r5, r3, r1)
            if (r4 == 0) goto L39
            return r3
        L39:
            int r2 = r2 + 1
            goto L2d
        L3c:
            r5 = 0
            return r5
    }

    public static java.lang.String e(android.content.Intent r4) {
            java.lang.String r0 = "Voip_User"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.String r1 = "username"
            java.lang.String r1 = r4.getStringExtra(r1)
            java.lang.String r2 = "talker"
            java.lang.String r2 = r4.getStringExtra(r2)
            java.lang.String r3 = "k_username"
            java.lang.String r4 = r4.getStringExtra(r3)
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r2, r4}
            java.util.ArrayList r4 = a.N1.c0(r4)
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = a.yh.a(r1)
            if (r1 == 0) goto L24
            goto L39
        L38:
            r0 = 0
        L39:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static java.lang.Object f(io.github.libxposed.api.XposedInterface.Chain r7) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto L10
            java.lang.Object r7 = r7.proceed()
            return r7
        L10:
            java.util.List r0 = r7.getArgs()
            java.lang.String r1 = "getArgs(...)"
            a.C0193i9.d(r0, r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L22
            r0 = r2
            goto L2c
        L22:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
        L2c:
            boolean r1 = r0 instanceof android.app.Notification
            if (r1 == 0) goto L33
            android.app.Notification r0 = (android.app.Notification) r0
            goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L3b
            java.lang.Object r7 = r7.proceed()
            return r7
        L3b:
            java.util.ArrayList r1 = a(r0)
            java.util.Iterator r3 = r1.iterator()
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r4)
            if (r4 == 0) goto L43
            goto L57
        L56:
            r4 = r2
        L57:
            if (r4 == 0) goto L6b
            java.util.concurrent.ExecutorService r3 = a.fh.G
            boolean r3 = a.fh.a.a(r4)
            if (r3 == 0) goto L6b
            java.lang.String r7 = "intercept notification for hidden user="
            java.lang.String r7 = r7.concat(r4)
            r(r7)
            return r2
        L6b:
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            a.jc r3 = a.K3.a.i()
            boolean r3 = r3.D
            if (r3 != 0) goto L7d
            java.lang.Object r7 = r7.proceed()
            return r7
        L7d:
            boolean r0 = q(r0)
            boolean r3 = a.C0074bh.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "NotificationManager.notify active="
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " isVoip="
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = " texts="
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = " wxidInText="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r(r1)
            boolean r1 = a.C0074bh.b()
            if (r1 == 0) goto Lb7
            if (r0 == 0) goto Lb7
            goto Lcd
        Lb7:
            if (r4 == 0) goto Ld6
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r4)
            if (r0 == 0) goto Ld6
            java.lang.String r7 = "intercept notification containing blacklisted user="
            java.lang.String r7 = r7.concat(r4)
            r(r7)
            a.C0074bh.g(r4)
        Lcd:
            java.lang.String r7 = "suppress VoIP notification"
            r(r7)
            a.C0074bh.e()
            return r2
        Ld6:
            java.lang.Object r7 = r7.proceed()
            return r7
    }

    public static java.lang.Object g(io.github.libxposed.api.XposedInterface.Chain r4) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L6e
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.D
            if (r0 != 0) goto L14
            goto L6e
        L14:
            java.util.List r0 = r4.getArgs()
            java.lang.String r1 = "getArgs(...)"
            a.C0193i9.d(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            boolean r3 = r1 instanceof android.content.Intent
            if (r3 == 0) goto L21
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r0 = r1 instanceof android.content.Intent
            if (r0 == 0) goto L39
            android.content.Intent r1 = (android.content.Intent) r1
            goto L3a
        L39:
            r1 = r2
        L3a:
            if (r1 == 0) goto L69
            java.lang.String r0 = "startActivity"
            s(r0, r1)
            boolean r0 = t(r1)
            if (r0 == 0) goto L69
            android.content.ComponentName r4 = r1.getComponent()
            java.lang.String r0 = u(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "intercept startActivity intent="
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = " extras="
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r(r4)
            return r2
        L69:
            java.lang.Object r4 = r4.proceed()
            return r4
        L6e:
            java.lang.Object r4 = r4.proceed()
            return r4
    }

    public static java.lang.Object h(io.github.libxposed.api.XposedInterface.Chain r4) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L6f
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.D
            if (r0 != 0) goto L14
            goto L6f
        L14:
            java.util.List r0 = r4.getArgs()
            java.lang.String r1 = "getArgs(...)"
            a.C0193i9.d(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            boolean r3 = r1 instanceof android.content.Intent
            if (r3 == 0) goto L21
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r0 = r1 instanceof android.content.Intent
            if (r0 == 0) goto L39
            r2 = r1
            android.content.Intent r2 = (android.content.Intent) r2
        L39:
            if (r2 == 0) goto L6a
            java.lang.String r0 = "startService/startForegroundService/bindService"
            s(r0, r2)
            boolean r0 = t(r2)
            if (r0 == 0) goto L6a
            android.content.ComponentName r4 = r2.getComponent()
            java.lang.String r0 = u(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "intercept startService/startForegroundService/bindService intent="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " extras="
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r(r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L6a:
            java.lang.Object r4 = r4.proceed()
            return r4
        L6f:
            java.lang.Object r4 = r4.proceed()
            return r4
    }

    public static java.lang.Object j(io.github.libxposed.api.XposedInterface.Chain r13) {
            r0 = 1
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            boolean r1 = a.K3.a.l()
            if (r1 == 0) goto L1dc
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.D
            if (r1 != 0) goto L16
            goto L1dc
        L16:
            java.util.List r1 = r13.getArgs()
            java.lang.String r2 = "getArgs(...)"
            a.C0193i9.d(r1, r2)
            r3 = 0
            java.lang.Object r1 = a.C0383t3.o0(r1, r3)
            boolean r4 = r1 instanceof android.view.View
            r5 = 0
            if (r4 == 0) goto L2c
            android.view.View r1 = (android.view.View) r1
            goto L2d
        L2c:
            r1 = r5
        L2d:
            if (r1 != 0) goto L34
            java.lang.Object r13 = r13.proceed()
            return r13
        L34:
            java.util.List r4 = r13.getArgs()
            a.C0193i9.d(r4, r2)
            java.lang.Object r2 = a.C0383t3.o0(r4, r0)
            boolean r4 = r2 instanceof android.view.WindowManager.LayoutParams
            if (r4 == 0) goto L46
            android.view.WindowManager$LayoutParams r2 = (android.view.WindowManager.LayoutParams) r2
            goto L47
        L46:
            r2 = r5
        L47:
            if (r2 != 0) goto L4e
            java.lang.Object r13 = r13.proceed()
            return r13
        L4e:
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String[] r6 = a.R8.f
            int r7 = r6.length
            r8 = r3
        L5a:
            if (r8 >= r7) goto L7e
            r9 = r6[r8]
            boolean r10 = r4.equals(r9)
            if (r10 != 0) goto La1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "$"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            boolean r9 = a.Ae.H(r4, r9, r3)
            if (r9 == 0) goto L7c
            goto La1
        L7c:
            int r8 = r8 + r0
            goto L5a
        L7e:
            java.lang.String r6 = "com.tencent.mm.plugin.ball.view."
            boolean r6 = a.Ae.H(r4, r6, r3)
            if (r6 != 0) goto La1
            java.lang.String r6 = "FloatBall"
            boolean r6 = a.Be.I(r4, r6, r0)
            if (r6 != 0) goto La1
            java.lang.String r6 = "Voip"
            boolean r6 = a.Be.I(r4, r6, r0)
            if (r6 != 0) goto La1
            java.lang.String r6 = "voip"
            boolean r4 = a.Be.I(r4, r6, r0)
            if (r4 == 0) goto L9f
            goto La1
        L9f:
            r4 = r3
            goto La2
        La1:
            r4 = r0
        La2:
            java.lang.CharSequence r6 = r2.getTitle()
            if (r6 == 0) goto Lb7
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto Lb7
            java.lang.String r7 = "VoIP"
            boolean r6 = a.Be.I(r6, r7, r0)
            if (r6 != r0) goto Lb7
            goto Lcb
        Lb7:
            java.lang.CharSequence r6 = r2.getTitle()
            if (r6 == 0) goto Lcd
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto Lcd
            java.lang.String r7 = "call"
            boolean r6 = a.Be.I(r6, r7, r0)
            if (r6 != r0) goto Lcd
        Lcb:
            r6 = r0
            goto Lce
        Lcd:
            r6 = r3
        Lce:
            int r7 = r2.type
            r8 = 2038(0x7f6, float:2.856E-42)
            if (r7 == r8) goto Ldf
            r8 = 2003(0x7d3, float:2.807E-42)
            if (r7 == r8) goto Ldf
            r8 = 2006(0x7d6, float:2.811E-42)
            if (r7 != r8) goto Ldd
            goto Ldf
        Ldd:
            r7 = r3
            goto Le0
        Ldf:
            r7 = r0
        Le0:
            if (r4 != 0) goto Leb
            if (r6 != 0) goto Leb
            if (r7 != 0) goto Leb
            java.lang.Object r13 = r13.proceed()
            return r13
        Leb:
            java.util.ArrayList r7 = b(r1)
            r8 = 62
            java.lang.String r9 = " "
            java.lang.String r7 = a.C0383t3.p0(r7, r9, r5, r8)
            if (r4 != 0) goto L10d
            if (r6 != 0) goto L10d
            java.lang.String[] r4 = a.R8.e
            int r6 = r4.length
            r8 = r3
        Lff:
            if (r8 >= r6) goto L10c
            r9 = r4[r8]
            boolean r9 = a.Be.I(r7, r9, r0)
            if (r9 == 0) goto L10a
            goto L10d
        L10a:
            int r8 = r8 + r0
            goto Lff
        L10c:
            r0 = r3
        L10d:
            boolean r3 = a.C0074bh.b()
            java.lang.String r4 = " viewClass="
            java.lang.String r6 = " type="
            java.lang.String r8 = " text="
            if (r3 == 0) goto L152
            java.lang.CharSequence r3 = r2.getTitle()
            int r9 = r2.type
            java.lang.Class r10 = r1.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "WindowManager addView active title="
            r11.<init>(r12)
            r11.append(r3)
            r11.append(r6)
            r11.append(r9)
            r11.append(r4)
            r11.append(r10)
            r11.append(r8)
            r11.append(r7)
            java.lang.String r3 = " isVoipView="
            r11.append(r3)
            r11.append(r0)
            java.lang.String r3 = r11.toString()
            r(r3)
        L152:
            if (r0 != 0) goto L159
            java.lang.Object r13 = r13.proceed()
            return r13
        L159:
            java.lang.CharSequence r0 = r2.getTitle()
            int r2 = r2.type
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "WindowManager addView candidate title="
            r3.<init>(r9)
            r3.append(r0)
            r3.append(r6)
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r8)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r(r0)
            java.lang.String r0 = d(r7)
            java.lang.String r1 = a.C0074bh.a()
            boolean r2 = a.C0074bh.b()
            if (r2 == 0) goto L1b2
            if (r1 == 0) goto L1b2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "WindowManager addView suppressed for active intercept user="
            r13.<init>(r0)
            r13.append(r1)
            r13.append(r8)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r(r13)
            return r5
        L1b2:
            if (r0 == 0) goto L1d7
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L1d7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowManager addView suppressed for blacklisted user="
            r13.<init>(r1)
            r13.append(r0)
            r13.append(r8)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r(r13)
            a.C0074bh.g(r0)
            return r5
        L1d7:
            java.lang.Object r13 = r13.proceed()
            return r13
        L1dc:
            java.lang.Object r13 = r13.proceed()
            return r13
    }

    public static boolean k() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L1d
            boolean r0 = a.C0074bh.b()
            if (r0 != 0) goto L1b
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
        L1b:
            r0 = 1
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public static boolean n(android.content.Intent r8, java.lang.String r9, boolean r10) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            r1 = 0
            if (r0 == 0) goto Ld7
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.D
            if (r0 != 0) goto L16
            goto Ld7
        L16:
            java.lang.String r0 = e(r8)
            boolean r8 = o(r8)
            java.lang.String r2 = "VoIP intent detected source="
            java.lang.String r3 = " user="
            java.lang.String r4 = " incoming="
            java.lang.StringBuilder r2 = a.C0487z.i(r2, r9, r3, r0, r4)
            r2.append(r8)
            java.lang.String r5 = " isActivity="
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r(r2)
            r2 = 1
            if (r0 == 0) goto L84
            java.util.concurrent.ExecutorService r6 = a.fh.G
            boolean r6 = a.fh.a.a(r0)
            if (r6 == 0) goto L84
            java.lang.String r3 = " source="
            if (r10 == 0) goto L69
            if (r8 != 0) goto L69
            boolean r8 = a.C0074bh.b()
            if (r8 != 0) goto L69
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "allow established/outgoing VoIP Activity for user="
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r(r8)
            return r1
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "intercept VoIP intent for user="
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r(r8)
            a.C0074bh.g(r0)
            return r2
        L84:
            boolean r6 = a.C0074bh.b()
            if (r6 == 0) goto Lc7
            java.lang.String r6 = a.C0074bh.a()
            if (r6 == 0) goto Lbb
            java.util.concurrent.ExecutorService r7 = a.fh.G
            boolean r7 = a.fh.a.a(r6)
            if (r7 == 0) goto Lbb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "intercept VoIP intent during active intercept source="
            r8.<init>(r0)
            r8.append(r9)
            r8.append(r5)
            r8.append(r10)
            java.lang.String r9 = " activeUser="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r(r8)
            a.C0074bh.e()
            return r2
        Lbb:
            if (r8 == 0) goto Lc7
            java.lang.String r8 = "intercept incoming VoIP intent during active intercept source="
            java.lang.String r8 = r8.concat(r9)
            r(r8)
            return r2
        Lc7:
            java.lang.String r10 = "allow VoIP intent source="
            java.lang.StringBuilder r9 = a.C0487z.i(r10, r9, r3, r0, r4)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r(r8)
        Ld7:
            return r1
    }

    public static boolean o(android.content.Intent r7) {
            android.os.Bundle r0 = r7.getExtras()
            if (r0 == 0) goto L73
            java.util.Set r0 = r0.keySet()
            if (r0 != 0) goto Ld
            goto L73
        Ld:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            goto L73
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r2 = r7.getExtras()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L36
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L38
        L36:
            java.lang.String r2 = ""
        L38:
            java.util.List<java.util.regex.Pattern> r3 = a.R8.g
            if (r3 == 0) goto L43
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L43
            goto L18
        L43:
            java.util.Iterator r3 = r3.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.next()
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r6 = "="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r4 = r4.find()
            if (r4 == 0) goto L47
            r7 = 1
            return r7
        L73:
            r7 = 0
            return r7
    }

    public static boolean p(java.lang.String r8) {
            java.lang.String[] r0 = a.R8.d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            r4 = 1
            java.lang.String r5 = "$"
            if (r3 >= r1) goto L2b
            r6 = r0[r3]
            boolean r7 = r8.equals(r6)
            if (r7 != 0) goto L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            boolean r5 = a.Ae.H(r8, r5, r2)
            if (r5 == 0) goto L28
            goto L64
        L28:
            int r3 = r3 + 1
            goto L5
        L2b:
            java.lang.String[] r0 = a.R8.c
            int r1 = r0.length
            r3 = r2
        L2f:
            if (r3 >= r1) goto L52
            r6 = r0[r3]
            boolean r7 = r8.equals(r6)
            if (r7 != 0) goto L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            java.lang.String r6 = r7.toString()
            boolean r6 = a.Ae.H(r8, r6, r2)
            if (r6 == 0) goto L4f
            goto L64
        L4f:
            int r3 = r3 + 1
            goto L2f
        L52:
            java.lang.String r0 = "voip"
            boolean r0 = a.Be.I(r8, r0, r4)
            if (r0 != 0) goto L64
            java.lang.String r0 = "wmpfvoip"
            boolean r8 = a.Be.I(r8, r0, r4)
            if (r8 == 0) goto L63
            goto L64
        L63:
            return r2
        L64:
            return r4
    }

    public static boolean q(android.app.Notification r7) {
            java.lang.String r0 = r7.getChannelId()
            r1 = 1
            if (r0 == 0) goto L10
            java.lang.String r2 = "voip"
            boolean r0 = a.Be.I(r0, r2, r1)
            if (r0 != r1) goto L10
            goto L4a
        L10:
            java.lang.String r0 = r7.category
            java.lang.String r2 = "call"
            boolean r0 = a.C0193i9.a(r0, r2)
            if (r0 == 0) goto L1b
            goto L4a
        L1b:
            android.app.PendingIntent r0 = r7.fullScreenIntent
            if (r0 == 0) goto L20
            goto L4a
        L20:
            java.util.ArrayList r7 = a(r7)
            boolean r0 = r7.isEmpty()
            r2 = 0
            if (r0 == 0) goto L2c
            goto L4e
        L2c:
            java.util.Iterator r7 = r7.iterator()
        L30:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r3 = a.R8.e
            int r4 = r3.length
            r5 = r2
        L40:
            if (r5 >= r4) goto L30
            r6 = r3[r5]
            boolean r6 = a.Be.I(r0, r6, r1)
            if (r6 == 0) goto L4b
        L4a:
            return r1
        L4b:
            int r5 = r5 + 1
            goto L40
        L4e:
            return r2
    }

    public static void r(java.lang.String r1) {
            java.lang.String r0 = "[IgnoreVoipCall] "
            java.lang.String r1 = a.C0487z.k(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }

    public static void s(java.lang.String r4, android.content.Intent r5) {
            android.content.ComponentName r0 = r5.getComponent()
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.getClassName()
            if (r0 != 0) goto Ld
            goto L2b
        Ld:
            boolean r1 = p(r0)
            if (r1 == 0) goto L2b
            java.lang.String r5 = u(r5)
            java.lang.String r1 = "VoIP intent candidate source="
            java.lang.String r2 = " component="
            java.lang.String r3 = " extras="
            java.lang.StringBuilder r4 = a.C0487z.i(r1, r4, r2, r0, r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r(r4)
        L2b:
            return
    }

    public static boolean t(android.content.Intent r8) {
            android.content.ComponentName r0 = r8.getComponent()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getClassName()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L45
            boolean r3 = p(r0)
            if (r3 == 0) goto L45
            java.lang.String[] r3 = a.R8.d
            int r4 = r3.length
            r5 = r2
        L1a:
            if (r5 >= r4) goto L3f
            r6 = r3[r5]
            boolean r7 = r0.equals(r6)
            if (r7 != 0) goto L40
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "$"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            boolean r6 = a.Ae.H(r0, r6, r2)
            if (r6 == 0) goto L3c
            goto L40
        L3c:
            int r5 = r5 + 1
            goto L1a
        L3f:
            r1 = r2
        L40:
            boolean r8 = n(r8, r0, r1)
            return r8
        L45:
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto L60
            java.lang.String r3 = "voip"
            boolean r3 = a.Be.I(r0, r3, r1)
            if (r3 != 0) goto L5b
            java.lang.String r3 = "call"
            boolean r1 = a.Be.I(r0, r3, r1)
            if (r1 == 0) goto L60
        L5b:
            boolean r8 = n(r8, r0, r2)
            return r8
        L60:
            return r2
    }

    public static java.lang.String u(android.content.Intent r4) {
            android.os.Bundle r0 = r4.getExtras()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            java.lang.String r1 = ", "
            a.t r2 = new a.t     // Catch: java.lang.Throwable -> L1f
            r3 = 6
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1f
            r4 = 30
            java.lang.String r4 = a.C0383t3.p0(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L24
        L1c:
            java.lang.String r4 = "null"
            goto L24
        L1f:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)
        L24:
            boolean r0 = r4 instanceof a.C0447wd.a
            if (r0 == 0) goto L2a
            java.lang.String r4 = "error"
        L2a:
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r35) {
            r34 = this;
            r1 = r34
            r2 = r35
            java.lang.Class<android.view.ViewGroup$LayoutParams> r12 = android.view.ViewGroup.LayoutParams.class
            java.lang.Class<android.view.View> r13 = android.view.View.class
            java.lang.String r14 = "addView"
            java.lang.String r15 = "notify"
            java.lang.String r3 = "bindService"
            java.lang.String r10 = "startForegroundService"
            java.lang.String r11 = "startActivityForResult"
            java.lang.String r4 = "android.app.NotificationManager"
            java.lang.String r5 = "startService"
            java.lang.String r6 = "startActivity"
            java.lang.Class<android.app.Notification> r7 = android.app.Notification.class
            java.lang.Class<android.app.Service> r8 = android.app.Service.class
            java.lang.Class<android.content.Intent> r9 = android.content.Intent.class
            r17 = r14
            java.lang.Class<android.os.Bundle> r14 = android.os.Bundle.class
            r18 = r12
            java.lang.String r12 = ": "
            r19 = r13
            java.lang.String r13 = "#"
            r30 = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "handleHook started"
            r(r0)
            java.lang.Class<android.app.Activity> r20 = android.app.Activity.class
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L5c
            r31 = r15
            java.lang.Class[] r15 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L58
            r32 = r7
            a.O8 r7 = new a.O8     // Catch: java.lang.Throwable -> L54
            r33 = r12
            r12 = 3
            r7.<init>(r1, r12)     // Catch: java.lang.Throwable -> L52
            a.J8.a(r2, r0, r6, r15, r7)     // Catch: java.lang.Throwable -> L52
            goto L66
        L52:
            r0 = move-exception
            goto L63
        L54:
            r0 = move-exception
        L55:
            r33 = r12
            goto L63
        L58:
            r0 = move-exception
            r32 = r7
            goto L55
        L5c:
            r0 = move-exception
            r32 = r7
            r33 = r12
            r31 = r15
        L63:
            a.C0465xd.a(r0)
        L66:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r14}     // Catch: java.lang.Throwable -> L78
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> L78
            r15 = 4
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> L78
            a.J8.a(r2, r0, r6, r7, r12)     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            a.C0465xd.a(r0)
        L7c:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L91
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r4}     // Catch: java.lang.Throwable -> L91
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> L91
            r15 = 5
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> L91
            a.J8.a(r2, r0, r11, r7, r12)     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r0 = move-exception
            a.C0465xd.a(r0)
        L95:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> Laa
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> Laa
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r4, r14}     // Catch: java.lang.Throwable -> Laa
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> Laa
            r15 = 6
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> Laa
            a.J8.a(r2, r0, r11, r7, r12)     // Catch: java.lang.Throwable -> Laa
            goto Lae
        Laa:
            r0 = move-exception
            a.C0465xd.a(r0)
        Lae:
            java.lang.String r0 = "Activity start hooks installed"
            r(r0)
            java.lang.Class<android.content.ContextWrapper> r7 = android.content.ContextWrapper.class
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> Lce
            java.lang.Class[] r12 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> Lce
            a.O8 r15 = new a.O8     // Catch: java.lang.Throwable -> Lce
            r20 = r7
            r7 = 9
            r15.<init>(r1, r7)     // Catch: java.lang.Throwable -> Lcc
            a.J8.a(r2, r0, r6, r12, r15)     // Catch: java.lang.Throwable -> Lcc
            goto Ld4
        Lcc:
            r0 = move-exception
            goto Ld1
        Lce:
            r0 = move-exception
            r20 = r7
        Ld1:
            a.C0465xd.a(r0)
        Ld4:
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> Le7
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r14}     // Catch: java.lang.Throwable -> Le7
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> Le7
            r15 = 10
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> Le7
            a.J8.a(r2, r0, r6, r7, r12)     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r0 = move-exception
            a.C0465xd.a(r0)
        Leb:
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> Lfe
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> Lfe
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> Lfe
            r15 = 11
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> Lfe
            a.J8.a(r2, r0, r5, r7, r12)     // Catch: java.lang.Throwable -> Lfe
            goto L102
        Lfe:
            r0 = move-exception
            a.C0465xd.a(r0)
        L102:
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> L115
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L115
            a.O8 r12 = new a.O8     // Catch: java.lang.Throwable -> L115
            r15 = 12
            r12.<init>(r1, r15)     // Catch: java.lang.Throwable -> L115
            a.J8.a(r2, r0, r10, r7, r12)     // Catch: java.lang.Throwable -> L115
            goto L119
        L115:
            r0 = move-exception
            a.C0465xd.a(r0)
        L119:
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> L12f
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> L12f
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r8, r4}     // Catch: java.lang.Throwable -> L12f
            a.l8 r11 = new a.l8     // Catch: java.lang.Throwable -> L12f
            r12 = 20
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L12f
            a.J8.a(r2, r0, r3, r7, r11)     // Catch: java.lang.Throwable -> L12f
            goto L133
        L12f:
            r0 = move-exception
            a.C0465xd.a(r0)
        L133:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L146
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L146
            a.l8 r11 = new a.l8     // Catch: java.lang.Throwable -> L146
            r12 = 21
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L146
            a.J8.a(r2, r0, r6, r7, r11)     // Catch: java.lang.Throwable -> L146
            goto L14a
        L146:
            r0 = move-exception
            a.C0465xd.a(r0)
        L14a:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L15d
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L15d
            a.l8 r11 = new a.l8     // Catch: java.lang.Throwable -> L15d
            r12 = 22
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L15d
            a.J8.a(r2, r0, r5, r7, r11)     // Catch: java.lang.Throwable -> L15d
            goto L161
        L15d:
            r0 = move-exception
            a.C0465xd.a(r0)
        L161:
            java.lang.String r0 = r20.getName()     // Catch: java.lang.Throwable -> L174
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L174
            a.l8 r11 = new a.l8     // Catch: java.lang.Throwable -> L174
            r12 = 23
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L174
            a.J8.a(r2, r0, r10, r7, r11)     // Catch: java.lang.Throwable -> L174
            goto L178
        L174:
            r0 = move-exception
            a.C0465xd.a(r0)
        L178:
            java.lang.String r0 = "Context/ContextWrapper start hooks installed (abstract method failures suppressed via runCatching)"
            r(r0)
            java.lang.Class<android.app.Instrumentation> r0 = android.app.Instrumentation.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L1a8
            java.lang.String r7 = "execStartActivity"
            java.lang.Class<android.content.Context> r20 = android.content.Context.class
            java.lang.Class<android.os.IBinder> r21 = android.os.IBinder.class
            java.lang.Class<android.os.IBinder> r22 = android.os.IBinder.class
            java.lang.Class<android.app.Activity> r23 = android.app.Activity.class
            java.lang.Class<android.content.Intent> r24 = android.content.Intent.class
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> L1a8
            java.lang.Class<android.os.Bundle> r26 = android.os.Bundle.class
            r25 = r4
            java.lang.Class[] r4 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25, r26}     // Catch: java.lang.Throwable -> L1a6
            a.l8 r10 = new a.l8     // Catch: java.lang.Throwable -> L1a6
            r11 = 27
            r10.<init>(r1, r11)     // Catch: java.lang.Throwable -> L1a6
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r0, r7, r4, r10)     // Catch: java.lang.Throwable -> L1a6
            goto L1af
        L1a6:
            r0 = move-exception
            goto L1ab
        L1a8:
            r0 = move-exception
            r25 = r4
        L1ab:
            a.wd$a r0 = a.C0465xd.a(r0)
        L1af:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L1ca
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Instrumentation hook failed: "
            r4.<init>(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L1ca:
            java.lang.String r0 = "Instrumentation hook installed"
            r(r0)
            java.lang.ClassLoader r0 = r2.f136a
            java.lang.String r4 = "android.app.IActivityTaskManager$Stub$Proxy"
            java.lang.Class r0 = a.A1.b(r0, r4)
            java.lang.String r7 = "android.app.ProfilingInfo"
            java.lang.String r10 = "android.app.IApplicationThread"
            if (r0 != 0) goto L1e3
            java.lang.String r0 = "IActivityTaskManager proxy not found"
            r(r0)
            goto L238
        L1e3:
            java.lang.Class r20 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L20f
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            java.lang.Class<android.content.Intent> r22 = android.content.Intent.class
            java.lang.Class<java.lang.String> r23 = java.lang.String.class
            java.lang.Class<android.os.IBinder> r24 = android.os.IBinder.class
            r26 = r25
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            a.C0193i9.b(r26)     // Catch: java.lang.Throwable -> L211
            java.lang.Class r28 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L211
            java.lang.Class<android.os.Bundle> r29 = android.os.Bundle.class
            r27 = r26
            java.lang.Class[] r0 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}     // Catch: java.lang.Throwable -> L211
            r25 = r26
            a.O8 r11 = new a.O8     // Catch: java.lang.Throwable -> L20f
            r12 = 2
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L20f
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r4, r6, r0, r11)     // Catch: java.lang.Throwable -> L20f
            goto L218
        L20f:
            r0 = move-exception
            goto L214
        L211:
            r0 = move-exception
            r25 = r26
        L214:
            a.wd$a r0 = a.C0465xd.a(r0)
        L218:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L233
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r11 = "IActivityTaskManager hook failed: "
            r4.<init>(r11)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L233:
            java.lang.String r0 = "IActivityTaskManager proxy hook installed"
            r(r0)
        L238:
            java.lang.ClassLoader r0 = r2.f136a
            java.lang.String r4 = "android.app.IActivityManager$Stub$Proxy"
            java.lang.Class r0 = a.A1.b(r0, r4)
            if (r0 != 0) goto L24b
            java.lang.String r0 = "IActivityManager proxy not found"
            r(r0)
            r5 = r25
            goto L2d9
        L24b:
            java.lang.Class r20 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L277
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            java.lang.Class<android.content.Intent> r22 = android.content.Intent.class
            java.lang.Class<java.lang.String> r23 = java.lang.String.class
            java.lang.Class<android.os.IBinder> r24 = android.os.IBinder.class
            r26 = r25
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            a.C0193i9.b(r26)     // Catch: java.lang.Throwable -> L279
            java.lang.Class r28 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L279
            java.lang.Class<android.os.Bundle> r29 = android.os.Bundle.class
            r27 = r26
            java.lang.Class[] r0 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}     // Catch: java.lang.Throwable -> L279
            r25 = r26
            a.l8 r7 = new a.l8     // Catch: java.lang.Throwable -> L277
            r11 = 24
            r7.<init>(r1, r11)     // Catch: java.lang.Throwable -> L277
            a.J8.a(r2, r4, r6, r0, r7)     // Catch: java.lang.Throwable -> L277
            goto L27f
        L277:
            r0 = move-exception
            goto L27c
        L279:
            r0 = move-exception
            r25 = r26
        L27c:
            a.C0465xd.a(r0)
        L27f:
            java.lang.Class r20 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L2a0
            java.lang.Class<android.content.Intent> r21 = android.content.Intent.class
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2a0
            a.C0193i9.b(r23)     // Catch: java.lang.Throwable -> L2a0
            java.lang.Class<java.lang.String> r24 = java.lang.String.class
            a.C0193i9.b(r25)     // Catch: java.lang.Throwable -> L2a0
            java.lang.Class[] r0 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> L2a0
            a.l8 r6 = new a.l8     // Catch: java.lang.Throwable -> L2a0
            r7 = 25
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L2a0
            a.J8.a(r2, r4, r5, r0, r6)     // Catch: java.lang.Throwable -> L2a0
            goto L2a4
        L2a0:
            r0 = move-exception
            a.C0465xd.a(r0)
        L2a4:
            java.lang.Class r20 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L2ce
            java.lang.Class<android.os.IBinder> r21 = android.os.IBinder.class
            java.lang.Class<android.content.Intent> r22 = android.content.Intent.class
            java.lang.Class<java.lang.String> r23 = java.lang.String.class
            java.lang.String r0 = "android.app.IServiceConnection"
            java.lang.Class r24 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2ce
            a.C0193i9.b(r25)     // Catch: java.lang.Throwable -> L2ce
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r27 = r25
            java.lang.Class[] r0 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25, r26, r27}     // Catch: java.lang.Throwable -> L2ce
            r5 = r25
            a.l8 r6 = new a.l8     // Catch: java.lang.Throwable -> L2cc
            r7 = 26
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L2cc
            a.J8.a(r2, r4, r3, r0, r6)     // Catch: java.lang.Throwable -> L2cc
            goto L2d4
        L2cc:
            r0 = move-exception
            goto L2d1
        L2ce:
            r0 = move-exception
            r5 = r25
        L2d1:
            a.C0465xd.a(r0)
        L2d4:
            java.lang.String r0 = "IActivityManager proxy hooks installed"
            r(r0)
        L2d9:
            java.lang.String r0 = "hookIncomingCallHandler hooking "
            java.lang.ClassLoader r3 = r2.f136a     // Catch: java.lang.Throwable -> L2eb
            java.lang.reflect.Method r3 = a.C0055ah.f(r3)     // Catch: java.lang.Throwable -> L2eb
            if (r3 != 0) goto L2ed
            java.lang.String r0 = "incoming call handler method not resolved"
            r(r0)     // Catch: java.lang.Throwable -> L2eb
        L2e8:
            r3 = r33
            goto L341
        L2eb:
            r0 = move-exception
            goto L31c
        L2ed:
            java.lang.Class r4 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r6 = r3.getName()     // Catch: java.lang.Throwable -> L2eb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2eb
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2eb
            r7.append(r4)     // Catch: java.lang.Throwable -> L2eb
            r7.append(r13)     // Catch: java.lang.Throwable -> L2eb
            r7.append(r6)     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L2eb
            r(r0)     // Catch: java.lang.Throwable -> L2eb
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r3)     // Catch: java.lang.Throwable -> L2eb
            a.v8 r3 = new a.v8     // Catch: java.lang.Throwable -> L2eb
            r4 = 1
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L2eb
            r0.intercept(r3)     // Catch: java.lang.Throwable -> L2eb
            goto L2e8
        L31c:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "hookIncomingCallHandler fail: "
            r4.<init>(r6)
            r4.append(r3)
            r3 = r33
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L341:
            java.lang.String r0 = "hookIncomingCallUi hooking "
            java.lang.ClassLoader r4 = r2.f136a     // Catch: java.lang.Throwable -> L351
            java.lang.reflect.Method r4 = a.C0055ah.h(r4)     // Catch: java.lang.Throwable -> L351
            if (r4 != 0) goto L353
            java.lang.String r0 = "incoming call UI method not resolved"
            r(r0)     // Catch: java.lang.Throwable -> L351
            goto L3a5
        L351:
            r0 = move-exception
            goto L382
        L353:
            java.lang.Class r6 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L351
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L351
            java.lang.String r7 = r4.getName()     // Catch: java.lang.Throwable -> L351
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L351
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L351
            r10.append(r6)     // Catch: java.lang.Throwable -> L351
            r10.append(r13)     // Catch: java.lang.Throwable -> L351
            r10.append(r7)     // Catch: java.lang.Throwable -> L351
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L351
            r(r0)     // Catch: java.lang.Throwable -> L351
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r4)     // Catch: java.lang.Throwable -> L351
            a.v8 r4 = new a.v8     // Catch: java.lang.Throwable -> L351
            r12 = 3
            r4.<init>(r1, r12)     // Catch: java.lang.Throwable -> L351
            r0.intercept(r4)     // Catch: java.lang.Throwable -> L351
            goto L3a5
        L382:
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hookIncomingCallUi fail: "
            r6.<init>(r7)
            r6.append(r4)
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r(r0)
        L3a5:
            java.lang.String r0 = "hookIncomingCallManager hooking "
            java.lang.ClassLoader r4 = r2.f136a     // Catch: java.lang.Throwable -> L3b5
            java.lang.reflect.Method r4 = a.C0055ah.g(r4)     // Catch: java.lang.Throwable -> L3b5
            if (r4 != 0) goto L3b7
            java.lang.String r0 = "incoming call manager method not resolved"
            r(r0)     // Catch: java.lang.Throwable -> L3b5
            goto L409
        L3b5:
            r0 = move-exception
            goto L3e6
        L3b7:
            java.lang.Class r6 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L3b5
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L3b5
            java.lang.String r7 = r4.getName()     // Catch: java.lang.Throwable -> L3b5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b5
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L3b5
            r10.append(r6)     // Catch: java.lang.Throwable -> L3b5
            r10.append(r13)     // Catch: java.lang.Throwable -> L3b5
            r10.append(r7)     // Catch: java.lang.Throwable -> L3b5
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L3b5
            r(r0)     // Catch: java.lang.Throwable -> L3b5
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r4)     // Catch: java.lang.Throwable -> L3b5
            a.v8 r4 = new a.v8     // Catch: java.lang.Throwable -> L3b5
            r15 = 5
            r4.<init>(r1, r15)     // Catch: java.lang.Throwable -> L3b5
            r0.intercept(r4)     // Catch: java.lang.Throwable -> L3b5
            goto L409
        L3e6:
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hookIncomingCallManager fail: "
            r6.<init>(r7)
            r6.append(r4)
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r(r0)
        L409:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L41b
            java.util.List r0 = a.C0055ah.e(r0)     // Catch: java.lang.Throwable -> L41b
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L41b
            if (r4 == 0) goto L41d
            java.lang.String r0 = "voip mgr bind methods not resolved"
            r(r0)     // Catch: java.lang.Throwable -> L41b
            goto L484
        L41b:
            r0 = move-exception
            goto L461
        L41d:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L41b
        L421:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L41b
            if (r4 == 0) goto L484
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L41b
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L41b
            java.lang.Class r6 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L41b
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L41b
            java.lang.String r7 = r4.getName()     // Catch: java.lang.Throwable -> L41b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41b
            r10.<init>()     // Catch: java.lang.Throwable -> L41b
            java.lang.String r11 = "hookVoipMgrBind hooking "
            r10.append(r11)     // Catch: java.lang.Throwable -> L41b
            r10.append(r6)     // Catch: java.lang.Throwable -> L41b
            r10.append(r13)     // Catch: java.lang.Throwable -> L41b
            r10.append(r7)     // Catch: java.lang.Throwable -> L41b
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L41b
            r(r6)     // Catch: java.lang.Throwable -> L41b
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r2.f(r4)     // Catch: java.lang.Throwable -> L41b
            a.v8 r6 = new a.v8     // Catch: java.lang.Throwable -> L41b
            r12 = 2
            r6.<init>(r1, r12)     // Catch: java.lang.Throwable -> L41b
            r4.intercept(r6)     // Catch: java.lang.Throwable -> L41b
            goto L421
        L461:
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hookVoipMgrBind fail: "
            r6.<init>(r7)
            r6.append(r4)
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r(r0)
        L484:
            java.lang.String r0 = r8.getName()     // Catch: java.lang.Throwable -> L4a1
            java.lang.String r4 = "startForeground"
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L4a1
            r6 = r32
            java.lang.Class[] r7 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Throwable -> L49f
            a.O8 r8 = new a.O8     // Catch: java.lang.Throwable -> L49f
            r10 = 8
            r8.<init>(r1, r10)     // Catch: java.lang.Throwable -> L49f
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r0, r4, r7, r8)     // Catch: java.lang.Throwable -> L49f
            goto L4a8
        L49f:
            r0 = move-exception
            goto L4a4
        L4a1:
            r0 = move-exception
            r6 = r32
        L4a4:
            a.wd$a r0 = a.C0465xd.a(r0)
        L4a8:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L4c3
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Service.startForeground hook failed: "
            r4.<init>(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L4c3:
            java.lang.String r0 = "Service.startForeground hook installed"
            r(r0)
            java.lang.String[] r4 = a.R8.c
            int r7 = r4.length
            r8 = 0
        L4cc:
            if (r8 >= r7) goto L52c
            r10 = r4[r8]
            java.lang.ClassLoader r0 = r2.f136a
            java.lang.Class r0 = a.A1.b(r0, r10)
            if (r0 != 0) goto L4e4
            java.lang.String r0 = "service class not found: "
            java.lang.String r0 = r0.concat(r10)
            r(r0)
        L4e1:
            r16 = 1
            goto L529
        L4e4:
            java.lang.String r0 = "onStartCommand"
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L4f8
            java.lang.Class[] r11 = new java.lang.Class[]{r9, r5, r5}     // Catch: java.lang.Throwable -> L4f8
            a.P8 r12 = new a.P8     // Catch: java.lang.Throwable -> L4f8
            r15 = 0
            r12.<init>(r1, r10, r15)     // Catch: java.lang.Throwable -> L4f8
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r10, r0, r11, r12)     // Catch: java.lang.Throwable -> L4f8
            goto L4fd
        L4f8:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L4fd:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L518
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "VoIP service onStartCommand hook failed: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r(r0)
        L518:
            java.lang.String r0 = "onDestroy"
            a.P8 r11 = new a.P8     // Catch: java.lang.Throwable -> L524
            r12 = 1
            r11.<init>(r1, r10, r12)     // Catch: java.lang.Throwable -> L524
            a.J8.e(r2, r10, r0, r11)     // Catch: java.lang.Throwable -> L524
            goto L4e1
        L524:
            r0 = move-exception
            a.C0465xd.a(r0)
            goto L4e1
        L529:
            int r8 = r8 + 1
            goto L4cc
        L52c:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L547
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L547
            a.l8 r7 = new a.l8     // Catch: java.lang.Throwable -> L547
            r8 = 28
            r7.<init>(r1, r8)     // Catch: java.lang.Throwable -> L547
            r9 = r30
            r8 = r31
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r9, r8, r0, r7)     // Catch: java.lang.Throwable -> L545
            goto L550
        L545:
            r0 = move-exception
            goto L54c
        L547:
            r0 = move-exception
            r9 = r30
            r8 = r31
        L54c:
            a.wd$a r0 = a.C0465xd.a(r0)
        L550:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L56b
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "NotificationManager.notify(String) hook failed: "
            r7.<init>(r10)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r(r0)
        L56b:
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L57e
            java.lang.Class[] r0 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Throwable -> L57e
            a.l8 r7 = new a.l8     // Catch: java.lang.Throwable -> L57e
            r10 = 29
            r7.<init>(r1, r10)     // Catch: java.lang.Throwable -> L57e
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r9, r8, r0, r7)     // Catch: java.lang.Throwable -> L57e
            goto L583
        L57e:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L583:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L59e
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "NotificationManager.notify(int) hook failed: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r(r0)
        L59e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r0 < r10) goto L5d8
            java.lang.String r0 = "notifyAsPackage"
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L5b8
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r4, r5, r6}     // Catch: java.lang.Throwable -> L5b8
            a.O8 r5 = new a.O8     // Catch: java.lang.Throwable -> L5b8
            r15 = 0
            r5.<init>(r1, r15)     // Catch: java.lang.Throwable -> L5b8
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r9, r0, r4, r5)     // Catch: java.lang.Throwable -> L5b8
            goto L5bd
        L5b8:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L5bd:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L5d8
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "NotificationManager.notifyAsPackage hook failed: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L5d8:
            java.lang.Class<android.telecom.TelecomManager> r0 = android.telecom.TelecomManager.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5f7
            java.lang.String r4 = "addNewIncomingCall"
            java.lang.Class<android.telecom.PhoneAccountHandle> r5 = android.telecom.PhoneAccountHandle.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r14}     // Catch: java.lang.Throwable -> L5f7
            a.O8 r6 = new a.O8     // Catch: java.lang.Throwable -> L5f7
            r7 = 7
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L5f7
            a.J8.a(r2, r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L5f7
            java.lang.String r0 = "TelecomManager hook installed"
            r(r0)     // Catch: java.lang.Throwable -> L5f7
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5f7
            goto L5fc
        L5f7:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L5fc:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L617
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TelecomManager hook failed: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r(r0)
        L617:
            r34.m(r35)
            java.lang.String r4 = "hookFlutterGlobal hooking "
            a.fd r5 = new a.fd     // Catch: java.lang.Throwable -> L69a
            int r0 = a.B1.f21a     // Catch: java.lang.Throwable -> L69a
            r6 = -1
            if (r0 != r6) goto L645
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L636 java.lang.Throwable -> L69a
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L636 java.lang.Throwable -> L69a
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L636 java.lang.Throwable -> L69a
            java.lang.String r7 = "com.tencent.mm"
            r15 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r15)     // Catch: java.lang.Exception -> L636 java.lang.Throwable -> L69a
            int r6 = r0.versionCode     // Catch: java.lang.Exception -> L636 java.lang.Throwable -> L69a
            goto L643
        L636:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L69a
            r12 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r12)     // Catch: java.lang.Throwable -> L69a
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L69a
        L643:
            a.B1.f21a = r6     // Catch: java.lang.Throwable -> L69a
        L645:
            int r0 = a.B1.f21a     // Catch: java.lang.Throwable -> L69a
            java.lang.ClassLoader r6 = r2.f136a     // Catch: java.lang.Throwable -> L69a
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L69a
            a.hd r0 = a.C0179hd.f499a     // Catch: java.lang.Throwable -> L69a
            java.lang.String r6 = "F017:flutterVoip"
            r0.getClass()     // Catch: java.lang.Throwable -> L69a
            a.gd r0 = a.C0179hd.a(r6, r5)     // Catch: java.lang.Throwable -> L69a
            java.lang.Class<?> r0 = r0.b     // Catch: java.lang.Throwable -> L69a
            if (r0 != 0) goto L65c
            goto L6be
        L65c:
            a.O8 r5 = new a.O8     // Catch: java.lang.Throwable -> L69a
            r12 = 1
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L69a
            java.lang.reflect.Method[] r5 = a.A1.f(r0, r5)     // Catch: java.lang.Throwable -> L69a
            java.lang.Object r5 = a.N1.d0(r5)     // Catch: java.lang.Throwable -> L69a
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L69a
            if (r5 != 0) goto L66f
            goto L6be
        L66f:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L69a
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L69a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69a
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L69a
            r7.append(r0)     // Catch: java.lang.Throwable -> L69a
            r7.append(r13)     // Catch: java.lang.Throwable -> L69a
            r7.append(r6)     // Catch: java.lang.Throwable -> L69a
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L69a
            r(r0)     // Catch: java.lang.Throwable -> L69a
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r5)     // Catch: java.lang.Throwable -> L69a
            a.v8 r4 = new a.v8     // Catch: java.lang.Throwable -> L69a
            r15 = 4
            r4.<init>(r1, r15)     // Catch: java.lang.Throwable -> L69a
            r0.intercept(r4)     // Catch: java.lang.Throwable -> L69a
            goto L6be
        L69a:
            r0 = move-exception
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "hookFlutterGlobal fail: "
            r5.<init>(r6)
            r5.append(r4)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r(r0)
        L6be:
            java.lang.String r0 = "android.view.WindowManagerImpl"
            r3 = r18
            r4 = r19
            java.lang.Class[] r5 = new java.lang.Class[]{r4, r3}     // Catch: java.lang.Throwable -> L6d8
            a.l8 r6 = new a.l8     // Catch: java.lang.Throwable -> L6d8
            r7 = 19
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L6d8
            r7 = r17
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r0, r7, r5, r6)     // Catch: java.lang.Throwable -> L6d6
            goto L6e7
        L6d6:
            r0 = move-exception
            goto L6e3
        L6d8:
            r0 = move-exception
            r7 = r17
            goto L6e3
        L6dc:
            r0 = move-exception
            r7 = r17
            r3 = r18
            r4 = r19
        L6e3:
            a.wd$a r0 = a.C0465xd.a(r0)
        L6e7:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L702
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "WindowManagerImpl.addView hook failed: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r(r0)
        L702:
            java.lang.String r0 = "WindowManagerImpl addView hook installed"
            r(r0)
            java.lang.String r0 = "android.view.WindowManagerGlobal"
            java.lang.Class<android.view.Display> r5 = android.view.Display.class
            java.lang.Class<android.view.Window> r6 = android.view.Window.class
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r3, r5, r6}     // Catch: java.lang.Throwable -> L71c
            a.N8 r5 = new a.N8     // Catch: java.lang.Throwable -> L71c
            r15 = 0
            r5.<init>(r1, r15)     // Catch: java.lang.Throwable -> L71c
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r0, r7, r3, r5)     // Catch: java.lang.Throwable -> L71c
            goto L721
        L71c:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L721:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L73c
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "WindowManagerGlobal.addView hook failed: "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r(r0)
        L73c:
            java.lang.String r0 = "WindowManager addView hook installed"
            r(r0)
            java.lang.Class<android.app.Dialog> r0 = android.app.Dialog.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L755
            java.lang.String r3 = "show"
            a.N8 r5 = new a.N8     // Catch: java.lang.Throwable -> L755
            r15 = 11
            r5.<init>(r1, r15)     // Catch: java.lang.Throwable -> L755
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.e(r2, r0, r3, r5)     // Catch: java.lang.Throwable -> L755
            goto L75a
        L755:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L75a:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L775
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Dialog.show hook failed: "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r(r0)
        L775:
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L792
            java.lang.String r3 = "showAtLocation"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L792
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L792
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r5, r5}     // Catch: java.lang.Throwable -> L792
            a.N8 r5 = new a.N8     // Catch: java.lang.Throwable -> L792
            r15 = 12
            r5.<init>(r1, r15)     // Catch: java.lang.Throwable -> L792
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r2, r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L792
            goto L797
        L792:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L797:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L7b2
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PopupWindow.showAtLocation hook failed: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r(r0)
        L7b2:
            java.lang.String r0 = "Dialog/PopupWindow hooks installed"
            r(r0)
            r34.l(r35)
            return
    }

    public final java.lang.Object i(io.github.libxposed.api.XposedInterface.Chain r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto Lc5
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.D
            if (r0 != 0) goto L15
            goto Lc5
        L15:
            java.lang.Object r0 = r10.getThisObject()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L21
            android.app.Activity r0 = (android.app.Activity) r0
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L29
            android.content.Intent r1 = r0.getIntent()
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L30
            java.lang.String r2 = e(r1)
        L30:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3c
            boolean r1 = o(r1)
            if (r1 != r4) goto L3c
            r1 = r4
            goto L3d
        L3c:
            r1 = r3
        L3d:
            boolean r5 = a.K3.a.l()
            if (r5 == 0) goto L68
            a.jc r5 = a.K3.a.i()
            boolean r5 = r5.D
            if (r5 != 0) goto L4c
            goto L68
        L4c:
            java.lang.String r5 = a.C0074bh.a()
            if (r5 == 0) goto L5c
            java.util.concurrent.ExecutorService r6 = a.fh.G
            boolean r5 = a.fh.a.a(r5)
            if (r5 == 0) goto L5c
            r5 = r4
            goto L69
        L5c:
            if (r2 == 0) goto L68
            java.util.concurrent.ExecutorService r5 = a.fh.G
            boolean r5 = a.fh.a.a(r2)
            if (r5 == 0) goto L68
            r5 = r1
            goto L69
        L68:
            r5 = r3
        L69:
            if (r5 == 0) goto Lc0
            if (r2 != 0) goto L72
            java.lang.String r5 = a.C0074bh.a()
            goto L73
        L72:
            r5 = r2
        L73:
            java.lang.String r6 = "block VoIP activity "
            java.lang.String r7 = " stage="
            java.lang.String r8 = " user="
            java.lang.StringBuilder r6 = a.C0487z.i(r6, r11, r7, r12, r8)
            r6.append(r5)
            java.lang.String r5 = " incoming="
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r(r1)
            if (r2 == 0) goto L94
            a.C0074bh.g(r2)
        L94:
            java.util.Set<java.lang.String> r1 = r9.f244a
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto Lbb
            java.lang.Object r10 = r10.proceed()
            java.lang.String r11 = "onCreate"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto Lae
            boolean r11 = a.C0074bh.b()
            if (r11 != 0) goto Lb2
        Lae:
            boolean r11 = r9.b
            if (r11 == 0) goto Lb3
        Lb2:
            r3 = r4
        Lb3:
            if (r3 == 0) goto Lba
            if (r0 == 0) goto Lba
            r0.finish()
        Lba:
            return r10
        Lbb:
            java.lang.Object r10 = r10.proceed()
            return r10
        Lc0:
            java.lang.Object r10 = r10.proceed()
            return r10
        Lc5:
            java.lang.Object r10 = r10.proceed()
            return r10
    }

    public final void l(a.J8 r14) {
            r13 = this;
            java.lang.String r1 = "startTone"
            java.lang.String r2 = "start"
            java.lang.String r3 = "vibrate"
            java.lang.String r4 = "play"
            java.lang.Class<android.media.ToneGenerator> r5 = android.media.ToneGenerator.class
            java.lang.Class<android.media.AudioTrack> r6 = android.media.AudioTrack.class
            java.lang.Class r7 = java.lang.Integer.TYPE
            java.lang.Class<android.media.MediaPlayer> r0 = android.media.MediaPlayer.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L1e
            a.N8 r8 = new a.N8     // Catch: java.lang.Throwable -> L1e
            r9 = 1
            r8.<init>(r13, r9)     // Catch: java.lang.Throwable -> L1e
            a.J8.e(r14, r0, r2, r8)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            a.C0465xd.a(r0)
        L22:
            java.lang.Class<android.media.SoundPool> r0 = android.media.SoundPool.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L42
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> L42
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L42
            a.C0193i9.b(r8)     // Catch: java.lang.Throwable -> L42
            r9 = r8
            r10 = r7
            r11 = r7
            r12 = r8
            java.lang.Class[] r8 = new java.lang.Class[]{r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L42
            a.N8 r9 = new a.N8     // Catch: java.lang.Throwable -> L42
            r10 = 2
            r9.<init>(r13, r10)     // Catch: java.lang.Throwable -> L42
            a.J8.a(r14, r0, r4, r8, r9)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            a.C0465xd.a(r0)
        L46:
            java.lang.Class<android.media.Ringtone> r0 = android.media.Ringtone.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L56
            a.N8 r8 = new a.N8     // Catch: java.lang.Throwable -> L56
            r9 = 3
            r8.<init>(r13, r9)     // Catch: java.lang.Throwable -> L56
            a.J8.e(r14, r0, r4, r8)     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r0 = move-exception
            a.C0465xd.a(r0)
        L5a:
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L68
            a.N8 r8 = new a.N8     // Catch: java.lang.Throwable -> L68
            r9 = 4
            r8.<init>(r13, r9)     // Catch: java.lang.Throwable -> L68
            a.J8.e(r14, r0, r4, r8)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            a.C0465xd.a(r0)
        L6c:
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L7a
            a.N8 r4 = new a.N8     // Catch: java.lang.Throwable -> L7a
            r6 = 5
            r4.<init>(r13, r6)     // Catch: java.lang.Throwable -> L7a
            a.J8.e(r14, r0, r2, r4)     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            a.C0465xd.a(r0)
        L7e:
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L93
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> L93
            java.lang.Class[] r2 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L93
            a.N8 r4 = new a.N8     // Catch: java.lang.Throwable -> L93
            r6 = 6
            r4.<init>(r13, r6)     // Catch: java.lang.Throwable -> L93
            a.J8.a(r14, r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r0 = move-exception
            a.C0465xd.a(r0)
        L97:
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> Lac
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r2 = new java.lang.Class[]{r7, r7}     // Catch: java.lang.Throwable -> Lac
            a.N8 r4 = new a.N8     // Catch: java.lang.Throwable -> Lac
            r5 = 7
            r4.<init>(r13, r5)     // Catch: java.lang.Throwable -> Lac
            a.J8.a(r14, r0, r1, r2, r4)     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r0 = move-exception
            a.C0465xd.a(r0)
        Lb0:
            java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> Lca
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lca
            a.C0193i9.b(r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> Lca
            a.N8 r4 = new a.N8     // Catch: java.lang.Throwable -> Lca
            r5 = 8
            r4.<init>(r13, r5)     // Catch: java.lang.Throwable -> Lca
            a.J8.a(r14, r0, r3, r2, r4)     // Catch: java.lang.Throwable -> Lca
            goto Lce
        Lca:
            r0 = move-exception
            a.C0465xd.a(r0)
        Lce:
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> Le6
            java.lang.Class<long[]> r2 = long[].class
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> Le6
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r7}     // Catch: java.lang.Throwable -> Le6
            a.N8 r4 = new a.N8     // Catch: java.lang.Throwable -> Le6
            r5 = 9
            r4.<init>(r13, r5)     // Catch: java.lang.Throwable -> Le6
            a.J8.a(r14, r0, r3, r2, r4)     // Catch: java.lang.Throwable -> Le6
            goto Lea
        Le6:
            r0 = move-exception
            a.C0465xd.a(r0)
        Lea:
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.Class<android.os.VibrationEffect> r1 = android.os.VibrationEffect.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lff
            a.N8 r2 = new a.N8     // Catch: java.lang.Throwable -> Lff
            r4 = 10
            r2.<init>(r13, r4)     // Catch: java.lang.Throwable -> Lff
            a.J8.a(r14, r0, r3, r1, r2)     // Catch: java.lang.Throwable -> Lff
            goto L104
        Lff:
            r0 = move-exception
            r14 = r0
            a.C0465xd.a(r14)
        L104:
            java.lang.String r14 = "Audio/vibration hooks installed"
            r(r14)
            return
    }

    public final void m(a.J8 r10) {
            r9 = this;
            java.lang.String r0 = ": "
            java.lang.String[] r1 = a.R8.d     // Catch: java.lang.Throwable -> L65
            int r2 = r1.length     // Catch: java.lang.Throwable -> L65
            r3 = 0
        L6:
            if (r3 >= r2) goto L101
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L65
            java.lang.ClassLoader r5 = r10.f136a     // Catch: java.lang.Throwable -> L65
            java.lang.Class r5 = a.A1.b(r5, r4)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L14
            goto Lda
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "hookVoipActivities: hooking "
            r5.append(r6)     // Catch: java.lang.Throwable -> L65
            r5.append(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L65
            r(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "onCreate"
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L3b
            a.P8 r7 = new a.P8     // Catch: java.lang.Throwable -> L3b
            r8 = 2
            r7.<init>(r9, r4, r8)     // Catch: java.lang.Throwable -> L3b
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.a(r10, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)     // Catch: java.lang.Throwable -> L65
        L40:
            java.lang.Throwable r5 = a.C0447wd.a(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L68
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "hookVoipActivities onCreate fail "
            r6.append(r7)     // Catch: java.lang.Throwable -> L65
            r6.append(r4)     // Catch: java.lang.Throwable -> L65
            r6.append(r0)     // Catch: java.lang.Throwable -> L65
            r6.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L65
            r(r5)     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            r10 = move-exception
            goto Lde
        L68:
            java.lang.String r5 = "onResume"
            a.P8 r6 = new a.P8     // Catch: java.lang.Throwable -> L75
            r7 = 3
            r6.<init>(r9, r4, r7)     // Catch: java.lang.Throwable -> L75
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.e(r10, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
            goto L7a
        L75:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)     // Catch: java.lang.Throwable -> L65
        L7a:
            java.lang.Throwable r5 = a.C0447wd.a(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L9e
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "hookVoipActivities onResume fail "
            r6.append(r7)     // Catch: java.lang.Throwable -> L65
            r6.append(r4)     // Catch: java.lang.Throwable -> L65
            r6.append(r0)     // Catch: java.lang.Throwable -> L65
            r6.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L65
            r(r5)     // Catch: java.lang.Throwable -> L65
        L9e:
            java.lang.String r5 = "onNewIntent"
            java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> Lb1
            a.P8 r7 = new a.P8     // Catch: java.lang.Throwable -> Lb1
            r8 = 4
            r7.<init>(r9, r4, r8)     // Catch: java.lang.Throwable -> Lb1
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.a(r10, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb1
            goto Lb6
        Lb1:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)     // Catch: java.lang.Throwable -> L65
        Lb6:
            java.lang.Throwable r5 = a.C0447wd.a(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto Lda
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "hookVoipActivities onNewIntent fail "
            r6.append(r7)     // Catch: java.lang.Throwable -> L65
            r6.append(r4)     // Catch: java.lang.Throwable -> L65
            r6.append(r0)     // Catch: java.lang.Throwable -> L65
            r6.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L65
            r(r4)     // Catch: java.lang.Throwable -> L65
        Lda:
            int r3 = r3 + 1
            goto L6
        Lde:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "hookVoipActivities fail: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r0)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r(r10)
        L101:
            return
    }
}
