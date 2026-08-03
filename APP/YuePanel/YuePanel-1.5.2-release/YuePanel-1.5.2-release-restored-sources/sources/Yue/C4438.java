package Yue;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4438<T, K> extends AbstractC2985<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Iterator<T> f9173;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<T, K> f9174;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final HashSet<K> f9175;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4438(@InterfaceC6399 Iterator<? extends T> it, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(it, "source");
        C5499.m17103(interfaceC5124, "keySelector");
        this.f9173 = it;
        this.f9174 = interfaceC5124;
        this.f9175 = new HashSet<>();
    }

    @Override // Yue.AbstractC2985
    /* JADX INFO: renamed from: ۥ */
    public void mo49() {
        while (this.f9173.hasNext()) {
            T next = this.f9173.next();
            if (this.f9175.add(this.f9174.invoke(next))) {
                m5789(next);
                return;
            }
        }
        m50();
    }
}
