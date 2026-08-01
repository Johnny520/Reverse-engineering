package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j70 extends defpackage.ct {
    public final /* synthetic */ int d;
    public boolean e;
    public int f;
    public final /* synthetic */ java.lang.Object g;

    public j70(defpackage.k70 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.d = r0
            r1.<init>()
            r1.g = r2
            r1.f = r3
            r2 = 0
            r1.e = r2
            return
    }

    public j70(defpackage.xa0 r2) {
            r1 = this;
            r0 = 1
            r1.d = r0
            r1.<init>()
            r1.g = r2
            r2 = 0
            r1.e = r2
            r1.f = r2
            return
    }

    @Override // defpackage.ya0
    public final void a() {
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L26;
                default: goto L5;
            }
        L5:
            int r0 = r3.f
            int r0 = r0 + 1
            r3.f = r0
            java.lang.Object r1 = r3.g
            xa0 r1 = (defpackage.xa0) r1
            java.util.ArrayList r2 = r1.a
            int r2 = r2.size()
            if (r0 != r2) goto L25
            ya0 r0 = r1.d
            if (r0 == 0) goto L1e
            r0.a()
        L1e:
            r0 = 0
            r3.f = r0
            r3.e = r0
            r1.e = r0
        L25:
            return
        L26:
            boolean r0 = r3.e
            if (r0 != 0) goto L35
            java.lang.Object r0 = r3.g
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            int r1 = r3.f
            r0.setVisibility(r1)
        L35:
            return
    }

    @Override // defpackage.ct, defpackage.ya0
    public void b(android.view.View r1) {
            r0 = this;
            int r1 = r0.d
            switch(r1) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r1 = 1
            r0.e = r1
            return
    }

    @Override // defpackage.ct, defpackage.ya0
    public final void c() {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r2.e
            if (r0 == 0) goto La
            goto L18
        La:
            r0 = 1
            r2.e = r0
            java.lang.Object r0 = r2.g
            xa0 r0 = (defpackage.xa0) r0
            ya0 r0 = r0.d
            if (r0 == 0) goto L18
            r0.c()
        L18:
            return
        L19:
            java.lang.Object r0 = r2.g
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            r1 = 0
            r0.setVisibility(r1)
            return
    }
}
