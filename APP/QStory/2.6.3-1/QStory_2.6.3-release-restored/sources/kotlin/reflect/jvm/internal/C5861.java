package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0923;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.AbstractC2167;
import io.ktor.util.C5043;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.text.AbstractC5976;
import p034.AbstractC7082;
import p063.AbstractC7323;
import p063.C7322;
import p063.C7324;
import p063.C7331;
import p063.C7334;
import p068.InterfaceC7372;
import p083.C7715;
import p095.AbstractC7818;
import p267.AbstractC9004;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5861 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5858 f14849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14850;

    public /* synthetic */ C5861(C5858 c5858, int i) {
        this.f14850 = i;
        this.f14849 = c5858;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws IOException {
        AbstractC7323 c7334;
        GenericDeclaration declaredConstructor;
        AbstractC7323 abstractC7323M10552;
        InterfaceC5925 interfaceC5925;
        Object next;
        InterfaceC5893 interfaceC5893;
        int i = this.f14850;
        C5858 c5858 = this.f14849;
        Object objM10536 = null;
        switch (i) {
            case 0:
                C5520 c5520 = AbstractC5900.f14954;
                InterfaceC5316 interfaceC5316Mo10501 = c5858.mo10501();
                AbstractC5835 abstractC5835 = c5858.f14843;
                AbstractC7082 abstractC7082M10638 = AbstractC5900.m10638(interfaceC5316Mo10501);
                if (abstractC7082M10638 instanceof C5869) {
                    if (AbstractC5894.m10597(c5858)) {
                        Class clsMo9438 = abstractC5835.mo9438();
                        List parameters = c5858.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((InterfaceC5940) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new C7322(clsMo9438, arrayList, AnnotationConstructorCaller$CallMode.POSITIONAL_CALL, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    String str = ((C5869) abstractC7082M10638).f14868.f18678;
                    abstractC5835.getClass();
                    str.getClass();
                    Class clsMo94382 = abstractC5835.mo9438();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5899.m10635(AbstractC5263.m9533(abstractC5835.mo9438()), str, false).f572).toArray(new Class[0]);
                        objM10536 = clsMo94382.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (abstractC7082M10638 instanceof C5868) {
                    C7715 c7715 = ((C5868) abstractC7082M10638).f14866;
                    objM10536 = abstractC5835.m10536(c7715.f18679, c7715.f18678);
                } else if (abstractC7082M10638 instanceof C5870) {
                    objM10536 = ((C5870) abstractC7082M10638).f14869;
                } else {
                    if (!(abstractC7082M10638 instanceof C5871)) {
                        if (!(abstractC7082M10638 instanceof C5872)) {
                            C5043.m9170();
                            return null;
                        }
                        List list = ((C5872) abstractC7082M10638).f14871;
                        Class clsMo94383 = abstractC5835.mo9438();
                        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C7322(clsMo94383, arrayList2, AnnotationConstructorCaller$CallMode.POSITIONAL_CALL, AnnotationConstructorCaller$Origin.JAVA, list);
                    }
                    objM10536 = ((C5871) abstractC7082M10638).f14870;
                }
                if (objM10536 instanceof Constructor) {
                    c7334 = c5858.m10553((Constructor) objM10536, c5858.mo10501(), false);
                } else {
                    if (!(objM10536 instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + c5858.mo10501() + " (member = " + objM10536 + ')');
                    }
                    Method method = (Method) objM10536;
                    c7334 = !Modifier.isStatic(method.getModifiers()) ? AbstractC5894.m10601(c5858) ? new C7334(method, AbstractC5894.m10608(c5858)) : new C7324(6, 0, method, false) : ((AbstractC2167) c5858.mo10501()).getAnnotations().mo10076(AbstractC5899.f14953) != null ? AbstractC5894.m10601(c5858) ? new C7331(method, false, 4) : new C7324(4, 1, method, true) : c5858.m10552(method, false);
                }
                return AbstractC1298.m1738(EmptyList.INSTANCE, c5858, c7334, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                C5520 c55202 = AbstractC5900.f14954;
                InterfaceC5316 interfaceC5316Mo105012 = c5858.mo10501();
                AbstractC5835 abstractC58352 = c5858.f14843;
                AbstractC7082 abstractC7082M106382 = AbstractC5900.m10638(interfaceC5316Mo105012);
                if (!(abstractC7082M106382 instanceof C5868)) {
                    if (abstractC7082M106382 instanceof C5869) {
                        if (AbstractC5894.m10597(c5858)) {
                            Class clsMo94384 = abstractC58352.mo9438();
                            List parameters2 = c5858.getParameters();
                            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(parameters2, 10));
                            Iterator it3 = parameters2.iterator();
                            while (it3.hasNext()) {
                                String name2 = ((InterfaceC5940) it3.next()).getName();
                                name2.getClass();
                                arrayList4.add(name2);
                            }
                            return new C7322(clsMo94384, arrayList4, AnnotationConstructorCaller$CallMode.CALL_BY_NAME, AnnotationConstructorCaller$Origin.KOTLIN);
                        }
                        C0923 c0923M14183 = AbstractC9004.m14183(c5858, ((C5869) abstractC7082M106382).f14868.f18678);
                        arrayList3.addAll((Set) c0923M14183.f573);
                        String str2 = (String) c0923M14183.f572;
                        abstractC58352.getClass();
                        str2.getClass();
                        Class clsMo94385 = abstractC58352.mo9438();
                        ArrayList arrayList5 = new ArrayList();
                        AbstractC5835.m10534(arrayList5, (ArrayList) AbstractC5899.m10635(AbstractC5263.m9533(abstractC58352.mo9438()), str2, false).f572, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = clsMo94385.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (abstractC7082M106382 instanceof C5872) {
                        List list2 = ((C5872) abstractC7082M106382).f14871;
                        Class clsMo94386 = abstractC58352.mo9438();
                        ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new C7322(clsMo94386, arrayList6, AnnotationConstructorCaller$CallMode.CALL_BY_NAME, AnnotationConstructorCaller$Origin.JAVA, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    ArrayList<InterfaceC5940> arrayListM9493 = AbstractC5238.m9493(c5858);
                    if (arrayListM9493.isEmpty()) {
                        interfaceC5925 = !(abstractC58352 instanceof InterfaceC5925) ? (InterfaceC5925) abstractC58352 : null;
                        if (interfaceC5925 == null && interfaceC5925.mo9443()) {
                            Member memberMo12555 = c5858.mo10500().mo12555();
                            memberMo12555.getClass();
                            if (Modifier.isStatic(memberMo12555.getModifiers())) {
                                Collection collectionMo9589 = c5858.mo10501().mo9589();
                                collectionMo9589.getClass();
                                Collection<InterfaceC5316> collection = collectionMo9589;
                                ArrayList arrayList7 = new ArrayList(AbstractC5177.m9381(collection, 10));
                                for (InterfaceC5316 interfaceC5316 : collection) {
                                    InterfaceC5331 interfaceC5331Mo9587 = interfaceC5316.mo9587();
                                    interfaceC5331Mo9587.getClass();
                                    Class clsM10631 = AbstractC5899.m10631((AbstractC7818) interfaceC5331Mo9587);
                                    if (clsM10631 == null) {
                                        C5043.m9154(c5858, "Unknown container class for overridden function: ");
                                        return null;
                                    }
                                    arrayList7.add(new C5858((C5836) AbstractC5228.f13320.mo9476(clsM10631), interfaceC5316));
                                }
                                Iterator it5 = arrayList7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        ArrayList<InterfaceC5940> arrayListM94932 = AbstractC5238.m9493((InterfaceC5893) next);
                                        if (!arrayListM94932.isEmpty()) {
                                            for (InterfaceC5940 interfaceC5940 : arrayListM94932) {
                                                AbstractC5892 abstractC5892 = interfaceC5940 instanceof AbstractC5892 ? (AbstractC5892) interfaceC5940 : null;
                                                if (abstractC5892 == null || !abstractC5892.mo10515()) {
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                interfaceC5893 = (InterfaceC5893) next;
                            }
                            if (interfaceC5893 == null) {
                            }
                        } else {
                            interfaceC5893 = null;
                            if (interfaceC5893 == null) {
                                String strM10716 = AbstractC5976.m10716(interfaceC5893.getSignature(), '(');
                                C0923 c0923M141832 = AbstractC9004.m14183(interfaceC5893, interfaceC5893.getSignature().substring(strM10716.length()));
                                arrayList3.addAll((Set) c0923M141832.f573);
                                declaredConstructor = abstractC58352.m10537(strM10716, (String) c0923M141832.f572, true, c5858.mo10501().mo9591() != null);
                            } else {
                                C7715 c77152 = ((C5868) abstractC7082M106382).f14866;
                                C0923 c0923M141833 = AbstractC9004.m14183(c5858, c77152.f18678);
                                arrayList3.addAll((Set) c0923M141833.f573);
                                String str3 = c77152.f18679;
                                String str4 = (String) c0923M141833.f572;
                                c5858.mo10500().mo12555().getClass();
                                declaredConstructor = abstractC58352.m10537(str3, str4, !Modifier.isStatic(r8.getModifiers()), c5858.mo10501().mo9591() != null);
                            }
                        }
                    } else {
                        for (InterfaceC5940 interfaceC59402 : arrayListM9493) {
                            AbstractC5892 abstractC58922 = interfaceC59402 instanceof AbstractC5892 ? (AbstractC5892) interfaceC59402 : null;
                            if (abstractC58922 != null && abstractC58922.mo10515()) {
                                interfaceC5893 = null;
                                if (interfaceC5893 == null) {
                                }
                            }
                        }
                        if (!(abstractC58352 instanceof InterfaceC5925)) {
                        }
                        if (interfaceC5925 == null) {
                            interfaceC5893 = null;
                            if (interfaceC5893 == null) {
                            }
                        }
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    abstractC7323M10552 = c5858.m10553((Constructor) declaredConstructor, c5858.mo10501(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    abstractC7323M10552 = null;
                } else if (((AbstractC2167) c5858.mo10501()).getAnnotations().mo10076(AbstractC5899.f14953) != null) {
                    InterfaceC5331 interfaceC5331Mo95872 = c5858.mo10501().mo9587();
                    interfaceC5331Mo95872.getClass();
                    if (((AbstractC7818) interfaceC5331Mo95872).mo9572()) {
                        abstractC7323M10552 = c5858.m10552((Method) declaredConstructor, c5858.mo10500().mo12554());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        abstractC7323M10552 = AbstractC5894.m10601(c5858) ? new C7331(method2, false, 4) : new C7324(4, 1, method2, true);
                    }
                }
                if (abstractC7323M10552 != null) {
                    return AbstractC1298.m1738(arrayList3, c5858, abstractC7323M10552, true);
                }
                return null;
            default:
                Type typeM14201 = AbstractC9004.m14201(c5858);
                return typeM14201 == null ? c5858.mo10500().getReturnType() : typeM14201;
        }
    }
}
