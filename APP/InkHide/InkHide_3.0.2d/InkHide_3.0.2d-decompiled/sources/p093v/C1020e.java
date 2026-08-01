package p093v;

import java.util.ArrayList;
import p014H.C0142a;
import p075l.C0753k;
import p097x.InterfaceC1033a;

/* JADX INFO: renamed from: v.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1020e implements InterfaceC1033a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3625b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1020e(int i2, Object obj) {
        this.f3624a = i2;
        this.f3625b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p097x.InterfaceC1033a
    /* JADX INFO: renamed from: a */
    public final void mo1575a(Object obj) {
        switch (this.f3624a) {
            case 0:
                C1021f c1021f = (C1021f) obj;
                if (c1021f == null) {
                    c1021f = new C1021f(-3);
                }
                ((C0142a) this.f3625b).m334t(c1021f);
                return;
            default:
                C1021f c1021f2 = (C1021f) obj;
                synchronized (AbstractC1022g.f3630c) {
                    try {
                        C0753k c0753k = AbstractC1022g.f3631d;
                        ArrayList arrayList = (ArrayList) c0753k.getOrDefault((String) this.f3625b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0753k.remove((String) this.f3625b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC1033a) arrayList.get(i2)).mo1575a(c1021f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
