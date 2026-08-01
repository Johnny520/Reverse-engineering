.class public final Lr0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le0/a;


# direct methods
.method public synthetic constructor <init>(Le0/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/j;->a:I

    iput-object p1, p0, Lr0/j;->b:Le0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget p2, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "activity"

    .line 7
    .line 8
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string p2, "activity"

    .line 13
    .line 14
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    const-string p2, "activity"

    .line 19
    .line 20
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lr0/j;->b:Le0/a;

    .line 24
    .line 25
    check-cast p2, Lr0/t1;

    .line 26
    .line 27
    invoke-static {p2, p1}, Lr0/t1;->c(Lr0/t1;Landroid/app/Activity;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_2
    const-string p2, "activity"

    .line 32
    .line 33
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_3
    const-string p2, "activity"

    .line 38
    .line 39
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_4
    const-string p2, "activity"

    .line 44
    .line 45
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_5
    const-string p2, "activity"

    .line 50
    .line 51
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lr0/j;->b:Le0/a;

    .line 55
    .line 56
    check-cast p2, Lr0/k;

    .line 57
    .line 58
    const-string v0, "created"

    .line 59
    .line 60
    invoke-static {p2, p1, v0}, Lr0/k;->a(Lr0/k;Landroid/app/Activity;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string v0, "activity"

    .line 13
    .line 14
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 18
    .line 19
    check-cast v0, Lr0/A1;

    .line 20
    .line 21
    iget-object v1, v0, Lr0/A1;->a:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/app/Activity;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :goto_0
    if-ne v1, p1, :cond_1

    .line 35
    .line 36
    iput-object v2, v0, Lr0/A1;->a:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_1
    const-string v0, "activity"

    .line 40
    .line 41
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 45
    .line 46
    check-cast v0, Lr0/t1;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v0, Lr0/t1;->f:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 59
    .line 60
    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    iput-object p1, v0, Lr0/t1;->f:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 63
    .line 64
    :cond_3
    return-void

    .line 65
    :pswitch_2
    const-string v0, "activity"

    .line 66
    .line 67
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    const-string v0, "activity"

    .line 72
    .line 73
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4
    const-string v0, "activity"

    .line 78
    .line 79
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    const-string v0, "activity"

    .line 84
    .line 85
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string v0, "activity"

    .line 13
    .line 14
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    const-string v0, "activity"

    .line 19
    .line 20
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    const-string v0, "activity"

    .line 25
    .line 26
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_3
    const-string v0, "activity"

    .line 31
    .line 32
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_4
    const-string v0, "activity"

    .line 37
    .line 38
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 42
    .line 43
    check-cast v0, Lr0/y;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "com.tencent.mm"

    .line 53
    .line 54
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, v0, Lr0/y;->c:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :pswitch_5
    const-string v0, "activity"

    .line 68
    .line 69
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    .line 1
    iget v0, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string v0, "activity"

    .line 13
    .line 14
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lr0/j;->b:Le0/a;

    .line 39
    .line 40
    check-cast v1, Lr0/A1;

    .line 41
    .line 42
    iput-object v0, v1, Lr0/A1;->a:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v0, "search command launcher resumed"

    .line 53
    .line 54
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    :pswitch_1
    const-string v0, "activity"

    .line 63
    .line 64
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 68
    .line 69
    check-cast v0, Lr0/t1;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lr0/t1;->t(Landroid/app/Activity;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string v1, "callback-resumed"

    .line 82
    .line 83
    invoke-static {v0, p1, v1}, Lr0/t1;->a(Lr0/t1;Landroid/app/Activity;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_2
    const-string v0, "activity"

    .line 88
    .line 89
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 93
    .line 94
    check-cast v0, Lr0/l1;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-static {v0, p1}, Lr0/l1;->d(Lr0/l1;Landroid/app/Activity;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    return-void

    .line 109
    :pswitch_3
    const-string v0, "activity"

    .line 110
    .line 111
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 132
    .line 133
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lr0/j;->b:Le0/a;

    .line 137
    .line 138
    check-cast v1, Lr0/H0;

    .line 139
    .line 140
    iput-object v0, v1, Lr0/H0;->f:Ljava/lang/ref/WeakReference;

    .line 141
    .line 142
    invoke-static {}, Lr0/H0;->u()Lr0/z0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v2, Lr0/z0;->d:Lr0/z0;

    .line 147
    .line 148
    if-ne v0, v2, :cond_4

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    new-instance v2, Lr0/F0;

    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    invoke-direct {v2, v1, p1, v3}, Lr0/F0;-><init>(Lr0/H0;Landroid/app/Activity;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 169
    .line 170
    .line 171
    :cond_4
    invoke-static {}, Lr0/H0;->T0()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_5

    .line 176
    .line 177
    invoke-static {}, Lr0/H0;->Y0()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    :cond_5
    const-string p1, "activity-resumed"

    .line 184
    .line 185
    invoke-virtual {v1, p1}, Lr0/H0;->x(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :cond_6
    :goto_1
    return-void

    .line 189
    :pswitch_4
    const-string v0, "activity"

    .line 190
    .line 191
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 195
    .line 196
    check-cast v0, Lr0/y;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    const-string v2, "com.tencent.mm"

    .line 206
    .line 207
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-nez v1, :cond_7

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_7
    const/4 v1, 0x0

    .line 215
    iput-boolean v1, v0, Lr0/y;->e:Z

    .line 216
    .line 217
    iget-object v0, v0, Lr0/y;->c:Ljava/util/Set;

    .line 218
    .line 219
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    :goto_2
    return-void

    .line 223
    :pswitch_5
    const-string v0, "activity"

    .line 224
    .line 225
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 229
    .line 230
    check-cast v0, Lr0/k;

    .line 231
    .line 232
    const-string v1, "resumed"

    .line 233
    .line 234
    invoke-static {v0, p1, v1}, Lr0/k;->a(Lr0/k;Landroid/app/Activity;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget v0, p0, Lr0/j;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_1
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_2
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_3
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_4
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_5
    const-string v0, "activity"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 12
    .line 13
    check-cast v0, Lr0/M1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "com.tencent.mm"

    .line 23
    .line 24
    invoke-static {p1, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget p1, v0, Lr0/M1;->e:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, v0, Lr0/M1;->e:I

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    const-string v0, "activity"

    .line 39
    .line 40
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    const-string v0, "activity"

    .line 45
    .line 46
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_2
    const-string v0, "activity"

    .line 51
    .line 52
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_3
    const-string v0, "activity"

    .line 57
    .line 58
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_4
    const-string v0, "activity"

    .line 63
    .line 64
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_5
    const-string v0, "activity"

    .line 69
    .line 70
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 12
    .line 13
    check-cast v0, Lr0/M1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "com.tencent.mm"

    .line 23
    .line 24
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget v1, v0, Lr0/M1;->e:I

    .line 32
    .line 33
    if-lez v1, :cond_1

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    iput v1, v0, Lr0/M1;->e:I

    .line 38
    .line 39
    :cond_1
    iget v0, v0, Lr0/M1;->e:I

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-static {p1}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :pswitch_0
    const-string v0, "activity"

    .line 48
    .line 49
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    const-string v0, "activity"

    .line 54
    .line 55
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    const-string v0, "activity"

    .line 60
    .line 61
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    const-string v0, "activity"

    .line 66
    .line 67
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_4
    const-string v0, "activity"

    .line 72
    .line 73
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lr0/j;->b:Le0/a;

    .line 77
    .line 78
    check-cast v0, Lr0/y;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v1, "com.tencent.mm"

    .line 88
    .line 89
    invoke-static {p1, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-boolean p1, v0, Lr0/y;->e:Z

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    iget-object p1, v0, Lr0/y;->c:Ljava/util/Set;

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    iget-object p1, v0, Lr0/y;->d:Lr0/w;

    .line 110
    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    const-string v0, "background"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lr0/w;->j(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_1
    return-void

    .line 119
    :pswitch_5
    const-string v0, "activity"

    .line 120
    .line 121
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
