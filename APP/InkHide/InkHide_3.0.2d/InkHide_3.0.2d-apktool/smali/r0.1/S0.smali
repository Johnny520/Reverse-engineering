.class public final Lr0/S0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lr0/Y0;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(ZLr0/Y0;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr0/S0;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Lr0/S0;->b:Lr0/Y0;

    .line 4
    .line 5
    iput-object p3, p0, Lr0/S0;->c:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Lr0/S0;->d:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p5, p0, Lr0/S0;->e:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lr0/S0;->a:Z

    .line 7
    .line 8
    if-eqz v0, :cond_7

    .line 9
    .line 10
    sget-boolean v0, Lz0/i;->a:Z

    .line 11
    .line 12
    invoke-static {}, Lz0/g;->H()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_7

    .line 17
    .line 18
    invoke-static {}, Lz0/g;->A()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 27
    .line 28
    const-string v1, "args"

    .line 29
    .line 30
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    array-length v1, v0

    .line 34
    const/4 v2, 0x0

    .line 35
    move v3, v2

    .line 36
    :goto_0
    const/4 v4, 0x0

    .line 37
    if-ge v3, v1, :cond_2

    .line 38
    .line 39
    aget-object v5, v0, v3

    .line 40
    .line 41
    instance-of v6, v5, Landroid/view/ContextMenu;

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v5, v4

    .line 50
    :goto_1
    instance-of v0, v5, Landroid/view/ContextMenu;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    move-object v4, v5

    .line 55
    check-cast v4, Landroid/view/ContextMenu;

    .line 56
    .line 57
    :cond_3
    if-nez v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "self sns native menu create hit"

    .line 71
    .line 72
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v0, 0x534e531

    .line 80
    .line 81
    .line 82
    invoke-interface {v4, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    iget-object v1, p0, Lr0/S0;->b:Lr0/Y0;

    .line 90
    .line 91
    iget-object v3, p0, Lr0/S0;->c:Ljava/lang/Class;

    .line 92
    .line 93
    iget-object v5, p0, Lr0/S0;->d:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v1, p1, v3, v5}, Lr0/Y0;->a(Lr0/Y0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Class;Ljava/lang/Class;)Lr0/P0;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-nez v3, :cond_6

    .line 100
    .line 101
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string v0, "self sns native menu context unresolved"

    .line 112
    .line 113
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    const-string p1, "access$getSelfSnsDetailMenuContexts$p(...)"

    .line 122
    .line 123
    iget-object v1, v1, Lr0/Y0;->i:Ljava/util/Map;

    .line 124
    .line 125
    invoke-static {v1, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, v3, Lr0/P0;->a:Landroid/app/Activity;

    .line 129
    .line 130
    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    const-string p1, "\u9690\u85cf\u6b64\u6761\u670b\u53cb\u5708"

    .line 134
    .line 135
    invoke-interface {v4, v2, v0, v2, p1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_2
    return-void
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lr0/S0;->a:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_b

    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->H()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_19

    .line 19
    .line 20
    invoke-static {}, Lz0/g;->A()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_b

    .line 27
    .line 28
    :cond_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 29
    .line 30
    const-string v1, "args"

    .line 31
    .line 32
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    array-length v1, v0

    .line 36
    const/4 v2, 0x0

    .line 37
    move v3, v2

    .line 38
    :goto_0
    const/4 v4, 0x0

    .line 39
    if-ge v3, v1, :cond_3

    .line 40
    .line 41
    aget-object v5, v0, v3

    .line 42
    .line 43
    instance-of v6, v5, Landroid/view/MenuItem;

    .line 44
    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move-object v5, v4

    .line 52
    :goto_1
    instance-of v0, v5, Landroid/view/MenuItem;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    check-cast v5, Landroid/view/MenuItem;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    move-object v5, v4

    .line 60
    :goto_2
    if-nez v5, :cond_5

    .line 61
    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :cond_5
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const v1, 0x534e531

    .line 69
    .line 70
    .line 71
    if-eq v0, v1, :cond_6

    .line 72
    .line 73
    goto/16 :goto_b

    .line 74
    .line 75
    :cond_6
    iget-object v0, p0, Lr0/S0;->b:Lr0/Y0;

    .line 76
    .line 77
    iget-object v1, p0, Lr0/S0;->c:Ljava/lang/Class;

    .line 78
    .line 79
    iget-object v3, p0, Lr0/S0;->d:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v0, p1, v1, v3}, Lr0/Y0;->a(Lr0/Y0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Class;Ljava/lang/Class;)Lr0/P0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_7

    .line 86
    .line 87
    goto/16 :goto_b

    .line 88
    .line 89
    :cond_7
    invoke-virtual {v0, v1}, Lr0/Y0;->M(Lr0/P0;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lr0/S0;->e:Ljava/lang/reflect/Method;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "getReturnType(...)"

    .line 99
    .line 100
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_8

    .line 110
    .line 111
    goto/16 :goto_a

    .line 112
    .line 113
    :cond_8
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_17

    .line 120
    .line 121
    const-class v1, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_9

    .line 128
    .line 129
    goto/16 :goto_9

    .line 130
    .line 131
    :cond_9
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_16

    .line 138
    .line 139
    const-class v1, Ljava/lang/Byte;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    goto/16 :goto_8

    .line 148
    .line 149
    :cond_a
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_15

    .line 156
    .line 157
    const-class v1, Ljava/lang/Short;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_b

    .line 164
    .line 165
    goto/16 :goto_7

    .line 166
    .line 167
    :cond_b
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-nez v1, :cond_14

    .line 174
    .line 175
    const-class v1, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_c

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_c
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_13

    .line 191
    .line 192
    const-class v1, Ljava/lang/Long;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_d

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_d
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_12

    .line 208
    .line 209
    const-class v1, Ljava/lang/Float;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_e

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_e
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-nez v1, :cond_11

    .line 225
    .line 226
    const-class v1, Ljava/lang/Double;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_f

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_f
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_10

    .line 242
    .line 243
    const-class v1, Ljava/lang/Character;

    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_18

    .line 250
    .line 251
    :cond_10
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    goto :goto_a

    .line 256
    :cond_11
    :goto_3
    const-wide/16 v0, 0x0

    .line 257
    .line 258
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    goto :goto_a

    .line 263
    :cond_12
    :goto_4
    const/4 v0, 0x0

    .line 264
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    goto :goto_a

    .line 269
    :cond_13
    :goto_5
    const-wide/16 v0, 0x0

    .line 270
    .line 271
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    goto :goto_a

    .line 276
    :cond_14
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    goto :goto_a

    .line 281
    :cond_15
    :goto_7
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    goto :goto_a

    .line 286
    :cond_16
    :goto_8
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    goto :goto_a

    .line 291
    :cond_17
    :goto_9
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 292
    .line 293
    :cond_18
    :goto_a
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_19
    :goto_b
    return-void
.end method
