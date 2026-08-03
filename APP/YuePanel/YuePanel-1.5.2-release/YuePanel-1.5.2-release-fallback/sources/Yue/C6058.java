package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6058 extends android.view.MenuInflater {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f21900 = "SupportMenuInflater";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f21901 = "menu";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f21902 = "group";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f21903 = "item";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21904 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.Class<?>[] f21905 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.Class<?>[] f21906 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object[] f21907;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Object[] f21908;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.Context f21909;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.Object f21910;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ$ۥ, reason: contains not printable characters */
    public static class MenuItemOnMenuItemClickListenerC6059 implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.Class<?>[] f21911 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Object f21912;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.reflect.Method f21913;

        static {
                java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                Yue.C6058.MenuItemOnMenuItemClickListenerC6059.f21911 = r0
                return
        }

        public MenuItemOnMenuItemClickListenerC6059(java.lang.Object r5, java.lang.String r6) {
                r4 = this;
                r4.<init>()
                r4.f21912 = r5
                java.lang.Class r5 = r5.getClass()
                java.lang.Class<?>[] r0 = Yue.C6058.MenuItemOnMenuItemClickListenerC6059.f21911     // Catch: java.lang.Exception -> L12
                java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.Exception -> L12
                r4.f21913 = r0     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                android.view.InflateException r1 = new android.view.InflateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Couldn't resolve menu item onClick handler "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " in class "
                r2.append(r6)
                java.lang.String r5 = r5.getName()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                r1.initCause(r0)
                throw r1
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                java.lang.reflect.Method r0 = r2.f21913     // Catch: java.lang.Exception -> L1d
                java.lang.Class r0 = r0.getReturnType()     // Catch: java.lang.Exception -> L1d
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L1d
                if (r0 != r1) goto L1f
                java.lang.reflect.Method r0 = r2.f21913     // Catch: java.lang.Exception -> L1d
                java.lang.Object r1 = r2.f21912     // Catch: java.lang.Exception -> L1d
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L1d
                java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L1d
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L1d
                boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L1d
                return r3
            L1d:
                r3 = move-exception
                goto L2c
            L1f:
                java.lang.reflect.Method r0 = r2.f21913     // Catch: java.lang.Exception -> L1d
                java.lang.Object r1 = r2.f21912     // Catch: java.lang.Exception -> L1d
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L1d
                r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L1d
                r3 = 1
                return r3
            L2c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ$ۥ۟, reason: contains not printable characters */
    public class C6060 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static final int f21914 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static final int f21915 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public static final int f21916 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public static final int f21917 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public static final int f21918 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public static final boolean f21919 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final boolean f21920 = true;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final boolean f21921 = true;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.Menu f21922;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f21923;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f21924;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f21925;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f21926;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f21927;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f21928;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f21929;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f21930;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f21931;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.CharSequence f21932;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public java.lang.CharSequence f21933;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f21934;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public char f21935;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f21936;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public char f21937;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f21938;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f21939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean f21940;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f21941;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f21942;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f21943;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f21944;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.String f21945;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.String f21946;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public java.lang.String f21947;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public Yue.AbstractC0183 f21948;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public java.lang.CharSequence f21949;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public java.lang.CharSequence f21950;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public android.content.res.ColorStateList f21951;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public android.graphics.PorterDuff.Mode f21952;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6058 f21953;

        public C6060(Yue.C6058 r1, android.view.Menu r2) {
                r0 = this;
                r0.f21953 = r1
                r0.<init>()
                r1 = 0
                r0.f21951 = r1
                r0.f21952 = r1
                r0.f21922 = r2
                r0.m22779()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m22772() {
                r5 = this;
                r0 = 1
                r5.f21929 = r0
                android.view.Menu r0 = r5.f21922
                int r1 = r5.f21923
                int r2 = r5.f21930
                int r3 = r5.f21931
                java.lang.CharSequence r4 = r5.f21932
                android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)
                r5.m22780(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.view.SubMenu m22773() {
                r5 = this;
                r0 = 1
                r5.f21929 = r0
                android.view.Menu r0 = r5.f21922
                int r1 = r5.f21923
                int r2 = r5.f21930
                int r3 = r5.f21931
                java.lang.CharSequence r4 = r5.f21932
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.m22780(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final char m22774(java.lang.String r2) {
                r1 = this;
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                char r2 = r2.charAt(r0)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m22775() {
                r1 = this;
                boolean r0 = r1.f21929
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final <T> T m22776(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object[] r5) {
                r2 = this;
                Yue.ۥۢ۠ۥۢ r0 = r2.f21953     // Catch: java.lang.Exception -> L1a
                android.content.Context r0 = r0.f21909     // Catch: java.lang.Exception -> L1a
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L1a
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Exception -> L1a
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L1a
                r0 = 1
                r4.setAccessible(r0)     // Catch: java.lang.Exception -> L1a
                java.lang.Object r3 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L1a
                return r3
            L1a:
                r4 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Cannot instantiate class: "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                java.lang.String r5 = "SupportMenuInflater"
                android.util.Log.w(r5, r3, r4)
                r3 = 0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m22777(android.util.AttributeSet r3) {
                r2 = this;
                Yue.ۥۢ۠ۥۢ r0 = r2.f21953
                android.content.Context r0 = r0.f21909
                int[] r1 = Yue.C5058.C5071.f17852
                android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1)
                int r0 = Yue.C5058.C5071.f17854
                r1 = 0
                int r0 = r3.getResourceId(r0, r1)
                r2.f21923 = r0
                int r0 = Yue.C5058.C5071.f17856
                int r0 = r3.getInt(r0, r1)
                r2.f21924 = r0
                int r0 = Yue.C5058.C5071.f17857
                int r0 = r3.getInt(r0, r1)
                r2.f21925 = r0
                int r0 = Yue.C5058.C5071.f17858
                int r0 = r3.getInt(r0, r1)
                r2.f21926 = r0
                int r0 = Yue.C5058.C5071.f17855
                r1 = 1
                boolean r0 = r3.getBoolean(r0, r1)
                r2.f21927 = r0
                int r0 = Yue.C5058.C5071.f17853
                boolean r0 = r3.getBoolean(r0, r1)
                r2.f21928 = r0
                r3.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m22778(android.util.AttributeSet r7) {
                r6 = this;
                Yue.ۥۢ۠ۥۢ r0 = r6.f21953
                android.content.Context r0 = r0.f21909
                int[] r1 = Yue.C5058.C5071.f17859
                Yue.ۥۢۡۥۦ r7 = Yue.C6264.m23338(r0, r7, r1)
                int r0 = Yue.C5058.C5071.f17862
                r1 = 0
                int r0 = r7.m23360(r0, r1)
                r6.f21930 = r0
                int r0 = Yue.C5058.C5071.f17865
                int r2 = r6.f21924
                int r0 = r7.m23354(r0, r2)
                int r2 = Yue.C5058.C5071.f17866
                int r3 = r6.f21925
                int r2 = r7.m23354(r2, r3)
                r3 = -65536(0xffffffffffff0000, float:NaN)
                r0 = r0 & r3
                r3 = 65535(0xffff, float:9.1834E-41)
                r2 = r2 & r3
                r0 = r0 | r2
                r6.f21931 = r0
                int r0 = Yue.C5058.C5071.f17867
                java.lang.CharSequence r0 = r7.m23363(r0)
                r6.f21932 = r0
                int r0 = Yue.C5058.C5071.f17868
                java.lang.CharSequence r0 = r7.m23363(r0)
                r6.f21933 = r0
                int r0 = Yue.C5058.C5071.f17860
                int r0 = r7.m23360(r0, r1)
                r6.f21934 = r0
                int r0 = Yue.C5058.C5071.f17869
                java.lang.String r0 = r7.m23362(r0)
                char r0 = r6.m22774(r0)
                r6.f21935 = r0
                int r0 = Yue.C5058.C5071.f17876
                r2 = 4096(0x1000, float:5.74E-42)
                int r0 = r7.m23354(r0, r2)
                r6.f21936 = r0
                int r0 = Yue.C5058.C5071.f17870
                java.lang.String r0 = r7.m23362(r0)
                char r0 = r6.m22774(r0)
                r6.f21937 = r0
                int r0 = Yue.C5058.C5071.f17880
                int r0 = r7.m23354(r0, r2)
                r6.f21938 = r0
                int r0 = Yue.C5058.C5071.f17871
                boolean r0 = r7.m23368(r0)
                if (r0 == 0) goto L80
                int r0 = Yue.C5058.C5071.f17871
                boolean r0 = r7.m23340(r0, r1)
                r6.f21939 = r0
                goto L84
            L80:
                int r0 = r6.f21926
                r6.f21939 = r0
            L84:
                int r0 = Yue.C5058.C5071.f17863
                boolean r0 = r7.m23340(r0, r1)
                r6.f21940 = r0
                int r0 = Yue.C5058.C5071.f17864
                boolean r2 = r6.f21927
                boolean r0 = r7.m23340(r0, r2)
                r6.f21941 = r0
                int r0 = Yue.C5058.C5071.f17861
                boolean r2 = r6.f21928
                boolean r0 = r7.m23340(r0, r2)
                r6.f21942 = r0
                int r0 = Yue.C5058.C5071.f17881
                r2 = -1
                int r0 = r7.m23354(r0, r2)
                r6.f21943 = r0
                int r0 = Yue.C5058.C5071.f17872
                java.lang.String r0 = r7.m23362(r0)
                r6.f21947 = r0
                int r0 = Yue.C5058.C5071.f17873
                int r0 = r7.m23360(r0, r1)
                r6.f21944 = r0
                int r0 = Yue.C5058.C5071.f17875
                java.lang.String r0 = r7.m23362(r0)
                r6.f21945 = r0
                int r0 = Yue.C5058.C5071.f17874
                java.lang.String r0 = r7.m23362(r0)
                r6.f21946 = r0
                if (r0 == 0) goto Lcd
                r3 = 1
                goto Lce
            Lcd:
                r3 = r1
            Lce:
                r4 = 0
                if (r3 == 0) goto Le8
                int r5 = r6.f21944
                if (r5 != 0) goto Le8
                java.lang.String r5 = r6.f21945
                if (r5 != 0) goto Le8
                java.lang.Class<?>[] r3 = Yue.C6058.f21906
                Yue.ۥۢ۠ۥۢ r5 = r6.f21953
                java.lang.Object[] r5 = r5.f21908
                java.lang.Object r0 = r6.m22776(r0, r3, r5)
                Yue.ۥ۟۟ۧ۠ r0 = (Yue.AbstractC0183) r0
                r6.f21948 = r0
                goto Lf3
            Le8:
                if (r3 == 0) goto Lf1
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r3 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
                android.util.Log.w(r0, r3)
            Lf1:
                r6.f21948 = r4
            Lf3:
                int r0 = Yue.C5058.C5071.f17877
                java.lang.CharSequence r0 = r7.m23363(r0)
                r6.f21949 = r0
                int r0 = Yue.C5058.C5071.f17882
                java.lang.CharSequence r0 = r7.m23363(r0)
                r6.f21950 = r0
                int r0 = Yue.C5058.C5071.f17879
                boolean r0 = r7.m23368(r0)
                if (r0 == 0) goto L11a
                int r0 = Yue.C5058.C5071.f17879
                int r0 = r7.m23354(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r6.f21952
                android.graphics.PorterDuff$Mode r0 = Yue.C2012.m9307(r0, r2)
                r6.f21952 = r0
                goto L11c
            L11a:
                r6.f21952 = r4
            L11c:
                int r0 = Yue.C5058.C5071.f17878
                boolean r0 = r7.m23368(r0)
                if (r0 == 0) goto L12d
                int r0 = Yue.C5058.C5071.f17878
                android.content.res.ColorStateList r0 = r7.m23343(r0)
                r6.f21951 = r0
                goto L12f
            L12d:
                r6.f21951 = r4
            L12f:
                r7.m23371()
                r6.f21929 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m22779() {
                r1 = this;
                r0 = 0
                r1.f21923 = r0
                r1.f21924 = r0
                r1.f21925 = r0
                r1.f21926 = r0
                r0 = 1
                r1.f21927 = r0
                r1.f21928 = r0
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m22780(android.view.MenuItem r6) {
                r5 = this;
                boolean r0 = r5.f21940
                android.view.MenuItem r0 = r6.setChecked(r0)
                boolean r1 = r5.f21941
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r5.f21942
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r5.f21939
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L1a
                r1 = r3
                goto L1b
            L1a:
                r1 = r2
            L1b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r5.f21933
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r5.f21934
                r0.setIcon(r1)
                int r0 = r5.f21943
                if (r0 < 0) goto L31
                r6.setShowAsAction(r0)
            L31:
                java.lang.String r0 = r5.f21947
                if (r0 == 0) goto L58
                Yue.ۥۢ۠ۥۢ r0 = r5.f21953
                android.content.Context r0 = r0.f21909
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L50
                Yue.ۥۢ۠ۥۢ$ۥ r0 = new Yue.ۥۢ۠ۥۢ$ۥ
                Yue.ۥۢ۠ۥۢ r1 = r5.f21953
                java.lang.Object r1 = r1.m22770()
                java.lang.String r4 = r5.f21947
                r0.<init>(r1, r4)
                r6.setOnMenuItemClickListener(r0)
                goto L58
            L50:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
                r6.<init>(r0)
                throw r6
            L58:
                int r0 = r5.f21939
                r1 = 2
                if (r0 < r1) goto L72
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.C7348
                if (r0 == 0) goto L68
                r0 = r6
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = (androidx.appcompat.view.menu.C7348) r0
                r0.m28234(r3)
                goto L72
            L68:
                boolean r0 = r6 instanceof Yue.MenuItemC4130
                if (r0 == 0) goto L72
                r0 = r6
                Yue.ۥۡ۠ۦۥ r0 = (Yue.MenuItemC4130) r0
                r0.m16208(r3)
            L72:
                java.lang.String r0 = r5.f21945
                if (r0 == 0) goto L86
                java.lang.Class<?>[] r1 = Yue.C6058.f21905
                Yue.ۥۢ۠ۥۢ r2 = r5.f21953
                java.lang.Object[] r2 = r2.f21907
                java.lang.Object r0 = r5.m22776(r0, r1, r2)
                android.view.View r0 = (android.view.View) r0
                r6.setActionView(r0)
                r2 = r3
            L86:
                int r0 = r5.f21944
                if (r0 <= 0) goto L97
                if (r2 != 0) goto L90
                r6.setActionView(r0)
                goto L97
            L90:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            L97:
                Yue.ۥ۟۟ۧ۠ r0 = r5.f21948
                if (r0 == 0) goto L9e
                Yue.C4125.m16181(r6, r0)
            L9e:
                java.lang.CharSequence r0 = r5.f21949
                Yue.C4125.m16185(r6, r0)
                java.lang.CharSequence r0 = r5.f21950
                Yue.C4125.m16192(r6, r0)
                char r0 = r5.f21935
                int r1 = r5.f21936
                Yue.C4125.m16184(r6, r0, r1)
                char r0 = r5.f21937
                int r1 = r5.f21938
                Yue.C4125.m16188(r6, r0, r1)
                android.graphics.PorterDuff$Mode r0 = r5.f21952
                if (r0 == 0) goto Lbd
                Yue.C4125.m16187(r6, r0)
            Lbd:
                android.content.res.ColorStateList r0 = r5.f21951
                if (r0 == 0) goto Lc4
                Yue.C4125.m16186(r6, r0)
            Lc4:
                return
        }
    }

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            Yue.C6058.f21905 = r0
            Yue.C6058.f21906 = r0
            return
    }

    public C6058(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f21909 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.f21907 = r1
            r0.f21908 = r1
            return
    }

    @Override // android.view.MenuInflater
    public void inflate(@Yue.InterfaceC3573 int r6, android.view.Menu r7) {
            r5 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r7 instanceof Yue.InterfaceMenuC6057
            if (r1 != 0) goto La
            super.inflate(r6, r7)
            return
        La:
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.f21909     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            android.content.res.XmlResourceParser r1 = r3.getLayout(r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            boolean r3 = r7 instanceof androidx.appcompat.view.menu.C7343     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            if (r3 == 0) goto L32
            r3 = r7
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r3 = (androidx.appcompat.view.menu.C7343) r3     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            boolean r4 = r3.isDispatchingItemsChanged()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            if (r4 == 0) goto L32
            r3.stopDispatchingItemsChanged()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            r2 = 1
            goto L32
        L2c:
            r6 = move-exception
            goto L4e
        L2e:
            r6 = move-exception
            goto L42
        L30:
            r6 = move-exception
            goto L48
        L32:
            r5.m22771(r1, r6, r7)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e org.xmlpull.v1.XmlPullParserException -> L30
            if (r2 == 0) goto L3c
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r7 = (androidx.appcompat.view.menu.C7343) r7
            r7.startDispatchingItemsChanged()
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            return
        L42:
            android.view.InflateException r3 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2c
            throw r3     // Catch: java.lang.Throwable -> L2c
        L48:
            android.view.InflateException r3 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2c
            throw r3     // Catch: java.lang.Throwable -> L2c
        L4e:
            if (r2 == 0) goto L55
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r7 = (androidx.appcompat.view.menu.C7343) r7
            r7.startDispatchingItemsChanged()
        L55:
            if (r1 == 0) goto L5a
            r1.close()
        L5a:
            throw r6
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m22769(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r2 = r1.m22769(r2)
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Object m22770() {
            r1 = this;
            java.lang.Object r0 = r1.f21910
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.f21909
            java.lang.Object r0 = r1.m22769(r0)
            r1.f21910 = r0
        Lc:
            java.lang.Object r0 = r1.f21910
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22771(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r12 = this;
            Yue.ۥۢ۠ۥۢ$ۥ۟ r0 = new Yue.ۥۢ۠ۥۢ$ۥ۟
            r0.<init>(r12, r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m22779()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m22775()
            if (r15 != 0) goto Lb9
            Yue.ۥ۟۟ۧ۠ r15 = r0.f21948
            if (r15 == 0) goto L82
            boolean r15 = r15.mo1024()
            if (r15 == 0) goto L82
            r0.m22773()
            goto Lb9
        L82:
            r0.m22772()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m22777(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m22778(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m22773()
            r12.m22771(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
    }
}
