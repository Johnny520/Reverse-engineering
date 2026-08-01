package p083;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4591;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.storage.C4835;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7037 implements InterfaceC4474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4836 f18886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0325 f18887;

    public C7037(C7040 c7040) {
        this.f18887 = new C0325(c7040, C7039.f18892, new InitializedLazyImpl(null));
        C4844 c4844 = c7040.f18899;
        c4844.getClass();
        this.f18886 = new C4836(c4844, new ConcurrentHashMap(3, 1.0f, 2), new C4835(), 0);
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C7040) this.f18887.f1095).f18910;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4591 m12346(C4686 c4686) throws Throwable {
        ((C7040) this.f18887.f1095).f18898.getClass();
        c4686.getClass();
        C5027 c5027 = new C5027(this, 23, new C4434(c4686));
        C4836 c4836 = this.f18886;
        c4836.getClass();
        Object objInvoke = c4836.invoke(new C4843(c5027, c4686));
        if (objInvoke != null) {
            return (C4591) objInvoke;
        }
        C4836.m9578(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8962(C4686 c4686) {
        c4686.getClass();
        ((C7040) this.f18887.f1095).f18898.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8963(C4686 c4686, ArrayList arrayList) {
        c4686.getClass();
        arrayList.add(m12346(c4686));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8964(C4686 c4686, InterfaceC6557 interfaceC6557) {
        c4686.getClass();
        List list = (List) m12346(c4686).f13391.invoke();
        return list == null ? EmptyList.INSTANCE : list;
    }
}
