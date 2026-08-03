package p036c9;

import java.util.concurrent.atomic.AtomicBoolean;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: c9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0442h implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1298g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicBoolean f1299h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AtomicBoolean f1300i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0442h(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i9) {
        this.f1298g = i9;
        this.f1299h = atomicBoolean;
        this.f1300i = atomicBoolean2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f1298g) {
            case 0:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
            case 1:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
            case 2:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
            case 3:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
            case 4:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
            default:
                if (!this.f1299h.get()) {
                    this.f1300i.set(true);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
