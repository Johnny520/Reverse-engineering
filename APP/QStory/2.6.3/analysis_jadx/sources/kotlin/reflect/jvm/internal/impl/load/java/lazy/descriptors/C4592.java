package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.core.view.C2242;
import androidx.window.area.AbstractC2567;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.storage.C4839;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p046.C6482;
import p046.InterfaceC6481;
import p070.C6898;
import p079.AbstractC6986;
import p083.C7041;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4592 extends AbstractC6986 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13393 = {new PropertyReference1Impl(C4592.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new PropertyReference1Impl(C4592.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC6481 f13394;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4839 f13395;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4580 f13396;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4847 f13397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0325 f13398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6898 f13399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4435 f13400;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4592(C0325 c0325, C4435 c4435) {
        c0325.getClass();
        C7041 c7041 = (C7041) c0325.f1095;
        super(c7041.f18905, c4435.f13065);
        this.f13400 = c4435;
        C0325 c0325M1174 = AbstractC0455.m1174(c0325, this, null, 6);
        this.f13398 = c0325M1174;
        c7041.f18891.m9256().f14090.getClass();
        this.f13399 = C6898.f18356;
        C7041 c70412 = (C7041) c0325M1174.f1095;
        C4845 c4845 = c70412.f18894;
        C4594 c4594 = new C4594(this, 0);
        c4845.getClass();
        this.f13397 = new C4847(c4845, c4594);
        this.f13396 = new C4580(c0325M1174, c4435, this);
        C4594 c45942 = new C4594(this, 1);
        EmptyList emptyList = EmptyList.INSTANCE;
        c4845.getClass();
        if (emptyList == null) {
            C4845.m9577(27);
            throw null;
        }
        this.f13395 = new C4839(c4845, c45942, emptyList);
        this.f13394 = c70412.f18900.f22245 ? C6482.f17768 : AbstractC2567.m5060(c0325M1174, c4435);
        c4845.m9580(new C4594(this, 2));
    }

    @Override // androidx.compose.runtime.AbstractC1332, p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return this.f13394;
    }

    @Override // p079.AbstractC6986, p079.AbstractC7009
    public final String toString() {
        return "Lazy Java package fragment: " + this.f18687 + " of module " + ((C7041) this.f13398.f1095).f18905;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo8950() {
        return this.f13396;
    }

    @Override // p079.AbstractC6986, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9026() {
        return new C2242(this, 20);
    }
}
