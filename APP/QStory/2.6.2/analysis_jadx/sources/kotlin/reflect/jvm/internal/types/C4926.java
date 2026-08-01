package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6542;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4926 extends AbstractC4925 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5092 f14262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f14263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f14265;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f14266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5086 f14267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5091 f14269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14270;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4926(InterfaceC5091 interfaceC5091, List list, boolean z, List list2, InterfaceC5086 interfaceC5086, boolean z2, boolean z3, boolean z4, InterfaceC5092 interfaceC5092, InterfaceC6542 interfaceC6542) {
        super(interfaceC6542);
        interfaceC5091.getClass();
        list.getClass();
        list2.getClass();
        this.f14269 = interfaceC5091;
        this.f14270 = list;
        this.f14264 = z;
        this.f14263 = list2;
        this.f14267 = interfaceC5086;
        this.f14268 = z2;
        this.f14265 = z3;
        this.f14266 = z4;
        this.f14262 = interfaceC5092;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return this.f14263;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4925 mo9916() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4925 mo9917(boolean z) {
        InterfaceC5091 interfaceC5091 = this.f14269;
        boolean z2 = interfaceC5091 instanceof InterfaceC5092;
        InterfaceC5091 interfaceC5091Mo8927 = interfaceC5091;
        if (z2) {
            InterfaceC5092 interfaceC5092 = (InterfaceC5092) interfaceC5091;
            if (z) {
                interfaceC5091Mo8927 = AbstractC4395.f12971.mo8927(AbstractC6560.m12026(interfaceC5092));
            } else {
                Class clsM12027 = AbstractC6560.m12027(interfaceC5092);
                interfaceC5091Mo8927 = interfaceC5092;
                if (clsM12027 != null) {
                    interfaceC5091Mo8927 = AbstractC4395.f12971.mo8927(clsM12027);
                }
            }
        }
        return new C4926(interfaceC5091Mo8927, this.f14270, z, this.f14263, this.f14267, false, this.f14265, this.f14266, this.f14262, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4925 mo9918(boolean z) {
        return new C4926(this.f14269, this.f14270, this.f14264 && !z, this.f14263, this.f14267, z, this.f14265, this.f14266, this.f14262, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4925 mo9919() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9920() {
        return this.f14266;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8906() {
        return this.f14264;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5086 mo9921() {
        return this.f14267;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8908() {
        return this.f14270;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9922() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5091 mo8909() {
        return this.f14269;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9923() {
        return this.f14265;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5092 mo9924() {
        return this.f14262;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9925() {
        return this.f14268;
    }
}
