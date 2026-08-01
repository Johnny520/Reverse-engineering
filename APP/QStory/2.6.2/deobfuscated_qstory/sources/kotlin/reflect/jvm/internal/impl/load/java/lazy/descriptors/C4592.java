package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.name.C4690;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4592 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4451 f13397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4690 f13398;

    public C4592(C4690 c4690, C4451 c4451) {
        c4690.getClass();
        this.f13398 = c4690;
        this.f13397 = c4451;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4592) {
            return AbstractC4394.m8917(this.f13398, ((C4592) obj).f13398);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13398.hashCode();
    }
}
