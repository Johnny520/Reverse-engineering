package p061;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5833;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import p062.C7311;
import p062.InterfaceC7310;
import p064.C7346;
import p064.C7348;
import p065.AbstractC7355;
import p095.AbstractC7829;
import p095.C7811;
import p095.C7847;
import p117.C8084;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7294 extends AbstractC7829 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f18082;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5833 f18083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5677 f18084;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f18085;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7295 f18086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5298 f18087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC7302 f18088;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5520 f18081 = new C5520(AbstractC7355.f18198, C5523.m9889("Function"));

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5520 f18080 = new C5520(AbstractC7355.f18199, C5523.m9889("KFunction"));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7294(C5677 c5677, C5610 c5610, AbstractC7302 abstractC7302, int i) {
        super(c5677, abstractC7302.m12551(i));
        c5610.getClass();
        this.f18084 = c5677;
        this.f18087 = c5610;
        this.f18088 = abstractC7302;
        this.f18085 = i;
        this.f18086 = new C7295(this);
        this.f18083 = new C5833(c5677, this, 1);
        ArrayList arrayList = new ArrayList();
        C7348 c7348 = new C7348(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(c7348, 10));
        Iterator it = c7348.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                break;
            }
            int iNextInt = c7346.nextInt();
            arrayList.add(C7811.m12857(this, Variance.IN_VARIANCE, C5523.m9889("P" + iNextInt), arrayList.size(), this.f18084));
            arrayList2.add(C6008.f15084);
        }
        arrayList.add(C7811.m12857(this, Variance.OUT_VARIANCE, C5523.m9889("R"), arrayList.size(), this.f18084));
        this.f18082 = AbstractC5176.m9356(arrayList);
        C7293 c7293 = FunctionClassKind.Companion;
        AbstractC7302 abstractC73022 = this.f18088;
        c7293.getClass();
        abstractC73022.getClass();
        if (abstractC73022.equals(C7291.f18079) || abstractC73022.equals(C7301.f18099) || abstractC73022.equals(C7298.f18093)) {
            return;
        }
        abstractC73022.equals(C7297.f18092);
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return false;
    }

    @Override // p095.AbstractC7818
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        String strM9894 = getName().m9894();
        strM9894.getClass();
        return strM9894;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final /* bridge */ /* synthetic */ InterfaceC8083 mo9565() {
        return C8084.f19681;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        return this.f18086;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9566() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9585() {
        return InterfaceC5294.f13436;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        return Modality.ABSTRACT;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9569() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        return this.f18087;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9570() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9571() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9572() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9573() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9574() {
        return this.f18082;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9576() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final /* bridge */ /* synthetic */ C7847 mo9577() {
        return null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC8083 mo9578(AbstractC5693 abstractC5693) {
        return this.f18083;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5291 mo9579() {
        return null;
    }
}
