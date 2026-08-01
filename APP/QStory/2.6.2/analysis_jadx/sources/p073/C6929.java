package p073;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import p052.InterfaceC6542;
import p097.InterfaceC7219;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6929 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f18493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18494 = 1;

    public C6929(List list, C6937 c6937) {
        this.f18493 = list;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f18494;
        List<InterfaceC7219> list = this.f18493;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (InterfaceC7219 interfaceC7219 : list) {
                    interfaceC7219.getClass();
                    AbstractC4881 abstractC4881M9814 = AbstractC4892.m9814((AbstractC4881) interfaceC7219);
                    if (abstractC4881M9814 != null) {
                        arrayList.add(abstractC4881M9814);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public C6929(List list) {
        this.f18493 = list;
    }
}
