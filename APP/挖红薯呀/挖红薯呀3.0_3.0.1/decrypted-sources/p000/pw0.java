package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 implements InterfaceC0322ik, InterfaceC0022al {

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f4976e = AtomicReferenceFieldUpdater.newUpdater(pw0.class, Object.class, "result");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f4977f = uw0.f6315a.objectFieldOffset(pw0.class.getDeclaredField("result"));

    /* JADX INFO: renamed from: d */
    public final InterfaceC0322ik f4978d;
    private volatile Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pw0(InterfaceC0322ik interfaceC0322ik) {
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        this.f4978d = interfaceC0322ik;
        this.result = enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f4978d;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f4978d.mo540e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        pw0 pw0Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            EnumC1007zk enumC1007zk = EnumC1007zk.f7917e;
            if (obj3 == enumC1007zk) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4976e;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = uw0.f6315a;
                    long j2 = f4977f;
                    pw0Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(pw0Var, j2, enumC1007zk, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(pw0Var, j2) != enumC1007zk) {
                        break;
                    }
                    this = pw0Var;
                    obj = obj2;
                }
            } else {
                pw0Var = this;
                obj2 = obj;
                EnumC1007zk enumC1007zk2 = EnumC1007zk.f7916d;
                if (obj3 != enumC1007zk2) {
                    C0921xc.m5134o("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4976e;
                EnumC1007zk enumC1007zk3 = EnumC1007zk.f7918f;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = uw0.f6315a;
                    j = f4977f;
                    if (unsafe.compareAndSwapObject(pw0Var, j, enumC1007zk2, enumC1007zk3)) {
                        pw0Var.f4978d.mo541i(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(pw0Var, j) == enumC1007zk2);
            }
            this = pw0Var;
            obj = obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SafeContinuation for " + this.f4978d;
    }
}
