.class public final Lr0/x;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/w;


# direct methods
.method public synthetic constructor <init>(Lr0/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/x;->a:I

    iput-object p1, p0, Lr0/x;->b:Lr0/w;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    const-string v0, "thisObject"

    .line 2
    .line 3
    iget-object v1, p0, Lr0/x;->b:Lr0/w;

    .line 4
    .line 5
    const-string v2, "param"

    .line 6
    .line 7
    iget v3, p0, Lr0/x;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v1, p1, v0}, Lr0/w;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lz0/q;->a:Landroid/os/Handler;

    .line 32
    .line 33
    iget-object p1, v1, Lr0/w;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lz0/q;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_1
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lr0/w;->g(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    const-string v0, "com.tencent.mm.ui.chatting.ChattingUIProxy"

    .line 55
    .line 56
    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v2, "com.tencent.mm.ui.chatting.BaseChattingUIFragment"

    .line 61
    .line 62
    invoke-static {v2}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 67
    .line 68
    invoke-interface {v3, v0, v2}, Ld0/a;->k(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-nez p1, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v1, p1}, Lr0/w;->g(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p1, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    new-instance v0, LE0/d;

    .line 93
    .line 94
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object p1, v0

    .line 98
    :goto_2
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    const-string v0, "hook onEnterBegin error"

    .line 105
    .line 106
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "thisObject"

    .line 3
    .line 4
    const-string v2, "param"

    .line 5
    .line 6
    iget v3, p0, Lr0/x;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lr0/x;->b:Lr0/w;

    .line 16
    .line 17
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v3, v2, Lr0/w;->f:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v3, v0

    .line 38
    :goto_0
    if-eq v3, p1, :cond_1

    .line 39
    .line 40
    iget-object v3, v2, Lr0/w;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v3, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-static {v1}, Lz0/q;->g(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, v2, Lr0/w;->f:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    iput-object v0, v2, Lr0/w;->g:Ljava/lang/String;

    .line 54
    .line 55
    sget-object v1, Lz0/e;->a:Ljava/lang/String;

    .line 56
    .line 57
    sget-object v1, LF0/u;->a:LF0/u;

    .line 58
    .line 59
    sput-object v1, Lz0/e;->c:Ljava/util/Set;

    .line 60
    .line 61
    :cond_2
    iget-object v1, v2, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v1, v0

    .line 71
    :goto_1
    if-ne v1, p1, :cond_4

    .line 72
    .line 73
    iput-object v0, v2, Lr0/w;->h:Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    iput-object v0, v2, Lr0/w;->i:Ljava/lang/String;

    .line 76
    .line 77
    :cond_4
    iget-object v1, v2, Lr0/w;->j:Ljava/lang/ref/WeakReference;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    move-object v1, v0

    .line 87
    :goto_2
    if-ne v1, p1, :cond_6

    .line 88
    .line 89
    iput-object v0, v2, Lr0/w;->j:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    iput-object v0, v2, Lr0/w;->k:Ljava/lang/String;

    .line 92
    .line 93
    :cond_6
    return-void

    .line 94
    :pswitch_1
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lr0/x;->b:Lr0/w;

    .line 103
    .line 104
    invoke-static {p1}, Lr0/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-nez v2, :cond_7

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_7
    iget-object v3, v1, Lr0/w;->f:Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    if-eqz v3, :cond_8

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_8
    if-eq v0, p1, :cond_9

    .line 120
    .line 121
    iget-object p1, v1, Lr0/w;->g:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    :cond_9
    invoke-static {v2}, Lz0/q;->g(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_3
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
