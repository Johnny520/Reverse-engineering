.class public final Leb/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Leb/m0;

.field public static volatile b:Z

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final d:Ljava/util/LinkedHashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final g:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final h:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final i:Landroid/os/Handler;

.field public static volatile j:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leb/m0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leb/m0;->a:Leb/m0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Leb/m0;->c:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Leb/m0;->d:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Leb/m0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Leb/m0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Leb/m0;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Leb/m0;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    new-instance v0, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Leb/m0;->i:Landroid/os/Handler;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Leb/m0;->j:Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    return-void
.end method

.method public static final a(Leb/m0;Ljava/lang/Object;Ljava/lang/String;)Leb/h0;
    .locals 9

    .line 1
    sget-object p0, Leb/m0;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    move-object v6, p2

    .line 13
    move-object v1, v0

    .line 14
    move-object v2, v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, Leb/k0;

    .line 28
    .line 29
    :try_start_0
    iget-object v0, v4, Leb/k0;->a:Lq9/a;

    .line 30
    .line 31
    invoke-virtual {v0, v6}, Lq9/a;->d(Ljava/lang/String;)Leb/l0;

    .line 32
    .line 33
    .line 34
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "[Hchat:Script] \u53d1\u9001\u6587\u5b57\u88c5\u9970\u56de\u8c03\u5931\u8d25: message_affix "

    .line 45
    .line 46
    invoke-static {v5, v4, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    if-eqz v3, :cond_0

    .line 50
    .line 51
    iget-object v0, v3, Leb/l0;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, v3, Leb/l0;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-nez v4, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v3, v1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v2, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v3, v6, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_3
    invoke-static {p1}, Leb/m0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    instance-of v0, p0, Landroid/widget/TextView;

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    move-object v0, p0

    .line 104
    check-cast v0, Landroid/widget/TextView;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    instance-of v4, v0, Landroid/text/Editable;

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    check-cast v0, Landroid/text/Editable;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    if-nez p0, :cond_6

    .line 118
    .line 119
    :cond_5
    move-object v0, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    invoke-static {p0}, Leb/m0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    instance-of v4, v0, Landroid/text/Editable;

    .line 126
    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    check-cast v0, Landroid/text/Editable;

    .line 130
    .line 131
    :goto_2
    if-eqz v0, :cond_a

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-lez v3, :cond_7

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-interface {v0, v3, v2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-lez v3, :cond_8

    .line 151
    .line 152
    const/4 v3, 0x0

    .line 153
    invoke-interface {v0, v3, v1}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 154
    .line 155
    .line 156
    :cond_8
    new-instance v3, Leb/h0;

    .line 157
    .line 158
    if-eqz p0, :cond_9

    .line 159
    .line 160
    move-object v4, p0

    .line 161
    goto :goto_3

    .line 162
    :cond_9
    move-object v4, p1

    .line 163
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    move-object v5, p2

    .line 172
    invoke-direct/range {v3 .. v8}, Leb/h0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;II)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_a
    move-object v5, p2

    .line 177
    if-eqz p0, :cond_b

    .line 178
    .line 179
    move-object v4, p0

    .line 180
    goto :goto_4

    .line 181
    :cond_b
    move-object v4, p1

    .line 182
    :goto_4
    invoke-static {v4, v6}, Leb/m0;->l(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_c

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_c
    new-instance v3, Leb/h0;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-direct/range {v3 .. v8}, Leb/h0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;II)V

    .line 200
    .line 201
    .line 202
    :goto_5
    return-object v3
.end method

.method public static final b(Leb/m0;Leb/h0;)V
    .locals 5

    .line 1
    iget-object p0, p1, Leb/h0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p1, Leb/h0;->e:I

    .line 4
    .line 5
    instance-of v1, p0, Landroid/widget/TextView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p0}, Leb/m0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v3, v1, Ljava/lang/CharSequence;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/CharSequence;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v2

    .line 30
    :goto_0
    if-eqz v1, :cond_6

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v4, p1, Leb/h0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    instance-of v3, v1, Landroid/text/Editable;

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, Landroid/text/Editable;

    .line 51
    .line 52
    :cond_3
    if-eqz v2, :cond_5

    .line 53
    .line 54
    if-lez v0, :cond_4

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    sub-int/2addr p0, v0

    .line 61
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-interface {v2, p0, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 66
    .line 67
    .line 68
    :cond_4
    iget p0, p1, Leb/h0;->d:I

    .line 69
    .line 70
    if-lez p0, :cond_6

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-interface {v2, p1, p0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    iget-object p1, p1, Leb/h0;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p0, p1}, Leb/m0;->l(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    :cond_6
    :goto_1
    return-void
.end method

.method public static c(Landroid/content/Context;)Landroid/app/Activity;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-ge v0, v2, :cond_3

    .line 8
    .line 9
    instance-of v2, p0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/app/Activity;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v2, p0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    check-cast p0, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object p0, v1

    .line 24
    :goto_1
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move-object p0, v1

    .line 32
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    return-object v1
.end method

.method public static d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Leb/m0;->d:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/reflect/Field;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    move-object v2, v3

    .line 26
    :goto_0
    monitor-exit v1

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    monitor-enter v1

    .line 35
    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 39
    monitor-exit v1

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    move-object v2, v0

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    const-class v4, Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v1, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/4 v2, 0x0

    .line 77
    move v4, v2

    .line 78
    move-object v5, v3

    .line 79
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    const/4 v7, 0x3

    .line 84
    if-eqz v6, :cond_b

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/reflect/Field;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-nez v8, :cond_4

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    .line 114
    .line 115
    .line 116
    invoke-static {v6, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    if-eqz v8, :cond_4

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const-string v9, "getText"

    .line 127
    .line 128
    invoke-static {v8, v9}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    move v7, v2

    .line 136
    :goto_3
    const-string v9, "clearComposingText"

    .line 137
    .line 138
    invoke-static {v8, v9}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    if-eqz v9, :cond_7

    .line 143
    .line 144
    add-int/lit8 v7, v7, 0x2

    .line 145
    .line 146
    :cond_7
    const-string v9, "getSimilarPasteSeqStr"

    .line 147
    .line 148
    invoke-static {v8, v9}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    if-eqz v9, :cond_8

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x2

    .line 155
    .line 156
    :cond_8
    const-string v9, "getPasterContent"

    .line 157
    .line 158
    invoke-static {v8, v9}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    if-eqz v9, :cond_9

    .line 163
    .line 164
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    :cond_9
    const-class v9, Landroid/view/View;

    .line 167
    .line 168
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    if-eqz v8, :cond_a

    .line 173
    .line 174
    add-int/lit8 v7, v7, 0x1

    .line 175
    .line 176
    :cond_a
    if-le v7, v4, :cond_4

    .line 177
    .line 178
    move-object v5, v6

    .line 179
    move v4, v7

    .line 180
    goto :goto_2

    .line 181
    :cond_b
    if-lt v4, v7, :cond_c

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_c
    move-object v5, v3

    .line 185
    :goto_4
    sget-object v1, Leb/m0;->d:Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    monitor-enter v1

    .line 188
    :try_start_2
    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    .line 190
    .line 191
    monitor-exit v1

    .line 192
    if-eqz v5, :cond_d

    .line 193
    .line 194
    invoke-static {v5, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :cond_d
    :goto_5
    return-object v3

    .line 200
    :catchall_1
    move-exception p0

    .line 201
    monitor-exit v1

    .line 202
    throw p0

    .line 203
    :catchall_2
    move-exception p0

    .line 204
    monitor-exit v1

    .line 205
    throw p0

    .line 206
    :goto_6
    monitor-exit v1

    .line 207
    throw p0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "#"

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Leb/m0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    .line 26
    .line 27
    const-class v2, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_4

    .line 34
    .line 35
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    array-length v4, v4

    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method

.method public static f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "#setText#"

    .line 10
    .line 11
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Leb/m0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    :goto_0
    if-eqz p0, :cond_4

    .line 27
    .line 28
    const-class v2, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_4

    .line 35
    .line 36
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "setText"

    .line 61
    .line 62
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    array-length v4, v4

    .line 73
    const/4 v5, 0x1

    .line 74
    if-eq v4, v5, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/4 v5, 0x0

    .line 82
    aget-object v4, v4, v5

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Leb/m0;->m(Ljava/lang/Class;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {p1}, Leb/m0;->m(Ljava/lang/Class;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_1

    .line 100
    .line 101
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method

.method public static h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "getText"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1, v0}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0, p0, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Leb/m0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Leb/m0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {p0}, Leb/m0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    const-string p0, ""

    .line 30
    .line 31
    return-object p0
.end method

.method public static j(Ljava/lang/String;Leb/i0;)La2/a;
    .locals 2

    .line 1
    new-instance v0, Lca/s;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Leb/m0;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    new-instance v0, Leb/j0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Leb/j0;-><init>(Ljava/lang/String;Leb/i0;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    new-instance p0, La2/a;

    .line 21
    .line 22
    const/16 p1, 0xa

    .line 23
    .line 24
    invoke-direct {p0, p1}, La2/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Leb/g0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Leb/g0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Leb/m0;->i:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v2, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v2}, Leb/m0;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, p0, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static m(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-class p0, Ljava/lang/Boolean;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-class p0, Ljava/lang/Byte;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const-class p0, Ljava/lang/Character;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    const-class p0, Ljava/lang/Short;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    const-class p0, Ljava/lang/Integer;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    const-class p0, Ljava/lang/Long;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    const-class p0, Ljava/lang/Float;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    const-class p0, Ljava/lang/Double;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_8
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_9

    .line 103
    .line 104
    const-class p0, Ljava/lang/Void;

    .line 105
    .line 106
    :cond_9
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized g(Lr8/g;)Z
    .locals 6

    .line 1
    const-string v0, "[Hchat:Script] \u53d1\u9001\u6309\u94aeHook\u5f02\u5e38: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-boolean v1, Leb/m0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v2

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :try_start_1
    iget-object p1, p1, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 16
    .line 17
    invoke-virtual {p1}, Lh/Hchat/dexkit/DexFinder;->resolveScriptSendHookApi()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Lh/Hchat/dexkit/DexFinder;->chatFooterSendClickMethod:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-string p1, "[Hchat:Script] \u53d1\u9001\u6309\u94aeHook\u5931\u8d25: \u672a\u5b9a\u4f4d\u5230ChatFooter\u53d1\u9001\u5165\u53e3"

    .line 25
    .line 26
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :try_start_2
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 34
    .line 35
    new-instance v4, Lb9/e;

    .line 36
    .line 37
    const/16 v5, 0x9

    .line 38
    .line 39
    invoke-direct {v4, p0, v5}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p1, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sput-boolean v2, Leb/m0;->b:Z

    .line 46
    .line 47
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_0
    :try_start_3
    new-instance v2, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v2

    .line 56
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    .line 80
    .line 81
    monitor-exit p0

    .line 82
    return v1

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :try_start_4
    sget-boolean p1, Leb/m0;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 86
    .line 87
    monitor-exit p0

    .line 88
    return p1

    .line 89
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 90
    throw p1
.end method
