package p273z0;

import android.view.KeyEvent;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: z0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3513f extends AbstractC2206o implements InterfaceC3512e {

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f10954r;

    /* JADX INFO: renamed from: s */
    public InterfaceC1601c f10955s;

    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: U */
    public final boolean mo1266U(KeyEvent keyEvent) {
        InterfaceC1601c interfaceC1601c = this.f10954r;
        if (interfaceC1601c != null) {
            return ((Boolean) interfaceC1601c.mo1h(new C3509b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: k */
    public final boolean mo1267k(KeyEvent keyEvent) {
        InterfaceC1601c interfaceC1601c = this.f10955s;
        if (interfaceC1601c != null) {
            return ((Boolean) interfaceC1601c.mo1h(new C3509b(keyEvent))).booleanValue();
        }
        return false;
    }
}
