.class public final Lcom/android/dx/rop/cst/CstString;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final EMPTY_STRING:Lcom/android/dx/rop/cst/CstString;


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final string:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/android/dx/rop/cst/CstString;->EMPTY_STRING:Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/util/ByteArray;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    if-eqz p1, :cond_0

    .line 32
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstString;->bytes:Lcom/android/dx/util/ByteArray;

    .line 33
    invoke-static {p1}, Lcom/android/dx/rop/cst/CstString;->utf8BytesToString(Lcom/android/dx/util/ByteArray;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    return-void

    .line 34
    :cond_0
    const-string p0, "bytes == null"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/util/ByteArray;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/android/dx/rop/cst/CstString;->stringToUtf8Bytes(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/android/dx/rop/cst/CstString;->bytes:Lcom/android/dx/util/ByteArray;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "string == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method

.method public static stringToUtf8Bytes(Ljava/lang/String;)[B
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v3, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/16 v6, 0x80

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    if-ge v5, v6, :cond_0

    .line 23
    .line 24
    int-to-byte v5, v5

    .line 25
    aput-byte v5, v1, v4

    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/16 v7, 0x800

    .line 31
    .line 32
    if-ge v5, v7, :cond_1

    .line 33
    .line 34
    shr-int/lit8 v7, v5, 0x6

    .line 35
    .line 36
    and-int/lit8 v7, v7, 0x1f

    .line 37
    .line 38
    or-int/lit16 v7, v7, 0xc0

    .line 39
    .line 40
    int-to-byte v7, v7

    .line 41
    aput-byte v7, v1, v4

    .line 42
    .line 43
    add-int/lit8 v7, v4, 0x1

    .line 44
    .line 45
    and-int/lit8 v5, v5, 0x3f

    .line 46
    .line 47
    or-int/2addr v5, v6

    .line 48
    int-to-byte v5, v5

    .line 49
    aput-byte v5, v1, v7

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    shr-int/lit8 v7, v5, 0xc

    .line 55
    .line 56
    and-int/lit8 v7, v7, 0xf

    .line 57
    .line 58
    or-int/lit16 v7, v7, 0xe0

    .line 59
    .line 60
    int-to-byte v7, v7

    .line 61
    aput-byte v7, v1, v4

    .line 62
    .line 63
    add-int/lit8 v7, v4, 0x1

    .line 64
    .line 65
    shr-int/lit8 v8, v5, 0x6

    .line 66
    .line 67
    and-int/lit8 v8, v8, 0x3f

    .line 68
    .line 69
    or-int/2addr v8, v6

    .line 70
    int-to-byte v8, v8

    .line 71
    aput-byte v8, v1, v7

    .line 72
    .line 73
    add-int/lit8 v7, v4, 0x2

    .line 74
    .line 75
    and-int/lit8 v5, v5, 0x3f

    .line 76
    .line 77
    or-int/2addr v5, v6

    .line 78
    int-to-byte v5, v5

    .line 79
    aput-byte v5, v1, v7

    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x3

    .line 82
    .line 83
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    new-array p0, v4, [B

    .line 87
    .line 88
    invoke-static {v1, v2, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method

.method private static throwBadUtf8(II)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "bad utf-8 byte "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " at offset "

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public static utf8BytesToString(Lcom/android/dx/util/ByteArray;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-lez v0, :cond_8

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    shr-int/lit8 v6, v5, 0x4

    .line 17
    .line 18
    const/16 v7, 0x80

    .line 19
    .line 20
    packed-switch v6, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    :pswitch_0
    invoke-static {v5, v4}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    add-int/lit8 v0, v0, -0x3

    .line 29
    .line 30
    if-gez v0, :cond_0

    .line 31
    .line 32
    invoke-static {v5, v4}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    add-int/lit8 v6, v4, 0x1

    .line 38
    .line 39
    invoke-virtual {p0, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    and-int/lit16 v9, v8, 0xc0

    .line 44
    .line 45
    if-eq v9, v7, :cond_1

    .line 46
    .line 47
    invoke-static {v8, v6}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    add-int/lit8 v6, v4, 0x2

    .line 53
    .line 54
    invoke-virtual {p0, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eq v9, v7, :cond_2

    .line 59
    .line 60
    invoke-static {v10, v6}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    and-int/lit8 v5, v5, 0xf

    .line 66
    .line 67
    shl-int/lit8 v5, v5, 0xc

    .line 68
    .line 69
    and-int/lit8 v7, v8, 0x3f

    .line 70
    .line 71
    shl-int/lit8 v7, v7, 0x6

    .line 72
    .line 73
    or-int/2addr v5, v7

    .line 74
    and-int/lit8 v7, v10, 0x3f

    .line 75
    .line 76
    or-int/2addr v5, v7

    .line 77
    const/16 v7, 0x800

    .line 78
    .line 79
    if-ge v5, v7, :cond_3

    .line 80
    .line 81
    invoke-static {v10, v6}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_3
    int-to-char v5, v5

    .line 87
    add-int/lit8 v4, v4, 0x3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_2
    add-int/lit8 v0, v0, -0x2

    .line 91
    .line 92
    if-gez v0, :cond_4

    .line 93
    .line 94
    invoke-static {v5, v4}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_4
    add-int/lit8 v6, v4, 0x1

    .line 100
    .line 101
    invoke-virtual {p0, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    and-int/lit16 v9, v8, 0xc0

    .line 106
    .line 107
    if-eq v9, v7, :cond_5

    .line 108
    .line 109
    invoke-static {v8, v6}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_5
    and-int/lit8 v5, v5, 0x1f

    .line 115
    .line 116
    shl-int/lit8 v5, v5, 0x6

    .line 117
    .line 118
    and-int/lit8 v9, v8, 0x3f

    .line 119
    .line 120
    or-int/2addr v5, v9

    .line 121
    if-eqz v5, :cond_6

    .line 122
    .line 123
    if-ge v5, v7, :cond_6

    .line 124
    .line 125
    invoke-static {v8, v6}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :cond_6
    int-to-char v5, v5

    .line 131
    add-int/lit8 v4, v4, 0x2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_3
    add-int/lit8 v0, v0, -0x1

    .line 135
    .line 136
    if-nez v5, :cond_7

    .line 137
    .line 138
    invoke-static {v5, v4}, Lcom/android/dx/rop/cst/CstString;->throwBadUtf8(II)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_7
    int-to-char v5, v5

    .line 144
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    :goto_1
    aput-char v5, v1, v3

    .line 147
    .line 148
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 153
    .line 154
    invoke-direct {p0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getBytes()Lcom/android/dx/util/ByteArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->STRING:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUtf16Size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getUtf8Size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->bytes:Lcom/android/dx/util/ByteArray;

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

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    mul-int/lit8 v2, v0, 0x3

    .line 10
    .line 11
    div-int/lit8 v2, v2, 0x2

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v0, :cond_d

    .line 19
    .line 20
    iget-object v4, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    const/16 v6, 0x7f

    .line 29
    .line 30
    const/16 v7, 0x5c

    .line 31
    .line 32
    if-lt v4, v5, :cond_2

    .line 33
    .line 34
    if-ge v4, v6, :cond_2

    .line 35
    .line 36
    const/16 v5, 0x27

    .line 37
    .line 38
    if-eq v4, v5, :cond_0

    .line 39
    .line 40
    const/16 v5, 0x22

    .line 41
    .line 42
    if-eq v4, v5, :cond_0

    .line 43
    .line 44
    if-ne v4, v7, :cond_1

    .line 45
    .line 46
    :cond_0
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_2
    if-gt v4, v6, :cond_b

    .line 55
    .line 56
    const/16 v5, 0x9

    .line 57
    .line 58
    if-eq v4, v5, :cond_a

    .line 59
    .line 60
    const/16 v5, 0xa

    .line 61
    .line 62
    if-eq v4, v5, :cond_9

    .line 63
    .line 64
    const/16 v5, 0xd

    .line 65
    .line 66
    if-eq v4, v5, :cond_8

    .line 67
    .line 68
    add-int/lit8 v5, v0, -0x1

    .line 69
    .line 70
    if-ge v3, v5, :cond_3

    .line 71
    .line 72
    iget-object v5, p0, Lcom/android/dx/rop/cst/CstString;->string:Ljava/lang/String;

    .line 73
    .line 74
    add-int/lit8 v6, v3, 0x1

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v5, v2

    .line 82
    :goto_1
    const/16 v6, 0x30

    .line 83
    .line 84
    const/4 v8, 0x1

    .line 85
    if-lt v5, v6, :cond_4

    .line 86
    .line 87
    const/16 v9, 0x37

    .line 88
    .line 89
    if-gt v5, v9, :cond_4

    .line 90
    .line 91
    move v5, v8

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move v5, v2

    .line 94
    :goto_2
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x6

    .line 98
    :goto_3
    if-ltz v7, :cond_7

    .line 99
    .line 100
    shr-int v9, v4, v7

    .line 101
    .line 102
    and-int/lit8 v9, v9, 0x7

    .line 103
    .line 104
    add-int/2addr v9, v6

    .line 105
    int-to-char v9, v9

    .line 106
    if-ne v9, v6, :cond_5

    .line 107
    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    :cond_5
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    move v5, v8

    .line 114
    :cond_6
    add-int/lit8 v7, v7, -0x3

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    if-nez v5, :cond_c

    .line 118
    .line 119
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    const-string v4, "\\r"

    .line 124
    .line 125
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_9
    const-string v4, "\\n"

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_a
    const-string v4, "\\t"

    .line 136
    .line 137
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_b
    const-string v5, "\\u"

    .line 142
    .line 143
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    shr-int/lit8 v5, v4, 0xc

    .line 147
    .line 148
    const/16 v6, 0x10

    .line 149
    .line 150
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    shr-int/lit8 v5, v4, 0x8

    .line 158
    .line 159
    and-int/lit8 v5, v5, 0xf

    .line 160
    .line 161
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    shr-int/lit8 v5, v4, 0x4

    .line 169
    .line 170
    and-int/lit8 v5, v5, 0xf

    .line 171
    .line 172
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    and-int/lit8 v4, v4, 0xf

    .line 180
    .line 181
    invoke-static {v4, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    :cond_c
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0
.end method

.method public toQuoted()Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x22

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toQuoted(I)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v1, p1, -0x2

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    const-string p1, ""

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    add-int/lit8 p1, p1, -0x5

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "..."

    .line 24
    .line 25
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\""

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const/16 p0, 0x22

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "string{\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "\"}"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "utf8"

    .line 2
    .line 3
    return-object p0
.end method
