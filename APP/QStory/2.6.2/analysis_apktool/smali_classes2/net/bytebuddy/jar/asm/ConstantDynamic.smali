.class public final Lnet/bytebuddy/jar/asm/ConstantDynamic;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

.field private final bootstrapMethodArguments:[Ljava/lang/Object;

.field private final descriptor:Ljava/lang/String;

.field private final name:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " : "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " "

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p0, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/Handle;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    return v0

    .line 54
    :cond_2
    return v2
.end method

.method public getBootstrapMethod()Lnet/bytebuddy/jar/asm/Handle;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBootstrapMethodArgument(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public getBootstrapMethodArgumentCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getBootstrapMethodArgumentsUnsafe()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/16 v0, 0x4a

    .line 9
    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x44

    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x2

    .line 20
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    xor-int/2addr v0, v1

    .line 20
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 21
    .line 22
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/Handle;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/16 v2, 0x10

    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    xor-int/2addr v0, v1

    .line 33
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/16 v1, 0x18

    .line 40
    .line 41
    invoke-static {p0, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    xor-int/2addr p0, v0

    .line 46
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->name:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->descriptor:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethod:Lnet/bytebuddy/jar/asm/Handle;

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ConstantDynamic;->bootstrapMethodArguments:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, v1, v2, p0}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->stringConcat$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
