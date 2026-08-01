package org.luckypray.dexkit.wrap;

import kotlin.jvm.internal.AbstractC4395;
import org.luckypray.dexkit.util.AbstractC5731;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5736 implements InterfaceC5733 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15727;

    public C5736(String str) {
        str.getClass();
        this.f15727 = AbstractC5731.m11131(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5736)) {
            return false;
        }
        return AbstractC4395.m8907(this.f15727, ((C5736) obj).f15727);
    }

    public final int hashCode() {
        return this.f15727.hashCode();
    }

    public final String toString() {
        return AbstractC5731.m11129(this.f15727);
    }
}
