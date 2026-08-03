package Yue;

import Yue.C7148;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4416<T> extends AbstractC4419<T> implements InterfaceC4246, InterfaceC4199<T> {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9142 = AtomicReferenceFieldUpdater.newUpdater(C4416.class, Object.class, "_reusableCancellableContinuation");

    @InterfaceC6399
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final AbstractC4232 f9143;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4199<T> f9144;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public Object f9145;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final Object f9146;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4416(@InterfaceC6399 AbstractC4232 abstractC4232, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        super(-1);
        this.f9143 = abstractC4232;
        this.f9144 = interfaceC4199;
        this.f9145 = C4417.f879;
        this.f9146 = C7776.m3875(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12824() {
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<T> interfaceC4199 = this.f9144;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return this.f9144.getContext();
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۦۣۨ.ۥ۟۟۟(java.lang.Object, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):java.lang.Object */
    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        InterfaceC4225 context = this.f9144.getContext();
        Object objM11487 = C4056.m11487(obj, null, 1, null);
        if (this.f9143.isDispatchNeeded(context)) {
            this.f9145 = objM11487;
            this.f9148 = 0;
            this.f9143.dispatch(context, this);
            return;
        }
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (abstractC4714M3877.m14085()) {
            this.f9145 = objM11487;
            this.f9148 = 0;
            abstractC4714M3877.m14081(this);
            return;
        }
        abstractC4714M3877.m14083(true);
        try {
            InterfaceC4225 context2 = getContext();
            Object objM24718 = C7776.m24718(context2, this.f9146);
            try {
                this.f9144.resumeWith(obj);
                C8107 c8107 = C8107.f3222;
                while (abstractC4714M3877.m14088()) {
                }
            } finally {
                C7776.m3874(context2, objM24718);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @InterfaceC6399
    public String toString() {
        return "DispatchedContinuation[" + this.f9143 + ", " + C4325.m12514(this.f9144) + ']';
    }

    @Override // Yue.AbstractC4419
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo733(@InterfaceC6489 Object obj, @InterfaceC6399 Throwable th) {
        if (obj instanceof C4051) {
            ((C4051) obj).f639.invoke(th);
        }
    }

    @Override // Yue.AbstractC4419
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC4199<T> mo10025() {
        return this;
    }

    @Override // Yue.AbstractC4419
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public Object mo10028() {
        Object obj = this.f9145;
        this.f9145 = C4417.f879;
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m12825() {
        while (this._reusableCancellableContinuation == C4417.f880) {
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C3666<T> m12826() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C4417.f880;
                return null;
            }
            if (obj instanceof C3666) {
                if (C3008.m74(f9142, this, obj, C4417.f880)) {
                    return (C3666) obj;
                }
            } else if (obj != C4417.f880 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m12827(@InterfaceC6399 InterfaceC4225 interfaceC4225, T t) {
        this.f9145 = t;
        this.f9148 = 1;
        this.f9143.dispatchYield(interfaceC4225, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C3666<?> m12828() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C3666) {
            return (C3666) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m12829() {
        return this._reusableCancellableContinuation != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m12830(@InterfaceC6399 Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C7694 c7694 = C4417.f880;
            if (C5499.m17094(obj, c7694)) {
                if (C3008.m74(f9142, this, c7694, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C3008.m74(f9142, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m12831() {
        m12825();
        C3666<?> c3666M12828 = m12828();
        if (c3666M12828 != null) {
            c3666M12828.m10035();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[Catch: all -> 0x0062, DONT_GENERATE, TryCatch #1 {all -> 0x0062, blocks: (B:9:0x0039, B:11:0x0047, B:13:0x004d, B:28:0x0092, B:16:0x0064, B:18:0x0074, B:22:0x0081, B:24:0x0086, B:27:0x008f, B:26:0x008c, B:33:0x00a3, B:35:0x00a8, B:38:0x00b1, B:39:0x00b4, B:37:0x00ae, B:21:0x007a), top: B:48:0x0039, inners: #0 }] */
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12832(@InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        InterfaceC5542 interfaceC5542;
        Object objM11486 = C4056.m11486(obj, interfaceC5124);
        if (this.f9143.isDispatchNeeded(getContext())) {
            this.f9145 = objM11486;
            this.f9148 = 1;
            this.f9143.dispatch(getContext(), this);
            return;
        }
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (abstractC4714M3877.m14085()) {
            this.f9145 = objM11486;
            this.f9148 = 1;
            abstractC4714M3877.m14081(this);
            return;
        }
        abstractC4714M3877.m14083(true);
        try {
            interfaceC5542 = (InterfaceC5542) getContext().get(InterfaceC5542.f13507);
        } catch (Throwable th) {
            try {
                m12845(th, null);
                C5437.m16930(1);
            } catch (Throwable th2) {
                C5437.m16930(1);
                abstractC4714M3877.m14079(true);
                C5437.m16929(1);
                throw th2;
            }
        }
        if (interfaceC5542 == null || interfaceC5542.mo5773()) {
            InterfaceC4199<T> interfaceC4199 = this.f9144;
            Object obj2 = this.f9146;
            InterfaceC4225 context = interfaceC4199.getContext();
            Object objM24718 = C7776.m24718(context, obj2);
            C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC4199, context, objM24718) : null;
            try {
                this.f9144.resumeWith(obj);
                C8107 c8107 = C8107.f3222;
                abstractC4714M3877.m14079(true);
                C5437.m16929(1);
            } finally {
                C5437.m16930(1);
                if (c8102M12167 == null || c8102M12167.m26701()) {
                    C7776.m3874(context, objM24718);
                }
                C5437.m16929(1);
            }
        }
        CancellationException cancellationExceptionMo17161 = interfaceC5542.mo17161();
        mo733(objM11486, cancellationExceptionMo17161);
        C7148.C1189 c1189 = C7148.f21560;
        resumeWith(C7148.m3438(C7149.m3441(cancellationExceptionMo17161)));
        while (abstractC4714M3877.m14088()) {
        }
        C5437.m16930(1);
        abstractC4714M3877.m14079(true);
        C5437.m16929(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m12833(@InterfaceC6489 Object obj) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) getContext().get(InterfaceC5542.f13507);
        if (interfaceC5542 == null || interfaceC5542.mo5773()) {
            return false;
        }
        CancellationException cancellationExceptionMo17161 = interfaceC5542.mo17161();
        mo733(obj, cancellationExceptionMo17161);
        C7148.C1189 c1189 = C7148.f21560;
        resumeWith(C7148.m3438(C7149.m3441(cancellationExceptionMo17161)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12834(@InterfaceC6399 Object obj) {
        InterfaceC4199<T> interfaceC4199 = this.f9144;
        Object obj2 = this.f9146;
        InterfaceC4225 context = interfaceC4199.getContext();
        Object objM24718 = C7776.m24718(context, obj2);
        C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC4199, context, objM24718) : null;
        try {
            this.f9144.resumeWith(obj);
            C8107 c8107 = C8107.f3222;
        } finally {
            C5437.m16930(1);
            if (c8102M12167 == null || c8102M12167.m26701()) {
                C7776.m3874(context, objM24718);
            }
            C5437.m16929(1);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Throwable m12835(@InterfaceC6399 InterfaceC3665<?> interfaceC3665) {
        C7694 c7694;
        do {
            Object obj = this._reusableCancellableContinuation;
            c7694 = C4417.f880;
            if (obj != c7694) {
                if (obj instanceof Throwable) {
                    if (C3008.m74(f9142, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C3008.m74(f9142, this, c7694, interfaceC3665));
        return null;
    }
}
