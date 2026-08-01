package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4434 extends AbstractC4440 implements InterfaceC7027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f13061;

    public C4434(C4686 c4686) {
        c4686.getClass();
        this.f13061 = c4686;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4434) {
            return AbstractC4394.m8917(this.f13061, ((C4434) obj).f13061);
        }
        return false;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f13061.hashCode();
    }

    public final String toString() {
        return C4434.class.getName() + ": " + this.f13061;
    }

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4429 mo8982(C4686 c4686) {
        c4686.getClass();
        return null;
    }
}
