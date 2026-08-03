package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517M0 extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0802Sm f1683a;

    /* JADX INFO: renamed from: b */
    public final boolean f1684b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2389pw f1685c;

    public C0517M0(InterfaceC0802Sm r1, C2236mg r2, ReferenceQueue r3) {
        super(r2, r3);
        AbstractC0714Qj.m1488j("Argument must not be null", r1);
        this.f1683a = r1;
        boolean r12 = r2.f7877a;
        this.f1685c = null;
        this.f1684b = r12;
    }
}
