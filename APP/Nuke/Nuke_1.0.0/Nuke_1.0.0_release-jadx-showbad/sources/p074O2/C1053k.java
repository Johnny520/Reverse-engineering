package p074O2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p079P2.EnumC1152a;
import p084Q2.InterfaceC1179d;

/* JADX INFO: renamed from: O2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1053k implements InterfaceC1046d, InterfaceC1179d {

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f3287e = AtomicReferenceFieldUpdater.newUpdater(C1053k.class, Object.class, "result");

    /* JADX INFO: renamed from: d */
    public final InterfaceC1046d f3288d;
    private volatile Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1053k(InterfaceC1046d interfaceC1046d) {
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        this.f3288d = interfaceC1046d;
        this.result = enumC1152a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f3288d;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f3288d.mo275e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1152a enumC1152a = EnumC1152a.f3789e;
            if (obj2 == enumC1152a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3287e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1152a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC1152a) {
                        break;
                    }
                }
                return;
            }
            EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
            if (obj2 != enumC1152a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3287e;
            EnumC1152a enumC1152a3 = EnumC1152a.f3790f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC1152a2, enumC1152a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC1152a2) {
                    break;
                }
            }
            this.f3288d.mo278i(obj);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SafeContinuation for " + this.f3288d;
    }
}
