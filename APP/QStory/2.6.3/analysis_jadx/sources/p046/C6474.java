package p046;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6474 implements InterfaceC6481 {
    @Override // p046.InterfaceC6481
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return EmptyList.INSTANCE.iterator();
    }

    public final String toString() {
        return "EMPTY";
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6478 mo9517(C4687 c4687) {
        c4687.getClass();
        return null;
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final /* bridge */ boolean mo9518(C4687 c4687) {
        return AbstractC8190.m13700(this, c4687);
    }
}
