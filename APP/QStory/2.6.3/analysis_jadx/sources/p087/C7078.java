package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5139;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7078 implements InterfaceC7191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7191 f18988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7191 f18989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18990;

    public C7078(String str, InterfaceC7191 interfaceC7191, InterfaceC7191 interfaceC71912) {
        this.f18990 = str;
        this.f18989 = interfaceC7191;
        this.f18988 = interfaceC71912;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7078)) {
            return false;
        }
        C7078 c7078 = (C7078) obj;
        return this.f18990.equals(c7078.f18990) && this.f18989.equals(c7078.f18989) && this.f18988.equals(c7078.f18988);
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return C7198.f19208;
    }

    public final int hashCode() {
        return this.f18988.hashCode() + ((this.f18989.hashCode() + (this.f18990.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f18990 + '(' + this.f18989 + ", " + this.f18988 + ')';
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return String.valueOf(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return 2;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        Integer numM10140 = AbstractC5139.m10140(str);
        if (numM10140 != null) {
            return numM10140.intValue();
        }
        C5925.m11310(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f18990;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        if (i < 0) {
            C5925.m11314(AbstractC0053.m151(AbstractC0053.m150(i, "Illegal index ", ", "), this.f18990, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f18989;
        }
        if (i2 == 1) {
            return this.f18988;
        }
        C5925.m11311("Unreached");
        return null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C5925.m11314(AbstractC0053.m151(AbstractC0053.m150(i, "Illegal index ", ", "), this.f18990, " expects only non-negative indices"));
        return null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        if (i >= 0) {
            return false;
        }
        C5925.m11314(AbstractC0053.m151(AbstractC0053.m150(i, "Illegal index ", ", "), this.f18990, " expects only non-negative indices"));
        return false;
    }
}
