.class public final Lr0/E0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/E0;->a:I

    iput-object p1, p0, Lr0/E0;->b:Lr0/H0;

    iput-object p2, p0, Lr0/E0;->c:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lr0/E0;->a:I

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "args"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 29
    .line 30
    instance-of v1, p1, Landroid/view/View;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p1, v2

    .line 39
    :goto_0
    iget-object v1, p0, Lr0/E0;->b:Lr0/H0;

    .line 40
    .line 41
    iget-object v3, v1, Lr0/H0;->f:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/app/Activity;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v3, v2

    .line 53
    :goto_1
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {}, Lr0/H0;->Y0()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object v4, p0, Lr0/E0;->c:Ljava/lang/Class;

    .line 67
    .line 68
    if-eqz v3, :cond_6

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_4
    if-nez v2, :cond_5

    .line 85
    .line 86
    const-string v2, ""

    .line 87
    .line 88
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const-string v6, "8076 recycler setAdapter"

    .line 97
    .line 98
    filled-new-array {v6, v3, v2, v5}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_6
    invoke-static {}, Lr0/H0;->T0()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const-string v5, "play8072 recycler setAdapter"

    .line 134
    .line 135
    filled-new-array {v5, v2, v3, v4}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1, v0}, Lr0/H0;->s(Landroid/view/View;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v1, p1}, Lr0/H0;->q0(Ljava/lang/Class;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {v1, p1}, Lr0/H0;->q0(Ljava/lang/Class;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    return-void

    .line 163
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/E0;->a:I

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "args"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lr0/E0;->c:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, ".performItemClick"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lr0/E0;->b:Lr0/H0;

    .line 47
    .line 48
    invoke-static {v1, v0}, Lr0/H0;->f(Lr0/H0;Landroid/view/View;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    return-void

    .line 60
    :pswitch_1
    const-string v0, "param"

    .line 61
    .line 62
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 66
    .line 67
    instance-of v1, v0, Landroid/view/View;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    check-cast v0, Landroid/view/View;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v0, 0x0

    .line 75
    :goto_2
    if-nez v0, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object v1, p0, Lr0/E0;->c:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, ".performClick"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lr0/E0;->b:Lr0/H0;

    .line 90
    .line 91
    invoke-static {v1, v0}, Lr0/H0;->f(Lr0/H0;Landroid/view/View;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_3
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
