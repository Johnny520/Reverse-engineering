package kotlin.reflect.jvm.internal.impl.renderer;

import io.ktor.websocket.C5098;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5575 implements InterfaceC5574 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14181 = {new MutablePropertyReference1Impl(C5575.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new MutablePropertyReference1Impl(C5575.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new MutablePropertyReference1Impl(C5575.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new MutablePropertyReference1Impl(C5575.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C5575.class, "startFromName", "getStartFromName()Z", 0), new MutablePropertyReference1Impl(C5575.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new MutablePropertyReference1Impl(C5575.class, "debugMode", "getDebugMode()Z", 0), new MutablePropertyReference1Impl(C5575.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C5575.class, "verbose", "getVerbose()Z", 0), new MutablePropertyReference1Impl(C5575.class, "unitReturnType", "getUnitReturnType()Z", 0), new MutablePropertyReference1Impl(C5575.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new MutablePropertyReference1Impl(C5575.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new MutablePropertyReference1Impl(C5575.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new MutablePropertyReference1Impl(C5575.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(C5575.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new MutablePropertyReference1Impl(C5575.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new MutablePropertyReference1Impl(C5575.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C5575.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new MutablePropertyReference1Impl(C5575.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new MutablePropertyReference1Impl(C5575.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C5575.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C5575.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new MutablePropertyReference1Impl(C5575.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new MutablePropertyReference1Impl(C5575.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new MutablePropertyReference1Impl(C5575.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new MutablePropertyReference1Impl(C5575.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new MutablePropertyReference1Impl(C5575.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new MutablePropertyReference1Impl(C5575.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new MutablePropertyReference1Impl(C5575.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new MutablePropertyReference1Impl(C5575.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new MutablePropertyReference1Impl(C5575.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C5575.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(C5575.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(C5575.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new MutablePropertyReference1Impl(C5575.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new MutablePropertyReference1Impl(C5575.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new MutablePropertyReference1Impl(C5575.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new MutablePropertyReference1Impl(C5575.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new MutablePropertyReference1Impl(C5575.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new MutablePropertyReference1Impl(C5575.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new MutablePropertyReference1Impl(C5575.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C5098 f14182;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C5098 f14183;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C5098 f14184;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C5098 f14185;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C5098 f14186;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C5098 f14187;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C5098 f14188;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C5098 f14189;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C5098 f14190;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C5098 f14191;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C5098 f14192;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C5098 f14193;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C5098 f14194;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C5098 f14195;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5098 f14196;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5098 f14197;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5098 f14198;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5098 f14199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C5098 f14200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C5098 f14201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C5098 f14202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C5098 f14203;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C5098 f14204;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C5098 f14205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5098 f14206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5098 f14207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5098 f14208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5098 f14209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5098 f14210 = new C5098(C5569.f14172, 1, this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f14211;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5098 f14212;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5098 f14213;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5098 f14214;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5098 f14215;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5098 f14216;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5098 f14217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C5098 f14218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C5098 f14219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5098 f14220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5098 f14221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5098 f14222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5098 f14223;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5098 f14224;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5098 f14225;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5098 f14226;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5098 f14227;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5098 f14228;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5098 f14229;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C5098 f14230;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final C5098 f14231;

    public C5575() {
        Boolean bool = Boolean.TRUE;
        this.f14209 = new C5098(bool, 1, this);
        this.f14208 = new C5098(bool, 1, this);
        this.f14207 = new C5098(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, 1, this);
        Boolean bool2 = Boolean.FALSE;
        this.f14206 = new C5098(bool2, 1, this);
        this.f14225 = new C5098(bool2, 1, this);
        this.f14224 = new C5098(bool2, 1, this);
        this.f14228 = new C5098(bool2, 1, this);
        this.f14229 = new C5098(bool2, 1, this);
        this.f14226 = new C5098(bool, 1, this);
        this.f14227 = new C5098(bool2, 1, this);
        this.f14219 = new C5098(bool2, 1, this);
        this.f14218 = new C5098(bool2, 1, this);
        this.f14222 = new C5098(bool, 1, this);
        this.f14223 = new C5098(bool, 1, this);
        this.f14220 = new C5098(bool2, 1, this);
        this.f14221 = new C5098(bool2, 1, this);
        this.f14213 = new C5098(bool2, 1, this);
        this.f14212 = new C5098(bool2, 1, this);
        this.f14216 = new C5098(bool2, 1, this);
        this.f14217 = new C5098(null, 1, this);
        this.f14214 = new C5098(bool2, 1, this);
        this.f14215 = new C5098(bool2, 1, this);
        this.f14199 = new C5098(C5565.f14162, 1, this);
        this.f14198 = new C5098(C5565.f14161, 1, this);
        this.f14197 = new C5098(bool, 1, this);
        this.f14196 = new C5098(OverrideRenderingPolicy.RENDER_OPEN, 1, this);
        this.f14195 = new C5098(C5567.f14170, 1, this);
        this.f14194 = new C5098(RenderingFormat.PLAIN, 1, this);
        this.f14205 = new C5098(ParameterNameRenderingPolicy.ALL, 1, this);
        this.f14204 = new C5098(bool2, 1, this);
        this.f14203 = new C5098(bool2, 1, this);
        this.f14202 = new C5098(PropertyAccessorRenderingPolicy.DEBUG, 1, this);
        this.f14201 = new C5098(bool2, 1, this);
        this.f14200 = new C5098(bool2, 1, this);
        this.f14191 = new C5098(EmptySet.INSTANCE, 1, this);
        this.f14190 = new C5098(AbstractC5571.f14177, 1, this);
        this.f14193 = new C5098(null, 1, this);
        this.f14192 = new C5098(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, 1, this);
        this.f14188 = new C5098(bool2, 1, this);
        this.f14189 = new C5098(bool, 1, this);
        this.f14185 = new C5098(bool, 1, this);
        this.f14184 = new C5098(bool2, 1, this);
        this.f14187 = new C5098(bool2, 1, this);
        this.f14186 = new C5098(bool, 1, this);
        this.f14182 = new C5098(bool, 1, this);
        this.f14183 = new C5098(bool2, 1, this);
        this.f14231 = new C5098(bool2, 1, this);
        this.f14230 = new C5098(bool, 1, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo9987(LinkedHashSet linkedHashSet) {
        this.f14190.m9279(linkedHashSet, f14181[36]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo9988(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f14205.m9279(parameterNameRenderingPolicy, f14181[29]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9989(Set set) {
        set.getClass();
        this.f14207.m9279(set, f14181[3]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo9990() {
        InterfaceC5920 interfaceC5920 = f14181[31];
        this.f14203.m9279(Boolean.TRUE, interfaceC5920);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9991() {
        InterfaceC5920 interfaceC5920 = f14181[6];
        this.f14224.m9279(Boolean.TRUE, interfaceC5920);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9992() {
        InterfaceC5920 interfaceC5920 = f14181[30];
        this.f14204.m9279(Boolean.TRUE, interfaceC5920);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AnnotationArgumentsRenderingPolicy m10000() {
        InterfaceC5920 interfaceC5920 = f14181[38];
        C5098 c5098 = this.f14192;
        c5098.getClass();
        interfaceC5920.getClass();
        return (AnnotationArgumentsRenderingPolicy) c5098.f13151;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9993() {
        InterfaceC5920 interfaceC5920 = f14181[22];
        this.f14215.m9279(Boolean.TRUE, interfaceC5920);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m10001() {
        InterfaceC5920 interfaceC5920 = f14181[6];
        C5098 c5098 = this.f14224;
        c5098.getClass();
        interfaceC5920.getClass();
        return ((Boolean) c5098.f13151).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9994(C5569 c5569) {
        this.f14210.m9279(c5569, f14181[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo9995() {
        InterfaceC5920 interfaceC5920 = f14181[21];
        this.f14214.m9279(Boolean.TRUE, interfaceC5920);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9996() {
        InterfaceC5920 interfaceC5920 = f14181[1];
        this.f14209.m9279(Boolean.FALSE, interfaceC5920);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Set mo9997() {
        InterfaceC5920 interfaceC5920 = f14181[36];
        C5098 c5098 = this.f14190;
        c5098.getClass();
        interfaceC5920.getClass();
        return (Set) c5098.f13151;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9998(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f14194.m9279(renderingFormat, f14181[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC5574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9999() {
        InterfaceC5920 interfaceC5920 = f14181[4];
        this.f14206.m9279(Boolean.TRUE, interfaceC5920);
    }
}
