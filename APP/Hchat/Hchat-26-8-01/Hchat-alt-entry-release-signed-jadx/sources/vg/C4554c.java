package vg;

import p249qg.InterfaceC3599t;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4554c implements InterfaceC3599t {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5561g f15022g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4554c(InterfaceC5561g interfaceC5561g) {
        this.f15022g = interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3599t
    /* JADX INFO: renamed from: n */
    public final InterfaceC5561g mo4457n() {
        return this.f15022g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f15022g + ')';
    }
}
