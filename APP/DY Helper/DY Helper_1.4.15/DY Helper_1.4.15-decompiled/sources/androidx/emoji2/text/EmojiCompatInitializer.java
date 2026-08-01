package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p000.xl0 {
    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: α */
    public final java.util.List mo461() {
            r0 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo462(android.content.Context r4) {
            r3 = this;
            p50 r0 = new p50
            ｍ r1 = new ｍ
            r1.<init>()
            android.content.Context r2 = r4.getApplicationContext()
            r1.f13489 = r2
            r0.<init>(r1)
            r1 = 1
            r0.f8425 = r1
            jy r1 = p000.C0449jy.f5649
            if (r1 != 0) goto L2c
            java.lang.Object r1 = p000.C0449jy.f5648
            monitor-enter(r1)
            jy r2 = p000.C0449jy.f5649     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L28
            jy r2 = new jy     // Catch: java.lang.Throwable -> L26
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L26
            p000.C0449jy.f5649 = r2     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r3 = move-exception
            goto L2a
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r3
        L2c:
            m6 r4 = p000.C0538m6.m3751(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = p000.C0538m6.f6964
            monitor-enter(r1)
            java.lang.Object r2 = r4.f6967     // Catch: java.lang.Throwable -> L4c
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L4e
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r4.m3784(r0, r2)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r3 = move-exception
            goto L60
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            hr0 r2 = (p000.hr0) r2
            jr0 r4 = r2.mo192()
            ky r0 = new ky
            r0.<init>(r3, r4)
            r4.m2980(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r3
    }
}
