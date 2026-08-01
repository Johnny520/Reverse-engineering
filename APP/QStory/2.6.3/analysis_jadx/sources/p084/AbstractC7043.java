package p084;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import p049.AbstractC6527;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7043 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f18915 = AbstractC4339.m8774(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f18914 = AbstractC4339.m8774(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4753 m12374(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C4445) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f18915.get(C4691.m9330(((C4445) it.next()).f13073.name()).m9335());
            if (iterable == null) {
                iterable = EmptySet.INSTANCE;
            }
            AbstractC4344.m8804(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            C4687 c4687 = AbstractC6527.f17890;
            c4687.getClass();
            arrayList3.add(new C4771(new C4688(c4687.m9320(), c4687.f13696.m9318()), C4691.m9330(kotlinTarget.name())));
        }
        return new C4753(arrayList3, C7044.f18916);
    }
}
