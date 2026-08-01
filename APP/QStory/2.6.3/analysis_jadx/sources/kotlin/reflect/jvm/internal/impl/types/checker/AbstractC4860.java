package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.impl.descriptors.C4483;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4766;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4872;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4883;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.C4887;
import kotlin.reflect.jvm.internal.impl.types.C4906;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p079.AbstractC6989;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7223;
import p097.InterfaceC7224;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7230;
import p097.InterfaceC7231;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4860 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f14143 = new C4485("KotlinTypeRefiner", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static Collection m9664(InterfaceC4853 interfaceC4853, InterfaceC7219 interfaceC7219) {
        InterfaceC7231 interfaceC7231Mo9623 = interfaceC4853.mo9623(interfaceC7219);
        if (interfaceC7231Mo9623 instanceof C4766) {
            return ((C4766) interfaceC7231Mo9623).f13904;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static AbstractC4870 m9665(InterfaceC7224 interfaceC7224) {
        if (interfaceC7224 instanceof C4862) {
            return ((C4862) interfaceC7224).f14148;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7224);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7224.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static AbstractC4914 m9666(InterfaceC7223 interfaceC7223) {
        if (interfaceC7223 instanceof C4864) {
            return ((C4864) interfaceC7223).f14152;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7223);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7223.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static AbstractC4878 m9667(InterfaceC7221 interfaceC7221) {
        if (interfaceC7221 instanceof AbstractC4896) {
            return ((AbstractC4896) interfaceC7221).f14216;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7221);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7221.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m9668(InterfaceC7231 interfaceC7231) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            return ((InterfaceC4873) interfaceC7231).getParameters().size();
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static AbstractC4914 m9669(InterfaceC7220 interfaceC7220) {
        if (interfaceC7220 instanceof AbstractC4914) {
            return AbstractC4893.m9827((AbstractC4914) interfaceC7220, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m9670(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4878) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m9671(InterfaceC7219 interfaceC7219) {
        if (interfaceC7219 instanceof AbstractC4878) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m9672(InterfaceC7227 interfaceC7227) {
        if (interfaceC7227 instanceof AbstractC4882) {
            return AbstractC6530.m12017((AbstractC4882) interfaceC7227);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7227);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7227.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m9673(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return AbstractC4917.m9844((AbstractC4882) interfaceC7220);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static boolean m9674(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof AbstractC4870) {
            return ((AbstractC4870) interfaceC7230).mo9740();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7230);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7230.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m9675(InterfaceC7223 interfaceC7223) {
        if (interfaceC7223 instanceof C4864) {
            return ((C4864) interfaceC7223).f14154;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7223);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7223.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m9676(InterfaceC7231 interfaceC7231) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            return ((InterfaceC4873) interfaceC7231).mo9212();
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m9677(InterfaceC7231 interfaceC7231) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            InterfaceC4477 interfaceC4477Mo9211 = ((InterfaceC4873) interfaceC7231).mo9211();
            AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
            return (abstractC6989 == null || abstractC6989.mo9009() != Modality.FINAL || abstractC6989.mo9010() == ClassKind.ENUM_CLASS || abstractC6989.mo9010() == ClassKind.ENUM_ENTRY || abstractC6989.mo9010() == ClassKind.ANNOTATION_CLASS) ? false : true;
        }
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m9678(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            return ((InterfaceC4873) interfaceC7231).mo9211() instanceof AbstractC6989;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m9679(InterfaceC7231 interfaceC7231) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            return AbstractC6530.m12015((InterfaceC4873) interfaceC7231, AbstractC6527.f17885);
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m9680(InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        interfaceC7219.getClass();
        interfaceC72192.getClass();
        if (!(interfaceC7219 instanceof AbstractC4878)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7219);
            sb.append(", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
            return false;
        }
        if (interfaceC72192 instanceof AbstractC4878) {
            return ((AbstractC4878) interfaceC7219).mo9726() == ((AbstractC4878) interfaceC72192).mo9726();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC72192);
        sb2.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC72192.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m9681(InterfaceC7228 interfaceC7228, InterfaceC7231 interfaceC7231) {
        if (!(interfaceC7228 instanceof InterfaceC4463)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7228);
            sb.append(", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7228.getClass(), sb));
            return false;
        }
        InterfaceC4463 interfaceC4463 = (InterfaceC4463) interfaceC7228;
        if (interfaceC7231 == null ? true : interfaceC7231 instanceof InterfaceC4873) {
            return AbstractC2905.m6305(interfaceC4463, (InterfaceC4873) interfaceC7231, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC4463);
        sb2.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC4463.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m9682(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            return AbstractC6530.m12015((InterfaceC4873) interfaceC7231, AbstractC6527.f17884);
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m9683(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return (interfaceC7220 instanceof AbstractC4878) && ((AbstractC4878) interfaceC7220).mo9725();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m9684(InterfaceC7231 interfaceC7231) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            return interfaceC7231 instanceof C4883;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m9685(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            return interfaceC7231 instanceof C4766;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m9686(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            InterfaceC4477 interfaceC4477Mo9211 = ((InterfaceC4873) interfaceC7231).mo9211();
            AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
            return (abstractC6989 != null ? abstractC6989.mo9020() : null) instanceof C4483;
        }
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m9687(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return AbstractC4893.m9829((AbstractC4882) interfaceC7220);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4906 m9688(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4878) {
            if (interfaceC7219 instanceof C4906) {
                return (C4906) interfaceC7219;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC7223 m9689(InterfaceC4853 interfaceC4853, InterfaceC7227 interfaceC7227) {
        interfaceC7227.getClass();
        if (interfaceC7227 instanceof AbstractC4878) {
            if (interfaceC7227 instanceof C4887) {
                return interfaceC4853.mo9612(((C4887) interfaceC7227).f14201);
            }
            if (interfaceC7227 instanceof C4864) {
                return (C4864) interfaceC7227;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7227);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7227.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC7226 m9690(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4878) {
            return (InterfaceC7226) interfaceC7219;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9691(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return ((AbstractC4882) interfaceC7220).mo9726().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9692(InterfaceC7231 interfaceC7231, InterfaceC7231 interfaceC72312) {
        interfaceC7231.getClass();
        interfaceC72312.getClass();
        if (!(interfaceC7231 instanceof InterfaceC4873)) {
            StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
            return false;
        }
        if (interfaceC72312 instanceof InterfaceC4873) {
            return interfaceC7231.equals(interfaceC72312);
        }
        StringBuilder sbM45642 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC72312, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC72312.getClass(), sbM45642));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9693(int i) {
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
    public static AbstractC4914 m9694(InterfaceC4853 interfaceC4853, InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC4853.mo9617(interfaceC7230)) {
            return null;
        }
        if (interfaceC7230 instanceof AbstractC4870) {
            return ((AbstractC4870) interfaceC7230).mo9741().mo9772();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7230);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7230.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static AbstractC4882 m9695(InterfaceC7228 interfaceC7228) {
        interfaceC7228.getClass();
        if (interfaceC7228 instanceof InterfaceC4463) {
            return AbstractC2905.m6299((InterfaceC4463) interfaceC7228);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7228);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7228.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static TypeVariance m9696(InterfaceC7228 interfaceC7228) {
        if (interfaceC7228 instanceof InterfaceC4463) {
            Variance varianceMo9003 = ((InterfaceC4463) interfaceC7228).mo9003();
            varianceMo9003.getClass();
            return AbstractC3057.m6739(varianceMo9003);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7228);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7228.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m9697(InterfaceC7220 interfaceC7220, C4687 c4687) {
        interfaceC7220.getClass();
        c4687.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return ((AbstractC4882) interfaceC7220).getAnnotations().mo9518(c4687);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static InterfaceC4463 m9698(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            InterfaceC4477 interfaceC4477Mo9211 = ((InterfaceC4873) interfaceC7231).mo9211();
            if (interfaceC4477Mo9211 instanceof InterfaceC4463) {
                return (InterfaceC4463) interfaceC4477Mo9211;
            }
            return null;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static TypeVariance m9699(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof AbstractC4870) {
            Variance varianceMo9742 = ((AbstractC4870) interfaceC7230).mo9742();
            varianceMo9742.getClass();
            return AbstractC3057.m6739(varianceMo9742);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7230);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7230.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String m9700(InterfaceC4873 interfaceC4873) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + interfaceC4873);
        sb.append('\n');
        sb.append("hashCode: " + interfaceC4873.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + interfaceC4873.getClass().getCanonicalName());
        sb.append('\n');
        for (InterfaceC4499 interfaceC4499Mo9211 = interfaceC4873.mo9211(); interfaceC4499Mo9211 != null; interfaceC4499Mo9211 = interfaceC4499Mo9211.mo9028()) {
            sb.append("fqName: ".concat(C4744.f13890.m9473(interfaceC4499Mo9211)));
            sb.append('\n');
            sb.append("javaClass: " + interfaceC4499Mo9211.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static AbstractC4914 m9701(InterfaceC4853 interfaceC4853, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        interfaceC7219.getClass();
        interfaceC72192.getClass();
        if (!(interfaceC7219 instanceof AbstractC4878)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC4853);
            sb.append(", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC4853.getClass(), sb));
            return null;
        }
        if (interfaceC72192 instanceof AbstractC4878) {
            return AbstractC4893.m9809((AbstractC4878) interfaceC7219, (AbstractC4878) interfaceC72192);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC4853);
        sb2.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC4853.getClass(), sb2));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC7228 m9702(InterfaceC7231 interfaceC7231, int i) {
        if (interfaceC7231 instanceof InterfaceC4873) {
            Object obj = ((InterfaceC4873) interfaceC7231).getParameters().get(i);
            obj.getClass();
            return (InterfaceC7228) obj;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static List m9703(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            List parameters = ((InterfaceC4873) interfaceC7231).getParameters();
            parameters.getClass();
            return parameters;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static InterfaceC7230 m9704(InterfaceC7220 interfaceC7220, int i) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return (InterfaceC7230) ((AbstractC4882) interfaceC7220).mo9726().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static List m9705(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            return ((AbstractC4882) interfaceC7220).mo9726();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC4878 m9706(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            AbstractC4914 abstractC4914Mo9772 = ((AbstractC4882) interfaceC7220).mo9772();
            if (abstractC4914Mo9772 instanceof AbstractC4878) {
                return (AbstractC4878) abstractC4914Mo9772;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC4896 m9707(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4882) {
            AbstractC4914 abstractC4914Mo9772 = ((AbstractC4882) interfaceC7220).mo9772();
            if (abstractC4914Mo9772 instanceof AbstractC4896) {
                return (AbstractC4896) abstractC4914Mo9772;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static CaptureStatus m9708(InterfaceC7223 interfaceC7223) {
        if (interfaceC7223 instanceof C4864) {
            return ((C4864) interfaceC7223).f14155;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7223);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7223.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C4872 m9709(boolean z, C4858 c4858, C4850 c4850, int i) {
        if ((i & 4) != 0) {
            c4858 = C4858.f14140;
        }
        C4858 c48582 = c4858;
        if ((i & 8) != 0) {
            c4850 = C4850.f14132;
        }
        return new C4872(z, true, true, c48582, c4850, C4849.f14131);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4885 m9710(InterfaceC7220 interfaceC7220) {
        if (interfaceC7220 instanceof AbstractC4882) {
            return new C4885((AbstractC4882) interfaceC7220);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC4878 m9711(InterfaceC7219 interfaceC7219, CaptureStatus captureStatus) {
        List listMo9726;
        ArrayList arrayList;
        C4850 c4850;
        CaptureStatus captureStatus2;
        captureStatus.getClass();
        C4865 c4865 = null;
        if (!(interfaceC7219 instanceof AbstractC4878)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7219);
            sb.append(", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
            return null;
        }
        AbstractC4878 abstractC4878 = (AbstractC4878) interfaceC7219;
        if (abstractC4878.mo9726().size() == abstractC4878.mo9722().getParameters().size() && ((listMo9726 = abstractC4878.mo9726()) == null || !listMo9726.isEmpty())) {
            Iterator it = listMo9726.iterator();
            while (it.hasNext()) {
                if (((AbstractC4870) it.next()).mo9742() != Variance.INVARIANT) {
                    List parameters = abstractC4878.mo9722().getParameters();
                    parameters.getClass();
                    ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(listMo9726, parameters);
                    arrayList = new ArrayList(AbstractC4345.m8822(arrayListM8821, 10));
                    for (Pair pair : arrayListM8821) {
                        AbstractC4870 c4885 = (AbstractC4870) pair.component1();
                        InterfaceC4463 interfaceC4463 = (InterfaceC4463) pair.component2();
                        if (c4885.mo9742() == Variance.INVARIANT) {
                            captureStatus2 = captureStatus;
                        } else {
                            AbstractC4914 abstractC4914Mo9772 = (c4885.mo9740() || c4885.mo9742() != Variance.IN_VARIANCE) ? null : c4885.mo9741().mo9772();
                            interfaceC4463.getClass();
                            captureStatus2 = captureStatus;
                            c4885 = new C4885(new C4864(captureStatus2, new C4862(c4885, c4865, interfaceC4463, 6), abstractC4914Mo9772, (C4874) null, false, 56));
                        }
                        arrayList.add(c4885);
                        captureStatus = captureStatus2;
                    }
                    C4919 c4919 = new C4919(AbstractC4869.f14163.m9796(abstractC4878.mo9722(), arrayList));
                    int size = listMo9726.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC4870 abstractC4870 = (AbstractC4870) listMo9726.get(i);
                        AbstractC4870 abstractC48702 = (AbstractC4870) arrayList.get(i);
                        if (abstractC4870.mo9742() != Variance.INVARIANT) {
                            List upperBounds = ((InterfaceC4463) abstractC4878.mo9722().getParameters().get(i)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                c4850 = C4850.f14132;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(c4850.mo9589(c4919.m9861((AbstractC4882) it2.next(), Variance.INVARIANT).mo9772()));
                            }
                            if (!abstractC4870.mo9740() && abstractC4870.mo9742() == Variance.OUT_VARIANCE) {
                                arrayList2.add(c4850.mo9589(abstractC4870.mo9741().mo9772()));
                            }
                            AbstractC4882 abstractC4882Mo9741 = abstractC48702.mo9741();
                            abstractC4882Mo9741.getClass();
                            C4862 c4862 = ((C4864) abstractC4882Mo9741).f14156;
                            c4862.getClass();
                            c4862.f14146 = new C4865(1, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return AbstractC4893.m9818(arrayList, abstractC4878.mo9723(), abstractC4878.mo9722(), abstractC4878.mo9725());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static InterfaceC7220 m9712(InterfaceC4853 interfaceC4853, InterfaceC7220 interfaceC7220) {
        if (interfaceC7220 instanceof InterfaceC7219) {
            return interfaceC4853.mo9595((InterfaceC7219) interfaceC7220);
        }
        if (interfaceC7220 instanceof InterfaceC7221) {
            InterfaceC7221 interfaceC7221 = (InterfaceC7221) interfaceC7220;
            return interfaceC4853.mo9592(interfaceC4853.mo9595((InterfaceC7219) interfaceC4853.mo9594(interfaceC7221)), interfaceC4853.mo9595((InterfaceC7219) interfaceC4853.mo9593(interfaceC7221)));
        }
        C5925.m11311("sealed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC4878 m9713(InterfaceC7219 interfaceC7219, boolean z) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4878) {
            return ((AbstractC4878) interfaceC7219).mo9731(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C4854 m9714(InterfaceC4853 interfaceC4853, InterfaceC7219 interfaceC7219) {
        if (interfaceC7219 instanceof AbstractC4878) {
            AbstractC4882 abstractC4882 = (AbstractC4882) interfaceC7219;
            return new C4854(interfaceC4853, new C4919(AbstractC4869.f14163.m9796(abstractC4882.mo9722(), abstractC4882.mo9726())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static AbstractC4882 m9715(C4919 c4919, InterfaceC7220 interfaceC7220) {
        c4919.getClass();
        interfaceC7220.getClass();
        if (interfaceC7220 instanceof AbstractC4914) {
            return c4919.m9861((AbstractC4882) interfaceC7220, Variance.INVARIANT);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static C4862 m9716(InterfaceC7223 interfaceC7223) {
        if (interfaceC7223 instanceof C4864) {
            return ((C4864) interfaceC7223).f14156;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7223);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7223.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC4878 m9717(InterfaceC7221 interfaceC7221) {
        if (interfaceC7221 instanceof AbstractC4896) {
            return ((AbstractC4896) interfaceC7221).f14217;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7221);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7221.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static Collection m9718(InterfaceC7231 interfaceC7231) {
        interfaceC7231.getClass();
        if (interfaceC7231 instanceof InterfaceC4873) {
            Collection collectionMo9494 = ((InterfaceC4873) interfaceC7231).mo9494();
            collectionMo9494.getClass();
            return collectionMo9494;
        }
        StringBuilder sbM4564 = AbstractC2442.m4564("ClassicTypeSystemContext couldn't handle: ", interfaceC7231, ", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7231.getClass(), sbM4564));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static InterfaceC4873 m9719(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4878) {
            return ((AbstractC4878) interfaceC7219).mo9722();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7219.getClass(), sb));
        return null;
    }
}
