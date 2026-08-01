package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.window.area.AbstractC2567;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.C4911;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import p046.C6482;
import p046.InterfaceC6481;
import p048.C6517;
import p048.C6519;
import p066.AbstractC6870;
import p079.AbstractC7019;
import p079.C6982;
import p079.C7018;
import p101.C7255;
import p101.InterfaceC7254;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4467 extends AbstractC7019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f13094;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4911 f13095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f13096;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4467(C4845 c4845, InterfaceC4478 interfaceC4478, C4691 c4691, boolean z, int i) {
        super(c4845, interfaceC4478, c4691, InterfaceC4462.f13091);
        interfaceC4478.getClass();
        this.f13096 = z;
        C6519 c6519M5067 = AbstractC2567.m5067(0, i);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c6519M5067, 10));
        Iterator it = c6519M5067.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                this.f13094 = arrayList;
                List listM9078 = AbstractC4491.m9078(this);
                int i2 = AbstractC4773.f13909;
                InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(this);
                interfaceC4486M12104.getClass();
                this.f13095 = new C4911(this, listM9078, AbstractC7739.m13055(interfaceC4486M12104.mo9061().m12025()), c4845);
                return;
            }
            int iNextInt = c6517.nextInt();
            arrayList.add(C6982.m12298(this, Variance.INVARIANT, C4691.m9330("T" + iNextInt), iNextInt, c4845));
        }
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return C6482.f17768;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        C4490 c4490 = AbstractC4489.f13116;
        c4490.getClass();
        return c4490;
    }

    @Override // p079.AbstractC7019, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC6989
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC7254 mo9006() {
        return C7255.f19336;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        return this.f13095;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo9007() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo9008() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Modality mo9009() {
        return Modality.FINAL;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ClassKind mo9010() {
        return ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo9011() {
        return this.f13096;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo9012() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean mo9013() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean mo9014() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final List mo9015() {
        return this.f13094;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final boolean mo9017() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C7018 mo9018() {
        return null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final InterfaceC7254 mo9019(AbstractC4861 abstractC4861) {
        return C7255.f19336;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final AbstractC4459 mo9020() {
        return null;
    }
}
