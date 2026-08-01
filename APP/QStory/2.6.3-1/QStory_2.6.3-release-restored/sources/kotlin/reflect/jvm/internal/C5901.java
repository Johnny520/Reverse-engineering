package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3897;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.renderer.C5565;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.text.AbstractC5971;
import net.bytebuddy.description.type.TypeDescription;
import p061.C7291;
import p065.AbstractC7355;
import p065.AbstractC7356;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5901 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m10641(InterfaceC5919 interfaceC5919, boolean z) throws IOException {
        C5518 c5518;
        interfaceC5919.getClass();
        AbstractC5758 abstractC5758 = (AbstractC5758) interfaceC5919;
        int i = 1;
        if (abstractC5758.mo10478()) {
            AbstractC5758 abstractC5758Mo10475 = abstractC5758.mo10475();
            abstractC5758Mo10475.getClass();
            return m10641(abstractC5758Mo10475, true);
        }
        AbstractC5758 abstractC5758Mo104752 = abstractC5758.mo10475();
        AbstractC5758 abstractC5758Mo10472 = abstractC5758.mo10472();
        if (abstractC5758Mo104752 != null && abstractC5758Mo10472 != null) {
            String strM10648 = m10648(abstractC5758Mo104752);
            String strM106482 = m10648(abstractC5758Mo10472);
            if (AbstractC5227.m9466(strM10648, AbstractC5971.m10696(strM106482, TypeDescription.Generic.OfWildcardType.SYMBOL, ""))) {
                return AbstractC5971.m10696(strM106482, TypeDescription.Generic.OfWildcardType.SYMBOL, "!");
            }
            if (strM106482.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                if ((strM10648 + '?').equals(strM106482)) {
                    return strM10648 + '!';
                }
            }
            if (("(" + strM10648 + ")?").equals(strM106482)) {
                return AbstractC0900.m718("(", strM10648, ")!");
            }
            String strM7374 = AbstractC3897.m7374(strM10648, strM106482, new C5908(strM10648, 0), new C5908(strM10648, i), C5565.f14163);
            if (strM7374 != null) {
                return strM7374;
            }
            return "(" + strM10648 + ".." + strM106482 + ')';
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5919 interfaceC5919Mo10477 = abstractC5758.mo10477();
        if (interfaceC5919Mo10477 != null) {
            sb.append(interfaceC5919Mo10477);
            sb.append(" /* = ");
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 instanceof AbstractC5226) {
            m10645(sb, ((AbstractC5226) interfaceC5924Mo9458).mo9460());
            if (interfaceC5919.mo9455()) {
                sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
            } else if (abstractC5758.mo10481()) {
                sb.append(" & Any");
            }
        } else if (interfaceC5924Mo9458 instanceof InterfaceC5925) {
            InterfaceC5925 interfaceC5925 = (InterfaceC5925) interfaceC5924Mo9458;
            if (abstractC5758.mo10479()) {
                c5518 = AbstractC7356.f18229;
            } else {
                InterfaceC5925 interfaceC5925Mo10480 = abstractC5758.mo10480();
                if (interfaceC5925Mo10480 == null) {
                    interfaceC5925Mo10480 = interfaceC5925;
                }
                String strMo9444 = interfaceC5925Mo10480.mo9444();
                c5518 = strMo9444 != null ? new C5518(strMo9444) : null;
            }
            if (c5518 == null) {
                c5518 = new C5518(((C5836) interfaceC5925).f14769.getName());
            }
            if (c5518.m9876(AbstractC7355.f18197) && AbstractC5227.m9466(AbstractC3738.m6875(c5518), C7291.f18079) && !interfaceC5919.mo9457().contains(C5917.f14981)) {
                if (abstractC5758.mo9455()) {
                    sb.append("(");
                }
                if (abstractC5758.mo10476()) {
                    sb.append("suspend ");
                }
                AbstractC5176.m9368(AbstractC5176.m9360(1, abstractC5758.mo9457()), sb, null, "(", ") -> ", null, 114);
                sb.append(AbstractC5176.m9367(abstractC5758.mo9457()));
                if (abstractC5758.mo9455()) {
                    sb.append(")?");
                }
            } else {
                m10642(sb, interfaceC5925, c5518, interfaceC5919.mo9457(), interfaceC5919.mo9455(), z);
            }
        } else if (interfaceC5924Mo9458 instanceof C5820) {
            C5518 c55182 = ((C5820) interfaceC5924Mo9458).f14738.f14041;
            c55182.getClass();
            AbstractC5176.m9368(C5518.m9870(c55182), sb, ".", null, null, C5848.f14800, 60);
            sb = sb;
            m10647(sb, interfaceC5919.mo9457(), interfaceC5919.mo9455(), z);
        } else {
            sb.append("???");
        }
        if (abstractC5758.mo10477() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m10642(StringBuilder sb, InterfaceC5925 interfaceC5925, C5518 c5518, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (interfaceC5925.getTypeParameters().size() >= list.size() || AbstractC3889.m7316(interfaceC5925).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(AbstractC3897.m7373(C5518.m9870(c5518)));
        } else {
            Class<?> declaringClass = AbstractC3889.m7316(interfaceC5925).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z3 = z2;
            m10642(sb2, AbstractC5228.f13320.mo9476(declaringClass), c5518.m9871(), AbstractC5176.m9364(interfaceC5925.getTypeParameters().size(), list), false, z3);
            sb2.append(".");
            sb2.append(AbstractC3897.m7375(c5518.m9877()));
        }
        m10647(sb2, AbstractC5176.m9358(interfaceC5925.getTypeParameters().size(), list), z, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10643(InterfaceC5942 interfaceC5942) throws IOException {
        StringBuilder sb = new StringBuilder();
        m10646(sb, interfaceC5942);
        sb.append("fun ");
        m10644(sb, interfaceC5942);
        m10645(sb, interfaceC5942.getName());
        AbstractC5176.m9368(AbstractC5238.m9493(interfaceC5942), sb, ", ", "(", ")", C5848.f14798, 48);
        sb.append(": ");
        sb.append(m10641(interfaceC5942.getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m10644(StringBuilder sb, InterfaceC5926 interfaceC5926) {
        List listMo10520 = ((InterfaceC5896) interfaceC5926).mo10520();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo10520) {
            InterfaceC5940 interfaceC5940 = (InterfaceC5940) obj;
            if (interfaceC5940.getKind() == KParameter$Kind.INSTANCE || interfaceC5940.getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        InterfaceC5940 interfaceC59402 = (InterfaceC5940) AbstractC5176.m9377(0, arrayList);
        if (interfaceC59402 != null) {
            sb.append(m10641(interfaceC59402.getType(), false));
            sb.append(".");
        }
        InterfaceC5940 interfaceC59403 = (InterfaceC5940) AbstractC5176.m9377(1, arrayList);
        if (interfaceC59403 != null) {
            sb.append("(");
            sb.append(m10641(interfaceC59403.getType(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10645(StringBuilder sb, String str) {
        sb.append(AbstractC3897.m7375(C5523.m9889(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10646(StringBuilder sb, InterfaceC5926 interfaceC5926) throws IOException {
        List parameters = interfaceC5926.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5940) obj).getKind() == KParameter$Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC5176.m9368(arrayList, sb, null, "context(", ") ", C5848.f14799, 50);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m10647(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            AbstractC5176.m9368(list, sb2, null, "<", ">", new C5911(z2), 50);
        }
        if (z) {
            sb2.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ String m10648(InterfaceC5919 interfaceC5919) {
        return m10641(interfaceC5919, false);
    }
}
