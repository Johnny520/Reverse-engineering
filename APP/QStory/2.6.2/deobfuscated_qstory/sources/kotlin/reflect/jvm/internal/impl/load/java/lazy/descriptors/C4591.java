package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.core.view.C2242;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.storage.C4838;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p046.C6481;
import p046.InterfaceC6480;
import p070.C6897;
import p079.AbstractC6985;
import p083.C7040;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4591 extends AbstractC6985 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13389 = {new PropertyReference1Impl(C4591.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new PropertyReference1Impl(C4591.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC6480 f13390;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4838 f13391;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4579 f13392;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4846 f13393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0325 f13394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6897 f13395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4434 f13396;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4591(C0325 c0325, C4434 c4434) {
        c0325.getClass();
        C7040 c7040 = (C7040) c0325.f1095;
        super(c7040.f18910, c4434.f13061);
        this.f13396 = c4434;
        C0325 c0325M11416 = AbstractC6087.m11416(c0325, this, null, 6);
        this.f13394 = c0325M11416;
        c7040.f18896.m9266().f14086.getClass();
        this.f13395 = C6897.f18361;
        C7040 c70402 = (C7040) c0325M11416.f1095;
        C4844 c4844 = c70402.f18899;
        C4593 c4593 = new C4593(this, 0);
        c4844.getClass();
        this.f13393 = new C4846(c4844, c4593);
        this.f13392 = new C4579(c0325M11416, c4434, this);
        C4593 c45932 = new C4593(this, 1);
        EmptyList emptyList = EmptyList.INSTANCE;
        c4844.getClass();
        if (emptyList == null) {
            C4844.m9587(27);
            throw null;
        }
        this.f13391 = new C4838(c4844, c45932, emptyList);
        this.f13390 = c70402.f18905.f22247 ? C6481.f17772 : AbstractC6325.m11852(c0325M11416, c4434);
        c4844.m9590(new C4593(this, 2));
    }

    @Override // androidx.compose.runtime.AbstractC1332, p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return this.f13390;
    }

    @Override // p079.AbstractC6985, p079.AbstractC7008
    public final String toString() {
        return "Lazy Java package fragment: " + this.f18692 + " of module " + ((C7040) this.f13394.f1095).f18910;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo8960() {
        return this.f13392;
    }

    @Override // p079.AbstractC6985, p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9036() {
        return new C2242(this, 20);
    }
}
