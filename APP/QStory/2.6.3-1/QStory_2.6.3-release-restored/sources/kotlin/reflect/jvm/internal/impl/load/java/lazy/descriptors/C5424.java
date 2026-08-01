package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.core.view.C3075;
import androidx.window.area.AbstractC3400;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.storage.C5671;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p062.C7311;
import p062.InterfaceC7310;
import p086.C7727;
import p095.AbstractC7815;
import p099.C7870;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5424 extends AbstractC7815 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13738 = {new PropertyReference1Impl(C5424.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new PropertyReference1Impl(C5424.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC7310 f13739;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5671 f13740;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5412 f13741;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5679 f13742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1171 f13743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7727 f13744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5267 f13745;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5424(C1171 c1171, C5267 c5267) {
        c1171.getClass();
        C7870 c7870 = (C7870) c1171.f1440;
        super(c7870.f19250, c5267.f13410);
        this.f13745 = c5267;
        C1171 c1171M1734 = AbstractC1298.m1734(c1171, this, null, 6);
        this.f13743 = c1171M1734;
        c7870.f19236.m9815().f14435.getClass();
        this.f13744 = C7727.f18701;
        C7870 c78702 = (C7870) c1171M1734.f1440;
        C5677 c5677 = c78702.f19239;
        C5426 c5426 = new C5426(this, 0);
        c5677.getClass();
        this.f13742 = new C5679(c5677, c5426);
        this.f13741 = new C5412(c1171M1734, c5267, this);
        C5426 c54262 = new C5426(this, 1);
        EmptyList emptyList = EmptyList.INSTANCE;
        c5677.getClass();
        if (emptyList == null) {
            C5677.m10136(27);
            throw null;
        }
        this.f13740 = new C5671(c5677, c54262, emptyList);
        this.f13739 = c78702.f19245.f22590 ? C7311.f18113 : AbstractC3400.m5620(c1171M1734, c5267);
        c5677.m10139(new C5426(this, 2));
    }

    @Override // androidx.compose.runtime.AbstractC2167, p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return this.f13739;
    }

    @Override // p095.AbstractC7815, p095.AbstractC7838
    public final String toString() {
        return "Lazy Java package fragment: " + this.f19032 + " of module " + ((C7870) this.f13743.f1440).f19250;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo9509() {
        return this.f13741;
    }

    @Override // p095.AbstractC7815, p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9585() {
        return new C3075(this, 20);
    }
}
