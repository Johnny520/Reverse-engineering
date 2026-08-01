package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0923;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import io.ktor.util.C5043;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import lin.xposed.hook.javaplugin.C6385;
import p063.AbstractC7323;
import p063.C7322;
import p068.InterfaceC7372;
import p069.AbstractC7390;
import p267.AbstractC9004;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5841 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5840 f14782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14783;

    public /* synthetic */ C5841(AbstractC5840 abstractC5840, int i) {
        this.f14783 = i;
        this.f14782 = abstractC5840;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        GenericDeclaration genericDeclarationM10536;
        AbstractC7323 abstractC7323M10545;
        GenericDeclaration genericDeclarationM10537;
        int i = this.f14783;
        boolean z = false;
        AbstractC5840 abstractC5840 = this.f14782;
        switch (i) {
            case 0:
                AbstractC5840 abstractC58402 = this.f14782;
                return AbstractC7390.m12614(abstractC58402, abstractC58402.mo10527(), abstractC58402.mo10526(), abstractC58402.mo10523(), abstractC58402.mo10524(), true);
            case 1:
                AbstractC5840 abstractC58403 = this.f14782;
                return AbstractC5894.m10601(abstractC58403) ? AbstractC7390.m12614(abstractC58403, abstractC58403.mo10527(), abstractC58403.mo10526(), abstractC58403.mo10523(), abstractC58403.mo10524(), false) : abstractC58403.mo10520();
            case 2:
                boolean zM10599 = AbstractC5894.m10599(abstractC5840);
                AbstractC5835 abstractC5835 = abstractC5840.f14780;
                if (!zM10599 && !(abstractC5835 instanceof C5824)) {
                    C6385.m11431(abstractC5840, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C5348 c5348Mo10525 = abstractC5840.mo10525();
                String str = c5348Mo10525.f13505;
                if (AbstractC5894.m10599(abstractC5840) && (!(abstractC5835 instanceof C5836) || !((C5836) abstractC5835).mo9443())) {
                    if (AbstractC5894.m10597(abstractC5840)) {
                        Class clsMo9438 = abstractC5835.mo9438();
                        List parameters = abstractC5840.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((InterfaceC5940) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new C7322(clsMo9438, arrayList, AnnotationConstructorCaller$CallMode.POSITIONAL_CALL, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    abstractC5835.getClass();
                    str.getClass();
                    Class clsMo94382 = abstractC5835.mo9438();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5899.m10635(AbstractC5263.m9533(abstractC5835.mo9438()), str, false).f572).toArray(new Class[0]);
                        genericDeclarationM10536 = clsMo94382.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationM10536 = null;
                    }
                    break;
                } else {
                    genericDeclarationM10536 = abstractC5835.m10536(c5348Mo10525.f13506, str);
                }
                if (genericDeclarationM10536 instanceof Constructor) {
                    abstractC7323M10545 = abstractC5840.m10546((Constructor) genericDeclarationM10536, false);
                } else {
                    if (!(genericDeclarationM10536 instanceof Method)) {
                        C5043.m9154(abstractC5840, "Could not compute caller for function: ");
                        return null;
                    }
                    abstractC7323M10545 = abstractC5840.m10545((Method) genericDeclarationM10536, false);
                }
                return AbstractC1298.m1738(EmptyList.INSTANCE, abstractC5840, abstractC7323M10545, false);
            default:
                boolean zM105992 = AbstractC5894.m10599(abstractC5840);
                AbstractC5835 abstractC58352 = abstractC5840.f14780;
                if (!zM105992 && !(abstractC58352 instanceof C5824)) {
                    C6385.m11431(abstractC5840, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C5348 c5348Mo105252 = abstractC5840.mo10525();
                ArrayList arrayList2 = new ArrayList();
                if (AbstractC5894.m10599(abstractC5840) && (!(abstractC58352 instanceof C5836) || !((C5836) abstractC58352).mo9443())) {
                    if (AbstractC5894.m10597(abstractC5840)) {
                        Class clsMo94383 = abstractC58352.mo9438();
                        List parameters2 = abstractC5840.getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(parameters2, 10));
                        Iterator it2 = parameters2.iterator();
                        while (it2.hasNext()) {
                            String name2 = ((InterfaceC5940) it2.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new C7322(clsMo94383, arrayList3, AnnotationConstructorCaller$CallMode.CALL_BY_NAME, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    C0923 c0923M14183 = AbstractC9004.m14183(abstractC5840, abstractC5840.mo10525().f13505);
                    arrayList2.addAll((Set) c0923M14183.f573);
                    String str2 = (String) c0923M14183.f572;
                    abstractC58352.getClass();
                    str2.getClass();
                    Class clsMo94384 = abstractC58352.mo9438();
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC5835.m10534(arrayList4, (ArrayList) AbstractC5899.m10635(AbstractC5263.m9533(abstractC58352.mo9438()), str2, false).f572, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationM10537 = clsMo94384.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationM10537 = null;
                    }
                    break;
                } else {
                    C0923 c0923M141832 = AbstractC9004.m14183(abstractC5840, c5348Mo105252.f13505);
                    arrayList2.addAll((Set) c0923M141832.f573);
                    String str3 = c5348Mo105252.f13506;
                    String str4 = (String) c0923M141832.f572;
                    Member memberMo12555 = abstractC5840.mo10500().mo12555();
                    memberMo12555.getClass();
                    boolean z2 = !Modifier.isStatic(memberMo12555.getModifiers());
                    List listMo10520 = abstractC5840.mo10520();
                    if (listMo10520 == null || !listMo10520.isEmpty()) {
                        Iterator it3 = listMo10520.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((InterfaceC5940) it3.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                    z = true;
                                }
                            }
                        }
                    }
                    genericDeclarationM10537 = abstractC58352.m10537(str3, str4, z2, z);
                }
                AbstractC7323 abstractC7323M10546 = genericDeclarationM10537 instanceof Constructor ? abstractC5840.m10546((Constructor) genericDeclarationM10537, true) : genericDeclarationM10537 instanceof Method ? abstractC5840.m10545((Method) genericDeclarationM10537, abstractC5840.mo10500().mo12554()) : null;
                if (abstractC7323M10546 != null) {
                    return AbstractC1298.m1738(arrayList2, abstractC5840, abstractC7323M10546, true);
                }
                return null;
        }
    }
}
