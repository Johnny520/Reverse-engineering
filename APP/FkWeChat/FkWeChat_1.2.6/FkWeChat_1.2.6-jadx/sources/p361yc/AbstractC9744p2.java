package p361yc;

import java.util.Iterator;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9744p2 extends AbstractC9775w {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f33013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9744p2(InterfaceC8647b interfaceC8647b) {
        super(interfaceC8647b, null);
        interfaceC8647b.getClass();
        this.f33013b = new C9739o2(interfaceC8647b.mo15953a());
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo37812A(InterfaceC9486d interfaceC9486d, Object obj, int i10);

    @Override // p361yc.AbstractC9775w, p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public final InterfaceC9218f mo15953a() {
        return this.f33013b;
    }

    @Override // p361yc.AbstractC9775w, p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public final void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        int iMo37789k = mo37789k(obj);
        InterfaceC9218f interfaceC9218f = this.f33013b;
        InterfaceC9486d interfaceC9486dMo36965C = interfaceC9488f.mo36965C(interfaceC9218f, iMo37789k);
        mo37812A(interfaceC9486dMo36965C, obj, iMo37789k);
        interfaceC9486dMo36965C.mo638d(interfaceC9218f);
    }

    @Override // p361yc.AbstractC9666a, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public final Object mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return m37790l(interfaceC9487e, null);
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: j */
    public final Iterator mo37788j(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC9734n2 mo37785g() {
        return (AbstractC9734n2) mo37794q(mo37818x());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int mo37786h(AbstractC9734n2 abstractC9734n2) {
        abstractC9734n2.getClass();
        return abstractC9734n2.mo37798d();
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void mo37787i(AbstractC9734n2 abstractC9734n2, int i10) {
        abstractC9734n2.getClass();
        abstractC9734n2.mo37797b(i10);
    }

    /* JADX INFO: renamed from: x */
    public abstract Object mo37818x();

    @Override // p361yc.AbstractC9775w
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void mo37873t(AbstractC9734n2 abstractC9734n2, int i10, Object obj) {
        abstractC9734n2.getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Object mo37795r(AbstractC9734n2 abstractC9734n2) {
        abstractC9734n2.getClass();
        return abstractC9734n2.mo37796a();
    }
}
