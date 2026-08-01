package p130ic;

import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.InterfaceC6536e;

/* JADX INFO: renamed from: ic.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3405w implements InterfaceC5976f, InterfaceC6536e {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5976f f9391q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f9392r;

    public C3405w(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j) {
        this.f9391q = interfaceC5976f;
        this.f9392r = interfaceC5980j;
    }

    @Override // p257r8.InterfaceC6536e
    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f9391q;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return this.f9392r;
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) {
        this.f9391q.resumeWith(obj);
    }
}
