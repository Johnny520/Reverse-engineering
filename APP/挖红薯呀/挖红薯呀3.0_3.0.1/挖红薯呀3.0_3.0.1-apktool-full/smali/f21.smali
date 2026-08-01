.class public final Lf21;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyt;


# instance fields
.field public final a:Lj21;

.field public final b:Lml;

.field public final c:Lo31;

.field public final d:Lco;


# direct methods
.method public constructor <init>(Lj21;Lml;Lo31;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf21;->a:Lj21;

    .line 5
    .line 6
    iput-object p2, p0, Lf21;->b:Lml;

    .line 7
    .line 8
    iput-object p3, p0, Lf21;->c:Lo31;

    .line 9
    .line 10
    sget-object p1, Lwy0;->c:Lco;

    .line 11
    .line 12
    iput-object p1, p0, Lf21;->d:Lco;

    .line 13
    .line 14
    return-void
.end method

.method public static final b(Lf21;Lny0;FFLc21;Ljk;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Le21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Le21;

    .line 7
    .line 8
    iget v1, v0, Le21;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Le21;->i:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Le21;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Le21;-><init>(Lf21;Ljk;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Le21;->g:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p5, Le21;->i:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lw60;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {v0}, Lw60;->M(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    const/16 v3, 0x1c

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    cmpg-float v0, v0, v1

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    :goto_2
    invoke-static {p2, p3, v3}, Lpf1;->a(FFI)Lw7;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    iput v2, p5, Le21;->i:I

    .line 77
    .line 78
    iget-object v0, p0, Lf21;->b:Lml;

    .line 79
    .line 80
    new-instance v2, Ly2;

    .line 81
    .line 82
    iget-object v4, v0, Lml;->a:Lx1;

    .line 83
    .line 84
    invoke-direct {v2, v4}, Ly2;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Lx7;

    .line 88
    .line 89
    invoke-direct {v4, v1}, Lx7;-><init>(F)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lx7;

    .line 93
    .line 94
    invoke-direct {v5, p3}, Lx7;-><init>(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v5}, Ly2;->j(Lb8;Lb8;)Lb8;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lx7;

    .line 102
    .line 103
    iget v2, v2, Lx7;->a:F

    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    cmpl-float v2, v2, v4

    .line 114
    .line 115
    if-ltz v2, :cond_5

    .line 116
    .line 117
    new-instance p0, Lx1;

    .line 118
    .line 119
    const/4 v2, 0x5

    .line 120
    invoke-direct {p0, v2, v0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    new-instance v0, Lx1;

    .line 125
    .line 126
    iget-object p0, p0, Lf21;->c:Lo31;

    .line 127
    .line 128
    const/16 v2, 0x1b

    .line 129
    .line 130
    invoke-direct {v0, v2, p0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object p0, v0

    .line 134
    :goto_3
    new-instance v0, Ljava/lang/Float;

    .line 135
    .line 136
    invoke-direct {v0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 137
    .line 138
    .line 139
    new-instance p2, Ljava/lang/Float;

    .line 140
    .line 141
    invoke-direct {p2, p3}, Ljava/lang/Float;-><init>(F)V

    .line 142
    .line 143
    .line 144
    iget p3, p0, Lx1;->d:I

    .line 145
    .line 146
    sget-object v8, Lzk;->d:Lzk;

    .line 147
    .line 148
    packed-switch p3, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    move p3, v3

    .line 152
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-static {v1, p2, p3}, Lpf1;->a(FFI)Lw7;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    mul-float v2, p2, p3

    .line 173
    .line 174
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v5, p0

    .line 177
    check-cast v5, Lo31;

    .line 178
    .line 179
    move-object v1, p1

    .line 180
    move-object v6, p4

    .line 181
    move-object v7, p5

    .line 182
    invoke-static/range {v1 .. v7}, Lj50;->e(Lny0;FFLw7;Lo31;Lsw;Ljk;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne p0, v8, :cond_6

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    check-cast p0, Ls7;

    .line 190
    .line 191
    :goto_4
    move-object v0, p0

    .line 192
    goto :goto_5

    .line 193
    :pswitch_0
    move p3, v3

    .line 194
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    invoke-static {v1, p2, p3}, Lpf1;->a(FFI)Lw7;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 207
    .line 208
    move-object p3, p0

    .line 209
    check-cast p3, Lml;

    .line 210
    .line 211
    move-object p0, p1

    .line 212
    move p1, v0

    .line 213
    invoke-static/range {p0 .. p5}, Lj50;->d(Lny0;FLw7;Lml;Lsw;Ljk;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-ne p0, v8, :cond_7

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    check-cast p0, Ls7;

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :goto_5
    if-ne v0, v8, :cond_8

    .line 224
    .line 225
    return-object v8

    .line 226
    :cond_8
    :goto_6
    check-cast v0, Ls7;

    .line 227
    .line 228
    iget-object p0, v0, Ls7;->b:Lw7;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lhz0;FLik;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lp30;->m:Lsx0;

    .line 2
    .line 3
    check-cast p3, Ljk;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0, p3}, Lf21;->d(Lny0;FLsw;Ljk;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final c(Lny0;FLsw;Ljk;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lb21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lb21;

    .line 7
    .line 8
    iget v1, v0, Lb21;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lb21;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lb21;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lb21;-><init>(Lf21;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lb21;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lb21;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p3, v0, Lb21;->g:Lsw;

    .line 35
    .line 36
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Lul;

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    move-object v4, p0

    .line 54
    move-object v7, p1

    .line 55
    move v5, p2

    .line 56
    move-object v6, p3

    .line 57
    invoke-direct/range {v3 .. v8}, Lul;-><init>(Lf21;FLsw;Lny0;Lik;)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v0, Lb21;->g:Lsw;

    .line 61
    .line 62
    iput v2, v0, Lb21;->j:I

    .line 63
    .line 64
    iget-object p0, v4, Lf21;->d:Lco;

    .line 65
    .line 66
    invoke-static {p0, v3, v0}, Li4;->H(Lpk;Lww;Ljk;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    sget-object p0, Lzk;->d:Lzk;

    .line 71
    .line 72
    if-ne p4, p0, :cond_3

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    move-object p3, v6

    .line 76
    :goto_1
    check-cast p4, Ls7;

    .line 77
    .line 78
    new-instance p0, Ljava/lang/Float;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-object p4
.end method

.method public final d(Lny0;FLsw;Ljk;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Ld21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ld21;

    .line 7
    .line 8
    iget v1, v0, Ld21;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ld21;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ld21;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ld21;-><init>(Lf21;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Ld21;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ld21;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Ld21;->i:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lf21;->c(Lny0;FLsw;Ljk;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    sget-object p0, Lzk;->d:Lzk;

    .line 55
    .line 56
    if-ne p4, p0, :cond_3

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    :goto_1
    check-cast p4, Ls7;

    .line 60
    .line 61
    iget-object p0, p4, Ls7;->a:Ljava/lang/Float;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iget-object p1, p4, Ls7;->b:Lw7;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    cmpg-float p0, p0, p2

    .line 71
    .line 72
    if-nez p0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {p1}, Lw7;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    :goto_2
    new-instance p0, Ljava/lang/Float;

    .line 86
    .line 87
    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 88
    .line 89
    .line 90
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lf21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lf21;

    .line 6
    .line 7
    iget-object v0, p1, Lf21;->c:Lo31;

    .line 8
    .line 9
    iget-object v1, p0, Lf21;->c:Lo31;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lo31;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lf21;->b:Lml;

    .line 18
    .line 19
    iget-object v1, p0, Lf21;->b:Lml;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, Lf21;->a:Lj21;

    .line 28
    .line 29
    iget-object p0, p0, Lf21;->a:Lj21;

    .line 30
    .line 31
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lf21;->c:Lo31;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo31;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lf21;->b:Lml;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lf21;->a:Lj21;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method
