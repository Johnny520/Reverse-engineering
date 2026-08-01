package kotlin.reflect.jvm.internal.types;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4210;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.C5057;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p053.AbstractC6560;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7225;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7229;
import p097.InterfaceC7230;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4930 implements InterfaceC7228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4930 f14279 = new C4930();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m9926(Object obj) {
        throw new KotlinReflectionInternalError("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static TypeVariance m9927(KVariance kVariance) {
        int i = AbstractC4932.f14282[kVariance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C4210.m8621();
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC7230 mo9612(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7218 interfaceC7218Mo9652 = mo9652(interfaceC7219);
        if (interfaceC7218Mo9652 == null) {
            interfaceC7218Mo9652 = mo9615(interfaceC7219);
        }
        return mo9632(interfaceC7218Mo9652);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public boolean mo9613(InterfaceC7230 interfaceC7230) {
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo9614(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC7218 mo9615(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7220 interfaceC7220Mo9636 = mo9636(interfaceC7219);
        if (interfaceC7220Mo9636 != null) {
            return mo9604(interfaceC7220Mo9636);
        }
        InterfaceC7218 interfaceC7218Mo9652 = mo9652(interfaceC7219);
        interfaceC7218Mo9652.getClass();
        return interfaceC7218Mo9652;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public boolean mo9616(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        return interfaceC7230.equals(C4931.f14280);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public boolean mo9617(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return ((InterfaceC5086) interfaceC7219).mo8906();
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo9618(InterfaceC7222 interfaceC7222) {
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public boolean mo9619(InterfaceC7230 interfaceC7230) {
        return interfaceC7230 instanceof InterfaceC5092;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo9620(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC7222 mo9621(InterfaceC7218 interfaceC7218) {
        InterfaceC7226 interfaceC7226M9929 = m9929(interfaceC7218);
        if (interfaceC7226M9929 instanceof InterfaceC7222) {
            return (InterfaceC7222) interfaceC7226M9929;
        }
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public InterfaceC7218 mo9622(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7220 interfaceC7220Mo9636 = mo9636(interfaceC7219);
        if (interfaceC7220Mo9636 != null) {
            return mo9603(interfaceC7220Mo9636);
        }
        InterfaceC7218 interfaceC7218Mo9652 = mo9652(interfaceC7219);
        interfaceC7218Mo9652.getClass();
        return interfaceC7218Mo9652;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public InterfaceC7222 mo9623(InterfaceC7226 interfaceC7226) {
        if (interfaceC7226 instanceof InterfaceC7222) {
            return (InterfaceC7222) interfaceC7226;
        }
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public InterfaceC7229 mo9624(InterfaceC7219 interfaceC7219) {
        m9926(interfaceC7219);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public boolean mo9625(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if (!mo9616(mo9612(interfaceC7218))) {
            return false;
        }
        m9926(interfaceC7218);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public InterfaceC7219 mo9626(InterfaceC7219 interfaceC7219) {
        m9926(interfaceC7219);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public boolean mo9627(InterfaceC7229 interfaceC7229) {
        interfaceC7229.getClass();
        C5084 c5084 = ((C4935) interfaceC7229).f14286;
        C5084 c50842 = C5084.f14636;
        return AbstractC4394.m8917(c5084, C5084.f14636);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public InterfaceC7219 mo9628(InterfaceC7219 interfaceC7219) {
        m9926(interfaceC7219);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo9629(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return ((InterfaceC5086) mo9615(interfaceC7219)).mo8906() != ((InterfaceC5086) mo9622(interfaceC7219)).mo8906();
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public int mo9630(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC5092) {
            return AbstractC4921.m9886((InterfaceC5092) interfaceC7230).size();
        }
        return 0;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo9631(InterfaceC7218 interfaceC7218) {
        mo9632(interfaceC7218).getClass();
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public InterfaceC7230 mo9632(InterfaceC7218 interfaceC7218) {
        Class<?> componentType;
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof C4924) {
            return ((C4924) interfaceC7218).f14260;
        }
        AbstractC4925 abstractC4925 = (AbstractC4925) interfaceC7218;
        if (abstractC4925.mo9923()) {
            return C4931.f14280;
        }
        InterfaceC5091 interfaceC5091Mo8909 = abstractC4925.mo8909();
        C5003 c5003 = interfaceC5091Mo8909 instanceof C5003 ? (C5003) interfaceC5091Mo8909 : null;
        if (c5003 != null && (componentType = AbstractC6560.m12029(c5003).getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC7230) AbstractC4395.f12971.mo8927(Object[].class);
        }
        InterfaceC5091 interfaceC5091Mo9924 = abstractC4925.mo9924();
        if (interfaceC5091Mo9924 == null) {
            interfaceC5091Mo9924 = abstractC4925.mo8909();
        }
        interfaceC5091Mo9924.getClass();
        return (InterfaceC7230) interfaceC5091Mo9924;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo9633(InterfaceC7225 interfaceC7225) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7218) {
            return mo9640((InterfaceC7219) interfaceC7225);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7225).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return 0;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public boolean mo9634(InterfaceC7227 interfaceC7227, InterfaceC7230 interfaceC7230) {
        m9926(interfaceC7227);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public boolean mo9635(InterfaceC7230 interfaceC7230) {
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public InterfaceC7220 mo9636(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (!(interfaceC7219 instanceof AbstractC4925) || ((AbstractC4925) interfaceC7219).mo9919() == null) {
            return null;
        }
        return (InterfaceC7220) interfaceC7219;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public InterfaceC7218 mo9637(InterfaceC7218 interfaceC7218, CaptureStatus captureStatus) {
        List listMo8908;
        int i;
        captureStatus.getClass();
        InterfaceC5086 interfaceC5086 = (InterfaceC5086) interfaceC7218;
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        InterfaceC5092 interfaceC5092 = interfaceC5091Mo8909 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091Mo8909 : null;
        if (interfaceC5092 != null && ((listMo8908 = interfaceC5086.mo8908()) == null || !listMo8908.isEmpty())) {
            Iterator it = listMo8908.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5084) it.next()).f14638 != KVariance.INVARIANT) {
                    List listM9886 = AbstractC4921.m9886(interfaceC5092);
                    if (listM9886.size() == listMo8908.size()) {
                        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo8908, 10));
                        Iterator it2 = listMo8908.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C5084 c5084M10096 = (C5084) it2.next();
                            KVariance kVariance = c5084M10096.f14638;
                            if (kVariance != KVariance.INVARIANT) {
                                InterfaceC5086 interfaceC50862 = c5084M10096.f14637;
                                if (kVariance != KVariance.IN) {
                                    interfaceC50862 = null;
                                }
                                C5084 c5084 = C5084.f14636;
                                c5084M10096 = AbstractC5089.m10096(new C4924(interfaceC50862, new C4923(c5084M10096), false));
                            }
                            arrayList.add(c5084M10096);
                        }
                        C4936 c4936 = C4936.f14287;
                        C4936 c49362 = new C4936(AbstractC4338.m8783(AbstractC4343.m8797(AbstractC4921.m9886(interfaceC5092), arrayList)));
                        int size = listMo8908.size();
                        for (i = 0; i < size; i++) {
                            C5084 c50842 = (C5084) listMo8908.get(i);
                            if (c50842.f14638 != KVariance.INVARIANT) {
                                List upperBounds = ((AbstractC4393) listM9886.get(i)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    InterfaceC5086 interfaceC50863 = c49362.m9931((InterfaceC5086) it3.next(), KVariance.INVARIANT).f14637;
                                    interfaceC50863.getClass();
                                    arrayList2.add(interfaceC50863);
                                }
                                if (c50842.f14638 == KVariance.OUT) {
                                    InterfaceC5086 interfaceC50864 = c50842.f14637;
                                    interfaceC50864.getClass();
                                    arrayList2.add(interfaceC50864);
                                }
                                InterfaceC5086 interfaceC50865 = ((C5084) arrayList.get(i)).f14637;
                                interfaceC50865.getClass();
                                C4923 c4923 = ((C4924) interfaceC50865).f14260;
                                c4923.getClass();
                                c4923.f14256 = arrayList2;
                            }
                        }
                        boolean zMo8906 = interfaceC5086.mo8906();
                        List annotations = interfaceC5086.getAnnotations();
                        boolean z = interfaceC5086 instanceof AbstractC4925;
                        AbstractC4925 abstractC4925 = z ? (AbstractC4925) interfaceC5086 : null;
                        InterfaceC5086 interfaceC5086Mo9921 = abstractC4925 != null ? abstractC4925.mo9921() : null;
                        AbstractC4925 abstractC49252 = z ? (AbstractC4925) interfaceC5086 : null;
                        return new C4926(interfaceC5092, arrayList, zMo8906, annotations, interfaceC5086Mo9921, false, false, false, abstractC49252 != null ? abstractC49252.mo9924() : null, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC7218 mo9603(InterfaceC7220 interfaceC7220) {
        AbstractC4925 abstractC4925Mo9916 = ((AbstractC4925) interfaceC7220).mo9916();
        abstractC4925Mo9916.getClass();
        return abstractC4925Mo9916;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC7218 mo9604(InterfaceC7220 interfaceC7220) {
        AbstractC4925 abstractC4925Mo9919 = ((AbstractC4925) interfaceC7220).mo9919();
        abstractC4925Mo9919.getClass();
        return abstractC4925Mo9919;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC7218 mo9605(InterfaceC7218 interfaceC7218) {
        return ((AbstractC4925) interfaceC7218).mo9917(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC7221 m9928(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if ((interfaceC7218 instanceof AbstractC4925) && ((AbstractC4925) interfaceC7218).mo9925()) {
            return (InterfaceC7221) interfaceC7218;
        }
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public int mo9640(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return ((InterfaceC5086) interfaceC7219).mo8908().size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7226 m9929(InterfaceC7218 interfaceC7218) {
        InterfaceC7221 interfaceC7221M9928 = m9928(interfaceC7218);
        if (interfaceC7221M9928 == null) {
            return (InterfaceC7226) interfaceC7218;
        }
        m9926(interfaceC7221M9928);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC7225 mo9642(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return (InterfaceC7225) interfaceC7218;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public boolean mo9643(InterfaceC7218 interfaceC7218) {
        InterfaceC7218 interfaceC7218Mo9652 = mo9652(interfaceC7218);
        InterfaceC7222 interfaceC7222 = null;
        if (interfaceC7218Mo9652 != null) {
            InterfaceC7226 interfaceC7226M9929 = m9929(interfaceC7218Mo9652);
            if (interfaceC7226M9929 instanceof InterfaceC7222) {
                interfaceC7222 = (InterfaceC7222) interfaceC7226M9929;
            }
        }
        return interfaceC7222 != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo9644(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return !AbstractC4394.m8917(mo9632(mo9615(interfaceC7219)), mo9632(mo9622(interfaceC7219)));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public CaptureStatus mo9645(InterfaceC7222 interfaceC7222) {
        return CaptureStatus.FOR_SUBTYPING;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo9646(InterfaceC7230 interfaceC7230, InterfaceC7230 interfaceC72302) {
        interfaceC7230.getClass();
        interfaceC72302.getClass();
        return interfaceC7230.equals(interfaceC72302);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo9647(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7218 interfaceC7218Mo9652 = mo9652(interfaceC7219);
        return (interfaceC7218Mo9652 != null ? m9928(interfaceC7218Mo9652) : null) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public boolean mo9648(InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        interfaceC7218.getClass();
        interfaceC72182.getClass();
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo9649(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public InterfaceC7219 mo9650(InterfaceC7229 interfaceC7229) {
        interfaceC7229.getClass();
        return (InterfaceC7219) ((C4935) interfaceC7229).f14286.f14637;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC7218 mo9652(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (mo9636(interfaceC7219) != null) {
            return null;
        }
        return (InterfaceC7218) interfaceC7219;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC7223 mo9653(InterfaceC7222 interfaceC7222) {
        return ((C4924) interfaceC7222).f14260;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public InterfaceC7229 mo9654(InterfaceC7218 interfaceC7218, int i) {
        if (i < 0 || i >= mo9640(interfaceC7218)) {
            return null;
        }
        return mo9670(interfaceC7218, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public AbstractC4892 mo9656(InterfaceC7218 interfaceC7218) {
        C4936 c4936 = C4936.f14287;
        return new C4929(AbstractC0455.m1168((InterfaceC5086) interfaceC7218));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public TypeVariance mo9657(InterfaceC7229 interfaceC7229) {
        TypeVariance typeVarianceM9927;
        interfaceC7229.getClass();
        KVariance kVariance = ((C4935) interfaceC7229).f14286.f14638;
        return (kVariance == null || (typeVarianceM9927 = m9927(kVariance)) == null) ? TypeVariance.OUT : typeVarianceM9927;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public boolean mo9658(InterfaceC7230 interfaceC7230) {
        return interfaceC7230.equals(AbstractC4395.f12971.mo8927(Object.class));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public boolean mo9659(InterfaceC7219 interfaceC7219) {
        AbstractC4881 abstractC4881;
        interfaceC7219.getClass();
        if (!(interfaceC7219 instanceof AbstractC4925) || !(((AbstractC4925) interfaceC7219).mo8909() instanceof C5057)) {
            C4937 c4937 = interfaceC7219 instanceof C4937 ? (C4937) interfaceC7219 : null;
            if (c4937 == null || (abstractC4881 = c4937.f14292) == null || !AbstractC4892.m9835(abstractC4881)) {
                return false;
            }
        }
        return true;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC7229 mo9660(InterfaceC7225 interfaceC7225, int i) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7226) {
            return mo9670((InterfaceC7219) interfaceC7225, i);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            InterfaceC7229 interfaceC7229 = ((ArgumentList) interfaceC7225).get(i);
            interfaceC7229.getClass();
            return interfaceC7229;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public InterfaceC7219 mo9661(InterfaceC7222 interfaceC7222) {
        return (InterfaceC7219) ((C4924) interfaceC7222).f14259;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public boolean mo9662(InterfaceC7230 interfaceC7230) {
        Modality modality;
        if (!(interfaceC7230 instanceof C5003)) {
            return false;
        }
        C5003 c5003 = (C5003) interfaceC7230;
        Class cls = c5003.f14422;
        C4548 c4548M9985 = c5003.m9985();
        if (c4548M9985 == null || (modality = (Modality) AbstractC4544.f13258.m959(c4548M9985, AbstractC4544.f13259[7])) == null) {
            modality = (cls.isAnnotation() || cls.isEnum()) ? Modality.FINAL : AbstractC4394.m8917(AbstractC5061.m10025(cls), Boolean.TRUE) ? Modality.SEALED : Modifier.isAbstract(cls.getModifiers()) ? Modality.ABSTRACT : !Modifier.isFinal(cls.getModifiers()) ? Modality.OPEN : Modality.FINAL;
        }
        return (modality != Modality.FINAL || c5003.m9988() == ClassKind.ENUM_CLASS || c5003.m9988() == ClassKind.ENUM_ENTRY || c5003.m9988() == ClassKind.ANNOTATION_CLASS) ? false : true;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public InterfaceC7227 mo9663(InterfaceC7230 interfaceC7230, int i) {
        Object obj = AbstractC4921.m9886((InterfaceC5092) interfaceC7230).get(i);
        obj.getClass();
        return (C4988) obj;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo9664(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return m9928(interfaceC7218) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public boolean mo9665(InterfaceC7230 interfaceC7230) {
        return !(interfaceC7230 instanceof C4923);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public boolean mo9666(InterfaceC7222 interfaceC7222) {
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public InterfaceC7229 mo9667(InterfaceC7223 interfaceC7223) {
        return new C4935(((C4923) interfaceC7223).f14257);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public TypeVariance mo9668(InterfaceC7227 interfaceC7227) {
        return m9927(((AbstractC4393) interfaceC7227).mo8910());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public Collection mo9669(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC5092) {
            List<InterfaceC5086> listMo8891 = ((InterfaceC5092) interfaceC7230).mo8891();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo8891, 10));
            for (InterfaceC5086 interfaceC5086 : listMo8891) {
                interfaceC5086.getClass();
                arrayList.add((InterfaceC7219) interfaceC5086);
            }
            return arrayList;
        }
        if (interfaceC7230 instanceof AbstractC4393) {
            List<InterfaceC5086> upperBounds = ((AbstractC4393) interfaceC7230).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(upperBounds, 10));
            for (InterfaceC5086 interfaceC50862 : upperBounds) {
                interfaceC50862.getClass();
                arrayList2.add((InterfaceC7219) interfaceC50862);
            }
            return arrayList2;
        }
        if (!(interfaceC7230 instanceof C4923)) {
            StringBuilder sbM4553 = AbstractC2442.m4553("Unsupported type constructor: ", interfaceC7230, " (");
            sbM4553.append(interfaceC7230.getClass().getName());
            sbM4553.append(')');
            throw new IllegalStateException(sbM4553.toString().toString());
        }
        ArrayList<InterfaceC5086> arrayList3 = ((C4923) interfaceC7230).f14256;
        if (arrayList3 == null) {
            AbstractC4394.m8918("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(arrayList3, 10));
        for (InterfaceC5086 interfaceC50863 : arrayList3) {
            interfaceC50863.getClass();
            arrayList4.add((InterfaceC7219) interfaceC50863);
        }
        return arrayList4;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public InterfaceC7229 mo9670(InterfaceC7219 interfaceC7219, int i) {
        interfaceC7219.getClass();
        return new C4935((C5084) ((InterfaceC5086) interfaceC7219).mo8908().get(i));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC7219 mo9671(ArrayList arrayList) {
        m9926(this);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public Collection mo9672(InterfaceC7218 interfaceC7218) {
        m9926(interfaceC7218);
        throw null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo9673(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        InterfaceC7230 interfaceC7230Mo9632 = mo9632(interfaceC7218);
        interfaceC7230Mo9632.getClass();
        return interfaceC7230Mo9632 instanceof InterfaceC5092;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo9655(InterfaceC7218 interfaceC7218) {
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo9651(InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
    }
}
