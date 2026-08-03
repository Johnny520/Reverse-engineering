package wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p136j8.C2104o;
import p352xf.EnumC5799a;
import p370yf.InterfaceC6039d;

/* JADX INFO: renamed from: wf.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5563i implements InterfaceC5557c, InterfaceC6039d {

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f22662h = AtomicReferenceFieldUpdater.newUpdater(C5563i.class, Object.class, "result");

    /* JADX INFO: renamed from: g */
    public final InterfaceC5557c f22663g;
    private volatile Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5563i(InterfaceC5557c interfaceC5557c) {
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        this.f22663g = interfaceC5557c;
        this.result = enumC5799a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.f22663g;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f22663g.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC5799a enumC5799a = EnumC5799a.f23548h;
            if (obj2 == enumC5799a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22662h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC5799a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC5799a) {
                        break;
                    }
                }
                return;
            }
            EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
            if (obj2 != enumC5799a2) {
                C2104o.m5276A("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22662h;
            EnumC5799a enumC5799a3 = EnumC5799a.f23549i;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC5799a2, enumC5799a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC5799a2) {
                    break;
                }
            }
            this.f22663g.resumeWith(obj);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SafeContinuation for " + this.f22663g;
    }
}
