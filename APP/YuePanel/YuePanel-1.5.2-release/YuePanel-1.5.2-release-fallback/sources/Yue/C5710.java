package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5710 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f20986 = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f20987 = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f20988 = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f20989 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f20990 = ".sharecompat_";

    /* JADX INFO: renamed from: Yue.ۥۡۨۦ۟$ۥ, reason: contains not printable characters */
    public static class C5711 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.Context f20991;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.Intent f20992;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.lang.CharSequence f20993;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.ArrayList<java.lang.String> f20994;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.ArrayList<java.lang.String> f20995;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.ArrayList<java.lang.String> f20996;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.ArrayList<android.net.Uri> f20997;

        public C5711(@Yue.InterfaceC4410 android.content.Context r4) {
                r3 = this;
                r3.<init>()
                java.lang.Object r0 = Yue.C4868.m19181(r4)
                android.content.Context r0 = (android.content.Context) r0
                r3.f20991 = r0
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.SEND"
                android.content.Intent r0 = r0.setAction(r1)
                r3.f20992 = r0
                java.lang.String r1 = r4.getPackageName()
                java.lang.String r2 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
                java.lang.String r2 = r4.getPackageName()
                r0.putExtra(r1, r2)
                r1 = 524288(0x80000, float:7.34684E-40)
                r0.addFlags(r1)
            L2f:
                boolean r0 = r4 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L41
                boolean r0 = r4 instanceof android.app.Activity
                if (r0 == 0) goto L3a
                android.app.Activity r4 = (android.app.Activity) r4
                goto L42
            L3a:
                android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
                android.content.Context r4 = r4.getBaseContext()
                goto L2f
            L41:
                r4 = 0
            L42:
                if (r4 == 0) goto L56
                android.content.ComponentName r4 = r4.getComponentName()
                android.content.Intent r0 = r3.f20992
                java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
                r0.putExtra(r1, r4)
                android.content.Intent r0 = r3.f20992
                java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
                r0.putExtra(r1, r4)
            L56:
                return
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static Yue.C5710.C5711 m21337(@Yue.InterfaceC4410 android.app.Activity r1) {
                Yue.ۥۡۨۦ۟$ۥ r0 = new Yue.ۥۡۨۦ۟$ۥ
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21338(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.f20996
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f20996 = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.f20996
                r0.add(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C5710.C5711 m21339(@Yue.InterfaceC4410 java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.BCC"
                r1.m21346(r0, r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C5710.C5711 m21340(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.f20995
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f20995 = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.f20995
                r0.add(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C5710.C5711 m21341(@Yue.InterfaceC4410 java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.CC"
                r1.m21346(r0, r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C5710.C5711 m21342(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.f20994
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f20994 = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.f20994
                r0.add(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C5710.C5711 m21343(@Yue.InterfaceC4410 java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.EMAIL"
                r1.m21346(r0, r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21344(@Yue.InterfaceC4410 android.net.Uri r2) {
                r1 = this;
                java.util.ArrayList<android.net.Uri> r0 = r1.f20997
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f20997 = r0
            Lb:
                java.util.ArrayList<android.net.Uri> r0 = r1.f20997
                r0.add(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m21345(java.lang.String r5, java.util.ArrayList<java.lang.String> r6) {
                r4 = this;
                android.content.Intent r0 = r4.f20992
                java.lang.String[] r0 = r0.getStringArrayExtra(r5)
                r1 = 0
                if (r0 == 0) goto Lb
                int r2 = r0.length
                goto Lc
            Lb:
                r2 = r1
            Lc:
                int r3 = r6.size()
                int r3 = r3 + r2
                java.lang.String[] r3 = new java.lang.String[r3]
                r6.toArray(r3)
                if (r0 == 0) goto L1f
                int r6 = r6.size()
                java.lang.System.arraycopy(r0, r1, r3, r6, r2)
            L1f:
                android.content.Intent r6 = r4.f20992
                r6.putExtra(r5, r3)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m21346(@Yue.InterfaceC4544 java.lang.String r6, @Yue.InterfaceC4410 java.lang.String[] r7) {
                r5 = this;
                android.content.Intent r0 = r5.m21349()
                java.lang.String[] r1 = r0.getStringArrayExtra(r6)
                r2 = 0
                if (r1 == 0) goto Ld
                int r3 = r1.length
                goto Le
            Ld:
                r3 = r2
            Le:
                int r4 = r7.length
                int r4 = r4 + r3
                java.lang.String[] r4 = new java.lang.String[r4]
                if (r1 == 0) goto L17
                java.lang.System.arraycopy(r1, r2, r4, r2, r3)
            L17:
                int r1 = r7.length
                java.lang.System.arraycopy(r7, r2, r4, r3, r1)
                r0.putExtra(r6, r4)
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public android.content.Intent m21347() {
                r2 = this;
                android.content.Intent r0 = r2.m21349()
                java.lang.CharSequence r1 = r2.f20993
                android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public android.content.Context m21348() {
                r1 = this;
                android.content.Context r0 = r1.f20991
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public android.content.Intent m21349() {
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.f20994
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.m21345(r2, r0)
                r4.f20994 = r1
            Lc:
                java.util.ArrayList<java.lang.String> r0 = r4.f20995
                if (r0 == 0) goto L17
                java.lang.String r2 = "android.intent.extra.CC"
                r4.m21345(r2, r0)
                r4.f20995 = r1
            L17:
                java.util.ArrayList<java.lang.String> r0 = r4.f20996
                if (r0 == 0) goto L22
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.m21345(r2, r0)
                r4.f20996 = r1
            L22:
                java.util.ArrayList<android.net.Uri> r0 = r4.f20997
                java.lang.String r2 = "android.intent.extra.STREAM"
                if (r0 == 0) goto L45
                int r0 = r0.size()
                r3 = 1
                if (r0 <= r3) goto L45
                android.content.Intent r0 = r4.f20992
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                r0.setAction(r1)
                android.content.Intent r0 = r4.f20992
                java.util.ArrayList<android.net.Uri> r1 = r4.f20997
                r0.putParcelableArrayListExtra(r2, r1)
                android.content.Intent r0 = r4.f20992
                java.util.ArrayList<android.net.Uri> r1 = r4.f20997
                Yue.C5710.m21336(r0, r1)
                goto L81
            L45:
                android.content.Intent r0 = r4.f20992
                java.lang.String r3 = "android.intent.action.SEND"
                r0.setAction(r3)
                java.util.ArrayList<android.net.Uri> r0 = r4.f20997
                if (r0 == 0) goto L6c
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L6c
                android.content.Intent r0 = r4.f20992
                java.util.ArrayList<android.net.Uri> r1 = r4.f20997
                r3 = 0
                java.lang.Object r1 = r1.get(r3)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r0.putExtra(r2, r1)
                android.content.Intent r0 = r4.f20992
                java.util.ArrayList<android.net.Uri> r1 = r4.f20997
                Yue.C5710.m21336(r0, r1)
                goto L81
            L6c:
                android.content.Intent r0 = r4.f20992
                r0.removeExtra(r2)
                android.content.Intent r0 = r4.f20992
                r0.setClipData(r1)
                android.content.Intent r0 = r4.f20992
                int r1 = r0.getFlags()
                r1 = r1 & (-2)
                r0.setFlags(r1)
            L81:
                android.content.Intent r0 = r4.f20992
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21350(@Yue.InterfaceC5971 int r2) {
                r1 = this;
                android.content.Context r0 = r1.f20991
                java.lang.CharSequence r2 = r0.getText(r2)
                Yue.ۥۡۨۦ۟$ۥ r2 = r1.m21351(r2)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Yue.C5710.C5711 m21351(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
                r0 = this;
                r0.f20993 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public Yue.C5710.C5711 m21352(@Yue.InterfaceC4544 java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.BCC"
                r0.putExtra(r1, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public Yue.C5710.C5711 m21353(@Yue.InterfaceC4544 java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.CC"
                r0.putExtra(r1, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21354(@Yue.InterfaceC4544 java.lang.String[] r3) {
                r2 = this;
                java.util.ArrayList<java.lang.String> r0 = r2.f20994
                if (r0 == 0) goto L7
                r0 = 0
                r2.f20994 = r0
            L7:
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.EMAIL"
                r0.putExtra(r1, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21355(@Yue.InterfaceC4544 java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                r0.putExtra(r1, r3)
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.TEXT"
                boolean r0 = r0.hasExtra(r1)
                if (r0 != 0) goto L18
                android.text.Spanned r3 = android.text.Html.fromHtml(r3)
                r2.m21358(r3)
            L18:
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.C5710.C5711 m21356(@Yue.InterfaceC4544 android.net.Uri r2) {
                r1 = this;
                r0 = 0
                r1.f20997 = r0
                if (r2 == 0) goto L8
                r1.m21344(r2)
            L8:
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21357(@Yue.InterfaceC4544 java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                r0.putExtra(r1, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21358(@Yue.InterfaceC4544 java.lang.CharSequence r3) {
                r2 = this;
                android.content.Intent r0 = r2.f20992
                java.lang.String r1 = "android.intent.extra.TEXT"
                r0.putExtra(r1, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Yue.C5710.C5711 m21359(@Yue.InterfaceC4544 java.lang.String r2) {
                r1 = this;
                android.content.Intent r0 = r1.f20992
                r0.setType(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m21360() {
                r2 = this;
                android.content.Context r0 = r2.f20991
                android.content.Intent r1 = r2.m21347()
                r0.startActivity(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۦ۟$ۥ۟, reason: contains not printable characters */
    public static class C5712 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final java.lang.String f20998 = "IntentReader";

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.Context f20999;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.Intent f21000;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final java.lang.String f21001;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.content.ComponentName f21002;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.ArrayList<android.net.Uri> f21003;

        public C5712(@Yue.InterfaceC4410 android.app.Activity r2) {
                r1 = this;
                java.lang.Object r0 = Yue.C4868.m19181(r2)
                android.content.Context r0 = (android.content.Context) r0
                android.content.Intent r2 = r2.getIntent()
                r1.<init>(r0, r2)
                return
        }

        public C5712(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.content.Intent r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = Yue.C4868.m19181(r1)
                android.content.Context r1 = (android.content.Context) r1
                r0.f20999 = r1
                java.lang.Object r1 = Yue.C4868.m19181(r2)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.f21000 = r1
                java.lang.String r1 = Yue.C5710.m21335(r2)
                r0.f21001 = r1
                android.content.ComponentName r1 = Yue.C5710.m21333(r2)
                r0.f21002 = r1
                return
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C5710.C5712 m21361(@Yue.InterfaceC4410 android.app.Activity r1) {
                Yue.ۥۡۨۦ۟$ۥ۟ r0 = new Yue.ۥۡۨۦ۟$ۥ۟
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.content.ComponentName m21362() {
                r1 = this;
                android.content.ComponentName r0 = r1.f21002
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.graphics.drawable.Drawable m21363() {
                r4 = this;
                android.content.ComponentName r0 = r4.f21002
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.f20999
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                android.content.ComponentName r2 = r4.f21002     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r0 = r0.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r0
            L13:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve icon for calling activity"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.graphics.drawable.Drawable m21364() {
                r4 = this;
                java.lang.String r0 = r4.f21001
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.f20999
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r4.f21001     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r0 = r0.getApplicationIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r0
            L13:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve icon for calling application"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.lang.CharSequence m21365() {
                r4 = this;
                java.lang.String r0 = r4.f21001
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.f20999
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r4.f21001     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                r3 = 0
                android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                java.lang.CharSequence r0 = r0.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                return r0
            L18:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve label for calling application"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public java.lang.String m21366() {
                r1 = this;
                java.lang.String r0 = r1.f21001
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public java.lang.String[] m21367() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.BCC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public java.lang.String[] m21368() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.CC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public java.lang.String[] m21369() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.EMAIL"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public java.lang.String m21370() {
                r3 = this;
                android.content.Intent r0 = r3.f21000
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L1f
                java.lang.CharSequence r1 = r3.m21375()
                boolean r2 = r1 instanceof android.text.Spanned
                if (r2 == 0) goto L19
                android.text.Spanned r1 = (android.text.Spanned) r1
                java.lang.String r0 = android.text.Html.toHtml(r1)
                goto L1f
            L19:
                if (r1 == 0) goto L1f
                java.lang.String r0 = android.text.Html.escapeHtml(r1)
            L1f:
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public android.net.Uri m21371() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.STREAM"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.Uri r0 = (android.net.Uri) r0
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public android.net.Uri m21372(int r4) {
                r3 = this;
                java.util.ArrayList<android.net.Uri> r0 = r3.f21003
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r3.m21377()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r3.f21000
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r3.f21003 = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r3.f21003
                if (r0 == 0) goto L1f
                java.lang.Object r4 = r0.get(r4)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
            L1f:
                if (r4 != 0) goto L2a
                android.content.Intent r4 = r3.f21000
                android.os.Parcelable r4 = r4.getParcelableExtra(r1)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
            L2a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Stream items available: "
                r1.append(r2)
                int r2 = r3.m21373()
                r1.append(r2)
                java.lang.String r2 = " index requested: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m21373() {
                r2 = this;
                java.util.ArrayList<android.net.Uri> r0 = r2.f21003
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r2.m21377()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r2.f21000
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r2.f21003 = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r2.f21003
                if (r0 == 0) goto L1d
                int r0 = r0.size()
                return r0
            L1d:
                android.content.Intent r0 = r2.f21000
                boolean r0 = r0.hasExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public java.lang.String m21374() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                java.lang.String r0 = r0.getStringExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public java.lang.CharSequence m21375() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r1 = "android.intent.extra.TEXT"
                java.lang.CharSequence r0 = r0.getCharSequenceExtra(r1)
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public java.lang.String m21376() {
                r1 = this;
                android.content.Intent r0 = r1.f21000
                java.lang.String r0 = r0.getType()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean m21377() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean m21378() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L19
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L17
                goto L19
            L17:
                r0 = 0
                goto L1a
            L19:
                r0 = 1
            L1a:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean m21379() {
                r2 = this;
                android.content.Intent r0 = r2.f21000
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r0 = r1.equals(r0)
                return r0
        }
    }

    public C5710() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m21330(@Yue.InterfaceC4410 android.view.Menu r1, @Yue.InterfaceC3214 int r2, @Yue.InterfaceC4410 Yue.C5710.C5711 r3) {
            android.view.MenuItem r1 = r1.findItem(r2)
            if (r1 == 0) goto La
            m21331(r1, r3)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Could not find menu item with id "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " in the supplied menu"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m21331(@Yue.InterfaceC4410 android.view.MenuItem r3, @Yue.InterfaceC4410 Yue.C5710.C5711 r4) {
            android.view.ActionProvider r0 = r3.getActionProvider()
            boolean r1 = r0 instanceof android.widget.ShareActionProvider
            if (r1 != 0) goto L12
            android.widget.ShareActionProvider r0 = new android.widget.ShareActionProvider
            android.content.Context r1 = r4.m21348()
            r0.<init>(r1)
            goto L14
        L12:
            android.widget.ShareActionProvider r0 = (android.widget.ShareActionProvider) r0
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".sharecompat_"
            r1.append(r2)
            android.content.Context r2 = r4.m21348()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setShareHistoryFileName(r1)
            android.content.Intent r4 = r4.m21349()
            r0.setShareIntent(r4)
            r3.setActionProvider(r0)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.content.ComponentName m21332(@Yue.InterfaceC4410 android.app.Activity r1) {
            android.content.Intent r0 = r1.getIntent()
            android.content.ComponentName r1 = r1.getCallingActivity()
            if (r1 != 0) goto Le
            android.content.ComponentName r1 = m21333(r0)
        Le:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.content.ComponentName m21333(@Yue.InterfaceC4410 android.content.Intent r1) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            if (r0 != 0) goto L13
            java.lang.String r0 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            r0 = r1
            android.content.ComponentName r0 = (android.content.ComponentName) r0
        L13:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m21334(@Yue.InterfaceC4410 android.app.Activity r1) {
            android.content.Intent r0 = r1.getIntent()
            java.lang.String r1 = r1.getCallingPackage()
            if (r1 != 0) goto L10
            if (r0 == 0) goto L10
            java.lang.String r1 = m21335(r0)
        L10:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m21335(@Yue.InterfaceC4410 android.content.Intent r1) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r1.getStringExtra(r0)
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m21336(@Yue.InterfaceC4410 android.content.Intent r7, @Yue.InterfaceC4410 java.util.ArrayList<android.net.Uri> r8) {
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.CharSequence r0 = r7.getCharSequenceExtra(r0)
            java.lang.String r1 = "android.intent.extra.HTML_TEXT"
            java.lang.String r1 = r7.getStringExtra(r1)
            android.content.ClipData r2 = new android.content.ClipData
            java.lang.String r3 = r7.getType()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            r5 = 0
            java.lang.Object r5 = r8.get(r5)
            android.net.Uri r5 = (android.net.Uri) r5
            r6 = 0
            r4.<init>(r0, r1, r6, r5)
            r2.<init>(r6, r3, r4)
            int r0 = r8.size()
            r1 = 1
            r3 = r1
        L2c:
            if (r3 >= r0) goto L3f
            java.lang.Object r4 = r8.get(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            r5.<init>(r4)
            r2.addItem(r5)
            int r3 = r3 + 1
            goto L2c
        L3f:
            r7.setClipData(r2)
            r7.addFlags(r1)
            return
    }
}
