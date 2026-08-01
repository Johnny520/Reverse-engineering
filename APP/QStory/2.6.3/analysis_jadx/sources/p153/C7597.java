package p153;

import androidx.collection.C0283;
import androidx.core.util.InterfaceC2188;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4871;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7597 implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f20594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20595;

    public /* synthetic */ C7597(Object obj, int i) {
        this.f20595 = i;
        this.f20594 = obj;
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        switch (this.f20595) {
            case 0:
                C7596 c7596 = (C7596) obj;
                if (c7596 == null) {
                    c7596 = new C7596(-3);
                }
                ((C4871) this.f20594).m9751(c7596);
                return;
            default:
                C7596 c75962 = (C7596) obj;
                synchronized (AbstractC7603.f20620) {
                    try {
                        C0283 c0283 = AbstractC7603.f20619;
                        ArrayList arrayList = (ArrayList) c0283.get((String) this.f20594);
                        if (arrayList == null) {
                            return;
                        }
                        c0283.remove((String) this.f20594);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC2188) arrayList.get(i)).accept(c75962);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
