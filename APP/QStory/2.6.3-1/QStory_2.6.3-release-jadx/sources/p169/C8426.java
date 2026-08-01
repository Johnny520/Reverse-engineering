package p169;

import androidx.collection.C1130;
import androidx.core.util.InterfaceC3021;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C5703;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8426 implements InterfaceC3021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f20939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20940;

    public /* synthetic */ C8426(Object obj, int i) {
        this.f20940 = i;
        this.f20939 = obj;
    }

    @Override // androidx.core.util.InterfaceC3021
    public final void accept(Object obj) {
        switch (this.f20940) {
            case 0:
                C8425 c8425 = (C8425) obj;
                if (c8425 == null) {
                    c8425 = new C8425(-3);
                }
                ((C5703) this.f20939).m10310(c8425);
                return;
            default:
                C8425 c84252 = (C8425) obj;
                synchronized (AbstractC8432.f20965) {
                    try {
                        C1130 c1130 = AbstractC8432.f20964;
                        ArrayList arrayList = (ArrayList) c1130.get((String) this.f20939);
                        if (arrayList == null) {
                            return;
                        }
                        c1130.remove((String) this.f20939);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC3021) arrayList.get(i)).accept(c84252);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
