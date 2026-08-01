package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4438 extends AbstractC4436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f13064 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f13065;

    public C4438(Class cls) {
        this.f13065 = cls;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return this.f13064;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo8981() {
        return this.f13065;
    }
}
