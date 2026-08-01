.class public final Lnet/bytebuddy/jar/asm/TypePath;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final ARRAY_ELEMENT:I = 0x0

.field public static final INNER_TYPE:I = 0x1

.field public static final TYPE_ARGUMENT:I = 0x3

.field public static final WILDCARD_BOUND:I = 0x2


# instance fields
.field private final typePathContainer:[B

.field private final typePathOffset:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathContainer:[B

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathOffset:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/TypePath;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    new-instance v2, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move v4, v3

    .line 26
    :goto_0
    const/4 v5, 0x2

    .line 27
    if-ge v4, v1, :cond_8

    .line 28
    .line 29
    add-int/lit8 v6, v4, 0x1

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/16 v7, 0x5b

    .line 36
    .line 37
    if-ne v4, v7, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2, v3, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v7, 0x2e

    .line 44
    .line 45
    if-ne v4, v7, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    invoke-virtual {v2, v4, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/16 v7, 0x2a

    .line 53
    .line 54
    if-ne v4, v7, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2, v5, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 57
    .line 58
    .line 59
    :goto_1
    move v4, v6

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/16 v5, 0x30

    .line 62
    .line 63
    if-lt v4, v5, :cond_7

    .line 64
    .line 65
    const/16 v7, 0x39

    .line 66
    .line 67
    if-gt v4, v7, :cond_7

    .line 68
    .line 69
    add-int/lit8 v4, v4, -0x30

    .line 70
    .line 71
    :goto_2
    if-ge v6, v1, :cond_6

    .line 72
    .line 73
    add-int/lit8 v8, v6, 0x1

    .line 74
    .line 75
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-lt v6, v5, :cond_4

    .line 80
    .line 81
    if-gt v6, v7, :cond_4

    .line 82
    .line 83
    mul-int/lit8 v4, v4, 0xa

    .line 84
    .line 85
    add-int/2addr v4, v6

    .line 86
    sub-int/2addr v4, v5

    .line 87
    move v6, v8

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    const/16 v5, 0x3b

    .line 90
    .line 91
    if-ne v6, v5, :cond_5

    .line 92
    .line 93
    move v6, v8

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_6
    :goto_3
    const/4 v5, 0x3

    .line 100
    invoke-virtual {v2, v5, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_8
    iget-object p0, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 109
    .line 110
    iget v0, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 111
    .line 112
    div-int/2addr v0, v5

    .line 113
    int-to-byte v0, v0

    .line 114
    aput-byte v0, p0, v3

    .line 115
    .line 116
    new-instance v0, Lnet/bytebuddy/jar/asm/TypePath;

    .line 117
    .line 118
    invoke-direct {v0, p0, v3}, Lnet/bytebuddy/jar/asm/TypePath;-><init>([BI)V

    .line 119
    .line 120
    .line 121
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static put(Lnet/bytebuddy/jar/asm/TypePath;Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathContainer:[B

    .line 9
    .line 10
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathOffset:I

    .line 11
    .line 12
    aget-byte v1, v0, p0

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v0, p0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    return p0
.end method

.method public getStep(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {p1, v1, p0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget-byte p0, v0, p0

    .line 12
    .line 13
    return p0
.end method

.method public getStepArgument(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p1, v1, p0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    aget-byte p0, v0, p0

    .line 11
    .line 12
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/TypePath;->getLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    mul-int/lit8 v2, v0, 0x2

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lnet/bytebuddy/jar/asm/TypePath;->getStep(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lnet/bytebuddy/jar/asm/TypePath;->getStepArgument(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x3b

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_1
    const/16 v3, 0x2a

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/16 v3, 0x2e

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    const/16 v3, 0x5b

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
