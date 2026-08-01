.class public final Lf0;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Lj0;


# direct methods
.method public constructor <init>(Lj0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf0;->a:Lj0;

    .line 2
    .line 3
    const/16 p1, 0x1f

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget-object p0, p0, Lf0;->a:Lj0;

    .line 2
    .line 3
    if-eqz p1, :cond_d

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v0, :cond_d

    .line 9
    .line 10
    iget-object v2, p0, Lj0;->e:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    move-object v5, v0

    .line 23
    check-cast v5, Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    :try_start_1
    const-string v0, "chat_message_corner_time"

    .line 26
    .line 27
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const-string v2, "eq_message_guard"

    .line 32
    .line 33
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-static {v5}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    move-object v1, v5

    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    array-length v6, v0

    .line 57
    if-ne v6, v4, :cond_2

    .line 58
    .line 59
    aget-object v0, v0, v3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v0, v1

    .line 63
    :goto_0
    iget-object v6, p0, Lj0;->a:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_3
    iget-object v6, p0, Lj0;->g:Ljava/lang/reflect/Field;

    .line 74
    .line 75
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v6, p0, Lj0;->b:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_b

    .line 86
    .line 87
    iget-object v6, p0, Lj0;->c:Ljava/lang/Class;

    .line 88
    .line 89
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    iget-object v6, p0, Lj0;->d:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    move v8, v3

    .line 103
    move-object v9, v6

    .line 104
    move-object v6, v1

    .line 105
    :goto_1
    if-ge v3, v7, :cond_7

    .line 106
    .line 107
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 119
    .line 120
    if-nez v6, :cond_6

    .line 121
    .line 122
    instance-of v11, v10, Landroid/view/ViewGroup;

    .line 123
    .line 124
    if-eqz v11, :cond_6

    .line 125
    .line 126
    move-object v6, v10

    .line 127
    check-cast v6, Landroid/view/ViewGroup;

    .line 128
    .line 129
    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    if-ne v8, v4, :cond_a

    .line 133
    .line 134
    if-nez v6, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    iget-object v3, p0, Lj0;->h:Ljava/lang/reflect/Method;

    .line 138
    .line 139
    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v1, p0}, Lr0;->i(Ljava/lang/Object;Lj0;)Lk0;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v7}, Lk0;->a()Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_9

    .line 152
    .line 153
    invoke-static {v5}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_9
    invoke-static {v7, v2}, Lr0;->t(Lk0;Z)Ln0;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 162
    .line 163
    move-object v4, v0

    .line 164
    invoke-static/range {v3 .. v8}, Lr0;->m(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lk0;Ln0;)Lm0;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Lr0;->r(Lm0;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_a
    :goto_3
    invoke-static {v5}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_b
    :goto_4
    invoke-static {v5}, Lr0;->q(Landroid/view/ViewGroup;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    move-object p0, v0

    .line 182
    :goto_5
    if-eqz v1, :cond_c

    .line 183
    .line 184
    invoke-static {v1}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 185
    .line 186
    .line 187
    :cond_c
    const-string p1, "message-status-row"

    .line 188
    .line 189
    const-string v0, "bind-qq93-direct"

    .line 190
    .line 191
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    :cond_d
    :goto_6
    return-void
.end method
