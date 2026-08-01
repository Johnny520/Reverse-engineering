package kotlin.reflect.jvm.internal.types;

import io.ktor.util.C4210;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import p097.InterfaceC7222;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4924 extends AbstractC4925 implements InterfaceC7222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14258;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5086 f14259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4923 f14260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4924(InterfaceC5086 interfaceC5086, C4923 c4923, boolean z) {
        super(CapturedKType$1.INSTANCE);
        c4923.getClass();
        this.f14259 = interfaceC5086;
        this.f14260 = c4923;
        this.f14258 = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4924)) {
            return false;
        }
        C4924 c4924 = (C4924) obj;
        return AbstractC4394.m8917(this.f14259, c4924.f14259) && AbstractC4394.m8917(this.f14260, c4924.f14260) && this.f14258 == c4924.f14258;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    public final int hashCode() {
        InterfaceC5086 interfaceC5086 = this.f14259;
        int iHashCode = interfaceC5086 != null ? interfaceC5086.hashCode() : 0;
        return Boolean.hashCode(this.f14258) + ((this.f14260.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    public final String toString() {
        return this.f14260.toString();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC4925 mo9916() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC4925 mo9917(boolean z) {
        return z == this.f14258 ? this : new C4924(this.f14259, this.f14260, z);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC4925 mo9918(boolean z) {
        if (!z) {
            return this;
        }
        C4210.m8605(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC4925 mo9919() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean mo9920() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8906() {
        return this.f14258;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5086 mo9921() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8908() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean mo9922() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5091 mo8909() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo9923() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5092 mo9924() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo9925() {
        return false;
    }
}
