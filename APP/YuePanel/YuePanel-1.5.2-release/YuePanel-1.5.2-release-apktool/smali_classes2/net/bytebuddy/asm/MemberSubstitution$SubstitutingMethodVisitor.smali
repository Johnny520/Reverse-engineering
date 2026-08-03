.class public Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;
.super Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SubstitutingMethodVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;
    }
.end annotation


# instance fields
.field private final failIfNoMatch:Z

.field private final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private localVariableExtension:I

.field private matched:Z

.field private final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field private final replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

.field private stackSizeBuffer:I

.field private final strict:Z

.field private final typePool:Lnet/bytebuddy/pool/TypePool;

.field private final virtualPrivateCalls:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Z)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)V

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iput-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iput-boolean p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    iput-boolean p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->failIfNoMatch:Z

    iput-object p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    iput-object p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    iput-object p9, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    iput-boolean p10, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->virtualPrivateCalls:Z

    const/4 p1, 0x0

    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    return-void
.end method

.method public static synthetic access$700(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    return p0
.end method

.method public static synthetic access$702(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;I)I
    .locals 0

    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    return p1
.end method


# virtual methods
.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    const/16 v6, 0x2f

    const/16 v7, 0x2e

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    move-result v8

    const-string v9, " using "

    const-string v10, "Could not resolve "

    if-eqz v8, :cond_a

    invoke-interface {v5}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-interface {v11}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v11

    iget-boolean v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v12, :cond_1

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    goto :goto_0

    :cond_1
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v12

    :goto_0
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v11

    check-cast v11, Lnet/bytebuddy/description/field/FieldList;

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_0

    :cond_2
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    iget-object v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v5}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v5

    check-cast v16, Lnet/bytebuddy/description/field/FieldDescription;

    const/16 v5, 0xb5

    if-eq v1, v5, :cond_4

    const/16 v5, 0xb3

    if-ne v1, v5, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v17, v4

    goto :goto_2

    :cond_4
    :goto_1
    move/from16 v17, v3

    :goto_2
    invoke-interface/range {v12 .. v17}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription;Z)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->isBound()Z

    move-result v6

    if-eqz v6, :cond_8

    packed-switch v1, :pswitch_data_0

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected opcode: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v2

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v6}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v2, v7, v4

    aput-object v6, v7, v3

    invoke-direct {v1, v7}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    :goto_3
    move-object v6, v1

    move-object v7, v2

    goto :goto_5

    :pswitch_1
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v2

    new-array v6, v3, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v2, v6, v4

    invoke-direct {v1, v6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    :goto_4
    move-object v6, v1

    move-object v7, v2

    move v4, v3

    goto :goto_5

    :pswitch_2
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    new-array v6, v3, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v2, v6, v4

    invoke-direct {v1, v6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    goto :goto_3

    :pswitch_3
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    invoke-direct {v1}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    goto :goto_4

    :goto_5
    iget v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    if-eqz v4, :cond_5

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofGetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v2

    :goto_6
    move-object v8, v2

    goto :goto_7

    :cond_5
    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v2

    goto :goto_6

    :goto_7
    if-eqz v4, :cond_6

    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    :goto_8
    move-object v9, v2

    goto :goto_9

    :cond_6
    invoke-interface {v11}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    goto :goto_8

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->getFreeOffset()I

    move-result v10

    invoke-interface/range {v5 .. v10}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    new-instance v4, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;

    iget-object v5, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    const/4 v6, 0x0

    invoke-direct {v4, v0, v5, v6}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/MemberSubstitution$1;)V

    iget-object v5, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-interface {v2, v4, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    iput-boolean v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    return-void

    :cond_7
    iget-boolean v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-nez v3, :cond_9

    :cond_8
    move-object/from16 v4, p3

    move-object/from16 v5, p4

    goto :goto_a

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, p3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, p4

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    move-object/from16 v4, p3

    move-object/from16 v5, p4

    iget-boolean v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-nez v3, :cond_b

    :goto_a
    invoke-super/range {p0 .. p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitMaxs(II)V
    .locals 1

    iget-boolean v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->failIfNoMatch:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No substitution found within "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    add-int/2addr p1, v0

    iget v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 26

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x1

    const/4 v5, 0x2

    iget-object v6, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    const/16 v7, 0x2f

    const/16 v8, 0x2e

    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    move-result v9

    const-string v10, " using "

    const-string v11, "Could not resolve "

    if-eqz v9, :cond_16

    const/16 v9, 0xb7

    if-ne v1, v9, :cond_1

    const-string v12, "<init>"

    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    iget-boolean v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v13, :cond_0

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    goto :goto_0

    :cond_0
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    :goto_0
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/MethodList;

    goto/16 :goto_6

    :cond_1
    const/16 v12, 0xb8

    if-ne v1, v12, :cond_5

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_2
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v13

    iget-boolean v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v14, :cond_3

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v15

    invoke-interface {v14, v15}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    goto :goto_1

    :cond_3
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v15

    invoke-interface {v14, v15}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static {v14}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    :goto_1
    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v13

    check-cast v13, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_2

    :cond_4
    move-object v12, v13

    goto/16 :goto_6

    :cond_5
    if-ne v1, v9, :cond_7

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    iget-boolean v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v13, :cond_6

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    goto :goto_2

    :cond_6
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    :goto_2
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/MethodList;

    goto/16 :goto_6

    :cond_7
    iget-boolean v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->virtualPrivateCalls:Z

    if-eqz v12, :cond_a

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    iget-boolean v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v13, :cond_8

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static {v14}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v15

    invoke-interface {v14, v15}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    goto :goto_3

    :cond_8
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static {v14}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v15

    invoke-interface {v14, v15}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    :goto_3
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_c

    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v13

    iget-object v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v12, v13, v14}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    move-result-object v12

    invoke-virtual {v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    iget-boolean v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v13, :cond_9

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    goto :goto_4

    :cond_9
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    :goto_4
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/MethodList;

    goto :goto_6

    :cond_a
    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v13

    iget-object v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v12, v13, v14}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    move-result-object v12

    invoke-interface {v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    move-result-object v12

    invoke-virtual {v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    iget-boolean v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-eqz v13, :cond_b

    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    goto :goto_5

    :cond_b
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v14

    invoke-interface {v13, v14}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    :goto_5
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/description/method/MethodList;

    :cond_c
    :goto_6
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_13

    iget-object v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    iget-object v15, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v7, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v17

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v18, v8

    check-cast v18, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v1, v8}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->of(ILnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    move-result-object v19

    move-object/from16 v16, v7

    invoke-interface/range {v14 .. v19}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->isBound()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v2

    if-nez v2, :cond_e

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_8

    :cond_d
    new-instance v2, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v7

    invoke-static {v3, v7}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>(Ljava/util/List;)V

    :goto_7
    move-object/from16 v21, v2

    goto :goto_9

    :cond_e
    :goto_8
    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v2

    goto :goto_7

    :goto_9
    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    :goto_a
    move-object/from16 v22, v2

    goto :goto_b

    :cond_f
    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    goto :goto_a

    :goto_b
    if-ne v1, v9, :cond_10

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-static {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSpecial(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v2

    :goto_c
    move-object/from16 v23, v2

    goto :goto_d

    :cond_10
    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v2

    goto :goto_c

    :goto_d
    if-ne v1, v9, :cond_11

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    invoke-interface {v6}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->special(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    :goto_e
    move-object/from16 v24, v1

    goto :goto_f

    :cond_11
    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    goto :goto_e

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->getFreeOffset()I

    move-result v25

    invoke-interface/range {v20 .. v25}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    new-instance v2, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;

    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    const/4 v6, 0x0

    invoke-direct {v2, v0, v3, v6}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/MemberSubstitution$1;)V

    iget-object v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v1

    invoke-interface {v12}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v2

    if-eqz v2, :cond_12

    iget v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v1

    add-int/2addr v1, v5

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    const-class v6, Ljava/lang/Object;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-virtual {v3, v7}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-virtual {v3, v6}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v3

    const/4 v6, 0x6

    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    sget-object v7, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    aput-object v7, v6, v4

    aput-object v7, v6, v5

    const/4 v5, 0x3

    aput-object v3, v6, v5

    const/4 v3, 0x4

    aput-object v7, v6, v3

    const/4 v3, 0x5

    aput-object v7, v6, v3

    invoke-direct {v2, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v5, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-virtual {v2, v3, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v2

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    goto :goto_10

    :cond_12
    iget v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    :goto_10
    iput-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    return-void

    :cond_13
    iget-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-nez v4, :cond_15

    :cond_14
    move-object/from16 v5, p4

    goto :goto_11

    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, p4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    move-object/from16 v5, p4

    iget-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    if-nez v4, :cond_17

    :goto_11
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
