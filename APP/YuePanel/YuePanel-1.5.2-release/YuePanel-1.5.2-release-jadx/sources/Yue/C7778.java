package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC7774;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7778<T> implements InterfaceC7774<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final T f23320;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final ThreadLocal<T> f23321;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225.InterfaceC4228<?> f23322;

    public C7778(T t, @InterfaceC6399 ThreadLocal<T> threadLocal) {
        this.f23320 = t;
        this.f23321 = threadLocal;
        this.f23322 = new C7780(threadLocal);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        return (R) InterfaceC7774.C1351.m3870(this, r, interfaceC5138);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        if (C5499.m17094(getKey(), interfaceC4228)) {
            return this;
        }
        return null;
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357
    @InterfaceC6399
    public InterfaceC4225.InterfaceC4228<?> getKey() {
        return this.f23322;
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        return C5499.m17094(getKey(), interfaceC4228) ? C4629.f9940 : this;
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return InterfaceC7774.C1351.m24713(this, interfaceC4225);
    }

    @InterfaceC6399
    public String toString() {
        return "ThreadLocal(value=" + this.f23320 + ", threadLocal = " + this.f23321 + ')';
    }

    @Override // Yue.InterfaceC7774
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public T mo12178(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        T t = this.f23321.get();
        this.f23321.set(this.f23320);
        return t;
    }

    @Override // Yue.InterfaceC7774
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo12179(@InterfaceC6399 InterfaceC4225 interfaceC4225, T t) {
        this.f23321.set(t);
    }
}
