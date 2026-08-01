package p259ra;

import gb.AbstractC2706r0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1052o0;
import p024b9.C1026b0;
import p024b9.C1038h0;
import p065e9.AbstractC2055b;
import p065e9.C2054a;
import p065e9.InterfaceC2057d;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5068b1;
import p229p9.InterfaceC6039s1;
import p259ra.AbstractC6569n;
import p259ra.InterfaceC6551b;
import p259ra.InterfaceC6578w;
import p299ub.AbstractC8611a0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ra.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6581z implements InterfaceC6578w {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ InterfaceC2557k[] f20593Z = {AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "startFromName", "getStartFromName()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "debugMode", "getDebugMode()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "verbose", "getVerbose()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "unitReturnType", "getUnitReturnType()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), AbstractC1052o0.m3810e(new C1026b0(C6581z.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* JADX INFO: renamed from: A */
    public final InterfaceC2057d f20594A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC2057d f20595B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC2057d f20596C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC2057d f20597D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC2057d f20598E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC2057d f20599F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC2057d f20600G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC2057d f20601H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC2057d f20602I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC2057d f20603J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC2057d f20604K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC2057d f20605L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC2057d f20606M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC2057d f20607N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC2057d f20608O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC2057d f20609P;

    /* JADX INFO: renamed from: Q */
    public final InterfaceC2057d f20610Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC2057d f20611R;

    /* JADX INFO: renamed from: S */
    public final InterfaceC2057d f20612S;

    /* JADX INFO: renamed from: T */
    public final InterfaceC2057d f20613T;

    /* JADX INFO: renamed from: U */
    public final InterfaceC2057d f20614U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC2057d f20615V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC2057d f20616W;

    /* JADX INFO: renamed from: X */
    public final InterfaceC2057d f20617X;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC2057d f20618Y;

    /* JADX INFO: renamed from: a */
    public boolean f20619a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2057d f20620b = m26143r0(InterfaceC6551b.c.f20513a);

    /* JADX INFO: renamed from: c */
    public final InterfaceC2057d f20621c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2057d f20622d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2057d f20623e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2057d f20624f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2057d f20625g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2057d f20626h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2057d f20627i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2057d f20628j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2057d f20629k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2057d f20630l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC2057d f20631m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2057d f20632n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC2057d f20633o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2057d f20634p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2057d f20635q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2057d f20636r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2057d f20637s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2057d f20638t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC2057d f20639u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC2057d f20640v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2057d f20641w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC2057d f20642x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2057d f20643y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC2057d f20644z;

    /* JADX INFO: renamed from: ra.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2055b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6581z f20645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C6581z c6581z) {
            super(obj);
            this.f20645b = c6581z;
        }

        @Override // p065e9.AbstractC2055b
        /* JADX INFO: renamed from: d */
        public boolean mo7411d(InterfaceC2557k interfaceC2557k, Object obj, Object obj2) {
            interfaceC2557k.getClass();
            if (!this.f20645b.m26141p0()) {
                return true;
            }
            C10010p0.m38820a("Cannot modify readonly DescriptorRendererOptions");
            return false;
        }
    }

    public C6581z() {
        Boolean bool = Boolean.TRUE;
        this.f20621c = m26143r0(bool);
        this.f20622d = m26143r0(bool);
        this.f20623e = m26143r0(EnumC6577v.f20582s);
        Boolean bool2 = Boolean.FALSE;
        this.f20624f = m26143r0(bool2);
        this.f20625g = m26143r0(bool2);
        this.f20626h = m26143r0(bool2);
        this.f20627i = m26143r0(bool2);
        this.f20628j = m26143r0(bool2);
        this.f20629k = m26143r0(bool);
        this.f20630l = m26143r0(bool2);
        this.f20631m = m26143r0(bool2);
        this.f20632n = m26143r0(bool2);
        this.f20633o = m26143r0(bool);
        this.f20634p = m26143r0(bool);
        this.f20635q = m26143r0(bool2);
        this.f20636r = m26143r0(bool2);
        this.f20637s = m26143r0(bool2);
        this.f20638t = m26143r0(bool2);
        this.f20639u = m26143r0(bool2);
        this.f20640v = m26143r0(null);
        this.f20641w = m26143r0(bool2);
        this.f20642x = m26143r0(bool2);
        this.f20643y = m26143r0(C6579x.f20591q);
        this.f20644z = m26143r0(C6580y.f20592q);
        this.f20594A = m26143r0(bool);
        this.f20595B = m26143r0(EnumC6554c0.f20517r);
        this.f20596C = m26143r0(AbstractC6569n.b.a.f20558a);
        this.f20597D = m26143r0(EnumC6560f0.f20534q);
        this.f20598E = m26143r0(EnumC6556d0.f20522q);
        this.f20599F = m26143r0(bool2);
        this.f20600G = m26143r0(bool2);
        this.f20601H = m26143r0(EnumC6558e0.f20529r);
        this.f20602I = m26143r0(bool2);
        this.f20603J = m26143r0(bool2);
        this.f20604K = m26143r0(AbstractC5068b1.m20483e());
        this.f20605L = m26143r0(C6550a0.f20509a.m25868a());
        this.f20606M = m26143r0(null);
        this.f20607N = m26143r0(EnumC6549a.f20502s);
        this.f20608O = m26143r0(bool2);
        this.f20609P = m26143r0(bool);
        this.f20610Q = m26143r0(bool);
        this.f20611R = m26143r0(bool2);
        this.f20612S = m26143r0(bool2);
        this.f20613T = m26143r0(bool);
        this.f20614U = m26143r0(bool);
        this.f20615V = m26143r0(bool2);
        this.f20616W = m26143r0(bool2);
        this.f20617X = m26143r0(bool2);
        this.f20618Y = m26143r0(bool);
    }

    /* JADX INFO: renamed from: s0 */
    public static final AbstractC2706r0 m26098s0(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return abstractC2706r0;
    }

    /* JADX INFO: renamed from: t */
    public static final String m26099t(InterfaceC6039s1 interfaceC6039s1) {
        interfaceC6039s1.getClass();
        return "...";
    }

    /* JADX INFO: renamed from: A */
    public InterfaceC0184l m26100A() {
        return (InterfaceC0184l) this.f20644z.mo7408a(this, f20593Z[24]);
    }

    /* JADX INFO: renamed from: B */
    public boolean m26101B() {
        return ((Boolean) this.f20603J.mo7408a(this, f20593Z[34])).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public Set m26102C() {
        return (Set) this.f20604K.mo7408a(this, f20593Z[35]);
    }

    /* JADX INFO: renamed from: D */
    public boolean m26103D() {
        return ((Boolean) this.f20613T.mo7408a(this, f20593Z[44])).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    public boolean m26104E() {
        return InterfaceC6578w.a.m26094a(this);
    }

    /* JADX INFO: renamed from: F */
    public boolean m26105F() {
        return InterfaceC6578w.a.m26095b(this);
    }

    /* JADX INFO: renamed from: G */
    public boolean m26106G() {
        return ((Boolean) this.f20639u.mo7408a(this, f20593Z[19])).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public boolean m26107H() {
        return ((Boolean) this.f20618Y.mo7408a(this, f20593Z[49])).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public Set m26108I() {
        return (Set) this.f20623e.mo7408a(this, f20593Z[3]);
    }

    /* JADX INFO: renamed from: J */
    public boolean m26109J() {
        return ((Boolean) this.f20632n.mo7408a(this, f20593Z[12])).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public EnumC6554c0 m26110K() {
        return (EnumC6554c0) this.f20595B.mo7408a(this, f20593Z[26]);
    }

    /* JADX INFO: renamed from: L */
    public EnumC6556d0 m26111L() {
        return (EnumC6556d0) this.f20598E.mo7408a(this, f20593Z[29]);
    }

    /* JADX INFO: renamed from: M */
    public boolean m26112M() {
        return ((Boolean) this.f20614U.mo7408a(this, f20593Z[45])).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public boolean m26113N() {
        return ((Boolean) this.f20616W.mo7408a(this, f20593Z[47])).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public EnumC6558e0 m26114O() {
        return (EnumC6558e0) this.f20601H.mo7408a(this, f20593Z[32]);
    }

    /* JADX INFO: renamed from: P */
    public InterfaceC0184l m26115P() {
        return (InterfaceC0184l) this.f20640v.mo7408a(this, f20593Z[20]);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m26116Q() {
        return ((Boolean) this.f20599F.mo7408a(this, f20593Z[30])).booleanValue();
    }

    /* JADX INFO: renamed from: R */
    public boolean m26117R() {
        return ((Boolean) this.f20612S.mo7408a(this, f20593Z[43])).booleanValue();
    }

    /* JADX INFO: renamed from: S */
    public boolean m26118S() {
        return ((Boolean) this.f20600G.mo7408a(this, f20593Z[31])).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public boolean m26119T() {
        return ((Boolean) this.f20635q.mo7408a(this, f20593Z[15])).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public boolean m26120U() {
        return ((Boolean) this.f20609P.mo7408a(this, f20593Z[40])).booleanValue();
    }

    /* JADX INFO: renamed from: V */
    public boolean m26121V() {
        return ((Boolean) this.f20602I.mo7408a(this, f20593Z[33])).booleanValue();
    }

    /* JADX INFO: renamed from: W */
    public boolean m26122W() {
        return ((Boolean) this.f20634p.mo7408a(this, f20593Z[14])).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public boolean m26123X() {
        return ((Boolean) this.f20633o.mo7408a(this, f20593Z[13])).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m26124Y() {
        return ((Boolean) this.f20636r.mo7408a(this, f20593Z[16])).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m26125Z() {
        return ((Boolean) this.f20611R.mo7408a(this, f20593Z[42])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: a */
    public void mo26003a(EnumC6560f0 enumC6560f0) {
        enumC6560f0.getClass();
        this.f20597D.mo7409b(this, f20593Z[28], enumC6560f0);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m26126a0() {
        return ((Boolean) this.f20610Q.mo7408a(this, f20593Z[41])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: b */
    public void mo26006b(EnumC6556d0 enumC6556d0) {
        enumC6556d0.getClass();
        this.f20598E.mo7409b(this, f20593Z[29], enumC6556d0);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m26127b0() {
        return ((Boolean) this.f20594A.mo7408a(this, f20593Z[25])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: c */
    public void mo26009c(Set set) {
        set.getClass();
        this.f20605L.mo7409b(this, f20593Z[36], set);
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m26128c0() {
        return ((Boolean) this.f20625g.mo7408a(this, f20593Z[5])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: d */
    public void mo26012d(boolean z10) {
        this.f20624f.mo7409b(this, f20593Z[4], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m26129d0() {
        return ((Boolean) this.f20624f.mo7408a(this, f20593Z[4])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: e */
    public void mo26015e(Set set) {
        set.getClass();
        this.f20623e.mo7409b(this, f20593Z[3], set);
    }

    /* JADX INFO: renamed from: e0 */
    public EnumC6560f0 m26130e0() {
        return (EnumC6560f0) this.f20597D.mo7408a(this, f20593Z[28]);
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: f */
    public void mo26018f(boolean z10) {
        this.f20621c.mo7409b(this, f20593Z[1], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: f0 */
    public InterfaceC0184l m26131f0() {
        return (InterfaceC0184l) this.f20643y.mo7408a(this, f20593Z[23]);
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: g */
    public boolean mo26021g() {
        return ((Boolean) this.f20631m.mo7408a(this, f20593Z[11])).booleanValue();
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m26132g0() {
        return ((Boolean) this.f20638t.mo7408a(this, f20593Z[18])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: h */
    public void mo26024h(boolean z10) {
        this.f20642x.mo7409b(this, f20593Z[22], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m26133h0() {
        return ((Boolean) this.f20629k.mo7408a(this, f20593Z[9])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: i */
    public void mo26027i(InterfaceC6551b interfaceC6551b) {
        interfaceC6551b.getClass();
        this.f20620b.mo7409b(this, f20593Z[0], interfaceC6551b);
    }

    /* JADX INFO: renamed from: i0 */
    public AbstractC6569n.b m26134i0() {
        return (AbstractC6569n.b) this.f20596C.mo7408a(this, f20593Z[27]);
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: j */
    public void mo26030j(boolean z10) {
        this.f20626h.mo7409b(this, f20593Z[6], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m26135j0() {
        return ((Boolean) this.f20628j.mo7408a(this, f20593Z[8])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: k */
    public void mo26033k(boolean z10) {
        this.f20600G.mo7409b(this, f20593Z[31], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m26136k0() {
        return ((Boolean) this.f20621c.mo7408a(this, f20593Z[1])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: l */
    public void mo26036l(boolean z10) {
        this.f20599F.mo7409b(this, f20593Z[30], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m26137l0() {
        return ((Boolean) this.f20622d.mo7408a(this, f20593Z[2])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: m */
    public Set mo26039m() {
        return (Set) this.f20605L.mo7408a(this, f20593Z[36]);
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m26138m0() {
        return ((Boolean) this.f20630l.mo7408a(this, f20593Z[10])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: n */
    public boolean mo26043n() {
        return ((Boolean) this.f20626h.mo7408a(this, f20593Z[6])).booleanValue();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m26139n0() {
        return ((Boolean) this.f20642x.mo7408a(this, f20593Z[22])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: o */
    public EnumC6549a mo26047o() {
        return (EnumC6549a) this.f20607N.mo7408a(this, f20593Z[38]);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m26140o0() {
        return ((Boolean) this.f20641w.mo7408a(this, f20593Z[21])).booleanValue();
    }

    @Override // p259ra.InterfaceC6578w
    /* JADX INFO: renamed from: p */
    public void mo26049p(boolean z10) {
        this.f20641w.mo7409b(this, f20593Z[21], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m26141p0() {
        return this.f20619a;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m26142q0() {
        this.f20619a = true;
    }

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC2057d m26143r0(Object obj) {
        C2054a c2054a = C2054a.f5765a;
        return new a(obj, this);
    }

    /* JADX INFO: renamed from: s */
    public final C6581z m26144s() {
        C6581z c6581z = new C6581z();
        Iterator itM3774a = AbstractC1027c.m3774a(C6581z.class.getDeclaredFields());
        while (itM3774a.hasNext()) {
            Field field = (Field) itM3774a.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC2055b abstractC2055b = obj instanceof AbstractC2055b ? (AbstractC2055b) obj : null;
                if (abstractC2055b != null) {
                    String name = field.getName();
                    name.getClass();
                    AbstractC8611a0.m33075T(name, "is", false, 2, null);
                    InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C6581z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder("get");
                    String name3 = field.getName();
                    name3.getClass();
                    if (name3.length() > 0) {
                        name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                    }
                    sb2.append(name3);
                    field.set(c6581z, c6581z.m26143r0(abstractC2055b.mo7408a(this, new C1038h0(interfaceC2549cM3807b, name2, sb2.toString()))));
                }
            }
        }
        return c6581z;
    }

    /* JADX INFO: renamed from: u */
    public boolean m26145u() {
        return ((Boolean) this.f20637s.mo7408a(this, f20593Z[17])).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public boolean m26146v() {
        return ((Boolean) this.f20608O.mo7408a(this, f20593Z[39])).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC0184l m26147w() {
        return (InterfaceC0184l) this.f20606M.mo7408a(this, f20593Z[37]);
    }

    /* JADX INFO: renamed from: x */
    public boolean m26148x() {
        return ((Boolean) this.f20617X.mo7408a(this, f20593Z[48])).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public boolean m26149y() {
        return ((Boolean) this.f20627i.mo7408a(this, f20593Z[7])).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC6551b m26150z() {
        return (InterfaceC6551b) this.f20620b.mo7408a(this, f20593Z[0]);
    }
}
