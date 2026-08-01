package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import com.bumptech.glide.load.engine.C3837;
import java.io.IOException;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5578;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5583;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5590;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5592;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5601;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5645;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5648;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7358;
import p068.InterfaceC7383;
import p083.C7722;
import p086.AbstractC7728;
import p086.C7727;
import p093.C7799;
import p093.C7800;
import p095.C7817;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5480 extends AbstractC5462 implements InterfaceC5648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5645 f13924;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1171 f13925;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7727 f13926;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5669 f13927;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7817 f13928;

    public C5480(C7817 c7817, C1171 c1171, C5677 c5677, C7800 c7800) {
        super(c7800);
        this.f13927 = c5677.m10138(new C1850(this, 11));
        this.f13928 = c7817;
        this.f13925 = c1171;
        this.f13924 = new C5645(c7817, c1171);
        this.f13926 = C7727.f18701;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5648
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object mo9808(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AbstractC5714 abstractC5714) {
        protoBuf$Property.getClass();
        return m9809(abstractC5640, protoBuf$Property, AnnotatedCallableKind.PROPERTY, abstractC5714, C5466.f13897);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC5462
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C3837 mo9801(C5520 c5520, InterfaceC5294 interfaceC5294, List list) {
        list.getClass();
        return new C3837(this, AbstractC5323.m9634(this.f13928, c5520, this.f13925), c5520, list, interfaceC5294);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9809(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AnnotatedCallableKind annotatedCallableKind, AbstractC5714 abstractC5714, InterfaceC7383 interfaceC7383) throws IOException {
        Object objInvoke;
        C7799 c7799M9806 = AbstractC5464.m9806(abstractC5640, true, true, AbstractC7728.f18712.mo12740(protoBuf$Property.getFlags()), C7722.m12727(protoBuf$Property), this.f13889, this.f13926);
        if (c7799M9806 == null) {
            if (abstractC5640 instanceof C5652) {
                InterfaceC5294 interfaceC5294 = ((C5652) abstractC5640).f14362;
                C5467 c5467 = interfaceC5294 instanceof C5467 ? (C5467) interfaceC5294 : null;
                c7799M9806 = c5467 != null ? c5467.f13899 : null;
            }
        }
        if (c7799M9806 != null) {
            C7727 c7727 = c7799M9806.f19005.f18817;
            C7727 c77272 = C5483.f13933;
            c77272.getClass();
            C5471 c5471M9798 = AbstractC5462.m9798(protoBuf$Property, abstractC5640.f14364, abstractC5640.f14363, annotatedCallableKind, c7727.m12743(c77272.f18755, c77272.f18754, c77272.f18753));
            if (c5471M9798 != null && (objInvoke = interfaceC7383.invoke(this.f13927.invoke(c7799M9806), c5471M9798)) != null) {
                if (AbstractC7358.m12566(abstractC5714)) {
                    objInvoke = (AbstractC5600) objInvoke;
                    if (objInvoke instanceof C5583) {
                        return new C5578(((Number) ((C5583) objInvoke).f14250).byteValue());
                    }
                    if (objInvoke instanceof C5590) {
                        return new C5578(((Number) ((C5590) objInvoke).f14250).shortValue());
                    }
                    if (objInvoke instanceof C5601) {
                        return new C5578(((Number) ((C5601) objInvoke).f14250).intValue());
                    }
                    if (objInvoke instanceof C5592) {
                        return new C5578(((Number) ((C5592) objInvoke).f14250).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5648
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final Object mo9810(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AbstractC5714 abstractC5714) {
        protoBuf$Property.getClass();
        return m9809(abstractC5640, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, abstractC5714, C5466.f13896);
    }
}
