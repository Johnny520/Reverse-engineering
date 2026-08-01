.class public final Lr0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ljava/util/Set;

.field public d:Lr0/w;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lr0/y;->c:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/y;->d:Lr0/w;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, v0, Lr0/w;->f:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {v1}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    iget-object v2, v0, Lr0/w;->g:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    if-eqz p1, :cond_3

    .line 28
    .line 29
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    :goto_0
    invoke-virtual {v0, v1}, Lr0/w;->d(Ljava/lang/Object;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-instance v2, Lr0/u;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, v0, v1, p1, v3}, Lr0/u;-><init>(Lr0/w;Ljava/lang/Object;Landroid/view/View;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    new-instance v2, Lr0/u;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v2, v0, v1, p1, v3}, Lr0/u;-><init>(Lr0/w;Ljava/lang/Object;Landroid/view/View;I)V

    .line 63
    .line 64
    .line 65
    const-wide/16 v0, 0x78

    .line 66
    .line 67
    invoke-virtual {p1, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    .line 69
    .line 70
    :cond_5
    :goto_1
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 4

    .line 1
    new-instance p2, Lr0/w;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lr0/w;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lr0/y;->d:Lr0/w;

    .line 7
    .line 8
    iget-boolean v0, p0, Lr0/y;->a:Z

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Le/r;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v2, p0}, Le/r;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroid/content/IntentFilter;

    .line 21
    .line 22
    const-string v3, "android.intent.action.SCREEN_OFF"

    .line 23
    .line 24
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    iput-boolean v1, p0, Lr0/y;->a:Z

    .line 31
    .line 32
    :goto_0
    iget-boolean v0, p0, Lr0/y;->b:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v2, v0, Landroid/app/Application;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    check-cast v0, Landroid/app/Application;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v0, v3

    .line 50
    :goto_1
    if-nez v0, :cond_5

    .line 51
    .line 52
    instance-of v0, p1, Landroid/app/Application;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    move-object v3, p1

    .line 57
    check-cast v3, Landroid/app/Application;

    .line 58
    .line 59
    :cond_3
    if-nez v3, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move-object v0, v3

    .line 63
    :cond_5
    new-instance p1, Lr0/j;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-direct {p1, p0, v2}, Lr0/j;-><init>(Le0/a;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 70
    .line 71
    .line 72
    iput-boolean v1, p0, Lr0/y;->b:Z

    .line 73
    .line 74
    :goto_2
    const-string p1, "com.tencent.mm.ui.chatting.ChattingUIProxy"

    .line 75
    .line 76
    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Lr0/x;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-direct {v0, p2, v1}, Lr0/x;-><init>(Lr0/w;I)V

    .line 84
    .line 85
    .line 86
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "onEnterBegin"

    .line 91
    .line 92
    invoke-static {p1, v1, v0}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const-string p1, "com.tencent.mm.ui.chatting.BaseChattingUIFragment"

    .line 96
    .line 97
    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v1, Lr0/x;

    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    invoke-direct {v1, p2, v2}, Lr0/x;-><init>(Lr0/w;I)V

    .line 105
    .line 106
    .line 107
    const-class v2, Landroid/os/Bundle;

    .line 108
    .line 109
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "onActivityCreated"

    .line 114
    .line 115
    invoke-static {v0, v2, v1}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, Lr0/x;

    .line 123
    .line 124
    const/4 v2, 0x2

    .line 125
    invoke-direct {v1, p2, v2}, Lr0/x;-><init>(Lr0/w;I)V

    .line 126
    .line 127
    .line 128
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "onResume"

    .line 133
    .line 134
    invoke-static {v0, v2, v1}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v1, Lr0/x;

    .line 142
    .line 143
    const/4 v2, 0x3

    .line 144
    invoke-direct {v1, p2, v2}, Lr0/x;-><init>(Lr0/w;I)V

    .line 145
    .line 146
    .line 147
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    const-string v2, "onPause"

    .line 152
    .line 153
    invoke-static {v0, v2, v1}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance v0, Lr0/x;

    .line 161
    .line 162
    const/4 v1, 0x4

    .line 163
    invoke-direct {v0, p2, v1}, Lr0/x;-><init>(Lr0/w;I)V

    .line 164
    .line 165
    .line 166
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    const-string v0, "onDestroy"

    .line 171
    .line 172
    invoke-static {p1, v0, p2}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method
