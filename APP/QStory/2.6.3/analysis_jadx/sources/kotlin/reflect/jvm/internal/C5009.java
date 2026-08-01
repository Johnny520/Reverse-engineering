package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import io.ktor.util.C4211;
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
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import lin.xposed.hook.javaplugin.C5554;
import p047.AbstractC6494;
import p047.C6493;
import p052.InterfaceC6543;
import p053.AbstractC6561;
import p251.AbstractC8175;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5009 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5008 f14437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14438;

    public /* synthetic */ C5009(AbstractC5008 abstractC5008, int i) {
        this.f14438 = i;
        this.f14437 = abstractC5008;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        GenericDeclaration genericDeclarationM9977;
        AbstractC6494 abstractC6494M9986;
        GenericDeclaration genericDeclarationM9978;
        int i = this.f14438;
        boolean z = false;
        AbstractC5008 abstractC5008 = this.f14437;
        switch (i) {
            case 0:
                AbstractC5008 abstractC50082 = this.f14437;
                return AbstractC6561.m12055(abstractC50082, abstractC50082.mo9968(), abstractC50082.mo9967(), abstractC50082.mo9964(), abstractC50082.mo9965(), true);
            case 1:
                AbstractC5008 abstractC50083 = this.f14437;
                return AbstractC5062.m10042(abstractC50083) ? AbstractC6561.m12055(abstractC50083, abstractC50083.mo9968(), abstractC50083.mo9967(), abstractC50083.mo9964(), abstractC50083.mo9965(), false) : abstractC50083.mo9961();
            case 2:
                boolean zM10040 = AbstractC5062.m10040(abstractC5008);
                AbstractC5003 abstractC5003 = abstractC5008.f14435;
                if (!zM10040 && !(abstractC5003 instanceof C4992)) {
                    C5554.m10872(abstractC5008, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C4516 c4516Mo9966 = abstractC5008.mo9966();
                String str = c4516Mo9966.f13160;
                if (AbstractC5062.m10040(abstractC5008) && (!(abstractC5003 instanceof C5004) || !((C5004) abstractC5003).mo8884())) {
                    if (AbstractC5062.m10038(abstractC5008)) {
                        Class clsMo8879 = abstractC5003.mo8879();
                        List parameters = abstractC5008.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((InterfaceC5108) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new C6493(clsMo8879, arrayList, AnnotationConstructorCaller$CallMode.POSITIONAL_CALL, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    abstractC5003.getClass();
                    str.getClass();
                    Class clsMo88792 = abstractC5003.mo8879();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5067.m10076(AbstractC4431.m8974(abstractC5003.mo8879()), str, false).f227).toArray(new Class[0]);
                        genericDeclarationM9977 = clsMo88792.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationM9977 = null;
                    }
                    break;
                } else {
                    genericDeclarationM9977 = abstractC5003.m9977(c4516Mo9966.f13161, str);
                }
                if (genericDeclarationM9977 instanceof Constructor) {
                    abstractC6494M9986 = abstractC5008.m9987((Constructor) genericDeclarationM9977, false);
                } else {
                    if (!(genericDeclarationM9977 instanceof Method)) {
                        C4211.m8595(abstractC5008, "Could not compute caller for function: ");
                        return null;
                    }
                    abstractC6494M9986 = abstractC5008.m9986((Method) genericDeclarationM9977, false);
                }
                return AbstractC0455.m1178(EmptyList.INSTANCE, abstractC5008, abstractC6494M9986, false);
            default:
                boolean zM100402 = AbstractC5062.m10040(abstractC5008);
                AbstractC5003 abstractC50032 = abstractC5008.f14435;
                if (!zM100402 && !(abstractC50032 instanceof C4992)) {
                    C5554.m10872(abstractC5008, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C4516 c4516Mo99662 = abstractC5008.mo9966();
                ArrayList arrayList2 = new ArrayList();
                if (AbstractC5062.m10040(abstractC5008) && (!(abstractC50032 instanceof C5004) || !((C5004) abstractC50032).mo8884())) {
                    if (AbstractC5062.m10038(abstractC5008)) {
                        Class clsMo88793 = abstractC50032.mo8879();
                        List parameters2 = abstractC5008.getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(parameters2, 10));
                        Iterator it2 = parameters2.iterator();
                        while (it2.hasNext()) {
                            String name2 = ((InterfaceC5108) it2.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new C6493(clsMo88793, arrayList3, AnnotationConstructorCaller$CallMode.CALL_BY_NAME, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    C0076 c0076M13624 = AbstractC8175.m13624(abstractC5008, abstractC5008.mo9966().f13160);
                    arrayList2.addAll((Set) c0076M13624.f228);
                    String str2 = (String) c0076M13624.f227;
                    abstractC50032.getClass();
                    str2.getClass();
                    Class clsMo88794 = abstractC50032.mo8879();
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC5003.m9975(arrayList4, (ArrayList) AbstractC5067.m10076(AbstractC4431.m8974(abstractC50032.mo8879()), str2, false).f227, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationM9978 = clsMo88794.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationM9978 = null;
                    }
                    break;
                } else {
                    C0076 c0076M136242 = AbstractC8175.m13624(abstractC5008, c4516Mo99662.f13160);
                    arrayList2.addAll((Set) c0076M136242.f228);
                    String str3 = c4516Mo99662.f13161;
                    String str4 = (String) c0076M136242.f227;
                    Member memberMo11996 = abstractC5008.mo9941().mo11996();
                    memberMo11996.getClass();
                    boolean z2 = !Modifier.isStatic(memberMo11996.getModifiers());
                    List listMo9961 = abstractC5008.mo9961();
                    if (listMo9961 == null || !listMo9961.isEmpty()) {
                        Iterator it3 = listMo9961.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((InterfaceC5108) it3.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                    z = true;
                                }
                            }
                        }
                    }
                    genericDeclarationM9978 = abstractC50032.m9978(str3, str4, z2, z);
                }
                AbstractC6494 abstractC6494M9987 = genericDeclarationM9978 instanceof Constructor ? abstractC5008.m9987((Constructor) genericDeclarationM9978, true) : genericDeclarationM9978 instanceof Method ? abstractC5008.m9986((Method) genericDeclarationM9978, abstractC5008.mo9941().mo11995()) : null;
                if (abstractC6494M9987 != null) {
                    return AbstractC0455.m1178(arrayList2, abstractC5008, abstractC6494M9987, true);
                }
                return null;
        }
    }
}
