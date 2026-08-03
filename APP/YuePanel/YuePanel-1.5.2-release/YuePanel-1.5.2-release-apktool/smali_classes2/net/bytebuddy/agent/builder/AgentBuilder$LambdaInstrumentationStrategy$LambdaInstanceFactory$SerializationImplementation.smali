.class public Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SerializationImplementation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final lambdaMethodName:Ljava/lang/String;

.field private final lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

.field private final targetType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    return-void
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "java.lang.invoke.SerializedLambda"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-class v9, Ljava/lang/Object;

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    new-instance v10, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v11

    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    sget-object v13, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface {v8}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    sget-object v14, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v13, v8, v9, v14}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    new-array v9, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v11, v9, v4

    aput-object v12, v9, v3

    aput-object v8, v9, v0

    invoke-direct {v10, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    iget-object v11, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v11

    new-instance v12, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v13, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v13}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v13, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v14, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    invoke-direct {v13, v14}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v14, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v15, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    iget-object v15, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getHandleType()Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    move-result-object v15

    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->getIdentifier()I

    move-result v15

    invoke-static {v15}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v15

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v3, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v3, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v4, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getDescriptor()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    new-instance v4, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    move-object/from16 p1, v7

    iget-object v7, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v7

    invoke-virtual {v7, v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v5

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v7

    invoke-interface {v5, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v5}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v5

    const/16 v7, 0xe

    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v9, 0x0

    aput-object v10, v7, v9

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    const/4 v10, 0x1

    aput-object v9, v7, v10

    const/4 v9, 0x2

    aput-object v11, v7, v9

    const/4 v9, 0x3

    aput-object v12, v7, v9

    const/4 v9, 0x4

    aput-object v13, v7, v9

    const/4 v9, 0x5

    aput-object v14, v7, v9

    const/4 v9, 0x6

    aput-object v15, v7, v9

    const/4 v9, 0x7

    aput-object v2, v7, v9

    const/16 v2, 0x8

    aput-object v0, v7, v2

    const/16 v0, 0x9

    aput-object v3, v7, v0

    const/16 v0, 0xa

    aput-object v4, v7, v0

    const/16 v0, 0xb

    aput-object v6, v7, v0

    const/16 v0, 0xc

    aput-object v5, v7, v0

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/16 v2, 0xd

    aput-object v0, v7, v2

    invoke-direct {v8, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v2, 0x0

    aput-object v8, v0, v2

    move-object/from16 v2, p1

    invoke-direct {v2, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object v2

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Cannot find class for lambda serialization"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    return-object p1
.end method
