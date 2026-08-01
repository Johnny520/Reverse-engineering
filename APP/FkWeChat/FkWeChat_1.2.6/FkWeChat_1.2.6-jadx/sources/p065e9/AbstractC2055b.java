package p065e9;

import p098g9.InterfaceC2557k;

/* JADX INFO: renamed from: e9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2055b implements InterfaceC2057d {

    /* JADX INFO: renamed from: a */
    public Object f5766a;

    public AbstractC2055b(Object obj) {
        this.f5766a = obj;
    }

    @Override // p065e9.InterfaceC2057d, p065e9.InterfaceC2056c
    /* JADX INFO: renamed from: a */
    public Object mo7408a(Object obj, InterfaceC2557k interfaceC2557k) {
        interfaceC2557k.getClass();
        return this.f5766a;
    }

    @Override // p065e9.InterfaceC2057d
    /* JADX INFO: renamed from: b */
    public void mo7409b(Object obj, InterfaceC2557k interfaceC2557k, Object obj2) {
        interfaceC2557k.getClass();
        Object obj3 = this.f5766a;
        if (mo7411d(interfaceC2557k, obj3, obj2)) {
            this.f5766a = obj2;
            m7410c(interfaceC2557k, obj3, obj2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7410c(InterfaceC2557k interfaceC2557k, Object obj, Object obj2) {
        interfaceC2557k.getClass();
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo7411d(InterfaceC2557k interfaceC2557k, Object obj, Object obj2);

    public String toString() {
        return "ObservableProperty(value=" + this.f5766a + ')';
    }
}
