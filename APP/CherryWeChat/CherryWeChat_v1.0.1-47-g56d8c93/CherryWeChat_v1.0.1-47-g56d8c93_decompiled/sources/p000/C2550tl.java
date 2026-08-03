package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: tl */
/* JADX INFO: loaded from: classes.dex */
public final class C2550tl implements InterfaceC2670wc {

    /* JADX INFO: renamed from: a */
    public final C2812zp f8872a;

    public C2550tl(C2812zp c2812zp) {
        this.f8872a = c2812zp;
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: a */
    public final Class mo4771a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: b */
    public final InterfaceC2713xc mo4772b(Object obj) {
        return new C0132D2((InputStream) obj, this.f8872a);
    }
}
