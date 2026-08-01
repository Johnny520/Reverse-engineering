package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.impl.descriptors.C5315;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5598;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5701;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5704;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5715;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.C5719;
import kotlin.reflect.jvm.internal.impl.types.C5738;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p095.AbstractC7818;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8052;
import p113.InterfaceC8053;
import p113.InterfaceC8055;
import p113.InterfaceC8056;
import p113.InterfaceC8057;
import p113.InterfaceC8059;
import p113.InterfaceC8060;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f14488 = new C5317("KotlinTypeRefiner", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static Collection m10223(InterfaceC5685 interfaceC5685, InterfaceC8048 interfaceC8048) {
        InterfaceC8060 interfaceC8060Mo10182 = interfaceC5685.mo10182(interfaceC8048);
        if (interfaceC8060Mo10182 instanceof C5598) {
            return ((C5598) interfaceC8060Mo10182).f14249;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static AbstractC5702 m10224(InterfaceC8053 interfaceC8053) {
        if (interfaceC8053 instanceof C5694) {
            return ((C5694) interfaceC8053).f14493;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8053);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8053.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static AbstractC5746 m10225(InterfaceC8052 interfaceC8052) {
        if (interfaceC8052 instanceof C5696) {
            return ((C5696) interfaceC8052).f14497;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8052);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8052.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static AbstractC5710 m10226(InterfaceC8050 interfaceC8050) {
        if (interfaceC8050 instanceof AbstractC5728) {
            return ((AbstractC5728) interfaceC8050).f14561;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8050);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8050.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m10227(InterfaceC8060 interfaceC8060) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            return ((InterfaceC5705) interfaceC8060).getParameters().size();
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static AbstractC5746 m10228(InterfaceC8049 interfaceC8049) {
        if (interfaceC8049 instanceof AbstractC5746) {
            return AbstractC5725.m10386((AbstractC5746) interfaceC8049, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m10229(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof AbstractC5710) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m10230(InterfaceC8048 interfaceC8048) {
        if (interfaceC8048 instanceof AbstractC5710) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m10231(InterfaceC8056 interfaceC8056) {
        if (interfaceC8056 instanceof AbstractC5714) {
            return AbstractC7359.m12576((AbstractC5714) interfaceC8056);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8056);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8056.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m10232(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return AbstractC5749.m10403((AbstractC5714) interfaceC8049);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static boolean m10233(InterfaceC8059 interfaceC8059) {
        interfaceC8059.getClass();
        if (interfaceC8059 instanceof AbstractC5702) {
            return ((AbstractC5702) interfaceC8059).mo10299();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8059);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8059.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m10234(InterfaceC8052 interfaceC8052) {
        if (interfaceC8052 instanceof C5696) {
            return ((C5696) interfaceC8052).f14499;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8052);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8052.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m10235(InterfaceC8060 interfaceC8060) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            return ((InterfaceC5705) interfaceC8060).mo9771();
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m10236(InterfaceC8060 interfaceC8060) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            InterfaceC5309 interfaceC5309Mo9770 = ((InterfaceC5705) interfaceC8060).mo9770();
            AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
            return (abstractC7818 == null || abstractC7818.mo9568() != Modality.FINAL || abstractC7818.mo9569() == ClassKind.ENUM_CLASS || abstractC7818.mo9569() == ClassKind.ENUM_ENTRY || abstractC7818.mo9569() == ClassKind.ANNOTATION_CLASS) ? false : true;
        }
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m10237(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            return ((InterfaceC5705) interfaceC8060).mo9770() instanceof AbstractC7818;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m10238(InterfaceC8060 interfaceC8060) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            return AbstractC7359.m12574((InterfaceC5705) interfaceC8060, AbstractC7356.f18230);
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m10239(InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        interfaceC8048.getClass();
        interfaceC80482.getClass();
        if (!(interfaceC8048 instanceof AbstractC5710)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC8048);
            sb.append(", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
            return false;
        }
        if (interfaceC80482 instanceof AbstractC5710) {
            return ((AbstractC5710) interfaceC8048).mo10285() == ((AbstractC5710) interfaceC80482).mo10285();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC80482);
        sb2.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC80482.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m10240(InterfaceC8057 interfaceC8057, InterfaceC8060 interfaceC8060) {
        if (!(interfaceC8057 instanceof InterfaceC5295)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC8057);
            sb.append(", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8057.getClass(), sb));
            return false;
        }
        InterfaceC5295 interfaceC5295 = (InterfaceC5295) interfaceC8057;
        if (interfaceC8060 == null ? true : interfaceC8060 instanceof InterfaceC5705) {
            return AbstractC3738.m6865(interfaceC5295, (InterfaceC5705) interfaceC8060, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC5295);
        sb2.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC5295.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m10241(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            return AbstractC7359.m12574((InterfaceC5705) interfaceC8060, AbstractC7356.f18229);
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m10242(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return (interfaceC8049 instanceof AbstractC5710) && ((AbstractC5710) interfaceC8049).mo10284();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m10243(InterfaceC8060 interfaceC8060) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            return interfaceC8060 instanceof C5715;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m10244(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            return interfaceC8060 instanceof C5598;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m10245(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            InterfaceC5309 interfaceC5309Mo9770 = ((InterfaceC5705) interfaceC8060).mo9770();
            AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
            return (abstractC7818 != null ? abstractC7818.mo9579() : null) instanceof C5315;
        }
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m10246(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return AbstractC5725.m10388((AbstractC5714) interfaceC8049);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5738 m10247(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof AbstractC5710) {
            if (interfaceC8048 instanceof C5738) {
                return (C5738) interfaceC8048;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC8052 m10248(InterfaceC5685 interfaceC5685, InterfaceC8056 interfaceC8056) {
        interfaceC8056.getClass();
        if (interfaceC8056 instanceof AbstractC5710) {
            if (interfaceC8056 instanceof C5719) {
                return interfaceC5685.mo10171(((C5719) interfaceC8056).f14546);
            }
            if (interfaceC8056 instanceof C5696) {
                return (C5696) interfaceC8056;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8056);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8056.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC8055 m10249(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof AbstractC5710) {
            return (InterfaceC8055) interfaceC8048;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m10250(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return ((AbstractC5714) interfaceC8049).mo10285().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m10251(InterfaceC8060 interfaceC8060, InterfaceC8060 interfaceC80602) {
        interfaceC8060.getClass();
        interfaceC80602.getClass();
        if (!(interfaceC8060 instanceof InterfaceC5705)) {
            StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
            return false;
        }
        if (interfaceC80602 instanceof InterfaceC5705) {
            return interfaceC8060.equals(interfaceC80602);
        }
        StringBuilder sbM51242 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC80602, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC80602.getClass(), sbM51242));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10252(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static AbstractC5746 m10253(InterfaceC5685 interfaceC5685, InterfaceC8059 interfaceC8059) {
        interfaceC8059.getClass();
        if (interfaceC5685.mo10176(interfaceC8059)) {
            return null;
        }
        if (interfaceC8059 instanceof AbstractC5702) {
            return ((AbstractC5702) interfaceC8059).mo10300().mo10331();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8059);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8059.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static AbstractC5714 m10254(InterfaceC8057 interfaceC8057) {
        interfaceC8057.getClass();
        if (interfaceC8057 instanceof InterfaceC5295) {
            return AbstractC3738.m6859((InterfaceC5295) interfaceC8057);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8057);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8057.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static TypeVariance m10255(InterfaceC8057 interfaceC8057) {
        if (interfaceC8057 instanceof InterfaceC5295) {
            Variance varianceMo9562 = ((InterfaceC5295) interfaceC8057).mo9562();
            varianceMo9562.getClass();
            return AbstractC3889.m7299(varianceMo9562);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8057);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8057.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m10256(InterfaceC8049 interfaceC8049, C5519 c5519) {
        interfaceC8049.getClass();
        c5519.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return ((AbstractC5714) interfaceC8049).getAnnotations().mo10077(c5519);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static InterfaceC5295 m10257(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            InterfaceC5309 interfaceC5309Mo9770 = ((InterfaceC5705) interfaceC8060).mo9770();
            if (interfaceC5309Mo9770 instanceof InterfaceC5295) {
                return (InterfaceC5295) interfaceC5309Mo9770;
            }
            return null;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static TypeVariance m10258(InterfaceC8059 interfaceC8059) {
        interfaceC8059.getClass();
        if (interfaceC8059 instanceof AbstractC5702) {
            Variance varianceMo10301 = ((AbstractC5702) interfaceC8059).mo10301();
            varianceMo10301.getClass();
            return AbstractC3889.m7299(varianceMo10301);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8059);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8059.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String m10259(InterfaceC5705 interfaceC5705) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + interfaceC5705);
        sb.append('\n');
        sb.append("hashCode: " + interfaceC5705.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + interfaceC5705.getClass().getCanonicalName());
        sb.append('\n');
        for (InterfaceC5331 interfaceC5331Mo9770 = interfaceC5705.mo9770(); interfaceC5331Mo9770 != null; interfaceC5331Mo9770 = interfaceC5331Mo9770.mo9587()) {
            sb.append("fqName: ".concat(C5576.f14235.m10032(interfaceC5331Mo9770)));
            sb.append('\n');
            sb.append("javaClass: " + interfaceC5331Mo9770.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static AbstractC5746 m10260(InterfaceC5685 interfaceC5685, InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        interfaceC8048.getClass();
        interfaceC80482.getClass();
        if (!(interfaceC8048 instanceof AbstractC5710)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC5685);
            sb.append(", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC5685.getClass(), sb));
            return null;
        }
        if (interfaceC80482 instanceof AbstractC5710) {
            return AbstractC5725.m10368((AbstractC5710) interfaceC8048, (AbstractC5710) interfaceC80482);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC5685);
        sb2.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC5685.getClass(), sb2));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC8057 m10261(InterfaceC8060 interfaceC8060, int i) {
        if (interfaceC8060 instanceof InterfaceC5705) {
            Object obj = ((InterfaceC5705) interfaceC8060).getParameters().get(i);
            obj.getClass();
            return (InterfaceC8057) obj;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static List m10262(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            List parameters = ((InterfaceC5705) interfaceC8060).getParameters();
            parameters.getClass();
            return parameters;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static InterfaceC8059 m10263(InterfaceC8049 interfaceC8049, int i) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return (InterfaceC8059) ((AbstractC5714) interfaceC8049).mo10285().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static List m10264(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            return ((AbstractC5714) interfaceC8049).mo10285();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC5710 m10265(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            AbstractC5746 abstractC5746Mo10331 = ((AbstractC5714) interfaceC8049).mo10331();
            if (abstractC5746Mo10331 instanceof AbstractC5710) {
                return (AbstractC5710) abstractC5746Mo10331;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC5728 m10266(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5714) {
            AbstractC5746 abstractC5746Mo10331 = ((AbstractC5714) interfaceC8049).mo10331();
            if (abstractC5746Mo10331 instanceof AbstractC5728) {
                return (AbstractC5728) abstractC5746Mo10331;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static CaptureStatus m10267(InterfaceC8052 interfaceC8052) {
        if (interfaceC8052 instanceof C5696) {
            return ((C5696) interfaceC8052).f14500;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8052);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8052.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C5704 m10268(boolean z, C5690 c5690, C5682 c5682, int i) {
        if ((i & 4) != 0) {
            c5690 = C5690.f14485;
        }
        C5690 c56902 = c5690;
        if ((i & 8) != 0) {
            c5682 = C5682.f14477;
        }
        return new C5704(z, true, true, c56902, c5682, C5681.f14476);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5717 m10269(InterfaceC8049 interfaceC8049) {
        if (interfaceC8049 instanceof AbstractC5714) {
            return new C5717((AbstractC5714) interfaceC8049);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC5710 m10270(InterfaceC8048 interfaceC8048, CaptureStatus captureStatus) {
        List listMo10285;
        ArrayList arrayList;
        C5682 c5682;
        CaptureStatus captureStatus2;
        captureStatus.getClass();
        C5697 c5697 = null;
        if (!(interfaceC8048 instanceof AbstractC5710)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC8048);
            sb.append(", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
            return null;
        }
        AbstractC5710 abstractC5710 = (AbstractC5710) interfaceC8048;
        if (abstractC5710.mo10285().size() == abstractC5710.mo10281().getParameters().size() && ((listMo10285 = abstractC5710.mo10285()) == null || !listMo10285.isEmpty())) {
            Iterator it = listMo10285.iterator();
            while (it.hasNext()) {
                if (((AbstractC5702) it.next()).mo10301() != Variance.INVARIANT) {
                    List parameters = abstractC5710.mo10281().getParameters();
                    parameters.getClass();
                    ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(listMo10285, parameters);
                    arrayList = new ArrayList(AbstractC5177.m9381(arrayListM9380, 10));
                    for (Pair pair : arrayListM9380) {
                        AbstractC5702 c5717 = (AbstractC5702) pair.component1();
                        InterfaceC5295 interfaceC5295 = (InterfaceC5295) pair.component2();
                        if (c5717.mo10301() == Variance.INVARIANT) {
                            captureStatus2 = captureStatus;
                        } else {
                            AbstractC5746 abstractC5746Mo10331 = (c5717.mo10299() || c5717.mo10301() != Variance.IN_VARIANCE) ? null : c5717.mo10300().mo10331();
                            interfaceC5295.getClass();
                            captureStatus2 = captureStatus;
                            c5717 = new C5717(new C5696(captureStatus2, new C5694(c5717, c5697, interfaceC5295, 6), abstractC5746Mo10331, (C5706) null, false, 56));
                        }
                        arrayList.add(c5717);
                        captureStatus = captureStatus2;
                    }
                    C5751 c5751 = new C5751(AbstractC5701.f14508.m10355(abstractC5710.mo10281(), arrayList));
                    int size = listMo10285.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC5702 abstractC5702 = (AbstractC5702) listMo10285.get(i);
                        AbstractC5702 abstractC57022 = (AbstractC5702) arrayList.get(i);
                        if (abstractC5702.mo10301() != Variance.INVARIANT) {
                            List upperBounds = ((InterfaceC5295) abstractC5710.mo10281().getParameters().get(i)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                c5682 = C5682.f14477;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(c5682.mo10148(c5751.m10420((AbstractC5714) it2.next(), Variance.INVARIANT).mo10331()));
                            }
                            if (!abstractC5702.mo10299() && abstractC5702.mo10301() == Variance.OUT_VARIANCE) {
                                arrayList2.add(c5682.mo10148(abstractC5702.mo10300().mo10331()));
                            }
                            AbstractC5714 abstractC5714Mo10300 = abstractC57022.mo10300();
                            abstractC5714Mo10300.getClass();
                            C5694 c5694 = ((C5696) abstractC5714Mo10300).f14501;
                            c5694.getClass();
                            c5694.f14491 = new C5697(1, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return AbstractC5725.m10377(arrayList, abstractC5710.mo10282(), abstractC5710.mo10281(), abstractC5710.mo10284());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static InterfaceC8049 m10271(InterfaceC5685 interfaceC5685, InterfaceC8049 interfaceC8049) {
        if (interfaceC8049 instanceof InterfaceC8048) {
            return interfaceC5685.mo10154((InterfaceC8048) interfaceC8049);
        }
        if (interfaceC8049 instanceof InterfaceC8050) {
            InterfaceC8050 interfaceC8050 = (InterfaceC8050) interfaceC8049;
            return interfaceC5685.mo10151(interfaceC5685.mo10154((InterfaceC8048) interfaceC5685.mo10153(interfaceC8050)), interfaceC5685.mo10154((InterfaceC8048) interfaceC5685.mo10152(interfaceC8050)));
        }
        C6755.m11870("sealed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC5710 m10272(InterfaceC8048 interfaceC8048, boolean z) {
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof AbstractC5710) {
            return ((AbstractC5710) interfaceC8048).mo10290(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C5686 m10273(InterfaceC5685 interfaceC5685, InterfaceC8048 interfaceC8048) {
        if (interfaceC8048 instanceof AbstractC5710) {
            AbstractC5714 abstractC5714 = (AbstractC5714) interfaceC8048;
            return new C5686(interfaceC5685, new C5751(AbstractC5701.f14508.m10355(abstractC5714.mo10281(), abstractC5714.mo10285())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static AbstractC5714 m10274(C5751 c5751, InterfaceC8049 interfaceC8049) {
        c5751.getClass();
        interfaceC8049.getClass();
        if (interfaceC8049 instanceof AbstractC5746) {
            return c5751.m10420((AbstractC5714) interfaceC8049, Variance.INVARIANT);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8049);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static C5694 m10275(InterfaceC8052 interfaceC8052) {
        if (interfaceC8052 instanceof C5696) {
            return ((C5696) interfaceC8052).f14501;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8052);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8052.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC5710 m10276(InterfaceC8050 interfaceC8050) {
        if (interfaceC8050 instanceof AbstractC5728) {
            return ((AbstractC5728) interfaceC8050).f14562;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8050);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8050.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static Collection m10277(InterfaceC8060 interfaceC8060) {
        interfaceC8060.getClass();
        if (interfaceC8060 instanceof InterfaceC5705) {
            Collection collectionMo10053 = ((InterfaceC5705) interfaceC8060).mo10053();
            collectionMo10053.getClass();
            return collectionMo10053;
        }
        StringBuilder sbM5124 = AbstractC3275.m5124("ClassicTypeSystemContext couldn't handle: ", interfaceC8060, ", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8060.getClass(), sbM5124));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static InterfaceC5705 m10278(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        if (interfaceC8048 instanceof AbstractC5710) {
            return ((AbstractC5710) interfaceC8048).mo10281();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC8048);
        sb.append(", ");
        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8048.getClass(), sb));
        return null;
    }
}
