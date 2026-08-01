package p257r8;

import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: r8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6535d extends AbstractC6532a {
    private final InterfaceC5980j _context;
    private transient InterfaceC5976f intercepted;

    public AbstractC6535d(InterfaceC5976f interfaceC5976f) {
        this(interfaceC5976f, interfaceC5976f != null ? interfaceC5976f.getContext() : null);
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        InterfaceC5980j interfaceC5980j = this._context;
        interfaceC5980j.getClass();
        return interfaceC5980j;
    }

    public final InterfaceC5976f intercepted() {
        InterfaceC5976f interfaceC5976fMo5457G = this.intercepted;
        if (interfaceC5976fMo5457G == null) {
            InterfaceC5977g interfaceC5977g = (InterfaceC5977g) getContext().mo1654h(InterfaceC5977g.f18915n);
            if (interfaceC5977g == null || (interfaceC5976fMo5457G = interfaceC5977g.mo5457G(this)) == null) {
                interfaceC5976fMo5457G = this;
            }
            this.intercepted = interfaceC5976fMo5457G;
        }
        return interfaceC5976fMo5457G;
    }

    @Override // p257r8.AbstractC6532a
    public void releaseIntercepted() {
        InterfaceC5976f interfaceC5976f = this.intercepted;
        if (interfaceC5976f != null && interfaceC5976f != this) {
            InterfaceC5980j.b bVarMo1654h = getContext().mo1654h(InterfaceC5977g.f18915n);
            bVarMo1654h.getClass();
            ((InterfaceC5977g) bVarMo1654h).mo5456F0(interfaceC5976f);
        }
        this.intercepted = C6534c.f20490q;
    }

    public AbstractC6535d(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j) {
        super(interfaceC5976f);
        this._context = interfaceC5980j;
    }
}
