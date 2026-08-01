.class public final LA0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LA0/y;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LA0/y;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LA0/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(Landroid/app/Activity;Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object p1, LA0/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, LA0/u;

    .line 34
    .line 35
    iget-object v4, v3, LA0/u;->c:LM0/a;

    .line 36
    .line 37
    invoke-interface {v4}, LM0/a;->b()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    iget-object v3, v3, LA0/u;->d:LM0/a;

    .line 50
    .line 51
    invoke-interface {v3}, LM0/a;->b()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v2, "hook_point_cache"

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v2, "getSharedPreferences(...)"

    .line 87
    .line 88
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v2, "unified_dexkit_scan_status_v16"

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 101
    .line 102
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    new-instance v2, LE0/d;

    .line 108
    .line 109
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    instance-of v0, v2, LE0/d;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move-object v4, v2

    .line 118
    :goto_2
    check-cast v4, Lorg/json/JSONObject;

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    const-string v0, "versionCode"

    .line 123
    .line 124
    const/4 v2, -0x1

    .line 125
    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const-string v2, "versionName"

    .line 130
    .line 131
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const-string v5, "shown"

    .line 136
    .line 137
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_5

    .line 142
    .line 143
    invoke-static {}, Lz0/r;->p()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-ne v0, v5, :cond_5

    .line 148
    .line 149
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v2, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_5

    .line 158
    .line 159
    const-string v0, "packageFingerprint"

    .line 160
    .line 161
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {}, Lz0/r;->m()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    const-string p0, "\u7edf\u4e00\u626b\u63cf\u63d0\u793a\u5df2\u8df3\u8fc7\uff0c\u5df2\u663e\u793a\u8fc7"

    .line 176
    .line 177
    filled-new-array {p0, p2}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    const/4 p2, 0x1

    .line 186
    invoke-virtual {p1, v3, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_6

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-eqz p1, :cond_7

    .line 198
    .line 199
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-eqz p1, :cond_7

    .line 204
    .line 205
    new-instance p2, LA0/m;

    .line 206
    .line 207
    const/4 v0, 0x0

    .line 208
    invoke-direct {p2, p0, v1, v0}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_3
    return-void
.end method

.method public static b(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static c(Landroid/content/Context;LA0/u;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, LA0/u;

    .line 32
    .line 33
    iget-object v2, v2, LA0/u;->a:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, LA0/u;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :goto_1
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 48
    .line 49
    const-string v0, "unified-dexkit-scan-prompt"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const/4 v1, 0x1

    .line 56
    const/4 v2, 0x0

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v3, "getClassLoader(...)"

    .line 65
    .line 66
    invoke-static {p1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 70
    .line 71
    const-string v4, "com.tencent.mm.ui.LauncherUI"

    .line 72
    .line 73
    invoke-interface {v3, p1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    const-string p1, "unified dexkit launcher class missing"

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    sget-object v3, LA0/y;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    new-instance v3, LA0/x;

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-direct {v3, v4}, LA0/x;-><init>(I)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v4, "onResume"

    .line 113
    .line 114
    invoke-static {p1, v4, v3}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 123
    .line 124
    const-string v0, "unified-dexkit-scan-lifecycle-prompt"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    instance-of p1, p0, Landroid/app/Application;

    .line 138
    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    check-cast p0, Landroid/app/Application;

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    const/4 p0, 0x0

    .line 145
    :goto_3
    if-nez p0, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    sget-object p1, LA0/y;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 149
    .line 150
    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_9

    .line 155
    .line 156
    :goto_4
    return-void

    .line 157
    :cond_9
    new-instance p1, LA0/w;

    .line 158
    .line 159
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public static d(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    int-to-float p0, p1

    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
