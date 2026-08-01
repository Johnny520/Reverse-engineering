package p153;

import androidx.collection.C0283;
import androidx.core.util.InterfaceC2188;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4870;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7596 implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f20599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20600;

    public /* synthetic */ C7596(Object obj, int i) {
        this.f20600 = i;
        this.f20599 = obj;
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        switch (this.f20600) {
            case 0:
                C7595 c7595 = (C7595) obj;
                if (c7595 == null) {
                    c7595 = new C7595(-3);
                }
                ((C4870) this.f20599).m9759(c7595);
                return;
            default:
                C7595 c75952 = (C7595) obj;
                synchronized (AbstractC7602.f20625) {
                    try {
                        C0283 c0283 = AbstractC7602.f20624;
                        ArrayList arrayList = (ArrayList) c0283.get((String) this.f20599);
                        if (arrayList == null) {
                            return;
                        }
                        c0283.remove((String) this.f20599);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC2188) arrayList.get(i)).accept(c75952);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
