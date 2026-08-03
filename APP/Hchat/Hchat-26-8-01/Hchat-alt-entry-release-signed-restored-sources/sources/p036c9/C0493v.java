package p036c9;

import java.util.concurrent.atomic.AtomicBoolean;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: c9.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0493v implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1495g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicBoolean f1496h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0493v(AtomicBoolean atomicBoolean, int i9) {
        this.f1495g = i9;
        this.f1496h = atomicBoolean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f1495g) {
            case 0:
                this.f1496h.set(true);
                break;
            default:
                this.f1496h.set(true);
                break;
        }
        return C3967n.f12976a;
    }
}
