package yyds;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛸᛱᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1698 implements InterfaceC1617, InterfaceC1927 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1853 f8631;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2255 f8632;

    public C1698(C2255 c2255, C1853 c1853) {
        this.f8632 = c2255;
        this.f8631 = c1853;
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo812(Object obj) {
        this.f8631.mo812(obj);
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return this.f8631.f9326;
    }

    @Override // yyds.InterfaceC1927
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo3447(C1056 c1056, int i) {
        this.f8631.mo3447(c1056, i);
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo3311(C1911 c1911) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2255.f11104;
        C2255 c2255 = this.f8632;
        atomicReferenceFieldUpdater.set(c2255, null);
        C2713 c2713 = new C2713(c2255, this);
        C1853 c1853 = this.f8631;
        c1853.m3631(C2746.f13459, c1853.f10086, new C1911(0, c2713));
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final C0415 mo3312(C1911 c1911) {
        C2255 c2255 = this.f8632;
        C0415 c0415M3630 = this.f8631.m3630(C2746.f13459, new C1911(c2255, this));
        if (c0415M3630 != null) {
            C2255.f11104.set(c2255, null);
        }
        return c0415M3630;
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo3313(Object obj) {
        this.f8631.mo3313(obj);
    }
}
