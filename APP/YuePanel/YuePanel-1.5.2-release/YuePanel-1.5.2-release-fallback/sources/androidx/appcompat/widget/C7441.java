package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7441 extends Yue.AbstractC0183 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f25849 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f25850 = "share_history.xml";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f25851;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final androidx.appcompat.widget.C7441.MenuItemOnMenuItemClickListenerC7444 f25852;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.content.Context f25853;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String f25854;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.appcompat.widget.C7441.InterfaceC7442 f25855;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7421.InterfaceC7427 f25856;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
    public interface InterfaceC7442 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean m28487(androidx.appcompat.widget.C7441 r1, android.content.Intent r2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟, reason: contains not printable characters */
    public class C7443 implements androidx.appcompat.widget.C7421.InterfaceC7427 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7441 f25857;

        public C7443(androidx.appcompat.widget.C7441 r1) {
                r0 = this;
                r0.f25857 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C7421.InterfaceC7427
        /* JADX INFO: renamed from: ۥ */
        public boolean mo28460(androidx.appcompat.widget.C7421 r2, android.content.Intent r3) {
                r1 = this;
                androidx.appcompat.widget.ۥ۟۟۟۠ r2 = r1.f25857
                androidx.appcompat.widget.ۥ۟۟۟۠$ۥ r0 = r2.f25855
                if (r0 == 0) goto L9
                r0.m28487(r2, r3)
            L9:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
    public class MenuItemOnMenuItemClickListenerC7444 implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7441 f25858;

        public MenuItemOnMenuItemClickListenerC7444(androidx.appcompat.widget.C7441 r1) {
                r0 = this;
                r0.f25858 = r1
                r0.<init>()
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                androidx.appcompat.widget.ۥ۟۟۟۠ r0 = r2.f25858
                android.content.Context r1 = r0.f25853
                java.lang.String r0 = r0.f25854
                androidx.appcompat.widget.ۥ۟ r0 = androidx.appcompat.widget.C7421.m28436(r1, r0)
                int r3 = r3.getItemId()
                android.content.Intent r3 = r0.m28438(r3)
                if (r3 == 0) goto L34
                java.lang.String r0 = r3.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L28
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L2d
            L28:
                androidx.appcompat.widget.ۥ۟۟۟۠ r0 = r2.f25858
                r0.m28486(r3)
            L2d:
                androidx.appcompat.widget.ۥ۟۟۟۠ r0 = r2.f25858
                android.content.Context r0 = r0.f25853
                r0.startActivity(r3)
            L34:
                r3 = 1
                return r3
        }
    }

    public C7441(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 4
            r1.f25851 = r0
            androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟ r0 = new androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟
            r0.<init>(r1)
            r1.f25852 = r0
            java.lang.String r0 = "share_history.xml"
            r1.f25854 = r0
            r1.f25853 = r2
            return
    }

    @Override // Yue.AbstractC0183
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1024() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC0183
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public android.view.View mo1026() {
            r5 = this;
            androidx.appcompat.widget.ActivityChooserView r0 = new androidx.appcompat.widget.ActivityChooserView
            android.content.Context r1 = r5.f25853
            r0.<init>(r1)
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L18
            android.content.Context r1 = r5.f25853
            java.lang.String r2 = r5.f25854
            androidx.appcompat.widget.ۥ۟ r1 = androidx.appcompat.widget.C7421.m28436(r1, r2)
            r0.setActivityChooserModel(r1)
        L18:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.Context r2 = r5.f25853
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r3 = Yue.C5058.C5060.f16578
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.Context r2 = r5.f25853
            int r1 = r1.resourceId
            android.graphics.drawable.Drawable r1 = Yue.C0479.m1737(r2, r1)
            r0.setExpandActivityOverflowButtonDrawable(r1)
            r0.setProvider(r5)
            int r1 = Yue.C5058.C5069.f17243
            r0.setDefaultActionButtonContentDescription(r1)
            int r1 = Yue.C5058.C5069.f17242
            r0.setExpandActivityOverflowButtonContentDescription(r1)
            return r0
    }

    @Override // Yue.AbstractC0183
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo1029(android.view.SubMenu r9) {
            r8 = this;
            r9.clear()
            android.content.Context r0 = r8.f25853
            java.lang.String r1 = r8.f25854
            androidx.appcompat.widget.ۥ۟ r0 = androidx.appcompat.widget.C7421.m28436(r0, r1)
            android.content.Context r1 = r8.f25853
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            int r2 = r0.m28441()
            int r3 = r8.f25851
            int r3 = java.lang.Math.min(r2, r3)
            r4 = 0
            r5 = r4
        L1d:
            if (r5 >= r3) goto L3b
            android.content.pm.ResolveInfo r6 = r0.m28440(r5)
            java.lang.CharSequence r7 = r6.loadLabel(r1)
            android.view.MenuItem r7 = r9.add(r4, r5, r5, r7)
            android.graphics.drawable.Drawable r6 = r6.loadIcon(r1)
            android.view.MenuItem r6 = r7.setIcon(r6)
            androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟ r7 = r8.f25852
            r6.setOnMenuItemClickListener(r7)
            int r5 = r5 + 1
            goto L1d
        L3b:
            if (r3 >= r2) goto L68
            android.content.Context r5 = r8.f25853
            int r6 = Yue.C5058.C5069.f17222
            java.lang.String r5 = r5.getString(r6)
            android.view.SubMenu r9 = r9.addSubMenu(r4, r3, r3, r5)
            r3 = r4
        L4a:
            if (r3 >= r2) goto L68
            android.content.pm.ResolveInfo r5 = r0.m28440(r3)
            java.lang.CharSequence r6 = r5.loadLabel(r1)
            android.view.MenuItem r6 = r9.add(r4, r3, r3, r6)
            android.graphics.drawable.Drawable r5 = r5.loadIcon(r1)
            android.view.MenuItem r5 = r6.setIcon(r5)
            androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟ r6 = r8.f25852
            r5.setOnMenuItemClickListener(r6)
            int r3 = r3 + 1
            goto L4a
        L68:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28482() {
            r2 = this;
            androidx.appcompat.widget.ۥ۟۟۟۠$ۥ r0 = r2.f25855
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠ r0 = r2.f25856
            if (r0 != 0) goto L10
            androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟ r0 = new androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟
            r0.<init>(r2)
            r2.f25856 = r0
        L10:
            android.content.Context r0 = r2.f25853
            java.lang.String r1 = r2.f25854
            androidx.appcompat.widget.ۥ۟ r0 = androidx.appcompat.widget.C7421.m28436(r0, r1)
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠ r1 = r2.f25856
            r0.m28456(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28483(androidx.appcompat.widget.C7441.InterfaceC7442 r1) {
            r0 = this;
            r0.f25855 = r1
            r0.m28482()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28484(java.lang.String r1) {
            r0 = this;
            r0.f25854 = r1
            r0.m28482()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28485(android.content.Intent r3) {
            r2 = this;
            if (r3 == 0) goto L19
            java.lang.String r0 = r3.getAction()
            java.lang.String r1 = "android.intent.action.SEND"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
        L16:
            r2.m28486(r3)
        L19:
            android.content.Context r0 = r2.f25853
            java.lang.String r1 = r2.f25854
            androidx.appcompat.widget.ۥ۟ r0 = androidx.appcompat.widget.C7421.m28436(r0, r1)
            r0.m28455(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m28486(android.content.Intent r2) {
            r1 = this;
            r0 = 134742016(0x8080000, float:4.092601E-34)
            r2.addFlags(r0)
            return
    }
}
