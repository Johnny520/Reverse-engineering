package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements defpackage.m1, defpackage.iu {
    public final /* synthetic */ androidx.appcompat.widget.Toolbar a;

    public /* synthetic */ d70(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.iu
    public void k(defpackage.ku r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r2 = r1.a
            androidx.appcompat.widget.ActionMenuView r0 = r2.a
            j1 r0 = r0.t
            if (r0 == 0) goto Lf
            boolean r0 = r0.j()
            if (r0 == 0) goto Lf
            return
        Lf:
            d4 r2 = r2.G
            java.lang.Object r2 = r2.c
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L20
            return
        L20:
            java.lang.ClassCastException r2 = defpackage.z30.h(r2)
            throw r2
    }

    @Override // defpackage.iu
    public boolean n(defpackage.ku r1, android.view.MenuItem r2) {
            r0 = this;
            androidx.appcompat.widget.Toolbar r1 = r0.a
            r1.getClass()
            r1 = 0
            return r1
    }
}
