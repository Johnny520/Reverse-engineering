.class public final Lg8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

.field public final b:Lg8/i;

.field public final c:Lh/Hchat/dexkit/DexFinder;

.field public final d:Lm8/c;

.field public final e:Li8/f;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile g:Z


# direct methods
.method public constructor <init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/i;Lh/Hchat/dexkit/DexFinder;Lm8/c;Li8/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg8/d;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lg8/d;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 12
    .line 13
    iput-object p2, p0, Lg8/d;->b:Lg8/i;

    .line 14
    .line 15
    iput-object p3, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 16
    .line 17
    iput-object p4, p0, Lg8/d;->d:Lm8/c;

    .line 18
    .line 19
    iput-object p5, p0, Lg8/d;->e:Li8/f;

    .line 20
    .line 21
    return-void
.end method

.method public static b(Ljava/util/Map;)[B
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v1, "roomdata"

    .line 5
    .line 6
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    instance-of v1, p0, [B

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p0, [B

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    instance-of v1, p0, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_b

    .line 22
    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v1, "hex->"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x5

    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_3
    const-string v1, " "

    .line 51
    .line 52
    const-string v2, ""

    .line 53
    .line 54
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v1, "\n"

    .line 59
    .line 60
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v1, "\r"

    .line 65
    .line 66
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x2

    .line 75
    if-lt v1, v2, :cond_e

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    and-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_4
    const/4 v1, 0x0

    .line 88
    move v3, v1

    .line 89
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-ge v3, v4, :cond_8

    .line 94
    .line 95
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/16 v5, 0x30

    .line 100
    .line 101
    if-lt v4, v5, :cond_5

    .line 102
    .line 103
    const/16 v5, 0x39

    .line 104
    .line 105
    if-le v4, v5, :cond_7

    .line 106
    .line 107
    :cond_5
    const/16 v5, 0x61

    .line 108
    .line 109
    if-lt v4, v5, :cond_6

    .line 110
    .line 111
    const/16 v5, 0x66

    .line 112
    .line 113
    if-le v4, v5, :cond_7

    .line 114
    .line 115
    :cond_6
    const/16 v5, 0x41

    .line 116
    .line 117
    if-lt v4, v5, :cond_e

    .line 118
    .line 119
    const/16 v5, 0x46

    .line 120
    .line 121
    if-gt v4, v5, :cond_e

    .line 122
    .line 123
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    div-int/2addr v3, v2

    .line 131
    new-array v2, v3, [B

    .line 132
    .line 133
    :goto_2
    if-ge v1, v3, :cond_a

    .line 134
    .line 135
    mul-int/lit8 v4, v1, 0x2

    .line 136
    .line 137
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    const/16 v6, 0x10

    .line 142
    .line 143
    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    add-int/lit8 v4, v4, 0x1

    .line 148
    .line 149
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-static {v4, v6}, Ljava/lang/Character;->digit(CI)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-ltz v5, :cond_e

    .line 158
    .line 159
    if-gez v4, :cond_9

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_9
    shl-int/lit8 v5, v5, 0x4

    .line 163
    .line 164
    or-int/2addr v4, v5

    .line 165
    int-to-byte v4, v4

    .line 166
    aput-byte v4, v2, v1

    .line 167
    .line 168
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_a
    return-object v2

    .line 172
    :cond_b
    if-nez p0, :cond_c

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_c
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "toByteArray"

    .line 180
    .line 181
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    instance-of v2, v1, [B

    .line 190
    .line 191
    if-eqz v2, :cond_d

    .line 192
    .line 193
    check-cast v1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    .line 195
    return-object v1

    .line 196
    :catchall_0
    :cond_d
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    const-string v2, "getBytes"

    .line 201
    .line 202
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    instance-of v1, p0, [B

    .line 211
    .line 212
    if-eqz v1, :cond_e

    .line 213
    .line 214
    check-cast p0, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 215
    .line 216
    return-object p0

    .line 217
    :catchall_1
    :cond_e
    :goto_3
    return-object v0
.end method

.method public static c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static o([B)Lg8/c;
    .locals 5

    .line 1
    new-instance v0, Lg8/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lg8/c;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lg8/b;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v2, v3}, Lg8/b;-><init>([BIB)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget p0, v1, Lg8/b;->c:I

    .line 14
    .line 15
    iget-object v2, v1, Lg8/b;->b:[B

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-lt p0, v2, :cond_0

    .line 20
    .line 21
    move p0, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_1
    if-nez p0, :cond_5

    .line 25
    .line 26
    invoke-virtual {v1}, Lg8/b;->j()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    ushr-int/lit8 v2, p0, 0x3

    .line 31
    .line 32
    and-int/lit8 p0, p0, 0x7

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    if-ne p0, v4, :cond_1

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Lg8/b;->i()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-object p0, v0, Lg8/c;->a:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-ne p0, v4, :cond_2

    .line 51
    .line 52
    if-ne v2, v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Lg8/b;->i()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    if-nez p0, :cond_3

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    if-ne v2, v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1}, Lg8/b;->j()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iput p0, v0, Lg8/c;->c:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    if-ne p0, v4, :cond_4

    .line 71
    .line 72
    const/4 v3, 0x4

    .line 73
    if-ne v2, v3, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Lg8/b;->i()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iput-object p0, v0, Lg8/c;->b:Ljava/lang/String;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-virtual {v1, p0}, Lg8/b;->l(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    return-object v0

    .line 91
    :catchall_0
    new-instance p0, Lg8/c;

    .line 92
    .line 93
    invoke-direct {p0}, Lg8/c;-><init>()V

    .line 94
    .line 95
    .line 96
    return-object p0
.end method

.method public static p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;)Z
    .locals 6

    .line 1
    const-string v0, "\u6dfb\u52a0\u7fa4\u6210\u5458"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_5

    .line 9
    .line 10
    if-eqz p2, :cond_5

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->addChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    iget-object v3, p0, Lg8/d;->d:Lm8/c;

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p2}, Lg8/d;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    const-string p1, "\u6dfb\u52a0\u7fa4\u6210\u5458\u5931\u8d25: member\u4e3a\u7a7a"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_2
    invoke-virtual {p0}, Lg8/d;->l()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->addChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    const-string v4, ""

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    filled-new-array {p1, p2, v4, v5}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v1, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v3, v1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    const-string v0, "\u6210\u529f"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string v0, "\u5931\u8d25"

    .line 82
    .line 83
    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ": "

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p1, " count="

    .line 95
    .line 96
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    return v1

    .line 114
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v0, "\u6dfb\u52a0\u7fa4\u6210\u5458\u5f02\u5e38: "

    .line 117
    .line 118
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return v2

    .line 136
    :cond_4
    :goto_2
    const-string p1, "\u6dfb\u52a0\u7fa4\u6210\u5458\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 137
    .line 138
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return v2

    .line 142
    :cond_5
    :goto_3
    const-string p1, "\u6dfb\u52a0\u7fa4\u6210\u5458\u5931\u8d25: chatroom/member\u4e3a\u7a7a"

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return v2
.end method

.method public final d(Ljava/lang/String;Ljava/util/List;)Z
    .locals 5

    .line 1
    const-string v0, "\u79fb\u9664\u7fa4\u6210\u5458"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_5

    .line 9
    .line 10
    if-eqz p2, :cond_5

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->delChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    iget-object v3, p0, Lg8/d;->d:Lm8/c;

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p2}, Lg8/d;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    const-string p1, "\u79fb\u9664\u7fa4\u6210\u5458\u5931\u8d25: member\u4e3a\u7a7a"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_2
    invoke-virtual {p0}, Lg8/d;->l()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->delChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    filled-new-array {p1, p2, v4}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v1, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v3, v1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v3, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    const-string v0, "\u6210\u529f"

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const-string v0, "\u5931\u8d25"

    .line 83
    .line 84
    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, ": "

    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, " count="

    .line 96
    .line 97
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    return v1

    .line 115
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v0, "\u79fb\u9664\u7fa4\u6210\u5458\u5f02\u5e38: "

    .line 118
    .line 119
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return v2

    .line 137
    :cond_4
    :goto_2
    const-string p1, "\u79fb\u9664\u7fa4\u6210\u5458\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_5
    :goto_3
    const-string p1, "\u79fb\u9664\u7fa4\u6210\u5458\u5931\u8d25: chatroom/member\u4e3a\u7a7a"

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v2
.end method

.method public final e(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatChatroom;
    .locals 12

    .line 1
    iget-object v0, p0, Lg8/d;->b:Lg8/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    iget-object v0, p0, Lg8/d;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    :try_start_0
    const-string v2, "SELECT chatroomname, memberlist, displayname, roomowner FROM chatroom WHERE chatroomname=? LIMIT 1"

    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v0, v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    const/4 v2, 0x0

    .line 36
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/util/Map;

    .line 41
    .line 42
    new-instance v3, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 43
    .line 44
    const-string v4, "chatroomname"

    .line 45
    .line 46
    invoke-static {v4, v0}, Lg8/d;->p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0, p1}, Lg8/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-string v6, "roomowner"

    .line 55
    .line 56
    invoke-static {v6, v0}, Lg8/d;->p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "memberlist"

    .line 61
    .line 62
    invoke-static {v7, v0}, Lg8/d;->p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    move-object v8, v7

    .line 67
    new-instance v7, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const-string v9, ";"

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    array-length v9, v8

    .line 86
    :goto_0
    if-ge v2, v9, :cond_4

    .line 87
    .line 88
    aget-object v10, v8, v2

    .line 89
    .line 90
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-nez v11, :cond_3

    .line 95
    .line 96
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    :goto_1
    const-string v2, "displayname"

    .line 103
    .line 104
    invoke-static {v2, v0}, Lg8/d;->p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-direct/range {v3 .. v8}, Lh/Hchat/hooks/api/model/WeChatChatroom;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    return-object v3

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    const-string v2, "\u8bfb\u53d6\u7fa4\u804a\u5931\u8d25: "

    .line 114
    .line 115
    const-string v3, " "

    .line 116
    .line 117
    invoke-static {v2, p1, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    :goto_2
    return-object v1
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iget-object v0, p0, Lg8/d;->b:Lg8/i;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_2
    return-object p1
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg8/d;->b:Lg8/i;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {v1}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 30
    .line 31
    iget-object v3, v2, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lg8/d;->e(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v4, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 44
    .line 45
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    new-instance v8, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v9, ""

    .line 57
    .line 58
    const-string v7, ""

    .line 59
    .line 60
    invoke-direct/range {v4 .. v9}, Lh/Hchat/hooks/api/model/WeChatChatroom;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    return-object v0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lg8/d;->b:Lg8/i;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    const-string p1, ""

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final i(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lg8/d;->b:Lg8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lg8/i;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lg8/d;->e(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v2, ""

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lg8/d;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :try_start_0
    const-string v3, "SELECT roomowner FROM chatroom WHERE chatroomname=? LIMIT 1"

    .line 29
    .line 30
    filled-new-array {p1}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-string v5, "roomowner"

    .line 35
    .line 36
    invoke-virtual {v0, v3, v4, v5}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    const-string v3, "\u8bfb\u53d6\u7fa4\u4e3b\u5931\u8d25: "

    .line 53
    .line 54
    const-string v4, " "

    .line 55
    .line 56
    invoke-static {v3, p1, v4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lg8/d;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0, p1}, Lg8/d;->e(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v2, v0, Lh/Hchat/hooks/api/model/WeChatChatroom;->owner:Ljava/lang/String;

    .line 81
    .line 82
    :cond_3
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    const/4 p1, 0x2

    .line 95
    return p1

    .line 96
    :cond_4
    invoke-virtual {p0, p1}, Lg8/d;->k(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lg8/c;

    .line 105
    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    iget p1, p1, Lg8/c;->c:I

    .line 109
    .line 110
    and-int/lit16 p1, p1, 0x800

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    :cond_5
    :goto_1
    return v1
.end method

.method public final k(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_b

    .line 11
    .line 12
    iget-object v1, p0, Lg8/d;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 13
    .line 14
    if-eqz v1, :cond_b

    .line 15
    .line 16
    const-string v2, "chatroom"

    .line 17
    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_4

    .line 25
    .line 26
    const-string v2, "roomdata"

    .line 27
    .line 28
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_4

    .line 33
    .line 34
    iget-object v5, p0, Lg8/d;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    const-string v6, "chatroom:roomdata"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Ljava/lang/Boolean;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :try_start_0
    const-string v7, "PRAGMA table_info(chatroom)"

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    invoke-virtual {v1, v7, v8}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_2

    .line 67
    .line 68
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Ljava/util/Map;

    .line 73
    .line 74
    const-string v9, "name"

    .line 75
    .line 76
    invoke-static {v9, v8}, Lg8/d;->p(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v2, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    if-eqz v8, :cond_1

    .line 85
    .line 86
    move v2, v3

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v2

    .line 89
    new-instance v7, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v8, "\u68c0\u6d4b\u5b57\u6bb5\u5931\u8d25: chatroom.roomdata "

    .line 92
    .line 93
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {p0, v2}, Lg8/d;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    move v2, v4

    .line 111
    :goto_0
    if-eqz v2, :cond_3

    .line 112
    .line 113
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    move v2, v4

    .line 124
    :goto_1
    if-nez v2, :cond_5

    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_5
    :try_start_1
    const-string v2, "SELECT roomdata FROM chatroom WHERE chatroomname=? LIMIT 1"

    .line 129
    .line 130
    filled-new-array {p1}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v1, v2, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_6
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Ljava/util/Map;

    .line 150
    .line 151
    invoke-static {p1}, Lg8/d;->b(Ljava/util/Map;)[B

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-eqz p1, :cond_b

    .line 156
    .line 157
    array-length v1, p1

    .line 158
    if-nez v1, :cond_7

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    new-instance v1, Lg8/b;

    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    invoke-direct {v1, p1, v2, v5}, Lg8/b;-><init>([BIB)V

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_2
    iget p1, v1, Lg8/b;->c:I

    .line 169
    .line 170
    iget-object v2, v1, Lg8/b;->b:[B

    .line 171
    .line 172
    array-length v2, v2

    .line 173
    if-lt p1, v2, :cond_9

    .line 174
    .line 175
    move p1, v3

    .line 176
    goto :goto_3

    .line 177
    :cond_9
    move p1, v4

    .line 178
    :goto_3
    if-nez p1, :cond_b

    .line 179
    .line 180
    invoke-virtual {v1}, Lg8/b;->j()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    ushr-int/lit8 v2, p1, 0x3

    .line 185
    .line 186
    and-int/lit8 p1, p1, 0x7

    .line 187
    .line 188
    if-ne v2, v3, :cond_a

    .line 189
    .line 190
    const/4 v2, 0x2

    .line 191
    if-ne p1, v2, :cond_a

    .line 192
    .line 193
    invoke-virtual {v1}, Lg8/b;->h()[B

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {p1}, Lg8/d;->o([B)Lg8/c;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iget-object v2, p1, Lg8/c;->a:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_8

    .line 208
    .line 209
    iget-object v2, p1, Lg8/c;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :catchall_1
    move-exception p1

    .line 216
    goto :goto_4

    .line 217
    :cond_a
    invoke-virtual {v1, p1}, Lg8/b;->l(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v2, "\u89e3\u6790\u7fa4\u6210\u5458\u8eab\u4efd\u5931\u8d25: "

    .line 224
    .line 225
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_b
    :goto_5
    return-object v0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg8/d;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lg8/d;->d:Lm8/c;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v0, p0, Lg8/d;->d:Lm8/c;

    .line 28
    .line 29
    iget-object v1, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 30
    .line 31
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lm8/c;->c(Ljava/lang/Class;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lg8/d;->g:Z

    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/util/List;)Z
    .locals 6

    .line 1
    const-string v0, "\u9080\u8bf7\u7fa4\u6210\u5458"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_5

    .line 9
    .line 10
    if-eqz p2, :cond_5

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lg8/d;->c:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->inviteChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    iget-object v3, p0, Lg8/d;->d:Lm8/c;

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p2}, Lg8/d;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    const-string p1, "\u9080\u8bf7\u7fa4\u6210\u5458\u5931\u8d25: member\u4e3a\u7a7a"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_2
    invoke-virtual {p0}, Lg8/d;->l()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->inviteChatroomMemberCtor:Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    filled-new-array {p1, p2, v4, v5}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v1, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v3, v1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    const-string v0, "\u6210\u529f"

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const-string v0, "\u5931\u8d25"

    .line 84
    .line 85
    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ": "

    .line 89
    .line 90
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " count="

    .line 97
    .line 98
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    return v1

    .line 116
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v0, "\u9080\u8bf7\u7fa4\u6210\u5458\u5f02\u5e38: "

    .line 119
    .line 120
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return v2

    .line 138
    :cond_4
    :goto_2
    const-string p1, "\u9080\u8bf7\u7fa4\u6210\u5458\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return v2

    .line 144
    :cond_5
    :goto_3
    const-string p1, "\u9080\u8bf7\u7fa4\u6210\u5458\u5931\u8d25: chatroom/member\u4e3a\u7a7a"

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Lg8/d;->n(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return v2
.end method

.method public final n(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg8/d;->e:Li8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "[WeChatChatroomApi] "

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
