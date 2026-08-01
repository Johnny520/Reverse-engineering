.class public Lcom/esotericsoftware/asm/Label;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field b:I

.field c:I

.field private d:I

.field private e:[I

.field f:I

.field g:I

.field h:Lcom/esotericsoftware/asm/Frame;

.field i:Lcom/esotericsoftware/asm/Label;

.field public info:Ljava/lang/Object;

.field j:Lcom/esotericsoftware/asm/Edge;

.field k:Lcom/esotericsoftware/asm/Label;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private a(II)V
    .locals 4

    .line 99
    iget-object v0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    const/4 v1, 0x6

    if-nez v0, :cond_0

    new-array v0, v1, [I

    iput-object v0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/Label;->d:I

    iget-object v2, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    array-length v3, v2

    if-lt v0, v3, :cond_1

    array-length v0, v2

    add-int/2addr v0, v1

    new-array v0, v0, [I

    array-length v1, v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    iget v1, p0, Lcom/esotericsoftware/asm/Label;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/esotericsoftware/asm/Label;->d:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/esotericsoftware/asm/Label;->d:I

    aput p2, v0, v2

    return-void
.end method


# virtual methods
.method public a()Lcom/esotericsoftware/asm/Label;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object p0, v0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    return-object p0
.end method

.method public a(JI)V
    .locals 3

    .line 100
    iget v0, p0, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit16 v1, v0, 0x400

    const/16 v2, 0x20

    if-nez v1, :cond_0

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/esotericsoftware/asm/Label;->a:I

    div-int/2addr p3, v2

    add-int/lit8 p3, p3, 0x1

    new-array p3, p3, [I

    iput-object p3, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    ushr-long v0, p1, v2

    long-to-int p3, v0

    aget v0, p0, p3

    long-to-int p1, p1

    or-int/2addr p1, v0

    aput p1, p0, p3

    return-void
.end method

.method public a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V
    .locals 0

    .line 101
    iget p1, p0, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, -0x1

    if-eqz p4, :cond_0

    rsub-int/lit8 p3, p3, -0x1

    iget p4, p2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    invoke-direct {p0, p3, p4}, Lcom/esotericsoftware/asm/Label;->a(II)V

    invoke-virtual {p2, p1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_0
    iget p4, p2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    invoke-direct {p0, p3, p4}, Lcom/esotericsoftware/asm/Label;->a(II)V

    invoke-virtual {p2, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_1
    iget p0, p0, Lcom/esotericsoftware/asm/Label;->c:I

    sub-int/2addr p0, p3

    if-eqz p4, :cond_2

    invoke-virtual {p2, p0}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_2
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void
.end method

.method public a(J)Z
    .locals 4

    .line 102
    iget v0, p0, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit16 v0, v0, 0x400

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    const/16 v0, 0x20

    ushr-long v2, p1, v0

    long-to-int v0, v2

    aget p0, p0, v0

    long-to-int p1, p1

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public a(Lcom/esotericsoftware/asm/Label;)Z
    .locals 4

    .line 103
    iget v0, p0, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit16 v0, v0, 0x400

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget v0, p1, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    array-length v3, v2

    if-ge v0, v3, :cond_2

    aget v2, v2, v0

    iget-object v3, p1, Lcom/esotericsoftware/asm/Label;->e:[I

    aget v3, v3, v0

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public a(Lcom/esotericsoftware/asm/MethodWriter;I[B)Z
    .locals 6

    .line 1
    iget p1, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 2
    .line 3
    or-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iput p1, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/esotericsoftware/asm/Label;->c:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    move v0, p1

    .line 11
    :goto_0
    iget v1, p0, Lcom/esotericsoftware/asm/Label;->d:I

    .line 12
    .line 13
    if-ge p1, v1, :cond_4

    .line 14
    .line 15
    iget-object v1, p0, Lcom/esotericsoftware/asm/Label;->e:[I

    .line 16
    .line 17
    add-int/lit8 v2, p1, 0x1

    .line 18
    .line 19
    aget v3, v1, p1

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    aget v1, v1, v2

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-ltz v3, :cond_3

    .line 27
    .line 28
    sub-int v3, p2, v3

    .line 29
    .line 30
    const/16 v4, -0x8000

    .line 31
    .line 32
    if-lt v3, v4, :cond_0

    .line 33
    .line 34
    const/16 v4, 0x7fff

    .line 35
    .line 36
    if-le v3, v4, :cond_2

    .line 37
    .line 38
    :cond_0
    add-int/lit8 v0, v1, -0x1

    .line 39
    .line 40
    aget-byte v4, p3, v0

    .line 41
    .line 42
    and-int/lit16 v4, v4, 0xff

    .line 43
    .line 44
    const/16 v5, 0xa8

    .line 45
    .line 46
    if-gt v4, v5, :cond_1

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x31

    .line 49
    .line 50
    int-to-byte v4, v4

    .line 51
    aput-byte v4, p3, v0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v4, v4, 0x14

    .line 55
    .line 56
    int-to-byte v4, v4

    .line 57
    aput-byte v4, p3, v0

    .line 58
    .line 59
    :goto_1
    move v0, v2

    .line 60
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 61
    .line 62
    ushr-int/lit8 v4, v3, 0x8

    .line 63
    .line 64
    int-to-byte v4, v4

    .line 65
    aput-byte v4, p3, v1

    .line 66
    .line 67
    int-to-byte v1, v3

    .line 68
    aput-byte v1, p3, v2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    add-int/2addr v3, p2

    .line 72
    add-int/2addr v3, v2

    .line 73
    add-int/lit8 v2, v1, 0x1

    .line 74
    .line 75
    ushr-int/lit8 v4, v3, 0x18

    .line 76
    .line 77
    int-to-byte v4, v4

    .line 78
    aput-byte v4, p3, v1

    .line 79
    .line 80
    add-int/lit8 v4, v1, 0x2

    .line 81
    .line 82
    ushr-int/lit8 v5, v3, 0x10

    .line 83
    .line 84
    int-to-byte v5, v5

    .line 85
    aput-byte v5, p3, v2

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x3

    .line 88
    .line 89
    ushr-int/lit8 v2, v3, 0x8

    .line 90
    .line 91
    int-to-byte v2, v2

    .line 92
    aput-byte v2, p3, v4

    .line 93
    .line 94
    int-to-byte v2, v3

    .line 95
    aput-byte v2, p3, v1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    return v0
.end method

.method public b(Lcom/esotericsoftware/asm/Label;JI)V
    .locals 4

    .line 1
    :goto_0
    if-eqz p0, :cond_7

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget v1, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 11
    .line 12
    and-int/lit16 v2, v1, 0x800

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    or-int/lit16 v1, v1, 0x800

    .line 18
    .line 19
    iput v1, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0x100

    .line 22
    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/Label;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_4

    .line 30
    .line 31
    new-instance v1, Lcom/esotericsoftware/asm/Edge;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Edge;-><init>()V

    .line 34
    .line 35
    .line 36
    iget v2, p0, Lcom/esotericsoftware/asm/Label;->f:I

    .line 37
    .line 38
    iput v2, v1, Lcom/esotericsoftware/asm/Edge;->a:I

    .line 39
    .line 40
    iget-object v2, p1, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 41
    .line 42
    iget-object v2, v2, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 43
    .line 44
    iput-object v2, v1, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 47
    .line 48
    iput-object v2, v1, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 49
    .line 50
    iput-object v1, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/esotericsoftware/asm/Label;->a(J)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    :cond_2
    :goto_1
    move-object p0, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0, p2, p3, p4}, Lcom/esotericsoftware/asm/Label;->a(JI)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 65
    .line 66
    :goto_3
    if-eqz v1, :cond_2

    .line 67
    .line 68
    iget v2, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 69
    .line 70
    and-int/lit16 v2, v2, 0x80

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    iget-object v2, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 75
    .line 76
    iget-object v2, v2, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 77
    .line 78
    if-eq v1, v2, :cond_6

    .line 79
    .line 80
    :cond_5
    iget-object v2, v1, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 81
    .line 82
    iget-object v3, v2, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 83
    .line 84
    if-nez v3, :cond_6

    .line 85
    .line 86
    iput-object v0, v2, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 87
    .line 88
    move-object v0, v2

    .line 89
    :cond_6
    iget-object v1, v1, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_7
    return-void
.end method

.method public getOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lcom/esotericsoftware/asm/Label;->c:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const-string p0, "Label offset position has not been resolved yet"

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    const-string v1, "L"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
