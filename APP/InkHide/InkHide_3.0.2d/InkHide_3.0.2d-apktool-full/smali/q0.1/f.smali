.class public final Lq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public a:Z

.field public b:Z

.field public c:I


# direct methods
.method public static a(Lq0/f;Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "KEY_INTENT_FROM_MASK"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "KEY_INTENT_PLUGIN_MODE"

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput v1, p0, Lq0/f;->c:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string p0, "ignore not from mask"

    .line 23
    .line 24
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-static {}, Lz0/r;->p()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sparse-switch v0, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lz0/r;->t()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_0

    .line 44
    :sswitch_0
    const/4 v0, 0x1

    .line 45
    :goto_0
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 48
    .line 49
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "\u63d0\u793a"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "Current WeiXin version "

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v2, " is not supported. Please check supported versions on MaskWechat home page."

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Lq0/b;

    .line 96
    .line 97
    invoke-direct {v1, p0, p1, p2}, Lq0/b;-><init>(Lq0/f;Landroid/app/Activity;Landroid/content/Intent;)V

    .line 98
    .line 99
    .line 100
    const-string p0, "\u7ee7\u7eed\u4f7f\u7528"

    .line 101
    .line 102
    invoke-virtual {v0, p0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v0, Lq0/b;

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    invoke-direct {v0, p2, p1, v1}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    const-string p1, "\u7cca\u8138\u4e3b\u9875"

    .line 113
    .line 114
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_1
    invoke-virtual {p0, p1}, Lq0/f;->b(Landroid/app/Activity;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :sswitch_data_0
    .sparse-switch
        0x85c -> :sswitch_0
        0x8fc -> :sswitch_0
        0x910 -> :sswitch_0
        0x924 -> :sswitch_0
        0x938 -> :sswitch_0
        0x94c -> :sswitch_0
        0x960 -> :sswitch_0
        0x974 -> :sswitch_0
        0x97d -> :sswitch_0
        0x989 -> :sswitch_0
        0x99c -> :sswitch_0
        0x9b0 -> :sswitch_0
        0x9c6 -> :sswitch_0
        0x9d9 -> :sswitch_0
        0x9ec -> :sswitch_0
        0xa00 -> :sswitch_0
        0xa1d -> :sswitch_0
        0xa28 -> :sswitch_0
        0xa8d -> :sswitch_0
        0xaa0 -> :sswitch_0
        0xab4 -> :sswitch_0
        0xaf0 -> :sswitch_0
        0xb19 -> :sswitch_0
        0xb2c -> :sswitch_0
        0xbf4 -> :sswitch_0
        0xc08 -> :sswitch_0
        0xc1c -> :sswitch_0
        0xc30 -> :sswitch_0
        0xc45 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Lq0/f;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lq0/f;->b:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v0, LA0/m;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, p0, p1, v1}, LA0/m;-><init>(Le0/a;Landroid/app/Activity;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 v1, 0x1

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    new-instance v0, Li/q1;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Li/q1;-><init>(Landroid/app/Activity;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Li/q1;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object p1, v0, Li/q1;->a:Landroid/view/View;

    .line 40
    .line 41
    check-cast p1, Lt0/e;

    .line 42
    .line 43
    invoke-virtual {p1}, Lt0/c;->g()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "entry wechat ui, but support plugin mode"

    .line 52
    .line 53
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-class v0, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lq0/e;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2}, Lq0/e;-><init>(Lq0/f;I)V

    .line 26
    .line 27
    .line 28
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 33
    .line 34
    const-string v2, "onCreate"

    .line 35
    .line 36
    invoke-static {v1, p2, v2, v0}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-class p2, Landroid/content/Intent;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, Lq0/e;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-direct {v0, p0, v2}, Lq0/e;-><init>(Lq0/f;I)V

    .line 53
    .line 54
    .line 55
    filled-new-array {p2, v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v0, "onNewIntent"

    .line 60
    .line 61
    invoke-static {v1, p1, v0, p2}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
