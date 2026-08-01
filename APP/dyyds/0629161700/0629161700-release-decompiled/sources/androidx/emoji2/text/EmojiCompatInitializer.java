package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements defpackage.InterfaceC0485 {


    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List mo102() {
            r0 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object mo103(android.content.Context r4) {
            r3 = this;
            ᛶᲁᲇᛸ r0 = new ᛶᲁᲇᛸ
            ᛷᲁᛷᛶ r1 = new ᛷᲁᛷᛶ
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 1
            r0.f9096 = r1
            ᛴᲁᛶᲈ r1 = defpackage.C0766.f3561
            if (r1 != 0) goto L26
            java.lang.Object r1 = defpackage.C0766.f3560
            monitor-enter(r1)
            ᛴᲁᛶᲈ r2 = defpackage.C0766.f3561     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            ᛴᲁᛶᲈ r2 = new ᛴᲁᛶᲈ     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            defpackage.C0766.f3561 = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L24
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r3
        L26:
            ᛷᛸᛱᛸ r4 = defpackage.C1326.m2464(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = defpackage.C1326.f5852
            monitor-enter(r1)
            java.lang.Object r2 = r4.f5856     // Catch: java.lang.Throwable -> L46
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L48
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r4.m2483(r0, r2)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r3 = move-exception
            goto L5a
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            ᛴᲁᲁᛶ r2 = (defpackage.InterfaceC0770) r2
            androidx.lifecycle.ᛷᲁᛳᛳ r4 = r2.mo0()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r3, r4)
            r4.m110(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r3
    }
}
