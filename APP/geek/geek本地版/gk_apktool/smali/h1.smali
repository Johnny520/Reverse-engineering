.class public final Lh1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcg;Ljava/util/ArrayList;Lg40;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Lh1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lh1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/16 p3, 0x9

    iput p3, p0, Lh1;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lh1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lh1;->a:I

    iput-object p1, p0, Lh1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lh1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lh1;->a:I

    iput-object p1, p0, Lh1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lh1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lh1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lh1;->c:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 10
    .line 11
    iget-object v0, v2, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Lma0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lma0;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/view/View;

    .line 24
    .line 25
    sget-object v1, Lja0;->a:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-static {v0, p0}, Ls90;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lyk;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lyk;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    move-object v0, v2

    .line 40
    check-cast v0, Lrq;

    .line 41
    .line 42
    iget-object v3, v0, Lrq;->c:Lke;

    .line 43
    .line 44
    :cond_1
    :try_start_0
    iget-object v2, p0, Lh1;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/lang/Runnable;

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v2

    .line 53
    sget-object v4, Lwi;->a:Lwi;

    .line 54
    .line 55
    invoke-static {v4, v2}, Lff;->u(Lge;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {v0}, Lrq;->f()Ljava/lang/Runnable;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iput-object v2, p0, Lh1;->b:Ljava/lang/Object;

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    const/16 v2, 0x10

    .line 70
    .line 71
    if-lt v1, v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v3}, Lke;->e()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v3, v0, p0}, Lke;->d(Lge;Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    return-void

    .line 83
    :pswitch_2
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Li8;

    .line 86
    .line 87
    check-cast v2, Ljo;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Li8;->s(Lke;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_3
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    check-cast v2, Lg40;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    iget-object v0, v2, Lg40;->c:Lml;

    .line 109
    .line 110
    iget-object v0, v0, Lml;->E:Landroid/view/View;

    .line 111
    .line 112
    iget v1, v2, Lg40;->a:I

    .line 113
    .line 114
    invoke-static {v0, v1}, Lz30;->a(Landroid/view/View;I)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void

    .line 118
    :pswitch_4
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Ll0;

    .line 121
    .line 122
    check-cast v2, Landroid/graphics/Typeface;

    .line 123
    .line 124
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Lzt;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Lzt;->J(Landroid/graphics/Typeface;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    return-void

    .line 134
    :pswitch_5
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 135
    .line 136
    :try_start_1
    sget-object v1, Ls1;->d:Ljava/lang/reflect/Method;

    .line 137
    .line 138
    if-eqz v1, :cond_5

    .line 139
    .line 140
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 141
    .line 142
    const-string v4, "AppCompat recreation"

    .line 143
    .line 144
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_2

    .line 154
    :catch_0
    move-exception v0

    .line 155
    goto :goto_3

    .line 156
    :cond_5
    sget-object v1, Ls1;->e:Ljava/lang/reflect/Method;

    .line 157
    .line 158
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 159
    .line 160
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :goto_2
    const-string v1, "ActivityRecreator"

    .line 169
    .line 170
    const-string v2, "Exception while invoking performStopActivity"

    .line 171
    .line 172
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-class v2, Ljava/lang/RuntimeException;

    .line 181
    .line 182
    if-ne v1, v2, :cond_7

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_7

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const-string v2, "Unable to stop"

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-nez v1, :cond_6

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    throw v0

    .line 204
    :cond_7
    :goto_4
    return-void

    .line 205
    :pswitch_6
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Landroid/app/Application;

    .line 208
    .line 209
    check-cast v2, Lr1;

    .line 210
    .line 211
    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :pswitch_7
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lr1;

    .line 218
    .line 219
    iput-object v2, v0, Lr1;->a:Ljava/lang/Object;

    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_8
    iget-object v0, p0, Lh1;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lf1;

    .line 225
    .line 226
    check-cast v2, Lj1;

    .line 227
    .line 228
    iget-object v3, v2, Lj1;->c:Lku;

    .line 229
    .line 230
    if-eqz v3, :cond_8

    .line 231
    .line 232
    iget-object v4, v3, Lku;->e:Liu;

    .line 233
    .line 234
    if-eqz v4, :cond_8

    .line 235
    .line 236
    invoke-interface {v4, v3}, Liu;->k(Lku;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    iget-object v3, v2, Lj1;->h:Lfv;

    .line 240
    .line 241
    check-cast v3, Landroid/view/View;

    .line 242
    .line 243
    if-eqz v3, :cond_b

    .line 244
    .line 245
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    if-eqz v3, :cond_b

    .line 250
    .line 251
    invoke-virtual {v0}, Lwu;->b()Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_9

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_9
    iget-object v3, v0, Lwu;->e:Landroid/view/View;

    .line 259
    .line 260
    if-nez v3, :cond_a

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_a
    invoke-virtual {v0, v1, v1, v1, v1}, Lwu;->d(IIZZ)V

    .line 264
    .line 265
    .line 266
    :goto_5
    iput-object v0, v2, Lj1;->s:Lf1;

    .line 267
    .line 268
    :cond_b
    :goto_6
    const/4 v0, 0x0

    .line 269
    iput-object v0, v2, Lj1;->u:Lh1;

    .line 270
    .line 271
    return-void

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
