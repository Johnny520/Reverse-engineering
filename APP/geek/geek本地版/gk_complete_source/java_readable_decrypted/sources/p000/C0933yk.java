package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: yk */
/* JADX INFO: loaded from: classes.dex */
public final class C0933yk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5344b;

    public /* synthetic */ C0933yk(int i, Object obj) {
        this.f5343a = i;
        this.f5344b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2688a(Object obj) {
        switch (this.f5343a) {
            case Base64.DEFAULT /* 0 */:
                C0970zk c0970zk = (C0970zk) obj;
                if (c0970zk == null) {
                    c0970zk = new C0970zk(-3);
                }
                ((C0138d4) this.f5344b).m875F(c0970zk);
                return;
            default:
                C0970zk c0970zk2 = (C0970zk) obj;
                synchronized (AbstractC0022al.f149c) {
                    try {
                        u30 u30Var = AbstractC0022al.f150d;
                        ArrayList arrayList = (ArrayList) u30Var.getOrDefault((String) this.f5344b, null);
                        if (arrayList == null) {
                            return;
                        }
                        u30Var.remove((String) this.f5344b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((C0933yk) arrayList.get(i)).m2688a(c0970zk2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
