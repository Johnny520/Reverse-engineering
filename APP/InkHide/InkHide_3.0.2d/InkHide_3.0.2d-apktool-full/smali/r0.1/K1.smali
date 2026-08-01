.class public final Lr0/K1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/M1;


# direct methods
.method public synthetic constructor <init>(Lr0/M1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/K1;->a:I

    iput-object p1, p0, Lr0/K1;->b:Lr0/M1;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lr0/K1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "param"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const-string v1, "args"

    .line 14
    .line 15
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Boolean;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v3

    .line 32
    :goto_0
    if-eqz v0, :cond_5

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 42
    .line 43
    instance-of v0, p1, Landroid/app/Activity;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move-object v3, p1

    .line 48
    check-cast v3, Landroid/app/Activity;

    .line 49
    .line 50
    :cond_2
    if-nez v3, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "LauncherUI"

    .line 62
    .line 63
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    new-instance v0, Lr0/J1;

    .line 83
    .line 84
    iget-object v1, p0, Lr0/K1;->b:Lr0/M1;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-direct {v0, v1, v3, v2}, Lr0/J1;-><init>(Lr0/M1;Landroid/app/Activity;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    :cond_5
    :goto_1
    return-void

    .line 94
    :pswitch_0
    const-string v0, "param"

    .line 95
    .line 96
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 100
    .line 101
    instance-of v0, p1, Landroid/app/Activity;

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    check-cast p1, Landroid/app/Activity;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    const/4 p1, 0x0

    .line 109
    :goto_2
    if-nez p1, :cond_7

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v1, 0x0

    .line 121
    const-string v2, "LauncherUI"

    .line 122
    .line 123
    invoke-static {v0, v2, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    new-instance v1, Lr0/J1;

    .line 143
    .line 144
    iget-object v2, p0, Lr0/K1;->b:Lr0/M1;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct {v1, v2, p1, v3}, Lr0/J1;-><init>(Lr0/M1;Landroid/app/Activity;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 151
    .line 152
    .line 153
    :cond_9
    :goto_3
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
