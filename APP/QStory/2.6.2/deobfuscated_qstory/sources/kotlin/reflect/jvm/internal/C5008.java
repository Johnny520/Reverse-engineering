package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.util.C4210;
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
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.xposed.hook.javaplugin.C5553;
import p047.AbstractC6493;
import p047.C6492;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5008 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5007 f14435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14436;

    public /* synthetic */ C5008(AbstractC5007 abstractC5007, int i) {
        this.f14436 = i;
        this.f14435 = abstractC5007;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        GenericDeclaration genericDeclarationM9980;
        AbstractC6493 abstractC6493M9989;
        GenericDeclaration genericDeclarationM9981;
        int i = this.f14436;
        boolean z = false;
        AbstractC5007 abstractC5007 = this.f14435;
        switch (i) {
            case 0:
                AbstractC5007 abstractC50072 = this.f14435;
                return AbstractC0455.m1167(abstractC50072, abstractC50072.mo9971(), abstractC50072.mo9970(), abstractC50072.mo9967(), abstractC50072.mo9968(), true);
            case 1:
                AbstractC5007 abstractC50073 = this.f14435;
                return AbstractC5061.m10028(abstractC50073) ? AbstractC0455.m1167(abstractC50073, abstractC50073.mo9971(), abstractC50073.mo9970(), abstractC50073.mo9967(), abstractC50073.mo9968(), false) : abstractC50073.mo9964();
            case 2:
                boolean zM10027 = AbstractC5061.m10027(abstractC5007);
                AbstractC5002 abstractC5002 = abstractC5007.f14433;
                if (!zM10027 && !(abstractC5002 instanceof C4991)) {
                    C5553.m10815(abstractC5007, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C4515 c4515Mo9969 = abstractC5007.mo9969();
                String str = c4515Mo9969.f13156;
                if (AbstractC5061.m10027(abstractC5007) && (!(abstractC5002 instanceof C5003) || !((C5003) abstractC5002).mo8894())) {
                    if (AbstractC5061.m10029(abstractC5007)) {
                        Class clsMo8889 = abstractC5002.mo8889();
                        List parameters = abstractC5007.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((InterfaceC5107) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new C6492(clsMo8889, arrayList, AnnotationConstructorCaller$CallMode.POSITIONAL_CALL, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    abstractC5002.getClass();
                    str.getClass();
                    Class clsMo88892 = abstractC5002.mo8889();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5066.m10072(AbstractC4430.m8984(abstractC5002.mo8889()), str, false).f227).toArray(new Class[0]);
                        genericDeclarationM9980 = clsMo88892.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationM9980 = null;
                    }
                    break;
                } else {
                    genericDeclarationM9980 = abstractC5002.m9980(c4515Mo9969.f13157, str);
                }
                if (genericDeclarationM9980 instanceof Constructor) {
                    abstractC6493M9989 = abstractC5007.m9990((Constructor) genericDeclarationM9980, false);
                } else {
                    if (!(genericDeclarationM9980 instanceof Method)) {
                        C4210.m8605(abstractC5007, "Could not compute caller for function: ");
                        return null;
                    }
                    abstractC6493M9989 = abstractC5007.m9989((Method) genericDeclarationM9980, false);
                }
                return AbstractC4921.m9897(EmptyList.INSTANCE, abstractC5007, abstractC6493M9989, false);
            default:
                boolean zM100272 = AbstractC5061.m10027(abstractC5007);
                AbstractC5002 abstractC50022 = abstractC5007.f14433;
                if (!zM100272 && !(abstractC50022 instanceof C4991)) {
                    C5553.m10815(abstractC5007, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C4515 c4515Mo99692 = abstractC5007.mo9969();
                ArrayList arrayList2 = new ArrayList();
                if (AbstractC5061.m10027(abstractC5007) && (!(abstractC50022 instanceof C5003) || !((C5003) abstractC50022).mo8894())) {
                    if (AbstractC5061.m10029(abstractC5007)) {
                        Class clsMo88893 = abstractC50022.mo8889();
                        List parameters2 = abstractC5007.getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(parameters2, 10));
                        Iterator it2 = parameters2.iterator();
                        while (it2.hasNext()) {
                            String name2 = ((InterfaceC5107) it2.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new C6492(clsMo88893, arrayList3, AnnotationConstructorCaller$CallMode.CALL_BY_NAME, AnnotationConstructorCaller$Origin.KOTLIN);
                    }
                    C0076 c0076M6238 = AbstractC2904.m6238(abstractC5007, abstractC5007.mo9969().f13156);
                    arrayList2.addAll((Set) c0076M6238.f228);
                    String str2 = (String) c0076M6238.f227;
                    abstractC50022.getClass();
                    str2.getClass();
                    Class clsMo88894 = abstractC50022.mo8889();
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC5002.m9978(arrayList4, (ArrayList) AbstractC5066.m10072(AbstractC4430.m8984(abstractC50022.mo8889()), str2, false).f227, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationM9981 = clsMo88894.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationM9981 = null;
                    }
                    break;
                } else {
                    C0076 c0076M62382 = AbstractC2904.m6238(abstractC5007, c4515Mo99692.f13156);
                    arrayList2.addAll((Set) c0076M62382.f228);
                    String str3 = c4515Mo99692.f13157;
                    String str4 = (String) c0076M62382.f227;
                    Member memberMo11953 = abstractC5007.mo9944().mo11953();
                    memberMo11953.getClass();
                    boolean z2 = !Modifier.isStatic(memberMo11953.getModifiers());
                    List listMo9964 = abstractC5007.mo9964();
                    if (listMo9964 == null || !listMo9964.isEmpty()) {
                        Iterator it3 = listMo9964.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((InterfaceC5107) it3.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                    z = true;
                                }
                            }
                        }
                    }
                    genericDeclarationM9981 = abstractC50022.m9981(str3, str4, z2, z);
                }
                AbstractC6493 abstractC6493M9990 = genericDeclarationM9981 instanceof Constructor ? abstractC5007.m9990((Constructor) genericDeclarationM9981, true) : genericDeclarationM9981 instanceof Method ? abstractC5007.m9989((Method) genericDeclarationM9981, abstractC5007.mo9944().mo11952()) : null;
                if (abstractC6493M9990 != null) {
                    return AbstractC4921.m9897(arrayList2, abstractC5007, abstractC6493M9990, true);
                }
                return null;
        }
    }
}
