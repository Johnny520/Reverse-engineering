.class public final Lw/u0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lw/u0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 14
    iput p4, p0, Lw/u0;->h:I

    iput-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    iput-object p2, p0, Lw/u0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    iget v0, p0, Lw/u0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw/u0;

    .line 7
    .line 8
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Ls3/e;

    .line 12
    .line 13
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Li/c;

    .line 17
    .line 18
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Li0/f1;

    .line 22
    .line 23
    const/16 v6, 0x9

    .line 24
    .line 25
    move-object v5, p2

    .line 26
    invoke-direct/range {v1 .. v6}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object v6, p2

    .line 31
    new-instance v2, Lw/u0;

    .line 32
    .line 33
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    check-cast v3, Landroid/content/Context;

    .line 37
    .line 38
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v4, p1

    .line 41
    check-cast v4, Lgb/o;

    .line 42
    .line 43
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    check-cast v5, Ljava/lang/String;

    .line 47
    .line 48
    const/16 v7, 0x8

    .line 49
    .line 50
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :pswitch_1
    move-object v6, p2

    .line 55
    new-instance v2, Lw/u0;

    .line 56
    .line 57
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v3, p1

    .line 60
    check-cast v3, Landroid/content/Context;

    .line 61
    .line 62
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, p1

    .line 65
    check-cast v4, Lgb/o;

    .line 66
    .line 67
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v5, p1

    .line 70
    check-cast v5, Lgb/h;

    .line 71
    .line 72
    const/4 v7, 0x7

    .line 73
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 74
    .line 75
    .line 76
    return-object v2

    .line 77
    :pswitch_2
    move-object v6, p2

    .line 78
    new-instance v2, Lw/u0;

    .line 79
    .line 80
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v3, p1

    .line 83
    check-cast v3, Landroid/content/Context;

    .line 84
    .line 85
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v4, p1

    .line 88
    check-cast v4, Lgb/o;

    .line 89
    .line 90
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v5, p1

    .line 93
    check-cast v5, Lgb/c;

    .line 94
    .line 95
    const/4 v7, 0x6

    .line 96
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :pswitch_3
    move-object v6, p2

    .line 101
    new-instance v2, Lw/u0;

    .line 102
    .line 103
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v3, p1

    .line 106
    check-cast v3, Landroid/content/Context;

    .line 107
    .line 108
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v4, p1

    .line 111
    check-cast v4, Li0/a1;

    .line 112
    .line 113
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v5, p1

    .line 116
    check-cast v5, Li0/a1;

    .line 117
    .line 118
    const/4 v7, 0x5

    .line 119
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 120
    .line 121
    .line 122
    return-object v2

    .line 123
    :pswitch_4
    move-object v6, p2

    .line 124
    new-instance v2, Lw/u0;

    .line 125
    .line 126
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v3, p1

    .line 129
    check-cast v3, Ljava/lang/String;

    .line 130
    .line 131
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v4, p1

    .line 134
    check-cast v4, Ljava/lang/String;

    .line 135
    .line 136
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 137
    .line 138
    move-object v5, p1

    .line 139
    check-cast v5, Ljava/lang/String;

    .line 140
    .line 141
    const/4 v7, 0x4

    .line 142
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 143
    .line 144
    .line 145
    return-object v2

    .line 146
    :pswitch_5
    move-object v6, p2

    .line 147
    new-instance v2, Lw/u0;

    .line 148
    .line 149
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v3, p1

    .line 152
    check-cast v3, Lwb/n5;

    .line 153
    .line 154
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v4, p1

    .line 157
    check-cast v4, Li0/a1;

    .line 158
    .line 159
    iget-object p1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v5, p1

    .line 162
    check-cast v5, Li0/a1;

    .line 163
    .line 164
    const/4 v7, 0x3

    .line 165
    invoke-direct/range {v2 .. v7}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 166
    .line 167
    .line 168
    return-object v2

    .line 169
    :pswitch_6
    move-object v6, p2

    .line 170
    new-instance p2, Lw/u0;

    .line 171
    .line 172
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Li0/a1;

    .line 175
    .line 176
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, Li0/a1;

    .line 179
    .line 180
    const/4 v2, 0x2

    .line 181
    invoke-direct {p2, v0, v1, v6, v2}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 182
    .line 183
    .line 184
    iput-object p1, p2, Lw/u0;->i:Ljava/lang/Object;

    .line 185
    .line 186
    return-object p2

    .line 187
    :pswitch_7
    move-object v6, p2

    .line 188
    new-instance p2, Lw/u0;

    .line 189
    .line 190
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Ljava/util/List;

    .line 193
    .line 194
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, Lc9/a;

    .line 197
    .line 198
    const/4 v2, 0x1

    .line 199
    invoke-direct {p2, v0, v1, v6, v2}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 200
    .line 201
    .line 202
    iput-object p1, p2, Lw/u0;->i:Ljava/lang/Object;

    .line 203
    .line 204
    return-object p2

    .line 205
    :pswitch_8
    move-object v6, p2

    .line 206
    new-instance p2, Lw/u0;

    .line 207
    .line 208
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Ls1/x;

    .line 211
    .line 212
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v1, Lw/y0;

    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-direct {p2, v0, v1, v6, v2}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 218
    .line 219
    .line 220
    iput-object p1, p2, Lw/u0;->i:Ljava/lang/Object;

    .line 221
    .line 222
    return-object p2

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 1

    .line 1
    iget v0, p0, Lw/u0;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw/u0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lw/u0;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lw/u0;

    .line 40
    .line 41
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lw/u0;

    .line 53
    .line 54
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lw/u0;

    .line 66
    .line 67
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lw/u0;

    .line 79
    .line 80
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lw/u0;

    .line 92
    .line 93
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lw/u0;

    .line 104
    .line 105
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lw/u0;

    .line 117
    .line 118
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Lw/u0;

    .line 130
    .line 131
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw/u0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Ls3/e;

    .line 15
    .line 16
    iget-object p1, p1, Ls3/e;->a:Li0/j1;

    .line 17
    .line 18
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lr3/e;

    .line 23
    .line 24
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Landroid/content/Context;

    .line 33
    .line 34
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lgb/o;

    .line 37
    .line 38
    iget-object v0, v0, Lgb/o;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/16 v3, 0x3e8

    .line 66
    .line 67
    if-gt v2, v3, :cond_0

    .line 68
    .line 69
    invoke-static {p1}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    check-cast v2, Lgb/s;

    .line 77
    .line 78
    invoke-static {p1, v2, v0, v1}, Lgb/b;->a(Landroid/content/Context;Lgb/s;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Lgb/d;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const-string p1, "\u8bc4\u8bba\u5185\u5bb9\u4e0d\u80fd\u8d85\u8fc7 1000 \u4e2a\u5b57\u7b26"

    .line 92
    .line 93
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :cond_1
    const-string p1, "\u8bc4\u8bba\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 100
    .line 101
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :goto_0
    new-instance v0, Lsf/f;

    .line 108
    .line 109
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object p1, v0

    .line 113
    :goto_1
    new-instance v0, Lsf/g;

    .line 114
    .line 115
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Landroid/content/Context;

    .line 125
    .line 126
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lgb/o;

    .line 129
    .line 130
    iget-object v0, v0, Lgb/o;->a:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Lgb/h;

    .line 135
    .line 136
    iget-object v1, v1, Lgb/h;->a:Ljava/lang/String;

    .line 137
    .line 138
    :try_start_1
    invoke-static {p1, v0, v1}, Lgb/b;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    check-cast p1, Lgb/o;

    .line 146
    .line 147
    invoke-static {p1}, Lgb/k;->u(Lgb/o;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move-object p1, v0

    .line 157
    new-instance v0, Lsf/f;

    .line 158
    .line 159
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    move-object p1, v0

    .line 163
    :goto_2
    new-instance v0, Lsf/g;

    .line 164
    .line 165
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Landroid/content/Context;

    .line 175
    .line 176
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lgb/o;

    .line 179
    .line 180
    iget-object v0, v0, Lgb/o;->a:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v1, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Lgb/c;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v2, v1, Lgb/c;->b:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, v1, Lgb/c;->a:Ljava/lang/String;

    .line 192
    .line 193
    :try_start_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_6

    .line 198
    .line 199
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_5

    .line 204
    .line 205
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_3

    .line 210
    .line 211
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_2

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_2
    const-string p1, "\u8bc4\u8bba\u4e0d\u5c5e\u4e8e\u5f53\u524d\u63d2\u4ef6"

    .line 219
    .line 220
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 221
    .line 222
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v0

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    move-object p1, v0

    .line 228
    goto :goto_4

    .line 229
    :cond_3
    :goto_3
    iget-boolean v1, v1, Lgb/c;->f:Z

    .line 230
    .line 231
    if-eqz v1, :cond_4

    .line 232
    .line 233
    invoke-static {p1}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    check-cast v1, Lgb/s;

    .line 241
    .line 242
    invoke-static {p1, v1, v0, v3}, Lgb/b;->e(Landroid/content/Context;Lgb/s;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    check-cast p1, Lgb/d;

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_4
    const-string p1, "\u53ea\u80fd\u5220\u9664\u81ea\u5df1\u7684\u8bc4\u8bba"

    .line 253
    .line 254
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 255
    .line 256
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_5
    const-string p1, "\u8bc4\u8bba ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 261
    .line 262
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_6
    const-string p1, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 269
    .line 270
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 271
    .line 272
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 276
    :goto_4
    new-instance v0, Lsf/f;

    .line 277
    .line 278
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    move-object p1, v0

    .line 282
    :goto_5
    new-instance v0, Lsf/g;

    .line 283
    .line 284
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 292
    .line 293
    move-object v4, p1

    .line 294
    check-cast v4, Landroid/content/Context;

    .line 295
    .line 296
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast p1, Li0/a1;

    .line 299
    .line 300
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    check-cast p1, Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    iget-object v0, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Li0/a1;

    .line 317
    .line 318
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-object v5, Lgb/b;->a:Lokhttp3/MediaType;

    .line 331
    .line 332
    const-string v10, "data"

    .line 333
    .line 334
    const-string v11, "limit"

    .line 335
    .line 336
    const-string v5, "latest"

    .line 337
    .line 338
    move-object v6, v5

    .line 339
    :try_start_3
    sget-object v5, Lgb/a;->g:Lgb/a;

    .line 340
    .line 341
    const-string v7, "v1"

    .line 342
    .line 343
    const-string v8, "plugins"

    .line 344
    .line 345
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    invoke-static {v7}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    const-string v8, "q"

    .line 354
    .line 355
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    new-instance v9, Lsf/e;

    .line 364
    .line 365
    invoke-direct {v9, v8, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    const-string p1, "sort"

    .line 369
    .line 370
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-nez v8, :cond_8

    .line 375
    .line 376
    const-string v8, "downloads"

    .line 377
    .line 378
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-eqz v8, :cond_7

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_7
    move-object v0, v3

    .line 386
    goto :goto_6

    .line 387
    :catchall_3
    move-exception v0

    .line 388
    move-object p1, v0

    .line 389
    goto/16 :goto_a

    .line 390
    .line 391
    :cond_8
    :goto_6
    if-nez v0, :cond_9

    .line 392
    .line 393
    const-string v0, ""

    .line 394
    .line 395
    :cond_9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    if-eqz v8, :cond_a

    .line 400
    .line 401
    move-object v0, v6

    .line 402
    :cond_a
    new-instance v6, Lsf/e;

    .line 403
    .line 404
    invoke-direct {v6, p1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    const/16 p1, 0x64

    .line 408
    .line 409
    invoke-static {p1, v2, p1}, Lr9/e0;->r(III)I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    new-instance v2, Lsf/e;

    .line 418
    .line 419
    invoke-direct {v2, v11, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    filled-new-array {v9, v6, v2}, [Lsf/e;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-static {v0}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    move-object v6, v7

    .line 431
    const/4 v7, 0x0

    .line 432
    const/4 v8, 0x0

    .line 433
    invoke-static/range {v4 .. v9}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_b

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_b
    if-eqz v2, :cond_c

    .line 449
    .line 450
    const-string v0, "items"

    .line 451
    .line 452
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    :cond_c
    if-eqz v3, :cond_d

    .line 457
    .line 458
    move-object v0, v3

    .line 459
    goto :goto_7

    .line 460
    :cond_d
    new-instance v0, Lorg/json/JSONArray;

    .line 461
    .line 462
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 463
    .line 464
    .line 465
    :goto_7
    invoke-static {}, La/a;->E()Luf/c;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    :goto_8
    if-lt v1, v4, :cond_10

    .line 474
    .line 475
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    new-instance v1, Lgb/n;

    .line 480
    .line 481
    if-eqz v2, :cond_e

    .line 482
    .line 483
    const-string v3, "count"

    .line 484
    .line 485
    invoke-virtual {v0}, Ltf/g;->a()I

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    goto :goto_9

    .line 494
    :cond_e
    invoke-virtual {v0}, Ltf/g;->a()I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    :goto_9
    if-eqz v2, :cond_f

    .line 499
    .line 500
    invoke-virtual {v2, v11, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    :cond_f
    invoke-direct {v1, v0, v3, p1}, Lgb/n;-><init>(Luf/c;II)V

    .line 505
    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_10
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    if-eqz v5, :cond_11

    .line 513
    .line 514
    invoke-static {v5}, Lgb/q;->c(Lorg/json/JSONObject;)Lgb/o;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    invoke-virtual {v3, v5}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 519
    .line 520
    .line 521
    :cond_11
    add-int/lit8 v1, v1, 0x1

    .line 522
    .line 523
    goto :goto_8

    .line 524
    :goto_a
    new-instance v1, Lsf/f;

    .line 525
    .line 526
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 527
    .line 528
    .line 529
    :goto_b
    new-instance p1, Lsf/g;

    .line 530
    .line 531
    invoke-direct {p1, v1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object p1

    .line 535
    :pswitch_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast p1, Ljava/lang/String;

    .line 541
    .line 542
    iget-object v0, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, Ljava/lang/String;

    .line 545
    .line 546
    iget-object v4, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v4, Ljava/lang/String;

    .line 549
    .line 550
    sget-object v5, Lwb/ho;->a:Log/k;

    .line 551
    .line 552
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 553
    .line 554
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 555
    .line 556
    .line 557
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-nez v6, :cond_12

    .line 562
    .line 563
    invoke-virtual {v5, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    :cond_12
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-nez v0, :cond_13

    .line 571
    .line 572
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    :cond_13
    invoke-static {p1, v1}, Lwb/ho;->V4(Ljava/lang/String;Z)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    if-eqz v0, :cond_15

    .line 580
    .line 581
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_14

    .line 586
    .line 587
    goto :goto_c

    .line 588
    :cond_14
    invoke-virtual {v5, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    :cond_15
    :goto_c
    invoke-static {p1, v2}, Lwb/ho;->V4(Ljava/lang/String;Z)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    if-eqz p1, :cond_17

    .line 596
    .line 597
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_16

    .line 602
    .line 603
    goto :goto_d

    .line 604
    :cond_16
    invoke-virtual {v5, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    :cond_17
    :goto_d
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 608
    .line 609
    .line 610
    move-result-object v6

    .line 611
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 612
    .line 613
    .line 614
    move-result p1

    .line 615
    if-eqz p1, :cond_18

    .line 616
    .line 617
    goto/16 :goto_12

    .line 618
    .line 619
    :cond_18
    const-string v7, "|"

    .line 620
    .line 621
    const/4 v10, 0x0

    .line 622
    const/16 v11, 0x3e

    .line 623
    .line 624
    const/4 v8, 0x0

    .line 625
    const/4 v9, 0x0

    .line 626
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object p1

    .line 630
    sget-object v2, Lwb/b0;->a:Lwb/b0;

    .line 631
    .line 632
    monitor-enter v2

    .line 633
    :try_start_4
    sget-object v0, Lwb/b0;->b:Ljava/util/LinkedHashMap;

    .line 634
    .line 635
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    if-eqz v4, :cond_19

    .line 640
    .line 641
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 642
    .line 643
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    new-instance v5, Lsf/e;

    .line 648
    .line 649
    invoke-direct {v5, v4, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    goto :goto_e

    .line 653
    :catchall_4
    move-exception v0

    .line 654
    move-object p1, v0

    .line 655
    goto/16 :goto_13

    .line 656
    .line 657
    :cond_19
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 658
    .line 659
    new-instance v5, Lsf/e;

    .line 660
    .line 661
    invoke-direct {v5, v0, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 662
    .line 663
    .line 664
    :goto_e
    monitor-exit v2

    .line 665
    iget-object v0, v5, Lsf/e;->g:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Ljava/lang/Boolean;

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-eqz v0, :cond_1a

    .line 674
    .line 675
    iget-object p1, v5, Lsf/e;->h:Ljava/lang/Object;

    .line 676
    .line 677
    move-object v3, p1

    .line 678
    check-cast v3, Lf1/g;

    .line 679
    .line 680
    goto/16 :goto_12

    .line 681
    .line 682
    :cond_1a
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    move-object v0, v3

    .line 687
    :cond_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v4

    .line 691
    if-eqz v4, :cond_20

    .line 692
    .line 693
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    check-cast v0, Ljava/lang/String;

    .line 698
    .line 699
    :try_start_5
    const-string v4, "http://"

    .line 700
    .line 701
    invoke-static {v0, v4, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    if-nez v4, :cond_1d

    .line 706
    .line 707
    const-string v4, "https://"

    .line 708
    .line 709
    invoke-static {v0, v4, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    if-eqz v4, :cond_1c

    .line 714
    .line 715
    goto :goto_f

    .line 716
    :cond_1c
    new-instance v4, Ljava/io/File;

    .line 717
    .line 718
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 722
    .line 723
    .line 724
    move-result v0

    .line 725
    if-eqz v0, :cond_1e

    .line 726
    .line 727
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    goto :goto_10

    .line 736
    :cond_1d
    :goto_f
    new-instance v4, Ljava/net/URL;

    .line 737
    .line 738
    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    const/16 v4, 0xbb8

    .line 746
    .line 747
    invoke-virtual {v0, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 754
    .line 755
    .line 756
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 757
    :try_start_6
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 758
    .line 759
    .line 760
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 761
    :try_start_7
    invoke-static {v4, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 762
    .line 763
    .line 764
    goto :goto_10

    .line 765
    :catchall_5
    move-exception v0

    .line 766
    move-object v5, v0

    .line 767
    :try_start_8
    throw v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 768
    :catchall_6
    move-exception v0

    .line 769
    :try_start_9
    invoke-static {v4, v5}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 770
    .line 771
    .line 772
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 773
    :catchall_7
    :cond_1e
    move-object v0, v3

    .line 774
    :goto_10
    if-eqz v0, :cond_1f

    .line 775
    .line 776
    new-instance v4, Lf1/g;

    .line 777
    .line 778
    invoke-direct {v4, v0}, Lf1/g;-><init>(Landroid/graphics/Bitmap;)V

    .line 779
    .line 780
    .line 781
    move-object v0, v4

    .line 782
    goto :goto_11

    .line 783
    :cond_1f
    move-object v0, v3

    .line 784
    :goto_11
    if-eqz v0, :cond_1b

    .line 785
    .line 786
    :cond_20
    if-eqz v0, :cond_21

    .line 787
    .line 788
    sget-object v1, Lwb/b0;->a:Lwb/b0;

    .line 789
    .line 790
    monitor-enter v1

    .line 791
    :try_start_a
    sget-object v2, Lwb/b0;->b:Ljava/util/LinkedHashMap;

    .line 792
    .line 793
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 794
    .line 795
    .line 796
    monitor-exit v1

    .line 797
    move-object v3, v0

    .line 798
    goto :goto_12

    .line 799
    :catchall_8
    move-exception v0

    .line 800
    move-object p1, v0

    .line 801
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 802
    throw p1

    .line 803
    :cond_21
    :goto_12
    return-object v3

    .line 804
    :goto_13
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 805
    throw p1

    .line 806
    :pswitch_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast p1, Li0/a1;

    .line 812
    .line 813
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 814
    .line 815
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    check-cast v0, Lwb/k5;

    .line 820
    .line 821
    sget-object v1, Lwb/k5;->l:Lwb/k5;

    .line 822
    .line 823
    if-eq v0, v1, :cond_22

    .line 824
    .line 825
    iget-object v0, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Li0/a1;

    .line 828
    .line 829
    invoke-interface {v0, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    :cond_22
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    check-cast v0, Lwb/k5;

    .line 837
    .line 838
    sget-object v1, Lwb/k5;->k:Lwb/k5;

    .line 839
    .line 840
    if-ne v0, v1, :cond_23

    .line 841
    .line 842
    sget-object v0, Lwb/k5;->m:Lwb/k5;

    .line 843
    .line 844
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    :cond_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 848
    .line 849
    return-object p1

    .line 850
    :pswitch_6
    iget-object v0, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v0, Lqg/t;

    .line 853
    .line 854
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast p1, Li0/a1;

    .line 860
    .line 861
    iget-object v0, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, Li0/a1;

    .line 864
    .line 865
    :try_start_d
    sget-object v1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 866
    .line 867
    sget-object v1, Lwb/ho;->a:Log/k;

    .line 868
    .line 869
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    check-cast p1, Ljava/lang/String;

    .line 874
    .line 875
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    check-cast v0, Ljava/lang/String;

    .line 880
    .line 881
    invoke-static {p1, v0}, Lx8/x;->f(Ljava/lang/String;Ljava/lang/String;)Lx8/y;

    .line 882
    .line 883
    .line 884
    move-result-object p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 885
    goto :goto_14

    .line 886
    :catchall_9
    move-exception v0

    .line 887
    move-object p1, v0

    .line 888
    new-instance v0, Lsf/f;

    .line 889
    .line 890
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 891
    .line 892
    .line 893
    move-object p1, v0

    .line 894
    :goto_14
    new-instance v0, Lsf/g;

    .line 895
    .line 896
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    return-object v0

    .line 900
    :pswitch_7
    iget-object v0, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v0, Lqg/t;

    .line 903
    .line 904
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    iget-object p1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast p1, Ljava/util/List;

    .line 910
    .line 911
    iget-object v0, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v0, Lc9/a;

    .line 914
    .line 915
    :try_start_e
    sget-object v1, Lwb/h2;->a:Lwb/h2;

    .line 916
    .line 917
    iget-object v0, v0, Lc9/a;->a:Ljava/lang/String;

    .line 918
    .line 919
    invoke-static {v0, p1}, Lwb/h2;->f(Ljava/lang/String;Ljava/util/List;)Lwb/f2;

    .line 920
    .line 921
    .line 922
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 923
    goto :goto_15

    .line 924
    :catchall_a
    move-exception v0

    .line 925
    move-object p1, v0

    .line 926
    new-instance v0, Lsf/f;

    .line 927
    .line 928
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 929
    .line 930
    .line 931
    move-object p1, v0

    .line 932
    :goto_15
    new-instance v0, Lsf/g;

    .line 933
    .line 934
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    return-object v0

    .line 938
    :pswitch_8
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    iget-object p1, p0, Lw/u0;->i:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast p1, Lqg/t;

    .line 944
    .line 945
    new-instance v0, Lw/d0;

    .line 946
    .line 947
    iget-object v1, p0, Lw/u0;->j:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v1, Ls1/x;

    .line 950
    .line 951
    iget-object v4, p0, Lw/u0;->k:Ljava/lang/Object;

    .line 952
    .line 953
    check-cast v4, Lw/y0;

    .line 954
    .line 955
    invoke-direct {v0, v1, v4, v3, v2}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 956
    .line 957
    .line 958
    invoke-static {p1, v3, v0, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 959
    .line 960
    .line 961
    new-instance v0, Lw/d0;

    .line 962
    .line 963
    const/4 v5, 0x2

    .line 964
    invoke-direct {v0, v1, v4, v3, v5}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 965
    .line 966
    .line 967
    invoke-static {p1, v3, v0, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 968
    .line 969
    .line 970
    move-result-object p1

    .line 971
    return-object p1

    .line 972
    nop

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
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
