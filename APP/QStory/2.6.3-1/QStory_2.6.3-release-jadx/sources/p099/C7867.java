package p099;

import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5424;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.storage.C5668;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5676;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7867 implements InterfaceC5307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5669 f19226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1171 f19227;

    public C7867(C7870 c7870) {
        this.f19227 = new C1171(c7870, C7869.f19232, new InitializedLazyImpl(null));
        C5677 c5677 = c7870.f19239;
        c5677.getClass();
        this.f19226 = new C5669(c5677, new ConcurrentHashMap(3, 1.0f, 2), new C5668(), 0);
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C7870) this.f19227.f1440).f19250;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5424 m12932(C5519 c5519) throws Throwable {
        ((C7870) this.f19227.f1440).f19238.getClass();
        c5519.getClass();
        C5860 c5860 = new C5860(this, 23, new C5267(c5519));
        C5669 c5669 = this.f19226;
        c5669.getClass();
        Object objInvoke = c5669.invoke(new C5676(c5860, c5519));
        if (objInvoke != null) {
            return (C5424) objInvoke;
        }
        C5669.m10127(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9511(C5519 c5519) {
        c5519.getClass();
        ((C7870) this.f19227.f1440).f19238.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9512(C5519 c5519, ArrayList arrayList) {
        c5519.getClass();
        arrayList.add(m12932(c5519));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9513(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        List list = (List) m12932(c5519).f13740.invoke();
        return list == null ? EmptyList.INSTANCE : list;
    }
}
