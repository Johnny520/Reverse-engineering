.class public Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;
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
    name = "AttributeTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "attribute"


# instance fields
.field private final sourceAttribute:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

.field private final targetAttribute:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    iput-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p4, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 12

    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v2, 0x19

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v4, 0xc7

    invoke-virtual {p1, v4, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v5, 0xb0

    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v0

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v6

    invoke-virtual {v0, p1, v6}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0xc1

    invoke-virtual {p1, v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v0, 0x99

    invoke-virtual {p1, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0xc0

    invoke-virtual {p1, v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    invoke-static {v6}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    const-string v8, "delegate"

    invoke-virtual {p1, v7, v0, v8, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object p2

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p3

    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    iget-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0xbb

    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 p2, 0x59

    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v8

    sget-object p2, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    iget-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object p3

    filled-new-array {p3}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object p3

    invoke-static {p2, p3}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/16 v7, 0xb7

    const-string v9, "<init>"

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    const/4 p2, 0x3

    invoke-direct {p1, p2, v4}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object p1
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

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

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
