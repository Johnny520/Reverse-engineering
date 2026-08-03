.class public final Lv4/c0;
.super Lv4/f0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Lg8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv4/c0;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lg8/b;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/c0;->h:Lg8/b;

    .line 5
    .line 6
    iget v0, p1, Lg8/b;->c:I

    .line 7
    .line 8
    new-array v1, v0, [C

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-lez v0, :cond_9

    .line 14
    .line 15
    invoke-virtual {p1, v4}, Lg8/b;->e(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    shr-int/lit8 v6, v5, 0x4

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/16 v8, 0x80

    .line 23
    .line 24
    packed-switch v6, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    :pswitch_0
    invoke-static {v5, v4}, Lv4/c0;->k(II)V

    .line 28
    .line 29
    .line 30
    throw v7

    .line 31
    :pswitch_1
    add-int/lit8 v0, v0, -0x3

    .line 32
    .line 33
    if-ltz v0, :cond_3

    .line 34
    .line 35
    add-int/lit8 v6, v4, 0x1

    .line 36
    .line 37
    invoke-virtual {p1, v6}, Lg8/b;->e(I)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    and-int/lit16 v10, v9, 0xc0

    .line 42
    .line 43
    if-ne v10, v8, :cond_2

    .line 44
    .line 45
    add-int/lit8 v6, v4, 0x2

    .line 46
    .line 47
    invoke-virtual {p1, v6}, Lg8/b;->e(I)I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    if-ne v10, v8, :cond_1

    .line 52
    .line 53
    and-int/lit8 v5, v5, 0xf

    .line 54
    .line 55
    shl-int/lit8 v5, v5, 0xc

    .line 56
    .line 57
    and-int/lit8 v8, v9, 0x3f

    .line 58
    .line 59
    shl-int/lit8 v8, v8, 0x6

    .line 60
    .line 61
    or-int/2addr v5, v8

    .line 62
    and-int/lit8 v8, v11, 0x3f

    .line 63
    .line 64
    or-int/2addr v5, v8

    .line 65
    const/16 v8, 0x800

    .line 66
    .line 67
    if-lt v5, v8, :cond_0

    .line 68
    .line 69
    int-to-char v5, v5

    .line 70
    add-int/lit8 v4, v4, 0x3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_0
    invoke-static {v11, v6}, Lv4/c0;->k(II)V

    .line 74
    .line 75
    .line 76
    throw v7

    .line 77
    :cond_1
    invoke-static {v11, v6}, Lv4/c0;->k(II)V

    .line 78
    .line 79
    .line 80
    throw v7

    .line 81
    :cond_2
    invoke-static {v9, v6}, Lv4/c0;->k(II)V

    .line 82
    .line 83
    .line 84
    throw v7

    .line 85
    :cond_3
    invoke-static {v5, v4}, Lv4/c0;->k(II)V

    .line 86
    .line 87
    .line 88
    throw v7

    .line 89
    :pswitch_2
    add-int/lit8 v0, v0, -0x2

    .line 90
    .line 91
    if-ltz v0, :cond_7

    .line 92
    .line 93
    add-int/lit8 v6, v4, 0x1

    .line 94
    .line 95
    invoke-virtual {p1, v6}, Lg8/b;->e(I)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    and-int/lit16 v10, v9, 0xc0

    .line 100
    .line 101
    if-ne v10, v8, :cond_6

    .line 102
    .line 103
    and-int/lit8 v5, v5, 0x1f

    .line 104
    .line 105
    shl-int/lit8 v5, v5, 0x6

    .line 106
    .line 107
    and-int/lit8 v10, v9, 0x3f

    .line 108
    .line 109
    or-int/2addr v5, v10

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    if-lt v5, v8, :cond_4

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    invoke-static {v9, v6}, Lv4/c0;->k(II)V

    .line 116
    .line 117
    .line 118
    throw v7

    .line 119
    :cond_5
    :goto_1
    int-to-char v5, v5

    .line 120
    add-int/lit8 v4, v4, 0x2

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    invoke-static {v9, v6}, Lv4/c0;->k(II)V

    .line 124
    .line 125
    .line 126
    throw v7

    .line 127
    :cond_7
    invoke-static {v5, v4}, Lv4/c0;->k(II)V

    .line 128
    .line 129
    .line 130
    throw v7

    .line 131
    :pswitch_3
    add-int/lit8 v0, v0, -0x1

    .line 132
    .line 133
    if-eqz v5, :cond_8

    .line 134
    .line 135
    int-to-char v5, v5

    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    :goto_2
    aput-char v5, v1, v3

    .line 139
    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_8
    invoke-static {v5, v4}, Lv4/c0;->k(II)V

    .line 145
    .line 146
    .line 147
    throw v7

    .line 148
    :cond_9
    new-instance p1, Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {p1, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 158
    .line 159
    return-void

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 10

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    .line 162
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 163
    new-instance v0, Lg8/b;

    .line 164
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v2, v1, 0x3

    .line 165
    new-array v2, v2, [B

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_2

    .line 166
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    if-eqz v6, :cond_0

    if-ge v6, v7, :cond_0

    int-to-byte v6, v6

    .line 167
    aput-byte v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    const/16 v8, 0x800

    if-ge v6, v8, :cond_1

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x1f

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    .line 168
    aput-byte v8, v2, v5

    add-int/lit8 v8, v5, 0x1

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 169
    aput-byte v6, v2, v8

    add-int/lit8 v5, v5, 0x2

    goto :goto_1

    :cond_1
    shr-int/lit8 v8, v6, 0xc

    and-int/lit8 v8, v8, 0xf

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    .line 170
    aput-byte v8, v2, v5

    add-int/lit8 v8, v5, 0x1

    shr-int/lit8 v9, v6, 0x6

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v7

    int-to-byte v9, v9

    .line 171
    aput-byte v9, v2, v8

    add-int/lit8 v8, v5, 0x2

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 172
    aput-byte v6, v2, v8

    add-int/lit8 v5, v5, 0x3

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 173
    :cond_2
    new-array p1, v5, [B

    .line 174
    invoke-static {v2, v3, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 175
    invoke-direct {v0, p1, v1, v2}, Lg8/b;-><init>([BIB)V

    iput-object v0, p0, Lv4/c0;->h:Lg8/b;

    return-void

    .line 176
    :cond_3
    const-string p1, "string == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static k(II)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "bad utf-8 byte "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, La/a;->W0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " at offset "

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    mul-int/lit8 v3, v1, 0x3

    .line 10
    .line 11
    div-int/lit8 v3, v3, 0x2

    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v1, :cond_d

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x20

    .line 25
    .line 26
    const/16 v7, 0x7f

    .line 27
    .line 28
    const/16 v8, 0x5c

    .line 29
    .line 30
    if-lt v5, v6, :cond_2

    .line 31
    .line 32
    if-ge v5, v7, :cond_2

    .line 33
    .line 34
    const/16 v6, 0x27

    .line 35
    .line 36
    if-eq v5, v6, :cond_0

    .line 37
    .line 38
    const/16 v6, 0x22

    .line 39
    .line 40
    if-eq v5, v6, :cond_0

    .line 41
    .line 42
    if-ne v5, v8, :cond_1

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_2
    if-gt v5, v7, :cond_b

    .line 53
    .line 54
    const/16 v6, 0x9

    .line 55
    .line 56
    if-eq v5, v6, :cond_a

    .line 57
    .line 58
    const/16 v6, 0xa

    .line 59
    .line 60
    if-eq v5, v6, :cond_9

    .line 61
    .line 62
    const/16 v6, 0xd

    .line 63
    .line 64
    if-eq v5, v6, :cond_8

    .line 65
    .line 66
    add-int/lit8 v6, v1, -0x1

    .line 67
    .line 68
    if-ge v4, v6, :cond_3

    .line 69
    .line 70
    add-int/lit8 v6, v4, 0x1

    .line 71
    .line 72
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v6, v3

    .line 78
    :goto_1
    const/16 v7, 0x30

    .line 79
    .line 80
    const/4 v9, 0x1

    .line 81
    if-lt v6, v7, :cond_4

    .line 82
    .line 83
    const/16 v10, 0x37

    .line 84
    .line 85
    if-gt v6, v10, :cond_4

    .line 86
    .line 87
    move v6, v9

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v6, v3

    .line 90
    :goto_2
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/4 v8, 0x6

    .line 94
    :goto_3
    if-ltz v8, :cond_7

    .line 95
    .line 96
    shr-int v10, v5, v8

    .line 97
    .line 98
    and-int/lit8 v10, v10, 0x7

    .line 99
    .line 100
    add-int/2addr v10, v7

    .line 101
    int-to-char v10, v10

    .line 102
    if-ne v10, v7, :cond_5

    .line 103
    .line 104
    if-eqz v6, :cond_6

    .line 105
    .line 106
    :cond_5
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    move v6, v9

    .line 110
    :cond_6
    add-int/lit8 v8, v8, -0x3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    if-nez v6, :cond_c

    .line 114
    .line 115
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_8
    const-string v5, "\\r"

    .line 120
    .line 121
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_9
    const-string v5, "\\n"

    .line 126
    .line 127
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_a
    const-string v5, "\\t"

    .line 132
    .line 133
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_b
    const-string v6, "\\u"

    .line 138
    .line 139
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    shr-int/lit8 v6, v5, 0xc

    .line 143
    .line 144
    const/16 v7, 0x10

    .line 145
    .line 146
    invoke-static {v6, v7}, Ljava/lang/Character;->forDigit(II)C

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    shr-int/lit8 v6, v5, 0x8

    .line 154
    .line 155
    and-int/lit8 v6, v6, 0xf

    .line 156
    .line 157
    invoke-static {v6, v7}, Ljava/lang/Character;->forDigit(II)C

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    shr-int/lit8 v6, v5, 0x4

    .line 165
    .line 166
    and-int/lit8 v6, v6, 0xf

    .line 167
    .line 168
    invoke-static {v6, v7}, Ljava/lang/Character;->forDigit(II)C

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    and-int/lit8 v5, v5, 0xf

    .line 176
    .line 177
    invoke-static {v5, v7}, Ljava/lang/Character;->forDigit(II)C

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    :cond_c
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_d
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 1

    .line 1
    check-cast p1, Lv4/c0;

    .line 2
    .line 3
    iget-object p1, p1, Lv4/c0;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lv4/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lv4/c0;

    .line 8
    .line 9
    iget-object p1, p1, Lv4/c0;->g:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    sget-object v0, Lw4/c;->G:Lw4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/c0;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "utf8"

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/c0;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x22

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "string{\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/c0;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "\"}"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
