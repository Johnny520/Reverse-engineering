package kotlin.reflect.jvm.internal.types;

import com.bumptech.glide.AbstractC3057;
import java.util.List;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4927 extends AbstractC4926 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5093 f14264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f14265;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f14267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f14268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5087 f14269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5092 f14271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14272;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4927(InterfaceC5092 interfaceC5092, List list, boolean z, List list2, InterfaceC5087 interfaceC5087, boolean z2, boolean z3, boolean z4, InterfaceC5093 interfaceC5093, InterfaceC6543 interfaceC6543) {
        super(interfaceC6543);
        interfaceC5092.getClass();
        list.getClass();
        list2.getClass();
        this.f14271 = interfaceC5092;
        this.f14272 = list;
        this.f14266 = z;
        this.f14265 = list2;
        this.f14269 = interfaceC5087;
        this.f14270 = z2;
        this.f14267 = z3;
        this.f14268 = z4;
        this.f14264 = interfaceC5093;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return this.f14265;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4926 mo9913() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4926 mo9914(boolean z) {
        InterfaceC5092 interfaceC5092 = this.f14271;
        boolean z2 = interfaceC5092 instanceof InterfaceC5093;
        InterfaceC5092 interfaceC5092Mo8917 = interfaceC5092;
        if (z2) {
            InterfaceC5093 interfaceC5093 = (InterfaceC5093) interfaceC5092;
            if (z) {
                interfaceC5092Mo8917 = AbstractC4396.f12975.mo8917(AbstractC3057.m6757(interfaceC5093));
            } else {
                Class clsM6750 = AbstractC3057.m6750(interfaceC5093);
                interfaceC5092Mo8917 = interfaceC5093;
                if (clsM6750 != null) {
                    interfaceC5092Mo8917 = AbstractC4396.f12975.mo8917(clsM6750);
                }
            }
        }
        return new C4927(interfaceC5092Mo8917, this.f14272, z, this.f14265, this.f14269, false, this.f14267, this.f14268, this.f14264, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4926 mo9915(boolean z) {
        return new C4927(this.f14271, this.f14272, this.f14266 && !z, this.f14265, this.f14269, z, this.f14267, this.f14268, this.f14264, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4926 mo9916() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9917() {
        return this.f14268;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8896() {
        return this.f14266;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5087 mo9918() {
        return this.f14269;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8898() {
        return this.f14272;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9919() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5092 mo8899() {
        return this.f14271;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9920() {
        return this.f14267;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5093 mo9921() {
        return this.f14264;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9922() {
        return this.f14270;
    }
}
