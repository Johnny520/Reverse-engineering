package defpackage;

/* JADX INFO: renamed from: ᛲᲈᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389 implements defpackage.InterfaceC0277, java.io.Serializable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f2021;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile java.lang.Object f2022;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.InterfaceC1781 f2023;

    public C0389(defpackage.InterfaceC1781 r1) {
            r0 = this;
            r0.<init>()
            r0.f2023 = r1
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            r0.f2022 = r1
            r0.f2021 = r0
            return
    }

    @Override // defpackage.InterfaceC0277
    public final java.lang.Object getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f2022
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f2021
            monitor-enter(r0)
            java.lang.Object r2 = r3.f2022     // Catch: java.lang.Throwable -> L1c
            if (r2 == r1) goto Lf
            goto L1a
        Lf:
            ᲀᲈᛵᲇ r1 = r3.f2023     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r1.mo1032()     // Catch: java.lang.Throwable -> L1c
            r3.f2022 = r2     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r3.f2023 = r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f2022
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
