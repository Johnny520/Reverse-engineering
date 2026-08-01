package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4149 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12575;

    public C4149(String str) {
        str.getClass();
        this.f12575 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4149) && AbstractC4395.m8907(this.f12575, ((C4149) obj).f12575);
    }

    public final int hashCode() {
        return this.f12575.hashCode();
    }

    public final String toString() {
        return this.f12575;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        List list = c4142.f12553;
        return (i >= list.size() || !AbstractC4395.m8907(list.get(i), this.f12575)) ? AbstractC4160.f12605 : AbstractC4160.f12600;
    }
}
