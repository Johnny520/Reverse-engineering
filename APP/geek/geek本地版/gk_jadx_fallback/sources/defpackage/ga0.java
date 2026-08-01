package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements android.view.OnReceiveContentListener {
    public final defpackage.ax a;

    public ga0(defpackage.ax r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final android.view.ContentInfo onReceiveContent(android.view.View r3, android.view.ContentInfo r4) {
            r2 = this;
            cd r0 = new cd
            l0 r1 = new l0
            r1.<init>(r4)
            r0.<init>(r1)
            ax r1 = r2.a
            p60 r1 = (defpackage.p60) r1
            cd r3 = r1.a(r3, r0)
            if (r3 != 0) goto L16
            r3 = 0
            return r3
        L16:
            if (r3 != r0) goto L19
            return r4
        L19:
            bd r3 = r3.a
            android.view.ContentInfo r3 = r3.h()
            java.util.Objects.requireNonNull(r3)
            android.view.ContentInfo r3 = defpackage.p7.h(r3)
            return r3
    }
}
