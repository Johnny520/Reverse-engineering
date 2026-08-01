package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements xhss.InterfaceC0546 {


    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0546
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object mo19(android.content.Context r4) {
            r3 = this;
            xhss.ᛸᛶᛱᲀ r0 = new xhss.ᛸᛶᛱᲀ
            xhss.ᲇᛵᛲᲁ r1 = new xhss.ᲇᛵᛲᲁ
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 1
            r0.f2553 = r1
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.f1869
            if (r1 != 0) goto L26
            java.lang.Object r1 = xhss.C0514.f1868
            monitor-enter(r1)
            xhss.ᛵᲁᛱᲁ r2 = xhss.C0514.f1869     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            xhss.ᛵᲁᛱᲁ r2 = new xhss.ᛵᲁᛱᲁ     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            xhss.C0514.f1869 = r2     // Catch: java.lang.Throwable -> L20
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
            xhss.ᛷᛱᛳᲁ r4 = xhss.C0623.m1087(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = xhss.C0623.f2148
            monitor-enter(r1)
            java.lang.Object r2 = r4.f2151     // Catch: java.lang.Throwable -> L46
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L48
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r4.m1097(r0, r2)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r3 = move-exception
            goto L5a
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            xhss.ᛴᛷᲀᲁ r2 = (xhss.InterfaceC0386) r2
            androidx.lifecycle.ᛷᛵᛵᲈ r4 = r2.mo63()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r3, r4)
            r4.m26(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r3
    }

    @Override // xhss.InterfaceC0546
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.List mo20() {
            r0 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }
}
