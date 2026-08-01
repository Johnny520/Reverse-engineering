.class public final Lwd;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    const-string p0, "eq_unread_full_count"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_e

    .line 8
    .line 9
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz p0, :cond_e

    .line 12
    .line 13
    array-length v0, p0

    .line 14
    if-eqz v0, :cond_e

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aget-object p0, p0, v0

    .line 18
    .line 19
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 20
    .line 21
    if-eqz v1, :cond_e

    .line 22
    .line 23
    check-cast p0, Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-static {p0}, Li5;->E0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_e

    .line 30
    .line 31
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 32
    .line 33
    instance-of v1, p0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v1, :cond_e

    .line 36
    .line 37
    check-cast p0, Landroid/view/View;

    .line 38
    .line 39
    move v1, v0

    .line 40
    :goto_0
    const/4 v2, 0x0

    .line 41
    if-eqz p0, :cond_8

    .line 42
    .line 43
    const/4 v3, 0x6

    .line 44
    if-ge v1, v3, :cond_8

    .line 45
    .line 46
    sget-object v3, Lxd;->d:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Integer;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-lez v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_0
    invoke-static {p0}, Li5;->C0(Landroid/view/View;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    move v4, v0

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move v4, v0

    .line 82
    :goto_1
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    array-length v6, v5

    .line 89
    move v7, v0

    .line 90
    :goto_2
    if-ge v7, v6, :cond_4

    .line 91
    .line 92
    aget-object v8, v5, v7

    .line 93
    .line 94
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-nez v9, :cond_3

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    if-ne v9, v10, :cond_3

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    const-string v10, "num"

    .line 121
    .line 122
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-nez v10, :cond_2

    .line 127
    .line 128
    const-string v10, "count"

    .line 129
    .line 130
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-nez v10, :cond_2

    .line 135
    .line 136
    const-string v10, "unread"

    .line 137
    .line 138
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-nez v10, :cond_2

    .line 143
    .line 144
    const-string v10, "badge"

    .line 145
    .line 146
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_2

    .line 151
    .line 152
    const-string v10, "j"

    .line 153
    .line 154
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_2

    .line 159
    .line 160
    const-string v10, "mnum"

    .line 161
    .line 162
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_3

    .line 167
    .line 168
    :cond_2
    const/4 v9, 0x1

    .line 169
    invoke-virtual {v8, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 173
    .line 174
    .line 175
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    if-le v8, v4, :cond_3

    .line 177
    .line 178
    const v9, 0xf4240

    .line 179
    .line 180
    .line 181
    if-ge v8, v9, :cond_3

    .line 182
    .line 183
    move v4, v8

    .line 184
    :catchall_0
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    goto :goto_1

    .line 192
    :cond_5
    :goto_3
    if-lez v4, :cond_6

    .line 193
    .line 194
    move p0, v4

    .line 195
    goto :goto_5

    .line 196
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    instance-of v3, p0, Landroid/view/View;

    .line 201
    .line 202
    if-eqz v3, :cond_7

    .line 203
    .line 204
    check-cast p0, Landroid/view/View;

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_7
    move-object p0, v2

    .line 208
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_8
    move p0, v0

    .line 213
    :goto_5
    const/16 v1, 0x63

    .line 214
    .line 215
    if-gt p0, v1, :cond_d

    .line 216
    .line 217
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p0, Landroid/view/View;

    .line 220
    .line 221
    move v3, v0

    .line 222
    move v4, v3

    .line 223
    :goto_6
    if-eqz p0, :cond_c

    .line 224
    .line 225
    const/4 v5, 0x7

    .line 226
    if-ge v4, v5, :cond_c

    .line 227
    .line 228
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-static {p0, v0, v5}, Lxd;->c(Ljava/lang/Object;ILjava/util/Set;)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-le v5, v3, :cond_9

    .line 237
    .line 238
    move v3, v5

    .line 239
    :cond_9
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 243
    goto :goto_7

    .line 244
    :catchall_1
    move-object v5, v2

    .line 245
    :goto_7
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-static {v5, v0, v6}, Lxd;->c(Ljava/lang/Object;ILjava/util/Set;)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-le v5, v3, :cond_a

    .line 254
    .line 255
    move v3, v5

    .line 256
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    instance-of v5, p0, Landroid/view/View;

    .line 261
    .line 262
    if-eqz v5, :cond_b

    .line 263
    .line 264
    check-cast p0, Landroid/view/View;

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_b
    move-object p0, v2

    .line 268
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    move p0, v3

    .line 272
    :cond_d
    if-le p0, v1, :cond_e

    .line 273
    .line 274
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 275
    .line 276
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    aput-object p0, p1, v0

    .line 281
    .line 282
    :cond_e
    return-void
.end method
