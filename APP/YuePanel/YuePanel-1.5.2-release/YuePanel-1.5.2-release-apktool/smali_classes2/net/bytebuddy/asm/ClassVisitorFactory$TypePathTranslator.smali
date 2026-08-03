.class public Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;
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
    name = "TypePathTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "typePath"


# instance fields
.field private final sourceTypePath:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetTypePath:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->sourceTypePath:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 11

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

    const/16 v5, 0xa7

    invoke-virtual {p1, v5, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v5

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v6

    invoke-virtual {v5, p1, v6}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->sourceTypePath:Ljava/lang/Class;

    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    const-class v0, Ljava/lang/String;

    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    new-array v3, v3, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v2, v3}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v6, 0xb6

    const-string v8, "toString"

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v0

    filled-new-array {v0}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v0

    invoke-static {v2, v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v9

    const/16 v6, 0xb8

    const-string v8, "fromString"

    invoke-virtual/range {v5 .. v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object p2

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p3

    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object p3

    invoke-virtual {p2, p1, v0, p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same1(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/List;)V

    const/16 p2, 0xb0

    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    const/4 p2, 0x2

    invoke-direct {p1, v4, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->sourceTypePath:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->sourceTypePath:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->sourceTypePath:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;->targetTypePath:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
