.class public final Lr0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Ljava/lang/ref/WeakReference;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/ref/WeakReference;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/ref/WeakReference;

.field public k:Ljava/lang/String;

.field public l:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr0/w;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 11
    .line 12
    add-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    iput v0, p0, Lr0/w;->b:I

    .line 15
    .line 16
    add-int/lit8 v0, p1, 0x2

    .line 17
    .line 18
    iput v0, p0, Lr0/w;->c:I

    .line 19
    .line 20
    add-int/lit8 v0, p1, 0x3

    .line 21
    .line 22
    iput v0, p0, Lr0/w;->d:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x4

    .line 25
    .line 26
    iput p1, p0, Lr0/w;->e:I

    .line 27
    .line 28
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "getActivity"

    .line 5
    .line 6
    invoke-static {p2, v2, v1}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    instance-of v1, p2, Landroid/app/Activity;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p2, Landroid/app/Activity;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p2, v2

    .line 19
    :goto_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    :goto_1
    return-void

    .line 29
    :cond_2
    const-string v1, "background"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_9

    .line 36
    .line 37
    const-string v1, "background-refresh"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_3
    :try_start_0
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 48
    .line 49
    invoke-static {v1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    new-instance v3, LE0/d;

    .line 56
    .line 57
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object v1, v3

    .line 61
    :goto_2
    nop

    .line 62
    instance-of v3, v1, LE0/d;

    .line 63
    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move-object v2, v1

    .line 68
    :goto_3
    check-cast v2, Ljava/lang/Class;

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    new-instance v0, Landroid/content/Intent;

    .line 73
    .line 74
    invoke-direct {v0, p2, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 75
    .line 76
    .line 77
    const/high16 v1, 0x4000000

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    const/high16 v1, 0x20000000

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_5
    :try_start_1
    invoke-virtual {p2}, Landroid/app/Activity;->onBackPressed()V

    .line 95
    .line 96
    .line 97
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_1
    move-exception v1

    .line 101
    new-instance v2, LE0/d;

    .line 102
    .line 103
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    move-object v1, v2

    .line 107
    :goto_4
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 108
    .line 109
    instance-of v3, v1, LE0/d;

    .line 110
    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    move-object v1, v2

    .line 114
    :cond_6
    check-cast v1, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_8

    .line 121
    .line 122
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_8

    .line 127
    .line 128
    new-instance v1, Landroid/view/KeyEvent;

    .line 129
    .line 130
    const/4 v2, 0x4

    .line 131
    invoke-direct {v1, v0, v2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroid/view/KeyEvent;

    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    invoke-direct {v0, v3, v2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_7

    .line 145
    .line 146
    invoke-virtual {p2, v0}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_8

    .line 151
    .line 152
    :cond_7
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    .line 153
    .line 154
    .line 155
    :cond_8
    :goto_5
    const-string p2, "close hidden close friend chat"

    .line 156
    .line 157
    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_9
    :goto_6
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    .line 166
    .line 167
    .line 168
    const-string p2, "close hidden close friend chat silently"

    .line 169
    .line 170
    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public static e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getArguments"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    new-array v2, v2, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0, v1, v2}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v1, p0, Landroid/os/Bundle;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p0, v0

    .line 21
    goto :goto_1

    .line 22
    :goto_0
    new-instance v1, LE0/d;

    .line 23
    .line 24
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v1

    .line 28
    :goto_1
    nop

    .line 29
    instance-of v1, p0, LE0/d;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move-object p0, v0

    .line 34
    :cond_1
    check-cast p0, Landroid/os/Bundle;

    .line 35
    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    const-string v0, "Chat_User"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static k(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "getAdapter"

    .line 7
    .line 8
    invoke-static {p0, v1}, Lr0/w;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const-string v2, "getListView"

    .line 16
    .line 17
    invoke-static {p0, v2}, Lr0/w;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    const-string v2, "getRecyclerView"

    .line 25
    .line 26
    invoke-static {p0, v2}, Lr0/w;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lr0/w;->l(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v2, v1}, Lr0/w;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2}, Lr0/w;->l(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    :goto_0
    return v3

    .line 66
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v2, "getDeclaredFields(...)"

    .line 75
    .line 76
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    array-length v2, v0

    .line 80
    const/4 v4, 0x0

    .line 81
    move v5, v4

    .line 82
    :goto_1
    if-ge v5, v2, :cond_7

    .line 83
    .line 84
    aget-object v6, v0, v5

    .line 85
    .line 86
    :try_start_0
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-static {v6}, Lr0/w;->l(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-nez v7, :cond_4

    .line 98
    .line 99
    invoke-static {v6, v1}, Lr0/w;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v6}, Lr0/w;->l(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move v6, v4

    .line 111
    goto :goto_3

    .line 112
    :catchall_0
    move-exception v6

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    :goto_2
    move v6, v3

    .line 115
    :goto_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    goto :goto_5

    .line 120
    :goto_4
    new-instance v7, LE0/d;

    .line 121
    .line 122
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object v6, v7

    .line 126
    :goto_5
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    instance-of v8, v6, LE0/d;

    .line 129
    .line 130
    if-eqz v8, :cond_5

    .line 131
    .line 132
    move-object v6, v7

    .line 133
    :cond_5
    check-cast v6, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_7
    move v3, v4

    .line 146
    :goto_6
    return v3
.end method

.method public static l(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_4

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getMethods(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    array-length v2, v1

    .line 19
    move v3, v0

    .line 20
    :goto_0
    const-string v4, "getParameterTypes(...)"

    .line 21
    .line 22
    const-string v5, "notifyDataSetChanged"

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    if-ge v3, v2, :cond_2

    .line 26
    .line 27
    aget-object v7, v1, v3

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-static {v8, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v8, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    array-length v8, v8

    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v7, v6

    .line 54
    :goto_1
    if-nez v7, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "getDeclaredMethods(...)"

    .line 65
    .line 66
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    array-length v2, v1

    .line 70
    move v3, v0

    .line 71
    :goto_2
    if-ge v3, v2, :cond_4

    .line 72
    .line 73
    aget-object v7, v1, v3

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v8, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_3

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v8, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    array-length v8, v8

    .line 93
    if-nez v8, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move-object v7, v6

    .line 100
    :goto_3
    if-nez v7, :cond_5

    .line 101
    .line 102
    :goto_4
    return v0

    .line 103
    :cond_5
    const/4 v0, 0x1

    .line 104
    :try_start_0
    invoke-virtual {v7, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    new-instance v0, LE0/d;

    .line 115
    .line 116
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object p0, v0

    .line 120
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 121
    .line 122
    instance-of v1, p0, LE0/d;

    .line 123
    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    move-object p0, v0

    .line 127
    :cond_6
    check-cast p0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    return p0
.end method

.method public static o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_4

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getMethods(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    array-length v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    const-string v5, "getParameterTypes(...)"

    .line 22
    .line 23
    if-ge v4, v2, :cond_2

    .line 24
    .line 25
    aget-object v6, v1, v4

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v7, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v7, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    array-length v7, v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move-object v6, v0

    .line 52
    :goto_1
    if-nez v6, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "getDeclaredMethods(...)"

    .line 63
    .line 64
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    array-length v2, v1

    .line 68
    :goto_2
    if-ge v3, v2, :cond_4

    .line 69
    .line 70
    aget-object v4, v1, v3

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    array-length v6, v6

    .line 90
    if-nez v6, :cond_3

    .line 91
    .line 92
    move-object v6, v4

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    move-object v6, v0

    .line 98
    :goto_3
    if-nez v6, :cond_5

    .line 99
    .line 100
    :goto_4
    return-object v0

    .line 101
    :cond_5
    const/4 p1, 0x1

    .line 102
    :try_start_0
    invoke-virtual {v6, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    goto :goto_5

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    new-instance p1, LE0/d;

    .line 112
    .line 113
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object p0, p1

    .line 117
    :goto_5
    nop

    .line 118
    instance-of p1, p0, LE0/d;

    .line 119
    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    move-object v0, p0

    .line 124
    :goto_6
    return-object v0
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 7

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-static {p0}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object v0, Lz0/e;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "chatUser"

    .line 21
    .line 22
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v2, Lz0/e;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_4

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    sget-wide v5, Lz0/e;->b:J

    .line 61
    .line 62
    sub-long/2addr v3, v5

    .line 63
    const-wide/16 v5, 0x1f40

    .line 64
    .line 65
    cmp-long v0, v3, v5

    .line 66
    .line 67
    if-lez v0, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const/4 p0, 0x0

    .line 71
    sput-object p0, Lz0/e;->a:Ljava/lang/String;

    .line 72
    .line 73
    const-wide/16 v2, 0x0

    .line 74
    .line 75
    sput-wide v2, Lz0/e;->b:J

    .line 76
    .line 77
    return v1

    .line 78
    :cond_4
    :goto_0
    const-class v0, Lq0/h;

    .line 79
    .line 80
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lq0/h;

    .line 85
    .line 86
    invoke-static {}, Lz0/g;->s()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_5

    .line 91
    .line 92
    :goto_1
    return v1

    .line 93
    :cond_5
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    const-string p0, "chatUser is null or blank"

    .line 100
    .line 101
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return v1

    .line 109
    :cond_6
    iget-object v0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0
.end method


# virtual methods
.method public final a(Landroid/widget/EditText;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/w;->c:I

    .line 2
    .line 3
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lr0/w;->d:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lr0/w;->b:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {}, Lz0/r;->t()Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p3, LA0/r;

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-direct {p3, p1, p0, p2, v0}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v1, Lr0/v;

    .line 43
    .line 44
    invoke-direct {v1, p0, p1, p2}, Lr0/v;-><init>(Lr0/w;Landroid/widget/EditText;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "chat command watcher attached"

    .line 62
    .line 63
    filled-new-array {v1, p3, v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lz0/r;->t()Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-nez p3, :cond_2

    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :cond_2
    new-instance p3, LA0/r;

    .line 78
    .line 79
    const/4 v0, 0x4

    .line 80
    invoke-direct {p3, p1, p0, p2, v0}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    const-string v3, "getView"

    .line 9
    .line 10
    new-array v4, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v3, v4}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    instance-of v4, v3, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v3, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v3, v2

    .line 26
    goto :goto_1

    .line 27
    :goto_0
    new-instance v4, LE0/d;

    .line 28
    .line 29
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v3, v4

    .line 33
    :goto_1
    nop

    .line 34
    instance-of v4, v3, LE0/d;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move-object v3, v2

    .line 39
    :cond_1
    check-cast v3, Landroid/view/View;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    :try_start_1
    const-string v3, "getActivity"

    .line 47
    .line 48
    new-array v4, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {p1, v3, v4}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    instance-of v4, v3, Landroid/app/Activity;

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    check-cast v3, Landroid/app/Activity;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :catchall_1
    move-exception v3

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v3, v2

    .line 64
    goto :goto_3

    .line 65
    :goto_2
    new-instance v4, LE0/d;

    .line 66
    .line 67
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v3, v4

    .line 71
    :goto_3
    nop

    .line 72
    instance-of v4, v3, LE0/d;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    move-object v3, v2

    .line 77
    :cond_4
    check-cast v3, Landroid/app/Activity;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_5
    if-eqz v3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_6

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move-object v3, v2

    .line 116
    :goto_4
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 119
    .line 120
    .line 121
    instance-of v5, v3, Landroid/widget/EditText;

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_7

    .line 130
    .line 131
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Landroid/view/View;

    .line 149
    .line 150
    new-instance v5, Lq0/d;

    .line 151
    .line 152
    const/16 v6, 0x11

    .line 153
    .line 154
    invoke-direct {v5, v6}, Lq0/d;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v3, v5}, Lb1/h;->s(Landroid/view/View;Lx/b;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    :cond_9
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_8

    .line 170
    .line 171
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, Landroid/view/View;

    .line 176
    .line 177
    instance-of v6, v5, Landroid/widget/EditText;

    .line 178
    .line 179
    if-eqz v6, :cond_a

    .line 180
    .line 181
    check-cast v5, Landroid/widget/EditText;

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    move-object v5, v2

    .line 185
    :goto_6
    if-eqz v5, :cond_9

    .line 186
    .line 187
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_b
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_c

    .line 200
    .line 201
    const-string p1, "play chat command no visible edit text"

    .line 202
    .line 203
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return v1

    .line 211
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_d

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Landroid/widget/EditText;

    .line 226
    .line 227
    invoke-virtual {p0, v1, p1, p2}, Lr0/w;->a(Landroid/widget/EditText;Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_d
    const/4 p1, 0x1

    .line 232
    return p1
.end method

.method public final d(Ljava/lang/Object;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    const/4 v4, 0x0

    .line 18
    const-string v5, "getParameterTypes(...)"

    .line 19
    .line 20
    const-string v6, "getListView"

    .line 21
    .line 22
    if-ge v3, v1, :cond_1

    .line 23
    .line 24
    aget-object v7, v0, v3

    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-static {v8, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-static {v8, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    array-length v8, v8

    .line 44
    if-nez v8, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v7, v4

    .line 51
    :goto_1
    if-nez v7, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "getDeclaredMethods(...)"

    .line 62
    .line 63
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    array-length v1, v0

    .line 67
    :goto_2
    if-ge v2, v1, :cond_3

    .line 68
    .line 69
    aget-object v3, v0, v2

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-static {v7, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v7, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    array-length v7, v7

    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    move-object v7, v3

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v7, v4

    .line 97
    :goto_3
    if-nez v7, :cond_4

    .line 98
    .line 99
    move-object v0, v4

    .line 100
    goto :goto_6

    .line 101
    :cond_4
    const/4 v0, 0x1

    .line 102
    :try_start_0
    invoke-virtual {v7, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    instance-of v1, v0, Landroid/view/View;

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    check-cast v0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_4

    .line 118
    :cond_5
    move-object v0, v4

    .line 119
    goto :goto_5

    .line 120
    :goto_4
    new-instance v1, LE0/d;

    .line 121
    .line 122
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v1

    .line 126
    :goto_5
    nop

    .line 127
    instance-of v1, v0, LE0/d;

    .line 128
    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    move-object v0, v4

    .line 132
    :cond_6
    check-cast v0, Landroid/view/View;

    .line 133
    .line 134
    :goto_6
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 135
    .line 136
    if-nez v0, :cond_a

    .line 137
    .line 138
    :try_start_1
    invoke-static {}, Lz0/r;->p()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/16 v2, 0x99c

    .line 143
    .line 144
    if-ge v0, v2, :cond_7

    .line 145
    .line 146
    const-string v0, "b5n"

    .line 147
    .line 148
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    goto :goto_7

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto :goto_8

    .line 155
    :cond_7
    invoke-static {}, Lz0/r;->p()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/16 v2, 0x97d

    .line 160
    .line 161
    if-ne v0, v2, :cond_8

    .line 162
    .line 163
    const-string v0, "bnu"

    .line 164
    .line 165
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    goto :goto_7

    .line 170
    :cond_8
    const-string v0, "bm6"

    .line 171
    .line 172
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    :goto_7
    const-string v2, "findViewById"

    .line 177
    .line 178
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 187
    .line 188
    invoke-interface {v3, p1, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0, v1}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    check-cast v0, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :goto_8
    new-instance v2, LE0/d;

    .line 199
    .line 200
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    move-object v0, v2

    .line 204
    :goto_9
    nop

    .line 205
    instance-of v2, v0, LE0/d;

    .line 206
    .line 207
    if-eqz v2, :cond_9

    .line 208
    .line 209
    move-object v0, v4

    .line 210
    :cond_9
    check-cast v0, Landroid/view/View;

    .line 211
    .line 212
    :cond_a
    if-nez v0, :cond_d

    .line 213
    .line 214
    :try_start_2
    const-string v0, "com.tencent.mm.ui.chatting.view.MMChattingListView"

    .line 215
    .line 216
    iget-object v2, p0, Lr0/w;->a:Landroid/content/Context;

    .line 217
    .line 218
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 223
    .line 224
    invoke-interface {v3, v2, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-nez v0, :cond_b

    .line 229
    .line 230
    move-object p1, v4

    .line 231
    goto :goto_a

    .line 232
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 237
    .line 238
    invoke-interface {v3, v2, v0}, Ld0/a;->k(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1, v1}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    check-cast p1, Landroid/view/View;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :catchall_2
    move-exception p1

    .line 253
    new-instance v0, LE0/d;

    .line 254
    .line 255
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    move-object p1, v0

    .line 259
    :goto_a
    nop

    .line 260
    instance-of v0, p1, LE0/d;

    .line 261
    .line 262
    if-eqz v0, :cond_c

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_c
    move-object v4, p1

    .line 266
    :goto_b
    move-object v0, v4

    .line 267
    check-cast v0, Landroid/view/View;

    .line 268
    .line 269
    :cond_d
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 5

    .line 1
    const-string v0, "bkk"

    .line 2
    .line 3
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 16
    .line 17
    const-string v2, "findViewById"

    .line 18
    .line 19
    invoke-interface {v1, p1, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/view/View;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    new-instance v2, Lq0/d;

    .line 29
    .line 30
    const/16 v3, 0xf

    .line 31
    .line 32
    invoke-direct {v2, v3}, Lq0/d;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2}, Lb1/h;->s(Landroid/view/View;Lx/b;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    check-cast v0, Landroid/widget/EditText;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v0, v1

    .line 51
    :goto_0
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget-object v0, p0, Lr0/w;->a:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    new-array v2, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 65
    .line 66
    const-string v4, "getView"

    .line 67
    .line 68
    invoke-interface {v3, p1, v4, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/view/View;

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_1
    instance-of v2, v1, Landroid/widget/EditText;

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    check-cast v1, Landroid/widget/EditText;

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_2
    new-instance v1, Lq0/d;

    .line 88
    .line 89
    const/16 v2, 0x10

    .line 90
    .line 91
    invoke-direct {v1, v2}, Lq0/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v1}, Lb1/h;->s(Landroid/view/View;Lx/b;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Landroid/view/View;

    .line 103
    .line 104
    check-cast v1, Landroid/widget/EditText;

    .line 105
    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    return-object v1

    .line 114
    :cond_4
    return-object v0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 14

    .line 1
    const/4 v8, 0x1

    .line 2
    const/4 v9, 0x0

    .line 3
    new-array v0, v9, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "getArguments"

    .line 6
    .line 7
    invoke-static {p1, v1, v0}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "getActivity"

    .line 14
    .line 15
    new-array v3, v9, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p1, v1, v3}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "null cannot be cast to non-null type android.app.Activity"

    .line 22
    .line 23
    invoke-static {v1, v3}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Landroid/app/Activity;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const-string v0, "chattingUI\'s arguments is null"

    .line 31
    .line 32
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string v3, "Chat_User"

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_18

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto/16 :goto_d

    .line 55
    .line 56
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    iget-object v0, p0, Lr0/w;->j:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v0, v10

    .line 71
    :goto_0
    if-ne v0, p1, :cond_3

    .line 72
    .line 73
    move v0, v8

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v0, v9

    .line 76
    :goto_1
    iget-object v6, p0, Lr0/w;->k:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v6, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    const-wide/16 v11, 0x320

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    iget-wide v6, p0, Lr0/w;->l:J

    .line 89
    .line 90
    sub-long v6, v4, v6

    .line 91
    .line 92
    cmp-long v0, v6, v11

    .line 93
    .line 94
    if-gez v0, :cond_4

    .line 95
    .line 96
    move v0, v8

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v0, v9

    .line 99
    :goto_2
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 100
    .line 101
    invoke-direct {v6, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object v6, p0, Lr0/w;->j:Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    iput-object v3, p0, Lr0/w;->k:Ljava/lang/String;

    .line 107
    .line 108
    iput-wide v4, p0, Lr0/w;->l:J

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    goto/16 :goto_d

    .line 113
    .line 114
    :cond_5
    invoke-virtual {p0, p1, v3}, Lr0/w;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-class v0, Lq0/h;

    .line 118
    .line 119
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Lq0/h;

    .line 124
    .line 125
    sget-boolean v5, Lz0/i;->a:Z

    .line 126
    .line 127
    invoke-static {}, Lz0/g;->s()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const-string v6, "chatUser is null or blank"

    .line 132
    .line 133
    if-nez v5, :cond_6

    .line 134
    .line 135
    :goto_3
    move v4, v9

    .line 136
    goto :goto_4

    .line 137
    :cond_6
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_7

    .line 142
    .line 143
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    iget-object v4, v4, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    :goto_4
    if-eqz v4, :cond_8

    .line 158
    .line 159
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 160
    .line 161
    invoke-direct {v4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v4, p0, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 165
    .line 166
    iput-object v3, p0, Lr0/w;->i:Ljava/lang/String;

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    iput-object v10, p0, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 170
    .line 171
    iput-object v10, p0, Lr0/w;->i:Ljava/lang/String;

    .line 172
    .line 173
    :goto_5
    invoke-static {v3}, Lr0/w;->p(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_d

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 186
    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_9
    invoke-static {}, Lz0/g;->w()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_c

    .line 194
    .line 195
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lq0/h;

    .line 200
    .line 201
    invoke-static {}, Lz0/g;->s()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-nez v4, :cond_a

    .line 206
    .line 207
    :goto_6
    move v0, v9

    .line 208
    goto :goto_7

    .line 209
    :cond_a
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_b

    .line 214
    .line 215
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_b
    iget-object v0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 224
    .line 225
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    :goto_7
    if-eqz v0, :cond_c

    .line 230
    .line 231
    invoke-virtual {p0, p1, v1, v3, v8}, Lr0/w;->i(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_c
    invoke-virtual/range {p0 .. p1}, Lr0/w;->q(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_d
    :goto_8
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 239
    .line 240
    iget-object v0, p0, Lr0/w;->a:Landroid/content/Context;

    .line 241
    .line 242
    invoke-static {v0, v3}, Lz0/q;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lz0/g;->s()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    const-string v13, "getView"

    .line 250
    .line 251
    if-eqz v0, :cond_16

    .line 252
    .line 253
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getEnableChattingKey()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_16

    .line 262
    .line 263
    invoke-static {}, Lz0/r;->t()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_14

    .line 268
    .line 269
    invoke-virtual {p0, p1, v3}, Lr0/w;->b(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_e

    .line 274
    .line 275
    goto/16 :goto_c

    .line 276
    .line 277
    :cond_e
    :try_start_0
    new-array v0, v9, [Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {p1, v13, v0}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    instance-of v1, v0, Landroid/view/View;

    .line 284
    .line 285
    if-eqz v1, :cond_f

    .line 286
    .line 287
    check-cast v0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :catchall_0
    move-exception v0

    .line 291
    goto :goto_9

    .line 292
    :cond_f
    move-object v0, v10

    .line 293
    goto :goto_a

    .line 294
    :goto_9
    new-instance v1, LE0/d;

    .line 295
    .line 296
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    move-object v0, v1

    .line 300
    :goto_a
    nop

    .line 301
    instance-of v1, v0, LE0/d;

    .line 302
    .line 303
    if-eqz v1, :cond_10

    .line 304
    .line 305
    move-object v0, v10

    .line 306
    :cond_10
    move-object v4, v0

    .line 307
    check-cast v4, Landroid/view/View;

    .line 308
    .line 309
    if-nez v4, :cond_11

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_11
    iget v0, p0, Lr0/w;->e:I

    .line 313
    .line 314
    invoke-virtual {v4, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-static {v1, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_12

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_12
    invoke-virtual {v4, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    const-wide/16 v0, 0x78

    .line 331
    .line 332
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-wide/16 v5, 0x168

    .line 337
    .line 338
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    const-wide/16 v6, 0x5dc

    .line 347
    .line 348
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    filled-new-array {v0, v1, v5, v6}, [Ljava/lang/Long;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    move v7, v9

    .line 365
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_16

    .line 370
    .line 371
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    add-int/lit8 v12, v7, 0x1

    .line 376
    .line 377
    if-ltz v7, :cond_13

    .line 378
    .line 379
    check-cast v0, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v5

    .line 385
    new-instance v0, Lr0/t;

    .line 386
    .line 387
    move-object v1, p0

    .line 388
    move-object v2, p1

    .line 389
    invoke-direct/range {v0 .. v7}, Lr0/t;-><init>(Lr0/w;Ljava/lang/Object;Ljava/lang/String;Landroid/view/View;JI)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 393
    .line 394
    .line 395
    move v7, v12

    .line 396
    goto :goto_b

    .line 397
    :cond_13
    invoke-static {}, LF0/l;->b0()V

    .line 398
    .line 399
    .line 400
    throw v10

    .line 401
    :cond_14
    invoke-virtual/range {p0 .. p1}, Lr0/w;->f(Ljava/lang/Object;)Landroid/widget/EditText;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-nez v0, :cond_15

    .line 406
    .line 407
    goto :goto_c

    .line 408
    :cond_15
    invoke-virtual {p0, v0, p1, v3}, Lr0/w;->a(Landroid/widget/EditText;Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :cond_16
    :goto_c
    const-class v0, Lq0/f;

    .line 412
    .line 413
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, Lq0/f;

    .line 418
    .line 419
    iget-boolean v3, v0, Lq0/f;->a:Z

    .line 420
    .line 421
    if-nez v3, :cond_17

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_17
    const-string v3, "start config ui"

    .line 425
    .line 426
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    invoke-static {v3}, Li0/a;->c([Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    new-array v3, v9, [Ljava/lang/Object;

    .line 434
    .line 435
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 436
    .line 437
    invoke-interface {v4, p1, v13, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Landroid/view/View;

    .line 442
    .line 443
    new-instance v4, LA0/m;

    .line 444
    .line 445
    const/4 v5, 0x4

    .line 446
    invoke-direct {v4, v0, p1, v5}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 450
    .line 451
    .line 452
    :cond_18
    :goto_d
    return-void
.end method

.method public final h(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    :cond_0
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, v1, Lr0/w;->c:I

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    move-object/from16 v3, p3

    .line 30
    .line 31
    :cond_1
    invoke-static {v3}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x0

    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    iget v4, v1, Lr0/w;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    instance-of v4, v0, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    move-object v4, v0

    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    :cond_2
    move-object v7, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object v7, v5

    .line 54
    :goto_0
    const/4 v4, 0x0

    .line 55
    :try_start_0
    const-string v0, "getActivity"

    .line 56
    .line 57
    new-array v6, v4, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {v3, v0, v6}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v6, "null cannot be cast to non-null type android.app.Activity"

    .line 64
    .line 65
    invoke-static {v0, v6}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    new-instance v6, LE0/d;

    .line 73
    .line 74
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v6

    .line 78
    :goto_1
    nop

    .line 79
    instance-of v6, v0, LE0/d;

    .line 80
    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    move-object v0, v5

    .line 84
    :cond_4
    check-cast v0, Landroid/app/Activity;

    .line 85
    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    goto/16 :goto_b

    .line 89
    .line 90
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    const-class v15, Lq0/h;

    .line 95
    .line 96
    const/16 v16, 0x1

    .line 97
    .line 98
    sparse-switch v6, :sswitch_data_0

    .line 99
    .line 100
    .line 101
    goto/16 :goto_b

    .line 102
    .line 103
    :sswitch_0
    const-string v0, "#show"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_6

    .line 110
    .line 111
    goto/16 :goto_b

    .line 112
    .line 113
    :cond_6
    invoke-virtual {v1, v3}, Lr0/w;->q(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-interface/range {p2 .. p2}, Landroid/text/Editable;->clear()V

    .line 117
    .line 118
    .line 119
    return v16

    .line 120
    :sswitch_1
    const-string v0, "#hide"

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_7

    .line 127
    .line 128
    goto/16 :goto_b

    .line 129
    .line 130
    :cond_7
    invoke-virtual {v1, v3}, Lr0/w;->d(Ljava/lang/Object;)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    const/4 v2, 0x4

    .line 137
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    :cond_8
    invoke-interface/range {p2 .. p2}, Landroid/text/Editable;->clear()V

    .line 141
    .line 142
    .line 143
    return v16

    .line 144
    :sswitch_2
    const-string v6, "#del"

    .line 145
    .line 146
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_9

    .line 151
    .line 152
    goto/16 :goto_b

    .line 153
    .line 154
    :cond_9
    if-nez v7, :cond_a

    .line 155
    .line 156
    goto/16 :goto_b

    .line 157
    .line 158
    :cond_a
    sget-boolean v2, Lz0/i;->a:Z

    .line 159
    .line 160
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_c

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    move-object v8, v6

    .line 179
    check-cast v8, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-static {v8, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_b

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_c
    move-object v6, v5

    .line 193
    :goto_2
    check-cast v6, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 194
    .line 195
    if-eqz v6, :cond_e

    .line 196
    .line 197
    invoke-virtual {v6}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-eqz v2, :cond_e

    .line 202
    .line 203
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-nez v6, :cond_d

    .line 208
    .line 209
    move-object v5, v2

    .line 210
    :cond_d
    if-eqz v5, :cond_e

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_e
    move-object v5, v7

    .line 214
    :goto_3
    sget-boolean v2, Lz0/i;->a:Z

    .line 215
    .line 216
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    const-string v8, "iterator(...)"

    .line 225
    .line 226
    invoke-static {v6, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    move v8, v4

    .line 230
    :cond_f
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-eqz v9, :cond_10

    .line 235
    .line 236
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    const-string v10, "next(...)"

    .line 241
    .line 242
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    check-cast v9, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 246
    .line 247
    invoke-virtual {v9}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_f

    .line 256
    .line 257
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 258
    .line 259
    .line 260
    move/from16 v8, v16

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_10
    if-nez v8, :cond_11

    .line 264
    .line 265
    const-string v2, "remove mask item skipped"

    .line 266
    .line 267
    filled-new-array {v2, v7}, [Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_11
    invoke-static {v2}, Lz0/g;->N(Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    move/from16 v4, v16

    .line 279
    .line 280
    :goto_5
    if-eqz v4, :cond_12

    .line 281
    .line 282
    sget-boolean v2, Lz0/i;->a:Z

    .line 283
    .line 284
    invoke-static {v7}, Lz0/g;->K(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_12
    invoke-static {v15}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Lq0/h;

    .line 292
    .line 293
    invoke-virtual {v2}, Lq0/h;->c()V

    .line 294
    .line 295
    .line 296
    invoke-static {v15}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Lq0/h;

    .line 301
    .line 302
    invoke-virtual {v2}, Lq0/h;->a()V

    .line 303
    .line 304
    .line 305
    new-instance v2, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v6, "removed="

    .line 308
    .line 309
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v6, "chat command del mask"

    .line 320
    .line 321
    filled-new-array {v6, v7, v2}, [Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v3}, Lr0/w;->q(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    if-eqz v4, :cond_13

    .line 332
    .line 333
    const-string v2, "\u5df2\u79fb\u9664\u9690\u85cf\u540d\u5355\uff1a"

    .line 334
    .line 335
    :goto_6
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    goto :goto_7

    .line 340
    :cond_13
    const-string v2, "\u672a\u5728\u9690\u85cf\u540d\u5355\u4e2d\uff1a"

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :goto_7
    invoke-static {v0, v2}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-interface/range {p2 .. p2}, Landroid/text/Editable;->clear()V

    .line 347
    .line 348
    .line 349
    return v16

    .line 350
    :sswitch_3
    const-string v3, "#add"

    .line 351
    .line 352
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_1b

    .line 357
    .line 358
    if-nez v7, :cond_14

    .line 359
    .line 360
    goto/16 :goto_b

    .line 361
    .line 362
    :cond_14
    sget-boolean v2, Lz0/i;->a:Z

    .line 363
    .line 364
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-eqz v3, :cond_15

    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_15
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    :cond_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_17

    .line 384
    .line 385
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    check-cast v3, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 390
    .line 391
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-static {v3, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_16

    .line 400
    .line 401
    move/from16 v4, v16

    .line 402
    .line 403
    :cond_17
    :goto_8
    if-nez v4, :cond_18

    .line 404
    .line 405
    sget-boolean v2, Lz0/i;->a:Z

    .line 406
    .line 407
    new-instance v6, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 408
    .line 409
    const/4 v11, 0x0

    .line 410
    const/4 v12, 0x0

    .line 411
    const/4 v8, 0x0

    .line 412
    const/4 v9, 0x0

    .line 413
    const/4 v10, 0x0

    .line 414
    const/16 v13, 0x3e

    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    invoke-direct/range {v6 .. v14}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v6}, Lz0/g;->b(Lcom/lu/wxmask/bean/MaskItemBean;)V

    .line 421
    .line 422
    .line 423
    invoke-static {v7}, Lz0/g;->K(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v15}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    check-cast v2, Lq0/h;

    .line 431
    .line 432
    invoke-virtual {v2}, Lq0/h;->c()V

    .line 433
    .line 434
    .line 435
    invoke-static {v15}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, Lq0/h;

    .line 440
    .line 441
    invoke-virtual {v2}, Lq0/h;->a()V

    .line 442
    .line 443
    .line 444
    const-string v2, "chat command add mask"

    .line 445
    .line 446
    filled-new-array {v2, v7}, [Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_18
    if-eqz v4, :cond_19

    .line 454
    .line 455
    const-string v2, "\u5df2\u5728\u9690\u85cf\u540d\u5355\u4e2d\uff1a"

    .line 456
    .line 457
    :goto_9
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    goto :goto_a

    .line 462
    :cond_19
    const-string v2, "\u5df2\u52a0\u5165\u9690\u85cf\u540d\u5355\uff1a"

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :goto_a
    invoke-static {v0, v2}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-interface/range {p2 .. p2}, Landroid/text/Editable;->clear()V

    .line 469
    .line 470
    .line 471
    return v16

    .line 472
    :sswitch_4
    const-string v3, "#copyId"

    .line 473
    .line 474
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-nez v2, :cond_1a

    .line 479
    .line 480
    goto :goto_b

    .line 481
    :cond_1a
    if-nez v7, :cond_1c

    .line 482
    .line 483
    :cond_1b
    :goto_b
    return v4

    .line 484
    :cond_1c
    invoke-static {v7}, Lz0/r;->f(Ljava/lang/CharSequence;)Z

    .line 485
    .line 486
    .line 487
    const-string v2, "\u5df2\u590d\u5236wxid:"

    .line 488
    .line 489
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-static {v0, v2}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-interface/range {p2 .. p2}, Landroid/text/Editable;->clear()V

    .line 497
    .line 498
    .line 499
    return v16

    .line 500
    nop

    .line 501
    :sswitch_data_0
    .sparse-switch
        -0x154536ad -> :sswitch_4
        0x11619e -> :sswitch_3
        0x116d08 -> :sswitch_2
        0x21e13e5 -> :sswitch_1
        0x22311a0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final i(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lr0/w;->d(Ljava/lang/Object;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of v2, p1, Landroid/view/View;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    check-cast p1, Landroid/view/View;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object p1, v1

    .line 34
    :goto_0
    new-instance v2, Lq0/d;

    .line 35
    .line 36
    const/16 v3, 0x12

    .line 37
    .line 38
    invoke-direct {v2, v3}, Lq0/d;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideDurationMs()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/16 v4, 0x12c

    .line 50
    .line 51
    const/16 v5, 0x1388

    .line 52
    .line 53
    invoke-static {v3, v4, v5}, LD/h;->g(III)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    new-instance v4, Lm0/h;

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    invoke-direct {v4, v5, v0}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v2, v3, v4}, Lz0/r;->A(Landroid/view/View;LM0/a;ILandroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_2
    invoke-static {}, Lz0/g;->w()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_3
    const/4 v0, 0x0

    .line 77
    new-array v2, v0, [Ljava/lang/Object;

    .line 78
    .line 79
    const-string v3, "getView"

    .line 80
    .line 81
    invoke-static {p1, v3, v2}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    instance-of v2, p1, Landroid/view/ViewGroup;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    check-cast p1, Landroid/view/ViewGroup;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object p1, v1

    .line 93
    :goto_1
    if-eqz p1, :cond_7

    .line 94
    .line 95
    sget v2, Lz0/r;->e:I

    .line 96
    .line 97
    const/4 v3, -0x1

    .line 98
    if-ne v2, v3, :cond_5

    .line 99
    .line 100
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v2, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catch_0
    move-exception v0

    .line 124
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move v0, v3

    .line 132
    :goto_2
    sput v0, Lz0/r;->e:I

    .line 133
    .line 134
    :cond_5
    sget v0, Lz0/r;->e:I

    .line 135
    .line 136
    const/16 v2, 0x97d

    .line 137
    .line 138
    if-ne v0, v2, :cond_6

    .line 139
    .line 140
    const-string v0, "bm7"

    .line 141
    .line 142
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    const-string v0, "b49"

    .line 148
    .line 149
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    :goto_3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroid/view/ViewGroup;

    .line 158
    .line 159
    const-string v2, "chatting-onEnterBegin"

    .line 160
    .line 161
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-nez v4, :cond_7

    .line 166
    .line 167
    new-instance v4, Landroid/view/View;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {v4, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 180
    .line 181
    const v2, -0x121213

    .line 182
    .line 183
    .line 184
    invoke-direct {p1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 188
    .line 189
    .line 190
    const p1, 0x461c3c00    # 9999.0f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, p1}, Landroid/view/View;->setTranslationZ(F)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v4, v3, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 197
    .line 198
    .line 199
    :cond_7
    :goto_4
    if-nez p4, :cond_8

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    :try_start_1
    sget-boolean p1, Lz0/i;->a:Z

    .line 203
    .line 204
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result p4

    .line 216
    if-eqz p4, :cond_c

    .line 217
    .line 218
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p4

    .line 222
    move-object v0, p4

    .line 223
    check-cast v0, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v0, p3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_9

    .line 234
    .line 235
    check-cast p4, Lcom/lu/wxmask/bean/MaskItemBean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 236
    .line 237
    if-nez p2, :cond_a

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_a
    invoke-virtual {p4}, Lcom/lu/wxmask/bean/MaskItemBean;->getTipMode()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    const/16 p3, 0x2766

    .line 245
    .line 246
    if-eq p3, p1, :cond_b

    .line 247
    .line 248
    invoke-virtual {p4}, Lcom/lu/wxmask/bean/MaskItemBean;->getTipMode()I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-nez p1, :cond_b

    .line 253
    .line 254
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 255
    .line 256
    invoke-direct {p1, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    const-string p3, "\ufffd\ufffd\u02be"

    .line 260
    .line 261
    invoke-virtual {p1, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    iget p2, p2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 270
    .line 271
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    sget-object p2, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    .line 276
    .line 277
    invoke-virtual {p2, p4}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;->from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->getMess()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-string p2, "\u05aa\ufffd\ufffd\ufffd\ufffd"

    .line 290
    .line 291
    invoke-virtual {p1, p2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 296
    .line 297
    .line 298
    :cond_b
    :goto_5
    return-void

    .line 299
    :catch_1
    move-exception p1

    .line 300
    goto :goto_6

    .line 301
    :cond_c
    :try_start_2
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 302
    .line 303
    const-string p2, "Collection contains no element matching the predicate."

    .line 304
    .line 305
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 309
    :goto_6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-static {v0}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lr0/w;->i:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    const-class v2, Lq0/h;

    .line 24
    .line 25
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lq0/h;

    .line 30
    .line 31
    sget-boolean v3, Lz0/i;->a:Z

    .line 32
    .line 33
    invoke-static {}, Lz0/g;->s()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x0

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    :goto_0
    move v2, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    const-string v2, "chatUser is null or blank"

    .line 49
    .line 50
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object v2, v2, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    :goto_1
    const/4 v3, 0x0

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iput-object v3, p0, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    iput-object v3, p0, Lr0/w;->i:Ljava/lang/String;

    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    invoke-static {v1}, Lr0/w;->p(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-static {p1, v1, v0}, Lr0/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-static {}, Lz0/g;->w()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_6

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    invoke-virtual {p0, v0, v3, v1, v4}, Lr0/w;->i(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    const-string v0, "hide current masked chat"

    .line 93
    .line 94
    filled-new-array {v0, p1, v1}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    :goto_2
    return-void
.end method

.method public final m(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lr0/w;->k(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Lr0/w;->k(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    instance-of v1, p2, Landroid/view/View;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast p2, Landroid/view/View;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p2, 0x0

    .line 26
    :goto_0
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    iget-object p1, p0, Lr0/w;->g:Ljava/lang/String;

    .line 35
    .line 36
    const-string p2, "notified="

    .line 37
    .line 38
    invoke-static {p2, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string v0, "anti revoke refresh chat list"

    .line 43
    .line 44
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr0/w;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 12
    .line 13
    iget-object v0, p0, Lr0/w;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lz0/q;->g(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lz0/e;->a:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v0, LF0/u;->a:LF0/u;

    .line 21
    .line 22
    sput-object v0, Lz0/e;->c:Ljava/util/Set;

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lr0/w;->f:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    iput-object p2, p0, Lr0/w;->g:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lr0/w;->d(Ljava/lang/Object;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    if-nez p1, :cond_1

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->hasOnClickListeners()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string v0, "getListenerInfo"

    .line 34
    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 38
    .line 39
    invoke-interface {v3, p1, v0, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "mOnClickListener"

    .line 44
    .line 45
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 46
    .line 47
    invoke-interface {v3, v0, v2}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/view/View$OnClickListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    :catchall_0
    :cond_2
    nop

    .line 55
    instance-of v0, v1, Lz0/m;

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    check-cast v1, Lz0/m;

    .line 60
    .line 61
    iget-object v0, v1, Lz0/m;->b:Landroid/view/View$OnClickListener;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    new-array v0, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    const-string v2, "getView"

    .line 70
    .line 71
    invoke-static {p1, v2, v0}, Lb1/h;->E(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    check-cast p1, Landroid/view/ViewGroup;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move-object p1, v1

    .line 83
    :goto_1
    if-eqz p1, :cond_5

    .line 84
    .line 85
    const-string v0, "chatting-onEnterBegin"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    move-object p1, v1

    .line 93
    :goto_2
    if-eqz p1, :cond_7

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 100
    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    move-object v1, v0

    .line 104
    check-cast v1, Landroid/view/ViewGroup;

    .line 105
    .line 106
    :cond_6
    if-eqz v1, :cond_7

    .line 107
    .line 108
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_3
    return-void
.end method
