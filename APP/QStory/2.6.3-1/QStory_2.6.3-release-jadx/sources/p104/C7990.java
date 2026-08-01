package p104;

import kotlin.jvm.internal.AbstractC5227;
import kotlinx.serialization.json.internal.AbstractC6317;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7990 extends AbstractC7977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8020 f19474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f19476;

    public C7990(Object obj, boolean z, InterfaceC8020 interfaceC8020) {
        obj.getClass();
        this.f19476 = z;
        this.f19474 = interfaceC8020;
        this.f19475 = obj.toString();
        if (interfaceC8020 == null || interfaceC8020.isInline()) {
            return;
        }
        C6755.m11869("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7990.class != obj.getClass()) {
            return false;
        }
        C7990 c7990 = (C7990) obj;
        return this.f19476 == c7990.f19476 && AbstractC5227.m9466(this.f19475, c7990.f19475);
    }

    public final int hashCode() {
        return this.f19475.hashCode() + (Boolean.hashCode(this.f19476) * 31);
    }

    @Override // p104.AbstractC7977
    public final String toString() {
        boolean z = this.f19476;
        String str = this.f19475;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC6317.m11201(sb, str);
        return sb.toString();
    }

    @Override // p104.AbstractC7977
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12981() {
        return this.f19476;
    }

    @Override // p104.AbstractC7977
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12982() {
        return this.f19475;
    }
}
