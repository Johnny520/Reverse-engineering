.class public final Ly8/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly8/d;


# direct methods
.method public synthetic constructor <init>(Ly8/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly8/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ly8/b;->b:Ly8/d;

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
    .locals 9

    .line 1
    iget v0, p0, Ly8/b;->a:I

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
    iget-object v0, p0, Ly8/b;->b:Ly8/d;

    .line 11
    .line 12
    iget-object v1, v0, Ly8/d;->a:Lia/t;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    instance-of v2, p1, Landroid/app/Activity;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast p1, Landroid/app/Activity;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v3

    .line 28
    :goto_0
    if-eqz p1, :cond_c

    .line 29
    .line 30
    iget-object v2, v0, Ly8/d;->g:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    const-string v4, "androidx.viewpager.widget.ViewPager$OnPageChangeListener"

    .line 33
    .line 34
    invoke-static {p1, v4}, Ly8/d;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x1

    .line 39
    if-eqz v4, :cond_5

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const-string v7, "onPageSelected"

    .line 55
    .line 56
    invoke-static {v4, v7, v6}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, Ly8/d;->a(Ljava/lang/reflect/Method;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    iget-boolean v2, v0, Ly8/d;->h:Z

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    iput-boolean v5, v0, Ly8/d;->h:Z

    .line 72
    .line 73
    const-string v2, "\u672a\u627e\u5230\u804a\u5929\u5a92\u4f53\u7ffb\u9875\u56de\u8c03"

    .line 74
    .line 75
    invoke-virtual {v1, v2, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    :try_start_0
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 90
    .line 91
    new-instance v7, Ly8/b;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-direct {v7, v0, v8}, Ly8/b;-><init>(Ly8/d;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v4, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 98
    .line 99
    .line 100
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception v6

    .line 103
    new-instance v7, Lsf/f;

    .line 104
    .line 105
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object v6, v7

    .line 109
    :goto_1
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    if-eqz v6, :cond_7

    .line 114
    .line 115
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    iget-boolean v2, v0, Ly8/d;->h:Z

    .line 119
    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    iput-boolean v5, v0, Ly8/d;->h:Z

    .line 124
    .line 125
    const-string v2, "\u5b89\u88c5\u804a\u5929\u5a92\u4f53\u7ffb\u9875 Hook \u5931\u8d25"

    .line 126
    .line 127
    invoke-virtual {v1, v2, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    iget-boolean v2, v0, Ly8/d;->h:Z

    .line 132
    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    iput-boolean v5, v0, Ly8/d;->h:Z

    .line 137
    .line 138
    const-string v2, "\u672a\u627e\u5230\u804a\u5929\u5a92\u4f53\u7ffb\u9875\u76d1\u542c\u5668"

    .line 139
    .line 140
    invoke-virtual {v1, v2, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_7
    :goto_2
    const-string v1, "com.tencent.mm.ui.base.MMViewPager"

    .line 144
    .line 145
    invoke-static {p1, v1}, Ly8/d;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v4, "getCurrentItem"

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    new-array v6, v5, [Ljava/lang/Class;

    .line 159
    .line 160
    invoke-static {v2, v4, v6}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_9

    .line 165
    .line 166
    new-array v4, v5, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-static {v2, v1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    instance-of v2, v1, Ljava/lang/Number;

    .line 173
    .line 174
    if-eqz v2, :cond_8

    .line 175
    .line 176
    check-cast v1, Ljava/lang/Number;

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_8
    move-object v1, v3

    .line 180
    :goto_3
    if-eqz v1, :cond_9

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :cond_9
    if-eqz v3, :cond_a

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    goto :goto_4

    .line 197
    :cond_a
    iget-object v1, v0, Ly8/d;->e:Ljava/util/WeakHashMap;

    .line 198
    .line 199
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Ljava/lang/Integer;

    .line 204
    .line 205
    if-eqz v1, :cond_b

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    goto :goto_4

    .line 212
    :cond_b
    const/high16 v1, -0x80000000

    .line 213
    .line 214
    :goto_4
    const-wide/16 v2, 0x0

    .line 215
    .line 216
    invoke-virtual {v0, p1, v1, v2, v3}, Ly8/d;->c(Landroid/app/Activity;IJ)V

    .line 217
    .line 218
    .line 219
    :cond_c
    return-void

    .line 220
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const-string v1, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"

    .line 229
    .line 230
    invoke-static {v0, v1}, Ly8/d;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    instance-of v1, v0, Landroid/app/Activity;

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    if-eqz v1, :cond_d

    .line 238
    .line 239
    check-cast v0, Landroid/app/Activity;

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_d
    move-object v0, v2

    .line 243
    :goto_5
    if-eqz v0, :cond_f

    .line 244
    .line 245
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    instance-of v1, p1, Ljava/lang/Number;

    .line 255
    .line 256
    if-eqz v1, :cond_e

    .line 257
    .line 258
    move-object v2, p1

    .line 259
    check-cast v2, Ljava/lang/Number;

    .line 260
    .line 261
    :cond_e
    if-eqz v2, :cond_f

    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    const-wide/16 v1, 0x50

    .line 268
    .line 269
    iget-object v3, p0, Ly8/b;->b:Ly8/d;

    .line 270
    .line 271
    invoke-virtual {v3, v0, p1, v1, v2}, Ly8/d;->c(Landroid/app/Activity;IJ)V

    .line 272
    .line 273
    .line 274
    :cond_f
    return-void

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Ly8/b;->a:I

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v0, p1, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Landroid/app/Activity;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Ly8/b;->b:Ly8/d;

    .line 26
    .line 27
    iget-object v1, v0, Ly8/d;->d:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Runnable;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v2, v0, Ly8/d;->c:Landroid/os/Handler;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v1, v0, Ly8/d;->e:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Ly8/d;->f:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
