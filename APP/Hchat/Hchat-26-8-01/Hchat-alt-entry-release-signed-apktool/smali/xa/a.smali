.class public final Lxa/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lxa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxa/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxa/a;->a:Lxa/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lxa/a;->b(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    array-length p0, v0

    .line 25
    const/4 v1, 0x3

    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    const-class p0, Landroid/view/ContextMenu;

    .line 29
    .line 30
    aget-object v1, v0, v2

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    const-class p0, Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    aget-object v3, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 p0, 0x2

    .line 50
    aget-object p0, v0, p0

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, "android.view.ContextMenu$ContextMenuInfo"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    return v1

    .line 65
    :cond_0
    return v2
.end method

.method public static b(Ljava/lang/reflect/Method;)Z
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
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lxa/a;->b(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    array-length p0, v0

    .line 25
    const/4 v1, 0x4

    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    const-class p0, Landroid/widget/AdapterView;

    .line 29
    .line 30
    aget-object v1, v0, v2

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    const-class p0, Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    aget-object v3, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 p0, 0x2

    .line 50
    aget-object p0, v0, p0

    .line 51
    .line 52
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {p0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_0

    .line 59
    .line 60
    const/4 p0, 0x3

    .line 61
    aget-object p0, v0, p0

    .line 62
    .line 63
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    return v1

    .line 72
    :cond_0
    return v2
.end method


# virtual methods
.method public final d(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "Hchat_conversation_menu_method_cache"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v3, "context_menu_create_v2"

    .line 19
    .line 20
    invoke-static {v1, v0, v2, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, Lxa/a;->a(Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v4

    .line 35
    :goto_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    :try_start_0
    iget-object v2, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 39
    .line 40
    new-instance v5, Lch/e;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lfh/k;

    .line 46
    .line 47
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v7, "com.tencent.mm.ui.conversation."

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    invoke-virtual {v6, v8, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v7, "boolean"

    .line 57
    .line 58
    invoke-static {v6, v7}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v7, "android.widget.AdapterView"

    .line 62
    .line 63
    const-string v8, "android.view.View"

    .line 64
    .line 65
    const-string v9, "int"

    .line 66
    .line 67
    const-string v10, "long"

    .line 68
    .line 69
    filled-new-array {v7, v8, v9, v10}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v6, v7}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v7, "headercount:%d, postion:%d"

    .line 77
    .line 78
    filled-new-array {v7}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v6, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v6, v5, Lch/e;->h:Lfh/k;

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    new-instance v5, Lc9/o1;

    .line 96
    .line 97
    const/4 v6, 0x4

    .line 98
    invoke-direct {v5, p0, p1, v6}, Lc9/o1;-><init>(Ljava/lang/Object;Lr8/g;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v2, Lng/h;

    .line 106
    .line 107
    invoke-direct {v2, p1}, Lng/h;-><init>(Lng/i;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    move-object v5, p1

    .line 121
    check-cast v5, Ljava/lang/reflect/Method;

    .line 122
    .line 123
    invoke-static {v5}, Lxa/a;->c(Ljava/lang/reflect/Method;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_2

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    move-object p1, v4

    .line 133
    :goto_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    if-eqz p1, :cond_4

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v2, "onCreateContextMenu"

    .line 142
    .line 143
    const-class v5, Landroid/view/ContextMenu;

    .line 144
    .line 145
    const-class v6, Landroid/view/View;

    .line 146
    .line 147
    const-class v7, Landroid/view/ContextMenu$ContextMenuInfo;

    .line 148
    .line 149
    filled-new-array {v5, v6, v7}, [Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {p1, v2, v5}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_4

    .line 158
    .line 159
    invoke-static {p1}, Lxa/a;->a(Ljava/lang/reflect/Method;)Z

    .line 160
    .line 161
    .line 162
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    if-eqz v2, :cond_4

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move-object p1, v4

    .line 167
    goto :goto_3

    .line 168
    :goto_2
    new-instance v2, Lsf/f;

    .line 169
    .line 170
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    move-object p1, v2

    .line 174
    :goto_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    if-eqz v2, :cond_5

    .line 179
    .line 180
    const-string v5, "\u5b9a\u4f4d\u4f1a\u8bdd\u957f\u6309\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 181
    .line 182
    invoke-interface {p2, v5, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_5
    instance-of p2, p1, Lsf/f;

    .line 186
    .line 187
    if-eqz p2, :cond_6

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_6
    move-object v4, p1

    .line 191
    :goto_4
    check-cast v4, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    if-eqz v4, :cond_7

    .line 194
    .line 195
    invoke-static {v1, v0, v3, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_7
    const-string p1, "cache.key"

    .line 200
    .line 201
    :try_start_1
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    const-string v2, ""

    .line 206
    .line 207
    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_8

    .line 216
    .line 217
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 222
    .line 223
    .line 224
    :cond_8
    invoke-interface {p2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 229
    .line 230
    .line 231
    :catchall_1
    :goto_5
    return-object v4
.end method
