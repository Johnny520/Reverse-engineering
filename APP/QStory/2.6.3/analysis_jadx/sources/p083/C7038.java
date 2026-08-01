package p083;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4592;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7038 implements InterfaceC4475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4837 f18881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0325 f18882;

    public C7038(C7041 c7041) {
        this.f18882 = new C0325(c7041, C7040.f18887, new InitializedLazyImpl(null));
        C4845 c4845 = c7041.f18894;
        c4845.getClass();
        this.f18881 = new C4837(c4845, new ConcurrentHashMap(3, 1.0f, 2), new C4836(), 0);
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C7041) this.f18882.f1095).f18905;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4592 m12373(C4687 c4687) throws Throwable {
        ((C7041) this.f18882.f1095).f18893.getClass();
        c4687.getClass();
        C5028 c5028 = new C5028(this, 23, new C4435(c4687));
        C4837 c4837 = this.f18881;
        c4837.getClass();
        Object objInvoke = c4837.invoke(new C4844(c5028, c4687));
        if (objInvoke != null) {
            return (C4592) objInvoke;
        }
        C4837.m9568(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8952(C4687 c4687) {
        c4687.getClass();
        ((C7041) this.f18882.f1095).f18893.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8953(C4687 c4687, ArrayList arrayList) {
        c4687.getClass();
        arrayList.add(m12373(c4687));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8954(C4687 c4687, InterfaceC6558 interfaceC6558) {
        c4687.getClass();
        List list = (List) m12373(c4687).f13395.invoke();
        return list == null ? EmptyList.INSTANCE : list;
    }
}
