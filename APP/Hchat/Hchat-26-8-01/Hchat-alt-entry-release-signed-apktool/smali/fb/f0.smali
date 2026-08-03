.class public abstract Lfb/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Log/k;

.field public static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "(?<![A-Za-z0-9_])/(?:storage|sdcard|data|mnt|system|vendor|product|apex)(?:/[^\\s\\\"\'`<>|]+)+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfb/f0;->a:Log/k;

    .line 9
    .line 10
    const-string v33, "sql"

    .line 11
    .line 12
    const-string v34, "bsh"

    .line 13
    .line 14
    const-string v2, "txt"

    .line 15
    .line 16
    const-string v3, "md"

    .line 17
    .line 18
    const-string v4, "java"

    .line 19
    .line 20
    const-string v5, "kt"

    .line 21
    .line 22
    const-string v6, "kts"

    .line 23
    .line 24
    const-string v7, "xml"

    .line 25
    .line 26
    const-string v8, "json"

    .line 27
    .line 28
    const-string v9, "jsonl"

    .line 29
    .line 30
    const-string v10, "prop"

    .line 31
    .line 32
    const-string v11, "properties"

    .line 33
    .line 34
    const-string v12, "log"

    .line 35
    .line 36
    const-string v13, "csv"

    .line 37
    .line 38
    const-string v14, "tsv"

    .line 39
    .line 40
    const-string v15, "html"

    .line 41
    .line 42
    const-string v16, "htm"

    .line 43
    .line 44
    const-string v17, "css"

    .line 45
    .line 46
    const-string v18, "js"

    .line 47
    .line 48
    const-string v19, "ts"

    .line 49
    .line 50
    const-string v20, "py"

    .line 51
    .line 52
    const-string v21, "sh"

    .line 53
    .line 54
    const-string v22, "c"

    .line 55
    .line 56
    const-string v23, "cc"

    .line 57
    .line 58
    const-string v24, "cpp"

    .line 59
    .line 60
    const-string v25, "h"

    .line 61
    .line 62
    const-string v26, "hpp"

    .line 63
    .line 64
    const-string v27, "gradle"

    .line 65
    .line 66
    const-string v28, "toml"

    .line 67
    .line 68
    const-string v29, "yaml"

    .line 69
    .line 70
    const-string v30, "yml"

    .line 71
    .line 72
    const-string v31, "ini"

    .line 73
    .line 74
    const-string v32, "conf"

    .line 75
    .line 76
    filled-new-array/range {v2 .. v34}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Lfb/f0;->b:Ljava/util/Set;

    .line 85
    .line 86
    return-void
.end method

.method public static a(Ljava/io/File;)Ljava/io/File;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lsf/f;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    nop

    .line 14
    instance-of v0, p0, Lsf/f;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :cond_0
    check-cast p0, Ljava/io/File;

    .line 20
    .line 21
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :array_0
    .array-data 2
        0x22s
        0x27s
        0x60s
        0x2cs
        0x3bs
        -0xf4s
        0x3002s
        -0xe5s
        0x29s
        -0xf7s
        0x5ds
        0x3011s
    .end array-data
.end method

.method public static c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Log/d;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {v1}, Log/d;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Log/d;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, Lfb/f0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "/"

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v2, v3, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    new-instance v3, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget-object v1, Lfb/f0;->a:Log/k;

    .line 60
    .line 61
    invoke-static {v1, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v1, Lf/i0;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lf/i0;-><init>(Lng/c;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Log/f;

    .line 81
    .line 82
    check-cast p0, Log/i;

    .line 83
    .line 84
    invoke-virtual {p0}, Log/i;->c()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lfb/f0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/lang/String;

    .line 122
    .line 123
    new-instance v2, Ljava/io/File;

    .line 124
    .line 125
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v2}, Lfb/f0;->a(Ljava/io/File;)Ljava/io/File;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v1, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    new-instance v0, Ljava/util/HashSet;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v1, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move-object v3, v2

    .line 163
    check-cast v3, Ljava/io/File;

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_6

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    return-object v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, ">\n"

    .line 12
    .line 13
    const-string v1, "\n</local_file>"

    .line 14
    .line 15
    const-string v2, "<local_file path="

    .line 16
    .line 17
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "image/"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p0}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

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
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-eqz p1, :cond_2

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    new-instance p1, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sparse-switch p1, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :sswitch_0
    const-string p1, "webp"

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    const-string p0, "image/webp"

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_1
    const-string p1, "jpeg"

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :sswitch_2
    const-string p1, "png"

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const-string p0, "image/png"

    .line 88
    .line 89
    return-object p0

    .line 90
    :sswitch_3
    const-string p1, "jpg"

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    const-string p0, "image/jpeg"

    .line 100
    .line 101
    return-object p0

    .line 102
    :sswitch_4
    const-string p1, "gif"

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_6

    .line 109
    .line 110
    :goto_1
    const-string p0, ""

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_6
    const-string p0, "image/gif"

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x18fc4 -> :sswitch_4
        0x19be1 -> :sswitch_3
        0x1b229 -> :sswitch_2
        0x31e068 -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public static f(Ljava/lang/String;)Lfb/e0;
    .locals 1

    .line 1
    invoke-static {p0}, Lfb/f0;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lfb/f0;->g(Ljava/util/List;Ljava/util/Map;)Lfb/e0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static g(Ljava/util/List;Ljava/util/Map;)Lfb/e0;
    .locals 19

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfb/e0;

    .line 12
    .line 13
    invoke-direct {v0, v2, v1, v1}, Lfb/e0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v9, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v10, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/io/File;

    .line 52
    .line 53
    invoke-static {v5}, Lfb/f0;->a(Ljava/io/File;)Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v4, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v5, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    move-object v7, v6

    .line 88
    check-cast v7, Ljava/io/File;

    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    const/16 v0, 0xc

    .line 105
    .line 106
    invoke-static {v0, v5}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_20

    .line 119
    .line 120
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object v5, v0

    .line 125
    check-cast v5, Ljava/io/File;

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    const-string v5, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 141
    .line 142
    invoke-static {v0, v5}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :goto_3
    move-object/from16 v6, p1

    .line 150
    .line 151
    :goto_4
    move-object/from16 v18, v1

    .line 152
    .line 153
    move-object/from16 v16, v4

    .line 154
    .line 155
    move-object v15, v9

    .line 156
    goto/16 :goto_19

    .line 157
    .line 158
    :cond_5
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_6

    .line 169
    .line 170
    new-instance v6, Lfb/r;

    .line 171
    .line 172
    const/4 v7, 0x2

    .line 173
    invoke-direct {v6, v7}, Lfb/r;-><init>(I)V

    .line 174
    .line 175
    .line 176
    new-instance v7, Lc9/a0;

    .line 177
    .line 178
    const/16 v8, 0xa

    .line 179
    .line 180
    invoke-direct {v7, v6, v8}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v7}, Ltf/l;->H0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const/16 v6, 0x78

    .line 188
    .line 189
    invoke-static {v6, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto :goto_5

    .line 194
    :cond_6
    const/4 v0, 0x0

    .line 195
    :goto_5
    if-nez v0, :cond_7

    .line 196
    .line 197
    move-object v11, v1

    .line 198
    goto :goto_6

    .line 199
    :cond_7
    move-object v11, v0

    .line 200
    :goto_6
    new-instance v15, Le9/h;

    .line 201
    .line 202
    const/16 v0, 0x1d

    .line 203
    .line 204
    invoke-direct {v15, v0}, Le9/h;-><init>(I)V

    .line 205
    .line 206
    .line 207
    const/16 v16, 0x1e

    .line 208
    .line 209
    const-string v12, "\n"

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    invoke-static/range {v11 .. v16}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-eqz v6, :cond_8

    .line 222
    .line 223
    const-string v0, "\u76ee\u5f55\u4e3a\u7a7a\u6216\u65e0\u6cd5\u8bfb\u53d6"

    .line 224
    .line 225
    :cond_8
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v6, v0}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_9

    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v6, "\u8bfb\u53d6\u76ee\u5f55: "

    .line 256
    .line 257
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_a
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_1f

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object/from16 v6, p1

    .line 282
    .line 283
    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Ljava/lang/String;

    .line 288
    .line 289
    if-nez v0, :cond_b

    .line 290
    .line 291
    move-object v7, v2

    .line 292
    goto :goto_7

    .line 293
    :cond_b
    move-object v7, v0

    .line 294
    :goto_7
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {v0, v7}, Lfb/f0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    const-string v11, " bytes"

    .line 310
    .line 311
    const-string v12, "\uff0c\u5927\u5c0f="

    .line 312
    .line 313
    if-nez v8, :cond_d

    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 316
    .line 317
    .line 318
    move-result-wide v7

    .line 319
    const-wide/32 v13, 0xa00000

    .line 320
    .line 321
    .line 322
    cmp-long v7, v7, v13

    .line 323
    .line 324
    if-gtz v7, :cond_c

    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 341
    .line 342
    .line 343
    move-result-wide v13

    .line 344
    const-string v8, "\u56fe\u7247\uff0c\u7c7b\u578b="

    .line 345
    .line 346
    invoke-static {v8, v0, v12, v13, v14}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v7, v0}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    new-instance v5, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v7, "\u8bfb\u53d6\u56fe\u7247: "

    .line 371
    .line 372
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    goto/16 :goto_4

    .line 386
    .line 387
    :cond_c
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const-string v5, "\u56fe\u7247\u8d85\u8fc7 10 MB\uff0c\u672a\u53d1\u9001\u7ed9\u6a21\u578b"

    .line 395
    .line 396
    invoke-static {v0, v5}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    goto/16 :goto_4

    .line 404
    .line 405
    :cond_d
    const-string v0, "text/"

    .line 406
    .line 407
    const/4 v8, 0x0

    .line 408
    invoke-static {v7, v0, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-nez v0, :cond_e

    .line 413
    .line 414
    invoke-static {v5}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 419
    .line 420
    invoke-virtual {v0, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    sget-object v14, Lfb/f0;->b:Ljava/util/Set;

    .line 428
    .line 429
    invoke-interface {v14, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_f

    .line 434
    .line 435
    :cond_e
    move-object/from16 v18, v1

    .line 436
    .line 437
    move-object v15, v9

    .line 438
    goto/16 :goto_f

    .line 439
    .line 440
    :cond_f
    :try_start_0
    new-instance v14, Ljava/io/FileInputStream;

    .line 441
    .line 442
    invoke-direct {v14, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 443
    .line 444
    .line 445
    move-object v15, v9

    .line 446
    :try_start_1
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 447
    .line 448
    .line 449
    move-result-wide v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 450
    move-object/from16 v16, v14

    .line 451
    .line 452
    const-wide/16 v13, 0x1000

    .line 453
    .line 454
    :try_start_2
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 455
    .line 456
    .line 457
    move-result-wide v8

    .line 458
    long-to-int v8, v8

    .line 459
    new-array v8, v8, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 460
    .line 461
    move-object/from16 v9, v16

    .line 462
    .line 463
    :try_start_3
    invoke-virtual {v9, v8}, Ljava/io/FileInputStream;->read([B)I

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    if-gtz v13, :cond_10

    .line 468
    .line 469
    :goto_8
    const/4 v13, 0x1

    .line 470
    goto :goto_a

    .line 471
    :cond_10
    const/4 v14, 0x0

    .line 472
    const/16 v16, 0x0

    .line 473
    .line 474
    :goto_9
    if-lt v14, v13, :cond_11

    .line 475
    .line 476
    mul-int/lit8 v8, v16, 0xa

    .line 477
    .line 478
    if-ge v8, v13, :cond_12

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_11
    aget-byte v0, v8, v14

    .line 482
    .line 483
    and-int/lit16 v0, v0, 0xff

    .line 484
    .line 485
    if-nez v0, :cond_13

    .line 486
    .line 487
    :cond_12
    const/4 v13, 0x0

    .line 488
    :goto_a
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 489
    .line 490
    .line 491
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 492
    :try_start_4
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 493
    .line 494
    .line 495
    move-object/from16 v18, v1

    .line 496
    .line 497
    goto :goto_e

    .line 498
    :catchall_0
    move-exception v0

    .line 499
    move-object/from16 v18, v1

    .line 500
    .line 501
    goto :goto_d

    .line 502
    :catchall_1
    move-exception v0

    .line 503
    move-object/from16 v18, v1

    .line 504
    .line 505
    :goto_b
    move-object v1, v0

    .line 506
    goto :goto_c

    .line 507
    :cond_13
    move-object/from16 v18, v1

    .line 508
    .line 509
    const/16 v1, 0x9

    .line 510
    .line 511
    if-lt v0, v1, :cond_14

    .line 512
    .line 513
    const/16 v1, 0xe

    .line 514
    .line 515
    if-gt v1, v0, :cond_15

    .line 516
    .line 517
    const/16 v1, 0x20

    .line 518
    .line 519
    if-ge v0, v1, :cond_15

    .line 520
    .line 521
    :cond_14
    add-int/lit8 v16, v16, 0x1

    .line 522
    .line 523
    :cond_15
    add-int/lit8 v14, v14, 0x1

    .line 524
    .line 525
    move-object/from16 v1, v18

    .line 526
    .line 527
    goto :goto_9

    .line 528
    :catchall_2
    move-exception v0

    .line 529
    move-object/from16 v18, v1

    .line 530
    .line 531
    move-object/from16 v9, v16

    .line 532
    .line 533
    goto :goto_b

    .line 534
    :catchall_3
    move-exception v0

    .line 535
    move-object/from16 v18, v1

    .line 536
    .line 537
    move-object v9, v14

    .line 538
    goto :goto_b

    .line 539
    :goto_c
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 540
    :catchall_4
    move-exception v0

    .line 541
    :try_start_6
    invoke-static {v9, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 545
    :catchall_5
    move-exception v0

    .line 546
    goto :goto_d

    .line 547
    :catchall_6
    move-exception v0

    .line 548
    move-object/from16 v18, v1

    .line 549
    .line 550
    move-object v15, v9

    .line 551
    :goto_d
    new-instance v1, Lsf/f;

    .line 552
    .line 553
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    move-object v0, v1

    .line 557
    :goto_e
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 558
    .line 559
    instance-of v8, v0, Lsf/f;

    .line 560
    .line 561
    if-eqz v8, :cond_16

    .line 562
    .line 563
    move-object v0, v1

    .line 564
    :cond_16
    check-cast v0, Ljava/lang/Boolean;

    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 567
    .line 568
    .line 569
    move-result v13

    .line 570
    goto :goto_10

    .line 571
    :goto_f
    const/4 v13, 0x1

    .line 572
    :goto_10
    if-eqz v13, :cond_1d

    .line 573
    .line 574
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 582
    .line 583
    .line 584
    move-result-wide v7

    .line 585
    const-wide/32 v11, 0x80000

    .line 586
    .line 587
    .line 588
    cmp-long v0, v7, v11

    .line 589
    .line 590
    const-string v7, "\u8bfb\u53d6\u5931\u8d25: "

    .line 591
    .line 592
    if-gtz v0, :cond_18

    .line 593
    .line 594
    :try_start_7
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 595
    .line 596
    invoke-static {v5, v0}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 600
    goto :goto_11

    .line 601
    :catchall_7
    move-exception v0

    .line 602
    new-instance v8, Lsf/f;

    .line 603
    .line 604
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 605
    .line 606
    .line 607
    move-object v0, v8

    .line 608
    :goto_11
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    if-nez v8, :cond_17

    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_17
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v7, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    :goto_12
    check-cast v0, Ljava/lang/String;

    .line 624
    .line 625
    move-object/from16 v16, v4

    .line 626
    .line 627
    move-object/from16 v17, v5

    .line 628
    .line 629
    goto/16 :goto_18

    .line 630
    .line 631
    :cond_18
    :try_start_8
    new-instance v8, Ljava/io/RandomAccessFile;

    .line 632
    .line 633
    const-string v0, "r"

    .line 634
    .line 635
    invoke-direct {v8, v5, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x40000

    .line 639
    .line 640
    :try_start_9
    new-array v0, v0, [B

    .line 641
    .line 642
    invoke-virtual {v8, v0}, Ljava/io/RandomAccessFile;->read([B)I

    .line 643
    .line 644
    .line 645
    move-result v9

    .line 646
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 647
    .line 648
    .line 649
    move-result-wide v11

    .line 650
    const-wide/32 v13, 0x40000

    .line 651
    .line 652
    .line 653
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 654
    .line 655
    .line 656
    move-result-wide v11

    .line 657
    long-to-int v11, v11

    .line 658
    new-array v12, v11, [B

    .line 659
    .line 660
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 661
    .line 662
    .line 663
    move-result-wide v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 664
    move-object/from16 v16, v4

    .line 665
    .line 666
    move-object/from16 v17, v5

    .line 667
    .line 668
    int-to-long v4, v11

    .line 669
    sub-long/2addr v13, v4

    .line 670
    const-wide/16 v4, 0x0

    .line 671
    .line 672
    cmp-long v11, v13, v4

    .line 673
    .line 674
    if-gez v11, :cond_19

    .line 675
    .line 676
    move-wide v13, v4

    .line 677
    :cond_19
    :try_start_a
    invoke-virtual {v8, v13, v14}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v8, v12}, Ljava/io/RandomAccessFile;->read([B)I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    new-instance v5, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 687
    .line 688
    .line 689
    new-instance v11, Ljava/lang/String;

    .line 690
    .line 691
    if-gez v9, :cond_1a

    .line 692
    .line 693
    const/4 v9, 0x0

    .line 694
    :cond_1a
    sget-object v13, Log/a;->a:Ljava/nio/charset/Charset;

    .line 695
    .line 696
    const/4 v14, 0x0

    .line 697
    invoke-direct {v11, v0, v14, v9, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v0, "\n\n... \u6587\u4ef6\u4e2d\u95f4\u5185\u5bb9\u5df2\u622a\u65ad ...\n\n"

    .line 704
    .line 705
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    new-instance v0, Ljava/lang/String;

    .line 709
    .line 710
    if-gez v4, :cond_1b

    .line 711
    .line 712
    const/4 v4, 0x0

    .line 713
    :cond_1b
    const/4 v14, 0x0

    .line 714
    invoke-direct {v0, v12, v14, v4, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 724
    :try_start_b
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 725
    .line 726
    .line 727
    goto :goto_16

    .line 728
    :catchall_8
    move-exception v0

    .line 729
    goto :goto_15

    .line 730
    :catchall_9
    move-exception v0

    .line 731
    :goto_13
    move-object v4, v0

    .line 732
    goto :goto_14

    .line 733
    :catchall_a
    move-exception v0

    .line 734
    move-object/from16 v16, v4

    .line 735
    .line 736
    move-object/from16 v17, v5

    .line 737
    .line 738
    goto :goto_13

    .line 739
    :goto_14
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 740
    :catchall_b
    move-exception v0

    .line 741
    :try_start_d
    invoke-static {v8, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 742
    .line 743
    .line 744
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 745
    :catchall_c
    move-exception v0

    .line 746
    move-object/from16 v16, v4

    .line 747
    .line 748
    move-object/from16 v17, v5

    .line 749
    .line 750
    :goto_15
    new-instance v4, Lsf/f;

    .line 751
    .line 752
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    move-object v0, v4

    .line 756
    :goto_16
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    if-nez v4, :cond_1c

    .line 761
    .line 762
    goto :goto_17

    .line 763
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-static {v7, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    :goto_17
    check-cast v0, Ljava/lang/String;

    .line 772
    .line 773
    :goto_18
    invoke-static {v1, v0}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    new-instance v1, Ljava/lang/StringBuilder;

    .line 785
    .line 786
    const-string v4, "\u8bfb\u53d6\u6587\u4ef6: "

    .line 787
    .line 788
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    goto :goto_19

    .line 802
    :cond_1d
    move-object/from16 v16, v4

    .line 803
    .line 804
    move-object/from16 v17, v5

    .line 805
    .line 806
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-eqz v1, :cond_1e

    .line 818
    .line 819
    const-string v7, "\u672a\u77e5"

    .line 820
    .line 821
    :cond_1e
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->length()J

    .line 822
    .line 823
    .line 824
    move-result-wide v4

    .line 825
    new-instance v1, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    const-string v8, "\u4e8c\u8fdb\u5236\u6587\u4ef6\uff0c\u7c7b\u578b="

    .line 828
    .line 829
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    invoke-static {v0, v1}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    new-instance v1, Ljava/lang/StringBuilder;

    .line 860
    .line 861
    const-string v4, "\u68c0\u67e5\u6587\u4ef6: "

    .line 862
    .line 863
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    goto :goto_19

    .line 877
    :cond_1f
    move-object/from16 v6, p1

    .line 878
    .line 879
    move-object/from16 v18, v1

    .line 880
    .line 881
    move-object/from16 v16, v4

    .line 882
    .line 883
    move-object/from16 v17, v5

    .line 884
    .line 885
    move-object v15, v9

    .line 886
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    const-string v1, "\u4e0d\u662f\u666e\u901a\u6587\u4ef6\u6216\u76ee\u5f55"

    .line 894
    .line 895
    invoke-static {v0, v1}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    :goto_19
    move-object v9, v15

    .line 903
    move-object/from16 v4, v16

    .line 904
    .line 905
    move-object/from16 v1, v18

    .line 906
    .line 907
    goto/16 :goto_2

    .line 908
    .line 909
    :cond_20
    move-object v15, v9

    .line 910
    new-instance v0, Lfb/e0;

    .line 911
    .line 912
    const/4 v7, 0x0

    .line 913
    const/16 v8, 0x3e

    .line 914
    .line 915
    const-string v4, "\n\n"

    .line 916
    .line 917
    const/4 v5, 0x0

    .line 918
    const/4 v6, 0x0

    .line 919
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    const v2, 0x1d4c0

    .line 924
    .line 925
    .line 926
    invoke-static {v2, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    invoke-static {v15}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    invoke-static {v10}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    invoke-direct {v0, v1, v2, v3}, Lfb/e0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 947
    .line 948
    .line 949
    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/util/ArrayList;)Lfb/e0;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lfb/f0;->a(Ljava/io/File;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "\u8bfb\u53d6\u5931\u8d25: "

    .line 22
    .line 23
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 24
    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    new-instance v3, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/io/File;

    .line 47
    .line 48
    invoke-static {v4}, Lfb/f0;->a(Ljava/io/File;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    const/4 v5, 0x1

    .line 94
    if-nez v4, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-array v6, v5, [C

    .line 111
    .line 112
    sget-char v7, Ljava/io/File;->separatorChar:C

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    aput-char v7, v6, v8

    .line 116
    .line 117
    invoke-static {v3, v6}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 122
    .line 123
    new-instance v7, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v4, v3, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_4

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    move v5, v8

    .line 146
    :cond_5
    :goto_1
    if-eqz v5, :cond_3

    .line 147
    .line 148
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 153
    .line 154
    invoke-static {p0, p1}, Lfb/f0;->g(Ljava/util/List;Ljava/util/Map;)Lfb/e0;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_6
    :goto_2
    new-instance p1, Lfb/e0;

    .line 160
    .line 161
    const-string v0, "\u53ea\u80fd\u8bfb\u53d6\u7528\u6237\u6d88\u606f\u4e2d\u660e\u786e\u63d0\u4f9b\u7684\u8def\u5f84\u6216\u5176\u5b50\u9879"

    .line 162
    .line 163
    invoke-static {p0, v0}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {p1, v0, v2, p0}, Lfb/e0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :cond_7
    new-instance p1, Lfb/e0;

    .line 180
    .line 181
    const-string v0, "\u8def\u5f84\u65e0\u6548"

    .line 182
    .line 183
    invoke-static {p0, v0}, Lfb/f0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-direct {p1, v0, v2, p0}, Lfb/e0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    return-object p1
.end method
