.class public Lcom/esotericsoftware/asm/TypePath;
.super Ljava/lang/Object;


# static fields
.field public static final ARRAY_ELEMENT:I = 0x0

.field public static final INNER_TYPE:I = 0x1

.field public static final TYPE_ARGUMENT:I = 0x3

.field public static final WILDCARD_BOUND:I = 0x2


# instance fields
.field a:[B

.field b:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/asm/TypePath;->a:[B

    .line 5
    .line 6
    iput p2, p0, Lcom/esotericsoftware/asm/TypePath;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/esotericsoftware/asm/TypePath;
    .locals 8

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, Lcom/esotericsoftware/asm/ByteVector;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 22
    .line 23
    .line 24
    move v3, v2

    .line 25
    :goto_0
    const/4 v4, 0x2

    .line 26
    if-ge v3, v0, :cond_7

    .line 27
    .line 28
    add-int/lit8 v5, v3, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/16 v6, 0x5b

    .line 35
    .line 36
    if-ne v3, v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v2, v2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/16 v6, 0x2e

    .line 43
    .line 44
    if-ne v3, v6, :cond_2

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-virtual {v1, v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v6, 0x2a

    .line 52
    .line 53
    if-ne v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, v4, v2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v4, 0x30

    .line 60
    .line 61
    if-lt v3, v4, :cond_6

    .line 62
    .line 63
    const/16 v6, 0x39

    .line 64
    .line 65
    if-gt v3, v6, :cond_6

    .line 66
    .line 67
    add-int/lit8 v3, v3, -0x30

    .line 68
    .line 69
    :goto_1
    if-ge v5, v0, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-lt v7, v4, :cond_4

    .line 76
    .line 77
    if-gt v7, v6, :cond_4

    .line 78
    .line 79
    mul-int/lit8 v3, v3, 0xa

    .line 80
    .line 81
    add-int/2addr v3, v7

    .line 82
    sub-int/2addr v3, v4

    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    if-ge v5, v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    const/16 v6, 0x3b

    .line 93
    .line 94
    if-ne v4, v6, :cond_5

    .line 95
    .line 96
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    :cond_5
    const/4 v4, 0x3

    .line 99
    invoke-virtual {v1, v4, v3}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_2
    move v3, v5

    .line 103
    goto :goto_0

    .line 104
    :cond_7
    iget-object p0, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 105
    .line 106
    iget v0, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 107
    .line 108
    div-int/2addr v0, v4

    .line 109
    int-to-byte v0, v0

    .line 110
    aput-byte v0, p0, v2

    .line 111
    .line 112
    new-instance v0, Lcom/esotericsoftware/asm/TypePath;

    .line 113
    .line 114
    invoke-direct {v0, p0, v2}, Lcom/esotericsoftware/asm/TypePath;-><init>([BI)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_8
    :goto_3
    const/4 p0, 0x0

    .line 119
    return-object p0
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/TypePath;->a:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/asm/TypePath;->b:I

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
    iget-object v0, p0, Lcom/esotericsoftware/asm/TypePath;->a:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/asm/TypePath;->b:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {p1, v1, p0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

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
    iget-object v0, p0, Lcom/esotericsoftware/asm/TypePath;->a:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/asm/TypePath;->b:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p1, v1, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

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
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/TypePath;->getLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuffer;

    .line 6
    .line 7
    mul-int/lit8 v2, v0, 0x2

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/TypePath;->getStep(I)I

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
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    const/16 v3, 0x5f

    .line 31
    .line 32
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/TypePath;->getStepArgument(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 41
    .line 42
    .line 43
    const/16 v3, 0x3b

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/16 v3, 0x2a

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/16 v3, 0x2e

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v3, 0x5b

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
