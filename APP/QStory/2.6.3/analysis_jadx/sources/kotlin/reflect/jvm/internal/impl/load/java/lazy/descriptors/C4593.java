package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.name.C4691;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4593 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4452 f13401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4691 f13402;

    public C4593(C4691 c4691, C4452 c4452) {
        c4691.getClass();
        this.f13402 = c4691;
        this.f13401 = c4452;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4593) {
            return AbstractC4395.m8907(this.f13402, ((C4593) obj).f13402);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13402.hashCode();
    }
}
