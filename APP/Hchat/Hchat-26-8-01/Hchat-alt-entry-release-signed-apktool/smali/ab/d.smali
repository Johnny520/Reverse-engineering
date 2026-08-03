.class public final Lab/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lab/f;


# direct methods
.method public synthetic constructor <init>(Lab/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lab/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lab/d;->b:Lab/f;

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
    .locals 7

    .line 1
    iget v0, p0, Lab/d;->a:I

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
    iget-object v0, p0, Lab/d;->b:Lab/f;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 16
    .line 17
    instance-of v2, v1, Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, Landroid/widget/TextView;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    if-eqz v1, :cond_5

    .line 27
    .line 28
    invoke-static {v1}, Lab/f;->c(Landroid/view/View;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    iget-object v2, v0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    instance-of v4, v2, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    move-object v4, v2

    .line 48
    check-cast v4, Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-static {v2}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v2, v3

    .line 64
    :goto_1
    if-eqz v2, :cond_3

    .line 65
    .line 66
    instance-of v4, v2, Landroid/view/View;

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-ne v4, v5, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v2, v3

    .line 85
    :goto_2
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    instance-of v5, v4, Landroid/view/inputmethod/InputConnection;

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    move-object v3, v4

    .line 96
    check-cast v3, Landroid/view/inputmethod/InputConnection;

    .line 97
    .line 98
    :cond_4
    if-eqz v3, :cond_5

    .line 99
    .line 100
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    invoke-direct {v4, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lab/g;

    .line 106
    .line 107
    new-instance v5, Lab/e;

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    invoke-direct {v5, v0, v1, v4, v6}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v2, v3, v5}, Lab/g;-><init>(Landroid/view/inputmethod/InputConnection;Lab/e;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void

    .line 120
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lab/d;->b:Lab/f;

    .line 124
    .line 125
    iget-object v0, v0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 132
    .line 133
    if-ne v0, p1, :cond_6

    .line 134
    .line 135
    iget-object p1, p0, Lab/d;->b:Lab/f;

    .line 136
    .line 137
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p1, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 144
    .line 145
    :cond_6
    return-void

    .line 146
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 150
    .line 151
    instance-of v0, p1, Landroid/view/View;

    .line 152
    .line 153
    if-eqz v0, :cond_7

    .line 154
    .line 155
    iget-object v0, p0, Lab/d;->b:Lab/f;

    .line 156
    .line 157
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 158
    .line 159
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iput-object v1, v0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 163
    .line 164
    :cond_7
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lab/d;->a:I

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
    iget-object v0, p0, Lab/d;->b:Lab/f;

    .line 14
    .line 15
    iget-object v1, v0, Lab/f;->a:Lr8/g;

    .line 16
    .line 17
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "Hchat_quote_delete_clear_config"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "quote_delete_clear_enable"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto/16 :goto_b

    .line 35
    .line 36
    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-static {v4, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v2

    .line 48
    :goto_0
    instance-of v4, v1, Landroid/view/KeyEvent;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    check-cast v1, Landroid/view/KeyEvent;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v1, v2

    .line 56
    :goto_1
    if-eqz v1, :cond_10

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_10

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/16 v4, 0x43

    .line 69
    .line 70
    if-eq v1, v4, :cond_3

    .line 71
    .line 72
    goto/16 :goto_b

    .line 73
    .line 74
    :cond_3
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-static {v3, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v1, v2

    .line 84
    :goto_2
    instance-of v4, v1, Landroid/view/View;

    .line 85
    .line 86
    if-eqz v4, :cond_5

    .line 87
    .line 88
    check-cast v1, Landroid/view/View;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-object v1, v2

    .line 92
    :goto_3
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-static {v1}, Lab/f;->c(Landroid/view/View;)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {v0, v3, v1}, Lab/f;->b(ILjava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_4
    if-eqz v1, :cond_7

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_7
    iget-object v1, v0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    instance-of v4, v1, Landroid/view/View;

    .line 119
    .line 120
    if-eqz v4, :cond_8

    .line 121
    .line 122
    move-object v4, v1

    .line 123
    check-cast v4, Landroid/view/View;

    .line 124
    .line 125
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_8

    .line 130
    .line 131
    invoke-static {v1}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_8

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    move-object v1, v2

    .line 139
    :goto_5
    if-eqz v1, :cond_10

    .line 140
    .line 141
    :goto_6
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 142
    .line 143
    if-eqz v4, :cond_9

    .line 144
    .line 145
    invoke-static {v3, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    goto :goto_7

    .line 150
    :cond_9
    move-object v4, v2

    .line 151
    :goto_7
    instance-of v5, v4, Landroid/widget/TextView;

    .line 152
    .line 153
    if-eqz v5, :cond_a

    .line 154
    .line 155
    check-cast v4, Landroid/widget/TextView;

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_a
    move-object v4, v2

    .line 159
    :goto_8
    if-eqz v4, :cond_b

    .line 160
    .line 161
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-eqz v4, :cond_b

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_b
    const-string v4, "getLastText"

    .line 175
    .line 176
    new-array v5, v3, [Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v1, v4, v5}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 183
    .line 184
    if-eqz v5, :cond_c

    .line 185
    .line 186
    check-cast v4, Ljava/lang/CharSequence;

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_c
    move-object v4, v2

    .line 190
    :goto_9
    if-eqz v4, :cond_d

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    :cond_d
    if-nez v2, :cond_e

    .line 197
    .line 198
    const-string v4, ""

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_e
    move-object v4, v2

    .line 202
    :goto_a
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-lez v2, :cond_f

    .line 207
    .line 208
    goto :goto_b

    .line 209
    :cond_f
    invoke-virtual {v0, v1}, Lab/f;->a(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    :cond_10
    :goto_b
    if-eqz v3, :cond_11

    .line 214
    .line 215
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_11
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
