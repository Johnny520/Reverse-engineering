.class final Lcom/mr/elaris/InAppSettings$HostBackHook;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mr/elaris/InAppSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HostBackHook"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    const-string p0, "dispatchKeyEvent"

    .line 2
    .line 3
    const-string v0, "onBackPressed"

    .line 4
    .line 5
    if-eqz p1, :cond_9

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->d()Lcom/mr/elaris/InAppSettings;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-static {p0}, Lcom/mr/elaris/InAppSettings;->c(Lcom/mr/elaris/InAppSettings;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {v0}, Lcom/mr/elaris/InAppSettings;->e(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_9

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_9

    .line 55
    .line 56
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 57
    .line 58
    if-eqz v0, :cond_9

    .line 59
    .line 60
    array-length v1, v0

    .line 61
    if-eqz v1, :cond_9

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    instance-of v1, v0, Landroid/view/KeyEvent;

    .line 67
    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    check-cast v0, Landroid/view/KeyEvent;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/4 v2, 0x4

    .line 78
    if-ne v1, v2, :cond_7

    .line 79
    .line 80
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->f()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->d()Lcom/mr/elaris/InAppSettings;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const/4 v2, 0x1

    .line 96
    if-ne v0, v2, :cond_6

    .line 97
    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    invoke-static {v1}, Lcom/mr/elaris/InAppSettings;->c(Lcom/mr/elaris/InAppSettings;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    :cond_5
    invoke-static {p0}, Lcom/mr/elaris/InAppSettings;->e(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_7
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    const/16 v1, 0x19

    .line 120
    .line 121
    if-eq p0, v1, :cond_8

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    const/16 v1, 0x18

    .line 128
    .line 129
    if-ne p0, v1, :cond_9

    .line 130
    .line 131
    :cond_8
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->d()Lcom/mr/elaris/InAppSettings;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-eqz p0, :cond_9

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {p0, v1, v0, v3}, Lcom/mr/elaris/InAppSettings;->handleVolumeKey(ILandroid/view/KeyEvent;Landroid/view/View;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_9

    .line 146
    .line 147
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :catchall_0
    move-exception p0

    .line 154
    const-string p1, "settings"

    .line 155
    .line 156
    const-string v0, "host-back"

    .line 157
    .line 158
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_0
    return-void
.end method
