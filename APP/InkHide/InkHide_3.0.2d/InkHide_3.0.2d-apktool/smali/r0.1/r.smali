.class public final Lr0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final b:[Ljava/lang/String;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "com.tencent.tinker.lib.service.TinkerPatchService$InnerService"

    .line 2
    .line 3
    const-string v1, "com.tencent.tinker.lib.service.DefaultTinkerResultService"

    .line 4
    .line 5
    const-string v2, "com.tencent.tinker.lib.service.TinkerPatchForeService"

    .line 6
    .line 7
    const-string v3, "com.tencent.tinker.lib.service.TinkerPatchService"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lr0/r;->b:[Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr0/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V
    .locals 7

    .line 1
    if-eqz p0, :cond_d

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-le p2, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "keySet(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_d

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    new-instance v3, LE0/d;

    .line 40
    .line 41
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_1
    nop

    .line 46
    instance-of v3, v2, LE0/d;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    :cond_2
    if-nez v2, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    instance-of v3, v2, Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    instance-of v3, v2, Landroid/os/Bundle;

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    check-cast v2, Landroid/os/Bundle;

    .line 71
    .line 72
    add-int/lit8 v1, p2, 0x1

    .line 73
    .line 74
    invoke-static {v2, p1, v1}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    instance-of v3, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz v3, :cond_8

    .line 81
    .line 82
    check-cast v2, [Ljava/lang/Object;

    .line 83
    .line 84
    array-length v1, v2

    .line 85
    const/4 v3, 0x0

    .line 86
    :goto_2
    if-ge v3, v1, :cond_1

    .line 87
    .line 88
    aget-object v4, v2, v3

    .line 89
    .line 90
    add-int/lit8 v5, p2, 0x1

    .line 91
    .line 92
    instance-of v6, v4, Ljava/lang/CharSequence;

    .line 93
    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {p1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    instance-of v6, v4, Landroid/os/Bundle;

    .line 105
    .line 106
    if-eqz v6, :cond_7

    .line 107
    .line 108
    check-cast v4, Landroid/os/Bundle;

    .line 109
    .line 110
    invoke-static {v4, p1, v5}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 111
    .line 112
    .line 113
    :cond_7
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    instance-of v3, v2, Ljava/lang/Iterable;

    .line 117
    .line 118
    if-eqz v3, :cond_b

    .line 119
    .line 120
    check-cast v2, Ljava/lang/Iterable;

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_1

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    add-int/lit8 v3, p2, 0x1

    .line 137
    .line 138
    instance-of v4, v2, Ljava/lang/CharSequence;

    .line 139
    .line 140
    if-eqz v4, :cond_a

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_a
    instance-of v4, v2, Landroid/os/Bundle;

    .line 151
    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    check-cast v2, Landroid/os/Bundle;

    .line 155
    .line 156
    invoke-static {v2, p1, v3}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_b
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    const-string v3, "user"

    .line 164
    .line 165
    const/4 v4, 0x1

    .line 166
    invoke-static {v1, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_c

    .line 171
    .line 172
    const-string v3, "talker"

    .line 173
    .line 174
    invoke-static {v1, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_c

    .line 179
    .line 180
    const-string v3, "title"

    .line 181
    .line 182
    invoke-static {v1, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_1

    .line 187
    .line 188
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_d
    :goto_5
    return-void
.end method

.method public static b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :try_start_0
    const-string v1, "getIntent"

    .line 6
    .line 7
    new-array v2, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 10
    .line 11
    invoke-interface {v3, p0, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v1, LE0/d;

    .line 20
    .line 21
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v1

    .line 25
    :goto_0
    nop

    .line 26
    instance-of v1, p0, LE0/d;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :cond_1
    check-cast p0, Landroid/content/Intent;

    .line 32
    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    :goto_1
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p1, v0}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static c(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v2, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lq0/d;

    .line 23
    .line 24
    const/16 v3, 0x17

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lq0/d;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0x1e

    .line 30
    .line 31
    const-string v4, ","

    .line 32
    .line 33
    invoke-static {p0, v4, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "#"

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, "("

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ")"

    .line 62
    .line 63
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method


# virtual methods
.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const-string v1, "getParameterTypes(...)"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "getName(...)"

    .line 6
    .line 7
    const-string v4, "getDeclaredMethods(...)"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, Lr0/r;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "classLoader"

    .line 24
    .line 25
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 29
    .line 30
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 31
    .line 32
    invoke-interface {v0, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    const-string v1, "onKeyDown"

    .line 39
    .line 40
    const-string v2, "dispatchKeyEvent"

    .line 41
    .line 42
    const-class v3, Landroid/view/KeyEvent;

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    :try_start_0
    new-instance v4, LA0/x;

    .line 49
    .line 50
    const/16 v5, 0xa

    .line 51
    .line 52
    invoke-direct {v4, v5}, LA0/x;-><init>(I)V

    .line 53
    .line 54
    .line 55
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 60
    .line 61
    invoke-interface {v5, p1, v2, v4}, Ld0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 62
    .line 63
    .line 64
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v4

    .line 67
    new-instance v5, LE0/d;

    .line 68
    .line 69
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object v4, v5

    .line 73
    :goto_0
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    const-string v5, "AttachUI hook LauncherUI dispatchKeyEvent fail"

    .line 80
    .line 81
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    :try_start_1
    new-instance v4, LA0/x;

    .line 89
    .line 90
    const/16 v5, 0xb

    .line 91
    .line 92
    invoke-direct {v4, v5}, LA0/x;-><init>(I)V

    .line 93
    .line 94
    .line 95
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 100
    .line 101
    invoke-interface {v5, p1, v1, v4}, Ld0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 102
    .line 103
    .line 104
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    goto :goto_1

    .line 106
    :catchall_1
    move-exception v4

    .line 107
    new-instance v5, LE0/d;

    .line 108
    .line 109
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v4, v5

    .line 113
    :goto_1
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-eqz v4, :cond_2

    .line 118
    .line 119
    const-string v5, "AttachUI hook LauncherUI onKeyDown fail"

    .line 120
    .line 121
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    :try_start_2
    const-string v4, "onBackPressed"

    .line 129
    .line 130
    new-instance v5, LA0/x;

    .line 131
    .line 132
    const/16 v6, 0xc

    .line 133
    .line 134
    invoke-direct {v5, v6}, LA0/x;-><init>(I)V

    .line 135
    .line 136
    .line 137
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 142
    .line 143
    invoke-interface {v6, p1, v4, v5}, Ld0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 147
    goto :goto_2

    .line 148
    :catchall_2
    move-exception p1

    .line 149
    new-instance v4, LE0/d;

    .line 150
    .line 151
    invoke-direct {v4, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object p1, v4

    .line 155
    :goto_2
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-eqz p1, :cond_3

    .line 160
    .line 161
    const-string v4, "AttachUI hook LauncherUI onBackPressed fail"

    .line 162
    .line 163
    filled-new-array {v4, p1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_3
    :goto_3
    new-instance p1, LA0/x;

    .line 171
    .line 172
    const/16 v4, 0x8

    .line 173
    .line 174
    invoke-direct {p1, v4}, LA0/x;-><init>(I)V

    .line 175
    .line 176
    .line 177
    filled-new-array {v0, v3, p1}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const-class v0, Landroid/app/Activity;

    .line 182
    .line 183
    invoke-static {v0, v1, p1}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance p1, LA0/x;

    .line 187
    .line 188
    const/16 v1, 0x9

    .line 189
    .line 190
    invoke-direct {p1, v1}, LA0/x;-><init>(I)V

    .line 191
    .line 192
    .line 193
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {v0, v2, p1}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 212
    .line 213
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro"

    .line 214
    .line 215
    invoke-interface {p2, p1, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    new-instance p2, LA0/x;

    .line 220
    .line 221
    const/4 v0, 0x7

    .line 222
    invoke-direct {p2, v0}, LA0/x;-><init>(I)V

    .line 223
    .line 224
    .line 225
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    const-string v0, "initView"

    .line 230
    .line 231
    invoke-static {p1, v0, p2}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_0
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 236
    .line 237
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 238
    .line 239
    new-instance v6, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string p2, ":push"

    .line 248
    .line 249
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-static {p1, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-nez p1, :cond_4

    .line 261
    .line 262
    goto/16 :goto_9

    .line 263
    .line 264
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    const-class p2, Landroid/app/NotificationManager;

    .line 270
    .line 271
    :goto_4
    if-eqz p2, :cond_5

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-static {v6, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {p1, v6}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    goto :goto_4

    .line 288
    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    :cond_6
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_8

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    move-object v6, v4

    .line 308
    check-cast v6, Ljava/lang/reflect/Method;

    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-static {v7, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const-string v8, "notify"

    .line 318
    .line 319
    invoke-static {v7, v2, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-eqz v7, :cond_6

    .line 324
    .line 325
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-static {v6, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    array-length v7, v6

    .line 333
    move v8, v2

    .line 334
    :goto_6
    if-ge v8, v7, :cond_6

    .line 335
    .line 336
    aget-object v9, v6, v8

    .line 337
    .line 338
    const-class v10, Landroid/app/Notification;

    .line 339
    .line 340
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-eqz v9, :cond_7

    .line 345
    .line 346
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_7
    add-int/2addr v8, v5

    .line 351
    goto :goto_6

    .line 352
    :cond_8
    new-instance p1, Ljava/util/HashSet;

    .line 353
    .line 354
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 355
    .line 356
    .line 357
    new-instance v1, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object p2

    .line 366
    :cond_9
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_a

    .line 371
    .line 372
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    move-object v3, v2

    .line 377
    check-cast v3, Ljava/lang/reflect/Method;

    .line 378
    .line 379
    invoke-static {v3}, Lr0/r;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-eqz v3, :cond_9

    .line 388
    .line 389
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result p2

    .line 401
    if-eqz p2, :cond_c

    .line 402
    .line 403
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p2

    .line 407
    check-cast p2, Ljava/lang/reflect/Method;

    .line 408
    .line 409
    invoke-static {p2}, Lr0/r;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    const-string v2, "hide-close-friend-push-notification-"

    .line 414
    .line 415
    invoke-static {v2, v1}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 420
    .line 421
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_b

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_b
    new-instance v2, LC0/d;

    .line 429
    .line 430
    invoke-direct {v2, v0, p0}, LC0/d;-><init>(ILjava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    invoke-static {p2, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 434
    .line 435
    .line 436
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 437
    .line 438
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_c
    :goto_9
    return-void

    .line 443
    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    const-string v6, "getClassLoader(...)"

    .line 448
    .line 449
    invoke-static {p2, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 453
    .line 454
    const-string v7, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals"

    .line 455
    .line 456
    invoke-interface {v6, p2, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    sget-object v6, LE0/i;->a:LE0/i;

    .line 461
    .line 462
    if-nez p2, :cond_d

    .line 463
    .line 464
    goto/16 :goto_d

    .line 465
    .line 466
    :cond_d
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    invoke-static {p2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    new-instance v4, Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 476
    .line 477
    .line 478
    array-length v7, p2

    .line 479
    move v8, v2

    .line 480
    :goto_a
    if-ge v8, v7, :cond_10

    .line 481
    .line 482
    aget-object v9, p2, v8

    .line 483
    .line 484
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    invoke-static {v10, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    const-string v11, "isTinkerEnabled"

    .line 492
    .line 493
    invoke-static {v10, v2, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    if-eqz v10, :cond_f

    .line 498
    .line 499
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 504
    .line 505
    invoke-static {v10, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v10

    .line 509
    if-nez v10, :cond_e

    .line 510
    .line 511
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v10

    .line 515
    const-class v11, Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-static {v10, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    if-eqz v10, :cond_f

    .line 522
    .line 523
    :cond_e
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_f
    add-int/2addr v8, v5

    .line 527
    goto :goto_a

    .line 528
    :cond_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object p2

    .line 532
    :cond_11
    :goto_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_13

    .line 537
    .line 538
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    check-cast v3, Ljava/lang/reflect/Method;

    .line 543
    .line 544
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    new-instance v9, Lq0/d;

    .line 564
    .line 565
    const/16 v10, 0xe

    .line 566
    .line 567
    invoke-direct {v9, v10}, Lq0/d;-><init>(I)V

    .line 568
    .line 569
    .line 570
    const-string v10, ","

    .line 571
    .line 572
    const/16 v11, 0x1e

    .line 573
    .line 574
    invoke-static {v8, v10, v9, v11}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    new-instance v9, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    const-string v10, "disable-wechat-hot-update-"

    .line 581
    .line 582
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    const-string v4, "#"

    .line 589
    .line 590
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 607
    .line 608
    invoke-virtual {v7, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    if-nez v7, :cond_12

    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_12
    :try_start_3
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 616
    .line 617
    .line 618
    new-instance v7, LA0/x;

    .line 619
    .line 620
    const/4 v8, 0x3

    .line 621
    invoke-direct {v7, v8}, LA0/x;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-static {v3, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 625
    .line 626
    .line 627
    const-string v7, "disable wechat hot update hooked"

    .line 628
    .line 629
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    invoke-static {v7}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 638
    .line 639
    .line 640
    move-object v8, v6

    .line 641
    goto :goto_c

    .line 642
    :catchall_3
    move-exception v7

    .line 643
    new-instance v8, LE0/d;

    .line 644
    .line 645
    invoke-direct {v8, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 646
    .line 647
    .line 648
    :goto_c
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    if-eqz v7, :cond_11

    .line 653
    .line 654
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 655
    .line 656
    invoke-virtual {v8, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    const-string v4, "disable wechat hot update hook fail"

    .line 660
    .line 661
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    filled-new-array {v4, v3, v7}, [Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_b

    .line 673
    .line 674
    :cond_13
    :goto_d
    sget-boolean p2, Lz0/i;->a:Z

    .line 675
    .line 676
    invoke-static {}, Lz0/g;->s()Z

    .line 677
    .line 678
    .line 679
    move-result p2

    .line 680
    if-eqz p2, :cond_14

    .line 681
    .line 682
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 683
    .line 684
    .line 685
    move-result-object p2

    .line 686
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/OptionData;->getDisableWechatHotUpdate()Z

    .line 687
    .line 688
    .line 689
    move-result p2

    .line 690
    if-eqz p2, :cond_14

    .line 691
    .line 692
    goto :goto_e

    .line 693
    :cond_14
    move v0, v2

    .line 694
    :goto_e
    sget-object p2, Lr0/r;->b:[Ljava/lang/String;

    .line 695
    .line 696
    :goto_f
    const/4 v1, 0x4

    .line 697
    if-ge v2, v1, :cond_16

    .line 698
    .line 699
    aget-object v1, p2, v2

    .line 700
    .line 701
    :try_start_4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    new-instance v4, Landroid/content/ComponentName;

    .line 706
    .line 707
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    invoke-direct {v4, v7, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v3, v4, v0, v5}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 715
    .line 716
    .line 717
    move-object v4, v6

    .line 718
    goto :goto_10

    .line 719
    :catchall_4
    move-exception v3

    .line 720
    new-instance v4, LE0/d;

    .line 721
    .line 722
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    :goto_10
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    if-eqz v3, :cond_15

    .line 730
    .line 731
    const-string v4, "apply tinker component state fail"

    .line 732
    .line 733
    filled-new-array {v4, v1, v3}, [Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    :cond_15
    add-int/2addr v2, v5

    .line 741
    goto :goto_f

    .line 742
    :cond_16
    return-void

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
