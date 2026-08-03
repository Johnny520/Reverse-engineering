package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4069 extends C4339 {
    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo11506(InterfaceC5114 interfaceC5114) throws C5509 {
        if ((interfaceC5114 instanceof AbstractC4298) && (interfaceC5114.mo15780() || interfaceC5114.mo15783())) {
            throw new C5511("bad rsv RSV1: " + interfaceC5114.mo1929() + " RSV2: " + interfaceC5114.mo15780() + " RSV3: " + interfaceC5114.mo15783());
        }
        if (interfaceC5114 instanceof AbstractC4214) {
            if (interfaceC5114.mo1929() || interfaceC5114.mo15780() || interfaceC5114.mo15783()) {
                throw new C5511("bad rsv RSV1: " + interfaceC5114.mo1929() + " RSV2: " + interfaceC5114.mo15780() + " RSV3: " + interfaceC5114.mo15783());
            }
        }
    }
}
