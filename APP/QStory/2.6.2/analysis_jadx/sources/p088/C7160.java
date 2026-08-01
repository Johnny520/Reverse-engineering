package p088;

import kotlin.jvm.internal.AbstractC4394;
import kotlinx.serialization.json.internal.AbstractC5484;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7160 extends AbstractC7147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7190 f19134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19135;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f19136;

    public C7160(Object obj, boolean z, InterfaceC7190 interfaceC7190) {
        obj.getClass();
        this.f19136 = z;
        this.f19134 = interfaceC7190;
        this.f19135 = obj.toString();
        if (interfaceC7190 == null || interfaceC7190.isInline()) {
            return;
        }
        C5919.m11249("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7160.class != obj.getClass()) {
            return false;
        }
        C7160 c7160 = (C7160) obj;
        return this.f19136 == c7160.f19136 && AbstractC4394.m8917(this.f19135, c7160.f19135);
    }

    public final int hashCode() {
        return this.f19135.hashCode() + (Boolean.hashCode(this.f19136) * 31);
    }

    @Override // p088.AbstractC7147
    public final String toString() {
        boolean z = this.f19136;
        String str = this.f19135;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC5484.m10638(sb, str);
        return sb.toString();
    }

    @Override // p088.AbstractC7147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12395() {
        return this.f19136;
    }

    @Override // p088.AbstractC7147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12396() {
        return this.f19135;
    }
}
