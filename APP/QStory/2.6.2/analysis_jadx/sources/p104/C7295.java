package p104;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p066.AbstractC6869;
import p066.AbstractC6878;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.AbstractC7008;
import p079.C6978;
import p079.C7005;
import p100.C7244;
import p100.InterfaceC7243;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7295 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7295 f19437 = new C7295(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7295 f19438 = new C7295(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7295 f19432 = new C7295(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7295 f19431 = new C7295(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C7295 f19435 = new C7295(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C7295 f19436 = new C7295(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C7295 f19433 = new C7295(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C7295 f19434 = new C7295(7);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C7295 f19430 = new C7295(8);

    public /* synthetic */ C7295(int i) {
        this.f19439 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        AbstractC4877 abstractC4877Mo9035;
        AbstractC4913 abstractC4913M13033;
        AbstractC4881 returnType;
        C4687 c4687M9508;
        AbstractC4881 returnType2;
        boolean zM13028 = false;
        switch (this.f19439) {
            case 0:
                ((InterfaceC4483) obj).getClass();
                return null;
            case 1:
                ((InterfaceC4483) obj).getClass();
                return null;
            case 2:
                ((InterfaceC4483) obj).getClass();
                return null;
            case 3:
                InterfaceC4483 interfaceC4483 = (InterfaceC4483) obj;
                List list = AbstractC7293.f19424;
                interfaceC4483.getClass();
                List listMo9045 = interfaceC4483.mo9045();
                listMo9045.getClass();
                InterfaceC4455 interfaceC4455 = (InterfaceC4455) AbstractC4343.m8810(listMo9045);
                if (interfaceC4455 == null || AbstractC4772.m9513(interfaceC4455) || ((C6978) interfaceC4455).f18676 != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                InterfaceC4483 interfaceC44832 = (InterfaceC4483) obj;
                List list2 = AbstractC7293.f19424;
                interfaceC44832.getClass();
                InterfaceC4498 interfaceC4498Mo9038 = interfaceC44832.mo9038();
                interfaceC4498Mo9038.getClass();
                if (interfaceC4498Mo9038 instanceof AbstractC6988) {
                    C4690 c4690 = AbstractC6529.f17924;
                    if (AbstractC6529.m11976((AbstractC6988) interfaceC4498Mo9038, AbstractC6526.f17889)) {
                        return null;
                    }
                }
                Collection collectionMo9040 = interfaceC44832.mo9040();
                collectionMo9040.getClass();
                Collection collection = collectionMo9040;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC4498 interfaceC4498Mo90382 = ((InterfaceC4483) it.next()).mo9038();
                        interfaceC4498Mo90382.getClass();
                        if (interfaceC4498Mo90382 instanceof AbstractC6988) {
                            C4690 c46902 = AbstractC6529.f17924;
                            if (AbstractC6529.m11976((AbstractC6988) interfaceC4498Mo90382, AbstractC6526.f17889)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC4498 interfaceC4498Mo90383 = interfaceC44832.mo9038();
                AbstractC6988 abstractC6988 = interfaceC4498Mo90383 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4498Mo90383 : null;
                if (abstractC6988 != null) {
                    if (!AbstractC6878.m12127(abstractC6988)) {
                        abstractC6988 = null;
                    }
                    if (abstractC6988 != null && (abstractC4877Mo9035 = abstractC6988.mo9035()) != null && (abstractC4913M13033 = AbstractC7738.m13033(abstractC4877Mo9035)) != null && (returnType = interfaceC44832.getReturnType()) != null && AbstractC4394.m8917(((AbstractC7008) interfaceC44832).getName(), AbstractC7290.f19403)) {
                        C4690 c46903 = AbstractC6529.f17924;
                        if ((AbstractC6529.m11967(returnType, AbstractC6526.f17902) || AbstractC6529.m11975(returnType)) && interfaceC44832.mo9045().size() == 1) {
                            AbstractC4881 type = ((AbstractC6976) ((InterfaceC4455) interfaceC44832.mo9045().get(0))).getType();
                            type.getClass();
                            if (AbstractC4394.m8917(AbstractC7738.m13033(type), abstractC4913M13033) && interfaceC44832.mo9047().isEmpty() && interfaceC44832.mo9042() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC4498 interfaceC4498Mo90384 = interfaceC44832.mo9038();
                interfaceC4498Mo90384.getClass();
                if (AbstractC6878.m12127(interfaceC4498Mo90384)) {
                    C4743 c4743 = C4743.f13885;
                    InterfaceC4498 interfaceC4498Mo90385 = interfaceC44832.mo9038();
                    interfaceC4498Mo90385.getClass();
                    AbstractC4877 abstractC4877Mo90352 = ((AbstractC6988) interfaceC4498Mo90385).mo9035();
                    abstractC4877Mo90352.getClass();
                    sb.append(" or define ''equals(other: " + c4743.m9496(AbstractC7738.m13033(abstractC4877Mo90352)) + "): Boolean''");
                }
                return sb.toString();
            case 5:
                InterfaceC4483 interfaceC44833 = (InterfaceC4483) obj;
                List list3 = AbstractC7293.f19424;
                interfaceC44833.getClass();
                C7005 c7005Mo9044 = interfaceC44833.mo9044();
                if (c7005Mo9044 == null) {
                    c7005Mo9044 = interfaceC44833.mo9042();
                }
                if (c7005Mo9044 != null) {
                    AbstractC4881 returnType3 = interfaceC44833.getReturnType();
                    if (returnType3 != null ? AbstractC7738.m13028(returnType3, c7005Mo9044.getType()) : false) {
                        return null;
                    }
                    InterfaceC7243 interfaceC7243M12317 = c7005Mo9044.m12317();
                    interfaceC7243M12317.getClass();
                    if (interfaceC7243M12317 instanceof C7244) {
                        AbstractC6988 abstractC69882 = ((C7244) interfaceC7243M12317).f19309;
                        if (abstractC69882.mo9018() && (c4687M9508 = AbstractC4772.m9508(abstractC69882)) != null) {
                            InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(abstractC69882);
                            interfaceC4485M12076.getClass();
                            InterfaceC4476 interfaceC4476M9086 = AbstractC4490.m9086(interfaceC4485M12076, c4687M9508);
                            AbstractC6995 abstractC6995 = interfaceC4476M9086 instanceof AbstractC6995 ? (AbstractC6995) interfaceC4476M9086 : null;
                            if (abstractC6995 != null && (returnType2 = interfaceC44833.getReturnType()) != null) {
                                zM13028 = AbstractC7738.m13028(returnType2, abstractC6995.mo9531());
                            }
                        }
                    }
                    if (zM13028) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 6:
                AbstractC6529 abstractC6529 = (AbstractC6529) obj;
                C7291 c7291 = C7291.f19421;
                abstractC6529.getClass();
                return abstractC6529.m11984(PrimitiveType.BOOLEAN);
            case 7:
                AbstractC6529 abstractC65292 = (AbstractC6529) obj;
                C7284 c7284 = C7284.f19390;
                abstractC65292.getClass();
                return abstractC65292.m11984(PrimitiveType.INT);
            default:
                AbstractC6529 abstractC65293 = (AbstractC6529) obj;
                C7283 c7283 = C7283.f19389;
                abstractC65293.getClass();
                return abstractC65293.m11985();
        }
    }
}
