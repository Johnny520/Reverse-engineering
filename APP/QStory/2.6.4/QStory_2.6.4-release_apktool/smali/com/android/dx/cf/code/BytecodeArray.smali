.class public final Lcom/android/dx/cf/code/BytecodeArray;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/BytecodeArray$Visitor;,
        Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;,
        Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;
    }
.end annotation


# static fields
.field public static final EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final pool:Lcom/android/dx/rop/cst/ConstantPool;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/cf/code/BytecodeArray;->EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "pool == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "bytes == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method private parseLookupswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x4

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v8, v2

    .line 9
    :goto_0
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    shl-int/lit8 v4, v8, 0x8

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    or-int v8, v4, v3

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, p1

    .line 29
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 30
    .line 31
    add-int/lit8 v4, v0, 0x4

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    add-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    new-instance v7, Lcom/android/dx/cf/code/SwitchList;

    .line 40
    .line 41
    invoke-direct {v7, v3}, Lcom/android/dx/cf/code/SwitchList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    :goto_1
    if-ge v2, v3, :cond_1

    .line 45
    .line 46
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    iget-object v5, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 53
    .line 54
    add-int/lit8 v6, v0, 0x4

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/2addr v5, p1

    .line 61
    add-int/lit8 v0, v0, 0x8

    .line 62
    .line 63
    invoke-virtual {v7, v4, v5}, Lcom/android/dx/cf/code/SwitchList;->add(II)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v7, v1}, Lcom/android/dx/cf/code/SwitchList;->setDefaultTarget(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->removeSuperfluousDefaults()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->setImmutable()V

    .line 76
    .line 77
    .line 78
    sub-int v6, v0, p1

    .line 79
    .line 80
    const/16 v4, 0xab

    .line 81
    .line 82
    move v5, p1

    .line 83
    move-object v3, p2

    .line 84
    invoke-interface/range {v3 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V

    .line 85
    .line 86
    .line 87
    return v6
.end method

.method private parseNewarray(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "bad newarray code "

    .line 21
    .line 22
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :pswitch_0
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_1
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_2
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_3
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_4
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_5
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_6
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_7
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 58
    .line 59
    :goto_0
    invoke-interface {p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->getPreviousOffset()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    new-instance v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;

    .line 64
    .line 65
    invoke-direct {v3, p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;-><init>(Lcom/android/dx/cf/code/BytecodeArray;)V

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    if-ltz v2, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0, v2, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 72
    .line 73
    .line 74
    iget-object v5, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 75
    .line 76
    instance-of v5, v5, Lcom/android/dx/rop/cst/CstInteger;

    .line 77
    .line 78
    if-eqz v5, :cond_0

    .line 79
    .line 80
    iget v5, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 81
    .line 82
    add-int/2addr v5, v2

    .line 83
    if-ne v5, p1, :cond_0

    .line 84
    .line 85
    iget v2, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->value:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    move v2, v4

    .line 89
    :goto_1
    add-int/lit8 v5, p1, 0x2

    .line 90
    .line 91
    new-instance v6, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    :goto_2
    iget-object v7, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 99
    .line 100
    add-int/lit8 v8, v5, 0x1

    .line 101
    .line 102
    invoke-virtual {v7, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    const/16 v9, 0x59

    .line 107
    .line 108
    if-eq v7, v9, :cond_1

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_1
    invoke-virtual {p0, v8, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 112
    .line 113
    .line 114
    iget v7, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 115
    .line 116
    if-eqz v7, :cond_5

    .line 117
    .line 118
    iget-object v9, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 119
    .line 120
    instance-of v9, v9, Lcom/android/dx/rop/cst/CstInteger;

    .line 121
    .line 122
    if-eqz v9, :cond_5

    .line 123
    .line 124
    iget v9, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->value:I

    .line 125
    .line 126
    if-eq v9, v4, :cond_2

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_2
    add-int/2addr v8, v7

    .line 130
    invoke-virtual {p0, v8, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 131
    .line 132
    .line 133
    iget v7, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 134
    .line 135
    if-eqz v7, :cond_5

    .line 136
    .line 137
    iget-object v9, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 138
    .line 139
    instance-of v10, v9, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 140
    .line 141
    if-nez v10, :cond_3

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_3
    add-int/2addr v8, v7

    .line 145
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v7, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 149
    .line 150
    add-int/lit8 v9, v8, 0x1

    .line 151
    .line 152
    invoke-virtual {v7, v8}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    packed-switch v0, :pswitch_data_1

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_8
    const/16 v8, 0x50

    .line 161
    .line 162
    if-eq v7, v8, :cond_4

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :pswitch_9
    const/16 v8, 0x4f

    .line 166
    .line 167
    if-eq v7, v8, :cond_4

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :pswitch_a
    const/16 v8, 0x56

    .line 171
    .line 172
    if-eq v7, v8, :cond_4

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :pswitch_b
    const/16 v8, 0x52

    .line 176
    .line 177
    if-eq v7, v8, :cond_4

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :pswitch_c
    const/16 v8, 0x51

    .line 181
    .line 182
    if-eq v7, v8, :cond_4

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :pswitch_d
    const/16 v8, 0x55

    .line 186
    .line 187
    if-eq v7, v8, :cond_4

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :pswitch_e
    const/16 v8, 0x54

    .line 191
    .line 192
    if-eq v7, v8, :cond_4

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 196
    .line 197
    move v5, v9

    .line 198
    goto :goto_2

    .line 199
    :cond_5
    :goto_3
    const/4 p0, 0x2

    .line 200
    if-lt v4, p0, :cond_7

    .line 201
    .line 202
    if-eq v4, v2, :cond_6

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    sub-int/2addr v5, p1

    .line 206
    invoke-interface {p2, p1, v5, v1, v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V

    .line 207
    .line 208
    .line 209
    return v5

    .line 210
    :cond_7
    :goto_4
    const/4 v0, 0x0

    .line 211
    invoke-interface {p2, p1, p0, v1, v0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V

    .line 212
    .line 213
    .line 214
    return p0

    .line 215
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_e
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method private parseTableswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x4

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v8, v2

    .line 9
    :goto_0
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    shl-int/lit8 v4, v8, 0x8

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    or-int v8, v4, v3

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, p1

    .line 29
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 30
    .line 31
    add-int/lit8 v4, v0, 0x4

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 38
    .line 39
    add-int/lit8 v5, v0, 0x8

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    sub-int v5, v4, v3

    .line 46
    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0xc

    .line 50
    .line 51
    if-gt v3, v4, :cond_2

    .line 52
    .line 53
    new-instance v7, Lcom/android/dx/cf/code/SwitchList;

    .line 54
    .line 55
    invoke-direct {v7, v5}, Lcom/android/dx/cf/code/SwitchList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    :goto_1
    if-ge v2, v5, :cond_1

    .line 59
    .line 60
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 61
    .line 62
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    add-int/2addr v4, p1

    .line 67
    add-int/lit8 v0, v0, 0x4

    .line 68
    .line 69
    add-int v6, v3, v2

    .line 70
    .line 71
    invoke-virtual {v7, v6, v4}, Lcom/android/dx/cf/code/SwitchList;->add(II)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v7, v1}, Lcom/android/dx/cf/code/SwitchList;->setDefaultTarget(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->removeSuperfluousDefaults()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->setImmutable()V

    .line 84
    .line 85
    .line 86
    sub-int v6, v0, p1

    .line 87
    .line 88
    const/16 v4, 0xab

    .line 89
    .line 90
    move v5, p1

    .line 91
    move-object v3, p2

    .line 92
    invoke-interface/range {v3 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V

    .line 93
    .line 94
    .line 95
    return v6

    .line 96
    :cond_2
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 97
    .line 98
    const-string p1, "low / high inversion"

    .line 99
    .line 100
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method private parseWide(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    const/16 v0, 0x84

    .line 18
    .line 19
    if-eq v3, v0, :cond_1

    .line 20
    .line 21
    const/16 p0, 0xa9

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-eq v3, p0, :cond_0

    .line 25
    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    packed-switch v3, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    const/16 p0, 0xc4

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-interface {p2, p0, p1, v0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitInvalid(III)V

    .line 36
    .line 37
    .line 38
    return v0

    .line 39
    :pswitch_0
    sget-object v9, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/16 v5, 0x36

    .line 43
    .line 44
    const/4 v7, 0x4

    .line 45
    move v6, p1

    .line 46
    move-object v4, p2

    .line 47
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 48
    .line 49
    .line 50
    return v0

    .line 51
    :pswitch_1
    move v6, p1

    .line 52
    move-object v4, p2

    .line 53
    sget-object v9, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    const/16 v5, 0x36

    .line 57
    .line 58
    const/4 v7, 0x4

    .line 59
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :pswitch_2
    move v6, p1

    .line 64
    move-object v4, p2

    .line 65
    sget-object v9, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    const/16 v5, 0x36

    .line 69
    .line 70
    const/4 v7, 0x4

    .line 71
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 72
    .line 73
    .line 74
    return v0

    .line 75
    :pswitch_3
    move v6, p1

    .line 76
    move-object v4, p2

    .line 77
    sget-object v9, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/16 v5, 0x36

    .line 81
    .line 82
    const/4 v7, 0x4

    .line 83
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 84
    .line 85
    .line 86
    return v0

    .line 87
    :pswitch_4
    move v6, p1

    .line 88
    move-object v4, p2

    .line 89
    sget-object v9, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const/16 v5, 0x36

    .line 93
    .line 94
    const/4 v7, 0x4

    .line 95
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :pswitch_5
    move v6, p1

    .line 100
    move-object v4, p2

    .line 101
    sget-object v9, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    const/16 v5, 0x15

    .line 105
    .line 106
    const/4 v7, 0x4

    .line 107
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 108
    .line 109
    .line 110
    return v0

    .line 111
    :pswitch_6
    move v6, p1

    .line 112
    move-object v4, p2

    .line 113
    sget-object v9, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/16 v5, 0x15

    .line 117
    .line 118
    const/4 v7, 0x4

    .line 119
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 120
    .line 121
    .line 122
    return v0

    .line 123
    :pswitch_7
    move v6, p1

    .line 124
    move-object v4, p2

    .line 125
    sget-object v9, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    const/16 v5, 0x15

    .line 129
    .line 130
    const/4 v7, 0x4

    .line 131
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 132
    .line 133
    .line 134
    return v0

    .line 135
    :pswitch_8
    move v6, p1

    .line 136
    move-object v4, p2

    .line 137
    sget-object v9, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    const/16 v5, 0x15

    .line 141
    .line 142
    const/4 v7, 0x4

    .line 143
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 144
    .line 145
    .line 146
    return v0

    .line 147
    :pswitch_9
    move v6, p1

    .line 148
    move-object v4, p2

    .line 149
    sget-object v9, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v5, 0x15

    .line 153
    .line 154
    const/4 v7, 0x4

    .line 155
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 156
    .line 157
    .line 158
    return v0

    .line 159
    :cond_0
    move v6, p1

    .line 160
    move-object v4, p2

    .line 161
    sget-object v7, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 162
    .line 163
    move-object v2, v4

    .line 164
    move v4, v6

    .line 165
    move v6, v8

    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v5, 0x4

    .line 168
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 169
    .line 170
    .line 171
    return v0

    .line 172
    :cond_1
    move v6, p1

    .line 173
    move-object v4, p2

    .line 174
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 175
    .line 176
    add-int/lit8 p1, v6, 0x4

    .line 177
    .line 178
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    const/4 v5, 0x6

    .line 183
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 184
    .line 185
    move-object v2, v4

    .line 186
    move v4, v6

    .line 187
    move v6, v8

    .line 188
    move v8, p0

    .line 189
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 190
    .line 191
    .line 192
    const/4 p0, 0x6

    .line 193
    return p0

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    :pswitch_data_1
    .packed-switch 0x36
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    add-int/lit8 p0, p0, 0x4

    .line 8
    .line 9
    return p0
.end method

.method public forEach(Lcom/android/dx/cf/code/BytecodeArray$Visitor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1, p1}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public getBytes()Lcom/android/dx/util/ByteArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInstructionOffsets()[I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v1, v2, v3}, Lcom/android/dx/util/Bits;->set([IIZ)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p0, v2, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1
.end method

.method public parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 12

    .line 1
    const-string v1, "...at bytecode offset "

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/android/dx/cf/code/BytecodeArray;->EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    :try_start_0
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-static {v3}, Lcom/android/dx/cf/code/ByteOps;->opInfo(I)I
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    const/4 v0, 0x5

    .line 19
    const/16 v4, 0xac

    .line 20
    .line 21
    const/16 v5, 0x2e

    .line 22
    .line 23
    const/16 v6, 0x4f

    .line 24
    .line 25
    const/4 v9, 0x3

    .line 26
    const/4 v10, 0x2

    .line 27
    const/4 v11, 0x1

    .line 28
    packed-switch v3, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    :try_start_1
    invoke-interface {v2, v3, p1, v11}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitInvalid(III)V

    .line 32
    .line 33
    .line 34
    return v11

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    move v4, p1

    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :catch_1
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    move v4, p1

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :pswitch_0
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 46
    .line 47
    add-int/lit8 p2, p1, 0x1

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, p1

    .line 54
    const/16 p2, 0xc8

    .line 55
    .line 56
    if-ne v3, p2, :cond_1

    .line 57
    .line 58
    const/16 p2, 0xa7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/16 p2, 0xa8

    .line 62
    .line 63
    :goto_0
    invoke-interface {v2, p2, p1, v0, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitBranch(IIII)V
    :try_end_1
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 64
    .line 65
    .line 66
    return v0

    .line 67
    :pswitch_1
    :try_start_2
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 68
    .line 69
    add-int/lit8 v0, p1, 0x1

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 76
    .line 77
    add-int/lit8 v4, p1, 0x3

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 84
    .line 85
    invoke-interface {p0, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 86
    .line 87
    .line 88
    move-result-object v6
    :try_end_2
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4

    .line 89
    const/4 v5, 0x4

    .line 90
    move v4, p1

    .line 91
    :try_start_3
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x4

    .line 95
    return p0

    .line 96
    :catch_2
    move-exception v0

    .line 97
    :goto_1
    move-object p0, v0

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :catch_3
    move-exception v0

    .line 101
    :goto_2
    move-object p0, v0

    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :catch_4
    move-exception v0

    .line 105
    move v4, p1

    .line 106
    goto :goto_1

    .line 107
    :catch_5
    move-exception v0

    .line 108
    move v4, p1

    .line 109
    goto :goto_2

    .line 110
    :pswitch_2
    move v4, p1

    .line 111
    invoke-direct {p0, v4, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseWide(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    :pswitch_3
    move v4, p1

    .line 117
    invoke-direct {p0, v4, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseNewarray(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    return p0

    .line 122
    :pswitch_4
    move v4, p1

    .line 123
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 124
    .line 125
    add-int/lit8 p2, v4, 0x1

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 132
    .line 133
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    move-object v6, p0

    .line 138
    check-cast v6, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 139
    .line 140
    const/4 v5, 0x5

    .line 141
    const/4 v7, 0x0

    .line 142
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 143
    .line 144
    .line 145
    return v0

    .line 146
    :pswitch_5
    move v4, p1

    .line 147
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 148
    .line 149
    add-int/lit8 p2, v4, 0x1

    .line 150
    .line 151
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 156
    .line 157
    add-int/lit8 v5, v4, 0x3

    .line 158
    .line 159
    invoke-virtual {p2, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    iget-object v5, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 164
    .line 165
    add-int/lit8 v6, v4, 0x4

    .line 166
    .line 167
    invoke-virtual {v5, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 172
    .line 173
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    shl-int/lit8 p0, v5, 0x8

    .line 178
    .line 179
    or-int v7, p2, p0

    .line 180
    .line 181
    const/4 v5, 0x5

    .line 182
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    :try_end_3
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 183
    .line 184
    .line 185
    return v0

    .line 186
    :pswitch_6
    move v4, p1

    .line 187
    :try_start_4
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 188
    .line 189
    add-int/lit8 p2, v4, 0x1

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 196
    .line 197
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    const/4 v5, 0x3

    .line 202
    const/4 v7, 0x0

    .line 203
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    :try_end_4
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_6

    .line 204
    .line 205
    .line 206
    return v9

    .line 207
    :catch_6
    move-exception v0

    .line 208
    move p1, v4

    .line 209
    goto :goto_1

    .line 210
    :catch_7
    move-exception v0

    .line 211
    move p1, v4

    .line 212
    goto :goto_2

    .line 213
    :pswitch_7
    :try_start_5
    sget-object p0, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 214
    .line 215
    invoke-interface {v2, v3, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 216
    .line 217
    .line 218
    return v11

    .line 219
    :pswitch_8
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 220
    .line 221
    invoke-interface {v2, v4, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 222
    .line 223
    .line 224
    return v11

    .line 225
    :pswitch_9
    sget-object p0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 226
    .line 227
    invoke-interface {v2, v4, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 228
    .line 229
    .line 230
    return v11

    .line 231
    :pswitch_a
    sget-object p0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 232
    .line 233
    invoke-interface {v2, v4, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 234
    .line 235
    .line 236
    return v11

    .line 237
    :pswitch_b
    sget-object p0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 238
    .line 239
    invoke-interface {v2, v4, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 240
    .line 241
    .line 242
    return v11

    .line 243
    :pswitch_c
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 244
    .line 245
    invoke-interface {v2, v4, p1, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 246
    .line 247
    .line 248
    return v11

    .line 249
    :pswitch_d
    invoke-direct {p0, p1, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseLookupswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    return p0

    .line 254
    :pswitch_e
    invoke-direct {p0, p1, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseTableswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 255
    .line 256
    .line 257
    move-result p0
    :try_end_5
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 258
    return p0

    .line 259
    :pswitch_f
    :try_start_6
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 260
    .line 261
    add-int/lit8 p2, p1, 0x1

    .line 262
    .line 263
    invoke-virtual {p0, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    sget-object v7, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;
    :try_end_6
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4

    .line 268
    .line 269
    const/4 v8, 0x0

    .line 270
    const/4 v5, 0x2

    .line 271
    move v4, p1

    .line 272
    :try_start_7
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 273
    .line 274
    .line 275
    return v10

    .line 276
    :pswitch_10
    move v4, p1

    .line 277
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 278
    .line 279
    add-int/lit8 p1, v4, 0x1

    .line 280
    .line 281
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    add-int p1, v4, p0

    .line 286
    .line 287
    invoke-interface {v2, v3, v4, v9, p1}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitBranch(IIII)V

    .line 288
    .line 289
    .line 290
    return v9

    .line 291
    :pswitch_11
    move v4, p1

    .line 292
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 293
    .line 294
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 295
    .line 296
    .line 297
    return v11

    .line 298
    :pswitch_12
    move v4, p1

    .line 299
    sget-object p0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 300
    .line 301
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 302
    .line 303
    .line 304
    return v11

    .line 305
    :pswitch_13
    move v4, p1

    .line 306
    sget-object p0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 307
    .line 308
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 309
    .line 310
    .line 311
    return v11

    .line 312
    :pswitch_14
    move v4, p1

    .line 313
    sget-object p0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 314
    .line 315
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 316
    .line 317
    .line 318
    return v11

    .line 319
    :pswitch_15
    move v4, p1

    .line 320
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 321
    .line 322
    add-int/lit8 p2, v4, 0x1

    .line 323
    .line 324
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 329
    .line 330
    add-int/lit8 p1, v4, 0x2

    .line 331
    .line 332
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte(I)I

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 337
    .line 338
    const/4 v5, 0x3

    .line 339
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 340
    .line 341
    .line 342
    return v9

    .line 343
    :pswitch_16
    move v4, p1

    .line 344
    sub-int/2addr v3, v9

    .line 345
    sget-object p0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 346
    .line 347
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 348
    .line 349
    .line 350
    return v11

    .line 351
    :pswitch_17
    move v4, p1

    .line 352
    sub-int/2addr v3, v10

    .line 353
    sget-object p0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 354
    .line 355
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 356
    .line 357
    .line 358
    return v11

    .line 359
    :pswitch_18
    move v4, p1

    .line 360
    sub-int/2addr v3, v11

    .line 361
    sget-object p0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 362
    .line 363
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 364
    .line 365
    .line 366
    return v11

    .line 367
    :pswitch_19
    move v4, p1

    .line 368
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 369
    .line 370
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 371
    .line 372
    .line 373
    return v11

    .line 374
    :pswitch_1a
    move v4, p1

    .line 375
    sget-object p0, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 376
    .line 377
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 378
    .line 379
    .line 380
    return v11

    .line 381
    :pswitch_1b
    move v4, p1

    .line 382
    sget-object p0, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 383
    .line 384
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 385
    .line 386
    .line 387
    return v11

    .line 388
    :pswitch_1c
    move v4, p1

    .line 389
    sget-object p0, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 390
    .line 391
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 392
    .line 393
    .line 394
    return v11

    .line 395
    :pswitch_1d
    move v4, p1

    .line 396
    sget-object p0, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 397
    .line 398
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 399
    .line 400
    .line 401
    return v11

    .line 402
    :pswitch_1e
    move v4, p1

    .line 403
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 404
    .line 405
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 406
    .line 407
    .line 408
    return v11

    .line 409
    :pswitch_1f
    move v4, p1

    .line 410
    sget-object p0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 411
    .line 412
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 413
    .line 414
    .line 415
    return v11

    .line 416
    :pswitch_20
    move v4, p1

    .line 417
    sget-object p0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 418
    .line 419
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 420
    .line 421
    .line 422
    return v11

    .line 423
    :pswitch_21
    move v4, p1

    .line 424
    sget-object p0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 425
    .line 426
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 427
    .line 428
    .line 429
    return v11

    .line 430
    :pswitch_22
    move v4, p1

    .line 431
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 432
    .line 433
    invoke-interface {v2, v6, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 434
    .line 435
    .line 436
    return v11

    .line 437
    :pswitch_23
    move v4, p1

    .line 438
    add-int/lit8 v6, v3, -0x4b

    .line 439
    .line 440
    sget-object v7, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 441
    .line 442
    const/4 v8, 0x0

    .line 443
    const/16 v3, 0x36

    .line 444
    .line 445
    const/4 v5, 0x1

    .line 446
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 447
    .line 448
    .line 449
    return v11

    .line 450
    :pswitch_24
    move v4, p1

    .line 451
    add-int/lit8 v6, v3, -0x47

    .line 452
    .line 453
    sget-object v7, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 454
    .line 455
    const/4 v8, 0x0

    .line 456
    const/16 v3, 0x36

    .line 457
    .line 458
    const/4 v5, 0x1

    .line 459
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 460
    .line 461
    .line 462
    return v11

    .line 463
    :pswitch_25
    move v4, p1

    .line 464
    add-int/lit8 v6, v3, -0x43

    .line 465
    .line 466
    sget-object v7, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    const/16 v3, 0x36

    .line 470
    .line 471
    const/4 v5, 0x1

    .line 472
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 473
    .line 474
    .line 475
    return v11

    .line 476
    :pswitch_26
    move v4, p1

    .line 477
    add-int/lit8 v6, v3, -0x3f

    .line 478
    .line 479
    sget-object v7, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 480
    .line 481
    const/4 v8, 0x0

    .line 482
    const/16 v3, 0x36

    .line 483
    .line 484
    const/4 v5, 0x1

    .line 485
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 486
    .line 487
    .line 488
    return v11

    .line 489
    :pswitch_27
    move v4, p1

    .line 490
    add-int/lit8 v6, v3, -0x3b

    .line 491
    .line 492
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 493
    .line 494
    const/4 v8, 0x0

    .line 495
    const/16 v3, 0x36

    .line 496
    .line 497
    const/4 v5, 0x1

    .line 498
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 499
    .line 500
    .line 501
    return v11

    .line 502
    :pswitch_28
    move v4, p1

    .line 503
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 504
    .line 505
    add-int/lit8 p1, v4, 0x1

    .line 506
    .line 507
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    sget-object v7, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 512
    .line 513
    const/4 v8, 0x0

    .line 514
    const/16 v3, 0x36

    .line 515
    .line 516
    const/4 v5, 0x2

    .line 517
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 518
    .line 519
    .line 520
    return v10

    .line 521
    :pswitch_29
    move v4, p1

    .line 522
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 523
    .line 524
    add-int/lit8 p1, v4, 0x1

    .line 525
    .line 526
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    sget-object v7, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 531
    .line 532
    const/4 v8, 0x0

    .line 533
    const/16 v3, 0x36

    .line 534
    .line 535
    const/4 v5, 0x2

    .line 536
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 537
    .line 538
    .line 539
    return v10

    .line 540
    :pswitch_2a
    move v4, p1

    .line 541
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 542
    .line 543
    add-int/lit8 p1, v4, 0x1

    .line 544
    .line 545
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 546
    .line 547
    .line 548
    move-result v6

    .line 549
    sget-object v7, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 550
    .line 551
    const/4 v8, 0x0

    .line 552
    const/16 v3, 0x36

    .line 553
    .line 554
    const/4 v5, 0x2

    .line 555
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 556
    .line 557
    .line 558
    return v10

    .line 559
    :pswitch_2b
    move v4, p1

    .line 560
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 561
    .line 562
    add-int/lit8 p1, v4, 0x1

    .line 563
    .line 564
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    sget-object v7, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 569
    .line 570
    const/4 v8, 0x0

    .line 571
    const/16 v3, 0x36

    .line 572
    .line 573
    const/4 v5, 0x2

    .line 574
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 575
    .line 576
    .line 577
    return v10

    .line 578
    :pswitch_2c
    move v4, p1

    .line 579
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 580
    .line 581
    add-int/lit8 p1, v4, 0x1

    .line 582
    .line 583
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 588
    .line 589
    const/4 v8, 0x0

    .line 590
    const/16 v3, 0x36

    .line 591
    .line 592
    const/4 v5, 0x2

    .line 593
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 594
    .line 595
    .line 596
    return v10

    .line 597
    :pswitch_2d
    move v4, p1

    .line 598
    sget-object p0, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 599
    .line 600
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 601
    .line 602
    .line 603
    return v11

    .line 604
    :pswitch_2e
    move v4, p1

    .line 605
    sget-object p0, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 606
    .line 607
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 608
    .line 609
    .line 610
    return v11

    .line 611
    :pswitch_2f
    move v4, p1

    .line 612
    sget-object p0, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 613
    .line 614
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 615
    .line 616
    .line 617
    return v11

    .line 618
    :pswitch_30
    move v4, p1

    .line 619
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 620
    .line 621
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 622
    .line 623
    .line 624
    return v11

    .line 625
    :pswitch_31
    move v4, p1

    .line 626
    sget-object p0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 627
    .line 628
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 629
    .line 630
    .line 631
    return v11

    .line 632
    :pswitch_32
    move v4, p1

    .line 633
    sget-object p0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 634
    .line 635
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 636
    .line 637
    .line 638
    return v11

    .line 639
    :pswitch_33
    move v4, p1

    .line 640
    sget-object p0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 641
    .line 642
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 643
    .line 644
    .line 645
    return v11

    .line 646
    :pswitch_34
    move v4, p1

    .line 647
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 648
    .line 649
    invoke-interface {v2, v5, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 650
    .line 651
    .line 652
    return v11

    .line 653
    :pswitch_35
    move v4, p1

    .line 654
    add-int/lit8 v6, v3, -0x2a

    .line 655
    .line 656
    sget-object v7, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 657
    .line 658
    const/4 v8, 0x0

    .line 659
    const/16 v3, 0x15

    .line 660
    .line 661
    const/4 v5, 0x1

    .line 662
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 663
    .line 664
    .line 665
    return v11

    .line 666
    :pswitch_36
    move v4, p1

    .line 667
    add-int/lit8 v6, v3, -0x26

    .line 668
    .line 669
    sget-object v7, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 670
    .line 671
    const/4 v8, 0x0

    .line 672
    const/16 v3, 0x15

    .line 673
    .line 674
    const/4 v5, 0x1

    .line 675
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 676
    .line 677
    .line 678
    return v11

    .line 679
    :pswitch_37
    move v4, p1

    .line 680
    add-int/lit8 v6, v3, -0x22

    .line 681
    .line 682
    sget-object v7, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 683
    .line 684
    const/4 v8, 0x0

    .line 685
    const/16 v3, 0x15

    .line 686
    .line 687
    const/4 v5, 0x1

    .line 688
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 689
    .line 690
    .line 691
    return v11

    .line 692
    :pswitch_38
    move v4, p1

    .line 693
    add-int/lit8 v6, v3, -0x1e

    .line 694
    .line 695
    sget-object v7, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 696
    .line 697
    const/4 v8, 0x0

    .line 698
    const/16 v3, 0x15

    .line 699
    .line 700
    const/4 v5, 0x1

    .line 701
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 702
    .line 703
    .line 704
    return v11

    .line 705
    :pswitch_39
    move v4, p1

    .line 706
    add-int/lit8 v6, v3, -0x1a

    .line 707
    .line 708
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 709
    .line 710
    const/4 v8, 0x0

    .line 711
    const/16 v3, 0x15

    .line 712
    .line 713
    const/4 v5, 0x1

    .line 714
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 715
    .line 716
    .line 717
    return v11

    .line 718
    :pswitch_3a
    move v4, p1

    .line 719
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 720
    .line 721
    add-int/lit8 p1, v4, 0x1

    .line 722
    .line 723
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 724
    .line 725
    .line 726
    move-result v6

    .line 727
    sget-object v7, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 728
    .line 729
    const/4 v8, 0x0

    .line 730
    const/16 v3, 0x15

    .line 731
    .line 732
    const/4 v5, 0x2

    .line 733
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 734
    .line 735
    .line 736
    return v10

    .line 737
    :pswitch_3b
    move v4, p1

    .line 738
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 739
    .line 740
    add-int/lit8 p1, v4, 0x1

    .line 741
    .line 742
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 743
    .line 744
    .line 745
    move-result v6

    .line 746
    sget-object v7, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 747
    .line 748
    const/4 v8, 0x0

    .line 749
    const/16 v3, 0x15

    .line 750
    .line 751
    const/4 v5, 0x2

    .line 752
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 753
    .line 754
    .line 755
    return v10

    .line 756
    :pswitch_3c
    move v4, p1

    .line 757
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 758
    .line 759
    add-int/lit8 p1, v4, 0x1

    .line 760
    .line 761
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    sget-object v7, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 766
    .line 767
    const/4 v8, 0x0

    .line 768
    const/16 v3, 0x15

    .line 769
    .line 770
    const/4 v5, 0x2

    .line 771
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 772
    .line 773
    .line 774
    return v10

    .line 775
    :pswitch_3d
    move v4, p1

    .line 776
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 777
    .line 778
    add-int/lit8 p1, v4, 0x1

    .line 779
    .line 780
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 781
    .line 782
    .line 783
    move-result v6

    .line 784
    sget-object v7, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 785
    .line 786
    const/4 v8, 0x0

    .line 787
    const/16 v3, 0x15

    .line 788
    .line 789
    const/4 v5, 0x2

    .line 790
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 791
    .line 792
    .line 793
    return v10

    .line 794
    :pswitch_3e
    move v4, p1

    .line 795
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 796
    .line 797
    add-int/lit8 p1, v4, 0x1

    .line 798
    .line 799
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 800
    .line 801
    .line 802
    move-result v6

    .line 803
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 804
    .line 805
    const/4 v8, 0x0

    .line 806
    const/16 v3, 0x15

    .line 807
    .line 808
    const/4 v5, 0x2

    .line 809
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 810
    .line 811
    .line 812
    return v10

    .line 813
    :pswitch_3f
    move v4, p1

    .line 814
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 815
    .line 816
    add-int/lit8 p2, v4, 0x1

    .line 817
    .line 818
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 819
    .line 820
    .line 821
    move-result p1

    .line 822
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 823
    .line 824
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 825
    .line 826
    .line 827
    move-result-object v6

    .line 828
    const/4 v5, 0x3

    .line 829
    const/4 v7, 0x0

    .line 830
    const/16 v3, 0x14

    .line 831
    .line 832
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 833
    .line 834
    .line 835
    return v9

    .line 836
    :pswitch_40
    move v4, p1

    .line 837
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 838
    .line 839
    add-int/lit8 v0, v4, 0x1

    .line 840
    .line 841
    invoke-virtual {p1, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 842
    .line 843
    .line 844
    move-result p1

    .line 845
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 846
    .line 847
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 848
    .line 849
    .line 850
    move-result-object v6

    .line 851
    instance-of p0, v6, Lcom/android/dx/rop/cst/CstInteger;

    .line 852
    .line 853
    if-eqz p0, :cond_2

    .line 854
    .line 855
    move-object p0, v6

    .line 856
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 857
    .line 858
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 859
    .line 860
    .line 861
    move-result p2

    .line 862
    :cond_2
    move v7, p2

    .line 863
    const/16 v3, 0x12

    .line 864
    .line 865
    const/4 v5, 0x3

    .line 866
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 867
    .line 868
    .line 869
    return v9

    .line 870
    :pswitch_41
    move v4, p1

    .line 871
    iget-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 872
    .line 873
    add-int/lit8 v0, v4, 0x1

    .line 874
    .line 875
    invoke-virtual {p1, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 876
    .line 877
    .line 878
    move-result p1

    .line 879
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 880
    .line 881
    invoke-interface {p0, p1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 882
    .line 883
    .line 884
    move-result-object v6

    .line 885
    instance-of p0, v6, Lcom/android/dx/rop/cst/CstInteger;

    .line 886
    .line 887
    if-eqz p0, :cond_3

    .line 888
    .line 889
    move-object p0, v6

    .line 890
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 891
    .line 892
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 893
    .line 894
    .line 895
    move-result p2

    .line 896
    :cond_3
    move v7, p2

    .line 897
    const/16 v3, 0x12

    .line 898
    .line 899
    const/4 v5, 0x2

    .line 900
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 901
    .line 902
    .line 903
    return v10

    .line 904
    :pswitch_42
    move v4, p1

    .line 905
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 906
    .line 907
    add-int/lit8 p1, v4, 0x1

    .line 908
    .line 909
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 910
    .line 911
    .line 912
    move-result v7

    .line 913
    invoke-static {v7}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 914
    .line 915
    .line 916
    move-result-object v6

    .line 917
    const/16 v3, 0x12

    .line 918
    .line 919
    const/4 v5, 0x3

    .line 920
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 921
    .line 922
    .line 923
    return v9

    .line 924
    :pswitch_43
    move v4, p1

    .line 925
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 926
    .line 927
    add-int/lit8 p1, v4, 0x1

    .line 928
    .line 929
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte(I)I

    .line 930
    .line 931
    .line 932
    move-result v7

    .line 933
    invoke-static {v7}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 934
    .line 935
    .line 936
    move-result-object v6

    .line 937
    const/16 v3, 0x12

    .line 938
    .line 939
    const/4 v5, 0x2

    .line 940
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 941
    .line 942
    .line 943
    return v10

    .line 944
    :pswitch_44
    move v4, p1

    .line 945
    sget-object v6, Lcom/android/dx/rop/cst/CstDouble;->VALUE_1:Lcom/android/dx/rop/cst/CstDouble;

    .line 946
    .line 947
    const/4 v7, 0x0

    .line 948
    const/16 v3, 0x12

    .line 949
    .line 950
    const/4 v5, 0x1

    .line 951
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 952
    .line 953
    .line 954
    return v11

    .line 955
    :pswitch_45
    move v4, p1

    .line 956
    sget-object v6, Lcom/android/dx/rop/cst/CstDouble;->VALUE_0:Lcom/android/dx/rop/cst/CstDouble;

    .line 957
    .line 958
    const/4 v7, 0x0

    .line 959
    const/16 v3, 0x12

    .line 960
    .line 961
    const/4 v5, 0x1

    .line 962
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 963
    .line 964
    .line 965
    return v11

    .line 966
    :pswitch_46
    move v4, p1

    .line 967
    sget-object v6, Lcom/android/dx/rop/cst/CstFloat;->VALUE_2:Lcom/android/dx/rop/cst/CstFloat;

    .line 968
    .line 969
    const/4 v7, 0x0

    .line 970
    const/16 v3, 0x12

    .line 971
    .line 972
    const/4 v5, 0x1

    .line 973
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 974
    .line 975
    .line 976
    return v11

    .line 977
    :pswitch_47
    move v4, p1

    .line 978
    sget-object v6, Lcom/android/dx/rop/cst/CstFloat;->VALUE_1:Lcom/android/dx/rop/cst/CstFloat;

    .line 979
    .line 980
    const/4 v7, 0x0

    .line 981
    const/16 v3, 0x12

    .line 982
    .line 983
    const/4 v5, 0x1

    .line 984
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 985
    .line 986
    .line 987
    return v11

    .line 988
    :pswitch_48
    move v4, p1

    .line 989
    sget-object v6, Lcom/android/dx/rop/cst/CstFloat;->VALUE_0:Lcom/android/dx/rop/cst/CstFloat;

    .line 990
    .line 991
    const/4 v7, 0x0

    .line 992
    const/16 v3, 0x12

    .line 993
    .line 994
    const/4 v5, 0x1

    .line 995
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 996
    .line 997
    .line 998
    return v11

    .line 999
    :pswitch_49
    move v4, p1

    .line 1000
    sget-object v6, Lcom/android/dx/rop/cst/CstLong;->VALUE_1:Lcom/android/dx/rop/cst/CstLong;

    .line 1001
    .line 1002
    const/4 v7, 0x0

    .line 1003
    const/16 v3, 0x12

    .line 1004
    .line 1005
    const/4 v5, 0x1

    .line 1006
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1007
    .line 1008
    .line 1009
    return v11

    .line 1010
    :pswitch_4a
    move v4, p1

    .line 1011
    sget-object v6, Lcom/android/dx/rop/cst/CstLong;->VALUE_0:Lcom/android/dx/rop/cst/CstLong;

    .line 1012
    .line 1013
    const/4 v7, 0x0

    .line 1014
    const/16 v3, 0x12

    .line 1015
    .line 1016
    const/4 v5, 0x1

    .line 1017
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1018
    .line 1019
    .line 1020
    return v11

    .line 1021
    :pswitch_4b
    move v4, p1

    .line 1022
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_5:Lcom/android/dx/rop/cst/CstInteger;

    .line 1023
    .line 1024
    const/4 v7, 0x5

    .line 1025
    const/16 v3, 0x12

    .line 1026
    .line 1027
    const/4 v5, 0x1

    .line 1028
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1029
    .line 1030
    .line 1031
    return v11

    .line 1032
    :pswitch_4c
    move v4, p1

    .line 1033
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_4:Lcom/android/dx/rop/cst/CstInteger;

    .line 1034
    .line 1035
    const/4 v7, 0x4

    .line 1036
    const/16 v3, 0x12

    .line 1037
    .line 1038
    const/4 v5, 0x1

    .line 1039
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1040
    .line 1041
    .line 1042
    return v11

    .line 1043
    :pswitch_4d
    move v4, p1

    .line 1044
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_3:Lcom/android/dx/rop/cst/CstInteger;

    .line 1045
    .line 1046
    const/4 v7, 0x3

    .line 1047
    const/16 v3, 0x12

    .line 1048
    .line 1049
    const/4 v5, 0x1

    .line 1050
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1051
    .line 1052
    .line 1053
    return v11

    .line 1054
    :pswitch_4e
    move v4, p1

    .line 1055
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_2:Lcom/android/dx/rop/cst/CstInteger;

    .line 1056
    .line 1057
    const/4 v7, 0x2

    .line 1058
    const/16 v3, 0x12

    .line 1059
    .line 1060
    const/4 v5, 0x1

    .line 1061
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1062
    .line 1063
    .line 1064
    return v11

    .line 1065
    :pswitch_4f
    move v4, p1

    .line 1066
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_1:Lcom/android/dx/rop/cst/CstInteger;

    .line 1067
    .line 1068
    const/4 v7, 0x1

    .line 1069
    const/16 v3, 0x12

    .line 1070
    .line 1071
    const/4 v5, 0x1

    .line 1072
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1073
    .line 1074
    .line 1075
    return v11

    .line 1076
    :pswitch_50
    move v4, p1

    .line 1077
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_0:Lcom/android/dx/rop/cst/CstInteger;

    .line 1078
    .line 1079
    const/4 v7, 0x0

    .line 1080
    const/16 v3, 0x12

    .line 1081
    .line 1082
    const/4 v5, 0x1

    .line 1083
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1084
    .line 1085
    .line 1086
    return v11

    .line 1087
    :pswitch_51
    move v4, p1

    .line 1088
    sget-object v6, Lcom/android/dx/rop/cst/CstInteger;->VALUE_M1:Lcom/android/dx/rop/cst/CstInteger;

    .line 1089
    .line 1090
    const/4 v7, -0x1

    .line 1091
    const/16 v3, 0x12

    .line 1092
    .line 1093
    const/4 v5, 0x1

    .line 1094
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1095
    .line 1096
    .line 1097
    return v11

    .line 1098
    :pswitch_52
    move v4, p1

    .line 1099
    sget-object v6, Lcom/android/dx/rop/cst/CstKnownNull;->THE_ONE:Lcom/android/dx/rop/cst/CstKnownNull;

    .line 1100
    .line 1101
    const/4 v7, 0x0

    .line 1102
    const/16 v3, 0x12

    .line 1103
    .line 1104
    const/4 v5, 0x1

    .line 1105
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1106
    .line 1107
    .line 1108
    return v11

    .line 1109
    :pswitch_53
    move v4, p1

    .line 1110
    sget-object p0, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 1111
    .line 1112
    invoke-interface {v2, v3, v4, v11, p0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    :try_end_7
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 1113
    .line 1114
    .line 1115
    return v11

    .line 1116
    :goto_3
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 1117
    .line 1118
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/Throwable;)V

    .line 1119
    .line 1120
    .line 1121
    new-instance p0, Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object p2

    .line 1130
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object p0

    .line 1137
    invoke-virtual {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 1138
    .line 1139
    .line 1140
    throw p1

    .line 1141
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object p2

    .line 1150
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object p1

    .line 1157
    invoke-virtual {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    throw p0

    .line 1161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_13
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_11
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_10
        :pswitch_10
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public processWorkSet([ILcom/android/dx/cf/code/BytecodeArray$Visitor;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    :goto_0
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {p1, v0}, Lcom/android/dx/util/Bits;->clear([II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, v0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->setPreviousOffset(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "visitor == null"

    .line 22
    .line 23
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
