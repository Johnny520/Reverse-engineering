package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p034.AbstractC6347;
import p073.C6926;
import p073.C6934;
import p073.C6938;
import p079.AbstractC6999;
import p083.C7039;
import p083.C7041;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4577 extends AbstractC6999 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4438 f13347;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C0325 f13348;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4577(C0325 c0325, C4438 c4438, int i, InterfaceC4500 interfaceC4500) {
        c4438.getClass();
        C7041 c7041 = (C7041) c0325.f1095;
        super(c7041.f18894, interfaceC4500, new C7039(c0325, c4438, false), C4691.m9330(c4438.f13067.getName()), Variance.INVARIANT, false, i, c7041.f18902);
        this.f13348 = c0325;
        this.f13347 = c4438;
    }

    @Override // p079.AbstractC7014
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final List mo9173(List list) {
        C4577 c4577;
        C6926 c6926;
        AbstractC4882 abstractC4882;
        AbstractC4882 abstractC4882M12225;
        list.getClass();
        C0325 c0325 = this.f13348;
        C6926 c69262 = ((C7041) c0325.f1095).f18904;
        c69262.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4882 abstractC48822 = (AbstractC4882) it.next();
            C6934 c6934 = C6934.f18498;
            abstractC48822.getClass();
            if (AbstractC4917.m9846(abstractC48822, c6934, null)) {
                c4577 = this;
                c6926 = c69262;
                abstractC4882 = abstractC48822;
            } else {
                c4577 = this;
                c6926 = c69262;
                abstractC4882 = abstractC48822;
                abstractC4882M12225 = c6926.m12225(new C6938(c4577, false, c0325, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false), abstractC4882, EmptyList.INSTANCE, null, false);
                if (abstractC4882M12225 == null) {
                }
                arrayList.add(abstractC4882M12225);
                this = c4577;
                c69262 = c6926;
            }
            abstractC4882M12225 = abstractC4882;
            arrayList.add(abstractC4882M12225);
            this = c4577;
            c69262 = c6926;
        }
        return arrayList;
    }

    @Override // p079.AbstractC7014
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final List mo9174() {
        Type[] bounds = this.f13347.f13067.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C4450(type));
        }
        C4450 c4450 = (C4450) AbstractC4344.m8781(arrayList);
        Collection collection = arrayList;
        if (AbstractC4395.m8907(c4450 != null ? c4450.f13079 : null, Object.class)) {
            collection = EmptyList.INSTANCE;
        }
        boolean zIsEmpty = collection.isEmpty();
        C0325 c0325 = this.f13348;
        if (zIsEmpty) {
            return AbstractC6347.m11928(AbstractC4893.m9809(((C7041) c0325.f1095).f18905.mo9061().m12025(), ((C7041) c0325.f1095).f18905.mo9061().m12033()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0108) c0325.f1093).m357((C4450) it.next(), C8667.m14361(TypeUsage.COMMON, false, this, 3)));
        }
        return arrayList2;
    }
}
