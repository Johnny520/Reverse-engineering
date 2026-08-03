package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5434<T> implements InterfaceC5684<T>, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final T f13353;

    public C5434(T t) {
        this.f13353 = t;
    }

    @Override // Yue.InterfaceC5684
    public T getValue() {
        return this.f13353;
    }

    @Override // Yue.InterfaceC5684
    public boolean isInitialized() {
        return true;
    }

    @InterfaceC6399
    public String toString() {
        return String.valueOf(getValue());
    }
}
