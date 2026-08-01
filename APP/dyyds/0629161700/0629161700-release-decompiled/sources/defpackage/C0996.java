package defpackage;

/* JADX INFO: renamed from: ᛵᲈᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0996 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2361 f4438;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1264 f4439;

    public C0996(defpackage.C2361 r1, defpackage.C1264 r2) {
            r0 = this;
            r0.<init>()
            r0.f4438 = r1
            r0.f4439 = r2
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r5 = this;
            ᲈᲈ r0 = r5.f4438
            ᛷᛴᲇᛳ r1 = r5.f4439
            r2 = 1
            r3 = 0
            boolean r4 = r1.m2367(r2, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r4 == 0) goto L20
        Lc:
            r4 = 0
            boolean r4 = r1.m2367(r4, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r4 != 0) goto Lc
            r5 = 9
            r0.m3861(r2, r5, r3)
        L18:
            defpackage.AbstractC0709.m1611(r1)
            goto L35
        L1c:
            r5 = move-exception
            goto L28
        L1e:
            r5 = move-exception
            goto L30
        L20:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            java.lang.String r2 = "Required SETTINGS preface not received"
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
        L28:
            r2 = 3
            r0.m3861(r2, r2, r3)
            defpackage.AbstractC0709.m1611(r1)
            throw r5
        L30:
            r2 = 2
            r0.m3861(r2, r2, r5)
            goto L18
        L35:
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270
            return r5
    }
}
