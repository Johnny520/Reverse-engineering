.class public final Li;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V
    .locals 0

    .line 14
    iput p4, p0, Li;->h:I

    iput-object p1, p0, Li;->k:Ljava/lang/Object;

    iput-object p2, p0, Li;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V
    .locals 0

    .line 1
    iput p5, p0, Li;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Li;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Li;->l:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lvb;Lik;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Li;->h:I

    .line 15
    iput-object p1, p0, Li;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 9

    .line 1
    iget v0, p0, Li;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Li;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Li;

    .line 9
    .line 10
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lc40;

    .line 13
    .line 14
    check-cast v1, Lww;

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    invoke-direct {v0, p0, v1, p2, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Li;->j:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Li;

    .line 25
    .line 26
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lww;

    .line 29
    .line 30
    check-cast v1, Loh0;

    .line 31
    .line 32
    const/16 v2, 0xb

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, p2, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Li;->j:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    new-instance v0, Li;

    .line 41
    .line 42
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Llz0;

    .line 45
    .line 46
    check-cast v1, Lww;

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-direct {v0, p0, v1, p2, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, Li;->j:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_2
    new-instance v0, Li;

    .line 57
    .line 58
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ljq;

    .line 61
    .line 62
    check-cast v1, Llz0;

    .line 63
    .line 64
    const/16 v2, 0x9

    .line 65
    .line 66
    invoke-direct {v0, p0, v1, p2, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v0, Li;->j:Ljava/lang/Object;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_3
    new-instance v0, Li;

    .line 73
    .line 74
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lnt0;

    .line 77
    .line 78
    check-cast v1, Ls6;

    .line 79
    .line 80
    const/16 v2, 0x8

    .line 81
    .line 82
    invoke-direct {v0, p0, v1, p2, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 83
    .line 84
    .line 85
    iput-object p1, v0, Li;->j:Ljava/lang/Object;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_4
    new-instance p0, Li;

    .line 89
    .line 90
    check-cast v1, Lvb;

    .line 91
    .line 92
    invoke-direct {p0, v1, p2}, Li;-><init>(Lvb;Lik;)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_5
    new-instance v2, Li;

    .line 97
    .line 98
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v3, p1

    .line 101
    check-cast v3, Lxg0;

    .line 102
    .line 103
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v4, p0

    .line 106
    check-cast v4, Lf30;

    .line 107
    .line 108
    move-object v5, v1

    .line 109
    check-cast v5, Lpo;

    .line 110
    .line 111
    const/4 v7, 0x6

    .line 112
    move-object v6, p2

    .line 113
    invoke-direct/range {v2 .. v7}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :pswitch_6
    move-object v7, p2

    .line 118
    new-instance v3, Li;

    .line 119
    .line 120
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v4, p1

    .line 123
    check-cast v4, Lnm;

    .line 124
    .line 125
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v5, p0

    .line 128
    check-cast v5, Lvh0;

    .line 129
    .line 130
    move-object v6, v1

    .line 131
    check-cast v6, Lww;

    .line 132
    .line 133
    const/4 v8, 0x5

    .line 134
    invoke-direct/range {v3 .. v8}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 135
    .line 136
    .line 137
    return-object v3

    .line 138
    :pswitch_7
    move-object v7, p2

    .line 139
    new-instance p2, Li;

    .line 140
    .line 141
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Lnm;

    .line 144
    .line 145
    check-cast v1, Lww;

    .line 146
    .line 147
    const/4 v0, 0x4

    .line 148
    invoke-direct {p2, p0, v1, v7, v0}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 149
    .line 150
    .line 151
    iput-object p1, p2, Li;->j:Ljava/lang/Object;

    .line 152
    .line 153
    return-object p2

    .line 154
    :pswitch_8
    move-object v7, p2

    .line 155
    new-instance p2, Li;

    .line 156
    .line 157
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Liu;

    .line 160
    .line 161
    check-cast v1, Lod;

    .line 162
    .line 163
    const/4 v0, 0x3

    .line 164
    invoke-direct {p2, p0, v1, v7, v0}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p2, Li;->j:Ljava/lang/Object;

    .line 168
    .line 169
    return-object p2

    .line 170
    :pswitch_9
    move-object v7, p2

    .line 171
    new-instance v3, Li;

    .line 172
    .line 173
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v4, p1

    .line 176
    check-cast v4, Lhb;

    .line 177
    .line 178
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v5, p0

    .line 181
    check-cast v5, Lqj0;

    .line 182
    .line 183
    move-object v6, v1

    .line 184
    check-cast v6, Lm3;

    .line 185
    .line 186
    const/4 v8, 0x2

    .line 187
    invoke-direct/range {v3 .. v8}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 188
    .line 189
    .line 190
    return-object v3

    .line 191
    :pswitch_a
    move-object v7, p2

    .line 192
    new-instance p2, Li;

    .line 193
    .line 194
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, Lb91;

    .line 197
    .line 198
    check-cast v1, Loh0;

    .line 199
    .line 200
    const/4 v0, 0x1

    .line 201
    invoke-direct {p2, p0, v1, v7, v0}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 202
    .line 203
    .line 204
    iput-object p1, p2, Li;->j:Ljava/lang/Object;

    .line 205
    .line 206
    return-object p2

    .line 207
    :pswitch_b
    move-object v7, p2

    .line 208
    new-instance v3, Li;

    .line 209
    .line 210
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v4, p1

    .line 213
    check-cast v4, Lxg0;

    .line 214
    .line 215
    iget-object p0, p0, Li;->k:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v5, p0

    .line 218
    check-cast v5, Lis0;

    .line 219
    .line 220
    move-object v6, v1

    .line 221
    check-cast v6, Lpo;

    .line 222
    .line 223
    const/4 v8, 0x0

    .line 224
    invoke-direct/range {v3 .. v8}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 225
    .line 226
    .line 227
    return-object v3

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyk;

    .line 9
    .line 10
    check-cast p2, Lik;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Li;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lyk;

    .line 24
    .line 25
    check-cast p2, Lik;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Li;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lny0;

    .line 39
    .line 40
    check-cast p2, Lik;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Li;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, Ljz0;

    .line 54
    .line 55
    check-cast p2, Lik;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Li;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_3
    check-cast p1, Lyk;

    .line 69
    .line 70
    check-cast p2, Lik;

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Li;

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_4
    check-cast p1, Lyk;

    .line 84
    .line 85
    check-cast p2, Lik;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Li;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_5
    check-cast p1, Lyk;

    .line 99
    .line 100
    check-cast p2, Lik;

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Li;

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_6
    check-cast p1, Lyk;

    .line 114
    .line 115
    check-cast p2, Lik;

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Li;

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_7
    check-cast p1, Lny0;

    .line 129
    .line 130
    check-cast p2, Lik;

    .line 131
    .line 132
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Li;

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_8
    check-cast p1, Lyk;

    .line 144
    .line 145
    check-cast p2, Lik;

    .line 146
    .line 147
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, Li;

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_9
    check-cast p1, Lyk;

    .line 159
    .line 160
    check-cast p2, Lik;

    .line 161
    .line 162
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Li;

    .line 167
    .line 168
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_a
    check-cast p1, Lps0;

    .line 174
    .line 175
    check-cast p2, Lik;

    .line 176
    .line 177
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Li;

    .line 182
    .line 183
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_b
    check-cast p1, Lyk;

    .line 189
    .line 190
    check-cast p2, Lik;

    .line 191
    .line 192
    invoke-virtual {p0, p1, p2}, Li;->g(Ljava/lang/Object;Lik;)Lik;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Li;

    .line 197
    .line 198
    invoke-virtual {p0, v1}, Li;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Li;->h:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lzk;->d:Lzk;

    .line 11
    .line 12
    iget v1, p0, Li;->i:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    if-eq v1, v3, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    iget-object v1, p0, Li;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lyk;

    .line 34
    .line 35
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, Lyk;

    .line 46
    .line 47
    iget-object p1, p0, Li;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lc40;

    .line 50
    .line 51
    iput-object v1, p0, Li;->j:Ljava/lang/Object;

    .line 52
    .line 53
    iput v3, p0, Li;->i:I

    .line 54
    .line 55
    invoke-interface {p1, p0}, Lc40;->v(Ljk;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    iget-object p1, p0, Li;->l:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lww;

    .line 65
    .line 66
    iput-object v4, p0, Li;->j:Ljava/lang/Object;

    .line 67
    .line 68
    iput v2, p0, Li;->i:I

    .line 69
    .line 70
    invoke-interface {p1, v1, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v0, :cond_4

    .line 75
    .line 76
    :goto_1
    move-object v4, v0

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    :goto_2
    sget-object v4, Lna1;->a:Lna1;

    .line 79
    .line 80
    :goto_3
    return-object v4

    .line 81
    :pswitch_0
    sget-object v0, Lzk;->d:Lzk;

    .line 82
    .line 83
    iget v1, p0, Li;->i:I

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    if-ne v1, v3, :cond_5

    .line 88
    .line 89
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_6
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lyk;

    .line 105
    .line 106
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lww;

    .line 109
    .line 110
    new-instance v2, Lps0;

    .line 111
    .line 112
    iget-object v4, p0, Li;->l:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Loh0;

    .line 115
    .line 116
    invoke-interface {p1}, Lyk;->f()Lpk;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-direct {v2, v4, p1}, Lps0;-><init>(Loh0;Lpk;)V

    .line 121
    .line 122
    .line 123
    iput v3, p0, Li;->i:I

    .line 124
    .line 125
    invoke-interface {v1, v2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-ne p0, v0, :cond_7

    .line 130
    .line 131
    move-object v4, v0

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    sget-object v4, Lna1;->a:Lna1;

    .line 134
    .line 135
    :goto_5
    return-object v4

    .line 136
    :pswitch_1
    sget-object v0, Lzk;->d:Lzk;

    .line 137
    .line 138
    iget v1, p0, Li;->i:I

    .line 139
    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    if-ne v1, v3, :cond_8

    .line 143
    .line 144
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_8
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 149
    .line 150
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_9
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Lny0;

    .line 160
    .line 161
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Llz0;

    .line 164
    .line 165
    iput-object p1, v1, Llz0;->k:Lny0;

    .line 166
    .line 167
    iget-object p1, p0, Li;->l:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p1, Lww;

    .line 170
    .line 171
    iget-object v1, v1, Llz0;->l:Ljz0;

    .line 172
    .line 173
    iput v3, p0, Li;->i:I

    .line 174
    .line 175
    invoke-interface {p1, v1, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-ne p0, v0, :cond_a

    .line 180
    .line 181
    move-object v4, v0

    .line 182
    goto :goto_7

    .line 183
    :cond_a
    :goto_6
    sget-object v4, Lna1;->a:Lna1;

    .line 184
    .line 185
    :goto_7
    return-object v4

    .line 186
    :pswitch_2
    sget-object v0, Lzk;->d:Lzk;

    .line 187
    .line 188
    iget v1, p0, Li;->i:I

    .line 189
    .line 190
    if-eqz v1, :cond_c

    .line 191
    .line 192
    if-ne v1, v3, :cond_b

    .line 193
    .line 194
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_b
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 199
    .line 200
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_c
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p1, Ljz0;

    .line 210
    .line 211
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, Ljq;

    .line 214
    .line 215
    iget-object v2, p0, Li;->l:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v2, Llz0;

    .line 218
    .line 219
    new-instance v4, Lc;

    .line 220
    .line 221
    const/16 v5, 0x13

    .line 222
    .line 223
    invoke-direct {v4, v5, p1, v2}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iput v3, p0, Li;->i:I

    .line 227
    .line 228
    invoke-virtual {v1, v4, p0}, Ljq;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    if-ne p0, v0, :cond_d

    .line 233
    .line 234
    move-object v4, v0

    .line 235
    goto :goto_9

    .line 236
    :cond_d
    :goto_8
    sget-object v4, Lna1;->a:Lna1;

    .line 237
    .line 238
    :goto_9
    return-object v4

    .line 239
    :pswitch_3
    sget-object v0, Lzk;->d:Lzk;

    .line 240
    .line 241
    iget v1, p0, Li;->i:I

    .line 242
    .line 243
    if-eqz v1, :cond_f

    .line 244
    .line 245
    if-ne v1, v3, :cond_e

    .line 246
    .line 247
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object v4, Lna1;->a:Lna1;

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_e
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 254
    .line 255
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_f
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p1, Lyk;

    .line 265
    .line 266
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, Lnt0;

    .line 269
    .line 270
    iget-object v2, p0, Li;->l:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Ls6;

    .line 273
    .line 274
    iput v3, p0, Li;->i:I

    .line 275
    .line 276
    invoke-virtual {v1, p1, v2, p0}, Lnt0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-object v4, v0

    .line 280
    :goto_a
    return-object v4

    .line 281
    :pswitch_4
    sget-object v0, Lzk;->d:Lzk;

    .line 282
    .line 283
    iget v1, p0, Li;->i:I

    .line 284
    .line 285
    if-eqz v1, :cond_11

    .line 286
    .line 287
    if-ne v1, v3, :cond_10

    .line 288
    .line 289
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, Lub;

    .line 292
    .line 293
    iget-object v5, p0, Li;->j:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v5, Lmd;

    .line 296
    .line 297
    :try_start_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    .line 299
    .line 300
    goto :goto_c

    .line 301
    :catchall_0
    move-exception v0

    .line 302
    move-object p0, v0

    .line 303
    goto :goto_f

    .line 304
    :cond_10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 305
    .line 306
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_e

    .line 310
    :cond_11
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, Li;->l:Ljava/lang/Object;

    .line 314
    .line 315
    move-object v5, p1

    .line 316
    check-cast v5, Lvb;

    .line 317
    .line 318
    :try_start_1
    new-instance p1, Lub;

    .line 319
    .line 320
    invoke-direct {p1, v5}, Lub;-><init>(Lvb;)V

    .line 321
    .line 322
    .line 323
    move-object v1, p1

    .line 324
    :cond_12
    :goto_b
    iput-object v5, p0, Li;->j:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 327
    .line 328
    iput v3, p0, Li;->i:I

    .line 329
    .line 330
    invoke-virtual {v1, p0}, Lub;->b(Ljk;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    if-ne p1, v0, :cond_13

    .line 335
    .line 336
    move-object v4, v0

    .line 337
    goto :goto_e

    .line 338
    :cond_13
    :goto_c
    check-cast p1, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-eqz p1, :cond_15

    .line 345
    .line 346
    invoke-virtual {v1}, Lub;->c()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    check-cast p1, Lna1;

    .line 351
    .line 352
    sget-object p1, Lrx;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 353
    .line 354
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 355
    .line 356
    .line 357
    sget-object p1, Lt21;->c:Ljava/lang/Object;

    .line 358
    .line 359
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 360
    :try_start_2
    sget-object v6, Lt21;->j:Lqx;

    .line 361
    .line 362
    iget-object v6, v6, Lnh0;->h:Lkh0;

    .line 363
    .line 364
    if-eqz v6, :cond_14

    .line 365
    .line 366
    invoke-virtual {v6}, Lkh0;->h()Z

    .line 367
    .line 368
    .line 369
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 370
    if-ne v6, v3, :cond_14

    .line 371
    .line 372
    move v6, v3

    .line 373
    goto :goto_d

    .line 374
    :cond_14
    move v6, v2

    .line 375
    :goto_d
    :try_start_3
    monitor-exit p1

    .line 376
    if-eqz v6, :cond_12

    .line 377
    .line 378
    invoke-static {}, Lt21;->a()V

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :catchall_1
    move-exception v0

    .line 383
    move-object p0, v0

    .line 384
    monitor-exit p1

    .line 385
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 386
    :cond_15
    invoke-interface {v5, v4}, Lmd;->a(Ljava/util/concurrent/CancellationException;)V

    .line 387
    .line 388
    .line 389
    sget-object v4, Lna1;->a:Lna1;

    .line 390
    .line 391
    :goto_e
    return-object v4

    .line 392
    :goto_f
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 393
    :catchall_2
    move-exception v0

    .line 394
    move-object p1, v0

    .line 395
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 396
    .line 397
    if-eqz v0, :cond_16

    .line 398
    .line 399
    move-object v4, p0

    .line 400
    check-cast v4, Ljava/util/concurrent/CancellationException;

    .line 401
    .line 402
    :cond_16
    if-nez v4, :cond_17

    .line 403
    .line 404
    const-string v0, "Channel was consumed, consumer had failed"

    .line 405
    .line 406
    new-instance v4, Ljava/util/concurrent/CancellationException;

    .line 407
    .line 408
    invoke-direct {v4, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 412
    .line 413
    .line 414
    :cond_17
    invoke-interface {v5, v4}, Lmd;->a(Ljava/util/concurrent/CancellationException;)V

    .line 415
    .line 416
    .line 417
    throw p1

    .line 418
    :pswitch_5
    sget-object v0, Lzk;->d:Lzk;

    .line 419
    .line 420
    iget v1, p0, Li;->i:I

    .line 421
    .line 422
    if-eqz v1, :cond_19

    .line 423
    .line 424
    if-ne v1, v3, :cond_18

    .line 425
    .line 426
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    goto :goto_10

    .line 430
    :cond_18
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 431
    .line 432
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    goto :goto_11

    .line 436
    :cond_19
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast p1, Lxg0;

    .line 442
    .line 443
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v1, Lf30;

    .line 446
    .line 447
    iput v3, p0, Li;->i:I

    .line 448
    .line 449
    invoke-virtual {p1, v1, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    if-ne p1, v0, :cond_1a

    .line 454
    .line 455
    move-object v4, v0

    .line 456
    goto :goto_11

    .line 457
    :cond_1a
    :goto_10
    iget-object p0, p0, Li;->l:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p0, Lpo;

    .line 460
    .line 461
    if-eqz p0, :cond_1b

    .line 462
    .line 463
    invoke-interface {p0}, Lpo;->a()V

    .line 464
    .line 465
    .line 466
    :cond_1b
    sget-object v4, Lna1;->a:Lna1;

    .line 467
    .line 468
    :goto_11
    return-object v4

    .line 469
    :pswitch_6
    sget-object v0, Lzk;->d:Lzk;

    .line 470
    .line 471
    iget v2, p0, Li;->i:I

    .line 472
    .line 473
    if-eqz v2, :cond_1d

    .line 474
    .line 475
    if-ne v2, v3, :cond_1c

    .line 476
    .line 477
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    goto :goto_12

    .line 481
    :cond_1c
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 482
    .line 483
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    goto :goto_13

    .line 487
    :cond_1d
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast p1, Lnm;

    .line 493
    .line 494
    iget-object v7, p1, Lnm;->c:Lai0;

    .line 495
    .line 496
    iget-object v9, p1, Lnm;->b:Lmm;

    .line 497
    .line 498
    iget-object v2, p0, Li;->k:Ljava/lang/Object;

    .line 499
    .line 500
    move-object v6, v2

    .line 501
    check-cast v6, Lvh0;

    .line 502
    .line 503
    new-instance v8, Li;

    .line 504
    .line 505
    iget-object v2, p0, Li;->l:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v2, Lww;

    .line 508
    .line 509
    invoke-direct {v8, p1, v2, v4, v1}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 510
    .line 511
    .line 512
    iput v3, p0, Li;->i:I

    .line 513
    .line 514
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    new-instance v5, Lzh0;

    .line 518
    .line 519
    const/4 v10, 0x0

    .line 520
    invoke-direct/range {v5 .. v10}, Lzh0;-><init>(Lvh0;Lai0;Li;Lmm;Lik;)V

    .line 521
    .line 522
    .line 523
    invoke-static {v5, p0}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    if-ne p0, v0, :cond_1e

    .line 528
    .line 529
    move-object v4, v0

    .line 530
    goto :goto_13

    .line 531
    :cond_1e
    :goto_12
    sget-object v4, Lna1;->a:Lna1;

    .line 532
    .line 533
    :goto_13
    return-object v4

    .line 534
    :pswitch_7
    iget-object v0, p0, Li;->k:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Lnm;

    .line 537
    .line 538
    iget-object v1, v0, Lnm;->d:Lgp0;

    .line 539
    .line 540
    sget-object v0, Lzk;->d:Lzk;

    .line 541
    .line 542
    iget v2, p0, Li;->i:I

    .line 543
    .line 544
    if-eqz v2, :cond_20

    .line 545
    .line 546
    if-ne v2, v3, :cond_1f

    .line 547
    .line 548
    :try_start_5
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 549
    .line 550
    .line 551
    goto :goto_14

    .line 552
    :catchall_3
    move-exception v0

    .line 553
    move-object p0, v0

    .line 554
    goto :goto_16

    .line 555
    :cond_1f
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 556
    .line 557
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto :goto_15

    .line 561
    :cond_20
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast p1, Lny0;

    .line 567
    .line 568
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-virtual {v1, v2}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    :try_start_6
    iget-object v2, p0, Li;->l:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v2, Lww;

    .line 576
    .line 577
    iput v3, p0, Li;->i:I

    .line 578
    .line 579
    invoke-interface {v2, p1, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 583
    if-ne p0, v0, :cond_21

    .line 584
    .line 585
    move-object v4, v0

    .line 586
    goto :goto_15

    .line 587
    :cond_21
    :goto_14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 588
    .line 589
    invoke-virtual {v1, p0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    sget-object v4, Lna1;->a:Lna1;

    .line 593
    .line 594
    :goto_15
    return-object v4

    .line 595
    :goto_16
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 596
    .line 597
    invoke-virtual {v1, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    throw p0

    .line 601
    :pswitch_8
    sget-object v0, Lna1;->a:Lna1;

    .line 602
    .line 603
    sget-object v5, Lzk;->d:Lzk;

    .line 604
    .line 605
    iget v6, p0, Li;->i:I

    .line 606
    .line 607
    if-eqz v6, :cond_24

    .line 608
    .line 609
    if-ne v6, v3, :cond_23

    .line 610
    .line 611
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    :cond_22
    move-object v4, v0

    .line 615
    goto :goto_18

    .line 616
    :cond_23
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 617
    .line 618
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    goto :goto_18

    .line 622
    :cond_24
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast p1, Lyk;

    .line 628
    .line 629
    iget-object v6, p0, Li;->k:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v6, Liu;

    .line 632
    .line 633
    iget-object v7, p0, Li;->l:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v7, Lod;

    .line 636
    .line 637
    iget-object v8, v7, Lod;->d:Lpk;

    .line 638
    .line 639
    iget v9, v7, Lod;->e:I

    .line 640
    .line 641
    const/4 v10, -0x3

    .line 642
    if-ne v9, v10, :cond_25

    .line 643
    .line 644
    const/4 v9, -0x2

    .line 645
    :cond_25
    iget-object v10, v7, Lod;->f:Ltb;

    .line 646
    .line 647
    sget-object v11, Lbl;->f:Lbl;

    .line 648
    .line 649
    new-instance v12, Lnd;

    .line 650
    .line 651
    invoke-direct {v12, v7, v4, v2}, Lnd;-><init>(Lod;Lik;I)V

    .line 652
    .line 653
    .line 654
    invoke-static {v9, v1, v10}, Lo30;->e(IILtb;)Lvb;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    invoke-interface {p1}, Lyk;->f()Lpk;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    invoke-static {p1, v8, v3}, Li4;->p(Lpk;Lpk;Z)Lpk;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    sget-object v2, Lio;->a:Llm;

    .line 667
    .line 668
    if-eq p1, v2, :cond_26

    .line 669
    .line 670
    sget-object v4, Ln2;->w:Ln2;

    .line 671
    .line 672
    invoke-interface {p1, v4}, Lpk;->l(Lok;)Lnk;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    if-nez v4, :cond_26

    .line 677
    .line 678
    invoke-interface {p1, v2}, Lpk;->h(Lpk;)Lpk;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    :cond_26
    new-instance v2, Lqs0;

    .line 683
    .line 684
    invoke-direct {v2, p1, v1}, Lqs0;-><init>(Lpk;Lvb;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v11, v2, v12}, Ls;->l0(Lbl;Ls;Lww;)V

    .line 688
    .line 689
    .line 690
    iput v3, p0, Li;->i:I

    .line 691
    .line 692
    invoke-static {v6, v2, v3, p0}, Ls91;->x(Liu;Lqs0;ZLjk;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    if-ne p0, v5, :cond_27

    .line 697
    .line 698
    goto :goto_17

    .line 699
    :cond_27
    move-object p0, v0

    .line 700
    :goto_17
    if-ne p0, v5, :cond_22

    .line 701
    .line 702
    move-object v4, v5

    .line 703
    :goto_18
    return-object v4

    .line 704
    :pswitch_9
    sget-object v0, Lna1;->a:Lna1;

    .line 705
    .line 706
    iget-object v5, p0, Li;->j:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v5, Lhb;

    .line 709
    .line 710
    sget-object v6, Lzk;->d:Lzk;

    .line 711
    .line 712
    iget v7, p0, Li;->i:I

    .line 713
    .line 714
    if-eqz v7, :cond_2a

    .line 715
    .line 716
    if-ne v7, v3, :cond_29

    .line 717
    .line 718
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    :cond_28
    move-object v4, v0

    .line 722
    goto/16 :goto_1f

    .line 723
    .line 724
    :cond_29
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 725
    .line 726
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    goto/16 :goto_1f

    .line 730
    .line 731
    :cond_2a
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    iget-object v7, v5, Lhb;->r:Lck;

    .line 735
    .line 736
    new-instance p1, Lfb;

    .line 737
    .line 738
    iget-object v4, p0, Li;->k:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v4, Lqj0;

    .line 741
    .line 742
    iget-object v8, p0, Li;->l:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v8, Lm3;

    .line 745
    .line 746
    invoke-direct {p1, v5, v4, v8}, Lfb;-><init>(Lhb;Lqj0;Lm3;)V

    .line 747
    .line 748
    .line 749
    iput v3, p0, Li;->i:I

    .line 750
    .line 751
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-virtual {p1}, Lfb;->invoke()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    move-object v8, v4

    .line 759
    check-cast v8, Lst0;

    .line 760
    .line 761
    if-eqz v8, :cond_31

    .line 762
    .line 763
    const-wide/16 v11, 0x0

    .line 764
    .line 765
    const/4 v13, 0x3

    .line 766
    const-wide/16 v9, 0x0

    .line 767
    .line 768
    invoke-static/range {v7 .. v13}, Lck;->x0(Lck;Lst0;JJI)Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    if-nez v4, :cond_31

    .line 773
    .line 774
    new-instance v4, Lwc;

    .line 775
    .line 776
    invoke-static {p0}, Lrd0;->z(Lik;)Lik;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    invoke-direct {v4, v3, p0}, Lwc;-><init>(ILik;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v4}, Lwc;->v()V

    .line 784
    .line 785
    .line 786
    new-instance p0, Lyj;

    .line 787
    .line 788
    invoke-direct {p0, p1, v4}, Lyj;-><init>(Lfb;Lwc;)V

    .line 789
    .line 790
    .line 791
    iget-object v5, v7, Lck;->w:Leb;

    .line 792
    .line 793
    iget-object v8, v5, Leb;->a:Lsh0;

    .line 794
    .line 795
    invoke-virtual {p1}, Lfb;->invoke()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object p1

    .line 799
    check-cast p1, Lst0;

    .line 800
    .line 801
    if-nez p1, :cond_2b

    .line 802
    .line 803
    invoke-virtual {v4, v0}, Lwc;->i(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    goto :goto_1d

    .line 807
    :cond_2b
    new-instance v9, Lc;

    .line 808
    .line 809
    invoke-direct {v9, v1, v5, p0}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4, v9}, Lwc;->y(Lsw;)V

    .line 813
    .line 814
    .line 815
    iget v1, v8, Lsh0;->f:I

    .line 816
    .line 817
    invoke-static {v2, v1}, Lw60;->O(II)Lz20;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    iget v5, v1, Lx20;->d:I

    .line 822
    .line 823
    iget v1, v1, Lx20;->e:I

    .line 824
    .line 825
    if-gt v5, v1, :cond_2f

    .line 826
    .line 827
    :goto_19
    iget-object v9, v8, Lsh0;->d:[Ljava/lang/Object;

    .line 828
    .line 829
    aget-object v9, v9, v1

    .line 830
    .line 831
    check-cast v9, Lyj;

    .line 832
    .line 833
    iget-object v9, v9, Lyj;->a:Lfb;

    .line 834
    .line 835
    invoke-virtual {v9}, Lfb;->invoke()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v9

    .line 839
    check-cast v9, Lst0;

    .line 840
    .line 841
    if-nez v9, :cond_2c

    .line 842
    .line 843
    goto :goto_1b

    .line 844
    :cond_2c
    invoke-virtual {p1, v9}, Lst0;->c(Lst0;)Lst0;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    invoke-virtual {v10, p1}, Lst0;->equals(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v11

    .line 852
    if-eqz v11, :cond_2d

    .line 853
    .line 854
    add-int/2addr v1, v3

    .line 855
    invoke-virtual {v8, v1, p0}, Lsh0;->a(ILjava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    goto :goto_1c

    .line 859
    :cond_2d
    invoke-virtual {v10, v9}, Lst0;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v9

    .line 863
    if-nez v9, :cond_2e

    .line 864
    .line 865
    new-instance v9, Ljava/util/concurrent/CancellationException;

    .line 866
    .line 867
    const-string v10, "bringIntoView call interrupted by a newer, non-overlapping call"

    .line 868
    .line 869
    invoke-direct {v9, v10}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    iget v10, v8, Lsh0;->f:I

    .line 873
    .line 874
    sub-int/2addr v10, v3

    .line 875
    if-gt v10, v1, :cond_2e

    .line 876
    .line 877
    :goto_1a
    iget-object v11, v8, Lsh0;->d:[Ljava/lang/Object;

    .line 878
    .line 879
    aget-object v11, v11, v1

    .line 880
    .line 881
    check-cast v11, Lyj;

    .line 882
    .line 883
    iget-object v11, v11, Lyj;->b:Lwc;

    .line 884
    .line 885
    invoke-virtual {v11, v9}, Lwc;->k(Ljava/lang/Throwable;)Z

    .line 886
    .line 887
    .line 888
    if-eq v10, v1, :cond_2e

    .line 889
    .line 890
    add-int/lit8 v10, v10, 0x1

    .line 891
    .line 892
    goto :goto_1a

    .line 893
    :cond_2e
    :goto_1b
    if-eq v1, v5, :cond_2f

    .line 894
    .line 895
    add-int/lit8 v1, v1, -0x1

    .line 896
    .line 897
    goto :goto_19

    .line 898
    :cond_2f
    invoke-virtual {v8, v2, p0}, Lsh0;->a(ILjava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    :goto_1c
    iget-boolean p0, v7, Lck;->z:Z

    .line 902
    .line 903
    if-nez p0, :cond_30

    .line 904
    .line 905
    const-wide/16 p0, 0x0

    .line 906
    .line 907
    invoke-virtual {v7, p0, p1}, Lck;->y0(J)V

    .line 908
    .line 909
    .line 910
    :cond_30
    :goto_1d
    invoke-virtual {v4}, Lwc;->t()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object p0

    .line 914
    if-ne p0, v6, :cond_31

    .line 915
    .line 916
    goto :goto_1e

    .line 917
    :cond_31
    move-object p0, v0

    .line 918
    :goto_1e
    if-ne p0, v6, :cond_28

    .line 919
    .line 920
    move-object v4, v6

    .line 921
    :goto_1f
    return-object v4

    .line 922
    :pswitch_a
    iget-object v0, p0, Li;->k:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v0, Lb91;

    .line 925
    .line 926
    sget-object v1, Lzk;->d:Lzk;

    .line 927
    .line 928
    iget v5, p0, Li;->i:I

    .line 929
    .line 930
    if-eqz v5, :cond_33

    .line 931
    .line 932
    if-ne v5, v3, :cond_32

    .line 933
    .line 934
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    goto :goto_20

    .line 938
    :cond_32
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 939
    .line 940
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    goto :goto_21

    .line 944
    :cond_33
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast p1, Lps0;

    .line 950
    .line 951
    new-instance v5, Li7;

    .line 952
    .line 953
    invoke-direct {v5, v2, v0}, Li7;-><init>(ILjava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    new-instance v6, La31;

    .line 957
    .line 958
    invoke-direct {v6, v5, v4}, La31;-><init>(Li7;Lik;)V

    .line 959
    .line 960
    .line 961
    new-instance v4, Lx1;

    .line 962
    .line 963
    const/16 v5, 0x17

    .line 964
    .line 965
    invoke-direct {v4, v5, v6}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    new-instance v5, Lj7;

    .line 969
    .line 970
    iget-object v6, p0, Li;->l:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v6, Loh0;

    .line 973
    .line 974
    invoke-direct {v5, p1, v0, v6, v2}, Lj7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 975
    .line 976
    .line 977
    iput v3, p0, Li;->i:I

    .line 978
    .line 979
    invoke-virtual {v4, v5, p0}, Lx1;->b(Liu;Lik;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object p0

    .line 983
    if-ne p0, v1, :cond_34

    .line 984
    .line 985
    move-object v4, v1

    .line 986
    goto :goto_21

    .line 987
    :cond_34
    :goto_20
    sget-object v4, Lna1;->a:Lna1;

    .line 988
    .line 989
    :goto_21
    return-object v4

    .line 990
    :pswitch_b
    sget-object v0, Lzk;->d:Lzk;

    .line 991
    .line 992
    iget v1, p0, Li;->i:I

    .line 993
    .line 994
    if-eqz v1, :cond_36

    .line 995
    .line 996
    if-ne v1, v3, :cond_35

    .line 997
    .line 998
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_22

    .line 1002
    :cond_35
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1003
    .line 1004
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_23

    .line 1008
    :cond_36
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 1009
    .line 1010
    .line 1011
    iget-object p1, p0, Li;->j:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast p1, Lxg0;

    .line 1014
    .line 1015
    iget-object v1, p0, Li;->k:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v1, Lis0;

    .line 1018
    .line 1019
    iput v3, p0, Li;->i:I

    .line 1020
    .line 1021
    invoke-virtual {p1, v1, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p1

    .line 1025
    if-ne p1, v0, :cond_37

    .line 1026
    .line 1027
    move-object v4, v0

    .line 1028
    goto :goto_23

    .line 1029
    :cond_37
    :goto_22
    iget-object p0, p0, Li;->l:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast p0, Lpo;

    .line 1032
    .line 1033
    if-eqz p0, :cond_38

    .line 1034
    .line 1035
    invoke-interface {p0}, Lpo;->a()V

    .line 1036
    .line 1037
    .line 1038
    :cond_38
    sget-object v4, Lna1;->a:Lna1;

    .line 1039
    .line 1040
    :goto_23
    return-object v4

    .line 1041
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
