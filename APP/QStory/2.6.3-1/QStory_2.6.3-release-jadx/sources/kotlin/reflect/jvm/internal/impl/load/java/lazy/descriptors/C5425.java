package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.name.C5523;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5284 f13746;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5523 f13747;

    public C5425(C5523 c5523, C5284 c5284) {
        c5523.getClass();
        this.f13747 = c5523;
        this.f13746 = c5284;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5425) {
            return AbstractC5227.m9466(this.f13747, ((C5425) obj).f13747);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13747.hashCode();
    }
}
