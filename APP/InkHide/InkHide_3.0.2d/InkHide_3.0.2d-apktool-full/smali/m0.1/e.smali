.class public final Lm0/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/lu/wxmask/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm0/e;->a:I

    .line 1
    iput-object p1, p0, Lm0/e;->c:Ljava/lang/Object;

    iput-object p2, p0, Lm0/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr0/t1;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 0

    const/4 p3, 0x2

    iput p3, p0, Lm0/e;->a:I

    iput-object p1, p0, Lm0/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm0/e;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr0/t1;Ljava/lang/ref/WeakReference;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm0/e;->a:I

    iput-object p1, p0, Lm0/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm0/e;->c:Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lm0/e;->a:I

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
    const-string v0, "param"

    .line 11
    .line 12
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    instance-of v2, v0, Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v3

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 35
    .line 36
    const-string v4, "this$0"

    .line 37
    .line 38
    invoke-interface {v2, p1, v4}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 46
    .line 47
    const-string v4, "codec"

    .line 48
    .line 49
    invoke-interface {v2, p1, v4}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 57
    .line 58
    .line 59
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 64
    .line 65
    const-string v2, "decodeMessage"

    .line 66
    .line 67
    invoke-interface {v1, p1, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, p0, Lm0/e;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lr0/t1;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    iget-object v2, p0, Lm0/e;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Landroid/app/Activity;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    :cond_5
    const-string v4, "flutter-message"

    .line 108
    .line 109
    invoke-virtual {v0, v1, v3, p1, v4}, Lr0/t1;->Z(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    invoke-virtual {v0, v1, v4}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2, v1}, Lr0/t1;->s(Landroid/app/Activity;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    :goto_1
    return-void

    .line 123
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, Landroid/content/Context;

    .line 126
    .line 127
    iget-object v0, p0, Lm0/e;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 130
    .line 131
    iget-object v1, p0, Lm0/e;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Lcom/lu/wxmask/MainHook;

    .line 134
    .line 135
    invoke-static {v1, p1, v0}, Lcom/lu/wxmask/MainHook;->c(Lcom/lu/wxmask/MainHook;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    iget v0, p0, Lm0/e;->a:I

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
    const-string v0, "param"

    .line 11
    .line 12
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    :cond_1
    move-object v4, v0

    .line 35
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, p0, Lm0/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v8, v2

    .line 40
    check-cast v8, Lr0/t1;

    .line 41
    .line 42
    invoke-static {v8, v0}, Lr0/t1;->b(Lr0/t1;[Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/content/Intent;

    .line 51
    .line 52
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v5, "voip"

    .line 66
    .line 67
    invoke-static {v2, v5, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ne v2, v3, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    if-eqz v0, :cond_a

    .line 75
    .line 76
    invoke-virtual {v8, v0}, Lr0/t1;->K(Landroid/content/Intent;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-ne v2, v3, :cond_a

    .line 81
    .line 82
    :goto_1
    invoke-static {v0}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {v8}, Lr0/t1;->S()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :cond_3
    move-object v9, v2

    .line 93
    invoke-static {}, Lr0/t1;->A()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    const-string v3, "enabled="

    .line 98
    .line 99
    invoke-static {v3, v2}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v2, "masked="

    .line 104
    .line 105
    invoke-static {v2, v9}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    :cond_4
    move-object v2, v0

    .line 118
    :cond_5
    invoke-static {v2}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v2, p0, Lm0/e;->c:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v3, v2

    .line 125
    check-cast v3, Ljava/lang/String;

    .line 126
    .line 127
    const-string v2, "voip service"

    .line 128
    .line 129
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    if-eqz v9, :cond_a

    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-nez v2, :cond_7

    .line 145
    .line 146
    :cond_6
    move-object v2, v0

    .line 147
    :cond_7
    invoke-static {v2}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const-string v3, "service:"

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v8, v9, v0, v2, v5}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v8, v9, v0}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v0, "block voip service"

    .line 171
    .line 172
    filled-new-array {v0, v4, v9}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v8, v0, v9}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 187
    .line 188
    if-eqz v0, :cond_9

    .line 189
    .line 190
    invoke-static {v0}, LF0/h;->d0([Ljava/lang/Object;)LR0/c;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :cond_8
    :goto_2
    move-object v2, v0

    .line 199
    check-cast v2, LR0/b;

    .line 200
    .line 201
    iget-boolean v2, v2, LR0/b;->c:Z

    .line 202
    .line 203
    if-eqz v2, :cond_9

    .line 204
    .line 205
    move-object v2, v0

    .line 206
    check-cast v2, LR0/b;

    .line 207
    .line 208
    invoke-virtual {v2}, LR0/b;->a()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 213
    .line 214
    aget-object v4, v3, v2

    .line 215
    .line 216
    instance-of v4, v4, Landroid/content/Intent;

    .line 217
    .line 218
    if-eqz v4, :cond_8

    .line 219
    .line 220
    aput-object v1, v3, v2

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_9
    const/4 v0, 0x2

    .line 224
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_a
    return-void

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
