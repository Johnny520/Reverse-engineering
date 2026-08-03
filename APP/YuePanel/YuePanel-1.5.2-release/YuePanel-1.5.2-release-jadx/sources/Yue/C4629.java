package Yue;

import Yue.InterfaceC4225;
import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public final class C4629 implements InterfaceC4225, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4629 f9940 = new C4629();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f9941 = 0;

    @Override // Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC5138, "operation");
        return r;
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        return this;
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C5499.m17103(interfaceC4225, "context");
        return interfaceC4225;
    }

    @InterfaceC6399
    public String toString() {
        return "EmptyCoroutineContext";
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m1587() {
        return f9940;
    }
}
