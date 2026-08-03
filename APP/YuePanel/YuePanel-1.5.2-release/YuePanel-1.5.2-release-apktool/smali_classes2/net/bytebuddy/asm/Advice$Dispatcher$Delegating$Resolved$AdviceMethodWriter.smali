.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AdviceMethodWriter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodExit;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodEnter;
    }
.end annotation


# instance fields
.field protected final adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field protected final argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final delegator:Lnet/bytebuddy/asm/Advice$Delegator;

.field private final exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field protected final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

.field protected final methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

.field private final offsetMappings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;"
        }
    .end annotation
.end field

.field private final postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

.field private final relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

.field protected final stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

.field private final suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Delegator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->offsetMappings:Ljava/util/List;

    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iput-object p8, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    iput-object p9, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    iput-object p10, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iput-object p11, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    iput-object p12, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    iput-object p13, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    iput-object p14, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    iput-object p15, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 9

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onStart(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->offsetMappings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v5}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-interface {v3, v4, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v3

    add-int/2addr v3, v2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v3, v6

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v0, v2, v3}, Lnet/bytebuddy/asm/Advice$Delegator;->apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-interface {v0, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v0

    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v6}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onEndWithSkip(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v2

    :goto_1
    const/16 v3, 0x37

    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_7

    :cond_3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v2

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v2

    :goto_2
    const/16 v3, 0x38

    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_7

    :cond_5
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v2

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v2

    :goto_3
    const/16 v3, 0x39

    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_7

    :cond_7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v2

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v2

    :goto_4
    const/16 v3, 0x3a

    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_7

    :cond_9
    :goto_5
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v2

    goto :goto_6

    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v2

    :goto_6
    const/16 v3, 0x36

    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    :cond_b
    :goto_7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    iget-object v8, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-interface/range {v2 .. v8}, Lnet/bytebuddy/asm/Advice$PostProcessor;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v5}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    move-result v5

    goto :goto_8

    :cond_c
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    invoke-interface {v5}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    move-result v5

    :goto_8
    invoke-interface {v2, v3, v4, v5}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;I)I

    move-result v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {v1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result v1

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    move-result v2

    add-int/2addr v1, v2

    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    return-void
.end method

.method public abstract isExitAdvice()Z
.end method

.method public prepare()V
    .locals 2

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onPrepare(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    return-void
.end method
