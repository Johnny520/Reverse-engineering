package p000A;

import java.util.ArrayList;
import p004C.InterfaceC0060a;
import p063j.C0966k;

/* JADX INFO: renamed from: A.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0007h implements InterfaceC0060a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21b;

    public /* synthetic */ C0007h(int i2, Object obj) {
        this.f20a = i2;
        this.f21b = obj;
    }

    @Override // p004C.InterfaceC0060a
    /* JADX INFO: renamed from: a */
    public final void mo16a(Object obj) {
        switch (this.f20a) {
            case 0:
                C0008i c0008i = (C0008i) obj;
                if (c0008i == null) {
                    c0008i = new C0008i(-3);
                }
                ((C0002c) this.f21b).m9j(c0008i);
                return;
            default:
                C0008i c0008i2 = (C0008i) obj;
                synchronized (AbstractC0009j.f26c) {
                    try {
                        C0966k c0966k = AbstractC0009j.f27d;
                        ArrayList arrayList = (ArrayList) c0966k.getOrDefault((String) this.f21b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0966k.remove((String) this.f21b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0060a) arrayList.get(i2)).mo16a(c0008i2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
