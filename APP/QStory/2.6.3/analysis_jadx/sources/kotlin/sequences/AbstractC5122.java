package kotlin.sequences;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import io.ktor.util.C4207;
import io.ktor.util.C4211;
import io.ktor.utils.io.C4248;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.io.C4380;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p089.C7180;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5122 extends AbstractC6561 {
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static Object m10108(InterfaceC5127 interfaceC5127) {
        Iterator it = interfaceC5127.iterator();
        if (!it.hasNext()) {
            C4211.m8617("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static InterfaceC5127 m10109(InterfaceC6543 interfaceC6543) {
        return new C5120(new C4380(interfaceC6543, new C4248(interfaceC6543, 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static List m10110(InterfaceC5127 interfaceC5127) {
        interfaceC5127.getClass();
        Iterator it = interfaceC5127.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC6347.m11928(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static C5121 m10111(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558) {
        interfaceC5127.getClass();
        interfaceC6558.getClass();
        return new C5121(interfaceC5127, interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static C5115 m10112(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558) {
        return new C5115(new C5121(interfaceC5127, interfaceC6558), false, new C4207(6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static C5124 m10113(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558) {
        return new C5124(interfaceC5127, interfaceC6558, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static C5124 m10114(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558) {
        return new C5124(interfaceC5127, interfaceC6558, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static InterfaceC5127 m10115(Object obj, InterfaceC6558 interfaceC6558) {
        interfaceC6558.getClass();
        return obj == null ? C5117.f14652 : new C4380(new C1030(obj, 22), interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static final C5124 m10116(InterfaceC5127 interfaceC5127) {
        C4207 c4207 = new C4207(5);
        if (!(interfaceC5127 instanceof C5121)) {
            return new C5124(interfaceC5127, new C7180(2), c4207);
        }
        C5121 c5121 = (C5121) interfaceC5127;
        return new C5124(c5121.f14657, c5121.f14656, c4207);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static InterfaceC5127 m10117(InterfaceC5127 interfaceC5127, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC5127 : interfaceC5127 instanceof InterfaceC5118 ? ((InterfaceC5118) interfaceC5127).mo10107(i) : new C5119(interfaceC5127, i);
        }
        C5925.m11314(AbstractC0053.m162(i, "Requested element count ", " is less than zero."));
        return null;
    }
}
