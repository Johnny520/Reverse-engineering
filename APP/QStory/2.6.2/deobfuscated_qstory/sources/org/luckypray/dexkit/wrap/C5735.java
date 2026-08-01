package org.luckypray.dexkit.wrap;

import kotlin.jvm.internal.AbstractC4394;
import org.luckypray.dexkit.util.AbstractC5730;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5735 implements InterfaceC5732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15727;

    public C5735(String str) {
        str.getClass();
        this.f15727 = AbstractC5730.m11074(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5735)) {
            return false;
        }
        return AbstractC4394.m8917(this.f15727, ((C5735) obj).f15727);
    }

    public final int hashCode() {
        return this.f15727.hashCode();
    }

    public final String toString() {
        return AbstractC5730.m11072(this.f15727);
    }
}
