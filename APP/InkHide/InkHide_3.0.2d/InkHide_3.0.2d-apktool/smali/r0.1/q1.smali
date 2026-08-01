.class public final Lr0/q1;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lde/robv/android/xposed/XC_MethodHook;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lr0/q1;->a:I

    .line 2
    iget v0, p1, Lde/robv/android/xposed/XC_MethodHook;->priority:I

    invoke-direct {p0, v0}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    .line 3
    iput-object p1, p0, Lr0/q1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/t1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/q1;->a:I

    iput-object p1, p0, Lr0/q1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/q1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    :try_start_0
    iget-object v0, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook;

    .line 13
    .line 14
    instance-of v1, v0, Lc0/a;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lc0/a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lc0/a;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v1, "afterHookedMethod"

    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0, v1, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :goto_0
    sget-object v0, Lc0/f;->a:LH/a;

    .line 37
    .line 38
    iget-object v0, v0, LH/a;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LA0/a;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, p1}, LA0/a;->d(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void

    .line 49
    :pswitch_2
    const-string v0, "param"

    .line 50
    .line 51
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 55
    .line 56
    instance-of v1, v0, Landroid/app/Activity;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    check-cast v0, Landroid/app/Activity;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move-object v0, v2

    .line 65
    :goto_2
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    aget-object p1, p1, v1

    .line 72
    .line 73
    instance-of v1, p1, Landroid/content/Intent;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    move-object v2, p1

    .line 78
    check-cast v2, Landroid/content/Intent;

    .line 79
    .line 80
    :cond_4
    if-nez v2, :cond_5

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    iget-object p1, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lr0/t1;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v2}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v3, "activity-new-intent"

    .line 95
    .line 96
    if-eqz v1, :cond_7

    .line 97
    .line 98
    invoke-static {v2}, Lr0/t1;->E(Landroid/content/Intent;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1, v1, v3}, Lr0/t1;->V(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    invoke-virtual {p1, v1, v3}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 112
    .line 113
    .line 114
    :cond_7
    invoke-virtual {p1, v0}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lr0/t1;->t(Landroid/app/Activity;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    invoke-virtual {p1, v2, v3}, Lr0/t1;->k(Landroid/content/Intent;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    return-void

    .line 128
    :pswitch_3
    const-string v0, "param"

    .line 129
    .line 130
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 134
    .line 135
    instance-of v0, p1, Landroid/app/Activity;

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    check-cast p1, Landroid/app/Activity;

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    const/4 p1, 0x0

    .line 143
    :goto_5
    if-nez p1, :cond_a

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_a
    iget-object v0, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lr0/t1;

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_b

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Lr0/t1;->t(Landroid/app/Activity;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_b
    const-string v1, "activity-resume"

    .line 161
    .line 162
    invoke-static {v0, p1, v1}, Lr0/t1;->a(Lr0/t1;Landroid/app/Activity;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_6
    return-void

    .line 166
    :pswitch_4
    const-string v0, "param"

    .line 167
    .line 168
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 172
    .line 173
    instance-of v0, p1, Landroid/app/Activity;

    .line 174
    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    check-cast p1, Landroid/app/Activity;

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_c
    const/4 p1, 0x0

    .line 181
    :goto_7
    if-nez p1, :cond_d

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_d
    iget-object v0, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lr0/t1;

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_e

    .line 193
    .line 194
    invoke-static {v0, p1}, Lr0/t1;->c(Lr0/t1;Landroid/app/Activity;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_e
    const-string v1, "activity-create-after"

    .line 199
    .line 200
    invoke-static {v0, p1, v1}, Lr0/t1;->a(Lr0/t1;Landroid/app/Activity;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :goto_8
    return-void

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, Lr0/q1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    :try_start_0
    iget-object v0, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook;

    .line 13
    .line 14
    instance-of v1, v0, Lc0/a;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lc0/a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lc0/a;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v1, "beforeHookedMethod"

    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0, v1, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :goto_0
    sget-object v0, Lc0/f;->a:LH/a;

    .line 37
    .line 38
    iget-object v0, v0, LH/a;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LA0/a;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, p1}, LA0/a;->d(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void

    .line 49
    :pswitch_2
    const-string v0, "param"

    .line 50
    .line 51
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 55
    .line 56
    instance-of v1, v0, Landroid/app/Activity;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    check-cast v0, Landroid/app/Activity;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move-object v0, v2

    .line 65
    :goto_2
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lr0/t1;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_4

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_4
    invoke-virtual {v1, v0}, Lr0/t1;->m(Landroid/app/Activity;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {}, Lr0/t1;->A()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    const-string v6, "enabled="

    .line 98
    .line 99
    invoke-static {v6, v5}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v6, "masked="

    .line 104
    .line 105
    invoke-static {v6, v3}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    if-eqz v7, :cond_5

    .line 114
    .line 115
    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v7, :cond_6

    .line 120
    .line 121
    :cond_5
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    :cond_6
    invoke-static {v7}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    const-string v8, "voip activity guard"

    .line 130
    .line 131
    filled-new-array {v8, v4, v5, v6, v7}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    if-eqz v3, :cond_9

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-eqz v5, :cond_7

    .line 149
    .line 150
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    if-nez v5, :cond_8

    .line 155
    .line 156
    :cond_7
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    :cond_8
    invoke-static {v5}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    const-string v7, "activity-guard:"

    .line 173
    .line 174
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v1, v3, v4, v5, v6}, Lr0/t1;->Z(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const-string v5, "block voip activity guard"

    .line 193
    .line 194
    filled-new-array {v5, v4, v3}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v1, v4, v3}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v0, v3}, Lr0/t1;->s(Landroid/app/Activity;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_9
    :goto_3
    return-void

    .line 223
    :pswitch_3
    const-string v0, "param"

    .line 224
    .line 225
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 229
    .line 230
    const/4 v1, 0x0

    .line 231
    aget-object v0, v0, v1

    .line 232
    .line 233
    instance-of v1, v0, Landroid/content/Intent;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    if-eqz v1, :cond_a

    .line 237
    .line 238
    check-cast v0, Landroid/content/Intent;

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_a
    move-object v0, v2

    .line 242
    :goto_4
    if-nez v0, :cond_b

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_b
    iget-object v1, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, Lr0/t1;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {}, Lr0/t1;->A()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    const-string v4, "enabled="

    .line 257
    .line 258
    invoke-static {v4, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-nez v4, :cond_c

    .line 267
    .line 268
    move-object v4, v0

    .line 269
    :cond_c
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    const-string v5, "voip route"

    .line 274
    .line 275
    filled-new-array {v5, v3, v4}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-eqz v3, :cond_f

    .line 287
    .line 288
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    if-nez v4, :cond_d

    .line 293
    .line 294
    move-object v4, v0

    .line 295
    :cond_d
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    const-string v5, "flutter-route"

    .line 300
    .line 301
    invoke-virtual {v1, v3, v0, v4, v5}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-nez v0, :cond_e

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_e
    invoke-virtual {v1, v3, v5}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string v0, "block voip route"

    .line 312
    .line 313
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v5, v3}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_f
    :goto_5
    return-void

    .line 327
    :pswitch_4
    const-string v0, "param"

    .line 328
    .line 329
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 333
    .line 334
    instance-of v1, v0, Landroid/app/Activity;

    .line 335
    .line 336
    if-eqz v1, :cond_10

    .line 337
    .line 338
    check-cast v0, Landroid/app/Activity;

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_10
    const/4 v0, 0x0

    .line 342
    :goto_6
    if-nez v0, :cond_11

    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_11
    iget-object v1, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v1, Lr0/t1;

    .line 348
    .line 349
    invoke-virtual {v1, v0}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_16

    .line 354
    .line 355
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 356
    .line 357
    const/4 v3, 0x0

    .line 358
    aget-object v2, v2, v3

    .line 359
    .line 360
    const/4 v4, 0x4

    .line 361
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-static {v2, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_16

    .line 370
    .line 371
    invoke-virtual {v1, v0}, Lr0/t1;->m(Landroid/app/Activity;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    if-nez v2, :cond_12

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_12
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    if-eqz v4, :cond_13

    .line 387
    .line 388
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    if-nez v4, :cond_14

    .line 393
    .line 394
    :cond_13
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    :cond_14
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    const-string v6, "activity-current:"

    .line 411
    .line 412
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-virtual {v1, v2, v3, v4, v5}, Lr0/t1;->Z(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    :goto_7
    if-eqz v3, :cond_16

    .line 421
    .line 422
    invoke-virtual {v1, v0}, Lr0/t1;->m(Landroid/app/Activity;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    if-nez v2, :cond_15

    .line 427
    .line 428
    const-string v2, "unknown"

    .line 429
    .line 430
    :cond_15
    invoke-virtual {v1, v0, v2}, Lr0/t1;->s(Landroid/app/Activity;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :cond_16
    :goto_8
    return-void

    .line 439
    :pswitch_5
    const-string v0, "param"

    .line 440
    .line 441
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 445
    .line 446
    instance-of v0, p1, Landroid/app/Activity;

    .line 447
    .line 448
    if-eqz v0, :cond_17

    .line 449
    .line 450
    check-cast p1, Landroid/app/Activity;

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_17
    const/4 p1, 0x0

    .line 454
    :goto_9
    if-nez p1, :cond_18

    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_18
    iget-object v0, p0, Lr0/q1;->b:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v0, Lr0/t1;

    .line 460
    .line 461
    const-string v1, "activity-create-before"

    .line 462
    .line 463
    invoke-static {v0, p1, v1}, Lr0/t1;->a(Lr0/t1;Landroid/app/Activity;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    :goto_a
    return-void

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
