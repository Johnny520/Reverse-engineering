package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.runtime.C1322;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import io.ktor.websocket.C4265;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4466;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4454;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4763;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4879;
import kotlin.reflect.jvm.internal.impl.types.C4882;
import kotlin.reflect.jvm.internal.impl.types.C4894;
import kotlin.reflect.jvm.internal.impl.types.C4905;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p033.AbstractC6325;
import p046.InterfaceC6477;
import p046.InterfaceC6478;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.AbstractC7008;
import p079.C6978;
import p079.C6989;
import p079.C6990;
import p079.C7003;
import p079.C7005;
import p079.C7010;
import p079.C7017;
import p098.C7237;
import p098.C7239;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4743 implements InterfaceC4741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f13883 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4743 f13884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4743 f13885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4743 f13886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f13887 = AbstractC5186.m10210(new C1322(this, 5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4742 f13888;

    static {
        C4742 c4742 = new C4742();
        c4742.mo9440(EmptySet.INSTANCE);
        c4742.f13862 = true;
        new C4743(c4742);
        C4742 c47422 = new C4742();
        c47422.mo9447();
        c47422.f13862 = true;
        new C4743(c47422);
        C4742 c47423 = new C4742();
        c47423.mo9447();
        c47423.mo9440(EmptySet.INSTANCE);
        c47423.f13862 = true;
        new C4743(c47423);
        C4742 c47424 = new C4742();
        c47424.mo9447();
        c47424.mo9440(EmptySet.INSTANCE);
        c47424.mo9444();
        c47424.f13862 = true;
        new C4743(c47424);
        C4742 c47425 = new C4742();
        c47425.mo9440(EmptySet.INSTANCE);
        C4736 c4736 = C4736.f13824;
        c47425.mo9445(c4736);
        c47425.mo9439(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c47425.f13862 = true;
        new C4743(c47425);
        C4742 c47426 = new C4742();
        c47426.mo9447();
        c47426.mo9440(EmptySet.INSTANCE);
        c47426.mo9445(c4736);
        c47426.mo9446();
        c47426.mo9439(ParameterNameRenderingPolicy.NONE);
        c47426.mo9443();
        c47426.mo9441();
        c47426.mo9444();
        c47426.mo9450();
        c47426.f13862 = true;
        new C4743(c47426);
        C4742 c47427 = new C4742();
        c47427.mo9440(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        c47427.f13862 = true;
        f13886 = new C4743(c47427);
        C4742 c47428 = new C4742();
        c47428.mo9440(DescriptorRendererModifier.ALL);
        c47428.f13862 = true;
        new C4743(c47428);
        C4742 c47429 = new C4742();
        c47429.mo9445(c4736);
        c47429.mo9439(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c47429.f13862 = true;
        f13885 = new C4743(c47429);
        C4742 c474210 = new C4742();
        c474210.mo9442();
        c474210.mo9445(C4736.f13825);
        c474210.mo9440(DescriptorRendererModifier.ALL);
        c474210.f13862 = true;
        f13884 = new C4743(c474210);
        C4742 c474211 = new C4742();
        c474211.mo9449(RenderingFormat.HTML);
        c474211.mo9440(DescriptorRendererModifier.ALL);
        c474211.f13862 = true;
        new C4743(c474211);
    }

    public C4743(C4742 c4742) {
        this.f13888 = c4742;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static Modality m9454(InterfaceC4486 interfaceC4486) {
        if (interfaceC4486 instanceof AbstractC6988) {
            return ((AbstractC6988) interfaceC4486).mo9020() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4486.mo9038();
        AbstractC6988 abstractC6988 = interfaceC4498Mo9038 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4498Mo9038 : null;
        if (abstractC6988 == null) {
            return Modality.FINAL;
        }
        if (!(interfaceC4486 instanceof InterfaceC4479)) {
            return Modality.FINAL;
        }
        InterfaceC4479 interfaceC4479 = (InterfaceC4479) interfaceC4486;
        Collection collectionMo9040 = interfaceC4479.mo9040();
        collectionMo9040.getClass();
        if (!collectionMo9040.isEmpty() && abstractC6988.mo9019() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (abstractC6988.mo9020() != ClassKind.INTERFACE || AbstractC4394.m8917(interfaceC4479.getVisibility(), AbstractC4488.f13116)) {
            return Modality.FINAL;
        }
        Modality modalityMo9019 = interfaceC4479.mo9019();
        Modality modality = Modality.ABSTRACT;
        return modalityMo9019 == modality ? modality : Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m9455(C4743 c4743, InterfaceC4472 interfaceC4472, StringBuilder sb) {
        boolean zM9487 = c4743.m9487();
        C4742 c4742 = c4743.f13888;
        if (!zM9487) {
            C4265 c4265 = c4742.f13876;
            InterfaceC5087[] interfaceC5087Arr = C4742.f13832;
            InterfaceC5087 interfaceC5087 = interfaceC5087Arr[5];
            c4265.getClass();
            interfaceC5087.getClass();
            if (!((Boolean) c4265.f12802).booleanValue()) {
                List listMo9047 = interfaceC4472.mo9047();
                listMo9047.getClass();
                c4743.m9471(listMo9047, sb);
                if (c4743.m9486().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    c4743.m9474(sb, interfaceC4472, null);
                    C7010 c7010Mo9034 = interfaceC4472.mo9034();
                    if (c7010Mo9034 != null) {
                        c4743.m9474(sb, c7010Mo9034, AnnotationUseSiteTarget.FIELD);
                    }
                    C7010 c7010Mo9031 = interfaceC4472.mo9031();
                    if (c7010Mo9031 != null) {
                        c4743.m9474(sb, c7010Mo9031, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    C4265 c42652 = c4742.f13853;
                    InterfaceC5087 interfaceC50872 = interfaceC5087Arr[32];
                    c42652.getClass();
                    interfaceC50872.getClass();
                    if (((PropertyAccessorRenderingPolicy) c42652.f12802) == PropertyAccessorRenderingPolicy.NONE) {
                        C6990 getter = interfaceC4472.getGetter();
                        if (getter != null) {
                            c4743.m9474(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        C6989 setter = interfaceC4472.getSetter();
                        if (setter != null) {
                            c4743.m9474(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List listMo9045 = setter.mo9045();
                            listMo9045.getClass();
                            InterfaceC4455 interfaceC4455 = (InterfaceC4455) AbstractC4343.m8818(listMo9045);
                            interfaceC4455.getClass();
                            c4743.m9474(sb, interfaceC4455, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                C4489 visibility = interfaceC4472.getVisibility();
                visibility.getClass();
                c4743.m9491(visibility, sb);
                c4743.m9468(sb, c4743.m9486().contains(DescriptorRendererModifier.CONST) && interfaceC4472.isConst(), "const");
                c4743.m9467(interfaceC4472, sb);
                c4743.m9469(interfaceC4472, sb);
                c4743.m9463(interfaceC4472, sb);
                c4743.m9468(sb, c4743.m9486().contains(DescriptorRendererModifier.LATEINIT) && interfaceC4472.mo9007(), "lateinit");
                c4743.m9475(interfaceC4472, sb);
            }
            c4743.m9494(interfaceC4472, sb, false);
            List typeParameters = interfaceC4472.getTypeParameters();
            typeParameters.getClass();
            c4743.m9495(sb, typeParameters, true);
            c4743.m9458(interfaceC4472, sb);
        }
        c4743.m9465(interfaceC4472, sb, true);
        sb.append(": ");
        AbstractC4881 type = interfaceC4472.getType();
        type.getClass();
        sb.append(c4743.m9496(type));
        c4743.m9459(interfaceC4472, sb);
        c4743.m9477(interfaceC4472, sb);
        List typeParameters2 = interfaceC4472.getTypeParameters();
        typeParameters2.getClass();
        c4743.m9490(typeParameters2, sb);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m9456(AbstractC4881 abstractC4881) {
        if (!AbstractC6325.m11861(abstractC4881)) {
            return false;
        }
        List listMo9736 = abstractC4881.mo9736();
        if (listMo9736 != null && listMo9736.isEmpty()) {
            return true;
        }
        Iterator it = listMo9736.iterator();
        while (it.hasNext()) {
            if (((AbstractC4869) it.next()).mo9750()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m9457(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m9458(InterfaceC4479 interfaceC4479, StringBuilder sb) {
        C7005 c7005Mo9042 = interfaceC4479.mo9042();
        if (c7005Mo9042 != null) {
            m9474(sb, c7005Mo9042, AnnotationUseSiteTarget.RECEIVER);
            AbstractC4881 type = c7005Mo9042.getType();
            type.getClass();
            sb.append(m9478(type, false));
            sb.append(".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m9459(InterfaceC4479 interfaceC4479, StringBuilder sb) {
        C7005 c7005Mo9042;
        C4265 c4265 = this.f13888.f13855;
        InterfaceC5087 interfaceC5087 = C4742.f13832[30];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue() && (c7005Mo9042 = interfaceC4479.mo9042()) != null) {
            sb.append(" on ");
            AbstractC4881 type = c7005Mo9042.getType();
            type.getClass();
            sb.append(m9496(type));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m9460(StringBuilder sb, AbstractC4881 abstractC4881) throws IOException {
        C4690 c4690M11872;
        String strM9488;
        boolean z = abstractC4881 instanceof C4879;
        C4742 c4742 = this.f13888;
        if (z && c4742.m9452() && !((C4879) abstractC4881).f14181.m9585()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            sb.append(((AbstractC4895) abstractC4913Mo9778).mo9841(this, this));
            return;
        }
        if (!(abstractC4913Mo9778 instanceof AbstractC4877)) {
            C4210.m8621();
            return;
        }
        AbstractC4877 abstractC4877 = (AbstractC4877) abstractC4913Mo9778;
        if (abstractC4877.equals(AbstractC4916.f14242) || abstractC4877.mo9732() == AbstractC4916.f14243.f19289) {
            sb.append("???");
            return;
        }
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4877.mo9732();
        int i = 0;
        if ((interfaceC4872Mo9732 instanceof C7237) && ((C7237) interfaceC4872Mo9732).f19283 == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
            C4265 c4265 = c4742.f13863;
            InterfaceC5087 interfaceC5087 = C4742.f13832[18];
            c4265.getClass();
            interfaceC5087.getClass();
            if (!((Boolean) c4265.f12802).booleanValue()) {
                sb.append("???");
                return;
            }
            InterfaceC4872 interfaceC4872Mo97322 = abstractC4877.mo9732();
            interfaceC4872Mo97322.getClass();
            sb.append(m9480(((C7237) interfaceC4872Mo97322).f19281[0]));
            return;
        }
        if (AbstractC4892.m9835(abstractC4877)) {
            m9470(sb, abstractC4877);
            return;
        }
        if (!m9456(abstractC4877)) {
            m9470(sb, abstractC4877);
            return;
        }
        int length = sb.length();
        ((C4743) this.f13887.getValue()).m9474(sb, abstractC4877, null);
        boolean z2 = sb.length() != length;
        AbstractC4881 abstractC4881M11866 = AbstractC6325.m11866(abstractC4877);
        List listM11864 = AbstractC6325.m11864(abstractC4877);
        boolean zM11862 = AbstractC6325.m11862(abstractC4877);
        boolean zMo9735 = abstractC4877.mo9735();
        boolean z3 = zMo9735 || (z2 && abstractC4881M11866 != null);
        if (z3) {
            if (zM11862) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    AbstractC3056.m6673(AbstractC5143.m10163(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        m9468(sb, zM11862, "suspend");
        if (!listM11864.isEmpty()) {
            sb.append("context(");
            Iterator it = listM11864.subList(0, listM11864.size() - 1).iterator();
            while (it.hasNext()) {
                m9461(sb, (AbstractC4881) it.next());
                sb.append(", ");
            }
            m9461(sb, (AbstractC4881) AbstractC4343.m8811(listM11864));
            sb.append(") ");
        }
        if (abstractC4881M11866 != null) {
            boolean z4 = (m9456(abstractC4881M11866) && !abstractC4881M11866.mo9735()) || AbstractC6325.m11862(abstractC4881M11866) || !abstractC4881M11866.getAnnotations().isEmpty() || (abstractC4881M11866 instanceof C4905);
            if (z4) {
                sb.append("(");
            }
            m9461(sb, abstractC4881M11866);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AbstractC6325.m11861(abstractC4877) || abstractC4877.getAnnotations().mo9527(AbstractC6526.f17901) == null || abstractC4877.mo9736().size() > 1) {
            int i2 = 0;
            for (AbstractC4869 abstractC4869 : AbstractC6325.m11860(abstractC4877)) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append(", ");
                }
                C4265 c42652 = c4742.f13833;
                InterfaceC5087 interfaceC50872 = C4742.f13832[45];
                c42652.getClass();
                interfaceC50872.getClass();
                if (((Boolean) c42652.f12802).booleanValue()) {
                    AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
                    abstractC4881Mo9751.getClass();
                    c4690M11872 = AbstractC6325.m11872(abstractC4881Mo9751);
                } else {
                    c4690M11872 = null;
                }
                if (c4690M11872 != null) {
                    sb.append(m9464(c4690M11872, false));
                    sb.append(": ");
                }
                abstractC4869.getClass();
                StringBuilder sb2 = new StringBuilder();
                AbstractC4343.m8829(AbstractC8189.m13660(abstractC4869), sb2, ", ", null, null, new C4731(this, i), 60);
                sb.append(sb2.toString());
                i2 = i3;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int i4 = AbstractC4739.f13830[m9482().ordinal()];
        if (i4 == 1) {
            strM9488 = m9488("->");
        } else {
            if (i4 != 2) {
                C4210.m8621();
                return;
            }
            strM9488 = "&rarr;";
        }
        sb.append(strM9488);
        sb.append(" ");
        AbstractC6325.m11861(abstractC4877);
        AbstractC4881 abstractC4881Mo97512 = ((AbstractC4869) AbstractC4343.m8811(abstractC4877.mo9736())).mo9751();
        abstractC4881Mo97512.getClass();
        m9461(sb, abstractC4881Mo97512);
        if (z3) {
            sb.append(")");
        }
        if (zMo9735) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m9461(StringBuilder sb, AbstractC4881 abstractC4881) {
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        C4894 c4894 = abstractC4913Mo9778 instanceof C4894 ? (C4894) abstractC4913Mo9778 : null;
        if (c4894 == null) {
            m9460(sb, abstractC4881);
            return;
        }
        AbstractC4877 abstractC4877 = c4894.f14211;
        AbstractC4877 abstractC48772 = c4894.f14210;
        C4742 c4742 = this.f13888;
        C4265 c4265 = c4742.f13835;
        InterfaceC5087[] interfaceC5087Arr = C4742.f13832;
        InterfaceC5087 interfaceC5087 = interfaceC5087Arr[42];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue()) {
            m9460(sb, abstractC48772);
            C4265 c42652 = c4742.f13838;
            InterfaceC5087 interfaceC50872 = interfaceC5087Arr[43];
            c42652.getClass();
            interfaceC50872.getClass();
            if (((Boolean) c42652.f12802).booleanValue()) {
                RenderingFormat renderingFormatM9482 = m9482();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (renderingFormatM9482 == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m9460(sb, abstractC4877);
                sb.append(" */");
                if (m9482() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m9460(sb, abstractC4877);
        C4265 c42653 = c4742.f13836;
        InterfaceC5087 interfaceC50873 = interfaceC5087Arr[41];
        c42653.getClass();
        interfaceC50873.getClass();
        if (((Boolean) c42653.f12802).booleanValue()) {
            RenderingFormat renderingFormatM94822 = m9482();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (renderingFormatM94822 == renderingFormat2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m9460(sb, abstractC48772);
            sb.append(" */");
            if (m9482() == renderingFormat2) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m9462(StringBuilder sb, C0108 c0108) {
        C0108 c01082 = (C0108) c0108.f318;
        InterfaceC4495 interfaceC4495 = (InterfaceC4495) c0108.f319;
        if (c01082 != null) {
            m9462(sb, c01082);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            C4690 name = interfaceC4495.getName();
            name.getClass();
            sb.append(m9464(name, false));
        } else {
            InterfaceC4872 interfaceC4872Mo9011 = interfaceC4495.mo9011();
            interfaceC4872Mo9011.getClass();
            sb.append(m9500(interfaceC4872Mo9011));
        }
        sb.append(m9499((List) c0108.f320));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m9463(InterfaceC4479 interfaceC4479, StringBuilder sb) {
        if (m9486().contains(DescriptorRendererModifier.OVERRIDE) && !interfaceC4479.mo9040().isEmpty()) {
            C4265 c4265 = this.f13888.f13847;
            InterfaceC5087 interfaceC5087 = C4742.f13832[26];
            c4265.getClass();
            interfaceC5087.getClass();
            if (((OverrideRenderingPolicy) c4265.f12802) != OverrideRenderingPolicy.RENDER_OPEN) {
                m9468(sb, true, "override");
                if (m9485()) {
                    sb.append("/*");
                    sb.append(interfaceC4479.mo9040().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final String m9464(C4690 c4690, boolean z) {
        String strM9488 = m9488(AbstractC6560.m12017(c4690));
        C4265 c4265 = this.f13888.f13882;
        InterfaceC5087 interfaceC5087 = C4742.f13832[48];
        c4265.getClass();
        interfaceC5087.getClass();
        return (((Boolean) c4265.f12802).booleanValue() && m9482() == RenderingFormat.HTML && z) ? AbstractC0053.m156("<b>", strM9488, "</b>") : strM9488;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m9465(InterfaceC4498 interfaceC4498, StringBuilder sb, boolean z) {
        C4690 name = interfaceC4498.getName();
        name.getClass();
        sb.append(m9464(name, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m9466(Modality modality, StringBuilder sb, Modality modality2) {
        C4265 c4265 = this.f13888.f13874;
        InterfaceC5087 interfaceC5087 = C4742.f13832[14];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue() || modality != modality2) {
            m9468(sb, m9486().contains(DescriptorRendererModifier.MODALITY), AbstractC3056.m6707(modality.name()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m9467(InterfaceC4486 interfaceC4486, StringBuilder sb) {
        m9468(sb, interfaceC4486.isExternal(), "external");
        boolean z = false;
        m9468(sb, m9486().contains(DescriptorRendererModifier.EXPECT) && interfaceC4486.mo9018(), "expect");
        if (m9486().contains(DescriptorRendererModifier.ACTUAL) && interfaceC4486.mo9026()) {
            z = true;
        }
        m9468(sb, z, "actual");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m9468(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m9476(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m9469(InterfaceC4479 interfaceC4479, StringBuilder sb) {
        if (AbstractC6869.m12081(interfaceC4479) && interfaceC4479.mo9019() == Modality.FINAL) {
            return;
        }
        C4265 c4265 = this.f13888.f13847;
        InterfaceC5087 interfaceC5087 = C4742.f13832[26];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((OverrideRenderingPolicy) c4265.f12802) == OverrideRenderingPolicy.RENDER_OVERRIDE && interfaceC4479.mo9019() == Modality.OPEN && !interfaceC4479.mo9040().isEmpty()) {
            return;
        }
        Modality modalityMo9019 = interfaceC4479.mo9019();
        modalityMo9019.getClass();
        m9466(modalityMo9019, sb, m9454(interfaceC4479));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9470(java.lang.StringBuilder r7, kotlin.reflect.jvm.internal.impl.types.AbstractC4877 r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4743.m9470(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m9471(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            AbstractC4881 type = ((C7005) it.next()).getType();
            type.getClass();
            sb.append(m9478(type, true));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final String m9472(AbstractC4767 abstractC4767) {
        C4265 c4265 = this.f13888.f13868;
        InterfaceC5087 interfaceC5087 = C4742.f13832[20];
        c4265.getClass();
        interfaceC5087.getClass();
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) c4265.f12802;
        if (interfaceC6557 != null) {
            return (String) interfaceC6557.invoke(abstractC4767);
        }
        if (abstractC4767 instanceof C4752) {
            Iterable iterable = (Iterable) ((C4752) abstractC4767).f13901;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM9472 = m9472((AbstractC4767) it.next());
                if (strM9472 != null) {
                    arrayList.add(strM9472);
                }
            }
            return AbstractC4343.m8813(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC4767 instanceof C4753) {
            return AbstractC5143.m10160(m9484((InterfaceC6477) ((C4753) abstractC4767).f13901, null), "@");
        }
        if (!(abstractC4767 instanceof C4758)) {
            return abstractC4767.toString();
        }
        AbstractC4754 abstractC4754 = (AbstractC4754) ((C4758) abstractC4767).f13901;
        if (abstractC4754 instanceof C4763) {
            return ((C4763) abstractC4754).f13898 + "::class";
        }
        if (!(abstractC4754 instanceof C4755)) {
            C4210.m8621();
            return null;
        }
        C4748 c4748 = ((C4755) abstractC4754).f13895;
        String strM11558 = c4748.f13892.m9337().f13692.f13689;
        int i = c4748.f13891;
        for (int i2 = 0; i2 < i; i2++) {
            strM11558 = AbstractC6136.m11558('>', "kotlin.Array<", strM11558);
        }
        return AbstractC0053.m136(strM11558, "::class");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m9473(InterfaceC4495 interfaceC4495, StringBuilder sb) {
        List listMo9025 = interfaceC4495.mo9025();
        listMo9025.getClass();
        List parameters = interfaceC4495.mo9011().getParameters();
        parameters.getClass();
        if (m9485() && interfaceC4495.mo9021() && parameters.size() > listMo9025.size()) {
            sb.append(" /*captured type parameters: ");
            m9498(parameters.subList(listMo9025.size(), parameters.size()), sb);
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m9474(StringBuilder sb, InterfaceC6478 interfaceC6478, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set setMo9448;
        if (m9486().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            boolean z = interfaceC6478 instanceof AbstractC4881;
            C4742 c4742 = this.f13888;
            if (z) {
                setMo9448 = c4742.mo9448();
            } else {
                C4265 c4265 = c4742.f13842;
                InterfaceC5087 interfaceC5087 = C4742.f13832[35];
                c4265.getClass();
                interfaceC5087.getClass();
                setMo9448 = (Set) c4265.f12802;
            }
            C4265 c42652 = c4742.f13844;
            InterfaceC5087 interfaceC50872 = C4742.f13832[37];
            c42652.getClass();
            interfaceC50872.getClass();
            InterfaceC6557 interfaceC6557 = (InterfaceC6557) c42652.f12802;
            for (InterfaceC6477 interfaceC6477 : interfaceC6478.getAnnotations()) {
                if (!AbstractC4343.m8789(setMo9448, interfaceC6477.mo9188()) && !AbstractC4394.m8917(interfaceC6477.mo9188(), AbstractC6526.f17899) && (interfaceC6557 == null || ((Boolean) interfaceC6557.invoke(interfaceC6477)).booleanValue())) {
                    sb.append(m9484(interfaceC6477, annotationUseSiteTarget));
                    C4265 c42653 = c4742.f13851;
                    InterfaceC5087 interfaceC50873 = C4742.f13832[34];
                    c42653.getClass();
                    interfaceC50873.getClass();
                    if (((Boolean) c42653.f12802).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m9475(InterfaceC4479 interfaceC4479, StringBuilder sb) {
        if (m9486().contains(DescriptorRendererModifier.MEMBER_KIND) && m9485() && interfaceC4479.getKind() != CallableMemberDescriptor$Kind.DECLARATION) {
            sb.append("/*");
            sb.append(AbstractC3056.m6707(interfaceC4479.getKind().name()));
            sb.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final String m9476(String str) {
        int i = AbstractC4739.f13830[m9482().ordinal()];
        if (i != 1) {
            if (i != 2) {
                C4210.m8621();
                return null;
            }
            C4265 c4265 = this.f13888.f13882;
            InterfaceC5087 interfaceC5087 = C4742.f13832[48];
            c4265.getClass();
            interfaceC5087.getClass();
            if (!((Boolean) c4265.f12802).booleanValue()) {
                return AbstractC0053.m156("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m9477(InterfaceC4454 interfaceC4454, StringBuilder sb) {
        AbstractC4767 abstractC4767Mo9006;
        String strM9472;
        C4265 c4265 = this.f13888.f13867;
        InterfaceC5087 interfaceC5087 = C4742.f13832[19];
        c4265.getClass();
        interfaceC5087.getClass();
        if (!((Boolean) c4265.f12802).booleanValue() || (abstractC4767Mo9006 = interfaceC4454.mo9006()) == null || (strM9472 = m9472(abstractC4767Mo9006)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m9488(strM9472));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String m9478(AbstractC4881 abstractC4881, boolean z) {
        String strM9496 = m9496(abstractC4881);
        return ((!m9456(abstractC4881) || AbstractC4916.m9850(abstractC4881)) && !(abstractC4881 instanceof C4905) && (!z || abstractC4881.getAnnotations().isEmpty())) ? strM9496 : AbstractC6136.m11558(')', "(", strM9496);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final String m9479(String str, String str2, AbstractC6529 abstractC6529) {
        str.getClass();
        str2.getClass();
        int i = 0;
        if (AbstractC6560.m12042(str, str2)) {
            return AbstractC5138.m10125(str2, "(", false) ? AbstractC0053.m156("(", str, ")!") : str.concat("!");
        }
        String strM12016 = AbstractC6560.m12016(str, str2, new C4733(this, abstractC6529, i), new C4733(this, abstractC6529, 1), new DescriptorRendererImpl$renderFlexibleType$3(this));
        if (strM12016 != null) {
            return strM12016;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final String m9480(String str) {
        int i = AbstractC4739.f13830[m9482().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return AbstractC0053.m156("<font color=red><b>", str, "</b></font>");
        }
        C4210.m8621();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9438(LinkedHashSet linkedHashSet) {
        this.f13888.mo9438(linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9439(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f13888.mo9439(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9440(Set set) {
        set.getClass();
        this.f13888.mo9440(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9441() {
        this.f13888.mo9441();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9442() {
        this.f13888.mo9442();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9443() {
        this.f13888.mo9443();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4734 m9481() {
        C4265 c4265 = this.f13888.f13846;
        InterfaceC5087 interfaceC5087 = C4742.f13832[27];
        c4265.getClass();
        interfaceC5087.getClass();
        return (C4734) c4265.f12802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RenderingFormat m9482() {
        C4265 c4265 = this.f13888.f13845;
        InterfaceC5087 interfaceC5087 = C4742.f13832[28];
        c4265.getClass();
        interfaceC5087.getClass();
        return (RenderingFormat) c4265.f12802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String m9483(InterfaceC4498 interfaceC4498) {
        InterfaceC4498 interfaceC4498Mo9038;
        String str;
        interfaceC4498.getClass();
        StringBuilder sb = new StringBuilder();
        interfaceC4498.mo9037(new C2242(this, 22), sb);
        C4742 c4742 = this.f13888;
        C4265 c4265 = c4742.f13860;
        InterfaceC5087[] interfaceC5087Arr = C4742.f13832;
        interfaceC5087Arr[1].getClass();
        if (((Boolean) c4265.f12802).booleanValue() && !(interfaceC4498 instanceof InterfaceC4465) && !(interfaceC4498 instanceof C7003) && (interfaceC4498Mo9038 = interfaceC4498.mo9038()) != null && !(interfaceC4498Mo9038 instanceof InterfaceC4485)) {
            sb.append(" ");
            int i = AbstractC4739.f13830[m9482().ordinal()];
            if (i == 1) {
                str = "defined in";
            } else {
                if (i != 2) {
                    C4210.m8621();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C4685 c4685M12073 = AbstractC6869.m12073(interfaceC4498Mo9038);
            c4685M12073.getClass();
            sb.append(c4685M12073.m9324() ? "root package" : m9488(AbstractC6560.m12015(C4685.m9321(c4685M12073))));
            C4265 c42652 = c4742.f13859;
            interfaceC5087Arr[2].getClass();
            if (((Boolean) c42652.f12802).booleanValue() && (interfaceC4498Mo9038 instanceof InterfaceC4465) && (interfaceC4498 instanceof InterfaceC4499)) {
                ((InterfaceC4499) interfaceC4498).mo9036().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String m9484(InterfaceC6477 interfaceC6477, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        C7017 c7017Mo9028;
        List listMo9045;
        interfaceC6477.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        AbstractC4881 type = interfaceC6477.getType();
        sb.append(m9496(type));
        C4742 c4742 = this.f13888;
        if (c4742.m9451().getIncludeAnnotationArguments()) {
            Map mapMo9186 = interfaceC6477.mo9186();
            C4265 c4265 = c4742.f13852;
            InterfaceC5087 interfaceC5087 = C4742.f13832[33];
            c4265.getClass();
            interfaceC5087.getClass();
            List list = null;
            AbstractC6988 abstractC6988M9510 = ((Boolean) c4265.f12802).booleanValue() ? AbstractC4772.m9510(interfaceC6477) : null;
            if (abstractC6988M9510 != null && (c7017Mo9028 = abstractC6988M9510.mo9028()) != null && (listMo9045 = c7017Mo9028.mo9045()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo9045) {
                    if (((C6978) ((InterfaceC4455) obj)).m12263()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC7008) ((InterfaceC4455) it.next())).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapMo9186.containsKey((C4690) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C4690) it2.next()).m9345() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo9186.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                C4690 c4690 = (C4690) entry.getKey();
                AbstractC4767 abstractC4767 = (AbstractC4767) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4690.m9345());
                sb2.append(" = ");
                sb2.append(!list.contains(c4690) ? m9472(abstractC4767) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM8814 = AbstractC4343.m8814(AbstractC4343.m8825(arrayList5, arrayList4));
            if (c4742.m9451().getIncludeEmptyAnnotationArguments() || !listM8814.isEmpty()) {
                AbstractC4343.m8829(listM8814, sb, ", ", "(", ")", null, 112);
            }
        }
        if (m9485() && (AbstractC4892.m9835(type) || (type.mo9732().mo9221() instanceof C4466))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m9485() {
        C4265 c4265 = this.f13888.f13880;
        InterfaceC5087 interfaceC5087 = C4742.f13832[8];
        c4265.getClass();
        interfaceC5087.getClass();
        return ((Boolean) c4265.f12802).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9444() {
        this.f13888.mo9444();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set m9486() {
        C4265 c4265 = this.f13888.f13858;
        InterfaceC5087 interfaceC5087 = C4742.f13832[3];
        c4265.getClass();
        interfaceC5087.getClass();
        return (Set) c4265.f12802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m9487() {
        C4265 c4265 = this.f13888.f13857;
        InterfaceC5087 interfaceC5087 = C4742.f13832[4];
        c4265.getClass();
        interfaceC5087.getClass();
        return ((Boolean) c4265.f12802).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final String m9488(String str) {
        return m9482().escape(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4736 m9489() {
        C4265 c4265 = this.f13888.f13861;
        C4742.f13832[0].getClass();
        return (C4736) c4265.f12802;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9445(C4736 c4736) {
        this.f13888.mo9445(c4736);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9446() {
        this.f13888.mo9446();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9447() {
        this.f13888.mo9447();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9448() {
        return this.f13888.mo9448();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9449(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f13888.mo9449(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9450() {
        this.f13888.mo9450();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m9490(List list, StringBuilder sb) {
        C4265 c4265 = this.f13888.f13865;
        InterfaceC5087 interfaceC5087 = C4742.f13832[21];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4462 interfaceC4462 = (InterfaceC4462) it.next();
            List upperBounds = interfaceC4462.getUpperBounds();
            upperBounds.getClass();
            for (AbstractC4881 abstractC4881 : AbstractC4343.m8792(1, upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C4690 name = interfaceC4462.getName();
                name.getClass();
                sb2.append(m9464(name, false));
                sb2.append(" : ");
                abstractC4881.getClass();
                sb2.append(m9496(abstractC4881));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m9476("where"));
        sb.append(" ");
        AbstractC4343.m8829(arrayList, sb, ", ", null, null, null, 124);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m9491(C4489 c4489, StringBuilder sb) {
        if (!m9486().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        C4742 c4742 = this.f13888;
        C4265 c4265 = c4742.f13869;
        InterfaceC5087[] interfaceC5087Arr = C4742.f13832;
        InterfaceC5087 interfaceC5087 = interfaceC5087Arr[12];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue()) {
            c4489 = AbstractC4488.m9082(c4489.f13127.mo9108());
        }
        C4265 c42652 = c4742.f13873;
        InterfaceC5087 interfaceC50872 = interfaceC5087Arr[13];
        c42652.getClass();
        interfaceC50872.getClass();
        if (!((Boolean) c42652.f12802).booleanValue() && AbstractC4394.m8917(c4489, AbstractC4488.f13125)) {
            return false;
        }
        sb.append(m9476(c4489.f13127.mo9109()));
        sb.append(" ");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9492(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏兰哲世 r0 = r7.f13888
            io.ktor.websocket.飘花落叶言子楪兰世苏哲 r0 = r0.f13856
            kotlin.reflect.飘花落叶言子世楪苏哲兰[] r1 = kotlin.reflect.jvm.internal.impl.renderer.C4742.f13832
            r2 = 29
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            java.lang.Object r0 = r0.f12802
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r0
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.AbstractC4739.f13829
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2e
            r3 = 2
            if (r0 == r3) goto L2c
            r10 = 3
            if (r0 != r10) goto L28
        L26:
            r10 = r1
            goto L2f
        L28:
            io.ktor.util.C4210.m8621()
            return
        L2c:
            if (r10 != 0) goto L26
        L2e:
            r10 = r2
        L2f:
            int r0 = r9.size()
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r3 = r7.m9481()
            r3.getClass()
            r8.getClass()
            java.lang.String r3 = "("
            r8.append(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
        L47:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L74
            int r4 = r3 + 1
            java.lang.Object r5 = r9.next()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455) r5
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r6 = r7.m9481()
            r6.getClass()
            r5.getClass()
            r7.m9493(r5, r10, r8, r1)
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r5 = r7.m9481()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L72
            java.lang.String r3 = ", "
            r8.append(r3)
        L72:
            r3 = r4
            goto L47
        L74:
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r7 = r7.m9481()
            r7.getClass()
            java.lang.String r7 = ")"
            r8.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4743.m9492(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9493(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4743.m9493(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m9494(InterfaceC4454 interfaceC4454, StringBuilder sb, boolean z) {
        if (z || !(interfaceC4454 instanceof InterfaceC4455)) {
            sb.append(m9476(interfaceC4454.mo9005() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m9495(StringBuilder sb, List list, boolean z) {
        C4265 c4265 = this.f13888.f13865;
        InterfaceC5087 interfaceC5087 = C4742.f13832[21];
        c4265.getClass();
        interfaceC5087.getClass();
        if (((Boolean) c4265.f12802).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m9488("<"));
        m9498(list, sb);
        sb.append(m9488(">"));
        if (z) {
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final String m9496(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        StringBuilder sb = new StringBuilder();
        C4265 c4265 = this.f13888.f13850;
        InterfaceC5087 interfaceC5087 = C4742.f13832[23];
        c4265.getClass();
        interfaceC5087.getClass();
        m9461(sb, (AbstractC4881) ((InterfaceC6557) c4265.f12802).invoke(abstractC4881));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m9497(InterfaceC4462 interfaceC4462, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m9488("<"));
        }
        if (m9485()) {
            sb.append("/*");
            sb.append(interfaceC4462.getIndex());
            sb.append("*/ ");
        }
        m9468(sb, interfaceC4462.mo9014(), "reified");
        String label = interfaceC4462.mo9013().getLabel();
        boolean z2 = true;
        m9468(sb, label.length() > 0, label);
        m9474(sb, interfaceC4462, null);
        m9465(interfaceC4462, sb, z);
        int size = interfaceC4462.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC4881 abstractC4881 = (AbstractC4881) interfaceC4462.getUpperBounds().iterator().next();
            if (abstractC4881 == null) {
                AbstractC6529.m11977(141);
                throw null;
            }
            if (!AbstractC6529.m11979(abstractC4881) || !abstractC4881.mo9735()) {
                sb.append(" : ");
                sb.append(m9496(abstractC4881));
            }
        } else if (z) {
            for (AbstractC4881 abstractC48812 : interfaceC4462.getUpperBounds()) {
                if (abstractC48812 == null) {
                    AbstractC6529.m11977(141);
                    throw null;
                }
                if (!AbstractC6529.m11979(abstractC48812) || !abstractC48812.mo9735()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m9496(abstractC48812));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m9488(">"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m9498(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m9497((InterfaceC4462) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final String m9499(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m9488("<"));
        AbstractC4343.m8829(list, sb, ", ", null, null, new C4731(this, 0), 60);
        sb.append(m9488(">"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final String m9500(InterfaceC4872 interfaceC4872) {
        interfaceC4872.getClass();
        InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872.mo9221();
        if ((interfaceC4476Mo9221 instanceof InterfaceC4462) || (interfaceC4476Mo9221 instanceof AbstractC6988) || (interfaceC4476Mo9221 instanceof AbstractC6995)) {
            interfaceC4476Mo9221.getClass();
            return C7239.m12440(interfaceC4476Mo9221) ? interfaceC4476Mo9221.mo9011().toString() : m9489().m9437(interfaceC4476Mo9221, this);
        }
        if (interfaceC4476Mo9221 == null) {
            return interfaceC4872 instanceof C4882 ? ((C4882) interfaceC4872).m9780(C4732.f13815) : interfaceC4872.toString();
        }
        C0276.m844(interfaceC4476Mo9221.getClass(), "Unexpected classifier: ");
        return null;
    }
}
