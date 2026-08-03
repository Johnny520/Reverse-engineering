.class public final Lx8/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field public static final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final c:Lokhttp3/OkHttpClient;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final k:[I

.field public static final l:Ljava/util/Set;

.field public static final m:Lx8/f;

.field public static final n:Lx8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lc9/q;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    new-instance v0, Lc9/q;

    .line 15
    .line 16
    const/16 v1, 0x1c

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lx8/q;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 26
    .line 27
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 28
    .line 29
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-wide/16 v1, 0x1e

    .line 33
    .line 34
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->pingInterval(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lx8/q;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lx8/q;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lx8/q;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lx8/q;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lx8/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lx8/q;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 87
    .line 88
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lx8/q;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    .line 95
    const/16 v0, 0x100

    .line 96
    .line 97
    new-array v1, v0, [I

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    move v3, v2

    .line 101
    :goto_0
    if-ge v3, v0, :cond_2

    .line 102
    .line 103
    shl-int/lit8 v4, v3, 0x18

    .line 104
    .line 105
    move v5, v2

    .line 106
    :goto_1
    const/16 v6, 0x8

    .line 107
    .line 108
    if-ge v5, v6, :cond_1

    .line 109
    .line 110
    const/high16 v6, -0x80000000

    .line 111
    .line 112
    and-int/2addr v6, v4

    .line 113
    if-eqz v6, :cond_0

    .line 114
    .line 115
    shl-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    const v6, 0x4c11db7

    .line 118
    .line 119
    .line 120
    xor-int/2addr v4, v6

    .line 121
    goto :goto_2

    .line 122
    :cond_0
    shl-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    aput v4, v1, v3

    .line 128
    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    sput-object v1, Lx8/q;->k:[I

    .line 133
    .line 134
    const-string v8, "m4a"

    .line 135
    .line 136
    const-string v9, "silk"

    .line 137
    .line 138
    const-string v4, "mp3"

    .line 139
    .line 140
    const-string v5, "wav"

    .line 141
    .line 142
    const-string v6, "ogg"

    .line 143
    .line 144
    const-string v7, "aac"

    .line 145
    .line 146
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, Lx8/q;->l:Ljava/util/Set;

    .line 155
    .line 156
    new-instance v1, Lx8/f;

    .line 157
    .line 158
    const-string v11, "auto_accept_remark_custom_enable"

    .line 159
    .line 160
    const-string v12, "auto_accept_remark_custom_text"

    .line 161
    .line 162
    const-string v2, "auto_accept_label_new_friend_enable"

    .line 163
    .line 164
    const-string v3, "auto_accept_label_date_enable"

    .line 165
    .line 166
    const-string v4, "auto_accept_label_date_format"

    .line 167
    .line 168
    const-string v5, "auto_accept_label_existing_enable"

    .line 169
    .line 170
    const-string v6, "auto_accept_label_selected_names"

    .line 171
    .line 172
    const-string v7, "auto_accept_remark_new_friend_enable"

    .line 173
    .line 174
    const-string v8, "auto_accept_remark_nickname_suffix_enable"

    .line 175
    .line 176
    const-string v9, "auto_accept_remark_date_enable"

    .line 177
    .line 178
    const-string v10, "auto_accept_remark_date_format"

    .line 179
    .line 180
    invoke-direct/range {v1 .. v12}, Lx8/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sput-object v1, Lx8/q;->m:Lx8/f;

    .line 184
    .line 185
    new-instance v2, Lx8/f;

    .line 186
    .line 187
    const-string v12, "greet_accepted_remark_custom_enable"

    .line 188
    .line 189
    const-string v13, "greet_accepted_remark_custom_text"

    .line 190
    .line 191
    const-string v3, "greet_accepted_label_new_friend_enable"

    .line 192
    .line 193
    const-string v4, "greet_accepted_label_date_enable"

    .line 194
    .line 195
    const-string v5, "greet_accepted_label_date_format"

    .line 196
    .line 197
    const-string v6, "greet_accepted_label_existing_enable"

    .line 198
    .line 199
    const-string v7, "greet_accepted_label_selected_names"

    .line 200
    .line 201
    const-string v8, "greet_accepted_remark_new_friend_enable"

    .line 202
    .line 203
    const-string v9, "greet_accepted_remark_nickname_suffix_enable"

    .line 204
    .line 205
    const-string v10, "greet_accepted_remark_date_enable"

    .line 206
    .line 207
    const-string v11, "greet_accepted_remark_date_format"

    .line 208
    .line 209
    invoke-direct/range {v2 .. v13}, Lx8/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    sput-object v2, Lx8/q;->n:Lx8/f;

    .line 213
    .line 214
    return-void
.end method

.method public static A(Lk8/o;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lk8/o;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lk8/o;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lk8/o;->f:Ljava/lang/String;

    .line 20
    .line 21
    :cond_1
    const-string p0, "^[^\\s:]{3,80}:\\n"

    .line 22
    .line 23
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v1, ""

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public static B(Lorg/json/JSONObject;Lx8/t;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lx8/t;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const-string v0, "tts_voice"

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    const-string v0, "voice"

    .line 27
    .line 28
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public static C(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0}, Lx8/q;->O(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v3, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x1

    .line 53
    const/4 v4, 0x0

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v5, v2

    .line 61
    check-cast v5, Ljava/io/File;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    invoke-static {v5}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v6, Lx8/q;->l:Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_2

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v3, v4

    .line 92
    :goto_2
    if-eqz v3, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    const/4 v2, 0x0

    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    sget-object p0, Ljg/d;->g:Ljg/a;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 118
    .line 119
    invoke-virtual {v1, p0}, Ljg/a;->g(I)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Ljava/io/File;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_4
    const-string p0, "Collection is empty."

    .line 135
    .line 136
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_5
    new-instance v0, Ljava/io/File;

    .line 141
    .line 142
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_6

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    new-instance p0, Lfb/h1;

    .line 153
    .line 154
    invoke-direct {p0, v3}, Lfb/h1;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-nez p0, :cond_7

    .line 162
    .line 163
    new-array p0, v4, [Ljava/io/File;

    .line 164
    .line 165
    :cond_7
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 166
    .line 167
    array-length v0, p0

    .line 168
    if-nez v0, :cond_8

    .line 169
    .line 170
    move-object p0, v2

    .line 171
    goto :goto_3

    .line 172
    :cond_8
    array-length v0, p0

    .line 173
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 174
    .line 175
    invoke-virtual {v1, v0}, Ljg/a;->g(I)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    aget-object p0, p0, v0

    .line 180
    .line 181
    :goto_3
    if-eqz p0, :cond_9

    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :cond_9
    :goto_4
    return-object v2
.end method

.method public static D(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lx8/l;
    .locals 47

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v12, p2

    .line 6
    .line 7
    new-instance v0, Lx8/r;

    .line 8
    .line 9
    invoke-direct {v0, v2}, Lx8/r;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lx8/r;->o()Lx8/t;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v0, v1, Lx8/t;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v13

    .line 26
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v14, 0x0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const-string v0, "\u8bf7\u5148\u914d\u7f6e\u5c0f\u667a WebSocket \u5730\u5740"

    .line 34
    .line 35
    :try_start_0
    invoke-static {v2, v0, v14}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :catchall_0
    new-instance v0, Lx8/l;

    .line 43
    .line 44
    invoke-direct {v0}, Lx8/l;-><init>()V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    iget-object v0, v1, Lx8/t;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v6, v1, Lx8/t;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string v7, "|"

    .line 73
    .line 74
    invoke-static {v0, v7, v6, v7, v5}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    sget-object v0, Lx8/q;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {v0, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    const-string v6, "SHA-256"

    .line 87
    .line 88
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    sget-object v9, Ljg/d;->g:Ljg/a;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljg/a;->d()J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    new-instance v14, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const/16 v17, 0x1

    .line 111
    .line 112
    const-string v11, ":"

    .line 113
    .line 114
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v14, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    sget-object v8, Log/a;->a:Ljava/nio/charset/Charset;

    .line 131
    .line 132
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v7}, Ljava/security/MessageDigest;->digest([B)[B

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const-string v7, ""

    .line 147
    .line 148
    new-instance v8, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 154
    .line 155
    .line 156
    array-length v9, v6

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    :goto_0
    if-ge v10, v9, :cond_2

    .line 160
    .line 161
    aget-byte v14, v6, v10

    .line 162
    .line 163
    add-int/lit8 v11, v11, 0x1

    .line 164
    .line 165
    move/from16 v2, v17

    .line 166
    .line 167
    if-le v11, v2, :cond_1

    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 170
    .line 171
    .line 172
    :cond_1
    invoke-static {v14}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    move-wide/from16 v18, v3

    .line 177
    .line 178
    const-string v3, "%02x"

    .line 179
    .line 180
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 193
    .line 194
    .line 195
    add-int/lit8 v10, v10, 0x1

    .line 196
    .line 197
    move-object/from16 v2, p0

    .line 198
    .line 199
    move-wide/from16 v3, v18

    .line 200
    .line 201
    const/16 v17, 0x1

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_2
    move-wide/from16 v18, v3

    .line 205
    .line 206
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const/16 v3, 0x10

    .line 214
    .line 215
    invoke-static {v3, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const-string v3, "hchat_"

    .line 220
    .line 221
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v0, v15, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-nez v0, :cond_3

    .line 230
    .line 231
    move-object v6, v2

    .line 232
    goto :goto_1

    .line 233
    :cond_3
    move-object v6, v0

    .line 234
    goto :goto_1

    .line 235
    :cond_4
    move-wide/from16 v18, v3

    .line 236
    .line 237
    :goto_1
    move-object v2, v6

    .line 238
    check-cast v2, Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v12}, Lx8/q;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-nez v3, :cond_9

    .line 249
    .line 250
    iget-boolean v3, v1, Lx8/t;->i:Z

    .line 251
    .line 252
    iget-boolean v4, v1, Lx8/t;->l:Z

    .line 253
    .line 254
    if-nez v3, :cond_5

    .line 255
    .line 256
    if-nez v4, :cond_5

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_5
    invoke-static {}, La/a;->E()Luf/c;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    iget-boolean v6, v1, Lx8/t;->i:Z

    .line 264
    .line 265
    if-eqz v6, :cond_6

    .line 266
    .line 267
    const-string v6, "\u5b98\u65b9 Music MCP"

    .line 268
    .line 269
    invoke-virtual {v3, v6}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :cond_6
    if-eqz v4, :cond_7

    .line 273
    .line 274
    iget-object v4, v1, Lx8/t;->m:Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-nez v4, :cond_7

    .line 289
    .line 290
    const-string v4, "Hchat \u70b9\u6b4c\u5de5\u5177"

    .line 291
    .line 292
    invoke-virtual {v3, v4}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    :cond_7
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    const-string v7, " \u6216 "

    .line 300
    .line 301
    const/4 v10, 0x0

    .line 302
    const/16 v11, 0x3e

    .line 303
    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v9, 0x0

    .line 306
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_8

    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_8
    const-string v4, "\u7528\u6237\u60f3\u542c\u6b4c\uff0c\u5173\u952e\u8bcd\u662f\u300c"

    .line 318
    .line 319
    const-string v6, "\u300d\u3002\u8bf7\u4f18\u5148\u8c03\u7528"

    .line 320
    .line 321
    const-string v7, "\u64ad\u653e\u6216\u53d1\u9001\u97f3\u4e50\u5361\u7247\uff1b\u4e0d\u8981\u5148\u8bf4\u4f60\u4e0d\u80fd\u64ad\u653e\u3001\u6ca1\u6709\u627e\u5230\u6216\u9700\u8981\u7528\u6237\u81ea\u5df1\u6253\u5f00\u64ad\u653e\u5668\u3002\u539f\u59cb\u8bf7\u6c42\uff1a"

    .line 322
    .line 323
    invoke-static {v4, v0, v6, v3, v7}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    move-object v11, v0

    .line 335
    goto :goto_3

    .line 336
    :cond_9
    :goto_2
    move-object v11, v12

    .line 337
    :goto_3
    iget-boolean v0, v1, Lx8/t;->i:Z

    .line 338
    .line 339
    if-eqz v0, :cond_e

    .line 340
    .line 341
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-eqz v3, :cond_a

    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_a
    invoke-static {v0}, Lx8/q;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-nez v3, :cond_b

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_b
    const-string v20, "\u7b11\u8bdd"

    .line 368
    .line 369
    const-string v21, "\u6bb5\u5b50"

    .line 370
    .line 371
    const-string v22, "\u8bb2\u4e2a\u7b11\u8bdd"

    .line 372
    .line 373
    const-string v23, "\u8bb2\u7b11\u8bdd"

    .line 374
    .line 375
    const-string v24, "\u65b0\u95fb"

    .line 376
    .line 377
    const-string v25, "\u8d44\u8baf"

    .line 378
    .line 379
    const-string v26, "\u70ed\u70b9"

    .line 380
    .line 381
    const-string v27, "\u5934\u6761"

    .line 382
    .line 383
    const-string v28, "\u5929\u6c14"

    .line 384
    .line 385
    const-string v29, "\u6c14\u6e29"

    .line 386
    .line 387
    const-string v30, "\u4e0b\u96e8"

    .line 388
    .line 389
    const-string v31, "\u4e0b\u96ea"

    .line 390
    .line 391
    const-string v32, "\u7a7a\u6c14\u8d28\u91cf"

    .line 392
    .line 393
    const-string v33, "\u77e5\u8bc6\u5e93"

    .line 394
    .line 395
    const-string v34, "\u77e5\u8bc6"

    .line 396
    .line 397
    const-string v35, "\u8d44\u6599"

    .line 398
    .line 399
    const-string v36, "\u767e\u79d1"

    .line 400
    .line 401
    const-string v37, "\u67e5\u8be2"

    .line 402
    .line 403
    const-string v38, "\u67e5\u4e00\u4e0b"

    .line 404
    .line 405
    const-string v39, "\u641c\u7d22"

    .line 406
    .line 407
    filled-new-array/range {v20 .. v39}, [Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-eqz v4, :cond_c

    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_c
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_e

    .line 431
    .line 432
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    check-cast v4, Ljava/lang/String;

    .line 437
    .line 438
    const/4 v6, 0x0

    .line 439
    invoke-static {v0, v4, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    if-eqz v4, :cond_d

    .line 444
    .line 445
    :goto_4
    const/16 v31, 0x1

    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_e
    :goto_5
    const/16 v31, 0x0

    .line 449
    .line 450
    :goto_6
    iget-boolean v14, v1, Lx8/t;->j:Z

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    if-eqz v14, :cond_1a

    .line 454
    .line 455
    sget-object v0, Lx8/q;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 456
    .line 457
    iget-object v4, v1, Lx8/t;->k:Ljava/lang/String;

    .line 458
    .line 459
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    iget-boolean v6, v1, Lx8/t;->j:Z

    .line 468
    .line 469
    const-wide/16 v20, 0x3e8

    .line 470
    .line 471
    if-nez v6, :cond_10

    .line 472
    .line 473
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    check-cast v0, Lx8/k;

    .line 478
    .line 479
    if-eqz v0, :cond_f

    .line 480
    .line 481
    const-string v4, "disabled"

    .line 482
    .line 483
    invoke-virtual {v0, v4}, Lx8/k;->b(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_f
    move-object/from16 v32, v3

    .line 487
    .line 488
    move-object v4, v5

    .line 489
    move-object/from16 v23, v11

    .line 490
    .line 491
    move-wide/from16 v40, v18

    .line 492
    .line 493
    goto/16 :goto_7

    .line 494
    .line 495
    :cond_10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    check-cast v6, Lx8/k;

    .line 500
    .line 501
    iget-boolean v7, v1, Lx8/t;->l:Z

    .line 502
    .line 503
    iget-object v8, v1, Lx8/t;->m:Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    iget-object v9, v1, Lx8/t;->n:Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 516
    .line 517
    .line 518
    move-result-object v9

    .line 519
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v9

    .line 523
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    if-eqz v10, :cond_11

    .line 528
    .line 529
    const-string v9, "queryKugouMusic"

    .line 530
    .line 531
    :cond_11
    iget v10, v1, Lx8/t;->p:I

    .line 532
    .line 533
    const/16 v3, 0xa

    .line 534
    .line 535
    move-object/from16 v23, v11

    .line 536
    .line 537
    const/16 v11, 0x258

    .line 538
    .line 539
    invoke-static {v10, v3, v11}, Lr9/e0;->r(III)I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    int-to-long v10, v3

    .line 544
    mul-long v10, v10, v20

    .line 545
    .line 546
    if-eqz v6, :cond_12

    .line 547
    .line 548
    iget-object v3, v6, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 549
    .line 550
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    if-nez v3, :cond_12

    .line 555
    .line 556
    iget-object v3, v6, Lx8/k;->a:Ljava/lang/String;

    .line 557
    .line 558
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_12

    .line 563
    .line 564
    iget-boolean v3, v6, Lx8/k;->b:Z

    .line 565
    .line 566
    if-ne v3, v7, :cond_12

    .line 567
    .line 568
    iget-object v3, v6, Lx8/k;->c:Ljava/lang/String;

    .line 569
    .line 570
    invoke-static {v3, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_12

    .line 575
    .line 576
    iget-object v3, v6, Lx8/k;->d:Ljava/lang/String;

    .line 577
    .line 578
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-eqz v3, :cond_12

    .line 583
    .line 584
    move-object/from16 v24, v4

    .line 585
    .line 586
    iget-wide v3, v6, Lx8/k;->e:J

    .line 587
    .line 588
    cmp-long v3, v3, v10

    .line 589
    .line 590
    if-nez v3, :cond_13

    .line 591
    .line 592
    iget-object v0, v6, Lx8/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 593
    .line 594
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v6, v2, v5}, Lx8/k;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    move-object v4, v5

    .line 601
    move-object v3, v6

    .line 602
    move-wide/from16 v40, v18

    .line 603
    .line 604
    const/16 v32, 0x0

    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_12
    move-object/from16 v24, v4

    .line 608
    .line 609
    :cond_13
    if-eqz v6, :cond_14

    .line 610
    .line 611
    const-string v3, "endpoint changed"

    .line 612
    .line 613
    invoke-virtual {v6, v3}, Lx8/k;->b(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    :cond_14
    new-instance v3, Lx8/k;

    .line 617
    .line 618
    move-wide/from16 v40, v10

    .line 619
    .line 620
    move-object v11, v6

    .line 621
    move v6, v7

    .line 622
    move-object v7, v8

    .line 623
    move-object v8, v9

    .line 624
    move-wide/from16 v9, v40

    .line 625
    .line 626
    move-wide/from16 v40, v18

    .line 627
    .line 628
    move-object/from16 v4, v24

    .line 629
    .line 630
    const/16 v32, 0x0

    .line 631
    .line 632
    invoke-direct/range {v3 .. v10}, Lx8/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;J)V

    .line 633
    .line 634
    .line 635
    move-object v4, v5

    .line 636
    invoke-virtual {v3, v2, v4}, Lx8/k;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    :cond_15
    invoke-virtual {v0, v11, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    if-eqz v5, :cond_16

    .line 644
    .line 645
    invoke-virtual {v3}, Lx8/k;->c()V

    .line 646
    .line 647
    .line 648
    goto :goto_7

    .line 649
    :cond_16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    if-eq v5, v11, :cond_15

    .line 654
    .line 655
    const-string v5, "replaced"

    .line 656
    .line 657
    invoke-virtual {v3, v5}, Lx8/k;->b(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    move-object v3, v0

    .line 665
    check-cast v3, Lx8/k;

    .line 666
    .line 667
    :goto_7
    if-eqz v3, :cond_19

    .line 668
    .line 669
    iget v0, v1, Lx8/t;->o:I

    .line 670
    .line 671
    const/16 v5, 0x1e

    .line 672
    .line 673
    const/4 v6, 0x1

    .line 674
    invoke-static {v0, v6, v5}, Lr9/e0;->r(III)I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    int-to-long v5, v0

    .line 679
    mul-long v5, v5, v20

    .line 680
    .line 681
    iget-object v0, v3, Lx8/k;->a:Ljava/lang/String;

    .line 682
    .line 683
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-eqz v0, :cond_17

    .line 688
    .line 689
    goto :goto_9

    .line 690
    :cond_17
    :try_start_1
    iget-object v0, v3, Lx8/k;->m:Ljava/util/concurrent/CountDownLatch;

    .line 691
    .line 692
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 693
    .line 694
    invoke-virtual {v0, v5, v6, v7}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 699
    .line 700
    .line 701
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 702
    goto :goto_8

    .line 703
    :catchall_1
    move-exception v0

    .line 704
    new-instance v5, Lsf/f;

    .line 705
    .line 706
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 707
    .line 708
    .line 709
    move-object v0, v5

    .line 710
    :goto_8
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 711
    .line 712
    instance-of v6, v0, Lsf/f;

    .line 713
    .line 714
    if-eqz v6, :cond_18

    .line 715
    .line 716
    move-object v0, v5

    .line 717
    :cond_18
    check-cast v0, Ljava/lang/Boolean;

    .line 718
    .line 719
    goto :goto_9

    .line 720
    :cond_19
    move-object/from16 v3, v32

    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_1a
    move-object/from16 v32, v3

    .line 724
    .line 725
    move-object v4, v5

    .line 726
    move-object/from16 v23, v11

    .line 727
    .line 728
    move-wide/from16 v40, v18

    .line 729
    .line 730
    :goto_9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 731
    .line 732
    const-string v5, ""

    .line 733
    .line 734
    invoke-direct {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    new-instance v29, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    .line 740
    .line 741
    .line 742
    new-instance v27, Ljava/util/ArrayList;

    .line 743
    .line 744
    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 745
    .line 746
    .line 747
    new-instance v28, Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 750
    .line 751
    .line 752
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 753
    .line 754
    const/4 v6, 0x1

    .line 755
    invoke-direct {v5, v6}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 756
    .line 757
    .line 758
    new-instance v22, Ljava/util/concurrent/atomic/AtomicReference;

    .line 759
    .line 760
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 761
    .line 762
    .line 763
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 764
    .line 765
    const/4 v6, 0x0

    .line 766
    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 767
    .line 768
    .line 769
    new-instance v8, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 770
    .line 771
    invoke-direct {v8, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 772
    .line 773
    .line 774
    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 775
    .line 776
    invoke-direct {v9, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 777
    .line 778
    .line 779
    new-instance v16, Ljava/util/concurrent/atomic/AtomicReference;

    .line 780
    .line 781
    invoke-direct/range {v16 .. v16}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 782
    .line 783
    .line 784
    const/4 v10, 0x1

    .line 785
    new-instance v17, Ljava/util/concurrent/atomic/AtomicReference;

    .line 786
    .line 787
    invoke-direct/range {v17 .. v17}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 788
    .line 789
    .line 790
    new-instance v25, Ljava/util/concurrent/atomic/AtomicReference;

    .line 791
    .line 792
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 793
    .line 794
    .line 795
    new-instance v11, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 796
    .line 797
    invoke-direct {v11, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 798
    .line 799
    .line 800
    move/from16 v18, v6

    .line 801
    .line 802
    move-object v6, v9

    .line 803
    new-instance v9, Lgg/s;

    .line 804
    .line 805
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 806
    .line 807
    .line 808
    const/16 v10, 0x5dc0

    .line 809
    .line 810
    iput v10, v9, Lgg/s;->g:I

    .line 811
    .line 812
    new-instance v10, Lgg/s;

    .line 813
    .line 814
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 815
    .line 816
    .line 817
    move-object/from16 v20, v1

    .line 818
    .line 819
    const/4 v1, 0x1

    .line 820
    iput v1, v10, Lgg/s;->g:I

    .line 821
    .line 822
    move-object/from16 v19, v11

    .line 823
    .line 824
    new-instance v11, Lgg/s;

    .line 825
    .line 826
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 827
    .line 828
    .line 829
    const/16 v1, 0x3c

    .line 830
    .line 831
    iput v1, v11, Lgg/s;->g:I

    .line 832
    .line 833
    move-object/from16 v4, v23

    .line 834
    .line 835
    new-instance v23, Lgg/u;

    .line 836
    .line 837
    invoke-direct/range {v23 .. v23}, Ljava/lang/Object;-><init>()V

    .line 838
    .line 839
    .line 840
    new-instance v33, Lx8/m;

    .line 841
    .line 842
    new-instance v34, Lwb/o7;

    .line 843
    .line 844
    move/from16 v1, v18

    .line 845
    .line 846
    move-object/from16 v18, v8

    .line 847
    .line 848
    move-object/from16 v8, v16

    .line 849
    .line 850
    move/from16 v16, v1

    .line 851
    .line 852
    move-object/from16 v30, v0

    .line 853
    .line 854
    move-object v1, v3

    .line 855
    move-object/from16 v24, v5

    .line 856
    .line 857
    move-object/from16 v5, v20

    .line 858
    .line 859
    move-object/from16 v0, v34

    .line 860
    .line 861
    const/16 v42, 0x1

    .line 862
    .line 863
    move-object v3, v2

    .line 864
    move-object/from16 v2, p0

    .line 865
    .line 866
    invoke-direct/range {v0 .. v11}, Lwb/o7;-><init>(Lx8/k;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx8/t;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lgg/s;Lgg/s;Lgg/s;)V

    .line 867
    .line 868
    .line 869
    move-object v2, v15

    .line 870
    move-object v15, v6

    .line 871
    move-object v6, v5

    .line 872
    move-object v5, v7

    .line 873
    new-instance v35, Lwb/qp;

    .line 874
    .line 875
    move v7, v14

    .line 876
    move-object v14, v1

    .line 877
    move v1, v7

    .line 878
    move-object/from16 v26, v3

    .line 879
    .line 880
    move-object/from16 v21, v5

    .line 881
    .line 882
    move-object v7, v13

    .line 883
    move/from16 v43, v16

    .line 884
    .line 885
    move-object/from16 v20, v19

    .line 886
    .line 887
    move-object/from16 v13, v35

    .line 888
    .line 889
    move/from16 v19, p3

    .line 890
    .line 891
    move-object/from16 v16, v8

    .line 892
    .line 893
    move-object v8, v2

    .line 894
    invoke-direct/range {v13 .. v30}, Lwb/qp;-><init>(Lx8/k;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicBoolean;ZLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lgg/u;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 895
    .line 896
    .line 897
    move-object/from16 v19, v20

    .line 898
    .line 899
    move-object/from16 v15, v23

    .line 900
    .line 901
    move-object/from16 v4, v27

    .line 902
    .line 903
    move-object/from16 v13, v28

    .line 904
    .line 905
    new-instance v0, Ld9/h;

    .line 906
    .line 907
    const/4 v5, 0x7

    .line 908
    move-object v2, v14

    .line 909
    move v14, v1

    .line 910
    move-object v1, v2

    .line 911
    move/from16 v3, p3

    .line 912
    .line 913
    move-object/from16 v2, v18

    .line 914
    .line 915
    invoke-direct/range {v0 .. v5}, Ld9/h;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ZLjava/lang/Object;I)V

    .line 916
    .line 917
    .line 918
    move-object/from16 v36, v0

    .line 919
    .line 920
    move-object v0, v4

    .line 921
    new-instance v4, Lc9/z0;

    .line 922
    .line 923
    move-object v1, v11

    .line 924
    const/16 v11, 0xf

    .line 925
    .line 926
    move-object/from16 v2, p0

    .line 927
    .line 928
    move-object/from16 v46, v1

    .line 929
    .line 930
    move-object v1, v6

    .line 931
    move-object v12, v7

    .line 932
    move-object v3, v8

    .line 933
    move-object/from16 v44, v9

    .line 934
    .line 935
    move-object/from16 v45, v10

    .line 936
    .line 937
    move-object/from16 v6, v16

    .line 938
    .line 939
    move-object/from16 v7, v17

    .line 940
    .line 941
    move-object/from16 v5, v21

    .line 942
    .line 943
    move-object/from16 v10, v22

    .line 944
    .line 945
    move-object/from16 v8, v24

    .line 946
    .line 947
    move-object/from16 v9, v25

    .line 948
    .line 949
    invoke-direct/range {v4 .. v11}, Lc9/z0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 950
    .line 951
    .line 952
    move-object/from16 v37, v4

    .line 953
    .line 954
    new-instance v4, Lx8/d;

    .line 955
    .line 956
    const/4 v11, 0x0

    .line 957
    invoke-direct/range {v4 .. v11}, Lx8/d;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 958
    .line 959
    .line 960
    move-object/from16 v38, v4

    .line 961
    .line 962
    new-instance v4, Lx8/d;

    .line 963
    .line 964
    const/4 v11, 0x1

    .line 965
    invoke-direct/range {v4 .. v11}, Lx8/d;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 966
    .line 967
    .line 968
    move-object/from16 v39, v4

    .line 969
    .line 970
    invoke-direct/range {v33 .. v39}, Lx8/m;-><init>(Lwb/o7;Lwb/qp;Ld9/h;Lc9/z0;Lx8/d;Lx8/d;)V

    .line 971
    .line 972
    .line 973
    move-object/from16 v4, v33

    .line 974
    .line 975
    iput-object v4, v15, Lgg/u;->g:Ljava/lang/Object;

    .line 976
    .line 977
    iget-object v4, v15, Lgg/u;->g:Ljava/lang/Object;

    .line 978
    .line 979
    if-eqz v4, :cond_33

    .line 980
    .line 981
    check-cast v4, Lx8/m;

    .line 982
    .line 983
    invoke-virtual {v9, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    :try_start_2
    invoke-static {v2, v3, v12, v1, v14}, Lx8/q;->Z(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx8/t;Z)Lx8/n;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    iget-object v4, v15, Lgg/u;->g:Ljava/lang/Object;

    .line 994
    .line 995
    if-eqz v4, :cond_31

    .line 996
    .line 997
    check-cast v4, Lx8/m;

    .line 998
    .line 999
    invoke-virtual {v3, v4}, Lx8/n;->d(Lx8/m;)V

    .line 1000
    .line 1001
    .line 1002
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1003
    .line 1004
    const-wide/16 v11, 0x3c

    .line 1005
    .line 1006
    invoke-virtual {v8, v11, v12, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v4

    .line 1010
    if-nez v4, :cond_1b

    .line 1011
    .line 1012
    move-object/from16 v22, v10

    .line 1013
    .line 1014
    const/16 v10, 0x80

    .line 1015
    .line 1016
    move-object v4, v5

    .line 1017
    move-object v5, v6

    .line 1018
    move-object v6, v7

    .line 1019
    move-object v7, v8

    .line 1020
    move-object v8, v9

    .line 1021
    move-object/from16 v9, v22

    .line 1022
    .line 1023
    invoke-static/range {v4 .. v10}, Lx8/q;->F(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 1024
    .line 1025
    .line 1026
    :cond_1b
    invoke-virtual/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    if-nez v4, :cond_1d

    .line 1031
    .line 1032
    iget-object v4, v15, Lgg/u;->g:Ljava/lang/Object;

    .line 1033
    .line 1034
    if-eqz v4, :cond_1c

    .line 1035
    .line 1036
    check-cast v4, Lx8/m;

    .line 1037
    .line 1038
    invoke-virtual {v3, v4}, Lx8/n;->b(Lx8/m;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_a

    .line 1042
    :cond_1c
    const-string v0, "socketRequest"

    .line 1043
    .line 1044
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    throw v32

    .line 1048
    :cond_1d
    :goto_a
    move/from16 v3, p3

    .line 1049
    .line 1050
    if-eqz p3, :cond_1e

    .line 1051
    .line 1052
    invoke-static {v3, v0, v13}, Lx8/q;->G(ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1053
    .line 1054
    .line 1055
    monitor-enter v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 1056
    :try_start_3
    invoke-static {v13}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1060
    :try_start_4
    monitor-exit v13

    .line 1061
    goto :goto_b

    .line 1062
    :catchall_2
    move-exception v0

    .line 1063
    monitor-exit v13

    .line 1064
    throw v0

    .line 1065
    :cond_1e
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 1066
    .line 1067
    :goto_b
    new-instance v5, Ljava/util/ArrayList;

    .line 1068
    .line 1069
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1070
    .line 1071
    .line 1072
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v6

    .line 1076
    move/from16 v14, v43

    .line 1077
    .line 1078
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v7

    .line 1082
    if-eqz v7, :cond_21

    .line 1083
    .line 1084
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v7

    .line 1088
    check-cast v7, Ljava/util/List;

    .line 1089
    .line 1090
    move-object/from16 v9, v44

    .line 1091
    .line 1092
    iget v8, v9, Lgg/s;->g:I

    .line 1093
    .line 1094
    move-object/from16 v10, v45

    .line 1095
    .line 1096
    iget v11, v10, Lgg/s;->g:I

    .line 1097
    .line 1098
    move-object/from16 v12, v46

    .line 1099
    .line 1100
    iget v15, v12, Lgg/s;->g:I

    .line 1101
    .line 1102
    invoke-static {v2, v7, v8, v11, v15}, Lx8/q;->V(Landroid/content/Context;Ljava/util/List;III)Ljava/io/File;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v8

    .line 1106
    if-nez v8, :cond_1f

    .line 1107
    .line 1108
    move-object/from16 v11, v32

    .line 1109
    .line 1110
    move/from16 v14, v42

    .line 1111
    .line 1112
    goto :goto_d

    .line 1113
    :cond_1f
    new-instance v11, Lx8/o;

    .line 1114
    .line 1115
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1116
    .line 1117
    .line 1118
    move-result v7

    .line 1119
    iget v15, v12, Lgg/s;->g:I

    .line 1120
    .line 1121
    mul-int/2addr v7, v15

    .line 1122
    invoke-direct {v11, v8, v7}, Lx8/o;-><init>(Ljava/io/File;I)V

    .line 1123
    .line 1124
    .line 1125
    :goto_d
    if-eqz v11, :cond_20

    .line 1126
    .line 1127
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    :cond_20
    move-object/from16 v44, v9

    .line 1131
    .line 1132
    move-object/from16 v45, v10

    .line 1133
    .line 1134
    move-object/from16 v46, v12

    .line 1135
    .line 1136
    goto :goto_c

    .line 1137
    :cond_21
    move-object/from16 v9, v44

    .line 1138
    .line 1139
    move-object/from16 v10, v45

    .line 1140
    .line 1141
    move-object/from16 v12, v46

    .line 1142
    .line 1143
    new-instance v6, Ljava/util/ArrayList;

    .line 1144
    .line 1145
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v4

    .line 1152
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    if-eqz v7, :cond_22

    .line 1157
    .line 1158
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v7

    .line 1162
    check-cast v7, Ljava/lang/Iterable;

    .line 1163
    .line 1164
    invoke-static {v6, v7}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_e

    .line 1168
    :cond_22
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1169
    .line 1170
    .line 1171
    move-result v4

    .line 1172
    const/4 v7, 0x3

    .line 1173
    if-lt v4, v7, :cond_23

    .line 1174
    .line 1175
    move/from16 v4, v42

    .line 1176
    .line 1177
    goto :goto_f

    .line 1178
    :cond_23
    move/from16 v4, v43

    .line 1179
    .line 1180
    :goto_f
    if-nez v31, :cond_25

    .line 1181
    .line 1182
    if-nez v4, :cond_25

    .line 1183
    .line 1184
    if-eqz v14, :cond_24

    .line 1185
    .line 1186
    goto :goto_10

    .line 1187
    :cond_24
    move/from16 v22, v43

    .line 1188
    .line 1189
    goto :goto_11

    .line 1190
    :cond_25
    :goto_10
    move/from16 v22, v42

    .line 1191
    .line 1192
    :goto_11
    if-eqz v3, :cond_28

    .line 1193
    .line 1194
    if-nez v22, :cond_26

    .line 1195
    .line 1196
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1197
    .line 1198
    .line 1199
    move-result v3

    .line 1200
    if-nez v3, :cond_26

    .line 1201
    .line 1202
    if-eqz v14, :cond_28

    .line 1203
    .line 1204
    :cond_26
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v3

    .line 1208
    if-nez v3, :cond_28

    .line 1209
    .line 1210
    if-eqz v14, :cond_27

    .line 1211
    .line 1212
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v3

    .line 1216
    :catchall_3
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v4

    .line 1220
    if-eqz v4, :cond_27

    .line 1221
    .line 1222
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v4

    .line 1226
    check-cast v4, Lx8/o;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 1227
    .line 1228
    :try_start_5
    iget-object v4, v4, Lx8/o;->a:Ljava/io/File;

    .line 1229
    .line 1230
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1231
    .line 1232
    .line 1233
    goto :goto_12

    .line 1234
    :cond_27
    :try_start_6
    iget v3, v9, Lgg/s;->g:I

    .line 1235
    .line 1236
    iget v4, v10, Lgg/s;->g:I

    .line 1237
    .line 1238
    iget v7, v12, Lgg/s;->g:I

    .line 1239
    .line 1240
    invoke-static {v2, v6, v3, v4, v7}, Lx8/q;->V(Landroid/content/Context;Ljava/util/List;III)Ljava/io/File;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v3

    .line 1244
    goto :goto_13

    .line 1245
    :cond_28
    move-object/from16 v3, v32

    .line 1246
    .line 1247
    :goto_13
    if-eqz v22, :cond_29

    .line 1248
    .line 1249
    if-eqz v3, :cond_29

    .line 1250
    .line 1251
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v2

    .line 1255
    :catchall_4
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v4

    .line 1259
    if-eqz v4, :cond_29

    .line 1260
    .line 1261
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v4

    .line 1265
    check-cast v4, Lx8/o;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1266
    .line 1267
    :try_start_7
    iget-object v4, v4, Lx8/o;->a:Ljava/io/File;

    .line 1268
    .line 1269
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1270
    .line 1271
    .line 1272
    goto :goto_14

    .line 1273
    :cond_29
    :try_start_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1274
    .line 1275
    .line 1276
    move-result v2

    .line 1277
    iget v4, v12, Lgg/s;->g:I

    .line 1278
    .line 1279
    mul-int v20, v2, v4

    .line 1280
    .line 1281
    move-object/from16 v4, p1

    .line 1282
    .line 1283
    move-object/from16 v12, p2

    .line 1284
    .line 1285
    move-wide/from16 v6, v40

    .line 1286
    .line 1287
    invoke-static {v1, v4, v12, v6, v7}, Lx8/q;->v(Lx8/t;Ljava/lang/String;Ljava/lang/String;J)V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual/range {v30 .. v30}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    move-object/from16 v16, v1

    .line 1298
    .line 1299
    check-cast v16, Ljava/lang/String;

    .line 1300
    .line 1301
    if-eqz v3, :cond_2b

    .line 1302
    .line 1303
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    if-eqz v1, :cond_2a

    .line 1308
    .line 1309
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 1310
    .line 1311
    .line 1312
    move-result-wide v1

    .line 1313
    const-wide/16 v6, 0x0

    .line 1314
    .line 1315
    cmp-long v1, v1, v6

    .line 1316
    .line 1317
    if-lez v1, :cond_2a

    .line 1318
    .line 1319
    move-object v1, v3

    .line 1320
    goto :goto_15

    .line 1321
    :cond_2a
    move-object/from16 v1, v32

    .line 1322
    .line 1323
    :goto_15
    if-eqz v1, :cond_2b

    .line 1324
    .line 1325
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    move-object/from16 v32, v1

    .line 1330
    .line 1331
    :cond_2b
    if-nez v32, :cond_2c

    .line 1332
    .line 1333
    const-string v32, ""

    .line 1334
    .line 1335
    :cond_2c
    move-object/from16 v17, v32

    .line 1336
    .line 1337
    if-eqz v3, :cond_2d

    .line 1338
    .line 1339
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v0

    .line 1343
    :goto_16
    move-wide/from16 v18, v0

    .line 1344
    .line 1345
    goto :goto_17

    .line 1346
    :cond_2d
    invoke-static {v0, v13}, Lx8/q;->E(Ljava/util/ArrayList;Ljava/util/ArrayList;)J

    .line 1347
    .line 1348
    .line 1349
    move-result-wide v0

    .line 1350
    goto :goto_16

    .line 1351
    :goto_17
    if-nez v14, :cond_2f

    .line 1352
    .line 1353
    if-eqz v22, :cond_2e

    .line 1354
    .line 1355
    goto :goto_18

    .line 1356
    :cond_2e
    move-object/from16 v21, v5

    .line 1357
    .line 1358
    goto :goto_19

    .line 1359
    :cond_2f
    :goto_18
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 1360
    .line 1361
    move-object/from16 v21, v0

    .line 1362
    .line 1363
    :goto_19
    if-eqz v22, :cond_30

    .line 1364
    .line 1365
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1366
    .line 1367
    .line 1368
    move-result v14

    .line 1369
    move/from16 v23, v14

    .line 1370
    .line 1371
    goto :goto_1a

    .line 1372
    :cond_30
    move/from16 v23, v43

    .line 1373
    .line 1374
    :goto_1a
    new-instance v15, Lx8/l;

    .line 1375
    .line 1376
    invoke-direct/range {v15 .. v23}, Lx8/l;-><init>(Ljava/lang/String;Ljava/lang/String;JILjava/util/List;ZI)V

    .line 1377
    .line 1378
    .line 1379
    goto :goto_1b

    .line 1380
    :cond_31
    const-string v0, "socketRequest"

    .line 1381
    .line 1382
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    throw v32
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1386
    :catchall_5
    move-exception v0

    .line 1387
    new-instance v15, Lsf/f;

    .line 1388
    .line 1389
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1390
    .line 1391
    .line 1392
    :goto_1b
    invoke-static {v15}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    if-nez v0, :cond_32

    .line 1397
    .line 1398
    goto :goto_1c

    .line 1399
    :cond_32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    const-string v3, "[Hchat:AutoReply] \u5c0f\u667aAI \u8bf7\u6c42\u5931\u8d25: "

    .line 1406
    .line 1407
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v1

    .line 1417
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v15, Lx8/l;

    .line 1421
    .line 1422
    invoke-direct {v15}, Lx8/l;-><init>()V

    .line 1423
    .line 1424
    .line 1425
    :goto_1c
    check-cast v15, Lx8/l;

    .line 1426
    .line 1427
    return-object v15

    .line 1428
    :cond_33
    const-string v0, "socketRequest"

    .line 1429
    .line 1430
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    throw v32
.end method

.method public static final E(Ljava/util/ArrayList;Ljava/util/ArrayList;)J
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    move-wide v3, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, [B

    .line 20
    .line 21
    array-length v5, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    int-to-long v5, v5

    .line 23
    add-long/2addr v3, v5

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_4

    .line 27
    :cond_0
    monitor-exit p0

    .line 28
    monitor-enter p1

    .line 29
    :try_start_1
    new-instance p0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {p0, v5}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, [B

    .line 69
    .line 70
    array-length v0, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    int-to-long v5, v0

    .line 72
    add-long/2addr v1, v5

    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    monitor-exit p1

    .line 77
    add-long/2addr v1, v3

    .line 78
    return-wide v1

    .line 79
    :goto_3
    monitor-exit p1

    .line 80
    throw p0

    .line 81
    :goto_4
    monitor-exit p0

    .line 82
    throw p1
.end method

.method public static F(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p6, 0x40

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    and-int/lit16 p6, p6, 0x80

    .line 11
    .line 12
    if-eqz p6, :cond_1

    .line 13
    .line 14
    move p6, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p6, v2

    .line 17
    :goto_1
    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_6

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    invoke-interface {p0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 44
    .line 45
    .line 46
    :cond_3
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lx8/m;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lx8/n;

    .line 62
    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    const-string p1, "reply failed"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lx8/n;->a(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    if-eqz p6, :cond_5

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lx8/n;

    .line 80
    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Lx8/n;->b(Lx8/m;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_5
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lx8/n;

    .line 92
    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Lx8/n;->e()V

    .line 96
    .line 97
    .line 98
    :cond_6
    return-void
.end method

.method public static final G(ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    monitor-enter p1

    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    monitor-exit p1

    .line 12
    return-void

    .line 13
    :cond_1
    :try_start_1
    monitor-enter p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :try_start_2
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 19
    .line 20
    .line 21
    :try_start_3
    monitor-exit p2

    .line 22
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p1

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_0

    .line 29
    :catchall_1
    move-exception p0

    .line 30
    :try_start_4
    monitor-exit p2

    .line 31
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 32
    :goto_0
    monitor-exit p1

    .line 33
    throw p0
.end method

.method public static H(Lfg/l;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lx8/q;->O(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {p0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    :cond_0
    const-wide/16 v1, 0x12c

    .line 42
    .line 43
    invoke-static {v1, v2}, Lx8/q;->M(J)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return v0
.end method

.method public static I(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    new-instance v1, Log/k;

    .line 21
    .line 22
    const-string v2, "\\[AtWx=([^\\]]+)]"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Log/k;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, p1}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Lwb/sr;

    .line 32
    .line 33
    const/16 v4, 0x13

    .line 34
    .line 35
    invoke-direct {v3, v4}, Lwb/sr;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, Lwb/sr;

    .line 43
    .line 44
    const/16 v4, 0x14

    .line 45
    .line 46
    invoke-direct {v3, v4}, Lwb/sr;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lng/i;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-direct {v4, v2, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, Lca/s;

    .line 60
    .line 61
    const/16 v4, 0x16

    .line 62
    .line 63
    invoke-direct {v3, p0, v4}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1, v3}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0, p0, p1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0

    .line 81
    :cond_1
    invoke-virtual {v0, p0, p1, v2}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0

    .line 86
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 87
    return p0
.end method

.method public static J(Landroid/content/Context;Ljava/lang/String;Lx8/g;Z)Z
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p2 .. p2}, Lx8/q;->a(Lx8/g;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move/from16 v16, v3

    .line 15
    .line 16
    goto/16 :goto_b

    .line 17
    .line 18
    :cond_0
    move-object/from16 v2, p0

    .line 19
    .line 20
    invoke-static {v2, v0, v1, v3}, Lx8/q;->D(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lx8/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, v1, Lx8/l;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, v1, Lx8/l;->e:Ljava/util/List;

    .line 27
    .line 28
    iget-object v5, v1, Lx8/l;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v6, v1, Lx8/l;->f:Z

    .line 31
    .line 32
    const/16 v7, 0x3e8

    .line 33
    .line 34
    const-string v8, ".silk"

    .line 35
    .line 36
    const/4 v9, 0x1

    .line 37
    if-nez v6, :cond_b

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_b

    .line 44
    .line 45
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    :try_start_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    move v11, v3

    .line 54
    move v12, v11

    .line 55
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-eqz v13, :cond_8

    .line 60
    .line 61
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    add-int/lit8 v14, v11, 0x1

    .line 66
    .line 67
    if-ltz v11, :cond_7

    .line 68
    .line 69
    check-cast v13, Lx8/o;

    .line 70
    .line 71
    iget-object v15, v13, Lx8/o;->a:Ljava/io/File;

    .line 72
    .line 73
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v15}, Lx8/q;->s(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v16

    .line 84
    if-nez v16, :cond_2

    .line 85
    .line 86
    invoke-static {v15, v8, v9}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v16

    .line 90
    if-eqz v16, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move/from16 v16, v3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto :goto_5

    .line 98
    :cond_2
    :goto_1
    if-eqz v6, :cond_4

    .line 99
    .line 100
    iget v13, v13, Lx8/o;->b:I

    .line 101
    .line 102
    if-ge v13, v7, :cond_3

    .line 103
    .line 104
    move v13, v7

    .line 105
    :cond_3
    move/from16 v16, v3

    .line 106
    .line 107
    iget-object v3, v6, Lj8/p;->b:Lj8/y;

    .line 108
    .line 109
    invoke-virtual {v3, v13, v0, v15}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-ne v3, v9, :cond_5

    .line 114
    .line 115
    move v12, v9

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move/from16 v16, v3

    .line 118
    .line 119
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    sub-int/2addr v3, v9

    .line 124
    if-ge v11, v3, :cond_6

    .line 125
    .line 126
    const-wide/16 v17, 0x12c

    .line 127
    .line 128
    invoke-static/range {v17 .. v18}, Lx8/q;->M(J)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_3
    move v11, v14

    .line 132
    move/from16 v3, v16

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    invoke-static {}, La/a;->Q0()V

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    :cond_8
    move/from16 v16, v3

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    :catchall_1
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, Lx8/o;

    .line 157
    .line 158
    :try_start_1
    iget-object v4, v4, Lx8/o;->a:Ljava/io/File;

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_9
    if-eqz v12, :cond_c

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :goto_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :catchall_2
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_a

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Lx8/o;

    .line 182
    .line 183
    :try_start_2
    iget-object v2, v2, Lx8/o;->a:Ljava/io/File;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    throw v0

    .line 190
    :cond_b
    move/from16 v16, v3

    .line 191
    .line 192
    :cond_c
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-nez v3, :cond_10

    .line 197
    .line 198
    invoke-static {v2}, Lx8/q;->s(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-nez v3, :cond_d

    .line 203
    .line 204
    invoke-static {v2, v8, v9}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_10

    .line 209
    .line 210
    :cond_d
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    if-eqz v3, :cond_f

    .line 215
    .line 216
    iget v1, v1, Lx8/l;->d:I

    .line 217
    .line 218
    if-ge v1, v7, :cond_e

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_e
    move v7, v1

    .line 222
    :goto_7
    iget-object v1, v3, Lj8/p;->b:Lj8/y;

    .line 223
    .line 224
    invoke-virtual {v1, v7, v0, v2}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-ne v1, v9, :cond_f

    .line 229
    .line 230
    move v1, v9

    .line 231
    goto :goto_8

    .line 232
    :cond_f
    move/from16 v1, v16

    .line 233
    .line 234
    :goto_8
    :try_start_3
    new-instance v3, Ljava/io/File;

    .line 235
    .line 236
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 240
    .line 241
    .line 242
    :catchall_3
    if-eqz v1, :cond_10

    .line 243
    .line 244
    :goto_9
    return v9

    .line 245
    :cond_10
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_11

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_11
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    if-eqz v1, :cond_13

    .line 257
    .line 258
    if-eqz p3, :cond_12

    .line 259
    .line 260
    move-object/from16 v2, p2

    .line 261
    .line 262
    iget-wide v2, v2, Lx8/g;->d:J

    .line 263
    .line 264
    const-wide/16 v6, 0x0

    .line 265
    .line 266
    cmp-long v4, v2, v6

    .line 267
    .line 268
    if-lez v4, :cond_12

    .line 269
    .line 270
    invoke-virtual {v1, v2, v3, v0, v5}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    goto :goto_a

    .line 275
    :cond_12
    invoke-static {v0, v5}, Lx8/q;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    :goto_a
    return v0

    .line 280
    :cond_13
    :goto_b
    return v16
.end method

.method public static K(Landroid/content/Context;Ljava/lang/String;Lx8/g;)Z
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static/range {p2 .. p2}, Lx8/q;->a(Lx8/g;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/16 p2, 0x0

    .line 14
    .line 15
    goto/16 :goto_c

    .line 16
    .line 17
    :cond_0
    const/4 v2, 0x1

    .line 18
    move-object/from16 v4, p0

    .line 19
    .line 20
    invoke-static {v4, v1, v0, v2}, Lx8/q;->D(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lx8/l;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v5, v0, Lx8/l;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v6, v0, Lx8/l;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const/16 v8, 0x3e8

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v7, :cond_b

    .line 36
    .line 37
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_3

    .line 42
    .line 43
    new-instance v4, Lx8/o;

    .line 44
    .line 45
    new-instance v6, Ljava/io/File;

    .line 46
    .line 47
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget v0, v0, Lx8/l;->d:I

    .line 51
    .line 52
    if-ge v0, v8, :cond_1

    .line 53
    .line 54
    move v0, v8

    .line 55
    :cond_1
    invoke-direct {v4, v6, v0}, Lx8/o;-><init>(Ljava/io/File;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move v11, v2

    .line 63
    const/16 p2, 0x0

    .line 64
    .line 65
    :cond_2
    :goto_0
    move-object v6, v0

    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_3
    iget-object v0, v0, Lx8/l;->a:Ljava/lang/String;

    .line 69
    .line 70
    const-string v5, "[Hchat:AutoReply] \u5c0f\u667a\u8bed\u97f3\u672c\u5730 TTS \u5931\u8d25: "

    .line 71
    .line 72
    const-string v6, "[Hchat:AutoReply] \u5c0f\u667a\u8bed\u97f3\u672c\u5730 TTS \u8f6c Silk \u5931\u8d25: "

    .line 73
    .line 74
    invoke-static {v0}, Lx8/q;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    :catchall_0
    :goto_1
    move v11, v2

    .line 85
    move-object v2, v9

    .line 86
    const/16 p2, 0x0

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    new-instance v7, Ljava/io/File;

    .line 91
    .line 92
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    const-string v11, "hchat_xiaozhi_reply"

    .line 97
    .line 98
    invoke-direct {v7, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 102
    .line 103
    .line 104
    const-string v10, ".wav"

    .line 105
    .line 106
    const-string v11, "reply_"

    .line 107
    .line 108
    invoke-static {v11, v10, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    const-string v12, ".pcm"

    .line 113
    .line 114
    invoke-static {v11, v12, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    const-string v13, ".silk"

    .line 119
    .line 120
    invoke-static {v11, v13, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v4, v0, v10}, Lx8/q;->Q(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z

    .line 135
    .line 136
    .line 137
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    :try_start_1
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    .line 142
    .line 143
    :catchall_1
    :try_start_2
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    :try_start_3
    invoke-static {v10}, Lx8/q;->S(Ljava/io/File;)[B

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    array-length v4, v0

    .line 152
    if-nez v4, :cond_6

    .line 153
    .line 154
    move-object v0, v9

    .line 155
    :cond_6
    if-eqz v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v4, Ljava/io/FileOutputStream;

    .line 161
    .line 162
    invoke-direct {v4, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 163
    .line 164
    .line 165
    :try_start_4
    invoke-virtual {v4, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 166
    .line 167
    .line 168
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 169
    .line 170
    .line 171
    new-instance v13, Lme/yun/silk/SilkCodec;

    .line 172
    .line 173
    invoke-direct {v13}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    const/16 v17, 0x3e80

    .line 185
    .line 186
    const/16 v18, 0x1

    .line 187
    .line 188
    const/16 v16, 0x5dc0

    .line 189
    .line 190
    invoke-virtual/range {v13 .. v18}, Lme/yun/silk/SilkCodec;->pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-nez v4, :cond_8

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-eqz v11, :cond_8

    .line 201
    .line 202
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 203
    .line 204
    .line 205
    move-result-wide v13

    .line 206
    const-wide/16 v15, 0x0

    .line 207
    .line 208
    cmp-long v11, v13, v15

    .line 209
    .line 210
    if-lez v11, :cond_8

    .line 211
    .line 212
    array-length v0, v0

    .line 213
    div-int/lit8 v0, v0, 0x2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 214
    .line 215
    int-to-long v13, v0

    .line 216
    const-wide/16 v15, 0x3e8

    .line 217
    .line 218
    mul-long/2addr v13, v15

    .line 219
    const/16 v0, 0x3e80

    .line 220
    .line 221
    move v11, v2

    .line 222
    const/16 p2, 0x0

    .line 223
    .line 224
    int-to-long v2, v0

    .line 225
    :try_start_6
    div-long/2addr v13, v2

    .line 226
    cmp-long v0, v13, v15

    .line 227
    .line 228
    if-gez v0, :cond_7

    .line 229
    .line 230
    move-wide v13, v15

    .line 231
    :cond_7
    long-to-int v0, v13

    .line 232
    new-instance v2, Lx8/o;

    .line 233
    .line 234
    invoke-direct {v2, v7, v0}, Lx8/o;-><init>(Ljava/io/File;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :catchall_2
    move-exception v0

    .line 239
    goto :goto_4

    .line 240
    :catchall_3
    move-exception v0

    .line 241
    move v11, v2

    .line 242
    const/16 p2, 0x0

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_8
    move v11, v2

    .line 246
    const/16 p2, 0x0

    .line 247
    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 261
    .line 262
    .line 263
    :try_start_7
    invoke-virtual {v7}, Ljava/io/File;->delete()Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 264
    .line 265
    .line 266
    :catchall_4
    move-object v2, v9

    .line 267
    :goto_2
    :try_start_8
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 268
    .line 269
    .line 270
    :catchall_5
    :try_start_9
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :catchall_6
    move-exception v0

    .line 275
    move v11, v2

    .line 276
    const/16 p2, 0x0

    .line 277
    .line 278
    move-object v2, v0

    .line 279
    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 280
    :catchall_7
    move-exception v0

    .line 281
    :try_start_b
    invoke-static {v4, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 285
    :cond_9
    move v11, v2

    .line 286
    const/16 p2, 0x0

    .line 287
    .line 288
    :try_start_c
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 289
    .line 290
    .line 291
    :catchall_8
    :goto_3
    :try_start_d
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 292
    .line 293
    .line 294
    :catchall_9
    move-object v2, v9

    .line 295
    goto :goto_5

    .line 296
    :goto_4
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 313
    .line 314
    .line 315
    :try_start_f
    invoke-virtual {v7}, Ljava/io/File;->delete()Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 316
    .line 317
    .line 318
    :catchall_a
    :try_start_10
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 319
    .line 320
    .line 321
    goto :goto_3

    .line 322
    :catchall_b
    :goto_5
    if-eqz v2, :cond_a

    .line 323
    .line 324
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    goto :goto_6

    .line 329
    :cond_a
    move-object v0, v9

    .line 330
    :goto_6
    if-nez v0, :cond_2

    .line 331
    .line 332
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :catchall_c
    move-exception v0

    .line 337
    :try_start_11
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 338
    .line 339
    .line 340
    :catchall_d
    :try_start_12
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    .line 341
    .line 342
    .line 343
    :catchall_e
    throw v0

    .line 344
    :cond_b
    move v11, v2

    .line 345
    const/16 p2, 0x0

    .line 346
    .line 347
    :goto_7
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_c

    .line 352
    .line 353
    goto/16 :goto_c

    .line 354
    .line 355
    :cond_c
    :try_start_13
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    if-eqz v0, :cond_13

    .line 360
    .line 361
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    move/from16 v3, p2

    .line 366
    .line 367
    move v4, v3

    .line 368
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-eqz v5, :cond_11

    .line 373
    .line 374
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    add-int/lit8 v7, v3, 0x1

    .line 379
    .line 380
    if-ltz v3, :cond_10

    .line 381
    .line 382
    check-cast v5, Lx8/o;

    .line 383
    .line 384
    iget-object v10, v5, Lx8/o;->a:Ljava/io/File;

    .line 385
    .line 386
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    iget v5, v5, Lx8/o;->b:I

    .line 391
    .line 392
    if-ge v5, v8, :cond_d

    .line 393
    .line 394
    move v5, v8

    .line 395
    :cond_d
    iget-object v12, v0, Lj8/p;->b:Lj8/y;

    .line 396
    .line 397
    invoke-virtual {v12, v5, v1, v10}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    if-eqz v5, :cond_e

    .line 402
    .line 403
    move v4, v11

    .line 404
    :cond_e
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    sub-int/2addr v5, v11

    .line 409
    if-ge v3, v5, :cond_f

    .line 410
    .line 411
    const-wide/16 v12, 0x12c

    .line 412
    .line 413
    invoke-static {v12, v13}, Lx8/q;->M(J)V

    .line 414
    .line 415
    .line 416
    goto :goto_9

    .line 417
    :catchall_f
    move-exception v0

    .line 418
    goto :goto_d

    .line 419
    :cond_f
    :goto_9
    move v3, v7

    .line 420
    goto :goto_8

    .line 421
    :cond_10
    invoke-static {}, La/a;->Q0()V

    .line 422
    .line 423
    .line 424
    throw v9
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    .line 425
    :cond_11
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    :catchall_10
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_12

    .line 434
    .line 435
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, Lx8/o;

    .line 440
    .line 441
    :try_start_14
    iget-object v1, v1, Lx8/o;->a:Ljava/io/File;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    .line 444
    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_12
    return v4

    .line 448
    :cond_13
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :catchall_11
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_14

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    check-cast v1, Lx8/o;

    .line 463
    .line 464
    :try_start_15
    iget-object v1, v1, Lx8/o;->a:Ljava/io/File;

    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    .line 467
    .line 468
    .line 469
    goto :goto_b

    .line 470
    :cond_14
    :goto_c
    return p2

    .line 471
    :goto_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    :catchall_12
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_15

    .line 480
    .line 481
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Lx8/o;

    .line 486
    .line 487
    :try_start_16
    iget-object v2, v2, Lx8/o;->a:Ljava/io/File;

    .line 488
    .line 489
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_12

    .line 490
    .line 491
    .line 492
    goto :goto_e

    .line 493
    :cond_15
    throw v0
.end method

.method public static L(Landroid/content/Context;Ljava/lang/String;Lx8/g;Z)Z
    .locals 11

    .line 1
    new-instance v0, Lx8/r;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx8/r;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lx8/r;->a()Lx8/u;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "ai_stream"

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v10

    .line 16
    invoke-virtual {v1}, Lx8/u;->b()Lx8/u;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Lx8/a;

    .line 21
    .line 22
    iget-object v4, v0, Lx8/u;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v5, v0, Lx8/u;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v6, v0, Lx8/u;->d:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v7, v0, Lx8/u;->e:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v8, v0, Lx8/u;->f:Ljava/lang/String;

    .line 31
    .line 32
    iget v9, v0, Lx8/u;->g:I

    .line 33
    .line 34
    invoke-direct/range {v3 .. v10}, Lx8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    const-string p1, "\u8bf7\u5148\u914d\u7f6e\u81ea\u52a8\u56de\u590d AI Key"

    .line 45
    .line 46
    :try_start_0
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_0
    invoke-static {p2}, Lx8/q;->a(Lx8/g;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    sget-object v0, Lx8/q;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    new-instance v2, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_2

    .line 84
    .line 85
    new-instance v4, Lx8/e;

    .line 86
    .line 87
    const-string v5, "system"

    .line 88
    .line 89
    invoke-direct {v4, v5, v8}, Lx8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move-object v2, v0

    .line 103
    :cond_4
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    monitor-enter v2

    .line 106
    :try_start_1
    invoke-static {v2}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lx8/e;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    iget-object v0, v0, Lx8/e;->a:Ljava/lang/String;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p0, v0

    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :cond_5
    const/4 v0, 0x0

    .line 122
    :goto_1
    const-string v4, "system"

    .line 123
    .line 124
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lx8/e;

    .line 135
    .line 136
    iget-object v0, v0, Lx8/e;->b:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v0, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_7

    .line 143
    .line 144
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    new-instance v0, Lx8/e;

    .line 155
    .line 156
    const-string v4, "system"

    .line 157
    .line 158
    invoke-direct {v0, v4, v8}, Lx8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v2, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_a

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Lx8/e;

    .line 187
    .line 188
    iget-object v4, v4, Lx8/e;->a:Ljava/lang/String;

    .line 189
    .line 190
    const-string v5, "system"

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_9

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_a
    :goto_2
    iget-object v0, v3, Lx8/a;->e:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_b

    .line 206
    .line 207
    new-instance v0, Lx8/e;

    .line 208
    .line 209
    const-string v4, "system"

    .line 210
    .line 211
    iget-object v5, v3, Lx8/a;->e:Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {v0, v4, v5}, Lx8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v2, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_b
    :goto_3
    new-instance v0, Lx8/e;

    .line 220
    .line 221
    const-string v4, "user"

    .line 222
    .line 223
    invoke-direct {v0, v4, p0}, Lx8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    iget p0, v3, Lx8/a;->f:I

    .line 230
    .line 231
    invoke-static {p0, v2}, Lx8/q;->R(ILjava/util/List;)V

    .line 232
    .line 233
    .line 234
    iget-boolean p0, v3, Lx8/a;->g:Z

    .line 235
    .line 236
    if-eqz p0, :cond_d

    .line 237
    .line 238
    invoke-static {v3, v2}, Lx8/q;->g(Lx8/a;Ljava/util/List;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    if-eqz p0, :cond_c

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_c
    invoke-static {v3, v2}, Lx8/q;->f(Lx8/a;Ljava/util/List;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    goto :goto_4

    .line 250
    :cond_d
    invoke-static {v3, v2}, Lx8/q;->f(Lx8/a;Ljava/util/List;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    if-eqz p0, :cond_e

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_e
    invoke-static {v3, v2}, Lx8/q;->g(Lx8/a;Ljava/util/List;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    :goto_4
    if-nez p0, :cond_f

    .line 262
    .line 263
    const-string p0, ""

    .line 264
    .line 265
    :cond_f
    invoke-static {p0}, Lx8/q;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_10

    .line 274
    .line 275
    new-instance v0, Lx8/e;

    .line 276
    .line 277
    const-string v4, "assistant"

    .line 278
    .line 279
    invoke-direct {v0, v4, p0}, Lx8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    iget v0, v3, Lx8/a;->f:I

    .line 286
    .line 287
    invoke-static {v0, v2}, Lx8/q;->R(ILjava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    .line 289
    .line 290
    :cond_10
    monitor-exit v2

    .line 291
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_11

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_11
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_13

    .line 303
    .line 304
    if-eqz p3, :cond_12

    .line 305
    .line 306
    iget-wide p2, p2, Lx8/g;->d:J

    .line 307
    .line 308
    const-wide/16 v1, 0x0

    .line 309
    .line 310
    cmp-long v1, p2, v1

    .line 311
    .line 312
    if-lez v1, :cond_12

    .line 313
    .line 314
    invoke-virtual {v0, p2, p3, p1, p0}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result p0

    .line 318
    return p0

    .line 319
    :cond_12
    invoke-static {p1, p0}, Lx8/q;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    return p0

    .line 324
    :catchall_1
    :cond_13
    :goto_5
    return v1

    .line 325
    :goto_6
    monitor-exit v2

    .line 326
    throw p0
.end method

.method public static M(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    return-void
.end method

.method public static N(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_2

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    return-object p0

    .line 79
    :array_0
    .array-data 2
        0x7cs
        -0xf4s
        0x2cs
        0xas
    .end array-data
.end method

.method public static O(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    const-string v0, ";;;"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x6

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    new-array v3, v3, [C

    .line 36
    .line 37
    const/16 v5, 0xa

    .line 38
    .line 39
    aput-char v5, v3, v2

    .line 40
    .line 41
    invoke-static {v1, v3, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v0, v1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    new-array v5, v3, [C

    .line 71
    .line 72
    const/16 v6, 0x7c

    .line 73
    .line 74
    aput-char v6, v5, v2

    .line 75
    .line 76
    invoke-static {v1, v5, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {p0, v1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v4, v1

    .line 133
    check-cast v4, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-lez v4, :cond_4

    .line 140
    .line 141
    move v4, v3

    .line 142
    goto :goto_4

    .line 143
    :cond_4
    move v4, v2

    .line 144
    :goto_4
    if-eqz v4, :cond_3

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    return-object p0
.end method

.method public static P(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x7c

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    const/4 v3, 0x6

    .line 10
    invoke-static {p0, v1, v3}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v3, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v3}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    move-object v5, v4

    .line 63
    check-cast v5, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-lez v5, :cond_2

    .line 70
    .line 71
    move v5, v0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v5, v2

    .line 74
    :goto_2
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    return-object v0

    .line 123
    :cond_6
    return-object v1
.end method

.method public static Q(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
    .locals 12

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    .line 10
    .line 11
    invoke-direct {v3, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    const-string v8, "hchat_xiaozhi_"

    .line 25
    .line 26
    invoke-static {v6, v7, v8}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    new-instance v7, Lgg/s;

    .line 31
    .line 32
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v8, -0x1

    .line 36
    iput v8, v7, Lgg/s;->g:I

    .line 37
    .line 38
    new-instance v9, Landroid/speech/tts/TextToSpeech;

    .line 39
    .line 40
    new-instance v10, Lob/a;

    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    invoke-direct {v10, v7, v1, v11}, Lob/a;-><init>(Ljava/io/Serializable;Ljava/util/concurrent/CountDownLatch;I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v9, p0, v10}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v10, 0x8

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v1, v10, v11, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 52
    .line 53
    .line 54
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 55
    if-nez p0, :cond_0

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v9}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    :catchall_0
    return v5

    .line 61
    :cond_0
    :try_start_2
    iget p0, v7, Lgg/s;->g:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 62
    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    :try_start_3
    invoke-virtual {v9}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    .line 67
    .line 68
    :catchall_1
    return v5

    .line 69
    :cond_1
    :try_start_4
    sget-object p0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 70
    .line 71
    invoke-virtual {v9, p0}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 72
    .line 73
    .line 74
    :catchall_2
    :try_start_5
    new-instance p0, Lx8/p;

    .line 75
    .line 76
    invoke-direct {p0, v4, v3}, Lx8/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/CountDownLatch;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, p0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I

    .line 80
    .line 81
    .line 82
    new-instance p0, Landroid/os/Bundle;

    .line 83
    .line 84
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "utteranceId"

    .line 88
    .line 89
    invoke-virtual {p0, v1, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, p1, p0, p2, v6}, Landroid/speech/tts/TextToSpeech;->synthesizeToFile(Ljava/lang/CharSequence;Landroid/os/Bundle;Ljava/io/File;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 96
    if-ne p0, v8, :cond_2

    .line 97
    .line 98
    :try_start_6
    invoke-virtual {v9}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 99
    .line 100
    .line 101
    :catchall_3
    return v5

    .line 102
    :cond_2
    const-wide/16 p0, 0x14

    .line 103
    .line 104
    :try_start_7
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_3

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_3

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 123
    .line 124
    .line 125
    move-result-wide p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 126
    const-wide/16 v0, 0x2c

    .line 127
    .line 128
    cmp-long p0, p0, v0

    .line 129
    .line 130
    if-lez p0, :cond_3

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :catchall_4
    move-exception p0

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move v2, v5

    .line 136
    :goto_0
    :try_start_8
    invoke-virtual {v9}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 137
    .line 138
    .line 139
    :catchall_5
    return v2

    .line 140
    :goto_1
    :try_start_9
    invoke-virtual {v9}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 141
    .line 142
    .line 143
    :catchall_6
    throw p0
.end method

.method public static R(ILjava/util/List;)V
    .locals 4

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    :cond_0
    mul-int/lit8 p0, p0, 0x2

    .line 5
    .line 6
    invoke-static {p1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lx8/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lx8/e;->a:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object v0, v1

    .line 19
    :goto_0
    const-string v2, "system"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, p0

    .line 26
    if-gtz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-le p0, v0, :cond_4

    .line 37
    .line 38
    invoke-static {p1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lx8/e;

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    iget-object p0, p0, Lx8/e;->a:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move-object p0, v1

    .line 50
    :goto_2
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ltz p0, :cond_4

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-ge p0, v3, :cond_4

    .line 61
    .line 62
    invoke-interface {p1, p0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lx8/e;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    return-void
.end method

.method public static S(Ljava/io/File;)[B
    .locals 18

    .line 1
    invoke-static/range {p0 .. p0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/16 v2, 0x2c

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-le v1, v2, :cond_14

    .line 10
    .line 11
    sget-object v1, Log/a;->b:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    invoke-direct {v2, v0, v3, v4, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "RIFF"

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_f

    .line 28
    .line 29
    :cond_0
    const/16 v1, 0xc

    .line 30
    .line 31
    const/16 v2, 0x10

    .line 32
    .line 33
    const/16 v5, 0x3e80

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    move v8, v2

    .line 37
    move v9, v5

    .line 38
    move v7, v6

    .line 39
    :goto_0
    add-int/lit8 v10, v1, 0x8

    .line 40
    .line 41
    array-length v11, v0

    .line 42
    if-gt v10, v11, :cond_6

    .line 43
    .line 44
    sget-object v11, Log/a;->b:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    new-instance v12, Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v12, v0, v1, v4, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v11, v1, 0x4

    .line 52
    .line 53
    invoke-static {v0, v11}, Lx8/q;->u([BI)I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    add-int v13, v10, v11

    .line 58
    .line 59
    array-length v14, v0

    .line 60
    if-le v13, v14, :cond_1

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    const-string v14, "fmt "

    .line 64
    .line 65
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-eqz v14, :cond_4

    .line 70
    .line 71
    if-lt v11, v2, :cond_5

    .line 72
    .line 73
    add-int/lit8 v7, v1, 0xa

    .line 74
    .line 75
    invoke-static {v0, v7}, Lx8/q;->t([BI)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-ge v7, v6, :cond_2

    .line 80
    .line 81
    move v7, v6

    .line 82
    :cond_2
    add-int/lit8 v8, v1, 0xc

    .line 83
    .line 84
    invoke-static {v0, v8}, Lx8/q;->u([BI)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const/16 v9, 0x1f40

    .line 89
    .line 90
    if-ge v8, v9, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move v9, v8

    .line 94
    :goto_1
    add-int/lit8 v1, v1, 0x16

    .line 95
    .line 96
    invoke-static {v0, v1}, Lx8/q;->t([BI)I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const-string v1, "data"

    .line 102
    .line 103
    invoke-virtual {v12, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    :goto_2
    and-int/lit8 v1, v11, 0x1

    .line 111
    .line 112
    add-int/2addr v1, v13

    .line 113
    goto :goto_0

    .line 114
    :cond_6
    :goto_3
    const/4 v10, -0x1

    .line 115
    move v11, v3

    .line 116
    :goto_4
    if-ltz v10, :cond_13

    .line 117
    .line 118
    if-lez v11, :cond_13

    .line 119
    .line 120
    if-eq v8, v2, :cond_7

    .line 121
    .line 122
    goto/16 :goto_e

    .line 123
    .line 124
    :cond_7
    div-int/lit8 v11, v11, 0x2

    .line 125
    .line 126
    div-int/2addr v11, v7

    .line 127
    if-gtz v11, :cond_8

    .line 128
    .line 129
    new-array v0, v3, [B

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_8
    new-array v1, v11, [S

    .line 133
    .line 134
    move v2, v3

    .line 135
    :goto_5
    const/16 v4, 0x7fff

    .line 136
    .line 137
    const/16 v8, -0x8000

    .line 138
    .line 139
    if-lt v2, v11, :cond_11

    .line 140
    .line 141
    if-ne v9, v5, :cond_9

    .line 142
    .line 143
    :goto_6
    move v15, v6

    .line 144
    goto :goto_b

    .line 145
    :cond_9
    if-nez v11, :cond_b

    .line 146
    .line 147
    :cond_a
    move v15, v6

    .line 148
    goto :goto_a

    .line 149
    :cond_b
    if-lez v9, :cond_a

    .line 150
    .line 151
    if-ne v9, v5, :cond_c

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_c
    int-to-long v12, v11

    .line 155
    int-to-long v14, v5

    .line 156
    mul-long/2addr v12, v14

    .line 157
    int-to-long v14, v9

    .line 158
    div-long/2addr v12, v14

    .line 159
    const-wide/16 v14, 0x1

    .line 160
    .line 161
    cmp-long v0, v12, v14

    .line 162
    .line 163
    if-gez v0, :cond_d

    .line 164
    .line 165
    move-wide v12, v14

    .line 166
    :cond_d
    long-to-int v0, v12

    .line 167
    new-array v2, v0, [S

    .line 168
    .line 169
    move v7, v3

    .line 170
    :goto_7
    if-lt v7, v0, :cond_e

    .line 171
    .line 172
    move-object v1, v2

    .line 173
    goto :goto_6

    .line 174
    :cond_e
    int-to-double v12, v7

    .line 175
    int-to-double v14, v9

    .line 176
    mul-double/2addr v12, v14

    .line 177
    int-to-double v14, v5

    .line 178
    div-double/2addr v12, v14

    .line 179
    double-to-int v10, v12

    .line 180
    add-int/lit8 v14, v11, -0x1

    .line 181
    .line 182
    invoke-static {v10, v3, v14}, Lr9/e0;->r(III)I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    add-int/lit8 v15, v10, 0x1

    .line 187
    .line 188
    if-le v15, v14, :cond_f

    .line 189
    .line 190
    :goto_8
    move v15, v6

    .line 191
    goto :goto_9

    .line 192
    :cond_f
    move v14, v15

    .line 193
    goto :goto_8

    .line 194
    :goto_9
    int-to-double v5, v10

    .line 195
    sub-double/2addr v12, v5

    .line 196
    aget-short v5, v1, v10

    .line 197
    .line 198
    int-to-double v5, v5

    .line 199
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 200
    .line 201
    sub-double v16, v16, v12

    .line 202
    .line 203
    mul-double v16, v16, v5

    .line 204
    .line 205
    aget-short v5, v1, v14

    .line 206
    .line 207
    int-to-double v5, v5

    .line 208
    mul-double/2addr v5, v12

    .line 209
    add-double v5, v5, v16

    .line 210
    .line 211
    double-to-int v5, v5

    .line 212
    invoke-static {v5, v8, v4}, Lr9/e0;->r(III)I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    int-to-short v5, v5

    .line 217
    aput-short v5, v2, v7

    .line 218
    .line 219
    add-int/lit8 v7, v7, 0x1

    .line 220
    .line 221
    move v6, v15

    .line 222
    const/16 v5, 0x3e80

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :goto_a
    new-array v1, v3, [S

    .line 226
    .line 227
    :goto_b
    array-length v0, v1

    .line 228
    mul-int/lit8 v0, v0, 0x2

    .line 229
    .line 230
    new-array v0, v0, [B

    .line 231
    .line 232
    array-length v2, v1

    .line 233
    move v4, v3

    .line 234
    :goto_c
    if-ge v3, v2, :cond_10

    .line 235
    .line 236
    aget-short v5, v1, v3

    .line 237
    .line 238
    add-int/lit8 v6, v4, 0x1

    .line 239
    .line 240
    mul-int/lit8 v4, v4, 0x2

    .line 241
    .line 242
    and-int/lit16 v7, v5, 0xff

    .line 243
    .line 244
    int-to-byte v7, v7

    .line 245
    aput-byte v7, v0, v4

    .line 246
    .line 247
    add-int/2addr v4, v15

    .line 248
    ushr-int/lit8 v5, v5, 0x8

    .line 249
    .line 250
    and-int/lit16 v5, v5, 0xff

    .line 251
    .line 252
    int-to-byte v5, v5

    .line 253
    aput-byte v5, v0, v4

    .line 254
    .line 255
    add-int/lit8 v3, v3, 0x1

    .line 256
    .line 257
    move v4, v6

    .line 258
    goto :goto_c

    .line 259
    :cond_10
    return-object v0

    .line 260
    :cond_11
    move v15, v6

    .line 261
    move v5, v3

    .line 262
    move v6, v5

    .line 263
    :goto_d
    if-ge v5, v7, :cond_12

    .line 264
    .line 265
    invoke-static {v0, v10}, Lx8/q;->t([BI)I

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    int-to-short v12, v12

    .line 270
    add-int/2addr v6, v12

    .line 271
    add-int/lit8 v10, v10, 0x2

    .line 272
    .line 273
    add-int/lit8 v5, v5, 0x1

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_12
    div-int/2addr v6, v7

    .line 277
    invoke-static {v6, v8, v4}, Lr9/e0;->r(III)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    int-to-short v4, v4

    .line 282
    aput-short v4, v1, v2

    .line 283
    .line 284
    add-int/lit8 v2, v2, 0x1

    .line 285
    .line 286
    move v6, v15

    .line 287
    const/16 v5, 0x3e80

    .line 288
    .line 289
    goto/16 :goto_5

    .line 290
    .line 291
    :cond_13
    :goto_e
    new-array v0, v3, [B

    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_14
    :goto_f
    new-array v0, v3, [B

    .line 295
    .line 296
    return-object v0
.end method

.method public static T(Ljava/io/ByteArrayOutputStream;I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v0, p1, 0x8

    .line 7
    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 11
    .line 12
    .line 13
    ushr-int/lit8 v0, p1, 0x10

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    ushr-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static U(Ljava/io/ByteArrayOutputStream;IJIILjava/util/List;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v3, 0xff

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, [B

    .line 23
    .line 24
    array-length v2, v2

    .line 25
    :goto_1
    if-lt v2, v3, :cond_0

    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/lit16 v2, v2, -0xff

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "OggS"

    .line 51
    .line 52
    sget-object v4, Log/a;->b:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 69
    .line 70
    .line 71
    move p1, v2

    .line 72
    :goto_2
    const/16 v4, 0x8

    .line 73
    .line 74
    if-lt p1, v4, :cond_5

    .line 75
    .line 76
    invoke-static {v1, p4}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, p5}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-virtual {v1, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-virtual {v1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_2
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, [B

    .line 131
    .line 132
    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    array-length p2, p1

    .line 144
    move p3, v2

    .line 145
    :goto_5
    if-ge v2, p2, :cond_4

    .line 146
    .line 147
    aget-byte p4, p1, v2

    .line 148
    .line 149
    shl-int/lit8 p5, p3, 0x8

    .line 150
    .line 151
    ushr-int/lit8 p3, p3, 0x18

    .line 152
    .line 153
    and-int/2addr p4, v3

    .line 154
    xor-int/2addr p3, p4

    .line 155
    and-int/2addr p3, v3

    .line 156
    sget-object p4, Lx8/q;->k:[I

    .line 157
    .line 158
    aget p3, p4, p3

    .line 159
    .line 160
    xor-int/2addr p3, p5

    .line 161
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_4
    and-int/lit16 p2, p3, 0xff

    .line 165
    .line 166
    int-to-byte p2, p2

    .line 167
    const/16 p4, 0x16

    .line 168
    .line 169
    aput-byte p2, p1, p4

    .line 170
    .line 171
    ushr-int/lit8 p2, p3, 0x8

    .line 172
    .line 173
    and-int/2addr p2, v3

    .line 174
    int-to-byte p2, p2

    .line 175
    const/16 p4, 0x17

    .line 176
    .line 177
    aput-byte p2, p1, p4

    .line 178
    .line 179
    ushr-int/lit8 p2, p3, 0x10

    .line 180
    .line 181
    and-int/2addr p2, v3

    .line 182
    int-to-byte p2, p2

    .line 183
    const/16 p4, 0x18

    .line 184
    .line 185
    aput-byte p2, p1, p4

    .line 186
    .line 187
    ushr-int/lit8 p2, p3, 0x18

    .line 188
    .line 189
    and-int/2addr p2, v3

    .line 190
    int-to-byte p2, p2

    .line 191
    const/16 p3, 0x19

    .line 192
    .line 193
    aput-byte p2, p1, p3

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    mul-int/lit8 v4, p1, 0x8

    .line 200
    .line 201
    ushr-long v4, p2, v4

    .line 202
    .line 203
    const-wide/16 v6, 0xff

    .line 204
    .line 205
    and-long/2addr v4, v6

    .line 206
    long-to-int v4, v4

    .line 207
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 208
    .line 209
    .line 210
    add-int/lit8 p1, p1, 0x1

    .line 211
    .line 212
    goto/16 :goto_2
.end method

.method public static V(Landroid/content/Context;Ljava/util/List;III)Ljava/io/File;
    .locals 17

    .line 1
    const-string v0, "xiaozhi_"

    .line 2
    .line 3
    const-string v1, "[Hchat:AutoReply] \u5c0f\u667a\u8bed\u97f3\u89e3\u7801\u5931\u8d25: code="

    .line 4
    .line 5
    const-string v2, "[Hchat:AutoReply] \u5c0f\u667a\u8bed\u97f3\u8f6cSilk\u5931\u8d25: code="

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v6, "hchat_xiaozhi_voice"

    .line 15
    .line 16
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 20
    .line 21
    .line 22
    const-string v5, ".ogg"

    .line 23
    .line 24
    invoke-static {v0, v5, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, ".pcm"

    .line 29
    .line 30
    invoke-static {v0, v6, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const-string v7, ".silk"

    .line 35
    .line 36
    invoke-static {v0, v7, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static/range {p1 .. p4}, Lx8/q;->e(Ljava/util/List;III)[B

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v7, Ljava/io/FileOutputStream;

    .line 48
    .line 49
    invoke-direct {v7, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v7, v4}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 53
    .line 54
    .line 55
    :try_start_2
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v4, v7, v3}, Lme/yun/silk/AacCodec;->decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    const-wide/16 v9, 0x0

    .line 83
    .line 84
    cmp-long v7, v7, v9

    .line 85
    .line 86
    if-gtz v7, :cond_0

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    new-instance v11, Lme/yun/silk/SilkCodec;

    .line 90
    .line 91
    invoke-direct {v11}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    const v15, 0xbb80

    .line 103
    .line 104
    .line 105
    const/16 v16, 0x1

    .line 106
    .line 107
    const/16 v14, 0x5dc0

    .line 108
    .line 109
    invoke-virtual/range {v11 .. v16}, Lme/yun/silk/SilkCodec;->pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I

    .line 110
    .line 111
    .line 112
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 113
    :try_start_3
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    .line 115
    .line 116
    :catchall_0
    :try_start_4
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 117
    .line 118
    .line 119
    :catchall_1
    if-nez v1, :cond_1

    .line 120
    .line 121
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_1

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    cmp-long v4, v4, v9

    .line 132
    .line 133
    if-lez v4, :cond_1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_2
    move-exception v0

    .line 137
    goto :goto_2

    .line 138
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 139
    .line 140
    .line 141
    move-result-wide v4

    .line 142
    new-instance v6, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, " silkLen="

    .line 151
    .line 152
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 163
    .line 164
    .line 165
    :try_start_6
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 166
    .line 167
    .line 168
    :catchall_3
    :goto_0
    move-object v0, v3

    .line 169
    goto :goto_3

    .line 170
    :cond_2
    :goto_1
    :try_start_7
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v1, " oggLen="

    .line 183
    .line 184
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v1}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 195
    .line 196
    .line 197
    :try_start_8
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 198
    .line 199
    .line 200
    :catchall_4
    :try_start_9
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :catchall_5
    move-exception v0

    .line 205
    move-object v1, v0

    .line 206
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 207
    :catchall_6
    move-exception v0

    .line 208
    :try_start_b
    invoke-static {v7, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 212
    :goto_2
    new-instance v1, Lsf/f;

    .line 213
    .line 214
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    move-object v0, v1

    .line 218
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-nez v1, :cond_3

    .line 223
    .line 224
    move-object v3, v0

    .line 225
    goto :goto_4

    .line 226
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-string v2, "[Hchat:AutoReply] \u751f\u6210\u5c0f\u667a\u8bed\u97f3\u6587\u4ef6\u5931\u8d25: "

    .line 231
    .line 232
    invoke-static {v2, v0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    :goto_4
    check-cast v3, Ljava/io/File;

    .line 236
    .line 237
    return-object v3
.end method

.method public static W(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .line 1
    :try_start_0
    invoke-static {p0}, Lx8/q;->X(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    const/4 p0, 0x0

    .line 22
    :goto_0
    const-wide/16 v6, 0xff

    .line 23
    .line 24
    const/16 v8, 0x8

    .line 25
    .line 26
    if-lt p0, v8, :cond_1

    .line 27
    .line 28
    move p0, v8

    .line 29
    :goto_1
    if-lt p0, v0, :cond_0

    .line 30
    .line 31
    const-string p0, "SHA-256"

    .line 32
    .line 33
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ltf/l;->I0([B)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, ":"

    .line 49
    .line 50
    new-instance v4, Lwb/sr;

    .line 51
    .line 52
    const/16 p0, 0x15

    .line 53
    .line 54
    invoke-direct {v4, p0}, Lwb/sr;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const/16 v5, 0x1e

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    rsub-int/lit8 v2, p0, 0xf

    .line 67
    .line 68
    mul-int/2addr v2, v8

    .line 69
    ushr-long v2, v4, v2

    .line 70
    .line 71
    and-long/2addr v2, v6

    .line 72
    long-to-int v2, v2

    .line 73
    int-to-byte v2, v2

    .line 74
    aput-byte v2, v1, p0

    .line 75
    .line 76
    add-int/lit8 p0, p0, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    rsub-int/lit8 v9, p0, 0x7

    .line 80
    .line 81
    mul-int/2addr v9, v8

    .line 82
    ushr-long v8, v2, v9

    .line 83
    .line 84
    and-long/2addr v6, v8

    .line 85
    long-to-int v6, v6

    .line 86
    int-to-byte v6, v6

    .line 87
    aput-byte v6, v1, p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    add-int/lit8 p0, p0, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object p0, v0

    .line 94
    new-instance v0, Lsf/f;

    .line 95
    .line 96
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object p0, v0

    .line 100
    :goto_2
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_2

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string v1, "[Hchat:AutoReply] \u751f\u6210\u5c0f\u667a\u8bbe\u5907 MAC \u5931\u8d25: "

    .line 112
    .line 113
    invoke-static {v1, p0, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    const-string p0, "00:00:00:00:00:00"

    .line 117
    .line 118
    :goto_3
    check-cast p0, Ljava/lang/String;

    .line 119
    .line 120
    return-object p0
.end method

.method public static X(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "android_id"

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "default_android_id"

    .line 15
    .line 16
    :goto_0
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public static Y(Ljava/lang/String;Ljava/lang/String;Lx8/t;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, "listen"

    .line 4
    .line 5
    const-string v2, "session_id"

    .line 6
    .line 7
    invoke-static {v2, p0, v0, v1}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "state"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    const-string p1, "mode"

    .line 17
    .line 18
    const-string v0, "manual"

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p2}, Lx8/q;->B(Lorg/json/JSONObject;Lx8/t;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public static Z(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx8/t;Z)Lx8/n;
    .locals 7

    .line 1
    iget-object v0, p3, Lx8/t;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p3, Lx8/t;->f:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p3, Lx8/t;->h:Ljava/lang/String;

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
    invoke-static {p4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, p3, Lx8/t;->k:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v5, 0x0

    .line 62
    const/16 v6, 0x3e

    .line 63
    .line 64
    const-string v2, "|"

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_0
    sget-object v1, Lx8/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lx8/n;

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    iget-object v3, v2, Lx8/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    iget-object v3, v2, Lx8/n;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-nez v3, :cond_1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v3, v2, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iget-object v3, v2, Lx8/n;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v2}, Lx8/n;->e()V

    .line 117
    .line 118
    .line 119
    return-object v2

    .line 120
    :cond_3
    :goto_0
    new-instance v3, Lokhttp3/Request$Builder;

    .line 121
    .line 122
    invoke-direct {v3}, Lokhttp3/Request$Builder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, p2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    const-string v4, "Authorization"

    .line 130
    .line 131
    const-string v5, "Bearer test-token"

    .line 132
    .line 133
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const-string v4, "Device-Id"

    .line 138
    .line 139
    invoke-static {p0}, Lx8/q;->W(Landroid/content/Context;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const-string v4, "Client-Id"

    .line 148
    .line 149
    invoke-static {p0}, Lx8/q;->X(Landroid/content/Context;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    const-string v4, "Protocol-Version"

    .line 158
    .line 159
    const-string v5, "1"

    .line 160
    .line 161
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    new-instance v4, Lx8/n;

    .line 170
    .line 171
    invoke-direct {v4, p1, v0, p3, p4}, Lx8/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lx8/t;Z)V

    .line 172
    .line 173
    .line 174
    if-nez v2, :cond_5

    .line 175
    .line 176
    invoke-virtual {v1, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-nez v1, :cond_4

    .line 181
    .line 182
    const/4 v1, 0x1

    .line 183
    goto :goto_1

    .line 184
    :cond_4
    const/4 v1, 0x0

    .line 185
    goto :goto_1

    .line 186
    :cond_5
    invoke-virtual {v1, p1, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    :goto_1
    if-eqz v1, :cond_0

    .line 191
    .line 192
    if-eqz v2, :cond_6

    .line 193
    .line 194
    const-string p0, "replaced"

    .line 195
    .line 196
    invoke-virtual {v2, p0}, Lx8/n;->a(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    sget-object p0, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 203
    .line 204
    iget-object p1, v4, Lx8/n;->k:Lx8/j;

    .line 205
    .line 206
    invoke-virtual {p0, v3, p1}, Lokhttp3/OkHttpClient;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    iget-object p1, v4, Lx8/n;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 211
    .line 212
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4}, Lx8/n;->e()V

    .line 216
    .line 217
    .line 218
    new-instance p0, Lwb/cr;

    .line 219
    .line 220
    const/4 p1, 0x4

    .line 221
    invoke-direct {p0, v4, p1}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 222
    .line 223
    .line 224
    const-wide/32 p1, 0x15f90

    .line 225
    .line 226
    .line 227
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 228
    .line 229
    sget-object p4, Lx8/q;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 230
    .line 231
    invoke-interface {p4, p0, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 232
    .line 233
    .line 234
    return-object v4
.end method

.method public static a(Lx8/g;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lx8/g;->c:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "@[^\\s]+\\s+"

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, ""

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static b(Lx8/a;Ljava/util/List;Z)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "model"

    .line 7
    .line 8
    iget-object p0, p0, Lx8/a;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string p0, "temperature"

    .line 14
    .line 15
    const-wide v1, 0x3fe6666666666666L    # 0.7

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    const-string p0, "stream"

    .line 24
    .line 25
    invoke-virtual {v0, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    new-instance p0, Lorg/json/JSONArray;

    .line 29
    .line 30
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    check-cast p2, Lx8/e;

    .line 48
    .line 49
    new-instance v1, Lorg/json/JSONObject;

    .line 50
    .line 51
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, "role"

    .line 55
    .line 56
    iget-object v3, p2, Lx8/e;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    const-string v2, "content"

    .line 62
    .line 63
    iget-object p2, p2, Lx8/e;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string p1, "messages"

    .line 73
    .line 74
    invoke-virtual {v0, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public static c(Lx8/r;Ljava/lang/String;Lx8/f;)V
    .locals 6

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p2, Lx8/f;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v1, "\u65b0\u52a0\u597d\u53cb"

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, p2, Lx8/f;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p2, Lx8/f;->c:Ljava/lang/String;

    .line 36
    .line 37
    const-string v2, "yyyy-MM-dd"

    .line 38
    .line 39
    invoke-virtual {p0, v1, v2}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1, v2}, Lx8/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v1, p2, Lx8/f;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_6

    .line 57
    .line 58
    iget-object p2, p2, Lx8/f;->e:Ljava/lang/String;

    .line 59
    .line 60
    const-string v1, ""

    .line 61
    .line 62
    invoke-virtual {p0, p2, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string p2, "|"

    .line 67
    .line 68
    const-string v1, "\n"

    .line 69
    .line 70
    const-string v2, ";;;"

    .line 71
    .line 72
    filled-new-array {v2, p2, v1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p0, p2}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p2, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, p2}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move-object v2, v1

    .line 129
    check-cast v2, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-lez v2, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {v0, p0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eqz p0, :cond_7

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_7
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_a

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    :cond_8
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_9

    .line 174
    .line 175
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljava/lang/String;

    .line 180
    .line 181
    :try_start_0
    invoke-virtual {p0, v1}, Lg8/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    goto :goto_3

    .line 186
    :catchall_0
    move-exception v2

    .line 187
    new-instance v3, Lsf/f;

    .line 188
    .line 189
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    move-object v2, v3

    .line 193
    :goto_3
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    const-string v4, "[Hchat:AutoReply] \u521b\u5efa\u597d\u53cb\u6807\u7b7e\u5931\u8d25: "

    .line 204
    .line 205
    const-string v5, " "

    .line 206
    .line 207
    invoke-static {v4, v1, v5, v3, v2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_9
    :try_start_1
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-virtual {p0, p1, p2}, Lg8/i;->P(Ljava/lang/String;Ljava/util/List;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 223
    goto :goto_4

    .line 224
    :catchall_1
    move-exception p0

    .line 225
    new-instance p1, Lsf/f;

    .line 226
    .line 227
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    move-object p0, p1

    .line 231
    :goto_4
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-eqz p0, :cond_a

    .line 236
    .line 237
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    const-string p2, "[Hchat:AutoReply] \u4fee\u6539\u597d\u53cb\u6807\u7b7e\u5931\u8d25: "

    .line 242
    .line 243
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    :cond_a
    :goto_5
    return-void
.end method

.method public static d(Lx8/r;Ljava/lang/String;Lx8/f;)V
    .locals 7

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p2, Lx8/f;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string v0, "\u65b0\u52a0\u597d\u53cb"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p2, Lx8/f;->h:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p2, Lx8/f;->i:Ljava/lang/String;

    .line 36
    .line 37
    const-string v2, "yyMMdd"

    .line 38
    .line 39
    invoke-virtual {p0, v0, v2}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, v2}, Lx8/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v0, p2, Lx8/f;->j:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p2, Lx8/f;->k:Ljava/lang/String;

    .line 59
    .line 60
    const-string v2, ""

    .line 61
    .line 62
    invoke-virtual {p0, v0, v2}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/4 v0, 0x0

    .line 82
    :goto_0
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_a

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    const/16 v6, 0x3e

    .line 102
    .line 103
    const-string v2, ""

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_7

    .line 116
    .line 117
    iget-object v3, v2, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_6
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_8

    .line 134
    .line 135
    :cond_7
    move-object v3, p1

    .line 136
    :cond_8
    iget-object p2, p2, Lx8/f;->g:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p0, p2}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_9

    .line 143
    .line 144
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_9
    :try_start_0
    invoke-virtual {v0, p1, v1}, Lg8/i;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_1

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-object p0, v0

    .line 159
    new-instance p1, Lsf/f;

    .line 160
    .line 161
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    move-object p0, p1

    .line 165
    :goto_1
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-eqz p0, :cond_a

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    const-string p2, "[Hchat:AutoReply] \u4fee\u6539\u597d\u53cb\u5907\u6ce8\u5931\u8d25: "

    .line 176
    .line 177
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    :goto_2
    return-void
.end method

.method public static e(Ljava/util/List;III)[B
    .locals 16

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljg/a;->b()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v7, Log/a;->b:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    const-string v2, "OpusHead"

    .line 20
    .line 21
    invoke-virtual {v2, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 29
    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    invoke-virtual {v1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 33
    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    move/from16 v2, p2

    .line 37
    .line 38
    invoke-static {v2, v8, v9}, Lr9/e0;->r(III)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0x38

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x1f40

    .line 54
    .line 55
    move/from16 v3, p1

    .line 56
    .line 57
    if-ge v3, v2, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v2, v3

    .line 61
    :goto_0
    invoke-static {v1, v2}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 62
    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-virtual {v1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const/4 v1, 0x2

    .line 86
    const-wide/16 v2, 0x0

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-static/range {v0 .. v6}, Lx8/q;->U(Ljava/io/ByteArrayOutputStream;IJIILjava/util/List;)V

    .line 90
    .line 91
    .line 92
    const-string v1, "Hchat Xiaozhi"

    .line 93
    .line 94
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 104
    .line 105
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v3, "OpusTags"

    .line 109
    .line 110
    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 118
    .line 119
    .line 120
    array-length v3, v1

    .line 121
    invoke-static {v2, v3}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2, v10}, Lx8/q;->T(Ljava/io/ByteArrayOutputStream;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    const/4 v1, 0x0

    .line 142
    const-wide/16 v2, 0x0

    .line 143
    .line 144
    const/4 v5, 0x1

    .line 145
    invoke-static/range {v0 .. v6}, Lx8/q;->U(Ljava/io/ByteArrayOutputStream;IJIILjava/util/List;)V

    .line 146
    .line 147
    .line 148
    const-wide/32 v1, 0xbb80

    .line 149
    .line 150
    .line 151
    move/from16 v3, p3

    .line 152
    .line 153
    int-to-long v5, v3

    .line 154
    mul-long/2addr v5, v1

    .line 155
    const-wide/16 v1, 0x3e8

    .line 156
    .line 157
    div-long/2addr v5, v1

    .line 158
    const-wide/16 v1, 0x3c0

    .line 159
    .line 160
    cmp-long v3, v5, v1

    .line 161
    .line 162
    if-gez v3, :cond_1

    .line 163
    .line 164
    move-wide v11, v1

    .line 165
    goto :goto_1

    .line 166
    :cond_1
    move-wide v11, v5

    .line 167
    :goto_1
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    const-wide/16 v1, 0x0

    .line 172
    .line 173
    move v5, v9

    .line 174
    move v3, v10

    .line 175
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_4

    .line 180
    .line 181
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    add-int/lit8 v9, v3, 0x1

    .line 186
    .line 187
    if-ltz v3, :cond_3

    .line 188
    .line 189
    check-cast v6, [B

    .line 190
    .line 191
    add-long/2addr v1, v11

    .line 192
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    sub-int/2addr v13, v8

    .line 197
    if-ne v3, v13, :cond_2

    .line 198
    .line 199
    const/4 v3, 0x4

    .line 200
    goto :goto_3

    .line 201
    :cond_2
    move v3, v10

    .line 202
    :goto_3
    add-int/lit8 v13, v5, 0x1

    .line 203
    .line 204
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    move-wide v14, v1

    .line 209
    move v1, v3

    .line 210
    move-wide v2, v14

    .line 211
    invoke-static/range {v0 .. v6}, Lx8/q;->U(Ljava/io/ByteArrayOutputStream;IJIILjava/util/List;)V

    .line 212
    .line 213
    .line 214
    move-wide v1, v2

    .line 215
    move v3, v9

    .line 216
    move v5, v13

    .line 217
    goto :goto_2

    .line 218
    :cond_3
    invoke-static {}, La/a;->Q0()V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    throw v0

    .line 223
    :cond_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    return-object v0
.end method

.method public static f(Lx8/a;Ljava/util/List;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "application/json"

    .line 2
    .line 3
    const-string v1, "Bearer "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-static {p0, p1, v2}, Lx8/q;->b(Lx8/a;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v4, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 12
    .line 13
    new-instance v5, Lokhttp3/Request$Builder;

    .line 14
    .line 15
    invoke-direct {v5}, Lokhttp3/Request$Builder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lx8/q;->m(Lx8/a;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-virtual {v5, v6}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const-string v6, "Content-Type"

    .line 27
    .line 28
    invoke-virtual {v5, v6, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "Authorization"

    .line 33
    .line 34
    iget-object p0, p0, Lx8/a;->a:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v7, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v5, v6, p0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v1, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 53
    .line 54
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v5, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 62
    .line 63
    invoke-virtual {v5, v0}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, p1, v0}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v4, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    :try_start_1
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_3

    .line 100
    :cond_0
    move-object p1, v3

    .line 101
    :goto_0
    if-nez p1, :cond_1

    .line 102
    .line 103
    const-string p1, ""

    .line 104
    .line 105
    :cond_1
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    new-instance v0, Lorg/json/JSONObject;

    .line 119
    .line 120
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string p1, "choices"

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    const-string v0, "message"

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_3

    .line 144
    .line 145
    const-string v0, "content"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-eqz p1, :cond_3

    .line 152
    .line 153
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    if-nez v0, :cond_3

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_3
    move-object p1, v3

    .line 161
    :goto_1
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :catchall_1
    move-exception p0

    .line 166
    goto :goto_4

    .line 167
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 168
    .line 169
    .line 170
    move-object p1, v3

    .line 171
    goto :goto_5

    .line 172
    :goto_3
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 173
    :catchall_2
    move-exception v0

    .line 174
    :try_start_4
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 178
    :goto_4
    new-instance p1, Lsf/f;

    .line 179
    .line 180
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    :goto_5
    instance-of p0, p1, Lsf/f;

    .line 184
    .line 185
    if-eqz p0, :cond_5

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_5
    move-object v3, p1

    .line 189
    :goto_6
    check-cast v3, Ljava/lang/String;

    .line 190
    .line 191
    return-object v3
.end method

.method public static g(Lx8/a;Ljava/util/List;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "application/json"

    .line 2
    .line 3
    const-string v1, "Bearer "

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-static {p0, p1, v2}, Lx8/q;->b(Lx8/a;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v2, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 12
    .line 13
    new-instance v4, Lokhttp3/Request$Builder;

    .line 14
    .line 15
    invoke-direct {v4}, Lokhttp3/Request$Builder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lx8/q;->m(Lx8/a;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const-string v5, "Content-Type"

    .line 27
    .line 28
    invoke-virtual {v4, v5, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v5, "Authorization"

    .line 33
    .line 34
    iget-object p0, p0, Lx8/a;->a:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v4, v5, p0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v1, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 53
    .line 54
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v4, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 62
    .line 63
    invoke-virtual {v4, v0}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, p1, v0}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v2, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :try_start_1
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    .line 88
    .line 89
    .line 90
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    :cond_0
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    move-object p1, v3

    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :catchall_0
    move-exception p0

    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_0

    .line 107
    .line 108
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_0

    .line 113
    .line 114
    new-instance v0, Ljava/io/InputStreamReader;

    .line 115
    .line 116
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 117
    .line 118
    invoke-direct {v0, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Ljava/io/BufferedReader;

    .line 122
    .line 123
    const/16 v1, 0x2000

    .line 124
    .line 125
    invoke-direct {p1, v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 126
    .line 127
    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 131
    .line 132
    .line 133
    :try_start_4
    new-instance v1, Ldg/n;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-direct {v1, p1, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Lng/a;

    .line 140
    .line 141
    invoke-direct {v2, v1}, Lng/a;-><init>(Lng/j;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Lng/a;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const-string v5, "data:"

    .line 169
    .line 170
    invoke-static {v4, v5}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-nez v5, :cond_2

    .line 187
    .line 188
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_2

    .line 201
    .line 202
    const-string v2, "[DONE]"

    .line 203
    .line 204
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 208
    if-eqz v2, :cond_3

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_3
    :try_start_5
    new-instance v2, Lorg/json/JSONObject;

    .line 212
    .line 213
    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :catchall_1
    move-exception v2

    .line 218
    :try_start_6
    new-instance v4, Lsf/f;

    .line 219
    .line 220
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v4

    .line 224
    :goto_1
    nop

    .line 225
    instance-of v4, v2, Lsf/f;

    .line 226
    .line 227
    if-eqz v4, :cond_4

    .line 228
    .line 229
    move-object v2, v3

    .line 230
    :cond_4
    check-cast v2, Lorg/json/JSONObject;

    .line 231
    .line 232
    if-eqz v2, :cond_2

    .line 233
    .line 234
    const-string v4, "choices"

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-eqz v2, :cond_2

    .line 248
    .line 249
    const-string v4, "delta"

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    if-eqz v2, :cond_5

    .line 256
    .line 257
    const-string v4, "content"

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    goto :goto_2

    .line 264
    :catchall_2
    move-exception v0

    .line 265
    goto :goto_4

    .line 266
    :cond_5
    move-object v2, v3

    .line 267
    :goto_2
    if-nez v2, :cond_6

    .line 268
    .line 269
    const-string v2, ""

    .line 270
    .line 271
    :cond_6
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-nez v4, :cond_2

    .line 276
    .line 277
    const-string v4, "null"

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-nez v4, :cond_2

    .line 284
    .line 285
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 286
    .line 287
    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :cond_7
    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 301
    if-nez v0, :cond_8

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_8
    move-object p1, v3

    .line 305
    :goto_3
    :try_start_8
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :catchall_3
    move-exception p1

    .line 310
    goto :goto_5

    .line 311
    :goto_4
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 312
    :catchall_4
    move-exception v1

    .line 313
    :try_start_a
    invoke-static {p1, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 317
    :goto_5
    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 318
    :catchall_5
    move-exception v0

    .line 319
    :try_start_c
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 323
    :goto_6
    new-instance p1, Lsf/f;

    .line 324
    .line 325
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :goto_7
    instance-of p0, p1, Lsf/f;

    .line 329
    .line 330
    if-eqz p0, :cond_9

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_9
    move-object v3, p1

    .line 334
    :goto_8
    check-cast v3, Ljava/lang/String;

    .line 335
    .line 336
    return-object v3
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "\u0000"

    .line 3
    .line 4
    const-string v2, ""

    .line 5
    .line 6
    invoke-static {p0, v1, v2, v0}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "(?i)^null"

    .line 11
    .line 12
    invoke-static {v0, p0, v2}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "(?i)null$"

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static i()V
    .locals 4

    .line 1
    sget-object v0, Lx8/q;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx8/q;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lx8/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lx8/n;

    .line 37
    .line 38
    const-string v3, "context cleared"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Lx8/n;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static j([B)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    array-length v1, v0

    .line 10
    add-int/lit16 v1, v1, 0x77f

    .line 11
    .line 12
    const/16 v2, 0x780

    .line 13
    .line 14
    div-int/2addr v1, v2

    .line 15
    mul-int/2addr v1, v2

    .line 16
    array-length v3, v0

    .line 17
    if-ne v1, v3, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    const-string v1, "audio/opus"

    .line 25
    .line 26
    const/16 v3, 0x3e80

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-static {v1, v3, v4}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v6, "bitrate"

    .line 34
    .line 35
    const/16 v7, 0x5dc0

    .line 36
    .line 37
    invoke-virtual {v5, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const-string v6, "max-input-size"

    .line 41
    .line 42
    invoke-virtual {v5, v6, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v1, Landroid/media/MediaCodec$BufferInfo;

    .line 53
    .line 54
    invoke-direct {v1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-virtual {v7, v5, v8, v8, v4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Landroid/media/MediaCodec;->start()V

    .line 67
    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    :goto_1
    if-nez v14, :cond_9

    .line 73
    .line 74
    const-wide/16 v9, 0x2710

    .line 75
    .line 76
    if-nez v15, :cond_5

    .line 77
    .line 78
    :try_start_0
    invoke-virtual {v7, v9, v10}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    if-ltz v11, :cond_5

    .line 83
    .line 84
    invoke-virtual {v7, v11}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    if-eqz v12, :cond_2

    .line 89
    .line 90
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_2
    :goto_2
    array-length v13, v0

    .line 98
    sub-int/2addr v13, v8

    .line 99
    if-le v13, v2, :cond_3

    .line 100
    .line 101
    move v13, v2

    .line 102
    :cond_3
    const-wide/32 v16, 0xf4240

    .line 103
    .line 104
    .line 105
    if-lez v13, :cond_4

    .line 106
    .line 107
    if-eqz v12, :cond_4

    .line 108
    .line 109
    invoke-virtual {v12, v0, v8, v13}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    .line 112
    div-int/lit8 v12, v8, 0x2

    .line 113
    .line 114
    int-to-long v9, v12

    .line 115
    mul-long v9, v9, v16

    .line 116
    .line 117
    int-to-long v4, v3

    .line 118
    div-long/2addr v9, v4

    .line 119
    move v5, v8

    .line 120
    move v8, v11

    .line 121
    move-wide v11, v9

    .line 122
    const/4 v9, 0x0

    .line 123
    move v10, v13

    .line 124
    const/4 v13, 0x0

    .line 125
    invoke-virtual/range {v7 .. v13}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 126
    .line 127
    .line 128
    add-int v8, v5, v10

    .line 129
    .line 130
    :goto_3
    const-wide/16 v4, 0x2710

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_4
    move v5, v8

    .line 134
    move v8, v11

    .line 135
    div-int/lit8 v4, v5, 0x2

    .line 136
    .line 137
    int-to-long v9, v4

    .line 138
    mul-long v9, v9, v16

    .line 139
    .line 140
    int-to-long v11, v3

    .line 141
    div-long v11, v9, v11

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    const/4 v13, 0x4

    .line 145
    const/4 v9, 0x0

    .line 146
    invoke-virtual/range {v7 .. v13}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 147
    .line 148
    .line 149
    move v8, v5

    .line 150
    const-wide/16 v4, 0x2710

    .line 151
    .line 152
    const/4 v15, 0x1

    .line 153
    goto :goto_4

    .line 154
    :cond_5
    move v5, v8

    .line 155
    move v8, v5

    .line 156
    goto :goto_3

    .line 157
    :goto_4
    invoke-virtual {v7, v1, v4, v5}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    const/4 v5, -0x2

    .line 162
    if-eq v4, v5, :cond_8

    .line 163
    .line 164
    const/4 v5, -0x1

    .line 165
    if-eq v4, v5, :cond_8

    .line 166
    .line 167
    if-ltz v4, :cond_8

    .line 168
    .line 169
    invoke-virtual {v7, v4}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-eqz v5, :cond_6

    .line 174
    .line 175
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 176
    .line 177
    if-lez v9, :cond_6

    .line 178
    .line 179
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 180
    .line 181
    and-int/lit8 v9, v9, 0x2

    .line 182
    .line 183
    if-nez v9, :cond_6

    .line 184
    .line 185
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 186
    .line 187
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 188
    .line 189
    .line 190
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 191
    .line 192
    iget v10, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 193
    .line 194
    add-int/2addr v9, v10

    .line 195
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 196
    .line 197
    .line 198
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 199
    .line 200
    new-array v9, v9, [B

    .line 201
    .line 202
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_6
    iget v5, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 209
    .line 210
    and-int/lit8 v5, v5, 0x4

    .line 211
    .line 212
    if-eqz v5, :cond_7

    .line 213
    .line 214
    const/4 v14, 0x1

    .line 215
    :cond_7
    const/4 v5, 0x0

    .line 216
    invoke-virtual {v7, v4, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_8
    const/4 v5, 0x0

    .line 221
    :goto_5
    const/4 v4, 0x1

    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :goto_6
    :try_start_1
    invoke-virtual {v7}, Landroid/media/MediaCodec;->stop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    .line 226
    .line 227
    :catchall_1
    :try_start_2
    invoke-virtual {v7}, Landroid/media/MediaCodec;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 228
    .line 229
    .line 230
    :catchall_2
    throw v0

    .line 231
    :cond_9
    :try_start_3
    invoke-virtual {v7}, Landroid/media/MediaCodec;->stop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 232
    .line 233
    .line 234
    :catchall_3
    :try_start_4
    invoke-virtual {v7}, Landroid/media/MediaCodec;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 235
    .line 236
    .line 237
    :catchall_4
    return-object v6
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lx8/g;JZ)Z
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move/from16 v4, p6

    .line 8
    .line 9
    iget-object v5, v3, Lx8/g;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, v3, Lx8/g;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v7, v3, Lx8/g;->e:Z

    .line 14
    .line 15
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v8

    .line 23
    :cond_0
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    cmp-long v0, p4, v9

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    invoke-static/range {p4 .. p5}, Lx8/q;->M(J)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    move v12, v8

    .line 37
    move v13, v12

    .line 38
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_25

    .line 43
    .line 44
    add-int/lit8 v14, v13, 0x1

    .line 45
    .line 46
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v15, v0

    .line 51
    check-cast v15, Lx8/s;

    .line 52
    .line 53
    iget-wide v8, v15, Lx8/s;->d:J

    .line 54
    .line 55
    iget-boolean v0, v15, Lx8/s;->e:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    move v10, v7

    .line 60
    move-wide/from16 p4, v8

    .line 61
    .line 62
    const-wide/16 v7, 0x7d1

    .line 63
    .line 64
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 65
    .line 66
    move/from16 v19, v10

    .line 67
    .line 68
    const-wide/16 v9, 0x0

    .line 69
    .line 70
    invoke-virtual {v0, v9, v10, v7, v8}, Ljg/d;->e(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide v17

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move/from16 v19, v7

    .line 76
    .line 77
    move-wide/from16 p4, v8

    .line 78
    .line 79
    const-wide/16 v9, 0x0

    .line 80
    .line 81
    move-wide/from16 v17, v9

    .line 82
    .line 83
    :goto_1
    add-long v7, p4, v17

    .line 84
    .line 85
    cmp-long v0, v7, v9

    .line 86
    .line 87
    if-lez v0, :cond_3

    .line 88
    .line 89
    invoke-static {v7, v8}, Lx8/q;->M(J)V

    .line 90
    .line 91
    .line 92
    :cond_3
    iget-object v0, v15, Lx8/s;->c:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    iget-wide v8, v3, Lx8/g;->d:J

    .line 99
    .line 100
    const-string v20, ""

    .line 101
    .line 102
    if-eqz v19, :cond_5

    .line 103
    .line 104
    if-eqz v7, :cond_4

    .line 105
    .line 106
    invoke-virtual {v7, v6, v5}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v21

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const/16 v21, 0x0

    .line 112
    .line 113
    :goto_2
    if-nez v21, :cond_7

    .line 114
    .line 115
    :goto_3
    move-object/from16 v21, v20

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    if-eqz v7, :cond_6

    .line 119
    .line 120
    invoke-virtual {v7, v5}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v21

    .line 124
    goto :goto_4

    .line 125
    :cond_6
    const/16 v21, 0x0

    .line 126
    .line 127
    :goto_4
    if-nez v21, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    :goto_5
    invoke-static/range {v21 .. v21}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v22

    .line 134
    if-eqz v22, :cond_8

    .line 135
    .line 136
    move-object v10, v5

    .line 137
    :goto_6
    const/16 p4, 0x0

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_8
    move-object/from16 v10, v21

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :goto_7
    if-eqz v19, :cond_b

    .line 144
    .line 145
    if-eqz v7, :cond_9

    .line 146
    .line 147
    invoke-virtual {v7, v6}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    goto :goto_8

    .line 152
    :cond_9
    move-object/from16 v7, p4

    .line 153
    .line 154
    :goto_8
    if-nez v7, :cond_a

    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_a
    move-object/from16 v20, v7

    .line 158
    .line 159
    :cond_b
    :goto_9
    move-object/from16 p5, v11

    .line 160
    .line 161
    move-object/from16 v7, v20

    .line 162
    .line 163
    const-string v11, "%friendName%"

    .line 164
    .line 165
    move/from16 v20, v12

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    invoke-static {v0, v11, v10, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v11, "%senderName%"

    .line 173
    .line 174
    invoke-static {v0, v11, v10, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v10, "%senderWxid%"

    .line 179
    .line 180
    invoke-static {v0, v10, v5, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v10, "%talker%"

    .line 185
    .line 186
    invoke-static {v0, v10, v6, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v10, "%groupName%"

    .line 191
    .line 192
    invoke-static {v0, v10, v7, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v7, "%content%"

    .line 197
    .line 198
    iget-object v10, v3, Lx8/g;->c:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v0, v7, v10, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v7, "]"

    .line 205
    .line 206
    const-string v10, "[AtWx="

    .line 207
    .line 208
    invoke-static {v10, v5, v7}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    const-string v11, "%atSender%"

    .line 213
    .line 214
    invoke-static {v0, v11, v7, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-eqz v19, :cond_c

    .line 219
    .line 220
    const-string v7, "[AtWx=notify@all]"

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_c
    const-string v7, "@\u6240\u6709\u4eba"

    .line 224
    .line 225
    :goto_a
    const-string v11, "%atAll%"

    .line 226
    .line 227
    invoke-static {v0, v11, v7, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    const-wide/16 v21, 0x12c

    .line 240
    .line 241
    :try_start_0
    iget v12, v15, Lx8/s;->b:I

    .line 242
    .line 243
    packed-switch v12, :pswitch_data_0

    .line 244
    .line 245
    .line 246
    goto/16 :goto_12

    .line 247
    .line 248
    :pswitch_0
    invoke-static {v0}, Lx8/q;->O(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const/4 v12, 0x0

    .line 257
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_1e

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    check-cast v7, Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    if-eqz v11, :cond_d

    .line 273
    .line 274
    iget-object v8, v11, Lj8/p;->f:Lj8/h;

    .line 275
    .line 276
    if-eqz v8, :cond_d

    .line 277
    .line 278
    invoke-virtual {v8, v2, v7}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    const/4 v8, 0x1

    .line 283
    if-ne v7, v8, :cond_d

    .line 284
    .line 285
    const/4 v7, 0x1

    .line 286
    goto :goto_c

    .line 287
    :cond_d
    const/4 v7, 0x0

    .line 288
    :goto_c
    if-eqz v7, :cond_e

    .line 289
    .line 290
    const/4 v12, 0x1

    .line 291
    :cond_e
    invoke-static/range {v21 .. v22}, Lx8/q;->M(J)V

    .line 292
    .line 293
    .line 294
    goto :goto_b

    .line 295
    :pswitch_1
    invoke-static {v1, v2, v3}, Lx8/q;->K(Landroid/content/Context;Ljava/lang/String;Lx8/g;)Z

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    goto/16 :goto_17

    .line 300
    .line 301
    :catchall_0
    move-exception v0

    .line 302
    goto/16 :goto_18

    .line 303
    .line 304
    :pswitch_2
    invoke-static {v1, v2, v3, v4}, Lx8/q;->J(Landroid/content/Context;Ljava/lang/String;Lx8/g;Z)Z

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    goto/16 :goto_17

    .line 309
    .line 310
    :pswitch_3
    invoke-static {v1, v2, v3, v4}, Lx8/q;->L(Landroid/content/Context;Ljava/lang/String;Lx8/g;Z)Z

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    goto/16 :goto_17

    .line 315
    .line 316
    :pswitch_4
    if-eqz v7, :cond_16

    .line 317
    .line 318
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    const-string v9, "<"

    .line 327
    .line 328
    const/4 v10, 0x0

    .line 329
    invoke-static {v8, v9, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_f

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_f
    const-string v8, "]]>"

    .line 337
    .line 338
    const-string v9, "]]]]><![CDATA[>"

    .line 339
    .line 340
    invoke-static {v0, v8, v9, v10}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    const-string v8, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title><![CDATA["

    .line 345
    .line 346
    const-string v9, "]]></title><des><![CDATA["

    .line 347
    .line 348
    const-string v10, "]]></des><type>1</type><content><![CDATA["

    .line 349
    .line 350
    invoke-static {v8, v0, v9, v0, v10}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    const-string v9, "]]></content></appmsg></msg>"

    .line 355
    .line 356
    invoke-static {v8, v0, v9}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    :goto_d
    invoke-virtual {v7, v2, v0}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    const/4 v8, 0x1

    .line 365
    if-ne v0, v8, :cond_16

    .line 366
    .line 367
    :goto_e
    const/4 v12, 0x1

    .line 368
    goto/16 :goto_17

    .line 369
    .line 370
    :pswitch_5
    if-eqz v19, :cond_10

    .line 371
    .line 372
    move-object v7, v5

    .line 373
    goto :goto_f

    .line 374
    :cond_10
    move-object v7, v2

    .line 375
    :goto_f
    invoke-static {v0}, Lx8/q;->O(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    if-eqz v8, :cond_11

    .line 384
    .line 385
    goto/16 :goto_12

    .line 386
    .line 387
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    if-eqz v8, :cond_16

    .line 396
    .line 397
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    check-cast v8, Ljava/lang/String;

    .line 402
    .line 403
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 411
    .line 412
    .line 413
    move-result-object v9

    .line 414
    if-eqz v9, :cond_12

    .line 415
    .line 416
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-eqz v10, :cond_13

    .line 421
    .line 422
    const/4 v12, 0x0

    .line 423
    :goto_10
    const/4 v8, 0x1

    .line 424
    goto :goto_11

    .line 425
    :cond_13
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v10

    .line 429
    invoke-virtual {v9, v8, v10}, Lg8/d;->m(Ljava/lang/String;Ljava/util/List;)Z

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    goto :goto_10

    .line 434
    :goto_11
    if-ne v12, v8, :cond_12

    .line 435
    .line 436
    goto :goto_e

    .line 437
    :pswitch_6
    new-instance v7, Lx8/c;

    .line 438
    .line 439
    const/4 v8, 0x0

    .line 440
    invoke-direct {v7, v11, v2, v8}, Lx8/c;-><init>(Lj8/p;Ljava/lang/String;I)V

    .line 441
    .line 442
    .line 443
    invoke-static {v7, v0}, Lx8/q;->H(Lfg/l;Ljava/lang/String;)Z

    .line 444
    .line 445
    .line 446
    move-result v12

    .line 447
    goto/16 :goto_17

    .line 448
    .line 449
    :pswitch_7
    invoke-static {v0}, Lx8/q;->O(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    if-eqz v8, :cond_14

    .line 458
    .line 459
    goto :goto_12

    .line 460
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    if-eqz v8, :cond_16

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    check-cast v8, Ljava/lang/String;

    .line 475
    .line 476
    if-eqz v7, :cond_15

    .line 477
    .line 478
    invoke-virtual {v7, v2, v8}, Lk8/g;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    const/4 v9, 0x1

    .line 483
    if-ne v8, v9, :cond_15

    .line 484
    .line 485
    goto :goto_e

    .line 486
    :pswitch_8
    new-instance v7, Lx8/c;

    .line 487
    .line 488
    const/4 v8, 0x4

    .line 489
    invoke-direct {v7, v11, v2, v8}, Lx8/c;-><init>(Lj8/p;Ljava/lang/String;I)V

    .line 490
    .line 491
    .line 492
    invoke-static {v7, v0}, Lx8/q;->H(Lfg/l;Ljava/lang/String;)Z

    .line 493
    .line 494
    .line 495
    move-result v12

    .line 496
    goto/16 :goto_17

    .line 497
    .line 498
    :pswitch_9
    new-instance v7, Lx8/c;

    .line 499
    .line 500
    const/4 v8, 0x3

    .line 501
    invoke-direct {v7, v11, v2, v8}, Lx8/c;-><init>(Lj8/p;Ljava/lang/String;I)V

    .line 502
    .line 503
    .line 504
    invoke-static {v7, v0}, Lx8/q;->H(Lfg/l;Ljava/lang/String;)Z

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    goto/16 :goto_17

    .line 509
    .line 510
    :pswitch_a
    invoke-static {v0}, Lx8/q;->C(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-eqz v0, :cond_16

    .line 515
    .line 516
    if-eqz v11, :cond_16

    .line 517
    .line 518
    iget-object v7, v11, Lj8/p;->b:Lj8/y;

    .line 519
    .line 520
    invoke-virtual {v7, v2, v0}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    const/4 v8, 0x1

    .line 525
    if-ne v0, v8, :cond_16

    .line 526
    .line 527
    goto/16 :goto_e

    .line 528
    .line 529
    :cond_16
    :goto_12
    const/4 v12, 0x0

    .line 530
    goto/16 :goto_17

    .line 531
    .line 532
    :pswitch_b
    new-instance v7, Lx8/c;

    .line 533
    .line 534
    const/4 v8, 0x2

    .line 535
    invoke-direct {v7, v11, v2, v8}, Lx8/c;-><init>(Lj8/p;Ljava/lang/String;I)V

    .line 536
    .line 537
    .line 538
    invoke-static {v7, v0}, Lx8/q;->H(Lfg/l;Ljava/lang/String;)Z

    .line 539
    .line 540
    .line 541
    move-result v12

    .line 542
    goto/16 :goto_17

    .line 543
    .line 544
    :pswitch_c
    new-instance v7, Lx8/c;

    .line 545
    .line 546
    const/4 v8, 0x1

    .line 547
    invoke-direct {v7, v11, v2, v8}, Lx8/c;-><init>(Lj8/p;Ljava/lang/String;I)V

    .line 548
    .line 549
    .line 550
    invoke-static {v7, v0}, Lx8/q;->H(Lfg/l;Ljava/lang/String;)Z

    .line 551
    .line 552
    .line 553
    move-result v12

    .line 554
    goto :goto_17

    .line 555
    :pswitch_d
    invoke-static {v0}, Lx8/q;->P(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v11

    .line 563
    const/4 v12, 0x0

    .line 564
    const/16 v24, 0x0

    .line 565
    .line 566
    :goto_13
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v25

    .line 570
    if-eqz v25, :cond_1d

    .line 571
    .line 572
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v25

    .line 576
    add-int/lit8 v26, v12, 0x1

    .line 577
    .line 578
    if-ltz v12, :cond_1c

    .line 579
    .line 580
    move-object/from16 v27, v0

    .line 581
    .line 582
    move-object/from16 v0, v25

    .line 583
    .line 584
    check-cast v0, Ljava/lang/String;

    .line 585
    .line 586
    if-eqz v4, :cond_18

    .line 587
    .line 588
    const-wide/16 v17, 0x0

    .line 589
    .line 590
    cmp-long v25, v8, v17

    .line 591
    .line 592
    if-lez v25, :cond_18

    .line 593
    .line 594
    const/4 v1, 0x0

    .line 595
    invoke-static {v0, v10, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 596
    .line 597
    .line 598
    move-result v16

    .line 599
    if-nez v16, :cond_18

    .line 600
    .line 601
    if-eqz v7, :cond_17

    .line 602
    .line 603
    invoke-virtual {v7, v8, v9, v2, v0}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    const/4 v1, 0x1

    .line 608
    if-ne v0, v1, :cond_17

    .line 609
    .line 610
    const/4 v0, 0x1

    .line 611
    goto :goto_14

    .line 612
    :cond_17
    const/4 v0, 0x0

    .line 613
    goto :goto_14

    .line 614
    :cond_18
    invoke-static {v2, v0}, Lx8/q;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    :goto_14
    if-nez v0, :cond_1a

    .line 619
    .line 620
    if-eqz v24, :cond_19

    .line 621
    .line 622
    goto :goto_15

    .line 623
    :cond_19
    const/16 v24, 0x0

    .line 624
    .line 625
    goto :goto_16

    .line 626
    :cond_1a
    :goto_15
    const/16 v24, 0x1

    .line 627
    .line 628
    :goto_16
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    const/16 v23, 0x1

    .line 633
    .line 634
    add-int/lit8 v0, v0, -0x1

    .line 635
    .line 636
    if-ge v12, v0, :cond_1b

    .line 637
    .line 638
    invoke-static/range {v21 .. v22}, Lx8/q;->M(J)V

    .line 639
    .line 640
    .line 641
    :cond_1b
    move-object/from16 v1, p0

    .line 642
    .line 643
    move/from16 v12, v26

    .line 644
    .line 645
    move-object/from16 v0, v27

    .line 646
    .line 647
    goto :goto_13

    .line 648
    :cond_1c
    invoke-static {}, La/a;->Q0()V

    .line 649
    .line 650
    .line 651
    throw p4

    .line 652
    :cond_1d
    move/from16 v12, v24

    .line 653
    .line 654
    :cond_1e
    :goto_17
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 655
    .line 656
    .line 657
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 658
    goto :goto_19

    .line 659
    :goto_18
    new-instance v1, Lsf/f;

    .line 660
    .line 661
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 662
    .line 663
    .line 664
    move-object v0, v1

    .line 665
    :goto_19
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    if-eqz v1, :cond_1f

    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    const-string v8, "[Hchat:AutoReply] \u53d1\u9001\u56de\u590d\u5931\u8d25: "

    .line 676
    .line 677
    invoke-static {v8, v7, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 678
    .line 679
    .line 680
    :cond_1f
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 681
    .line 682
    instance-of v7, v0, Lsf/f;

    .line 683
    .line 684
    if-eqz v7, :cond_20

    .line 685
    .line 686
    move-object v0, v1

    .line 687
    :cond_20
    check-cast v0, Ljava/lang/Boolean;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-nez v0, :cond_22

    .line 694
    .line 695
    if-eqz v20, :cond_21

    .line 696
    .line 697
    goto :goto_1a

    .line 698
    :cond_21
    const/4 v12, 0x0

    .line 699
    goto :goto_1b

    .line 700
    :cond_22
    :goto_1a
    const/4 v12, 0x1

    .line 701
    :goto_1b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    const/16 v23, 0x1

    .line 706
    .line 707
    add-int/lit8 v0, v0, -0x1

    .line 708
    .line 709
    if-ge v13, v0, :cond_23

    .line 710
    .line 711
    iget-wide v0, v15, Lx8/s;->d:J

    .line 712
    .line 713
    const-wide/16 v17, 0x0

    .line 714
    .line 715
    cmp-long v0, v0, v17

    .line 716
    .line 717
    if-gtz v0, :cond_24

    .line 718
    .line 719
    invoke-static/range {v21 .. v22}, Lx8/q;->M(J)V

    .line 720
    .line 721
    .line 722
    goto :goto_1c

    .line 723
    :cond_23
    const-wide/16 v17, 0x0

    .line 724
    .line 725
    :cond_24
    :goto_1c
    move-object/from16 v1, p0

    .line 726
    .line 727
    move-object/from16 v11, p5

    .line 728
    .line 729
    move v13, v14

    .line 730
    move-wide/from16 v9, v17

    .line 731
    .line 732
    move/from16 v7, v19

    .line 733
    .line 734
    const/4 v8, 0x0

    .line 735
    goto/16 :goto_0

    .line 736
    .line 737
    :cond_25
    move/from16 v20, v12

    .line 738
    .line 739
    return v20

    .line 740
    nop

    .line 741
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 14

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
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, ""

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    const-string v9, "\u6765\u4e00\u9996"

    .line 20
    .line 21
    const-string v10, "\u97f3\u4e50"

    .line 22
    .line 23
    const-string v2, "\u70b9\u6b4c"

    .line 24
    .line 25
    const-string v3, "\u653e\u9996"

    .line 26
    .line 27
    const-string v4, "\u653e\u4e00\u9996"

    .line 28
    .line 29
    const-string v5, "\u64ad\u653e"

    .line 30
    .line 31
    const-string v6, "\u542c\u6b4c"

    .line 32
    .line 33
    const-string v7, "\u542c\u9996"

    .line 34
    .line 35
    const-string v8, "\u6765\u9996"

    .line 36
    .line 37
    filled-new-array/range {v2 .. v10}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_7

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static {p0, v2, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    const-string v0, "\u5e2e\u6211"

    .line 77
    .line 78
    invoke-static {p0, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string v0, "\u7ed9\u6211"

    .line 83
    .line 84
    invoke-static {p0, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v0, "\u4e00\u4e0b"

    .line 89
    .line 90
    invoke-static {p0, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v0, "\u5427"

    .line 95
    .line 96
    invoke-static {p0, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string v0, "\u53ef\u4ee5"

    .line 101
    .line 102
    invoke-static {p0, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const-string v12, "\u6765\u4e00\u9996"

    .line 115
    .line 116
    const-string v13, "\u6765\u9996"

    .line 117
    .line 118
    const-string v4, "\u70b9\u6b4c"

    .line 119
    .line 120
    const-string v5, "\u653e\u4e00\u9996"

    .line 121
    .line 122
    const-string v6, "\u653e\u9996"

    .line 123
    .line 124
    const-string v7, "\u64ad\u653e\u4e00\u4e0b"

    .line 125
    .line 126
    const-string v8, "\u64ad\u653e"

    .line 127
    .line 128
    const-string v9, "\u542c\u4e00\u9996"

    .line 129
    .line 130
    const-string v10, "\u542c\u9996"

    .line 131
    .line 132
    const-string v11, "\u542c\u6b4c"

    .line 133
    .line 134
    filled-new-array/range {v4 .. v13}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p0, v1, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_3

    .line 163
    .line 164
    invoke-static {p0, v1}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    goto :goto_0

    .line 177
    :cond_4
    const-string v0, "\u6b4c\u66f2"

    .line 178
    .line 179
    const-string v1, "\u6b4c"

    .line 180
    .line 181
    const-string v2, "\u8fd9\u9996\u6b4c"

    .line 182
    .line 183
    const-string v4, "\u8fd9\u9996"

    .line 184
    .line 185
    const-string v5, "\u97f3\u4e50"

    .line 186
    .line 187
    filled-new-array {v2, v4, v5, v0, v1}, [Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_6

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {p0, v1, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_5

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-le v2, v4, :cond_5

    .line 226
    .line 227
    invoke-static {p0, v1}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    goto :goto_1

    .line 240
    :cond_6
    const/16 v0, 0x50

    .line 241
    .line 242
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    return-object p0

    .line 247
    :cond_7
    :goto_2
    return-object v1
.end method

.method public static m(Lx8/a;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lx8/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [C

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x2f

    .line 16
    .line 17
    aput-char v3, v1, v2

    .line 18
    .line 19
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, Lx8/a;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const-string p0, "/chat/completions"

    .line 40
    .line 41
    :cond_0
    const-string v1, "/"

    .line 42
    .line 43
    invoke-static {p0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_0
    invoke-static {v0, p0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

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
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move-object p0, p1

    .line 16
    :cond_0
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 17
    .line 18
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, p0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/util/Date;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    new-instance v0, Lsf/f;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, v0

    .line 42
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p0, p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/util/Date;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    return-object p0
.end method

.method public static o(Landroid/content/Context;Lx8/r;Lk8/o;)V
    .locals 27

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-object v1, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 4
    .line 5
    iget-object v2, v0, Lk8/o;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lk8/o;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :cond_0
    move-object v4, v2

    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_25

    .line 28
    .line 29
    :cond_1
    iget-boolean v2, v0, Lk8/o;->h:Z

    .line 30
    .line 31
    const/4 v13, 0x1

    .line 32
    const/4 v14, 0x0

    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, Lk8/o;->j()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    const-string v2, "@chatroom"

    .line 42
    .line 43
    invoke-static {v4, v2, v14}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    const-string v2, "@im.chatroom"

    .line 50
    .line 51
    invoke-static {v4, v2, v14}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v9, v14

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    move v9, v13

    .line 61
    :goto_1
    iget-object v2, v0, Lk8/o;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Lk8/o;->c()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/4 v5, 0x0

    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    if-nez v9, :cond_6

    .line 85
    .line 86
    move-object v2, v4

    .line 87
    goto :goto_3

    .line 88
    :cond_6
    const-string v2, "^([^\\s:]{3,80}):\\n"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v3, v0, Lk8/o;->e:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0}, Lk8/o;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v14, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v13, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/String;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    move-object v2, v5

    .line 137
    :goto_2
    if-nez v2, :cond_9

    .line 138
    .line 139
    const-string v2, ""

    .line 140
    .line 141
    :cond_9
    :goto_3
    invoke-static {v0}, Lx8/q;->A(Lk8/o;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v0}, Lk8/o;->o()Z

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    const-string v3, "text"

    .line 150
    .line 151
    iget-object v7, v0, Lk8/o;->b:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v16

    .line 157
    invoke-virtual {v0}, Lk8/o;->s()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_a

    .line 162
    .line 163
    if-nez v15, :cond_a

    .line 164
    .line 165
    goto/16 :goto_25

    .line 166
    .line 167
    :cond_a
    if-eqz v16, :cond_b

    .line 168
    .line 169
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_b

    .line 174
    .line 175
    if-nez v15, :cond_b

    .line 176
    .line 177
    goto/16 :goto_25

    .line 178
    .line 179
    :cond_b
    new-instance v3, Lx8/g;

    .line 180
    .line 181
    const-wide/16 v17, 0x0

    .line 182
    .line 183
    if-eqz v1, :cond_c

    .line 184
    .line 185
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgId()J

    .line 186
    .line 187
    .line 188
    move-result-wide v7

    .line 189
    goto :goto_4

    .line 190
    :cond_c
    move-wide/from16 v7, v17

    .line 191
    .line 192
    :goto_4
    invoke-virtual {v0}, Lk8/o;->g()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-virtual {v0}, Lk8/o;->n()Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-eqz v15, :cond_f

    .line 201
    .line 202
    invoke-virtual {v0}, Lk8/o;->b()Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-eqz v0, :cond_d

    .line 207
    .line 208
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatPatMsg;->pattedUser:Ljava/lang/String;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_d
    move-object v0, v5

    .line 212
    :goto_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    if-eqz v12, :cond_e

    .line 224
    .line 225
    invoke-virtual {v12}, Lg8/a;->c()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    :cond_e
    invoke-static {v0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_f

    .line 234
    .line 235
    move v12, v13

    .line 236
    :goto_6
    move-object v5, v2

    .line 237
    goto :goto_7

    .line 238
    :cond_f
    move v12, v14

    .line 239
    goto :goto_6

    .line 240
    :goto_7
    invoke-direct/range {v3 .. v12}, Lx8/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZZZ)V

    .line 241
    .line 242
    .line 243
    move-object v10, v5

    .line 244
    move-object v11, v6

    .line 245
    move v2, v9

    .line 246
    invoke-virtual/range {p1 .. p1}, Lx8/r;->l()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_48

    .line 259
    .line 260
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move-object v5, v0

    .line 265
    check-cast v5, Lx8/b;

    .line 266
    .line 267
    iget-boolean v0, v5, Lx8/b;->c:Z

    .line 268
    .line 269
    iget-object v6, v5, Lx8/b;->a:Ljava/lang/String;

    .line 270
    .line 271
    iget v7, v5, Lx8/b;->p:I

    .line 272
    .line 273
    iget v8, v5, Lx8/b;->m:I

    .line 274
    .line 275
    move/from16 v20, v15

    .line 276
    .line 277
    iget-wide v14, v5, Lx8/b;->q:J

    .line 278
    .line 279
    if-eqz v0, :cond_10

    .line 280
    .line 281
    iget-object v0, v5, Lx8/b;->s:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_11

    .line 288
    .line 289
    :cond_10
    move-object/from16 v22, v1

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_11
    iget-object v0, v5, Lx8/b;->n:Ljava/lang/String;

    .line 293
    .line 294
    iget-object v9, v5, Lx8/b;->o:Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 297
    .line 298
    .line 299
    move-result v21

    .line 300
    if-nez v21, :cond_15

    .line 301
    .line 302
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 303
    .line 304
    .line 305
    move-result v21

    .line 306
    if-eqz v21, :cond_12

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :cond_12
    invoke-static {v0}, Lx8/q;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-eqz v0, :cond_15

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    invoke-static {v9}, Lx8/q;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    if-eqz v9, :cond_15

    .line 324
    .line 325
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    move-object/from16 v22, v1

    .line 334
    .line 335
    const/16 v1, 0xb

    .line 336
    .line 337
    invoke-virtual {v13, v1}, Ljava/util/Calendar;->get(I)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    mul-int/lit16 v1, v1, 0xe10

    .line 342
    .line 343
    move/from16 p1, v1

    .line 344
    .line 345
    const/16 v1, 0xc

    .line 346
    .line 347
    invoke-virtual {v13, v1}, Ljava/util/Calendar;->get(I)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    mul-int/lit8 v1, v1, 0x3c

    .line 352
    .line 353
    add-int v1, v1, p1

    .line 354
    .line 355
    move/from16 p1, v1

    .line 356
    .line 357
    const/16 v1, 0xd

    .line 358
    .line 359
    invoke-virtual {v13, v1}, Ljava/util/Calendar;->get(I)I

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    add-int v1, v1, p1

    .line 364
    .line 365
    if-ge v9, v0, :cond_13

    .line 366
    .line 367
    if-ge v1, v0, :cond_16

    .line 368
    .line 369
    if-ge v1, v9, :cond_14

    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_13
    if-lt v1, v0, :cond_14

    .line 373
    .line 374
    if-ge v1, v9, :cond_14

    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_14
    :goto_9
    move/from16 v15, v20

    .line 378
    .line 379
    move-object/from16 v1, v22

    .line 380
    .line 381
    const/4 v13, 0x1

    .line 382
    :goto_a
    const/4 v14, 0x0

    .line 383
    goto/16 :goto_8

    .line 384
    .line 385
    :cond_15
    :goto_b
    move-object/from16 v22, v1

    .line 386
    .line 387
    :cond_16
    :goto_c
    iget-object v0, v5, Lx8/b;->i:Ljava/util/Set;

    .line 388
    .line 389
    iget-object v1, v5, Lx8/b;->k:Ljava/util/Set;

    .line 390
    .line 391
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    if-nez v9, :cond_18

    .line 396
    .line 397
    invoke-interface {v0, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    if-nez v9, :cond_18

    .line 402
    .line 403
    const-string v9, "/"

    .line 404
    .line 405
    if-eqz v2, :cond_17

    .line 406
    .line 407
    new-instance v13, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v13

    .line 425
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_17

    .line 430
    .line 431
    goto :goto_d

    .line 432
    :cond_17
    if-eqz v2, :cond_19

    .line 433
    .line 434
    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-nez v0, :cond_18

    .line 439
    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_19

    .line 463
    .line 464
    :cond_18
    :goto_d
    const/4 v9, 0x0

    .line 465
    goto/16 :goto_13

    .line 466
    .line 467
    :cond_19
    iget-object v0, v5, Lx8/b;->h:Ljava/util/Set;

    .line 468
    .line 469
    check-cast v0, Ljava/lang/Iterable;

    .line 470
    .line 471
    instance-of v1, v0, Ljava/util/Collection;

    .line 472
    .line 473
    if-eqz v1, :cond_1a

    .line 474
    .line 475
    move-object v1, v0

    .line 476
    check-cast v1, Ljava/util/Collection;

    .line 477
    .line 478
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-eqz v1, :cond_1a

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_1a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_1c

    .line 494
    .line 495
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    check-cast v1, Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v1}, Lx8/q;->r(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_1b

    .line 506
    .line 507
    goto :goto_f

    .line 508
    :cond_1c
    :goto_e
    iget-object v0, v5, Lx8/b;->j:Ljava/util/Set;

    .line 509
    .line 510
    check-cast v0, Ljava/lang/Iterable;

    .line 511
    .line 512
    instance-of v1, v0, Ljava/util/Collection;

    .line 513
    .line 514
    if-eqz v1, :cond_1d

    .line 515
    .line 516
    move-object v1, v0

    .line 517
    check-cast v1, Ljava/util/Collection;

    .line 518
    .line 519
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    if-eqz v1, :cond_1d

    .line 524
    .line 525
    goto :goto_10

    .line 526
    :cond_1d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_1f

    .line 535
    .line 536
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    check-cast v1, Ljava/lang/String;

    .line 541
    .line 542
    invoke-static {v1}, Lx8/q;->r(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-eqz v1, :cond_1e

    .line 547
    .line 548
    :goto_f
    invoke-static {v5, v3}, Lx8/q;->q(Lx8/b;Lx8/g;)Z

    .line 549
    .line 550
    .line 551
    move-result v9

    .line 552
    goto :goto_13

    .line 553
    :cond_1f
    :goto_10
    iget v0, v5, Lx8/b;->g:I

    .line 554
    .line 555
    const/4 v1, 0x1

    .line 556
    if-eq v0, v1, :cond_24

    .line 557
    .line 558
    const/4 v1, 0x2

    .line 559
    if-eq v0, v1, :cond_23

    .line 560
    .line 561
    const/4 v1, 0x3

    .line 562
    if-eq v0, v1, :cond_22

    .line 563
    .line 564
    const/4 v1, 0x4

    .line 565
    if-eq v0, v1, :cond_20

    .line 566
    .line 567
    :goto_11
    const/4 v9, 0x1

    .line 568
    goto :goto_13

    .line 569
    :cond_20
    if-eqz v22, :cond_21

    .line 570
    .line 571
    invoke-virtual/range {v22 .. v22}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOfficialAccount()Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-eqz v0, :cond_21

    .line 576
    .line 577
    goto :goto_12

    .line 578
    :cond_21
    const-string v0, "gh_"

    .line 579
    .line 580
    const/4 v1, 0x0

    .line 581
    invoke-static {v4, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_18

    .line 586
    .line 587
    :goto_12
    goto :goto_11

    .line 588
    :cond_22
    invoke-static {v5, v3}, Lx8/q;->q(Lx8/b;Lx8/g;)Z

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    goto :goto_13

    .line 593
    :cond_23
    move v9, v2

    .line 594
    goto :goto_13

    .line 595
    :cond_24
    xor-int/lit8 v9, v2, 0x1

    .line 596
    .line 597
    :goto_13
    if-nez v9, :cond_25

    .line 598
    .line 599
    goto/16 :goto_9

    .line 600
    .line 601
    :cond_25
    iget v0, v5, Lx8/b;->l:I

    .line 602
    .line 603
    if-eqz v2, :cond_28

    .line 604
    .line 605
    const/4 v1, 0x1

    .line 606
    if-ne v0, v1, :cond_26

    .line 607
    .line 608
    iget-boolean v1, v3, Lx8/g;->f:Z

    .line 609
    .line 610
    if-nez v1, :cond_26

    .line 611
    .line 612
    :goto_14
    const/4 v0, 0x0

    .line 613
    const/4 v1, 0x1

    .line 614
    goto :goto_16

    .line 615
    :cond_26
    const/4 v1, 0x2

    .line 616
    if-ne v0, v1, :cond_27

    .line 617
    .line 618
    iget-boolean v0, v3, Lx8/g;->g:Z

    .line 619
    .line 620
    if-nez v0, :cond_27

    .line 621
    .line 622
    goto :goto_14

    .line 623
    :cond_27
    const/4 v1, 0x1

    .line 624
    goto :goto_15

    .line 625
    :cond_28
    if-eqz v0, :cond_27

    .line 626
    .line 627
    goto :goto_14

    .line 628
    :goto_15
    if-ne v8, v1, :cond_2a

    .line 629
    .line 630
    iget-boolean v0, v3, Lx8/g;->h:Z

    .line 631
    .line 632
    if-nez v0, :cond_2a

    .line 633
    .line 634
    :cond_29
    const/4 v0, 0x0

    .line 635
    goto :goto_16

    .line 636
    :cond_2a
    if-ne v8, v1, :cond_2b

    .line 637
    .line 638
    if-eqz v20, :cond_29

    .line 639
    .line 640
    :cond_2b
    move v0, v1

    .line 641
    :goto_16
    if-nez v0, :cond_2c

    .line 642
    .line 643
    move v13, v1

    .line 644
    move/from16 v15, v20

    .line 645
    .line 646
    move-object/from16 v1, v22

    .line 647
    .line 648
    goto/16 :goto_a

    .line 649
    .line 650
    :cond_2c
    if-eqz v20, :cond_2d

    .line 651
    .line 652
    if-ne v8, v1, :cond_2d

    .line 653
    .line 654
    :goto_17
    move v0, v1

    .line 655
    :goto_18
    const/4 v13, 0x0

    .line 656
    goto/16 :goto_20

    .line 657
    .line 658
    :cond_2d
    iget-object v0, v5, Lx8/b;->d:Ljava/lang/String;

    .line 659
    .line 660
    iget v8, v5, Lx8/b;->f:I

    .line 661
    .line 662
    if-eq v8, v1, :cond_3a

    .line 663
    .line 664
    const/4 v9, 0x2

    .line 665
    if-eq v8, v9, :cond_38

    .line 666
    .line 667
    const/4 v9, 0x3

    .line 668
    if-eq v8, v9, :cond_33

    .line 669
    .line 670
    if-eqz v16, :cond_32

    .line 671
    .line 672
    invoke-static {v0}, Lx8/q;->N(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    if-eqz v8, :cond_2e

    .line 681
    .line 682
    goto :goto_1b

    .line 683
    :cond_2e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    :cond_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    if-eqz v8, :cond_32

    .line 692
    .line 693
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v8

    .line 697
    check-cast v8, Ljava/lang/String;

    .line 698
    .line 699
    const/4 v9, 0x0

    .line 700
    invoke-static {v11, v8, v9}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 701
    .line 702
    .line 703
    move-result v13

    .line 704
    if-nez v13, :cond_31

    .line 705
    .line 706
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 707
    .line 708
    .line 709
    move-result v8

    .line 710
    if-eqz v8, :cond_30

    .line 711
    .line 712
    goto :goto_19

    .line 713
    :cond_30
    const/4 v8, 0x0

    .line 714
    goto :goto_1a

    .line 715
    :cond_31
    :goto_19
    move v8, v1

    .line 716
    :goto_1a
    if-eqz v8, :cond_2f

    .line 717
    .line 718
    goto :goto_17

    .line 719
    :cond_32
    :goto_1b
    const/4 v0, 0x0

    .line 720
    goto :goto_18

    .line 721
    :cond_33
    if-eqz v16, :cond_37

    .line 722
    .line 723
    iget-object v0, v5, Lx8/b;->e:Ljava/lang/String;

    .line 724
    .line 725
    invoke-static {v0}, Lx8/q;->N(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    if-eqz v8, :cond_34

    .line 734
    .line 735
    goto :goto_1d

    .line 736
    :cond_34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    :cond_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v8

    .line 744
    if-eqz v8, :cond_37

    .line 745
    .line 746
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v8

    .line 750
    check-cast v8, Ljava/lang/String;

    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    invoke-static {v11, v8, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 754
    .line 755
    .line 756
    move-result v8

    .line 757
    if-eqz v8, :cond_35

    .line 758
    .line 759
    :cond_36
    :goto_1c
    move v0, v13

    .line 760
    goto :goto_20

    .line 761
    :cond_37
    :goto_1d
    const/4 v13, 0x0

    .line 762
    :goto_1e
    move v0, v1

    .line 763
    goto :goto_20

    .line 764
    :cond_38
    const/4 v13, 0x0

    .line 765
    if-eqz v16, :cond_36

    .line 766
    .line 767
    :try_start_0
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 780
    .line 781
    .line 782
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 783
    goto :goto_1f

    .line 784
    :catchall_0
    move-exception v0

    .line 785
    new-instance v8, Lsf/f;

    .line 786
    .line 787
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 788
    .line 789
    .line 790
    move-object v0, v8

    .line 791
    :goto_1f
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 792
    .line 793
    instance-of v9, v0, Lsf/f;

    .line 794
    .line 795
    if-eqz v9, :cond_39

    .line 796
    .line 797
    move-object v0, v8

    .line 798
    :cond_39
    check-cast v0, Ljava/lang/Boolean;

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 801
    .line 802
    .line 803
    move-result v0

    .line 804
    if-eqz v0, :cond_36

    .line 805
    .line 806
    goto :goto_1e

    .line 807
    :cond_3a
    const/4 v13, 0x0

    .line 808
    if-eqz v16, :cond_36

    .line 809
    .line 810
    invoke-static {v0}, Lx8/q;->N(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 815
    .line 816
    .line 817
    move-result v8

    .line 818
    if-eqz v8, :cond_3b

    .line 819
    .line 820
    goto :goto_1c

    .line 821
    :cond_3b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    :cond_3c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 826
    .line 827
    .line 828
    move-result v8

    .line 829
    if-eqz v8, :cond_36

    .line 830
    .line 831
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v8

    .line 835
    check-cast v8, Ljava/lang/String;

    .line 836
    .line 837
    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v8

    .line 841
    if-eqz v8, :cond_3c

    .line 842
    .line 843
    goto :goto_1e

    .line 844
    :goto_20
    if-nez v0, :cond_3d

    .line 845
    .line 846
    move v14, v13

    .line 847
    move/from16 v15, v20

    .line 848
    .line 849
    move v13, v1

    .line 850
    move-object/from16 v1, v22

    .line 851
    .line 852
    goto/16 :goto_8

    .line 853
    .line 854
    :cond_3d
    cmp-long v0, v14, v17

    .line 855
    .line 856
    const-string v8, "|"

    .line 857
    .line 858
    sget-object v9, Lx8/q;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 859
    .line 860
    if-gtz v0, :cond_3e

    .line 861
    .line 862
    move v1, v13

    .line 863
    goto :goto_21

    .line 864
    :cond_3e
    invoke-static {v6, v8, v4}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    invoke-virtual {v9, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v19

    .line 872
    move-object/from16 v13, v19

    .line 873
    .line 874
    check-cast v13, Ljava/lang/Long;

    .line 875
    .line 876
    if-eqz v13, :cond_41

    .line 877
    .line 878
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 879
    .line 880
    .line 881
    move-result-wide v23

    .line 882
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 883
    .line 884
    .line 885
    move-result-wide v25

    .line 886
    cmp-long v19, v25, v23

    .line 887
    .line 888
    if-ltz v19, :cond_40

    .line 889
    .line 890
    sub-long v25, v25, v23

    .line 891
    .line 892
    const-wide v23, 0x20c49ba5e353f7L

    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    cmp-long v19, v14, v23

    .line 898
    .line 899
    if-lez v19, :cond_3f

    .line 900
    .line 901
    move-wide/from16 v14, v23

    .line 902
    .line 903
    :cond_3f
    const-wide/16 v23, 0x3e8

    .line 904
    .line 905
    mul-long v14, v14, v23

    .line 906
    .line 907
    cmp-long v14, v25, v14

    .line 908
    .line 909
    if-gez v14, :cond_40

    .line 910
    .line 911
    const/4 v1, 0x1

    .line 912
    goto :goto_21

    .line 913
    :cond_40
    invoke-virtual {v9, v1, v13}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    :cond_41
    const/4 v1, 0x0

    .line 917
    :goto_21
    if-eqz v1, :cond_42

    .line 918
    .line 919
    goto/16 :goto_9

    .line 920
    .line 921
    :cond_42
    if-gtz v7, :cond_43

    .line 922
    .line 923
    :goto_22
    const/4 v1, 0x1

    .line 924
    goto :goto_24

    .line 925
    :cond_43
    invoke-static {v6, v8, v4, v8, v10}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    sget-object v13, Lx8/q;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 930
    .line 931
    invoke-virtual {v13, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v14

    .line 935
    check-cast v14, Ljava/lang/Integer;

    .line 936
    .line 937
    if-eqz v14, :cond_44

    .line 938
    .line 939
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 940
    .line 941
    .line 942
    move-result v14

    .line 943
    goto :goto_23

    .line 944
    :cond_44
    const/4 v14, 0x0

    .line 945
    :goto_23
    if-lt v14, v7, :cond_45

    .line 946
    .line 947
    const/4 v1, 0x0

    .line 948
    goto :goto_24

    .line 949
    :cond_45
    add-int/lit8 v14, v14, 0x1

    .line 950
    .line 951
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 952
    .line 953
    .line 954
    move-result-object v7

    .line 955
    invoke-virtual {v13, v1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    goto :goto_22

    .line 959
    :goto_24
    if-nez v1, :cond_46

    .line 960
    .line 961
    goto/16 :goto_9

    .line 962
    .line 963
    :cond_46
    iget-object v1, v5, Lx8/b;->s:Ljava/util/List;

    .line 964
    .line 965
    move-object v13, v8

    .line 966
    const-wide/16 v7, 0x0

    .line 967
    .line 968
    iget-boolean v5, v5, Lx8/b;->r:Z

    .line 969
    .line 970
    move-object v14, v9

    .line 971
    move v9, v5

    .line 972
    move-object v5, v1

    .line 973
    move-object v1, v6

    .line 974
    move-object v6, v3

    .line 975
    move-object/from16 v3, p0

    .line 976
    .line 977
    invoke-static/range {v3 .. v9}, Lx8/q;->k(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lx8/g;JZ)Z

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    move-object v3, v6

    .line 982
    if-eqz v5, :cond_14

    .line 983
    .line 984
    if-gtz v0, :cond_47

    .line 985
    .line 986
    goto/16 :goto_9

    .line 987
    .line 988
    :cond_47
    invoke-static {v1, v13, v4}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 993
    .line 994
    .line 995
    move-result-wide v5

    .line 996
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    invoke-virtual {v14, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    goto/16 :goto_9

    .line 1004
    .line 1005
    :cond_48
    :goto_25
    return-void
.end method

.method public static p(Landroid/content/Context;Lx8/r;Lk8/o;)V
    .locals 8

    .line 1
    const-string v0, "greet_accepted_enable"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p2, Lk8/o;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Lk8/o;->d()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    move-object v2, v0

    .line 24
    invoke-static {p2}, Lx8/q;->A(Lk8/o;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    iget-boolean p2, p2, Lk8/o;->h:Z

    .line 46
    .line 47
    if-nez p2, :cond_5

    .line 48
    .line 49
    const-string p2, "@chatroom"

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-static {v2, p2, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string p2, "\u6211\u901a\u8fc7\u4e86\u4f60\u7684\u670b\u53cb\u9a8c\u8bc1\u8bf7\u6c42\uff0c\u73b0\u5728\u6211\u4eec\u53ef\u4ee5\u5f00\u59cb\u804a\u5929\u4e86"

    .line 60
    .line 61
    invoke-static {v0, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-nez p2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const-string p2, "greet_accepted_tag_enable"

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    const-string v1, "greet_accepted_tag_name"

    .line 75
    .line 76
    const-string v3, ""

    .line 77
    .line 78
    invoke-virtual {p1, v1, v3}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v2, v1, p2}, Lx8/q;->w(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    sget-object p2, Lx8/q;->n:Lx8/f;

    .line 86
    .line 87
    invoke-static {p1, v2, p2}, Lx8/q;->c(Lx8/r;Ljava/lang/String;Lx8/f;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v2, p2}, Lx8/q;->d(Lx8/r;Ljava/lang/String;Lx8/f;)V

    .line 91
    .line 92
    .line 93
    const-string p2, "greet_accepted_delay_ms"

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Lx8/r;->g(Ljava/lang/String;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    const-wide/16 v5, 0x0

    .line 100
    .line 101
    cmp-long p2, v3, v5

    .line 102
    .line 103
    if-gez p2, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    move-wide v5, v3

    .line 107
    :goto_0
    invoke-virtual {p1}, Lx8/r;->i()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    new-instance v4, Lx8/g;

    .line 112
    .line 113
    const/16 p1, 0xf8

    .line 114
    .line 115
    invoke-direct {v4, p1, v2, v2, v0}, Lx8/g;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    move-object v1, p0

    .line 120
    invoke-static/range {v1 .. v7}, Lx8/q;->k(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lx8/g;JZ)Z

    .line 121
    .line 122
    .line 123
    :cond_5
    :goto_1
    return-void
.end method

.method public static q(Lx8/b;Lx8/g;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lx8/b;->h:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v3}, Lx8/q;->r(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object p0, p0, Lx8/b;->j:Ljava/util/Set;

    .line 42
    .line 43
    check-cast p0, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    move-object v3, v2

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3}, Lx8/q;->r(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object v1, p1, Lx8/g;->a:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v2, p1, Lx8/g;->b:Ljava/lang/String;

    .line 84
    .line 85
    iget-boolean p1, p1, Lx8/g;->e:Z

    .line 86
    .line 87
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_8

    .line 92
    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_8

    .line 100
    .line 101
    :cond_4
    const-string v3, "/"

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_8

    .line 128
    .line 129
    :cond_5
    if-eqz p1, :cond_6

    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_8

    .line 154
    .line 155
    :cond_6
    if-eqz p1, :cond_7

    .line 156
    .line 157
    invoke-interface {p0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-eqz p0, :cond_7

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    const/4 p0, 0x0

    .line 165
    return p0

    .line 166
    :cond_8
    :goto_2
    const/4 p0, 0x1

    .line 167
    return p0
.end method

.method public static r(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/16 v2, 0x2f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v2, v1, v3

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-lez v2, :cond_2

    .line 50
    .line 51
    const-string v2, "@@"

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    move v1, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v1, v3

    .line 62
    :goto_0
    if-nez v1, :cond_1

    .line 63
    .line 64
    return v3

    .line 65
    :cond_3
    :goto_1
    return v0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v3, 0x200

    .line 18
    .line 19
    cmp-long v0, v0, v3

    .line 20
    .line 21
    if-gez v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/16 p0, 0x9

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-wide v5, v3

    .line 61
    :goto_0
    cmp-long p0, v5, v3

    .line 62
    .line 63
    if-lez p0, :cond_3

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    :catchall_0
    :cond_3
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    .line 69
    :catchall_1
    :cond_4
    :goto_2
    return v2
.end method

.method public static t([BI)I
    .locals 1

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    aget-byte p0, p0, p1

    .line 8
    .line 9
    and-int/lit16 p0, p0, 0xff

    .line 10
    .line 11
    shl-int/lit8 p0, p0, 0x8

    .line 12
    .line 13
    or-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public static u([BI)I
    .locals 2

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    aget-byte v1, p0, v1

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    shl-int/lit8 v1, v1, 0x8

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    add-int/lit8 v1, p1, 0x2

    .line 15
    .line 16
    aget-byte v1, p0, v1

    .line 17
    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    shl-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    add-int/lit8 p1, p1, 0x3

    .line 24
    .line 25
    aget-byte p0, p0, p1

    .line 26
    .line 27
    and-int/lit16 p0, p0, 0xff

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0x18

    .line 30
    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
.end method

.method public static v(Lx8/t;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx8/t;->l:Z

    .line 2
    .line 3
    iget-object v1, p0, Lx8/t;->m:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object p0, p0, Lx8/t;->n:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string p0, "queryKugouMusic"

    .line 39
    .line 40
    :cond_1
    invoke-static {p2}, Lx8/q;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-object v0, Lx8/q;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Long;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-wide/16 v2, 0x0

    .line 67
    .line 68
    :goto_0
    cmp-long p3, v2, p3

    .line 69
    .line 70
    if-ltz p3, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object p3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 74
    .line 75
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p3, p4, p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callPluginFunction-0E7RQCE(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_1
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2, p0, p1}, Lg8/i;->O(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static x(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "data"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0, v1}, Lx8/q;->y(Ljava/util/LinkedHashSet;Lorg/json/JSONArray;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "models"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p0, v1}, Lx8/q;->y(Ljava/util/LinkedHashSet;Lorg/json/JSONArray;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "result"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p0, v0}, Lx8/q;->y(Ljava/util/LinkedHashSet;Lorg/json/JSONArray;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    new-instance v0, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p0, v0

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v0, p0, Lsf/f;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 56
    .line 57
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 58
    .line 59
    return-object p0
.end method

.method public static final y(Ljava/util/LinkedHashSet;Lorg/json/JSONArray;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-lt v1, v0, :cond_1

    .line 10
    .line 11
    :goto_1
    return-void

    .line 12
    :cond_1
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    instance-of v3, v2, Lorg/json/JSONObject;

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    check-cast v2, Lorg/json/JSONObject;

    .line 21
    .line 22
    const-string v3, "id"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_4

    .line 33
    .line 34
    const-string v3, "name"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    instance-of v3, v2, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    const-string v3, ""

    .line 50
    .line 51
    :cond_4
    :goto_2
    invoke-static {v3, v3}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-lez v3, :cond_5

    .line 60
    .line 61
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0
.end method

.method public static z(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/16 v2, 0x3a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v2, v1, v3

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x2

    .line 19
    if-gt v2, v1, :cond_1

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    if-ge v1, v4, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/16 v4, 0x17

    .line 41
    .line 42
    invoke-static {v1, v3, v4}, Lr9/e0;->r(III)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/16 v4, 0x3b

    .line 63
    .line 64
    invoke-static {v0, v3, v4}, Lr9/e0;->r(III)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v2, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz p0, :cond_0

    .line 75
    .line 76
    const/16 v2, 0xa

    .line 77
    .line 78
    invoke-static {v2, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-static {p0, v3, v4}, Lr9/e0;->r(III)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    :cond_0
    mul-int/lit16 v1, v1, 0xe10

    .line 93
    .line 94
    mul-int/lit8 v0, v0, 0x3c

    .line 95
    .line 96
    add-int/2addr v0, v1

    .line 97
    add-int/2addr v0, v3

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_1
    const/4 p0, 0x0

    .line 104
    return-object p0
.end method
