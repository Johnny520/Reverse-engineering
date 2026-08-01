package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.recyclerview.widget.C3328;
import androidx.window.area.AbstractC3400;
import bsh.C3455;
import com.bumptech.glide.AbstractC3887;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5268;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5272;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5274;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5283;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5449;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5400;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p050.AbstractC7176;
import p062.C7303;
import p062.C7311;
import p068.InterfaceC7372;
import p081.C7698;
import p089.C7755;
import p093.C7797;
import p095.AbstractC7818;
import p095.C7808;
import p095.C7847;
import p098.C7863;
import p099.C7868;
import p099.C7870;
import p099.InterfaceC7866;
import p160.C8376;
import p267.AbstractC9004;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5433 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1171 f13780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5422 f13781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13782 = 1;

    public C5433(C1171 c1171, C5422 c5422) {
        this.f13780 = c1171;
        this.f13781 = c5422;
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
    @Override // p068.InterfaceC7372
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        C7303 c7303;
        ?? arrayList;
        ?? r7;
        Pair pair;
        List listM9542;
        int i = this.f13782;
        C1171 c1171 = this.f13780;
        switch (i) {
            case 0:
                ?? r3 = this.f13781;
                C5284 c5284 = r3.f13734;
                C1171 c11712 = r3.f13681;
                AbstractC7818 abstractC7818 = r3.f13731;
                List<C5274> listM9551 = c5284.m9551();
                ArrayList arrayList2 = new ArrayList(listM9551.size());
                for (C5274 c5274 : listM9551) {
                    C7868 c7868M5620 = AbstractC3400.m5620(c11712, c5274);
                    C7870 c7870 = (C7870) c11712.f1440;
                    c7870.f19257.getClass();
                    C5400 c5400M9704 = C5400.m9704(abstractC7818, c7868M5620, false, C7797.m12843(c5274));
                    C1171 c11713 = new C1171(c7870, new C3328(c11712, c5400M9704, c5274, abstractC7818.mo9574().size()), (InterfaceC6016) c11712.f1439);
                    Constructor constructor = c5274.f13416;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listM9542 = EmptyList.INSTANCE;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC5179.m9390(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            C8376.m13333(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC5179.m9390(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listM9542 = c5274.m9542(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C3455 c3455M9722 = AbstractC5407.m9722(c11713, c5400M9704, listM9542);
                    List listMo9574 = abstractC7818.mo9574();
                    listMo9574.getClass();
                    ArrayList typeParameters = c5274.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        InterfaceC5295 interfaceC5295Mo5503 = ((InterfaceC7866) c11713.f1441).mo5503((C5270) it.next());
                        interfaceC5295Mo5503.getClass();
                        arrayList3.add(interfaceC5295Mo5503);
                    }
                    c5400M9704.m12922(c3455M9722.f8208, AbstractC9004.m14185(c5274.m9541()), AbstractC5176.m9352(arrayList3, listMo9574));
                    c5400M9704.mo9708(false);
                    c5400M9704.mo9707(c3455M9722.f8207);
                    c5400M9704.m12893(abstractC7818.mo9584());
                    ((C7870) c11713.f1440).f19253.getClass();
                    arrayList2.add(c5400M9704);
                }
                boolean zM9552 = c5284.m9552();
                Class cls = c5284.f13428;
                C7303 c73032 = C7311.f18113;
                if (zM9552) {
                    ((C7870) c11712.f1440).f19257.getClass();
                    C5400 c5400M97042 = C5400.m9704(abstractC7818, c73032, true, C7797.m12843(c5284));
                    ArrayList<C5272> arrayListM9553 = c5284.m9553();
                    ArrayList arrayList4 = new ArrayList(arrayListM9553.size());
                    C7863 c7863M14920 = C9496.m14920(TypeUsage.COMMON, false, null, 6);
                    int i2 = 0;
                    for (C5272 c5272 : arrayListM9553) {
                        AbstractC5714 abstractC5714M917 = ((C0955) c11712.f1438).m917(c5272.m9540(), c7863M14920);
                        C5523 c5523M9543 = c5272.m9543();
                        ((C7870) c11712.f1440).f19257.getClass();
                        C7303 c73033 = c73032;
                        arrayList4.add(new C7808(c5400M97042, null, i2, c73033, c5523M9543, abstractC5714M917, false, false, false, null, C7797.m12843(c5272)));
                        i2++;
                        c73032 = c73033;
                    }
                    c7303 = c73032;
                    c5400M97042.mo9707(false);
                    C5322 visibility = abstractC7818.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(AbstractC5449.f13862)) {
                        visibility = AbstractC5449.f13861;
                        visibility.getClass();
                    }
                    c5400M97042.m12921(arrayList4, visibility);
                    c5400M97042.mo9708(false);
                    c5400M97042.m12893(abstractC7818.mo9584());
                    String strM7220 = AbstractC3887.m7220(c5400M97042, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(c5400M97042);
                        ((C7870) c1171.f1440).f19253.getClass();
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC3887.m7220((C7847) it2.next(), 2).equals(strM7220)) {
                            }
                        }
                        arrayList2.add(c5400M97042);
                        ((C7870) c1171.f1440).f19253.getClass();
                    }
                } else {
                    c7303 = c73032;
                }
                ((C7698) ((C7870) c1171.f1440).f19243).m12657(abstractC7818, arrayList2, c1171);
                C7755 c7755 = ((C7870) c1171.f1440).f19249;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listM12489 = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    if (!cls.isInterface()) {
                        c5284.getClass();
                    }
                    if (zIsAnnotation) {
                        C7870 c78702 = (C7870) c11712.f1440;
                        C0955 c0955 = (C0955) c11712.f1438;
                        c78702.f19257.getClass();
                        ?? M9704 = C5400.m9704(abstractC7818, c7303, true, C7797.m12843(c5284));
                        if (zIsAnnotation) {
                            List listM9548 = c5284.m9548();
                            arrayList = new ArrayList(listM9548.size());
                            C7863 c7863M149202 = C9496.m14920(TypeUsage.COMMON, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj : listM9548) {
                                if (AbstractC5227.m9466(((C5268) obj).m9543(), AbstractC5447.f13829)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            Pair pair2 = new Pair(arrayList5, arrayList6);
                            List list = (List) pair2.component1();
                            List<C5268> list2 = (List) pair2.component2();
                            list.size();
                            C5268 c5268 = (C5268) AbstractC5176.m9374(list);
                            if (c5268 != null) {
                                AbstractC5269 abstractC5269M9537 = c5268.m9537();
                                if (abstractC5269M9537 instanceof C5283) {
                                    C5283 c5283 = (C5283) abstractC5269M9537;
                                    pair = new Pair(c0955.m916(c5283, c7863M149202, true), c0955.m917(c5283.f13426, c7863M149202));
                                } else {
                                    pair = new Pair(c0955.m917(abstractC5269M9537, c7863M149202), null);
                                }
                                r3.m9767(arrayList, M9704, 0, c5268, (AbstractC5714) pair.component1(), (AbstractC5714) pair.component2());
                            }
                            int i3 = c5268 != null ? 1 : 0;
                            int i4 = 0;
                            for (C5268 c52682 : list2) {
                                r3.m9767(arrayList, M9704, i4 + i3, c52682, c0955.m917(c52682.m9537(), c7863M149202), null);
                                i4++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        M9704.mo9707(false);
                        C5322 visibility2 = abstractC7818.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(AbstractC5449.f13862)) {
                            visibility2 = AbstractC5449.f13861;
                            visibility2.getClass();
                        }
                        M9704.m12921(arrayList, visibility2);
                        M9704.mo9708(true);
                        M9704.m12893(abstractC7818.mo9584());
                        ((C7870) c11712.f1440).f19253.getClass();
                        r7 = M9704;
                    } else {
                        r7 = 0;
                    }
                    listM12489 = AbstractC7176.m12489(r7);
                }
                return AbstractC5176.m9356(c7755.m12783(c1171, listM12489));
            default:
                return AbstractC5176.m9347(((C7698) ((C7870) c1171.f1440).f19243).m12652(this.f13781.f13731, c1171));
        }
    }

    public C5433(C5422 c5422, C1171 c1171) {
        this.f13781 = c5422;
        this.f13780 = c1171;
    }
}
