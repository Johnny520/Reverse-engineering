package p095;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.C5302;
import kotlin.reflect.jvm.internal.impl.descriptors.C5315;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import kotlin.reflect.jvm.internal.impl.types.C5743;
import kotlin.reflect.jvm.internal.impl.types.C5745;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import p050.AbstractC7176;
import p062.InterfaceC7310;
import p082.AbstractC7699;
import p113.InterfaceC8048;
import p117.C8086;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7834 extends AbstractC7818 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ArrayList f19161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ArrayList f19162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C5743 f19163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5751 f19164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5751 f19165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7818 f19166;

    public C7834(AbstractC7818 abstractC7818, C5751 c5751) {
        this.f19166 = abstractC7818;
        this.f19164 = c5751;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12898(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i != 6) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 13) {
                        if (i != 23) {
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                        } else {
                            objArr[0] = "substitutor";
                        }
                    }
                }
            }
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        InterfaceC7310 annotations = this.f19166.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m12898(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    public final C5523 getName() {
        C5523 name = this.f19166.getName();
        if (name != null) {
            return name;
        }
        m12898(20);
        throw null;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 visibility = this.f19166.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m12898(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return this.f19166.isExternal();
    }

    @Override // p095.AbstractC7818
    public final boolean isInline() {
        return this.f19166.isInline();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final InterfaceC8083 mo9773() {
        AbstractC5605.m10063(AbstractC7699.m12663(this.f19166));
        return mo9578(C5681.f14476);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC8083 mo9774() {
        InterfaceC8083 interfaceC8083Mo9774 = this.f19166.mo9774();
        if (interfaceC8083Mo9774 != null) {
            return interfaceC8083Mo9774;
        }
        m12898(28);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC8083 mo9565() {
        InterfaceC8083 interfaceC8083Mo9565 = this.f19166.mo9565();
        if (interfaceC8083Mo9565 != null) {
            return interfaceC8083Mo9565;
        }
        m12898(15);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC7818 mo9561() {
        AbstractC7818 abstractC7818Mo9561 = this.f19166.mo9561();
        if (abstractC7818Mo9561 != null) {
            return abstractC7818Mo9561;
        }
        m12898(21);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C7835 mo12866() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        InterfaceC5705 interfaceC5705Mo9560 = this.f19166.mo9560();
        if (this.f19164.f14594.mo10293()) {
            if (interfaceC5705Mo9560 != null) {
                return interfaceC5705Mo9560;
            }
            m12898(0);
            throw null;
        }
        if (this.f19163 == null) {
            C5751 c5751M12899 = m12899();
            Collection collectionMo10053 = interfaceC5705Mo9560.mo10053();
            ArrayList arrayList = new ArrayList(collectionMo10053.size());
            Iterator it = collectionMo10053.iterator();
            while (it.hasNext()) {
                arrayList.add(c5751M12899.m10421((AbstractC5714) it.next(), Variance.INVARIANT));
            }
            this.f19163 = new C5743(this, this.f19162, arrayList, C5677.f14468);
        }
        C5743 c5743 = this.f19163;
        if (c5743 != null) {
            return c5743;
        }
        m12898(1);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9566() {
        Collection<C7847> collectionMo9566 = this.f19166.mo9566();
        ArrayList arrayList = new ArrayList(collectionMo9566.size());
        for (C7847 c7847 : collectionMo9566) {
            c7847.getClass();
            C7832 c7832M12895 = c7847.m12895(C5751.f14593);
            c7832M12895.f19146 = c7847.mo12848();
            c7832M12895.mo9654(c7847.mo9568());
            c7832M12895.mo9651(c7847.getVisibility());
            c7832M12895.mo9645(c7847.getKind());
            c7832M12895.f19136 = false;
            arrayList.add(((C7847) c7832M12895.f19133.mo12549(c7832M12895)).mo9564(m12899()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5332 mo9564(C5751 c5751) {
        if (c5751 != null) {
            AbstractC5748 abstractC5748 = c5751.f14594;
            return abstractC5748.mo10293() ? this : new C7834(this, C5751.m10414(abstractC5748, m12899().f14594));
        }
        m12898(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9585() {
        return InterfaceC5294.f13436;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo855(this, obj);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC8083 mo12867(AbstractC5748 abstractC5748, AbstractC5693 abstractC5693) {
        InterfaceC8083 interfaceC8083Mo12867 = this.f19166.mo12867(abstractC5748, abstractC5693);
        if (!this.f19164.f14594.mo10293()) {
            return new C8086(interfaceC8083Mo12867, m12899());
        }
        if (interfaceC8083Mo12867 != null) {
            return interfaceC8083Mo12867;
        }
        m12898(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return this.f19166.mo9567();
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        Modality modalityMo9568 = this.f19166.mo9568();
        if (modalityMo9568 != null) {
            return modalityMo9568;
        }
        m12898(26);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final List mo10098() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12898(17);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9569() {
        ClassKind classKindMo9569 = this.f19166.mo9569();
        if (classKindMo9569 != null) {
            return classKindMo9569;
        }
        m12898(25);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC8083 mo12868(AbstractC5748 abstractC5748) {
        AbstractC5605.m10063(AbstractC7699.m12663(this));
        return mo12867(abstractC5748, C5681.f14476);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        InterfaceC5331 interfaceC5331Mo9587 = this.f19166.mo9587();
        if (interfaceC5331Mo9587 != null) {
            return interfaceC5331Mo9587;
        }
        m12898(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9570() {
        return this.f19166.mo9570();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9571() {
        return this.f19166.mo9571();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9572() {
        return this.f19166.mo9572();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final C5751 m12899() {
        if (this.f19165 == null) {
            C5751 c5751 = this.f19164;
            if (c5751.f14594.mo10293()) {
                this.f19165 = c5751;
            } else {
                List parameters = this.f19166.mo9560().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.f19162 = arrayList;
                this.f19165 = AbstractC5725.m10361(parameters, c5751.f14594, this, arrayList);
                ArrayList arrayList2 = this.f19162;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((InterfaceC5295) obj).mo9558()) {
                        arrayList3.add(obj);
                    }
                }
                this.f19161 = arrayList3;
            }
        }
        return this.f19165;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9573() {
        return this.f19166.mo9573();
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9574() {
        m12899();
        ArrayList arrayList = this.f19161;
        if (arrayList != null) {
            return arrayList;
        }
        m12898(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return this.f19166.mo9575();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9576() {
        return this.f19166.mo9576();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7847 mo9577() {
        return this.f19166.mo9577();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC8083 mo9578(AbstractC5693 abstractC5693) {
        InterfaceC8083 interfaceC8083Mo9578 = this.f19166.mo9578(abstractC5693);
        if (!this.f19164.f14594.mo10293()) {
            return new C8086(interfaceC8083Mo9578, m12899());
        }
        if (interfaceC8083Mo9578 != null) {
            return interfaceC8083Mo9578;
        }
        m12898(14);
        throw null;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC5710 mo9584() {
        C5706 c5706M10326;
        List listM10404 = AbstractC5749.m10404(mo9560().getParameters());
        InterfaceC7310 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C5706.f14520.getClass();
            c5706M10326 = C5706.f14521;
        } else {
            C5707 c5707 = C5706.f14520;
            List listM12487 = AbstractC7176.m12487(new C5745(annotations));
            c5707.getClass();
            c5706M10326 = C5707.m10326(listM12487);
        }
        return AbstractC5725.m10378(listM10404, c5706M10326, mo9560(), mo9773(), false);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5291 mo9579() {
        AbstractC5291 abstractC5291Mo9579 = this.f19166.mo9579();
        if (abstractC5291Mo9579 == null) {
            return null;
        }
        boolean z = abstractC5291Mo9579 instanceof C5315;
        C5751 c5751 = this.f19164;
        if (z) {
            C5315 c5315 = (C5315) abstractC5291Mo9579;
            C5523 c5523 = c5315.f13457;
            AbstractC5710 abstractC5710 = (AbstractC5710) c5315.f13456;
            if (abstractC5710 != null && !c5751.f14594.mo10293()) {
                abstractC5710 = (AbstractC5710) m12899().m10421(abstractC5710, Variance.INVARIANT);
            }
            return new C5315(c5523, abstractC5710);
        }
        if (!(abstractC5291Mo9579 instanceof C5302)) {
            C5043.m9170();
            return null;
        }
        ArrayList<Pair> arrayList = ((C5302) abstractC5291Mo9579).f13446;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (Pair pair : arrayList) {
            C5523 c55232 = (C5523) pair.component1();
            AbstractC5710 abstractC57102 = (AbstractC5710) ((InterfaceC8048) pair.component2());
            if (abstractC57102 != null && !c5751.f14594.mo10293()) {
                abstractC57102 = (AbstractC5710) m12899().m10421(abstractC57102, Variance.INVARIANT);
            }
            arrayList2.add(new Pair(c55232, abstractC57102));
        }
        return new C5302(arrayList2);
    }
}
