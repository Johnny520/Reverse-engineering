package p089;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import p068.InterfaceC7372;
import p113.InterfaceC8049;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7759 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f18833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18834 = 1;

    public C7759(List list, C7767 c7767) {
        this.f18833 = list;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f18834;
        List<InterfaceC8049> list = this.f18833;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (InterfaceC8049 interfaceC8049 : list) {
                    interfaceC8049.getClass();
                    AbstractC5714 abstractC5714M10367 = AbstractC5725.m10367((AbstractC5714) interfaceC8049);
                    if (abstractC5714M10367 != null) {
                        arrayList.add(abstractC5714M10367);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public C7759(List list) {
        this.f18833 = list;
    }
}
