package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.collection.C1123;
import androidx.compose.runtime.C2157;
import androidx.core.view.C3075;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3897;
import io.ktor.util.C5043;
import io.ktor.websocket.C5098;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5299;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5587;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5585;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5588;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5596;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5712;
import kotlin.reflect.jvm.internal.impl.types.C5715;
import kotlin.reflect.jvm.internal.impl.types.C5727;
import kotlin.reflect.jvm.internal.impl.types.C5738;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p062.InterfaceC7308;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.AbstractC7838;
import p095.C7808;
import p095.C7819;
import p095.C7820;
import p095.C7833;
import p095.C7835;
import p095.C7840;
import p095.C7847;
import p114.C8067;
import p114.C8068;
import p114.C8069;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5576 implements InterfaceC5574 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f14232 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5576 f14233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5576 f14234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5576 f14235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14236 = AbstractC6019.m10773(new C2157(this, 5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5575 f14237;

    static {
        C5575 c5575 = new C5575();
        c5575.mo9989(EmptySet.INSTANCE);
        c5575.f14211 = true;
        new C5576(c5575);
        C5575 c55752 = new C5575();
        c55752.mo9996();
        c55752.f14211 = true;
        new C5576(c55752);
        C5575 c55753 = new C5575();
        c55753.mo9996();
        c55753.mo9989(EmptySet.INSTANCE);
        c55753.f14211 = true;
        new C5576(c55753);
        C5575 c55754 = new C5575();
        c55754.mo9996();
        c55754.mo9989(EmptySet.INSTANCE);
        c55754.mo9993();
        c55754.f14211 = true;
        new C5576(c55754);
        C5575 c55755 = new C5575();
        c55755.mo9989(EmptySet.INSTANCE);
        C5569 c5569 = C5569.f14173;
        c55755.mo9994(c5569);
        c55755.mo9988(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c55755.f14211 = true;
        new C5576(c55755);
        C5575 c55756 = new C5575();
        c55756.mo9996();
        c55756.mo9989(EmptySet.INSTANCE);
        c55756.mo9994(c5569);
        c55756.mo9995();
        c55756.mo9988(ParameterNameRenderingPolicy.NONE);
        c55756.mo9992();
        c55756.mo9990();
        c55756.mo9993();
        c55756.mo9999();
        c55756.f14211 = true;
        new C5576(c55756);
        C5575 c55757 = new C5575();
        c55757.mo9989(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        c55757.f14211 = true;
        f14235 = new C5576(c55757);
        C5575 c55758 = new C5575();
        c55758.mo9989(DescriptorRendererModifier.ALL);
        c55758.f14211 = true;
        new C5576(c55758);
        C5575 c55759 = new C5575();
        c55759.mo9994(c5569);
        c55759.mo9988(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c55759.f14211 = true;
        f14234 = new C5576(c55759);
        C5575 c557510 = new C5575();
        c557510.mo9991();
        c557510.mo9994(C5569.f14174);
        c557510.mo9989(DescriptorRendererModifier.ALL);
        c557510.f14211 = true;
        f14233 = new C5576(c557510);
        C5575 c557511 = new C5575();
        c557511.mo9998(RenderingFormat.HTML);
        c557511.mo9989(DescriptorRendererModifier.ALL);
        c557511.f14211 = true;
        new C5576(c557511);
    }

    public C5576(C5575 c5575) {
        this.f14237 = c5575;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static Modality m10003(InterfaceC5319 interfaceC5319) {
        if (interfaceC5319 instanceof AbstractC7818) {
            return ((AbstractC7818) interfaceC5319).mo9569() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5319.mo9587();
        AbstractC7818 abstractC7818 = interfaceC5331Mo9587 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331Mo9587 : null;
        if (abstractC7818 == null) {
            return Modality.FINAL;
        }
        if (!(interfaceC5319 instanceof InterfaceC5312)) {
            return Modality.FINAL;
        }
        InterfaceC5312 interfaceC5312 = (InterfaceC5312) interfaceC5319;
        Collection collectionMo9589 = interfaceC5312.mo9589();
        collectionMo9589.getClass();
        if (!collectionMo9589.isEmpty() && abstractC7818.mo9568() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (abstractC7818.mo9569() != ClassKind.INTERFACE || AbstractC5227.m9466(interfaceC5312.getVisibility(), AbstractC5321.f13465)) {
            return Modality.FINAL;
        }
        Modality modalityMo9568 = interfaceC5312.mo9568();
        Modality modality = Modality.ABSTRACT;
        return modalityMo9568 == modality ? modality : Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m10004(C5576 c5576, InterfaceC5305 interfaceC5305, StringBuilder sb) {
        boolean zM10036 = c5576.m10036();
        C5575 c5575 = c5576.f14237;
        if (!zM10036) {
            C5098 c5098 = c5575.f14225;
            InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
            InterfaceC5920 interfaceC5920 = interfaceC5920Arr[5];
            c5098.getClass();
            interfaceC5920.getClass();
            if (!((Boolean) c5098.f13151).booleanValue()) {
                List listMo9596 = interfaceC5305.mo9596();
                listMo9596.getClass();
                c5576.m10020(listMo9596, sb);
                if (c5576.m10035().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    c5576.m10023(sb, interfaceC5305, null);
                    C7840 c7840Mo9583 = interfaceC5305.mo9583();
                    if (c7840Mo9583 != null) {
                        c5576.m10023(sb, c7840Mo9583, AnnotationUseSiteTarget.FIELD);
                    }
                    C7840 c7840Mo9580 = interfaceC5305.mo9580();
                    if (c7840Mo9580 != null) {
                        c5576.m10023(sb, c7840Mo9580, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    C5098 c50982 = c5575.f14202;
                    InterfaceC5920 interfaceC59202 = interfaceC5920Arr[32];
                    c50982.getClass();
                    interfaceC59202.getClass();
                    if (((PropertyAccessorRenderingPolicy) c50982.f13151) == PropertyAccessorRenderingPolicy.NONE) {
                        C7820 getter = interfaceC5305.getGetter();
                        if (getter != null) {
                            c5576.m10023(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        C7819 setter = interfaceC5305.getSetter();
                        if (setter != null) {
                            c5576.m10023(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List listMo9594 = setter.mo9594();
                            listMo9594.getClass();
                            InterfaceC5288 interfaceC5288 = (InterfaceC5288) AbstractC5176.m9338(listMo9594);
                            interfaceC5288.getClass();
                            c5576.m10023(sb, interfaceC5288, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                C5322 visibility = interfaceC5305.getVisibility();
                visibility.getClass();
                c5576.m10040(visibility, sb);
                c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.CONST) && interfaceC5305.isConst(), "const");
                c5576.m10016(interfaceC5305, sb);
                c5576.m10018(interfaceC5305, sb);
                c5576.m10012(interfaceC5305, sb);
                c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.LATEINIT) && interfaceC5305.mo9556(), "lateinit");
                c5576.m10024(interfaceC5305, sb);
            }
            c5576.m10043(interfaceC5305, sb, false);
            List typeParameters = interfaceC5305.getTypeParameters();
            typeParameters.getClass();
            c5576.m10044(sb, typeParameters, true);
            c5576.m10007(interfaceC5305, sb);
        }
        c5576.m10014(interfaceC5305, sb, true);
        sb.append(": ");
        AbstractC5714 type = interfaceC5305.getType();
        type.getClass();
        sb.append(c5576.m10045(type));
        c5576.m10008(interfaceC5305, sb);
        c5576.m10026(interfaceC5305, sb);
        List typeParameters2 = interfaceC5305.getTypeParameters();
        typeParameters2.getClass();
        c5576.m10039(typeParameters2, sb);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m10005(AbstractC5714 abstractC5714) {
        if (!AbstractC3738.m6862(abstractC5714)) {
            return false;
        }
        List listMo10285 = abstractC5714.mo10285();
        if (listMo10285 != null && listMo10285.isEmpty()) {
            return true;
        }
        Iterator it = listMo10285.iterator();
        while (it.hasNext()) {
            if (((AbstractC5702) it.next()).mo10299()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m10006(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m10007(InterfaceC5312 interfaceC5312, StringBuilder sb) {
        C7835 c7835Mo9591 = interfaceC5312.mo9591();
        if (c7835Mo9591 != null) {
            m10023(sb, c7835Mo9591, AnnotationUseSiteTarget.RECEIVER);
            AbstractC5714 type = c7835Mo9591.getType();
            type.getClass();
            sb.append(m10027(type, false));
            sb.append(".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m10008(InterfaceC5312 interfaceC5312, StringBuilder sb) {
        C7835 c7835Mo9591;
        C5098 c5098 = this.f14237.f14204;
        InterfaceC5920 interfaceC5920 = C5575.f14181[30];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue() && (c7835Mo9591 = interfaceC5312.mo9591()) != null) {
            sb.append(" on ");
            AbstractC5714 type = c7835Mo9591.getType();
            type.getClass();
            sb.append(m10045(type));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m10009(StringBuilder sb, AbstractC5714 abstractC5714) throws IOException {
        C5523 c5523M6884;
        String strM10037;
        boolean z = abstractC5714 instanceof C5712;
        C5575 c5575 = this.f14237;
        if (z && c5575.m10001() && !((C5712) abstractC5714).f14530.m10134()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            sb.append(((AbstractC5728) abstractC5746Mo10331).mo10394(this, this));
            return;
        }
        if (!(abstractC5746Mo10331 instanceof AbstractC5710)) {
            C5043.m9170();
            return;
        }
        AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5746Mo10331;
        if (abstractC5710.equals(AbstractC5749.f14591) || abstractC5710.mo10281() == AbstractC5749.f14592.f19629) {
            sb.append("???");
            return;
        }
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5710.mo10281();
        int i = 0;
        if ((interfaceC5705Mo10281 instanceof C8067) && ((C8067) interfaceC5705Mo10281).f19623 == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
            C5098 c5098 = c5575.f14212;
            InterfaceC5920 interfaceC5920 = C5575.f14181[18];
            c5098.getClass();
            interfaceC5920.getClass();
            if (!((Boolean) c5098.f13151).booleanValue()) {
                sb.append("???");
                return;
            }
            InterfaceC5705 interfaceC5705Mo102812 = abstractC5710.mo10281();
            interfaceC5705Mo102812.getClass();
            sb.append(m10029(((C8067) interfaceC5705Mo102812).f19621[0]));
            return;
        }
        if (AbstractC5725.m10388(abstractC5710)) {
            m10019(sb, abstractC5710);
            return;
        }
        if (!m10005(abstractC5710)) {
            m10019(sb, abstractC5710);
            return;
        }
        int length = sb.length();
        ((C5576) this.f14236.getValue()).m10023(sb, abstractC5710, null);
        boolean z2 = sb.length() != length;
        AbstractC5714 abstractC5714M6860 = AbstractC3738.m6860(abstractC5710);
        List listM6878 = AbstractC3738.m6878(abstractC5710);
        boolean zM6851 = AbstractC3738.m6851(abstractC5710);
        boolean zMo10284 = abstractC5710.mo10284();
        boolean z3 = zMo10284 || (z2 && abstractC5714M6860 != null);
        if (z3) {
            if (zM6851) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    AbstractC8568.m13623(AbstractC5976.m10727(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        m10017(sb, zM6851, "suspend");
        if (!listM6878.isEmpty()) {
            sb.append("context(");
            Iterator it = listM6878.subList(0, listM6878.size() - 1).iterator();
            while (it.hasNext()) {
                m10010(sb, (AbstractC5714) it.next());
                sb.append(", ");
            }
            m10010(sb, (AbstractC5714) AbstractC5176.m9367(listM6878));
            sb.append(") ");
        }
        if (abstractC5714M6860 != null) {
            boolean z4 = (m10005(abstractC5714M6860) && !abstractC5714M6860.mo10284()) || AbstractC3738.m6851(abstractC5714M6860) || !abstractC5714M6860.getAnnotations().isEmpty() || (abstractC5714M6860 instanceof C5738);
            if (z4) {
                sb.append("(");
            }
            m10010(sb, abstractC5714M6860);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AbstractC3738.m6862(abstractC5710) || abstractC5710.getAnnotations().mo10076(AbstractC7356.f18242) == null || abstractC5710.mo10285().size() > 1) {
            int i2 = 0;
            for (AbstractC5702 abstractC5702 : AbstractC3738.m6866(abstractC5710)) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append(", ");
                }
                C5098 c50982 = c5575.f14182;
                InterfaceC5920 interfaceC59202 = C5575.f14181[45];
                c50982.getClass();
                interfaceC59202.getClass();
                if (((Boolean) c50982.f13151).booleanValue()) {
                    AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
                    abstractC5714Mo10300.getClass();
                    c5523M6884 = AbstractC3738.m6884(abstractC5714Mo10300);
                } else {
                    c5523M6884 = null;
                }
                if (c5523M6884 != null) {
                    sb.append(m10013(c5523M6884, false));
                    sb.append(": ");
                }
                abstractC5702.getClass();
                StringBuilder sb2 = new StringBuilder();
                AbstractC5176.m9368(AbstractC7176.m12487(abstractC5702), sb2, ", ", null, null, new C5564(this, i), 60);
                sb.append(sb2.toString());
                i2 = i3;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int i4 = AbstractC5572.f14179[m10031().ordinal()];
        if (i4 == 1) {
            strM10037 = m10037("->");
        } else {
            if (i4 != 2) {
                C5043.m9170();
                return;
            }
            strM10037 = "&rarr;";
        }
        sb.append(strM10037);
        sb.append(" ");
        AbstractC3738.m6862(abstractC5710);
        AbstractC5714 abstractC5714Mo103002 = ((AbstractC5702) AbstractC5176.m9367(abstractC5710.mo10285())).mo10300();
        abstractC5714Mo103002.getClass();
        m10010(sb, abstractC5714Mo103002);
        if (z3) {
            sb.append(")");
        }
        if (zMo10284) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m10010(StringBuilder sb, AbstractC5714 abstractC5714) {
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        C5727 c5727 = abstractC5746Mo10331 instanceof C5727 ? (C5727) abstractC5746Mo10331 : null;
        if (c5727 == null) {
            m10009(sb, abstractC5714);
            return;
        }
        AbstractC5710 abstractC5710 = c5727.f14560;
        AbstractC5710 abstractC57102 = c5727.f14559;
        C5575 c5575 = this.f14237;
        C5098 c5098 = c5575.f14184;
        InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr[42];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue()) {
            m10009(sb, abstractC57102);
            C5098 c50982 = c5575.f14187;
            InterfaceC5920 interfaceC59202 = interfaceC5920Arr[43];
            c50982.getClass();
            interfaceC59202.getClass();
            if (((Boolean) c50982.f13151).booleanValue()) {
                RenderingFormat renderingFormatM10031 = m10031();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (renderingFormatM10031 == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m10009(sb, abstractC5710);
                sb.append(" */");
                if (m10031() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m10009(sb, abstractC5710);
        C5098 c50983 = c5575.f14185;
        InterfaceC5920 interfaceC59203 = interfaceC5920Arr[41];
        c50983.getClass();
        interfaceC59203.getClass();
        if (((Boolean) c50983.f13151).booleanValue()) {
            RenderingFormat renderingFormatM100312 = m10031();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (renderingFormatM100312 == renderingFormat2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m10009(sb, abstractC57102);
            sb.append(" */");
            if (m10031() == renderingFormat2) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m10011(StringBuilder sb, C0955 c0955) {
        C0955 c09552 = (C0955) c0955.f663;
        InterfaceC5328 interfaceC5328 = (InterfaceC5328) c0955.f664;
        if (c09552 != null) {
            m10011(sb, c09552);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            C5523 name = interfaceC5328.getName();
            name.getClass();
            sb.append(m10013(name, false));
        } else {
            InterfaceC5705 interfaceC5705Mo9560 = interfaceC5328.mo9560();
            interfaceC5705Mo9560.getClass();
            sb.append(m10049(interfaceC5705Mo9560));
        }
        sb.append(m10048((List) c0955.f665));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m10012(InterfaceC5312 interfaceC5312, StringBuilder sb) {
        if (m10035().contains(DescriptorRendererModifier.OVERRIDE) && !interfaceC5312.mo9589().isEmpty()) {
            C5098 c5098 = this.f14237.f14196;
            InterfaceC5920 interfaceC5920 = C5575.f14181[26];
            c5098.getClass();
            interfaceC5920.getClass();
            if (((OverrideRenderingPolicy) c5098.f13151) != OverrideRenderingPolicy.RENDER_OPEN) {
                m10017(sb, true, "override");
                if (m10034()) {
                    sb.append("/*");
                    sb.append(interfaceC5312.mo9589().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final String m10013(C5523 c5523, boolean z) {
        String strM10037 = m10037(AbstractC3897.m7375(c5523));
        C5098 c5098 = this.f14237.f14231;
        InterfaceC5920 interfaceC5920 = C5575.f14181[48];
        c5098.getClass();
        interfaceC5920.getClass();
        return (((Boolean) c5098.f13151).booleanValue() && m10031() == RenderingFormat.HTML && z) ? AbstractC0900.m718("<b>", strM10037, "</b>") : strM10037;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m10014(InterfaceC5331 interfaceC5331, StringBuilder sb, boolean z) {
        C5523 name = interfaceC5331.getName();
        name.getClass();
        sb.append(m10013(name, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m10015(Modality modality, StringBuilder sb, Modality modality2) {
        C5098 c5098 = this.f14237.f14223;
        InterfaceC5920 interfaceC5920 = C5575.f14181[14];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue() || modality != modality2) {
            m10017(sb, m10035().contains(DescriptorRendererModifier.MODALITY), AbstractC5894.m10574(modality.name()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m10016(InterfaceC5319 interfaceC5319, StringBuilder sb) {
        m10017(sb, interfaceC5319.isExternal(), "external");
        boolean z = false;
        m10017(sb, m10035().contains(DescriptorRendererModifier.EXPECT) && interfaceC5319.mo9567(), "expect");
        if (m10035().contains(DescriptorRendererModifier.ACTUAL) && interfaceC5319.mo9575()) {
            z = true;
        }
        m10017(sb, z, "actual");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m10017(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m10025(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m10018(InterfaceC5312 interfaceC5312, StringBuilder sb) {
        if (AbstractC7699.m12668(interfaceC5312) && interfaceC5312.mo9568() == Modality.FINAL) {
            return;
        }
        C5098 c5098 = this.f14237.f14196;
        InterfaceC5920 interfaceC5920 = C5575.f14181[26];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((OverrideRenderingPolicy) c5098.f13151) == OverrideRenderingPolicy.RENDER_OVERRIDE && interfaceC5312.mo9568() == Modality.OPEN && !interfaceC5312.mo9589().isEmpty()) {
            return;
        }
        Modality modalityMo9568 = interfaceC5312.mo9568();
        modalityMo9568.getClass();
        m10015(modalityMo9568, sb, m10003(interfaceC5312));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10019(StringBuilder sb, AbstractC5710 abstractC5710) {
        m10023(sb, abstractC5710, null);
        if (AbstractC5725.m10388(abstractC5710)) {
            boolean z = abstractC5710 instanceof C8068;
            C5575 c5575 = this.f14237;
            if (z && ((C8068) abstractC5710).f19625.isUnresolved()) {
                C5098 c5098 = c5575.f14183;
                InterfaceC5920 interfaceC5920 = C5575.f14181[47];
                c5098.getClass();
                interfaceC5920.getClass();
                if (((Boolean) c5098.f13151).booleanValue()) {
                    C8069 c8069 = C8069.f19636;
                    if (z) {
                        ((C8068) abstractC5710).f19625.isUnresolved();
                    }
                    InterfaceC5705 interfaceC5705Mo10281 = abstractC5710.mo10281();
                    interfaceC5705Mo10281.getClass();
                    sb.append(m10029(((C8067) interfaceC5705Mo10281).f19621[0]));
                }
            } else if (z) {
                C5098 c50982 = c5575.f14230;
                InterfaceC5920 interfaceC59202 = C5575.f14181[49];
                c50982.getClass();
                interfaceC59202.getClass();
                if (((Boolean) c50982.f13151).booleanValue()) {
                    sb.append(abstractC5710.mo10281().toString());
                } else {
                    sb.append(((C8068) abstractC5710).f19626);
                }
                sb.append(m10048(abstractC5710.mo10285()));
            }
        } else {
            InterfaceC5705 interfaceC5705Mo102812 = abstractC5710.mo10281();
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5710.mo10281().mo9770();
            C0955 c0955M9638 = AbstractC5323.m9638(abstractC5710, interfaceC5309Mo9770 instanceof InterfaceC5328 ? (InterfaceC5328) interfaceC5309Mo9770 : null, 0);
            if (c0955M9638 == null) {
                sb.append(m10049(interfaceC5705Mo102812));
                sb.append(m10048(abstractC5710.mo10285()));
            } else {
                m10011(sb, c0955M9638);
            }
        }
        if (abstractC5710.mo10284()) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        if (abstractC5710 instanceof C5738) {
            sb.append(" & Any");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m10020(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            AbstractC5714 type = ((C7835) it.next()).getType();
            type.getClass();
            sb.append(m10027(type, true));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final String m10021(AbstractC5600 abstractC5600) {
        C5098 c5098 = this.f14237.f14217;
        InterfaceC5920 interfaceC5920 = C5575.f14181[20];
        c5098.getClass();
        interfaceC5920.getClass();
        InterfaceC7387 interfaceC7387 = (InterfaceC7387) c5098.f13151;
        if (interfaceC7387 != null) {
            return (String) interfaceC7387.invoke(abstractC5600);
        }
        if (abstractC5600 instanceof C5585) {
            Iterable iterable = (Iterable) ((C5585) abstractC5600).f14250;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM10021 = m10021((AbstractC5600) it.next());
                if (strM10021 != null) {
                    arrayList.add(strM10021);
                }
            }
            return AbstractC5176.m9369(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC5600 instanceof C5586) {
            return AbstractC5976.m10706(m10033((InterfaceC7307) ((C5586) abstractC5600).f14250, null), "@");
        }
        if (!(abstractC5600 instanceof C5591)) {
            return abstractC5600.toString();
        }
        AbstractC5587 abstractC5587 = (AbstractC5587) ((C5591) abstractC5600).f14250;
        if (abstractC5587 instanceof C5596) {
            return ((C5596) abstractC5587).f14247 + "::class";
        }
        if (!(abstractC5587 instanceof C5588)) {
            C5043.m9170();
            return null;
        }
        C5581 c5581 = ((C5588) abstractC5587).f14244;
        String strM12149 = c5581.f14241.m9886().f14041.f14038;
        int i = c5581.f14240;
        for (int i2 = 0; i2 < i; i2++) {
            strM12149 = AbstractC7012.m12149('>', "kotlin.Array<", strM12149);
        }
        return AbstractC0900.m696(strM12149, "::class");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m10022(InterfaceC5328 interfaceC5328, StringBuilder sb) {
        List listMo9574 = interfaceC5328.mo9574();
        listMo9574.getClass();
        List parameters = interfaceC5328.mo9560().getParameters();
        parameters.getClass();
        if (m10034() && interfaceC5328.mo9570() && parameters.size() > listMo9574.size()) {
            sb.append(" /*captured type parameters: ");
            m10047(parameters.subList(listMo9574.size(), parameters.size()), sb);
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m10023(StringBuilder sb, InterfaceC7308 interfaceC7308, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set setMo9997;
        if (m10035().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            boolean z = interfaceC7308 instanceof AbstractC5714;
            C5575 c5575 = this.f14237;
            if (z) {
                setMo9997 = c5575.mo9997();
            } else {
                C5098 c5098 = c5575.f14191;
                InterfaceC5920 interfaceC5920 = C5575.f14181[35];
                c5098.getClass();
                interfaceC5920.getClass();
                setMo9997 = (Set) c5098.f13151;
            }
            C5098 c50982 = c5575.f14193;
            InterfaceC5920 interfaceC59202 = C5575.f14181[37];
            c50982.getClass();
            interfaceC59202.getClass();
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) c50982.f13151;
            for (InterfaceC7307 interfaceC7307 : interfaceC7308.getAnnotations()) {
                if (!AbstractC5176.m9365(setMo9997, interfaceC7307.mo9737()) && !AbstractC5227.m9466(interfaceC7307.mo9737(), AbstractC7356.f18240) && (interfaceC7387 == null || ((Boolean) interfaceC7387.invoke(interfaceC7307)).booleanValue())) {
                    sb.append(m10033(interfaceC7307, annotationUseSiteTarget));
                    C5098 c50983 = c5575.f14200;
                    InterfaceC5920 interfaceC59203 = C5575.f14181[34];
                    c50983.getClass();
                    interfaceC59203.getClass();
                    if (((Boolean) c50983.f13151).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m10024(InterfaceC5312 interfaceC5312, StringBuilder sb) {
        if (m10035().contains(DescriptorRendererModifier.MEMBER_KIND) && m10034() && interfaceC5312.getKind() != CallableMemberDescriptor$Kind.DECLARATION) {
            sb.append("/*");
            sb.append(AbstractC5894.m10574(interfaceC5312.getKind().name()));
            sb.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final String m10025(String str) {
        int i = AbstractC5572.f14179[m10031().ordinal()];
        if (i != 1) {
            if (i != 2) {
                C5043.m9170();
                return null;
            }
            C5098 c5098 = this.f14237.f14231;
            InterfaceC5920 interfaceC5920 = C5575.f14181[48];
            c5098.getClass();
            interfaceC5920.getClass();
            if (!((Boolean) c5098.f13151).booleanValue()) {
                return AbstractC0900.m718("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m10026(InterfaceC5287 interfaceC5287, StringBuilder sb) {
        AbstractC5600 abstractC5600Mo9555;
        String strM10021;
        C5098 c5098 = this.f14237.f14216;
        InterfaceC5920 interfaceC5920 = C5575.f14181[19];
        c5098.getClass();
        interfaceC5920.getClass();
        if (!((Boolean) c5098.f13151).booleanValue() || (abstractC5600Mo9555 = interfaceC5287.mo9555()) == null || (strM10021 = m10021(abstractC5600Mo9555)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m10037(strM10021));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String m10027(AbstractC5714 abstractC5714, boolean z) {
        String strM10045 = m10045(abstractC5714);
        return ((!m10005(abstractC5714) || AbstractC5749.m10403(abstractC5714)) && !(abstractC5714 instanceof C5738) && (!z || abstractC5714.getAnnotations().isEmpty())) ? strM10045 : AbstractC7012.m12149(')', "(", strM10045);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final String m10028(String str, String str2, AbstractC7359 abstractC7359) {
        str.getClass();
        str2.getClass();
        int i = 0;
        if (AbstractC3897.m7361(str, str2)) {
            return AbstractC5971.m10698(str2, "(", false) ? AbstractC0900.m718("(", str, ")!") : str.concat("!");
        }
        String strM7374 = AbstractC3897.m7374(str, str2, new C5566(this, abstractC7359, i), new C5566(this, abstractC7359, 1), new DescriptorRendererImpl$renderFlexibleType$3(this));
        if (strM7374 != null) {
            return strM7374;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final String m10029(String str) {
        int i = AbstractC5572.f14179[m10031().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return AbstractC0900.m718("<font color=red><b>", str, "</b></font>");
        }
        C5043.m9170();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9987(LinkedHashSet linkedHashSet) {
        this.f14237.mo9987(linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9988(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f14237.mo9988(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9989(Set set) {
        set.getClass();
        this.f14237.mo9989(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9990() {
        this.f14237.mo9990();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9991() {
        this.f14237.mo9991();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9992() {
        this.f14237.mo9992();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5567 m10030() {
        C5098 c5098 = this.f14237.f14195;
        InterfaceC5920 interfaceC5920 = C5575.f14181[27];
        c5098.getClass();
        interfaceC5920.getClass();
        return (C5567) c5098.f13151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RenderingFormat m10031() {
        C5098 c5098 = this.f14237.f14194;
        InterfaceC5920 interfaceC5920 = C5575.f14181[28];
        c5098.getClass();
        interfaceC5920.getClass();
        return (RenderingFormat) c5098.f13151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String m10032(InterfaceC5331 interfaceC5331) {
        InterfaceC5331 interfaceC5331Mo9587;
        String str;
        interfaceC5331.getClass();
        StringBuilder sb = new StringBuilder();
        interfaceC5331.mo9586(new C3075(this, 22), sb);
        C5575 c5575 = this.f14237;
        C5098 c5098 = c5575.f14209;
        InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
        interfaceC5920Arr[1].getClass();
        if (((Boolean) c5098.f13151).booleanValue() && !(interfaceC5331 instanceof InterfaceC5298) && !(interfaceC5331 instanceof C7833) && (interfaceC5331Mo9587 = interfaceC5331.mo9587()) != null && !(interfaceC5331Mo9587 instanceof InterfaceC5318)) {
            sb.append(" ");
            int i = AbstractC5572.f14179[m10031().ordinal()];
            if (i == 1) {
                str = "defined in";
            } else {
                if (i != 2) {
                    C5043.m9170();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C5518 c5518M12660 = AbstractC7699.m12660(interfaceC5331Mo9587);
            c5518M12660.getClass();
            sb.append(c5518M12660.m9873() ? "root package" : m10037(AbstractC3897.m7373(C5518.m9870(c5518M12660))));
            C5098 c50982 = c5575.f14208;
            interfaceC5920Arr[2].getClass();
            if (((Boolean) c50982.f13151).booleanValue() && (interfaceC5331Mo9587 instanceof InterfaceC5298) && (interfaceC5331 instanceof InterfaceC5332)) {
                ((InterfaceC5332) interfaceC5331).mo9585().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String m10033(InterfaceC7307 interfaceC7307, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        C7847 c7847Mo9577;
        List listMo9594;
        interfaceC7307.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        AbstractC5714 type = interfaceC7307.getType();
        sb.append(m10045(type));
        C5575 c5575 = this.f14237;
        if (c5575.m10000().getIncludeAnnotationArguments()) {
            Map mapMo9735 = interfaceC7307.mo9735();
            C5098 c5098 = c5575.f14201;
            InterfaceC5920 interfaceC5920 = C5575.f14181[33];
            c5098.getClass();
            interfaceC5920.getClass();
            List list = null;
            AbstractC7818 abstractC7818M10059 = ((Boolean) c5098.f13151).booleanValue() ? AbstractC5605.m10059(interfaceC7307) : null;
            if (abstractC7818M10059 != null && (c7847Mo9577 = abstractC7818M10059.mo9577()) != null && (listMo9594 = c7847Mo9577.mo9594()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo9594) {
                    if (((C7808) ((InterfaceC5288) obj)).m12849()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC7838) ((InterfaceC5288) it.next())).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapMo9735.containsKey((C5523) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C5523) it2.next()).m9894() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo9735.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                C5523 c5523 = (C5523) entry.getKey();
                AbstractC5600 abstractC5600 = (AbstractC5600) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c5523.m9894());
                sb2.append(" = ");
                sb2.append(!list.contains(c5523) ? m10021(abstractC5600) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM9336 = AbstractC5176.m9336(AbstractC5176.m9352(arrayList5, arrayList4));
            if (c5575.m10000().getIncludeEmptyAnnotationArguments() || !listM9336.isEmpty()) {
                AbstractC5176.m9368(listM9336, sb, ", ", "(", ")", null, 112);
            }
        }
        if (m10034() && (AbstractC5725.m10388(type) || (type.mo10281().mo9770() instanceof C5299))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m10034() {
        C5098 c5098 = this.f14237.f14229;
        InterfaceC5920 interfaceC5920 = C5575.f14181[8];
        c5098.getClass();
        interfaceC5920.getClass();
        return ((Boolean) c5098.f13151).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9993() {
        this.f14237.mo9993();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set m10035() {
        C5098 c5098 = this.f14237.f14207;
        InterfaceC5920 interfaceC5920 = C5575.f14181[3];
        c5098.getClass();
        interfaceC5920.getClass();
        return (Set) c5098.f13151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m10036() {
        C5098 c5098 = this.f14237.f14206;
        InterfaceC5920 interfaceC5920 = C5575.f14181[4];
        c5098.getClass();
        interfaceC5920.getClass();
        return ((Boolean) c5098.f13151).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final String m10037(String str) {
        return m10031().escape(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5569 m10038() {
        C5098 c5098 = this.f14237.f14210;
        C5575.f14181[0].getClass();
        return (C5569) c5098.f13151;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9994(C5569 c5569) {
        this.f14237.mo9994(c5569);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9995() {
        this.f14237.mo9995();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9996() {
        this.f14237.mo9996();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9997() {
        return this.f14237.mo9997();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9998(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f14237.mo9998(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9999() {
        this.f14237.mo9999();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m10039(List list, StringBuilder sb) {
        C5098 c5098 = this.f14237.f14214;
        InterfaceC5920 interfaceC5920 = C5575.f14181[21];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) it.next();
            List upperBounds = interfaceC5295.getUpperBounds();
            upperBounds.getClass();
            for (AbstractC5714 abstractC5714 : AbstractC5176.m9364(1, upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C5523 name = interfaceC5295.getName();
                name.getClass();
                sb2.append(m10013(name, false));
                sb2.append(" : ");
                abstractC5714.getClass();
                sb2.append(m10045(abstractC5714));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m10025("where"));
        sb.append(" ");
        AbstractC5176.m9368(arrayList, sb, ", ", null, null, null, 124);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m10040(C5322 c5322, StringBuilder sb) {
        if (!m10035().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        C5575 c5575 = this.f14237;
        C5098 c5098 = c5575.f14218;
        InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr[12];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue()) {
            c5322 = AbstractC5321.m9631(c5322.f13476.mo9657());
        }
        C5098 c50982 = c5575.f14222;
        InterfaceC5920 interfaceC59202 = interfaceC5920Arr[13];
        c50982.getClass();
        interfaceC59202.getClass();
        if (!((Boolean) c50982.f13151).booleanValue() && AbstractC5227.m9466(c5322, AbstractC5321.f13474)) {
            return false;
        }
        sb.append(m10025(c5322.f13476.mo9658()));
        sb.append(" ");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10041(StringBuilder sb, List list, boolean z) {
        boolean z2;
        C5098 c5098 = this.f14237.f14205;
        InterfaceC5920 interfaceC5920 = C5575.f14181[29];
        c5098.getClass();
        interfaceC5920.getClass();
        int i = AbstractC5572.f14178[((ParameterNameRenderingPolicy) c5098.f13151).ordinal()];
        if (i == 1) {
            z2 = true;
        } else {
            if (i != 2) {
                if (i != 3) {
                    C5043.m9170();
                    return;
                }
            } else if (!z) {
            }
            z2 = false;
        }
        int size = list.size();
        m10030().getClass();
        sb.getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            InterfaceC5288 interfaceC5288 = (InterfaceC5288) it.next();
            m10030().getClass();
            interfaceC5288.getClass();
            m10042(interfaceC5288, z2, sb, false);
            m10030().getClass();
            if (i2 != size - 1) {
                sb.append(", ");
            }
            i2 = i3;
        }
        m10030().getClass();
        sb.append(")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10042(InterfaceC5288 interfaceC5288, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(m10025("value-parameter"));
            sb.append(" ");
        }
        if (m10034()) {
            sb.append("/*");
            sb.append(((C7808) interfaceC5288).f19019);
            sb.append("*/ ");
        }
        m10023(sb, interfaceC5288, null);
        C7808 c7808 = (C7808) interfaceC5288;
        m10017(sb, c7808.f19017, "crossinline");
        m10017(sb, c7808.f19018, "noinline");
        C5575 c5575 = this.f14237;
        C5098 c5098 = c5575.f14221;
        InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr[16];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue()) {
            InterfaceC5313 interfaceC5313M12850 = c7808.mo9587();
            C7847 c7847 = interfaceC5313M12850 instanceof C7847 ? (C7847) interfaceC5313M12850 : null;
            z3 = c7847 != null && c7847.f19201;
        }
        if (z3) {
            C5098 c50982 = c5575.f14213;
            InterfaceC5920 interfaceC59202 = interfaceC5920Arr[17];
            c50982.getClass();
            interfaceC59202.getClass();
            m10017(sb, ((Boolean) c50982.f13151).booleanValue(), "actual");
        }
        AbstractC5714 type = ((AbstractC7806) interfaceC5288).getType();
        type.getClass();
        AbstractC5714 abstractC5714 = c7808.f19016;
        AbstractC5714 abstractC57142 = abstractC5714 == null ? type : abstractC5714;
        m10017(sb, abstractC5714 != null, "vararg");
        if (z3 || (z2 && !m10036())) {
            m10043(interfaceC5288, sb, z3);
        }
        if (z) {
            m10014(interfaceC5288, sb, z2);
            sb.append(": ");
        }
        sb.append(m10045(abstractC57142));
        m10026(interfaceC5288, sb);
        if (m10034() && abstractC5714 != null) {
            sb.append(" /*");
            sb.append(m10045(type));
            sb.append("*/");
        }
        C5098 c50983 = c5575.f14198;
        InterfaceC5920 interfaceC59203 = interfaceC5920Arr[24];
        c50983.getClass();
        interfaceC59203.getClass();
        if (((InterfaceC7387) c50983.f13151) != null) {
            if (c5575.m10001() ? c7808.m12849() : AbstractC5605.m10062(interfaceC5288)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                C5098 c50984 = c5575.f14198;
                InterfaceC5920 interfaceC59204 = interfaceC5920Arr[24];
                c50984.getClass();
                interfaceC59204.getClass();
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) c50984.f13151;
                interfaceC7387.getClass();
                sb2.append((String) interfaceC7387.invoke(interfaceC5288));
                sb.append(sb2.toString());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m10043(InterfaceC5287 interfaceC5287, StringBuilder sb, boolean z) {
        if (z || !(interfaceC5287 instanceof InterfaceC5288)) {
            sb.append(m10025(interfaceC5287.mo9554() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m10044(StringBuilder sb, List list, boolean z) {
        C5098 c5098 = this.f14237.f14214;
        InterfaceC5920 interfaceC5920 = C5575.f14181[21];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m10037("<"));
        m10047(list, sb);
        sb.append(m10037(">"));
        if (z) {
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final String m10045(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        StringBuilder sb = new StringBuilder();
        C5098 c5098 = this.f14237.f14199;
        InterfaceC5920 interfaceC5920 = C5575.f14181[23];
        c5098.getClass();
        interfaceC5920.getClass();
        m10010(sb, (AbstractC5714) ((InterfaceC7387) c5098.f13151).invoke(abstractC5714));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m10046(InterfaceC5295 interfaceC5295, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m10037("<"));
        }
        if (m10034()) {
            sb.append("/*");
            sb.append(interfaceC5295.getIndex());
            sb.append("*/ ");
        }
        m10017(sb, interfaceC5295.mo9563(), "reified");
        String label = interfaceC5295.mo9562().getLabel();
        boolean z2 = true;
        m10017(sb, label.length() > 0, label);
        m10023(sb, interfaceC5295, null);
        m10014(interfaceC5295, sb, z);
        int size = interfaceC5295.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC5714 abstractC5714 = (AbstractC5714) interfaceC5295.getUpperBounds().iterator().next();
            if (abstractC5714 == null) {
                AbstractC7359.m12579(141);
                throw null;
            }
            if (!AbstractC7359.m12581(abstractC5714) || !abstractC5714.mo10284()) {
                sb.append(" : ");
                sb.append(m10045(abstractC5714));
            }
        } else if (z) {
            for (AbstractC5714 abstractC57142 : interfaceC5295.getUpperBounds()) {
                if (abstractC57142 == null) {
                    AbstractC7359.m12579(141);
                    throw null;
                }
                if (!AbstractC7359.m12581(abstractC57142) || !abstractC57142.mo10284()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m10045(abstractC57142));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m10037(">"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m10047(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m10046((InterfaceC5295) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final String m10048(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m10037("<"));
        AbstractC5176.m9368(list, sb, ", ", null, null, new C5564(this, 0), 60);
        sb.append(m10037(">"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final String m10049(InterfaceC5705 interfaceC5705) {
        interfaceC5705.getClass();
        InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705.mo9770();
        if ((interfaceC5309Mo9770 instanceof InterfaceC5295) || (interfaceC5309Mo9770 instanceof AbstractC7818) || (interfaceC5309Mo9770 instanceof AbstractC7825)) {
            interfaceC5309Mo9770.getClass();
            return C8069.m13026(interfaceC5309Mo9770) ? interfaceC5309Mo9770.mo9560().toString() : m10038().m9986(interfaceC5309Mo9770, this);
        }
        if (interfaceC5309Mo9770 == null) {
            return interfaceC5705 instanceof C5715 ? ((C5715) interfaceC5705).m10333(C5565.f14164) : interfaceC5705.toString();
        }
        C1123.m1405(interfaceC5309Mo9770.getClass(), "Unexpected classifier: ");
        return null;
    }
}
