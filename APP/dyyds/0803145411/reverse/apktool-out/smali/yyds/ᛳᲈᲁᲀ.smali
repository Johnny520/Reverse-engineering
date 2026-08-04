.class public final Lyyds/ᛳᲈᲁᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᲀᛷᛴ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛱᛲᛶᛱ;

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lyyds/ᛱᛲᛶᛱ;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛲᛶᛱ;

    .line 16
    .line 17
    const-string v0, "->"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {p1, v0, v2, v2, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/lit8 v1, v0, 0x1

    .line 25
    .line 26
    const-string v3, "("

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    invoke-static {p1, v3, v1, v2, v4}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/lit8 v3, v1, 0x1

    .line 34
    .line 35
    const-string v5, ")"

    .line 36
    .line 37
    invoke-static {p1, v5, v3, v2, v4}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, -0x1

    .line 42
    if-eq v0, v6, :cond_4

    .line 43
    .line 44
    if-eq v1, v6, :cond_4

    .line 45
    .line 46
    if-eq v5, v6, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v6}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iput-object v6, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x2

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    :goto_0
    move v3, v2

    .line 76
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-ge v2, v6, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/16 v7, 0x4c

    .line 87
    .line 88
    if-eq v6, v7, :cond_1

    .line 89
    .line 90
    const/16 v7, 0x5b

    .line 91
    .line 92
    if-eq v6, v7, :cond_0

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/16 v6, 0x3b

    .line 99
    .line 100
    invoke-static {v0, v6, v2, v4}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v3}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    if-ne v3, v2, :cond_3

    .line 119
    .line 120
    iput-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, p0, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    const-string p0, "Unknown signString: "

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const/4 p0, 0x0

    .line 145
    throw p0

    .line 146
    :cond_4
    new-instance p0, Ljava/lang/IllegalAccessError;

    .line 147
    .line 148
    const-string v0, "not method descriptor: "

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛲᛶᛱ;

    .line 5
    .line 6
    sget-object v1, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "<clinit>"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_9

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_9

    .line 23
    .line 24
    iget-object v2, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1, v2}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {p1, v3}, Lyyds/ᲀᛳᛴᛵ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "Method "

    .line 41
    .line 42
    if-nez v4, :cond_8

    .line 43
    .line 44
    check-cast v3, [Ljava/lang/Class;

    .line 45
    .line 46
    iget-object v4, p0, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p1, v4}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    new-instance v4, Lyyds/ᲈᛵᛵᛴ;

    .line 55
    .line 56
    invoke-direct {v4, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v4

    .line 60
    :goto_0
    invoke-static {p1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_7

    .line 65
    .line 66
    check-cast p1, Ljava/lang/Class;

    .line 67
    .line 68
    move-object v4, v2

    .line 69
    :goto_1
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x1

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    :try_start_1
    array-length v8, v3

    .line 74
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, [Ljava/lang/Class;

    .line 79
    .line 80
    invoke-virtual {v4, v1, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_1
    move-exception v7

    .line 89
    new-instance v8, Lyyds/ᲈᛵᛵᛴ;

    .line 90
    .line 91
    invoke-direct {v8, v7}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    instance-of v7, v8, Lyyds/ᲈᛵᛵᛴ;

    .line 95
    .line 96
    if-eqz v7, :cond_0

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_0
    move-object v6, v8

    .line 100
    :goto_3
    check-cast v6, Ljava/lang/reflect/Method;

    .line 101
    .line 102
    if-eqz v6, :cond_1

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v7, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_1

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move-object p1, v2

    .line 121
    :goto_4
    if-eqz p1, :cond_5

    .line 122
    .line 123
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const/4 v4, 0x0

    .line 128
    :goto_5
    array-length v8, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 129
    if-ge v4, v8, :cond_4

    .line 130
    .line 131
    add-int/lit8 v8, v4, 0x1

    .line 132
    .line 133
    :try_start_3
    aget-object v4, v3, v4
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 134
    .line 135
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-static {v9, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eqz v9, :cond_3

    .line 144
    .line 145
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    check-cast v9, Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v4}, Lyyds/ᲇᛳᲈᲁ;->ᛲᲈᲁ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-static {v9, v10}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_3

    .line 160
    .line 161
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 162
    .line 163
    .line 164
    move-object v6, v4

    .line 165
    goto :goto_6

    .line 166
    :cond_3
    move v4, v8

    .line 167
    goto :goto_5

    .line 168
    :catch_0
    move-exception p1

    .line 169
    new-instance v3, Ljava/util/NoSuchElementException;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {v3, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v3

    .line 179
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 183
    goto :goto_4

    .line 184
    :catchall_2
    :cond_5
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v2, v1, p1, v6}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-eqz p1, :cond_6

    .line 195
    .line 196
    move-object v6, p1

    .line 197
    check-cast v6, Ljava/lang/reflect/Method;

    .line 198
    .line 199
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 200
    .line 201
    .line 202
    :goto_6
    return-object v6

    .line 203
    :cond_6
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string p0, " not found"

    .line 214
    .line 215
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p1

    .line 226
    :cond_7
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 227
    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string p0, " not available: return type missing"

    .line 237
    .line 238
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :cond_8
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 253
    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string p0, " not available: parameter type(s) missing"

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 275
    .line 276
    .line 277
    throw p1

    .line 278
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string p0, " not a method"

    .line 287
    .line 288
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛳᲈᲁᲀ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛳᲈᲁᲀ;

    .line 10
    .line 11
    iget-object v0, p1, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, p1, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

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
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object p0, p0, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛲᛶᛱ;

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᛲᲈᲁ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, v1}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p1, v2}, Lyyds/ᲀᛳᛴᛵ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "Constructor "

    .line 28
    .line 29
    if-nez v2, :cond_5

    .line 30
    .line 31
    check-cast p1, [Ljava/lang/Class;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    :try_start_0
    array-length v4, p1

    .line 35
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, [Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    new-instance v4, Lyyds/ᲈᛵᛵᛴ;

    .line 51
    .line 52
    invoke-direct {v4, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v4

    .line 56
    :goto_0
    instance-of v4, p1, Lyyds/ᲈᛵᛵᛴ;

    .line 57
    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    :cond_0
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v4, 0x0

    .line 71
    :goto_1
    array-length v5, p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    if-ge v4, v5, :cond_3

    .line 73
    .line 74
    add-int/lit8 v5, v4, 0x1

    .line 75
    .line 76
    :try_start_2
    aget-object v4, p1, v4
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    .line 78
    :try_start_3
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/String;

    .line 83
    .line 84
    sget-object v7, Lyyds/ᲇᛳᲈᲁ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    new-instance v7, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v8, "("

    .line 89
    .line 90
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v9, Lyyds/ᲇᛶᛲᛱ;

    .line 98
    .line 99
    const/16 v10, 0x13

    .line 100
    .line 101
    invoke-direct {v9, v10}, Lyyds/ᲇᛶᛲᛱ;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v8, v9}, Lyyds/ᲀᲀᛷᛸ;->ᲀᛴᲁᲈ([Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v8, ")V"

    .line 112
    .line 113
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v6, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_2

    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 127
    .line 128
    .line 129
    move-object p1, v4

    .line 130
    goto :goto_2

    .line 131
    :cond_2
    move v4, v5

    .line 132
    goto :goto_1

    .line 133
    :catch_0
    move-exception p1

    .line 134
    new-instance v4, Ljava/util/NoSuchElementException;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-direct {v4, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 144
    :catchall_1
    :cond_3
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Ljava/lang/String;

    .line 149
    .line 150
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 151
    .line 152
    iget-object v4, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1, v4, p1, v0}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_4

    .line 159
    .line 160
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 161
    .line 162
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 163
    .line 164
    .line 165
    :goto_2
    return-object p1

    .line 166
    :cond_4
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 167
    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string p0, " not found"

    .line 177
    .line 178
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw p1

    .line 189
    :cond_5
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 190
    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p0, " not available: parameter type(s) missing"

    .line 200
    .line 201
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 212
    .line 213
    .line 214
    throw p1

    .line 215
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string p0, " not a constructor"

    .line 224
    .line 225
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "<init>"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
