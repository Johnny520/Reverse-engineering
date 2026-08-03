package a;

/* JADX INFO: renamed from: a.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f408a;
    public a.C0162ge<a.Je, android.view.MenuItem> b;
    public a.C0162ge<a.Ke, android.view.SubMenu> c;

    public AbstractC0059b2(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f408a = r1
            return
    }

    public final android.view.MenuItem c(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof a.Je
            if (r0 == 0) goto L29
            a.Je r3 = (a.Je) r3
            a.ge<a.Je, android.view.MenuItem> r0 = r2.b
            if (r0 != 0) goto L11
            a.ge r0 = new a.ge
            r0.<init>()
            r2.b = r0
        L11:
            a.ge<a.Je, android.view.MenuItem> r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L28
            a.db r0 = new a.db
            android.content.Context r1 = r2.f408a
            r0.<init>(r1, r3)
            a.ge<a.Je, android.view.MenuItem> r1 = r2.b
            r1.put(r3, r0)
        L28:
            return r0
        L29:
            return r3
    }

    public final android.view.SubMenu d(android.view.SubMenu r3) {
            r2 = this;
            boolean r0 = r3 instanceof a.Ke
            if (r0 == 0) goto L29
            a.Ke r3 = (a.Ke) r3
            a.ge<a.Ke, android.view.SubMenu> r0 = r2.c
            if (r0 != 0) goto L11
            a.ge r0 = new a.ge
            r0.<init>()
            r2.c = r0
        L11:
            a.ge<a.Ke, android.view.SubMenu> r0 = r2.c
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L28
            a.De r0 = new a.De
            android.content.Context r1 = r2.f408a
            r0.<init>(r1, r3)
            a.ge<a.Ke, android.view.SubMenu> r1 = r2.c
            r1.put(r3, r0)
        L28:
            return r0
        L29:
            return r3
    }
}
