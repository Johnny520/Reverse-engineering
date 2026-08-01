package defpackage;

/* JADX INFO: renamed from: ᛶᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1083 implements defpackage.InterfaceC0205, defpackage.InterfaceC0510 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f4869;

    public /* synthetic */ C1083(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.f4869 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public boolean mo1300(defpackage.MenuC1701 r1, android.view.MenuItem r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public void mo1301(defpackage.MenuC1701 r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar r0 = r0.f4869
            androidx.appcompat.widget.ActionMenuView r1 = r0.f195
            ᲁᲀᛴᛷ r1 = r1.f107
            if (r1 == 0) goto Lf
            boolean r1 = r1.m3341()
            if (r1 == 0) goto Lf
            return
        Lf:
            ᛶᲈᛱᲈ r0 = r0.f177
            java.lang.Object r0 = r0.f5356
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L20
            return
        L20:
            java.lang.Object r0 = r0.next()
            ᛲᛶᲈᲇ r0 = (defpackage.AbstractC0315) r0
            r0.getClass()
            r0 = 0
            throw r0
    }
}
