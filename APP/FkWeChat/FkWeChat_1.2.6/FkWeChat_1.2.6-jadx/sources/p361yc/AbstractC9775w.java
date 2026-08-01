package p361yc;

import java.util.Iterator;
import p024b9.AbstractC1043k;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9488f;
import p376zd.C9987e;

/* JADX INFO: renamed from: yc.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9775w extends AbstractC9666a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8647b f33058a;

    public AbstractC9775w(InterfaceC8647b interfaceC8647b) {
        super(null);
        this.f33058a = interfaceC8647b;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC9218f mo15953a();

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        int iMo37789k = mo37789k(obj);
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9486d interfaceC9486dMo36965C = interfaceC9488f.mo36965C(interfaceC9218fMo15953a, iMo37789k);
        Iterator itMo37788j = mo37788j(obj);
        for (int i10 = 0; i10 < iMo37789k; i10++) {
            interfaceC9486dMo36965C.mo36969g(mo15953a(), i10, this.f33058a, itMo37788j.next());
        }
        interfaceC9486dMo36965C.mo638d(interfaceC9218fMo15953a);
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: m */
    public final void mo37791m(InterfaceC9485c interfaceC9485c, Object obj, int i10, int i11) {
        interfaceC9485c.getClass();
        if (i11 < 0) {
            C9987e.m38645a("Size must be known in advance when using READ_ALL");
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            mo37792n(interfaceC9485c, i10 + i12, obj, false);
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: n */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, Object obj, boolean z10) {
        interfaceC9485c.getClass();
        mo37873t(obj, i10, InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), i10, this.f33058a, null, 8, null));
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo37873t(Object obj, int i10, Object obj2);

    public /* synthetic */ AbstractC9775w(InterfaceC8647b interfaceC8647b, AbstractC1043k abstractC1043k) {
        this(interfaceC8647b);
    }
}
