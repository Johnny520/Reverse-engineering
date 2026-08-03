.class public Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

.field final synthetic this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p3

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, v0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    invoke-interface {v7, v1}, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v8

    const-string v9, " from "

    if-nez v8, :cond_1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot set instance field "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    goto :goto_1

    :cond_2
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    :goto_1
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {v10, v11}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v10

    if-nez v10, :cond_3

    new-instance v9, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v10

    invoke-interface {v10}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    iget-object v11, v0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    iget-object v11, v11, Lnet/bytebuddy/implementation/FieldAccessor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v13

    iget-object v14, v0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    iget-object v14, v14, Lnet/bytebuddy/implementation/FieldAccessor;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v11, v12, v13, v14}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v11

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    invoke-static {v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v8, v4, v6

    aput-object v10, v4, v5

    aput-object v11, v4, v3

    aput-object v12, v4, v2

    invoke-direct {v9, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto/16 :goto_3

    :cond_3
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    invoke-interface {v10, v11}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v5, :cond_7

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_2

    :cond_4
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot set final field "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_2
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v10

    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-static {v10}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    iget-object v11, v0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    iget-object v11, v11, Lnet/bytebuddy/implementation/FieldAccessor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v12

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-interface {v12}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v12

    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v13

    iget-object v14, v0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    iget-object v14, v14, Lnet/bytebuddy/implementation/FieldAccessor;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v11, v12, v13, v14}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v11

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v12

    const/4 v13, 0x5

    new-array v13, v13, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v8, v13, v6

    aput-object v10, v13, v5

    aput-object v11, v13, v3

    aput-object v12, v13, v2

    sget-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    aput-object v2, v13, v4

    invoke-direct {v9, v13}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    :goto_3
    invoke-interface {v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-interface {v9, v3, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v3

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result v1

    invoke-direct {v2, v3, v1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v2

    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot set or get value of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " using "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Method "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is no bean accessor"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " does not describe a field getter or setter"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    check-cast p1, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;

    iget-object v3, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    iget-object p1, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/implementation/FieldAccessor;->equals(Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForImplicitProperty;

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/FieldAccessor;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
