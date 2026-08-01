.class public final Llc;
.super Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Llc;->a:Z

    .line 2
    .line 3
    const/16 p1, 0x46

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final replaceHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean p0, p0, Llc;->a:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    aget-object p0, p0, v1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move-object p0, v0

    .line 21
    :goto_1
    if-nez p0, :cond_2

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    const-string v2, "AIOMsgSendEvent$MsgOnClickReplyEvent"

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_4

    .line 39
    .line 40
    const-string v2, "AIOMsgSendEvent$MsgOnReplyEvent"

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    const-string v2, "InputReplyMsgIntent$SetReplyData"

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catchall_0
    :cond_3
    :goto_2
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 58
    .line 59
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_4
    :goto_3
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 69
    .line 70
    if-eqz p0, :cond_6

    .line 71
    .line 72
    array-length v2, p0

    .line 73
    if-gtz v2, :cond_5

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    aget-object p0, p0, v1

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_6
    :goto_4
    move-object p0, v0

    .line 80
    :goto_5
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    const-wide/16 v3, 0x708

    .line 85
    .line 86
    add-long/2addr v1, v3

    .line 87
    sput-wide v1, Loc;->d:J

    .line 88
    .line 89
    if-eqz p0, :cond_7

    .line 90
    .line 91
    const-string v1, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 92
    .line 93
    const/4 v2, 0x3

    .line 94
    invoke-static {p0, v1, v2}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lv4;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    goto :goto_6

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    goto :goto_7

    .line 105
    :cond_7
    move-object v1, v0

    .line 106
    move-object v2, v1

    .line 107
    :goto_6
    new-instance v3, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const/4 v5, 0x2

    .line 117
    invoke-static {v2, v3, v5, v4}, Loc;->f(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/Set;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v3, v5, v4}, Loc;->f(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/Set;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v3, v5, v4}, Loc;->f(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    .line 126
    :try_start_2
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 127
    .line 128
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 129
    .line 130
    iget-object v2, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v0, v1, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {p1, p0}, Loc;->e(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    .line 140
    .line 141
    invoke-static {v3}, Loc;->c(Ljava/util/ArrayList;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :catchall_2
    move-exception p0

    .line 146
    move-object v0, v3

    .line 147
    :goto_7
    invoke-static {v0}, Loc;->c(Ljava/util/ArrayList;)V

    .line 148
    .line 149
    .line 150
    throw p0
.end method
