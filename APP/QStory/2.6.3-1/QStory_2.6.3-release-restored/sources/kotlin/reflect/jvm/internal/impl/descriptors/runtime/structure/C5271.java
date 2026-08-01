package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5271 extends AbstractC5269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f13413 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f13414;

    public C5271(Class cls) {
        this.f13414 = cls;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return this.f13413;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo9530() {
        return this.f13414;
    }
}
