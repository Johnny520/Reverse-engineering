package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8111<T> implements InterfaceC5684<T>, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC5122<? extends T> f24035;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public Object f24036;

    public C8111(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(interfaceC5122, "initializer");
        this.f24035 = interfaceC5122;
        this.f24036 = C8072.f3213;
    }

    /* JADX INFO: renamed from: ۥ */
    private final Object m4142() {
        return new C5434(getValue());
    }

    @Override // Yue.InterfaceC5684
    public T getValue() {
        if (this.f24036 == C8072.f3213) {
            InterfaceC5122<? extends T> interfaceC5122 = this.f24035;
            C5499.m17100(interfaceC5122);
            this.f24036 = interfaceC5122.invoke();
            this.f24035 = null;
        }
        return (T) this.f24036;
    }

    @Override // Yue.InterfaceC5684
    public boolean isInitialized() {
        return this.f24036 != C8072.f3213;
    }

    @InterfaceC6399
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
