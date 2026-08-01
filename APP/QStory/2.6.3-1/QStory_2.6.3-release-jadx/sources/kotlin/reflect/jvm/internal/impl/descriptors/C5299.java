package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.C5743;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import p062.C7311;
import p062.InterfaceC7310;
import p064.C7346;
import p064.C7348;
import p082.AbstractC7699;
import p095.AbstractC7848;
import p095.C7811;
import p095.C7847;
import p117.C8084;
import p117.InterfaceC8083;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5299 extends AbstractC7848 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f13439;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5743 f13440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f13441;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5299(C5677 c5677, InterfaceC5310 interfaceC5310, C5523 c5523, boolean z, int i) {
        super(c5677, interfaceC5310, c5523, InterfaceC5294.f13436);
        interfaceC5310.getClass();
        this.f13441 = z;
        C7348 c7348M5627 = AbstractC3400.m5627(0, i);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c7348M5627, 10));
        Iterator it = c7348M5627.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                this.f13439 = arrayList;
                List listM9637 = AbstractC5323.m9637(this);
                int i2 = AbstractC5605.f14254;
                InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(this);
                interfaceC5318M12663.getClass();
                this.f13440 = new C5743(this, listM9637, AbstractC8568.m13614(interfaceC5318M12663.mo9620().m12584()), c5677);
                return;
            }
            int iNextInt = c7346.nextInt();
            arrayList.add(C7811.m12857(this, Variance.INVARIANT, C5523.m9889("T" + iNextInt), iNextInt, c5677));
        }
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return C7311.f18113;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 c5322 = AbstractC5321.f13461;
        c5322.getClass();
        return c5322;
    }

    @Override // p095.AbstractC7848, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return false;
    }

    @Override // p095.AbstractC7818
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC8083 mo9565() {
        return C8084.f19681;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        return this.f13440;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo9566() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo9567() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Modality mo9568() {
        return Modality.FINAL;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ClassKind mo9569() {
        return ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo9570() {
        return this.f13441;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo9571() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean mo9572() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean mo9573() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final List mo9574() {
        return this.f13439;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final boolean mo9575() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final boolean mo9576() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C7847 mo9577() {
        return null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final InterfaceC8083 mo9578(AbstractC5693 abstractC5693) {
        return C8084.f19681;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final AbstractC5291 mo9579() {
        return null;
    }
}
