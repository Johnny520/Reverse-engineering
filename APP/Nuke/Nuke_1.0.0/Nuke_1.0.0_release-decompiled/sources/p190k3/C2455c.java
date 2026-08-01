package p190k3;

import p074O2.InterfaceC1051i;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: k3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2455c implements InterfaceC2160t {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f7926d;

    public C2455c(InterfaceC1051i interfaceC1051i) {
        this.f7926d = interfaceC1051i;
    }

    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        return this.f7926d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f7926d + ')';
    }
}
