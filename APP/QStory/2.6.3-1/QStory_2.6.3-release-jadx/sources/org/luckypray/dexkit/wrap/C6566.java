package org.luckypray.dexkit.wrap;

import kotlin.jvm.internal.AbstractC5227;
import org.luckypray.dexkit.util.AbstractC6561;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6566 implements InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16072;

    public C6566(String str) {
        str.getClass();
        this.f16072 = AbstractC6561.m11690(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6566)) {
            return false;
        }
        return AbstractC5227.m9466(this.f16072, ((C6566) obj).f16072);
    }

    public final int hashCode() {
        return this.f16072.hashCode();
    }

    public final String toString() {
        return AbstractC6561.m11688(this.f16072);
    }
}
