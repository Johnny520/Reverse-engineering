package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileUidInjectHook {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook INSTANCE = null;
    private static final int MAX_RETRY = 10;
    private static final java.lang.String PAD_USER_FRAGMENT_CLASS = null;
    private static final long RETRY_DELAY_MS = 180;
    private static final java.lang.String TAG = "ProfileUidInjectHook";
    private static final java.lang.String UID_TAG = "dyhelper_profile_uid_view";
    private static final java.lang.String[] USER_FIELD_CANDIDATES = null;
    private static final java.lang.String USER_FRAGMENT_CLASS = null;
    private static final java.lang.String WRAPPER_TAG = "dyhelper_profile_wrapper";
    private static final java.util.WeakHashMap<java.lang.Object, java.lang.ref.WeakReference<android.widget.TextView>> injectedByFragment = null;
    private static final java.util.concurrent.atomic.AtomicBoolean installed = null;
    private static final android.os.Handler mainHandler = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE = r0
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A325AEF903414FAFE45A7E3E2147D4EB64C679F2AFDEF96783477651D7DF068CED"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.USER_FRAGMENT_CLASS = r0
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836217D34BD7D72D16231458ADC81F3BB67CF752648FD34F650B7E71CDB9B002211E983EBC3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.PAD_USER_FRAGMENT_CLASS = r0
            java.lang.String r0 = "n"
            java.lang.String r1 = "w"
            java.lang.String r2 = "B"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.USER_FIELD_CANDIDATES = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.installed = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.mainHandler = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.injectedByFragment = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.$stable = r0
            return
    }

    private ProfileUidInjectHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$cleanup(com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0, java.lang.Object r1) {
            r0.cleanup(r1)
            return
    }

    private final void cleanup(java.lang.Object r4) {
            r3 = this;
            java.util.WeakHashMap<java.lang.Object, java.lang.ref.WeakReference<android.widget.TextView>> r3 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.injectedByFragment
            java.lang.Object r3 = r3.remove(r4)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 != 0) goto Lb
            goto L51
        Lb:
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L51
            android.view.ViewParent r4 = r3.getParent()     // Catch: java.lang.Throwable -> L51
            boolean r0 = r4 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L51
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch: java.lang.Throwable -> L51
            goto L20
        L1f:
            r4 = r1
        L20:
            if (r4 == 0) goto L27
            java.lang.Object r0 = r4.getTag()     // Catch: java.lang.Throwable -> L51
            goto L28
        L27:
            r0 = r1
        L28:
            java.lang.String r2 = "dyhelper_profile_wrapper"
            boolean r0 = p000.ln0.m3626(r0, r2)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L41
            android.view.ViewParent r3 = r4.getParent()     // Catch: java.lang.Throwable -> L51
            boolean r0 = r3 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L3b
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L51
        L3b:
            if (r1 == 0) goto L51
            r1.removeView(r4)     // Catch: java.lang.Throwable -> L51
            goto L51
        L41:
            android.view.ViewParent r4 = r3.getParent()     // Catch: java.lang.Throwable -> L51
            boolean r0 = r4 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4c
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L51
        L4c:
            if (r1 == 0) goto L51
            r1.removeView(r3)     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    private final android.view.ViewGroup.LayoutParams cloneLayoutParams(android.view.ViewGroup r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            java.lang.Class r0 = r4.getClass()
        L8:
            if (r0 == 0) goto L2e
            java.lang.String r1 = "generateLayoutParams"
            java.lang.Class<android.view.ViewGroup$LayoutParams> r2 = android.view.ViewGroup.LayoutParams.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof android.view.ViewGroup.LayoutParams     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L29
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1     // Catch: java.lang.Throwable -> L29
            return r1
        L29:
            java.lang.Class r0 = r0.getSuperclass()
            goto L8
        L2e:
            return r3
    }

    private final android.widget.TextView createUidView(android.app.Activity r5, java.lang.String r6) {
            r4 = this;
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r5)
            java.lang.String r0 = "dyhelper_profile_uid_view"
            r4.setTag(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UID: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
            java.lang.String r0 = "#99FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            r4.setTextSize(r1, r0)
            r0 = 0
            r4.setIncludeFontPadding(r0)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r4.setGravity(r2)
            r2 = 1
            r4.setMaxLines(r2)
            r3 = 1064514355(0x3f733333, float:0.95)
            r4.setAlpha(r3)
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r3 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            int r1 = r3.m1460dp(r5, r1)
            r4.setPadding(r0, r1, r0, r0)
            r4.setVisibility(r0)
            r4.setClickable(r2)
            c9 r0 = new c9
            r0.<init>(r4, r5, r6)
            r4.setOnClickListener(r0)
            return r4
    }

    private static final void createUidView$lambda$29$lambda$28(android.widget.TextView r0, android.app.Activity r1, java.lang.String r2, android.view.View r3) {
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L26
            boolean r3 = r0 instanceof android.content.ClipboardManager     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto Ld
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.Throwable -> L26
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L23
            java.lang.String r3 = "UID"
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r3, r2)     // Catch: java.lang.Throwable -> L26
            r0.setPrimaryClip(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "UID已复制到剪贴板"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch: java.lang.Throwable -> L26
            r0.show()     // Catch: java.lang.Throwable -> L26
        L23:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2d:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3a
            java.lang.String r1 = "ProfileUidInjectHook"
            java.lang.String r2 = "copy uid failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L3a:
            return
    }

    /* JADX INFO: renamed from: dp */
    private final int m1460dp(android.app.Activity r1, int r2) {
            r0 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r2
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private final android.app.Activity findActivity(java.lang.Object r2) {
            r1 = this;
            java.lang.String r1 = "getActivity"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = p000.qe0.m4869(r2, r1, r0)     // Catch: java.lang.Throwable -> L10
            boolean r2 = r1 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L10
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    private final java.lang.reflect.Method findBooleanMethod(java.lang.Class<?> r8, java.lang.String r9) {
            r7 = this;
        L0:
            r7 = 0
            if (r8 == 0) goto L46
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L46
            java.lang.reflect.Method[] r0 = r8.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto L3e
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = p000.ln0.m3626(r5, r9)
            if (r5 == 0) goto L3b
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            r6 = 1
            if (r5 != r6) goto L3b
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r2]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L3b
            r7 = r4
            goto L3e
        L3b:
            int r3 = r3 + 1
            goto L15
        L3e:
            if (r7 == 0) goto L41
            return r7
        L41:
            java.lang.Class r8 = r8.getSuperclass()
            goto L0
        L46:
            return r7
    }

    private final java.lang.Object findHostFragment(android.view.ViewGroup r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    private final android.widget.TextView findInjectedView(java.lang.Object r1) {
            r0 = this;
            java.util.WeakHashMap<java.lang.Object, java.lang.ref.WeakReference<android.widget.TextView>> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.injectedByFragment
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    private final android.view.View findUniqueIdTextView(android.view.ViewGroup r1) {
            r0 = this;
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            android.view.View r0 = findUniqueIdTextView$dfs(r0, r1)
            return r0
    }

    private static final android.view.View findUniqueIdTextView$dfs(java.util.IdentityHashMap<android.view.View, java.lang.Boolean> r8, android.view.View r9) {
            r0 = 0
            if (r9 != 0) goto L5
            goto L91
        L5:
            boolean r1 = r8.containsKey(r9)
            if (r1 == 0) goto Ld
            goto L91
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.put(r9, r1)
            boolean r1 = r9 instanceof android.widget.TextView
            r2 = 0
            if (r1 == 0) goto L77
            r1 = r9
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r3 = r1.getText()
            if (r3 == 0) goto L25
            java.lang.String r3 = r3.toString()
            goto L26
        L25:
            r3 = r0
        L26:
            java.lang.String r4 = ""
            if (r3 != 0) goto L2b
            r3 = r4
        L2b:
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r1 = r1.getContentDescription()
            if (r1 == 0) goto L3e
            java.lang.String r1 = r1.toString()
            goto L3f
        L3e:
            r1 = r0
        L3f:
            if (r1 != 0) goto L42
            goto L43
        L42:
            r4 = r1
        L43:
            java.lang.CharSequence r1 = p000.q02.m4660(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "抖音号"
            boolean r5 = p000.q02.m4654(r3, r4, r2)
            if (r5 != 0) goto L76
            java.lang.String r5 = "UID"
            r6 = 1
            boolean r7 = p000.q02.m4654(r3, r5, r6)
            if (r7 != 0) goto L76
            java.lang.String r7 = "unique"
            boolean r3 = p000.q02.m4654(r3, r7, r6)
            if (r3 != 0) goto L76
            boolean r3 = p000.q02.m4654(r1, r4, r2)
            if (r3 != 0) goto L76
            boolean r3 = p000.q02.m4654(r1, r5, r6)
            if (r3 != 0) goto L76
            boolean r1 = p000.q02.m4654(r1, r7, r6)
            if (r1 == 0) goto L77
        L76:
            return r9
        L77:
            boolean r1 = r9 instanceof android.view.ViewGroup
            if (r1 == 0) goto L91
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r1 = r9.getChildCount()
        L81:
            if (r2 >= r1) goto L91
            android.view.View r3 = r9.getChildAt(r2)
            android.view.View r3 = findUniqueIdTextView$dfs(r8, r3)
            if (r3 == 0) goto L8e
            return r3
        L8e:
            int r2 = r2 + 1
            goto L81
        L91:
            return r0
    }

    private final void hookFragment(java.lang.ClassLoader r5, java.lang.String r6) {
            r4 = this;
            java.lang.Class r5 = p000.qe0.m4877(r5, r6)
            if (r5 != 0) goto L8
            goto L9a
        L8:
            java.lang.String r0 = "onViewCreated"
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$1$1 r3 = new com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$1$1     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L1c
            l01 r0 = p000.qe0.m4873(r5, r0, r1)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L23:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            java.lang.String r1 = "ProfileUidInjectHook"
            if (r0 == 0) goto L34
            java.lang.String r2 = "hook onViewCreated failed: "
            java.lang.String r2 = r2.concat(r6)
            p000.C0888ux.m5977(r1, r2, r0)
        L34:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "onResume"
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$3$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$3$1     // Catch: java.lang.Throwable -> L46
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L46
            l01 r0 = p000.qe0.m4873(r5, r0, r2)     // Catch: java.lang.Throwable -> L46
            goto L4d
        L46:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L4d:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L5c
            java.lang.String r2 = "hook onResume failed: "
            java.lang.String r2 = r2.concat(r6)
            p000.C0888ux.m5977(r1, r2, r0)
        L5c:
            gy0 r0 = new gy0
            r2 = 1
            r0.<init>(r2)
            java.lang.String r2 = "setUserVisibleHint"
            r4.hookOptionalBooleanMethod(r5, r2, r0)
            gy0 r0 = new gy0
            r2 = 2
            r0.<init>(r2)
            java.lang.String r2 = "onHiddenChanged"
            r4.hookOptionalBooleanMethod(r5, r2, r0)
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "onDestroyView"
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$7$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookFragment$7$1     // Catch: java.lang.Throwable -> L84
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r4 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L84
            l01 r4 = p000.qe0.m4873(r5, r0, r4)     // Catch: java.lang.Throwable -> L84
            goto L8b
        L84:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L8b:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L9a
            java.lang.String r5 = "hook onDestroyView failed: "
            java.lang.String r5 = r5.concat(r6)
            p000.C0888ux.m5977(r1, r5, r4)
        L9a:
            return
    }

    private static final p000.s62 hookFragment$lambda$4(p000.k01 r3, boolean r4) {
            r3.getClass()
            if (r4 == 0) goto L12
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r4 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            java.lang.Object r3 = r3.f5691
            r3.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            scheduleInject$default(r4, r3, r2, r0, r1)
        L12:
            s62 r3 = p000.s62.f9751
            return r3
    }

    private static final p000.s62 hookFragment$lambda$5(p000.k01 r3, boolean r4) {
            r3.getClass()
            if (r4 != 0) goto L12
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r4 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            java.lang.Object r3 = r3.f5691
            r3.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            scheduleInject$default(r4, r3, r2, r0, r1)
        L12:
            s62 r3 = p000.s62.f9751
            return r3
    }

    private final void hookOptionalBooleanMethod(java.lang.Class<?> r6, java.lang.String r7, p000.e80 r8) {
            r5 = this;
            java.lang.reflect.Method r5 = r5.findBooleanMethod(r6, r7)
            java.lang.String r0 = "(boolean)"
            java.lang.String r1 = "#"
            java.lang.String r2 = "ProfileUidInjectHook"
            if (r5 != 0) goto L1a
            java.lang.String r5 = r6.getName()
            java.lang.String r6 = "optional method missing: "
            java.lang.String r5 = p000.lz1.m3689(r6, r5, r1, r7, r0)
            p000.C0888ux.m5975(r2, r5)
            return
        L1a:
            r3 = 1
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L2a
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2a
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookOptionalBooleanMethod$1$1 r4 = new com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook$hookOptionalBooleanMethod$1$1     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            l01 r5 = r3.m6775(r5, r4)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r5 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r5)
            r5 = r8
        L31:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L44
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "hook optional method failed: "
            java.lang.String r6 = p000.lz1.m3689(r8, r6, r1, r7, r0)
            p000.C0888ux.m5977(r2, r6, r5)
        L44:
            return
    }

    private final boolean isConstraintLayoutParent(android.view.ViewGroup r2) {
            r1 = this;
            java.lang.Class r1 = r2.getClass()
        L4:
            if (r1 == 0) goto L19
            java.lang.String r2 = r1.getName()
            java.lang.String r0 = "androidx.constraintlayout.widget.ConstraintLayout"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L14
            r1 = 1
            return r1
        L14:
            java.lang.Class r1 = r1.getSuperclass()
            goto L4
        L19:
            r1 = 0
            return r1
    }

    private final java.lang.String resolveUid(java.lang.Object r8) {
            r7 = this;
            r7 = 0
            java.lang.String[] r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.USER_FIELD_CANDIDATES     // Catch: java.lang.Throwable -> L5e
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto L60
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r4 = p000.qe0.m4879(r8, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L12
        L10:
            r4 = r7
            goto L52
        L12:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L10
            boolean r5 = r4 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L10
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L1f
            goto L10
        L1f:
            java.lang.String r5 = "uid"
            java.lang.Object r4 = p000.qe0.m4879(r4, r5)     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r4 = move-exception
            goto L4c
        L2e:
            r4 = r7
        L2f:
            if (r4 == 0) goto L10
            boolean r5 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L10
            r5 = r2
        L38:
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L2c
            if (r5 >= r6) goto L52
            char r6 = r4.charAt(r5)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = java.lang.Character.isDigit(r6)     // Catch: java.lang.Throwable -> L2c
            if (r6 != 0) goto L49
            goto L10
        L49:
            int r5 = r5 + 1
            goto L38
        L4c:
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            r4 = r5
        L52:
            boolean r5 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L57
            r4 = r7
        L57:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L67
            int r3 = r3 + 1
            goto L6
        L5e:
            r8 = move-exception
            goto L62
        L60:
            r4 = r7
            goto L67
        L62:
            eo1 r4 = new eo1
            r4.<init>(r8)
        L67:
            boolean r8 = r4 instanceof p000.eo1
            if (r8 == 0) goto L6c
            r4 = r7
        L6c:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L78
            boolean r8 = p000.q02.m4671(r4)
            if (r8 == 0) goto L77
            goto L78
        L77:
            return r4
        L78:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r8 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = r8.getLastProfileRecord()
            if (r8 == 0) goto L8d
            java.lang.String r8 = r8.getUid()
            if (r8 == 0) goto L8d
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L8d
            goto L8e
        L8d:
            r8 = r7
        L8e:
            if (r8 == 0) goto L98
            boolean r0 = p000.q02.m4671(r8)
            if (r0 == 0) goto L97
            goto L98
        L97:
            return r8
        L98:
            java.util.concurrent.atomic.AtomicReference r8 = p000.b10.f1403
            java.lang.String r8 = p000.b10.f1405
            if (r8 == 0) goto La5
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto La5
            r7 = r8
        La5:
            return r7
    }

    private final void scheduleInject(java.lang.Object r3, int r4) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L12
            r2.tryInject(r3, r4)
            return
        L12:
            android.os.Handler r2 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.mainHandler
            jj1 r0 = new jj1
            r1 = 0
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
    }

    public static /* synthetic */ void scheduleInject$default(com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0, java.lang.Object r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.scheduleInject(r1, r2)
            return
    }

    private static final void scheduleInject$lambda$11(java.lang.Object r1, int r2) {
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            r0.tryInject(r1, r2)
            return
    }

    private final void tryInject(java.lang.Object r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.app.Activity r3 = r16.findActivity(r17)
            if (r3 != 0) goto Le
            goto L178
        Le:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L19
            android.view.View r4 = r4.getDecorView()
            goto L1a
        L19:
            r4 = 0
        L1a:
            boolean r6 = r4 instanceof android.view.ViewGroup
            if (r6 == 0) goto L21
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L22
        L21:
            r4 = 0
        L22:
            if (r4 != 0) goto L26
            goto L178
        L26:
            java.lang.String r6 = r16.resolveUid(r17)
            r7 = 180(0xb4, double:8.9E-322)
            r9 = 10
            if (r6 == 0) goto L16b
            boolean r10 = p000.q02.m4671(r6)
            if (r10 == 0) goto L38
            goto L16b
        L38:
            android.view.View r4 = r0.findUniqueIdTextView(r4)
            if (r4 != 0) goto L4c
            if (r2 >= r9) goto L178
            android.os.Handler r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.mainHandler
            jj1 r3 = new jj1
            r4 = 2
            r3.<init>(r2, r4, r1)
            r0.postDelayed(r3, r7)
            return
        L4c:
            java.lang.String r2 = "profile_uid_show_enabled"
            r7 = 0
            boolean r2 = p000.ui1.m5887(r2, r7)
            java.lang.String r8 = "profile_bookmark_hook_enabled"
            boolean r8 = p000.ui1.m5887(r8, r7)
            r9 = 1
            if (r8 == 0) goto L66
            java.lang.String r8 = "profile_bookmark_show_enabled"
            boolean r8 = p000.ui1.m5887(r8, r7)
            if (r8 == 0) goto L66
            r8 = r9
            goto L67
        L66:
            r8 = r7
        L67:
            if (r2 != 0) goto L6d
            if (r8 != 0) goto L6d
            goto L178
        L6d:
            android.view.ViewParent r10 = r4.getParent()
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L78
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            goto L79
        L78:
            r10 = 0
        L79:
            if (r10 != 0) goto L7d
            goto L178
        L7d:
            java.lang.Object r11 = r10.getTag()
            java.lang.String r12 = "dyhelper_profile_wrapper"
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L8b
            goto L178
        L8b:
            android.view.View r11 = r10.findViewWithTag(r12)
            if (r11 == 0) goto L93
            goto L178
        L93:
            android.widget.TextView r11 = r16.findInjectedView(r17)
            r13 = 8
            if (r11 == 0) goto Lba
            java.lang.Object r0 = r11.getTag()
            java.lang.String r1 = "dyhelper_profile_uid_view"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L178
            if (r2 == 0) goto Lb6
            java.lang.String r0 = "UID: "
            java.lang.String r0 = r0.concat(r6)
            r11.setText(r0)
            r11.setVisibility(r7)
            return
        Lb6:
            r11.setVisibility(r13)
            return
        Lba:
            int r11 = r10.indexOfChild(r4)
            if (r11 >= 0) goto Lc2
            goto L178
        Lc2:
            android.view.ViewGroup$LayoutParams r14 = r4.getLayoutParams()
            android.view.ViewGroup$LayoutParams r14 = r0.cloneLayoutParams(r10, r14)
            java.lang.String r15 = "ProfileUidInjectHook"
            if (r14 != 0) goto Le0
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "skip inject: unsupported parent="
            java.lang.String r0 = r1.concat(r0)
            p000.C0888ux.m5975(r15, r0)
            return
        Le0:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L113
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L113
            r5.setTag(r12)     // Catch: java.lang.Throwable -> L113
            r5.setOrientation(r9)     // Catch: java.lang.Throwable -> L113
            r9 = 8388611(0x800003, float:1.1754948E-38)
            r5.setGravity(r9)     // Catch: java.lang.Throwable -> L113
            r5.setClipChildren(r7)     // Catch: java.lang.Throwable -> L113
            r5.setClipToPadding(r7)     // Catch: java.lang.Throwable -> L113
            boolean r7 = r0.isConstraintLayoutParent(r10)     // Catch: java.lang.Throwable -> L113
            if (r7 == 0) goto L115
            int r7 = r4.getId()     // Catch: java.lang.Throwable -> L113
            r9 = -1
            if (r7 == r9) goto L115
            int r7 = r4.getId()     // Catch: java.lang.Throwable -> L113
            r5.setId(r7)     // Catch: java.lang.Throwable -> L113
            int r7 = android.view.View.generateViewId()     // Catch: java.lang.Throwable -> L113
            r4.setId(r7)     // Catch: java.lang.Throwable -> L113
            goto L115
        L113:
            r0 = move-exception
            goto L165
        L115:
            r10.removeViewAt(r11)     // Catch: java.lang.Throwable -> L113
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L113
            r9 = -2
            r7.<init>(r9, r9)     // Catch: java.lang.Throwable -> L113
            r5.addView(r4, r7)     // Catch: java.lang.Throwable -> L113
            if (r2 == 0) goto L139
            android.widget.TextView r0 = r0.createUidView(r3, r6)     // Catch: java.lang.Throwable -> L113
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L113
            r2.<init>(r9, r9)     // Catch: java.lang.Throwable -> L113
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r4 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE     // Catch: java.lang.Throwable -> L113
            r6 = 4
            int r4 = r4.m1460dp(r3, r6)     // Catch: java.lang.Throwable -> L113
            r2.topMargin = r4     // Catch: java.lang.Throwable -> L113
            r5.addView(r0, r2)     // Catch: java.lang.Throwable -> L113
            goto L13a
        L139:
            r0 = 0
        L13a:
            if (r8 == 0) goto L155
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE     // Catch: java.lang.Throwable -> L113
            android.widget.TextView r2 = r2.getOrCreateInfoButton(r3)     // Catch: java.lang.Throwable -> L113
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L113
            r4.<init>(r9, r9)     // Catch: java.lang.Throwable -> L113
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r6 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE     // Catch: java.lang.Throwable -> L113
            int r3 = r6.m1460dp(r3, r13)     // Catch: java.lang.Throwable -> L113
            r4.topMargin = r3     // Catch: java.lang.Throwable -> L113
            r5.addView(r2, r4)     // Catch: java.lang.Throwable -> L113
            if (r0 != 0) goto L155
            r0 = r2
        L155:
            r10.addView(r5, r11, r14)     // Catch: java.lang.Throwable -> L113
            if (r0 == 0) goto L178
            java.util.WeakHashMap<java.lang.Object, java.lang.ref.WeakReference<android.widget.TextView>> r2 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.injectedByFragment     // Catch: java.lang.Throwable -> L113
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L113
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L113
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L113
            return
        L165:
            java.lang.String r1 = "inject uid wrapper failed"
            p000.C0888ux.m5977(r15, r1, r0)
            return
        L16b:
            if (r2 >= r9) goto L178
            android.os.Handler r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.mainHandler
            jj1 r3 = new jj1
            r4 = 1
            r3.<init>(r2, r4, r1)
            r0.postDelayed(r3, r7)
        L178:
            return
    }

    private static final void tryInject$lambda$12(java.lang.Object r1, int r2) {
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            int r2 = r2 + 1
            r0.tryInject(r1, r2)
            return
    }

    private static final void tryInject$lambda$13(java.lang.Object r1, int r2) {
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.INSTANCE
            int r2 = r2 + 1
            r0.tryInject(r1, r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1461(android.widget.TextView r0, android.app.Activity r1, java.lang.String r2, android.view.View r3) {
            createUidView$lambda$29$lambda$28(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ p000.s62 m1462(p000.k01 r0, boolean r1) {
            s62 r0 = hookFragment$lambda$5(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ p000.s62 m1463(p000.k01 r0, boolean r1) {
            s62 r0 = hookFragment$lambda$4(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1464(int r0, java.lang.Object r1) {
            tryInject$lambda$12(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ void m1465(int r0, java.lang.Object r1) {
            tryInject$lambda$13(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ void m1466(int r0, java.lang.Object r1) {
            scheduleInject$lambda$11(r1, r0)
            return
    }

    public final void init(java.lang.ClassLoader r4) {
            r3 = this;
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.installed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.USER_FRAGMENT_CLASS
            r3.hookFragment(r4, r0)
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.PAD_USER_FRAGMENT_CLASS
            r3.hookFragment(r4, r0)
            java.lang.String r3 = "ProfileUidInjectHook"
            java.lang.String r4 = "installed"
            p000.C0888ux.m5975(r3, r4)
            return
    }

    public final void requestInject(android.app.Activity r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L21
        L3:
            android.view.Window r4 = r4.getWindow()
            r0 = 0
            if (r4 == 0) goto Lf
            android.view.View r4 = r4.getDecorView()
            goto L10
        Lf:
            r4 = r0
        L10:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L17
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L18
        L17:
            r4 = r0
        L18:
            if (r4 != 0) goto L1b
            goto L21
        L1b:
            java.lang.Object r4 = r3.findHostFragment(r4)
            if (r4 != 0) goto L22
        L21:
            return
        L22:
            r1 = 0
            r2 = 2
            scheduleInject$default(r3, r4, r1, r2, r0)
            return
    }
}
