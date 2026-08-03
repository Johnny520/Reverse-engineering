.class public final Lr4/g0;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Lv4/x;


# direct methods
.method public constructor <init>(Lv4/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr4/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/g0;->h:Lv4/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lr4/p;->n:Lr4/h0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/g0;->h:Lv4/x;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lr4/h0;->q(Lv4/x;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->r:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lr4/g0;->i(Lr4/p;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr4/g0;->h:Lv4/x;

    .line 6
    .line 7
    iget v2, v1, Lv4/x;->g:I

    .line 8
    .line 9
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lr4/z;->f()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lv4/x;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p2, v4, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v5, " // "

    .line 50
    .line 51
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object v6, Lv4/x;->i:[Ljava/lang/String;

    .line 55
    .line 56
    aget-object v6, v6, v2

    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v6, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v7, "type:     "

    .line 68
    .line 69
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v6, 0x2

    .line 87
    invoke-virtual {p2, v6, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v4}, La/a;->X0(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v7, "reserved: "

    .line 95
    .line 96
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {p2, v6, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v3, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v5, v1, Lv4/x;->h:Lv4/a;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget v1, v1, Lv4/x;->g:I

    .line 122
    .line 123
    invoke-static {v1}, Lv4/x;->k(I)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_0

    .line 128
    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v5, "fieldId:  "

    .line 132
    .line 133
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p2, v6, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v5, "methodId: "

    .line 157
    .line 158
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p2, v6, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_0
    invoke-static {v4}, La/a;->X0(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p2, v6, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_1
    invoke-virtual {p2, v2}, Lz4/d;->l(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v4}, Lz4/d;->l(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, p1}, Lr4/g0;->i(Lr4/p;)I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-virtual {p2, p1}, Lz4/d;->l(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v4}, Lz4/d;->l(I)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final i(Lr4/p;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/g0;->h:Lv4/x;

    .line 2
    .line 3
    iget-object v1, v0, Lv4/x;->h:Lv4/a;

    .line 4
    .line 5
    iget v2, v0, Lv4/x;->g:I

    .line 6
    .line 7
    invoke-static {v2}, Lv4/x;->k(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lr4/p;->i:Lr4/w;

    .line 14
    .line 15
    check-cast v1, Lv4/m;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lr4/w;->l(Lv4/m;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    iget v0, v0, Lv4/x;->g:I

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    const-string p1, "Unhandled invocation type"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :pswitch_0
    instance-of v0, v1, Lv4/p;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    check-cast v1, Lv4/p;

    .line 39
    .line 40
    invoke-virtual {v1}, Lv4/p;->l()Lv4/y;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    iget-object p1, p1, Lr4/p;->j:Lr4/j0;

    .line 45
    .line 46
    check-cast v1, Lv4/e;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Lr4/j0;->l(Lv4/e;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
