.class public final Ld5/a;
.super Ld5/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lb5/i;ILt5/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Ld5/a;->j:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Ld5/e;-><init>(Lb5/i;ILt5/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 7

    .line 1
    iget v0, p0, Ld5/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "#Replaced unresolvable odex instruction with a throw\n"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "throw "

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ld5/e;->i:Lt5/d;

    .line 17
    .line 18
    check-cast v0, Lg5/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Ld5/e;->l(Le5/a;I)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :pswitch_0
    iget-object v0, p0, Ld5/e;->i:Lt5/d;

    .line 30
    .line 31
    check-cast v0, Ll5/b;

    .line 32
    .line 33
    invoke-virtual {v0}, Ll5/b;->t()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const-string v2, ".array-data "

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ll5/b;->t()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p1, v2}, Le5/a;->z(I)V

    .line 47
    .line 48
    .line 49
    const/16 v2, 0xa

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Lq5/a;->write(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Le5/a;->w()V

    .line 55
    .line 56
    .line 57
    iget v2, v0, Ll5/a0;->c:I

    .line 58
    .line 59
    const/16 v3, 0x8

    .line 60
    .line 61
    add-int/2addr v2, v3

    .line 62
    iget v4, v0, Ll5/b;->e:I

    .line 63
    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    iget v4, v0, Ll5/b;->d:I

    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    if-eq v4, v5, :cond_4

    .line 73
    .line 74
    const/4 v5, 0x2

    .line 75
    if-eq v4, v5, :cond_3

    .line 76
    .line 77
    const/4 v5, 0x4

    .line 78
    if-eq v4, v5, :cond_2

    .line 79
    .line 80
    if-ne v4, v3, :cond_1

    .line 81
    .line 82
    new-instance v3, Ll5/a;

    .line 83
    .line 84
    const/4 v4, 0x3

    .line 85
    invoke-direct {v3, v0, v2, v4}, Ll5/a;-><init>(Ll5/b;II)V

    .line 86
    .line 87
    .line 88
    :goto_0
    move-object v0, v3

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    new-instance p1, Ld6/f;

    .line 91
    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const/4 v1, 0x0

    .line 101
    const-string v2, "Invalid element width: %d"

    .line 102
    .line 103
    invoke-direct {p1, v1, v2, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    new-instance v3, Ll5/a;

    .line 108
    .line 109
    const/4 v4, 0x2

    .line 110
    invoke-direct {v3, v0, v2, v4}, Ll5/a;-><init>(Ll5/b;II)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    new-instance v3, Ll5/a;

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-direct {v3, v0, v2, v4}, Ll5/a;-><init>(Ll5/b;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    new-instance v3, Ll5/a;

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    invoke-direct {v3, v0, v2, v4}, Ll5/a;-><init>(Ll5/b;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :goto_1
    const/4 v2, 0x1

    .line 129
    if-eq v1, v2, :cond_6

    .line 130
    .line 131
    const/4 v3, 0x2

    .line 132
    if-eq v1, v3, :cond_5

    .line 133
    .line 134
    const-string v3, ""

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    const-string v3, "s"

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    const-string v3, "t"

    .line 141
    .line 142
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    invoke-virtual {p1, v5, v6}, Le5/a;->A(J)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/16 v5, 0x8

    .line 169
    .line 170
    if-ne v1, v5, :cond_7

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    invoke-static {p1, v4, v5}, Ld5/e;->d(Le5/a;J)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    const/4 v5, 0x4

    .line 181
    if-ne v1, v5, :cond_8

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {p0, p1, v4}, Ld5/e;->f(Le5/a;I)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_8

    .line 192
    .line 193
    invoke-static {p1, v4}, Ld5/e;->e(Le5/a;I)V

    .line 194
    .line 195
    .line 196
    :cond_8
    :goto_4
    const-string v4, "\n"

    .line 197
    .line 198
    invoke-virtual {p1, v4}, Lq5/a;->write(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_9
    invoke-virtual {p1}, Le5/a;->u()V

    .line 203
    .line 204
    .line 205
    const-string v0, ".end array-data"

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return v2

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
