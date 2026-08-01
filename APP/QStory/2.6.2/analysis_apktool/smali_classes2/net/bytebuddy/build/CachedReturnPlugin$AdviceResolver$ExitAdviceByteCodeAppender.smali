.class public Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExitAdviceByteCodeAppender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final branch:I

.field private final convert:I

.field private final load:I

.field private final size:I

.field private final store:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->convert:I

    .line 9
    .line 10
    iput p4, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->branch:I

    .line 11
    .line 12
    iput p5, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 10

    .line 1
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    invoke-virtual {p1, v2, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 15
    .line 16
    .line 17
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->convert:I

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->branch:I

    .line 25
    .line 26
    invoke-virtual {p1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 30
    .line 31
    iget v3, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 32
    .line 33
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 34
    .line 35
    .line 36
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 37
    .line 38
    invoke-virtual {p1, v2, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xa7

    .line 42
    .line 43
    invoke-virtual {p1, v2, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 44
    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v2, 0x3

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    move-object v1, p1

    .line 52
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 56
    .line 57
    .line 58
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 59
    .line 60
    invoke-virtual {p1, v2, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    .line 62
    .line 63
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 64
    .line 65
    iget v3, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 66
    .line 67
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/16 v2, 0xb1

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 84
    .line 85
    iget v0, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 86
    .line 87
    mul-int/lit8 v0, v0, 0x2

    .line 88
    .line 89
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-direct {v1, v0, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 30
    .line 31
    iget v3, p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->convert:I

    .line 37
    .line 38
    iget v3, p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->convert:I

    .line 39
    .line 40
    if-eq v2, v3, :cond_5

    .line 41
    .line 42
    return v1

    .line 43
    :cond_5
    iget v2, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->branch:I

    .line 44
    .line 45
    iget v3, p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->branch:I

    .line 46
    .line 47
    if-eq v2, v3, :cond_6

    .line 48
    .line 49
    return v1

    .line 50
    :cond_6
    iget p0, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 51
    .line 52
    iget p1, p1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 53
    .line 54
    if-eq p0, p1, :cond_7

    .line 55
    .line 56
    return v1

    .line 57
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget v1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->load:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget v1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->store:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    iget v1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->convert:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    iget v1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->branch:I

    .line 27
    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget p0, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;->size:I

    .line 32
    .line 33
    add-int/2addr v0, p0

    .line 34
    return v0
.end method
