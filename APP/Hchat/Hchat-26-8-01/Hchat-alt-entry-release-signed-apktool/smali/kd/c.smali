.class public final synthetic Lkd/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 10
    iput p2, p0, Lkd/c;->a:I

    iput-object p1, p0, Lkd/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxe/q;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lkd/c;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lkd/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 5

    .line 1
    iget v0, p0, Lkd/c;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lkd/c;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lb5/k;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Character;->isDigit(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p1, v2, Lb5/k;->c:I

    .line 18
    .line 19
    add-int/2addr p1, v1

    .line 20
    iput p1, v2, Lb5/k;->c:I

    .line 21
    .line 22
    :cond_0
    iget p1, v2, Lb5/k;->b:I

    .line 23
    .line 24
    add-int/2addr p1, v1

    .line 25
    iput p1, v2, Lb5/k;->b:I

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-static {p1}, Lxe/q;->f(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_1
    const/16 v0, 0x20

    .line 41
    .line 42
    if-ge p1, v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v3, 0x7f

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    if-ge p1, v3, :cond_3

    .line 49
    .line 50
    move v1, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    sget-object v3, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Character;->isISOControl(I)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    if-ne p1, v0, :cond_6

    .line 68
    .line 69
    :goto_0
    move v4, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_5
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    const/16 v3, 0xf

    .line 78
    .line 79
    if-eq v0, v3, :cond_6

    .line 80
    .line 81
    const/16 v3, 0x10

    .line 82
    .line 83
    if-eq v0, v3, :cond_6

    .line 84
    .line 85
    const/16 v3, 0x12

    .line 86
    .line 87
    if-eq v0, v3, :cond_6

    .line 88
    .line 89
    const/16 v3, 0x13

    .line 90
    .line 91
    if-eq v0, v3, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    :goto_1
    xor-int/2addr v1, v4

    .line 95
    :goto_2
    if-eqz v1, :cond_7

    .line 96
    .line 97
    const-string v0, "\\u"

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string v0, "%04x"

    .line 111
    .line 112
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :goto_3
    return-void

    .line 124
    :pswitch_1
    check-cast v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-static {p1}, Lkd/d;->b(I)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(I)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    :cond_8
    return-void

    .line 142
    :pswitch_2
    check-cast v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-static {p1}, Lkd/d;->b(I)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    :cond_9
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
