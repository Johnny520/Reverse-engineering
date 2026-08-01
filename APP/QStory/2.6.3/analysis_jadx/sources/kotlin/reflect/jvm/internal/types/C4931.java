package kotlin.reflect.jvm.internal.types;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.C4989;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.C5058;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p034.AbstractC6344;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7224;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p097.InterfaceC7231;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4931 implements InterfaceC7229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4931 f14281 = new C4931();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static TypeVariance m9923(KVariance kVariance) {
        int i = AbstractC4933.f14284[kVariance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m9924(Object obj) {
        throw new KotlinReflectionInternalError("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC7231 mo9602(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7219 interfaceC7219Mo9641 = mo9641(interfaceC7220);
        if (interfaceC7219Mo9641 == null) {
            interfaceC7219Mo9641 = mo9605(interfaceC7220);
        }
        return mo9623(interfaceC7219Mo9641);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public boolean mo9603(InterfaceC7231 interfaceC7231) {
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo9604(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC7219 mo9605(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7221 interfaceC7221Mo9626 = mo9626(interfaceC7220);
        if (interfaceC7221Mo9626 != null) {
            return mo9594(interfaceC7221Mo9626);
        }
        InterfaceC7219 interfaceC7219Mo9641 = mo9641(interfaceC7220);
        interfaceC7219Mo9641.getClass();
        return interfaceC7219Mo9641;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public boolean mo9606(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        return interfaceC7231.equals(C4932.f14282);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public boolean mo9607(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return ((InterfaceC5087) interfaceC7220).mo8896();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo9608(InterfaceC7223 interfaceC7223) {
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo9609(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public InterfaceC7223 mo9610(InterfaceC7219 interfaceC7219) {
        InterfaceC7227 interfaceC7227M9926 = m9926(interfaceC7219);
        if (interfaceC7227M9926 instanceof InterfaceC7223) {
            return (InterfaceC7223) interfaceC7227M9926;
        }
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC7219 mo9611(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7221 interfaceC7221Mo9626 = mo9626(interfaceC7220);
        if (interfaceC7221Mo9626 != null) {
            return mo9593(interfaceC7221Mo9626);
        }
        InterfaceC7219 interfaceC7219Mo9641 = mo9641(interfaceC7220);
        interfaceC7219Mo9641.getClass();
        return interfaceC7219Mo9641;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public InterfaceC7223 mo9612(InterfaceC7227 interfaceC7227) {
        if (interfaceC7227 instanceof InterfaceC7223) {
            return (InterfaceC7223) interfaceC7227;
        }
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo9613(InterfaceC7219 interfaceC7219) {
        InterfaceC7219 interfaceC7219Mo9641 = mo9641(interfaceC7219);
        InterfaceC7223 interfaceC7223 = null;
        if (interfaceC7219Mo9641 != null) {
            InterfaceC7227 interfaceC7227M9926 = m9926(interfaceC7219Mo9641);
            if (interfaceC7227M9926 instanceof InterfaceC7223) {
                interfaceC7223 = (InterfaceC7223) interfaceC7227M9926;
            }
        }
        return interfaceC7223 != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public InterfaceC7230 mo9614(InterfaceC7220 interfaceC7220) {
        m9924(interfaceC7220);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public boolean mo9615(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (!mo9606(mo9602(interfaceC7219))) {
            return false;
        }
        m9924(interfaceC7219);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public InterfaceC7220 mo9616(InterfaceC7220 interfaceC7220) {
        m9924(interfaceC7220);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public boolean mo9617(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        C5085 c5085 = ((C4936) interfaceC7230).f14288;
        C5085 c50852 = C5085.f14636;
        return AbstractC4395.m8907(c5085, C5085.f14636);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC7220 mo9618(InterfaceC7220 interfaceC7220) {
        m9924(interfaceC7220);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public boolean mo9619(InterfaceC7231 interfaceC7231) {
        return interfaceC7231 instanceof InterfaceC5093;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo9620(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return ((InterfaceC5087) mo9605(interfaceC7220)).mo8896() != ((InterfaceC5087) mo9611(interfaceC7220)).mo8896();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public int mo9621(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC5093) {
            return AbstractC4922.m9880((InterfaceC5093) interfaceC7231).size();
        }
        return 0;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo9622(InterfaceC7219 interfaceC7219) {
        mo9623(interfaceC7219).getClass();
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public InterfaceC7231 mo9623(InterfaceC7219 interfaceC7219) {
        Class<?> componentType;
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof C4925) {
            return ((C4925) interfaceC7219).f14262;
        }
        AbstractC4926 abstractC4926 = (AbstractC4926) interfaceC7219;
        if (abstractC4926.mo9920()) {
            return C4932.f14282;
        }
        InterfaceC5092 interfaceC5092Mo8899 = abstractC4926.mo8899();
        C5004 c5004 = interfaceC5092Mo8899 instanceof C5004 ? (C5004) interfaceC5092Mo8899 : null;
        if (c5004 != null && (componentType = AbstractC3057.m6756(c5004).getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC7231) AbstractC4396.f12975.mo8917(Object[].class);
        }
        InterfaceC5092 interfaceC5092Mo9921 = abstractC4926.mo9921();
        if (interfaceC5092Mo9921 == null) {
            interfaceC5092Mo9921 = abstractC4926.mo8899();
        }
        interfaceC5092Mo9921.getClass();
        return (InterfaceC7231) interfaceC5092Mo9921;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo9624(InterfaceC7226 interfaceC7226) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7219) {
            return mo9633((InterfaceC7220) interfaceC7226);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7226).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return 0;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public boolean mo9625(InterfaceC7231 interfaceC7231) {
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public InterfaceC7221 mo9626(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (!(interfaceC7220 instanceof AbstractC4926) || ((AbstractC4926) interfaceC7220).mo9916() == null) {
            return null;
        }
        return (InterfaceC7221) interfaceC7220;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public InterfaceC7219 mo9627(InterfaceC7219 interfaceC7219, CaptureStatus captureStatus) {
        List listMo8898;
        int i;
        captureStatus.getClass();
        InterfaceC5087 interfaceC5087 = (InterfaceC5087) interfaceC7219;
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        InterfaceC5093 interfaceC5093 = interfaceC5092Mo8899 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5092Mo8899 : null;
        if (interfaceC5093 != null && ((listMo8898 = interfaceC5087.mo8898()) == null || !listMo8898.isEmpty())) {
            Iterator it = listMo8898.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5085) it.next()).f14638 != KVariance.INVARIANT) {
                    List listM9880 = AbstractC4922.m9880(interfaceC5093);
                    if (listM9880.size() == listMo8898.size()) {
                        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo8898, 10));
                        Iterator it2 = listMo8898.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C5085 c5085M10100 = (C5085) it2.next();
                            KVariance kVariance = c5085M10100.f14638;
                            if (kVariance != KVariance.INVARIANT) {
                                InterfaceC5087 interfaceC50872 = c5085M10100.f14637;
                                if (kVariance != KVariance.IN) {
                                    interfaceC50872 = null;
                                }
                                C5085 c5085 = C5085.f14636;
                                c5085M10100 = AbstractC5090.m10100(new C4925(interfaceC50872, new C4924(c5085M10100), false));
                            }
                            arrayList.add(c5085M10100);
                        }
                        C4937 c4937 = C4937.f14289;
                        C4937 c49372 = new C4937(AbstractC4339.m8771(AbstractC4344.m8821(AbstractC4922.m9880(interfaceC5093), arrayList)));
                        int size = listMo8898.size();
                        for (i = 0; i < size; i++) {
                            C5085 c50852 = (C5085) listMo8898.get(i);
                            if (c50852.f14638 != KVariance.INVARIANT) {
                                List upperBounds = ((AbstractC4394) listM9880.get(i)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    InterfaceC5087 interfaceC50873 = c49372.m9928((InterfaceC5087) it3.next(), KVariance.INVARIANT).f14637;
                                    interfaceC50873.getClass();
                                    arrayList2.add(interfaceC50873);
                                }
                                if (c50852.f14638 == KVariance.OUT) {
                                    InterfaceC5087 interfaceC50874 = c50852.f14637;
                                    interfaceC50874.getClass();
                                    arrayList2.add(interfaceC50874);
                                }
                                InterfaceC5087 interfaceC50875 = ((C5085) arrayList.get(i)).f14637;
                                interfaceC50875.getClass();
                                C4924 c4924 = ((C4925) interfaceC50875).f14262;
                                c4924.getClass();
                                c4924.f14258 = arrayList2;
                            }
                        }
                        boolean zMo8896 = interfaceC5087.mo8896();
                        List annotations = interfaceC5087.getAnnotations();
                        boolean z = interfaceC5087 instanceof AbstractC4926;
                        AbstractC4926 abstractC4926 = z ? (AbstractC4926) interfaceC5087 : null;
                        InterfaceC5087 interfaceC5087Mo9918 = abstractC4926 != null ? abstractC4926.mo9918() : null;
                        AbstractC4926 abstractC49262 = z ? (AbstractC4926) interfaceC5087 : null;
                        return new C4927(interfaceC5093, arrayList, zMo8896, annotations, interfaceC5087Mo9918, false, false, false, abstractC49262 != null ? abstractC49262.mo9921() : null, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC7219 mo9593(InterfaceC7221 interfaceC7221) {
        AbstractC4926 abstractC4926Mo9913 = ((AbstractC4926) interfaceC7221).mo9913();
        abstractC4926Mo9913.getClass();
        return abstractC4926Mo9913;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC7219 mo9594(InterfaceC7221 interfaceC7221) {
        AbstractC4926 abstractC4926Mo9916 = ((AbstractC4926) interfaceC7221).mo9916();
        abstractC4926Mo9916.getClass();
        return abstractC4926Mo9916;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC7219 mo9595(InterfaceC7219 interfaceC7219) {
        return ((AbstractC4926) interfaceC7219).mo9914(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC7222 m9925(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if ((interfaceC7219 instanceof AbstractC4926) && ((AbstractC4926) interfaceC7219).mo9922()) {
            return (InterfaceC7222) interfaceC7219;
        }
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo9630(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public CaptureStatus mo9631(InterfaceC7223 interfaceC7223) {
        return CaptureStatus.FOR_SUBTYPING;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public InterfaceC7226 mo9632(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return (InterfaceC7226) interfaceC7219;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public int mo9633(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return ((InterfaceC5087) interfaceC7220).mo8898().size();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo9634(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return !AbstractC4395.m8907(mo9623(mo9605(interfaceC7220)), mo9623(mo9611(interfaceC7220)));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo9635(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7219 interfaceC7219Mo9641 = mo9641(interfaceC7220);
        return (interfaceC7219Mo9641 != null ? m9925(interfaceC7219Mo9641) : null) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public boolean mo9638(InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        interfaceC7219.getClass();
        interfaceC72192.getClass();
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo9639(InterfaceC7231 interfaceC7231, InterfaceC7231 interfaceC72312) {
        interfaceC7231.getClass();
        interfaceC72312.getClass();
        return interfaceC7231.equals(interfaceC72312);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC7220 mo9640(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        return (InterfaceC7220) ((C4936) interfaceC7230).f14288.f14637;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC7219 mo9641(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (mo9626(interfaceC7220) != null) {
            return null;
        }
        return (InterfaceC7219) interfaceC7220;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC7224 mo9642(InterfaceC7223 interfaceC7223) {
        return ((C4925) interfaceC7223).f14262;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public TypeVariance mo9643(InterfaceC7230 interfaceC7230) {
        TypeVariance typeVarianceM9923;
        interfaceC7230.getClass();
        KVariance kVariance = ((C4936) interfaceC7230).f14288.f14638;
        return (kVariance == null || (typeVarianceM9923 = m9923(kVariance)) == null) ? TypeVariance.OUT : typeVarianceM9923;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC7230 mo9644(InterfaceC7219 interfaceC7219, int i) {
        if (i < 0 || i >= mo9633(interfaceC7219)) {
            return null;
        }
        return mo9660(interfaceC7219, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public AbstractC4893 mo9645(InterfaceC7219 interfaceC7219) {
        C4937 c4937 = C4937.f14289;
        return new C4930(AbstractC6344.m11892((InterfaceC5087) interfaceC7219));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7227 m9926(InterfaceC7219 interfaceC7219) {
        InterfaceC7222 interfaceC7222M9925 = m9925(interfaceC7219);
        if (interfaceC7222M9925 == null) {
            return (InterfaceC7227) interfaceC7219;
        }
        m9924(interfaceC7222M9925);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public boolean mo9647(InterfaceC7231 interfaceC7231) {
        return interfaceC7231.equals(AbstractC4396.f12975.mo8917(Object.class));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public boolean mo9648(InterfaceC7220 interfaceC7220) {
        AbstractC4882 abstractC4882;
        interfaceC7220.getClass();
        if (!(interfaceC7220 instanceof AbstractC4926) || !(((AbstractC4926) interfaceC7220).mo8899() instanceof C5058)) {
            C4938 c4938 = interfaceC7220 instanceof C4938 ? (C4938) interfaceC7220 : null;
            if (c4938 == null || (abstractC4882 = c4938.f14294) == null || !AbstractC4893.m9829(abstractC4882)) {
                return false;
            }
        }
        return true;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC7230 mo9649(InterfaceC7226 interfaceC7226, int i) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7227) {
            return mo9660((InterfaceC7220) interfaceC7226, i);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            InterfaceC7230 interfaceC7230 = ((ArgumentList) interfaceC7226).get(i);
            interfaceC7230.getClass();
            return interfaceC7230;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public InterfaceC7220 mo9650(InterfaceC7223 interfaceC7223) {
        return (InterfaceC7220) ((C4925) interfaceC7223).f14261;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public boolean mo9651(InterfaceC7228 interfaceC7228, InterfaceC7231 interfaceC7231) {
        m9924(interfaceC7228);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public boolean mo9652(InterfaceC7231 interfaceC7231) {
        Modality modality;
        if (!(interfaceC7231 instanceof C5004)) {
            return false;
        }
        C5004 c5004 = (C5004) interfaceC7231;
        Class cls = c5004.f14424;
        C4549 c4549M9982 = c5004.m9982();
        if (c4549M9982 == null || (modality = (Modality) AbstractC4545.f13262.m960(c4549M9982, AbstractC4545.f13263[7])) == null) {
            modality = (cls.isAnnotation() || cls.isEnum()) ? Modality.FINAL : AbstractC4395.m8907(AbstractC3056.m6693(cls), Boolean.TRUE) ? Modality.SEALED : Modifier.isAbstract(cls.getModifiers()) ? Modality.ABSTRACT : !Modifier.isFinal(cls.getModifiers()) ? Modality.OPEN : Modality.FINAL;
        }
        return (modality != Modality.FINAL || c5004.m9985() == ClassKind.ENUM_CLASS || c5004.m9985() == ClassKind.ENUM_ENTRY || c5004.m9985() == ClassKind.ANNOTATION_CLASS) ? false : true;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public InterfaceC7228 mo9653(InterfaceC7231 interfaceC7231, int i) {
        Object obj = AbstractC4922.m9880((InterfaceC5093) interfaceC7231).get(i);
        obj.getClass();
        return (C4989) obj;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo9654(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return m9925(interfaceC7219) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public boolean mo9655(InterfaceC7231 interfaceC7231) {
        return !(interfaceC7231 instanceof C4924);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public boolean mo9656(InterfaceC7223 interfaceC7223) {
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public InterfaceC7230 mo9657(InterfaceC7224 interfaceC7224) {
        return new C4936(((C4924) interfaceC7224).f14259);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public TypeVariance mo9658(InterfaceC7228 interfaceC7228) {
        return m9923(((AbstractC4394) interfaceC7228).mo8900());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public Collection mo9659(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC5093) {
            List<InterfaceC5087> listMo8881 = ((InterfaceC5093) interfaceC7231).mo8881();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo8881, 10));
            for (InterfaceC5087 interfaceC5087 : listMo8881) {
                interfaceC5087.getClass();
                arrayList.add((InterfaceC7220) interfaceC5087);
            }
            return arrayList;
        }
        if (interfaceC7231 instanceof AbstractC4394) {
            List<InterfaceC5087> upperBounds = ((AbstractC4394) interfaceC7231).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(upperBounds, 10));
            for (InterfaceC5087 interfaceC50872 : upperBounds) {
                interfaceC50872.getClass();
                arrayList2.add((InterfaceC7220) interfaceC50872);
            }
            return arrayList2;
        }
        if (!(interfaceC7231 instanceof C4924)) {
            StringBuilder sbM4564 = AbstractC2442.m4564("Unsupported type constructor: ", interfaceC7231, " (");
            sbM4564.append(interfaceC7231.getClass().getName());
            sbM4564.append(')');
            throw new IllegalStateException(sbM4564.toString().toString());
        }
        ArrayList<InterfaceC5087> arrayList3 = ((C4924) interfaceC7231).f14258;
        if (arrayList3 == null) {
            AbstractC4395.m8908("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(arrayList3, 10));
        for (InterfaceC5087 interfaceC50873 : arrayList3) {
            interfaceC50873.getClass();
            arrayList4.add((InterfaceC7220) interfaceC50873);
        }
        return arrayList4;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public InterfaceC7230 mo9660(InterfaceC7220 interfaceC7220, int i) {
        interfaceC7220.getClass();
        return new C4936((C5085) ((InterfaceC5087) interfaceC7220).mo8898().get(i));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC7220 mo9661(ArrayList arrayList) {
        m9924(this);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public Collection mo9662(InterfaceC7219 interfaceC7219) {
        m9924(interfaceC7219);
        throw null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo9663(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7231 interfaceC7231Mo9623 = mo9623(interfaceC7219);
        interfaceC7231Mo9623.getClass();
        return interfaceC7231Mo9623 instanceof InterfaceC5093;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo9636(InterfaceC7219 interfaceC7219) {
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo9637(InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
    }
}
