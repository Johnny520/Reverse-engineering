package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19131g;

    public /* synthetic */ sr(int r1) {
            r0 = this;
            r0.f19131g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f19131g
            switch(r0) {
                case 0: goto L1e9;
                case 1: goto L1e1;
                case 2: goto L1d9;
                case 3: goto L1cb;
                case 4: goto L1bf;
                case 5: goto L1b3;
                case 6: goto L1ab;
                case 7: goto L19b;
                case 8: goto L18e;
                case 9: goto L186;
                case 10: goto L174;
                case 11: goto L16c;
                case 12: goto L14d;
                case 13: goto L147;
                case 14: goto L13f;
                case 15: goto L13a;
                case 16: goto Le3;
                case 17: goto Ld9;
                case 18: goto Ld1;
                case 19: goto Lb4;
                case 20: goto La4;
                case 21: goto L86;
                case 22: goto L6d;
                case 23: goto L59;
                case 24: goto L45;
                case 25: goto L3e;
                case 26: goto L2b;
                case 27: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            int r9 = r9.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L17:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            java.lang.Class<android.widget.ImageView> r0 = android.widget.ImageView.class
            java.lang.Class r9 = r9.getType()
            boolean r9 = r0.isAssignableFrom(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L2b:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            int r9 = r9.length()
            if (r9 <= 0) goto L38
            r9 = 1
            goto L39
        L38:
            r9 = 0
        L39:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L3e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = p.a.l(r9, r9)
            return r9
        L45:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            java.lang.Class r9 = r9.getType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r9 = gg.l.a(r9, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L59:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Class r9 = r9.getType()
            boolean r9 = r0.isAssignableFrom(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L6d:
            r9.getClass()
            java.lang.Class r9 = r9.getClass()
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.reflect.Method r9 = h.Hchat.utils.KavaReflector.findMethod(r9, r1, r0)
            return r9
        L86:
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r9 = r9.byteValue()
            java.util.Locale r0 = java.util.Locale.US
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r1 = 1
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            java.lang.String r1 = "%02x"
            java.lang.String r9 = java.lang.String.format(r0, r1, r9)
            return r9
        La4:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            boolean r9 = og.m.t0(r9)
            r9 = r9 ^ 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Lb4:
            og.f r9 = (og.f) r9
            r9.getClass()
            og.i r9 = (og.i) r9
            java.util.List r9 = r9.a()
            r0 = 1
            og.g r9 = (og.g) r9
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            return r9
        Ld1:
            java.lang.reflect.Member r9 = (java.lang.reflect.Member) r9
            u6.c r0 = new u6.c
            r0.<init>(r9)
            return r0
        Ld9:
            u6.c r9 = (u6.c) r9
            java.lang.reflect.Member r9 = r9.a()
            r9.getClass()
            return r9
        Le3:
            android.content.Context r9 = (android.content.Context) r9
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "android.intent.action.PROCESS_TEXT"
            android.content.Intent r1 = r1.setAction(r2)
            java.lang.String r2 = "text/plain"
            android.content.Intent r1 = r1.setType(r2)
            r2 = 0
            java.util.List r0 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            int r3 = r0.size()
        L10c:
            if (r2 >= r3) goto L139
            java.lang.Object r4 = r0.get(r2)
            r5 = r4
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            java.lang.String r6 = r9.getPackageName()
            android.content.pm.ActivityInfo r7 = r5.activityInfo
            java.lang.String r7 = r7.packageName
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L133
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            boolean r6 = r5.exported
            if (r6 == 0) goto L136
            java.lang.String r5 = r5.permission
            if (r5 == 0) goto L133
            int r5 = r9.checkSelfPermission(r5)
            if (r5 != 0) goto L136
        L133:
            r1.add(r4)
        L136:
            int r2 = r2 + 1
            goto L10c
        L139:
            return r1
        L13a:
            e1.b r9 = (e1.b) r9
            sf.n r9 = sf.n.f12433a
            return r9
        L13f:
            wb.jv r9 = (wb.jv) r9
            r9.getClass()
            java.lang.String r9 = r9.f17140a
            return r9
        L147:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            return r9
        L14d:
            fb.c r9 = (fb.c) r9
            r9.getClass()
            java.lang.String r0 = r9.f3431a
            java.lang.String r1 = "tool"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L166
            java.lang.String r9 = r9.f3434d
            boolean r9 = og.m.t0(r9)
            if (r9 != 0) goto L166
            r9 = 1
            goto L167
        L166:
            r9 = 0
        L167:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L16c:
            fb.c r9 = (fb.c) r9
            r9.getClass()
            java.lang.String r9 = r9.f3432b
            return r9
        L174:
            fb.c r9 = (fb.c) r9
            r9.getClass()
            java.lang.String r9 = r9.f3431a
            java.lang.String r0 = "user"
            boolean r9 = gg.l.a(r9, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L186:
            fb.a0 r9 = (fb.a0) r9
            r9.getClass()
            java.lang.String r9 = r9.f3392b
            return r9
        L18e:
            f1.d0 r9 = (f1.d0) r9
            r9.getClass()
            r0 = 1127481344(0x43340000, float:180.0)
            r9.f(r0)
            sf.n r9 = sf.n.f12433a
            return r9
        L19b:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            boolean r9 = og.m.t0(r9)
            r9 = r9 ^ 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L1ab:
            fb.q1 r9 = (fb.q1) r9
            r9.getClass()
            java.lang.String r9 = r9.f3736p
            return r9
        L1b3:
            fb.c r9 = (fb.c) r9
            r9.getClass()
            java.util.List r9 = r9.f3440j
            dg.n r9 = tf.m.m1(r9)
            return r9
        L1bf:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r0 = "- "
            java.lang.String r9 = r0.concat(r9)
            return r9
        L1cb:
            fb.a r9 = (fb.a) r9
            r9.getClass()
            java.lang.String r9 = r9.f3386a
            java.lang.String r0 = "附件: "
            java.lang.String r9 = r0.concat(r9)
            return r9
        L1d9:
            fb.a0 r9 = (fb.a0) r9
            r9.getClass()
            java.lang.String r9 = r9.f3392b
            return r9
        L1e1:
            fb.q1 r9 = (fb.q1) r9
            r9.getClass()
            java.lang.String r9 = r9.f3721a
            return r9
        L1e9:
            fb.c r9 = (fb.c) r9
            r9.getClass()
            java.util.List r9 = r9.f3440j
            dg.n r9 = tf.m.m1(r9)
            return r9
    }
}
