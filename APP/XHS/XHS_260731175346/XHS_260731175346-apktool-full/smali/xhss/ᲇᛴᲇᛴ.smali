.class public final Lxhss/ᲇᛴᲇᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Ljava/util/ArrayList;

.field public final ᛷᛴᛷᛱ:Lxhss/ᛴᛷᛱ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᲇᛴᲇᛵ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛸᛱᲁᲁ;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1, p0}, Lxhss/ᛸᛱᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lxhss/ᛴᛷᛱ;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛷᛱ;

    .line 16
    .line 17
    const-string v0, "->"

    .line 18
    .line 19
    const/4 v2, 0x6

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v2, v0, 0x1

    .line 26
    .line 27
    const-string v4, "("

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    invoke-static {p1, v4, v2, v3, v5}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    const-string v6, ")"

    .line 37
    .line 38
    invoke-static {p1, v6, v4, v3, v5}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, -0x1

    .line 43
    if-eq v0, v7, :cond_4

    .line 44
    .line 45
    if-eq v2, v7, :cond_4

    .line 46
    .line 47
    if-eq v6, v7, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-static {v7}, Lxhss/ᛱᛲᲁᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iput-object v7, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

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
    move v2, v3

    .line 76
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ge v3, v4, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const/16 v7, 0x5b

    .line 87
    .line 88
    if-ne v4, v7, :cond_0

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_0
    const/16 v7, 0x4c

    .line 94
    .line 95
    if-ne v4, v7, :cond_1

    .line 96
    .line 97
    const/16 v4, 0x3b

    .line 98
    .line 99
    invoke-static {v0, v4, v3, v5}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v2}, Lxhss/ᛱᛲᲁᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    if-ne v2, v3, :cond_3

    .line 118
    .line 119
    iput-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 120
    .line 121
    add-int/lit8 v6, v6, 0x1

    .line 122
    .line 123
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lxhss/ᛱᛲᲁᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    const-string p0, "Unknown signString: "

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p0, 0x0

    .line 144
    throw p0

    .line 145
    :cond_4
    new-instance p0, Ljava/lang/IllegalAccessError;

    .line 146
    .line 147
    const-string v0, "not method descriptor: "

    .line 148
    .line 149
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0
.end method

.method public static ᛱᛱᛲᲇ(Lxhss/ᲇᛴᲇᛴ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛷᛱ;

    .line 5
    .line 6
    sget-object v1, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 7
    .line 8
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "<clinit>"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_9

    .line 17
    .line 18
    const-string v2, "<init>"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    iget-object v2, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p1, v2}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {p1, v3}, Lxhss/ᛶᛲᛵᛶ;->ᛱᛱᛲᲇ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v5, "Method "

    .line 43
    .line 44
    if-nez v4, :cond_8

    .line 45
    .line 46
    check-cast v3, [Ljava/lang/Class;

    .line 47
    .line 48
    iget-object v4, p0, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1, v4}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    new-instance v4, Lxhss/ᲈᛳᛱᲇ;

    .line 57
    .line 58
    invoke-direct {v4, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p1, v4

    .line 62
    :goto_0
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-nez v4, :cond_7

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Class;

    .line 69
    .line 70
    move-object v4, v2

    .line 71
    :goto_1
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x1

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    :try_start_1
    array-length v8, v3

    .line 76
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, [Ljava/lang/Class;

    .line 81
    .line 82
    invoke-virtual {v4, v1, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_1
    move-exception v7

    .line 91
    new-instance v8, Lxhss/ᲈᛳᛱᲇ;

    .line 92
    .line 93
    invoke-direct {v8, v7}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    instance-of v7, v8, Lxhss/ᲈᛳᛱᲇ;

    .line 97
    .line 98
    if-eqz v7, :cond_0

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_0
    move-object v6, v8

    .line 102
    :goto_3
    check-cast v6, Ljava/lang/reflect/Method;

    .line 103
    .line 104
    if-eqz v6, :cond_1

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-static {v7, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_1

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move-object p1, v2

    .line 124
    :goto_4
    if-eqz p1, :cond_5

    .line 125
    .line 126
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    array-length v4, v3

    .line 131
    const/4 v8, 0x0

    .line 132
    :goto_5
    if-ge v8, v4, :cond_4

    .line 133
    .line 134
    aget-object v9, v3, v8

    .line 135
    .line 136
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-static {v10, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-eqz v10, :cond_3

    .line 145
    .line 146
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    check-cast v10, Ljava/lang/String;

    .line 151
    .line 152
    sget-object v11, Lxhss/ᛱᛲᲁᛸ;->ᛷᛵᛵᲈ:Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    new-instance v11, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v12, "("

    .line 157
    .line 158
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    sget-object v13, Lxhss/ᲀᲈᲇᛱ;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲇᛱ;

    .line 166
    .line 167
    invoke-static {v12, v13}, Lxhss/ᛲᛷᲁᲁ;->ᲁᛴᲇᛲ([Ljava/lang/Object;Lxhss/ᛷᛴᛲᛲ;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v12, ")"

    .line 175
    .line 176
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-static {v12}, Lxhss/ᛱᛲᲁᛸ;->ᛳᲁᲇᛸ(Ljava/lang/Class;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-static {v10, v11}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    if-eqz v10, :cond_3

    .line 199
    .line 200
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 201
    .line 202
    .line 203
    move-object v6, v9

    .line 204
    goto :goto_6

    .line 205
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 212
    goto :goto_4

    .line 213
    :catchall_2
    :cond_5
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v2, v1, p1, v6}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    if-eqz p1, :cond_6

    .line 224
    .line 225
    move-object v6, p1

    .line 226
    check-cast v6, Ljava/lang/reflect/Method;

    .line 227
    .line 228
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 229
    .line 230
    .line 231
    :goto_6
    return-object v6

    .line 232
    :cond_6
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 233
    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string p0, " not found"

    .line 243
    .line 244
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :cond_7
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 256
    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string p0, " not available: return type missing"

    .line 266
    .line 267
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 278
    .line 279
    .line 280
    throw p1

    .line 281
    :cond_8
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 282
    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string p0, " not available: parameter type(s) missing"

    .line 292
    .line 293
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 304
    .line 305
    .line 306
    throw p1

    .line 307
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string p0, " not a method"

    .line 316
    .line 317
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
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
    instance-of v0, p1, Lxhss/ᲇᛴᲇᛴ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lxhss/ᲇᛴᲇᛴ;

    .line 10
    .line 11
    iget-object v0, p1, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, p1, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

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
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

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
    iget-object p0, p0, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lxhss/ᛱᛲᲁᛸ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛷᛱ;

    .line 23
    .line 24
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

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

.method public final ᛳᲁᲇᛸ()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 12

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 4
    .line 5
    const-string v1, "<init>"

    .line 6
    .line 7
    iget-object v2, p0, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v1}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v3, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1, v3}, Lxhss/ᛶᛲᛵᛶ;->ᛱᛱᛲᲇ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "Constructor "

    .line 32
    .line 33
    if-nez v3, :cond_5

    .line 34
    .line 35
    check-cast p1, [Ljava/lang/Class;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    :try_start_0
    array-length v5, p1

    .line 39
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, [Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    new-instance v5, Lxhss/ᲈᛳᛱᲇ;

    .line 55
    .line 56
    invoke-direct {v5, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v5

    .line 60
    :goto_0
    instance-of v5, p1, Lxhss/ᲈᛳᛱᲇ;

    .line 61
    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    :cond_0
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    array-length v5, p1

    .line 75
    const/4 v6, 0x0

    .line 76
    :goto_1
    if-ge v6, v5, :cond_3

    .line 77
    .line 78
    aget-object v7, p1, v6

    .line 79
    .line 80
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Ljava/lang/String;

    .line 85
    .line 86
    sget-object v9, Lxhss/ᛱᛲᲁᛸ;->ᛷᛵᛵᲈ:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    new-instance v9, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v10, "("

    .line 91
    .line 92
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    sget-object v11, Lxhss/ᲀᲈᲇᛱ;->ᲇᛶᛴᲀ:Lxhss/ᲀᲈᲇᛱ;

    .line 100
    .line 101
    invoke-static {v10, v11}, Lxhss/ᛲᛷᲁᲁ;->ᲁᛴᲇᛲ([Ljava/lang/Object;Lxhss/ᛷᛴᛲᛲ;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v10, ")V"

    .line 109
    .line 110
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-static {v8, v9}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_2

    .line 122
    .line 123
    invoke-virtual {v7, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    .line 126
    move-object p1, v7

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_1
    :cond_3
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ljava/lang/String;

    .line 136
    .line 137
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-static {v1, v2, p1, v0}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    :goto_2
    return-object p1

    .line 151
    :cond_4
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 152
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p0, " not found"

    .line 162
    .line 163
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_5
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 175
    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, " not available: parameter type(s) missing"

    .line 185
    .line 186
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string p0, " not a constructor"

    .line 209
    .line 210
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1
.end method
