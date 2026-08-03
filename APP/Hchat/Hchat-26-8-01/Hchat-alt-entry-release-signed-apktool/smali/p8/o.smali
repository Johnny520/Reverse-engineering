.class public final Lp8/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lfg/p;

.field public final c:Lokhttp3/OkHttpClient;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lr8/g;Lfg/p;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp8/o;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lp8/o;->b:Lfg/p;

    .line 10
    .line 11
    new-instance p1, Lokhttp3/OkHttpClient$Builder;

    .line 12
    .line 13
    invoke-direct {p1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-wide/16 v0, 0x1e

    .line 17
    .line 18
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, p2}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-wide/16 v0, 0x78

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1, p2}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-wide/16 v0, 0xb4

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1, p2}, Lokhttp3/OkHttpClient$Builder;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lp8/o;->c:Lokhttp3/OkHttpClient;

    .line 41
    .line 42
    new-instance p1, Lp8/m;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p1, p0, p2}, Lp8/m;-><init>(Lp8/o;I)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Lsf/d;->g:Lsf/d;

    .line 49
    .line 50
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lp8/o;->d:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance p1, Lp8/m;

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-direct {p1, p0, v0}, Lp8/m;-><init>(Lp8/o;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lp8/o;->e:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance p1, Landroid/os/Handler;

    .line 69
    .line 70
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lp8/o;->f:Landroid/os/Handler;

    .line 78
    .line 79
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v0, p1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v2, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    return v1
.end method

.method public static b(Ljava/io/InputStream;Ljava/io/FileOutputStream;JLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 6

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    int-to-long v4, v3

    .line 21
    add-long/2addr v1, v4

    .line 22
    cmp-long v4, v1, p2

    .line 23
    .line 24
    if-gtz v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-virtual {p1, v0, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string p0, "\u5a92\u4f53\u6587\u4ef6\u8fc7\u5927"

    .line 32
    .line 33
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance p0, Ljava/lang/InterruptedException;

    .line 38
    .line 39
    const-string p1, "\u5df2\u53d6\u6d88"

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

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
    const-string v0, "&amp;"

    .line 10
    .line 11
    const-string v1, "&"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&#38;"

    .line 19
    .line 20
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static d(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    invoke-static {p0}, Lp8/o;->i(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    if-eqz v2, :cond_4

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/reflect/Field;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-class v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x0

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    instance-of v3, v2, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v2, v4

    .line 52
    :goto_1
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :cond_3
    :goto_2
    if-eqz v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-object v1
.end method

.method public static f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-gt p0, v0, :cond_b

    .line 5
    .line 6
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    instance-of v0, p1, [Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    check-cast p1, [Ljava/lang/Object;

    .line 37
    .line 38
    array-length v0, p1

    .line 39
    :goto_0
    if-ge v1, v0, :cond_b

    .line 40
    .line 41
    aget-object v2, p1, v1

    .line 42
    .line 43
    add-int/lit8 v3, p0, 0x1

    .line 44
    .line 45
    invoke-static {v3, v2, p2}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    instance-of v0, p1, Ljava/util/Collection;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    check-cast p1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_b

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    add-int/lit8 v1, p0, 0x1

    .line 76
    .line 77
    invoke-static {v1, v0, p2}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_5
    instance-of v0, p1, Landroid/view/View;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    check-cast p1, Landroid/view/View;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    add-int/lit8 p0, p0, 0x1

    .line 95
    .line 96
    invoke-static {p0, p1, p2}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v2, "java."

    .line 110
    .line 111
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_b

    .line 116
    .line 117
    const-string v2, "android."

    .line 118
    .line 119
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_1
    if-eqz v0, :cond_b

    .line 131
    .line 132
    const-class v1, Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_b

    .line 139
    .line 140
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_8
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/lang/reflect/Field;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_8

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_9
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_8

    .line 186
    .line 187
    add-int/lit8 v3, p0, 0x1

    .line 188
    .line 189
    invoke-static {v3, v2, p2}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-eqz v2, :cond_8

    .line 194
    .line 195
    return-object v2

    .line 196
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto :goto_1

    .line 201
    :cond_b
    :goto_3
    const/4 p0, 0x0

    .line 202
    return-object p0
.end method

.method public static g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_10

    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    if-gt p0, v1, :cond_10

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    instance-of v1, p1, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    check-cast p1, [Ljava/lang/Object;

    .line 39
    .line 40
    array-length v1, p1

    .line 41
    :goto_0
    if-ge v3, v1, :cond_10

    .line 42
    .line 43
    aget-object v2, p1, v3

    .line 44
    .line 45
    add-int/lit8 v5, p0, 0x1

    .line 46
    .line 47
    invoke-static {v5, v2, p2}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    instance-of v1, p1, Ljava/util/Collection;

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_10

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    add-int/lit8 v2, p0, 0x1

    .line 78
    .line 79
    invoke-static {v2, v1, p2}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_5
    instance-of v1, p1, Landroid/view/View;

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    check-cast p1, Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    add-int/2addr p0, v4

    .line 97
    invoke-static {p0, p1, p2}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_1
    const-class v5, Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v1, :cond_b

    .line 109
    .line 110
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_b

    .line 115
    .line 116
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_9

    .line 129
    .line 130
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    move-object v7, v6

    .line 135
    check-cast v7, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_8

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    array-length v8, v8

    .line 155
    if-nez v8, :cond_8

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-eqz v7, :cond_8

    .line 170
    .line 171
    move v7, v4

    .line 172
    goto :goto_2

    .line 173
    :cond_8
    move v7, v3

    .line 174
    :goto_2
    if-eqz v7, :cond_7

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    move-object v6, v0

    .line 178
    :goto_3
    check-cast v6, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    if-eqz v6, :cond_a

    .line 181
    .line 182
    new-array v5, v3, [Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v6, p1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-eqz v5, :cond_a

    .line 189
    .line 190
    return-object v5

    .line 191
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_1

    .line 196
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v2, "java."

    .line 205
    .line 206
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_10

    .line 211
    .line 212
    const-string v2, "android."

    .line 213
    .line 214
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_c

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    :goto_4
    if-eqz v1, :cond_10

    .line 226
    .line 227
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-nez v2, :cond_10

    .line 232
    .line 233
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    :cond_d
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_f

    .line 246
    .line 247
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    check-cast v3, Ljava/lang/reflect/Field;

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-nez v6, :cond_d

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_e

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_e
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    if-eqz v3, :cond_d

    .line 279
    .line 280
    add-int/lit8 v6, p0, 0x1

    .line 281
    .line 282
    invoke-static {v6, v3, p2}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-eqz v3, :cond_d

    .line 287
    .line 288
    return-object v3

    .line 289
    :cond_f
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    goto :goto_4

    .line 294
    :cond_10
    :goto_6
    return-object v0
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    const-string p1, ""

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, p1

    .line 19
    :cond_1
    invoke-static {p0}, Lp8/o;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lp8/o;->k(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    :cond_2
    if-nez v0, :cond_3

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    return-object v0
.end method

.method public static i(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    if-eqz p0, :cond_5

    .line 11
    .line 12
    const-class v1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_5

    .line 19
    .line 20
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    move-object v4, v3

    .line 44
    check-cast v4, Ljava/lang/reflect/Field;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const/4 v4, 0x0

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    :goto_2
    const/4 v4, 0x1

    .line 66
    :goto_3
    if-nez v4, :cond_0

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    return-object v0
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "https://"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "http://"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v1
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    iget p0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 13
    .line 14
    if-lez p0, :cond_0

    .line 15
    .line 16
    iget p0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 17
    .line 18
    if-lez p0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static m(Ljava/lang/String;)Z
    .locals 8

    .line 1
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x9

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    move-wide v3, v1

    .line 33
    :goto_0
    const/16 p0, 0x12

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/16 v5, 0xa

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-static {v5, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move p0, v6

    .line 56
    :goto_1
    const/16 v7, 0x13

    .line 57
    .line 58
    invoke-virtual {v0, v7}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    invoke-static {v5, v7}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v5, v6

    .line 76
    :goto_2
    cmp-long v1, v3, v1

    .line 77
    .line 78
    if-lez v1, :cond_3

    .line 79
    .line 80
    if-lez p0, :cond_3

    .line 81
    .line 82
    if-lez v5, :cond_3

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    :cond_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_4

    .line 90
    :goto_3
    new-instance v1, Lsf/f;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object p0, v1

    .line 96
    :goto_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    instance-of v2, p0, Lsf/f;

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    move-object p0, v1

    .line 103
    :cond_4
    check-cast p0, Ljava/lang/Boolean;

    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    :catchall_1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0
.end method

.method public static n(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lp8/o;->i(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_6

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/reflect/Field;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/reflect/Field;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x1

    .line 75
    if-nez v2, :cond_5

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v2, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    move v0, v1

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    :goto_0
    move v0, v3

    .line 93
    :goto_1
    if-eqz v0, :cond_3

    .line 94
    .line 95
    return v3

    .line 96
    :cond_6
    :goto_2
    return v1
.end method

.method public static p(Ljava/lang/Object;Z)Lp8/s;
    .locals 13

    .line 1
    invoke-static {p0}, Lp8/o;->d(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v4}, Lp8/o;->k(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v3}, Lp8/o;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "d"

    .line 79
    .line 80
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    instance-of v3, v2, Ljava/lang/String;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    move-object v2, v4

    .line 93
    :goto_2
    const/4 v3, 0x0

    .line 94
    const/4 v5, 0x1

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eqz v2, :cond_5

    .line 106
    .line 107
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move-object v2, v4

    .line 115
    :goto_3
    if-eqz v2, :cond_5

    .line 116
    .line 117
    :goto_4
    move-object v7, v2

    .line 118
    goto :goto_7

    .line 119
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    move-object v6, v2

    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-nez v7, :cond_7

    .line 141
    .line 142
    invoke-static {v6}, Lp8/o;->k(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-nez v6, :cond_7

    .line 147
    .line 148
    move v6, v5

    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move v6, v3

    .line 151
    :goto_5
    if-eqz v6, :cond_6

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_8
    move-object v2, v4

    .line 155
    :goto_6
    check-cast v2, Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_9
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_4

    .line 169
    :goto_7
    const-string v0, "e"

    .line 170
    .line 171
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    instance-of v2, v0, Ljava/lang/Number;

    .line 176
    .line 177
    if-eqz v2, :cond_a

    .line 178
    .line 179
    check-cast v0, Ljava/lang/Number;

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_a
    move-object v0, v4

    .line 183
    :goto_8
    if-eqz v0, :cond_b

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    move v8, v0

    .line 190
    goto :goto_9

    .line 191
    :cond_b
    move v8, v3

    .line 192
    :goto_9
    const-string v0, "o"

    .line 193
    .line 194
    invoke-static {p0, v0}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v2, "q"

    .line 199
    .line 200
    invoke-static {p0, v2}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    const-string v9, "n"

    .line 209
    .line 210
    if-nez v6, :cond_c

    .line 211
    .line 212
    invoke-static {p0, v9}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    goto :goto_a

    .line 217
    :cond_c
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    const-string v10, "i"

    .line 222
    .line 223
    if-nez v6, :cond_d

    .line 224
    .line 225
    invoke-static {p0, v10}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    goto :goto_a

    .line 230
    :cond_d
    invoke-static {p0, v10}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    if-eqz v10, :cond_e

    .line 239
    .line 240
    invoke-static {p0, v9}, Lp8/o;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    :cond_e
    :goto_a
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_10

    .line 249
    .line 250
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, Ljava/lang/String;

    .line 255
    .line 256
    if-nez v1, :cond_f

    .line 257
    .line 258
    const-string v1, ""

    .line 259
    .line 260
    :cond_f
    move-object v6, v1

    .line 261
    :cond_10
    move-object v9, v6

    .line 262
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_11

    .line 267
    .line 268
    move-object v10, v0

    .line 269
    goto :goto_b

    .line 270
    :cond_11
    move-object v10, v2

    .line 271
    :goto_b
    if-eqz p1, :cond_14

    .line 272
    .line 273
    invoke-static {p0}, Lp8/o;->i(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    new-instance v0, Ldg/n;

    .line 278
    .line 279
    const/4 v1, 0x6

    .line 280
    invoke-direct {v0, p1, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 281
    .line 282
    .line 283
    new-instance p1, Lc9/k1;

    .line 284
    .line 285
    const/16 v1, 0x14

    .line 286
    .line 287
    invoke-direct {p1, p0, v1}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 288
    .line 289
    .line 290
    new-instance v1, Lng/i;

    .line 291
    .line 292
    invoke-direct {v1, v0, v5, p1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 293
    .line 294
    .line 295
    new-instance p1, Lc9/k1;

    .line 296
    .line 297
    const/16 v0, 0x15

    .line 298
    .line 299
    invoke-direct {p1, p0, v0}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 300
    .line 301
    .line 302
    invoke-static {v1, p1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    new-instance v0, Lng/h;

    .line 307
    .line 308
    invoke-direct {v0, p1}, Lng/h;-><init>(Lng/i;)V

    .line 309
    .line 310
    .line 311
    :cond_12
    invoke-virtual {v0}, Lng/h;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_13

    .line 316
    .line 317
    invoke-virtual {v0}, Lng/h;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    if-eq p1, p0, :cond_12

    .line 322
    .line 323
    invoke-static {p1}, Lp8/o;->n(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    if-eqz v1, :cond_12

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_13
    move-object p1, v4

    .line 331
    :goto_c
    if-eqz p1, :cond_14

    .line 332
    .line 333
    invoke-static {p1, v3}, Lp8/o;->p(Ljava/lang/Object;Z)Lp8/s;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    :cond_14
    move-object v12, v4

    .line 338
    new-instance v6, Lp8/s;

    .line 339
    .line 340
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-object v11, p0

    .line 344
    invoke-direct/range {v6 .. v12}, Lp8/s;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lp8/s;)V

    .line 345
    .line 346
    .line 347
    return-object v6
.end method


# virtual methods
.method public final e(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p4

    .line 4
    .line 5
    iget-object v4, v1, Lp8/o;->b:Lfg/p;

    .line 6
    .line 7
    new-instance v5, Ljava/io/File;

    .line 8
    .line 9
    iget-object v0, v1, Lp8/o;->a:Lr8/g;

    .line 10
    .line 11
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v6, "Hchat_sns_forward"

    .line 18
    .line 19
    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v6, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    :cond_0
    move-object/from16 v16, v6

    .line 36
    .line 37
    goto/16 :goto_b

    .line 38
    .line 39
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    new-instance v8, Ljava/io/File;

    .line 48
    .line 49
    const-string v0, "remote_v2_"

    .line 50
    .line 51
    const-string v9, "."

    .line 52
    .line 53
    move-object/from16 v10, p3

    .line 54
    .line 55
    invoke-static {v0, v7, v9, v10}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v8, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    const-wide/16 v11, 0x1

    .line 73
    .line 74
    cmp-long v0, v11, v9

    .line 75
    .line 76
    if-gtz v0, :cond_2

    .line 77
    .line 78
    cmp-long v0, v9, v2

    .line 79
    .line 80
    if-gtz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual/range {p6 .. p6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-nez v10, :cond_e

    .line 108
    .line 109
    invoke-static {v0}, Lp8/o;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v10}, Lp8/o;->k(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    new-instance v11, Ljava/io/File;

    .line 121
    .line 122
    const-string v0, ".part"

    .line 123
    .line 124
    invoke-static {v7, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {v11, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :try_start_0
    new-instance v0, Lokhttp3/Request$Builder;

    .line 132
    .line 133
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v10}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v12, "User-Agent"

    .line 141
    .line 142
    const-string v13, "MicroMessenger Client"

    .line 143
    .line 144
    invoke-virtual {v0, v12, v13}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v12, v1, Lp8/o;->c:Lokhttp3/OkHttpClient;

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 159
    .line 160
    .line 161
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 162
    :try_start_1
    invoke-virtual {v12}, Lokhttp3/Response;->isSuccessful()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const/4 v13, 0x0

    .line 167
    if-nez v0, :cond_4

    .line 168
    .line 169
    invoke-virtual {v12}, Lokhttp3/Response;->code()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    new-instance v14, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v15, "\u670b\u53cb\u5708\u5a92\u4f53\u4e0b\u8f7d\u54cd\u5e94\u5f02\u5e38: code="

    .line 179
    .line 180
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, " url="

    .line 187
    .line 188
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {v4, v0, v6}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    :goto_1
    move v0, v13

    .line 202
    move-object/from16 v13, p6

    .line 203
    .line 204
    goto/16 :goto_7

    .line 205
    .line 206
    :catchall_0
    move-exception v0

    .line 207
    move-object/from16 v13, p6

    .line 208
    .line 209
    :goto_2
    move-object v6, v0

    .line 210
    goto/16 :goto_8

    .line 211
    .line 212
    :cond_4
    invoke-virtual {v12}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    .line 219
    .line 220
    .line 221
    move-result-wide v14

    .line 222
    cmp-long v14, v14, v2

    .line 223
    .line 224
    if-lez v14, :cond_5

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_5
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 228
    .line 229
    .line 230
    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    :try_start_2
    new-instance v15, Ljava/io/FileOutputStream;

    .line 232
    .line 233
    invoke-direct {v15, v11, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 234
    .line 235
    .line 236
    move-object/from16 v13, p6

    .line 237
    .line 238
    :try_start_3
    invoke-static {v14, v15, v2, v3, v13}, Lp8/o;->b(Ljava/io/InputStream;Ljava/io/FileOutputStream;JLjava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 239
    .line 240
    .line 241
    :try_start_4
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 242
    .line 243
    .line 244
    :try_start_5
    invoke-interface {v14}, Ljava/io/Closeable;->close()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_9

    .line 252
    .line 253
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 254
    .line 255
    .line 256
    move-result-wide v14

    .line 257
    const-wide/16 v16, 0x0

    .line 258
    .line 259
    cmp-long v0, v14, v16

    .line 260
    .line 261
    if-gtz v0, :cond_6

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_6
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_7

    .line 269
    .line 270
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    goto :goto_2

    .line 276
    :cond_7
    :goto_3
    invoke-virtual {v11, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_8

    .line 281
    .line 282
    invoke-static {v11, v8}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 286
    .line 287
    .line 288
    :cond_8
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_9

    .line 293
    .line 294
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 295
    .line 296
    .line 297
    move-result-wide v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 298
    cmp-long v0, v14, v16

    .line 299
    .line 300
    if-lez v0, :cond_9

    .line 301
    .line 302
    const/4 v0, 0x1

    .line 303
    goto :goto_7

    .line 304
    :cond_9
    :goto_4
    const/4 v0, 0x0

    .line 305
    goto :goto_7

    .line 306
    :catchall_2
    move-exception v0

    .line 307
    :goto_5
    move-object v6, v0

    .line 308
    goto :goto_6

    .line 309
    :catchall_3
    move-exception v0

    .line 310
    move-object v6, v0

    .line 311
    :try_start_6
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 312
    :catchall_4
    move-exception v0

    .line 313
    :try_start_7
    invoke-static {v15, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 317
    :catchall_5
    move-exception v0

    .line 318
    move-object/from16 v13, p6

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :goto_6
    :try_start_8
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 322
    :catchall_6
    move-exception v0

    .line 323
    :try_start_9
    invoke-static {v14, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw v0

    .line 327
    :cond_a
    move-object/from16 v13, p6

    .line 328
    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v6, "\u670b\u53cb\u5708\u5a92\u4f53\u4e0b\u8f7d\u54cd\u5e94\u4e3a\u7a7a: url="

    .line 335
    .line 336
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    const/4 v6, 0x0

    .line 347
    invoke-interface {v4, v0, v6}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 355
    :try_start_a
    invoke-interface {v12}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 356
    .line 357
    .line 358
    goto :goto_a

    .line 359
    :catchall_7
    move-exception v0

    .line 360
    goto :goto_9

    .line 361
    :goto_8
    :try_start_b
    throw v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 362
    :catchall_8
    move-exception v0

    .line 363
    :try_start_c
    invoke-static {v12, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 367
    :catchall_9
    move-exception v0

    .line 368
    move-object/from16 v13, p6

    .line 369
    .line 370
    :goto_9
    new-instance v6, Lsf/f;

    .line 371
    .line 372
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    move-object v0, v6

    .line 376
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    if-eqz v6, :cond_b

    .line 381
    .line 382
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 383
    .line 384
    .line 385
    instance-of v11, v6, Ljava/lang/InterruptedException;

    .line 386
    .line 387
    if-nez v11, :cond_b

    .line 388
    .line 389
    const-string v11, "\u670b\u53cb\u5708\u5a92\u4f53\u4e0b\u8f7d\u5931\u8d25: "

    .line 390
    .line 391
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    invoke-interface {v4, v10, v6}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    :cond_b
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 399
    .line 400
    instance-of v10, v0, Lsf/f;

    .line 401
    .line 402
    if-eqz v10, :cond_c

    .line 403
    .line 404
    move-object v0, v6

    .line 405
    :cond_c
    check-cast v0, Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_d

    .line 412
    .line 413
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    return-object v0

    .line 418
    :cond_d
    const/4 v6, 0x0

    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_e
    new-instance v0, Ljava/lang/InterruptedException;

    .line 422
    .line 423
    const-string v2, "\u5df2\u53d6\u6d88"

    .line 424
    .line 425
    invoke-direct {v0, v2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :goto_b
    return-object v16
.end method

.method public final j(Lfg/a;)Z
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v4, Lac/l;

    .line 39
    .line 40
    const/16 v5, 0x1a

    .line 41
    .line 42
    invoke-direct {v4, v0, p1, v2, v5}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lp8/o;->f:Landroid/os/Handler;

    .line 46
    .line 47
    invoke-virtual {p1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const-wide/16 v4, 0x1388

    .line 55
    .line 56
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    .line 58
    invoke-virtual {v2, v4, v5, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    return v3

    .line 71
    :cond_2
    :goto_0
    return v1
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v3, p4

    .line 6
    .line 7
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_b

    .line 15
    .line 16
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const-wide/16 v7, 0x1

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    cmp-long v6, v7, v9

    .line 34
    .line 35
    if-gtz v6, :cond_1

    .line 36
    .line 37
    cmp-long v6, v9, v3

    .line 38
    .line 39
    if-gtz v6, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 47
    .line 48
    iget-object v6, v1, Lp8/o;->a:Lr8/g;

    .line 49
    .line 50
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v9}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    const-string v10, "Hchat_sns_forward"

    .line 57
    .line 58
    invoke-direct {v0, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-nez v9, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-nez v9, :cond_2

    .line 72
    .line 73
    goto/16 :goto_b

    .line 74
    .line 75
    :cond_2
    new-instance v9, Ljava/io/File;

    .line 76
    .line 77
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    const-string v11, "local_"

    .line 86
    .line 87
    const-string v12, "."

    .line 88
    .line 89
    move-object/from16 v13, p3

    .line 90
    .line 91
    invoke-static {v11, v10, v12, v13}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-direct {v9, v0, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 105
    .line 106
    .line 107
    move-result-wide v10

    .line 108
    cmp-long v0, v7, v10

    .line 109
    .line 110
    if-gtz v0, :cond_3

    .line 111
    .line 112
    cmp-long v0, v10, v3

    .line 113
    .line 114
    if-gtz v0, :cond_3

    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0

    .line 121
    :cond_3
    const-string v0, "com.tencent.mm.vfs.w6"

    .line 122
    .line 123
    const-string v10, "com.tencent.mm.vfs.p6"

    .line 124
    .line 125
    filled-new-array {v0, v10}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/4 v10, 0x0

    .line 130
    move v11, v10

    .line 131
    :goto_0
    const/4 v12, 0x1

    .line 132
    const/4 v13, 0x2

    .line 133
    if-lt v11, v13, :cond_4

    .line 134
    .line 135
    move-wide/from16 v16, v7

    .line 136
    .line 137
    move-object v7, v5

    .line 138
    goto :goto_4

    .line 139
    :cond_4
    aget-object v13, v0, v11

    .line 140
    .line 141
    iget-object v14, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 142
    .line 143
    invoke-static {v13, v14}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    if-eqz v13, :cond_f

    .line 148
    .line 149
    invoke-static {v13}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-eqz v14, :cond_6

    .line 162
    .line 163
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    move-object v15, v14

    .line 168
    check-cast v15, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    move-wide/from16 v16, v7

    .line 171
    .line 172
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_5

    .line 185
    .line 186
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    const-class v15, Ljava/io/InputStream;

    .line 191
    .line 192
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-eqz v8, :cond_5

    .line 197
    .line 198
    array-length v8, v7

    .line 199
    if-ne v8, v12, :cond_5

    .line 200
    .line 201
    aget-object v7, v7, v10

    .line 202
    .line 203
    const-class v8, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_5

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    move-wide/from16 v7, v16

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_6
    move-wide/from16 v16, v7

    .line 216
    .line 217
    move-object v14, v5

    .line 218
    :goto_2
    check-cast v14, Ljava/lang/reflect/Method;

    .line 219
    .line 220
    if-eqz v14, :cond_e

    .line 221
    .line 222
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v14, v5, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    instance-of v8, v7, Ljava/io/InputStream;

    .line 231
    .line 232
    if-eqz v8, :cond_7

    .line 233
    .line 234
    check-cast v7, Ljava/io/InputStream;

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_7
    move-object v7, v5

    .line 238
    :goto_3
    if-eqz v7, :cond_e

    .line 239
    .line 240
    :goto_4
    if-eqz v7, :cond_d

    .line 241
    .line 242
    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    .line 243
    .line 244
    invoke-direct {v6, v9, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 245
    .line 246
    .line 247
    move-object/from16 v8, p6

    .line 248
    .line 249
    :try_start_1
    invoke-static {v7, v6, v3, v4, v8}, Lp8/o;->b(Ljava/io/InputStream;Ljava/io/FileOutputStream;JLjava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 250
    .line 251
    .line 252
    :try_start_2
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 253
    .line 254
    .line 255
    :try_start_3
    invoke-interface {v7}, Ljava/io/Closeable;->close()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_8

    .line 263
    .line 264
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    cmp-long v0, v16, v6

    .line 269
    .line 270
    if-gtz v0, :cond_8

    .line 271
    .line 272
    cmp-long v0, v6, v3

    .line 273
    .line 274
    if-gtz v0, :cond_8

    .line 275
    .line 276
    move v10, v12

    .line 277
    goto :goto_5

    .line 278
    :catchall_0
    move-exception v0

    .line 279
    goto :goto_8

    .line 280
    :cond_8
    :goto_5
    if-eqz v10, :cond_9

    .line 281
    .line 282
    move-object v0, v9

    .line 283
    goto :goto_6

    .line 284
    :cond_9
    move-object v0, v5

    .line 285
    :goto_6
    if-eqz v0, :cond_a

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 291
    goto :goto_9

    .line 292
    :cond_a
    move-object v0, v5

    .line 293
    goto :goto_9

    .line 294
    :catchall_1
    move-exception v0

    .line 295
    move-object v3, v0

    .line 296
    goto :goto_7

    .line 297
    :catchall_2
    move-exception v0

    .line 298
    move-object v3, v0

    .line 299
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 300
    :catchall_3
    move-exception v0

    .line 301
    :try_start_5
    invoke-static {v6, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 305
    :goto_7
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 306
    :catchall_4
    move-exception v0

    .line 307
    :try_start_7
    invoke-static {v7, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 311
    :goto_8
    new-instance v3, Lsf/f;

    .line 312
    .line 313
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    move-object v0, v3

    .line 317
    :goto_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-eqz v3, :cond_b

    .line 322
    .line 323
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 324
    .line 325
    .line 326
    instance-of v4, v3, Ljava/lang/InterruptedException;

    .line 327
    .line 328
    if-nez v4, :cond_b

    .line 329
    .line 330
    const-string v4, "\u8bfb\u53d6\u670b\u53cb\u5708VFS\u7f13\u5b58\u5931\u8d25: "

    .line 331
    .line 332
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    iget-object v4, v1, Lp8/o;->b:Lfg/p;

    .line 337
    .line 338
    invoke-interface {v4, v2, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_b
    instance-of v2, v0, Lsf/f;

    .line 342
    .line 343
    if-eqz v2, :cond_c

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_c
    move-object v5, v0

    .line 347
    :goto_a
    check-cast v5, Ljava/lang/String;

    .line 348
    .line 349
    :cond_d
    :goto_b
    return-object v5

    .line 350
    :cond_e
    :goto_c
    move-object/from16 v8, p6

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_f
    move-wide/from16 v16, v7

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :goto_d
    add-int/lit8 v11, v11, 0x1

    .line 357
    .line 358
    move-wide/from16 v7, v16

    .line 359
    .line 360
    goto/16 :goto_0
.end method

.method public final q(Lp8/v;Ljava/util/concurrent/atomic/AtomicBoolean;)Lp8/c;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    const-string v2, "_video_thumb"

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v8, v0, Lp8/v;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, v0, Lp8/v;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v9, v0, Lp8/v;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const-string v10, "\u5df2\u53d6\u6d88"

    .line 26
    .line 27
    if-nez v4, :cond_41

    .line 28
    .line 29
    iget v0, v0, Lp8/v;->c:I

    .line 30
    .line 31
    iget-object v11, v1, Lp8/o;->e:Ljava/lang/Object;

    .line 32
    .line 33
    const-string v12, "_"

    .line 34
    .line 35
    const/4 v13, 0x0

    .line 36
    const/4 v14, 0x1

    .line 37
    const/4 v15, 0x0

    .line 38
    if-eq v0, v14, :cond_0

    .line 39
    .line 40
    const/16 v4, 0x36

    .line 41
    .line 42
    if-ne v0, v4, :cond_1

    .line 43
    .line 44
    :cond_0
    move-object/from16 p1, v15

    .line 45
    .line 46
    goto/16 :goto_d

    .line 47
    .line 48
    :cond_1
    const/4 v4, 0x5

    .line 49
    if-eq v0, v4, :cond_3

    .line 50
    .line 51
    const/16 v4, 0xf

    .line 52
    .line 53
    if-ne v0, v4, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v14, v13

    .line 57
    :cond_3
    :goto_0
    if-eqz v14, :cond_1a

    .line 58
    .line 59
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lp8/s;

    .line 64
    .line 65
    if-eqz v0, :cond_19

    .line 66
    .line 67
    iget-object v3, v0, Lp8/s;->e:Ljava/lang/Object;

    .line 68
    .line 69
    iget-object v14, v0, Lp8/s;->a:Ljava/lang/String;

    .line 70
    .line 71
    const-string v4, "_video"

    .line 72
    .line 73
    invoke-static {v9, v12, v14, v4}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v1, v9, v0, v4, v7}, Lp8/o;->t(Ljava/lang/String;Lp8/s;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-eqz v6, :cond_18

    .line 82
    .line 83
    invoke-interface {v11}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lp8/u;

    .line 88
    .line 89
    iget-object v0, v0, Lp8/u;->g:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    iget-object v11, v1, Lp8/o;->b:Lfg/p;

    .line 92
    .line 93
    if-eqz v0, :cond_b

    .line 94
    .line 95
    invoke-static {v3, v0}, Lp8/o;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    move-object/from16 p1, v15

    .line 102
    .line 103
    move-object/from16 v0, p1

    .line 104
    .line 105
    move-object v15, v6

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_4
    :try_start_0
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v0, v15, v3}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    instance-of v3, v0, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v3, :cond_5

    .line 119
    .line 120
    check-cast v0, Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    move-object/from16 p1, v15

    .line 125
    .line 126
    move-object v15, v6

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move-object v0, v15

    .line 129
    :goto_1
    if-eqz v0, :cond_8

    .line 130
    .line 131
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    const-string v4, "jpg"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    move-object v2, v6

    .line 138
    const-wide/32 v5, 0x2800000

    .line 139
    .line 140
    .line 141
    move-object/from16 p1, v15

    .line 142
    .line 143
    move-object v15, v2

    .line 144
    move-object v2, v0

    .line 145
    :try_start_1
    invoke-virtual/range {v1 .. v7}, Lp8/o;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    invoke-static {v0}, Lp8/o;->l(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :catchall_1
    move-exception v0

    .line 159
    goto :goto_3

    .line 160
    :cond_6
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-nez v2, :cond_7

    .line 167
    .line 168
    new-instance v2, Ljava/io/File;

    .line 169
    .line 170
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    .line 175
    .line 176
    :cond_7
    :goto_2
    move-object/from16 v0, p1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    move-object/from16 p1, v15

    .line 180
    .line 181
    move-object v15, v6

    .line 182
    goto :goto_2

    .line 183
    :goto_3
    new-instance v2, Lsf/f;

    .line 184
    .line 185
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v0, v2

    .line 189
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-eqz v2, :cond_9

    .line 194
    .line 195
    instance-of v3, v2, Ljava/lang/InterruptedException;

    .line 196
    .line 197
    if-nez v3, :cond_9

    .line 198
    .line 199
    const-string v3, "\u8bfb\u53d6\u670b\u53cb\u5708\u89c6\u9891\u5c01\u9762\u5931\u8d25: "

    .line 200
    .line 201
    invoke-virtual {v3, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-interface {v11, v3, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_9
    instance-of v2, v0, Lsf/f;

    .line 209
    .line 210
    if-eqz v2, :cond_a

    .line 211
    .line 212
    move-object/from16 v0, p1

    .line 213
    .line 214
    :cond_a
    check-cast v0, Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_b
    move-object/from16 p1, v15

    .line 218
    .line 219
    move-object v15, v6

    .line 220
    move-object/from16 v0, p1

    .line 221
    .line 222
    :goto_5
    if-eqz v0, :cond_c

    .line 223
    .line 224
    :goto_6
    move-object v7, v0

    .line 225
    goto/16 :goto_b

    .line 226
    .line 227
    :cond_c
    invoke-static {v9, v12, v14}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_17

    .line 236
    .line 237
    new-instance v2, Ljava/io/File;

    .line 238
    .line 239
    iget-object v3, v1, Lp8/o;->a:Lr8/g;

    .line 240
    .line 241
    iget-object v3, v3, Lr8/g;->a:Landroid/content/Context;

    .line 242
    .line 243
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    const-string v4, "Hchat_sns_forward"

    .line 248
    .line 249
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-nez v3, :cond_d

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-nez v3, :cond_d

    .line 263
    .line 264
    move-object/from16 v0, p1

    .line 265
    .line 266
    goto/16 :goto_a

    .line 267
    .line 268
    :cond_d
    new-instance v3, Ljava/io/File;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v4, "video_thumb_"

    .line 279
    .line 280
    const-string v5, ".jpg"

    .line 281
    .line 282
    invoke-static {v4, v0, v5}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_e

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-static {v0}, Lp8/o;->l(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_e

    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    goto/16 :goto_a

    .line 313
    .line 314
    :cond_e
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 315
    .line 316
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 317
    .line 318
    .line 319
    :try_start_2
    invoke-virtual {v2, v15}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime()Landroid/graphics/Bitmap;

    .line 323
    .line 324
    .line 325
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 326
    if-eqz v4, :cond_11

    .line 327
    .line 328
    :try_start_3
    new-instance v5, Ljava/io/FileOutputStream;

    .line 329
    .line 330
    invoke-direct {v5, v3, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 331
    .line 332
    .line 333
    :try_start_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 334
    .line 335
    const/16 v6, 0x5a

    .line 336
    .line 337
    invoke-virtual {v4, v0, v6, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 338
    .line 339
    .line 340
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 341
    if-nez v0, :cond_f

    .line 342
    .line 343
    :try_start_5
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 344
    .line 345
    .line 346
    goto :goto_7

    .line 347
    :catchall_2
    move-exception v0

    .line 348
    goto :goto_8

    .line 349
    :cond_f
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lp8/o;->l(Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 360
    if-eqz v5, :cond_10

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_10
    :goto_7
    move-object/from16 v0, p1

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :catchall_3
    move-exception v0

    .line 367
    move-object v6, v0

    .line 368
    :try_start_6
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 369
    :catchall_4
    move-exception v0

    .line 370
    :try_start_7
    invoke-static {v5, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 371
    .line 372
    .line 373
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 374
    :cond_11
    move-object/from16 v0, p1

    .line 375
    .line 376
    move-object v4, v0

    .line 377
    goto :goto_9

    .line 378
    :catchall_5
    move-exception v0

    .line 379
    move-object/from16 v4, p1

    .line 380
    .line 381
    :goto_8
    new-instance v5, Lsf/f;

    .line 382
    .line 383
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    move-object v0, v5

    .line 387
    :goto_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    if-eqz v5, :cond_12

    .line 392
    .line 393
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 394
    .line 395
    .line 396
    instance-of v6, v5, Ljava/lang/InterruptedException;

    .line 397
    .line 398
    if-nez v6, :cond_12

    .line 399
    .line 400
    const-string v6, "\u751f\u6210\u670b\u53cb\u5708\u89c6\u9891\u5c01\u9762\u5931\u8d25: "

    .line 401
    .line 402
    invoke-virtual {v6, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-interface {v11, v6, v5}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_12
    instance-of v5, v0, Lsf/f;

    .line 410
    .line 411
    if-eqz v5, :cond_13

    .line 412
    .line 413
    move-object/from16 v0, p1

    .line 414
    .line 415
    :cond_13
    check-cast v0, Ljava/lang/String;

    .line 416
    .line 417
    if-eqz v4, :cond_14

    .line 418
    .line 419
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 420
    .line 421
    .line 422
    :cond_14
    :try_start_8
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 423
    .line 424
    .line 425
    :catchall_6
    if-nez v0, :cond_15

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 428
    .line 429
    .line 430
    :cond_15
    :goto_a
    if-eqz v0, :cond_16

    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :goto_b
    new-instance v3, Lp8/c;

    .line 435
    .line 436
    const/4 v5, 0x0

    .line 437
    move-object v4, v8

    .line 438
    const/4 v8, 0x2

    .line 439
    move-object v6, v15

    .line 440
    invoke-direct/range {v3 .. v8}, Lp8/c;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;I)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_27

    .line 444
    .line 445
    :cond_16
    const-string v0, "\u670b\u53cb\u5708\u89c6\u9891\u5c01\u9762\u751f\u6210\u5931\u8d25"

    .line 446
    .line 447
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    :goto_c
    const/4 v0, 0x0

    .line 451
    return-object v0

    .line 452
    :cond_17
    new-instance v0, Ljava/lang/InterruptedException;

    .line 453
    .line 454
    invoke-direct {v0, v10}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :cond_18
    const-string v0, "\u670b\u53cb\u5708\u89c6\u9891\u4e0b\u8f7d\u5931\u8d25"

    .line 459
    .line 460
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    goto :goto_c

    .line 464
    :cond_19
    const-string v0, "\u672a\u627e\u5230\u670b\u53cb\u5708\u89c6\u9891"

    .line 465
    .line 466
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_1a
    move-object v4, v8

    .line 471
    new-instance v3, Lp8/c;

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const/16 v8, 0xe

    .line 475
    .line 476
    const/4 v5, 0x0

    .line 477
    const/4 v6, 0x0

    .line 478
    invoke-direct/range {v3 .. v8}, Lp8/c;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;I)V

    .line 479
    .line 480
    .line 481
    return-object v3

    .line 482
    :goto_d
    const/16 v15, 0x9

    .line 483
    .line 484
    invoke-static {v15, v3}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v16

    .line 488
    new-instance v0, Ljava/util/ArrayList;

    .line 489
    .line 490
    invoke-static/range {v16 .. v16}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    move v3, v13

    .line 502
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-eqz v4, :cond_1c

    .line 507
    .line 508
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    add-int/lit8 v5, v3, 0x1

    .line 513
    .line 514
    if-ltz v3, :cond_1b

    .line 515
    .line 516
    check-cast v4, Lp8/s;

    .line 517
    .line 518
    invoke-virtual {v1, v4, v3, v7}, Lp8/o;->r(Lp8/s;ILjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move v3, v5

    .line 526
    goto :goto_e

    .line 527
    :cond_1b
    invoke-static {}, La/a;->Q0()V

    .line 528
    .line 529
    .line 530
    throw p1

    .line 531
    :cond_1c
    new-instance v2, Ljava/util/ArrayList;

    .line 532
    .line 533
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 534
    .line 535
    .line 536
    new-instance v0, Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-static/range {v16 .. v16}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 543
    .line 544
    .line 545
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v17

    .line 549
    move v3, v13

    .line 550
    :goto_f
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    if-eqz v4, :cond_28

    .line 555
    .line 556
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    add-int/lit8 v18, v3, 0x1

    .line 561
    .line 562
    if-ltz v3, :cond_27

    .line 563
    .line 564
    check-cast v4, Lp8/s;

    .line 565
    .line 566
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    if-nez v3, :cond_25

    .line 571
    .line 572
    invoke-interface {v11}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    check-cast v3, Lp8/u;

    .line 577
    .line 578
    move-object v5, v2

    .line 579
    iget-object v2, v3, Lp8/u;->a:Ljava/lang/reflect/Method;

    .line 580
    .line 581
    if-eqz v2, :cond_1d

    .line 582
    .line 583
    iget-object v3, v3, Lp8/u;->b:Ljava/lang/reflect/Method;

    .line 584
    .line 585
    if-eqz v3, :cond_1d

    .line 586
    .line 587
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    aget-object v6, v6, v13

    .line 592
    .line 593
    iget-object v13, v4, Lp8/s;->e:Ljava/lang/Object;

    .line 594
    .line 595
    invoke-virtual {v6, v13}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v6

    .line 599
    if-nez v6, :cond_1e

    .line 600
    .line 601
    :cond_1d
    move-object v14, v0

    .line 602
    move-object v13, v5

    .line 603
    :goto_10
    const/4 v0, 0x0

    .line 604
    goto/16 :goto_16

    .line 605
    .line 606
    :cond_1e
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    const/4 v13, 0x3

    .line 611
    aget-object v6, v6, v13

    .line 612
    .line 613
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v13

    .line 620
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v19

    .line 624
    :goto_11
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v20

    .line 628
    if-eqz v20, :cond_20

    .line 629
    .line 630
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v20

    .line 634
    move-object/from16 v21, v20

    .line 635
    .line 636
    check-cast v21, Ljava/lang/reflect/Field;

    .line 637
    .line 638
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 639
    .line 640
    .line 641
    move-result v22

    .line 642
    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 643
    .line 644
    .line 645
    move-result v22

    .line 646
    if-nez v22, :cond_1f

    .line 647
    .line 648
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    move-result-object v15

    .line 652
    const-class v14, Ljava/lang/String;

    .line 653
    .line 654
    invoke-static {v15, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    move-result v14

    .line 658
    if-eqz v14, :cond_1f

    .line 659
    .line 660
    goto :goto_12

    .line 661
    :cond_1f
    const/4 v14, 0x1

    .line 662
    const/16 v15, 0x9

    .line 663
    .line 664
    goto :goto_11

    .line 665
    :cond_20
    move-object/from16 v20, p1

    .line 666
    .line 667
    :goto_12
    move-object/from16 v14, v20

    .line 668
    .line 669
    check-cast v14, Ljava/lang/reflect/Field;

    .line 670
    .line 671
    if-eqz v14, :cond_23

    .line 672
    .line 673
    new-instance v15, Ldg/n;

    .line 674
    .line 675
    move-object/from16 v19, v0

    .line 676
    .line 677
    const/4 v0, 0x6

    .line 678
    invoke-direct {v15, v13, v0}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    new-instance v0, Lha/q;

    .line 682
    .line 683
    const/4 v13, 0x3

    .line 684
    invoke-direct {v0, v6, v13}, Lha/q;-><init>(Ljava/lang/Class;I)V

    .line 685
    .line 686
    .line 687
    new-instance v6, Lng/i;

    .line 688
    .line 689
    const/4 v13, 0x1

    .line 690
    invoke-direct {v6, v15, v13, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 691
    .line 692
    .line 693
    new-instance v0, Lo9/e;

    .line 694
    .line 695
    const/16 v15, 0xa

    .line 696
    .line 697
    invoke-direct {v0, v15}, Lo9/e;-><init>(I)V

    .line 698
    .line 699
    .line 700
    invoke-static {v6, v0}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    new-instance v6, Lng/h;

    .line 705
    .line 706
    invoke-direct {v6, v0}, Lng/h;-><init>(Lng/i;)V

    .line 707
    .line 708
    .line 709
    :goto_13
    invoke-virtual {v6}, Lng/h;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-eqz v0, :cond_22

    .line 714
    .line 715
    invoke-virtual {v6}, Lng/h;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-static {v14, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v15

    .line 723
    const-string v13, "timeline"

    .line 724
    .line 725
    invoke-static {v15, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v13

    .line 729
    if-eqz v13, :cond_21

    .line 730
    .line 731
    goto :goto_15

    .line 732
    :cond_21
    const/4 v13, 0x1

    .line 733
    goto :goto_13

    .line 734
    :cond_22
    :goto_14
    move-object/from16 v0, p1

    .line 735
    .line 736
    goto :goto_15

    .line 737
    :cond_23
    move-object/from16 v19, v0

    .line 738
    .line 739
    goto :goto_14

    .line 740
    :goto_15
    if-eqz v0, :cond_24

    .line 741
    .line 742
    move-object v6, v5

    .line 743
    move-object v5, v0

    .line 744
    new-instance v0, Lc9/r0;

    .line 745
    .line 746
    move-object v13, v6

    .line 747
    const/4 v6, 0x4

    .line 748
    move-object/from16 v14, v19

    .line 749
    .line 750
    invoke-direct/range {v0 .. v6}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v0}, Lp8/o;->j(Lfg/a;)Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    goto :goto_16

    .line 758
    :cond_24
    move-object v13, v5

    .line 759
    move-object/from16 v14, v19

    .line 760
    .line 761
    goto/16 :goto_10

    .line 762
    .line 763
    :goto_16
    if-eqz v0, :cond_26

    .line 764
    .line 765
    const/4 v0, 0x1

    .line 766
    goto :goto_17

    .line 767
    :cond_25
    move-object v14, v0

    .line 768
    move-object v13, v2

    .line 769
    :cond_26
    const/4 v0, 0x0

    .line 770
    :goto_17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-object v2, v13

    .line 778
    move-object v0, v14

    .line 779
    move/from16 v3, v18

    .line 780
    .line 781
    const/4 v13, 0x0

    .line 782
    const/4 v14, 0x1

    .line 783
    const/16 v15, 0x9

    .line 784
    .line 785
    goto/16 :goto_f

    .line 786
    .line 787
    :cond_27
    invoke-static {}, La/a;->Q0()V

    .line 788
    .line 789
    .line 790
    throw p1

    .line 791
    :cond_28
    move-object v14, v0

    .line 792
    move-object v13, v2

    .line 793
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 794
    .line 795
    .line 796
    move-result-wide v2

    .line 797
    const-wide/32 v4, 0xea60

    .line 798
    .line 799
    .line 800
    add-long v17, v2, v4

    .line 801
    .line 802
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    const/4 v11, 0x0

    .line 807
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    if-eqz v2, :cond_32

    .line 812
    .line 813
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    add-int/lit8 v15, v11, 0x1

    .line 818
    .line 819
    if-ltz v11, :cond_31

    .line 820
    .line 821
    check-cast v2, Lp8/s;

    .line 822
    .line 823
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    if-nez v3, :cond_2c

    .line 828
    .line 829
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    check-cast v3, Ljava/lang/Boolean;

    .line 834
    .line 835
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    if-eqz v3, :cond_2c

    .line 840
    .line 841
    :goto_19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 842
    .line 843
    .line 844
    move-result-wide v3

    .line 845
    cmp-long v3, v3, v17

    .line 846
    .line 847
    if-gez v3, :cond_2b

    .line 848
    .line 849
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    if-nez v3, :cond_2a

    .line 854
    .line 855
    invoke-virtual {v1, v2, v11, v7}, Lp8/o;->r(Lp8/s;ILjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    if-eqz v3, :cond_29

    .line 860
    .line 861
    goto :goto_1a

    .line 862
    :cond_29
    const-wide/16 v3, 0x1f4

    .line 863
    .line 864
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 865
    .line 866
    .line 867
    goto :goto_19

    .line 868
    :cond_2a
    new-instance v0, Ljava/lang/InterruptedException;

    .line 869
    .line 870
    invoke-direct {v0, v10}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    throw v0

    .line 874
    :cond_2b
    invoke-virtual {v1, v2, v11, v7}, Lp8/o;->r(Lp8/s;ILjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v3

    .line 878
    :goto_1a
    invoke-virtual {v13, v11, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    :cond_2c
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    if-nez v3, :cond_30

    .line 886
    .line 887
    iget-object v3, v2, Lp8/s;->c:Ljava/lang/String;

    .line 888
    .line 889
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    iget-object v2, v2, Lp8/s;->a:Ljava/lang/String;

    .line 894
    .line 895
    new-instance v4, Ljava/lang/StringBuilder;

    .line 896
    .line 897
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    const-string v4, "jpg"

    .line 920
    .line 921
    const-wide/32 v5, 0x2800000

    .line 922
    .line 923
    .line 924
    move-object/from16 v32, v3

    .line 925
    .line 926
    move-object v3, v2

    .line 927
    move-object/from16 v2, v32

    .line 928
    .line 929
    invoke-virtual/range {v1 .. v7}, Lp8/o;->e(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    if-eqz v2, :cond_2f

    .line 934
    .line 935
    invoke-static {v2}, Lp8/o;->l(Ljava/lang/String;)Z

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    if-eqz v3, :cond_2d

    .line 940
    .line 941
    move-object v3, v2

    .line 942
    goto :goto_1b

    .line 943
    :cond_2d
    move-object/from16 v3, p1

    .line 944
    .line 945
    :goto_1b
    if-eqz v3, :cond_2e

    .line 946
    .line 947
    goto :goto_1c

    .line 948
    :cond_2e
    invoke-static {v2}, Lp/a;->v(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    :cond_2f
    move-object/from16 v3, p1

    .line 952
    .line 953
    :goto_1c
    invoke-virtual {v13, v11, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    :cond_30
    move v11, v15

    .line 957
    goto/16 :goto_18

    .line 958
    .line 959
    :cond_31
    invoke-static {}, La/a;->Q0()V

    .line 960
    .line 961
    .line 962
    throw p1

    .line 963
    :cond_32
    new-instance v2, Ljava/util/ArrayList;

    .line 964
    .line 965
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 966
    .line 967
    .line 968
    move-result v0

    .line 969
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    const/4 v3, 0x0

    .line 977
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    const-string v5, "\u7b2c"

    .line 982
    .line 983
    if-eqz v4, :cond_35

    .line 984
    .line 985
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    add-int/lit8 v6, v3, 0x1

    .line 990
    .line 991
    if-ltz v3, :cond_34

    .line 992
    .line 993
    check-cast v4, Ljava/lang/String;

    .line 994
    .line 995
    if-eqz v4, :cond_33

    .line 996
    .line 997
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move v3, v6

    .line 1001
    goto :goto_1d

    .line 1002
    :cond_33
    const-string v0, "\u5f20\u56fe\u7247\u4e0b\u8f7d\u5931\u8d25"

    .line 1003
    .line 1004
    invoke-static {v6, v5, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    goto/16 :goto_c

    .line 1012
    .line 1013
    :cond_34
    invoke-static {}, La/a;->Q0()V

    .line 1014
    .line 1015
    .line 1016
    throw p1

    .line 1017
    :cond_35
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v0

    .line 1021
    if-nez v0, :cond_40

    .line 1022
    .line 1023
    new-instance v3, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-static/range {v16 .. v16}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1026
    .line 1027
    .line 1028
    move-result v0

    .line 1029
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    const/4 v0, 0x0

    .line 1037
    :goto_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v6

    .line 1041
    if-eqz v6, :cond_3f

    .line 1042
    .line 1043
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v6

    .line 1047
    add-int/lit8 v10, v0, 0x1

    .line 1048
    .line 1049
    if-ltz v0, :cond_3e

    .line 1050
    .line 1051
    check-cast v6, Lp8/s;

    .line 1052
    .line 1053
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    move-object/from16 v24, v0

    .line 1058
    .line 1059
    check-cast v24, Ljava/lang/String;

    .line 1060
    .line 1061
    iget-object v0, v6, Lp8/s;->f:Lp8/s;

    .line 1062
    .line 1063
    if-eqz v0, :cond_3d

    .line 1064
    .line 1065
    iget-object v6, v6, Lp8/s;->a:Ljava/lang/String;

    .line 1066
    .line 1067
    iget-object v11, v0, Lp8/s;->a:Ljava/lang/String;

    .line 1068
    .line 1069
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    const-string v6, "_live"

    .line 1090
    .line 1091
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v6

    .line 1098
    invoke-virtual {v1, v9, v0, v6, v7}, Lp8/o;->t(Ljava/lang/String;Lp8/s;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v6

    .line 1102
    if-eqz v6, :cond_3c

    .line 1103
    .line 1104
    new-instance v11, Landroid/media/MediaMetadataRetriever;

    .line 1105
    .line 1106
    invoke-direct {v11}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    :try_start_9
    invoke-virtual {v11, v6}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 1110
    .line 1111
    .line 1112
    const/16 v15, 0x9

    .line 1113
    .line 1114
    :try_start_a
    invoke-virtual {v11, v15}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    if-eqz v0, :cond_36

    .line 1119
    .line 1120
    invoke-static {v0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    if-eqz v0, :cond_36

    .line 1125
    .line 1126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1127
    .line 1128
    .line 1129
    move-result-wide v16

    .line 1130
    goto :goto_20

    .line 1131
    :catchall_7
    move-exception v0

    .line 1132
    :goto_1f
    const-wide/16 v16, 0x0

    .line 1133
    .line 1134
    goto :goto_21

    .line 1135
    :cond_36
    const-wide/16 v16, 0x0

    .line 1136
    .line 1137
    :goto_20
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1141
    const-wide/16 v16, 0x0

    .line 1142
    .line 1143
    goto :goto_22

    .line 1144
    :catchall_8
    move-exception v0

    .line 1145
    const/16 v15, 0x9

    .line 1146
    .line 1147
    goto :goto_1f

    .line 1148
    :goto_21
    new-instance v13, Lsf/f;

    .line 1149
    .line 1150
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1151
    .line 1152
    .line 1153
    move-object v0, v13

    .line 1154
    :goto_22
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v13

    .line 1158
    instance-of v14, v0, Lsf/f;

    .line 1159
    .line 1160
    if-eqz v14, :cond_37

    .line 1161
    .line 1162
    move-object v0, v13

    .line 1163
    :cond_37
    check-cast v0, Ljava/lang/Number;

    .line 1164
    .line 1165
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1166
    .line 1167
    .line 1168
    :try_start_b
    invoke-virtual {v11}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1169
    .line 1170
    .line 1171
    :catchall_9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v13

    .line 1175
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    cmp-long v11, v13, v16

    .line 1180
    .line 1181
    if-lez v11, :cond_38

    .line 1182
    .line 1183
    const/4 v11, 0x1

    .line 1184
    goto :goto_23

    .line 1185
    :cond_38
    const/4 v11, 0x0

    .line 1186
    :goto_23
    if-eqz v11, :cond_39

    .line 1187
    .line 1188
    goto :goto_24

    .line 1189
    :cond_39
    move-object/from16 v0, p1

    .line 1190
    .line 1191
    :goto_24
    if-eqz v0, :cond_3b

    .line 1192
    .line 1193
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1194
    .line 1195
    .line 1196
    move-result-wide v13

    .line 1197
    const-wide/32 v16, 0x7fffffff

    .line 1198
    .line 1199
    .line 1200
    cmp-long v0, v13, v16

    .line 1201
    .line 1202
    if-lez v0, :cond_3a

    .line 1203
    .line 1204
    move-wide/from16 v13, v16

    .line 1205
    .line 1206
    :cond_3a
    long-to-int v0, v13

    .line 1207
    new-instance v23, Lp8/d;

    .line 1208
    .line 1209
    const-wide/16 v29, 0x0

    .line 1210
    .line 1211
    const/16 v31, 0x78

    .line 1212
    .line 1213
    const/16 v27, 0x0

    .line 1214
    .line 1215
    const/16 v28, 0x0

    .line 1216
    .line 1217
    move/from16 v26, v0

    .line 1218
    .line 1219
    move-object/from16 v25, v6

    .line 1220
    .line 1221
    invoke-direct/range {v23 .. v31}, Lp8/d;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJI)V

    .line 1222
    .line 1223
    .line 1224
    :goto_25
    move-object/from16 v0, v23

    .line 1225
    .line 1226
    goto :goto_26

    .line 1227
    :cond_3b
    const-string v0, "\u5f20\u5b9e\u51b5\u89c6\u9891\u65e0\u6548"

    .line 1228
    .line 1229
    invoke-static {v10, v5, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1234
    .line 1235
    .line 1236
    goto/16 :goto_c

    .line 1237
    .line 1238
    :cond_3c
    const-string v0, "\u5f20\u5b9e\u51b5\u89c6\u9891\u4e0b\u8f7d\u5931\u8d25"

    .line 1239
    .line 1240
    invoke-static {v10, v5, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    goto/16 :goto_c

    .line 1248
    .line 1249
    :cond_3d
    const/16 v15, 0x9

    .line 1250
    .line 1251
    new-instance v23, Lp8/d;

    .line 1252
    .line 1253
    const-wide/16 v29, 0x0

    .line 1254
    .line 1255
    const/16 v31, 0x7e

    .line 1256
    .line 1257
    const/16 v25, 0x0

    .line 1258
    .line 1259
    const/16 v26, 0x0

    .line 1260
    .line 1261
    const/16 v27, 0x0

    .line 1262
    .line 1263
    const/16 v28, 0x0

    .line 1264
    .line 1265
    invoke-direct/range {v23 .. v31}, Lp8/d;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJI)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_25

    .line 1269
    :goto_26
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    move v0, v10

    .line 1273
    goto/16 :goto_1e

    .line 1274
    .line 1275
    :cond_3e
    invoke-static {}, La/a;->Q0()V

    .line 1276
    .line 1277
    .line 1278
    throw p1

    .line 1279
    :cond_3f
    move-object v5, v3

    .line 1280
    new-instance v3, Lp8/c;

    .line 1281
    .line 1282
    const/4 v7, 0x0

    .line 1283
    move-object v4, v8

    .line 1284
    const/16 v8, 0xc

    .line 1285
    .line 1286
    const/4 v6, 0x0

    .line 1287
    invoke-direct/range {v3 .. v8}, Lp8/c;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1288
    .line 1289
    .line 1290
    :goto_27
    return-object v3

    .line 1291
    :cond_40
    const-string v0, "\u672a\u627e\u5230\u670b\u53cb\u5708\u56fe\u7247"

    .line 1292
    .line 1293
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    goto/16 :goto_c

    .line 1297
    .line 1298
    :cond_41
    new-instance v0, Ljava/lang/InterruptedException;

    .line 1299
    .line 1300
    invoke-direct {v0, v10}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    throw v0
.end method

.method public final r(Lp8/s;ILjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v2, p0, Lp8/o;->d:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    check-cast v2, Lp8/r;

    .line 8
    .line 9
    iget-object v3, v2, Lp8/r;->a:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v3, :cond_8

    .line 13
    .line 14
    iget-object v4, v2, Lp8/r;->b:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    if-eqz v4, :cond_8

    .line 17
    .line 18
    iget-object v2, v2, Lp8/r;->c:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    if-eqz v2, :cond_8

    .line 21
    .line 22
    iget-object v5, p1, Lp8/s;->e:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v9, p1, Lp8/s;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v5, v2}, Lp8/o;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    const/4 v5, 0x0

    .line 35
    :try_start_0
    new-array v5, v5, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v3, v8, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    instance-of v5, v3, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    move-object v3, v8

    .line 52
    :goto_0
    if-eqz v3, :cond_5

    .line 53
    .line 54
    filled-new-array {v3, v9}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v4, v8, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    instance-of v4, v3, Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v3, v8

    .line 70
    :goto_1
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object v0, p1, Lp8/s;->e:Ljava/lang/Object;

    .line 73
    .line 74
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v2, v8, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    instance-of v2, v0, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    check-cast v0, Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v0, v8

    .line 90
    :goto_2
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v3, "_"

    .line 105
    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const-string v4, "jpg"

    .line 117
    .line 118
    const-wide/32 v5, 0x2800000

    .line 119
    .line 120
    .line 121
    move-object v1, p0

    .line 122
    move-object v7, p3

    .line 123
    invoke-virtual/range {v1 .. v7}, Lp8/o;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-static {v0}, Lp8/o;->l(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    if-eqz v0, :cond_5

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_5

    .line 143
    .line 144
    new-instance v2, Ljava/io/File;

    .line 145
    .line 146
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    :cond_5
    move-object v0, v8

    .line 153
    goto :goto_4

    .line 154
    :goto_3
    new-instance v2, Lsf/f;

    .line 155
    .line 156
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    move-object v0, v2

    .line 160
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    instance-of v3, v2, Ljava/lang/InterruptedException;

    .line 167
    .line 168
    if-nez v3, :cond_6

    .line 169
    .line 170
    const-string v3, "\u8bfb\u53d6\u670b\u53cb\u5708\u672c\u5730\u539f\u56fe\u5931\u8d25: "

    .line 171
    .line 172
    invoke-virtual {v3, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    iget-object v4, p0, Lp8/o;->b:Lfg/p;

    .line 177
    .line 178
    invoke-interface {v4, v3, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    :cond_6
    instance-of v2, v0, Lsf/f;

    .line 182
    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_7
    move-object v8, v0

    .line 187
    :goto_5
    check-cast v8, Ljava/lang/String;

    .line 188
    .line 189
    :cond_8
    :goto_6
    return-object v8
.end method

.method public final s(Ljava/lang/String;Lp8/s;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp8/o;->e:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lp8/u;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lp8/u;->f:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    iget-object v4, v0, Lp8/u;->e:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    filled-new-array {v3, v4}, [Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 36
    if-eqz v5, :cond_3

    .line 37
    .line 38
    :try_start_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget-object v6, p2, Lp8/s;->e:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v8, 0x1

    .line 56
    invoke-static {v8, v7}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v7, :cond_0

    .line 63
    .line 64
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-ne v6, v8, :cond_0

    .line 69
    .line 70
    iget-object v6, p2, Lp8/s;->e:Ljava/lang/Object;

    .line 71
    .line 72
    filled-new-array {p1, v6}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v5, v1, v6}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    instance-of v6, v5, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    move-object v2, p0

    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_1
    move-object v5, v1

    .line 93
    :goto_1
    if-eqz v5, :cond_0

    .line 94
    .line 95
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    move-object v5, v1

    .line 103
    :goto_2
    if-eqz v5, :cond_0

    .line 104
    .line 105
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    :try_start_2
    iget-object p1, v0, Lp8/u;->f:Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 110
    .line 111
    if-nez p1, :cond_6

    .line 112
    .line 113
    if-nez v4, :cond_6

    .line 114
    .line 115
    :try_start_3
    iget-object p1, p0, Lp8/o;->d:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-interface {p1}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Lp8/r;

    .line 122
    .line 123
    iget-object p1, p1, Lp8/r;->d:Ljava/lang/reflect/Method;

    .line 124
    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    iget-object v0, p2, Lp8/s;->e:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v0, p1}, Lp8/o;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    iget-object v0, p2, Lp8/s;->e:Ljava/lang/Object;

    .line 136
    .line 137
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    instance-of v0, p1, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    check-cast p1, Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    move-object p1, v1

    .line 153
    :goto_3
    if-eqz p1, :cond_6

    .line 154
    .line 155
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_5

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_5
    move-object p1, v1

    .line 163
    :goto_4
    if-eqz p1, :cond_6

    .line 164
    .line 165
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    .line 167
    .line 168
    :cond_6
    :try_start_4
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    move-object v3, v0

    .line 191
    check-cast v3, Ljava/lang/String;

    .line 192
    .line 193
    iget-object v0, p2, Lp8/s;->a:Ljava/lang/String;

    .line 194
    .line 195
    new-instance v2, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, "_video"

    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const-string v5, "mp4"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 213
    .line 214
    const-wide/32 v6, 0x20000000

    .line 215
    .line 216
    .line 217
    move-object v2, p0

    .line 218
    move-object v8, p3

    .line 219
    :try_start_5
    invoke-virtual/range {v2 .. v8}, Lp8/o;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    if-eqz p3, :cond_8

    .line 224
    .line 225
    invoke-static {p3}, Lp8/o;->m(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_7
    invoke-virtual {p3, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_8

    .line 237
    .line 238
    new-instance v0, Ljava/io/File;

    .line 239
    .line 240
    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    :goto_6
    move-object p1, v0

    .line 249
    goto :goto_8

    .line 250
    :cond_8
    :goto_7
    move-object p3, v8

    .line 251
    goto :goto_5

    .line 252
    :catchall_2
    move-exception v0

    .line 253
    move-object v2, p0

    .line 254
    goto :goto_6

    .line 255
    :cond_9
    move-object v2, p0

    .line 256
    move-object p3, v1

    .line 257
    goto :goto_9

    .line 258
    :goto_8
    new-instance p3, Lsf/f;

    .line 259
    .line 260
    invoke-direct {p3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    :goto_9
    invoke-static {p3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-eqz p1, :cond_a

    .line 268
    .line 269
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 270
    .line 271
    if-nez v0, :cond_a

    .line 272
    .line 273
    iget-object p2, p2, Lp8/s;->a:Ljava/lang/String;

    .line 274
    .line 275
    const-string v0, "\u8bfb\u53d6\u670b\u53cb\u5708\u672c\u5730\u89c6\u9891\u5931\u8d25: "

    .line 276
    .line 277
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    iget-object v0, v2, Lp8/o;->b:Lfg/p;

    .line 282
    .line 283
    invoke-interface {v0, p2, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    :cond_a
    instance-of p1, p3, Lsf/f;

    .line 287
    .line 288
    if-eqz p1, :cond_b

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_b
    move-object v1, p3

    .line 292
    :goto_a
    check-cast v1, Ljava/lang/String;

    .line 293
    .line 294
    return-object v1
.end method

.method public final t(Ljava/lang/String;Lp8/s;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2, p4}, Lp8/o;->s(Ljava/lang/String;Lp8/s;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v7

    .line 5
    if-nez v7, :cond_5

    .line 6
    .line 7
    iget-object v1, p0, Lp8/o;->e:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v1}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lp8/u;

    .line 14
    .line 15
    iget-object v2, v1, Lp8/u;->c:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v1, v1, Lp8/u;->d:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    aget-object v6, v6, v3

    .line 29
    .line 30
    iget-object v8, p2, Lp8/s;->e:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Lc9/r0;

    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    move-object v5, p1

    .line 43
    move-object v4, p2

    .line 44
    move-object v3, v1

    .line 45
    move-object v1, p0

    .line 46
    invoke-direct/range {v0 .. v6}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    move-object v1, v0

    .line 50
    invoke-virtual {p0, v1}, Lp8/o;->j(Lfg/a;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    :cond_1
    :goto_0
    if-eqz v3, :cond_5

    .line 55
    .line 56
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    const-wide/32 v7, 0x15f90

    .line 61
    .line 62
    .line 63
    add-long/2addr v1, v7

    .line 64
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    cmp-long v3, v7, v1

    .line 69
    .line 70
    if-gez v3, :cond_4

    .line 71
    .line 72
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2, p4}, Lp8/o;->s(Ljava/lang/String;Lp8/s;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    move-object v7, v3

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const-wide/16 v7, 0x1f4

    .line 87
    .line 88
    invoke-static {v7, v8}, Landroid/os/SystemClock;->sleep(J)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    new-instance v1, Ljava/lang/InterruptedException;

    .line 93
    .line 94
    const-string v2, "\u5df2\u53d6\u6d88"

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :cond_4
    invoke-virtual {p0, p1, p2, p4}, Lp8/o;->s(Ljava/lang/String;Lp8/s;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    move-object v7, v1

    .line 105
    :cond_5
    :goto_2
    if-eqz v7, :cond_6

    .line 106
    .line 107
    return-object v7

    .line 108
    :cond_6
    iget-object v1, p2, Lp8/s;->c:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v3, "mp4"

    .line 115
    .line 116
    const-wide/32 v4, 0x20000000

    .line 117
    .line 118
    .line 119
    move-object v0, p0

    .line 120
    move-object v2, p3

    .line 121
    move-object v6, p4

    .line 122
    invoke-virtual/range {v0 .. v6}, Lp8/o;->e(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const/4 v0, 0x0

    .line 127
    if-eqz v1, :cond_9

    .line 128
    .line 129
    invoke-static {v1}, Lp8/o;->m(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_7

    .line 134
    .line 135
    move-object v2, v1

    .line 136
    goto :goto_3

    .line 137
    :cond_7
    move-object v2, v0

    .line 138
    :goto_3
    if-eqz v2, :cond_8

    .line 139
    .line 140
    return-object v2

    .line 141
    :cond_8
    invoke-static {v1}, Lp/a;->v(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    return-object v0
.end method

.method public final u(Ljava/lang/Object;)Lp8/v;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, "getTimeLine"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lp8/o;->v(Ljava/lang/Object;)Lp8/v;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p1, v0

    .line 24
    goto :goto_1

    .line 25
    :goto_0
    new-instance v1, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v1

    .line 31
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lp8/o;->b:Lfg/p;

    .line 38
    .line 39
    const-string v3, "\u89e3\u6790\u670b\u53cb\u5708\u539f\u751f\u5185\u5bb9\u5931\u8d25"

    .line 40
    .line 41
    invoke-interface {v2, v3, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    instance-of v1, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move-object v0, p1

    .line 50
    :goto_2
    check-cast v0, Lp8/v;

    .line 51
    .line 52
    return-object v0
.end method

.method public final v(Ljava/lang/Object;)Lp8/v;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "ContentDesc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v1, v3

    .line 18
    :goto_0
    const-string v2, ""

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    move-object v1, v2

    .line 23
    :cond_1
    const-string v4, "ContentObj"

    .line 24
    .line 25
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    const-string v6, "e"

    .line 33
    .line 34
    invoke-static {v4, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    instance-of v7, v6, Ljava/lang/Number;

    .line 39
    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    check-cast v6, Ljava/lang/Number;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v6, v3

    .line 46
    :goto_1
    if-eqz v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v6, v5

    .line 54
    :goto_2
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-static {v4}, Lp8/o;->i(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    new-instance v10, Ldg/n;

    .line 64
    .line 65
    const/4 v11, 0x6

    .line 66
    invoke-direct {v10, v9, v11}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    new-instance v9, Lo9/e;

    .line 70
    .line 71
    const/16 v11, 0xc

    .line 72
    .line 73
    invoke-direct {v9, v11}, Lo9/e;-><init>(I)V

    .line 74
    .line 75
    .line 76
    new-instance v11, Lng/i;

    .line 77
    .line 78
    invoke-direct {v11, v10, v8, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 79
    .line 80
    .line 81
    new-instance v9, Lc9/k1;

    .line 82
    .line 83
    move-object/from16 v10, p0

    .line 84
    .line 85
    invoke-direct {v9, v4, v10}, Lc9/k1;-><init>(Ljava/lang/Object;Lp8/o;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v11, v9}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-static {v9}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, Ljava/util/List;

    .line 97
    .line 98
    if-nez v9, :cond_5

    .line 99
    .line 100
    move-object v9, v7

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move-object/from16 v10, p0

    .line 103
    .line 104
    move-object v9, v3

    .line 105
    :cond_5
    :goto_3
    if-nez v9, :cond_6

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    move-object v7, v9

    .line 109
    :goto_4
    new-instance v9, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    const/16 v12, 0x36

    .line 123
    .line 124
    if-eqz v11, :cond_8

    .line 125
    .line 126
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    if-ne v6, v12, :cond_7

    .line 131
    .line 132
    move v12, v8

    .line 133
    goto :goto_6

    .line 134
    :cond_7
    move v12, v5

    .line 135
    :goto_6
    invoke-static {v11, v12}, Lp8/o;->p(Ljava/lang/Object;Z)Lp8/s;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    const-string v5, "Id"

    .line 144
    .line 145
    invoke-static {v0, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    instance-of v7, v5, Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v7, :cond_9

    .line 152
    .line 153
    check-cast v5, Ljava/lang/String;

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_9
    move-object v5, v3

    .line 157
    :goto_7
    if-eqz v5, :cond_b

    .line 158
    .line 159
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-nez v7, :cond_a

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_a
    move-object v5, v3

    .line 167
    :goto_8
    if-eqz v5, :cond_b

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_b
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v5, "sns_"

    .line 179
    .line 180
    invoke-static {v5, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    :goto_9
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const/16 v7, 0xf

    .line 189
    .line 190
    const/4 v11, 0x5

    .line 191
    if-eqz v0, :cond_13

    .line 192
    .line 193
    if-eq v6, v8, :cond_13

    .line 194
    .line 195
    if-eq v6, v11, :cond_13

    .line 196
    .line 197
    if-eq v6, v7, :cond_13

    .line 198
    .line 199
    if-ne v6, v12, :cond_c

    .line 200
    .line 201
    goto :goto_d

    .line 202
    :cond_c
    if-eqz v4, :cond_11

    .line 203
    .line 204
    invoke-static {v4}, Lp8/o;->d(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :cond_d
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_e

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    move-object v13, v4

    .line 228
    check-cast v13, Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v13}, Lp8/o;->k(Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    if-nez v13, :cond_d

    .line 235
    .line 236
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_a

    .line 240
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :cond_f
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_10

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    move-object v13, v4

    .line 260
    check-cast v13, Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    if-nez v13, :cond_f

    .line 267
    .line 268
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_10
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const/16 v18, 0x3e

    .line 283
    .line 284
    const-string v14, "\n"

    .line 285
    .line 286
    const/4 v15, 0x0

    .line 287
    const/16 v16, 0x0

    .line 288
    .line 289
    invoke-static/range {v13 .. v18}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    goto :goto_c

    .line 294
    :cond_11
    move-object v0, v3

    .line 295
    :goto_c
    if-nez v0, :cond_12

    .line 296
    .line 297
    move-object v1, v2

    .line 298
    goto :goto_d

    .line 299
    :cond_12
    move-object v1, v0

    .line 300
    :cond_13
    :goto_d
    if-eq v6, v8, :cond_1a

    .line 301
    .line 302
    if-eq v6, v11, :cond_1a

    .line 303
    .line 304
    if-eq v6, v7, :cond_1a

    .line 305
    .line 306
    if-ne v6, v12, :cond_14

    .line 307
    .line 308
    goto/16 :goto_11

    .line 309
    .line 310
    :cond_14
    new-instance v0, Ldg/n;

    .line 311
    .line 312
    const/4 v4, 0x6

    .line 313
    invoke-direct {v0, v9, v4}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 314
    .line 315
    .line 316
    new-instance v4, Lo9/e;

    .line 317
    .line 318
    const/16 v7, 0xb

    .line 319
    .line 320
    invoke-direct {v4, v7}, Lo9/e;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-static {v0, v4}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v4, v0, Lng/t;->a:Lng/j;

    .line 328
    .line 329
    invoke-interface {v4}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    :cond_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-eqz v7, :cond_16

    .line 338
    .line 339
    iget-object v7, v0, Lng/t;->b:Lfg/l;

    .line 340
    .line 341
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    invoke-interface {v7, v8}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    move-object v8, v7

    .line 350
    check-cast v8, Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    if-nez v8, :cond_15

    .line 357
    .line 358
    goto :goto_e

    .line 359
    :cond_16
    move-object v7, v3

    .line 360
    :goto_e
    check-cast v7, Ljava/lang/String;

    .line 361
    .line 362
    if-nez v7, :cond_17

    .line 363
    .line 364
    goto :goto_f

    .line 365
    :cond_17
    move-object v2, v7

    .line 366
    :goto_f
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    new-instance v1, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    :cond_18
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_19

    .line 388
    .line 389
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    move-object v4, v2

    .line 394
    check-cast v4, Ljava/lang/String;

    .line 395
    .line 396
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-nez v4, :cond_18

    .line 401
    .line 402
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_19
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    const/4 v15, 0x0

    .line 415
    const/16 v16, 0x3e

    .line 416
    .line 417
    const-string v12, "\n"

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const/4 v14, 0x0

    .line 421
    invoke-static/range {v11 .. v16}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    :cond_1a
    :goto_11
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_1b

    .line 430
    .line 431
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_1b

    .line 436
    .line 437
    return-object v3

    .line 438
    :cond_1b
    new-instance v0, Lp8/v;

    .line 439
    .line 440
    invoke-direct {v0, v5, v1, v6, v9}, Lp8/v;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 441
    .line 442
    .line 443
    return-object v0
.end method
