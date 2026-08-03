package p345x8;

import bsh.org.objectweb.asm.Opcodes;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: x8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5711d implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23221g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicBoolean f23222h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AtomicReference f23223i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AtomicReference f23224j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CountDownLatch f23225k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AtomicReference f23226l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AtomicReference f23227m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5711d(AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch, AtomicReference atomicReference3, AtomicReference atomicReference4, int i9) {
        this.f23221g = i9;
        this.f23222h = atomicBoolean;
        this.f23223i = atomicReference;
        this.f23224j = atomicReference2;
        this.f23225k = countDownLatch;
        this.f23226l = atomicReference3;
        this.f23227m = atomicReference4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f23221g) {
            case 0:
                AtomicBoolean atomicBoolean = this.f23222h;
                if (!atomicBoolean.get()) {
                    C5724q.m10334F(atomicBoolean, this.f23223i, this.f23224j, this.f23225k, this.f23226l, this.f23227m, 128);
                }
                break;
            default:
                C5724q.m10334F(this.f23222h, this.f23223i, this.f23224j, this.f23225k, this.f23226l, this.f23227m, Opcodes.CHECKCAST);
                break;
        }
        return C3967n.f12976a;
    }
}
