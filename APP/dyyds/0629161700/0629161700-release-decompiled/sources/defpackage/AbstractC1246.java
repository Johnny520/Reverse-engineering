package defpackage;

/* JADX INFO: renamed from: ᛷᛳᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1246 implements defpackage.InterfaceC0696 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f5574;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f5575;

    public AbstractC1246(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f5575 = r1
            return
    }

    public AbstractC1246(android.content.Context r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.f5575 = r1
            r0.f5574 = r2
            return
    }

    public AbstractC1246(defpackage.LayoutInflaterFactory2C1411 r1) {
            r0 = this;
            r0.<init>()
            r0.f5574 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract void mo1945();

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m2353() {
            r3 = this;
            r3.m2354()
            android.content.IntentFilter r0 = r3.mo1947()
            int r1 = r0.countActions()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.Object r1 = r3.f5575
            ᛳᛷᲇᛸ r1 = (defpackage.C0517) r1
            if (r1 != 0) goto L1c
            ᛳᛷᲇᛸ r1 = new ᛳᛷᲇᛸ
            r2 = 0
            r1.<init>(r2, r3)
            r3.f5575 = r1
        L1c:
            java.lang.Object r3 = r3.f5574
            ᛸᛱᛱᛲ r3 = (defpackage.LayoutInflaterFactory2C1411) r3
            android.content.Context r3 = r3.f6153
            r3.registerReceiver(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract int mo1946();

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract android.content.IntentFilter mo1947();

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m2354() {
            r2 = this;
            java.lang.Object r0 = r2.f5575
            ᛳᛷᲇᛸ r0 = (defpackage.C0517) r0
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.f5574     // Catch: java.lang.IllegalArgumentException -> Lf
            ᛸᛱᛱᛲ r1 = (defpackage.LayoutInflaterFactory2C1411) r1     // Catch: java.lang.IllegalArgumentException -> Lf
            android.content.Context r1 = r1.f6153     // Catch: java.lang.IllegalArgumentException -> Lf
            r1.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
        Lf:
            r0 = 0
            r2.f5575 = r0
        L12:
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r5) {
            r4 = this;
            ᛸᛱᛳᛳ r0 = new ᛸᛱᛳᛳ
            java.lang.Object r1 = r4.f5575
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r4 = r4.f5574
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<java.io.File> r2 = java.io.File.class
            ᲈᛶᲀᛳ r2 = r5.m2475(r2, r4)
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            ᲈᛶᲀᛳ r5 = r5.m2475(r3, r4)
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.view.MenuItem m2355(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.InterfaceMenuItemC0997
            if (r0 == 0) goto L2d
            ᛵᲈᛶᛲ r3 = (defpackage.InterfaceMenuItemC0997) r3
            java.lang.Object r0 = r2.f5574
            ᛸᲇᛲᛶ r0 = (defpackage.C1580) r0
            if (r0 != 0) goto L14
            ᛸᲇᛲᛶ r0 = new ᛸᲇᛲᛶ
            r1 = 0
            r0.<init>(r1)
            r2.f5574 = r0
        L14:
            java.lang.Object r0 = r0.get(r3)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L2c
            ᲀᛸᛱᲈ r0 = new ᲀᛸᛱᲈ
            java.lang.Object r1 = r2.f5575
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r3)
            java.lang.Object r2 = r2.f5574
            ᛸᲇᛲᛶ r2 = (defpackage.C1580) r2
            r2.put(r3, r0)
        L2c:
            return r0
        L2d:
            return r3
    }
}
