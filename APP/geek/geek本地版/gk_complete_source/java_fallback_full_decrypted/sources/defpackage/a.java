package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a implements defpackage.ya0 {
    public boolean a;
    public int b;
    public final /* synthetic */ androidx.appcompat.widget.ActionBarContextView c;

    public a(androidx.appcompat.widget.ActionBarContextView r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r1 = 0
            r0.a = r1
            return
    }

    @Override // defpackage.ya0
    public final void a() {
            r2 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            androidx.appcompat.widget.ActionBarContextView r1 = r2.c
            r1.f = r0
            int r0 = r2.b
            androidx.appcompat.widget.ActionBarContextView.b(r1, r0)
            return
    }

    @Override // defpackage.ya0
    public final void b(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.a = r1
            return
    }

    @Override // defpackage.ya0
    public final void c() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.c
            androidx.appcompat.widget.ActionBarContextView.a(r0)
            r0 = 0
            r1.a = r0
            return
    }
}
