.class public Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 16

    move-object/from16 v0, p0

    const/4 v2, 0x4

    const/4 v3, 0x2

    sget-object v4, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v4

    iget-object v6, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v6}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    iget-object v7, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v7}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    new-instance v11, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    sget-object v13, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->load()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v13

    iget-object v14, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v14}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$200(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    move-result-object v14

    const-class v15, Ljava/lang/Object;

    invoke-static {v15}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v15

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v14, v15, v10, v1}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    new-array v10, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v4, v10, v8

    aput-object v12, v10, v5

    aput-object v13, v10, v3

    const/4 v12, 0x3

    aput-object v1, v10, v12

    invoke-direct {v11, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    aput-object v11, v6, v9

    add-int/2addr v9, v5

    goto :goto_0

    :cond_0
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object v4, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v4}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v4

    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    goto :goto_1

    :cond_1
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    iget-object v9, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v9

    const-string v10, "target"

    invoke-static {v10}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v10

    invoke-interface {v9, v10}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/field/FieldList;

    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    new-array v10, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v7, v10, v8

    aput-object v9, v10, v5

    invoke-direct {v4, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    :goto_1
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {v7, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iget-object v6, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v6}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v6

    iget-object v9, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v9}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$200(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    move-result-object v9

    iget-object v10, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-static {v10}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v10

    invoke-interface {v10}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v11

    sget-object v12, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v9, v10, v11, v12}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    const/4 v10, 0x5

    new-array v10, v10, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v4, v10, v8

    aput-object v7, v10, v5

    aput-object v6, v10, v3

    const/4 v3, 0x3

    aput-object v9, v10, v3

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    aput-object v3, v10, v2

    invoke-direct {v1, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v1

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v2
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;

    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
