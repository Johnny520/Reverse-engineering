package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public abstract class AbstractC2981 implements InterfaceC4225.InterfaceC0357 {

    @InterfaceC6399
    private final InterfaceC4225.InterfaceC4228<?> key;

    public AbstractC2981(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        this.key = interfaceC4228;
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        return (R) InterfaceC4225.InterfaceC0357.C4227.m1191(this, r, interfaceC5138);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        return (E) InterfaceC4225.InterfaceC0357.C4227.m1192(this, interfaceC4228);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357
    @InterfaceC6399
    public InterfaceC4225.InterfaceC4228<?> getKey() {
        return this.key;
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        return InterfaceC4225.InterfaceC0357.C4227.m12161(this, interfaceC4228);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return InterfaceC4225.InterfaceC0357.C4227.m12162(this, interfaceC4225);
    }
}
