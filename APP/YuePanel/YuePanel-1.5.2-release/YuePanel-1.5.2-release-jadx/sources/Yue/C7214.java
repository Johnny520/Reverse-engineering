package Yue;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7214<T> implements InterfaceC5684<T>, Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1213 f21790 = new C1213(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater<C7214<?>, Object> f21791 = AtomicReferenceFieldUpdater.newUpdater(C7214.class, Object.class, "ۥ۟۟۠ۤ");

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public volatile InterfaceC5122<? extends T> f21792;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile Object f21793;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object f21794;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۦ$ۥ */
    public static final class C1213 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۧۢۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1213(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1213() {
        }
    }

    public C7214(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(interfaceC5122, "initializer");
        this.f21792 = interfaceC5122;
        C8072 c8072 = C8072.f3213;
        this.f21793 = c8072;
        this.f21794 = c8072;
    }

    @Override // Yue.InterfaceC5684
    public T getValue() {
        T t = (T) this.f21793;
        C8072 c8072 = C8072.f3213;
        if (t != c8072) {
            return t;
        }
        InterfaceC5122<? extends T> interfaceC5122 = this.f21792;
        if (interfaceC5122 != null) {
            T tInvoke = interfaceC5122.invoke();
            if (C3008.m74(f21791, this, c8072, tInvoke)) {
                this.f21792 = null;
                return tInvoke;
            }
        }
        return (T) this.f21793;
    }

    @Override // Yue.InterfaceC5684
    public boolean isInitialized() {
        return this.f21793 != C8072.f3213;
    }

    @InterfaceC6399
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m3506() {
        return new C5434(getValue());
    }
}
