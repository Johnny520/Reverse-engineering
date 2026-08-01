package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 {

    /* JADX INFO: renamed from: α */
    public static final p000.qj1 f9022 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f9023 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f9024 = null;

    static {
            qj1 r0 = new qj1
            r0.<init>()
            p000.qj1.f9022 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.qj1.f9023 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.qj1.f9024 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4886(p000.qj1 r2, java.lang.Object r3, android.view.View r4) {
            java.lang.Object r2 = p000.uj1.m5909(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.nj1.f7649
            boolean r2 = p000.uj1.m5908(r2)
            if (r2 != 0) goto L25
            java.lang.Object r2 = p000.nj1.f7650
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.Float r3 = (java.lang.Float) r3     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 == 0) goto L4b
            float r2 = r3.floatValue()
            p000.nj1.m4077(r4, r2)
            return
        L22:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L25:
            p000.nj1.m4075()
            java.lang.Object r2 = p000.nj1.f7650
            monitor-enter(r2)
            boolean r3 = p000.nj1.m4071(r4)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3b
            java.util.WeakHashMap r3 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L39
            r0 = 1
            goto L3d
        L39:
            r3 = move-exception
            goto L81
        L3b:
            r3 = 0
            r0 = 0
        L3d:
            monitor-exit(r2)
            if (r0 == 0) goto L4c
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L4b
            float r2 = r3.floatValue()
            p000.nj1.m4077(r4, r2)
        L4b:
            return
        L4c:
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r3.get(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            float r3 = r0.floatValue()     // Catch: java.lang.Throwable -> L5c
            goto L72
        L5c:
            r3 = move-exception
            goto L7f
        L5e:
            java.util.Set r0 = p000.rj1.f9389     // Catch: java.lang.Throwable -> L5c
            float r0 = r4.getAlpha()     // Catch: java.lang.Throwable -> L5c
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.rj1.m5100(r0, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L5c
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L5c
            r3 = r0
        L72:
            monitor-exit(r2)
            java.util.Set r2 = p000.rj1.f9389
            float r2 = p000.nj1.f7655
            float r2 = p000.rj1.m5100(r3, r2)
            p000.nj1.m4077(r4, r2)
            return
        L7f:
            monitor-exit(r2)
            throw r3
        L81:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public static final void m4887(p000.qj1 r4, java.lang.Object r5, android.view.View r6) {
            java.lang.Object r4 = p000.uj1.m5909(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.nj1.f7649
            boolean r4 = p000.uj1.m5908(r4)
            if (r4 != 0) goto L25
            java.lang.Object r4 = p000.nj1.f7650
            monitor-enter(r4)
            java.util.WeakHashMap r5 = p000.nj1.f7653     // Catch: java.lang.Throwable -> L22
            java.lang.Object r5 = r5.remove(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            if (r5 == 0) goto L21
            float r4 = r5.floatValue()
            p000.nj1.m4077(r6, r4)
        L21:
            return
        L22:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L25:
            p000.nj1.m4075()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r5 = p000.nj1.f7650
            monitor-enter(r5)
            java.util.WeakHashMap r0 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L7e
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7e
        L3a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L7e
            r1.getClass()     // Catch: java.lang.Throwable -> L7e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.nj1.f7649     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L7e
            r2.getClass()     // Catch: java.lang.Throwable -> L7e
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L7e
        L54:
            if (r2 == 0) goto L67
            if (r2 != r6) goto L5a
            r2 = 1
            goto L68
        L5a:
            android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L7e
            boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L65
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L7e
            goto L54
        L65:
            r2 = 0
            goto L54
        L67:
            r2 = 0
        L68:
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L7e
            l91 r3 = new l91     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L7e
            r4.add(r3)     // Catch: java.lang.Throwable -> L7e
            r0.remove()     // Catch: java.lang.Throwable -> L7e
            goto L3a
        L7e:
            r4 = move-exception
            goto Ld0
        L80:
            java.util.WeakHashMap r0 = p000.nj1.f7653     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Float r1 = (java.lang.Float) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L8f
            float r0 = r1.floatValue()     // Catch: java.lang.Throwable -> L7e
            goto La3
        L8f:
            java.util.Set r1 = p000.rj1.f9389     // Catch: java.lang.Throwable -> L7e
            float r1 = r6.getAlpha()     // Catch: java.lang.Throwable -> L7e
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = p000.rj1.m5100(r1, r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.Float r2 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L7e
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L7e
            r0 = r1
        La3:
            monitor-exit(r5)
            java.util.Iterator r4 = r4.iterator()
        La8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc4
            java.lang.Object r5 = r4.next()
            l91 r5 = (p000.l91) r5
            java.lang.Object r1 = r5.f6502
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r5 = r5.f6503
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            p000.nj1.m4077(r1, r5)
            goto La8
        Lc4:
            java.util.Set r4 = p000.rj1.f9389
            float r4 = p000.nj1.f7655
            float r4 = p000.rj1.m5100(r0, r4)
            p000.nj1.m4077(r6, r4)
            return
        Ld0:
            monitor-exit(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ζ */
    public static void m4888(java.lang.String r1, java.lang.String r2) {
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.qj1.f9024
            boolean r1 = r0.add(r1)
            if (r1 == 0) goto L11
            java.lang.String r1 = "ProfileVideoOverlayAlphaHook: "
            java.lang.String r1 = r1.concat(r2)
            p000.C0888ux.m5985(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m4889(java.lang.ClassLoader r11) {
            r10 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F23F37A5FAABC9A96D4C6BD66211338CEF27A1FAB166CE0E4422D8132D6EA4"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r11 = p000.qe0.m4877(r11, r0)
            r0 = 0
            if (r11 != 0) goto L17
            java.lang.String r10 = "comment_class"
            java.lang.String r11 = "CommentInputFragment 不存在，跳过评论栏透明度"
            m4888(r10, r11)
            return r0
        L17:
            java.util.concurrent.ConcurrentHashMap r1 = p000.uj1.f10859
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = r0
        L22:
            r4 = 0
            if (r3 >= r2) goto L57
            r5 = r1[r3]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "onCreateView"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L54
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r7 = r5.getReturnType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L54
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            java.lang.Class<android.view.LayoutInflater> r9 = android.view.LayoutInflater.class
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r7, r8}
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 == 0) goto L54
            goto L58
        L54:
            int r3 = r3 + 1
            goto L22
        L57:
            r5 = r4
        L58:
            r1 = 1
            if (r5 == 0) goto L5f
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L60
            goto L60
        L5f:
            r5 = r4
        L60:
            if (r5 != 0) goto L6b
            java.lang.String r10 = "comment_create"
            java.lang.String r2 = "评论栏 onCreateView 结构不匹配，跳过初始透明度"
            m4888(r10, r2)
            r10 = r0
            goto La5
        L6b:
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L78
            pj1 r3 = new pj1     // Catch: java.lang.Throwable -> L78
            r3.<init>(r10, r0)     // Catch: java.lang.Throwable -> L78
            r2.m6775(r5, r3)     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r10 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r10)
            r10 = r2
        L7f:
            java.lang.Throwable r2 = p000.fo1.m2190(r10)
            if (r2 != 0) goto L86
            goto L9f
        L86:
            java.lang.String r10 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "评论栏生命周期 Hook 安装失败: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r2 = "comment_create_install"
            m4888(r2, r10)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
        L9f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
        La5:
            java.util.concurrent.ConcurrentHashMap r2 = p000.uj1.f10859
            java.lang.reflect.Method[] r11 = r11.getDeclaredMethods()
            r11.getClass()
            int r2 = r11.length
            r3 = r0
        Lb0:
            if (r3 >= r2) goto Le0
            r5 = r11[r3]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "y90"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Ldd
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Ldd
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.Class[] r7 = new java.lang.Class[]{r7}
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 == 0) goto Ldd
            goto Le1
        Ldd:
            int r3 = r3 + 1
            goto Lb0
        Le0:
            r5 = r4
        Le1:
            if (r5 == 0) goto Le7
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> Le6
        Le6:
            r4 = r5
        Le7:
            if (r4 != 0) goto Lf1
            java.lang.String r11 = "comment_alpha"
            java.lang.String r0 = "宿主评论栏动态 alpha 方法未命中，保留初始透明度降级"
            m4888(r11, r0)
            goto L133
        Lf1:
            xq0 r11 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L100
            ad1 r2 = new ad1     // Catch: java.lang.Throwable -> L100
            r3 = 10
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L100
            r11.m6775(r4, r2)     // Catch: java.lang.Throwable -> L100
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L100
            goto L107
        L100:
            r11 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r11)
            r11 = r2
        L107:
            java.lang.Throwable r2 = p000.fo1.m2190(r11)
            if (r2 != 0) goto L10e
            goto L127
        L10e:
            java.lang.String r11 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "评论栏动态 alpha Hook 安装失败: "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            java.lang.String r2 = "comment_alpha_install"
            m4888(r2, r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L127:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r10 != 0) goto L131
            if (r11 == 0) goto L132
        L131:
            r0 = r1
        L132:
            r10 = r0
        L133:
            return r10
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m4890(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB573EB3C6BF6486D9CA923ECD4F3CA9B9F844040DE3B405B321C12B300DF2FF5847E2041E475509941D7375173DEE04AE352B86D239ED54EBA58B"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r10 = p000.qe0.m4877(r10, r0)
            r0 = 0
            if (r10 != 0) goto L17
            java.lang.String r9 = "search_class"
            java.lang.String r10 = "SearchBarViewHolder 不存在，跳过顶部搜索框透明度"
            m4888(r9, r10)
            return r0
        L17:
            java.util.concurrent.ConcurrentHashMap r1 = p000.uj1.f10859
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r10.length
            r3 = r0
        L27:
            r4 = 1
            if (r3 >= r2) goto L6d
            r5 = r10[r3]
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class r7 = r5.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L6a
            int r7 = r6.length
            r8 = 3
            if (r7 != r8) goto L6a
            java.lang.Class<android.view.View> r7 = android.view.View.class
            r8 = r6[r0]
            boolean r7 = r7.isAssignableFrom(r8)
            if (r7 == 0) goto L6a
            r4 = r6[r4]
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A64899A3BF2D3979A9BE4B6F08420571E569B93E597"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L6a
            r4 = 2
            r4 = r6[r4]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L6a
            r1.add(r5)
        L6a:
            int r3 = r3 + 1
            goto L27
        L6d:
            java.lang.Object r10 = p000.AbstractC0984xh.m6656(r1)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto L79
            r10.setAccessible(r4)     // Catch: java.lang.Throwable -> L7a
            goto L7a
        L79:
            r10 = 0
        L7a:
            if (r10 != 0) goto L84
            java.lang.String r9 = "search_method"
            java.lang.String r10 = "搜索绑定方法结构不匹配，跳过顶部搜索框透明度"
            m4888(r9, r10)
            return r0
        L84:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L93
            ad1 r1 = new ad1     // Catch: java.lang.Throwable -> L93
            r2 = 11
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L93
            r0.m6775(r10, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L9a:
            java.lang.Throwable r10 = p000.fo1.m2190(r9)
            if (r10 != 0) goto La1
            goto Lba
        La1:
            java.lang.String r9 = r10.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "搜索框 Hook 安装失败: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "search_install"
            m4888(r10, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        Lba:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m4891(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78FFFE05059D677C5F115118CB977FD0DCE8657A2E98D251DB866B63984386F2A0411E448BECDC6B84344ACF6911540122A04C3456A0135425432108287CC6CFDC2964B80B9BA7AB0F16AE93A58D0BBDA47F16F7F066A1090EC6"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r9 = p000.qe0.m4877(r9, r0)
            r0 = 0
            if (r9 != 0) goto L10
            return r0
        L10:
            java.util.concurrent.ConcurrentHashMap r1 = p000.uj1.f10859
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()
            r9.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r9.length
            r3 = r0
        L20:
            r4 = 1
            if (r3 >= r2) goto L4c
            r5 = r9[r3]
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L49
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != r4) goto L49
            java.lang.Class[] r4 = r5.getParameterTypes()
            r4 = r4[r0]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L49
            r1.add(r5)
        L49:
            int r3 = r3 + 1
            goto L20
        L4c:
            java.lang.Object r9 = p000.AbstractC0984xh.m6656(r1)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L58
            r9.setAccessible(r4)     // Catch: java.lang.Throwable -> L59
            goto L59
        L58:
            r9 = 0
        L59:
            if (r9 != 0) goto L63
            java.lang.String r8 = "ultra_comment_method"
            java.lang.String r9 = "新版评论底栏绑定方法结构不匹配，使用子 Fragment 降级"
            m4888(r8, r9)
            return r0
        L63:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L70
            pj1 r1 = new pj1     // Catch: java.lang.Throwable -> L70
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L70
            r0.m6775(r9, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L70
            goto L77
        L70:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L77:
            java.lang.Throwable r9 = p000.fo1.m2190(r8)
            if (r9 != 0) goto L7e
            goto L97
        L7e:
            java.lang.String r8 = r9.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "新版评论底栏 Hook 安装失败: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "ultra_comment_install"
            m4888(r9, r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L97:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
    }
}
