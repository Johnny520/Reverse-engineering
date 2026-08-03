package Yue;

import Yue.InterfaceC3592;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6501
public final class C4097<E> implements InterfaceC3592<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8180;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8181;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8182;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    @Deprecated
    public static final C7694 f8184;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @Deprecated
    public static final C4098<Object> f8185;

    @InterfaceC6399
    private volatile /* synthetic */ Object _state;

    @InterfaceC6399
    private volatile /* synthetic */ int _updating;

    @InterfaceC6399
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0323 f8179 = new C0323(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    @Deprecated
    public static final C0322 f8183 = new C0322(null);

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ */
    public static final class C0322 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        @InterfaceC6489
        public final Throwable f667;

        public C0322(@InterfaceC6489 Throwable th) {
            this.f667 = th;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Throwable m1057() {
            Throwable th = this.f667;
            return th == null ? new C3856(C3734.f497) : th;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Throwable m1058() {
            Throwable th = this.f667;
            return th == null ? new IllegalStateException(C3734.f497) : th;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟ */
    public static final class C0323 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۦۧۡ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0323(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0323() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4098<E> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        @InterfaceC6489
        public final Object f668;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        @InterfaceC6489
        public final C4099<E>[] f669;

        public C4098(@InterfaceC6489 Object obj, @InterfaceC6489 C4099<E>[] c4099Arr) {
            this.f668 = obj;
            this.f669 = c4099Arr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4099<E> extends C4101<E> implements InterfaceC7042<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        public final C4097<E> f8186;

        public C4099(@InterfaceC6399 C4097<E> c4097) {
            super(null);
            this.f8186 = c4097;
        }

        @Override // Yue.C4101, Yue.AbstractC3009
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
        public Object mo5865(E e) {
            return super.mo5865(e);
        }

        @Override // Yue.C4101, Yue.AbstractC2968
        /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
        public void mo5737(boolean z) {
            if (z) {
                this.f8186.m11596(this);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4100 implements InterfaceC7288<E, InterfaceC7317<? super E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C4097<E> f8187;

        public C4100(C4097<E> c4097) {
            this.f8187 = c4097;
        }

        @Override // Yue.InterfaceC7288
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public <R> void mo5880(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, E e, @InterfaceC6399 InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
            this.f8187.m11594(interfaceC7289, e, interfaceC5138);
        }
    }

    static {
        C7694 c7694 = new C7694("UNDEFINED");
        f8184 = c7694;
        f8185 = new C4098<>(c7694, null);
        f8180 = AtomicReferenceFieldUpdater.newUpdater(C4097.class, Object.class, "_state");
        f8181 = AtomicIntegerFieldUpdater.newUpdater(C4097.class, "_updating");
        f8182 = AtomicReferenceFieldUpdater.newUpdater(C4097.class, Object.class, "onCloseHandler");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4097() {
        this._state = f8185;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m11592() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    private final void m11593(Throwable th) {
        C7694 c7694;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c7694 = C2978.f4314) || !C3008.m74(f8182, this, obj, c7694)) {
            return;
        }
        ((InterfaceC5124) C8012.m25265(obj, 1)).invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final <R> void m11594(InterfaceC7289<? super R> interfaceC7289, E e, InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        if (interfaceC7289.mo22760()) {
            C0322 c0322M11599 = m11599(e);
            if (c0322M11599 != null) {
                interfaceC7289.mo22763(c0322M11599.m1057());
            } else {
                C8103.m26704(interfaceC5138, this, interfaceC7289.mo22762());
            }
        }
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return InterfaceC3592.C0187.m9587(this, e);
    }

    @Override // Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo6939(@InterfaceC6489 CancellationException cancellationException) {
        mo6938(cancellationException);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
        C0322 c0322M11599 = m11599(e);
        if (c0322M11599 != null) {
            throw c0322M11599.m1057();
        }
        if (C5508.m17142() == null) {
            return null;
        }
        return C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C4099<E>[] m11595(C4099<E>[] c4099Arr, C4099<E> c4099) {
        return c4099Arr == null ? new C4099[]{c4099} : (C4099[]) C3404.m7280(c4099Arr, c4099);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m11596(C4099<E> c4099) {
        Object obj;
        Object obj2;
        C4099<E>[] c4099Arr;
        do {
            obj = this._state;
            if (obj instanceof C0322) {
                return;
            }
            if (!(obj instanceof C4098)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            C4098 c4098 = (C4098) obj;
            obj2 = c4098.f668;
            c4099Arr = c4098.f669;
            C5499.m17100(c4099Arr);
        } while (!C3008.m74(f8180, this, obj, new C4098(obj2, m11600(c4099Arr, c4099))));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final E m11597() throws Throwable {
        Object obj = this._state;
        if (obj instanceof C0322) {
            throw ((C0322) obj).m1058();
        }
        if (obj instanceof C4098) {
            E e = (E) ((C4098) obj).f668;
            if (e != f8184) {
                return e;
            }
            throw new IllegalStateException("No value");
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final E m11598() {
        Object obj = this._state;
        if (obj instanceof C0322) {
            return null;
        }
        if (!(obj instanceof C4098)) {
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
        C7694 c7694 = f8184;
        E e = (E) ((C4098) obj).f668;
        if (e == c7694) {
            return null;
        }
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C0322 m11599(E e) {
        Object obj;
        if (!f8181.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C0322) {
                    return (C0322) obj;
                }
                if (!(obj instanceof C4098)) {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!C3008.m74(f8180, this, obj, new C4098(e, ((C4098) obj).f669)));
        C4099<E>[] c4099Arr = ((C4098) obj).f669;
        if (c4099Arr != null) {
            for (C4099<E> c4099 : c4099Arr) {
                c4099.mo5865(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C4099<E>[] m11600(C4099<E>[] c4099Arr, C4099<E> c4099) {
        int length = c4099Arr.length;
        int iM7940 = C3411.m7940(c4099Arr, c4099);
        if (length == 1) {
            return null;
        }
        C4099<E>[] c4099Arr2 = new C4099[length - 1];
        C3404.m7138(c4099Arr, c4099Arr2, 0, 0, iM7940, 6, null);
        C3404.m7138(c4099Arr, c4099Arr2, iM7940, iM7940 + 1, 0, 8, null);
        return c4099Arr2;
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public InterfaceC7288<E, InterfaceC7317<E>> mo5856() {
        return new C4100(this);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Throwable;)Z */
    @Override // Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: merged with bridge method [inline-methods] */
    public boolean mo6938(@InterfaceC6489 Throwable th) {
        Object obj;
        int i;
        do {
            obj = this._state;
            if (obj instanceof C0322) {
                return false;
            }
            if (!(obj instanceof C4098)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!C3008.m74(f8180, this, obj, th == null ? f8183 : new C0322(th)));
        C4099<E>[] c4099Arr = ((C4098) obj).f669;
        if (c4099Arr != null) {
            for (C4099<E> c4099 : c4099Arr) {
                c4099.mo6938(th);
            }
        }
        m11593(th);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۡۦۤ۠ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3592
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public InterfaceC7042<E> mo6940() {
        Object obj;
        C4098 c4098;
        C4099 c4099 = new C4099(this);
        do {
            obj = this._state;
            if (obj instanceof C0322) {
                c4099.mo6938(((C0322) obj).f667);
                return c4099;
            }
            if (!(obj instanceof C4098)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            c4098 = (C4098) obj;
            Object obj2 = c4098.f668;
            if (obj2 != f8184) {
                c4099.mo5865(obj2);
            }
        } while (!C3008.m74(f8180, this, obj, new C4098(c4098.f668, m11595(c4098.f669, c4099))));
        return c4099;
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public Object mo5863(E e) {
        C0322 c0322M11599 = m11599(e);
        return c0322M11599 != null ? C3732.f494.m807(c0322M11599.m1057()) : C3732.f494.m10212(C8107.f3222);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo5866(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8182;
        if (C3008.m74(atomicReferenceFieldUpdater, this, null, interfaceC5124)) {
            Object obj = this._state;
            if ((obj instanceof C0322) && C3008.m74(atomicReferenceFieldUpdater, this, interfaceC5124, C2978.f4314)) {
                interfaceC5124.invoke(((C0322) obj).f667);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == C2978.f4314) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj2);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo5867() {
        return this._state instanceof C0322;
    }

    public C4097(E e) {
        this();
        f8180.lazySet(this, new C4098(e, null));
    }
}
