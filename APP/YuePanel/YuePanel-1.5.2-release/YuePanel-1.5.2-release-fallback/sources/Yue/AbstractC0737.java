package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0737 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final android.content.Context f2062;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C5787<Yue.InterfaceMenuItemC6061, android.view.MenuItem> f2063;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C5787<Yue.InterfaceSubMenuC6062, android.view.SubMenu> f2064;

    public AbstractC0737(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f2062 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.view.MenuItem m4572(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.InterfaceMenuItemC6061
            if (r0 == 0) goto L28
            Yue.ۥۢ۠ۥۣ r3 = (Yue.InterfaceMenuItemC6061) r3
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r0 = r2.f2063
            if (r0 != 0) goto L11
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            r2.f2063 = r0
        L11:
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r0 = r2.f2063
            java.lang.Object r0 = r0.get(r3)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L27
            Yue.ۥۡ۠ۦۥ r0 = new Yue.ۥۡ۠ۦۥ
            android.content.Context r1 = r2.f2062
            r0.<init>(r1, r3)
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            r1.put(r3, r0)
        L27:
            return r0
        L28:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.view.SubMenu m4573(android.view.SubMenu r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.InterfaceSubMenuC6062
            if (r0 == 0) goto L28
            Yue.ۥۢ۠ۥۤ r3 = (Yue.InterfaceSubMenuC6062) r3
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۤ, android.view.SubMenu> r0 = r2.f2064
            if (r0 != 0) goto L11
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            r2.f2064 = r0
        L11:
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۤ, android.view.SubMenu> r0 = r2.f2064
            java.lang.Object r0 = r0.get(r3)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L27
            Yue.ۥۣۢ۠ۤ r0 = new Yue.ۥۣۢ۠ۤ
            android.content.Context r1 = r2.f2062
            r0.<init>(r1, r3)
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۤ, android.view.SubMenu> r1 = r2.f2064
            r1.put(r3, r0)
        L27:
            return r0
        L28:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m4574() {
            r1 = this;
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r0 = r1.f2063
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۤ, android.view.SubMenu> r0 = r1.f2064
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m4575(int r3) {
            r2 = this;
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r0 = r2.f2063
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            java.lang.Object r1 = r1.keyAt(r0)
            Yue.ۥۢ۠ۥۣ r1 = (Yue.InterfaceMenuItemC6061) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L23
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            r1.removeAt(r0)
            int r0 = r0 + (-1)
        L23:
            int r0 = r0 + 1
            goto L6
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m4576(int r3) {
            r2 = this;
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r0 = r2.f2063
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r1 = r2.f2063
            java.lang.Object r1 = r1.keyAt(r0)
            Yue.ۥۢ۠ۥۣ r1 = (Yue.InterfaceMenuItemC6061) r1
            int r1 = r1.getItemId()
            if (r1 != r3) goto L22
            Yue.ۥۢ۟ۡ<Yue.ۥۢ۠ۥۣ, android.view.MenuItem> r3 = r2.f2063
            r3.removeAt(r0)
            goto L25
        L22:
            int r0 = r0 + 1
            goto L6
        L25:
            return
    }
}
