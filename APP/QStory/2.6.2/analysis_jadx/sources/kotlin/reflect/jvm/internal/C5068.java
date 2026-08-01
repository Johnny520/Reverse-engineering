package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.C4732;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import kotlin.text.AbstractC5138;
import net.bytebuddy.description.type.TypeDescription;
import p033.AbstractC6325;
import p045.C6461;
import p049.AbstractC6525;
import p049.AbstractC6526;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5068 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m10078(InterfaceC5086 interfaceC5086, boolean z) throws IOException {
        C4685 c4685;
        interfaceC5086.getClass();
        AbstractC4925 abstractC4925 = (AbstractC4925) interfaceC5086;
        int i = 1;
        if (abstractC4925.mo9922()) {
            AbstractC4925 abstractC4925Mo9919 = abstractC4925.mo9919();
            abstractC4925Mo9919.getClass();
            return m10078(abstractC4925Mo9919, true);
        }
        AbstractC4925 abstractC4925Mo99192 = abstractC4925.mo9919();
        AbstractC4925 abstractC4925Mo9916 = abstractC4925.mo9916();
        if (abstractC4925Mo99192 != null && abstractC4925Mo9916 != null) {
            String strM10085 = m10085(abstractC4925Mo99192);
            String strM100852 = m10085(abstractC4925Mo9916);
            if (AbstractC4394.m8917(strM10085, AbstractC5138.m10128(strM100852, TypeDescription.Generic.OfWildcardType.SYMBOL, ""))) {
                return AbstractC5138.m10128(strM100852, TypeDescription.Generic.OfWildcardType.SYMBOL, "!");
            }
            if (strM100852.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                if ((strM10085 + '?').equals(strM100852)) {
                    return strM10085 + '!';
                }
            }
            if (("(" + strM10085 + ")?").equals(strM100852)) {
                return AbstractC0053.m156("(", strM10085, ")!");
            }
            String strM12016 = AbstractC6560.m12016(strM10085, strM100852, new C5075(strM10085, 0), new C5075(strM10085, i), C4732.f13814);
            if (strM12016 != null) {
                return strM12016;
            }
            return "(" + strM10085 + ".." + strM100852 + ')';
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5086 interfaceC5086Mo9921 = abstractC4925.mo9921();
        if (interfaceC5086Mo9921 != null) {
            sb.append(interfaceC5086Mo9921);
            sb.append(" /* = ");
        }
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        if (interfaceC5091Mo8909 instanceof AbstractC4393) {
            m10082(sb, ((AbstractC4393) interfaceC5091Mo8909).mo8911());
            if (interfaceC5086.mo8906()) {
                sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
            } else if (abstractC4925.mo9925()) {
                sb.append(" & Any");
            }
        } else if (interfaceC5091Mo8909 instanceof InterfaceC5092) {
            InterfaceC5092 interfaceC5092 = (InterfaceC5092) interfaceC5091Mo8909;
            if (abstractC4925.mo9923()) {
                c4685 = AbstractC6526.f17888;
            } else {
                InterfaceC5092 interfaceC5092Mo9924 = abstractC4925.mo9924();
                if (interfaceC5092Mo9924 == null) {
                    interfaceC5092Mo9924 = interfaceC5092;
                }
                String strMo8895 = interfaceC5092Mo9924.mo8895();
                c4685 = strMo8895 != null ? new C4685(strMo8895) : null;
            }
            if (c4685 == null) {
                c4685 = new C4685(((C5003) interfaceC5092).f14422.getName());
            }
            if (c4685.m9327(AbstractC6525.f17856) && AbstractC4394.m8917(AbstractC6325.m11868(c4685), C6461.f17738) && !interfaceC5086.mo8908().contains(C5084.f14636)) {
                if (abstractC4925.mo8906()) {
                    sb.append("(");
                }
                if (abstractC4925.mo9920()) {
                    sb.append("suspend ");
                }
                AbstractC4343.m8829(AbstractC4343.m8791(1, abstractC4925.mo8908()), sb, null, "(", ") -> ", null, 114);
                sb.append(AbstractC4343.m8811(abstractC4925.mo8908()));
                if (abstractC4925.mo8906()) {
                    sb.append(")?");
                }
            } else {
                m10079(sb, interfaceC5092, c4685, interfaceC5086.mo8908(), interfaceC5086.mo8906(), z);
            }
        } else if (interfaceC5091Mo8909 instanceof C4987) {
            C4685 c46852 = ((C4987) interfaceC5091Mo8909).f14391.f13692;
            c46852.getClass();
            AbstractC4343.m8829(C4685.m9321(c46852), sb, ".", null, null, C5015.f14453, 60);
            sb = sb;
            m10084(sb, interfaceC5086.mo8908(), interfaceC5086.mo8906(), z);
        } else {
            sb.append("???");
        }
        if (abstractC4925.mo9921() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m10079(StringBuilder sb, InterfaceC5092 interfaceC5092, C4685 c4685, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (interfaceC5092.getTypeParameters().size() >= list.size() || AbstractC6560.m12029(interfaceC5092).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(AbstractC6560.m12015(C4685.m9321(c4685)));
        } else {
            Class<?> declaringClass = AbstractC6560.m12029(interfaceC5092).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z3 = z2;
            m10079(sb2, AbstractC4395.f12971.mo8927(declaringClass), c4685.m9322(), AbstractC4343.m8792(interfaceC5092.getTypeParameters().size(), list), false, z3);
            sb2.append(".");
            sb2.append(AbstractC6560.m12017(c4685.m9328()));
        }
        m10084(sb2, AbstractC4343.m8816(interfaceC5092.getTypeParameters().size(), list), z, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10080(InterfaceC5109 interfaceC5109) throws IOException {
        StringBuilder sb = new StringBuilder();
        m10083(sb, interfaceC5109);
        sb.append("fun ");
        m10081(sb, interfaceC5109);
        m10082(sb, interfaceC5109.getName());
        AbstractC4343.m8829(AbstractC4405.m8944(interfaceC5109), sb, ", ", "(", ")", C5015.f14451, 48);
        sb.append(": ");
        sb.append(m10078(interfaceC5109.getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m10081(StringBuilder sb, InterfaceC5093 interfaceC5093) {
        List listMo9964 = ((InterfaceC5063) interfaceC5093).mo9964();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo9964) {
            InterfaceC5107 interfaceC5107 = (InterfaceC5107) obj;
            if (interfaceC5107.getKind() == KParameter$Kind.INSTANCE || interfaceC5107.getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        InterfaceC5107 interfaceC51072 = (InterfaceC5107) AbstractC4343.m8831(0, arrayList);
        if (interfaceC51072 != null) {
            sb.append(m10078(interfaceC51072.getType(), false));
            sb.append(".");
        }
        InterfaceC5107 interfaceC51073 = (InterfaceC5107) AbstractC4343.m8831(1, arrayList);
        if (interfaceC51073 != null) {
            sb.append("(");
            sb.append(m10078(interfaceC51073.getType(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10082(StringBuilder sb, String str) {
        sb.append(AbstractC6560.m12017(C4690.m9340(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10083(StringBuilder sb, InterfaceC5093 interfaceC5093) throws IOException {
        List parameters = interfaceC5093.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5107) obj).getKind() == KParameter$Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC4343.m8829(arrayList, sb, null, "context(", ") ", C5015.f14452, 50);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m10084(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            AbstractC4343.m8829(list, sb2, null, "<", ">", new C5078(z2), 50);
        }
        if (z) {
            sb2.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ String m10085(InterfaceC5086 interfaceC5086) {
        return m10078(interfaceC5086, false);
    }
}
