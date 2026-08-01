package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements defpackage.ap {


    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.ap
    public final java.util.List a() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // defpackage.ap
    public final java.lang.Object b(android.content.Context r4) {
            r3 = this;
            wk r0 = new wk
            l0 r1 = new l0
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 1
            r0.a = r1
            ei r1 = defpackage.ei.j
            if (r1 != 0) goto L26
            java.lang.Object r1 = defpackage.ei.i
            monitor-enter(r1)
            ei r2 = defpackage.ei.j     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            ei r2 = new ei     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            defpackage.ei.j = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L24
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r4
        L26:
            r5 r4 = defpackage.r5.q(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = defpackage.r5.f
            monitor-enter(r1)
            java.lang.Object r2 = r4.b     // Catch: java.lang.Throwable -> L46
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L48
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r4.f(r0, r2)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r4 = move-exception
            goto L5a
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            oq r2 = (defpackage.oq) r2
            androidx.lifecycle.a r4 = r2.e()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r3, r4)
            r4.a(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r4
    }
}
