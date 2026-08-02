.class public final Lth2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final l:Lo72;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Lri2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo72;

    .line 2
    .line 3
    const-string v1, "^[a-z][a-z0-9_-]*(?:\\.[a-z][a-z0-9_-]*)+$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo72;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lth2;->l:Lo72;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lri2;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lth2;->a:I

    .line 14
    .line 15
    iput p2, p0, Lth2;->b:I

    .line 16
    .line 17
    iput-object p3, p0, Lth2;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lth2;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p5, p0, Lth2;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-wide p6, p0, Lth2;->f:J

    .line 24
    .line 25
    iput-object p8, p0, Lth2;->g:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p9, p0, Lth2;->h:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p10, p0, Lth2;->i:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p11, p0, Lth2;->j:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p12, p0, Lth2;->k:Lri2;

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    const/4 p12, 0x1

    .line 37
    if-ne p1, p12, :cond_11

    .line 38
    .line 39
    if-ne p2, p12, :cond_10

    .line 40
    .line 41
    sget-object p1, Lth2;->l:Lo72;

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Lo72;->b(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_f

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 p2, 0xff

    .line 54
    .line 55
    if-gt p1, p2, :cond_e

    .line 56
    .line 57
    invoke-static {p4}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_d

    .line 62
    .line 63
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/16 p2, 0x80

    .line 68
    .line 69
    if-gt p1, p2, :cond_c

    .line 70
    .line 71
    invoke-static {p5}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_b

    .line 76
    .line 77
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    const/16 p3, 0x40

    .line 82
    .line 83
    if-gt p1, p3, :cond_a

    .line 84
    .line 85
    const-wide/16 p3, 0x0

    .line 86
    .line 87
    cmp-long p1, p6, p3

    .line 88
    .line 89
    if-lez p1, :cond_9

    .line 90
    .line 91
    sget-object p1, Loi2;->i:Lo72;

    .line 92
    .line 93
    const-string p1, ".js"

    .line 94
    .line 95
    const/4 p3, 0x0

    .line 96
    invoke-static {p8, p1, p3}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_8

    .line 101
    .line 102
    if-eqz p9, :cond_1

    .line 103
    .line 104
    invoke-virtual {p9}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    const/16 p4, 0x800

    .line 109
    .line 110
    if-gt p1, p4, :cond_0

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    const-string p1, "Script description is too long."

    .line 114
    .line 115
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :cond_1
    :goto_0
    if-eqz p10, :cond_3

    .line 120
    .line 121
    invoke-static {p10}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_2

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    const-string p1, "Script author must not be blank when configured."

    .line 129
    .line 130
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_3
    :goto_1
    if-eqz p10, :cond_5

    .line 135
    .line 136
    invoke-virtual {p10}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-gt p1, p2, :cond_4

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    const-string p1, "Script author is too long."

    .line 144
    .line 145
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_5
    :goto_2
    if-eqz p11, :cond_7

    .line 150
    .line 151
    const-string p1, ".json"

    .line 152
    .line 153
    invoke-static {p11, p1, p3}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    const-string p1, "Script config schema must be a JSON file: "

    .line 161
    .line 162
    invoke-virtual {p1, p11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-static {p1}, Ls;->c(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_7
    :goto_3
    return-void

    .line 171
    :cond_8
    const-string p1, "Script entry must be a JavaScript file: "

    .line 172
    .line 173
    invoke-virtual {p1, p8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p1}, Ls;->c(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    throw p0

    .line 181
    :cond_9
    const-string p1, "Script versionCode must be positive."

    .line 182
    .line 183
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p0

    .line 187
    :cond_a
    const-string p1, "Script version is too long."

    .line 188
    .line 189
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :cond_b
    const-string p1, "Script version must not be blank."

    .line 194
    .line 195
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p0

    .line 199
    :cond_c
    const-string p1, "Script name is too long."

    .line 200
    .line 201
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p0

    .line 205
    :cond_d
    const-string p1, "Script name must not be blank."

    .line 206
    .line 207
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw p0

    .line 211
    :cond_e
    const-string p1, "Script id is too long."

    .line 212
    .line 213
    invoke-static {p1}, Ls;->j(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :cond_f
    const-string p1, "Script id must contain at least two lowercase dot-separated segments: "

    .line 218
    .line 219
    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-static {p1}, Ls;->c(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    throw p0

    .line 227
    :cond_10
    const-string p1, "Unsupported script API version: "

    .line 228
    .line 229
    invoke-static {p1, p2}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {p1}, Ls;->c(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    throw p0

    .line 237
    :cond_11
    const-string p2, "Unsupported manifest version: "

    .line 238
    .line 239
    invoke-static {p2, p1}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Ls;->c(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Lri2;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->k:Lri2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lth2;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_1
    check-cast p1, Lth2;

    .line 14
    .line 15
    iget v1, p0, Lth2;->a:I

    .line 16
    .line 17
    iget v3, p1, Lth2;->a:I

    .line 18
    .line 19
    if-eq v1, v3, :cond_2

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_2
    iget v1, p0, Lth2;->b:I

    .line 24
    .line 25
    iget v3, p1, Lth2;->b:I

    .line 26
    .line 27
    if-eq v1, v3, :cond_3

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_3
    iget-object v1, p0, Lth2;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lth2;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_4
    iget-object v1, p0, Lth2;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p1, Lth2;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    iget-object v1, p0, Lth2;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p1, Lth2;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    iget-wide v3, p0, Lth2;->f:J

    .line 66
    .line 67
    iget-wide v5, p1, Lth2;->f:J

    .line 68
    .line 69
    cmp-long v1, v3, v5

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    iget-object v1, p1, Lth2;->g:Ljava/lang/String;

    .line 75
    .line 76
    sget-object v3, Loi2;->i:Lo72;

    .line 77
    .line 78
    iget-object v3, p0, Lth2;->g:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_8

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_8
    iget-object v1, p0, Lth2;->h:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v3, p1, Lth2;->h:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_9

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_9
    iget-object v1, p0, Lth2;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v3, p1, Lth2;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_a

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_a
    iget-object v1, p1, Lth2;->j:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v3, p0, Lth2;->j:Ljava/lang/String;

    .line 112
    .line 113
    if-nez v3, :cond_c

    .line 114
    .line 115
    if-nez v1, :cond_b

    .line 116
    .line 117
    move v1, v0

    .line 118
    goto :goto_1

    .line 119
    :cond_b
    :goto_0
    move v1, v2

    .line 120
    goto :goto_1

    .line 121
    :cond_c
    if-nez v1, :cond_d

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_d
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    :goto_1
    if-nez v1, :cond_e

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_e
    iget-object p0, p0, Lth2;->k:Lri2;

    .line 132
    .line 133
    iget-object p1, p1, Lth2;->k:Lri2;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lri2;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_f

    .line 140
    .line 141
    :goto_2
    return v2

    .line 142
    :cond_f
    :goto_3
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lth2;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lth2;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lth2;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lth2;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lth2;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, Lth2;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sget-object v2, Loi2;->i:Lo72;

    .line 41
    .line 42
    iget-object v2, p0, Lth2;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v2, 0x0

    .line 49
    iget-object v3, p0, Lth2;->h:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    :goto_0
    add-int/2addr v0, v3

    .line 60
    mul-int/2addr v0, v1

    .line 61
    iget-object v3, p0, Lth2;->i:Ljava/lang/String;

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    :goto_1
    add-int/2addr v0, v3

    .line 72
    mul-int/2addr v0, v1

    .line 73
    iget-object v3, p0, Lth2;->j:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :goto_2
    add-int/2addr v0, v2

    .line 83
    mul-int/2addr v0, v1

    .line 84
    iget-object p0, p0, Lth2;->k:Lri2;

    .line 85
    .line 86
    invoke-virtual {p0}, Lri2;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    add-int/2addr p0, v0

    .line 91
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Loi2;->i:Lo72;

    .line 2
    .line 3
    iget-object v0, p0, Lth2;->j:Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "null"

    .line 8
    .line 9
    :cond_0
    const-string v1, ", apiVersion="

    .line 10
    .line 11
    const-string v2, ", id="

    .line 12
    .line 13
    const-string v3, "ScriptManifest(manifestVersion="

    .line 14
    .line 15
    iget v4, p0, Lth2;->a:I

    .line 16
    .line 17
    iget v5, p0, Lth2;->b:I

    .line 18
    .line 19
    invoke-static {v3, v4, v5, v1, v2}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, ", name="

    .line 24
    .line 25
    const-string v3, ", version="

    .line 26
    .line 27
    iget-object v4, p0, Lth2;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v5, p0, Lth2;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v4, v2, v5, v3}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lth2;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", versionCode="

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-wide v2, p0, Lth2;->f:J

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", entry="

    .line 50
    .line 51
    const-string v3, ", description="

    .line 52
    .line 53
    iget-object v4, p0, Lth2;->g:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v5, p0, Lth2;->h:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v1, v2, v4, v3, v5}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v2, ", author="

    .line 61
    .line 62
    const-string v3, ", configSchema="

    .line 63
    .line 64
    iget-object v4, p0, Lth2;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, v2, v4, v3, v0}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v0, ", permissions="

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lth2;->k:Lri2;

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, ")"

    .line 80
    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method
