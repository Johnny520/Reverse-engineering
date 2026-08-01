package kotlin.reflect.jvm.internal.impl.renderer;

import io.ktor.websocket.C4265;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 implements InterfaceC4741 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13832 = {new MutablePropertyReference1Impl(C4742.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new MutablePropertyReference1Impl(C4742.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new MutablePropertyReference1Impl(C4742.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new MutablePropertyReference1Impl(C4742.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4742.class, "startFromName", "getStartFromName()Z", 0), new MutablePropertyReference1Impl(C4742.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new MutablePropertyReference1Impl(C4742.class, "debugMode", "getDebugMode()Z", 0), new MutablePropertyReference1Impl(C4742.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C4742.class, "verbose", "getVerbose()Z", 0), new MutablePropertyReference1Impl(C4742.class, "unitReturnType", "getUnitReturnType()Z", 0), new MutablePropertyReference1Impl(C4742.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new MutablePropertyReference1Impl(C4742.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new MutablePropertyReference1Impl(C4742.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new MutablePropertyReference1Impl(C4742.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C4742.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new MutablePropertyReference1Impl(C4742.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new MutablePropertyReference1Impl(C4742.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4742.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new MutablePropertyReference1Impl(C4742.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new MutablePropertyReference1Impl(C4742.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4742.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4742.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new MutablePropertyReference1Impl(C4742.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4742.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new MutablePropertyReference1Impl(C4742.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new MutablePropertyReference1Impl(C4742.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4742.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new MutablePropertyReference1Impl(C4742.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4742.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new MutablePropertyReference1Impl(C4742.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new MutablePropertyReference1Impl(C4742.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4742.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C4742.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C4742.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new MutablePropertyReference1Impl(C4742.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new MutablePropertyReference1Impl(C4742.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new MutablePropertyReference1Impl(C4742.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new MutablePropertyReference1Impl(C4742.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new MutablePropertyReference1Impl(C4742.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new MutablePropertyReference1Impl(C4742.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new MutablePropertyReference1Impl(C4742.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C4265 f13833;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C4265 f13834;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C4265 f13835;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C4265 f13836;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C4265 f13837;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C4265 f13838;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C4265 f13839;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C4265 f13840;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C4265 f13841;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4265 f13842;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C4265 f13843;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C4265 f13844;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4265 f13845;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C4265 f13846;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4265 f13847;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4265 f13848;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4265 f13849;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4265 f13850;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4265 f13851;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4265 f13852;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4265 f13853;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4265 f13854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C4265 f13855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C4265 f13856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4265 f13857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4265 f13858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4265 f13859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4265 f13860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4265 f13861 = new C4265(C4736.f13823, 1, this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f13862;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4265 f13863;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4265 f13864;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4265 f13865;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4265 f13866;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4265 f13867;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4265 f13868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4265 f13869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C4265 f13870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4265 f13871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4265 f13872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4265 f13873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4265 f13874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4265 f13875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4265 f13876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C4265 f13877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4265 f13878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4265 f13879;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4265 f13880;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C4265 f13881;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final C4265 f13882;

    public C4742() {
        Boolean bool = Boolean.TRUE;
        this.f13860 = new C4265(bool, 1, this);
        this.f13859 = new C4265(bool, 1, this);
        this.f13858 = new C4265(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, 1, this);
        Boolean bool2 = Boolean.FALSE;
        this.f13857 = new C4265(bool2, 1, this);
        this.f13876 = new C4265(bool2, 1, this);
        this.f13875 = new C4265(bool2, 1, this);
        this.f13879 = new C4265(bool2, 1, this);
        this.f13880 = new C4265(bool2, 1, this);
        this.f13877 = new C4265(bool, 1, this);
        this.f13878 = new C4265(bool2, 1, this);
        this.f13870 = new C4265(bool2, 1, this);
        this.f13869 = new C4265(bool2, 1, this);
        this.f13873 = new C4265(bool, 1, this);
        this.f13874 = new C4265(bool, 1, this);
        this.f13871 = new C4265(bool2, 1, this);
        this.f13872 = new C4265(bool2, 1, this);
        this.f13864 = new C4265(bool2, 1, this);
        this.f13863 = new C4265(bool2, 1, this);
        this.f13867 = new C4265(bool2, 1, this);
        this.f13868 = new C4265(null, 1, this);
        this.f13865 = new C4265(bool2, 1, this);
        this.f13866 = new C4265(bool2, 1, this);
        this.f13850 = new C4265(C4732.f13813, 1, this);
        this.f13849 = new C4265(C4732.f13812, 1, this);
        this.f13848 = new C4265(bool, 1, this);
        this.f13847 = new C4265(OverrideRenderingPolicy.RENDER_OPEN, 1, this);
        this.f13846 = new C4265(C4734.f13821, 1, this);
        this.f13845 = new C4265(RenderingFormat.PLAIN, 1, this);
        this.f13856 = new C4265(ParameterNameRenderingPolicy.ALL, 1, this);
        this.f13855 = new C4265(bool2, 1, this);
        this.f13854 = new C4265(bool2, 1, this);
        this.f13853 = new C4265(PropertyAccessorRenderingPolicy.DEBUG, 1, this);
        this.f13852 = new C4265(bool2, 1, this);
        this.f13851 = new C4265(bool2, 1, this);
        this.f13842 = new C4265(EmptySet.INSTANCE, 1, this);
        this.f13841 = new C4265(AbstractC4738.f13828, 1, this);
        this.f13844 = new C4265(null, 1, this);
        this.f13843 = new C4265(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, 1, this);
        this.f13839 = new C4265(bool2, 1, this);
        this.f13840 = new C4265(bool, 1, this);
        this.f13836 = new C4265(bool, 1, this);
        this.f13835 = new C4265(bool2, 1, this);
        this.f13838 = new C4265(bool2, 1, this);
        this.f13837 = new C4265(bool, 1, this);
        this.f13833 = new C4265(bool, 1, this);
        this.f13834 = new C4265(bool2, 1, this);
        this.f13882 = new C4265(bool2, 1, this);
        this.f13881 = new C4265(bool, 1, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9438(LinkedHashSet linkedHashSet) {
        this.f13841.m8730(linkedHashSet, f13832[36]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9439(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f13856.m8730(parameterNameRenderingPolicy, f13832[29]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9440(Set set) {
        set.getClass();
        this.f13858.m8730(set, f13832[3]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9441() {
        InterfaceC5087 interfaceC5087 = f13832[31];
        this.f13854.m8730(Boolean.TRUE, interfaceC5087);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9442() {
        InterfaceC5087 interfaceC5087 = f13832[6];
        this.f13875.m8730(Boolean.TRUE, interfaceC5087);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9443() {
        InterfaceC5087 interfaceC5087 = f13832[30];
        this.f13855.m8730(Boolean.TRUE, interfaceC5087);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AnnotationArgumentsRenderingPolicy m9451() {
        InterfaceC5087 interfaceC5087 = f13832[38];
        C4265 c4265 = this.f13843;
        c4265.getClass();
        interfaceC5087.getClass();
        return (AnnotationArgumentsRenderingPolicy) c4265.f12802;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9444() {
        InterfaceC5087 interfaceC5087 = f13832[22];
        this.f13866.m8730(Boolean.TRUE, interfaceC5087);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m9452() {
        InterfaceC5087 interfaceC5087 = f13832[6];
        C4265 c4265 = this.f13875;
        c4265.getClass();
        interfaceC5087.getClass();
        return ((Boolean) c4265.f12802).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9445(C4736 c4736) {
        this.f13861.m8730(c4736, f13832[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9446() {
        InterfaceC5087 interfaceC5087 = f13832[21];
        this.f13865.m8730(Boolean.TRUE, interfaceC5087);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9447() {
        InterfaceC5087 interfaceC5087 = f13832[1];
        this.f13860.m8730(Boolean.FALSE, interfaceC5087);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9448() {
        InterfaceC5087 interfaceC5087 = f13832[36];
        C4265 c4265 = this.f13841;
        c4265.getClass();
        interfaceC5087.getClass();
        return (Set) c4265.f12802;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9449(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f13845.m8730(renderingFormat, f13832[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC4741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9450() {
        InterfaceC5087 interfaceC5087 = f13832[4];
        this.f13857.m8730(Boolean.TRUE, interfaceC5087);
    }
}
