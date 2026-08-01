.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "",
        "",
        "input",
        "",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170",
        "(Ljava/lang/String;)[B",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_0

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    aput-byte v4, v1, v3

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_1
    const/16 v3, 0x1a

    .line 17
    .line 18
    if-ge v0, v3, :cond_1

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x41

    .line 21
    .line 22
    int-to-byte v4, v0

    .line 23
    aput-byte v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v3, v0, 0x61

    .line 26
    .line 27
    add-int/lit8 v4, v0, 0x1a

    .line 28
    .line 29
    int-to-byte v4, v4

    .line 30
    aput-byte v4, v1, v3

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_2
    const/16 v0, 0xa

    .line 36
    .line 37
    if-ge v2, v0, :cond_2

    .line 38
    .line 39
    add-int/lit8 v0, v2, 0x30

    .line 40
    .line 41
    add-int/lit8 v3, v2, 0x34

    .line 42
    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v0

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v0, 0x2b

    .line 50
    .line 51
    const/16 v2, 0x3e

    .line 52
    .line 53
    aput-byte v2, v1, v0

    .line 54
    .line 55
    const/16 v0, 0x2f

    .line 56
    .line 57
    const/16 v2, 0x3f

    .line 58
    .line 59
    aput-byte v2, v1, v0

    .line 60
    .line 61
    sput-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 62
    .line 63
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[B
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_e

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_7

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3d

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v4, v1, -0x1

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-ne v4, v2, :cond_1

    .line 28
    .line 29
    move v4, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, v0

    .line 32
    :goto_0
    if-le v1, v3, :cond_2

    .line 33
    .line 34
    add-int/lit8 v3, v1, -0x2

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ne v3, v2, :cond_2

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    :cond_2
    mul-int/lit8 v3, v1, 0x3

    .line 45
    .line 46
    div-int/lit8 v3, v3, 0x4

    .line 47
    .line 48
    sub-int/2addr v3, v4

    .line 49
    if-gez v3, :cond_3

    .line 50
    .line 51
    move v3, v0

    .line 52
    :cond_3
    new-array v4, v3, [B

    .line 53
    .line 54
    move v5, v0

    .line 55
    move v6, v5

    .line 56
    :goto_1
    if-ge v5, v1, :cond_d

    .line 57
    .line 58
    add-int/lit8 v7, v5, 0x1

    .line 59
    .line 60
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    const/16 v9, 0x41

    .line 65
    .line 66
    if-ge v7, v1, :cond_4

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x2

    .line 69
    .line 70
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move v5, v7

    .line 76
    move v7, v9

    .line 77
    :goto_2
    if-ge v5, v1, :cond_5

    .line 78
    .line 79
    add-int/lit8 v10, v5, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move v10, v5

    .line 87
    move v5, v9

    .line 88
    :goto_3
    if-ge v10, v1, :cond_6

    .line 89
    .line 90
    add-int/lit8 v9, v10, 0x1

    .line 91
    .line 92
    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    move v12, v10

    .line 98
    move v10, v9

    .line 99
    move v9, v12

    .line 100
    :goto_4
    const/16 v11, 0x80

    .line 101
    .line 102
    if-ge v8, v11, :cond_c

    .line 103
    .line 104
    if-ge v7, v11, :cond_c

    .line 105
    .line 106
    if-ge v5, v11, :cond_c

    .line 107
    .line 108
    if-ge v10, v11, :cond_c

    .line 109
    .line 110
    sget-object v11, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 111
    .line 112
    aget-byte v8, v11, v8

    .line 113
    .line 114
    aget-byte v7, v11, v7

    .line 115
    .line 116
    if-ne v5, v2, :cond_7

    .line 117
    .line 118
    move v5, v0

    .line 119
    goto :goto_5

    .line 120
    :cond_7
    aget-byte v5, v11, v5

    .line 121
    .line 122
    :goto_5
    if-ne v10, v2, :cond_8

    .line 123
    .line 124
    move v10, v0

    .line 125
    goto :goto_6

    .line 126
    :cond_8
    aget-byte v10, v11, v10

    .line 127
    .line 128
    :goto_6
    shl-int/lit8 v8, v8, 0x12

    .line 129
    .line 130
    shl-int/lit8 v7, v7, 0xc

    .line 131
    .line 132
    or-int/2addr v7, v8

    .line 133
    shl-int/lit8 v5, v5, 0x6

    .line 134
    .line 135
    or-int/2addr v5, v7

    .line 136
    or-int/2addr v5, v10

    .line 137
    if-ge v6, v3, :cond_9

    .line 138
    .line 139
    add-int/lit8 v7, v6, 0x1

    .line 140
    .line 141
    shr-int/lit8 v8, v5, 0x10

    .line 142
    .line 143
    int-to-byte v8, v8

    .line 144
    aput-byte v8, v4, v6

    .line 145
    .line 146
    move v6, v7

    .line 147
    :cond_9
    if-ge v6, v3, :cond_a

    .line 148
    .line 149
    add-int/lit8 v7, v6, 0x1

    .line 150
    .line 151
    shr-int/lit8 v8, v5, 0x8

    .line 152
    .line 153
    int-to-byte v8, v8

    .line 154
    aput-byte v8, v4, v6

    .line 155
    .line 156
    move v6, v7

    .line 157
    :cond_a
    if-ge v6, v3, :cond_b

    .line 158
    .line 159
    add-int/lit8 v7, v6, 0x1

    .line 160
    .line 161
    int-to-byte v5, v5

    .line 162
    aput-byte v5, v4, v6

    .line 163
    .line 164
    move v6, v7

    .line 165
    :cond_b
    move v5, v9

    .line 166
    goto :goto_1

    .line 167
    :cond_c
    const-string p0, "Invalid Base64 character"

    .line 168
    .line 169
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 p0, 0x0

    .line 173
    return-object p0

    .line 174
    :cond_d
    return-object v4

    .line 175
    :cond_e
    :goto_7
    new-array p0, v0, [B

    .line 176
    .line 177
    return-object p0
.end method
