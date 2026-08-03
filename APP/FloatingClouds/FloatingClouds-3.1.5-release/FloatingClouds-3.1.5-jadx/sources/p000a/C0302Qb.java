package p000a;

import java.util.Iterator;

/* JADX INFO: renamed from: a.Qb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0302Qb implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f1096b;

    public /* synthetic */ C0302Qb(int i, ClassLoader classLoader) {
        this.f1095a = i;
        this.f1096b = classLoader;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        switch (this.f1095a) {
            case 0:
                Iterator it = C0739o3.m1757d0("com.tencent.mm.plugin.voip.model.b2", "com.tencent.mm.plugin.voip.model.h2", "com.tencent.mm.plugin.voip.model.NewVoipMgr").iterator();
                while (it.hasNext()) {
                    Class clsM13b = C0002A1.m13b(this.f1096b, (String) it.next());
                    if (clsM13b != null) {
                        return clsM13b;
                    }
                }
                return null;
            default:
                Iterator it2 = C0739o3.m1757d0("com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager", "com.tencent.mm.plugin.voip.model.VoipIncomingCallManager", "com.tencent.mm.plugin.voip.model.n", "com.tencent.mm.plugin.voip.model.e0", "com.tencent.mm.plugin.voip.model.c0").iterator();
                while (it2.hasNext()) {
                    Class clsM13b2 = C0002A1.m13b(this.f1096b, (String) it2.next());
                    if (clsM13b2 != null) {
                        return clsM13b2;
                    }
                }
                return null;
        }
    }
}
