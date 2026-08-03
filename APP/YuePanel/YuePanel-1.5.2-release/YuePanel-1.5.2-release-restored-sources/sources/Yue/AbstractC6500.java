package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6500<V> implements InterfaceC7016<Object, V> {

    /* JADX INFO: renamed from: ۥ */
    public V f2115;

    public AbstractC6500(V v) {
        this.f2115 = v;
    }

    @InterfaceC6399
    public String toString() {
        return "ObservableProperty(value=" + this.f2115 + ')';
    }

    @Override // Yue.InterfaceC7016, Yue.InterfaceC7014
    /* JADX INFO: renamed from: ۥ */
    public V mo2841(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5604<?> interfaceC5604) {
        C5499.m17103(interfaceC5604, "property");
        return this.f2115;
    }

    @Override // Yue.InterfaceC7016
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2842(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5604<?> interfaceC5604, V v) {
        C5499.m17103(interfaceC5604, "property");
        V v2 = this.f2115;
        if (mo12624(interfaceC5604, v2, v)) {
            this.f2115 = v;
            mo12623(interfaceC5604, v2, v);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12623(@InterfaceC6399 InterfaceC5604<?> interfaceC5604, V v, V v2) {
        C5499.m17103(interfaceC5604, "property");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo12624(@InterfaceC6399 InterfaceC5604<?> interfaceC5604, V v, V v2) {
        C5499.m17103(interfaceC5604, "property");
        return true;
    }
}
