package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5267 extends AbstractC5273 implements InterfaceC7857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 f13410;

    public C5267(C5519 c5519) {
        c5519.getClass();
        this.f13410 = c5519;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5267) {
            return AbstractC5227.m9466(this.f13410, ((C5267) obj).f13410);
        }
        return false;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f13410.hashCode();
    }

    public final String toString() {
        return C5267.class.getName() + ": " + this.f13410;
    }

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5262 mo9531(C5519 c5519) {
        c5519.getClass();
        return null;
    }
}
