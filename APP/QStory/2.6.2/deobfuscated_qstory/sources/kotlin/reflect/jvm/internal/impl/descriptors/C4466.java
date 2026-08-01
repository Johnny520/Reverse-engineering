package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.C4910;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p000.AbstractC6087;
import p046.C6481;
import p046.InterfaceC6480;
import p048.C6516;
import p048.C6518;
import p066.AbstractC6869;
import p079.AbstractC7018;
import p079.C6981;
import p079.C7017;
import p101.C7254;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4466 extends AbstractC7018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f13090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4910 f13091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f13092;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4466(C4844 c4844, InterfaceC4477 interfaceC4477, C4690 c4690, boolean z, int i) {
        super(c4844, interfaceC4477, c4690, InterfaceC4461.f13087);
        interfaceC4477.getClass();
        this.f13092 = z;
        C6518 c6518M11422 = AbstractC6087.m11422(0, i);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c6518M11422, 10));
        Iterator it = c6518M11422.iterator();
        while (true) {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                this.f13090 = arrayList;
                List listM9088 = AbstractC4490.m9088(this);
                int i2 = AbstractC4772.f13905;
                InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(this);
                interfaceC4485M12076.getClass();
                this.f13091 = new C4910(this, listM9088, AbstractC0455.m1140(interfaceC4485M12076.mo9071().m11982()), c4844);
                return;
            }
            int iNextInt = c6516.nextInt();
            arrayList.add(C6981.m12271(this, Variance.INVARIANT, C4690.m9340("T" + iNextInt), iNextInt, c4844));
        }
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return C6481.f17772;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13112;
        c4489.getClass();
        return c4489;
    }

    @Override // p079.AbstractC7018, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC7253 mo9016() {
        return C7254.f19341;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        return this.f13091;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo9017() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo9018() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Modality mo9019() {
        return Modality.FINAL;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ClassKind mo9020() {
        return ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo9021() {
        return this.f13092;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo9022() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean mo9023() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean mo9024() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final List mo9025() {
        return this.f13090;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final boolean mo9026() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final boolean mo9027() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C7017 mo9028() {
        return null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final InterfaceC7253 mo9029(AbstractC4860 abstractC4860) {
        return C7254.f19341;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final AbstractC4458 mo9030() {
        return null;
    }
}
