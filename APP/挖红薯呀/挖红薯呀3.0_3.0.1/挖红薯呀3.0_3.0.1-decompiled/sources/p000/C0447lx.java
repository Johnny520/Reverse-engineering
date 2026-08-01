package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: lx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0447lx implements p01 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0298hw f3612a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0742sw f3613b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0447lx(InterfaceC0298hw interfaceC0298hw, InterfaceC0742sw interfaceC0742sw) {
        this.f3612a = interfaceC0298hw;
        this.f3613b = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.p01
    public final Iterator iterator() {
        return new C0410kx(this);
    }
}
