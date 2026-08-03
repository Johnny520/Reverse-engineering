.class public abstract Lfb/a2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Log/k;

.field public static final b:Log/k;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "[\\\\/:*?\"<>|\\u0000-\\u001f]"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfb/a2;->a:Log/k;

    .line 9
    .line 10
    new-instance v0, Log/k;

    .line 11
    .line 12
    const-string v1, "(?:new\\s+File|FileOutputStream|FileWriter|RandomAccessFile|Paths\\.get)\\s*\\(\\s*[\\\"\'](?:/|[A-Za-z]:[\\\\/]|[^\\\"\']*\\.\\.[\\\\/])"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lfb/a2;->b:Log/k;

    .line 18
    .line 19
    new-instance v0, Log/k;

    .line 20
    .line 21
    const-string v1, "Runtime\\.getRuntime\\(\\)\\.exec|ProcessBuilder"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lsf/e;

    .line 27
    .line 28
    const-string v1, "\u5305\u542b\u6267\u884c\u7cfb\u7edf\u8fdb\u7a0b\u7684\u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u6765\u6e90\u548c\u7528\u9014"

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Log/k;

    .line 34
    .line 35
    const-string v1, "ClassLoader|DexClassLoader|createPackageContext"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lsf/e;

    .line 41
    .line 42
    const-string v1, "\u5305\u542b ClassLoader \u6216\u8de8\u5305\u52a0\u8f7d\u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u6765\u6e90\u548c\u7528\u9014"

    .line 43
    .line 44
    invoke-direct {v3, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Log/k;

    .line 48
    .line 49
    const-string v1, "System\\.load(?:Library)?|\\bloadSo\\s*\\("

    .line 50
    .line 51
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, Lsf/e;

    .line 55
    .line 56
    const-string v1, "\u5305\u542bNative\u5e93\u52a0\u8f7d\u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u6765\u6e90\u548c\u7528\u9014"

    .line 57
    .line 58
    invoke-direct {v4, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Log/k;

    .line 62
    .line 63
    const-string v1, "java\\.lang\\.reflect|XposedBridge|XposedHelpers|hookBefore|hookAfter|hookReplace"

    .line 64
    .line 65
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v5, Lsf/e;

    .line 69
    .line 70
    const-string v1, "\u5305\u542b\u53cd\u5c04\u6216 Hook \u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u6765\u6e90\u548c\u7528\u9014"

    .line 71
    .line 72
    invoke-direct {v5, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Log/k;

    .line 76
    .line 77
    const-string v1, "\\.delete\\s*\\("

    .line 78
    .line 79
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance v6, Lsf/e;

    .line 83
    .line 84
    const-string v1, "\u5305\u542b\u5220\u9664\u6587\u4ef6\u7684\u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u6765\u6e90\u548c\u7528\u9014"

    .line 85
    .line 86
    invoke-direct {v6, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Log/k;

    .line 90
    .line 91
    const-string v1, "OkHttpClient|new\\s+URL\\s*\\(|Socket|https?://|\\b(?:get|post|download)\\s*\\(\\s*\"https?://"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v7, Lsf/e;

    .line 97
    .line 98
    const-string v1, "\u5305\u542b\u7f51\u7edc\u8bbf\u95ee\u4ee3\u7801\uff0c\u4fdd\u5b58\u524d\u8bf7\u786e\u8ba4\u8bf7\u6c42\u76ee\u6807\u548c\u6570\u636e\u8303\u56f4"

    .line 99
    .line 100
    invoke-direct {v7, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    filled-new-array/range {v2 .. v7}, [Lsf/e;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lfb/a2;->c:Ljava/util/List;

    .line 112
    .line 113
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0, p0}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "```"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    invoke-static {p0, v2, v3}, Log/m;->J0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    invoke-static {v0, p0}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_1
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    move v1, v6

    .line 6
    move v8, v1

    .line 7
    move v9, v8

    .line 8
    move v11, v9

    .line 9
    move v12, v11

    .line 10
    move-object v10, v7

    .line 11
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_10

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/lit8 v13, v1, 0x1

    .line 22
    .line 23
    invoke-static {v0, v13}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v8, :cond_1

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    if-ne v2, v1, :cond_0

    .line 32
    .line 33
    move v8, v6

    .line 34
    :cond_0
    :goto_1
    move v1, v13

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v4, 0x2a

    .line 37
    .line 38
    const/16 v5, 0x2f

    .line 39
    .line 40
    if-eqz v9, :cond_3

    .line 41
    .line 42
    if-ne v2, v4, :cond_0

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ne v2, v5, :cond_0

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    move v9, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v14, 0x1

    .line 58
    if-eqz v10, :cond_6

    .line 59
    .line 60
    if-eqz v11, :cond_4

    .line 61
    .line 62
    move v11, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    const/16 v1, 0x5c

    .line 65
    .line 66
    if-ne v2, v1, :cond_5

    .line 67
    .line 68
    move v11, v14

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-virtual {v10}, Ljava/lang/Character;->charValue()C

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-ne v2, v1, :cond_0

    .line 75
    .line 76
    move-object v10, v7

    .line 77
    goto :goto_1

    .line 78
    :cond_6
    if-ne v2, v5, :cond_8

    .line 79
    .line 80
    if-nez v3, :cond_7

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-ne v15, v5, :cond_8

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    move v8, v14

    .line 92
    goto :goto_0

    .line 93
    :cond_8
    :goto_2
    if-ne v2, v5, :cond_a

    .line 94
    .line 95
    if-nez v3, :cond_9

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ne v3, v4, :cond_a

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x2

    .line 105
    .line 106
    move v9, v14

    .line 107
    goto :goto_0

    .line 108
    :cond_a
    :goto_3
    const/16 v3, 0x22

    .line 109
    .line 110
    if-eq v2, v3, :cond_f

    .line 111
    .line 112
    const/16 v3, 0x27

    .line 113
    .line 114
    if-eq v2, v3, :cond_f

    .line 115
    .line 116
    const/16 v3, 0x7b

    .line 117
    .line 118
    if-ne v2, v3, :cond_b

    .line 119
    .line 120
    add-int/lit8 v12, v12, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_b
    const/16 v3, 0x7d

    .line 124
    .line 125
    if-ne v2, v3, :cond_c

    .line 126
    .line 127
    add-int/lit8 v12, v12, -0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_c
    if-nez v12, :cond_0

    .line 131
    .line 132
    const/4 v4, 0x6

    .line 133
    const/4 v5, 0x0

    .line 134
    const-string v2, "native"

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    invoke-static/range {v0 .. v5}, Log/t;->Y(Ljava/lang/String;ILjava/lang/String;IIZ)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_0

    .line 142
    .line 143
    add-int/lit8 v2, v1, -0x1

    .line 144
    .line 145
    invoke-static {v0, v2}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    add-int/lit8 v1, v1, 0x6

    .line 150
    .line 151
    invoke-static {v0, v1}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v2, :cond_d

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-ne v2, v14, :cond_d

    .line 166
    .line 167
    move v2, v14

    .line 168
    goto :goto_4

    .line 169
    :cond_d
    move v2, v6

    .line 170
    :goto_4
    if-eqz v1, :cond_e

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-static {v1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-ne v1, v14, :cond_e

    .line 181
    .line 182
    move v1, v14

    .line 183
    goto :goto_5

    .line 184
    :cond_e
    move v1, v6

    .line 185
    :goto_5
    if-nez v2, :cond_0

    .line 186
    .line 187
    if-nez v1, :cond_0

    .line 188
    .line 189
    return v14

    .line 190
    :cond_f
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :cond_10
    return v6
.end method

.method public static c(Lfb/y;)Lfb/y;
    .locals 9

    .line 1
    iget-object v0, p0, Lfb/y;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lfb/a2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/Properties;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/io/StringReader;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    iget-object v2, p0, Lfb/y;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const-string v2, "name"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    const-string v1, ""

    .line 45
    .line 46
    :cond_0
    move-object v2, v1

    .line 47
    :cond_1
    move-object v4, v2

    .line 48
    iget-object v1, p0, Lfb/y;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    move-object v1, v4

    .line 57
    :cond_2
    invoke-static {v1}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    iget-object v0, p0, Lfb/y;->d:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0}, Lfb/a2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    iget-object p0, p0, Lfb/y;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v3, Lfb/y;

    .line 103
    .line 104
    invoke-direct/range {v3 .. v8}, Lfb/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v3
.end method

.method public static d(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lfb/a2;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lsf/e;

    .line 23
    .line 24
    iget-object v3, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Log/k;

    .line 27
    .line 28
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, Lfb/a0;

    .line 39
    .line 40
    sget-object v4, Lfb/b0;->h:Lfb/b0;

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    invoke-direct {v3, v4, v2, v5}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v3, 0x0

    .line 48
    :goto_1
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0, p0}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lfb/a2;->a:Log/k;

    .line 6
    .line 7
    const-string v1, "_"

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Log/k;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "\\s+"

    .line 14
    .line 15
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x2

    .line 20
    new-array v0, v0, [C

    .line 21
    .line 22
    fill-array-data v0, :array_0

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/16 v0, 0x40

    .line 30
    .line 31
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string p0, "ai_plugin"

    .line 42
    .line 43
    :cond_0
    return-object p0

    .line 44
    nop

    .line 45
    :array_0
    .array-data 2
        0x2es
        0x20s
    .end array-data
.end method

.method public static f(Lfb/y;)Lfb/z1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lfb/y;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v0, Lfb/y;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, v0, Lfb/y;->c:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v4, Ljava/util/Properties;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/Properties;-><init>()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    new-instance v5, Ljava/io/StringReader;

    .line 28
    .line 29
    invoke-direct {v5, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sget-object v5, Lfb/b0;->g:Lfb/b0;

    .line 40
    .line 41
    const-string v6, ".."

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    const-string v0, "."

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    :cond_0
    new-instance v0, Lfb/a0;

    .line 61
    .line 62
    const-string v8, "\u63d2\u4ef6\u76ee\u5f55\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 63
    .line 64
    invoke-direct {v0, v5, v8, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v2}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    new-instance v0, Lfb/a0;

    .line 81
    .line 82
    const-string v8, "\u63d2\u4ef6\u76ee\u5f55\u540d\u5305\u542b\u8def\u5f84\u6216\u6587\u4ef6\u540d\u4e0d\u5141\u8bb8\u7684\u5b57\u7b26"

    .line 83
    .line 84
    invoke-direct {v0, v5, v8, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-static {v2, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    new-instance v0, Lfb/a0;

    .line 97
    .line 98
    const-string v2, "\u63d2\u4ef6\u76ee\u5f55\u540d\u4e0d\u80fd\u5305\u542b .."

    .line 99
    .line 100
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    new-instance v0, Lfb/a0;

    .line 113
    .line 114
    const-string v2, "main.java \u4e0d\u80fd\u4e3a\u7a7a"

    .line 115
    .line 116
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_4
    const-string v0, "version"

    .line 123
    .line 124
    const-string v2, "author"

    .line 125
    .line 126
    const-string v6, "name"

    .line 127
    .line 128
    filled-new-array {v6, v0, v2}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :cond_5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    const-string v6, ""

    .line 145
    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-nez v8, :cond_6

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_6
    move-object v6, v8

    .line 162
    :goto_1
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-eqz v6, :cond_5

    .line 175
    .line 176
    new-instance v6, Lfb/a0;

    .line 177
    .line 178
    const-string v8, "info.prop \u7f3a\u5c11 "

    .line 179
    .line 180
    invoke-static {v8, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-direct {v6, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_7
    const-string v0, "process"

    .line 192
    .line 193
    invoke-virtual {v4, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-nez v0, :cond_8

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    move-object v6, v0

    .line 201
    :goto_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 202
    .line 203
    invoke-virtual {v6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    const-string v2, "[,;|\\s]+"

    .line 211
    .line 212
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {v7}, Log/m;->D0(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    const/16 v6, 0xa

    .line 231
    .line 232
    if-nez v4, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    goto :goto_3

    .line 243
    :cond_9
    new-instance v4, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    move v8, v7

    .line 249
    :cond_a
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-nez v9, :cond_a

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-object v0, v4

    .line 290
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_c

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    move-object v8, v4

    .line 310
    check-cast v8, Ljava/lang/String;

    .line 311
    .line 312
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-nez v8, :cond_b

    .line 317
    .line 318
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 323
    .line 324
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    :cond_d
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-eqz v4, :cond_f

    .line 336
    .line 337
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    move-object v8, v4

    .line 342
    check-cast v8, Ljava/lang/String;

    .line 343
    .line 344
    const-string v9, "main"

    .line 345
    .line 346
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    if-nez v9, :cond_d

    .line 351
    .line 352
    const-string v9, "appbrand"

    .line 353
    .line 354
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    if-nez v9, :cond_d

    .line 359
    .line 360
    const-string v9, "all"

    .line 361
    .line 362
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-eqz v8, :cond_e

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_e
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-nez v0, :cond_10

    .line 378
    .line 379
    new-instance v0, Lfb/a0;

    .line 380
    .line 381
    const-string v2, "info.prop \u7684 process \u53ea\u652f\u6301 main\u3001appbrand \u6216 all"

    .line 382
    .line 383
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    :cond_10
    const-string v0, "```"

    .line 390
    .line 391
    invoke-static {v3, v0, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_11

    .line 396
    .line 397
    new-instance v0, Lfb/a0;

    .line 398
    .line 399
    const-string v2, "main.java \u4ecd\u5305\u542b Markdown \u4ee3\u7801\u56f4\u680f"

    .line 400
    .line 401
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :cond_11
    move v2, v7

    .line 408
    move v8, v2

    .line 409
    move v9, v8

    .line 410
    move v10, v9

    .line 411
    move v11, v10

    .line 412
    const/4 v4, 0x0

    .line 413
    :goto_6
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v12

    .line 417
    if-ge v2, v12, :cond_21

    .line 418
    .line 419
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 420
    .line 421
    .line 422
    move-result v12

    .line 423
    add-int/lit8 v13, v2, 0x1

    .line 424
    .line 425
    invoke-static {v3, v13}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 426
    .line 427
    .line 428
    move-result-object v14

    .line 429
    if-eqz v8, :cond_13

    .line 430
    .line 431
    if-ne v12, v6, :cond_12

    .line 432
    .line 433
    move v8, v7

    .line 434
    :cond_12
    :goto_7
    move v2, v13

    .line 435
    goto :goto_6

    .line 436
    :cond_13
    const/16 v15, 0x2a

    .line 437
    .line 438
    const/16 v0, 0x2f

    .line 439
    .line 440
    if-eqz v9, :cond_15

    .line 441
    .line 442
    if-ne v12, v15, :cond_12

    .line 443
    .line 444
    if-nez v14, :cond_14

    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_14
    invoke-virtual {v14}, Ljava/lang/Character;->charValue()C

    .line 448
    .line 449
    .line 450
    move-result v12

    .line 451
    if-ne v12, v0, :cond_12

    .line 452
    .line 453
    add-int/lit8 v2, v2, 0x2

    .line 454
    .line 455
    move v9, v7

    .line 456
    goto :goto_6

    .line 457
    :cond_15
    const/16 v16, 0x1

    .line 458
    .line 459
    if-eqz v4, :cond_18

    .line 460
    .line 461
    if-eqz v11, :cond_16

    .line 462
    .line 463
    move v11, v7

    .line 464
    goto :goto_7

    .line 465
    :cond_16
    const/16 v0, 0x5c

    .line 466
    .line 467
    if-ne v12, v0, :cond_17

    .line 468
    .line 469
    move/from16 v11, v16

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_17
    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-ne v12, v0, :cond_12

    .line 477
    .line 478
    const/4 v4, 0x0

    .line 479
    goto :goto_7

    .line 480
    :cond_18
    if-ne v12, v0, :cond_1a

    .line 481
    .line 482
    if-nez v14, :cond_19

    .line 483
    .line 484
    goto :goto_9

    .line 485
    :cond_19
    invoke-virtual {v14}, Ljava/lang/Character;->charValue()C

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-ne v6, v0, :cond_1a

    .line 490
    .line 491
    add-int/lit8 v2, v2, 0x2

    .line 492
    .line 493
    move/from16 v8, v16

    .line 494
    .line 495
    :goto_8
    const/16 v6, 0xa

    .line 496
    .line 497
    goto :goto_6

    .line 498
    :cond_1a
    :goto_9
    if-ne v12, v0, :cond_1c

    .line 499
    .line 500
    if-nez v14, :cond_1b

    .line 501
    .line 502
    goto :goto_a

    .line 503
    :cond_1b
    invoke-virtual {v14}, Ljava/lang/Character;->charValue()C

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-ne v0, v15, :cond_1c

    .line 508
    .line 509
    add-int/lit8 v2, v2, 0x2

    .line 510
    .line 511
    move/from16 v9, v16

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_1c
    :goto_a
    const/16 v0, 0x22

    .line 515
    .line 516
    if-eq v12, v0, :cond_1f

    .line 517
    .line 518
    const/16 v0, 0x27

    .line 519
    .line 520
    if-ne v12, v0, :cond_1d

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_1d
    const/16 v0, 0x7b

    .line 524
    .line 525
    if-ne v12, v0, :cond_1e

    .line 526
    .line 527
    add-int/lit8 v10, v10, 0x1

    .line 528
    .line 529
    goto :goto_c

    .line 530
    :cond_1e
    const/16 v0, 0x7d

    .line 531
    .line 532
    if-ne v12, v0, :cond_20

    .line 533
    .line 534
    add-int/lit8 v10, v10, -0x1

    .line 535
    .line 536
    if-gez v10, :cond_20

    .line 537
    .line 538
    goto :goto_d

    .line 539
    :cond_1f
    :goto_b
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    move-object v4, v0

    .line 544
    :cond_20
    :goto_c
    move v2, v13

    .line 545
    goto :goto_8

    .line 546
    :cond_21
    if-nez v4, :cond_22

    .line 547
    .line 548
    if-nez v9, :cond_22

    .line 549
    .line 550
    if-nez v10, :cond_22

    .line 551
    .line 552
    goto :goto_e

    .line 553
    :cond_22
    :goto_d
    new-instance v0, Lfb/a0;

    .line 554
    .line 555
    const-string v2, "main.java \u7684\u5927\u62ec\u53f7\u4e0d\u5e73\u8861"

    .line 556
    .line 557
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    :goto_e
    invoke-static {v3}, Lfb/a2;->b(Ljava/lang/String;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-eqz v0, :cond_23

    .line 568
    .line 569
    new-instance v0, Lfb/a0;

    .line 570
    .line 571
    const-string v2, "BeanShell \u9876\u5c42 native \u65b9\u6cd5\u65e0\u6cd5\u7ed1\u5b9a JNI\uff0c\u8bf7\u628a native \u58f0\u660e\u653e\u8fdb\u7c7b\u5e76\u5c06\u8be5\u7c7b\u7684 ClassLoader \u4f20\u7ed9 loadSo"

    .line 572
    .line 573
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    :cond_23
    sget-object v0, Lfb/a2;->b:Log/k;

    .line 580
    .line 581
    invoke-virtual {v0, v3}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_24

    .line 586
    .line 587
    new-instance v0, Lfb/a0;

    .line 588
    .line 589
    const-string v2, "\u4ee3\u7801\u5305\u542b\u7edd\u5bf9\u8def\u5f84\u6216 .. \u8def\u5f84\uff0c\u8bf7\u6539\u7528 pluginDir\u3001pluginDirFile \u6216 cacheDir"

    .line 590
    .line 591
    invoke-direct {v0, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    :cond_24
    const-string v15, "onNewFriend"

    .line 598
    .line 599
    const-string v16, "onProtobufPacket"

    .line 600
    .line 601
    const-string v8, "onLoad"

    .line 602
    .line 603
    const-string v9, "onUnload"

    .line 604
    .line 605
    const-string v10, "openSettings"

    .line 606
    .line 607
    const-string v11, "onClickSendBtn"

    .line 608
    .line 609
    const-string v12, "onHandleMsg"

    .line 610
    .line 611
    const-string v13, "onImageDownload"

    .line 612
    .line 613
    const-string v14, "onMemberChange"

    .line 614
    .line 615
    filled-new-array/range {v8 .. v16}, [Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    :cond_25
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    if-eqz v2, :cond_26

    .line 632
    .line 633
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Ljava/lang/String;

    .line 638
    .line 639
    new-instance v4, Ljava/lang/StringBuilder;

    .line 640
    .line 641
    const-string v5, "\\b"

    .line 642
    .line 643
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    const-string v6, "\\s*\\("

    .line 650
    .line 651
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    if-eqz v4, :cond_25

    .line 674
    .line 675
    new-instance v4, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    const-string v5, "\\s*\\([^)]*\\)\\s*\\{"

    .line 684
    .line 685
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 704
    .line 705
    .line 706
    move-result v4

    .line 707
    if-nez v4, :cond_25

    .line 708
    .line 709
    new-instance v4, Lfb/a0;

    .line 710
    .line 711
    const-string v5, " \u7684\u5b9a\u4e49\u770b\u8d77\u6765\u4e0d\u5b8c\u6574\uff0c\u8bf7\u786e\u8ba4\u56de\u8c03\u7b7e\u540d\u548c\u5927\u62ec\u53f7"

    .line 712
    .line 713
    invoke-static {v2, v5}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    sget-object v5, Lfb/b0;->h:Lfb/b0;

    .line 718
    .line 719
    invoke-direct {v4, v5, v2, v7}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    goto :goto_f

    .line 726
    :cond_26
    invoke-static {v3}, Lfb/a2;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-static {v1, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 731
    .line 732
    .line 733
    new-instance v0, Ljava/util/HashSet;

    .line 734
    .line 735
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 736
    .line 737
    .line 738
    new-instance v2, Ljava/util/ArrayList;

    .line 739
    .line 740
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    :cond_27
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    if-eqz v3, :cond_28

    .line 752
    .line 753
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    move-object v4, v3

    .line 758
    check-cast v4, Lfb/a0;

    .line 759
    .line 760
    iget-object v5, v4, Lfb/a0;->a:Lfb/b0;

    .line 761
    .line 762
    iget-object v4, v4, Lfb/a0;->b:Ljava/lang/String;

    .line 763
    .line 764
    new-instance v6, Lsf/e;

    .line 765
    .line 766
    invoke-direct {v6, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-eqz v4, :cond_27

    .line 774
    .line 775
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    goto :goto_10

    .line 779
    :cond_28
    new-instance v0, Lfb/z1;

    .line 780
    .line 781
    invoke-direct {v0, v2}, Lfb/z1;-><init>(Ljava/util/List;)V

    .line 782
    .line 783
    .line 784
    return-object v0
.end method
