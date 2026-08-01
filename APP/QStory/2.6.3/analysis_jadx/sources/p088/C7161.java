package p088;

import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.json.internal.AbstractC5485;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7161 extends AbstractC7148 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7191 f19129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f19131;

    public C7161(Object obj, boolean z, InterfaceC7191 interfaceC7191) {
        obj.getClass();
        this.f19131 = z;
        this.f19129 = interfaceC7191;
        this.f19130 = obj.toString();
        if (interfaceC7191 == null || interfaceC7191.isInline()) {
            return;
        }
        C5925.m11310("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7161.class != obj.getClass()) {
            return false;
        }
        C7161 c7161 = (C7161) obj;
        return this.f19131 == c7161.f19131 && AbstractC4395.m8907(this.f19130, c7161.f19130);
    }

    public final int hashCode() {
        return this.f19130.hashCode() + (Boolean.hashCode(this.f19131) * 31);
    }

    @Override // p088.AbstractC7148
    public final String toString() {
        boolean z = this.f19131;
        String str = this.f19130;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC5485.m10642(sb, str);
        return sb.toString();
    }

    @Override // p088.AbstractC7148
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12422() {
        return this.f19131;
    }

    @Override // p088.AbstractC7148
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12423() {
        return this.f19130;
    }
}
