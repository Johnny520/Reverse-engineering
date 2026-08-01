package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4428;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4426;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4442;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4444;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4447;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4448;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4746;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4763;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4766;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p053.AbstractC6560;
import p077.C6967;
import p077.C6972;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p083.C7040;
import p098.C7239;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4577 implements InterfaceC4569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13345 = {new PropertyReference1Impl(C4577.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new PropertyReference1Impl(C4577.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C4577.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4846 f13346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6972 f13347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4846 f13348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4842 f13349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4429 f13350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0325 f13351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f13352;

    public C4577(C0325 c0325, C4429 c4429, boolean z) {
        c0325.getClass();
        c4429.getClass();
        this.f13351 = c0325;
        this.f13350 = c4429;
        C7040 c7040 = (C7040) c0325.f1095;
        C4844 c4844 = c7040.f18899;
        C4578 c4578 = new C4578(this, 0);
        c4844.getClass();
        this.f13349 = new C4842(c4844, c4578);
        C4578 c45782 = new C4578(this, 1);
        c4844.getClass();
        this.f13348 = new C4846(c4844, c45782);
        c7040.f18917.getClass();
        this.f13347 = C6967.m12257(c4429);
        C4578 c45783 = new C4578(this, 2);
        c4844.getClass();
        this.f13346 = new C4846(c4844, c45783);
        this.f13352 = z;
    }

    @Override // p046.InterfaceC6477
    public final AbstractC4881 getType() {
        return (AbstractC4877) AbstractC9124.m14672(this.f13348, f13345[1]);
    }

    public final String toString() {
        return C4743.f13886.m9484(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4767 m9185(AbstractC4428 abstractC4428) {
        AbstractC4881 abstractC4881M11991;
        if (abstractC4428 instanceof C4442) {
            return C4766.m9505(((C4442) abstractC4428).f13068, null);
        }
        if (abstractC4428 instanceof C4444) {
            Enum r6 = ((C4444) abstractC4428).f13069;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new C4770(AbstractC4430.m8987(enclosingClass), C4690.m9340(r6.name()));
        }
        boolean z = abstractC4428 instanceof C4446;
        C0325 c0325 = this.f13351;
        if (z) {
            C4446 c4446 = (C4446) abstractC4428;
            C4690 c4690 = c4446.f13046;
            if (c4690 == null) {
                c4690 = AbstractC4614.f13480;
            }
            c4690.getClass();
            ArrayList arrayListM8995 = c4446.m8995();
            if (!AbstractC4892.m9835((AbstractC4877) AbstractC9124.m14672(this.f13348, f13345[1]))) {
                AbstractC6988 abstractC6988M9510 = AbstractC4772.m9510(this);
                abstractC6988M9510.getClass();
                InterfaceC4480 interfaceC4480M12025 = AbstractC6560.m12025(c4690, abstractC6988M9510);
                if (interfaceC4480M12025 == null || (abstractC4881M11991 = ((AbstractC6976) interfaceC4480M12025).getType()) == null) {
                    abstractC4881M11991 = ((C7040) c0325.f1095).f18910.mo9071().m11991(C7239.m12443(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), Variance.INVARIANT);
                }
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayListM8995, 10));
                Iterator it = arrayListM8995.iterator();
                while (it.hasNext()) {
                    AbstractC4767 abstractC4767M9185 = m9185((AbstractC4428) it.next());
                    if (abstractC4767M9185 == null) {
                        abstractC4767M9185 = new C4756(null);
                    }
                    arrayList.add(abstractC4767M9185);
                }
                return new C4746(arrayList, abstractC4881M11991);
            }
        } else {
            if (abstractC4428 instanceof C4447) {
                return new C4753((Object) new C4577(c0325, new C4429(((C4447) abstractC4428).f13072), false));
            }
            if (abstractC4428 instanceof C4448) {
                Class cls = ((C4448) abstractC4428).f13073;
                AbstractC4881 abstractC4881M356 = ((C0108) c0325.f1093).m356(cls.isPrimitive() ? new C4438(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C4450(cls) : cls instanceof WildcardType ? new C4426((WildcardType) cls) : new C4449(cls), AbstractC4921.m9872(TypeUsage.COMMON, false, null, 7));
                if (!AbstractC4892.m9835(abstractC4881M356)) {
                    AbstractC4881 abstractC4881Mo9751 = abstractC4881M356;
                    int i = 0;
                    while (AbstractC6529.m11970(abstractC4881Mo9751)) {
                        abstractC4881Mo9751 = ((AbstractC4869) AbstractC4343.m8818(abstractC4881Mo9751.mo9736())).mo9751();
                        abstractC4881Mo9751.getClass();
                        i++;
                    }
                    InterfaceC4476 interfaceC4476Mo9221 = abstractC4881Mo9751.mo9732().mo9221();
                    if (interfaceC4476Mo9221 instanceof AbstractC6988) {
                        C4687 c4687M9508 = AbstractC4772.m9508(interfaceC4476Mo9221);
                        return c4687M9508 == null ? new C4758(new C4763(abstractC4881M356)) : new C4758(c4687M9508, i);
                    }
                    if (interfaceC4476Mo9221 instanceof InterfaceC4462) {
                        C4686 c4686M9329 = AbstractC6526.f17889.m9329();
                        return new C4758(new C4687(c4686M9329.m9330(), c4686M9329.f13692.m9328()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo9186() {
        return (Map) AbstractC9124.m14672(this.f13346, f13345[2]);
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4461 mo9187() {
        return this.f13347;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 mo9188() {
        InterfaceC5087 interfaceC5087 = f13345[0];
        C4842 c4842 = this.f13349;
        c4842.getClass();
        interfaceC5087.getClass();
        return (C4686) c4842.invoke();
    }
}
