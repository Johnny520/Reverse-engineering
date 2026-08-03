.class public Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/NexusAccessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InitializationAppender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final identification:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 17

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Object;

    const-class v4, Ljava/lang/String;

    const-class v5, Ljava/lang/ClassLoader;

    const-class v6, Ljava/lang/Class;

    :try_start_0
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    new-instance v9, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-string v10, "getSystemClassLoader"

    const/4 v11, 0x0

    invoke-virtual {v5, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-direct {v9, v10}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v9

    new-instance v10, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    const-class v11, Lnet/bytebuddy/dynamic/Nexus;

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v11, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-string v12, "loadClass"

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v5, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-direct {v11, v5}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v5

    new-instance v11, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    const-string v12, "initialize"

    invoke-direct {v11, v12}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    invoke-static {v12}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v12

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v13

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    invoke-static {v15}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v15

    new-array v1, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v13, v1, v2

    const/4 v13, 0x1

    aput-object v15, v1, v13

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v12, v1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    new-instance v12, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-string v13, "getMethod"

    const-class v15, [Ljava/lang/Class;

    filled-new-array {v4, v15}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v6, v13, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-direct {v12, v4}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v4

    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v6

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-static {v12}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    new-instance v13, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    move-object/from16 v15, p0

    iget v2, v15, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-class v15, Ljava/lang/Integer;

    move-object/from16 v16, v7

    const-string v7, "valueOf"

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v15, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-direct {v0, v7}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v0

    const/4 v7, 0x2

    new-array v14, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v15, 0x0

    aput-object v2, v14, v15

    const/4 v2, 0x1

    aput-object v0, v14, v2

    invoke-direct {v13, v14}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    new-array v0, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v12, v0, v15

    aput-object v13, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-class v6, Ljava/lang/reflect/Method;

    const-string v7, "invoke"

    const-class v12, [Ljava/lang/Object;

    filled-new-array {v3, v12}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v6, v7, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-direct {v2, v3}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v6, 0x0

    aput-object v9, v3, v6

    const/4 v6, 0x1

    aput-object v10, v3, v6

    const/4 v6, 0x2

    aput-object v5, v3, v6

    const/4 v5, 0x3

    aput-object v11, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v1, 0x5

    aput-object v4, v3, v1

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v1, 0x7

    aput-object v0, v3, v1

    const/16 v0, 0x8

    aput-object v2, v3, v0

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    const/16 v1, 0x9

    aput-object v0, v3, v1

    invoke-direct {v8, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    move-object/from16 v1, v16

    invoke-direct {v1, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v1, v0, v2, v3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot locate method"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
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
    iget v2, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    check-cast p1, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;

    iget p1, p1, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    if-eq v2, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    add-int/2addr v0, v1

    return v0
.end method
