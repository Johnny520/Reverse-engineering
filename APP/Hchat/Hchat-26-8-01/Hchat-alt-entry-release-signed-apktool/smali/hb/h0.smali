.class public final Lhb/h0;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhb/i0;


# direct methods
.method public synthetic constructor <init>(Lhb/i0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhb/h0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/h0;->b:Lhb/i0;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lhb/h0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lhb/h0;->b:Lhb/i0;

    .line 14
    .line 15
    iget-object v0, v0, Lhb/i0;->d:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v1, "selected_messages_enable"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v0}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-static {v0, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const v0, 0x4843534d    # 200013.2f

    .line 52
    .line 53
    .line 54
    const-string v1, "\u7fa4\u53d1\u52a9\u624b[H]"

    .line 55
    .line 56
    invoke-static {p1, v1, v0}, Lhb/i0;->a(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    const v0, 0x48435354    # 200013.31f

    .line 60
    .line 61
    .line 62
    const-string v1, "\u5b9a\u65f6\u8f6c\u53d1[H]"

    .line 63
    .line 64
    invoke-static {p1, v1, v0}, Lhb/i0;->a(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Lhb/h0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Landroid/app/Activity;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    :goto_0
    if-eqz v0, :cond_5

    .line 25
    .line 26
    iget-object v1, p0, Lhb/h0;->b:Lhb/i0;

    .line 27
    .line 28
    iget-object v1, v1, Lhb/i0;->g:Lhb/r;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const-string v4, "hchat_selected_message_send_token"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v3, v2

    .line 47
    :goto_1
    if-nez v3, :cond_2

    .line 48
    .line 49
    const-string v3, ""

    .line 50
    .line 51
    :cond_2
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    iget-object v4, v1, Lhb/r;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget-object v3, v1, Lhb/r;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lhb/q;

    .line 71
    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    iget-object v4, v1, Lhb/r;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lhb/o;

    .line 77
    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    iget-object v5, v1, Lhb/r;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Landroid/os/Handler;

    .line 83
    .line 84
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iput-object v2, v1, Lhb/r;->i:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v4, v1, Lhb/r;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ljava/util/List;

    .line 92
    .line 93
    iget v5, v3, Lhb/q;->g:I

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    add-int/2addr v6, v5

    .line 100
    iput v6, v3, Lhb/q;->g:I

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const-wide/16 v6, 0x2ee

    .line 107
    .line 108
    invoke-virtual {v1, v3, v5, v6, v7}, Lhb/r;->a(Lhb/q;IJ)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Landroid/content/Intent;

    .line 112
    .line 113
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance v3, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    const-string v4, "SendMsgUsernames"

    .line 122
    .line 123
    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    const-string v3, "sendResult"

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    const/4 v3, -0x1

    .line 133
    invoke-virtual {v0, v3, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_2
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
