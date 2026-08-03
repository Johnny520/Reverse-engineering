.class public final Lp8/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp8/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp8/q;->a:Lp8/q;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class v0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method


# virtual methods
.method public final b(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "Hchat_sns_forward_local_media_method_cache"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-static {v1, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1, v2, p2}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {p4, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v2, v3

    .line 38
    :goto_0
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    :try_start_0
    iget-object v2, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 42
    .line 43
    new-instance v4, Lch/e;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v5, Lfh/k;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v5, p3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    iput-object v5, v4, Lch/e;->h:Lfh/k;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v4, Lc9/o1;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-direct {v4, p0, p1, v5}, Lc9/o1;-><init>(Ljava/lang/Object;Lr8/g;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v4}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v2, Lng/h;

    .line 77
    .line 78
    invoke-direct {v2, p1}, Lng/h;-><init>(Lng/i;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p4, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    move-object p1, v3

    .line 107
    :goto_1
    check-cast p1, Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :goto_2
    new-instance p4, Lsf/f;

    .line 111
    .line 112
    invoke-direct {p4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p1, p4

    .line 116
    :goto_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    const-string v2, ""

    .line 121
    .line 122
    if-eqz p4, :cond_5

    .line 123
    .line 124
    invoke-static {p3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, Ljava/lang/String;

    .line 129
    .line 130
    if-nez p3, :cond_4

    .line 131
    .line 132
    move-object p3, v2

    .line 133
    :cond_4
    const-string v4, "\u5b9a\u4f4d\u670b\u53cb\u5708\u672c\u5730\u5a92\u4f53\u65b9\u6cd5\u5931\u8d25: "

    .line 134
    .line 135
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-interface {p5, p3, p4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_5
    instance-of p3, p1, Lsf/f;

    .line 143
    .line 144
    if-eqz p3, :cond_6

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move-object v3, p1

    .line 148
    :goto_4
    check-cast v3, Ljava/lang/reflect/Method;

    .line 149
    .line 150
    if-nez v3, :cond_8

    .line 151
    .line 152
    const-string p1, "cache.key"

    .line 153
    .line 154
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p4

    .line 162
    invoke-static {p4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p4

    .line 166
    if-nez p4, :cond_7

    .line 167
    .line 168
    invoke-interface {p3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-interface {p4, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 173
    .line 174
    .line 175
    :cond_7
    invoke-interface {p3, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    invoke-static {v0, v1, p2, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 184
    .line 185
    .line 186
    :catchall_1
    :goto_5
    return-object v3
.end method
