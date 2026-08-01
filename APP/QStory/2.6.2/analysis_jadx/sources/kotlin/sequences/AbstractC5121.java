package kotlin.sequences;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.util.C4206;
import io.ktor.util.C4210;
import io.ktor.utils.io.C4247;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.io.C4379;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p089.C7179;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5121 extends AbstractC2904 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static InterfaceC5126 m10104(InterfaceC5126 interfaceC5126, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC5126 : interfaceC5126 instanceof InterfaceC5117 ? ((InterfaceC5117) interfaceC5126).mo10103(i) : new C5118(interfaceC5126, i);
        }
        C5919.m11253(AbstractC0053.m161(i, "Requested element count ", " is less than zero."));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static C5123 m10105(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557) {
        return new C5123(interfaceC5126, interfaceC6557, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static List m10106(InterfaceC5126 interfaceC5126) {
        interfaceC5126.getClass();
        Iterator it = interfaceC5126.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC8189.m13660(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static C5114 m10107(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557) {
        return new C5114(new C5120(interfaceC5126, interfaceC6557), false, new C4206(6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static final C5123 m10108(InterfaceC5126 interfaceC5126) {
        C4206 c4206 = new C4206(5);
        if (!(interfaceC5126 instanceof C5120)) {
            return new C5123(interfaceC5126, new C7179(2), c4206);
        }
        C5120 c5120 = (C5120) interfaceC5126;
        return new C5123(c5120.f14657, c5120.f14656, c4206);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static C5123 m10109(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557) {
        return new C5123(interfaceC5126, interfaceC6557, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static Object m10110(InterfaceC5126 interfaceC5126) {
        Iterator it = interfaceC5126.iterator();
        if (!it.hasNext()) {
            C4210.m8627("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static C5120 m10111(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557) {
        interfaceC5126.getClass();
        interfaceC6557.getClass();
        return new C5120(interfaceC5126, interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static InterfaceC5126 m10112(Object obj, InterfaceC6557 interfaceC6557) {
        interfaceC6557.getClass();
        return obj == null ? C5116.f14652 : new C4379(new C1030(obj, 22), interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static InterfaceC5126 m10113(InterfaceC6542 interfaceC6542) {
        return new C5119(new C4379(interfaceC6542, new C4247(interfaceC6542, 1)));
    }
}
