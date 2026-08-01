.class public final Lorg/apache/commons/lang3/飘花落叶言子楪哲苏兰世;
.super L飘花落叶言苏子哲兰世楪/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

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
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:[C

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
    if-nez p2, :cond_7

    .line 3
    .line 4
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/16 v0, 0x22

    .line 9
    .line 10
    if-ne p2, v0, :cond_6

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/4 v1, 0x1

    .line 17
    sub-int/2addr p2, v1

    .line 18
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eq p2, v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    sub-int/2addr p2, v1

    .line 31
    invoke-interface {p1, v1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Lorg/apache/commons/lang3/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_5

    .line 44
    .line 45
    sget-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:[C

    .line 46
    .line 47
    invoke-static {v0}, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    array-length v2, v0

    .line 59
    add-int/lit8 v3, v1, -0x1

    .line 60
    .line 61
    add-int/lit8 v4, v2, -0x1

    .line 62
    .line 63
    move v5, p0

    .line 64
    :goto_0
    if-ge v5, v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    move v7, p0

    .line 71
    :goto_1
    if-ge v7, v2, :cond_4

    .line 72
    .line 73
    aget-char v8, v0, v7

    .line 74
    .line 75
    if-ne v8, v6, :cond_3

    .line 76
    .line 77
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_2

    .line 82
    .line 83
    if-eq v7, v4, :cond_2

    .line 84
    .line 85
    if-ge v5, v3, :cond_3

    .line 86
    .line 87
    add-int/lit8 v8, v7, 0x1

    .line 88
    .line 89
    aget-char v8, v0, v8

    .line 90
    .line 91
    add-int/lit8 v9, v5, 0x1

    .line 92
    .line 93
    invoke-virtual {p2, v9}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-ne v8, v9, :cond_3

    .line 98
    .line 99
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    sget-object v1, Lorg/apache/commons/lang3/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0, v1, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget-object v2, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;

    .line 111
    .line 112
    invoke-virtual {v2, p2, v0, v1}, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    invoke-static {p1, p0, p2}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    return p0

    .line 142
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    invoke-static {p1, p0, p2}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    return p0

    .line 158
    :cond_7
    const-string p1, "CsvUnescaper should never reach the [1] index"

    .line 159
    .line 160
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return p0
.end method
