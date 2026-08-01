package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4435 extends AbstractC4441 implements InterfaceC7028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f13065;

    public C4435(C4687 c4687) {
        c4687.getClass();
        this.f13065 = c4687;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4435) {
            return AbstractC4395.m8907(this.f13065, ((C4435) obj).f13065);
        }
        return false;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return this.f13065.hashCode();
    }

    public final String toString() {
        return C4435.class.getName() + ": " + this.f13065;
    }

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4430 mo8972(C4687 c4687) {
        c4687.getClass();
        return null;
    }
}
