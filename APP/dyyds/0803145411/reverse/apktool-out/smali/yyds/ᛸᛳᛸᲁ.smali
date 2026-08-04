.class public final Lyyds/ᛸᛳᛸᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᲀᛷᛴ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    const-string v1, "->"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {p1, v1, v2, v2, v0}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v1, v0, 0x1

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    const-string v4, ":"

    .line 29
    .line 30
    invoke-static {p1, v4, v1, v2, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, -0x1

    .line 35
    if-eq v0, v3, :cond_0

    .line 36
    .line 37
    if-eq v1, v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, p0, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance p0, Ljava/lang/IllegalAccessError;

    .line 71
    .line 72
    const-string v0, "not field descriptor: "

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛸᛳᛸᲁ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛸᛳᛸᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 5
    .line 6
    sget-object v1, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1, v2}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, p0, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1, v3}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 25
    .line 26
    invoke-direct {v3, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v3

    .line 30
    :goto_0
    invoke-static {p1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "Field "

    .line 35
    .line 36
    if-nez v3, :cond_7

    .line 37
    .line 38
    check-cast p1, Ljava/lang/Class;

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    :goto_1
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_1
    move-exception v6

    .line 54
    new-instance v7, Lyyds/ᲈᛵᛵᛴ;

    .line 55
    .line 56
    invoke-direct {v7, v6}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_2
    instance-of v6, v7, Lyyds/ᲈᛵᛵᛴ;

    .line 60
    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_0
    move-object v5, v7

    .line 65
    :goto_3
    check-cast v5, Ljava/lang/reflect/Field;

    .line 66
    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-static {v6, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object p1, v2

    .line 86
    :goto_4
    if-eqz p1, :cond_5

    .line 87
    .line 88
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/4 v7, 0x0

    .line 93
    :goto_5
    array-length v8, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 94
    if-ge v7, v8, :cond_4

    .line 95
    .line 96
    add-int/lit8 v8, v7, 0x1

    .line 97
    .line 98
    :try_start_3
    aget-object v7, v3, v7
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    .line 100
    :try_start_4
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-static {v1, v9}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    check-cast v9, Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v10}, Lyyds/ᲇᛳᲈᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v9, v10}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_3

    .line 129
    .line 130
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 131
    .line 132
    .line 133
    move-object v5, v7

    .line 134
    goto :goto_6

    .line 135
    :cond_3
    move v7, v8

    .line 136
    goto :goto_5

    .line 137
    :catch_0
    move-exception p1

    .line 138
    new-instance v3, Ljava/util/NoSuchElementException;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {v3, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v3

    .line 148
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 152
    goto :goto_4

    .line 153
    :catchall_2
    :cond_5
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v2, v1, p1, v5}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-eqz v5, :cond_6

    .line 164
    .line 165
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 166
    .line 167
    .line 168
    :goto_6
    return-object v5

    .line 169
    :cond_6
    new-instance p1, Ljava/lang/NoSuchFieldException;

    .line 170
    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p0, " not found"

    .line 180
    .line 181
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-direct {p1, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_7
    new-instance p1, Ljava/lang/NoSuchFieldException;

    .line 193
    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string p0, " not available: type missing"

    .line 203
    .line 204
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-direct {p1, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 215
    .line 216
    .line 217
    throw p1
.end method


# virtual methods
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
    instance-of v1, p1, Lyyds/ᛸᛳᛸᲁ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᛸᛳᛸᲁ;

    .line 12
    .line 13
    iget-object v1, p1, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, p1, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object p0, p0, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lyyds/ᲇᛳᲈᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "->"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lyyds/ᛸᛳᛸᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ":"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛸᛳᛸᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 28
    .line 29
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
