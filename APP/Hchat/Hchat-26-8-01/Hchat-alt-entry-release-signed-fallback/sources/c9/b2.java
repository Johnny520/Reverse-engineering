package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r8.g f1108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f1109c;

    public b2(java.lang.reflect.Method r2, r8.g r3) {
            r1 = this;
            r0 = 0
            r1.f1107a = r0
            r1.f1109c = r2
            r1.f1108b = r3
            r1.<init>()
            return
    }

    public b2(o9.c r1, r8.g r2, java.lang.reflect.Method r3) {
            r0 = this;
            r1 = 1
            r0.f1107a = r1
            r0.f1108b = r2
            r0.f1109c = r3
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f1107a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r3)
            return
        L9:
            r3.getClass()
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Object r3 = r3.thisObject
            java.lang.reflect.Method r0 = r2.f1109c
            r8.g r1 = r2.f1108b
            android.content.Context r1 = r1.f11620a
            if (r3 == 0) goto L2d
            java.lang.Class r0 = r0.getDeclaringClass()
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L23
            goto L2d
        L23:
            java.lang.Object r0 = c9.d2.f1153q
            if (r0 != r3) goto L28
            goto L2d
        L28:
            c9.d2.f1153q = r3
            c9.d2.y(r1)
        L2d:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            int r0 = r12.f1107a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r13)
            return
        L9:
            r13.getClass()
            java.lang.Object[] r0 = r13.args
            java.lang.String r1 = ""
            java.lang.String r2 = "weixin://weixinhongbao/hchat/group_leave_profile/"
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L17
            goto L1b
        L17:
            int r5 = r0.length
            r6 = r3
        L19:
            if (r6 < r5) goto L1d
        L1b:
            r7 = r4
            goto L77
        L1d:
            r7 = r0[r6]
            if (r7 != 0) goto L23
        L21:
            r7 = r1
            goto L71
        L23:
            boolean r8 = r7 instanceof java.lang.CharSequence
            if (r8 == 0) goto L2c
            java.lang.String r7 = r7.toString()
            goto L71
        L2c:
            java.lang.String r8 = r7.toString()
            boolean r9 = og.t.d0(r8, r2, r3)
            if (r9 == 0) goto L38
            r7 = r8
            goto L71
        L38:
            java.lang.Class r8 = r7.getClass()
        L3c:
            if (r8 == 0) goto L21
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L21
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredFields(r8)
            java.util.Iterator r9 = r9.iterator()
        L4e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r10, r7)
            if (r10 == 0) goto L4e
            java.lang.String r10 = r10.toString()
            boolean r11 = og.t.d0(r10, r2, r3)
            if (r11 == 0) goto L4e
            r7 = r10
            goto L71
        L6c:
            java.lang.Class r8 = r8.getSuperclass()
            goto L3c
        L71:
            boolean r8 = og.t.d0(r7, r2, r3)
            if (r8 == 0) goto L142
        L77:
            if (r7 == 0) goto L141
            boolean r0 = og.t.d0(r7, r2, r3)
            if (r0 != 0) goto L81
            r0 = r1
            goto L96
        L81:
            r0 = 49
            java.lang.String r0 = r7.substring(r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            if (r0 != 0) goto L8e
            r0 = r1
        L8e:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
        L96:
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L9e
            goto L141
        L9e:
            java.lang.Object[] r2 = r13.args
            if (r2 == 0) goto Lbc
            int r5 = r2.length
            r6 = r3
        La4:
            if (r6 >= r5) goto Lb0
            r7 = r2[r6]
            boolean r8 = r7 instanceof android.view.View
            if (r8 == 0) goto Lad
            goto Lb1
        Lad:
            int r6 = r6 + 1
            goto La4
        Lb0:
            r7 = r4
        Lb1:
            if (r7 == 0) goto Lbc
            android.view.View r7 = (android.view.View) r7
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto Lbc
            goto Lc0
        Lbc:
            r8.g r2 = r12.f1108b
            android.content.Context r2 = r2.f11620a
        Lc0:
            boolean r5 = og.m.t0(r0)
            if (r5 == 0) goto Lc7
            goto L122
        Lc7:
            q8.m r5 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r5 == 0) goto Ld2
            java.lang.String r5 = r5.a()
            goto Ld3
        Ld2:
            r5 = r4
        Ld3:
            if (r5 != 0) goto Ld6
            goto Ld7
        Ld6:
            r1 = r5
        Ld7:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r6 = new android.content.ComponentName
            java.lang.String r7 = r2.getPackageName()
            java.lang.String r8 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            r6.<init>(r7, r8)
            r5.setComponent(r6)
            java.lang.String r6 = "Contact_User"
            r5.putExtra(r6, r0)
            java.lang.String r0 = "@chatroom"
            boolean r0 = og.t.W(r1, r0, r3)
            java.lang.String r6 = "Contact_Scene"
            if (r0 != 0) goto L107
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = og.t.W(r1, r0, r3)
            if (r0 == 0) goto L102
            goto L107
        L102:
            r0 = 3
            r5.putExtra(r6, r0)
            goto L116
        L107:
            java.lang.String r0 = "Contact_ChatRoomId"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "room_name"
            r5.putExtra(r0, r1)
            r0 = 14
            r5.putExtra(r6, r0)
        L116:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 != 0) goto L11f
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r0)
        L11f:
            r2.startActivity(r5)     // Catch: java.lang.Throwable -> L122
        L122:
            java.lang.reflect.Method r0 = r12.f1109c
            java.lang.Class r1 = r0.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L13c
            java.lang.Class r0 = r0.getReturnType()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L13e
        L13c:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        L13e:
            r13.setResult(r4)
        L141:
            return
        L142:
            int r6 = r6 + 1
            goto L19
    }
}
