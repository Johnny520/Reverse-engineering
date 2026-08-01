.class public final Lr0/R0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/Y0;


# direct methods
.method public synthetic constructor <init>(Lr0/Y0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/R0;->a:I

    iput-object p1, p0, Lr0/R0;->b:Lr0/Y0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lr0/R0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/app/Activity;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    sget-boolean v0, Lz0/i;->a:Z

    .line 26
    .line 27
    invoke-static {}, Lz0/g;->A()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lr0/R0;->b:Lr0/Y0;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p1, Lr0/Y0;->m:Z

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object v0, p0, Lr0/R0;->b:Lr0/Y0;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lr0/Y0;->z(Landroid/app/Activity;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput-boolean v1, v0, Lr0/Y0;->m:Z

    .line 49
    .line 50
    iget-object v0, p0, Lr0/R0;->b:Lr0/Y0;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lr0/Y0;->s(Landroid/app/Activity;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v1, p0, Lr0/R0;->b:Lr0/Y0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, Lr0/Y0;->x(Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lr0/R0;->b:Lr0/Y0;

    .line 68
    .line 69
    iget-boolean v0, v0, Lr0/Y0;->m:Z

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object v0, p0, Lr0/R0;->b:Lr0/Y0;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    new-instance v2, LA0/m;

    .line 91
    .line 92
    const/16 v3, 0x8

    .line 93
    .line 94
    invoke-direct {v2, v0, p1, v3}, LA0/m;-><init>(Le0/a;Landroid/app/Activity;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_1
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const-string v4, "param"

    .line 6
    .line 7
    iget v5, p0, Lr0/R0;->a:I

    .line 8
    .line 9
    packed-switch v5, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    return-void

    .line 13
    :pswitch_1
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 17
    .line 18
    instance-of v0, p1, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    check-cast v3, Landroid/app/Activity;

    .line 24
    .line 25
    :cond_0
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lr0/R0;->b:Lr0/Y0;

    .line 28
    .line 29
    iget-object p1, p1, Lr0/Y0;->i:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {p1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lr0/P0;

    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :pswitch_2
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 42
    .line 43
    instance-of v0, p1, Landroid/app/Activity;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move-object v3, p1

    .line 48
    check-cast v3, Landroid/app/Activity;

    .line 49
    .line 50
    :cond_2
    if-nez v3, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "com.tencent.mm.plugin.sns.ui.SnsUserUI"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, p0, Lr0/R0;->b:Lr0/Y0;

    .line 70
    .line 71
    iput-boolean v2, p1, Lr0/Y0;->m:Z

    .line 72
    .line 73
    :cond_4
    :goto_0
    return-void

    .line 74
    :pswitch_3
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v4, p0, Lr0/R0;->b:Lr0/Y0;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_5
    sget-boolean v5, Lz0/i;->a:Z

    .line 89
    .line 90
    invoke-static {}, Lz0/g;->A()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_7

    .line 95
    .line 96
    :cond_6
    :goto_1
    move v3, v2

    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_7
    const-string v5, "d"

    .line 100
    .line 101
    invoke-static {p1, v5}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    instance-of v7, v6, Landroid/app/Activity;

    .line 106
    .line 107
    if-eqz v7, :cond_8

    .line 108
    .line 109
    check-cast v6, Landroid/app/Activity;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_8
    move-object v6, v3

    .line 113
    :goto_2
    if-eqz v6, :cond_9

    .line 114
    .line 115
    invoke-static {v6}, Lr0/Y0;->z(Landroid/app/Activity;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_9

    .line 120
    .line 121
    iput-boolean v1, v4, Lr0/Y0;->m:Z

    .line 122
    .line 123
    :goto_3
    move v3, v1

    .line 124
    goto :goto_5

    .line 125
    :cond_9
    invoke-virtual {v4, p1}, Lr0/Y0;->B(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_a

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_a
    const-string v4, "n"

    .line 133
    .line 134
    invoke-static {p1, v4}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, Ljava/lang/Boolean;

    .line 139
    .line 140
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-static {v4, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_b

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_b
    const-string v4, "s"

    .line 150
    .line 151
    invoke-static {p1, v4}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v4, :cond_c

    .line 158
    .line 159
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    goto :goto_4

    .line 168
    :cond_c
    move-object v4, v3

    .line 169
    :goto_4
    if-eqz v4, :cond_6

    .line 170
    .line 171
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_d

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_d
    invoke-static {p1, v5}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    instance-of v6, v5, Landroid/app/Activity;

    .line 183
    .line 184
    if-eqz v6, :cond_e

    .line 185
    .line 186
    move-object v3, v5

    .line 187
    check-cast v3, Landroid/app/Activity;

    .line 188
    .line 189
    :cond_e
    if-nez v3, :cond_f

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_f
    invoke-static {v3}, Lr0/Y0;->t(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    :goto_5
    if-nez v3, :cond_10

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_10
    const-string v3, "e"

    .line 204
    .line 205
    invoke-static {p1, v3}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Ljava/util/List;

    .line 210
    .line 211
    if-nez v3, :cond_11

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_11
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    sub-int/2addr v4, v1

    .line 219
    :goto_6
    if-ge v0, v4, :cond_14

    .line 220
    .line 221
    invoke-static {v3, v4}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    if-nez v5, :cond_12

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_12
    invoke-static {v5}, Lz0/w;->m(Ljava/lang/Object;)Ljava/util/Set;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-nez v6, :cond_13

    .line 237
    .line 238
    sget-boolean v6, Lz0/i;->a:Z

    .line 239
    .line 240
    invoke-static {v5}, Lz0/g;->d(Ljava/util/Collection;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_13

    .line 245
    .line 246
    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    add-int/2addr v2, v1

    .line 250
    :cond_13
    :goto_7
    add-int/2addr v4, v0

    .line 251
    goto :goto_6

    .line 252
    :cond_14
    if-lez v2, :cond_16

    .line 253
    .line 254
    const-string v0, "r"

    .line 255
    .line 256
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-static {v3, v0}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-nez v0, :cond_15

    .line 273
    .line 274
    goto :goto_8

    .line 275
    :cond_15
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    .line 280
    .line 281
    :catchall_0
    :cond_16
    :goto_8
    return-void

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
