package p047;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6493 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f17789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f17790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AnnotationConstructorCaller$CallMode f17792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f17794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f17795;

    public C6493(Class cls, ArrayList arrayList, AnnotationConstructorCaller$CallMode annotationConstructorCaller$CallMode, AnnotationConstructorCaller$Origin annotationConstructorCaller$Origin, List list) {
        cls.getClass();
        annotationConstructorCaller$CallMode.getClass();
        annotationConstructorCaller$Origin.getClass();
        list.getClass();
        this.f17794 = cls;
        this.f17793 = arrayList;
        this.f17792 = annotationConstructorCaller$CallMode;
        this.f17791 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f17790 = arrayList2;
        List list2 = this.f17791;
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) AbstractC4431.f13053.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f17789 = arrayList3;
        List list3 = this.f17791;
        ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f17795 = arrayList4;
        if (this.f17792 == AnnotationConstructorCaller$CallMode.POSITIONAL_CALL && annotationConstructorCaller$Origin == AnnotationConstructorCaller$Origin.JAVA && !AbstractC4344.m8811(this.f17793, "value").isEmpty()) {
            C5925.m11308("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[PHI: r17
  0x008d: PHI (r17v5 java.lang.Object) = (r17v4 java.lang.Object), (r17v6 java.lang.Object) binds: [B:24:0x0059, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c A[LOOP:0: B:5:0x001a->B:52:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091 A[SYNTHETIC] */
    @Override // p047.InterfaceC6489
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(java.lang.Object[] r19) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.C6493.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // p047.InterfaceC6489
    public final List getParameterTypes() {
        return this.f17790;
    }

    @Override // p047.InterfaceC6489
    public final Type getReturnType() {
        return this.f17794;
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ boolean mo11995() {
        return false;
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ Member mo11996() {
        return null;
    }

    public /* synthetic */ C6493(Class cls, ArrayList arrayList, AnnotationConstructorCaller$CallMode annotationConstructorCaller$CallMode, AnnotationConstructorCaller$Origin annotationConstructorCaller$Origin) {
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, annotationConstructorCaller$CallMode, annotationConstructorCaller$Origin, arrayList2);
    }
}
