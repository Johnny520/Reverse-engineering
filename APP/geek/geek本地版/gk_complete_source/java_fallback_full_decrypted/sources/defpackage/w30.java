package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends defpackage.qz {
    public boolean a;
    public final /* synthetic */ defpackage.hx b;

    public w30(defpackage.hx r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 0
            r0.a = r1
            return
    }

    @Override // defpackage.qz
    public final void a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            if (r2 != 0) goto Le
            boolean r1 = r0.a
            if (r1 == 0) goto Le
            r1 = 0
            r0.a = r1
            hx r1 = r0.b
            r1.f()
        Le:
            return
    }

    @Override // defpackage.qz
    public final void b(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            if (r2 != 0) goto L6
            if (r3 == 0) goto L5
            goto L6
        L5:
            return
        L6:
            r1 = 1
            r0.a = r1
            return
    }
}
