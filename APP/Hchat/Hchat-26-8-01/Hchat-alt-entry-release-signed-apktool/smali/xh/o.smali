.class public final synthetic Lxh/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lsh/d0;

.field public final synthetic h:F

.field public final synthetic i:Lsh/y;

.field public final synthetic j:Lsh/g0;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/d0;FLsh/y;Lsh/g0;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/o;->g:Lsh/d0;

    .line 5
    .line 6
    iput p2, p0, Lxh/o;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lxh/o;->i:Lsh/y;

    .line 9
    .line 10
    iput-object p4, p0, Lxh/o;->j:Lsh/g0;

    .line 11
    .line 12
    iput-object p5, p0, Lxh/o;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lxh/o;->l:Li0/a1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lv1/p0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lv1/m0;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Lu2/a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v4, v0, Lxh/o;->g:Lsh/d0;

    .line 22
    .line 23
    iget-object v7, v4, Lsh/d0;->a:Lu2/k;

    .line 24
    .line 25
    iget-object v11, v4, Lsh/d0;->b:Lu2/k;

    .line 26
    .line 27
    invoke-virtual {v7}, Lu2/k;->a()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget v5, v11, Lu2/k;->b:I

    .line 32
    .line 33
    sub-int/2addr v4, v5

    .line 34
    iget v5, v11, Lu2/k;->d:I

    .line 35
    .line 36
    sub-int/2addr v4, v5

    .line 37
    const/16 v5, 0x32

    .line 38
    .line 39
    int-to-float v6, v5

    .line 40
    invoke-interface {v1, v6}, Lu2/c;->G0(F)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-ge v4, v6, :cond_0

    .line 45
    .line 46
    move v4, v6

    .line 47
    :cond_0
    int-to-float v5, v5

    .line 48
    invoke-interface {v1, v5}, Lu2/c;->G0(F)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-wide v13, v3, Lu2/a;->a:J

    .line 53
    .line 54
    invoke-static {v13, v14}, Lu2/a;->g(J)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-gt v6, v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v1, v5}, Lu2/c;->G0(F)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v13, v14}, Lu2/a;->g(J)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_0
    invoke-static {v13, v14}, Lu2/a;->h(J)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    iget v6, v0, Lxh/o;->h:F

    .line 74
    .line 75
    invoke-interface {v1, v6}, Lu2/c;->G0(F)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-static {v13, v14}, Lu2/a;->h(J)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-le v6, v8, :cond_2

    .line 84
    .line 85
    move v6, v8

    .line 86
    :cond_2
    if-lt v5, v6, :cond_3

    .line 87
    .line 88
    if-lt v4, v3, :cond_3

    .line 89
    .line 90
    if-ltz v6, :cond_3

    .line 91
    .line 92
    if-ltz v3, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const-string v8, "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"

    .line 96
    .line 97
    invoke-static {v8}, Lu2/i;->a(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-static {v6, v5, v3, v4}, Lu2/b;->h(IIII)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-interface {v2, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget v3, v2, Lv1/b1;->g:I

    .line 109
    .line 110
    iget v4, v2, Lv1/b1;->h:I

    .line 111
    .line 112
    int-to-long v5, v3

    .line 113
    const/16 v3, 0x20

    .line 114
    .line 115
    shl-long/2addr v5, v3

    .line 116
    int-to-long v8, v4

    .line 117
    const-wide v15, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long/2addr v8, v15

    .line 123
    or-long v9, v5, v8

    .line 124
    .line 125
    iget-object v4, v0, Lxh/o;->k:Li0/a1;

    .line 126
    .line 127
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    move-object v6, v4

    .line 132
    check-cast v6, Lu2/k;

    .line 133
    .line 134
    invoke-interface {v1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    iget-object v5, v0, Lxh/o;->i:Lsh/y;

    .line 139
    .line 140
    iget-object v12, v0, Lxh/o;->j:Lsh/g0;

    .line 141
    .line 142
    invoke-virtual/range {v5 .. v12}, Lsh/y;->a(Lu2/k;Lu2/k;Lu2/m;JLu2/k;Lsh/g0;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    shr-long v6, v4, v3

    .line 147
    .line 148
    long-to-int v6, v6

    .line 149
    iget-object v7, v0, Lxh/o;->l:Li0/a1;

    .line 150
    .line 151
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    check-cast v8, Le1/b;

    .line 156
    .line 157
    iget-wide v8, v8, Le1/b;->a:J

    .line 158
    .line 159
    shr-long/2addr v8, v3

    .line 160
    long-to-int v8, v8

    .line 161
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    float-to-int v8, v8

    .line 166
    sub-int/2addr v6, v8

    .line 167
    and-long/2addr v4, v15

    .line 168
    long-to-int v4, v4

    .line 169
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Le1/b;

    .line 174
    .line 175
    iget-wide v7, v5, Le1/b;->a:J

    .line 176
    .line 177
    and-long/2addr v7, v15

    .line 178
    long-to-int v5, v7

    .line 179
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    float-to-int v5, v5

    .line 184
    sub-int/2addr v4, v5

    .line 185
    int-to-long v5, v6

    .line 186
    shl-long/2addr v5, v3

    .line 187
    int-to-long v3, v4

    .line 188
    and-long/2addr v3, v15

    .line 189
    or-long/2addr v3, v5

    .line 190
    invoke-static {v13, v14}, Lu2/a;->h(J)I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-static {v13, v14}, Lu2/a;->g(J)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    new-instance v7, Leb/s0;

    .line 199
    .line 200
    const/4 v8, 0x4

    .line 201
    invoke-direct {v7, v2, v3, v4, v8}, Leb/s0;-><init>(Ljava/lang/Object;JI)V

    .line 202
    .line 203
    .line 204
    sget-object v2, Ltf/u;->g:Ltf/u;

    .line 205
    .line 206
    invoke-interface {v1, v5, v6, v2, v7}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    return-object v1
.end method
