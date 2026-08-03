.class public Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConstantTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "constant"


# instance fields
.field private final sourceConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final sourceHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final sourceType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    iput-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    iput-object p4, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    iput-object p5, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    iput-object p6, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v10, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v10}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    const/16 v11, 0xc0

    const/16 v12, 0x99

    const/16 v13, 0xc1

    const/16 v14, 0xb0

    const/16 v15, 0x19

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    if-eqz v1, :cond_0

    invoke-virtual {v7, v15, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v13, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v12, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v15, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v11, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const-class v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    new-array v2, v6, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v5

    const/16 v17, 0x0

    const/16 v2, 0xb6

    const-string v4, "getDescriptor"

    move-object/from16 v1, p1

    move v11, v6

    move/from16 v6, v17

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0xb8

    const-string v4, "getType"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    move v11, v6

    :goto_0
    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    if-eqz v1, :cond_1

    invoke-virtual {v7, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v13, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v12, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0xb8

    const-string v4, "handle"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    :cond_1
    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    if-eqz v1, :cond_2

    invoke-virtual {v7, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v13, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v12, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0xb8

    const-string v4, "constantDyanmic"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    :cond_2
    invoke-virtual {v7, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v1
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    if-eqz v3, :cond_3

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_3
    if-eqz v2, :cond_5

    :cond_4
    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    if-eqz v3, :cond_6

    if-eqz v2, :cond_7

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_6
    if-eqz v2, :cond_8

    :cond_7
    return v1

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    if-eqz v3, :cond_9

    if-eqz v2, :cond_a

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_9
    if-eqz v2, :cond_b

    :cond_a
    return v1

    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    if-eqz v3, :cond_c

    if-eqz v2, :cond_d

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    return v1

    :cond_c
    if-eqz v2, :cond_e

    :cond_d
    return v1

    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    if-eqz v3, :cond_f

    if-eqz v2, :cond_10

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    return v1

    :cond_f
    if-eqz v2, :cond_11

    :cond_10
    return v1

    :cond_11
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    if-eqz p1, :cond_12

    if-eqz v2, :cond_13

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v1

    :cond_12
    if-eqz v2, :cond_14

    :cond_13
    return v1

    :cond_14
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    return v0
.end method
