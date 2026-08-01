.class public final synthetic Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements Ld0/c;
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo0/b;->a:I

    iput-object p1, p0, Lo0/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo0/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 5

    .line 1
    iget v0, p0, Lo0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Field;

    .line 7
    .line 8
    iget-object v0, p0, Lo0/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 11
    .line 12
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lo0/b;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lq0/a;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v0, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 47
    :goto_1
    return p1

    .line 48
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v1, 0x0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v2, p0, Lo0/b;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lr0/d;

    .line 68
    .line 69
    iget-object v2, v2, Lr0/d;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Lo0/b;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Class;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v2, "getParameterTypes(...)"

    .line 88
    .line 89
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    array-length v2, p1

    .line 93
    move v3, v1

    .line 94
    :goto_2
    if-ge v3, v2, :cond_4

    .line 95
    .line 96
    aget-object v4, p1, v3

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    :goto_3
    const/4 v1, 0x1

    .line 109
    :cond_4
    return v1

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lo0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo0/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz0/b;

    .line 9
    .line 10
    iget-object v0, v0, Lz0/b;->i:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lo0/b;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ls0/J;

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getContext(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lr0/n1;

    .line 26
    .line 27
    const/16 v3, 0xc

    .line 28
    .line 29
    invoke-direct {v2, v3}, Lr0/n1;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0, v2}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    const-string v0, "\u4e0b\u8f7d\u94fe\u63a5\u6253\u5f00\u5931\u8d25"

    .line 37
    .line 38
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object v0, LE0/i;->a:LE0/i;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lo0/b;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lr0/H0;

    .line 47
    .line 48
    iget-object v1, p0, Lo0/b;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x1

    .line 60
    const/16 v4, 0xbf4

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    iget-object v2, v0, Lr0/H0;->W:LA0/j;

    .line 66
    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    :cond_0
    move v0, v5

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    sget v0, Lz0/r;->e:I

    .line 72
    .line 73
    const/4 v6, -0x1

    .line 74
    if-ne v0, v6, :cond_2

    .line 75
    .line 76
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v0, v7, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v6, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catch_1
    move-exception v0

    .line 100
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_1
    sput v6, Lz0/r;->e:I

    .line 108
    .line 109
    :cond_2
    sget v0, Lz0/r;->e:I

    .line 110
    .line 111
    if-ge v0, v4, :cond_3

    .line 112
    .line 113
    iget-object v0, v2, LA0/j;->a:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    xor-int/2addr v0, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    iget-object v0, v2, LA0/j;->a:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_0

    .line 128
    .line 129
    iget-object v0, v2, LA0/j;->b:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_0

    .line 136
    .line 137
    iget-object v0, v2, LA0/j;->c:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_0

    .line 144
    .line 145
    iget-object v0, v2, LA0/j;->e:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_0

    .line 152
    .line 153
    iget-object v0, v2, LA0/j;->g:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_0

    .line 160
    .line 161
    iget-object v0, v2, LA0/j;->i:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_0

    .line 168
    .line 169
    move v0, v3

    .line 170
    :goto_2
    if-nez v0, :cond_5

    .line 171
    .line 172
    invoke-static {v4}, Lz0/r;->r(I)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    invoke-static {v1}, LA0/l;->h(Landroid/content/Context;)LA0/M;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_4
    move v3, v5

    .line 186
    :cond_5
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, LE0/i;->a:LE0/i;

    .line 7
    .line 8
    iget-object v5, p0, Lo0/b;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lo0/b;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget v7, p0, Lo0/b;->a:I

    .line 13
    .line 14
    packed-switch v7, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    check-cast p1, LD0/c;

    .line 18
    .line 19
    const-string v0, "response"

    .line 20
    .line 21
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, LD0/c;->d:Ljava/lang/Throwable;

    .line 25
    .line 26
    check-cast v6, Lz0/p;

    .line 27
    .line 28
    if-nez v0, :cond_7

    .line 29
    .line 30
    iget v0, p1, LD0/c;->a:I

    .line 31
    .line 32
    const/16 v1, 0xc8

    .line 33
    .line 34
    if-gt v1, v0, :cond_7

    .line 35
    .line 36
    const/16 v1, 0x12c

    .line 37
    .line 38
    if-ge v0, v1, :cond_7

    .line 39
    .line 40
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, p1, LD0/c;->c:[B

    .line 45
    .line 46
    sget-object v1, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 47
    .line 48
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, LF0/s;->a:LF0/s;

    .line 52
    .line 53
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v2, "times"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-static {v2}, Lz0/q;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-string v2, "results"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-static {v1}, Lz0/q;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    move-object v1, p1

    .line 99
    goto :goto_1

    .line 100
    :goto_0
    new-instance v2, LE0/d;

    .line 101
    .line 102
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    move-object v1, v2

    .line 106
    :goto_1
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-nez v2, :cond_2

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_2
    :try_start_1
    invoke-static {v0}, Lz0/q;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    goto :goto_2

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    new-instance v1, LE0/d;

    .line 120
    .line 121
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object v0, v1

    .line 125
    :goto_2
    nop

    .line 126
    instance-of v1, v0, LE0/d;

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move-object p1, v0

    .line 132
    :goto_3
    move-object v1, p1

    .line 133
    check-cast v1, Ljava/util/List;

    .line 134
    .line 135
    :goto_4
    check-cast v1, Ljava/util/List;

    .line 136
    .line 137
    new-instance p1, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :cond_4
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    move-object v2, v1

    .line 157
    check-cast v2, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_4

    .line 164
    .line 165
    iget-object v3, v6, Lz0/p;->e:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-nez v2, :cond_4

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_6

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_6
    invoke-static {p1}, LF0/k;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Ljava/lang/String;

    .line 189
    .line 190
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 191
    .line 192
    new-instance v1, LA0/r;

    .line 193
    .line 194
    check-cast v5, Landroid/content/Context;

    .line 195
    .line 196
    const/16 v2, 0x10

    .line 197
    .line 198
    invoke-direct {v1, v5, v6, p1, v2}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_7
    iget-object v0, v6, Lz0/p;->b:Ljava/lang/String;

    .line 206
    .line 207
    iget v1, p1, LD0/c;->a:I

    .line 208
    .line 209
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object p1, p1, LD0/c;->d:Ljava/lang/Throwable;

    .line 214
    .line 215
    const-string v2, "read trace poll fail"

    .line 216
    .line 217
    filled-new-array {v2, v0, v1, p1}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :goto_6
    return-object v4

    .line 225
    :pswitch_1
    check-cast p1, Lz0/b;

    .line 226
    .line 227
    const-string v0, "result"

    .line 228
    .line 229
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    check-cast v6, Lx0/b;

    .line 233
    .line 234
    check-cast v5, Lcom/lu/wxmask/ui/MainActivity;

    .line 235
    .line 236
    iget-boolean v0, p1, Lz0/b;->a:Z

    .line 237
    .line 238
    if-nez v0, :cond_8

    .line 239
    .line 240
    invoke-virtual {v6, v5, p1}, Lx0/b;->c(Landroid/content/Context;Lz0/b;)V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_8
    invoke-virtual {p1}, Lz0/b;->b()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_a

    .line 249
    .line 250
    iget-boolean v0, p1, Lz0/b;->g:Z

    .line 251
    .line 252
    if-nez v0, :cond_9

    .line 253
    .line 254
    sget-object v7, Lz0/d;->a:Lz0/c;

    .line 255
    .line 256
    const/4 v7, 0x4

    .line 257
    const-string v8, "app"

    .line 258
    .line 259
    const-string v9, "getSharedPreferences(...)"

    .line 260
    .line 261
    invoke-static {v8, v7, v9}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    const-string v9, "startReloadIfChangedUnexpectedly"

    .line 270
    .line 271
    invoke-virtual {v8, v9, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v8, v7, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 279
    .line 280
    .line 281
    :catchall_2
    const-string v3, "check_app_update_on_enter"

    .line 282
    .line 283
    invoke-interface {v7, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-eqz v3, :cond_a

    .line 288
    .line 289
    :cond_9
    xor-int/2addr v0, v1

    .line 290
    invoke-virtual {v6, v5, p1, v0}, Lx0/b;->d(Landroid/content/Context;Lz0/b;Z)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_a
    iput-boolean v2, v6, Lx0/b;->d:Z

    .line 295
    .line 296
    :goto_7
    return-object v4

    .line 297
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    check-cast v6, Ls0/J;

    .line 304
    .line 305
    iget-object v0, v6, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 306
    .line 307
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideSelfSnsPosts(Z)V

    .line 308
    .line 309
    .line 310
    sget-boolean v1, Lz0/i;->a:Z

    .line 311
    .line 312
    invoke-static {v0}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 313
    .line 314
    .line 315
    if-eqz p1, :cond_b

    .line 316
    .line 317
    check-cast v5, Landroid/widget/FrameLayout;

    .line 318
    .line 319
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    const-string v0, "getContext(...)"

    .line 324
    .line 325
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-static {p1}, LA0/l;->m(Landroid/content/Context;)LA0/W;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    if-nez p1, :cond_b

    .line 333
    .line 334
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const-string p1, "unified_dexkit_scan_status_v16"

    .line 342
    .line 343
    invoke-static {p1, v2}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 344
    .line 345
    .line 346
    :cond_b
    return-object v4

    .line 347
    :pswitch_3
    check-cast p1, Landroid/widget/TextView;

    .line 348
    .line 349
    const-string v7, "textView"

    .line 350
    .line 351
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    if-eqz v7, :cond_c

    .line 359
    .line 360
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    :cond_c
    if-nez v3, :cond_d

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_d
    move-object v0, v3

    .line 368
    :goto_8
    check-cast v6, Lr0/l1;

    .line 369
    .line 370
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    const-string v7, "\u6587\u4ef6\u5927\u5c0f"

    .line 382
    .line 383
    invoke-static {v3, v7, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-nez v2, :cond_11

    .line 388
    .line 389
    const-string v2, "file size"

    .line 390
    .line 391
    invoke-static {v3, v2, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-eqz v2, :cond_e

    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_e
    invoke-virtual {v6}, Lr0/l1;->r()Ljava/util/Set;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_f

    .line 407
    .line 408
    goto :goto_a

    .line 409
    :cond_f
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    :cond_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-eqz v3, :cond_12

    .line 418
    .line 419
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    check-cast v3, Ljava/lang/String;

    .line 424
    .line 425
    invoke-static {v0, v3, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    if-eqz v3, :cond_10

    .line 430
    .line 431
    :cond_11
    :goto_9
    check-cast v5, Landroid/view/View;

    .line 432
    .line 433
    invoke-static {p1, v5}, Lr0/l1;->m(Landroid/widget/TextView;Landroid/view/View;)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-virtual {v6, p1}, Lr0/l1;->t(Landroid/view/View;)V

    .line 438
    .line 439
    .line 440
    :cond_12
    :goto_a
    return-object v4

    .line 441
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 442
    .line 443
    check-cast v5, Ljava/lang/String;

    .line 444
    .line 445
    check-cast v6, Lr0/H0;

    .line 446
    .line 447
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-static {p1, v5}, Lr0/H0;->P0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    return-object p1

    .line 459
    :pswitch_5
    if-eqz p1, :cond_13

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    goto :goto_b

    .line 470
    :cond_13
    move-object v1, v3

    .line 471
    :goto_b
    if-nez v1, :cond_14

    .line 472
    .line 473
    move-object v1, v0

    .line 474
    :cond_14
    check-cast v6, Lr0/d0;

    .line 475
    .line 476
    invoke-virtual {v6, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_15

    .line 481
    .line 482
    invoke-static {p1}, Lr0/d0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    goto :goto_c

    .line 487
    :cond_15
    move-object v2, v3

    .line 488
    :goto_c
    if-nez v2, :cond_16

    .line 489
    .line 490
    move-object v2, v0

    .line 491
    :cond_16
    invoke-virtual {v6, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    if-eqz v4, :cond_17

    .line 496
    .line 497
    invoke-virtual {v6, p1}, Lr0/d0;->Q(Ljava/lang/Object;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    goto :goto_d

    .line 502
    :cond_17
    invoke-static {p1}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-eqz v4, :cond_18

    .line 507
    .line 508
    invoke-static {p1}, Lr0/d0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    :cond_18
    if-nez v3, :cond_19

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_19
    move-object v0, v3

    .line 516
    :goto_d
    check-cast v5, Ljava/util/Set;

    .line 517
    .line 518
    invoke-virtual {v6, p1, v5}, Lr0/d0;->y0(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    new-instance v3, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    const-string v4, "class="

    .line 525
    .line 526
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    const-string v1, ",user="

    .line 533
    .line 534
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    const-string v0, ",unique="

    .line 541
    .line 542
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    const-string v0, ",hidden="

    .line 549
    .line 550
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    return-object p1

    .line 561
    :pswitch_6
    check-cast p1, LD0/c;

    .line 562
    .line 563
    check-cast v6, Ljava/io/File;

    .line 564
    .line 565
    check-cast v5, Ljava/lang/String;

    .line 566
    .line 567
    invoke-static {v6, v5, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->c(Ljava/io/File;Ljava/lang/String;LD0/c;)LE0/i;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    return-object p1

    .line 572
    nop

    .line 573
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
