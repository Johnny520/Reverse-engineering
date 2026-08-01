.class public final Lr0/d1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/f1;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lr0/f1;Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/d1;->a:I

    iput-object p1, p0, Lr0/d1;->b:Lr0/f1;

    iput-object p2, p0, Lr0/d1;->c:Ljava/lang/Class;

    iput-object p3, p0, Lr0/d1;->d:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/d1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lr0/d1;->b:Lr0/f1;

    .line 20
    .line 21
    iget-object v0, v0, Lr0/f1;->g:Ljava/lang/Object;

    .line 22
    .line 23
    if-eq p1, v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lr0/d1;->b:Lr0/f1;

    .line 26
    .line 27
    iput-object p1, v0, Lr0/f1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lr0/d1;->b:Lr0/f1;

    .line 30
    .line 31
    iget-object v1, p0, Lr0/d1;->c:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v2, p0, Lr0/d1;->d:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v0, p1, v1, v2}, Lr0/f1;->d(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/d1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lr0/d1;->b:Lr0/f1;

    .line 13
    .line 14
    iget-boolean v0, v0, Lr0/f1;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-object v0, p0, Lr0/d1;->b:Lr0/f1;

    .line 20
    .line 21
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v2, p0, Lr0/d1;->c:Ljava/lang/Class;

    .line 24
    .line 25
    iget-object v3, p0, Lr0/d1;->d:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Lr0/f1;->d(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "notifyDataSetChanged"

    .line 40
    .line 41
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lr0/d1;->b:Lr0/f1;

    .line 52
    .line 53
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    if-nez p1, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const/4 v3, 0x1

    .line 62
    const/4 v4, 0x0

    .line 63
    :try_start_0
    iput-boolean v3, v2, Lr0/f1;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    :try_start_2
    iput-boolean v4, v2, Lr0/f1;->h:Z

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_0

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    iput-boolean v4, v2, Lr0/f1;->h:Z

    .line 84
    .line 85
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    :goto_0
    new-instance v0, LE0/d;

    .line 87
    .line 88
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object p1, v0

    .line 92
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    iput-boolean v4, v2, Lr0/f1;->h:Z

    .line 99
    .line 100
    const-string v0, "hide sns posts notifyDataSetChanged fail"

    .line 101
    .line 102
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_2
    return-void

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
