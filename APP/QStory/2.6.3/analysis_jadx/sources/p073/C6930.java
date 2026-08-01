package p073;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import p052.InterfaceC6543;
import p097.InterfaceC7220;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6930 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f18488;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18489 = 1;

    public C6930(List list, C6938 c6938) {
        this.f18488 = list;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f18489;
        List<InterfaceC7220> list = this.f18488;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (InterfaceC7220 interfaceC7220 : list) {
                    interfaceC7220.getClass();
                    AbstractC4882 abstractC4882M9808 = AbstractC4893.m9808((AbstractC4882) interfaceC7220);
                    if (abstractC4882M9808 != null) {
                        arrayList.add(abstractC4882M9808);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public C6930(List list) {
        this.f18488 = list;
    }
}
