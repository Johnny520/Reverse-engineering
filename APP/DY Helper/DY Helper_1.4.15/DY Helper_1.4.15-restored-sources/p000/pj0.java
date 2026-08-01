package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pj0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f8581 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicInteger f8582 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile java.lang.ClassLoader f8583;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.pj0.f8581 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            p000.pj0.f8582 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4546() {
            java.lang.ClassLoader r0 = p000.pj0.f8583
            if (r0 != 0) goto L6
            goto Lac
        L6:
            r1 = 0
            java.lang.String r2 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54725154BE834FA3D709B9E75880CCD23C93866D"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L36
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            int r2 = r0.length     // Catch: java.lang.Throwable -> L36
            r4 = r3
        L1b:
            if (r4 >= r2) goto L3b
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = "getBottomTabAbility"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L38
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L36
            r6.getClass()     // Catch: java.lang.Throwable -> L36
            int r6 = r6.length     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L38
            goto L3c
        L36:
            r0 = move-exception
            goto L8c
        L38:
            int r4 = r4 + 1
            goto L1b
        L3b:
            r5 = r1
        L3c:
            if (r5 != 0) goto L3f
            goto L89
        L3f:
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r5.invoke(r1, r1)     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L4a
            goto L89
        L4a:
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method[] r4 = r4.getMethods()     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            int r5 = r4.length     // Catch: java.lang.Throwable -> L36
            r6 = r3
        L57:
            if (r6 >= r5) goto L73
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L36
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = "LLILIL"
            boolean r8 = p000.ln0.m3626(r8, r9)     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L70
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L36
            int r8 = r8.length     // Catch: java.lang.Throwable -> L36
            r9 = 3
            if (r8 != r9) goto L70
            goto L74
        L70:
            int r6 = r6 + 1
            goto L57
        L73:
            r7 = r1
        L74:
            if (r7 != 0) goto L77
            goto L89
        L77:
            r7.setAccessible(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "homepage_notification"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r4}     // Catch: java.lang.Throwable -> L36
            r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L36
        L89:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L36
            goto L92
        L8c:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L92:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lac
            java.lang.Throwable r0 = m4550(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "hideHomeNotificationBadge 失败: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            r2 = 4
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5988(r3, r0, r1, r2, r1)
        Lac:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m4547() {
            boolean r0 = p000.ui1.m5867()
            r1 = 1
            if (r0 == 0) goto L8
            goto L3a
        L8:
            r0 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "currentApplication"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r0)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r3 = r2 instanceof android.app.Application     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L25
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L23
            goto L2d
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = r0
            goto L2d
        L27:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L2d:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L32
            goto L33
        L32:
            r0 = r2
        L33:
            android.app.Application r0 = (android.app.Application) r0
            if (r0 == 0) goto L3a
            p000.ui1.m5896(r0)
        L3a:
            java.lang.String r0 = "im_dnd_enabled"
            r2 = 0
            boolean r0 = p000.ui1.m5887(r0, r2)
            if (r0 != 0) goto L46
            r1 = r2
            goto Lc2
        L46:
            java.lang.String r0 = "im_dnd_filter_mode"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L51
            int r0 = r3.getInt(r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
            r0 = r2
        L52:
            if (r0 != 0) goto L56
            goto Lc2
        L56:
            java.lang.String r3 = "im_dnd_include_interactive"
            boolean r3 = p000.ui1.m5887(r3, r1)
            if (r3 == 0) goto L60
            goto Lc2
        L60:
            java.util.List r3 = m4548()     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L6b
            goto La9
        L6b:
            java.util.concurrent.ConcurrentHashMap r4 = p000.ck0.f2176     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = "im_dnd_filter_rules"
            java.lang.String r5 = ""
            java.lang.String r4 = p000.ui1.m5893(r4, r5)     // Catch: java.lang.Throwable -> Lae
            java.util.Set r4 = p000.ck0.m1244(r4)     // Catch: java.lang.Throwable -> Lae
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto L80
            goto La9
        L80:
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto L87
            goto La8
        L87:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lae
        L8b:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto La8
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Lae
            if (r0 == r1) goto La1
            r6 = 2
            if (r0 == r6) goto L9c
            r5 = r1
            goto La5
        L9c:
            boolean r5 = p000.ck0.m1243(r5, r4)     // Catch: java.lang.Throwable -> Lae
            goto La5
        La1:
            boolean r5 = p000.ck0.m1243(r5, r4)     // Catch: java.lang.Throwable -> Lae
        La5:
            if (r5 != 0) goto L8b
            r1 = r2
        La8:
            r2 = r1
        La9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lae
            goto Lb5
        Lae:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lb5:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto Lbc
            r0 = r1
        Lbc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
        Lc2:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.List m4548() {
            jz r0 = p000.C0450jz.f5672
            java.lang.ClassLoader r1 = p000.pj0.f8583
            if (r1 != 0) goto L8
            goto L75
        L8:
            r2 = 0
            r3 = 0
            java.lang.String r4 = "~797C580CB4D77E9FE92654AA8516CA258B49B9B5B3DD68E869FD36B1F6444E46E8F45D24730D5ADFB354C76FE18BD6F86DAE687744FDDD0787F5"
            java.lang.String r4 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.Class r1 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            int r4 = r1.length     // Catch: java.lang.Throwable -> L44
            r5 = r2
        L1d:
            if (r5 >= r4) goto L3b
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L44
            java.lang.String r8 = "LIZ"
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L38
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L44
            r7.getClass()     // Catch: java.lang.Throwable -> L44
            int r7 = r7.length     // Catch: java.lang.Throwable -> L44
            if (r7 != 0) goto L38
            goto L3c
        L38:
            int r5 = r5 + 1
            goto L1d
        L3b:
            r6 = r3
        L3c:
            if (r6 != 0) goto L3f
            goto L44
        L3f:
            java.lang.Object r1 = r6.invoke(r3, r3)     // Catch: java.lang.Throwable -> L44
            goto L45
        L44:
            r1 = r3
        L45:
            if (r1 != 0) goto L48
            goto L75
        L48:
            java.lang.String r4 = "getAllConversation"
            java.lang.String r5 = "getConversationList"
            java.lang.String r6 = "getAllConversationSync"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
        L52:
            r5 = 3
            if (r2 >= r5) goto L72
            r5 = r4[r2]
            java.lang.Object r5 = m4549(r1, r5)     // Catch: java.lang.Throwable -> L5c
            goto L63
        L5c:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L63:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L68
            r5 = r3
        L68:
            boolean r6 = r5 instanceof java.lang.Iterable
            if (r6 == 0) goto L6f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            goto L73
        L6f:
            int r2 = r2 + 1
            goto L52
        L72:
            r5 = r3
        L73:
            if (r5 != 0) goto L76
        L75:
            return r0
        L76:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L7f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()
            if (r2 == 0) goto L7f
            r0.add(r2)
            goto L7f
        L8f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L98:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            java.lang.String r4 = "getUnreadCount"
            java.lang.Object r4 = m4549(r2, r4)
            boolean r5 = r4 instanceof java.lang.Number
            if (r5 == 0) goto Laf
            java.lang.Number r4 = (java.lang.Number) r4
            goto Lb0
        Laf:
            r4 = r3
        Lb0:
            r5 = 0
            if (r4 == 0) goto Lb9
            long r7 = r4.longValue()
            goto Lba
        Lb9:
            r7 = r5
        Lba:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L98
            r1.add(r2)
            goto L98
        Lc2:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Object m4549(java.lang.Object r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            goto L30
        L4:
            java.lang.Class r1 = r6.getClass()
            java.lang.reflect.Method[] r1 = r1.getMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L2d
            r4 = r1[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 == 0) goto L2a
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L2a
            goto L2e
        L2a:
            int r3 = r3 + 1
            goto L11
        L2d:
            r4 = r0
        L2e:
            if (r4 != 0) goto L31
        L30:
            return r0
        L31:
            r7 = 1
            r4.setAccessible(r7)
            java.lang.Object r6 = r4.invoke(r6, r0)
            return r6
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Throwable m4550(java.lang.Throwable r2) {
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            r0 = r2
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            java.lang.Throwable r1 = r0.getTargetException()
            if (r1 == 0) goto L15
            java.lang.Throwable r2 = r0.getTargetException()
            r2.getClass()
            goto L0
        L15:
            return r2
    }
}
