.class public final L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世兰苏哲;
.super L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(ILjava/io/StringWriter;)Z
    .locals 4

    .line 1
    iget p0, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const p0, 0xd800

    .line 9
    .line 10
    .line 11
    if-lt p1, p0, :cond_0

    .line 12
    .line 13
    const p0, 0xdfff

    .line 14
    .line 15
    .line 16
    if-gt p1, p0, :cond_0

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_0
    return v0

    .line 20
    :pswitch_0
    const/16 p0, 0x20

    .line 21
    .line 22
    if-lt p1, p0, :cond_1

    .line 23
    .line 24
    const/16 p0, 0x7f

    .line 25
    .line 26
    if-gt p1, p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const p0, 0xffff

    .line 30
    .line 31
    .line 32
    const-string v2, "\\u"

    .line 33
    .line 34
    if-le p1, p0, :cond_2

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    aget-char v0, p0, v0

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    aget-char p0, p0, v1

    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    move v0, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p2, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    shr-int/lit8 p0, p1, 0xc

    .line 89
    .line 90
    and-int/lit8 p0, p0, 0xf

    .line 91
    .line 92
    sget-object v0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 93
    .line 94
    aget-char p0, v0, p0

    .line 95
    .line 96
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(I)V

    .line 97
    .line 98
    .line 99
    shr-int/lit8 p0, p1, 0x8

    .line 100
    .line 101
    and-int/lit8 p0, p0, 0xf

    .line 102
    .line 103
    aget-char p0, v0, p0

    .line 104
    .line 105
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(I)V

    .line 106
    .line 107
    .line 108
    shr-int/lit8 p0, p1, 0x4

    .line 109
    .line 110
    and-int/lit8 p0, p0, 0xf

    .line 111
    .line 112
    aget-char p0, v0, p0

    .line 113
    .line 114
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(I)V

    .line 115
    .line 116
    .line 117
    and-int/lit8 p0, p1, 0xf

    .line 118
    .line 119
    aget-char p0, v0, p0

    .line 120
    .line 121
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :goto_1
    return v0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
