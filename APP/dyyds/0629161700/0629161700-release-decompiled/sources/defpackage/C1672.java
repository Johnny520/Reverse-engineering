package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1672 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7456;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2361 f7457;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7458;

    public /* synthetic */ C1672(defpackage.C2361 r1, int r2, int r3) {
            r0 = this;
            r3 = 1
            r0.f7458 = r3
            r0.<init>()
            r0.f7457 = r1
            r0.f7456 = r2
            return
    }

    public /* synthetic */ C1672(defpackage.C2361 r1, int r2, java.util.List r3) {
            r0 = this;
            r3 = 0
            r0.f7458 = r3
            r0.<init>()
            r0.f7457 = r1
            r0.f7456 = r2
            return
    }

    public /* synthetic */ C1672(defpackage.C2361 r1, int r2, java.util.List r3, boolean r4) {
            r0 = this;
            r3 = 2
            r0.f7458 = r3
            r0.<init>()
            r0.f7457 = r1
            r0.f7456 = r2
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r3 = this;
            int r0 = r3.f7458
            r1 = 9
            switch(r0) {
                case 0: goto L41;
                case 1: goto L27;
                default: goto L7;
            }
        L7:
            ᲈᲈ r0 = r3.f7457
            int r3 = r3.f7456
            ᛷᲈᲀ r2 = r0.f10215
            r2.getClass()
            ᛴᲈᛲᲀ r2 = r0.f10229     // Catch: java.io.IOException -> L24
            r2.m1718(r3, r1)     // Catch: java.io.IOException -> L24
            monitor-enter(r0)     // Catch: java.io.IOException -> L24
            java.util.LinkedHashSet r1 = r0.f10223     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r1.remove(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            throw r3     // Catch: java.io.IOException -> L24
        L24:
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            return r3
        L27:
            ᲈᲈ r0 = r3.f7457
            int r3 = r3.f7456
            ᛷᲈᲀ r1 = r0.f10215
            r1.getClass()
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r0.f10223     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3e
            r1.remove(r3)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L41:
            ᲈᲈ r0 = r3.f7457
            int r3 = r3.f7456
            ᛷᲈᲀ r2 = r0.f10215
            r2.getClass()
            ᛴᲈᛲᲀ r2 = r0.f10229     // Catch: java.io.IOException -> L5e
            r2.m1718(r3, r1)     // Catch: java.io.IOException -> L5e
            monitor-enter(r0)     // Catch: java.io.IOException -> L5e
            java.util.LinkedHashSet r1 = r0.f10223     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
            r1.remove(r3)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.io.IOException -> L5e
            goto L5e
        L5b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L5e
            throw r3     // Catch: java.io.IOException -> L5e
        L5e:
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            return r3
    }
}
