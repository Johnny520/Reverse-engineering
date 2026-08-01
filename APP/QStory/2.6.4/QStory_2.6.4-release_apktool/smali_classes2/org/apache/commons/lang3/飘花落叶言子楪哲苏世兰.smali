.class public final Lorg/apache/commons/lang3/飘花落叶言子楪哲苏世兰;
.super L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[C

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:[C

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 2
        0x2cs
        0x22s
        0xds
        0xas
    .end array-data
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 10

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p2, :cond_5

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    sget v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    if-eqz p2, :cond_4

    .line 11
    .line 12
    sget-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:[C

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/lit8 v2, v1, -0x1

    .line 22
    .line 23
    array-length v3, v0

    .line 24
    add-int/lit8 v4, v3, -0x1

    .line 25
    .line 26
    move v5, p0

    .line 27
    :goto_0
    if-ge v5, v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    move v7, p0

    .line 34
    :goto_1
    if-ge v7, v3, :cond_3

    .line 35
    .line 36
    aget-char v8, v0, v7

    .line 37
    .line 38
    if-ne v8, v6, :cond_2

    .line 39
    .line 40
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_1

    .line 45
    .line 46
    if-eq v7, v4, :cond_1

    .line 47
    .line 48
    if-ge v5, v2, :cond_2

    .line 49
    .line 50
    add-int/lit8 v8, v7, 0x1

    .line 51
    .line 52
    aget-char v8, v0, v8

    .line 53
    .line 54
    add-int/lit8 v9, v5, 0x1

    .line 55
    .line 56
    invoke-virtual {p2, v9}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-ne v8, v9, :cond_2

    .line 61
    .line 62
    :cond_1
    const/16 p2, 0x22

    .line 63
    .line 64
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    sget-object v2, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v3, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;

    .line 89
    .line 90
    invoke-virtual {v3, v0, v2, v1}, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    invoke-static {p1, p0, p2}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    return p0

    .line 123
    :cond_5
    const-string p1, "CsvEscaper should never reach the [1] index"

    .line 124
    .line 125
    invoke-static {p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return p0
.end method
