.class public abstract Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$AssignerConfigurable;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final CACHED:Z = true

.field private static final DROPPING:Z = false

.field private static final INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private static final PRIVILEGED:Z = true

.field private static final RETURNING:Z = true

.field private static final UNCACHED:Z

.field private static final UNPRIVILEGED:Z


# instance fields
.field protected final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final cached:Z

.field protected final fieldName:Ljava/lang/String;

.field protected final privileged:Z

.field protected final returning:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ljava/lang/reflect/InvocationHandler;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    iput-boolean p2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    iput-boolean p3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    iput-boolean p4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    iput-object p5, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    return-object v0
.end method

.method private argumentValuesOf(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p1

    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object v5

    invoke-virtual {v5, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v6, v3, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    aput-object v6, v7, v1

    invoke-direct {v4, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static of(Ljava/lang/reflect/InvocationHandler;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invocationHandler$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->of(Ljava/lang/reflect/InvocationHandler;Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/reflect/InvocationHandler;Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 8

    .line 2
    new-instance v7, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    const/4 v4, 0x1

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    return-object v7
.end method

.method public static toField(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 8

    .line 2
    new-instance v7, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;

    const/4 v4, 0x1

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    return-object v7
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v5

    if-nez v5, :cond_4

    iget-boolean v5, v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    if-eqz v5, :cond_0

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->ofPrivileged(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;

    move-result-object v5

    :goto_0
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static/range {p5 .. p5}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    iget-boolean v9, v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    if-eqz v9, :cond_1

    invoke-interface {v5}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;->cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    :cond_1
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    const-class v10, Ljava/lang/Object;

    if-eqz v9, :cond_2

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    goto :goto_1

    :cond_2
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v9

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->argumentValuesOf(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9, v11}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    :goto_1
    sget-object v11, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-interface {v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v11

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v11

    check-cast v11, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v11

    iget-boolean v12, v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    if-eqz v12, :cond_3

    new-instance v12, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object v13, v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v14

    sget-object v15, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v13, v10, v14, v15}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v13

    new-array v14, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v10, v14, v3

    aput-object v13, v14, v2

    invoke-direct {v12, v14}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_2

    :cond_3
    sget-object v12, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    :goto_2
    const/4 v10, 0x7

    new-array v10, v10, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object p4, v10, v3

    aput-object v7, v10, v2

    aput-object v8, v10, v4

    const/4 v2, 0x3

    aput-object v5, v10, v2

    const/4 v2, 0x4

    aput-object v9, v10, v2

    const/4 v2, 0x5

    aput-object v11, v10, v2

    const/4 v2, 0x6

    aput-object v12, v10, v2

    invoke-direct {v6, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v6, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v2

    new-instance v3, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v2

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result v1

    invoke-direct {v3, v2, v1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v3

    :cond_4
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "It is not possible to apply an invocation handler onto the static method or constructor "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    check-cast p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object p1, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public abstract withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation;
.end method

.method public abstract withPrivilegedLookup()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$AssignerConfigurable;
.end method

.method public abstract withoutMethodCache()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;
.end method
