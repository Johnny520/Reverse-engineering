.class public Lbsh/org/objectweb/asm/TypePath;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


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
    iput-object p1, p0, Lbsh/org/objectweb/asm/TypePath;->typePathContainer:[B

    .line 5
    .line 6
    iput p2, p0, Lbsh/org/objectweb/asm/TypePath;->typePathOffset:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lbsh/org/objectweb/asm/TypePath;
    .locals 8

    .line 1
    if-eqz p0, :cond_9

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
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, Lbsh/org/objectweb/asm/ByteVector;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 22
    .line 23
    .line 24
    move v3, v2

    .line 25
    :goto_0
    const/4 v4, 0x2

    .line 26
    if-ge v3, v0, :cond_8

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
    invoke-virtual {v1, v2, v2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-virtual {v1, v3, v2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/16 v6, 0x2a

    .line 52
    .line 53
    if-ne v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, v4, v2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 56
    .line 57
    .line 58
    :goto_1
    move v3, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/16 v4, 0x30

    .line 61
    .line 62
    if-lt v3, v4, :cond_7

    .line 63
    .line 64
    const/16 v6, 0x39

    .line 65
    .line 66
    if-gt v3, v6, :cond_7

    .line 67
    .line 68
    add-int/lit8 v3, v3, -0x30

    .line 69
    .line 70
    :goto_2
    if-ge v5, v0, :cond_6

    .line 71
    .line 72
    add-int/lit8 v7, v5, 0x1

    .line 73
    .line 74
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-lt v5, v4, :cond_4

    .line 79
    .line 80
    if-gt v5, v6, :cond_4

    .line 81
    .line 82
    mul-int/lit8 v3, v3, 0xa

    .line 83
    .line 84
    add-int/2addr v3, v5

    .line 85
    sub-int/2addr v3, v4

    .line 86
    move v5, v7

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    const/16 v4, 0x3b

    .line 89
    .line 90
    if-ne v5, v4, :cond_5

    .line 91
    .line 92
    move v5, v7

    .line 93
    goto :goto_4

    .line 94
    :cond_5
    invoke-static {}, Lj8/o;->o()V

    .line 95
    .line 96
    .line 97
    :goto_3
    const/4 p0, 0x0

    .line 98
    return-object p0

    .line 99
    :cond_6
    :goto_4
    const/4 v4, 0x3

    .line 100
    invoke-virtual {v1, v4, v3}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    invoke-static {}, Lj8/o;->o()V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_8
    iget-object p0, v1, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 109
    .line 110
    iget v0, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 111
    .line 112
    div-int/2addr v0, v4

    .line 113
    int-to-byte v0, v0

    .line 114
    aput-byte v0, p0, v2

    .line 115
    .line 116
    new-instance v0, Lbsh/org/objectweb/asm/TypePath;

    .line 117
    .line 118
    invoke-direct {v0, p0, v2}, Lbsh/org/objectweb/asm/TypePath;-><init>([BI)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_9
    :goto_5
    const/4 p0, 0x0

    .line 123
    return-object p0
.end method

.method public static put(Lbsh/org/objectweb/asm/TypePath;Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/TypePath;->typePathContainer:[B

    .line 9
    .line 10
    iget p0, p0, Lbsh/org/objectweb/asm/TypePath;->typePathOffset:I

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
    invoke-virtual {p1, v0, p0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget v1, p0, Lbsh/org/objectweb/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public getStep(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget v1, p0, Lbsh/org/objectweb/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-static {p1, v2, v1, v3}, Lp/a;->g(IIII)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget-byte p1, v0, p1

    .line 12
    .line 13
    return p1
.end method

.method public getStepArgument(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/TypePath;->typePathContainer:[B

    .line 2
    .line 3
    iget v1, p0, Lbsh/org/objectweb/asm/TypePath;->typePathOffset:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-static {p1, v2, v1, v2}, Lp/a;->g(IIII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    aget-byte p1, v0, p1

    .line 11
    .line 12
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/TypePath;->getLength()I

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
    invoke-virtual {p0, v2}, Lbsh/org/objectweb/asm/TypePath;->getStep(I)I

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
    invoke-virtual {p0, v2}, Lbsh/org/objectweb/asm/TypePath;->getStepArgument(I)I

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
    new-instance v0, Ljava/lang/AssertionError;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    const/16 v3, 0x2a

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/16 v3, 0x2e

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/16 v3, 0x5b

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
.end method
