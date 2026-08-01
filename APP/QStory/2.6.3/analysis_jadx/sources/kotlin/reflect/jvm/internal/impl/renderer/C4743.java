package kotlin.reflect.jvm.internal.impl.renderer;

import io.ktor.websocket.C4266;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4743 implements InterfaceC4742 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13836 = {new MutablePropertyReference1Impl(C4743.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new MutablePropertyReference1Impl(C4743.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new MutablePropertyReference1Impl(C4743.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new MutablePropertyReference1Impl(C4743.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4743.class, "startFromName", "getStartFromName()Z", 0), new MutablePropertyReference1Impl(C4743.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new MutablePropertyReference1Impl(C4743.class, "debugMode", "getDebugMode()Z", 0), new MutablePropertyReference1Impl(C4743.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C4743.class, "verbose", "getVerbose()Z", 0), new MutablePropertyReference1Impl(C4743.class, "unitReturnType", "getUnitReturnType()Z", 0), new MutablePropertyReference1Impl(C4743.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new MutablePropertyReference1Impl(C4743.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new MutablePropertyReference1Impl(C4743.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new MutablePropertyReference1Impl(C4743.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C4743.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new MutablePropertyReference1Impl(C4743.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new MutablePropertyReference1Impl(C4743.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4743.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new MutablePropertyReference1Impl(C4743.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new MutablePropertyReference1Impl(C4743.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4743.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4743.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new MutablePropertyReference1Impl(C4743.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4743.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new MutablePropertyReference1Impl(C4743.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new MutablePropertyReference1Impl(C4743.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4743.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new MutablePropertyReference1Impl(C4743.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4743.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new MutablePropertyReference1Impl(C4743.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new MutablePropertyReference1Impl(C4743.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4743.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4743.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4743.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4743.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new MutablePropertyReference1Impl(C4743.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new MutablePropertyReference1Impl(C4743.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new MutablePropertyReference1Impl(C4743.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new MutablePropertyReference1Impl(C4743.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new MutablePropertyReference1Impl(C4743.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new MutablePropertyReference1Impl(C4743.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C4266 f13837;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C4266 f13838;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C4266 f13839;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C4266 f13840;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C4266 f13841;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C4266 f13842;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C4266 f13843;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C4266 f13844;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C4266 f13845;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4266 f13846;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C4266 f13847;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C4266 f13848;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4266 f13849;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C4266 f13850;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4266 f13851;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4266 f13852;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4266 f13853;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4266 f13854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4266 f13855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4266 f13856;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4266 f13857;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4266 f13858;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C4266 f13859;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C4266 f13860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4266 f13861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4266 f13862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4266 f13863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4266 f13864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4266 f13865 = new C4266(C4737.f13827, 1, this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f13866;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4266 f13867;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4266 f13868;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4266 f13869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4266 f13870;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4266 f13871;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4266 f13872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4266 f13873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C4266 f13874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4266 f13875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4266 f13876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4266 f13877;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4266 f13878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4266 f13879;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4266 f13880;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C4266 f13881;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4266 f13882;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4266 f13883;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4266 f13884;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C4266 f13885;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final C4266 f13886;

    public C4743() {
        Boolean bool = Boolean.TRUE;
        this.f13864 = new C4266(bool, 1, this);
        this.f13863 = new C4266(bool, 1, this);
        this.f13862 = new C4266(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, 1, this);
        Boolean bool2 = Boolean.FALSE;
        this.f13861 = new C4266(bool2, 1, this);
        this.f13880 = new C4266(bool2, 1, this);
        this.f13879 = new C4266(bool2, 1, this);
        this.f13883 = new C4266(bool2, 1, this);
        this.f13884 = new C4266(bool2, 1, this);
        this.f13881 = new C4266(bool, 1, this);
        this.f13882 = new C4266(bool2, 1, this);
        this.f13874 = new C4266(bool2, 1, this);
        this.f13873 = new C4266(bool2, 1, this);
        this.f13877 = new C4266(bool, 1, this);
        this.f13878 = new C4266(bool, 1, this);
        this.f13875 = new C4266(bool2, 1, this);
        this.f13876 = new C4266(bool2, 1, this);
        this.f13868 = new C4266(bool2, 1, this);
        this.f13867 = new C4266(bool2, 1, this);
        this.f13871 = new C4266(bool2, 1, this);
        this.f13872 = new C4266(null, 1, this);
        this.f13869 = new C4266(bool2, 1, this);
        this.f13870 = new C4266(bool2, 1, this);
        this.f13854 = new C4266(C4733.f13817, 1, this);
        this.f13853 = new C4266(C4733.f13816, 1, this);
        this.f13852 = new C4266(bool, 1, this);
        this.f13851 = new C4266(OverrideRenderingPolicy.RENDER_OPEN, 1, this);
        this.f13850 = new C4266(C4735.f13825, 1, this);
        this.f13849 = new C4266(RenderingFormat.PLAIN, 1, this);
        this.f13860 = new C4266(ParameterNameRenderingPolicy.ALL, 1, this);
        this.f13859 = new C4266(bool2, 1, this);
        this.f13858 = new C4266(bool2, 1, this);
        this.f13857 = new C4266(PropertyAccessorRenderingPolicy.DEBUG, 1, this);
        this.f13856 = new C4266(bool2, 1, this);
        this.f13855 = new C4266(bool2, 1, this);
        this.f13846 = new C4266(EmptySet.INSTANCE, 1, this);
        this.f13845 = new C4266(AbstractC4739.f13832, 1, this);
        this.f13848 = new C4266(null, 1, this);
        this.f13847 = new C4266(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, 1, this);
        this.f13843 = new C4266(bool2, 1, this);
        this.f13844 = new C4266(bool, 1, this);
        this.f13840 = new C4266(bool, 1, this);
        this.f13839 = new C4266(bool2, 1, this);
        this.f13842 = new C4266(bool2, 1, this);
        this.f13841 = new C4266(bool, 1, this);
        this.f13837 = new C4266(bool, 1, this);
        this.f13838 = new C4266(bool2, 1, this);
        this.f13886 = new C4266(bool2, 1, this);
        this.f13885 = new C4266(bool, 1, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9428(LinkedHashSet linkedHashSet) {
        this.f13845.m8720(linkedHashSet, f13836[36]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9429(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f13860.m8720(parameterNameRenderingPolicy, f13836[29]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9430(Set set) {
        set.getClass();
        this.f13862.m8720(set, f13836[3]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9431() {
        InterfaceC5088 interfaceC5088 = f13836[31];
        this.f13858.m8720(Boolean.TRUE, interfaceC5088);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9432() {
        InterfaceC5088 interfaceC5088 = f13836[6];
        this.f13879.m8720(Boolean.TRUE, interfaceC5088);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9433() {
        InterfaceC5088 interfaceC5088 = f13836[30];
        this.f13859.m8720(Boolean.TRUE, interfaceC5088);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AnnotationArgumentsRenderingPolicy m9441() {
        InterfaceC5088 interfaceC5088 = f13836[38];
        C4266 c4266 = this.f13847;
        c4266.getClass();
        interfaceC5088.getClass();
        return (AnnotationArgumentsRenderingPolicy) c4266.f12806;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9434() {
        InterfaceC5088 interfaceC5088 = f13836[22];
        this.f13870.m8720(Boolean.TRUE, interfaceC5088);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m9442() {
        InterfaceC5088 interfaceC5088 = f13836[6];
        C4266 c4266 = this.f13879;
        c4266.getClass();
        interfaceC5088.getClass();
        return ((Boolean) c4266.f12806).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9435(C4737 c4737) {
        this.f13865.m8720(c4737, f13836[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9436() {
        InterfaceC5088 interfaceC5088 = f13836[21];
        this.f13869.m8720(Boolean.TRUE, interfaceC5088);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9437() {
        InterfaceC5088 interfaceC5088 = f13836[1];
        this.f13864.m8720(Boolean.FALSE, interfaceC5088);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9438() {
        InterfaceC5088 interfaceC5088 = f13836[36];
        C4266 c4266 = this.f13845;
        c4266.getClass();
        interfaceC5088.getClass();
        return (Set) c4266.f12806;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9439(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f13849.m8720(renderingFormat, f13836[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4742
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9440() {
        InterfaceC5088 interfaceC5088 = f13836[4];
        this.f13861.m8720(Boolean.TRUE, interfaceC5088);
    }
}
