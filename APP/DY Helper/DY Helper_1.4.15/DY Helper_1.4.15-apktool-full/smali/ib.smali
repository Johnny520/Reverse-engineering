.class public final synthetic Lib;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lib;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final α(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object p0, Lsb;->α:Lsb;

    .line 2
    .line 3
    const-string v0, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    instance-of v3, p1, Landroid/app/Activity;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast p1, Landroid/app/Activity;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v1

    .line 25
    :goto_0
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lsb;->Π(Landroid/app/Activity;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lsb;->η(Landroid/app/Activity;)V

    .line 56
    .line 57
    .line 58
    sget-boolean v0, Lsb;->ν:Z

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lsb;->θ()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_1
    if-eqz v1, :cond_2

    .line 76
    .line 77
    new-instance p0, Lhb;

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    invoke-direct {p0, v1, p1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-object v2

    .line 87
    :catchall_0
    move-exception v2

    .line 88
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    instance-of v3, p1, Landroid/app/Activity;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    check-cast p1, Landroid/app/Activity;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object p1, v1

    .line 100
    :goto_1
    if-eqz p1, :cond_5

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 121
    .line 122
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Lsb;->Π(Landroid/app/Activity;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lsb;->η(Landroid/app/Activity;)V

    .line 131
    .line 132
    .line 133
    sget-boolean v0, Lsb;->ν:Z

    .line 134
    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {p0}, Lsb;->θ()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :cond_4
    if-eqz v1, :cond_5

    .line 151
    .line 152
    new-instance p0, Lhb;

    .line 153
    .line 154
    const/4 p1, 0x1

    .line 155
    invoke-direct {p0, v1, p1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    throw v2
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lib;->α:I

    .line 2
    .line 3
    const v1, 0x7f0dba1a

    .line 4
    .line 5
    .line 6
    const v2, 0x7f0dba11

    .line 7
    .line 8
    .line 9
    const v3, 0x7f0dba13    # 1.883873E38f

    .line 10
    .line 11
    .line 12
    const/high16 v4, 0x3f800000    # 1.0f

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/16 v6, 0xa

    .line 16
    .line 17
    const/4 v7, 0x7

    .line 18
    const/4 v8, 0x0

    .line 19
    const/16 v9, 0x8

    .line 20
    .line 21
    const/4 v10, 0x3

    .line 22
    const/4 v11, 0x0

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    const-string p0, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    instance-of v1, p1, Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    move-object v11, p1

    .line 44
    check-cast v11, Landroid/app/Activity;

    .line 45
    .line 46
    :cond_0
    if-eqz v11, :cond_1

    .line 47
    .line 48
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    instance-of v1, p1, Landroid/app/Activity;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    move-object v11, p1

    .line 74
    check-cast v11, Landroid/app/Activity;

    .line 75
    .line 76
    :cond_2
    if-eqz v11, :cond_3

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_3
    throw v0

    .line 94
    :pswitch_0
    invoke-direct {p0, p1}, Lib;->α(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_1
    sget-object p0, Lsb;->α:Lsb;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    :try_start_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 108
    sget v0, Lsb;->τ:I

    .line 109
    .line 110
    if-gtz v0, :cond_6

    .line 111
    .line 112
    sget-boolean v0, Lsb;->ο:Z

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of v0, p1, Landroid/view/View;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    check-cast p1, Landroid/view/View;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    move-object p1, v11

    .line 128
    :goto_0
    if-eqz p1, :cond_6

    .line 129
    .line 130
    invoke-static {p1, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Lsb;->ο(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    instance-of p1, p0, Landroid/view/View;

    .line 137
    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    move-object v11, p0

    .line 141
    check-cast v11, Landroid/view/View;

    .line 142
    .line 143
    :cond_5
    if-eqz v11, :cond_6

    .line 144
    .line 145
    sget p1, Lsb;->τ:I

    .line 146
    .line 147
    add-int/lit8 p1, p1, 0x1

    .line 148
    .line 149
    sput p1, Lsb;->τ:I

    .line 150
    .line 151
    :try_start_2
    invoke-static {v11}, Lsb;->π(Landroid/view/View;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_1
    move-exception p1

    .line 156
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v1, "r45c6ac9dd9e8fd7"

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 175
    .line 176
    .line 177
    :goto_1
    sget p1, Lsb;->τ:I

    .line 178
    .line 179
    add-int/lit8 p1, p1, -0x1

    .line 180
    .line 181
    sput p1, Lsb;->τ:I

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :catchall_2
    move-exception p0

    .line 185
    sget p1, Lsb;->τ:I

    .line 186
    .line 187
    add-int/lit8 p1, p1, -0x1

    .line 188
    .line 189
    sput p1, Lsb;->τ:I

    .line 190
    .line 191
    throw p0

    .line 192
    :cond_6
    :goto_2
    return-object p0

    .line 193
    :catchall_3
    move-exception p0

    .line 194
    sget v0, Lsb;->τ:I

    .line 195
    .line 196
    if-gtz v0, :cond_8

    .line 197
    .line 198
    sget-boolean v0, Lsb;->ο:Z

    .line 199
    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    instance-of v0, p1, Landroid/view/View;

    .line 207
    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    move-object v11, p1

    .line 211
    check-cast v11, Landroid/view/View;

    .line 212
    .line 213
    :cond_7
    if-eqz v11, :cond_8

    .line 214
    .line 215
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {v11}, Lsb;->ο(Landroid/view/View;)V

    .line 219
    .line 220
    .line 221
    :cond_8
    throw p0

    .line 222
    :pswitch_2
    const-string p0, "rcba09e631c0d0743"

    .line 223
    .line 224
    sget-object v0, Lsb;->α:Lsb;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :try_start_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 233
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    instance-of v1, p1, Landroid/view/View;

    .line 238
    .line 239
    if-eqz v1, :cond_9

    .line 240
    .line 241
    move-object v11, p1

    .line 242
    check-cast v11, Landroid/view/View;

    .line 243
    .line 244
    :cond_9
    if-eqz v11, :cond_a

    .line 245
    .line 246
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 247
    .line 248
    .line 249
    sget-boolean p1, Lsb;->ο:Z

    .line 250
    .line 251
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    new-instance v2, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sget-boolean p0, Lsb;->ο:Z

    .line 278
    .line 279
    if-eqz p0, :cond_a

    .line 280
    .line 281
    new-instance p0, Lhb;

    .line 282
    .line 283
    invoke-direct {p0, v11, v9}, Lhb;-><init>(Landroid/view/View;I)V

    .line 284
    .line 285
    .line 286
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    return-object v0

    .line 290
    :catchall_4
    move-exception v0

    .line 291
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    instance-of v1, p1, Landroid/view/View;

    .line 296
    .line 297
    if-eqz v1, :cond_b

    .line 298
    .line 299
    move-object v11, p1

    .line 300
    check-cast v11, Landroid/view/View;

    .line 301
    .line 302
    :cond_b
    if-eqz v11, :cond_c

    .line 303
    .line 304
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 305
    .line 306
    .line 307
    sget-boolean p1, Lsb;->ο:Z

    .line 308
    .line 309
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    new-instance v2, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    sget-boolean p0, Lsb;->ο:Z

    .line 336
    .line 337
    if-eqz p0, :cond_c

    .line 338
    .line 339
    new-instance p0, Lhb;

    .line 340
    .line 341
    invoke-direct {p0, v11, v9}, Lhb;-><init>(Landroid/view/View;I)V

    .line 342
    .line 343
    .line 344
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 345
    .line 346
    .line 347
    :cond_c
    throw v0

    .line 348
    :pswitch_3
    sget-object p0, Lsb;->α:Lsb;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    :try_start_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 357
    sget v0, Lsb;->τ:I

    .line 358
    .line 359
    if-gtz v0, :cond_e

    .line 360
    .line 361
    sget-boolean v0, Lsb;->ν:Z

    .line 362
    .line 363
    if-eqz v0, :cond_e

    .line 364
    .line 365
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    instance-of v0, p1, Landroid/view/View;

    .line 370
    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    move-object v11, p1

    .line 374
    check-cast v11, Landroid/view/View;

    .line 375
    .line 376
    :cond_d
    if-eqz v11, :cond_e

    .line 377
    .line 378
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-eqz p1, :cond_e

    .line 383
    .line 384
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 385
    .line 386
    .line 387
    invoke-static {}, Lsb;->Η()Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-eqz p1, :cond_e

    .line 392
    .line 393
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 394
    .line 395
    .line 396
    :cond_e
    return-object p0

    .line 397
    :catchall_5
    move-exception p0

    .line 398
    sget v0, Lsb;->τ:I

    .line 399
    .line 400
    if-gtz v0, :cond_10

    .line 401
    .line 402
    sget-boolean v0, Lsb;->ν:Z

    .line 403
    .line 404
    if-eqz v0, :cond_10

    .line 405
    .line 406
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    instance-of v0, p1, Landroid/view/View;

    .line 411
    .line 412
    if-eqz v0, :cond_f

    .line 413
    .line 414
    move-object v11, p1

    .line 415
    check-cast v11, Landroid/view/View;

    .line 416
    .line 417
    :cond_f
    if-eqz v11, :cond_10

    .line 418
    .line 419
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 420
    .line 421
    .line 422
    move-result p1

    .line 423
    if-eqz p1, :cond_10

    .line 424
    .line 425
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 426
    .line 427
    .line 428
    invoke-static {}, Lsb;->Η()Z

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    if-eqz p1, :cond_10

    .line 433
    .line 434
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 435
    .line 436
    .line 437
    :cond_10
    throw p0

    .line 438
    :pswitch_4
    sget-object p0, Lsb;->α:Lsb;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    sget p0, Lsb;->τ:I

    .line 444
    .line 445
    if-gtz p0, :cond_19

    .line 446
    .line 447
    invoke-static {}, Lsb;->Η()Z

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    if-nez p0, :cond_11

    .line 452
    .line 453
    goto/16 :goto_5

    .line 454
    .line 455
    :cond_11
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    instance-of v0, p0, Landroid/view/View;

    .line 460
    .line 461
    if-eqz v0, :cond_12

    .line 462
    .line 463
    move-object v11, p0

    .line 464
    check-cast v11, Landroid/view/View;

    .line 465
    .line 466
    :cond_12
    if-nez v11, :cond_13

    .line 467
    .line 468
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    goto/16 :goto_6

    .line 473
    .line 474
    :cond_13
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    if-nez p0, :cond_18

    .line 479
    .line 480
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 481
    .line 482
    .line 483
    move-result p0

    .line 484
    if-nez p0, :cond_14

    .line 485
    .line 486
    goto/16 :goto_4

    .line 487
    .line 488
    :cond_14
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    new-array v0, v8, [Ljava/lang/Object;

    .line 499
    .line 500
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    aput-object v0, p0, v8

    .line 509
    .line 510
    :try_start_6
    invoke-interface {p1, p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 514
    sget p1, Lsb;->τ:I

    .line 515
    .line 516
    if-gtz p1, :cond_1a

    .line 517
    .line 518
    invoke-static {}, Lsb;->Η()Z

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    if-eqz p1, :cond_1a

    .line 523
    .line 524
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    if-nez p1, :cond_1a

    .line 529
    .line 530
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    if-eqz p1, :cond_1a

    .line 535
    .line 536
    invoke-virtual {v11}, Landroid/view/View;->getTranslationY()F

    .line 537
    .line 538
    .line 539
    move-result p1

    .line 540
    cmpg-float p1, p1, v5

    .line 541
    .line 542
    if-nez p1, :cond_15

    .line 543
    .line 544
    goto :goto_6

    .line 545
    :cond_15
    sget p1, Lsb;->τ:I

    .line 546
    .line 547
    add-int/lit8 p1, p1, 0x1

    .line 548
    .line 549
    sput p1, Lsb;->τ:I

    .line 550
    .line 551
    :try_start_7
    invoke-virtual {v11, v5}, Landroid/view/View;->setTranslationY(F)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 552
    .line 553
    .line 554
    sget p1, Lsb;->τ:I

    .line 555
    .line 556
    add-int/lit8 p1, p1, -0x1

    .line 557
    .line 558
    sput p1, Lsb;->τ:I

    .line 559
    .line 560
    goto :goto_6

    .line 561
    :catchall_6
    move-exception p0

    .line 562
    sget p1, Lsb;->τ:I

    .line 563
    .line 564
    add-int/lit8 p1, p1, -0x1

    .line 565
    .line 566
    sput p1, Lsb;->τ:I

    .line 567
    .line 568
    throw p0

    .line 569
    :catchall_7
    move-exception p0

    .line 570
    sget p1, Lsb;->τ:I

    .line 571
    .line 572
    if-gtz p1, :cond_17

    .line 573
    .line 574
    invoke-static {}, Lsb;->Η()Z

    .line 575
    .line 576
    .line 577
    move-result p1

    .line 578
    if-eqz p1, :cond_17

    .line 579
    .line 580
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    if-nez p1, :cond_17

    .line 585
    .line 586
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 587
    .line 588
    .line 589
    move-result p1

    .line 590
    if-eqz p1, :cond_17

    .line 591
    .line 592
    invoke-virtual {v11}, Landroid/view/View;->getTranslationY()F

    .line 593
    .line 594
    .line 595
    move-result p1

    .line 596
    cmpg-float p1, p1, v5

    .line 597
    .line 598
    if-nez p1, :cond_16

    .line 599
    .line 600
    goto :goto_3

    .line 601
    :cond_16
    sget p1, Lsb;->τ:I

    .line 602
    .line 603
    add-int/lit8 p1, p1, 0x1

    .line 604
    .line 605
    sput p1, Lsb;->τ:I

    .line 606
    .line 607
    :try_start_8
    invoke-virtual {v11, v5}, Landroid/view/View;->setTranslationY(F)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 608
    .line 609
    .line 610
    sget p1, Lsb;->τ:I

    .line 611
    .line 612
    add-int/lit8 p1, p1, -0x1

    .line 613
    .line 614
    sput p1, Lsb;->τ:I

    .line 615
    .line 616
    goto :goto_3

    .line 617
    :catchall_8
    move-exception p0

    .line 618
    sget p1, Lsb;->τ:I

    .line 619
    .line 620
    add-int/lit8 p1, p1, -0x1

    .line 621
    .line 622
    sput p1, Lsb;->τ:I

    .line 623
    .line 624
    throw p0

    .line 625
    :cond_17
    :goto_3
    throw p0

    .line 626
    :cond_18
    :goto_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    goto :goto_6

    .line 631
    :cond_19
    :goto_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    :cond_1a
    :goto_6
    return-object p0

    .line 636
    :pswitch_5
    sget-object p0, Lsb;->α:Lsb;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    sget p0, Lsb;->τ:I

    .line 642
    .line 643
    if-gtz p0, :cond_20

    .line 644
    .line 645
    sget-boolean p0, Lsb;->ν:Z

    .line 646
    .line 647
    if-nez p0, :cond_1b

    .line 648
    .line 649
    goto :goto_7

    .line 650
    :cond_1b
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    instance-of v0, p0, Landroid/view/View;

    .line 655
    .line 656
    if-eqz v0, :cond_1c

    .line 657
    .line 658
    move-object v11, p0

    .line 659
    check-cast v11, Landroid/view/View;

    .line 660
    .line 661
    :cond_1c
    if-nez v11, :cond_1d

    .line 662
    .line 663
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    goto :goto_8

    .line 668
    :cond_1d
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 669
    .line 670
    .line 671
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object p0

    .line 675
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    new-array v0, v8, [Ljava/lang/Object;

    .line 679
    .line 680
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object p0

    .line 684
    invoke-static {}, Lsb;->Η()Z

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    if-eqz v0, :cond_1e

    .line 689
    .line 690
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    aput-object v0, p0, v8

    .line 695
    .line 696
    :cond_1e
    :try_start_9
    invoke-interface {p1, p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 700
    sget p1, Lsb;->τ:I

    .line 701
    .line 702
    if-gtz p1, :cond_21

    .line 703
    .line 704
    sget-boolean p1, Lsb;->ν:Z

    .line 705
    .line 706
    if-eqz p1, :cond_21

    .line 707
    .line 708
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 709
    .line 710
    .line 711
    goto :goto_8

    .line 712
    :catchall_9
    move-exception p0

    .line 713
    sget p1, Lsb;->τ:I

    .line 714
    .line 715
    if-gtz p1, :cond_1f

    .line 716
    .line 717
    sget-boolean p1, Lsb;->ν:Z

    .line 718
    .line 719
    if-eqz p1, :cond_1f

    .line 720
    .line 721
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 722
    .line 723
    .line 724
    :cond_1f
    throw p0

    .line 725
    :cond_20
    :goto_7
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    :cond_21
    :goto_8
    return-object p0

    .line 730
    :pswitch_6
    sget-object p0, Lsb;->α:Lsb;

    .line 731
    .line 732
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    sget p0, Lsb;->τ:I

    .line 736
    .line 737
    if-gtz p0, :cond_27

    .line 738
    .line 739
    sget-boolean p0, Lsb;->ν:Z

    .line 740
    .line 741
    if-nez p0, :cond_22

    .line 742
    .line 743
    goto :goto_9

    .line 744
    :cond_22
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object p0

    .line 748
    instance-of v0, p0, Landroid/view/View;

    .line 749
    .line 750
    if-eqz v0, :cond_23

    .line 751
    .line 752
    move-object v11, p0

    .line 753
    check-cast v11, Landroid/view/View;

    .line 754
    .line 755
    :cond_23
    if-nez v11, :cond_24

    .line 756
    .line 757
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    goto :goto_a

    .line 762
    :cond_24
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 763
    .line 764
    .line 765
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object p0

    .line 769
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    new-array v0, v8, [Ljava/lang/Object;

    .line 773
    .line 774
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object p0

    .line 778
    invoke-static {}, Lsb;->Η()Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_25

    .line 783
    .line 784
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    aput-object v0, p0, v8

    .line 789
    .line 790
    :cond_25
    :try_start_a
    invoke-interface {p1, p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 794
    sget p1, Lsb;->τ:I

    .line 795
    .line 796
    if-gtz p1, :cond_28

    .line 797
    .line 798
    sget-boolean p1, Lsb;->ν:Z

    .line 799
    .line 800
    if-eqz p1, :cond_28

    .line 801
    .line 802
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 803
    .line 804
    .line 805
    goto :goto_a

    .line 806
    :catchall_a
    move-exception p0

    .line 807
    sget p1, Lsb;->τ:I

    .line 808
    .line 809
    if-gtz p1, :cond_26

    .line 810
    .line 811
    sget-boolean p1, Lsb;->ν:Z

    .line 812
    .line 813
    if-eqz p1, :cond_26

    .line 814
    .line 815
    invoke-static {v11}, Lsb;->б(Landroid/view/View;)V

    .line 816
    .line 817
    .line 818
    :cond_26
    throw p0

    .line 819
    :cond_27
    :goto_9
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object p0

    .line 823
    :cond_28
    :goto_a
    return-object p0

    .line 824
    :pswitch_7
    sget-object p0, Lsb;->α:Lsb;

    .line 825
    .line 826
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    const/16 p0, 0x9

    .line 830
    .line 831
    :try_start_b
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 835
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    instance-of v1, p1, Landroid/view/View;

    .line 840
    .line 841
    if-eqz v1, :cond_29

    .line 842
    .line 843
    move-object v11, p1

    .line 844
    check-cast v11, Landroid/view/View;

    .line 845
    .line 846
    :cond_29
    if-eqz v11, :cond_2a

    .line 847
    .line 848
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 849
    .line 850
    .line 851
    sget-boolean p1, Lsb;->ν:Z

    .line 852
    .line 853
    if-eqz p1, :cond_2a

    .line 854
    .line 855
    new-instance p1, Ljb;

    .line 856
    .line 857
    invoke-direct {p1, v11, p0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 861
    .line 862
    .line 863
    :cond_2a
    return-object v0

    .line 864
    :catchall_b
    move-exception v0

    .line 865
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object p1

    .line 869
    instance-of v1, p1, Landroid/view/View;

    .line 870
    .line 871
    if-eqz v1, :cond_2b

    .line 872
    .line 873
    move-object v11, p1

    .line 874
    check-cast v11, Landroid/view/View;

    .line 875
    .line 876
    :cond_2b
    if-eqz v11, :cond_2c

    .line 877
    .line 878
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 879
    .line 880
    .line 881
    sget-boolean p1, Lsb;->ν:Z

    .line 882
    .line 883
    if-eqz p1, :cond_2c

    .line 884
    .line 885
    new-instance p1, Ljb;

    .line 886
    .line 887
    invoke-direct {p1, v11, p0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 891
    .line 892
    .line 893
    :cond_2c
    throw v0

    .line 894
    :pswitch_8
    sget-object p0, Lsb;->α:Lsb;

    .line 895
    .line 896
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    :try_start_c
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 903
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object p1

    .line 907
    instance-of v0, p1, Landroid/view/View;

    .line 908
    .line 909
    if-eqz v0, :cond_2d

    .line 910
    .line 911
    move-object v11, p1

    .line 912
    check-cast v11, Landroid/view/View;

    .line 913
    .line 914
    :cond_2d
    if-eqz v11, :cond_2e

    .line 915
    .line 916
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 917
    .line 918
    .line 919
    sget-boolean p1, Lsb;->ν:Z

    .line 920
    .line 921
    if-eqz p1, :cond_2e

    .line 922
    .line 923
    new-instance p1, Ljb;

    .line 924
    .line 925
    invoke-direct {p1, v11, v6}, Ljb;-><init>(Landroid/view/View;I)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 929
    .line 930
    .line 931
    :cond_2e
    return-object p0

    .line 932
    :catchall_c
    move-exception p0

    .line 933
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object p1

    .line 937
    instance-of v0, p1, Landroid/view/View;

    .line 938
    .line 939
    if-eqz v0, :cond_2f

    .line 940
    .line 941
    move-object v11, p1

    .line 942
    check-cast v11, Landroid/view/View;

    .line 943
    .line 944
    :cond_2f
    if-eqz v11, :cond_30

    .line 945
    .line 946
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 947
    .line 948
    .line 949
    sget-boolean p1, Lsb;->ν:Z

    .line 950
    .line 951
    if-eqz p1, :cond_30

    .line 952
    .line 953
    new-instance p1, Ljb;

    .line 954
    .line 955
    invoke-direct {p1, v11, v6}, Ljb;-><init>(Landroid/view/View;I)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 959
    .line 960
    .line 961
    :cond_30
    throw p0

    .line 962
    :pswitch_9
    sget-object p0, Lsb;->α:Lsb;

    .line 963
    .line 964
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    const/4 p0, 0x6

    .line 968
    :try_start_d
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 972
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object p1

    .line 976
    instance-of v1, p1, Landroid/view/View;

    .line 977
    .line 978
    if-eqz v1, :cond_31

    .line 979
    .line 980
    move-object v11, p1

    .line 981
    check-cast v11, Landroid/view/View;

    .line 982
    .line 983
    :cond_31
    if-eqz v11, :cond_32

    .line 984
    .line 985
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 986
    .line 987
    .line 988
    sget-boolean p1, Lsb;->ν:Z

    .line 989
    .line 990
    if-eqz p1, :cond_32

    .line 991
    .line 992
    new-instance p1, Ljb;

    .line 993
    .line 994
    invoke-direct {p1, v11, p0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 998
    .line 999
    .line 1000
    :cond_32
    return-object v0

    .line 1001
    :catchall_d
    move-exception v0

    .line 1002
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object p1

    .line 1006
    instance-of v1, p1, Landroid/view/View;

    .line 1007
    .line 1008
    if-eqz v1, :cond_33

    .line 1009
    .line 1010
    move-object v11, p1

    .line 1011
    check-cast v11, Landroid/view/View;

    .line 1012
    .line 1013
    :cond_33
    if-eqz v11, :cond_34

    .line 1014
    .line 1015
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1016
    .line 1017
    .line 1018
    sget-boolean p1, Lsb;->ν:Z

    .line 1019
    .line 1020
    if-eqz p1, :cond_34

    .line 1021
    .line 1022
    new-instance p1, Ljb;

    .line 1023
    .line 1024
    invoke-direct {p1, v11, p0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1028
    .line 1029
    .line 1030
    :cond_34
    throw v0

    .line 1031
    :pswitch_a
    sget-object p0, Lsb;->α:Lsb;

    .line 1032
    .line 1033
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    const/16 p0, 0xb

    .line 1037
    .line 1038
    :try_start_e
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1042
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object p1

    .line 1046
    instance-of v1, p1, Landroid/view/View;

    .line 1047
    .line 1048
    if-eqz v1, :cond_35

    .line 1049
    .line 1050
    move-object v11, p1

    .line 1051
    check-cast v11, Landroid/view/View;

    .line 1052
    .line 1053
    :cond_35
    if-eqz v11, :cond_36

    .line 1054
    .line 1055
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1056
    .line 1057
    .line 1058
    sget-boolean p1, Lsb;->ν:Z

    .line 1059
    .line 1060
    if-eqz p1, :cond_36

    .line 1061
    .line 1062
    new-instance p1, Lhb;

    .line 1063
    .line 1064
    invoke-direct {p1, v11, p0}, Lhb;-><init>(Landroid/view/View;I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-static {p1}, Lsb;->Ψ(Lp70;)V

    .line 1068
    .line 1069
    .line 1070
    :cond_36
    return-object v0

    .line 1071
    :catchall_e
    move-exception v0

    .line 1072
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p1

    .line 1076
    instance-of v1, p1, Landroid/view/View;

    .line 1077
    .line 1078
    if-eqz v1, :cond_37

    .line 1079
    .line 1080
    move-object v11, p1

    .line 1081
    check-cast v11, Landroid/view/View;

    .line 1082
    .line 1083
    :cond_37
    if-eqz v11, :cond_38

    .line 1084
    .line 1085
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1086
    .line 1087
    .line 1088
    sget-boolean p1, Lsb;->ν:Z

    .line 1089
    .line 1090
    if-eqz p1, :cond_38

    .line 1091
    .line 1092
    new-instance p1, Lhb;

    .line 1093
    .line 1094
    invoke-direct {p1, v11, p0}, Lhb;-><init>(Landroid/view/View;I)V

    .line 1095
    .line 1096
    .line 1097
    invoke-static {p1}, Lsb;->Ψ(Lp70;)V

    .line 1098
    .line 1099
    .line 1100
    :cond_38
    throw v0

    .line 1101
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    sget-boolean p0, Lsb;->ο:Z

    .line 1105
    .line 1106
    if-nez p0, :cond_39

    .line 1107
    .line 1108
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object p0

    .line 1112
    goto :goto_b

    .line 1113
    :cond_39
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object p0

    .line 1117
    instance-of v0, p0, Landroid/view/View;

    .line 1118
    .line 1119
    if-eqz v0, :cond_3a

    .line 1120
    .line 1121
    move-object v11, p0

    .line 1122
    check-cast v11, Landroid/view/View;

    .line 1123
    .line 1124
    :cond_3a
    if-nez v11, :cond_3b

    .line 1125
    .line 1126
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object p0

    .line 1130
    goto :goto_b

    .line 1131
    :cond_3b
    sget-object p0, Lsb;->α:Lsb;

    .line 1132
    .line 1133
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v11}, Lsb;->ο(Landroid/view/View;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 1140
    .line 1141
    .line 1142
    move-result-object p0

    .line 1143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 1147
    .line 1148
    if-eqz v0, :cond_3d

    .line 1149
    .line 1150
    check-cast p0, Ljava/lang/reflect/Method;

    .line 1151
    .line 1152
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1157
    .line 1158
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v0

    .line 1162
    if-nez v0, :cond_3c

    .line 1163
    .line 1164
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    move-result-object p0

    .line 1168
    const-class v0, Ljava/lang/Boolean;

    .line 1169
    .line 1170
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result p0

    .line 1174
    if-eqz p0, :cond_3d

    .line 1175
    .line 1176
    :cond_3c
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1177
    .line 1178
    goto :goto_b

    .line 1179
    :cond_3d
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p0

    .line 1183
    :goto_b
    return-object p0

    .line 1184
    :pswitch_c
    sget-object p0, Lsb;->α:Lsb;

    .line 1185
    .line 1186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    :try_start_f
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1193
    sget v1, Lsb;->τ:I

    .line 1194
    .line 1195
    if-gtz v1, :cond_40

    .line 1196
    .line 1197
    invoke-static {}, Lsb;->Η()Z

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    if-eqz v1, :cond_40

    .line 1202
    .line 1203
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object p1

    .line 1207
    instance-of v1, p1, Landroid/view/View;

    .line 1208
    .line 1209
    if-eqz v1, :cond_3e

    .line 1210
    .line 1211
    move-object v11, p1

    .line 1212
    check-cast v11, Landroid/view/View;

    .line 1213
    .line 1214
    :cond_3e
    if-eqz v11, :cond_40

    .line 1215
    .line 1216
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result p1

    .line 1220
    if-nez p1, :cond_40

    .line 1221
    .line 1222
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result p1

    .line 1226
    if-eqz p1, :cond_3f

    .line 1227
    .line 1228
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-static {v11}, Lsb;->δ(Landroid/view/View;)V

    .line 1232
    .line 1233
    .line 1234
    goto :goto_c

    .line 1235
    :cond_3f
    invoke-static {p0, v11}, Lsb;->κ(Lsb;Landroid/view/View;)Landroid/view/View;

    .line 1236
    .line 1237
    .line 1238
    move-result-object p1

    .line 1239
    if-eqz p1, :cond_40

    .line 1240
    .line 1241
    invoke-virtual {p0, v11}, Lsb;->Λ(Landroid/view/View;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result p0

    .line 1245
    if-eqz p0, :cond_40

    .line 1246
    .line 1247
    invoke-static {v11}, Lsb;->γ(Landroid/view/View;)V

    .line 1248
    .line 1249
    .line 1250
    :cond_40
    :goto_c
    return-object v0

    .line 1251
    :catchall_f
    move-exception v0

    .line 1252
    sget v1, Lsb;->τ:I

    .line 1253
    .line 1254
    if-gtz v1, :cond_43

    .line 1255
    .line 1256
    invoke-static {}, Lsb;->Η()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v1

    .line 1260
    if-eqz v1, :cond_43

    .line 1261
    .line 1262
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object p1

    .line 1266
    instance-of v1, p1, Landroid/view/View;

    .line 1267
    .line 1268
    if-eqz v1, :cond_41

    .line 1269
    .line 1270
    move-object v11, p1

    .line 1271
    check-cast v11, Landroid/view/View;

    .line 1272
    .line 1273
    :cond_41
    if-eqz v11, :cond_43

    .line 1274
    .line 1275
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1276
    .line 1277
    .line 1278
    move-result p1

    .line 1279
    if-nez p1, :cond_43

    .line 1280
    .line 1281
    invoke-static {v11}, Lsb;->Ι(Landroid/view/View;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result p1

    .line 1285
    if-nez p1, :cond_42

    .line 1286
    .line 1287
    invoke-static {p0, v11}, Lsb;->κ(Lsb;Landroid/view/View;)Landroid/view/View;

    .line 1288
    .line 1289
    .line 1290
    move-result-object p1

    .line 1291
    if-eqz p1, :cond_43

    .line 1292
    .line 1293
    invoke-virtual {p0, v11}, Lsb;->Λ(Landroid/view/View;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result p0

    .line 1297
    if-eqz p0, :cond_43

    .line 1298
    .line 1299
    invoke-static {v11}, Lsb;->γ(Landroid/view/View;)V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_d

    .line 1303
    :cond_42
    invoke-static {v11, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-static {v11}, Lsb;->δ(Landroid/view/View;)V

    .line 1307
    .line 1308
    .line 1309
    :cond_43
    :goto_d
    throw v0

    .line 1310
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    sget-object p0, Lsb;->α:Lsb;

    .line 1314
    .line 1315
    invoke-static {}, Lsb;->Η()Z

    .line 1316
    .line 1317
    .line 1318
    move-result p0

    .line 1319
    if-nez p0, :cond_44

    .line 1320
    .line 1321
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object p0

    .line 1325
    goto :goto_e

    .line 1326
    :cond_44
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object p0

    .line 1330
    instance-of v0, p0, Landroid/view/View;

    .line 1331
    .line 1332
    if-eqz v0, :cond_45

    .line 1333
    .line 1334
    move-object v11, p0

    .line 1335
    check-cast v11, Landroid/view/View;

    .line 1336
    .line 1337
    :cond_45
    if-nez v11, :cond_46

    .line 1338
    .line 1339
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object p0

    .line 1343
    goto :goto_e

    .line 1344
    :cond_46
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1345
    .line 1346
    .line 1347
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1348
    .line 1349
    :goto_e
    return-object p0

    .line 1350
    :pswitch_e
    sget-object p0, Lsb;->α:Lsb;

    .line 1351
    .line 1352
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    sget p0, Lsb;->τ:I

    .line 1356
    .line 1357
    if-gtz p0, :cond_4e

    .line 1358
    .line 1359
    invoke-static {}, Lsb;->Η()Z

    .line 1360
    .line 1361
    .line 1362
    move-result p0

    .line 1363
    if-nez p0, :cond_47

    .line 1364
    .line 1365
    goto :goto_10

    .line 1366
    :cond_47
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object p0

    .line 1370
    instance-of v0, p0, Landroid/view/View;

    .line 1371
    .line 1372
    if-eqz v0, :cond_48

    .line 1373
    .line 1374
    check-cast p0, Landroid/view/View;

    .line 1375
    .line 1376
    goto :goto_f

    .line 1377
    :cond_48
    move-object p0, v11

    .line 1378
    :goto_f
    if-nez p0, :cond_49

    .line 1379
    .line 1380
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object p0

    .line 1384
    goto :goto_11

    .line 1385
    :cond_49
    invoke-static {p0, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1386
    .line 1387
    .line 1388
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1393
    .line 1394
    .line 1395
    new-array v1, v8, [Ljava/lang/Object;

    .line 1396
    .line 1397
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    aget-object v1, v0, v8

    .line 1402
    .line 1403
    instance-of v2, v1, Landroid/view/ViewGroup$LayoutParams;

    .line 1404
    .line 1405
    if-eqz v2, :cond_4a

    .line 1406
    .line 1407
    move-object v11, v1

    .line 1408
    check-cast v11, Landroid/view/ViewGroup$LayoutParams;

    .line 1409
    .line 1410
    :cond_4a
    if-eqz v11, :cond_4b

    .line 1411
    .line 1412
    iput v8, v11, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1413
    .line 1414
    :cond_4b
    :try_start_10
    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1418
    sget v0, Lsb;->τ:I

    .line 1419
    .line 1420
    if-gtz v0, :cond_4c

    .line 1421
    .line 1422
    invoke-static {}, Lsb;->Η()Z

    .line 1423
    .line 1424
    .line 1425
    move-result v0

    .line 1426
    if-eqz v0, :cond_4c

    .line 1427
    .line 1428
    invoke-static {p0}, Lsb;->ξ(Landroid/view/View;)V

    .line 1429
    .line 1430
    .line 1431
    :cond_4c
    move-object p0, p1

    .line 1432
    goto :goto_11

    .line 1433
    :catchall_10
    move-exception p1

    .line 1434
    sget v0, Lsb;->τ:I

    .line 1435
    .line 1436
    if-gtz v0, :cond_4d

    .line 1437
    .line 1438
    invoke-static {}, Lsb;->Η()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v0

    .line 1442
    if-eqz v0, :cond_4d

    .line 1443
    .line 1444
    invoke-static {p0}, Lsb;->ξ(Landroid/view/View;)V

    .line 1445
    .line 1446
    .line 1447
    :cond_4d
    throw p1

    .line 1448
    :cond_4e
    :goto_10
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object p0

    .line 1452
    :goto_11
    return-object p0

    .line 1453
    :pswitch_f
    sget-object p0, Lsb;->α:Lsb;

    .line 1454
    .line 1455
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1456
    .line 1457
    .line 1458
    :try_start_11
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 1462
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object p1

    .line 1466
    instance-of v0, p1, Landroid/view/View;

    .line 1467
    .line 1468
    if-eqz v0, :cond_4f

    .line 1469
    .line 1470
    move-object v11, p1

    .line 1471
    check-cast v11, Landroid/view/View;

    .line 1472
    .line 1473
    :cond_4f
    if-eqz v11, :cond_50

    .line 1474
    .line 1475
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1476
    .line 1477
    .line 1478
    invoke-static {}, Lsb;->Η()Z

    .line 1479
    .line 1480
    .line 1481
    move-result p1

    .line 1482
    if-eqz p1, :cond_50

    .line 1483
    .line 1484
    new-instance p1, Ljb;

    .line 1485
    .line 1486
    invoke-direct {p1, v11, v9}, Ljb;-><init>(Landroid/view/View;I)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1490
    .line 1491
    .line 1492
    :cond_50
    return-object p0

    .line 1493
    :catchall_11
    move-exception p0

    .line 1494
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object p1

    .line 1498
    instance-of v0, p1, Landroid/view/View;

    .line 1499
    .line 1500
    if-eqz v0, :cond_51

    .line 1501
    .line 1502
    move-object v11, p1

    .line 1503
    check-cast v11, Landroid/view/View;

    .line 1504
    .line 1505
    :cond_51
    if-eqz v11, :cond_52

    .line 1506
    .line 1507
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1508
    .line 1509
    .line 1510
    invoke-static {}, Lsb;->Η()Z

    .line 1511
    .line 1512
    .line 1513
    move-result p1

    .line 1514
    if-eqz p1, :cond_52

    .line 1515
    .line 1516
    new-instance p1, Ljb;

    .line 1517
    .line 1518
    invoke-direct {p1, v11, v9}, Ljb;-><init>(Landroid/view/View;I)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v11, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1522
    .line 1523
    .line 1524
    :cond_52
    throw p0

    .line 1525
    :pswitch_10
    sget-object p0, Lsb;->α:Lsb;

    .line 1526
    .line 1527
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    sget p0, Lsb;->τ:I

    .line 1531
    .line 1532
    if-gtz p0, :cond_57

    .line 1533
    .line 1534
    invoke-static {}, Lsb;->Η()Z

    .line 1535
    .line 1536
    .line 1537
    move-result p0

    .line 1538
    if-nez p0, :cond_53

    .line 1539
    .line 1540
    goto :goto_12

    .line 1541
    :cond_53
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object p0

    .line 1545
    instance-of v0, p0, Landroid/view/View;

    .line 1546
    .line 1547
    if-eqz v0, :cond_54

    .line 1548
    .line 1549
    move-object v11, p0

    .line 1550
    check-cast v11, Landroid/view/View;

    .line 1551
    .line 1552
    :cond_54
    if-nez v11, :cond_55

    .line 1553
    .line 1554
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object p0

    .line 1558
    goto :goto_13

    .line 1559
    :cond_55
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1560
    .line 1561
    .line 1562
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 1563
    .line 1564
    .line 1565
    move-result-object p0

    .line 1566
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1567
    .line 1568
    .line 1569
    new-array v0, v8, [Ljava/lang/Object;

    .line 1570
    .line 1571
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object p0

    .line 1575
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    aput-object v0, p0, v8

    .line 1580
    .line 1581
    :try_start_12
    invoke-interface {p1, p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object p0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 1585
    sget p1, Lsb;->τ:I

    .line 1586
    .line 1587
    if-gtz p1, :cond_58

    .line 1588
    .line 1589
    invoke-static {}, Lsb;->Η()Z

    .line 1590
    .line 1591
    .line 1592
    move-result p1

    .line 1593
    if-eqz p1, :cond_58

    .line 1594
    .line 1595
    invoke-static {v11}, Lsb;->ξ(Landroid/view/View;)V

    .line 1596
    .line 1597
    .line 1598
    goto :goto_13

    .line 1599
    :catchall_12
    move-exception p0

    .line 1600
    sget p1, Lsb;->τ:I

    .line 1601
    .line 1602
    if-gtz p1, :cond_56

    .line 1603
    .line 1604
    invoke-static {}, Lsb;->Η()Z

    .line 1605
    .line 1606
    .line 1607
    move-result p1

    .line 1608
    if-eqz p1, :cond_56

    .line 1609
    .line 1610
    invoke-static {v11}, Lsb;->ξ(Landroid/view/View;)V

    .line 1611
    .line 1612
    .line 1613
    :cond_56
    throw p0

    .line 1614
    :cond_57
    :goto_12
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object p0

    .line 1618
    :cond_58
    :goto_13
    return-object p0

    .line 1619
    :pswitch_11
    sget-object p0, Lsb;->α:Lsb;

    .line 1620
    .line 1621
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1622
    .line 1623
    .line 1624
    :try_start_13
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 1628
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object p1

    .line 1632
    instance-of v0, p1, Landroid/view/View;

    .line 1633
    .line 1634
    if-eqz v0, :cond_59

    .line 1635
    .line 1636
    move-object v11, p1

    .line 1637
    check-cast v11, Landroid/view/View;

    .line 1638
    .line 1639
    :cond_59
    if-eqz v11, :cond_5a

    .line 1640
    .line 1641
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1642
    .line 1643
    .line 1644
    invoke-static {}, Lsb;->Η()Z

    .line 1645
    .line 1646
    .line 1647
    move-result p1

    .line 1648
    if-eqz p1, :cond_5a

    .line 1649
    .line 1650
    new-instance p1, Lhb;

    .line 1651
    .line 1652
    invoke-direct {p1, v11, v6}, Lhb;-><init>(Landroid/view/View;I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-static {p1}, Lsb;->Ψ(Lp70;)V

    .line 1656
    .line 1657
    .line 1658
    :cond_5a
    return-object p0

    .line 1659
    :catchall_13
    move-exception p0

    .line 1660
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1661
    .line 1662
    .line 1663
    move-result-object p1

    .line 1664
    instance-of v0, p1, Landroid/view/View;

    .line 1665
    .line 1666
    if-eqz v0, :cond_5b

    .line 1667
    .line 1668
    move-object v11, p1

    .line 1669
    check-cast v11, Landroid/view/View;

    .line 1670
    .line 1671
    :cond_5b
    if-eqz v11, :cond_5c

    .line 1672
    .line 1673
    invoke-static {v11, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1674
    .line 1675
    .line 1676
    invoke-static {}, Lsb;->Η()Z

    .line 1677
    .line 1678
    .line 1679
    move-result p1

    .line 1680
    if-eqz p1, :cond_5c

    .line 1681
    .line 1682
    new-instance p1, Lhb;

    .line 1683
    .line 1684
    invoke-direct {p1, v11, v6}, Lhb;-><init>(Landroid/view/View;I)V

    .line 1685
    .line 1686
    .line 1687
    invoke-static {p1}, Lsb;->Ψ(Lp70;)V

    .line 1688
    .line 1689
    .line 1690
    :cond_5c
    throw p0

    .line 1691
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1692
    .line 1693
    .line 1694
    sget p0, Lsb;->τ:I

    .line 1695
    .line 1696
    if-gtz p0, :cond_61

    .line 1697
    .line 1698
    sget-object p0, Lsb;->α:Lsb;

    .line 1699
    .line 1700
    invoke-static {}, Lsb;->Η()Z

    .line 1701
    .line 1702
    .line 1703
    move-result p0

    .line 1704
    if-nez p0, :cond_5d

    .line 1705
    .line 1706
    goto :goto_15

    .line 1707
    :cond_5d
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object p0

    .line 1711
    instance-of v0, p0, Landroid/view/View;

    .line 1712
    .line 1713
    if-eqz v0, :cond_5e

    .line 1714
    .line 1715
    check-cast p0, Landroid/view/View;

    .line 1716
    .line 1717
    goto :goto_14

    .line 1718
    :cond_5e
    move-object p0, v11

    .line 1719
    :goto_14
    if-nez p0, :cond_5f

    .line 1720
    .line 1721
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v11

    .line 1725
    goto :goto_16

    .line 1726
    :cond_5f
    invoke-static {p0}, Lsb;->Θ(Landroid/view/View;)Z

    .line 1727
    .line 1728
    .line 1729
    move-result v0

    .line 1730
    if-nez v0, :cond_60

    .line 1731
    .line 1732
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v11

    .line 1736
    goto :goto_16

    .line 1737
    :cond_60
    invoke-static {p0, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1738
    .line 1739
    .line 1740
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 1741
    .line 1742
    .line 1743
    move-result-object p1

    .line 1744
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object p1

    .line 1748
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1749
    .line 1750
    .line 1751
    check-cast p1, Ljava/lang/Integer;

    .line 1752
    .line 1753
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1754
    .line 1755
    .line 1756
    move-result p1

    .line 1757
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 1758
    .line 1759
    .line 1760
    move-result p1

    .line 1761
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1762
    .line 1763
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1764
    .line 1765
    .line 1766
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v0

    .line 1770
    const-class v1, Landroid/view/View;

    .line 1771
    .line 1772
    const-string v2, "setMeasuredDimension"

    .line 1773
    .line 1774
    invoke-static {v1, v2, v0}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v0

    .line 1778
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1779
    .line 1780
    .line 1781
    move-result-object p1

    .line 1782
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 1787
    .line 1788
    .line 1789
    move-result-object p1

    .line 1790
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    goto :goto_16

    .line 1794
    :cond_61
    :goto_15
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v11

    .line 1798
    :goto_16
    return-object v11

    .line 1799
    :pswitch_13
    sget-object p0, Lsb;->α:Lsb;

    .line 1800
    .line 1801
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1802
    .line 1803
    .line 1804
    :try_start_14
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object p0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 1808
    sget v0, Lsb;->τ:I

    .line 1809
    .line 1810
    if-gtz v0, :cond_67

    .line 1811
    .line 1812
    sget-boolean v0, Lsb;->ο:Z

    .line 1813
    .line 1814
    if-eqz v0, :cond_67

    .line 1815
    .line 1816
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v0

    .line 1820
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 1821
    .line 1822
    if-eqz v1, :cond_62

    .line 1823
    .line 1824
    check-cast v0, Landroid/view/ViewGroup;

    .line 1825
    .line 1826
    goto :goto_17

    .line 1827
    :cond_62
    move-object v0, v11

    .line 1828
    :goto_17
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 1829
    .line 1830
    .line 1831
    move-result-object p1

    .line 1832
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1833
    .line 1834
    .line 1835
    invoke-static {p1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object p1

    .line 1839
    instance-of v1, p1, Landroid/view/View;

    .line 1840
    .line 1841
    if-eqz v1, :cond_63

    .line 1842
    .line 1843
    move-object v11, p1

    .line 1844
    check-cast v11, Landroid/view/View;

    .line 1845
    .line 1846
    :cond_63
    if-eqz v0, :cond_67

    .line 1847
    .line 1848
    if-eqz v11, :cond_67

    .line 1849
    .line 1850
    invoke-static {v0}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1851
    .line 1852
    .line 1853
    move-result p1

    .line 1854
    if-nez p1, :cond_67

    .line 1855
    .line 1856
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1857
    .line 1858
    .line 1859
    move-result p1

    .line 1860
    if-nez p1, :cond_67

    .line 1861
    .line 1862
    invoke-static {v11}, Lsb;->Μ(Landroid/view/View;)Z

    .line 1863
    .line 1864
    .line 1865
    move-result p1

    .line 1866
    if-eqz p1, :cond_64

    .line 1867
    .line 1868
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1869
    .line 1870
    .line 1871
    invoke-static {v11}, Lsb;->ο(Landroid/view/View;)V

    .line 1872
    .line 1873
    .line 1874
    goto :goto_18

    .line 1875
    :cond_64
    invoke-static {v0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result p1

    .line 1879
    if-eqz p1, :cond_65

    .line 1880
    .line 1881
    invoke-static {v0, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1882
    .line 1883
    .line 1884
    invoke-static {v0}, Lsb;->ο(Landroid/view/View;)V

    .line 1885
    .line 1886
    .line 1887
    goto :goto_18

    .line 1888
    :cond_65
    invoke-static {v0}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 1889
    .line 1890
    .line 1891
    move-result-object p1

    .line 1892
    if-nez p1, :cond_66

    .line 1893
    .line 1894
    invoke-static {v11}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 1895
    .line 1896
    .line 1897
    move-result-object p1

    .line 1898
    :cond_66
    if-eqz p1, :cond_67

    .line 1899
    .line 1900
    invoke-static {p1, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1901
    .line 1902
    .line 1903
    invoke-static {p1}, Lsb;->ο(Landroid/view/View;)V

    .line 1904
    .line 1905
    .line 1906
    :cond_67
    :goto_18
    return-object p0

    .line 1907
    :catchall_14
    move-exception p0

    .line 1908
    sget v0, Lsb;->τ:I

    .line 1909
    .line 1910
    if-gtz v0, :cond_6d

    .line 1911
    .line 1912
    sget-boolean v0, Lsb;->ο:Z

    .line 1913
    .line 1914
    if-eqz v0, :cond_6d

    .line 1915
    .line 1916
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v0

    .line 1920
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 1921
    .line 1922
    if-eqz v1, :cond_68

    .line 1923
    .line 1924
    check-cast v0, Landroid/view/ViewGroup;

    .line 1925
    .line 1926
    goto :goto_19

    .line 1927
    :cond_68
    move-object v0, v11

    .line 1928
    :goto_19
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 1929
    .line 1930
    .line 1931
    move-result-object p1

    .line 1932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1933
    .line 1934
    .line 1935
    invoke-static {p1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    move-result-object p1

    .line 1939
    instance-of v1, p1, Landroid/view/View;

    .line 1940
    .line 1941
    if-eqz v1, :cond_69

    .line 1942
    .line 1943
    move-object v11, p1

    .line 1944
    check-cast v11, Landroid/view/View;

    .line 1945
    .line 1946
    :cond_69
    if-eqz v0, :cond_6d

    .line 1947
    .line 1948
    if-eqz v11, :cond_6d

    .line 1949
    .line 1950
    invoke-static {v0}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1951
    .line 1952
    .line 1953
    move-result p1

    .line 1954
    if-nez p1, :cond_6d

    .line 1955
    .line 1956
    invoke-static {v11}, Lsb;->Κ(Landroid/view/View;)Z

    .line 1957
    .line 1958
    .line 1959
    move-result p1

    .line 1960
    if-nez p1, :cond_6d

    .line 1961
    .line 1962
    invoke-static {v11}, Lsb;->Μ(Landroid/view/View;)Z

    .line 1963
    .line 1964
    .line 1965
    move-result p1

    .line 1966
    if-nez p1, :cond_6c

    .line 1967
    .line 1968
    invoke-static {v0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 1969
    .line 1970
    .line 1971
    move-result p1

    .line 1972
    if-nez p1, :cond_6b

    .line 1973
    .line 1974
    invoke-static {v0}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 1975
    .line 1976
    .line 1977
    move-result-object p1

    .line 1978
    if-nez p1, :cond_6a

    .line 1979
    .line 1980
    invoke-static {v11}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 1981
    .line 1982
    .line 1983
    move-result-object p1

    .line 1984
    :cond_6a
    if-eqz p1, :cond_6d

    .line 1985
    .line 1986
    invoke-static {p1, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1987
    .line 1988
    .line 1989
    invoke-static {p1}, Lsb;->ο(Landroid/view/View;)V

    .line 1990
    .line 1991
    .line 1992
    goto :goto_1a

    .line 1993
    :cond_6b
    invoke-static {v0, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 1994
    .line 1995
    .line 1996
    invoke-static {v0}, Lsb;->ο(Landroid/view/View;)V

    .line 1997
    .line 1998
    .line 1999
    goto :goto_1a

    .line 2000
    :cond_6c
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2001
    .line 2002
    .line 2003
    invoke-static {v11}, Lsb;->ο(Landroid/view/View;)V

    .line 2004
    .line 2005
    .line 2006
    :cond_6d
    :goto_1a
    throw p0

    .line 2007
    :pswitch_14
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2008
    .line 2009
    .line 2010
    move-result-object p0

    .line 2011
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2012
    .line 2013
    .line 2014
    sget v0, Lsb;->τ:I

    .line 2015
    .line 2016
    if-gtz v0, :cond_84

    .line 2017
    .line 2018
    sget-boolean v0, Lsb;->ν:Z

    .line 2019
    .line 2020
    if-nez v0, :cond_6e

    .line 2021
    .line 2022
    goto/16 :goto_20

    .line 2023
    .line 2024
    :cond_6e
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v0

    .line 2028
    instance-of v6, v0, Landroid/view/View;

    .line 2029
    .line 2030
    if-eqz v6, :cond_6f

    .line 2031
    .line 2032
    check-cast v0, Landroid/view/View;

    .line 2033
    .line 2034
    goto :goto_1b

    .line 2035
    :cond_6f
    move-object v0, v11

    .line 2036
    :goto_1b
    if-nez v0, :cond_70

    .line 2037
    .line 2038
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2039
    .line 2040
    .line 2041
    move-result-object p0

    .line 2042
    goto/16 :goto_21

    .line 2043
    .line 2044
    :cond_70
    sget-object v6, Lsb;->α:Lsb;

    .line 2045
    .line 2046
    invoke-static {v0}, Lsb;->Κ(Landroid/view/View;)Z

    .line 2047
    .line 2048
    .line 2049
    move-result v6

    .line 2050
    if-eqz v6, :cond_71

    .line 2051
    .line 2052
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object p0

    .line 2056
    goto/16 :goto_21

    .line 2057
    .line 2058
    :cond_71
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v6

    .line 2062
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2063
    .line 2064
    .line 2065
    new-array v12, v8, [Ljava/lang/Object;

    .line 2066
    .line 2067
    invoke-interface {v6, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v6

    .line 2071
    invoke-static {}, Lsb;->Η()Z

    .line 2072
    .line 2073
    .line 2074
    move-result v12

    .line 2075
    if-eqz v12, :cond_74

    .line 2076
    .line 2077
    aget-object v12, v6, v8

    .line 2078
    .line 2079
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2080
    .line 2081
    .line 2082
    check-cast v12, Ljava/lang/Float;

    .line 2083
    .line 2084
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 2085
    .line 2086
    .line 2087
    move-result v12

    .line 2088
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v1

    .line 2092
    instance-of v13, v1, Lgb;

    .line 2093
    .line 2094
    if-eqz v13, :cond_72

    .line 2095
    .line 2096
    check-cast v1, Lgb;

    .line 2097
    .line 2098
    goto :goto_1c

    .line 2099
    :cond_72
    move-object v1, v11

    .line 2100
    :goto_1c
    if-nez v1, :cond_73

    .line 2101
    .line 2102
    goto :goto_1d

    .line 2103
    :cond_73
    iput v12, v1, Lgb;->β:F

    .line 2104
    .line 2105
    :cond_74
    :goto_1d
    sget-boolean v1, Lsb;->ο:Z

    .line 2106
    .line 2107
    if-eqz v1, :cond_75

    .line 2108
    .line 2109
    invoke-static {v0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 2110
    .line 2111
    .line 2112
    move-result v1

    .line 2113
    if-eqz v1, :cond_75

    .line 2114
    .line 2115
    invoke-static {v0, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2116
    .line 2117
    .line 2118
    aput-object p0, v6, v8

    .line 2119
    .line 2120
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2121
    .line 2122
    .line 2123
    move-result-object p0

    .line 2124
    goto/16 :goto_21

    .line 2125
    .line 2126
    :cond_75
    sget-boolean v1, Lsb;->ο:Z

    .line 2127
    .line 2128
    if-eqz v1, :cond_76

    .line 2129
    .line 2130
    invoke-static {v0}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v1

    .line 2134
    if-eqz v1, :cond_76

    .line 2135
    .line 2136
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2137
    .line 2138
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2139
    .line 2140
    .line 2141
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2142
    .line 2143
    .line 2144
    aput-object p0, v6, v8

    .line 2145
    .line 2146
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2147
    .line 2148
    .line 2149
    move-result-object p0

    .line 2150
    goto/16 :goto_21

    .line 2151
    .line 2152
    :cond_76
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v1

    .line 2156
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2157
    .line 2158
    invoke-static {v1, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v1

    .line 2162
    if-eqz v1, :cond_78

    .line 2163
    .line 2164
    sget-boolean v1, Lsb;->ο:Z

    .line 2165
    .line 2166
    if-eqz v1, :cond_77

    .line 2167
    .line 2168
    aput-object p0, v6, v8

    .line 2169
    .line 2170
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object p0

    .line 2174
    goto/16 :goto_21

    .line 2175
    .line 2176
    :cond_77
    invoke-virtual {v0, v3, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2177
    .line 2178
    .line 2179
    invoke-virtual {v0, v2, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2180
    .line 2181
    .line 2182
    :cond_78
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v1

    .line 2186
    invoke-static {v1, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2187
    .line 2188
    .line 2189
    move-result v1

    .line 2190
    if-eqz v1, :cond_7a

    .line 2191
    .line 2192
    invoke-static {}, Lsb;->Η()Z

    .line 2193
    .line 2194
    .line 2195
    move-result v1

    .line 2196
    if-eqz v1, :cond_79

    .line 2197
    .line 2198
    aput-object p0, v6, v8

    .line 2199
    .line 2200
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2201
    .line 2202
    .line 2203
    move-result-object p0

    .line 2204
    goto/16 :goto_21

    .line 2205
    .line 2206
    :cond_79
    invoke-virtual {v0, v2, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    :cond_7a
    invoke-static {}, Lsb;->Η()Z

    .line 2210
    .line 2211
    .line 2212
    move-result v1

    .line 2213
    if-eqz v1, :cond_7e

    .line 2214
    .line 2215
    const v1, 0x7f0dba12

    .line 2216
    .line 2217
    .line 2218
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v1

    .line 2222
    invoke-static {v1, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2223
    .line 2224
    .line 2225
    move-result v1

    .line 2226
    if-eqz v1, :cond_7e

    .line 2227
    .line 2228
    aget-object p0, v6, v8

    .line 2229
    .line 2230
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2231
    .line 2232
    .line 2233
    check-cast p0, Ljava/lang/Float;

    .line 2234
    .line 2235
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 2236
    .line 2237
    .line 2238
    move-result v1

    .line 2239
    const v2, 0x7f0dba1b

    .line 2240
    .line 2241
    .line 2242
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v3

    .line 2246
    instance-of v7, v3, Ljava/lang/Float;

    .line 2247
    .line 2248
    if-eqz v7, :cond_7b

    .line 2249
    .line 2250
    move-object v11, v3

    .line 2251
    check-cast v11, Ljava/lang/Float;

    .line 2252
    .line 2253
    :cond_7b
    sget-boolean v3, Lsb;->π:Z

    .line 2254
    .line 2255
    const/high16 v7, 0x42c80000    # 100.0f

    .line 2256
    .line 2257
    const/16 v9, 0x64

    .line 2258
    .line 2259
    if-eqz v3, :cond_7c

    .line 2260
    .line 2261
    if-eqz v11, :cond_7c

    .line 2262
    .line 2263
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2264
    .line 2265
    .line 2266
    sget p0, Lsb;->φ:I

    .line 2267
    .line 2268
    invoke-static {p0, v8, v9}, Lj81;->μ(III)I

    .line 2269
    .line 2270
    .line 2271
    move-result p0

    .line 2272
    int-to-float p0, p0

    .line 2273
    div-float/2addr p0, v7

    .line 2274
    invoke-static {p0, v5, v4}, Lj81;->λ(FFF)F

    .line 2275
    .line 2276
    .line 2277
    move-result p0

    .line 2278
    invoke-static {v1, v5, v4}, Lj81;->λ(FFF)F

    .line 2279
    .line 2280
    .line 2281
    move-result v0

    .line 2282
    mul-float v5, v0, p0

    .line 2283
    .line 2284
    goto :goto_1e

    .line 2285
    :cond_7c
    sget-boolean p0, Lsb;->π:Z

    .line 2286
    .line 2287
    if-eqz p0, :cond_7d

    .line 2288
    .line 2289
    sget p0, Lsb;->φ:I

    .line 2290
    .line 2291
    invoke-static {p0, v8, v9}, Lj81;->μ(III)I

    .line 2292
    .line 2293
    .line 2294
    move-result p0

    .line 2295
    int-to-float p0, p0

    .line 2296
    div-float v5, p0, v7

    .line 2297
    .line 2298
    :cond_7d
    :goto_1e
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2299
    .line 2300
    .line 2301
    move-result-object p0

    .line 2302
    aput-object p0, v6, v8

    .line 2303
    .line 2304
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2305
    .line 2306
    .line 2307
    move-result-object p0

    .line 2308
    goto :goto_21

    .line 2309
    :cond_7e
    invoke-static {}, Lsb;->Η()Z

    .line 2310
    .line 2311
    .line 2312
    move-result v1

    .line 2313
    if-nez v1, :cond_7f

    .line 2314
    .line 2315
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2316
    .line 2317
    .line 2318
    move-result-object p0

    .line 2319
    goto :goto_21

    .line 2320
    :cond_7f
    invoke-static {v0}, Lsb;->Ι(Landroid/view/View;)Z

    .line 2321
    .line 2322
    .line 2323
    move-result v1

    .line 2324
    if-eqz v1, :cond_81

    .line 2325
    .line 2326
    invoke-static {v0, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2327
    .line 2328
    .line 2329
    aget-object p0, v6, v8

    .line 2330
    .line 2331
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2332
    .line 2333
    .line 2334
    check-cast p0, Ljava/lang/Float;

    .line 2335
    .line 2336
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 2337
    .line 2338
    .line 2339
    move-result p0

    .line 2340
    cmpg-float p0, p0, v4

    .line 2341
    .line 2342
    if-nez p0, :cond_80

    .line 2343
    .line 2344
    goto :goto_1f

    .line 2345
    :cond_80
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2346
    .line 2347
    .line 2348
    move-result-object p0

    .line 2349
    aput-object p0, v6, v8

    .line 2350
    .line 2351
    goto :goto_1f

    .line 2352
    :cond_81
    invoke-static {v0}, Lsb;->Θ(Landroid/view/View;)Z

    .line 2353
    .line 2354
    .line 2355
    move-result v1

    .line 2356
    if-eqz v1, :cond_83

    .line 2357
    .line 2358
    invoke-static {v0, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2359
    .line 2360
    .line 2361
    aget-object v0, v6, v8

    .line 2362
    .line 2363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2364
    .line 2365
    .line 2366
    check-cast v0, Ljava/lang/Float;

    .line 2367
    .line 2368
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 2369
    .line 2370
    .line 2371
    move-result v0

    .line 2372
    cmpg-float v0, v0, v5

    .line 2373
    .line 2374
    if-nez v0, :cond_82

    .line 2375
    .line 2376
    goto :goto_1f

    .line 2377
    :cond_82
    aput-object p0, v6, v8

    .line 2378
    .line 2379
    :cond_83
    :goto_1f
    invoke-interface {p1, v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2380
    .line 2381
    .line 2382
    move-result-object p0

    .line 2383
    goto :goto_21

    .line 2384
    :cond_84
    :goto_20
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2385
    .line 2386
    .line 2387
    move-result-object p0

    .line 2388
    :goto_21
    return-object p0

    .line 2389
    :pswitch_15
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2390
    .line 2391
    .line 2392
    move-result-object p0

    .line 2393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2394
    .line 2395
    .line 2396
    sget v0, Lsb;->τ:I

    .line 2397
    .line 2398
    if-gtz v0, :cond_95

    .line 2399
    .line 2400
    sget-boolean v0, Lsb;->ν:Z

    .line 2401
    .line 2402
    if-nez v0, :cond_85

    .line 2403
    .line 2404
    goto/16 :goto_26

    .line 2405
    .line 2406
    :cond_85
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v0

    .line 2410
    instance-of v4, v0, Landroid/view/View;

    .line 2411
    .line 2412
    if-eqz v4, :cond_86

    .line 2413
    .line 2414
    check-cast v0, Landroid/view/View;

    .line 2415
    .line 2416
    goto :goto_22

    .line 2417
    :cond_86
    move-object v0, v11

    .line 2418
    :goto_22
    if-nez v0, :cond_87

    .line 2419
    .line 2420
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2421
    .line 2422
    .line 2423
    move-result-object p0

    .line 2424
    goto/16 :goto_27

    .line 2425
    .line 2426
    :cond_87
    sget-object v4, Lsb;->α:Lsb;

    .line 2427
    .line 2428
    invoke-static {v0}, Lsb;->Κ(Landroid/view/View;)Z

    .line 2429
    .line 2430
    .line 2431
    move-result v4

    .line 2432
    if-eqz v4, :cond_88

    .line 2433
    .line 2434
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2435
    .line 2436
    .line 2437
    move-result-object p0

    .line 2438
    goto/16 :goto_27

    .line 2439
    .line 2440
    :cond_88
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v4

    .line 2444
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2445
    .line 2446
    .line 2447
    new-array v5, v8, [Ljava/lang/Object;

    .line 2448
    .line 2449
    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v4

    .line 2453
    invoke-static {}, Lsb;->Η()Z

    .line 2454
    .line 2455
    .line 2456
    move-result v5

    .line 2457
    if-eqz v5, :cond_8b

    .line 2458
    .line 2459
    aget-object v5, v4, v8

    .line 2460
    .line 2461
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2462
    .line 2463
    .line 2464
    check-cast v5, Ljava/lang/Integer;

    .line 2465
    .line 2466
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2467
    .line 2468
    .line 2469
    move-result v5

    .line 2470
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v1

    .line 2474
    instance-of v6, v1, Lgb;

    .line 2475
    .line 2476
    if-eqz v6, :cond_89

    .line 2477
    .line 2478
    check-cast v1, Lgb;

    .line 2479
    .line 2480
    goto :goto_23

    .line 2481
    :cond_89
    move-object v1, v11

    .line 2482
    :goto_23
    if-nez v1, :cond_8a

    .line 2483
    .line 2484
    goto :goto_24

    .line 2485
    :cond_8a
    iput v5, v1, Lgb;->α:I

    .line 2486
    .line 2487
    :cond_8b
    :goto_24
    sget-boolean v1, Lsb;->ο:Z

    .line 2488
    .line 2489
    if-eqz v1, :cond_8c

    .line 2490
    .line 2491
    invoke-static {v0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 2492
    .line 2493
    .line 2494
    move-result v1

    .line 2495
    if-eqz v1, :cond_8c

    .line 2496
    .line 2497
    invoke-static {v0, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2498
    .line 2499
    .line 2500
    aput-object p0, v4, v8

    .line 2501
    .line 2502
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2503
    .line 2504
    .line 2505
    move-result-object p0

    .line 2506
    goto/16 :goto_27

    .line 2507
    .line 2508
    :cond_8c
    sget-boolean v1, Lsb;->ο:Z

    .line 2509
    .line 2510
    if-eqz v1, :cond_8d

    .line 2511
    .line 2512
    invoke-static {v0}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v1

    .line 2516
    if-eqz v1, :cond_8d

    .line 2517
    .line 2518
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2519
    .line 2520
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2521
    .line 2522
    .line 2523
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2524
    .line 2525
    .line 2526
    aput-object p0, v4, v8

    .line 2527
    .line 2528
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2529
    .line 2530
    .line 2531
    move-result-object p0

    .line 2532
    goto/16 :goto_27

    .line 2533
    .line 2534
    :cond_8d
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v1

    .line 2538
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2539
    .line 2540
    invoke-static {v1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2541
    .line 2542
    .line 2543
    move-result v1

    .line 2544
    if-eqz v1, :cond_8f

    .line 2545
    .line 2546
    sget-boolean v1, Lsb;->ο:Z

    .line 2547
    .line 2548
    if-eqz v1, :cond_8e

    .line 2549
    .line 2550
    aput-object p0, v4, v8

    .line 2551
    .line 2552
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2553
    .line 2554
    .line 2555
    move-result-object p0

    .line 2556
    goto :goto_27

    .line 2557
    :cond_8e
    invoke-virtual {v0, v3, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2558
    .line 2559
    .line 2560
    invoke-virtual {v0, v2, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2561
    .line 2562
    .line 2563
    :cond_8f
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v1

    .line 2567
    invoke-static {v1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2568
    .line 2569
    .line 2570
    move-result v1

    .line 2571
    if-eqz v1, :cond_91

    .line 2572
    .line 2573
    invoke-static {}, Lsb;->Η()Z

    .line 2574
    .line 2575
    .line 2576
    move-result v1

    .line 2577
    if-eqz v1, :cond_90

    .line 2578
    .line 2579
    aput-object p0, v4, v8

    .line 2580
    .line 2581
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2582
    .line 2583
    .line 2584
    move-result-object p0

    .line 2585
    goto :goto_27

    .line 2586
    :cond_90
    invoke-virtual {v0, v2, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2587
    .line 2588
    .line 2589
    :cond_91
    invoke-static {}, Lsb;->Η()Z

    .line 2590
    .line 2591
    .line 2592
    move-result v1

    .line 2593
    if-nez v1, :cond_92

    .line 2594
    .line 2595
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2596
    .line 2597
    .line 2598
    move-result-object p0

    .line 2599
    goto :goto_27

    .line 2600
    :cond_92
    invoke-static {v0}, Lsb;->Ι(Landroid/view/View;)Z

    .line 2601
    .line 2602
    .line 2603
    move-result v1

    .line 2604
    if-eqz v1, :cond_93

    .line 2605
    .line 2606
    invoke-static {v0, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2607
    .line 2608
    .line 2609
    aget-object p0, v4, v8

    .line 2610
    .line 2611
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2612
    .line 2613
    .line 2614
    check-cast p0, Ljava/lang/Integer;

    .line 2615
    .line 2616
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2617
    .line 2618
    .line 2619
    move-result p0

    .line 2620
    if-eqz p0, :cond_94

    .line 2621
    .line 2622
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2623
    .line 2624
    .line 2625
    move-result-object p0

    .line 2626
    aput-object p0, v4, v8

    .line 2627
    .line 2628
    goto :goto_25

    .line 2629
    :cond_93
    invoke-static {v0}, Lsb;->Θ(Landroid/view/View;)Z

    .line 2630
    .line 2631
    .line 2632
    move-result v1

    .line 2633
    if-eqz v1, :cond_94

    .line 2634
    .line 2635
    invoke-static {v0, v7}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2636
    .line 2637
    .line 2638
    aget-object v0, v4, v8

    .line 2639
    .line 2640
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2641
    .line 2642
    .line 2643
    check-cast v0, Ljava/lang/Integer;

    .line 2644
    .line 2645
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2646
    .line 2647
    .line 2648
    move-result v0

    .line 2649
    if-eq v0, v9, :cond_94

    .line 2650
    .line 2651
    aput-object p0, v4, v8

    .line 2652
    .line 2653
    :cond_94
    :goto_25
    invoke-interface {p1, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2654
    .line 2655
    .line 2656
    move-result-object p0

    .line 2657
    goto :goto_27

    .line 2658
    :cond_95
    :goto_26
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2659
    .line 2660
    .line 2661
    move-result-object p0

    .line 2662
    :goto_27
    return-object p0

    .line 2663
    :pswitch_16
    sget-object p0, Lsb;->α:Lsb;

    .line 2664
    .line 2665
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2666
    .line 2667
    .line 2668
    const/4 v0, 0x5

    .line 2669
    const/4 v1, 0x4

    .line 2670
    :try_start_15
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    .line 2674
    sget-boolean v3, Lsb;->ν:Z

    .line 2675
    .line 2676
    if-eqz v3, :cond_9a

    .line 2677
    .line 2678
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 2679
    .line 2680
    .line 2681
    move-result-object p1

    .line 2682
    instance-of v3, p1, Landroid/view/View;

    .line 2683
    .line 2684
    if-eqz v3, :cond_96

    .line 2685
    .line 2686
    check-cast p1, Landroid/view/View;

    .line 2687
    .line 2688
    goto :goto_28

    .line 2689
    :cond_96
    move-object p1, v11

    .line 2690
    :goto_28
    if-eqz p1, :cond_9a

    .line 2691
    .line 2692
    invoke-static {p1}, Lsb;->Κ(Landroid/view/View;)Z

    .line 2693
    .line 2694
    .line 2695
    move-result v3

    .line 2696
    if-nez v3, :cond_9a

    .line 2697
    .line 2698
    invoke-static {p1}, Lsb;->ζ(Landroid/view/View;)Ljava/lang/Integer;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v3

    .line 2702
    if-eqz v3, :cond_97

    .line 2703
    .line 2704
    new-instance p0, Lw1;

    .line 2705
    .line 2706
    invoke-direct {p0, p1, v10, v3}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2707
    .line 2708
    .line 2709
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2710
    .line 2711
    .line 2712
    goto :goto_29

    .line 2713
    :cond_97
    sget-boolean v3, Lsb;->ο:Z

    .line 2714
    .line 2715
    if-eqz v3, :cond_98

    .line 2716
    .line 2717
    invoke-static {p1}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v11

    .line 2721
    :cond_98
    if-eqz v11, :cond_99

    .line 2722
    .line 2723
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2724
    .line 2725
    .line 2726
    new-instance p0, Ljb;

    .line 2727
    .line 2728
    invoke-direct {p0, v11, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 2729
    .line 2730
    .line 2731
    invoke-virtual {v11, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2732
    .line 2733
    .line 2734
    goto :goto_29

    .line 2735
    :cond_99
    invoke-static {p0, p1}, Lsb;->κ(Lsb;Landroid/view/View;)Landroid/view/View;

    .line 2736
    .line 2737
    .line 2738
    move-result-object p0

    .line 2739
    if-eqz p0, :cond_9a

    .line 2740
    .line 2741
    invoke-static {p0, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2742
    .line 2743
    .line 2744
    new-instance p1, Ljb;

    .line 2745
    .line 2746
    invoke-direct {p1, p0, v0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 2747
    .line 2748
    .line 2749
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2750
    .line 2751
    .line 2752
    :cond_9a
    :goto_29
    return-object v2

    .line 2753
    :catchall_15
    move-exception v2

    .line 2754
    sget-boolean v3, Lsb;->ν:Z

    .line 2755
    .line 2756
    if-eqz v3, :cond_9f

    .line 2757
    .line 2758
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 2759
    .line 2760
    .line 2761
    move-result-object p1

    .line 2762
    instance-of v3, p1, Landroid/view/View;

    .line 2763
    .line 2764
    if-eqz v3, :cond_9b

    .line 2765
    .line 2766
    check-cast p1, Landroid/view/View;

    .line 2767
    .line 2768
    goto :goto_2a

    .line 2769
    :cond_9b
    move-object p1, v11

    .line 2770
    :goto_2a
    if-eqz p1, :cond_9f

    .line 2771
    .line 2772
    invoke-static {p1}, Lsb;->Κ(Landroid/view/View;)Z

    .line 2773
    .line 2774
    .line 2775
    move-result v3

    .line 2776
    if-nez v3, :cond_9f

    .line 2777
    .line 2778
    invoke-static {p1}, Lsb;->ζ(Landroid/view/View;)Ljava/lang/Integer;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v3

    .line 2782
    if-nez v3, :cond_9e

    .line 2783
    .line 2784
    sget-boolean v3, Lsb;->ο:Z

    .line 2785
    .line 2786
    if-eqz v3, :cond_9c

    .line 2787
    .line 2788
    invoke-static {p1}, Lsb;->ν(Landroid/view/View;)Landroid/view/View;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v11

    .line 2792
    :cond_9c
    if-nez v11, :cond_9d

    .line 2793
    .line 2794
    invoke-static {p0, p1}, Lsb;->κ(Lsb;Landroid/view/View;)Landroid/view/View;

    .line 2795
    .line 2796
    .line 2797
    move-result-object p0

    .line 2798
    if-eqz p0, :cond_9f

    .line 2799
    .line 2800
    invoke-static {p0, v10}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2801
    .line 2802
    .line 2803
    new-instance p1, Ljb;

    .line 2804
    .line 2805
    invoke-direct {p1, p0, v0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 2806
    .line 2807
    .line 2808
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2809
    .line 2810
    .line 2811
    goto :goto_2b

    .line 2812
    :cond_9d
    invoke-static {v11, v9}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 2813
    .line 2814
    .line 2815
    new-instance p0, Ljb;

    .line 2816
    .line 2817
    invoke-direct {p0, v11, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 2818
    .line 2819
    .line 2820
    invoke-virtual {v11, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2821
    .line 2822
    .line 2823
    goto :goto_2b

    .line 2824
    :cond_9e
    new-instance p0, Lw1;

    .line 2825
    .line 2826
    invoke-direct {p0, p1, v10, v3}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2827
    .line 2828
    .line 2829
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2830
    .line 2831
    .line 2832
    :cond_9f
    :goto_2b
    throw v2

    .line 2833
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
