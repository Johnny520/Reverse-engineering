package p046;

import io.ktor.client.plugins.AbstractC3932;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C4686;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6473 implements InterfaceC6480 {
    @Override // p046.InterfaceC6480
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

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6477 mo9527(C4686 c4686) {
        c4686.getClass();
        return null;
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final /* bridge */ boolean mo9528(C4686 c4686) {
        return AbstractC3932.m8314(this, c4686);
    }
}
