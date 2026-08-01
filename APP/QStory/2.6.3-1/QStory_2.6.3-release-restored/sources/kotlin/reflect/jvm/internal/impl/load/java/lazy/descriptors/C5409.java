package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5282;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p050.AbstractC7176;
import p089.C7755;
import p089.C7763;
import p089.C7767;
import p095.AbstractC7828;
import p099.C7868;
import p099.C7870;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5409 extends AbstractC7828 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5270 f13692;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1171 f13693;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5409(C1171 c1171, C5270 c5270, int i, InterfaceC5332 interfaceC5332) {
        c5270.getClass();
        C7870 c7870 = (C7870) c1171.f1440;
        super(c7870.f19239, interfaceC5332, new C7868(c1171, c5270, false), C5523.m9889(c5270.f13412.getName()), Variance.INVARIANT, false, i, c7870.f19247);
        this.f13693 = c1171;
        this.f13692 = c5270;
    }

    @Override // p095.AbstractC7843
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final List mo9732(List list) {
        C5409 c5409;
        C7755 c7755;
        AbstractC5714 abstractC5714;
        AbstractC5714 abstractC5714M12784;
        list.getClass();
        C1171 c1171 = this.f13693;
        C7755 c77552 = ((C7870) c1171.f1440).f19249;
        c77552.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5714 abstractC57142 = (AbstractC5714) it.next();
            C7763 c7763 = C7763.f18843;
            abstractC57142.getClass();
            if (AbstractC5749.m10405(abstractC57142, c7763, null)) {
                c5409 = this;
                c7755 = c77552;
                abstractC5714 = abstractC57142;
            } else {
                c5409 = this;
                c7755 = c77552;
                abstractC5714 = abstractC57142;
                abstractC5714M12784 = c7755.m12784(new C7767(c5409, false, c1171, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false), abstractC5714, EmptyList.INSTANCE, null, false);
                if (abstractC5714M12784 == null) {
                }
                arrayList.add(abstractC5714M12784);
                this = c5409;
                c77552 = c7755;
            }
            abstractC5714M12784 = abstractC5714;
            arrayList.add(abstractC5714M12784);
            this = c5409;
            c77552 = c7755;
        }
        return arrayList;
    }

    @Override // p095.AbstractC7843
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final List mo9733() {
        Type[] bounds = this.f13692.f13412.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C5282(type));
        }
        C5282 c5282 = (C5282) AbstractC5176.m9340(arrayList);
        Collection collection = arrayList;
        if (AbstractC5227.m9466(c5282 != null ? c5282.f13424 : null, Object.class)) {
            collection = EmptyList.INSTANCE;
        }
        boolean zIsEmpty = collection.isEmpty();
        C1171 c1171 = this.f13693;
        if (zIsEmpty) {
            return AbstractC7176.m12487(AbstractC5725.m10368(((C7870) c1171.f1440).f19250.mo9620().m12584(), ((C7870) c1171.f1440).f19250.mo9620().m12592()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0955) c1171.f1438).m917((C5282) it.next(), C9496.m14920(TypeUsage.COMMON, false, this, 3)));
        }
        return arrayList2;
    }
}
