.class public final Ld7/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Ld7/d;


# direct methods
.method public constructor <init>(Ld7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld7/c;->a:Ld7/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/c;->a:Ld7/d;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ld7/s;->O(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Ld7/c;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Ld7/c;

    .line 18
    .line 19
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p1}, Ld7/c;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne v2, p1, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "0"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->toOctalString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "-"

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    const/4 v3, 0x0

    .line 45
    move v5, v2

    .line 46
    move v4, v3

    .line 47
    :goto_0
    const/4 v6, 0x2

    .line 48
    if-ge v4, v6, :cond_0

    .line 49
    .line 50
    mul-int/lit8 v5, v5, 0x8

    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    mul-int/lit8 v7, v5, 0x8

    .line 60
    .line 61
    rem-int/2addr v4, v7

    .line 62
    div-int/2addr v4, v5

    .line 63
    and-int/lit8 v5, v4, 0x4

    .line 64
    .line 65
    const/16 v7, 0x72

    .line 66
    .line 67
    const/16 v8, 0x2d

    .line 68
    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    move v5, v7

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v5, v8

    .line 74
    :goto_1
    int-to-byte v5, v5

    .line 75
    and-int/lit8 v9, v4, 0x2

    .line 76
    .line 77
    const/16 v10, 0x77

    .line 78
    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    move v9, v10

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move v9, v8

    .line 84
    :goto_2
    int-to-byte v9, v9

    .line 85
    and-int/2addr v4, v2

    .line 86
    const/16 v11, 0x78

    .line 87
    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    move v4, v11

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move v4, v8

    .line 93
    :goto_3
    int-to-byte v4, v4

    .line 94
    const/4 v12, 0x3

    .line 95
    new-array v13, v12, [B

    .line 96
    .line 97
    aput-byte v5, v13, v3

    .line 98
    .line 99
    aput-byte v9, v13, v2

    .line 100
    .line 101
    aput-byte v4, v13, v6

    .line 102
    .line 103
    new-instance v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {v4, v13}, Ljava/lang/String;-><init>([B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    rem-int/lit8 v4, v4, 0x40

    .line 116
    .line 117
    div-int/lit8 v4, v4, 0x8

    .line 118
    .line 119
    and-int/lit8 v5, v4, 0x4

    .line 120
    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    move v5, v7

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    move v5, v8

    .line 126
    :goto_4
    int-to-byte v5, v5

    .line 127
    and-int/lit8 v9, v4, 0x2

    .line 128
    .line 129
    if-eqz v9, :cond_5

    .line 130
    .line 131
    move v9, v10

    .line 132
    goto :goto_5

    .line 133
    :cond_5
    move v9, v8

    .line 134
    :goto_5
    int-to-byte v9, v9

    .line 135
    and-int/2addr v4, v2

    .line 136
    if-eqz v4, :cond_6

    .line 137
    .line 138
    move v4, v11

    .line 139
    goto :goto_6

    .line 140
    :cond_6
    move v4, v8

    .line 141
    :goto_6
    int-to-byte v4, v4

    .line 142
    new-array v13, v12, [B

    .line 143
    .line 144
    aput-byte v5, v13, v3

    .line 145
    .line 146
    aput-byte v9, v13, v2

    .line 147
    .line 148
    aput-byte v4, v13, v6

    .line 149
    .line 150
    new-instance v4, Ljava/lang/String;

    .line 151
    .line 152
    invoke-direct {v4, v13}, Ljava/lang/String;-><init>([B)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Ld7/c;->a()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    rem-int/lit8 v4, v4, 0x8

    .line 163
    .line 164
    and-int/lit8 v5, v4, 0x4

    .line 165
    .line 166
    if-eqz v5, :cond_7

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_7
    move v7, v8

    .line 170
    :goto_7
    int-to-byte v5, v7

    .line 171
    and-int/lit8 v7, v4, 0x2

    .line 172
    .line 173
    if-eqz v7, :cond_8

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_8
    move v10, v8

    .line 177
    :goto_8
    int-to-byte v7, v10

    .line 178
    and-int/2addr v4, v2

    .line 179
    if-eqz v4, :cond_9

    .line 180
    .line 181
    move v8, v11

    .line 182
    :cond_9
    int-to-byte v4, v8

    .line 183
    new-array v8, v12, [B

    .line 184
    .line 185
    aput-byte v5, v8, v3

    .line 186
    .line 187
    aput-byte v7, v8, v2

    .line 188
    .line 189
    aput-byte v4, v8, v6

    .line 190
    .line 191
    new-instance v2, Ljava/lang/String;

    .line 192
    .line 193
    invoke-direct {v2, v8}, Ljava/lang/String;-><init>([B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0
.end method
