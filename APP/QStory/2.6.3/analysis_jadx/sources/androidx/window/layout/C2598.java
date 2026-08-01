package androidx.window.layout;

import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f7780;

    public C2598(List list) {
        list.getClass();
        this.f7780 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2598.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC4395.m8907(this.f7780, ((C2598) obj).f7780);
    }

    public final int hashCode() {
        return this.f7780.hashCode();
    }

    public final String toString() {
        return AbstractC4344.m8810(this.f7780, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
