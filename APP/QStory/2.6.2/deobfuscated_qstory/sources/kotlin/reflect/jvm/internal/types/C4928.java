package kotlin.reflect.jvm.internal.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.InterfaceC5010;
import kotlin.text.AbstractC5143;
import p052.InterfaceC6557;
import p097.InterfaceC7230;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4928 implements InterfaceC5092, InterfaceC5010, InterfaceC7230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5092 f14277;

    public C4928(InterfaceC5092 interfaceC5092, String str, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        interfaceC5092.getClass();
        str.getClass();
        this.f14277 = interfaceC5092;
        this.f14275 = str;
        this.f14276 = (List) interfaceC6557.invoke(this);
        this.f14274 = (List) interfaceC65572.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4928) {
            return AbstractC4394.m8917(this.f14277, ((C4928) obj).f14277);
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return this.f14277.getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final String getSimpleName() {
        return AbstractC5143.m10141(this.f14275, ".");
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final List getTypeParameters() {
        return this.f14276;
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final int hashCode() {
        return this.f14277.hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final boolean isInstance(Object obj) {
        return this.f14277.isInstance(obj);
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f14277 + ')';
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8887() {
        return this.f14277.mo8887();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo8888() {
        return this.f14277.mo8888();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo8890() {
        return this.f14277.mo8890();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8891() {
        return this.f14274;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8892() {
        return this.f14277.mo8892();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo8893() {
        return this.f14277.mo8893();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo8894() {
        return this.f14277.mo8894();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8895() {
        return this.f14275;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8896() {
        return this.f14277.mo8896();
    }
}
