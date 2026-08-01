package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2495;
import bsh.C2621;
import com.bumptech.glide.AbstractC3056;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4441;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4616;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4567;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p046.C6473;
import p046.C6481;
import p052.InterfaceC6542;
import p065.C6868;
import p073.C6925;
import p077.C6967;
import p079.AbstractC6988;
import p079.C6978;
import p079.C7017;
import p082.C7033;
import p083.C7038;
import p083.C7040;
import p083.InterfaceC7036;
import p144.C7546;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4600 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f13431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4589 f13432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13433 = 1;

    public C4600(C0325 c0325, C4589 c4589) {
        this.f13431 = c0325;
        this.f13432 = c4589;
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
    @Override // p052.InterfaceC6542
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        C6473 c6473;
        ?? arrayList;
        ?? r7;
        Pair pair;
        List listM8993;
        int i = this.f13433;
        C0325 c0325 = this.f13431;
        switch (i) {
            case 0:
                ?? r3 = this.f13432;
                C4451 c4451 = r3.f13385;
                C0325 c03252 = r3.f13332;
                AbstractC6988 abstractC6988 = r3.f13382;
                List<C4441> listM9002 = c4451.m9002();
                ArrayList arrayList2 = new ArrayList(listM9002.size());
                for (C4441 c4441 : listM9002) {
                    C7038 c7038M11852 = AbstractC6325.m11852(c03252, c4441);
                    C7040 c7040 = (C7040) c03252.f1095;
                    c7040.f18917.getClass();
                    C4567 c4567M9155 = C4567.m9155(abstractC6988, c7038M11852, false, C6967.m12257(c4441));
                    C0325 c03253 = new C0325(c7040, new C2495(c03252, c4567M9155, c4441, abstractC6988.mo9025().size()), (InterfaceC5183) c03252.f1094);
                    Constructor constructor = c4441.f13067;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listM8993 = EmptyList.INSTANCE;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC4346.m8862(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            C7546.m12745(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC4346.m8862(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listM8993 = c4441.m8993(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C2621 c2621M9173 = AbstractC4574.m9173(c03253, c4567M9155, listM8993);
                    List listMo9025 = abstractC6988.mo9025();
                    listMo9025.getClass();
                    ArrayList typeParameters = c4441.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        InterfaceC4462 interfaceC4462Mo4933 = ((InterfaceC7036) c03253.f1096).mo4933((C4437) it.next());
                        interfaceC4462Mo4933.getClass();
                        arrayList3.add(interfaceC4462Mo4933);
                    }
                    c4567M9155.m12336(c2621M9173.f7861, AbstractC3056.m6711(c4441.m8992()), AbstractC4343.m8825(arrayList3, listMo9025));
                    c4567M9155.mo9159(false);
                    c4567M9155.mo9158(c2621M9173.f7860);
                    c4567M9155.m12307(abstractC6988.mo9035());
                    ((C7040) c03253.f1095).f18913.getClass();
                    arrayList2.add(c4567M9155);
                }
                boolean zM9003 = c4451.m9003();
                Class cls = c4451.f13079;
                C6473 c64732 = C6481.f17772;
                if (zM9003) {
                    ((C7040) c03252.f1095).f18917.getClass();
                    C4567 c4567M91552 = C4567.m9155(abstractC6988, c64732, true, C6967.m12257(c4451));
                    ArrayList<C4439> arrayListM9004 = c4451.m9004();
                    ArrayList arrayList4 = new ArrayList(arrayListM9004.size());
                    C7033 c7033M9872 = AbstractC4921.m9872(TypeUsage.COMMON, false, null, 6);
                    int i2 = 0;
                    for (C4439 c4439 : arrayListM9004) {
                        AbstractC4881 abstractC4881M356 = ((C0108) c03252.f1093).m356(c4439.m8991(), c7033M9872);
                        C4690 c4690M8994 = c4439.m8994();
                        ((C7040) c03252.f1095).f18917.getClass();
                        C6473 c64733 = c64732;
                        arrayList4.add(new C6978(c4567M91552, null, i2, c64733, c4690M8994, abstractC4881M356, false, false, false, null, C6967.m12257(c4439)));
                        i2++;
                        c64732 = c64733;
                    }
                    c6473 = c64732;
                    c4567M91552.mo9158(false);
                    C4489 visibility = abstractC6988.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(AbstractC4616.f13513)) {
                        visibility = AbstractC4616.f13512;
                        visibility.getClass();
                    }
                    c4567M91552.m12335(arrayList4, visibility);
                    c4567M91552.mo9159(false);
                    c4567M91552.m12307(abstractC6988.mo9035());
                    String strM11410 = AbstractC6087.m11410(c4567M91552, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(c4567M91552);
                        ((C7040) c0325.f1095).f18913.getClass();
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC6087.m11410((C7017) it2.next(), 2).equals(strM11410)) {
                            }
                        }
                        arrayList2.add(c4567M91552);
                        ((C7040) c0325.f1095).f18913.getClass();
                    }
                } else {
                    c6473 = c64732;
                }
                ((C6868) ((C7040) c0325.f1095).f18903).m12070(abstractC6988, arrayList2, c0325);
                C6925 c6925 = ((C7040) c0325.f1095).f18909;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listM13658 = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    if (!cls.isInterface()) {
                        c4451.getClass();
                    }
                    if (zIsAnnotation) {
                        C7040 c70402 = (C7040) c03252.f1095;
                        C0108 c0108 = (C0108) c03252.f1093;
                        c70402.f18917.getClass();
                        ?? M9155 = C4567.m9155(abstractC6988, c6473, true, C6967.m12257(c4451));
                        if (zIsAnnotation) {
                            List listM8999 = c4451.m8999();
                            arrayList = new ArrayList(listM8999.size());
                            C7033 c7033M98722 = AbstractC4921.m9872(TypeUsage.COMMON, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj : listM8999) {
                                if (AbstractC4394.m8917(((C4435) obj).m8994(), AbstractC4614.f13480)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            Pair pair2 = new Pair(arrayList5, arrayList6);
                            List list = (List) pair2.component1();
                            List<C4435> list2 = (List) pair2.component2();
                            list.size();
                            C4435 c4435 = (C4435) AbstractC4343.m8830(list);
                            if (c4435 != null) {
                                AbstractC4436 abstractC4436M8988 = c4435.m8988();
                                if (abstractC4436M8988 instanceof C4450) {
                                    C4450 c4450 = (C4450) abstractC4436M8988;
                                    pair = new Pair(c0108.m355(c4450, c7033M98722, true), c0108.m356(c4450.f13077, c7033M98722));
                                } else {
                                    pair = new Pair(c0108.m356(abstractC4436M8988, c7033M98722), null);
                                }
                                r3.m9218(arrayList, M9155, 0, c4435, (AbstractC4881) pair.component1(), (AbstractC4881) pair.component2());
                            }
                            int i3 = c4435 != null ? 1 : 0;
                            int i4 = 0;
                            for (C4435 c44352 : list2) {
                                r3.m9218(arrayList, M9155, i4 + i3, c44352, c0108.m356(c44352.m8988(), c7033M98722), null);
                                i4++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        M9155.mo9158(false);
                        C4489 visibility2 = abstractC6988.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(AbstractC4616.f13513)) {
                            visibility2 = AbstractC4616.f13512;
                            visibility2.getClass();
                        }
                        M9155.m12335(arrayList, visibility2);
                        M9155.mo9159(true);
                        M9155.m12307(abstractC6988.mo9035());
                        ((C7040) c03252.f1095).f18913.getClass();
                        r7 = M9155;
                    } else {
                        r7 = 0;
                    }
                    listM13658 = AbstractC8189.m13658(r7);
                }
                return AbstractC4343.m8804(c6925.m12196(c0325, listM13658));
            default:
                return AbstractC4343.m8800(((C6868) ((C7040) c0325.f1095).f18903).m12065(this.f13432.f13382, c0325));
        }
    }

    public C4600(C4589 c4589, C0325 c0325) {
        this.f13432 = c4589;
        this.f13431 = c0325;
    }
}
