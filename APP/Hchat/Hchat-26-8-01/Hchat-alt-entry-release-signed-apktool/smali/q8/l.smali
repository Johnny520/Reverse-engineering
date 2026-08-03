.class public final Lq8/l;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/reflect/Method;

.field public final synthetic c:Lq8/m;


# direct methods
.method public synthetic constructor <init>(Lq8/m;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq8/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lq8/l;->c:Lq8/m;

    .line 4
    .line 5
    iput-object p2, p0, Lq8/l;->b:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lq8/l;->a:I

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
    iget-object p1, p0, Lq8/l;->c:Lq8/m;

    .line 11
    .line 12
    iget-object p1, p1, Lq8/m;->j:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, Lq8/l;->c:Lq8/m;

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    iput-object v1, v0, Lq8/m;->j:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, Lq8/l;->c:Lq8/m;

    .line 21
    .line 22
    iput-object v1, v0, Lq8/m;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lq8/l;->c:Lq8/m;

    .line 31
    .line 32
    iget-object v1, p0, Lq8/l;->b:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {v1}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v1, "exit"

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, Lq8/m;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 44
    .line 45
    const-string v0, "getStringExtra"

    .line 46
    .line 47
    const-string v1, "Chat_User"

    .line 48
    .line 49
    const-string v2, ""

    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-class v4, Ljava/lang/String;

    .line 59
    .line 60
    :goto_0
    if-eqz v3, :cond_3

    .line 61
    .line 62
    :try_start_0
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v3, v0, v5}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    if-ne v6, v4, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    const/4 v5, 0x0

    .line 83
    :goto_1
    if-nez v5, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :try_start_1
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v5, p1, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    instance-of v0, p1, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    check-cast p1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    :catchall_1
    :cond_5
    :goto_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    iget-object p1, p0, Lq8/l;->c:Lq8/m;

    .line 111
    .line 112
    iget-object v2, p1, Lq8/m;->k:Ljava/lang/String;

    .line 113
    .line 114
    :cond_6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_7

    .line 119
    .line 120
    iget-object p1, p0, Lq8/l;->c:Lq8/m;

    .line 121
    .line 122
    iget-object v0, p0, Lq8/l;->b:Ljava/lang/reflect/Method;

    .line 123
    .line 124
    invoke-static {v0}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v2}, Lq8/m;->c(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lq8/l;->a:I

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    array-length v0, p1

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_2

    .line 18
    .line 19
    aget-object v2, p1, v1

    .line 20
    .line 21
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    const-string p1, ""

    .line 36
    .line 37
    :goto_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    iget-object v0, p0, Lq8/l;->c:Lq8/m;

    .line 45
    .line 46
    iput-object p1, v0, Lq8/m;->k:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v0, p0, Lq8/l;->c:Lq8/m;

    .line 49
    .line 50
    iget-object v1, p0, Lq8/l;->b:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-static {v1}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lq8/m;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_3
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
