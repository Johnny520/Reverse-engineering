package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6400<T> implements InterfaceC7016<Object, T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public T f2051;

    @InterfaceC6399
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f2051 != null) {
            str = "value=" + this.f2051;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    @Override // Yue.InterfaceC7016, Yue.InterfaceC7014
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public T mo2841(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5604<?> interfaceC5604) {
        C5499.m17103(interfaceC5604, "property");
        T t = this.f2051;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + interfaceC5604.getName() + " should be initialized before get.");
    }

    @Override // Yue.InterfaceC7016
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2842(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5604<?> interfaceC5604, @InterfaceC6399 T t) {
        C5499.m17103(interfaceC5604, "property");
        C5499.m17103(t, "value");
        this.f2051 = t;
    }
}
