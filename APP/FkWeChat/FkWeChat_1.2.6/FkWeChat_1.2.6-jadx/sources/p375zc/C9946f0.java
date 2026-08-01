package p375zc;

import ad.C0298y;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9223k;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: zc.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9946f0 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9946f0 f33499a = new C9946f0();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f33500b = AbstractC9223k.m35909e("kotlinx.serialization.json.JsonNull", AbstractC9224l.b.f31485a, new InterfaceC9218f[0], null, 8, null);

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f33500b;
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C9944e0 mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        AbstractC9970v.m38603g(interfaceC9487e);
        if (interfaceC9487e.mo683p()) {
            throw new C0298y("Expected 'null' literal");
        }
        interfaceC9487e.mo893j();
        return C9944e0.INSTANCE;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo15954b(InterfaceC9488f interfaceC9488f, C9944e0 c9944e0) {
        interfaceC9488f.getClass();
        c9944e0.getClass();
        AbstractC9970v.m38604h(interfaceC9488f);
        interfaceC9488f.mo640f();
    }
}
