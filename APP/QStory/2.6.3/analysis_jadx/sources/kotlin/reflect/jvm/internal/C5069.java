package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.AbstractC3065;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.renderer.C4733;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.text.AbstractC5139;
import net.bytebuddy.description.type.TypeDescription;
import p045.C6462;
import p049.AbstractC6526;
import p049.AbstractC6527;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5069 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m10082(InterfaceC5087 interfaceC5087, boolean z) throws IOException {
        C4686 c4686;
        interfaceC5087.getClass();
        AbstractC4926 abstractC4926 = (AbstractC4926) interfaceC5087;
        int i = 1;
        if (abstractC4926.mo9919()) {
            AbstractC4926 abstractC4926Mo9916 = abstractC4926.mo9916();
            abstractC4926Mo9916.getClass();
            return m10082(abstractC4926Mo9916, true);
        }
        AbstractC4926 abstractC4926Mo99162 = abstractC4926.mo9916();
        AbstractC4926 abstractC4926Mo9913 = abstractC4926.mo9913();
        if (abstractC4926Mo99162 != null && abstractC4926Mo9913 != null) {
            String strM10089 = m10089(abstractC4926Mo99162);
            String strM100892 = m10089(abstractC4926Mo9913);
            if (AbstractC4395.m8907(strM10089, AbstractC5139.m10137(strM100892, TypeDescription.Generic.OfWildcardType.SYMBOL, ""))) {
                return AbstractC5139.m10137(strM100892, TypeDescription.Generic.OfWildcardType.SYMBOL, "!");
            }
            if (strM100892.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                if ((strM10089 + '?').equals(strM100892)) {
                    return strM10089 + '!';
                }
            }
            if (("(" + strM10089 + ")?").equals(strM100892)) {
                return AbstractC0053.m158("(", strM10089, ")!");
            }
            String strM6814 = AbstractC3065.m6814(strM10089, strM100892, new C5076(strM10089, 0), new C5076(strM10089, i), C4733.f13818);
            if (strM6814 != null) {
                return strM6814;
            }
            return "(" + strM10089 + ".." + strM100892 + ')';
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5087 interfaceC5087Mo9918 = abstractC4926.mo9918();
        if (interfaceC5087Mo9918 != null) {
            sb.append(interfaceC5087Mo9918);
            sb.append(" /* = ");
        }
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        if (interfaceC5092Mo8899 instanceof AbstractC4394) {
            m10086(sb, ((AbstractC4394) interfaceC5092Mo8899).mo8901());
            if (interfaceC5087.mo8896()) {
                sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
            } else if (abstractC4926.mo9922()) {
                sb.append(" & Any");
            }
        } else if (interfaceC5092Mo8899 instanceof InterfaceC5093) {
            InterfaceC5093 interfaceC5093 = (InterfaceC5093) interfaceC5092Mo8899;
            if (abstractC4926.mo9920()) {
                c4686 = AbstractC6527.f17884;
            } else {
                InterfaceC5093 interfaceC5093Mo9921 = abstractC4926.mo9921();
                if (interfaceC5093Mo9921 == null) {
                    interfaceC5093Mo9921 = interfaceC5093;
                }
                String strMo8885 = interfaceC5093Mo9921.mo8885();
                c4686 = strMo8885 != null ? new C4686(strMo8885) : null;
            }
            if (c4686 == null) {
                c4686 = new C4686(((C5004) interfaceC5093).f14424.getName());
            }
            if (c4686.m9317(AbstractC6526.f17852) && AbstractC4395.m8907(AbstractC2905.m6315(c4686), C6462.f17734) && !interfaceC5087.mo8898().contains(C5085.f14636)) {
                if (abstractC4926.mo8896()) {
                    sb.append("(");
                }
                if (abstractC4926.mo9917()) {
                    sb.append("suspend ");
                }
                AbstractC4344.m8809(AbstractC4344.m8801(1, abstractC4926.mo8898()), sb, null, "(", ") -> ", null, 114);
                sb.append(AbstractC4344.m8808(abstractC4926.mo8898()));
                if (abstractC4926.mo8896()) {
                    sb.append(")?");
                }
            } else {
                m10083(sb, interfaceC5093, c4686, interfaceC5087.mo8898(), interfaceC5087.mo8896(), z);
            }
        } else if (interfaceC5092Mo8899 instanceof C4988) {
            C4686 c46862 = ((C4988) interfaceC5092Mo8899).f14393.f13696;
            c46862.getClass();
            AbstractC4344.m8809(C4686.m9311(c46862), sb, ".", null, null, C5016.f14455, 60);
            sb = sb;
            m10088(sb, interfaceC5087.mo8898(), interfaceC5087.mo8896(), z);
        } else {
            sb.append("???");
        }
        if (abstractC4926.mo9918() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m10083(StringBuilder sb, InterfaceC5093 interfaceC5093, C4686 c4686, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (interfaceC5093.getTypeParameters().size() >= list.size() || AbstractC3057.m6756(interfaceC5093).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(AbstractC3065.m6813(C4686.m9311(c4686)));
        } else {
            Class<?> declaringClass = AbstractC3057.m6756(interfaceC5093).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z3 = z2;
            m10083(sb2, AbstractC4396.f12975.mo8917(declaringClass), c4686.m9312(), AbstractC4344.m8805(interfaceC5093.getTypeParameters().size(), list), false, z3);
            sb2.append(".");
            sb2.append(AbstractC3065.m6815(c4686.m9318()));
        }
        m10088(sb2, AbstractC4344.m8799(interfaceC5093.getTypeParameters().size(), list), z, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10084(InterfaceC5110 interfaceC5110) throws IOException {
        StringBuilder sb = new StringBuilder();
        m10087(sb, interfaceC5110);
        sb.append("fun ");
        m10085(sb, interfaceC5110);
        m10086(sb, interfaceC5110.getName());
        AbstractC4344.m8809(AbstractC4406.m8934(interfaceC5110), sb, ", ", "(", ")", C5016.f14453, 48);
        sb.append(": ");
        sb.append(m10082(interfaceC5110.getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m10085(StringBuilder sb, InterfaceC5094 interfaceC5094) {
        List listMo9961 = ((InterfaceC5064) interfaceC5094).mo9961();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo9961) {
            InterfaceC5108 interfaceC5108 = (InterfaceC5108) obj;
            if (interfaceC5108.getKind() == KParameter$Kind.INSTANCE || interfaceC5108.getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        InterfaceC5108 interfaceC51082 = (InterfaceC5108) AbstractC4344.m8818(0, arrayList);
        if (interfaceC51082 != null) {
            sb.append(m10082(interfaceC51082.getType(), false));
            sb.append(".");
        }
        InterfaceC5108 interfaceC51083 = (InterfaceC5108) AbstractC4344.m8818(1, arrayList);
        if (interfaceC51083 != null) {
            sb.append("(");
            sb.append(m10082(interfaceC51083.getType(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10086(StringBuilder sb, String str) {
        sb.append(AbstractC3065.m6815(C4691.m9330(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10087(StringBuilder sb, InterfaceC5094 interfaceC5094) throws IOException {
        List parameters = interfaceC5094.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5108) obj).getKind() == KParameter$Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC4344.m8809(arrayList, sb, null, "context(", ") ", C5016.f14454, 50);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m10088(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            AbstractC4344.m8809(list, sb2, null, "<", ">", new C5079(z2), 50);
        }
        if (z) {
            sb2.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ String m10089(InterfaceC5087 interfaceC5087) {
        return m10082(interfaceC5087, false);
    }
}
