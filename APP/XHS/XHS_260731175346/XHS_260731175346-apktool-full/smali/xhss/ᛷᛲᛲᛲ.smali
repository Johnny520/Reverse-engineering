.class public final Lxhss/ᛷᛲᛲᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛸᛱᲁᲁ;

    .line 5
    .line 6
    const/4 v1, 0x1

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
    iput-object v2, p0, Lxhss/ᛷᛲᛲᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    const-string v2, "->"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v2, v3, v3, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v2, v0, 0x1

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    const-string v5, ":"

    .line 29
    .line 30
    invoke-static {p1, v5, v2, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v4, -0x1

    .line 35
    if-eq v0, v4, :cond_0

    .line 36
    .line 37
    if-eq v2, v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Lxhss/ᛱᛲᲁᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, p0, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 56
    .line 57
    add-int/2addr v2, v1

    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lxhss/ᛱᛲᲁᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    new-instance p0, Ljava/lang/IllegalAccessError;

    .line 70
    .line 71
    const-string v0, "not field descriptor: "

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public static ᛷᛵᛵᲈ(Lxhss/ᛷᛲᛲᛲ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 12

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛲᛲᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1, v2}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1, v3}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    new-instance v3, Lxhss/ᲈᛳᛱᲇ;

    .line 22
    .line 23
    invoke-direct {v3, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v3

    .line 27
    :goto_0
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "Field "

    .line 32
    .line 33
    if-nez v3, :cond_7

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Class;

    .line 36
    .line 37
    move-object v3, v2

    .line 38
    :goto_1
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_1
    move-exception v6

    .line 51
    new-instance v7, Lxhss/ᲈᛳᛱᲇ;

    .line 52
    .line 53
    invoke-direct {v7, v6}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    instance-of v6, v7, Lxhss/ᲈᛳᛱᲇ;

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_0
    move-object v5, v7

    .line 62
    :goto_3
    check-cast v5, Ljava/lang/reflect/Field;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-static {v6, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    goto :goto_6

    .line 77
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move-object p1, v2

    .line 83
    :goto_4
    if-eqz p1, :cond_5

    .line 84
    .line 85
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    array-length v7, v3

    .line 90
    const/4 v8, 0x0

    .line 91
    :goto_5
    if-ge v8, v7, :cond_4

    .line 92
    .line 93
    aget-object v9, v3, v8

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-static {v1, v10}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-static {v11}, Lxhss/ᛱᛲᲁᛸ;->ᛳᲁᲇᛸ(Ljava/lang/Class;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-static {v10, v11}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_3

    .line 124
    .line 125
    invoke-virtual {v9, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    move-object v5, v9

    .line 129
    goto :goto_6

    .line 130
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 137
    goto :goto_4

    .line 138
    :catchall_2
    :cond_5
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v2, v1, p1, v5}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 151
    .line 152
    .line 153
    :goto_6
    return-object v5

    .line 154
    :cond_6
    new-instance p1, Ljava/lang/NoSuchFieldException;

    .line 155
    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string p0, " not found"

    .line 165
    .line 166
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-direct {p1, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_7
    new-instance p1, Ljava/lang/NoSuchFieldException;

    .line 178
    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string p0, " not available: type missing"

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-direct {p1, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
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
    instance-of v1, p1, Lxhss/ᛷᛲᛲᛲ;

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
    check-cast p1, Lxhss/ᛷᛲᛲᛲ;

    .line 12
    .line 13
    iget-object v1, p1, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, p1, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

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
    iget-object p0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

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
    iget-object p0, p0, Lxhss/ᛷᛲᛲᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;

    .line 28
    .line 29
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

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
