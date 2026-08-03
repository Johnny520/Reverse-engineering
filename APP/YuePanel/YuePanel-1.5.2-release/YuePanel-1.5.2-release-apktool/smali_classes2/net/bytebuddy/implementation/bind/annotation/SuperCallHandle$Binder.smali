.class public final enum Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Binder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
        "Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

.field private static final FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

.field private static final NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v0

    const-string v1, "fallbackToDefault"

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    const-string v1, "nullIfImpossible"

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;
    .locals 1

    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;

    return-object v0
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            "Lnet/bytebuddy/implementation/Implementation$Target;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            ")",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding<",
            "*>;"
        }
    .end annotation

    move-object v0, p1

    move-object/from16 v1, p4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    sget-object v7, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v6, v8}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v6

    const-class v8, Ljava/lang/Boolean;

    if-eqz v6, :cond_1

    sget-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p1, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object v0

    invoke-interface {v0, v8}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;

    :goto_0
    return-object v0

    :cond_1
    sget-object v6, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p1, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object v6

    invoke-interface {v6, v8}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    move-result-object v6

    invoke-interface {v1, v6}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeDominant(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    move-result-object v6

    invoke-interface {v1, v6}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeSuper(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object v1

    :goto_1
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    move-result-object v6

    invoke-interface {v1, v6}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;->withCheckedCompatibilityTo(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    move-result v6

    if-eqz v6, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v5

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    add-int/2addr v6, v4

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    mul-int/2addr v8, v2

    add-int/2addr v6, v8

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;->toMethodHandle()Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v1

    const-class v6, Ljava/lang/Object;

    if-nez v1, :cond_4

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    new-instance v9, Lnet/bytebuddy/description/method/MethodDescription$Token;

    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    new-instance v10, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v11

    new-array v12, v4, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v11, v12, v5

    invoke-direct {v10, v12}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string v11, "bindTo"

    invoke-direct {v9, v11, v4, v7, v10}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {v1, v8, v9}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-interface {v8}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v9

    if-eqz v9, :cond_5

    new-instance v9, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    invoke-interface {v8}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v11

    invoke-interface {v8}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    invoke-interface {v12, v11, v8, v13}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    new-array v11, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v10, v11, v5

    aput-object v8, v11, v4

    invoke-direct {v9, v11}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_4

    :cond_5
    move-object/from16 v12, p5

    move-object/from16 v13, p6

    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    :goto_4
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v6

    invoke-virtual {v6, v1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object v6, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$Token;

    sget-object v8, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v8}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    new-instance v10, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-virtual {v8}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v11}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v11

    const-class v12, [Ljava/lang/Object;

    invoke-static {v12}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    new-array v2, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v8, v2, v5

    aput-object v11, v2, v4

    aput-object v12, v2, v3

    invoke-direct {v10, v2}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string v2, "insertArguments"

    const/16 v3, 0x9

    invoke-direct {v7, v2, v3, v9, v10}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {v1, v6, v7}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {v1, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    goto :goto_5

    :cond_8
    sget-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p1, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object v0

    invoke-interface {v0, v8}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    :goto_5
    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object v0

    :cond_9
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A method handle for a super method invocation cannot be assigned to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getHandledType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/SuperCallHandle;

    return-object v0
.end method
