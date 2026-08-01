package androidx.window.layout;

import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f8125;

    public C3431(List list) {
        list.getClass();
        this.f8125 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C3431.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC5227.m9466(this.f8125, ((C3431) obj).f8125);
    }

    public final int hashCode() {
        return this.f8125.hashCode();
    }

    public final String toString() {
        return AbstractC5176.m9369(this.f8125, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
