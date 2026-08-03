package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements x3.b {
    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // x3.b
    public final java.util.List a() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // x3.b
    public final java.lang.Object b(android.content.Context r4) {
            r3 = this;
            l3.s r0 = new l3.s
            l3.l r1 = new l3.l
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 1
            r0.f7821b = r1
            l3.i r1 = l3.i.f7792k
            if (r1 != 0) goto L26
            java.lang.Object r1 = l3.i.f7791j
            monitor-enter(r1)
            l3.i r2 = l3.i.f7792k     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            l3.i r2 = new l3.i     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            l3.i.f7792k = r2     // Catch: java.lang.Throwable -> L20
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
            x3.a r4 = x3.a.c(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = x3.a.f21177e
            monitor-enter(r1)
            java.util.HashMap r2 = r4.f21178a     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L46
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r4.b(r0, r2)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r4 = move-exception
            goto L58
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            androidx.lifecycle.q r2 = (androidx.lifecycle.q) r2
            androidx.lifecycle.s r4 = r2.f()
            l3.j r0 = new l3.j
            r0.<init>(r3, r4)
            r4.a(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r4
    }
}
