.class public final Li/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/y;


# instance fields
.field public final a:Li/i0;


# direct methods
.method public constructor <init>(Li/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/j0;->a:Li/i0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Li/m1;)Li/n1;
    .locals 19

    .line 1
    new-instance v0, Lf/v;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Li/j0;->a:Li/i0;

    .line 6
    .line 7
    iget-object v2, v2, Li/i0;->a:Lf/w;

    .line 8
    .line 9
    iget v3, v2, Lf/k;->e:I

    .line 10
    .line 11
    add-int/lit8 v3, v3, 0x2

    .line 12
    .line 13
    invoke-direct {v0, v3}, Lf/v;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lf/w;

    .line 17
    .line 18
    iget v4, v2, Lf/k;->e:I

    .line 19
    .line 20
    invoke-direct {v3, v4}, Lf/w;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v4, v2, Lf/k;->b:[I

    .line 24
    .line 25
    iget-object v5, v2, Lf/k;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v6, v2, Lf/k;->a:[J

    .line 28
    .line 29
    array-length v7, v6

    .line 30
    add-int/lit8 v7, v7, -0x2

    .line 31
    .line 32
    if-ltz v7, :cond_2

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    :goto_0
    aget-wide v10, v6, v9

    .line 36
    .line 37
    not-long v12, v10

    .line 38
    const/4 v14, 0x7

    .line 39
    shl-long/2addr v12, v14

    .line 40
    and-long/2addr v12, v10

    .line 41
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v12, v14

    .line 47
    cmp-long v12, v12, v14

    .line 48
    .line 49
    if-eqz v12, :cond_3

    .line 50
    .line 51
    sub-int v12, v9, v7

    .line 52
    .line 53
    not-int v12, v12

    .line 54
    ushr-int/lit8 v12, v12, 0x1f

    .line 55
    .line 56
    const/16 v13, 0x8

    .line 57
    .line 58
    rsub-int/lit8 v12, v12, 0x8

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    :goto_1
    if-ge v14, v12, :cond_1

    .line 62
    .line 63
    const-wide/16 v15, 0xff

    .line 64
    .line 65
    and-long/2addr v15, v10

    .line 66
    const-wide/16 v17, 0x80

    .line 67
    .line 68
    cmp-long v15, v15, v17

    .line 69
    .line 70
    if-gez v15, :cond_0

    .line 71
    .line 72
    shl-int/lit8 v15, v9, 0x3

    .line 73
    .line 74
    add-int/2addr v15, v14

    .line 75
    aget v8, v4, v15

    .line 76
    .line 77
    aget-object v15, v5, v15

    .line 78
    .line 79
    check-cast v15, Li/h0;

    .line 80
    .line 81
    invoke-virtual {v0, v8}, Lf/v;->a(I)V

    .line 82
    .line 83
    .line 84
    move/from16 v17, v13

    .line 85
    .line 86
    new-instance v13, Li/s1;

    .line 87
    .line 88
    move-object/from16 v1, p1

    .line 89
    .line 90
    move-object/from16 v18, v4

    .line 91
    .line 92
    iget-object v4, v1, Li/m1;->a:Lfg/l;

    .line 93
    .line 94
    iget-object v1, v15, Li/h0;->a:Ljava/lang/Float;

    .line 95
    .line 96
    invoke-interface {v4, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Li/q;

    .line 101
    .line 102
    iget-object v4, v15, Li/h0;->b:Li/v;

    .line 103
    .line 104
    invoke-direct {v13, v1, v4}, Li/s1;-><init>(Li/q;Li/v;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v8, v13}, Lf/w;->h(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_0
    move-object/from16 v18, v4

    .line 112
    .line 113
    move/from16 v17, v13

    .line 114
    .line 115
    :goto_2
    shr-long v10, v10, v17

    .line 116
    .line 117
    add-int/lit8 v14, v14, 0x1

    .line 118
    .line 119
    move-object/from16 v1, p0

    .line 120
    .line 121
    move/from16 v13, v17

    .line 122
    .line 123
    move-object/from16 v4, v18

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    move-object/from16 v18, v4

    .line 127
    .line 128
    move v1, v13

    .line 129
    if-ne v12, v1, :cond_2

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_2
    const/4 v1, 0x0

    .line 133
    goto :goto_4

    .line 134
    :cond_3
    move-object/from16 v18, v4

    .line 135
    .line 136
    :goto_3
    if-eq v9, v7, :cond_2

    .line 137
    .line 138
    add-int/lit8 v9, v9, 0x1

    .line 139
    .line 140
    move-object/from16 v1, p0

    .line 141
    .line 142
    move-object/from16 v4, v18

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :goto_4
    invoke-virtual {v2, v1}, Lf/k;->a(I)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_6

    .line 150
    .line 151
    iget v4, v0, Lf/v;->b:I

    .line 152
    .line 153
    if-ltz v4, :cond_5

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    add-int/2addr v4, v5

    .line 157
    invoke-virtual {v0, v4}, Lf/v;->b(I)V

    .line 158
    .line 159
    .line 160
    iget-object v4, v0, Lf/v;->a:[I

    .line 161
    .line 162
    iget v6, v0, Lf/v;->b:I

    .line 163
    .line 164
    if-eqz v6, :cond_4

    .line 165
    .line 166
    invoke-static {v4, v4, v5, v1, v6}, Ltf/l;->p0([I[IIII)V

    .line 167
    .line 168
    .line 169
    :cond_4
    aput v1, v4, v1

    .line 170
    .line 171
    iget v1, v0, Lf/v;->b:I

    .line 172
    .line 173
    add-int/2addr v1, v5

    .line 174
    iput v1, v0, Lf/v;->b:I

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 178
    .line 179
    invoke-static {v0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    goto :goto_7

    .line 184
    :cond_6
    :goto_5
    const/16 v1, 0x12c

    .line 185
    .line 186
    invoke-virtual {v2, v1}, Lf/k;->a(I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_7

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lf/v;->a(I)V

    .line 193
    .line 194
    .line 195
    :cond_7
    iget v1, v0, Lf/v;->b:I

    .line 196
    .line 197
    if-nez v1, :cond_8

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_8
    iget-object v2, v0, Lf/v;->a:[I

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    invoke-static {v2, v4, v1}, Ljava/util/Arrays;->sort([III)V

    .line 207
    .line 208
    .line 209
    :goto_6
    new-instance v1, Li/t1;

    .line 210
    .line 211
    sget-object v2, Li/x;->b:Lg1/d;

    .line 212
    .line 213
    invoke-direct {v1, v0, v3, v2}, Li/t1;-><init>(Lf/v;Lf/w;Li/v;)V

    .line 214
    .line 215
    .line 216
    move-object v0, v1

    .line 217
    :goto_7
    return-object v0
.end method
