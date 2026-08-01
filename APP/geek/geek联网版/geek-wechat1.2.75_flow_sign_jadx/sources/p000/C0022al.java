package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: classes.dex */
public final class C0022al {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f86b;

    public /* synthetic */ C0022al(int i, Object obj) {
        this.f85a = i;
        this.f86b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m54a(Object obj) {
        switch (this.f85a) {
            case Base64.DEFAULT /* 0 */:
                C0072bl c0072bl = (C0072bl) obj;
                if (c0072bl == null) {
                    c0072bl = new C0072bl(-3);
                }
                ((C0138d4) this.f86b).m834F(c0072bl);
                return;
            default:
                C0072bl c0072bl2 = (C0072bl) obj;
                synchronized (AbstractC0108cl.f902c) {
                    try {
                        b40 b40Var = AbstractC0108cl.f903d;
                        ArrayList arrayList = (ArrayList) b40Var.getOrDefault((String) this.f86b, null);
                        if (arrayList == null) {
                            return;
                        }
                        b40Var.remove((String) this.f86b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((C0022al) arrayList.get(i)).m54a(c0072bl2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
