package kotlin.reflect.jvm.internal.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.InterfaceC5011;
import kotlin.text.AbstractC5144;
import p052.InterfaceC6558;
import p097.InterfaceC7231;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4929 implements InterfaceC5093, InterfaceC5011, InterfaceC7231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5093 f14279;

    public C4929(InterfaceC5093 interfaceC5093, String str, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        interfaceC5093.getClass();
        str.getClass();
        this.f14279 = interfaceC5093;
        this.f14277 = str;
        this.f14278 = (List) interfaceC6558.invoke(this);
        this.f14276 = (List) interfaceC65582.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4929) {
            return AbstractC4395.m8907(this.f14279, ((C4929) obj).f14279);
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return this.f14279.getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getSimpleName() {
        return AbstractC5144.m10156(this.f14277, ".");
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        return this.f14278;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final int hashCode() {
        return this.f14279.hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isInstance(Object obj) {
        return this.f14279.isInstance(obj);
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f14279 + ')';
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8877() {
        return this.f14279.mo8877();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo8878() {
        return this.f14279.mo8878();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo8880() {
        return this.f14279.mo8880();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8881() {
        return this.f14276;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8882() {
        return this.f14279.mo8882();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo8883() {
        return this.f14279.mo8883();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo8884() {
        return this.f14279.mo8884();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8885() {
        return this.f14277;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8886() {
        return this.f14279.mo8886();
    }
}
