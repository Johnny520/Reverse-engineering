package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: jm */
/* JADX INFO: loaded from: classes.dex */
public final class C2108jm implements InterfaceC1418fl {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7408b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7409c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7410d = null;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final C0851Ts f7411a;

    static {
        f7408b = AtomicIntegerFieldUpdater.newUpdater(C2108jm.class, "_isCompleting$volatile");
        f7409c = AtomicReferenceFieldUpdater.newUpdater(C2108jm.class, Object.class, "_rootCause$volatile");
        f7410d = AtomicReferenceFieldUpdater.newUpdater(C2108jm.class, Object.class, "_exceptionsHolder$volatile");
    }

    public C2108jm(C0851Ts r1, Throwable r2) {
        this.f7411a = r1;
        this._isCompleting$volatile = 0;
        this._rootCause$volatile = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4294a(Throwable r5) {
        Throwable r0 = m4295b();
        if (r0 != null) goto L6;
        f7409c.set(this, r5);
        return;
    L6:
        if (r5 == r0) goto L24;
        AtomicReferenceFieldUpdater r02 = f7410d;
        Object r1 = r02.get(this);
        if (r1 != null) goto L13;
        r02.set(this, r5);
        return;
    L13:
        if ((r1 instanceof Throwable) == false) goto L19;
        if (r5 != r1) goto L16;
        return;
    L16:
        ArrayList r2 = new ArrayList(4);
        r2.add(r1);
        r2.add(r5);
        r02.set(this, r2);
        return;
    L19:
        if ((r1 instanceof ArrayList) == false) goto L23;
        ((ArrayList) r1).add(r5);
        return;
    L23:
        throw new IllegalStateException(("State is " + r1).toString());
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m4295b() {
        return (Throwable) f7409c.get(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4296c() {
        if (m4295b() == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: d */
    public final boolean mo564d() {
        if (m4295b() != null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: e */
    public final C0851Ts mo565e() {
        return this.f7411a;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m4297f(Throwable r5) {
        AtomicReferenceFieldUpdater r0 = f7410d;
        Object r1 = r0.get(this);
        if (r1 != null) goto L6;
        ArrayList r12 = new ArrayList(4);
    L11:
        Throwable r2 = m4295b();
        if (r2 == null) goto L14;
        r12.add(0, r2);
    L14:
        if (r5 != null) goto L16;
    L18:
        r0.set(this, AbstractC0295Gu.f1001f);
        return r12;
    L16:
        if (r5.equals(r2) == true) goto L18;
        r12.add(r5);
        goto L18
    L6:
        if ((r1 instanceof Throwable) == false) goto L9;
        ArrayList r3 = new ArrayList(4);
        r3.add(r1);
        r12 = r3;
        goto L11
    L9:
        if ((r1 instanceof ArrayList) == false) goto L21;
        r12 = (ArrayList) r1;
        goto L11
    L21:
        throw new IllegalStateException(("State is " + r1).toString());
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Finishing[cancelling=");
        r0.append(m4296c());
        r0.append(", completing=");
        boolean r2 = true;
        if (f7408b.get(this) == 1) goto L6;
        r2 = false;
    L6:
        r0.append(r2);
        r0.append(", rootCause=");
        r0.append(m4295b());
        r0.append(", exceptions=");
        r0.append(f7410d.get(this));
        r0.append(", list=");
        r0.append(this.f7411a);
        r0.append(']');
        return r0.toString();
    }
}
