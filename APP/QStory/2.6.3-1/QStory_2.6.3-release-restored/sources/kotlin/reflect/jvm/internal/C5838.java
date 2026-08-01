package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3888;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5838 extends AbstractC5840 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6016 f14773;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5362 f14774;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5838(AbstractC5835 abstractC5835, String str, Object obj, C5362 c5362) {
        super(abstractC5835, str, obj);
        c5362.getClass();
        this.f14774 = c5362;
        this.f14773 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5837(abstractC5835, 1));
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return (InterfaceC5919) this.f14773.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5362 c5362 = this.f14774;
        c5362.getClass();
        return AbstractC4765.m8851((Visibility) AbstractC5377.f13622.m1520(c5362, AbstractC5377.f13608[17]));
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final List mo10523() {
        return this.f14774.f13543;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C5902 mo10524() {
        AbstractC5835 abstractC5835 = this.f14780;
        abstractC5835.getClass();
        return ((C5877) ((C5836) abstractC5835).f14770.getValue()).m10556();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C5348 mo10525() {
        C5362 c5362 = this.f14774;
        c5362.getClass();
        C5348 c5348 = AbstractC3888.m7273(c5362).f19295;
        if (c5348 != null) {
            return c5348;
        }
        C5043.m9154(this, "No signature for constructor: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C5366 mo10526() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo10527() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5839
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo10528() {
        return Modality.FINAL;
    }
}
