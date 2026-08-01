package p084;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4444;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import p049.AbstractC6526;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7042 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f18920 = AbstractC4338.m8777(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f18919 = AbstractC4338.m8777(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4752 m12347(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C4444) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f18920.get(C4690.m9340(((C4444) it.next()).f13069.name()).m9345());
            if (iterable == null) {
                iterable = EmptySet.INSTANCE;
            }
            AbstractC4343.m8794(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            C4686 c4686 = AbstractC6526.f17894;
            c4686.getClass();
            arrayList3.add(new C4770(new C4687(c4686.m9330(), c4686.f13692.m9328()), C4690.m9340(kotlinTarget.name())));
        }
        return new C4752(arrayList3, C7043.f18921);
    }
}
