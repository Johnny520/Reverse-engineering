package defpackage;

/* JADX INFO: renamed from: ᲁᲀᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1913 implements defpackage.InterfaceC1286 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8327;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8328;

    public /* synthetic */ C1913(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8328 = r1
            r0.f8327 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C1913(defpackage.C1225 r1, defpackage.C1535 r2) {
            r0 = this;
            r2 = 1
            r0.f8328 = r2
            r0.<init>()
            r0.f8327 = r1
            return
    }

    @Override // defpackage.InterfaceC1286
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.Object mo591(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r0 = r2.f8328
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r2 = r2.f8327
            switch(r0) {
                case 0: goto L27;
                case 1: goto L15;
                default: goto L9;
            }
        L9:
            ᲇᛷᲈᛴ r2 = (defpackage.C2099) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            ᲁᲀᛱᲁ r4 = (defpackage.C1907) r4
            ᛳᛵᲈᛵ r5 = (defpackage.InterfaceC0493) r5
            r2.m3521()
            return r1
        L15:
            ᛷᛲᛳᲈ r2 = (defpackage.C1225) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            ᲁᲀᛱᲁ r4 = (defpackage.C1907) r4
            ᛳᛵᲈᛵ r5 = (defpackage.InterfaceC0493) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C1225.f5516
            r4 = 0
            r3.set(r2, r4)
            r2.mo1166(r4)
            return r1
        L27:
            ᲈᲈᛸᲁ r2 = (defpackage.C2370) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            ᛳᛵᲈᛵ r5 = (defpackage.InterfaceC0493) r5
            r2.mo617(r3)
            return r1
    }
}
