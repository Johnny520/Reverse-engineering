.class public final Lcom/android/dx/cf/cst/ConstantPoolParser;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private endOffset:I

.field private observer:Lcom/android/dx/cf/iface/ParseObserver;

.field private final offsets:[I

.field private final pool:Lcom/android/dx/rop/cst/StdConstantPool;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-object p1, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 11
    .line 12
    new-instance p1, Lcom/android/dx/rop/cst/StdConstantPool;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lcom/android/dx/rop/cst/StdConstantPool;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 18
    .line 19
    new-array p1, v0, [I

    .line 20
    .line 21
    iput-object p1, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    iput p1, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 25
    .line 26
    return-void
.end method

.method private determineOffsets()V
    .locals 5

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    if-ge v2, v4, :cond_0

    .line 9
    .line 10
    aput v0, v3, v2

    .line 11
    .line 12
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 13
    .line 14
    invoke-virtual {v3, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    packed-switch v3, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    :pswitch_0
    :try_start_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "unknown tag byte: "

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {p0, v1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_3

    .line 50
    :pswitch_1
    add-int/lit8 v0, v0, 0x5

    .line 51
    .line 52
    :goto_1
    move v3, v1

    .line 53
    goto :goto_2

    .line 54
    :pswitch_2
    add-int/lit8 v0, v0, 0x3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_3
    add-int/lit8 v0, v0, 0x4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_4
    add-int/lit8 v0, v0, 0x9

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    goto :goto_2

    .line 64
    :pswitch_5
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 65
    .line 66
    add-int/lit8 v4, v0, 0x1

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 69
    .line 70
    .line 71
    move-result v3
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    add-int/lit8 v3, v3, 0x3

    .line 73
    .line 74
    add-int/2addr v3, v0

    .line 75
    move v0, v3

    .line 76
    goto :goto_1

    .line 77
    :goto_2
    add-int/2addr v2, v3

    .line 78
    goto :goto_0

    .line 79
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v3, "...while preparsing cst "

    .line 82
    .line 83
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, " at offset "

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_0
    iput v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static getMethodHandleTypeForKind(I)I
    .locals 1

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string v0, "invalid kind: "

    .line 5
    .line 6
    invoke-static {p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :pswitch_0
    const/16 p0, 0x8

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_1
    const/4 p0, 0x6

    .line 19
    return p0

    .line 20
    :pswitch_2
    const/4 p0, 0x7

    .line 21
    return p0

    .line 22
    :pswitch_3
    const/4 p0, 0x4

    .line 23
    return p0

    .line 24
    :pswitch_4
    const/4 p0, 0x5

    .line 25
    return p0

    .line 26
    :pswitch_5
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :pswitch_6
    const/4 p0, 0x2

    .line 29
    return p0

    .line 30
    :pswitch_7
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :pswitch_8
    const/4 p0, 0x3

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
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

.method private parse()V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->determineOffsets()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 11
    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v5, "constant_pool_count: "

    .line 15
    .line 16
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 20
    .line 21
    array-length v5, v5

    .line 22
    invoke-static {v4, v5}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-interface {v0, v3, v5, v6, v4}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 35
    .line 36
    const/16 v4, 0xa

    .line 37
    .line 38
    const-string v5, "\nconstant_pool:"

    .line 39
    .line 40
    invoke-interface {v0, v3, v4, v1, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 44
    .line 45
    invoke-interface {v0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    new-instance v0, Ljava/util/BitSet;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 51
    .line 52
    array-length v3, v3

    .line 53
    invoke-direct {v0, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 54
    .line 55
    .line 56
    move v3, v2

    .line 57
    :goto_0
    iget-object v4, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 58
    .line 59
    array-length v5, v4

    .line 60
    if-ge v3, v5, :cond_2

    .line 61
    .line 62
    aget v4, v4, v3

    .line 63
    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    iget-object v4, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Lcom/android/dx/rop/cst/StdConstantPool;->getOrNull(I)Lcom/android/dx/rop/cst/Constant;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    invoke-direct {p0, v3, v0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 75
    .line 76
    .line 77
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 81
    .line 82
    if-eqz v3, :cond_8

    .line 83
    .line 84
    :goto_1
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 85
    .line 86
    array-length v3, v3

    .line 87
    if-ge v2, v3, :cond_7

    .line 88
    .line 89
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Lcom/android/dx/rop/cst/StdConstantPool;->getOrNull(I)Lcom/android/dx/rop/cst/Constant;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-nez v3, :cond_3

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_3
    iget-object v4, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 99
    .line 100
    aget v4, v4, v2

    .line 101
    .line 102
    iget v5, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 103
    .line 104
    add-int/lit8 v6, v2, 0x1

    .line 105
    .line 106
    :goto_2
    iget-object v7, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 107
    .line 108
    array-length v8, v7

    .line 109
    if-ge v6, v8, :cond_5

    .line 110
    .line 111
    aget v7, v7, v6

    .line 112
    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    move v5, v7

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    :goto_3
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->get(I)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    new-instance v6, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v7, ": utf8{\""

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-interface {v3}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v3, "\"}"

    .line 151
    .line 152
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    goto :goto_4

    .line 160
    :cond_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v7, ": "

    .line 173
    .line 174
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    :goto_4
    iget-object v6, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 189
    .line 190
    iget-object v7, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 191
    .line 192
    sub-int/2addr v5, v4

    .line 193
    invoke-interface {v6, v7, v4, v5, v3}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_7
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 200
    .line 201
    const/4 v2, -0x1

    .line 202
    invoke-interface {v0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 206
    .line 207
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 208
    .line 209
    iget p0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 210
    .line 211
    const-string v3, "end constant_pool"

    .line 212
    .line 213
    invoke-interface {v0, v2, p0, v1, v3}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_8
    return-void
.end method

.method private parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;
    .locals 8

    .line 1
    const-string v0, " at offset "

    .line 2
    .line 3
    const-string v1, "...while parsing cst "

    .line 4
    .line 5
    const-string v2, "Unsupported ref constant type for MethodHandle "

    .line 6
    .line 7
    const-string v3, "Unsupported MethodHandle kind: "

    .line 8
    .line 9
    const-string v4, "unknown tag byte: "

    .line 10
    .line 11
    iget-object v5, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 12
    .line 13
    invoke-virtual {v5, p1}, Lcom/android/dx/rop/cst/StdConstantPool;->getOrNull(I)Lcom/android/dx/rop/cst/Constant;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    return-object v5

    .line 20
    :cond_0
    iget-object v5, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->offsets:[I

    .line 21
    .line 22
    aget v5, v5, p1

    .line 23
    .line 24
    :try_start_0
    iget-object v6, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 25
    .line 26
    invoke-virtual {v6, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    packed-switch v6, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    :pswitch_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-direct {p0, p2}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catch_1
    move-exception p0

    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :pswitch_1
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 62
    .line 63
    add-int/lit8 v3, v5, 0x1

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 70
    .line 71
    add-int/lit8 v4, v5, 0x3

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-direct {p0, v3, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Lcom/android/dx/rop/cst/CstNat;

    .line 82
    .line 83
    invoke-static {v2, p2}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->make(ILcom/android/dx/rop/cst/CstNat;)Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :pswitch_2
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 90
    .line 91
    add-int/lit8 v3, v5, 0x1

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lcom/android/dx/rop/cst/CstString;

    .line 102
    .line 103
    invoke-static {p2}, Lcom/android/dx/rop/cst/CstProtoRef;->make(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/cst/CstProtoRef;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :pswitch_3
    iget-object v4, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 110
    .line 111
    add-int/lit8 v6, v5, 0x1

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    iget-object v6, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 118
    .line 119
    add-int/lit8 v7, v5, 0x2

    .line 120
    .line 121
    invoke-virtual {v6, v7}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    packed-switch v4, :pswitch_data_1

    .line 126
    .line 127
    .line 128
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 129
    .line 130
    new-instance p2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-direct {p0, p2}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :pswitch_4
    invoke-direct {p0, v6, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    check-cast p2, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_5
    invoke-direct {p0, v6, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    instance-of v3, p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 158
    .line 159
    if-nez v3, :cond_2

    .line 160
    .line 161
    instance-of v3, p2, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 162
    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 167
    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-direct {p0, p2}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :pswitch_6
    invoke-direct {p0, v6, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    check-cast p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :pswitch_7
    invoke-direct {p0, v6, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    check-cast p2, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 200
    .line 201
    :cond_2
    :goto_0
    invoke-static {v4}, Lcom/android/dx/cf/cst/ConstantPoolParser;->getMethodHandleTypeForKind(I)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-static {v2, p2}, Lcom/android/dx/rop/cst/CstMethodHandle;->make(ILcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    goto/16 :goto_3

    .line 210
    .line 211
    :pswitch_8
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 212
    .line 213
    add-int/lit8 v3, v5, 0x1

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Lcom/android/dx/rop/cst/CstString;

    .line 224
    .line 225
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 226
    .line 227
    add-int/lit8 v4, v5, 0x3

    .line 228
    .line 229
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-direct {p0, v3, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    check-cast p2, Lcom/android/dx/rop/cst/CstString;

    .line 238
    .line 239
    new-instance v3, Lcom/android/dx/rop/cst/CstNat;

    .line 240
    .line 241
    invoke-direct {v3, v2, p2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 242
    .line 243
    .line 244
    :goto_1
    move-object p2, v3

    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :pswitch_9
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 248
    .line 249
    add-int/lit8 v3, v5, 0x1

    .line 250
    .line 251
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Lcom/android/dx/rop/cst/CstType;

    .line 260
    .line 261
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 262
    .line 263
    add-int/lit8 v4, v5, 0x3

    .line 264
    .line 265
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    invoke-direct {p0, v3, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    check-cast p2, Lcom/android/dx/rop/cst/CstNat;

    .line 274
    .line 275
    new-instance v3, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 276
    .line 277
    invoke-direct {v3, v2, p2}, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :pswitch_a
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 282
    .line 283
    add-int/lit8 v3, v5, 0x1

    .line 284
    .line 285
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    check-cast v2, Lcom/android/dx/rop/cst/CstType;

    .line 294
    .line 295
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 296
    .line 297
    add-int/lit8 v4, v5, 0x3

    .line 298
    .line 299
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    invoke-direct {p0, v3, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    check-cast p2, Lcom/android/dx/rop/cst/CstNat;

    .line 308
    .line 309
    new-instance v3, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 310
    .line 311
    invoke-direct {v3, v2, p2}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :pswitch_b
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 316
    .line 317
    add-int/lit8 v3, v5, 0x1

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    check-cast v2, Lcom/android/dx/rop/cst/CstType;

    .line 328
    .line 329
    iget-object v3, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 330
    .line 331
    add-int/lit8 v4, v5, 0x3

    .line 332
    .line 333
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    invoke-direct {p0, v3, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    check-cast p2, Lcom/android/dx/rop/cst/CstNat;

    .line 342
    .line 343
    new-instance v3, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 344
    .line 345
    invoke-direct {v3, v2, p2}, Lcom/android/dx/rop/cst/CstFieldRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 346
    .line 347
    .line 348
    goto :goto_1

    .line 349
    :pswitch_c
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 350
    .line 351
    add-int/lit8 v3, v5, 0x1

    .line 352
    .line 353
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    goto :goto_3

    .line 362
    :pswitch_d
    iget-object v2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 363
    .line 364
    add-int/lit8 v3, v5, 0x1

    .line 365
    .line 366
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-direct {p0, v2, p2}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse0(ILjava/util/BitSet;)Lcom/android/dx/rop/cst/Constant;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    check-cast p2, Lcom/android/dx/rop/cst/CstString;

    .line 375
    .line 376
    new-instance v2, Lcom/android/dx/rop/cst/CstType;

    .line 377
    .line 378
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p2

    .line 382
    invoke-static {p2}, Lcom/android/dx/rop/type/Type;->internClassName(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-direct {v2, p2}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 387
    .line 388
    .line 389
    :goto_2
    move-object p2, v2

    .line 390
    goto :goto_3

    .line 391
    :pswitch_e
    iget-object p2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 392
    .line 393
    add-int/lit8 v2, v5, 0x1

    .line 394
    .line 395
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getLong(I)J

    .line 396
    .line 397
    .line 398
    move-result-wide v2

    .line 399
    invoke-static {v2, v3}, Lcom/android/dx/rop/cst/CstDouble;->make(J)Lcom/android/dx/rop/cst/CstDouble;

    .line 400
    .line 401
    .line 402
    move-result-object p2

    .line 403
    goto :goto_3

    .line 404
    :pswitch_f
    iget-object p2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 405
    .line 406
    add-int/lit8 v2, v5, 0x1

    .line 407
    .line 408
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getLong(I)J

    .line 409
    .line 410
    .line 411
    move-result-wide v2

    .line 412
    invoke-static {v2, v3}, Lcom/android/dx/rop/cst/CstLong;->make(J)Lcom/android/dx/rop/cst/CstLong;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    goto :goto_3

    .line 417
    :pswitch_10
    iget-object p2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 418
    .line 419
    add-int/lit8 v2, v5, 0x1

    .line 420
    .line 421
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result p2

    .line 425
    invoke-static {p2}, Lcom/android/dx/rop/cst/CstFloat;->make(I)Lcom/android/dx/rop/cst/CstFloat;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    goto :goto_3

    .line 430
    :pswitch_11
    iget-object p2, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 431
    .line 432
    add-int/lit8 v2, v5, 0x1

    .line 433
    .line 434
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 435
    .line 436
    .line 437
    move-result p2

    .line 438
    invoke-static {p2}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 439
    .line 440
    .line 441
    move-result-object p2

    .line 442
    goto :goto_3

    .line 443
    :pswitch_12
    invoke-direct {p0, v5}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parseUtf8(I)Lcom/android/dx/rop/cst/CstString;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    .line 449
    .line 450
    goto :goto_2

    .line 451
    :goto_3
    iget-object p0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 452
    .line 453
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/rop/cst/StdConstantPool;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 454
    .line 455
    .line 456
    return-object p2

    .line 457
    :goto_4
    new-instance p2, Lcom/android/dx/cf/iface/ParseException;

    .line 458
    .line 459
    invoke-direct {p2, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/Throwable;)V

    .line 460
    .line 461
    .line 462
    new-instance p0, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-virtual {p2, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw p2

    .line 492
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    invoke-virtual {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw p0

    .line 522
    nop

    .line 523
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
    .end packed-switch
.end method

.method private parseIfNecessary()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parse()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private parseUtf8(I)Lcom/android/dx/rop/cst/CstString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 p1, p1, 0x3

    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 12
    .line 13
    add-int/2addr v0, p1

    .line 14
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    new-instance p1, Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/android/dx/rop/cst/CstString;-><init>(Lcom/android/dx/util/ByteArray;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance p1, Lcom/android/dx/cf/iface/ParseException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method


# virtual methods
.method public getEndOffset()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->endOffset:I

    .line 5
    .line 6
    return p0
.end method

.method public getPool()Lcom/android/dx/rop/cst/StdConstantPool;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 5
    .line 6
    return-object p0
.end method

.method public setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/cst/ConstantPoolParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    return-void
.end method
