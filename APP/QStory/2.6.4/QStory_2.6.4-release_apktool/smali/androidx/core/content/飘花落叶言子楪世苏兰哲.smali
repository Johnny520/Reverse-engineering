.class public abstract Landroidx/core/content/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Landroid/content/IntentFilter;ILjava/lang/String;Landroid/os/Handler;Landroidx/core/content/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 4

    .line 1
    instance-of v0, p6, Landroidx/core/content/ContextKt$receiveBroadcasts$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;

    .line 21
    .line 22
    invoke-direct {v0, p6}, Landroidx/core/content/ContextKt$receiveBroadcasts$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_1
    iget-object p0, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$5:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 46
    .line 47
    iget-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$4:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 50
    .line 51
    iget-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$3:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Landroid/os/Handler;

    .line 54
    .line 55
    iget-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$2:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    iget-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Landroid/content/IntentFilter;

    .line 62
    .line 63
    iget-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Landroid/content/Context;

    .line 66
    .line 67
    :try_start_0
    invoke-static {p6}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    move-object p6, p0

    .line 71
    move-object p0, p1

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p2, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-static {p6}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance p6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 80
    .line 81
    invoke-direct {p6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 82
    .line 83
    .line 84
    :try_start_1
    iput-object p0, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p3, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$2:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p4, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$3:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p5, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$4:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p6, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->L$5:Ljava/lang/Object;

    .line 95
    .line 96
    iput p2, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->I$0:I

    .line 97
    .line 98
    iput v3, v0, Landroidx/core/content/ContextKt$receiveBroadcasts$1;->label:I

    .line 99
    .line 100
    new-instance v2, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 101
    .line 102
    invoke-static {v0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {v2, v3, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()V

    .line 110
    .line 111
    .line 112
    move-object v0, p5

    .line 113
    move p5, p2

    .line 114
    move-object p2, p1

    .line 115
    new-instance p1, Landroidx/core/content/飘花落叶言子楪世哲苏兰;

    .line 116
    .line 117
    invoke-direct {p1, v2, v0}, Landroidx/core/content/飘花落叶言子楪世哲苏兰;-><init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static/range {p0 .. p5}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_3

    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 133
    .line 134
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 135
    .line 136
    .line 137
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object p2, v0

    .line 140
    move-object p1, p0

    .line 141
    move-object p0, p6

    .line 142
    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 143
    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    check-cast p0, Landroid/content/BroadcastReceiver;

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 149
    .line 150
    .line 151
    :cond_4
    throw p2
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v3, -0x1

    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    if-nez v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    array-length v4, v2

    .line 43
    if-gtz v4, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    aget-object v2, v2, v0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    return v3

    .line 50
    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-class v5, Landroid/app/AppOpsManager;

    .line 59
    .line 60
    if-ne v3, v1, :cond_9

    .line 61
    .line 62
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_9

    .line 67
    .line 68
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v4, 0x1d

    .line 71
    .line 72
    if-lt v3, v4, :cond_8

    .line 73
    .line 74
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/app/AppOpsManager;

    .line 79
    .line 80
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    const/4 v5, 0x1

    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    move v2, v5

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-virtual {v3, p1, v4, v2}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :goto_2
    if-eqz v2, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    invoke-static {p0}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-nez v3, :cond_7

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    invoke-virtual {v3, p1, v1, p0}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    :goto_3
    move v2, v5

    .line 108
    goto :goto_4

    .line 109
    :cond_8
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Landroid/app/AppOpsManager;

    .line 114
    .line 115
    invoke-virtual {p0, p1, v2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Landroid/app/AppOpsManager;

    .line 125
    .line 126
    invoke-virtual {p0, p1, v2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    :goto_4
    if-nez v2, :cond_a

    .line 131
    .line 132
    :goto_5
    return v0

    .line 133
    :cond_a
    const/4 p0, -0x2

    .line 134
    return p0
.end method
