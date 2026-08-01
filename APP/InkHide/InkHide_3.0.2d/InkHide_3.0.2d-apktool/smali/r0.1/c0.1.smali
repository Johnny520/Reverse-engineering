.class public final Lr0/c0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/c0;->a:I

    iput-object p1, p0, Lr0/c0;->b:Lr0/d0;

    iput-object p2, p0, Lr0/c0;->c:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lr0/c0;->a:I

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
    sget-boolean v0, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->F()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 22
    .line 23
    const-string v1, "args"

    .line 24
    .line 25
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v1, v0, Landroid/view/ContextMenu;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    check-cast v0, Landroid/view/ContextMenu;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, v2

    .line 42
    :goto_0
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v1, p0, Lr0/c0;->b:Lr0/d0;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string v2, "d"

    .line 59
    .line 60
    invoke-static {p1, v2}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_4
    :goto_1
    if-nez v2, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    invoke-static {v1, v2}, Lr0/d0;->g(Lr0/d0;Ljava/lang/Object;)LE0/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_6
    iget-object v2, p1, LE0/c;->a:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v3, v2

    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    iget-object p1, p1, LE0/c;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1, v0, v3, p1}, Lr0/d0;->a(Lr0/d0;Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    if-nez p1, :cond_7

    .line 93
    .line 94
    const-string p1, ""

    .line 95
    .line 96
    :cond_7
    iget-object v0, p0, Lr0/c0;->c:Ljava/lang/String;

    .line 97
    .line 98
    const-string v1, "contact quick add dynamic address menu create"

    .line 99
    .line 100
    filled-new-array {v1, v0, v2, p1}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/c0;->a:I

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
    sget-boolean v0, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->F()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 22
    .line 23
    const-string v1, "args"

    .line 24
    .line 25
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v1, v0, Landroid/view/MenuItem;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    check-cast v0, Landroid/view/MenuItem;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, v2

    .line 42
    :goto_0
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v1, p0, Lr0/c0;->b:Lr0/d0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    move-object v3, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    const-string v3, "d"

    .line 64
    .line 65
    invoke-static {v0, v3}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :cond_5
    :goto_1
    if-nez v3, :cond_6

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    invoke-static {v1, v3}, Lr0/d0;->g(Lr0/d0;Ljava/lang/Object;)LE0/c;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_7

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_7
    iget-object v3, v0, LE0/c;->a:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v4, v3

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v0, v0, LE0/c;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v4, v0}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    if-nez v0, :cond_8

    .line 98
    .line 99
    const-string v0, ""

    .line 100
    .line 101
    :cond_8
    iget-object v1, p0, Lr0/c0;->c:Ljava/lang/String;

    .line 102
    .line 103
    const-string v4, "contact quick add dynamic address menu click"

    .line 104
    .line 105
    filled-new-array {v4, v1, v3, v0}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
