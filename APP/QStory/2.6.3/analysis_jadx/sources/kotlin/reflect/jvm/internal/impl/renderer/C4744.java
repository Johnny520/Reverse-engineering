package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.runtime.C1322;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4211;
import io.ktor.websocket.C4266;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4467;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4764;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4880;
import kotlin.reflect.jvm.internal.impl.types.C4883;
import kotlin.reflect.jvm.internal.impl.types.C4895;
import kotlin.reflect.jvm.internal.impl.types.C4906;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p046.InterfaceC6478;
import p046.InterfaceC6479;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p079.AbstractC7009;
import p079.C6979;
import p079.C6990;
import p079.C6991;
import p079.C7004;
import p079.C7006;
import p079.C7011;
import p079.C7018;
import p098.C7238;
import p098.C7240;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4744 implements InterfaceC4742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f13887 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4744 f13888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4744 f13889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4744 f13890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f13891 = AbstractC5187.m10214(new C1322(this, 5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4743 f13892;

    static {
        C4743 c4743 = new C4743();
        c4743.mo9430(EmptySet.INSTANCE);
        c4743.f13866 = true;
        new C4744(c4743);
        C4743 c47432 = new C4743();
        c47432.mo9437();
        c47432.f13866 = true;
        new C4744(c47432);
        C4743 c47433 = new C4743();
        c47433.mo9437();
        c47433.mo9430(EmptySet.INSTANCE);
        c47433.f13866 = true;
        new C4744(c47433);
        C4743 c47434 = new C4743();
        c47434.mo9437();
        c47434.mo9430(EmptySet.INSTANCE);
        c47434.mo9434();
        c47434.f13866 = true;
        new C4744(c47434);
        C4743 c47435 = new C4743();
        c47435.mo9430(EmptySet.INSTANCE);
        C4737 c4737 = C4737.f13828;
        c47435.mo9435(c4737);
        c47435.mo9429(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c47435.f13866 = true;
        new C4744(c47435);
        C4743 c47436 = new C4743();
        c47436.mo9437();
        c47436.mo9430(EmptySet.INSTANCE);
        c47436.mo9435(c4737);
        c47436.mo9436();
        c47436.mo9429(ParameterNameRenderingPolicy.NONE);
        c47436.mo9433();
        c47436.mo9431();
        c47436.mo9434();
        c47436.mo9440();
        c47436.f13866 = true;
        new C4744(c47436);
        C4743 c47437 = new C4743();
        c47437.mo9430(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        c47437.f13866 = true;
        f13890 = new C4744(c47437);
        C4743 c47438 = new C4743();
        c47438.mo9430(DescriptorRendererModifier.ALL);
        c47438.f13866 = true;
        new C4744(c47438);
        C4743 c47439 = new C4743();
        c47439.mo9435(c4737);
        c47439.mo9429(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        c47439.f13866 = true;
        f13889 = new C4744(c47439);
        C4743 c474310 = new C4743();
        c474310.mo9432();
        c474310.mo9435(C4737.f13829);
        c474310.mo9430(DescriptorRendererModifier.ALL);
        c474310.f13866 = true;
        f13888 = new C4744(c474310);
        C4743 c474311 = new C4743();
        c474311.mo9439(RenderingFormat.HTML);
        c474311.mo9430(DescriptorRendererModifier.ALL);
        c474311.f13866 = true;
        new C4744(c474311);
    }

    public C4744(C4743 c4743) {
        this.f13892 = c4743;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static Modality m9444(InterfaceC4487 interfaceC4487) {
        if (interfaceC4487 instanceof AbstractC6989) {
            return ((AbstractC6989) interfaceC4487).mo9010() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4487.mo9028();
        AbstractC6989 abstractC6989 = interfaceC4499Mo9028 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4499Mo9028 : null;
        if (abstractC6989 == null) {
            return Modality.FINAL;
        }
        if (!(interfaceC4487 instanceof InterfaceC4480)) {
            return Modality.FINAL;
        }
        InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC4487;
        Collection collectionMo9030 = interfaceC4480.mo9030();
        collectionMo9030.getClass();
        if (!collectionMo9030.isEmpty() && abstractC6989.mo9009() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (abstractC6989.mo9010() != ClassKind.INTERFACE || AbstractC4395.m8907(interfaceC4480.getVisibility(), AbstractC4489.f13120)) {
            return Modality.FINAL;
        }
        Modality modalityMo9009 = interfaceC4480.mo9009();
        Modality modality = Modality.ABSTRACT;
        return modalityMo9009 == modality ? modality : Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m9445(C4744 c4744, InterfaceC4473 interfaceC4473, StringBuilder sb) {
        boolean zM9477 = c4744.m9477();
        C4743 c4743 = c4744.f13892;
        if (!zM9477) {
            C4266 c4266 = c4743.f13880;
            InterfaceC5088[] interfaceC5088Arr = C4743.f13836;
            InterfaceC5088 interfaceC5088 = interfaceC5088Arr[5];
            c4266.getClass();
            interfaceC5088.getClass();
            if (!((Boolean) c4266.f12806).booleanValue()) {
                List listMo9037 = interfaceC4473.mo9037();
                listMo9037.getClass();
                c4744.m9461(listMo9037, sb);
                if (c4744.m9476().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    c4744.m9464(sb, interfaceC4473, null);
                    C7011 c7011Mo9024 = interfaceC4473.mo9024();
                    if (c7011Mo9024 != null) {
                        c4744.m9464(sb, c7011Mo9024, AnnotationUseSiteTarget.FIELD);
                    }
                    C7011 c7011Mo9021 = interfaceC4473.mo9021();
                    if (c7011Mo9021 != null) {
                        c4744.m9464(sb, c7011Mo9021, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    C4266 c42662 = c4743.f13857;
                    InterfaceC5088 interfaceC50882 = interfaceC5088Arr[32];
                    c42662.getClass();
                    interfaceC50882.getClass();
                    if (((PropertyAccessorRenderingPolicy) c42662.f12806) == PropertyAccessorRenderingPolicy.NONE) {
                        C6991 getter = interfaceC4473.getGetter();
                        if (getter != null) {
                            c4744.m9464(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        C6990 setter = interfaceC4473.getSetter();
                        if (setter != null) {
                            c4744.m9464(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List listMo9035 = setter.mo9035();
                            listMo9035.getClass();
                            InterfaceC4456 interfaceC4456 = (InterfaceC4456) AbstractC4344.m8779(listMo9035);
                            interfaceC4456.getClass();
                            c4744.m9464(sb, interfaceC4456, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                C4490 visibility = interfaceC4473.getVisibility();
                visibility.getClass();
                c4744.m9481(visibility, sb);
                c4744.m9458(sb, c4744.m9476().contains(DescriptorRendererModifier.CONST) && interfaceC4473.isConst(), "const");
                c4744.m9457(interfaceC4473, sb);
                c4744.m9459(interfaceC4473, sb);
                c4744.m9453(interfaceC4473, sb);
                c4744.m9458(sb, c4744.m9476().contains(DescriptorRendererModifier.LATEINIT) && interfaceC4473.mo8997(), "lateinit");
                c4744.m9465(interfaceC4473, sb);
            }
            c4744.m9484(interfaceC4473, sb, false);
            List typeParameters = interfaceC4473.getTypeParameters();
            typeParameters.getClass();
            c4744.m9485(sb, typeParameters, true);
            c4744.m9448(interfaceC4473, sb);
        }
        c4744.m9455(interfaceC4473, sb, true);
        sb.append(": ");
        AbstractC4882 type = interfaceC4473.getType();
        type.getClass();
        sb.append(c4744.m9486(type));
        c4744.m9449(interfaceC4473, sb);
        c4744.m9467(interfaceC4473, sb);
        List typeParameters2 = interfaceC4473.getTypeParameters();
        typeParameters2.getClass();
        c4744.m9480(typeParameters2, sb);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m9446(AbstractC4882 abstractC4882) {
        if (!AbstractC2905.m6302(abstractC4882)) {
            return false;
        }
        List listMo9726 = abstractC4882.mo9726();
        if (listMo9726 != null && listMo9726.isEmpty()) {
            return true;
        }
        Iterator it = listMo9726.iterator();
        while (it.hasNext()) {
            if (((AbstractC4870) it.next()).mo9740()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m9447(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m9448(InterfaceC4480 interfaceC4480, StringBuilder sb) {
        C7006 c7006Mo9032 = interfaceC4480.mo9032();
        if (c7006Mo9032 != null) {
            m9464(sb, c7006Mo9032, AnnotationUseSiteTarget.RECEIVER);
            AbstractC4882 type = c7006Mo9032.getType();
            type.getClass();
            sb.append(m9468(type, false));
            sb.append(".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m9449(InterfaceC4480 interfaceC4480, StringBuilder sb) {
        C7006 c7006Mo9032;
        C4266 c4266 = this.f13892.f13859;
        InterfaceC5088 interfaceC5088 = C4743.f13836[30];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue() && (c7006Mo9032 = interfaceC4480.mo9032()) != null) {
            sb.append(" on ");
            AbstractC4882 type = c7006Mo9032.getType();
            type.getClass();
            sb.append(m9486(type));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m9450(StringBuilder sb, AbstractC4882 abstractC4882) throws IOException {
        C4691 c4691M6324;
        String strM9478;
        boolean z = abstractC4882 instanceof C4880;
        C4743 c4743 = this.f13892;
        if (z && c4743.m9442() && !((C4880) abstractC4882).f14185.m9575()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            sb.append(((AbstractC4896) abstractC4914Mo9772).mo9835(this, this));
            return;
        }
        if (!(abstractC4914Mo9772 instanceof AbstractC4878)) {
            C4211.m8611();
            return;
        }
        AbstractC4878 abstractC4878 = (AbstractC4878) abstractC4914Mo9772;
        if (abstractC4878.equals(AbstractC4917.f14246) || abstractC4878.mo9722() == AbstractC4917.f14247.f19284) {
            sb.append("???");
            return;
        }
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4878.mo9722();
        int i = 0;
        if ((interfaceC4873Mo9722 instanceof C7238) && ((C7238) interfaceC4873Mo9722).f19278 == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
            C4266 c4266 = c4743.f13867;
            InterfaceC5088 interfaceC5088 = C4743.f13836[18];
            c4266.getClass();
            interfaceC5088.getClass();
            if (!((Boolean) c4266.f12806).booleanValue()) {
                sb.append("???");
                return;
            }
            InterfaceC4873 interfaceC4873Mo97222 = abstractC4878.mo9722();
            interfaceC4873Mo97222.getClass();
            sb.append(m9470(((C7238) interfaceC4873Mo97222).f19276[0]));
            return;
        }
        if (AbstractC4893.m9829(abstractC4878)) {
            m9460(sb, abstractC4878);
            return;
        }
        if (!m9446(abstractC4878)) {
            m9460(sb, abstractC4878);
            return;
        }
        int length = sb.length();
        ((C4744) this.f13891.getValue()).m9464(sb, abstractC4878, null);
        boolean z2 = sb.length() != length;
        AbstractC4882 abstractC4882M6300 = AbstractC2905.m6300(abstractC4878);
        List listM6318 = AbstractC2905.m6318(abstractC4878);
        boolean zM6291 = AbstractC2905.m6291(abstractC4878);
        boolean zMo9725 = abstractC4878.mo9725();
        boolean z3 = zMo9725 || (z2 && abstractC4882M6300 != null);
        if (z3) {
            if (zM6291) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    AbstractC7739.m13064(AbstractC5144.m10168(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        m9458(sb, zM6291, "suspend");
        if (!listM6318.isEmpty()) {
            sb.append("context(");
            Iterator it = listM6318.subList(0, listM6318.size() - 1).iterator();
            while (it.hasNext()) {
                m9451(sb, (AbstractC4882) it.next());
                sb.append(", ");
            }
            m9451(sb, (AbstractC4882) AbstractC4344.m8808(listM6318));
            sb.append(") ");
        }
        if (abstractC4882M6300 != null) {
            boolean z4 = (m9446(abstractC4882M6300) && !abstractC4882M6300.mo9725()) || AbstractC2905.m6291(abstractC4882M6300) || !abstractC4882M6300.getAnnotations().isEmpty() || (abstractC4882M6300 instanceof C4906);
            if (z4) {
                sb.append("(");
            }
            m9451(sb, abstractC4882M6300);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AbstractC2905.m6302(abstractC4878) || abstractC4878.getAnnotations().mo9517(AbstractC6527.f17897) == null || abstractC4878.mo9726().size() > 1) {
            int i2 = 0;
            for (AbstractC4870 abstractC4870 : AbstractC2905.m6306(abstractC4878)) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append(", ");
                }
                C4266 c42662 = c4743.f13837;
                InterfaceC5088 interfaceC50882 = C4743.f13836[45];
                c42662.getClass();
                interfaceC50882.getClass();
                if (((Boolean) c42662.f12806).booleanValue()) {
                    AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9741();
                    abstractC4882Mo9741.getClass();
                    c4691M6324 = AbstractC2905.m6324(abstractC4882Mo9741);
                } else {
                    c4691M6324 = null;
                }
                if (c4691M6324 != null) {
                    sb.append(m9454(c4691M6324, false));
                    sb.append(": ");
                }
                abstractC4870.getClass();
                StringBuilder sb2 = new StringBuilder();
                AbstractC4344.m8809(AbstractC6347.m11928(abstractC4870), sb2, ", ", null, null, new C4732(this, i), 60);
                sb.append(sb2.toString());
                i2 = i3;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int i4 = AbstractC4740.f13834[m9472().ordinal()];
        if (i4 == 1) {
            strM9478 = m9478("->");
        } else {
            if (i4 != 2) {
                C4211.m8611();
                return;
            }
            strM9478 = "&rarr;";
        }
        sb.append(strM9478);
        sb.append(" ");
        AbstractC2905.m6302(abstractC4878);
        AbstractC4882 abstractC4882Mo97412 = ((AbstractC4870) AbstractC4344.m8808(abstractC4878.mo9726())).mo9741();
        abstractC4882Mo97412.getClass();
        m9451(sb, abstractC4882Mo97412);
        if (z3) {
            sb.append(")");
        }
        if (zMo9725) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m9451(StringBuilder sb, AbstractC4882 abstractC4882) {
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        C4895 c4895 = abstractC4914Mo9772 instanceof C4895 ? (C4895) abstractC4914Mo9772 : null;
        if (c4895 == null) {
            m9450(sb, abstractC4882);
            return;
        }
        AbstractC4878 abstractC4878 = c4895.f14215;
        AbstractC4878 abstractC48782 = c4895.f14214;
        C4743 c4743 = this.f13892;
        C4266 c4266 = c4743.f13839;
        InterfaceC5088[] interfaceC5088Arr = C4743.f13836;
        InterfaceC5088 interfaceC5088 = interfaceC5088Arr[42];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue()) {
            m9450(sb, abstractC48782);
            C4266 c42662 = c4743.f13842;
            InterfaceC5088 interfaceC50882 = interfaceC5088Arr[43];
            c42662.getClass();
            interfaceC50882.getClass();
            if (((Boolean) c42662.f12806).booleanValue()) {
                RenderingFormat renderingFormatM9472 = m9472();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (renderingFormatM9472 == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m9450(sb, abstractC4878);
                sb.append(" */");
                if (m9472() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m9450(sb, abstractC4878);
        C4266 c42663 = c4743.f13840;
        InterfaceC5088 interfaceC50883 = interfaceC5088Arr[41];
        c42663.getClass();
        interfaceC50883.getClass();
        if (((Boolean) c42663.f12806).booleanValue()) {
            RenderingFormat renderingFormatM94722 = m9472();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (renderingFormatM94722 == renderingFormat2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m9450(sb, abstractC48782);
            sb.append(" */");
            if (m9472() == renderingFormat2) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m9452(StringBuilder sb, C0108 c0108) {
        C0108 c01082 = (C0108) c0108.f318;
        InterfaceC4496 interfaceC4496 = (InterfaceC4496) c0108.f319;
        if (c01082 != null) {
            m9452(sb, c01082);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            C4691 name = interfaceC4496.getName();
            name.getClass();
            sb.append(m9454(name, false));
        } else {
            InterfaceC4873 interfaceC4873Mo9001 = interfaceC4496.mo9001();
            interfaceC4873Mo9001.getClass();
            sb.append(m9490(interfaceC4873Mo9001));
        }
        sb.append(m9489((List) c0108.f320));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m9453(InterfaceC4480 interfaceC4480, StringBuilder sb) {
        if (m9476().contains(DescriptorRendererModifier.OVERRIDE) && !interfaceC4480.mo9030().isEmpty()) {
            C4266 c4266 = this.f13892.f13851;
            InterfaceC5088 interfaceC5088 = C4743.f13836[26];
            c4266.getClass();
            interfaceC5088.getClass();
            if (((OverrideRenderingPolicy) c4266.f12806) != OverrideRenderingPolicy.RENDER_OPEN) {
                m9458(sb, true, "override");
                if (m9475()) {
                    sb.append("/*");
                    sb.append(interfaceC4480.mo9030().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final String m9454(C4691 c4691, boolean z) {
        String strM9478 = m9478(AbstractC3065.m6815(c4691));
        C4266 c4266 = this.f13892.f13886;
        InterfaceC5088 interfaceC5088 = C4743.f13836[48];
        c4266.getClass();
        interfaceC5088.getClass();
        return (((Boolean) c4266.f12806).booleanValue() && m9472() == RenderingFormat.HTML && z) ? AbstractC0053.m158("<b>", strM9478, "</b>") : strM9478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m9455(InterfaceC4499 interfaceC4499, StringBuilder sb, boolean z) {
        C4691 name = interfaceC4499.getName();
        name.getClass();
        sb.append(m9454(name, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m9456(Modality modality, StringBuilder sb, Modality modality2) {
        C4266 c4266 = this.f13892.f13878;
        InterfaceC5088 interfaceC5088 = C4743.f13836[14];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue() || modality != modality2) {
            m9458(sb, m9476().contains(DescriptorRendererModifier.MODALITY), AbstractC5062.m10015(modality.name()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m9457(InterfaceC4487 interfaceC4487, StringBuilder sb) {
        m9458(sb, interfaceC4487.isExternal(), "external");
        boolean z = false;
        m9458(sb, m9476().contains(DescriptorRendererModifier.EXPECT) && interfaceC4487.mo9008(), "expect");
        if (m9476().contains(DescriptorRendererModifier.ACTUAL) && interfaceC4487.mo9016()) {
            z = true;
        }
        m9458(sb, z, "actual");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m9458(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m9466(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m9459(InterfaceC4480 interfaceC4480, StringBuilder sb) {
        if (AbstractC6870.m12109(interfaceC4480) && interfaceC4480.mo9009() == Modality.FINAL) {
            return;
        }
        C4266 c4266 = this.f13892.f13851;
        InterfaceC5088 interfaceC5088 = C4743.f13836[26];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((OverrideRenderingPolicy) c4266.f12806) == OverrideRenderingPolicy.RENDER_OVERRIDE && interfaceC4480.mo9009() == Modality.OPEN && !interfaceC4480.mo9030().isEmpty()) {
            return;
        }
        Modality modalityMo9009 = interfaceC4480.mo9009();
        modalityMo9009.getClass();
        m9456(modalityMo9009, sb, m9444(interfaceC4480));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9460(java.lang.StringBuilder r7, kotlin.reflect.jvm.internal.impl.types.AbstractC4878 r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4744.m9460(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m9461(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            AbstractC4882 type = ((C7006) it.next()).getType();
            type.getClass();
            sb.append(m9468(type, true));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final String m9462(AbstractC4768 abstractC4768) {
        C4266 c4266 = this.f13892.f13872;
        InterfaceC5088 interfaceC5088 = C4743.f13836[20];
        c4266.getClass();
        interfaceC5088.getClass();
        InterfaceC6558 interfaceC6558 = (InterfaceC6558) c4266.f12806;
        if (interfaceC6558 != null) {
            return (String) interfaceC6558.invoke(abstractC4768);
        }
        if (abstractC4768 instanceof C4753) {
            Iterable iterable = (Iterable) ((C4753) abstractC4768).f13905;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM9462 = m9462((AbstractC4768) it.next());
                if (strM9462 != null) {
                    arrayList.add(strM9462);
                }
            }
            return AbstractC4344.m8810(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC4768 instanceof C4754) {
            return AbstractC5144.m10147(m9474((InterfaceC6478) ((C4754) abstractC4768).f13905, null), "@");
        }
        if (!(abstractC4768 instanceof C4759)) {
            return abstractC4768.toString();
        }
        AbstractC4755 abstractC4755 = (AbstractC4755) ((C4759) abstractC4768).f13905;
        if (abstractC4755 instanceof C4764) {
            return ((C4764) abstractC4755).f13902 + "::class";
        }
        if (!(abstractC4755 instanceof C4756)) {
            C4211.m8611();
            return null;
        }
        C4749 c4749 = ((C4756) abstractC4755).f13899;
        String strM11590 = c4749.f13896.m9327().f13696.f13693;
        int i = c4749.f13895;
        for (int i2 = 0; i2 < i; i2++) {
            strM11590 = AbstractC6183.m11590('>', "kotlin.Array<", strM11590);
        }
        return AbstractC0053.m136(strM11590, "::class");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m9463(InterfaceC4496 interfaceC4496, StringBuilder sb) {
        List listMo9015 = interfaceC4496.mo9015();
        listMo9015.getClass();
        List parameters = interfaceC4496.mo9001().getParameters();
        parameters.getClass();
        if (m9475() && interfaceC4496.mo9011() && parameters.size() > listMo9015.size()) {
            sb.append(" /*captured type parameters: ");
            m9488(parameters.subList(listMo9015.size(), parameters.size()), sb);
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m9464(StringBuilder sb, InterfaceC6479 interfaceC6479, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set setMo9438;
        if (m9476().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            boolean z = interfaceC6479 instanceof AbstractC4882;
            C4743 c4743 = this.f13892;
            if (z) {
                setMo9438 = c4743.mo9438();
            } else {
                C4266 c4266 = c4743.f13846;
                InterfaceC5088 interfaceC5088 = C4743.f13836[35];
                c4266.getClass();
                interfaceC5088.getClass();
                setMo9438 = (Set) c4266.f12806;
            }
            C4266 c42662 = c4743.f13848;
            InterfaceC5088 interfaceC50882 = C4743.f13836[37];
            c42662.getClass();
            interfaceC50882.getClass();
            InterfaceC6558 interfaceC6558 = (InterfaceC6558) c42662.f12806;
            for (InterfaceC6478 interfaceC6478 : interfaceC6479.getAnnotations()) {
                if (!AbstractC4344.m8806(setMo9438, interfaceC6478.mo9178()) && !AbstractC4395.m8907(interfaceC6478.mo9178(), AbstractC6527.f17895) && (interfaceC6558 == null || ((Boolean) interfaceC6558.invoke(interfaceC6478)).booleanValue())) {
                    sb.append(m9474(interfaceC6478, annotationUseSiteTarget));
                    C4266 c42663 = c4743.f13855;
                    InterfaceC5088 interfaceC50883 = C4743.f13836[34];
                    c42663.getClass();
                    interfaceC50883.getClass();
                    if (((Boolean) c42663.f12806).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m9465(InterfaceC4480 interfaceC4480, StringBuilder sb) {
        if (m9476().contains(DescriptorRendererModifier.MEMBER_KIND) && m9475() && interfaceC4480.getKind() != CallableMemberDescriptor$Kind.DECLARATION) {
            sb.append("/*");
            sb.append(AbstractC5062.m10015(interfaceC4480.getKind().name()));
            sb.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final String m9466(String str) {
        int i = AbstractC4740.f13834[m9472().ordinal()];
        if (i != 1) {
            if (i != 2) {
                C4211.m8611();
                return null;
            }
            C4266 c4266 = this.f13892.f13886;
            InterfaceC5088 interfaceC5088 = C4743.f13836[48];
            c4266.getClass();
            interfaceC5088.getClass();
            if (!((Boolean) c4266.f12806).booleanValue()) {
                return AbstractC0053.m158("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m9467(InterfaceC4455 interfaceC4455, StringBuilder sb) {
        AbstractC4768 abstractC4768Mo8996;
        String strM9462;
        C4266 c4266 = this.f13892.f13871;
        InterfaceC5088 interfaceC5088 = C4743.f13836[19];
        c4266.getClass();
        interfaceC5088.getClass();
        if (!((Boolean) c4266.f12806).booleanValue() || (abstractC4768Mo8996 = interfaceC4455.mo8996()) == null || (strM9462 = m9462(abstractC4768Mo8996)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m9478(strM9462));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String m9468(AbstractC4882 abstractC4882, boolean z) {
        String strM9486 = m9486(abstractC4882);
        return ((!m9446(abstractC4882) || AbstractC4917.m9844(abstractC4882)) && !(abstractC4882 instanceof C4906) && (!z || abstractC4882.getAnnotations().isEmpty())) ? strM9486 : AbstractC6183.m11590(')', "(", strM9486);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final String m9469(String str, String str2, AbstractC6530 abstractC6530) {
        str.getClass();
        str2.getClass();
        int i = 0;
        if (AbstractC3065.m6801(str, str2)) {
            return AbstractC5139.m10139(str2, "(", false) ? AbstractC0053.m158("(", str, ")!") : str.concat("!");
        }
        String strM6814 = AbstractC3065.m6814(str, str2, new C4734(this, abstractC6530, i), new C4734(this, abstractC6530, 1), new DescriptorRendererImpl$renderFlexibleType$3(this));
        if (strM6814 != null) {
            return strM6814;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final String m9470(String str) {
        int i = AbstractC4740.f13834[m9472().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return AbstractC0053.m158("<font color=red><b>", str, "</b></font>");
        }
        C4211.m8611();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9428(LinkedHashSet linkedHashSet) {
        this.f13892.mo9428(linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9429(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f13892.mo9429(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9430(Set set) {
        set.getClass();
        this.f13892.mo9430(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9431() {
        this.f13892.mo9431();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9432() {
        this.f13892.mo9432();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9433() {
        this.f13892.mo9433();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4735 m9471() {
        C4266 c4266 = this.f13892.f13850;
        InterfaceC5088 interfaceC5088 = C4743.f13836[27];
        c4266.getClass();
        interfaceC5088.getClass();
        return (C4735) c4266.f12806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RenderingFormat m9472() {
        C4266 c4266 = this.f13892.f13849;
        InterfaceC5088 interfaceC5088 = C4743.f13836[28];
        c4266.getClass();
        interfaceC5088.getClass();
        return (RenderingFormat) c4266.f12806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String m9473(InterfaceC4499 interfaceC4499) {
        InterfaceC4499 interfaceC4499Mo9028;
        String str;
        interfaceC4499.getClass();
        StringBuilder sb = new StringBuilder();
        interfaceC4499.mo9027(new C2242(this, 22), sb);
        C4743 c4743 = this.f13892;
        C4266 c4266 = c4743.f13864;
        InterfaceC5088[] interfaceC5088Arr = C4743.f13836;
        interfaceC5088Arr[1].getClass();
        if (((Boolean) c4266.f12806).booleanValue() && !(interfaceC4499 instanceof InterfaceC4466) && !(interfaceC4499 instanceof C7004) && (interfaceC4499Mo9028 = interfaceC4499.mo9028()) != null && !(interfaceC4499Mo9028 instanceof InterfaceC4486)) {
            sb.append(" ");
            int i = AbstractC4740.f13834[m9472().ordinal()];
            if (i == 1) {
                str = "defined in";
            } else {
                if (i != 2) {
                    C4211.m8611();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C4686 c4686M12101 = AbstractC6870.m12101(interfaceC4499Mo9028);
            c4686M12101.getClass();
            sb.append(c4686M12101.m9314() ? "root package" : m9478(AbstractC3065.m6813(C4686.m9311(c4686M12101))));
            C4266 c42662 = c4743.f13863;
            interfaceC5088Arr[2].getClass();
            if (((Boolean) c42662.f12806).booleanValue() && (interfaceC4499Mo9028 instanceof InterfaceC4466) && (interfaceC4499 instanceof InterfaceC4500)) {
                ((InterfaceC4500) interfaceC4499).mo9026().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String m9474(InterfaceC6478 interfaceC6478, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        C7018 c7018Mo9018;
        List listMo9035;
        interfaceC6478.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        AbstractC4882 type = interfaceC6478.getType();
        sb.append(m9486(type));
        C4743 c4743 = this.f13892;
        if (c4743.m9441().getIncludeAnnotationArguments()) {
            Map mapMo9176 = interfaceC6478.mo9176();
            C4266 c4266 = c4743.f13856;
            InterfaceC5088 interfaceC5088 = C4743.f13836[33];
            c4266.getClass();
            interfaceC5088.getClass();
            List list = null;
            AbstractC6989 abstractC6989M9500 = ((Boolean) c4266.f12806).booleanValue() ? AbstractC4773.m9500(interfaceC6478) : null;
            if (abstractC6989M9500 != null && (c7018Mo9018 = abstractC6989M9500.mo9018()) != null && (listMo9035 = c7018Mo9018.mo9035()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo9035) {
                    if (((C6979) ((InterfaceC4456) obj)).m12290()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC7009) ((InterfaceC4456) it.next())).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapMo9176.containsKey((C4691) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C4691) it2.next()).m9335() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo9176.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                C4691 c4691 = (C4691) entry.getKey();
                AbstractC4768 abstractC4768 = (AbstractC4768) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4691.m9335());
                sb2.append(" = ");
                sb2.append(!list.contains(c4691) ? m9462(abstractC4768) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM8777 = AbstractC4344.m8777(AbstractC4344.m8793(arrayList5, arrayList4));
            if (c4743.m9441().getIncludeEmptyAnnotationArguments() || !listM8777.isEmpty()) {
                AbstractC4344.m8809(listM8777, sb, ", ", "(", ")", null, 112);
            }
        }
        if (m9475() && (AbstractC4893.m9829(type) || (type.mo9722().mo9211() instanceof C4467))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m9475() {
        C4266 c4266 = this.f13892.f13884;
        InterfaceC5088 interfaceC5088 = C4743.f13836[8];
        c4266.getClass();
        interfaceC5088.getClass();
        return ((Boolean) c4266.f12806).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9434() {
        this.f13892.mo9434();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set m9476() {
        C4266 c4266 = this.f13892.f13862;
        InterfaceC5088 interfaceC5088 = C4743.f13836[3];
        c4266.getClass();
        interfaceC5088.getClass();
        return (Set) c4266.f12806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m9477() {
        C4266 c4266 = this.f13892.f13861;
        InterfaceC5088 interfaceC5088 = C4743.f13836[4];
        c4266.getClass();
        interfaceC5088.getClass();
        return ((Boolean) c4266.f12806).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final String m9478(String str) {
        return m9472().escape(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4737 m9479() {
        C4266 c4266 = this.f13892.f13865;
        C4743.f13836[0].getClass();
        return (C4737) c4266.f12806;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9435(C4737 c4737) {
        this.f13892.mo9435(c4737);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9436() {
        this.f13892.mo9436();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9437() {
        this.f13892.mo9437();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9438() {
        return this.f13892.mo9438();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9439(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f13892.mo9439(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9440() {
        this.f13892.mo9440();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m9480(List list, StringBuilder sb) {
        C4266 c4266 = this.f13892.f13869;
        InterfaceC5088 interfaceC5088 = C4743.f13836[21];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4463 interfaceC4463 = (InterfaceC4463) it.next();
            List upperBounds = interfaceC4463.getUpperBounds();
            upperBounds.getClass();
            for (AbstractC4882 abstractC4882 : AbstractC4344.m8805(1, upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C4691 name = interfaceC4463.getName();
                name.getClass();
                sb2.append(m9454(name, false));
                sb2.append(" : ");
                abstractC4882.getClass();
                sb2.append(m9486(abstractC4882));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m9466("where"));
        sb.append(" ");
        AbstractC4344.m8809(arrayList, sb, ", ", null, null, null, 124);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m9481(C4490 c4490, StringBuilder sb) {
        if (!m9476().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        C4743 c4743 = this.f13892;
        C4266 c4266 = c4743.f13873;
        InterfaceC5088[] interfaceC5088Arr = C4743.f13836;
        InterfaceC5088 interfaceC5088 = interfaceC5088Arr[12];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue()) {
            c4490 = AbstractC4489.m9072(c4490.f13131.mo9098());
        }
        C4266 c42662 = c4743.f13877;
        InterfaceC5088 interfaceC50882 = interfaceC5088Arr[13];
        c42662.getClass();
        interfaceC50882.getClass();
        if (!((Boolean) c42662.f12806).booleanValue() && AbstractC4395.m8907(c4490, AbstractC4489.f13129)) {
            return false;
        }
        sb.append(m9466(c4490.f13131.mo9099()));
        sb.append(" ");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9482(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏兰哲世 r0 = r7.f13892
            io.ktor.websocket.飘花落叶言子楪兰世苏哲 r0 = r0.f13860
            kotlin.reflect.飘花落叶言子世楪苏哲兰[] r1 = kotlin.reflect.jvm.internal.impl.renderer.C4743.f13836
            r2 = 29
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            java.lang.Object r0 = r0.f12806
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r0
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.AbstractC4740.f13833
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
            io.ktor.util.C4211.m8611()
            return
        L2c:
            if (r10 != 0) goto L26
        L2e:
            r10 = r2
        L2f:
            int r0 = r9.size()
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r3 = r7.m9471()
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
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456) r5
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r6 = r7.m9471()
            r6.getClass()
            r5.getClass()
            r7.m9483(r5, r10, r8, r1)
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r5 = r7.m9471()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L72
            java.lang.String r3 = ", "
            r8.append(r3)
        L72:
            r3 = r4
            goto L47
        L74:
            kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲苏兰 r7 = r7.m9471()
            r7.getClass()
            java.lang.String r7 = ")"
            r8.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4744.m9482(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9483(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C4744.m9483(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m9484(InterfaceC4455 interfaceC4455, StringBuilder sb, boolean z) {
        if (z || !(interfaceC4455 instanceof InterfaceC4456)) {
            sb.append(m9466(interfaceC4455.mo8995() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m9485(StringBuilder sb, List list, boolean z) {
        C4266 c4266 = this.f13892.f13869;
        InterfaceC5088 interfaceC5088 = C4743.f13836[21];
        c4266.getClass();
        interfaceC5088.getClass();
        if (((Boolean) c4266.f12806).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m9478("<"));
        m9488(list, sb);
        sb.append(m9478(">"));
        if (z) {
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final String m9486(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        StringBuilder sb = new StringBuilder();
        C4266 c4266 = this.f13892.f13854;
        InterfaceC5088 interfaceC5088 = C4743.f13836[23];
        c4266.getClass();
        interfaceC5088.getClass();
        m9451(sb, (AbstractC4882) ((InterfaceC6558) c4266.f12806).invoke(abstractC4882));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m9487(InterfaceC4463 interfaceC4463, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m9478("<"));
        }
        if (m9475()) {
            sb.append("/*");
            sb.append(interfaceC4463.getIndex());
            sb.append("*/ ");
        }
        m9458(sb, interfaceC4463.mo9004(), "reified");
        String label = interfaceC4463.mo9003().getLabel();
        boolean z2 = true;
        m9458(sb, label.length() > 0, label);
        m9464(sb, interfaceC4463, null);
        m9455(interfaceC4463, sb, z);
        int size = interfaceC4463.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC4882 abstractC4882 = (AbstractC4882) interfaceC4463.getUpperBounds().iterator().next();
            if (abstractC4882 == null) {
                AbstractC6530.m12020(141);
                throw null;
            }
            if (!AbstractC6530.m12022(abstractC4882) || !abstractC4882.mo9725()) {
                sb.append(" : ");
                sb.append(m9486(abstractC4882));
            }
        } else if (z) {
            for (AbstractC4882 abstractC48822 : interfaceC4463.getUpperBounds()) {
                if (abstractC48822 == null) {
                    AbstractC6530.m12020(141);
                    throw null;
                }
                if (!AbstractC6530.m12022(abstractC48822) || !abstractC48822.mo9725()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m9486(abstractC48822));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m9478(">"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m9488(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m9487((InterfaceC4463) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final String m9489(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m9478("<"));
        AbstractC4344.m8809(list, sb, ", ", null, null, new C4732(this, 0), 60);
        sb.append(m9478(">"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final String m9490(InterfaceC4873 interfaceC4873) {
        interfaceC4873.getClass();
        InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873.mo9211();
        if ((interfaceC4477Mo9211 instanceof InterfaceC4463) || (interfaceC4477Mo9211 instanceof AbstractC6989) || (interfaceC4477Mo9211 instanceof AbstractC6996)) {
            interfaceC4477Mo9211.getClass();
            return C7240.m12467(interfaceC4477Mo9211) ? interfaceC4477Mo9211.mo9001().toString() : m9479().m9427(interfaceC4477Mo9211, this);
        }
        if (interfaceC4477Mo9211 == null) {
            return interfaceC4873 instanceof C4883 ? ((C4883) interfaceC4873).m9774(C4733.f13819) : interfaceC4873.toString();
        }
        C0276.m845(interfaceC4477Mo9211.getClass(), "Unexpected classifier: ");
        return null;
    }
}
