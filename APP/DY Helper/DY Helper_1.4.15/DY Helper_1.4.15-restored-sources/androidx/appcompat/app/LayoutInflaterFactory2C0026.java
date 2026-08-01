package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0026 extends androidx.appcompat.app.AbstractC0025 implements p000.gz0, android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: п */
    public static final p000.fw1 f370 = null;

    /* JADX INFO: renamed from: р */
    public static final int[] f371 = null;

    /* JADX INFO: renamed from: с */
    public static final boolean f372 = false;

    /* JADX INFO: renamed from: Α */
    public p000.AbstractC1153 f373;

    /* JADX INFO: renamed from: Β */
    public androidx.appcompat.widget.ActionBarContextView f374;

    /* JADX INFO: renamed from: Γ */
    public android.widget.PopupWindow f375;

    /* JADX INFO: renamed from: Δ */
    public p000.RunnableC0934w4 f376;

    /* JADX INFO: renamed from: Ε */
    public p000.x92 f377;

    /* JADX INFO: renamed from: Ζ */
    public boolean f378;

    /* JADX INFO: renamed from: Η */
    public android.view.ViewGroup f379;

    /* JADX INFO: renamed from: Θ */
    public android.widget.TextView f380;

    /* JADX INFO: renamed from: Ι */
    public android.view.View f381;

    /* JADX INFO: renamed from: Κ */
    public boolean f382;

    /* JADX INFO: renamed from: Λ */
    public boolean f383;

    /* JADX INFO: renamed from: Μ */
    public boolean f384;

    /* JADX INFO: renamed from: Ν */
    public boolean f385;

    /* JADX INFO: renamed from: Ξ */
    public boolean f386;

    /* JADX INFO: renamed from: Ο */
    public boolean f387;

    /* JADX INFO: renamed from: Π */
    public boolean f388;

    /* JADX INFO: renamed from: Ρ */
    public boolean f389;

    /* JADX INFO: renamed from: Σ */
    public p000.C0310g5[] f390;

    /* JADX INFO: renamed from: Τ */
    public p000.C0310g5 f391;

    /* JADX INFO: renamed from: Υ */
    public boolean f392;

    /* JADX INFO: renamed from: Φ */
    public boolean f393;

    /* JADX INFO: renamed from: Χ */
    public boolean f394;

    /* JADX INFO: renamed from: Ψ */
    public boolean f395;

    /* JADX INFO: renamed from: Ω */
    public android.content.res.Configuration f396;

    /* JADX INFO: renamed from: ξ */
    public final java.lang.Object f397;

    /* JADX INFO: renamed from: ο */
    public final android.content.Context f398;

    /* JADX INFO: renamed from: π */
    public android.view.Window f399;

    /* JADX INFO: renamed from: ρ */
    public p000.WindowCallbackC0200d5 f400;

    /* JADX INFO: renamed from: σ */
    public final java.lang.Object f401;

    /* JADX INFO: renamed from: τ */
    public p000.tb2 f402;

    /* JADX INFO: renamed from: υ */
    public p000.s12 f403;

    /* JADX INFO: renamed from: φ */
    public java.lang.CharSequence f404;

    /* JADX INFO: renamed from: χ */
    public p000.InterfaceC0993xq f405;

    /* JADX INFO: renamed from: ψ */
    public p000.C0971x4 f406;

    /* JADX INFO: renamed from: ω */
    public p000.C0971x4 f407;

    /* JADX INFO: renamed from: а */
    public final int f408;

    /* JADX INFO: renamed from: б */
    public int f409;

    /* JADX INFO: renamed from: в */
    public int f410;

    /* JADX INFO: renamed from: г */
    public boolean f411;

    /* JADX INFO: renamed from: д */
    public p000.C0236e5 f412;

    /* JADX INFO: renamed from: е */
    public p000.C0236e5 f413;

    /* JADX INFO: renamed from: ж */
    public boolean f414;

    /* JADX INFO: renamed from: з */
    public int f415;

    /* JADX INFO: renamed from: и */
    public final p000.RunnableC0934w4 f416;

    /* JADX INFO: renamed from: й */
    public boolean f417;

    /* JADX INFO: renamed from: к */
    public android.graphics.Rect f418;

    /* JADX INFO: renamed from: л */
    public android.graphics.Rect f419;

    /* JADX INFO: renamed from: м */
    public p000.C0501l6 f420;

    /* JADX INFO: renamed from: н */
    public android.window.OnBackInvokedDispatcher f421;

    /* JADX INFO: renamed from: о */
    public android.window.OnBackInvokedCallback f422;

    static {
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            androidx.appcompat.app.LayoutInflaterFactory2C0026.f370 = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.app.LayoutInflaterFactory2C0026.f371 = r0
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            androidx.appcompat.app.LayoutInflaterFactory2C0026.f372 = r0
            return
    }

    public LayoutInflaterFactory2C0026(android.content.Context r5, android.view.Window r6, p000.InterfaceC0674p4 r7, java.lang.Object r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f377 = r0
            r1 = -100
            r4.f408 = r1
            w4 r2 = new w4
            r3 = 0
            r2.<init>(r4, r3)
            r4.f416 = r2
            r4.f398 = r5
            r4.f401 = r7
            r4.f397 = r8
            boolean r7 = r8 instanceof android.app.Dialog
            if (r7 == 0) goto L3d
        L1c:
            if (r5 == 0) goto L31
            boolean r7 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r7 == 0) goto L26
            r0 = r5
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            goto L31
        L26:
            boolean r7 = r5 instanceof android.content.ContextWrapper
            if (r7 == 0) goto L31
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L1c
        L31:
            if (r0 == 0) goto L3d
            androidx.appcompat.app.α r5 = r0.m197()
            androidx.appcompat.app.β r5 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r5
            int r5 = r5.f408
            r4.f408 = r5
        L3d:
            int r5 = r4.f408
            if (r5 != r1) goto L68
            java.lang.Object r5 = r4.f397
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            fw1 r7 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f370
            java.lang.Object r5 = r7.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L68
            int r5 = r5.intValue()
            r4.f408 = r5
            java.lang.Object r5 = r4.f397
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r7.remove(r5)
        L68:
            if (r6 == 0) goto L6d
            r4.m223(r6)
        L6d:
            p000.C0419j5.m2863()
            return
    }

    /* JADX INFO: renamed from: ο */
    public static p000.cv0 m208(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L7
            goto Lb
        L7:
            cv0 r0 = androidx.appcompat.app.AbstractC0025.f363
            if (r0 != 0) goto Ld
        Lb:
            r5 = 0
            return r5
        Ld:
            dv0 r0 = r0.f2779
            android.content.Context r5 = r5.getApplicationContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            cv0 r5 = p000.AbstractC0006a5.m34(r5)
            android.os.LocaleList r1 = r0.f3300
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2a
            cv0 r0 = p000.cv0.f2778
            goto L83
        L2a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
        L30:
            android.os.LocaleList r3 = r0.f3300
            int r3 = r3.size()
            dv0 r4 = r5.f2779
            android.os.LocaleList r4 = r4.f3300
            int r4 = r4.size()
            int r4 = r4 + r3
            if (r2 >= r4) goto L68
            android.os.LocaleList r3 = r0.f3300
            int r3 = r3.size()
            if (r2 >= r3) goto L50
            android.os.LocaleList r3 = r0.f3300
            java.util.Locale r3 = r3.get(r2)
            goto L60
        L50:
            android.os.LocaleList r3 = r0.f3300
            int r3 = r3.size()
            int r3 = r2 - r3
            dv0 r4 = r5.f2779
            android.os.LocaleList r4 = r4.f3300
            java.util.Locale r3 = r4.get(r3)
        L60:
            if (r3 == 0) goto L65
            r1.add(r3)
        L65:
            int r2 = r2 + 1
            goto L30
        L68:
            int r0 = r1.size()
            java.util.Locale[] r0 = new java.util.Locale[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            cv0 r0 = new cv0
            dv0 r2 = new dv0
            r2.<init>(r1)
            r0.<init>(r2)
        L83:
            dv0 r1 = r0.f2779
            android.os.LocaleList r1 = r1.f3300
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L8e
            return r5
        L8e:
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static android.content.res.Configuration m209(android.content.Context r1, int r2, p000.cv0 r3, android.content.res.Configuration r4, boolean r5) {
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1b
            if (r5 == 0) goto La
            r1 = 0
            goto L20
        La:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            goto L20
        L1b:
            r1 = 32
            goto L20
        L1e:
            r1 = 16
        L20:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r5 = 0
            r2.fontScale = r5
            if (r4 == 0) goto L2d
            r2.setTo(r4)
        L2d:
            int r4 = r2.uiMode
            r4 = r4 & (-49)
            r1 = r1 | r4
            r2.uiMode = r1
            if (r3 == 0) goto L39
            p000.AbstractC0006a5.m36(r2, r3)
        L39:
            return r2
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
            r7 = this;
            l6 r8 = r7.f420
            r0 = 0
            if (r8 != 0) goto L55
            int[] r8 = p000.kk1.f5977
            android.content.Context r1 = r7.f398
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r8)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r2 = r8.getString(r2)
            r8.recycle()
            if (r2 != 0) goto L20
            l6 r8 = new l6
            r8.<init>()
            r7.f420 = r8
            goto L55
        L20:
            java.lang.ClassLoader r8 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r8 = r8.loadClass(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.newInstance(r0)     // Catch: java.lang.Throwable -> L35
            l6 r8 = (p000.C0501l6) r8     // Catch: java.lang.Throwable -> L35
            r7.f420 = r8     // Catch: java.lang.Throwable -> L35
            goto L55
        L35:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = ". Falling back to default."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r1, r8)
            l6 r8 = new l6
            r8.<init>()
            r7.f420 = r8
        L55:
            l6 r7 = r7.f420
            int r8 = p000.k72.f5789
            r7.getClass()
            int[] r8 = p000.kk1.f5964
            r1 = 0
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r11, r8, r1, r1)
            r2 = 4
            int r3 = r8.getResourceId(r2, r1)
            if (r3 == 0) goto L71
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L71:
            r8.recycle()
            if (r3 == 0) goto L87
            boolean r8 = r10 instanceof p000.C0594np
            if (r8 == 0) goto L81
            r8 = r10
            np r8 = (p000.C0594np) r8
            int r8 = r8.f7696
            if (r8 == r3) goto L87
        L81:
            np r8 = new np
            r8.<init>(r10, r3)
            goto L88
        L87:
            r8 = r10
        L88:
            r9.getClass()
            int r3 = r9.hashCode()
            r4 = 3
            r5 = 1
            r6 = -1
            switch(r3) {
                case -1946472170: goto L134;
                case -1455429095: goto L128;
                case -1346021293: goto L11c;
                case -938935918: goto L110;
                case -937446323: goto L107;
                case -658531749: goto Lfc;
                case -339785223: goto Lf1;
                case 776382189: goto Le6;
                case 799298502: goto Ld9;
                case 1125864064: goto Lcc;
                case 1413872058: goto Lbf;
                case 1601505219: goto Lb2;
                case 1666676343: goto La5;
                case 2001146706: goto L98;
                default: goto L95;
            }
        L95:
            r2 = r6
            goto L13f
        L98:
            java.lang.String r2 = "Button"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto La1
            goto L95
        La1:
            r2 = 13
            goto L13f
        La5:
            java.lang.String r2 = "EditText"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Lae
            goto L95
        Lae:
            r2 = 12
            goto L13f
        Lb2:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Lbb
            goto L95
        Lbb:
            r2 = 11
            goto L13f
        Lbf:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Lc8
            goto L95
        Lc8:
            r2 = 10
            goto L13f
        Lcc:
            java.lang.String r2 = "ImageView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Ld5
            goto L95
        Ld5:
            r2 = 9
            goto L13f
        Ld9:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Le2
            goto L95
        Le2:
            r2 = 8
            goto L13f
        Le6:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Lef
            goto L95
        Lef:
            r2 = 7
            goto L13f
        Lf1:
            java.lang.String r2 = "Spinner"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto Lfa
            goto L95
        Lfa:
            r2 = 6
            goto L13f
        Lfc:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L105
            goto L95
        L105:
            r2 = 5
            goto L13f
        L107:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L13f
            goto L95
        L110:
            java.lang.String r2 = "TextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L11a
            goto L95
        L11a:
            r2 = r4
            goto L13f
        L11c:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L126
            goto L95
        L126:
            r2 = 2
            goto L13f
        L128:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L132
            goto L95
        L132:
            r2 = r5
            goto L13f
        L134:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L13e
            goto L95
        L13e:
            r2 = r1
        L13f:
            r3 = 2130968625(0x7f040031, float:1.7545909E38)
            switch(r2) {
                case 0: goto L1ab;
                case 1: goto L1a2;
                case 2: goto L19c;
                case 3: goto L196;
                case 4: goto L18d;
                case 5: goto L184;
                case 6: goto L17e;
                case 7: goto L175;
                case 8: goto L16f;
                case 9: goto L169;
                case 10: goto L163;
                case 11: goto L15a;
                case 12: goto L151;
                case 13: goto L148;
                default: goto L145;
            }
        L145:
            r2 = r0
            goto L1b3
        L148:
            androidx.appcompat.widget.AppCompatButton r2 = new androidx.appcompat.widget.AppCompatButton
            r3 = 2130968647(0x7f040047, float:1.7545954E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L151:
            androidx.appcompat.widget.AppCompatEditText r2 = new androidx.appcompat.widget.AppCompatEditText
            r3 = 2130968707(0x7f040083, float:1.7546075E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L15a:
            androidx.appcompat.widget.AppCompatCheckBox r2 = new androidx.appcompat.widget.AppCompatCheckBox
            r3 = 2130968654(0x7f04004e, float:1.7545968E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L163:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r2 = new androidx.appcompat.widget.AppCompatAutoCompleteTextView
            r2.<init>(r8, r11, r3)
            goto L1b3
        L169:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r8, r11, r1)
            goto L1b3
        L16f:
            androidx.appcompat.widget.AppCompatToggleButton r2 = new androidx.appcompat.widget.AppCompatToggleButton
            r2.<init>(r8, r11)
            goto L1b3
        L175:
            androidx.appcompat.widget.AppCompatRadioButton r2 = new androidx.appcompat.widget.AppCompatRadioButton
            r3 = 2130968802(0x7f0400e2, float:1.7546268E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L17e:
            androidx.appcompat.widget.AppCompatSpinner r2 = new androidx.appcompat.widget.AppCompatSpinner
            r2.<init>(r8, r11)
            goto L1b3
        L184:
            androidx.appcompat.widget.AppCompatSeekBar r2 = new androidx.appcompat.widget.AppCompatSeekBar
            r3 = 2130968813(0x7f0400ed, float:1.754629E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L18d:
            androidx.appcompat.widget.AppCompatImageButton r2 = new androidx.appcompat.widget.AppCompatImageButton
            r3 = 2130968746(0x7f0400aa, float:1.7546154E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L196:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r8, r11)
            goto L1b3
        L19c:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r2 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r2.<init>(r8, r11, r3)
            goto L1b3
        L1a2:
            androidx.appcompat.widget.AppCompatCheckedTextView r2 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r3 = 2130968655(0x7f04004f, float:1.754597E38)
            r2.<init>(r8, r11, r3)
            goto L1b3
        L1ab:
            androidx.appcompat.widget.AppCompatRatingBar r2 = new androidx.appcompat.widget.AppCompatRatingBar
            r3 = 2130968803(0x7f0400e3, float:1.754627E38)
            r2.<init>(r8, r11, r3)
        L1b3:
            if (r2 != 0) goto L204
            if (r10 == r8) goto L204
            java.lang.Object[] r10 = r7.f6453
            java.lang.String r2 = "view"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L1c7
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r0, r9)
        L1c7:
            r10[r1] = r8     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            r10[r5] = r11     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            r2 = 46
            int r2 = r9.indexOf(r2)     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            if (r6 != r2) goto L1f0
            r2 = r1
        L1d4:
            java.lang.String[] r3 = p000.C0501l6.f6451     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            if (r2 >= r4) goto L1eb
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            android.view.View r3 = r7.m3520(r8, r9, r3)     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            if (r3 == 0) goto L1e6
            r10[r1] = r0
            r10[r5] = r0
            r0 = r3
            goto L203
        L1e6:
            int r2 = r2 + 1
            goto L1d4
        L1e9:
            r7 = move-exception
            goto L1fa
        L1eb:
            r10[r1] = r0
            r10[r5] = r0
            goto L203
        L1f0:
            android.view.View r7 = r7.m3520(r8, r9, r0)     // Catch: java.lang.Throwable -> L1e9 java.lang.Exception -> L1ff
            r10[r1] = r0
            r10[r5] = r0
            r0 = r7
            goto L203
        L1fa:
            r10[r1] = r0
            r10[r5] = r0
            throw r7
        L1ff:
            r10[r1] = r0
            r10[r5] = r0
        L203:
            r2 = r0
        L204:
            if (r2 == 0) goto L22c
            android.content.Context r7 = r2.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L22c
            boolean r8 = r2.hasOnClickListeners()
            if (r8 != 0) goto L215
            goto L22c
        L215:
            int[] r8 = p000.C0501l6.f6450
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r11, r8)
            java.lang.String r8 = r7.getString(r1)
            if (r8 == 0) goto L229
            k6 r9 = new k6
            r9.<init>(r2, r8)
            r2.setOnClickListener(r9)
        L229:
            r7.recycle()
        L22c:
            return r2
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: Α */
    public final p000.C0310g5 m210(int r5) {
            r4 = this;
            g5[] r0 = r4.f390
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            g5[] r2 = new p000.C0310g5[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f390 = r2
            r0 = r2
        L15:
            r4 = r0[r5]
            if (r4 != 0) goto L24
            g5 r4 = new g5
            r4.<init>()
            r4.f4235 = r5
            r4.f4248 = r1
            r0[r5] = r4
        L24:
            return r4
    }

    /* JADX INFO: renamed from: Β */
    public final void m211() {
            r3 = this;
            r3.m229()
            boolean r0 = r3.f384
            if (r0 == 0) goto L34
            tb2 r0 = r3.f402
            if (r0 == 0) goto Lc
            goto L34
        Lc:
            java.lang.Object r0 = r3.f397
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            tb2 r1 = new tb2
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f385
            r1.<init>(r0, r2)
            r3.f402 = r1
            goto L2b
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2b
            tb2 r1 = new tb2
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            r3.f402 = r1
        L2b:
            tb2 r0 = r3.f402
            if (r0 == 0) goto L34
            boolean r3 = r3.f417
            r0.m5626(r3)
        L34:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final void m212(int r3) {
            r2 = this;
            int r0 = r2.f415
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.f415 = r3
            boolean r3 = r2.f414
            if (r3 != 0) goto L1b
            android.view.Window r3 = r2.f399
            android.view.View r3 = r3.getDecorView()
            java.util.WeakHashMap r0 = p000.b92.f1572
            w4 r0 = r2.f416
            r3.postOnAnimation(r0)
            r2.f414 = r1
        L1b:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public final int m213(android.content.Context r3, int r4) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r4 == r0) goto L48
            if (r4 == r1) goto L47
            if (r4 == 0) goto L2b
            r0 = 1
            if (r4 == r0) goto L47
            r0 = 2
            if (r4 == r0) goto L47
            r0 = 3
            if (r4 != r0) goto L24
            e5 r4 = r2.f413
            if (r4 != 0) goto L1d
            e5 r4 = new e5
            r4.<init>(r2, r3)
            r2.f413 = r4
        L1d:
            e5 r2 = r2.f413
            int r2 = r2.mo1845()
            return r2
        L24:
            java.lang.String r2 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
        L2b:
            android.content.Context r4 = r3.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            int r4 = r4.getNightMode()
            if (r4 != 0) goto L3e
            goto L48
        L3e:
            р r2 = r2.m231(r3)
            int r2 = r2.mo1845()
            return r2
        L47:
            return r4
        L48:
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public final boolean m214() {
            r5 = this;
            boolean r0 = r5.f392
            r1 = 0
            r5.f392 = r1
            g5 r2 = r5.m210(r1)
            boolean r3 = r2.f4247
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L45
            r5.m226(r2, r4)
            return r4
        L14:
            ｗ r0 = r5.f373
            if (r0 == 0) goto L1c
            r0.mo5432()
            return r4
        L1c:
            r5.m211()
            tb2 r5 = r5.f402
            if (r5 == 0) goto L46
            yq r5 = r5.f10283
            if (r5 == 0) goto L46
            r0 = r5
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            v42 r0 = r0.f753
            if (r0 == 0) goto L46
            lz0 r0 = r0.f11103
            if (r0 == 0) goto L46
            b52 r5 = (p000.b52) r5
            androidx.appcompat.widget.Toolbar r5 = r5.f1484
            v42 r5 = r5.f753
            if (r5 != 0) goto L3e
            r5 = 0
            goto L40
        L3e:
            lz0 r5 = r5.f11103
        L40:
            if (r5 == 0) goto L45
            r5.collapseActionView()
        L45:
            return r4
        L46:
            return r1
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m215(p000.C0310g5 r18, android.view.KeyEvent r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f4247
            int r3 = r1.f4235
            if (r2 != 0) goto L1d9
            boolean r2 = r0.f395
            if (r2 == 0) goto L10
            goto L1d9
        L10:
            android.content.Context r2 = r0.f398
            if (r3 != 0) goto L25
            android.content.res.Resources r4 = r2.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L25
            goto L1d9
        L25:
            android.view.Window r4 = r0.f399
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L3a
            iz0 r6 = r1.f4242
            boolean r4 = r4.onMenuOpened(r3, r6)
            if (r4 != 0) goto L3a
            r0.m226(r1, r5)
            return
        L3a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L46
            goto L1d9
        L46:
            boolean r6 = r17.m217(r18, r19)
            if (r6 != 0) goto L4e
            goto L1d9
        L4e:
            android.view.ViewGroup r6 = r1.f4239
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L6b
            boolean r9 = r1.f4248
            if (r9 == 0) goto L59
            goto L6b
        L59:
            android.view.View r2 = r1.f4241
            if (r2 == 0) goto L1b1
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L1b1
            int r2 = r2.width
            r6 = -1
            if (r2 != r6) goto L1b1
            r10 = r6
            goto L1b2
        L6b:
            if (r6 != 0) goto Le6
            r0.m211()
            tb2 r6 = r0.f402
            if (r6 == 0) goto L79
            android.content.Context r6 = r6.m5624()
            goto L7a
        L79:
            r6 = 0
        L7a:
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r2 = r6
        L7e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r2.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r2.getTheme()
            r9.setTo(r10)
            r10 = 2130968578(0x7f040002, float:1.7545814E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L9f
            r9.applyStyle(r10, r5)
        L9f:
            r10 = 2130968789(0x7f0400d5, float:1.7546242E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto Lad
            r9.applyStyle(r6, r5)
            goto Lb3
        Lad:
            r6 = 2131755276(0x7f10010c, float:1.9141427E38)
            r9.applyStyle(r6, r5)
        Lb3:
            np r6 = new np
            r6.<init>(r2, r7)
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r2.setTo(r9)
            r1.f4244 = r6
            int[] r2 = p000.kk1.f5977
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            r6 = 86
            int r6 = r2.getResourceId(r6, r7)
            r1.f4236 = r6
            int r6 = r2.getResourceId(r5, r7)
            r1.f4238 = r6
            r2.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView r2 = new androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView
            np r6 = r1.f4244
            r2.<init>(r0, r6)
            r1.f4239 = r2
            r2 = 81
            r1.f4237 = r2
            goto Lf5
        Le6:
            boolean r2 = r1.f4248
            if (r2 == 0) goto Lf5
            int r2 = r6.getChildCount()
            if (r2 <= 0) goto Lf5
            android.view.ViewGroup r2 = r1.f4239
            r2.removeAllViews()
        Lf5:
            android.view.View r2 = r1.f4241
            if (r2 == 0) goto Lfc
            r1.f4240 = r2
            goto L158
        Lfc:
            iz0 r2 = r1.f4242
            if (r2 != 0) goto L102
            goto L1d7
        L102:
            x4 r2 = r0.f407
            if (r2 != 0) goto L10e
            x4 r2 = new x4
            r6 = 3
            r2.<init>(r0, r6)
            r0.f407 = r2
        L10e:
            x4 r2 = r0.f407
            cu0 r6 = r1.f4243
            if (r6 != 0) goto L126
            cu0 r6 = new cu0
            np r9 = r1.f4244
            r6.<init>(r9)
            r1.f4243 = r6
            r6.f2756 = r2
            iz0 r2 = r1.f4242
            android.content.Context r9 = r2.f5251
            r2.m2830(r6, r9)
        L126:
            cu0 r2 = r1.f4243
            android.view.ViewGroup r6 = r1.f4239
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r2.f2755
            if (r9 != 0) goto L152
            android.view.LayoutInflater r9 = r2.f2753
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r2.f2755 = r6
            bu0 r6 = r2.f2757
            if (r6 != 0) goto L146
            bu0 r6 = new bu0
            r6.<init>(r2)
            r2.f2757 = r6
        L146:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.f2755
            bu0 r9 = r2.f2757
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.f2755
            r6.setOnItemClickListener(r2)
        L152:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.f2755
            r1.f4240 = r2
            if (r2 == 0) goto L1d7
        L158:
            android.view.View r2 = r1.f4240
            if (r2 != 0) goto L15e
            goto L1d7
        L15e:
            android.view.View r2 = r1.f4241
            if (r2 == 0) goto L163
            goto L178
        L163:
            cu0 r2 = r1.f4243
            bu0 r6 = r2.f2757
            if (r6 != 0) goto L170
            bu0 r6 = new bu0
            r6.<init>(r2)
            r2.f2757 = r6
        L170:
            bu0 r2 = r2.f2757
            int r2 = r2.getCount()
            if (r2 <= 0) goto L1d7
        L178:
            android.view.View r2 = r1.f4240
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L185
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
        L185:
            int r6 = r1.f4236
            android.view.ViewGroup r9 = r1.f4239
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f4240
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L19d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f4240
            r6.removeView(r9)
        L19d:
            android.view.ViewGroup r6 = r1.f4239
            android.view.View r9 = r1.f4240
            r6.addView(r9, r2)
            android.view.View r2 = r1.f4240
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L1b1
            android.view.View r2 = r1.f4240
            r2.requestFocus()
        L1b1:
            r10 = r8
        L1b2:
            r1.f4246 = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r11 = -2
            r12 = 0
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r1.f4237
            r9.gravity = r2
            int r2 = r1.f4238
            r9.windowAnimations = r2
            android.view.ViewGroup r2 = r1.f4239
            r4.addView(r2, r9)
            r1.f4247 = r5
            if (r3 != 0) goto L1d9
            r0.m219()
            return
        L1d7:
            r1.f4248 = r5
        L1d9:
            return
    }

    /* JADX INFO: renamed from: Η */
    public final boolean m216(p000.C0310g5 r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.f4245
            if (r0 != 0) goto L12
            boolean r2 = r2.m217(r3, r5)
            if (r2 == 0) goto L1b
        L12:
            iz0 r2 = r3.f4242
            if (r2 == 0) goto L1b
            r3 = 1
            boolean r1 = r2.performShortcut(r4, r5, r3)
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: Θ */
    public final boolean m217(p000.C0310g5 r13, android.view.KeyEvent r14) {
            r12 = this;
            boolean r0 = r12.f395
            r1 = 0
            if (r0 == 0) goto L7
            goto L113
        L7:
            boolean r0 = r13.f4245
            int r2 = r13.f4235
            r3 = 1
            if (r0 == 0) goto Lf
            return r3
        Lf:
            g5 r0 = r12.f391
            if (r0 == 0) goto L18
            if (r0 == r13) goto L18
            r12.m226(r0, r1)
        L18:
            android.view.Window r0 = r12.f399
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L26
            android.view.View r4 = r0.onCreatePanelView(r2)
            r13.f4241 = r4
        L26:
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L41
            xq r6 = r12.f405
            if (r6 == 0) goto L41
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m259()
            yq r6 = r6.f501
            b52 r6 = (p000.b52) r6
            r6.f1495 = r3
        L41:
            android.view.View r6 = r13.f4241
            if (r6 != 0) goto L162
            iz0 r6 = r13.f4242
            r7 = 0
            if (r6 == 0) goto L4e
            boolean r8 = r13.f4249
            if (r8 == 0) goto L116
        L4e:
            if (r6 != 0) goto Ld0
            android.content.Context r6 = r12.f398
            if (r2 == 0) goto L56
            if (r2 != r4) goto Lad
        L56:
            xq r4 = r12.f405
            if (r4 == 0) goto Lad
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            r9 = 2130968585(0x7f040009, float:1.7545828E38)
            r8.resolveAttribute(r9, r4, r3)
            int r9 = r4.resourceId
            r10 = 2130968586(0x7f04000a, float:1.754583E38)
            if (r9 == 0) goto L84
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r11 = r4.resourceId
            r9.applyStyle(r11, r3)
            r9.resolveAttribute(r10, r4, r3)
            goto L88
        L84:
            r8.resolveAttribute(r10, r4, r3)
            r9 = r7
        L88:
            int r10 = r4.resourceId
            if (r10 == 0) goto L9e
            if (r9 != 0) goto L99
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
        L99:
            int r4 = r4.resourceId
            r9.applyStyle(r4, r3)
        L9e:
            if (r9 == 0) goto Lad
            np r4 = new np
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        Lad:
            iz0 r4 = new iz0
            r4.<init>(r6)
            r4.f5255 = r12
            iz0 r6 = r13.f4242
            if (r4 != r6) goto Lb9
            goto Lcb
        Lb9:
            if (r6 == 0) goto Lc0
            cu0 r8 = r13.f4243
            r6.m2838(r8)
        Lc0:
            r13.f4242 = r4
            cu0 r6 = r13.f4243
            if (r6 == 0) goto Lcb
            android.content.Context r8 = r4.f5251
            r4.m2830(r6, r8)
        Lcb:
            iz0 r4 = r13.f4242
            if (r4 != 0) goto Ld0
            goto L113
        Ld0:
            if (r5 == 0) goto Leb
            xq r4 = r12.f405
            if (r4 == 0) goto Leb
            x4 r6 = r12.f406
            if (r6 != 0) goto Le2
            x4 r6 = new x4
            r8 = 2
            r6.<init>(r12, r8)
            r12.f406 = r6
        Le2:
            iz0 r6 = r13.f4242
            x4 r8 = r12.f406
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = (androidx.appcompat.widget.ActionBarOverlayLayout) r4
            r4.m260(r6, r8)
        Leb:
            iz0 r4 = r13.f4242
            r4.m2843()
            iz0 r4 = r13.f4242
            boolean r2 = r0.onCreatePanelMenu(r2, r4)
            if (r2 != 0) goto L114
            iz0 r14 = r13.f4242
            if (r14 != 0) goto Lfd
            goto L106
        Lfd:
            if (r14 == 0) goto L104
            cu0 r0 = r13.f4243
            r14.m2838(r0)
        L104:
            r13.f4242 = r7
        L106:
            if (r5 == 0) goto L113
            xq r13 = r12.f405
            if (r13 == 0) goto L113
            x4 r12 = r12.f406
            androidx.appcompat.widget.ActionBarOverlayLayout r13 = (androidx.appcompat.widget.ActionBarOverlayLayout) r13
            r13.m260(r7, r12)
        L113:
            return r1
        L114:
            r13.f4249 = r1
        L116:
            iz0 r2 = r13.f4242
            r2.m2843()
            android.os.Bundle r2 = r13.f4250
            if (r2 == 0) goto L126
            iz0 r4 = r13.f4242
            r4.m2839(r2)
            r13.f4250 = r7
        L126:
            android.view.View r2 = r13.f4241
            iz0 r4 = r13.f4242
            boolean r0 = r0.onPreparePanel(r1, r2, r4)
            if (r0 != 0) goto L143
            if (r5 == 0) goto L13d
            xq r14 = r12.f405
            if (r14 == 0) goto L13d
            x4 r12 = r12.f406
            androidx.appcompat.widget.ActionBarOverlayLayout r14 = (androidx.appcompat.widget.ActionBarOverlayLayout) r14
            r14.m260(r7, r12)
        L13d:
            iz0 r12 = r13.f4242
            r12.m2842()
            return r1
        L143:
            if (r14 == 0) goto L14a
            int r14 = r14.getDeviceId()
            goto L14b
        L14a:
            r14 = -1
        L14b:
            android.view.KeyCharacterMap r14 = android.view.KeyCharacterMap.load(r14)
            int r14 = r14.getKeyboardType()
            if (r14 == r3) goto L157
            r14 = r3
            goto L158
        L157:
            r14 = r1
        L158:
            iz0 r0 = r13.f4242
            r0.setQwertyMode(r14)
            iz0 r14 = r13.f4242
            r14.m2842()
        L162:
            r13.f4245 = r3
            r13.f4246 = r1
            r12.f391 = r13
            return r3
    }

    /* JADX INFO: renamed from: Ι */
    public final void m218() {
            r1 = this;
            boolean r1 = r1.f378
            if (r1 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Window feature must be requested before adding content"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: Κ */
    public final void m219() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L39
            android.window.OnBackInvokedDispatcher r0 = r3.f421
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1c
        Lc:
            g5 r0 = r3.m210(r1)
            boolean r0 = r0.f4247
            r2 = 1
            if (r0 == 0) goto L17
        L15:
            r1 = r2
            goto L1c
        L17:
            ｗ r0 = r3.f373
            if (r0 == 0) goto L1c
            goto L15
        L1c:
            if (r1 == 0) goto L2b
            android.window.OnBackInvokedCallback r0 = r3.f422
            if (r0 != 0) goto L2b
            android.window.OnBackInvokedDispatcher r0 = r3.f421
            android.window.OnBackInvokedCallback r0 = p000.AbstractC0101c5.m1130(r0, r3)
            r3.f422 = r0
            return
        L2b:
            if (r1 != 0) goto L39
            android.window.OnBackInvokedCallback r0 = r3.f422
            if (r0 == 0) goto L39
            android.window.OnBackInvokedDispatcher r1 = r3.f421
            p000.AbstractC0101c5.m1131(r1, r0)
            r0 = 0
            r3.f422 = r0
        L39:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: α */
    public final void mo200() {
            r2 = this;
            android.content.Context r0 = r2.f398
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            r0.setFactory2(r2)
            return
        L10:
            android.view.LayoutInflater$Factory2 r2 = r0.getFactory2()
            boolean r2 = r2 instanceof androidx.appcompat.app.LayoutInflaterFactory2C0026
            if (r2 != 0) goto L1f
            java.lang.String r2 = "AppCompatDelegate"
            java.lang.String r0 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r2, r0)
        L1f:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: γ */
    public final void mo201() {
            r4 = this;
            r0 = 1
            r4.f393 = r0
            r1 = 0
            r4.m222(r1, r0)
            r4.m230()
            java.lang.Object r1 = r4.f397
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L44
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.IllegalArgumentException -> L22
            android.content.ComponentName r2 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            java.lang.String r1 = p000.AbstractC1021yh.m6861(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            goto L23
        L1b:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L22
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L22
            throw r2     // Catch: java.lang.IllegalArgumentException -> L22
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L2f
            tb2 r1 = r4.f402
            if (r1 != 0) goto L2c
            r4.f417 = r0
            goto L2f
        L2c:
            r1.m5626(r0)
        L2f:
            java.lang.Object r1 = androidx.appcompat.app.AbstractC0025.f368
            monitor-enter(r1)
            androidx.appcompat.app.AbstractC0025.m199(r4)     // Catch: java.lang.Throwable -> L41
            d7 r2 = androidx.appcompat.app.AbstractC0025.f367     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L41
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r4
        L44:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.Context r2 = r4.f398
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            r4.f396 = r1
            r4.f394 = r0
            return
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: δ */
    public final boolean mo220(p000.iz0 r7, android.view.MenuItem r8) {
            r6 = this;
            android.view.Window r0 = r6.f399
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 0
            if (r0 == 0) goto L31
            boolean r2 = r6.f395
            if (r2 != 0) goto L31
            iz0 r7 = r7.mo685()
            g5[] r6 = r6.f390
            if (r6 == 0) goto L17
            int r2 = r6.length
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = r1
        L19:
            if (r3 >= r2) goto L27
            r4 = r6[r3]
            if (r4 == 0) goto L24
            iz0 r5 = r4.f4242
            if (r5 != r7) goto L24
            goto L28
        L24:
            int r3 = r3 + 1
            goto L19
        L27:
            r4 = 0
        L28:
            if (r4 == 0) goto L31
            int r6 = r4.f4235
            boolean r6 = r0.onMenuItemSelected(r6, r8)
            return r6
        L31:
            return r1
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: ε */
    public final void mo202() {
            r3 = this;
            java.lang.Object r0 = r3.f397
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AbstractC0025.f368
            monitor-enter(r0)
            androidx.appcompat.app.AbstractC0025.m199(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f414
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f399
            android.view.View r0 = r0.getDecorView()
            w4 r1 = r3.f416
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f395 = r0
            int r0 = r3.f408
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f397
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            fw1 r0 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f370
            java.lang.Object r1 = r3.f397
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f408
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            fw1 r0 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f370
            java.lang.Object r1 = r3.f397
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e5 r0 = r3.f412
            if (r0 == 0) goto L63
            r0.m7302()
        L63:
            e5 r3 = r3.f413
            if (r3 == 0) goto L6a
            r3.m7302()
        L6a:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: η */
    public final boolean mo203(int r6) {
            r5 = this;
            r0 = 8
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = "AppCompatDelegate"
            if (r6 != r0) goto L11
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r2
            goto L1b
        L11:
            r0 = 9
            if (r6 != r0) goto L1b
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r1
        L1b:
            boolean r0 = r5.f388
            r3 = 0
            if (r0 == 0) goto L23
            if (r6 != r2) goto L23
            return r3
        L23:
            boolean r0 = r5.f384
            r4 = 1
            if (r0 == 0) goto L2c
            if (r6 != r4) goto L2c
            r5.f384 = r3
        L2c:
            if (r6 == r4) goto L61
            r0 = 2
            if (r6 == r0) goto L5b
            r0 = 5
            if (r6 == r0) goto L55
            r0 = 10
            if (r6 == r0) goto L4f
            if (r6 == r2) goto L49
            if (r6 == r1) goto L43
            android.view.Window r5 = r5.f399
            boolean r5 = r5.requestFeature(r6)
            return r5
        L43:
            r5.m218()
            r5.f385 = r4
            return r4
        L49:
            r5.m218()
            r5.f384 = r4
            return r4
        L4f:
            r5.m218()
            r5.f386 = r4
            return r4
        L55:
            r5.m218()
            r5.f383 = r4
            return r4
        L5b:
            r5.m218()
            r5.f382 = r4
            return r4
        L61:
            r5.m218()
            r5.f388 = r4
            return r4
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: θ */
    public final void mo221(p000.iz0 r6) {
            r5 = this;
            xq r6 = r5.f405
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Le3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m259()
            yq r6 = r6.f501
            b52 r6 = (p000.b52) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1484
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Le3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f759
            if (r6 == 0) goto Le3
            boolean r6 = r6.f527
            if (r6 == 0) goto Le3
            android.content.Context r6 = r5.f398
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            xq r6 = r5.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m259()
            yq r6 = r6.f501
            b52 r6 = (p000.b52) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1484
            androidx.appcompat.widget.ActionMenuView r6 = r6.f759
            if (r6 == 0) goto Le3
            androidx.appcompat.widget.γ r6 = r6.f528
            if (r6 == 0) goto Le3
            ｓ r2 = r6.f787
            if (r2 != 0) goto L4a
            boolean r6 = r6.m327()
            if (r6 == 0) goto Le3
        L4a:
            android.view.Window r6 = r5.f399
            android.view.Window$Callback r6 = r6.getCallback()
            xq r2 = r5.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.m259()
            yq r2 = r2.f501
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f1484
            androidx.appcompat.widget.ActionMenuView r2 = r2.f759
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L94
            androidx.appcompat.widget.γ r2 = r2.f528
            if (r2 == 0) goto L94
            boolean r2 = r2.m327()
            if (r2 == 0) goto L94
            xq r0 = r5.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            if (r0 == 0) goto L86
            androidx.appcompat.widget.γ r0 = r0.f528
            if (r0 == 0) goto L86
            boolean r0 = r0.m323()
        L86:
            boolean r0 = r5.f395
            if (r0 != 0) goto Le2
            g5 r5 = r5.m210(r1)
            iz0 r5 = r5.f4242
            r6.onPanelClosed(r3, r5)
            return
        L94:
            if (r6 == 0) goto Le2
            boolean r2 = r5.f395
            if (r2 != 0) goto Le2
            boolean r2 = r5.f414
            if (r2 == 0) goto Lb1
            int r2 = r5.f415
            r0 = r0 & r2
            if (r0 == 0) goto Lb1
            android.view.Window r0 = r5.f399
            android.view.View r0 = r0.getDecorView()
            w4 r2 = r5.f416
            r0.removeCallbacks(r2)
            r2.run()
        Lb1:
            g5 r0 = r5.m210(r1)
            iz0 r2 = r0.f4242
            if (r2 == 0) goto Le2
            boolean r4 = r0.f4249
            if (r4 != 0) goto Le2
            android.view.View r4 = r0.f4241
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le2
            iz0 r0 = r0.f4242
            r6.onMenuOpened(r3, r0)
            xq r5 = r5.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.m259()
            yq r5 = r5.f501
            b52 r5 = (p000.b52) r5
            androidx.appcompat.widget.Toolbar r5 = r5.f1484
            androidx.appcompat.widget.ActionMenuView r5 = r5.f759
            if (r5 == 0) goto Le2
            androidx.appcompat.widget.γ r5 = r5.f528
            if (r5 == 0) goto Le2
            r5.m331()
        Le2:
            return
        Le3:
            g5 r6 = r5.m210(r1)
            r6.f4248 = r0
            r5.m226(r6, r1)
            r0 = 0
            r5.m215(r6, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: ι */
    public final void mo204(int r3) {
            r2 = this;
            r2.m229()
            android.view.ViewGroup r0 = r2.f379
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.f398
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            d5 r3 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m1649(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: κ */
    public final void mo205(android.view.View r3) {
            r2 = this;
            r2.m229()
            android.view.ViewGroup r0 = r2.f379
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            d5 r3 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m1649(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: λ */
    public final void mo206(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m229()
            android.view.ViewGroup r0 = r2.f379
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            d5 r3 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m1649(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0025
    /* JADX INFO: renamed from: μ */
    public final void mo207(java.lang.CharSequence r3) {
            r2 = this;
            r2.f404 = r3
            xq r0 = r2.f405
            if (r0 == 0) goto La
            r0.setWindowTitle(r3)
            return
        La:
            tb2 r0 = r2.f402
            if (r0 == 0) goto L2f
            yq r2 = r0.f10283
            b52 r2 = (p000.b52) r2
            boolean r0 = r2.f1490
            if (r0 != 0) goto L36
            androidx.appcompat.widget.Toolbar r0 = r2.f1484
            r2.f1491 = r3
            int r1 = r2.f1485
            r1 = r1 & 8
            if (r1 == 0) goto L36
            r0.setTitle(r3)
            boolean r2 = r2.f1490
            if (r2 == 0) goto L36
            android.view.View r2 = r0.getRootView()
            p000.b92.m829(r2, r3)
            return
        L2f:
            android.widget.TextView r2 = r2.f380
            if (r2 == 0) goto L36
            r2.setText(r3)
        L36:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final boolean m222(boolean r13, boolean r14) {
            r12 = this;
            boolean r0 = r12.f395
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = -100
            int r2 = r12.f408
            if (r2 == r0) goto Ld
            goto Lf
        Ld:
            int r2 = androidx.appcompat.app.AbstractC0025.f362
        Lf:
            android.content.Context r0 = r12.f398
            int r3 = r12.m213(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L21
            cv0 r4 = m208(r0)
            goto L22
        L21:
            r4 = r6
        L22:
            if (r14 != 0) goto L32
            if (r4 == 0) goto L32
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            cv0 r4 = p000.AbstractC0006a5.m34(r14)
        L32:
            android.content.res.Configuration r14 = m209(r0, r3, r4, r6, r1)
            boolean r3 = r12.f411
            r5 = 1
            java.lang.Object r7 = r12.f397
            if (r3 != 0) goto L69
            boolean r3 = r7 instanceof android.app.Activity
            if (r3 == 0) goto L69
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L49
            r3 = r1
            goto L6d
        L49:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.Class r9 = r7.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r8.<init>(r0, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r9 = 269221888(0x100c0000, float:2.7610132E-29)
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            if (r3 == 0) goto L69
            int r3 = r3.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r12.f410 = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            goto L69
        L5f:
            r3 = move-exception
            java.lang.String r8 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r8, r9, r3)
            r12.f410 = r1
        L69:
            r12.f411 = r5
            int r3 = r12.f410
        L6d:
            android.content.res.Configuration r8 = r12.f396
            if (r8 != 0) goto L79
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L79:
            int r9 = r8.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            cv0 r8 = p000.AbstractC0006a5.m34(r8)
            if (r4 != 0) goto L89
            r4 = r6
            goto L8d
        L89:
            cv0 r4 = p000.AbstractC0006a5.m34(r14)
        L8d:
            if (r9 == r10) goto L92
            r9 = 512(0x200, float:7.17E-43)
            goto L93
        L92:
            r9 = r1
        L93:
            if (r4 == 0) goto L9d
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L9d
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        L9d:
            int r8 = ~r3
            r8 = r8 & r9
            if (r8 == 0) goto Lda
            if (r13 == 0) goto Lda
            boolean r13 = r12.f393
            if (r13 == 0) goto Lda
            boolean r13 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f372
            if (r13 != 0) goto Laf
            boolean r13 = r12.f394
            if (r13 == 0) goto Lda
        Laf:
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto Lda
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r8 = r13.isChild()
            if (r8 != 0) goto Lda
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r8 < r11) goto Ld5
            r8 = r9 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto Ld5
            android.view.Window r8 = r13.getWindow()
            android.view.View r8 = r8.getDecorView()
            int r14 = r14.getLayoutDirection()
            r8.setLayoutDirection(r14)
        Ld5:
            r13.recreate()
            r13 = r5
            goto Ldb
        Lda:
            r13 = r1
        Ldb:
            if (r13 != 0) goto L141
            if (r9 == 0) goto L141
            r13 = r9 & r3
            if (r13 != r9) goto Le4
            r1 = r5
        Le4:
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r14 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r13.getConfiguration()
            r14.<init>(r3)
            android.content.res.Configuration r3 = r13.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & (-49)
            r3 = r3 | r10
            r14.uiMode = r3
            if (r4 == 0) goto L101
            p000.AbstractC0006a5.m36(r14, r4)
        L101:
            r13.updateConfiguration(r14, r6)
            int r13 = r12.f409
            if (r13 == 0) goto L114
            r0.setTheme(r13)
            android.content.res.Resources$Theme r13 = r0.getTheme()
            int r3 = r12.f409
            r13.applyStyle(r3, r5)
        L114:
            if (r1 == 0) goto L142
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L142
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r13 = r7 instanceof p000.hr0
            if (r13 == 0) goto L135
            r13 = r7
            hr0 r13 = (p000.hr0) r13
            jr0 r13 = r13.mo192()
            cr0 r13 = r13.f5558
            cr0 r1 = p000.cr0.f2726
            int r13 = r13.compareTo(r1)
            if (r13 < 0) goto L142
            r7.onConfigurationChanged(r14)
            goto L142
        L135:
            boolean r13 = r12.f394
            if (r13 == 0) goto L142
            boolean r13 = r12.f395
            if (r13 != 0) goto L142
            r7.onConfigurationChanged(r14)
            goto L142
        L141:
            r5 = r13
        L142:
            if (r4 == 0) goto L153
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            cv0 r13 = p000.AbstractC0006a5.m34(r13)
            p000.AbstractC0006a5.m35(r13)
        L153:
            if (r2 != 0) goto L15d
            р r13 = r12.m231(r0)
            r13.m7308()
            goto L164
        L15d:
            e5 r13 = r12.f412
            if (r13 == 0) goto L164
            r13.m7302()
        L164:
            e5 r13 = r12.f413
            r14 = 3
            if (r2 != r14) goto L178
            if (r13 != 0) goto L172
            e5 r13 = new e5
            r13.<init>(r12, r0)
            r12.f413 = r13
        L172:
            e5 r12 = r12.f413
            r12.m7308()
            goto L17d
        L178:
            if (r13 == 0) goto L17d
            r13.m7302()
        L17d:
            return r5
    }

    /* JADX INFO: renamed from: ξ */
    public final void m223(android.view.Window r8) {
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f399
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof p000.WindowCallbackC0200d5
            if (r2 != 0) goto L7a
            d5 r0 = new d5
            r0.<init>(r7, r1)
            r7.f400 = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f398
            int[] r1 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f371
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            j5 r4 = p000.C0419j5.m2862()
            monitor-enter(r4)
            tn1 r5 = r4.f5322     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.m5725(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.f399 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f421
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f397
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f422
            if (r1 == 0) goto L61
            p000.AbstractC0101c5.m1131(r8, r1)
            r7.f422 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = p000.AbstractC0101c5.m1129(r0)
            r7.f421 = r8
            goto L76
        L74:
            r7.f421 = r2
        L76:
            r7.m219()
        L79:
            return
        L7a:
            p000.C1080.m7279(r0)
            return
        L7e:
            p000.C1080.m7279(r0)
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m224(int r3, p000.C0310g5 r4, p000.iz0 r5) {
            r2 = this;
            if (r5 != 0) goto L11
            if (r4 != 0) goto Ld
            if (r3 < 0) goto Ld
            g5[] r0 = r2.f390
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r4 = r0[r3]
        Ld:
            if (r4 == 0) goto L11
            iz0 r5 = r4.f4242
        L11:
            if (r4 == 0) goto L18
            boolean r4 = r4.f4247
            if (r4 != 0) goto L18
            goto L35
        L18:
            boolean r4 = r2.f395
            if (r4 != 0) goto L35
            d5 r4 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r4.getClass()
            r0 = 1
            r1 = 0
            r4.f2885 = r0     // Catch: java.lang.Throwable -> L31
            r2.onPanelClosed(r3, r5)     // Catch: java.lang.Throwable -> L31
            r4.f2885 = r1
            return
        L31:
            r2 = move-exception
            r4.f2885 = r1
            throw r2
        L35:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m225(p000.iz0 r3) {
            r2 = this;
            boolean r0 = r2.f389
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f389 = r0
            xq r0 = r2.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            if (r0 == 0) goto L2f
            androidx.appcompat.widget.γ r0 = r0.f528
            if (r0 == 0) goto L2f
            r0.m323()
            ｑ r0 = r0.f809
            if (r0 == 0) goto L2f
            boolean r1 = r0.m5039()
            if (r1 == 0) goto L2f
            oz0 r0 = r0.f9171
            r0.dismiss()
        L2f:
            android.view.Window r0 = r2.f399
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L40
            boolean r1 = r2.f395
            if (r1 != 0) goto L40
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L40:
            r3 = 0
            r2.f389 = r3
            return
    }

    /* JADX INFO: renamed from: σ */
    public final void m226(p000.C0310g5 r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L29
            int r0 = r4.f4235
            if (r0 != 0) goto L29
            xq r0 = r3.f405
            if (r0 == 0) goto L29
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            if (r0 == 0) goto L29
            androidx.appcompat.widget.γ r0 = r0.f528
            if (r0 == 0) goto L29
            boolean r0 = r0.m327()
            if (r0 == 0) goto L29
            iz0 r4 = r4.f4242
            r3.m225(r4)
            return
        L29:
            android.content.Context r0 = r3.f398
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L48
            boolean r2 = r4.f4247
            if (r2 == 0) goto L48
            android.view.ViewGroup r2 = r4.f4239
            if (r2 == 0) goto L48
            r0.removeView(r2)
            if (r5 == 0) goto L48
            int r5 = r4.f4235
            r3.m224(r5, r4, r1)
        L48:
            r5 = 0
            r4.f4245 = r5
            r4.f4246 = r5
            r4.f4247 = r5
            r4.f4240 = r1
            r5 = 1
            r4.f4248 = r5
            g5 r5 = r3.f391
            if (r5 != r4) goto L5a
            r3.f391 = r1
        L5a:
            int r4 = r4.f4235
            if (r4 != 0) goto L61
            r3.m219()
        L61:
            return
    }

    /* JADX INFO: renamed from: υ */
    public final boolean m227(android.view.KeyEvent r7) {
            r6 = this;
            java.lang.Object r0 = r6.f397
            boolean r1 = r0 instanceof p000.xo0
            if (r1 != 0) goto La
            boolean r0 = r0 instanceof p000.DialogInterfaceC0929w
            if (r0 == 0) goto L14
        La:
            android.view.Window r0 = r6.f399
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L14
            java.util.WeakHashMap r0 = p000.b92.f1572
        L14:
            int r0 = r7.getKeyCode()
            r1 = 0
            r2 = 82
            r3 = 1
            if (r0 != r2) goto L39
            d5 r0 = r6.f400
            android.view.Window r4 = r6.f399
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f2884 = r3     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch: java.lang.Throwable -> L35
            r0.f2884 = r1
            if (r4 == 0) goto L39
            goto L147
        L35:
            r6 = move-exception
            r0.f2884 = r1
            throw r6
        L39:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L69
            if (r0 == r5) goto L5c
            if (r0 == r2) goto L4a
            goto L148
        L4a:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L147
            g5 r0 = r6.m210(r1)
            boolean r1 = r0.f4247
            if (r1 != 0) goto L147
            r6.m217(r0, r7)
            return r3
        L5c:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L65
            goto L66
        L65:
            r3 = r1
        L66:
            r6.f392 = r3
            return r1
        L69:
            if (r0 == r5) goto L141
            if (r0 == r2) goto L6f
            goto L148
        L6f:
            ｗ r0 = r6.f373
            if (r0 == 0) goto L75
            goto L147
        L75:
            g5 r0 = r6.m210(r1)
            xq r2 = r6.f405
            android.content.Context r4 = r6.f398
            if (r2 == 0) goto Lff
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.m259()
            yq r2 = r2.f501
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f1484
            int r5 = r2.getVisibility()
            if (r5 != 0) goto Lff
            androidx.appcompat.widget.ActionMenuView r2 = r2.f759
            if (r2 == 0) goto Lff
            boolean r2 = r2.f527
            if (r2 == 0) goto Lff
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r4)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto Lff
            xq r2 = r6.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.m259()
            yq r2 = r2.f501
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f1484
            androidx.appcompat.widget.ActionMenuView r2 = r2.f759
            if (r2 == 0) goto Ld9
            androidx.appcompat.widget.γ r2 = r2.f528
            if (r2 == 0) goto Ld9
            boolean r2 = r2.m327()
            if (r2 == 0) goto Ld9
            xq r6 = r6.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m259()
            yq r6 = r6.f501
            b52 r6 = (p000.b52) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1484
            androidx.appcompat.widget.ActionMenuView r6 = r6.f759
            if (r6 == 0) goto L11f
            androidx.appcompat.widget.γ r6 = r6.f528
            if (r6 == 0) goto L11f
            boolean r6 = r6.m323()
            if (r6 == 0) goto L11f
        Ld8:
            goto L11d
        Ld9:
            boolean r2 = r6.f395
            if (r2 != 0) goto L11f
            boolean r7 = r6.m217(r0, r7)
            if (r7 == 0) goto L11f
            xq r6 = r6.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m259()
            yq r6 = r6.f501
            b52 r6 = (p000.b52) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1484
            androidx.appcompat.widget.ActionMenuView r6 = r6.f759
            if (r6 == 0) goto L11f
            androidx.appcompat.widget.γ r6 = r6.f528
            if (r6 == 0) goto L11f
            boolean r6 = r6.m331()
            if (r6 == 0) goto L11f
            goto Ld8
        Lff:
            boolean r2 = r0.f4247
            if (r2 != 0) goto L121
            boolean r5 = r0.f4246
            if (r5 == 0) goto L108
            goto L121
        L108:
            boolean r2 = r0.f4245
            if (r2 == 0) goto L11f
            boolean r2 = r0.f4249
            if (r2 == 0) goto L117
            r0.f4245 = r1
            boolean r2 = r6.m217(r0, r7)
            goto L118
        L117:
            r2 = r3
        L118:
            if (r2 == 0) goto L11f
            r6.m215(r0, r7)
        L11d:
            r6 = r3
            goto L125
        L11f:
            r6 = r1
            goto L125
        L121:
            r6.m226(r0, r3)
            r6 = r2
        L125:
            if (r6 == 0) goto L147
            android.content.Context r6 = r4.getApplicationContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            if (r6 == 0) goto L139
            r6.playSoundEffect(r1)
            return r3
        L139:
            java.lang.String r6 = "AppCompatDelegate"
            java.lang.String r7 = "Couldn't get audio manager"
            android.util.Log.w(r6, r7)
            return r3
        L141:
            boolean r6 = r6.m214()
            if (r6 == 0) goto L148
        L147:
            return r3
        L148:
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public final void m228(int r4) {
            r3 = this;
            g5 r0 = r3.m210(r4)
            iz0 r1 = r0.f4242
            if (r1 == 0) goto L24
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            iz0 r2 = r0.f4242
            r2.m2840(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L1a
            r0.f4250 = r1
        L1a:
            iz0 r1 = r0.f4242
            r1.m2843()
            iz0 r1 = r0.f4242
            r1.clear()
        L24:
            r1 = 1
            r0.f4249 = r1
            r0.f4248 = r1
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L2f
            if (r4 != 0) goto L3e
        L2f:
            xq r4 = r3.f405
            if (r4 == 0) goto L3e
            r4 = 0
            g5 r0 = r3.m210(r4)
            r0.f4245 = r4
            r4 = 0
            r3.m217(r0, r4)
        L3e:
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m229() {
            r11 = this;
            boolean r0 = r11.f378
            if (r0 != 0) goto L2a2
            android.content.Context r0 = r11.f398
            int[] r1 = p000.kk1.f5977
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r1)
            r3 = 117(0x75, float:1.64E-43)
            boolean r4 = r2.hasValue(r3)
            if (r4 == 0) goto L29a
            r4 = 126(0x7e, float:1.77E-43)
            r5 = 0
            boolean r4 = r2.getBoolean(r4, r5)
            r6 = 108(0x6c, float:1.51E-43)
            r7 = 1
            if (r4 == 0) goto L24
            r11.mo203(r7)
            goto L2d
        L24:
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L2d
            r11.mo203(r6)
        L2d:
            r3 = 118(0x76, float:1.65E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == 0) goto L3a
            r11.mo203(r4)
        L3a:
            r3 = 119(0x77, float:1.67E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L47
            r3 = 10
            r11.mo203(r3)
        L47:
            boolean r3 = r2.getBoolean(r5, r5)
            r11.f387 = r3
            r2.recycle()
            r11.m230()
            android.view.Window r2 = r11.f399
            r2.getDecorView()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            boolean r3 = r11.f388
            r8 = 0
            if (r3 != 0) goto Ldb
            boolean r3 = r11.f387
            if (r3 == 0) goto L74
            r3 = 2131492876(0x7f0c000c, float:1.8609216E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r11.f385 = r5
            r11.f384 = r5
            goto Lf2
        L74:
            boolean r2 = r11.f384
            if (r2 == 0) goto Ld9
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r9 = 2130968585(0x7f040009, float:1.7545828E38)
            r3.resolveAttribute(r9, r2, r7)
            int r3 = r2.resourceId
            if (r3 == 0) goto L93
            np r3 = new np
            int r2 = r2.resourceId
            r3.<init>(r0, r2)
            goto L94
        L93:
            r3 = r0
        L94:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r3 = 2131492887(0x7f0c0017, float:1.8609239E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 2131296507(0x7f0900fb, float:1.8210933E38)
            android.view.View r3 = r2.findViewById(r3)
            xq r3 = (p000.InterfaceC0993xq) r3
            r11.f405 = r3
            android.view.Window r9 = r11.f399
            android.view.Window$Callback r9 = r9.getCallback()
            r3.setWindowCallback(r9)
            boolean r3 = r11.f385
            if (r3 == 0) goto Lc0
            xq r3 = r11.f405
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.m258(r4)
        Lc0:
            boolean r3 = r11.f382
            if (r3 == 0) goto Lcc
            xq r3 = r11.f405
            r4 = 2
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.m258(r4)
        Lcc:
            boolean r3 = r11.f383
            if (r3 == 0) goto Lf2
            xq r3 = r11.f405
            r4 = 5
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.m258(r4)
            goto Lf2
        Ld9:
            r2 = r8
            goto Lf2
        Ldb:
            boolean r3 = r11.f386
            if (r3 == 0) goto Le9
            r3 = 2131492886(0x7f0c0016, float:1.8609237E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto Lf2
        Le9:
            r3 = 2131492885(0x7f0c0015, float:1.8609235E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        Lf2:
            if (r2 == 0) goto L25f
            x4 r3 = new x4
            r3.<init>(r11, r5)
            java.util.WeakHashMap r4 = p000.b92.f1572
            p000.u82.m5827(r2, r3)
            xq r3 = r11.f405
            if (r3 != 0) goto L10d
            r3 = 2131297003(0x7f0902eb, float:1.8211939E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r11.f380 = r3
        L10d:
            java.lang.String r3 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r4 = "ViewUtils"
            java.lang.Class r9 = r2.getClass()     // Catch: java.lang.IllegalAccessException -> L125 java.lang.reflect.InvocationTargetException -> L127 java.lang.NoSuchMethodException -> L135
            java.lang.String r10 = "makeOptionalFitsSystemWindows"
            java.lang.reflect.Method r9 = r9.getMethod(r10, r8)     // Catch: java.lang.IllegalAccessException -> L125 java.lang.reflect.InvocationTargetException -> L127 java.lang.NoSuchMethodException -> L135
            boolean r10 = r9.isAccessible()     // Catch: java.lang.IllegalAccessException -> L125 java.lang.reflect.InvocationTargetException -> L127 java.lang.NoSuchMethodException -> L135
            if (r10 != 0) goto L129
            r9.setAccessible(r7)     // Catch: java.lang.IllegalAccessException -> L125 java.lang.reflect.InvocationTargetException -> L127 java.lang.NoSuchMethodException -> L135
            goto L129
        L125:
            r9 = move-exception
            goto L12d
        L127:
            r9 = move-exception
            goto L131
        L129:
            r9.invoke(r2, r8)     // Catch: java.lang.IllegalAccessException -> L125 java.lang.reflect.InvocationTargetException -> L127 java.lang.NoSuchMethodException -> L135
            goto L13a
        L12d:
            android.util.Log.d(r4, r3, r9)
            goto L13a
        L131:
            android.util.Log.d(r4, r3, r9)
            goto L13a
        L135:
            java.lang.String r3 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r4, r3)
        L13a:
            r3 = 2131296296(0x7f090028, float:1.8210505E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r4 = r11.f399
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L171
        L150:
            int r10 = r4.getChildCount()
            if (r10 <= 0) goto L161
            android.view.View r10 = r4.getChildAt(r5)
            r4.removeViewAt(r5)
            r3.addView(r10)
            goto L150
        L161:
            r10 = -1
            r4.setId(r10)
            r3.setId(r9)
            boolean r10 = r4 instanceof android.widget.FrameLayout
            if (r10 == 0) goto L171
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.setForeground(r8)
        L171:
            android.view.Window r4 = r11.f399
            r4.setContentView(r2)
            x4 r4 = new x4
            r4.<init>(r11, r7)
            r3.setAttachListener(r4)
            r11.f379 = r2
            java.lang.Object r2 = r11.f397
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L18d
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.CharSequence r2 = r2.getTitle()
            goto L18f
        L18d:
            java.lang.CharSequence r2 = r11.f404
        L18f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1c9
            xq r3 = r11.f405
            if (r3 == 0) goto L19d
            r3.setWindowTitle(r2)
            goto L1c9
        L19d:
            tb2 r3 = r11.f402
            if (r3 == 0) goto L1c2
            yq r3 = r3.f10283
            b52 r3 = (p000.b52) r3
            boolean r4 = r3.f1490
            if (r4 != 0) goto L1c9
            androidx.appcompat.widget.Toolbar r4 = r3.f1484
            r3.f1491 = r2
            int r8 = r3.f1485
            r8 = r8 & 8
            if (r8 == 0) goto L1c9
            r4.setTitle(r2)
            boolean r3 = r3.f1490
            if (r3 == 0) goto L1c9
            android.view.View r3 = r4.getRootView()
            p000.b92.m829(r3, r2)
            goto L1c9
        L1c2:
            android.widget.TextView r3 = r11.f380
            if (r3 == 0) goto L1c9
            r3.setText(r2)
        L1c9:
            android.view.ViewGroup r2 = r11.f379
            android.view.View r2 = r2.findViewById(r9)
            androidx.appcompat.widget.ContentFrameLayout r2 = (androidx.appcompat.widget.ContentFrameLayout) r2
            android.view.Window r3 = r11.f399
            android.view.View r3 = r3.getDecorView()
            int r4 = r3.getPaddingLeft()
            int r8 = r3.getPaddingTop()
            int r9 = r3.getPaddingRight()
            int r3 = r3.getPaddingBottom()
            android.graphics.Rect r10 = r2.f604
            r10.set(r4, r8, r9, r3)
            boolean r3 = r2.isLaidOut()
            if (r3 == 0) goto L1f5
            r2.requestLayout()
        L1f5:
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 124(0x7c, float:1.74E-43)
            android.util.TypedValue r3 = r2.getMinWidthMajor()
            r0.getValue(r1, r3)
            r1 = 125(0x7d, float:1.75E-43)
            android.util.TypedValue r3 = r2.getMinWidthMinor()
            r0.getValue(r1, r3)
            r1 = 122(0x7a, float:1.71E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L21a
            android.util.TypedValue r3 = r2.getFixedWidthMajor()
            r0.getValue(r1, r3)
        L21a:
            r1 = 123(0x7b, float:1.72E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L229
            android.util.TypedValue r3 = r2.getFixedWidthMinor()
            r0.getValue(r1, r3)
        L229:
            r1 = 120(0x78, float:1.68E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L238
            android.util.TypedValue r3 = r2.getFixedHeightMajor()
            r0.getValue(r1, r3)
        L238:
            r1 = 121(0x79, float:1.7E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L247
            android.util.TypedValue r3 = r2.getFixedHeightMinor()
            r0.getValue(r1, r3)
        L247:
            r0.recycle()
            r2.requestLayout()
            r11.f378 = r7
            g5 r0 = r11.m210(r5)
            boolean r1 = r11.f395
            if (r1 != 0) goto L2a2
            iz0 r0 = r0.f4242
            if (r0 != 0) goto L2a2
            r11.m212(r6)
            goto L2a2
        L25f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AppCompat does not support the current theme features: { windowActionBar: "
            r0.<init>(r1)
            boolean r1 = r11.f384
            r0.append(r1)
            java.lang.String r1 = ", windowActionBarOverlay: "
            r0.append(r1)
            boolean r1 = r11.f385
            r0.append(r1)
            java.lang.String r1 = ", android:windowIsFloating: "
            r0.append(r1)
            boolean r1 = r11.f387
            r0.append(r1)
            java.lang.String r1 = ", windowActionModeOverlay: "
            r0.append(r1)
            boolean r1 = r11.f386
            r0.append(r1)
            java.lang.String r1 = ", windowNoTitle: "
            r0.append(r1)
            boolean r11 = r11.f388
            java.lang.String r1 = " }"
            java.lang.String r11 = p000.lz1.m3693(r0, r11, r1)
            p000.C1080.m7275(r11)
            return
        L29a:
            r2.recycle()
            java.lang.String r11 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            p000.C1080.m7279(r11)
        L2a2:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m230() {
            r2 = this;
            android.view.Window r0 = r2.f399
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.f397
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.m223(r0)
        L13:
            android.view.Window r2 = r2.f399
            if (r2 == 0) goto L18
            return
        L18:
            java.lang.String r2 = "We have not been given a Window"
            p000.C1080.m7279(r2)
            return
    }

    /* JADX INFO: renamed from: ω */
    public final p000.AbstractC1118 m231(android.content.Context r4) {
            r3 = this;
            e5 r0 = r3.f412
            if (r0 != 0) goto L24
            e5 r0 = new e5
            m6 r1 = p000.C0538m6.f6965
            if (r1 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()
            m6 r1 = new m6
            java.lang.String r2 = "location"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r1.<init>(r4, r2)
            p000.C0538m6.f6965 = r1
        L1d:
            m6 r4 = p000.C0538m6.f6965
            r0.<init>(r3, r4)
            r3.f412 = r0
        L24:
            e5 r3 = r3.f412
            return r3
    }
}
