package androidx.window.layout;

import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2597 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f7778;

    public C2597(List list) {
        list.getClass();
        this.f7778 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2597.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC4394.m8917(this.f7778, ((C2597) obj).f7778);
    }

    public final int hashCode() {
        return this.f7778.hashCode();
    }

    public final String toString() {
        return AbstractC4343.m8813(this.f7778, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
