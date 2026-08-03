.class public Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final LOOKUP_DATA_DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;


# instance fields
.field private final declaredFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

.field private final specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final targetMethod:Lnet/bytebuddy/description/method/MethodDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->LOOKUP_DATA_DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/util/List;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    return-void
.end method

.method private static dispatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;
    .locals 6
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    :try_start_0
    const-string v0, "java.lang.invoke.MethodHandles$Lookup"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "classData"

    const-class v4, Ljava/lang/String;

    const-class v5, Ljava/lang/Class;

    filled-new-array {v0, v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingMethodHandle;

    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-string v4, "java.lang.invoke.MethodHandle"

    invoke-static {v4, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "invokeExact"

    const-class v4, [Ljava/lang/Object;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-direct {v3, v1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-direct {v0, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingMethodHandle;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingDirectInvocation;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingDirectInvocation;

    return-object v0
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/util/List;Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;

    sget-object v1, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    if-eq p3, v1, :cond_1

    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object p3

    invoke-interface {p3}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p3

    invoke-interface {p3, p4}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object p3, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingDirectInvocation;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher$UsingDirectInvocation;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p3, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->LOOKUP_DATA_DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    :goto_1
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/util/List;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;)V

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 15

    move-object v0, p0

    const/4 v1, 0x0

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    mul-int/2addr v3, v4

    const/4 v5, 0x1

    add-int/2addr v3, v5

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    mul-int/2addr v6, v4

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v10}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v10

    invoke-interface {v7}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    move-result v7

    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    sget-object v10, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v8, v9, v7, v10}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v8}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v9}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    new-array v10, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v9, v10, v1

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    aput-object v9, v10, v5

    invoke-direct {v8, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_2

    :cond_2
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    :goto_2
    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    invoke-interface {v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;->initialize()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    new-instance v10, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {v10, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v3, v11}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v3

    sget-object v11, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v12

    if-eqz v12, :cond_3

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    goto :goto_3

    :cond_3
    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    :goto_3
    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v13

    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v13

    sget-object v14, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v11, v12, v13, v14}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v11

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-static {v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    const/4 v13, 0x7

    new-array v13, v13, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v8, v13, v1

    aput-object v9, v13, v5

    aput-object v10, v13, v4

    const/4 v1, 0x3

    aput-object v2, v13, v1

    const/4 v1, 0x4

    aput-object v3, v13, v1

    const/4 v1, 0x5

    aput-object v11, v13, v1

    const/4 v1, 0x6

    aput-object v12, v13, v1

    invoke-direct {v7, v13}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v7, v1, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result v2

    invoke-direct {v6, v1, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v6
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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->targetMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->specializedLambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->declaredFields:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender;->dispatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation$Appender$Dispatcher;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
