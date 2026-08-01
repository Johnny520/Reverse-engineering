package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.C4482;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4765;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4868;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4882;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.C4886;
import kotlin.reflect.jvm.internal.impl.types.C4905;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p079.AbstractC6988;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7225;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p175.AbstractC7738;
import p251.AbstractC8174;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4859 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4484 f14139 = new C4484("KotlinTypeRefiner", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static Collection m9674(InterfaceC4852 interfaceC4852, InterfaceC7218 interfaceC7218) {
        InterfaceC7230 interfaceC7230Mo9632 = interfaceC4852.mo9632(interfaceC7218);
        if (interfaceC7230Mo9632 instanceof C4765) {
            return ((C4765) interfaceC7230Mo9632).f13900;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static AbstractC4869 m9675(InterfaceC7223 interfaceC7223) {
        if (interfaceC7223 instanceof C4861) {
            return ((C4861) interfaceC7223).f14144;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7223);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7223.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static AbstractC4913 m9676(InterfaceC7222 interfaceC7222) {
        if (interfaceC7222 instanceof C4863) {
            return ((C4863) interfaceC7222).f14148;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7222);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7222.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static AbstractC4877 m9677(InterfaceC7220 interfaceC7220) {
        if (interfaceC7220 instanceof AbstractC4895) {
            return ((AbstractC4895) interfaceC7220).f14212;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m9678(InterfaceC7230 interfaceC7230) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            return ((InterfaceC4872) interfaceC7230).getParameters().size();
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static AbstractC4913 m9679(InterfaceC7219 interfaceC7219) {
        if (interfaceC7219 instanceof AbstractC4913) {
            return AbstractC4892.m9833((AbstractC4913) interfaceC7219, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m9680(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof AbstractC4877) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m9681(InterfaceC7218 interfaceC7218) {
        if (interfaceC7218 instanceof AbstractC4877) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m9682(InterfaceC7226 interfaceC7226) {
        if (interfaceC7226 instanceof AbstractC4881) {
            return AbstractC6529.m11974((AbstractC4881) interfaceC7226);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7226);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7226.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m9683(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return AbstractC4916.m9850((AbstractC4881) interfaceC7219);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static boolean m9684(InterfaceC7229 interfaceC7229) {
        interfaceC7229.getClass();
        if (interfaceC7229 instanceof AbstractC4869) {
            return ((AbstractC4869) interfaceC7229).mo9750();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7229);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7229.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m9685(InterfaceC7222 interfaceC7222) {
        if (interfaceC7222 instanceof C4863) {
            return ((C4863) interfaceC7222).f14150;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7222);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7222.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m9686(InterfaceC7230 interfaceC7230) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            return ((InterfaceC4872) interfaceC7230).mo9222();
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m9687(InterfaceC7230 interfaceC7230) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            InterfaceC4476 interfaceC4476Mo9221 = ((InterfaceC4872) interfaceC7230).mo9221();
            AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
            return (abstractC6988 == null || abstractC6988.mo9019() != Modality.FINAL || abstractC6988.mo9020() == ClassKind.ENUM_CLASS || abstractC6988.mo9020() == ClassKind.ENUM_ENTRY || abstractC6988.mo9020() == ClassKind.ANNOTATION_CLASS) ? false : true;
        }
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m9688(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            return ((InterfaceC4872) interfaceC7230).mo9221() instanceof AbstractC6988;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m9689(InterfaceC7230 interfaceC7230) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            return AbstractC6529.m11972((InterfaceC4872) interfaceC7230, AbstractC6526.f17889);
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m9690(InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        interfaceC7218.getClass();
        interfaceC72182.getClass();
        if (!(interfaceC7218 instanceof AbstractC4877)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7218);
            sb.append(", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
            return false;
        }
        if (interfaceC72182 instanceof AbstractC4877) {
            return ((AbstractC4877) interfaceC7218).mo9736() == ((AbstractC4877) interfaceC72182).mo9736();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC72182);
        sb2.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC72182.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m9691(InterfaceC7227 interfaceC7227, InterfaceC7230 interfaceC7230) {
        if (!(interfaceC7227 instanceof InterfaceC4462)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7227);
            sb.append(", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7227.getClass(), sb));
            return false;
        }
        InterfaceC4462 interfaceC4462 = (InterfaceC4462) interfaceC7227;
        if (interfaceC7230 == null ? true : interfaceC7230 instanceof InterfaceC4872) {
            return AbstractC7738.m13030(interfaceC4462, (InterfaceC4872) interfaceC7230, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC4462);
        sb2.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC4462.getClass(), sb2));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m9692(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            return AbstractC6529.m11972((InterfaceC4872) interfaceC7230, AbstractC6526.f17888);
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m9693(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return (interfaceC7219 instanceof AbstractC4877) && ((AbstractC4877) interfaceC7219).mo9735();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m9694(InterfaceC7230 interfaceC7230) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            return interfaceC7230 instanceof C4882;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m9695(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            return interfaceC7230 instanceof C4765;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m9696(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            InterfaceC4476 interfaceC4476Mo9221 = ((InterfaceC4872) interfaceC7230).mo9221();
            AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
            return (abstractC6988 != null ? abstractC6988.mo9030() : null) instanceof C4482;
        }
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ")));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m9697(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return AbstractC4892.m9835((AbstractC4881) interfaceC7219);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4905 m9698(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof AbstractC4877) {
            if (interfaceC7218 instanceof C4905) {
                return (C4905) interfaceC7218;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC7222 m9699(InterfaceC4852 interfaceC4852, InterfaceC7226 interfaceC7226) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof AbstractC4877) {
            if (interfaceC7226 instanceof C4886) {
                return interfaceC4852.mo9623(((C4886) interfaceC7226).f14197);
            }
            if (interfaceC7226 instanceof C4863) {
                return (C4863) interfaceC7226;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7226);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7226.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC7225 m9700(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof AbstractC4877) {
            return (InterfaceC7225) interfaceC7218;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9701(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return ((AbstractC4881) interfaceC7219).mo9736().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9702(InterfaceC7230 interfaceC7230, InterfaceC7230 interfaceC72302) {
        interfaceC7230.getClass();
        interfaceC72302.getClass();
        if (!(interfaceC7230 instanceof InterfaceC4872)) {
            StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
            return false;
        }
        if (interfaceC72302 instanceof InterfaceC4872) {
            return interfaceC7230.equals(interfaceC72302);
        }
        StringBuilder sbM45532 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC72302, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC72302.getClass(), sbM45532));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9703(int i) {
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
    public static AbstractC4913 m9704(InterfaceC4852 interfaceC4852, InterfaceC7229 interfaceC7229) {
        interfaceC7229.getClass();
        if (interfaceC4852.mo9627(interfaceC7229)) {
            return null;
        }
        if (interfaceC7229 instanceof AbstractC4869) {
            return ((AbstractC4869) interfaceC7229).mo9751().mo9778();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7229);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7229.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static AbstractC4881 m9705(InterfaceC7227 interfaceC7227) {
        interfaceC7227.getClass();
        if (interfaceC7227 instanceof InterfaceC4462) {
            return AbstractC7738.m13032((InterfaceC4462) interfaceC7227);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7227);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7227.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static TypeVariance m9706(InterfaceC7227 interfaceC7227) {
        if (interfaceC7227 instanceof InterfaceC4462) {
            Variance varianceMo9013 = ((InterfaceC4462) interfaceC7227).mo9013();
            varianceMo9013.getClass();
            return AbstractC8174.m13605(varianceMo9013);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7227);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7227.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m9707(InterfaceC7219 interfaceC7219, C4686 c4686) {
        interfaceC7219.getClass();
        c4686.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return ((AbstractC4881) interfaceC7219).getAnnotations().mo9528(c4686);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static InterfaceC4462 m9708(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            InterfaceC4476 interfaceC4476Mo9221 = ((InterfaceC4872) interfaceC7230).mo9221();
            if (interfaceC4476Mo9221 instanceof InterfaceC4462) {
                return (InterfaceC4462) interfaceC4476Mo9221;
            }
            return null;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static TypeVariance m9709(InterfaceC7229 interfaceC7229) {
        interfaceC7229.getClass();
        if (interfaceC7229 instanceof AbstractC4869) {
            Variance varianceMo9752 = ((AbstractC4869) interfaceC7229).mo9752();
            varianceMo9752.getClass();
            return AbstractC8174.m13605(varianceMo9752);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7229);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7229.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String m9710(InterfaceC4872 interfaceC4872) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + interfaceC4872);
        sb.append('\n');
        sb.append("hashCode: " + interfaceC4872.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + interfaceC4872.getClass().getCanonicalName());
        sb.append('\n');
        for (InterfaceC4498 interfaceC4498Mo9221 = interfaceC4872.mo9221(); interfaceC4498Mo9221 != null; interfaceC4498Mo9221 = interfaceC4498Mo9221.mo9038()) {
            sb.append("fqName: ".concat(C4743.f13886.m9483(interfaceC4498Mo9221)));
            sb.append('\n');
            sb.append("javaClass: " + interfaceC4498Mo9221.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static AbstractC4913 m9711(InterfaceC4852 interfaceC4852, InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        interfaceC7218.getClass();
        interfaceC72182.getClass();
        if (!(interfaceC7218 instanceof AbstractC4877)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC4852);
            sb.append(", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC4852.getClass(), sb));
            return null;
        }
        if (interfaceC72182 instanceof AbstractC4877) {
            return AbstractC4892.m9815((AbstractC4877) interfaceC7218, (AbstractC4877) interfaceC72182);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC4852);
        sb2.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC4852.getClass(), sb2));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC7227 m9712(InterfaceC7230 interfaceC7230, int i) {
        if (interfaceC7230 instanceof InterfaceC4872) {
            Object obj = ((InterfaceC4872) interfaceC7230).getParameters().get(i);
            obj.getClass();
            return (InterfaceC7227) obj;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static List m9713(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            List parameters = ((InterfaceC4872) interfaceC7230).getParameters();
            parameters.getClass();
            return parameters;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static InterfaceC7229 m9714(InterfaceC7219 interfaceC7219, int i) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return (InterfaceC7229) ((AbstractC4881) interfaceC7219).mo9736().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static List m9715(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            return ((AbstractC4881) interfaceC7219).mo9736();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC4877 m9716(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            AbstractC4913 abstractC4913Mo9778 = ((AbstractC4881) interfaceC7219).mo9778();
            if (abstractC4913Mo9778 instanceof AbstractC4877) {
                return (AbstractC4877) abstractC4913Mo9778;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC4895 m9717(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4881) {
            AbstractC4913 abstractC4913Mo9778 = ((AbstractC4881) interfaceC7219).mo9778();
            if (abstractC4913Mo9778 instanceof AbstractC4895) {
                return (AbstractC4895) abstractC4913Mo9778;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static CaptureStatus m9718(InterfaceC7222 interfaceC7222) {
        if (interfaceC7222 instanceof C4863) {
            return ((C4863) interfaceC7222).f14151;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7222);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7222.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C4871 m9719(boolean z, C4857 c4857, C4849 c4849, int i) {
        if ((i & 4) != 0) {
            c4857 = C4857.f14136;
        }
        C4857 c48572 = c4857;
        if ((i & 8) != 0) {
            c4849 = C4849.f14128;
        }
        return new C4871(z, true, true, c48572, c4849, C4848.f14127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4884 m9720(InterfaceC7219 interfaceC7219) {
        if (interfaceC7219 instanceof AbstractC4881) {
            return new C4884((AbstractC4881) interfaceC7219);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC4877 m9721(InterfaceC7218 interfaceC7218, CaptureStatus captureStatus) {
        List listMo9736;
        ArrayList arrayList;
        C4849 c4849;
        CaptureStatus captureStatus2;
        captureStatus.getClass();
        C4864 c4864 = null;
        if (!(interfaceC7218 instanceof AbstractC4877)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7218);
            sb.append(", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
            return null;
        }
        AbstractC4877 abstractC4877 = (AbstractC4877) interfaceC7218;
        if (abstractC4877.mo9736().size() == abstractC4877.mo9732().getParameters().size() && ((listMo9736 = abstractC4877.mo9736()) == null || !listMo9736.isEmpty())) {
            Iterator it = listMo9736.iterator();
            while (it.hasNext()) {
                if (((AbstractC4869) it.next()).mo9752() != Variance.INVARIANT) {
                    List parameters = abstractC4877.mo9732().getParameters();
                    parameters.getClass();
                    ArrayList<Pair> arrayListM8797 = AbstractC4343.m8797(listMo9736, parameters);
                    arrayList = new ArrayList(AbstractC4344.m8832(arrayListM8797, 10));
                    for (Pair pair : arrayListM8797) {
                        AbstractC4869 c4884 = (AbstractC4869) pair.component1();
                        InterfaceC4462 interfaceC4462 = (InterfaceC4462) pair.component2();
                        if (c4884.mo9752() == Variance.INVARIANT) {
                            captureStatus2 = captureStatus;
                        } else {
                            AbstractC4913 abstractC4913Mo9778 = (c4884.mo9750() || c4884.mo9752() != Variance.IN_VARIANCE) ? null : c4884.mo9751().mo9778();
                            interfaceC4462.getClass();
                            captureStatus2 = captureStatus;
                            c4884 = new C4884(new C4863(captureStatus2, new C4861(c4884, c4864, interfaceC4462, 6), abstractC4913Mo9778, (C4873) null, false, 56));
                        }
                        arrayList.add(c4884);
                        captureStatus = captureStatus2;
                    }
                    C4918 c4918 = new C4918(AbstractC4868.f14159.m9802(abstractC4877.mo9732(), arrayList));
                    int size = listMo9736.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC4869 abstractC4869 = (AbstractC4869) listMo9736.get(i);
                        AbstractC4869 abstractC48692 = (AbstractC4869) arrayList.get(i);
                        if (abstractC4869.mo9752() != Variance.INVARIANT) {
                            List upperBounds = ((InterfaceC4462) abstractC4877.mo9732().getParameters().get(i)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                c4849 = C4849.f14128;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(c4849.mo9599(c4918.m9867((AbstractC4881) it2.next(), Variance.INVARIANT).mo9778()));
                            }
                            if (!abstractC4869.mo9750() && abstractC4869.mo9752() == Variance.OUT_VARIANCE) {
                                arrayList2.add(c4849.mo9599(abstractC4869.mo9751().mo9778()));
                            }
                            AbstractC4881 abstractC4881Mo9751 = abstractC48692.mo9751();
                            abstractC4881Mo9751.getClass();
                            C4861 c4861 = ((C4863) abstractC4881Mo9751).f14152;
                            c4861.getClass();
                            c4861.f14142 = new C4864(1, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return AbstractC4892.m9824(arrayList, abstractC4877.mo9733(), abstractC4877.mo9732(), abstractC4877.mo9735());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static InterfaceC7219 m9722(InterfaceC4852 interfaceC4852, InterfaceC7219 interfaceC7219) {
        if (interfaceC7219 instanceof InterfaceC7218) {
            return interfaceC4852.mo9605((InterfaceC7218) interfaceC7219);
        }
        if (interfaceC7219 instanceof InterfaceC7220) {
            InterfaceC7220 interfaceC7220 = (InterfaceC7220) interfaceC7219;
            return interfaceC4852.mo9602(interfaceC4852.mo9605((InterfaceC7218) interfaceC4852.mo9604(interfaceC7220)), interfaceC4852.mo9605((InterfaceC7218) interfaceC4852.mo9603(interfaceC7220)));
        }
        C5919.m11250("sealed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC4877 m9723(InterfaceC7218 interfaceC7218, boolean z) {
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof AbstractC4877) {
            return ((AbstractC4877) interfaceC7218).mo9741(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static C4853 m9724(InterfaceC4852 interfaceC4852, InterfaceC7218 interfaceC7218) {
        if (interfaceC7218 instanceof AbstractC4877) {
            AbstractC4881 abstractC4881 = (AbstractC4881) interfaceC7218;
            return new C4853(interfaceC4852, new C4918(AbstractC4868.f14159.m9802(abstractC4881.mo9732(), abstractC4881.mo9736())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static AbstractC4881 m9725(C4918 c4918, InterfaceC7219 interfaceC7219) {
        c4918.getClass();
        interfaceC7219.getClass();
        if (interfaceC7219 instanceof AbstractC4913) {
            return c4918.m9867((AbstractC4881) interfaceC7219, Variance.INVARIANT);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7219);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static C4861 m9726(InterfaceC7222 interfaceC7222) {
        if (interfaceC7222 instanceof C4863) {
            return ((C4863) interfaceC7222).f14152;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7222);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7222.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC4877 m9727(InterfaceC7220 interfaceC7220) {
        if (interfaceC7220 instanceof AbstractC4895) {
            return ((AbstractC4895) interfaceC7220).f14213;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7220);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7220.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static Collection m9728(InterfaceC7230 interfaceC7230) {
        interfaceC7230.getClass();
        if (interfaceC7230 instanceof InterfaceC4872) {
            Collection collectionMo9504 = ((InterfaceC4872) interfaceC7230).mo9504();
            collectionMo9504.getClass();
            return collectionMo9504;
        }
        StringBuilder sbM4553 = AbstractC2442.m4553("ClassicTypeSystemContext couldn't handle: ", interfaceC7230, ", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7230.getClass(), sbM4553));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static InterfaceC4872 m9729(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        if (interfaceC7218 instanceof AbstractC4877) {
            return ((AbstractC4877) interfaceC7218).mo9732();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7218);
        sb.append(", ");
        C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7218.getClass(), sb));
        return null;
    }
}
