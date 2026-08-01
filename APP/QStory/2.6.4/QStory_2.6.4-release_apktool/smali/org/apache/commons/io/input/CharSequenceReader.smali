.class public Lorg/apache/commons/io/input/CharSequenceReader;
.super Ljava/io/Reader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x33aef9076e3a9d04L


# instance fields
.field private final charSequence:Ljava/lang/CharSequence;

.field private final end:Ljava/lang/Integer;

.field private idx:I

.field private mark:I

.field private final start:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/input/CharSequenceReader;-><init>(Ljava/lang/CharSequence;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;I)V
    .locals 1

    const v0, 0x7fffffff

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/input/CharSequenceReader;-><init>(Ljava/lang/CharSequence;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p2, :cond_2

    .line 6
    .line 7
    if-lt p3, p2, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, ""

    .line 13
    .line 14
    :goto_0
    iput-object p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iput p2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->start:I

    .line 17
    .line 18
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->end:Ljava/lang/Integer;

    .line 23
    .line 24
    iput p2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 25
    .line 26
    iput p2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->mark:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "End index is less than start "

    .line 30
    .line 31
    const-string p1, ": "

    .line 32
    .line 33
    invoke-static {p2, p3, p0, p1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_2
    const-string p0, "Start index is less than zero: "

    .line 42
    .line 43
    invoke-static {p2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method private end()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->end:Ljava/lang/Integer;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const p0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method private start()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->start:I

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->start:I

    .line 2
    .line 3
    iput v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->mark:I

    .line 6
    .line 7
    return-void
.end method

.method public mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 2
    .line 3
    iput p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->mark:I

    .line 4
    .line 5
    return-void
.end method

.method public markSupported()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public read()I
    .locals 3

    .line 158
    iget v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 159
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    return p0
.end method

.method public read([CII)I
    .locals 9

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const-string v0, "array"

    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-ltz p3, :cond_6

    .line 18
    .line 19
    if-ltz p2, :cond_6

    .line 20
    .line 21
    add-int v1, p2, p3

    .line 22
    .line 23
    array-length v3, p1

    .line 24
    if-gt v1, v3, :cond_6

    .line 25
    .line 26
    iget-object v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 27
    .line 28
    instance-of v3, v1, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 37
    .line 38
    sub-int/2addr v0, v1

    .line 39
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 48
    .line 49
    add-int v2, v1, p3

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 55
    .line 56
    add-int/2addr p1, p3

    .line 57
    iput p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 58
    .line 59
    return p3

    .line 60
    :cond_1
    instance-of v3, v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 69
    .line 70
    sub-int/2addr v0, v1

    .line 71
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 76
    .line 77
    check-cast v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 80
    .line 81
    add-int v2, v1, p3

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    .line 84
    .line 85
    .line 86
    iget p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 87
    .line 88
    add-int/2addr p1, p3

    .line 89
    iput p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 90
    .line 91
    return p3

    .line 92
    :cond_2
    instance-of v1, v1, Ljava/lang/StringBuffer;

    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 101
    .line 102
    sub-int/2addr v0, v1

    .line 103
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 108
    .line 109
    check-cast v0, Ljava/lang/StringBuffer;

    .line 110
    .line 111
    iget v1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 112
    .line 113
    add-int v2, v1, p3

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    .line 116
    .line 117
    .line 118
    iget p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 119
    .line 120
    add-int/2addr p1, p3

    .line 121
    iput p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 122
    .line 123
    return p3

    .line 124
    :cond_3
    move v1, v0

    .line 125
    :goto_0
    if-ge v0, p3, :cond_5

    .line 126
    .line 127
    invoke-virtual {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->read()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-ne v3, v2, :cond_4

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    add-int v4, p2, v0

    .line 135
    .line 136
    int-to-char v3, v3

    .line 137
    aput-char v3, p1, v4

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    :goto_1
    return v1

    .line 145
    :cond_6
    array-length v4, p1

    .line 146
    const-string v5, ", offset="

    .line 147
    .line 148
    const-string v7, ", length="

    .line 149
    .line 150
    const-string v3, "Array Size="

    .line 151
    .line 152
    move v6, p2

    .line 153
    move v8, p3

    .line 154
    invoke-static/range {v3 .. v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    return v0
.end method

.method public ready()Z
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ge v0, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->mark:I

    .line 2
    .line 3
    iput v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 4
    .line 5
    return-void
.end method

.method public skip(J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_1

    .line 6
    .line 7
    iget v2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-lt v2, v3, :cond_0

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v0, v0

    .line 21
    iget v2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    add-long/2addr v2, p1

    .line 25
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    long-to-int p1, p1

    .line 30
    iget p2, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 31
    .line 32
    sub-int p2, p1, p2

    .line 33
    .line 34
    iput p1, p0, Lorg/apache/commons/io/input/CharSequenceReader;->idx:I

    .line 35
    .line 36
    int-to-long p0, p2

    .line 37
    return-wide p0

    .line 38
    :cond_1
    const-string p0, "Number of characters to skip is less than zero: "

    .line 39
    .line 40
    invoke-static {p1, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 p0, 0x0

    .line 48
    .line 49
    return-wide p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/CharSequenceReader;->charSequence:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->start()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0}, Lorg/apache/commons/io/input/CharSequenceReader;->end()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-interface {v0, v1, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
