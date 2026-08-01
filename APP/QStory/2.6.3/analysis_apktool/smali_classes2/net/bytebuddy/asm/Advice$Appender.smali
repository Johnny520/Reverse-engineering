.class public Lnet/bytebuddy/asm/Advice$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final advice:Lnet/bytebuddy/asm/Advice;

.field private final delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Appender;->advice:Lnet/bytebuddy/asm/Advice;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Appender;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 7

    .line 1
    new-instance v3, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Appender;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 4
    .line 5
    invoke-direct {v3, p1, v0}, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Appender;->advice:Lnet/bytebuddy/asm/Advice;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 11
    .line 12
    invoke-interface {p0}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v4, p2

    .line 19
    move-object v2, p3

    .line 20
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice;->doWrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;II)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v3, p0, v4, v2}, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->resolve(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Appender;->advice:Lnet/bytebuddy/asm/Advice;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Appender;->advice:Lnet/bytebuddy/asm/Advice;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lnet/bytebuddy/asm/Advice;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Appender;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Appender;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
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
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Appender;->advice:Lnet/bytebuddy/asm/Advice;

    .line 12
    .line 13
    invoke-virtual {v1}, Lnet/bytebuddy/asm/Advice;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Appender;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    return p0
.end method
