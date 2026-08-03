package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0522 {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading = null;
    private static final int[] sAccessibilityPaneTitle = null;
    private static final java.lang.String[] sClassPrefixList = null;
    private static final Yue.C5787<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private static final java.lang.Class<?>[] sConstructorSignature = null;
    private static final int[] sOnClickAttrs = null;
    private static final int[] sScreenReaderFocusable = null;
    private final java.lang.Object[] mConstructorArgs;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤۤ$ۥ, reason: contains not printable characters */
    public static class ViewOnClickListenerC0523 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.view.View f1322;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final java.lang.String f1323;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.reflect.Method f1324;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public android.content.Context f1325;

        public ViewOnClickListenerC0523(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f1322 = r1
                r0.f1323 = r2
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                java.lang.reflect.Method r0 = r2.f1324
                if (r0 != 0) goto Ld
                android.view.View r0 = r2.f1322
                android.content.Context r0 = r0.getContext()
                r2.m1857(r0)
            Ld:
                java.lang.reflect.Method r0 = r2.f1324     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
                android.content.Context r1 = r2.f1325     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
                r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
                return
            L19:
                r3 = move-exception
                goto L1d
            L1b:
                r3 = move-exception
                goto L25
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute method for android:onClick"
                r0.<init>(r1, r3)
                throw r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute non-public method for android:onClick"
                r0.<init>(r1, r3)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m1857(@Yue.InterfaceC4544 android.content.Context r4) {
                r3 = this;
            L0:
                if (r4 == 0) goto L2c
                boolean r0 = r4.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L1f
                if (r0 != 0) goto L1f
                java.lang.Class r0 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L1f
                java.lang.String r1 = r3.f1323     // Catch: java.lang.NoSuchMethodException -> L1f
                java.lang.Class<android.view.View> r2 = android.view.View.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1f
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1f
                if (r0 == 0) goto L1f
                r3.f1324 = r0     // Catch: java.lang.NoSuchMethodException -> L1f
                r3.f1325 = r4     // Catch: java.lang.NoSuchMethodException -> L1f
                return
            L1f:
                boolean r0 = r4 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L2a
                android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
                android.content.Context r4 = r4.getBaseContext()
                goto L0
            L2a:
                r4 = 0
                goto L0
            L2c:
                android.view.View r4 = r3.f1322
                int r4 = r4.getId()
                r0 = -1
                if (r4 != r0) goto L38
                java.lang.String r4 = ""
                goto L5c
            L38:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = " with id '"
                r0.append(r1)
                android.view.View r1 = r3.f1322
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r4 = r1.getResourceEntryName(r4)
                r0.append(r4)
                java.lang.String r4 = "'"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L5c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find method "
                r1.append(r2)
                java.lang.String r2 = r3.f1323
                r1.append(r2)
                java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
                r1.append(r2)
                android.view.View r2 = r3.f1322
                java.lang.Class r2 = r2.getClass()
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            Yue.C0522.sConstructorSignature = r0
            r0 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r0 = new int[]{r0}
            Yue.C0522.sOnClickAttrs = r0
            r0 = 16844160(0x1010580, float:2.3697504E-38)
            int[] r0 = new int[]{r0}
            Yue.C0522.sAccessibilityHeading = r0
            r0 = 16844156(0x101057c, float:2.3697493E-38)
            int[] r0 = new int[]{r0}
            Yue.C0522.sAccessibilityPaneTitle = r0
            r0 = 16844148(0x1010574, float:2.369747E-38)
            int[] r0 = new int[]{r0}
            Yue.C0522.sScreenReaderFocusable = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            Yue.C0522.sClassPrefixList = r0
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            Yue.C0522.sConstructorMap = r0
            return
    }

    public C0522() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mConstructorArgs = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.content.Context m1851(android.content.Context r2, android.util.AttributeSet r3, boolean r4, boolean r5) {
            int[] r0 = Yue.C5058.C5071.f18001
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r1, r1)
            if (r4 == 0) goto L10
            int r4 = Yue.C5058.C5071.f18002
            int r4 = r3.getResourceId(r4, r1)
            goto L11
        L10:
            r4 = r1
        L11:
            if (r5 == 0) goto L24
            if (r4 != 0) goto L24
            int r4 = Yue.C5058.C5071.f18006
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L24
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r0)
        L24:
            r3.recycle()
            if (r4 == 0) goto L3c
            boolean r3 = r2 instanceof Yue.C1597
            if (r3 == 0) goto L36
            r3 = r2
            Yue.ۥ۟ۧۤۡ r3 = (Yue.C1597) r3
            int r3 = r3.m7806()
            if (r3 == r4) goto L3c
        L36:
            Yue.ۥ۟ۧۤۡ r3 = new Yue.ۥ۟ۧۤۡ
            r3.<init>(r2, r4)
            r2 = r3
        L3c:
            return r2
    }

    @Yue.InterfaceC4410
    public Yue.C0428 createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡ۟ r0 = new Yue.ۥ۟ۡ۟
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0436 createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡ۟ۥ r0 = new Yue.ۥ۟ۡ۟ۥ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0439 createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡ۟ۨ r0 = new Yue.ۥ۟ۡ۟ۨ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0441 createCheckedTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡ۠۟ r0 = new Yue.ۥ۟ۡ۠۟
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0459 createEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۡۥ r0 = new Yue.ۥ۟ۡۡۥ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0465 createImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۢ۟ r0 = new Yue.ۥ۟ۡۢ۟
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0468 createImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۢۢ r0 = new Yue.ۥ۟ۡۢۢ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0470 createMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۢۤ r0 = new Yue.ۥ۟ۡۢۤ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0475 createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۢۨ r0 = new Yue.ۥ۟ۡۢۨ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0476 createRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥۣ۟ۡ r0 = new Yue.ۥۣ۟ۡ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0480 createSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥۣ۟ۡۡ r0 = new Yue.ۥۣ۟ۡۡ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0483 createSpinner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ r0 = new Yue.ۥۣ۟ۡۤ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0508 createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥ۟ۡۤ r0 = new Yue.ۥ۟ۡۤ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C0521 createToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ r0 = new Yue.ۥۣ۟ۡۤ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    public android.view.View createView(android.content.Context r1, java.lang.String r2, android.util.AttributeSet r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    public final android.view.View createView(@Yue.InterfaceC4544 android.view.View r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r5 == 0) goto L9
            if (r1 == 0) goto L9
            android.content.Context r1 = r1.getContext()
            goto La
        L9:
            r1 = r3
        La:
            if (r6 != 0) goto Le
            if (r7 == 0) goto L12
        Le:
            android.content.Context r1 = m1851(r1, r4, r6, r7)
        L12:
            if (r8 == 0) goto L18
            android.content.Context r1 = Yue.C6261.m23335(r1)
        L18:
            r2.hashCode()
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1946472170: goto Lc6;
                case -1455429095: goto Lbb;
                case -1346021293: goto Lb0;
                case -938935918: goto La5;
                case -937446323: goto L9a;
                case -658531749: goto L8f;
                case -339785223: goto L84;
                case 776382189: goto L79;
                case 799298502: goto L6b;
                case 1125864064: goto L5d;
                case 1413872058: goto L4f;
                case 1601505219: goto L41;
                case 1666676343: goto L33;
                case 2001146706: goto L25;
                default: goto L23;
            }
        L23:
            goto Ld0
        L25:
            java.lang.String r6 = "Button"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L2f
            goto Ld0
        L2f:
            r5 = 13
            goto Ld0
        L33:
            java.lang.String r6 = "EditText"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L3d
            goto Ld0
        L3d:
            r5 = 12
            goto Ld0
        L41:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L4b
            goto Ld0
        L4b:
            r5 = 11
            goto Ld0
        L4f:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L59
            goto Ld0
        L59:
            r5 = 10
            goto Ld0
        L5d:
            java.lang.String r6 = "ImageView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L67
            goto Ld0
        L67:
            r5 = 9
            goto Ld0
        L6b:
            java.lang.String r6 = "ToggleButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L75
            goto Ld0
        L75:
            r5 = 8
            goto Ld0
        L79:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L82
            goto Ld0
        L82:
            r5 = 7
            goto Ld0
        L84:
            java.lang.String r6 = "Spinner"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L8d
            goto Ld0
        L8d:
            r5 = 6
            goto Ld0
        L8f:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L98
            goto Ld0
        L98:
            r5 = 5
            goto Ld0
        L9a:
            java.lang.String r6 = "ImageButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto La3
            goto Ld0
        La3:
            r5 = 4
            goto Ld0
        La5:
            java.lang.String r6 = "TextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lae
            goto Ld0
        Lae:
            r5 = 3
            goto Ld0
        Lb0:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lb9
            goto Ld0
        Lb9:
            r5 = 2
            goto Ld0
        Lbb:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lc4
            goto Ld0
        Lc4:
            r5 = 1
            goto Ld0
        Lc6:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lcf
            goto Ld0
        Lcf:
            r5 = 0
        Ld0:
            switch(r5) {
                case 0: goto L142;
                case 1: goto L13a;
                case 2: goto L132;
                case 3: goto L12a;
                case 4: goto L122;
                case 5: goto L11a;
                case 6: goto L112;
                case 7: goto L10a;
                case 8: goto L102;
                case 9: goto Lfa;
                case 10: goto Lf2;
                case 11: goto Lea;
                case 12: goto Le2;
                case 13: goto Ld9;
                default: goto Ld3;
            }
        Ld3:
            android.view.View r5 = r0.createView(r1, r2, r4)
            goto L149
        Ld9:
            Yue.ۥ۟ۡ۟ۥ r5 = r0.createButton(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        Le2:
            Yue.ۥ۟ۡۡۥ r5 = r0.createEditText(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        Lea:
            Yue.ۥ۟ۡ۟ۨ r5 = r0.createCheckBox(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        Lf2:
            Yue.ۥ۟ۡ۟ r5 = r0.createAutoCompleteTextView(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        Lfa:
            Yue.ۥ۟ۡۢۢ r5 = r0.createImageView(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L102:
            Yue.ۥۣ۟ۡۤ r5 = r0.createToggleButton(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L10a:
            Yue.ۥ۟ۡۢۨ r5 = r0.createRadioButton(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L112:
            Yue.ۥۣ۟ۡۤ r5 = r0.createSpinner(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L11a:
            Yue.ۥۣ۟ۡۡ r5 = r0.createSeekBar(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L122:
            Yue.ۥ۟ۡۢ۟ r5 = r0.createImageButton(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L12a:
            Yue.ۥ۟ۡۤ r5 = r0.createTextView(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L132:
            Yue.ۥ۟ۡۢۤ r5 = r0.createMultiAutoCompleteTextView(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L13a:
            Yue.ۥ۟ۡ۠۟ r5 = r0.createCheckedTextView(r1, r4)
            r0.m1856(r5, r2)
            goto L149
        L142:
            Yue.ۥۣ۟ۡ r5 = r0.createRatingBar(r1, r4)
            r0.m1856(r5, r2)
        L149:
            if (r5 != 0) goto L151
            if (r3 == r1) goto L151
            android.view.View r5 = r0.m1855(r1, r2, r4)
        L151:
            if (r5 == 0) goto L159
            r0.m1853(r5, r4)
            r0.m1852(r1, r5, r4)
        L159:
            return r5
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m1852(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.view.View r5, @Yue.InterfaceC4410 android.util.AttributeSet r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 <= r1) goto L7
            return
        L7:
            int[] r0 = Yue.C0522.sAccessibilityHeading
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r0)
            r1 = 0
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L1b
            boolean r2 = r0.getBoolean(r1, r1)
            Yue.C6794.m26224(r5, r2)
        L1b:
            r0.recycle()
            int[] r0 = Yue.C0522.sAccessibilityPaneTitle
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r0)
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r0.getString(r1)
            Yue.C6794.m26226(r5, r2)
        L31:
            r0.recycle()
            int[] r0 = Yue.C0522.sScreenReaderFocusable
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r6, r0)
            boolean r6 = r4.hasValue(r1)
            if (r6 == 0) goto L47
            boolean r6 = r4.getBoolean(r1, r1)
            Yue.C6794.m26265(r5, r6)
        L47:
            r4.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m1853(android.view.View r3, android.util.AttributeSet r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L27
            boolean r1 = r3.hasOnClickListeners()
            if (r1 != 0) goto Lf
            goto L27
        Lf:
            int[] r1 = Yue.C0522.sOnClickAttrs
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1)
            r0 = 0
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L24
            Yue.ۥ۟ۡۤۤ$ۥ r1 = new Yue.ۥ۟ۡۤۤ$ۥ
            r1.<init>(r3, r0)
            r3.setOnClickListener(r1)
        L24:
            r4.recycle()
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.view.View m1854(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException, android.view.InflateException {
            r2 = this;
            Yue.ۥۢ۟ۡ<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = Yue.C0522.sConstructorMap
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 != 0) goto L35
            if (r5 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r1.<init>()     // Catch: java.lang.Exception -> L42
            r1.append(r5)     // Catch: java.lang.Exception -> L42
            r1.append(r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L42
            goto L1d
        L1c:
            r5 = r4
        L1d:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L42
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r5, r1, r3)     // Catch: java.lang.Exception -> L42
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L42
            java.lang.Class<?>[] r5 = Yue.C0522.sConstructorSignature     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Constructor r1 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L42
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L42
        L35:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L42
            java.lang.Object[] r3 = r2.mConstructorArgs     // Catch: java.lang.Exception -> L42
            java.lang.Object r3 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L42
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Exception -> L42
            return r3
        L42:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.view.View m1855(android.content.Context r6, java.lang.String r7, android.util.AttributeSet r8) {
            r5 = this;
            java.lang.String r0 = "view"
            boolean r0 = r7.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r7 = "class"
            java.lang.String r7 = r8.getAttributeValue(r1, r7)
        Lf:
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = r5.mConstructorArgs     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            r3[r2] = r6     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            r3[r0] = r8     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            r8 = 46
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            r3 = -1
            if (r3 != r8) goto L41
            r8 = r2
        L21:
            java.lang.String[] r3 = Yue.C0522.sClassPrefixList     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            int r4 = r3.length     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            if (r8 >= r4) goto L3a
            r3 = r3[r8]     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            android.view.View r3 = r5.m1854(r6, r7, r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            if (r3 == 0) goto L35
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r3
        L35:
            int r8 = r8 + 1
            goto L21
        L38:
            r6 = move-exception
            goto L4c
        L3a:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
        L41:
            android.view.View r6 = r5.m1854(r6, r7, r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L53
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            return r6
        L4c:
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            throw r6
        L53:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m1856(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " asked to inflate view for <"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ">, but returned null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
