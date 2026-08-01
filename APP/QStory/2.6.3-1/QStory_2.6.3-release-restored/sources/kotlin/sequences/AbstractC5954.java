package kotlin.sequences;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1868;
import io.ktor.util.C5039;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.C5080;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.p008io.C5212;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p105.C8009;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5954 extends AbstractC7390 {
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static Object m10667(InterfaceC5959 interfaceC5959) {
        Iterator it = interfaceC5959.iterator();
        if (!it.hasNext()) {
            C5043.m9176("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static InterfaceC5959 m10668(InterfaceC7372 interfaceC7372) {
        return new C5952(new C5212(interfaceC7372, new C5080(interfaceC7372, 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static List m10669(InterfaceC5959 interfaceC5959) {
        interfaceC5959.getClass();
        Iterator it = interfaceC5959.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC7176.m12487(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static C5953 m10670(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387) {
        interfaceC5959.getClass();
        interfaceC7387.getClass();
        return new C5953(interfaceC5959, interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static C5947 m10671(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387) {
        return new C5947(new C5953(interfaceC5959, interfaceC7387), false, new C5039(6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static C5956 m10672(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387) {
        return new C5956(interfaceC5959, interfaceC7387, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static C5956 m10673(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387) {
        return new C5956(interfaceC5959, interfaceC7387, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static InterfaceC5959 m10674(Object obj, InterfaceC7387 interfaceC7387) {
        interfaceC7387.getClass();
        return obj == null ? C5949.f14997 : new C5212(new C1868(obj, 22), interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static final C5956 m10675(InterfaceC5959 interfaceC5959) {
        C5039 c5039 = new C5039(5);
        if (!(interfaceC5959 instanceof C5953)) {
            return new C5956(interfaceC5959, new C8009(2), c5039);
        }
        C5953 c5953 = (C5953) interfaceC5959;
        return new C5956(c5953.f15002, c5953.f15001, c5039);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static InterfaceC5959 m10676(InterfaceC5959 interfaceC5959, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC5959 : interfaceC5959 instanceof InterfaceC5950 ? ((InterfaceC5950) interfaceC5959).mo10666(i) : new C5951(interfaceC5959, i);
        }
        C6755.m11873(AbstractC0900.m722(i, "Requested element count ", " is less than zero."));
        return null;
    }
}
