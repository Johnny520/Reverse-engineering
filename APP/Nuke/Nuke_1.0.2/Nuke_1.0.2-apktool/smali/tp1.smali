.class public final Ltp1;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb03;ZLt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltp1;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Ltp1;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, Ltp1;->n:Z

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(ZLxk1;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltp1;->l:I

    .line 13
    iput-boolean p1, p0, Ltp1;->n:Z

    iput-object p2, p0, Ltp1;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ltp1;->l:I

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
    invoke-virtual {p0, p2, p1}, Ltp1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ltp1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ltp1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ltp1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ltp1;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ltp1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    iget p2, p0, Ltp1;->l:I

    .line 2
    .line 3
    iget-boolean v0, p0, Ltp1;->n:Z

    .line 4
    .line 5
    iget-object p0, p0, Ltp1;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Ltp1;

    .line 11
    .line 12
    check-cast p0, Lb03;

    .line 13
    .line 14
    invoke-direct {p2, p0, v0, p1}, Ltp1;-><init>(Lb03;ZLt00;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance p2, Ltp1;

    .line 19
    .line 20
    check-cast p0, Lxk1;

    .line 21
    .line 22
    invoke-direct {p2, v0, p0, p1}, Ltp1;-><init>(ZLxk1;Lt00;)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ltp1;->l:I

    .line 2
    .line 3
    iget-boolean v1, p0, Ltp1;->n:Z

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lk20;->h:Lk20;

    .line 8
    .line 9
    sget-object v4, La83;->a:La83;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, Ltp1;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Lb03;

    .line 19
    .line 20
    iget v0, p0, Ltp1;->m:I

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    if-ne v0, v5, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    move-object v3, v4

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v3, v7

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-wide v8, p1, Lk03;->b:J

    .line 44
    .line 45
    invoke-static {v8, v9}, Lf13;->c(J)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_4

    .line 50
    .line 51
    iget-object p1, v6, Lb03;->f:Lwb3;

    .line 52
    .line 53
    instance-of p1, p1, Ltx1;

    .line 54
    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lt11;->A(Lk03;)Lsd;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-wide v0, p1, Lk03;->b:J

    .line 73
    .line 74
    invoke-static {v0, v1}, Lf13;->e(J)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, Lk03;->a:Lsd;

    .line 83
    .line 84
    invoke-static {p1, p1}, Lfg1;->i(II)J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    invoke-static {v0, v1, v2}, Lb03;->e(Lsd;J)Lk03;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, v6, Lb03;->c:Lin0;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object p1, Ltr0;->h:Ltr0;

    .line 98
    .line 99
    invoke-virtual {v6, p1}, Lb03;->q(Ltr0;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_1
    if-nez v7, :cond_5

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    iget-object p1, v6, Lb03;->h:Lrt;

    .line 106
    .line 107
    if-eqz p1, :cond_0

    .line 108
    .line 109
    invoke-static {v7}, Lop0;->A(Lsd;)Lqt;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput v5, p0, Ltp1;->m:I

    .line 114
    .line 115
    check-cast p1, Li6;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Li6;->a(Lqt;)V

    .line 118
    .line 119
    .line 120
    if-ne v4, v3, :cond_0

    .line 121
    .line 122
    :goto_2
    return-object v3

    .line 123
    :pswitch_0
    check-cast v6, Lxk1;

    .line 124
    .line 125
    iget v0, p0, Ltp1;->m:I

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    if-ne v0, v5, :cond_6

    .line 130
    .line 131
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_8

    .line 135
    .line 136
    :cond_6
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    move-object v3, v7

    .line 140
    goto/16 :goto_9

    .line 141
    .line 142
    :cond_7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    if-eqz v1, :cond_9

    .line 146
    .line 147
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v6, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    :goto_4
    move-object v3, v4

    .line 153
    goto :goto_9

    .line 154
    :cond_9
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    sget-object p1, Lad0;->i:Lz8;

    .line 167
    .line 168
    const-wide/16 v0, 0x96

    .line 169
    .line 170
    sget-object p1, Led0;->j:Led0;

    .line 171
    .line 172
    invoke-static {v0, v1, p1}, Lpp0;->G(JLed0;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v0

    .line 176
    iput v5, p0, Ltp1;->m:I

    .line 177
    .line 178
    const-wide/16 v8, 0x0

    .line 179
    .line 180
    cmp-long v2, v0, v8

    .line 181
    .line 182
    if-lez v2, :cond_a

    .line 183
    .line 184
    move v2, v5

    .line 185
    goto :goto_5

    .line 186
    :cond_a
    const/4 v2, 0x0

    .line 187
    :goto_5
    if-ne v2, v5, :cond_c

    .line 188
    .line 189
    const-wide/32 v7, 0xf423f

    .line 190
    .line 191
    .line 192
    sget-object v2, Led0;->i:Led0;

    .line 193
    .line 194
    invoke-static {v7, v8, v2}, Lpp0;->G(JLed0;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v7

    .line 198
    invoke-static {v0, v1, v7, v8}, Lad0;->e(JJ)J

    .line 199
    .line 200
    .line 201
    move-result-wide v0

    .line 202
    long-to-int v2, v0

    .line 203
    and-int/2addr v2, v5

    .line 204
    if-ne v2, v5, :cond_b

    .line 205
    .line 206
    invoke-static {v0, v1}, Lad0;->d(J)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_b

    .line 211
    .line 212
    shr-long v8, v0, v5

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_b
    invoke-static {v0, v1, p1}, Lad0;->f(JLed0;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v8

    .line 219
    goto :goto_6

    .line 220
    :cond_c
    if-nez v2, :cond_f

    .line 221
    .line 222
    :goto_6
    invoke-static {v8, v9, p0}, Leu;->F(JLu00;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    if-ne p0, v3, :cond_d

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_d
    move-object p0, v4

    .line 230
    :goto_7
    if-ne p0, v3, :cond_e

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_e
    :goto_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-interface {v6, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_f
    invoke-static {}, Lc80;->s()V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :goto_9
    return-object v3

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
