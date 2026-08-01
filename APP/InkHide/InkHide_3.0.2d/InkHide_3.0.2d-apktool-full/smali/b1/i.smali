.class public final Lb1/i;
.super LN0/h;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic b:Lb1/j;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lb1/j;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb1/i;->a:Lorg/luckypray/dexkit/DexKitBridge;

    .line 5
    .line 6
    iput-object p2, p0, Lb1/i;->b:Lb1/j;

    .line 7
    .line 8
    iput p3, p0, Lb1/i;->c:I

    .line 9
    .line 10
    iput p4, p0, Lb1/i;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb1/i;->b:Lb1/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, Lb1/i;->c:I

    .line 9
    .line 10
    iget v2, v0, Lb1/i;->d:I

    .line 11
    .line 12
    invoke-static {v1, v2}, LJ/b;->a(II)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-object v3, v0, Lb1/i;->a:Lorg/luckypray/dexkit/DexKitBridge;

    .line 17
    .line 18
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    invoke-static {v4, v5, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->c(JJ)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "wrap(res)"

    .line 31
    .line 32
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, LS/a;->a()LS/a;

    .line 36
    .line 37
    .line 38
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 39
    .line 40
    invoke-static {v1, v2}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/2addr v4, v2

    .line 49
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    sub-int v2, v4, v2

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x4

    .line 65
    if-ge v8, v5, :cond_0

    .line 66
    .line 67
    add-int/lit8 v9, v2, 0x4

    .line 68
    .line 69
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 v9, 0x0

    .line 75
    :goto_0
    if-eqz v9, :cond_1

    .line 76
    .line 77
    add-int/2addr v9, v4

    .line 78
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    add-int/2addr v10, v9

    .line 83
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const/4 v9, 0x0

    .line 89
    :goto_1
    const/4 v10, 0x0

    .line 90
    :goto_2
    if-ge v10, v9, :cond_9

    .line 91
    .line 92
    new-instance v11, Ld1/a;

    .line 93
    .line 94
    invoke-direct {v11}, Ld1/a;-><init>()V

    .line 95
    .line 96
    .line 97
    if-ge v8, v5, :cond_2

    .line 98
    .line 99
    add-int/lit8 v12, v2, 0x4

    .line 100
    .line 101
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    goto :goto_3

    .line 106
    :cond_2
    const/4 v12, 0x0

    .line 107
    :goto_3
    const/4 v13, 0x0

    .line 108
    if-eqz v12, :cond_3

    .line 109
    .line 110
    add-int/2addr v12, v4

    .line 111
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    add-int/2addr v14, v12

    .line 116
    add-int/2addr v14, v8

    .line 117
    mul-int/lit8 v12, v10, 0x4

    .line 118
    .line 119
    add-int/2addr v12, v14

    .line 120
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    add-int/2addr v14, v12

    .line 125
    invoke-virtual {v11, v14, v1}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_3
    move-object v11, v13

    .line 130
    :goto_4
    invoke-static {v11}, LN0/g;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    new-instance v12, Ld1/a;

    .line 134
    .line 135
    invoke-direct {v12}, Ld1/a;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v8}, Ld1/a;->b(I)I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    if-eqz v14, :cond_4

    .line 143
    .line 144
    iget v13, v11, Ld1/a;->a:I

    .line 145
    .line 146
    add-int/2addr v14, v13

    .line 147
    invoke-virtual {v11, v14}, Ld1/a;->a(I)I

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    iget-object v14, v11, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    const-string v15, "bb"

    .line 154
    .line 155
    invoke-static {v14, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v13, v14}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 159
    .line 160
    .line 161
    move-object v13, v12

    .line 162
    :cond_4
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v3, v13}, LD/h;->n(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/f;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    const/4 v13, 0x6

    .line 170
    invoke-virtual {v11, v13}, Ld1/a;->b(I)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    if-eqz v14, :cond_5

    .line 175
    .line 176
    iget-object v15, v11, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 177
    .line 178
    iget v7, v11, Ld1/a;->a:I

    .line 179
    .line 180
    add-int/2addr v14, v7

    .line 181
    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    goto :goto_5

    .line 186
    :cond_5
    const/4 v7, 0x0

    .line 187
    :goto_5
    const/4 v14, 0x1

    .line 188
    if-ne v7, v14, :cond_6

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_6
    const/4 v14, 0x2

    .line 192
    if-ne v7, v14, :cond_7

    .line 193
    .line 194
    :goto_6
    new-instance v7, Lb1/l;

    .line 195
    .line 196
    invoke-direct {v7, v12, v14}, Lb1/l;-><init>(Lb1/f;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    add-int/lit8 v10, v10, 0x1

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    invoke-virtual {v11, v13}, Ld1/a;->b(I)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    iget-object v3, v11, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 214
    .line 215
    iget v4, v11, Ld1/a;->a:I

    .line 216
    .line 217
    add-int/2addr v2, v4

    .line 218
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    goto :goto_7

    .line 223
    :cond_8
    const/4 v7, 0x0

    .line 224
    :goto_7
    const-string v2, "Unknown using type: "

    .line 225
    .line 226
    invoke-static {v7, v2}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v1

    .line 234
    :cond_9
    return-object v6
.end method
