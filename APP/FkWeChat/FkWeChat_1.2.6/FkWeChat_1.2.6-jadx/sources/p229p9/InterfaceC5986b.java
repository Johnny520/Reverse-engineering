package p229p9;

import java.util.Collection;

/* JADX INFO: renamed from: p9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5986b extends InterfaceC5983a, InterfaceC5993d0 {

    /* JADX INFO: renamed from: p9.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* JADX INFO: renamed from: a */
        public boolean m23992a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* JADX INFO: renamed from: B0 */
    void mo12635B0(Collection collection);

    /* JADX INFO: renamed from: M */
    InterfaceC5986b mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, a aVar, boolean z10);

    @Override // p229p9.InterfaceC5983a, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    InterfaceC5986b mo12664a();

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    Collection mo12674e();

    /* JADX INFO: renamed from: j */
    a mo12678j();
}
