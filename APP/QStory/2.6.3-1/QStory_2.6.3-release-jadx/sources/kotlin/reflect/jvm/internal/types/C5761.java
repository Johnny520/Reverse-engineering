package kotlin.reflect.jvm.internal.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.InterfaceC5843;
import kotlin.text.AbstractC5976;
import p068.InterfaceC7387;
import p113.InterfaceC8060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5761 implements InterfaceC5925, InterfaceC5843, InterfaceC8060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5925 f14624;

    public C5761(InterfaceC5925 interfaceC5925, String str, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        interfaceC5925.getClass();
        str.getClass();
        this.f14624 = interfaceC5925;
        this.f14622 = str;
        this.f14623 = (List) interfaceC7387.invoke(this);
        this.f14621 = (List) interfaceC73872.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5761) {
            return AbstractC5227.m9466(this.f14624, ((C5761) obj).f14624);
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return this.f14624.getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final String getSimpleName() {
        return AbstractC5976.m10715(this.f14622, ".");
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final List getTypeParameters() {
        return this.f14623;
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final int hashCode() {
        return this.f14624.hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final boolean isInstance(Object obj) {
        return this.f14624.isInstance(obj);
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f14624 + ')';
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9436() {
        return this.f14624.mo9436();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo9437() {
        return this.f14624.mo9437();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo9439() {
        return this.f14624.mo9439();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo9440() {
        return this.f14621;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9441() {
        return this.f14624.mo9441();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo9442() {
        return this.f14624.mo9442();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo9443() {
        return this.f14624.mo9443();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo9444() {
        return this.f14622;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9445() {
        return this.f14624.mo9445();
    }
}
