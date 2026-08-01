package kotlin.reflect.jvm.internal.types;

import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5890;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.ClassKind;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p050.AbstractC7173;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8051;
import p113.InterfaceC8052;
import p113.InterfaceC8053;
import p113.InterfaceC8055;
import p113.InterfaceC8056;
import p113.InterfaceC8057;
import p113.InterfaceC8058;
import p113.InterfaceC8059;
import p113.InterfaceC8060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5763 implements InterfaceC8058 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5763 f14626 = new C5763();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static TypeVariance m10482(KVariance kVariance) {
        int i = AbstractC5765.f14629[kVariance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.f309IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m10483(Object obj) {
        throw new KotlinReflectionInternalError("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC8060 mo10161(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8048 interfaceC8048Mo10200 = mo10200(interfaceC8049);
        if (interfaceC8048Mo10200 == null) {
            interfaceC8048Mo10200 = mo10164(interfaceC8049);
        }
        return mo10182(interfaceC8048Mo10200);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public boolean mo10162(InterfaceC8060 interfaceC8060) {
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo10163(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC8048 mo10164(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8050 interfaceC8050Mo10185 = mo10185(interfaceC8049);
        if (interfaceC8050Mo10185 != null) {
            return mo10153(interfaceC8050Mo10185);
        }
        InterfaceC8048 interfaceC8048Mo10200 = mo10200(interfaceC8049);
        interfaceC8048Mo10200.getClass();
        return interfaceC8048Mo10200;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public boolean mo10165(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        return interfaceC8060.equals(C5764.f14627);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public boolean mo10166(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return ((InterfaceC5919) interfaceC8049).mo9455();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo10167(InterfaceC8052 interfaceC8052) {
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo10168(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public InterfaceC8052 mo10169(InterfaceC8048 interfaceC8048) {
        InterfaceC8056 interfaceC8056M10485 = m10485(interfaceC8048);
        if (interfaceC8056M10485 instanceof InterfaceC8052) {
            return (InterfaceC8052) interfaceC8056M10485;
        }
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC8048 mo10170(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8050 interfaceC8050Mo10185 = mo10185(interfaceC8049);
        if (interfaceC8050Mo10185 != null) {
            return mo10152(interfaceC8050Mo10185);
        }
        InterfaceC8048 interfaceC8048Mo10200 = mo10200(interfaceC8049);
        interfaceC8048Mo10200.getClass();
        return interfaceC8048Mo10200;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public InterfaceC8052 mo10171(InterfaceC8056 interfaceC8056) {
        if (interfaceC8056 instanceof InterfaceC8052) {
            return (InterfaceC8052) interfaceC8056;
        }
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo10172(InterfaceC8048 interfaceC8048) {
        InterfaceC8048 interfaceC8048Mo10200 = mo10200(interfaceC8048);
        InterfaceC8052 interfaceC8052 = null;
        if (interfaceC8048Mo10200 != null) {
            InterfaceC8056 interfaceC8056M10485 = m10485(interfaceC8048Mo10200);
            if (interfaceC8056M10485 instanceof InterfaceC8052) {
                interfaceC8052 = (InterfaceC8052) interfaceC8056M10485;
            }
        }
        return interfaceC8052 != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public InterfaceC8059 mo10173(InterfaceC8049 interfaceC8049) {
        m10483(interfaceC8049);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public boolean mo10174(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if (!mo10165(mo10161(interfaceC8048))) {
            return false;
        }
        m10483(interfaceC8048);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public InterfaceC8049 mo10175(InterfaceC8049 interfaceC8049) {
        m10483(interfaceC8049);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public boolean mo10176(InterfaceC8059 interfaceC8059) {
        interfaceC8059.getClass();
        C5917 c5917 = ((C5768) interfaceC8059).f14633;
        C5917 c59172 = C5917.f14981;
        return AbstractC5227.m9466(c5917, C5917.f14981);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC8049 mo10177(InterfaceC8049 interfaceC8049) {
        m10483(interfaceC8049);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public boolean mo10178(InterfaceC8060 interfaceC8060) {
        return interfaceC8060 instanceof InterfaceC5925;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo10179(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return ((InterfaceC5919) mo10164(interfaceC8049)).mo9455() != ((InterfaceC5919) mo10170(interfaceC8049)).mo9455();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public int mo10180(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5925) {
            return AbstractC5754.m10439((InterfaceC5925) interfaceC8060).size();
        }
        return 0;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo10181(InterfaceC8048 interfaceC8048) {
        mo10182(interfaceC8048).getClass();
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public InterfaceC8060 mo10182(InterfaceC8048 interfaceC8048) {
        Class<?> componentType;
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof C5757) {
            return ((C5757) interfaceC8048).f14607;
        }
        AbstractC5758 abstractC5758 = (AbstractC5758) interfaceC8048;
        if (abstractC5758.mo10479()) {
            return C5764.f14627;
        }
        InterfaceC5924 interfaceC5924Mo9458 = abstractC5758.mo9458();
        C5836 c5836 = interfaceC5924Mo9458 instanceof C5836 ? (C5836) interfaceC5924Mo9458 : null;
        if (c5836 != null && (componentType = AbstractC3889.m7316(c5836).getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC8060) AbstractC5228.f13320.mo9476(Object[].class);
        }
        InterfaceC5924 interfaceC5924Mo10480 = abstractC5758.mo10480();
        if (interfaceC5924Mo10480 == null) {
            interfaceC5924Mo10480 = abstractC5758.mo9458();
        }
        interfaceC5924Mo10480.getClass();
        return (InterfaceC8060) interfaceC5924Mo10480;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo10183(InterfaceC8055 interfaceC8055) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8048) {
            return mo10192((InterfaceC8049) interfaceC8055);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC8055).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return 0;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public boolean mo10184(InterfaceC8060 interfaceC8060) {
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public InterfaceC8050 mo10185(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (!(interfaceC8049 instanceof AbstractC5758) || ((AbstractC5758) interfaceC8049).mo10475() == null) {
            return null;
        }
        return (InterfaceC8050) interfaceC8049;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public InterfaceC8048 mo10186(InterfaceC8048 interfaceC8048, CaptureStatus captureStatus) {
        List listMo9457;
        int i;
        captureStatus.getClass();
        InterfaceC5919 interfaceC5919 = (InterfaceC5919) interfaceC8048;
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        InterfaceC5925 interfaceC5925 = interfaceC5924Mo9458 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924Mo9458 : null;
        if (interfaceC5925 != null && ((listMo9457 = interfaceC5919.mo9457()) == null || !listMo9457.isEmpty())) {
            Iterator it = listMo9457.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5917) it.next()).f14983 != KVariance.INVARIANT) {
                    List listM10439 = AbstractC5754.m10439(interfaceC5925);
                    if (listM10439.size() == listMo9457.size()) {
                        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9457, 10));
                        Iterator it2 = listMo9457.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C5917 c5917M10659 = (C5917) it2.next();
                            KVariance kVariance = c5917M10659.f14983;
                            if (kVariance != KVariance.INVARIANT) {
                                InterfaceC5919 interfaceC59192 = c5917M10659.f14982;
                                if (kVariance != KVariance.f304IN) {
                                    interfaceC59192 = null;
                                }
                                C5917 c5917 = C5917.f14981;
                                c5917M10659 = AbstractC5922.m10659(new C5757(interfaceC59192, new C5756(c5917M10659), false));
                            }
                            arrayList.add(c5917M10659);
                        }
                        C5769 c5769 = C5769.f14634;
                        C5769 c57692 = new C5769(AbstractC5171.m9330(AbstractC5176.m9380(AbstractC5754.m10439(interfaceC5925), arrayList)));
                        int size = listMo9457.size();
                        for (i = 0; i < size; i++) {
                            C5917 c59172 = (C5917) listMo9457.get(i);
                            if (c59172.f14983 != KVariance.INVARIANT) {
                                List upperBounds = ((AbstractC5226) listM10439.get(i)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    InterfaceC5919 interfaceC59193 = c57692.m10487((InterfaceC5919) it3.next(), KVariance.INVARIANT).f14982;
                                    interfaceC59193.getClass();
                                    arrayList2.add(interfaceC59193);
                                }
                                if (c59172.f14983 == KVariance.OUT) {
                                    InterfaceC5919 interfaceC59194 = c59172.f14982;
                                    interfaceC59194.getClass();
                                    arrayList2.add(interfaceC59194);
                                }
                                InterfaceC5919 interfaceC59195 = ((C5917) arrayList.get(i)).f14982;
                                interfaceC59195.getClass();
                                C5756 c5756 = ((C5757) interfaceC59195).f14607;
                                c5756.getClass();
                                c5756.f14603 = arrayList2;
                            }
                        }
                        boolean zMo9455 = interfaceC5919.mo9455();
                        List annotations = interfaceC5919.getAnnotations();
                        boolean z = interfaceC5919 instanceof AbstractC5758;
                        AbstractC5758 abstractC5758 = z ? (AbstractC5758) interfaceC5919 : null;
                        InterfaceC5919 interfaceC5919Mo10477 = abstractC5758 != null ? abstractC5758.mo10477() : null;
                        AbstractC5758 abstractC57582 = z ? (AbstractC5758) interfaceC5919 : null;
                        return new C5759(interfaceC5925, arrayList, zMo9455, annotations, interfaceC5919Mo10477, false, false, false, abstractC57582 != null ? abstractC57582.mo10480() : null, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC8048 mo10152(InterfaceC8050 interfaceC8050) {
        AbstractC5758 abstractC5758Mo10472 = ((AbstractC5758) interfaceC8050).mo10472();
        abstractC5758Mo10472.getClass();
        return abstractC5758Mo10472;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8048 mo10153(InterfaceC8050 interfaceC8050) {
        AbstractC5758 abstractC5758Mo10475 = ((AbstractC5758) interfaceC8050).mo10475();
        abstractC5758Mo10475.getClass();
        return abstractC5758Mo10475;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC8048 mo10154(InterfaceC8048 interfaceC8048) {
        return ((AbstractC5758) interfaceC8048).mo10473(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8051 m10484(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if ((interfaceC8048 instanceof AbstractC5758) && ((AbstractC5758) interfaceC8048).mo10481()) {
            return (InterfaceC8051) interfaceC8048;
        }
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo10189(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public CaptureStatus mo10190(InterfaceC8052 interfaceC8052) {
        return CaptureStatus.FOR_SUBTYPING;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public InterfaceC8055 mo10191(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return (InterfaceC8055) interfaceC8048;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public int mo10192(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return ((InterfaceC5919) interfaceC8049).mo9457().size();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo10193(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return !AbstractC5227.m9466(mo10182(mo10164(interfaceC8049)), mo10182(mo10170(interfaceC8049)));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo10194(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8048 interfaceC8048Mo10200 = mo10200(interfaceC8049);
        return (interfaceC8048Mo10200 != null ? m10484(interfaceC8048Mo10200) : null) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public boolean mo10197(InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        interfaceC8048.getClass();
        interfaceC80482.getClass();
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo10198(InterfaceC8060 interfaceC8060, InterfaceC8060 interfaceC80602) {
        interfaceC8060.getClass();
        interfaceC80602.getClass();
        return interfaceC8060.equals(interfaceC80602);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC8049 mo10199(InterfaceC8059 interfaceC8059) {
        interfaceC8059.getClass();
        return (InterfaceC8049) ((C5768) interfaceC8059).f14633.f14982;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC8048 mo10200(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (mo10185(interfaceC8049) != null) {
            return null;
        }
        return (InterfaceC8048) interfaceC8049;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC8053 mo10201(InterfaceC8052 interfaceC8052) {
        return ((C5757) interfaceC8052).f14607;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public TypeVariance mo10202(InterfaceC8059 interfaceC8059) {
        TypeVariance typeVarianceM10482;
        interfaceC8059.getClass();
        KVariance kVariance = ((C5768) interfaceC8059).f14633.f14983;
        return (kVariance == null || (typeVarianceM10482 = m10482(kVariance)) == null) ? TypeVariance.OUT : typeVarianceM10482;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC8059 mo10203(InterfaceC8048 interfaceC8048, int i) {
        if (i < 0 || i >= mo10192(interfaceC8048)) {
            return null;
        }
        return mo10219(interfaceC8048, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public AbstractC5725 mo10204(InterfaceC8048 interfaceC8048) {
        C5769 c5769 = C5769.f14634;
        return new C5762(AbstractC7173.m12451((InterfaceC5919) interfaceC8048));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8056 m10485(InterfaceC8048 interfaceC8048) {
        InterfaceC8051 interfaceC8051M10484 = m10484(interfaceC8048);
        if (interfaceC8051M10484 == null) {
            return (InterfaceC8056) interfaceC8048;
        }
        m10483(interfaceC8051M10484);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public boolean mo10206(InterfaceC8060 interfaceC8060) {
        return interfaceC8060.equals(AbstractC5228.f13320.mo9476(Object.class));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public boolean mo10207(InterfaceC8049 interfaceC8049) {
        AbstractC5714 abstractC5714;
        interfaceC8049.getClass();
        if (!(interfaceC8049 instanceof AbstractC5758) || !(((AbstractC5758) interfaceC8049).mo9458() instanceof C5890)) {
            C5770 c5770 = interfaceC8049 instanceof C5770 ? (C5770) interfaceC8049 : null;
            if (c5770 == null || (abstractC5714 = c5770.f14639) == null || !AbstractC5725.m10388(abstractC5714)) {
                return false;
            }
        }
        return true;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC8059 mo10208(InterfaceC8055 interfaceC8055, int i) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8056) {
            return mo10219((InterfaceC8049) interfaceC8055, i);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            InterfaceC8059 interfaceC8059 = ((ArgumentList) interfaceC8055).get(i);
            interfaceC8059.getClass();
            return interfaceC8059;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public InterfaceC8049 mo10209(InterfaceC8052 interfaceC8052) {
        return (InterfaceC8049) ((C5757) interfaceC8052).f14606;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public boolean mo10210(InterfaceC8057 interfaceC8057, InterfaceC8060 interfaceC8060) {
        m10483(interfaceC8057);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public boolean mo10211(InterfaceC8060 interfaceC8060) {
        Modality modality;
        if (!(interfaceC8060 instanceof C5836)) {
            return false;
        }
        C5836 c5836 = (C5836) interfaceC8060;
        Class cls = c5836.f14769;
        C5381 c5381M10541 = c5836.m10541();
        if (c5381M10541 == null || (modality = (Modality) AbstractC5377.f13607.m1520(c5381M10541, AbstractC5377.f13608[7])) == null) {
            modality = (cls.isAnnotation() || cls.isEnum()) ? Modality.FINAL : AbstractC5227.m9466(AbstractC3888.m7253(cls), Boolean.TRUE) ? Modality.SEALED : Modifier.isAbstract(cls.getModifiers()) ? Modality.ABSTRACT : !Modifier.isFinal(cls.getModifiers()) ? Modality.OPEN : Modality.FINAL;
        }
        return (modality != Modality.FINAL || c5836.m10544() == ClassKind.ENUM_CLASS || c5836.m10544() == ClassKind.ENUM_ENTRY || c5836.m10544() == ClassKind.ANNOTATION_CLASS) ? false : true;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public InterfaceC8057 mo10212(InterfaceC8060 interfaceC8060, int i) {
        Object obj = AbstractC5754.m10439((InterfaceC5925) interfaceC8060).get(i);
        obj.getClass();
        return (C5821) obj;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo10213(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return m10484(interfaceC8048) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public boolean mo10214(InterfaceC8060 interfaceC8060) {
        return !(interfaceC8060 instanceof C5756);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public boolean mo10215(InterfaceC8052 interfaceC8052) {
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public InterfaceC8059 mo10216(InterfaceC8053 interfaceC8053) {
        return new C5768(((C5756) interfaceC8053).f14604);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public TypeVariance mo10217(InterfaceC8057 interfaceC8057) {
        return m10482(((AbstractC5226) interfaceC8057).mo9459());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public Collection mo10218(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5925) {
            List<InterfaceC5919> listMo9440 = ((InterfaceC5925) interfaceC8060).mo9440();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9440, 10));
            for (InterfaceC5919 interfaceC5919 : listMo9440) {
                interfaceC5919.getClass();
                arrayList.add((InterfaceC8049) interfaceC5919);
            }
            return arrayList;
        }
        if (interfaceC8060 instanceof AbstractC5226) {
            List<InterfaceC5919> upperBounds = ((AbstractC5226) interfaceC8060).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(upperBounds, 10));
            for (InterfaceC5919 interfaceC59192 : upperBounds) {
                interfaceC59192.getClass();
                arrayList2.add((InterfaceC8049) interfaceC59192);
            }
            return arrayList2;
        }
        if (!(interfaceC8060 instanceof C5756)) {
            StringBuilder sbM5124 = AbstractC3275.m5124("Unsupported type constructor: ", interfaceC8060, " (");
            sbM5124.append(interfaceC8060.getClass().getName());
            sbM5124.append(')');
            throw new IllegalStateException(sbM5124.toString().toString());
        }
        ArrayList<InterfaceC5919> arrayList3 = ((C5756) interfaceC8060).f14603;
        if (arrayList3 == null) {
            AbstractC5227.m9467("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(arrayList3, 10));
        for (InterfaceC5919 interfaceC59193 : arrayList3) {
            interfaceC59193.getClass();
            arrayList4.add((InterfaceC8049) interfaceC59193);
        }
        return arrayList4;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public InterfaceC8059 mo10219(InterfaceC8049 interfaceC8049, int i) {
        interfaceC8049.getClass();
        return new C5768((C5917) ((InterfaceC5919) interfaceC8049).mo9457().get(i));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC8049 mo10220(ArrayList arrayList) {
        m10483(this);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public Collection mo10221(InterfaceC8048 interfaceC8048) {
        m10483(interfaceC8048);
        throw null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo10222(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        InterfaceC8060 interfaceC8060Mo10182 = mo10182(interfaceC8048);
        interfaceC8060Mo10182.getClass();
        return interfaceC8060Mo10182 instanceof InterfaceC5925;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo10195(InterfaceC8048 interfaceC8048) {
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo10196(InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
    }
}
