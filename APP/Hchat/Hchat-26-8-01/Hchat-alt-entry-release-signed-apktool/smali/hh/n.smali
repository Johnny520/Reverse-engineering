.class public final Lhh/n;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic i:Lhh/o;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/o;II)V
    .locals 0

    .line 1
    iput p4, p0, Lhh/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhh/n;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Lhh/n;->i:Lhh/o;

    .line 6
    .line 7
    iput p3, p0, Lhh/n;->j:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lhh/n;->g:I

    .line 2
    .line 3
    iget v1, p0, Lhh/n;->j:I

    .line 4
    .line 5
    iget-object v2, p0, Lhh/n;->i:Lhh/o;

    .line 6
    .line 7
    iget-object v3, p0, Lhh/n;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, v2, Lhh/o;->k:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lf1/n0;->k(II)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-array v2, v5, [J

    .line 21
    .line 22
    aput-wide v0, v2, v4

    .line 23
    .line 24
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 25
    .line 26
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v0, v5, v6, v2}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljh/a;

    .line 42
    .line 43
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v5, v2

    .line 57
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lhh/j;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_0
    if-ge v4, v2, :cond_0

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v0}, Lhh/e;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lhh/i;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    iget-object v0, v2, Lhh/o;->l:Ljava/util/ArrayList;

    .line 96
    .line 97
    new-instance v2, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_1

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-static {v1, v5}, Lf1/n0;->k(II)J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-static {v2}, Ltf/m;->Q1(Ljava/util/ArrayList;)[J

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 143
    .line 144
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v5

    .line 148
    invoke-static {v1, v5, v6, v0}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance v1, Ljh/a;

    .line 160
    .line 161
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 162
    .line 163
    .line 164
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 165
    .line 166
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    add-int/2addr v5, v2

    .line 175
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lhh/j;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    :goto_2
    if-ge v4, v2, :cond_2

    .line 188
    .line 189
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-static {v3, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    add-int/lit8 v4, v4, 0x1

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_2
    return-object v0

    .line 207
    :pswitch_1
    iget v0, v2, Lhh/o;->h:I

    .line 208
    .line 209
    invoke-static {v1, v0}, Lf1/n0;->k(II)J

    .line 210
    .line 211
    .line 212
    move-result-wide v0

    .line 213
    new-array v2, v5, [J

    .line 214
    .line 215
    aput-wide v0, v2, v4

    .line 216
    .line 217
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 218
    .line 219
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v5

    .line 223
    invoke-static {v0, v5, v6, v2}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance v1, Ljh/a;

    .line 235
    .line 236
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 237
    .line 238
    .line 239
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 240
    .line 241
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    add-int/2addr v5, v2

    .line 250
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, Lhh/j;

    .line 254
    .line 255
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    :goto_3
    if-ge v4, v2, :cond_3

    .line 263
    .line 264
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    add-int/lit8 v4, v4, 0x1

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_3
    invoke-virtual {v0}, Lhh/e;->a()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, Lhh/i;

    .line 286
    .line 287
    return-object v0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
