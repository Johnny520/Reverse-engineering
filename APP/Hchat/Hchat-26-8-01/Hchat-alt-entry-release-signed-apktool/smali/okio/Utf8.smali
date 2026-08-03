.class public final Lokio/Utf8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final HIGH_SURROGATE_HEADER:I = 0xd7c0

.field public static final LOG_SURROGATE_HEADER:I = 0xdc00

.field public static final MASK_2BYTES:I = 0xf80

.field public static final MASK_3BYTES:I = -0x1e080

.field public static final MASK_4BYTES:I = 0x381f80

.field public static final REPLACEMENT_BYTE:B = 0x3ft

.field public static final REPLACEMENT_CHARACTER:C = '\ufffd'

.field public static final REPLACEMENT_CODE_POINT:I = 0xfffd


# direct methods
.method public static final isIsoControl(I)Z
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    if-ge p0, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x7f

    .line 9
    .line 10
    if-gt v0, p0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0xa0

    .line 13
    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static final isUtf8Continuation(B)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xc0

    .line 2
    .line 3
    const/16 v0, 0x80

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static final process2Utf8Bytes([BIILfg/l;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lfg/l;",
            ")I"
        }
    .end annotation

    .line 1
    const v0, 0xfffd

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-gt p2, v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    aget-byte p1, p0, p1

    .line 24
    .line 25
    aget-byte p0, p0, v1

    .line 26
    .line 27
    and-int/lit16 p2, p0, 0xc0

    .line 28
    .line 29
    const/16 v1, 0x80

    .line 30
    .line 31
    if-ne p2, v1, :cond_2

    .line 32
    .line 33
    xor-int/lit16 p0, p0, 0xf80

    .line 34
    .line 35
    shl-int/lit8 p1, p1, 0x6

    .line 36
    .line 37
    xor-int/2addr p0, p1

    .line 38
    if-ge p0, v1, :cond_1

    .line 39
    .line 40
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p3, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x2

    .line 52
    return p0

    .line 53
    :cond_2
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return v2
.end method

.method public static final process3Utf8Bytes([BIILfg/l;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lfg/l;",
            ")I"
        }
    .end annotation

    .line 1
    const v0, 0xfffd

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x2

    .line 15
    .line 16
    const/16 v2, 0x80

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x2

    .line 20
    if-gt p2, v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    add-int/2addr p1, v3

    .line 26
    if-le p2, p1, :cond_0

    .line 27
    .line 28
    aget-byte p0, p0, p1

    .line 29
    .line 30
    and-int/lit16 p0, p0, 0xc0

    .line 31
    .line 32
    if-ne p0, v2, :cond_0

    .line 33
    .line 34
    return v4

    .line 35
    :cond_0
    return v3

    .line 36
    :cond_1
    aget-byte p2, p0, p1

    .line 37
    .line 38
    add-int/2addr p1, v3

    .line 39
    aget-byte p1, p0, p1

    .line 40
    .line 41
    and-int/lit16 v5, p1, 0xc0

    .line 42
    .line 43
    if-ne v5, v2, :cond_5

    .line 44
    .line 45
    aget-byte p0, p0, v1

    .line 46
    .line 47
    and-int/lit16 v1, p0, 0xc0

    .line 48
    .line 49
    if-ne v1, v2, :cond_4

    .line 50
    .line 51
    const v1, -0x1e080

    .line 52
    .line 53
    .line 54
    xor-int/2addr p0, v1

    .line 55
    shl-int/lit8 p1, p1, 0x6

    .line 56
    .line 57
    xor-int/2addr p0, p1

    .line 58
    shl-int/lit8 p1, p2, 0xc

    .line 59
    .line 60
    xor-int/2addr p0, p1

    .line 61
    const/16 p1, 0x800

    .line 62
    .line 63
    if-ge p0, p1, :cond_2

    .line 64
    .line 65
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const p1, 0xd800

    .line 70
    .line 71
    .line 72
    if-gt p1, p0, :cond_3

    .line 73
    .line 74
    const p1, 0xe000

    .line 75
    .line 76
    .line 77
    if-ge p0, p1, :cond_3

    .line 78
    .line 79
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p3, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x3

    .line 91
    return p0

    .line 92
    :cond_4
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return v4

    .line 96
    :cond_5
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    return v3
.end method

.method public static final process4Utf8Bytes([BIILfg/l;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lfg/l;",
            ")I"
        }
    .end annotation

    .line 1
    const v0, 0xfffd

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x3

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/16 v4, 0x80

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    if-gt p2, v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    add-int/lit8 p3, p1, 0x1

    .line 27
    .line 28
    if-le p2, p3, :cond_1

    .line 29
    .line 30
    aget-byte p3, p0, p3

    .line 31
    .line 32
    and-int/lit16 p3, p3, 0xc0

    .line 33
    .line 34
    if-ne p3, v4, :cond_1

    .line 35
    .line 36
    add-int/2addr p1, v2

    .line 37
    if-le p2, p1, :cond_0

    .line 38
    .line 39
    aget-byte p0, p0, p1

    .line 40
    .line 41
    and-int/lit16 p0, p0, 0xc0

    .line 42
    .line 43
    if-ne p0, v4, :cond_0

    .line 44
    .line 45
    return v5

    .line 46
    :cond_0
    return v2

    .line 47
    :cond_1
    return v3

    .line 48
    :cond_2
    aget-byte p2, p0, p1

    .line 49
    .line 50
    add-int/lit8 v6, p1, 0x1

    .line 51
    .line 52
    aget-byte v6, p0, v6

    .line 53
    .line 54
    and-int/lit16 v7, v6, 0xc0

    .line 55
    .line 56
    if-ne v7, v4, :cond_8

    .line 57
    .line 58
    add-int/2addr p1, v2

    .line 59
    aget-byte p1, p0, p1

    .line 60
    .line 61
    and-int/lit16 v3, p1, 0xc0

    .line 62
    .line 63
    if-ne v3, v4, :cond_7

    .line 64
    .line 65
    aget-byte p0, p0, v1

    .line 66
    .line 67
    and-int/lit16 v1, p0, 0xc0

    .line 68
    .line 69
    if-ne v1, v4, :cond_6

    .line 70
    .line 71
    const v1, 0x381f80

    .line 72
    .line 73
    .line 74
    xor-int/2addr p0, v1

    .line 75
    shl-int/lit8 p1, p1, 0x6

    .line 76
    .line 77
    xor-int/2addr p0, p1

    .line 78
    shl-int/lit8 p1, v6, 0xc

    .line 79
    .line 80
    xor-int/2addr p0, p1

    .line 81
    shl-int/lit8 p1, p2, 0x12

    .line 82
    .line 83
    xor-int/2addr p0, p1

    .line 84
    const p1, 0x10ffff

    .line 85
    .line 86
    .line 87
    if-le p0, p1, :cond_3

    .line 88
    .line 89
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const p1, 0xd800

    .line 94
    .line 95
    .line 96
    if-gt p1, p0, :cond_4

    .line 97
    .line 98
    const p1, 0xe000

    .line 99
    .line 100
    .line 101
    if-ge p0, p1, :cond_4

    .line 102
    .line 103
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    const/high16 p1, 0x10000

    .line 108
    .line 109
    if-ge p0, p1, :cond_5

    .line 110
    .line 111
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-interface {p3, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :goto_0
    const/4 p0, 0x4

    .line 123
    return p0

    .line 124
    :cond_6
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return v5

    .line 128
    :cond_7
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    return v2

    .line 132
    :cond_8
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    return v3
.end method

.method public static final processUtf16Chars([BIILfg/l;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    const v0, 0xfffd

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    if-ge p1, p2, :cond_17

    .line 15
    .line 16
    aget-byte v2, p0, p1

    .line 17
    .line 18
    if-ltz v2, :cond_1

    .line 19
    .line 20
    int-to-char v2, v2

    .line 21
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    :goto_1
    if-ge p1, p2, :cond_0

    .line 31
    .line 32
    aget-byte v2, p0, p1

    .line 33
    .line 34
    if-ltz v2, :cond_0

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    int-to-char v2, v2

    .line 39
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    shr-int/lit8 v3, v2, 0x5

    .line 48
    .line 49
    const/4 v4, -0x2

    .line 50
    const/4 v5, 0x2

    .line 51
    const/16 v6, 0x80

    .line 52
    .line 53
    const/4 v7, 0x1

    .line 54
    if-ne v3, v4, :cond_7

    .line 55
    .line 56
    add-int/lit8 v3, p1, 0x1

    .line 57
    .line 58
    if-gt p2, v3, :cond_4

    .line 59
    .line 60
    :cond_2
    int-to-char v2, v0

    .line 61
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_2
    move v5, v7

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    aget-byte v3, p0, v3

    .line 71
    .line 72
    and-int/lit16 v4, v3, 0xc0

    .line 73
    .line 74
    if-ne v4, v6, :cond_2

    .line 75
    .line 76
    xor-int/lit16 v3, v3, 0xf80

    .line 77
    .line 78
    shl-int/lit8 v2, v2, 0x6

    .line 79
    .line 80
    xor-int/2addr v2, v3

    .line 81
    if-ge v2, v6, :cond_5

    .line 82
    .line 83
    int-to-char v2, v0

    .line 84
    :goto_3
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    int-to-char v2, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    :goto_4
    add-int/2addr p1, v5

    .line 95
    goto :goto_0

    .line 96
    :cond_7
    shr-int/lit8 v3, v2, 0x4

    .line 97
    .line 98
    const v8, 0xe000

    .line 99
    .line 100
    .line 101
    const v9, 0xd800

    .line 102
    .line 103
    .line 104
    const/4 v10, 0x3

    .line 105
    if-ne v3, v4, :cond_d

    .line 106
    .line 107
    add-int/lit8 v3, p1, 0x2

    .line 108
    .line 109
    if-gt p2, v3, :cond_8

    .line 110
    .line 111
    int-to-char v2, v0

    .line 112
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    add-int/lit8 v2, p1, 0x1

    .line 120
    .line 121
    if-le p2, v2, :cond_3

    .line 122
    .line 123
    aget-byte v2, p0, v2

    .line 124
    .line 125
    and-int/lit16 v2, v2, 0xc0

    .line 126
    .line 127
    if-ne v2, v6, :cond_3

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_8
    add-int/lit8 v4, p1, 0x1

    .line 131
    .line 132
    aget-byte v4, p0, v4

    .line 133
    .line 134
    and-int/lit16 v11, v4, 0xc0

    .line 135
    .line 136
    if-ne v11, v6, :cond_c

    .line 137
    .line 138
    aget-byte v3, p0, v3

    .line 139
    .line 140
    and-int/lit16 v7, v3, 0xc0

    .line 141
    .line 142
    if-ne v7, v6, :cond_b

    .line 143
    .line 144
    const v5, -0x1e080

    .line 145
    .line 146
    .line 147
    xor-int/2addr v3, v5

    .line 148
    shl-int/lit8 v4, v4, 0x6

    .line 149
    .line 150
    xor-int/2addr v3, v4

    .line 151
    shl-int/lit8 v2, v2, 0xc

    .line 152
    .line 153
    xor-int/2addr v2, v3

    .line 154
    const/16 v3, 0x800

    .line 155
    .line 156
    if-ge v2, v3, :cond_9

    .line 157
    .line 158
    :goto_5
    int-to-char v2, v0

    .line 159
    :goto_6
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_9
    if-gt v9, v2, :cond_a

    .line 168
    .line 169
    if-ge v2, v8, :cond_a

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_a
    int-to-char v2, v2

    .line 173
    goto :goto_6

    .line 174
    :goto_7
    move v5, v10

    .line 175
    goto :goto_4

    .line 176
    :cond_b
    int-to-char v2, v0

    .line 177
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_c
    int-to-char v2, v0

    .line 186
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_d
    shr-int/lit8 v3, v2, 0x3

    .line 195
    .line 196
    if-ne v3, v4, :cond_16

    .line 197
    .line 198
    add-int/lit8 v3, p1, 0x3

    .line 199
    .line 200
    if-gt p2, v3, :cond_e

    .line 201
    .line 202
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    add-int/lit8 v2, p1, 0x1

    .line 206
    .line 207
    if-le p2, v2, :cond_3

    .line 208
    .line 209
    aget-byte v2, p0, v2

    .line 210
    .line 211
    and-int/lit16 v2, v2, 0xc0

    .line 212
    .line 213
    if-ne v2, v6, :cond_3

    .line 214
    .line 215
    add-int/lit8 v2, p1, 0x2

    .line 216
    .line 217
    if-le p2, v2, :cond_6

    .line 218
    .line 219
    aget-byte v2, p0, v2

    .line 220
    .line 221
    and-int/lit16 v2, v2, 0xc0

    .line 222
    .line 223
    if-ne v2, v6, :cond_6

    .line 224
    .line 225
    :goto_8
    goto :goto_7

    .line 226
    :cond_e
    add-int/lit8 v4, p1, 0x1

    .line 227
    .line 228
    aget-byte v4, p0, v4

    .line 229
    .line 230
    and-int/lit16 v11, v4, 0xc0

    .line 231
    .line 232
    if-ne v11, v6, :cond_15

    .line 233
    .line 234
    add-int/lit8 v7, p1, 0x2

    .line 235
    .line 236
    aget-byte v7, p0, v7

    .line 237
    .line 238
    and-int/lit16 v11, v7, 0xc0

    .line 239
    .line 240
    if-ne v11, v6, :cond_14

    .line 241
    .line 242
    aget-byte v3, p0, v3

    .line 243
    .line 244
    and-int/lit16 v5, v3, 0xc0

    .line 245
    .line 246
    if-ne v5, v6, :cond_13

    .line 247
    .line 248
    const v5, 0x381f80

    .line 249
    .line 250
    .line 251
    xor-int/2addr v3, v5

    .line 252
    shl-int/lit8 v5, v7, 0x6

    .line 253
    .line 254
    xor-int/2addr v3, v5

    .line 255
    shl-int/lit8 v4, v4, 0xc

    .line 256
    .line 257
    xor-int/2addr v3, v4

    .line 258
    shl-int/lit8 v2, v2, 0x12

    .line 259
    .line 260
    xor-int/2addr v2, v3

    .line 261
    const v3, 0x10ffff

    .line 262
    .line 263
    .line 264
    if-le v2, v3, :cond_10

    .line 265
    .line 266
    :cond_f
    :goto_9
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_10
    if-gt v9, v2, :cond_11

    .line 271
    .line 272
    if-ge v2, v8, :cond_11

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_11
    const/high16 v3, 0x10000

    .line 276
    .line 277
    if-ge v2, v3, :cond_12

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_12
    if-eq v2, v0, :cond_f

    .line 281
    .line 282
    ushr-int/lit8 v3, v2, 0xa

    .line 283
    .line 284
    const v4, 0xd7c0

    .line 285
    .line 286
    .line 287
    add-int/2addr v3, v4

    .line 288
    int-to-char v3, v3

    .line 289
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-interface {p3, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    and-int/lit16 v2, v2, 0x3ff

    .line 297
    .line 298
    const v3, 0xdc00

    .line 299
    .line 300
    .line 301
    add-int/2addr v2, v3

    .line 302
    int-to-char v2, v2

    .line 303
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    :goto_a
    const/4 v5, 0x4

    .line 311
    goto/16 :goto_4

    .line 312
    .line 313
    :cond_13
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_14
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    goto/16 :goto_4

    .line 321
    .line 322
    :cond_15
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    goto/16 :goto_2

    .line 326
    .line 327
    :cond_16
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    add-int/lit8 p1, p1, 0x1

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_17
    return-void
.end method

.method public static final processUtf8Bytes(Ljava/lang/String;IILfg/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :cond_0
    :goto_0
    if-ge p1, p2, :cond_5

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    invoke-static {v0, v1}, Lgg/l;->c(II)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    int-to-byte v0, v0

    .line 22
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    :goto_1
    if-ge p1, p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0, v1}, Lgg/l;->c(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-gez v0, :cond_0

    .line 42
    .line 43
    add-int/lit8 v0, p1, 0x1

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-byte p1, p1

    .line 50
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move p1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/16 v2, 0x800

    .line 60
    .line 61
    invoke-static {v0, v2}, Lgg/l;->c(II)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-gez v2, :cond_2

    .line 66
    .line 67
    shr-int/lit8 v2, v0, 0x6

    .line 68
    .line 69
    or-int/lit16 v2, v2, 0xc0

    .line 70
    .line 71
    int-to-byte v2, v2

    .line 72
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    and-int/lit8 v0, v0, 0x3f

    .line 80
    .line 81
    or-int/2addr v0, v1

    .line 82
    int-to-byte v0, v0

    .line 83
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    const v2, 0xd800

    .line 94
    .line 95
    .line 96
    const/16 v3, 0x3f

    .line 97
    .line 98
    if-gt v2, v0, :cond_4

    .line 99
    .line 100
    const v2, 0xe000

    .line 101
    .line 102
    .line 103
    if-ge v0, v2, :cond_4

    .line 104
    .line 105
    const v4, 0xdbff

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v4}, Lgg/l;->c(II)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-gtz v4, :cond_3

    .line 113
    .line 114
    add-int/lit8 v4, p1, 0x1

    .line 115
    .line 116
    if-le p2, v4, :cond_3

    .line 117
    .line 118
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const v6, 0xdc00

    .line 123
    .line 124
    .line 125
    if-gt v6, v5, :cond_3

    .line 126
    .line 127
    if-ge v5, v2, :cond_3

    .line 128
    .line 129
    shl-int/lit8 v0, v0, 0xa

    .line 130
    .line 131
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    add-int/2addr v2, v0

    .line 136
    const v0, -0x35fdc00

    .line 137
    .line 138
    .line 139
    add-int/2addr v2, v0

    .line 140
    shr-int/lit8 v0, v2, 0x12

    .line 141
    .line 142
    or-int/lit16 v0, v0, 0xf0

    .line 143
    .line 144
    int-to-byte v0, v0

    .line 145
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    shr-int/lit8 v0, v2, 0xc

    .line 153
    .line 154
    and-int/2addr v0, v3

    .line 155
    or-int/2addr v0, v1

    .line 156
    int-to-byte v0, v0

    .line 157
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    shr-int/lit8 v0, v2, 0x6

    .line 165
    .line 166
    and-int/2addr v0, v3

    .line 167
    or-int/2addr v0, v1

    .line 168
    int-to-byte v0, v0

    .line 169
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    and-int/lit8 v0, v2, 0x3f

    .line 177
    .line 178
    or-int/2addr v0, v1

    .line 179
    int-to-byte v0, v0

    .line 180
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    add-int/lit8 p1, p1, 0x2

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_3
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    shr-int/lit8 v2, v0, 0xc

    .line 200
    .line 201
    or-int/lit16 v2, v2, 0xe0

    .line 202
    .line 203
    int-to-byte v2, v2

    .line 204
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    shr-int/lit8 v2, v0, 0x6

    .line 212
    .line 213
    and-int/2addr v2, v3

    .line 214
    or-int/2addr v2, v1

    .line 215
    int-to-byte v2, v2

    .line 216
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-interface {p3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    and-int/lit8 v0, v0, 0x3f

    .line 224
    .line 225
    or-int/2addr v0, v1

    .line 226
    int-to-byte v0, v0

    .line 227
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    goto/16 :goto_2

    .line 235
    .line 236
    :cond_5
    return-void
.end method

.method public static final processUtf8CodePoints([BIILfg/l;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    const v0, 0xfffd

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    if-ge p1, p2, :cond_16

    .line 15
    .line 16
    aget-byte v1, p0, p1

    .line 17
    .line 18
    if-ltz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    :goto_1
    if-ge p1, p2, :cond_0

    .line 30
    .line 31
    aget-byte v1, p0, p1

    .line 32
    .line 33
    if-ltz v1, :cond_0

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    shr-int/lit8 v2, v1, 0x5

    .line 46
    .line 47
    const/4 v3, -0x2

    .line 48
    const/4 v4, 0x2

    .line 49
    const/16 v5, 0x80

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    if-ne v2, v3, :cond_7

    .line 53
    .line 54
    add-int/lit8 v2, p1, 0x1

    .line 55
    .line 56
    if-gt p2, v2, :cond_4

    .line 57
    .line 58
    :cond_2
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_2
    move v4, v6

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    aget-byte v2, p0, v2

    .line 64
    .line 65
    and-int/lit16 v3, v2, 0xc0

    .line 66
    .line 67
    if-ne v3, v5, :cond_2

    .line 68
    .line 69
    xor-int/lit16 v2, v2, 0xf80

    .line 70
    .line 71
    shl-int/lit8 v1, v1, 0x6

    .line 72
    .line 73
    xor-int/2addr v1, v2

    .line 74
    if-ge v1, v5, :cond_5

    .line 75
    .line 76
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_6
    :goto_3
    add-int/2addr p1, v4

    .line 88
    goto :goto_0

    .line 89
    :cond_7
    shr-int/lit8 v2, v1, 0x4

    .line 90
    .line 91
    const v7, 0xe000

    .line 92
    .line 93
    .line 94
    const v8, 0xd800

    .line 95
    .line 96
    .line 97
    const/4 v9, 0x3

    .line 98
    if-ne v2, v3, :cond_d

    .line 99
    .line 100
    add-int/lit8 v2, p1, 0x2

    .line 101
    .line 102
    if-gt p2, v2, :cond_8

    .line 103
    .line 104
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v1, p1, 0x1

    .line 108
    .line 109
    if-le p2, v1, :cond_3

    .line 110
    .line 111
    aget-byte v1, p0, v1

    .line 112
    .line 113
    and-int/lit16 v1, v1, 0xc0

    .line 114
    .line 115
    if-ne v1, v5, :cond_3

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_8
    add-int/lit8 v3, p1, 0x1

    .line 119
    .line 120
    aget-byte v3, p0, v3

    .line 121
    .line 122
    and-int/lit16 v10, v3, 0xc0

    .line 123
    .line 124
    if-ne v10, v5, :cond_c

    .line 125
    .line 126
    aget-byte v2, p0, v2

    .line 127
    .line 128
    and-int/lit16 v6, v2, 0xc0

    .line 129
    .line 130
    if-ne v6, v5, :cond_b

    .line 131
    .line 132
    const v4, -0x1e080

    .line 133
    .line 134
    .line 135
    xor-int/2addr v2, v4

    .line 136
    shl-int/lit8 v3, v3, 0x6

    .line 137
    .line 138
    xor-int/2addr v2, v3

    .line 139
    shl-int/lit8 v1, v1, 0xc

    .line 140
    .line 141
    xor-int/2addr v1, v2

    .line 142
    const/16 v2, 0x800

    .line 143
    .line 144
    if-ge v1, v2, :cond_9

    .line 145
    .line 146
    :goto_4
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_9
    if-gt v8, v1, :cond_a

    .line 151
    .line 152
    if-ge v1, v7, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :goto_5
    move v4, v9

    .line 163
    goto :goto_3

    .line 164
    :cond_b
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_c
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_d
    shr-int/lit8 v2, v1, 0x3

    .line 173
    .line 174
    if-ne v2, v3, :cond_15

    .line 175
    .line 176
    add-int/lit8 v2, p1, 0x3

    .line 177
    .line 178
    if-gt p2, v2, :cond_e

    .line 179
    .line 180
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    add-int/lit8 v1, p1, 0x1

    .line 184
    .line 185
    if-le p2, v1, :cond_3

    .line 186
    .line 187
    aget-byte v1, p0, v1

    .line 188
    .line 189
    and-int/lit16 v1, v1, 0xc0

    .line 190
    .line 191
    if-ne v1, v5, :cond_3

    .line 192
    .line 193
    add-int/lit8 v1, p1, 0x2

    .line 194
    .line 195
    if-le p2, v1, :cond_6

    .line 196
    .line 197
    aget-byte v1, p0, v1

    .line 198
    .line 199
    and-int/lit16 v1, v1, 0xc0

    .line 200
    .line 201
    if-ne v1, v5, :cond_6

    .line 202
    .line 203
    :goto_6
    goto :goto_5

    .line 204
    :cond_e
    add-int/lit8 v3, p1, 0x1

    .line 205
    .line 206
    aget-byte v3, p0, v3

    .line 207
    .line 208
    and-int/lit16 v10, v3, 0xc0

    .line 209
    .line 210
    if-ne v10, v5, :cond_14

    .line 211
    .line 212
    add-int/lit8 v6, p1, 0x2

    .line 213
    .line 214
    aget-byte v6, p0, v6

    .line 215
    .line 216
    and-int/lit16 v10, v6, 0xc0

    .line 217
    .line 218
    if-ne v10, v5, :cond_13

    .line 219
    .line 220
    aget-byte v2, p0, v2

    .line 221
    .line 222
    and-int/lit16 v4, v2, 0xc0

    .line 223
    .line 224
    if-ne v4, v5, :cond_12

    .line 225
    .line 226
    const v4, 0x381f80

    .line 227
    .line 228
    .line 229
    xor-int/2addr v2, v4

    .line 230
    shl-int/lit8 v4, v6, 0x6

    .line 231
    .line 232
    xor-int/2addr v2, v4

    .line 233
    shl-int/lit8 v3, v3, 0xc

    .line 234
    .line 235
    xor-int/2addr v2, v3

    .line 236
    shl-int/lit8 v1, v1, 0x12

    .line 237
    .line 238
    xor-int/2addr v1, v2

    .line 239
    const v2, 0x10ffff

    .line 240
    .line 241
    .line 242
    if-le v1, v2, :cond_f

    .line 243
    .line 244
    :goto_7
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_f
    if-gt v8, v1, :cond_10

    .line 249
    .line 250
    if-ge v1, v7, :cond_10

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_10
    const/high16 v2, 0x10000

    .line 254
    .line 255
    if-ge v1, v2, :cond_11

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-interface {p3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :goto_8
    const/4 v4, 0x4

    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :cond_12
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_13
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    goto/16 :goto_3

    .line 276
    .line 277
    :cond_14
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto/16 :goto_2

    .line 281
    .line 282
    :cond_15
    invoke-interface {p3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    add-int/lit8 p1, p1, 0x1

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_16
    return-void
.end method

.method public static final size(Ljava/lang/String;)J
    .locals 3

    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, Lokio/Utf8;->size$default(Ljava/lang/String;IIILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final size(Ljava/lang/String;I)J
    .locals 3

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/Utf8;->size$default(Ljava/lang/String;IIILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final size(Ljava/lang/String;II)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_a

    .line 5
    .line 6
    if-lt p2, p1, :cond_9

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gt p2, v0, :cond_8

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    if-ge p1, p2, :cond_7

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x80

    .line 23
    .line 24
    const-wide/16 v4, 0x1

    .line 25
    .line 26
    if-ge v2, v3, :cond_0

    .line 27
    .line 28
    add-long/2addr v0, v4

    .line 29
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v3, 0x800

    .line 33
    .line 34
    if-ge v2, v3, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    :goto_2
    int-to-long v2, v2

    .line 38
    add-long/2addr v0, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const v3, 0xd800

    .line 41
    .line 42
    .line 43
    if-lt v2, v3, :cond_6

    .line 44
    .line 45
    const v3, 0xdfff

    .line 46
    .line 47
    .line 48
    if-le v2, v3, :cond_2

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    add-int/lit8 v6, p1, 0x1

    .line 52
    .line 53
    if-ge v6, p2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    const/4 v7, 0x0

    .line 61
    :goto_3
    const v8, 0xdbff

    .line 62
    .line 63
    .line 64
    if-gt v2, v8, :cond_5

    .line 65
    .line 66
    const v2, 0xdc00

    .line 67
    .line 68
    .line 69
    if-lt v7, v2, :cond_5

    .line 70
    .line 71
    if-le v7, v3, :cond_4

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    const/4 v2, 0x4

    .line 75
    int-to-long v2, v2

    .line 76
    add-long/2addr v0, v2

    .line 77
    add-int/lit8 p1, p1, 0x2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    :goto_4
    add-long/2addr v0, v4

    .line 81
    move p1, v6

    .line 82
    goto :goto_0

    .line 83
    :cond_6
    :goto_5
    const/4 v2, 0x3

    .line 84
    goto :goto_2

    .line 85
    :cond_7
    return-wide v0

    .line 86
    :cond_8
    const-string p1, "endIndex > string.length: "

    .line 87
    .line 88
    const-string v0, " > "

    .line 89
    .line 90
    invoke-static {p2, p1, v0}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-static {p0, p1}, Lokio/a;->e(ILjava/lang/StringBuilder;)V

    .line 99
    .line 100
    .line 101
    :goto_6
    const-wide/16 p0, 0x0

    .line 102
    .line 103
    return-wide p0

    .line 104
    :cond_9
    const-string p0, "endIndex < beginIndex: "

    .line 105
    .line 106
    const-string v0, " < "

    .line 107
    .line 108
    invoke-static {p2, p0, v0, p1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_a
    const-string p0, "beginIndex < 0: "

    .line 117
    .line 118
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_6
.end method

.method public static synthetic size$default(Ljava/lang/String;IIILjava/lang/Object;)J
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    :cond_1
    invoke-static {p0, p1, p2}, Lokio/Utf8;->size(Ljava/lang/String;II)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    return-wide p0
.end method
