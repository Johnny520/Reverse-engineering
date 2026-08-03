.class public final synthetic Ll9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ll9/d;


# direct methods
.method public synthetic constructor <init>(Ll9/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll9/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ll9/b;->h:Ll9/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ll9/b;->g:I

    .line 2
    .line 3
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll9/b;->h:Ll9/d;

    .line 12
    .line 13
    iget-object v0, v0, Ll9/d;->c:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    const-string v1, "remove_forward_limit_enable"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ll9/b;->h:Ll9/d;

    .line 36
    .line 37
    iget-object v0, v0, Ll9/d;->c:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    const-string v1, "remove_forward_limit_enable"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 50
    .line 51
    const-string v0, "getIntent"

    .line 52
    .line 53
    new-array v1, v2, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {p1, v0, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    instance-of v0, p1, Landroid/content/Intent;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    check-cast p1, Landroid/content/Intent;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    :goto_0
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Ll9/d;->h(Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Ll9/b;->h:Ll9/d;

    .line 79
    .line 80
    iget-object v0, v0, Ll9/d;->c:Landroid/content/SharedPreferences;

    .line 81
    .line 82
    const-string v1, "remove_forward_limit_enable"

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 93
    .line 94
    instance-of v0, p1, Landroid/app/Activity;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    check-cast p1, Landroid/app/Activity;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/4 p1, 0x0

    .line 102
    :goto_2
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    invoke-static {p1}, Ll9/d;->h(Landroid/content/Intent;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
