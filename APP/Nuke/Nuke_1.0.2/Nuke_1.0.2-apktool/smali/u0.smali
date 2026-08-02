.class public final Lu0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb5;Ljava/lang/String;Ld41;Lt00;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu0;->l:I

    .line 15
    iput-object p1, p0, Lu0;->n:Ljava/lang/Object;

    iput-object p2, p0, Lu0;->m:Ljava/lang/Object;

    iput-object p3, p0, Lu0;->o:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 17
    iput p5, p0, Lu0;->l:I

    iput-object p1, p0, Lu0;->m:Ljava/lang/Object;

    iput-object p2, p0, Lu0;->n:Ljava/lang/Object;

    iput-object p3, p0, Lu0;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Ls12;Lkz2;Lt00;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lu0;->l:I

    .line 16
    iput-object p1, p0, Lu0;->n:Ljava/lang/Object;

    iput-object p2, p0, Lu0;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lt00;Ldq1;Lhg2;Lui2;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lu0;->l:I

    .line 3
    .line 4
    iput-object p2, p0, Lu0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lu0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lu0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lu0;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lu0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lu0;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lu0;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lu0;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_3
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lu0;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :pswitch_4
    invoke-virtual {p0, p2, p1}, Lu0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Lu0;

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Lu0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 10

    .line 1
    iget v0, p0, Lu0;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lu0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lu0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lu0;

    .line 11
    .line 12
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p0

    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Lxk1;

    .line 22
    .line 23
    const/4 v8, 0x5

    .line 24
    move-object v7, p1

    .line 25
    invoke-direct/range {v3 .. v8}, Lu0;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :pswitch_0
    move-object v8, p1

    .line 30
    new-instance p1, Lu0;

    .line 31
    .line 32
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ldq1;

    .line 35
    .line 36
    check-cast v2, Lhg2;

    .line 37
    .line 38
    check-cast v1, Lui2;

    .line 39
    .line 40
    invoke-direct {p1, v8, p0, v2, v1}, Lu0;-><init>(Lt00;Ldq1;Lhg2;Lui2;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_1
    move-object v8, p1

    .line 45
    new-instance p0, Lu0;

    .line 46
    .line 47
    check-cast v2, Ls12;

    .line 48
    .line 49
    check-cast v1, Lkz2;

    .line 50
    .line 51
    invoke-direct {p0, v2, v1, v8}, Lu0;-><init>(Ls12;Lkz2;Lt00;)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, Lu0;->m:Ljava/lang/Object;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_2
    move-object v8, p1

    .line 58
    new-instance p1, Lu0;

    .line 59
    .line 60
    check-cast v2, Lb5;

    .line 61
    .line 62
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    check-cast v1, Ld41;

    .line 67
    .line 68
    invoke-direct {p1, v2, p0, v1, v8}, Lu0;-><init>(Lb5;Ljava/lang/String;Ld41;Lt00;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_3
    move-object v8, p1

    .line 73
    new-instance v4, Lu0;

    .line 74
    .line 75
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v5, p0

    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    move-object v6, v2

    .line 81
    check-cast v6, Lxk1;

    .line 82
    .line 83
    move-object v7, v1

    .line 84
    check-cast v7, Lxk1;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    invoke-direct/range {v4 .. v9}, Lu0;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 88
    .line 89
    .line 90
    return-object v4

    .line 91
    :pswitch_4
    move-object v8, p1

    .line 92
    new-instance v4, Lu0;

    .line 93
    .line 94
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v5, p0

    .line 97
    check-cast v5, Ljava/lang/String;

    .line 98
    .line 99
    move-object v6, v2

    .line 100
    check-cast v6, Ljava/lang/String;

    .line 101
    .line 102
    move-object v7, v1

    .line 103
    check-cast v7, Ljava/lang/String;

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    invoke-direct/range {v4 .. v9}, Lu0;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 107
    .line 108
    .line 109
    return-object v4

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lu0;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object v3, p0, Lu0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lu0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Lxk1;

    .line 15
    .line 16
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    move-object p0, v3

    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    :cond_0
    invoke-static {p0}, Lgf1;->V(Ljava/lang/String;)Lx13;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Lgf1;->U(Lx13;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {v0, v1}, Lp7;->O(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {v4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lx13;

    .line 47
    .line 48
    invoke-static {v0}, Lgf1;->U(Lx13;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-static {v0, v1}, Lp7;->O(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    move-object v5, p0

    .line 63
    :cond_1
    if-eqz v5, :cond_2

    .line 64
    .line 65
    invoke-interface {v4, v5}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v2

    .line 69
    :pswitch_0
    check-cast v4, Lui2;

    .line 70
    .line 71
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Ldq1;

    .line 77
    .line 78
    check-cast v3, Lhg2;

    .line 79
    .line 80
    invoke-static {v3}, Ldq1;->S(Lhg2;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v3, Lhg2;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_a

    .line 90
    .line 91
    invoke-virtual {p0, v3}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_4

    .line 100
    .line 101
    iget-boolean p0, v4, Lui2;->b:Z

    .line 102
    .line 103
    if-eqz p0, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 107
    .line 108
    const-string v0, "Target does not exist: "

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p0

    .line 118
    :cond_4
    iget-object p1, v3, Lhg2;->a:Lfg2;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0, v0, v1}, Ldq1;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_7

    .line 132
    .line 133
    iget-boolean p0, v4, Lui2;->a:Z

    .line 134
    .line 135
    if-nez p0, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_6

    .line 142
    .line 143
    array-length p0, p0

    .line 144
    if-nez p0, :cond_5

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    const/4 v10, 0x0

    .line 148
    const/16 v11, 0x1c

    .line 149
    .line 150
    const-string v6, "IO_ERROR"

    .line 151
    .line 152
    const-string v7, "Directory is not empty."

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 157
    .line 158
    .line 159
    :goto_0
    move-object v2, v5

    .line 160
    goto :goto_2

    .line 161
    :cond_6
    const-string p0, "Unable to list directory before removal."

    .line 162
    .line 163
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eqz p0, :cond_8

    .line 172
    .line 173
    iget-boolean p0, v4, Lui2;->a:Z

    .line 174
    .line 175
    if-eqz p0, :cond_8

    .line 176
    .line 177
    invoke-static {v0}, Ldq1;->x(Ljava/io/File;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_8
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_9

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_9
    const-string p0, "Unable to remove target."

    .line 189
    .line 190
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_a
    const/4 v10, 0x0

    .line 195
    const/16 v11, 0x1c

    .line 196
    .line 197
    const-string v6, "INVALID_ARGUMENT"

    .line 198
    .line 199
    const-string v7, "Cannot remove an area root."

    .line 200
    .line 201
    const/4 v8, 0x0

    .line 202
    const/4 v9, 0x0

    .line 203
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :goto_2
    return-object v2

    .line 208
    :pswitch_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p0, Lj20;

    .line 214
    .line 215
    new-instance p1, Lq10;

    .line 216
    .line 217
    check-cast v3, Ls12;

    .line 218
    .line 219
    check-cast v4, Lkz2;

    .line 220
    .line 221
    invoke-direct {p1, v3, v4, v5, v1}, Lq10;-><init>(Ls12;Lkz2;Lt00;I)V

    .line 222
    .line 223
    .line 224
    invoke-static {p0, v5, p1, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 225
    .line 226
    .line 227
    new-instance p1, Lq10;

    .line 228
    .line 229
    const/4 v0, 0x2

    .line 230
    invoke-direct {p1, v3, v4, v5, v0}, Lq10;-><init>(Ls12;Lkz2;Lt00;I)V

    .line 231
    .line 232
    .line 233
    invoke-static {p0, v5, p1, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    return-object p0

    .line 238
    :pswitch_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    check-cast v3, Lb5;

    .line 242
    .line 243
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p0, Ljava/lang/String;

    .line 246
    .line 247
    iget-object p1, v3, Lb5;->j:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, Ljava/io/File;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string p0, ".json"

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {p1, p0}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    if-eqz p1, :cond_b

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 282
    .line 283
    .line 284
    :cond_b
    iget-object p1, v3, Lb5;->k:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast p1, Lv31;

    .line 287
    .line 288
    sget-object v0, Ld41;->Companion:Lc41;

    .line 289
    .line 290
    invoke-virtual {v0}, Lc41;->serializer()Lw41;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, Lw41;

    .line 295
    .line 296
    check-cast v4, Ld41;

    .line 297
    .line 298
    invoke-virtual {p1, v0, v4}, Lu21;->b(Lw41;Ljava/lang/Object;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {p0, p1}, Lwi0;->h0(Ljava/io/File;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v2

    .line 306
    :pswitch_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    check-cast v3, Lxk1;

    .line 310
    .line 311
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    if-eqz p1, :cond_c

    .line 322
    .line 323
    check-cast v4, Lxk1;

    .line 324
    .line 325
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast p0, Ljava/lang/String;

    .line 328
    .line 329
    invoke-interface {v4, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_c
    return-object v2

    .line 333
    :pswitch_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    new-instance p1, Lnuke/module/wechat/ai/b;

    .line 337
    .line 338
    iget-object p0, p0, Lu0;->m:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast p0, Ljava/lang/String;

    .line 341
    .line 342
    check-cast v3, Ljava/lang/String;

    .line 343
    .line 344
    check-cast v4, Ljava/lang/String;

    .line 345
    .line 346
    invoke-direct {p1, p0, v3, v4}, Lnuke/module/wechat/ai/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const-string v0, "OpenAI-compatible service returned HTTP "

    .line 350
    .line 351
    sget-object v1, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 352
    .line 353
    const-string v1, "models"

    .line 354
    .line 355
    invoke-static {p0, v1}, Lnuke/module/wechat/ai/a;->e(Ljava/lang/String;Ljava/lang/String;)Lyw0;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    sget-object v7, La1;->h:La1;

    .line 360
    .line 361
    if-nez p0, :cond_d

    .line 362
    .line 363
    new-instance p0, Lh1;

    .line 364
    .line 365
    new-instance v6, Lnuke/module/wechat/ai/AIChatError;

    .line 366
    .line 367
    const/4 v10, 0x4

    .line 368
    const/4 v11, 0x0

    .line 369
    const-string v8, "API Base URL must be a valid HTTPS URL"

    .line 370
    .line 371
    const/4 v9, 0x0

    .line 372
    invoke-direct/range {v6 .. v11}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 373
    .line 374
    .line 375
    invoke-direct {p0, v6}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 376
    .line 377
    .line 378
    goto/16 :goto_9

    .line 379
    .line 380
    :cond_d
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_e

    .line 385
    .line 386
    new-instance p0, Lh1;

    .line 387
    .line 388
    new-instance v6, Lnuke/module/wechat/ai/AIChatError;

    .line 389
    .line 390
    const/4 v10, 0x4

    .line 391
    const/4 v11, 0x0

    .line 392
    const-string v8, "API key is empty"

    .line 393
    .line 394
    const/4 v9, 0x0

    .line 395
    invoke-direct/range {v6 .. v11}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 396
    .line 397
    .line 398
    invoke-direct {p0, v6}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_9

    .line 402
    .line 403
    :cond_e
    new-instance v1, Lcj;

    .line 404
    .line 405
    const/4 v2, 0x4

    .line 406
    invoke-direct {v1, v2}, Lcj;-><init>(I)V

    .line 407
    .line 408
    .line 409
    iput-object p0, v1, Lcj;->a:Ljava/lang/Object;

    .line 410
    .line 411
    invoke-static {v3}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    new-instance v2, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v3, "Bearer "

    .line 422
    .line 423
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    const-string v2, "Authorization"

    .line 434
    .line 435
    invoke-virtual {v1, v2, p0}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    sget-object p0, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 439
    .line 440
    iget-object p0, p0, Lvf1;->a:Ljava/lang/String;

    .line 441
    .line 442
    const-string v2, "Accept"

    .line 443
    .line 444
    invoke-virtual {v1, v2, p0}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    const-string p0, "GET"

    .line 448
    .line 449
    invoke-virtual {v1, p0, v5}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 450
    .line 451
    .line 452
    new-instance p0, Lk82;

    .line 453
    .line 454
    invoke-direct {p0, v1}, Lk82;-><init>(Lcj;)V

    .line 455
    .line 456
    .line 457
    :try_start_0
    iget-object p1, p1, Lnuke/module/wechat/ai/b;->d:Let1;

    .line 458
    .line 459
    new-instance v1, Ls52;

    .line 460
    .line 461
    invoke-direct {v1, p1, p0}, Ls52;-><init>(Let1;Lk82;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Ls52;->h()Lr92;

    .line 465
    .line 466
    .line 467
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 468
    :try_start_1
    iget p1, p0, Lr92;->k:I

    .line 469
    .line 470
    iget-object v1, p0, Lr92;->n:Lu92;

    .line 471
    .line 472
    invoke-virtual {v1}, Lu92;->b()Ljava/io/InputStream;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-static {v1}, Lnuke/module/wechat/ai/a;->a(Ljava/io/InputStream;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    iget-boolean v2, p0, Lr92;->w:Z

    .line 481
    .line 482
    if-nez v2, :cond_10

    .line 483
    .line 484
    new-instance v2, Lh1;

    .line 485
    .line 486
    new-instance v3, Lnuke/module/wechat/ai/AIChatError;

    .line 487
    .line 488
    sget-object v4, La1;->j:La1;

    .line 489
    .line 490
    invoke-static {v1}, Lnuke/module/wechat/ai/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-nez v1, :cond_f

    .line 495
    .line 496
    new-instance v1, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    goto :goto_3

    .line 509
    :catchall_0
    move-exception v0

    .line 510
    move-object p1, v0

    .line 511
    goto :goto_6

    .line 512
    :cond_f
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-direct {v3, v4, v1, p1}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 517
    .line 518
    .line 519
    invoke-direct {v2, v3}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 520
    .line 521
    .line 522
    move-object p1, v2

    .line 523
    goto :goto_4

    .line 524
    :cond_10
    invoke-static {v1}, Lnuke/module/wechat/ai/a;->c(Ljava/lang/String;)Lj1;

    .line 525
    .line 526
    .line 527
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 528
    :goto_4
    :try_start_2
    invoke-virtual {p0}, Lr92;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 529
    .line 530
    .line 531
    :goto_5
    move-object p0, p1

    .line 532
    goto :goto_9

    .line 533
    :catchall_1
    move-exception v0

    .line 534
    move-object p0, v0

    .line 535
    goto :goto_7

    .line 536
    :catch_0
    move-exception v0

    .line 537
    move-object p0, v0

    .line 538
    goto :goto_8

    .line 539
    :goto_6
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 540
    :catchall_2
    move-exception v0

    .line 541
    :try_start_4
    invoke-static {p0, p1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 545
    :goto_7
    new-instance p1, Lh1;

    .line 546
    .line 547
    new-instance v6, Lnuke/module/wechat/ai/AIChatError;

    .line 548
    .line 549
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    if-nez p0, :cond_11

    .line 554
    .line 555
    const-string p0, "Unable to load model list"

    .line 556
    .line 557
    :cond_11
    move-object v8, p0

    .line 558
    const/4 v10, 0x4

    .line 559
    const/4 v11, 0x0

    .line 560
    sget-object v7, La1;->k:La1;

    .line 561
    .line 562
    const/4 v9, 0x0

    .line 563
    invoke-direct/range {v6 .. v11}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 564
    .line 565
    .line 566
    invoke-direct {p1, v6}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 567
    .line 568
    .line 569
    goto :goto_5

    .line 570
    :goto_8
    new-instance p1, Lh1;

    .line 571
    .line 572
    new-instance v6, Lnuke/module/wechat/ai/AIChatError;

    .line 573
    .line 574
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    if-nez p0, :cond_12

    .line 579
    .line 580
    const-string p0, "OpenAI-compatible service is unavailable"

    .line 581
    .line 582
    :cond_12
    move-object v8, p0

    .line 583
    const/4 v10, 0x4

    .line 584
    const/4 v11, 0x0

    .line 585
    sget-object v7, La1;->i:La1;

    .line 586
    .line 587
    const/4 v9, 0x0

    .line 588
    invoke-direct/range {v6 .. v11}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 589
    .line 590
    .line 591
    invoke-direct {p1, v6}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 592
    .line 593
    .line 594
    goto :goto_5

    .line 595
    :goto_9
    instance-of p1, p0, Li1;

    .line 596
    .line 597
    if-eqz p1, :cond_13

    .line 598
    .line 599
    new-instance p1, Ll1;

    .line 600
    .line 601
    check-cast p0, Li1;

    .line 602
    .line 603
    iget-object p0, p0, Li1;->a:Ljava/util/List;

    .line 604
    .line 605
    invoke-direct {p1, p0}, Ll1;-><init>(Ljava/util/List;)V

    .line 606
    .line 607
    .line 608
    :goto_a
    move-object v5, p1

    .line 609
    goto :goto_b

    .line 610
    :cond_13
    instance-of p1, p0, Lh1;

    .line 611
    .line 612
    if-eqz p1, :cond_14

    .line 613
    .line 614
    new-instance p1, Lk1;

    .line 615
    .line 616
    check-cast p0, Lh1;

    .line 617
    .line 618
    iget-object p0, p0, Lh1;->a:Lnuke/module/wechat/ai/AIChatError;

    .line 619
    .line 620
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatError;->getMessage()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object p0

    .line 624
    invoke-direct {p1, p0}, Lk1;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    goto :goto_a

    .line 628
    :cond_14
    invoke-static {}, Lc80;->s()V

    .line 629
    .line 630
    .line 631
    :goto_b
    return-object v5

    .line 632
    nop

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
