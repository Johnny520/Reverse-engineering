package defpackage;

/* JADX INFO: renamed from: ᛸᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1535 implements defpackage.InterfaceC1046, defpackage.InterfaceC1434 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1225 f6756;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2260 f6757;

    public C1535(defpackage.C1225 r1, defpackage.C2260 r2) {
            r0 = this;
            r0.<init>()
            r0.f6756 = r1
            r0.f6757 = r2
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r1) {
            r0 = this;
            ᲈᛶᛳᛷ r0 = r0.f6757
            r0.mo662(r1)
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo2003(java.lang.Object r1) {
            r0 = this;
            ᲈᛶᛳᛷ r0 = r0.f6757
            r0.mo2003(r1)
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᲈᛶᛳᛷ r0 = r0.f6757
            ᛳᛵᲈᛵ r0 = r0.f9598
            return r0
    }

    @Override // defpackage.InterfaceC1434
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo2642(defpackage.C2053 r1, int r2) {
            r0 = this;
            ᲈᛶᛳᛷ r0 = r0.f6757
            r0.mo2642(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo2004(defpackage.C1913 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.C1225.f5516
            r0 = 0
            ᛷᛲᛳᲈ r1 = r3.f6756
            r4.set(r1, r0)
            ᲈᲈᛸᲁ r4 = new ᲈᲈᛸᲁ
            r4.<init>(r1, r3)
            ᲈᛶᛳᛷ r3 = r3.f6757
            int r0 = r3.f3535
            ᲁᲀᛷᛴ r1 = new ᲁᲀᛷᛴ
            r2 = 0
            r1.<init>(r2, r4)
            ᲁᲀᛱᲁ r4 = defpackage.C1907.f8270
            r3.m3661(r4, r0, r1)
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.C0454 mo2005(defpackage.C1913 r3) {
            r2 = this;
            ᲁᲀᛷᛴ r3 = new ᲁᲀᛷᛴ
            ᛷᛲᛳᲈ r0 = r2.f6756
            r3.<init>(r0, r2)
            ᲈᛶᛳᛷ r2 = r2.f6757
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛳᛴᛵᛱ r2 = r2.m3668(r1, r3)
            if (r2 == 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C1225.f5516
            r1 = 0
            r3.set(r0, r1)
        L17:
            return r2
    }
}
