package p164l0;

import ec.InterfaceC2198w1;
import p010a9.InterfaceC0188p;
import p015b0.C0831p2;
import p018b3.InterfaceC0964m0;
import p135j2.InterfaceC3578w;
import p179m2.InterfaceC4862j3;
import p179m2.InterfaceC4939z2;
import p190n0.C5322b4;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: l0.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4436j2 implements InterfaceC0964m0 {

    /* JADX INFO: renamed from: a */
    public a f12957a;

    /* JADX INFO: renamed from: l0.j2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: B */
        InterfaceC3578w mo17241B();

        /* JADX INFO: renamed from: D0 */
        InterfaceC2198w1 mo17242D0(InterfaceC0188p interfaceC0188p);

        /* JADX INFO: renamed from: E0 */
        C5322b4 mo17243E0();

        /* JADX INFO: renamed from: Q1 */
        C0831p2 mo17247Q1();

        InterfaceC4939z2 getSoftwareKeyboardController();

        InterfaceC4862j3 getViewConfiguration();
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: c */
    public final void mo3517c() {
        InterfaceC4939z2 softwareKeyboardController;
        a aVar = this.f12957a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.mo19522b();
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: h */
    public final void mo3522h() {
        InterfaceC4939z2 softwareKeyboardController;
        a aVar = this.f12957a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.mo19521a();
    }

    /* JADX INFO: renamed from: i */
    public final a m17271i() {
        return this.f12957a;
    }

    /* JADX INFO: renamed from: j */
    public final void m17272j(a aVar) {
        if (!(this.f12957a == null)) {
            AbstractC6635e.m26320c("Expected textInputModifierNode to be null");
        }
        this.f12957a = aVar;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo17212k();

    /* JADX INFO: renamed from: l */
    public final void m17273l(a aVar) {
        if (!(this.f12957a == aVar)) {
            AbstractC6635e.m26320c("Expected textInputModifierNode to be " + aVar + " but was " + this.f12957a);
        }
        this.f12957a = null;
    }
}
