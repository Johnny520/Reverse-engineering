package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3888;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5808 extends AbstractC5840 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14707;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6016 f14708;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5370 f14709;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(AbstractC5835 abstractC5835, String str, Object obj, C5370 c5370) {
        super(abstractC5835, str, obj);
        c5370.getClass();
        this.f14709 = c5370;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14708 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5809(abstractC5835, this));
        this.f14707 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5809(this, abstractC5835));
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return this.f14709.f13581;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return (InterfaceC5919) this.f14707.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC4765.m8851((Visibility) AbstractC5377.f13621.m1520(c5370, AbstractC5377.f13608[22]));
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isExternal() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC5377.f13616.m1137(c5370, AbstractC5377.f13608[28]);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInfix() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC5377.f13623.m1137(c5370, AbstractC5377.f13608[25]);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInline() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC5377.f13624.m1137(c5370, AbstractC5377.f13608[26]);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isOperator() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC5377.f13626.m1137(c5370, AbstractC5377.f13608[24]);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return AbstractC5377.f13615.m1137(c5370, AbstractC5377.f13608[29]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final List mo10523() {
        return this.f14709.f13577;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5902 mo10524() {
        return (C5902) this.f14708.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5348 mo10525() {
        C5370 c5370 = this.f14709;
        c5370.getClass();
        C5348 c5348 = AbstractC3888.m7274(c5370).f19293;
        if (c5348 != null) {
            return c5348;
        }
        C5043.m9154(this, "No signature for function: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5366 mo10526() {
        return this.f14709.f13579;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5840
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo10527() {
        return this.f14709.f13584;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5839
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Modality mo10528() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5370 c5370 = this.f14709;
        c5370.getClass();
        return (Modality) AbstractC5377.f13625.m1520(c5370, AbstractC5377.f13608[23]);
    }
}
