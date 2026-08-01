package ec;

import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p228p8.AbstractC5971a;
import p228p8.InterfaceC5976f;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ec.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2143i2 extends AbstractC5971a implements InterfaceC2198w1 {

    /* JADX INFO: renamed from: r */
    public static final C2143i2 f5969r = new C2143i2();

    public C2143i2() {
        super(InterfaceC2198w1.f6022g);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: D0 */
    public InterfaceC2126e1 mo7650D0(InterfaceC0184l interfaceC0184l) {
        return C2147j2.f5979q;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: J0 */
    public Object mo7657J0(InterfaceC5976f interfaceC5976f) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: R */
    public InterfaceC2184t mo7666R(InterfaceC2192v interfaceC2192v) {
        return C2147j2.f5979q;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: T */
    public CancellationException mo7669T() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: c */
    public boolean mo7586c() {
        return true;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: f */
    public InterfaceC7282h mo7686f() {
        return AbstractC7291q.m28881i();
    }

    @Override // ec.InterfaceC2198w1
    public boolean isCancelled() {
        return false;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: l */
    public boolean mo7693l() {
        return false;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: n0 */
    public InterfaceC2126e1 mo7697n0(boolean z10, boolean z11, InterfaceC0184l interfaceC0184l) {
        return C2147j2.f5979q;
    }

    @Override // ec.InterfaceC2198w1
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: n */
    public void mo7696n(CancellationException cancellationException) {
    }
}
