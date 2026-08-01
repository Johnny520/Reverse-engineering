package p062;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7303 implements InterfaceC7310 {
    @Override // p062.InterfaceC7310
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

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC7307 mo10076(C5519 c5519) {
        c5519.getClass();
        return null;
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final /* bridge */ boolean mo10077(C5519 c5519) {
        return AbstractC9019.m14259(this, c5519);
    }
}
