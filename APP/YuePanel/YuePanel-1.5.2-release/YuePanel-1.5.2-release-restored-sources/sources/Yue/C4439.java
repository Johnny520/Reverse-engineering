package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4439<T, K> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f895;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, K> f896;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4439(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "source");
        C5499.m17103(interfaceC5124, "keySelector");
        this.f895 = interfaceC7326;
        this.f896 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C4438(this.f895.iterator(), this.f896);
    }
}
