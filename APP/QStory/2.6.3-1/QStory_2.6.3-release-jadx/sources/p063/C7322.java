package p063;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7322 implements InterfaceC7318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f18134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f18135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f18136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AnnotationConstructorCaller$CallMode f18137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f18139;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f18140;

    public C7322(Class cls, ArrayList arrayList, AnnotationConstructorCaller$CallMode annotationConstructorCaller$CallMode, AnnotationConstructorCaller$Origin annotationConstructorCaller$Origin, List list) {
        cls.getClass();
        annotationConstructorCaller$CallMode.getClass();
        annotationConstructorCaller$Origin.getClass();
        list.getClass();
        this.f18139 = cls;
        this.f18138 = arrayList;
        this.f18137 = annotationConstructorCaller$CallMode;
        this.f18136 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f18135 = arrayList2;
        List list2 = this.f18136;
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) AbstractC5263.f13398.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f18134 = arrayList3;
        List list3 = this.f18136;
        ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f18140 = arrayList4;
        if (this.f18137 == AnnotationConstructorCaller$CallMode.POSITIONAL_CALL && annotationConstructorCaller$Origin == AnnotationConstructorCaller$Origin.JAVA && !AbstractC5176.m9370(this.f18138, "value").isEmpty()) {
            C6755.m11867("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[PHI: r17
  0x008d: PHI (r17v5 java.lang.Object) = (r17v4 java.lang.Object), (r17v6 java.lang.Object) binds: [B:24:0x0059, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c A[LOOP:0: B:5:0x001a->B:52:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091 A[SYNTHETIC] */
    @Override // p063.InterfaceC7318
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] objArr) {
        Object obj;
        String strMo9444;
        objArr.getClass();
        ArrayList arrayList = this.f18135;
        if (arrayList.size() != objArr.length) {
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(arrayList.size());
            sb.append(" arguments, but ");
            C6755.m11869(AbstractC0900.m707(sb, " were provided.", objArr.length));
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.f18138;
            if (i >= length) {
                return C9496.m14940(this.f18139, AbstractC5171.m9330(AbstractC5176.m9380(arrayList3, arrayList2)), this.f18136);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList4 = this.f18134;
            if (array == null && this.f18137 == AnnotationConstructorCaller$CallMode.CALL_BY_NAME) {
                array = this.f18140.get(i2);
            } else {
                Class cls = (Class) arrayList4.get(i2);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof InterfaceC5925) {
                        array = AbstractC3889.m7316((InterfaceC5925) array);
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (objArr2 instanceof Class[]) {
                                obj = null;
                                array = obj;
                                if (array != null) {
                                    String str = (String) arrayList3.get(i2);
                                    Class cls2 = (Class) arrayList4.get(i2);
                                    InterfaceC5925 interfaceC5925Mo9476 = AbstractC5227.m9466(cls2, Class.class) ? AbstractC5228.f13320.mo9476(InterfaceC5925.class) : (cls2.isArray() && AbstractC5227.m9466(cls2.getComponentType(), Class.class)) ? AbstractC5228.f13320.mo9476(InterfaceC5925[].class) : AbstractC5228.f13320.mo9476(cls2);
                                    String strMo94442 = interfaceC5925Mo9476.mo9444();
                                    C5229 c5229 = AbstractC5228.f13320;
                                    if (AbstractC5227.m9466(strMo94442, c5229.mo9476(Object[].class).mo9444())) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(interfaceC5925Mo9476.mo9444());
                                        sb2.append('<');
                                        Class<?> componentType = AbstractC3889.m7316(interfaceC5925Mo9476).getComponentType();
                                        componentType.getClass();
                                        sb2.append(c5229.mo9476(componentType).mo9444());
                                        sb2.append('>');
                                        strMo9444 = sb2.toString();
                                    } else {
                                        strMo9444 = interfaceC5925Mo9476.mo9444();
                                    }
                                    throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strMo9444);
                                }
                                arrayList2.add(array);
                                i++;
                                i2 = i3;
                            } else if (objArr2 instanceof InterfaceC5925[]) {
                                InterfaceC5925[] interfaceC5925Arr = (InterfaceC5925[]) array;
                                ArrayList arrayList5 = new ArrayList(interfaceC5925Arr.length);
                                for (InterfaceC5925 interfaceC5925 : interfaceC5925Arr) {
                                    arrayList5.add(AbstractC3889.m7316(interfaceC5925));
                                }
                                obj = null;
                                array = arrayList5.toArray(new Class[0]);
                            } else {
                                obj = null;
                                array = objArr2;
                            }
                        }
                        if (!cls.isInstance(array)) {
                            array = obj;
                        }
                        if (array != null) {
                        }
                    }
                    obj = null;
                    if (!cls.isInstance(array)) {
                    }
                    if (array != null) {
                    }
                }
            }
            if (array != null) {
            }
        }
    }

    @Override // p063.InterfaceC7318
    public final List getParameterTypes() {
        return this.f18135;
    }

    @Override // p063.InterfaceC7318
    public final Type getReturnType() {
        return this.f18139;
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ boolean mo12554() {
        return false;
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ Member mo12555() {
        return null;
    }

    public /* synthetic */ C7322(Class cls, ArrayList arrayList, AnnotationConstructorCaller$CallMode annotationConstructorCaller$CallMode, AnnotationConstructorCaller$Origin annotationConstructorCaller$Origin) {
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, annotationConstructorCaller$CallMode, annotationConstructorCaller$Origin, arrayList2);
    }
}
