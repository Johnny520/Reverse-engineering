package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p073.C6925;
import p073.C6933;
import p073.C6937;
import p079.AbstractC6998;
import p083.C7038;
import p083.C7040;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4576 extends AbstractC6998 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4437 f13343;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C0325 f13344;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4576(C0325 c0325, C4437 c4437, int i, InterfaceC4499 interfaceC4499) {
        c4437.getClass();
        C7040 c7040 = (C7040) c0325.f1095;
        super(c7040.f18899, interfaceC4499, new C7038(c0325, c4437, false), C4690.m9340(c4437.f13063.getName()), Variance.INVARIANT, false, i, c7040.f18907);
        this.f13344 = c0325;
        this.f13343 = c4437;
    }

    @Override // p079.AbstractC7013
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final List mo9183(List list) {
        C4576 c4576;
        C6925 c6925;
        AbstractC4881 abstractC4881;
        AbstractC4881 abstractC4881M12197;
        list.getClass();
        C0325 c0325 = this.f13344;
        C6925 c69252 = ((C7040) c0325.f1095).f18909;
        c69252.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4881 abstractC48812 = (AbstractC4881) it.next();
            C6933 c6933 = C6933.f18503;
            abstractC48812.getClass();
            if (AbstractC4916.m9852(abstractC48812, c6933, null)) {
                c4576 = this;
                c6925 = c69252;
                abstractC4881 = abstractC48812;
            } else {
                c4576 = this;
                c6925 = c69252;
                abstractC4881 = abstractC48812;
                abstractC4881M12197 = c6925.m12197(new C6937(c4576, false, c0325, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false), abstractC4881, EmptyList.INSTANCE, null, false);
                if (abstractC4881M12197 == null) {
                }
                arrayList.add(abstractC4881M12197);
                this = c4576;
                c69252 = c6925;
            }
            abstractC4881M12197 = abstractC4881;
            arrayList.add(abstractC4881M12197);
            this = c4576;
            c69252 = c6925;
        }
        return arrayList;
    }

    @Override // p079.AbstractC7013
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final List mo9184() {
        Type[] bounds = this.f13343.f13063.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C4449(type));
        }
        C4449 c4449 = (C4449) AbstractC4343.m8815(arrayList);
        Collection collection = arrayList;
        if (AbstractC4394.m8917(c4449 != null ? c4449.f13075 : null, Object.class)) {
            collection = EmptyList.INSTANCE;
        }
        boolean zIsEmpty = collection.isEmpty();
        C0325 c0325 = this.f13344;
        if (zIsEmpty) {
            return AbstractC8189.m13660(AbstractC4892.m9815(((C7040) c0325.f1095).f18910.mo9071().m11982(), ((C7040) c0325.f1095).f18910.mo9071().m11990()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0108) c0325.f1093).m356((C4449) it.next(), AbstractC4921.m9872(TypeUsage.COMMON, false, this, 3)));
        }
        return arrayList2;
    }
}
