package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2495;
import androidx.window.area.AbstractC2567;
import bsh.C2622;
import com.bumptech.glide.AbstractC3055;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4440;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4442;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4617;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4568;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p034.AbstractC6347;
import p046.C6474;
import p046.C6482;
import p052.InterfaceC6543;
import p065.C6869;
import p073.C6926;
import p077.C6968;
import p079.AbstractC6989;
import p079.C6979;
import p079.C7018;
import p082.C7034;
import p083.C7039;
import p083.C7041;
import p083.InterfaceC7037;
import p144.C7547;
import p251.AbstractC8175;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4601 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f13435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4590 f13436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13437 = 1;

    public C4601(C0325 c0325, C4590 c4590) {
        this.f13435 = c0325;
        this.f13436 = c4590;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏兰哲, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲世兰苏] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世苏兰哲, 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰世哲苏, 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p052.InterfaceC6543
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        C6474 c6474;
        ?? arrayList;
        ?? r7;
        Pair pair;
        List listM8983;
        int i = this.f13437;
        C0325 c0325 = this.f13435;
        switch (i) {
            case 0:
                ?? r3 = this.f13436;
                C4452 c4452 = r3.f13389;
                C0325 c03252 = r3.f13336;
                AbstractC6989 abstractC6989 = r3.f13386;
                List<C4442> listM8992 = c4452.m8992();
                ArrayList arrayList2 = new ArrayList(listM8992.size());
                for (C4442 c4442 : listM8992) {
                    C7039 c7039M5060 = AbstractC2567.m5060(c03252, c4442);
                    C7041 c7041 = (C7041) c03252.f1095;
                    c7041.f18912.getClass();
                    C4568 c4568M9145 = C4568.m9145(abstractC6989, c7039M5060, false, C6968.m12284(c4442));
                    C0325 c03253 = new C0325(c7041, new C2495(c03252, c4568M9145, c4442, abstractC6989.mo9015().size()), (InterfaceC5184) c03252.f1094);
                    Constructor constructor = c4442.f13071;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listM8983 = EmptyList.INSTANCE;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC4347.m8831(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            C7547.m12774(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC4347.m8831(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listM8983 = c4442.m8983(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C2622 c2622M9163 = AbstractC4575.m9163(c03253, c4568M9145, listM8983);
                    List listMo9015 = abstractC6989.mo9015();
                    listMo9015.getClass();
                    ArrayList typeParameters = c4442.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        InterfaceC4463 interfaceC4463Mo4943 = ((InterfaceC7037) c03253.f1096).mo4943((C4438) it.next());
                        interfaceC4463Mo4943.getClass();
                        arrayList3.add(interfaceC4463Mo4943);
                    }
                    c4568M9145.m12363(c2622M9163.f7863, AbstractC8175.m13626(c4442.m8982()), AbstractC4344.m8793(arrayList3, listMo9015));
                    c4568M9145.mo9149(false);
                    c4568M9145.mo9148(c2622M9163.f7862);
                    c4568M9145.m12334(abstractC6989.mo9025());
                    ((C7041) c03253.f1095).f18908.getClass();
                    arrayList2.add(c4568M9145);
                }
                boolean zM8993 = c4452.m8993();
                Class cls = c4452.f13083;
                C6474 c64742 = C6482.f17768;
                if (zM8993) {
                    ((C7041) c03252.f1095).f18912.getClass();
                    C4568 c4568M91452 = C4568.m9145(abstractC6989, c64742, true, C6968.m12284(c4452));
                    ArrayList<C4440> arrayListM8994 = c4452.m8994();
                    ArrayList arrayList4 = new ArrayList(arrayListM8994.size());
                    C7034 c7034M14361 = C8667.m14361(TypeUsage.COMMON, false, null, 6);
                    int i2 = 0;
                    for (C4440 c4440 : arrayListM8994) {
                        AbstractC4882 abstractC4882M357 = ((C0108) c03252.f1093).m357(c4440.m8981(), c7034M14361);
                        C4691 c4691M8984 = c4440.m8984();
                        ((C7041) c03252.f1095).f18912.getClass();
                        C6474 c64743 = c64742;
                        arrayList4.add(new C6979(c4568M91452, null, i2, c64743, c4691M8984, abstractC4882M357, false, false, false, null, C6968.m12284(c4440)));
                        i2++;
                        c64742 = c64743;
                    }
                    c6474 = c64742;
                    c4568M91452.mo9148(false);
                    C4490 visibility = abstractC6989.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(AbstractC4617.f13517)) {
                        visibility = AbstractC4617.f13516;
                        visibility.getClass();
                    }
                    c4568M91452.m12362(arrayList4, visibility);
                    c4568M91452.mo9149(false);
                    c4568M91452.m12334(abstractC6989.mo9025());
                    String strM6660 = AbstractC3055.m6660(c4568M91452, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(c4568M91452);
                        ((C7041) c0325.f1095).f18908.getClass();
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC3055.m6660((C7018) it2.next(), 2).equals(strM6660)) {
                            }
                        }
                        arrayList2.add(c4568M91452);
                        ((C7041) c0325.f1095).f18908.getClass();
                    }
                } else {
                    c6474 = c64742;
                }
                ((C6869) ((C7041) c0325.f1095).f18898).m12098(abstractC6989, arrayList2, c0325);
                C6926 c6926 = ((C7041) c0325.f1095).f18904;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listM11930 = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    if (!cls.isInterface()) {
                        c4452.getClass();
                    }
                    if (zIsAnnotation) {
                        C7041 c70412 = (C7041) c03252.f1095;
                        C0108 c0108 = (C0108) c03252.f1093;
                        c70412.f18912.getClass();
                        ?? M9145 = C4568.m9145(abstractC6989, c6474, true, C6968.m12284(c4452));
                        if (zIsAnnotation) {
                            List listM8989 = c4452.m8989();
                            arrayList = new ArrayList(listM8989.size());
                            C7034 c7034M143612 = C8667.m14361(TypeUsage.COMMON, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj : listM8989) {
                                if (AbstractC4395.m8907(((C4436) obj).m8984(), AbstractC4615.f13484)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            Pair pair2 = new Pair(arrayList5, arrayList6);
                            List list = (List) pair2.component1();
                            List<C4436> list2 = (List) pair2.component2();
                            list.size();
                            C4436 c4436 = (C4436) AbstractC4344.m8815(list);
                            if (c4436 != null) {
                                AbstractC4437 abstractC4437M8978 = c4436.m8978();
                                if (abstractC4437M8978 instanceof C4451) {
                                    C4451 c4451 = (C4451) abstractC4437M8978;
                                    pair = new Pair(c0108.m356(c4451, c7034M143612, true), c0108.m357(c4451.f13081, c7034M143612));
                                } else {
                                    pair = new Pair(c0108.m357(abstractC4437M8978, c7034M143612), null);
                                }
                                r3.m9208(arrayList, M9145, 0, c4436, (AbstractC4882) pair.component1(), (AbstractC4882) pair.component2());
                            }
                            int i3 = c4436 != null ? 1 : 0;
                            int i4 = 0;
                            for (C4436 c44362 : list2) {
                                r3.m9208(arrayList, M9145, i4 + i3, c44362, c0108.m357(c44362.m8978(), c7034M143612), null);
                                i4++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        M9145.mo9148(false);
                        C4490 visibility2 = abstractC6989.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(AbstractC4617.f13517)) {
                            visibility2 = AbstractC4617.f13516;
                            visibility2.getClass();
                        }
                        M9145.m12362(arrayList, visibility2);
                        M9145.mo9149(true);
                        M9145.m12334(abstractC6989.mo9025());
                        ((C7041) c03252.f1095).f18908.getClass();
                        r7 = M9145;
                    } else {
                        r7 = 0;
                    }
                    listM11930 = AbstractC6347.m11930(r7);
                }
                return AbstractC4344.m8797(c6926.m12224(c0325, listM11930));
            default:
                return AbstractC4344.m8788(((C6869) ((C7041) c0325.f1095).f18898).m12093(this.f13436.f13386, c0325));
        }
    }

    public C4601(C4590 c4590, C0325 c0325) {
        this.f13436 = c4590;
        this.f13435 = c0325;
    }
}
