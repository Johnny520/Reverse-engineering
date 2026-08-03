package gg;

import eg.C0920a;
import mg.InterfaceC2839a;
import mg.InterfaceC2842d;
import p072f2.AbstractC1060w;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;

/* JADX INFO: renamed from: gg.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1418n extends AbstractC1420p implements InterfaceC2842d, InterfaceC1231l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1418n(String str, String str2) {
        super(C1407c.f4721g, AbstractC1060w.class, str, str2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.AbstractC1408d
    /* JADX INFO: renamed from: e */
    public final InterfaceC2839a mo3816e() {
        AbstractC1426v.f4739a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3832h() {
        if (this.f4733m) {
            C2104o.m5297w("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return;
        }
        InterfaceC2839a interfaceC2839aM3833g = m3833g();
        if (interfaceC2839aM3833g == this) {
            throw new C0920a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C1418n) ((InterfaceC2842d) interfaceC2839aM3833g)).m3832h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        m3832h();
        throw null;
    }
}
