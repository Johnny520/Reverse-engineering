.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-wide v1, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 19
    .line 20
    iget-object v0, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    aget-object v0, v0, v1

    .line 34
    .line 35
    instance-of v2, v0, Ljava/lang/String;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v0, v4

    .line 44
    :goto_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    instance-of v2, p1, Ljava/lang/ClassLoader;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    move-object v4, p1

    .line 53
    check-cast v4, Ljava/lang/ClassLoader;

    .line 54
    .line 55
    :cond_2
    const-wide v5, -0x36a5b2c4051405a7L    # -2.3461897254818258E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    if-eqz v4, :cond_7

    .line 71
    .line 72
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 73
    .line 74
    iget-boolean p1, p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪哲兰世苏:Z

    .line 75
    .line 76
    if-nez p1, :cond_7

    .line 77
    .line 78
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 79
    .line 80
    iput-boolean v1, p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪哲兰世苏:Z

    .line 81
    .line 82
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 83
    .line 84
    const-wide v5, -0x36a5c213051405a7L    # -2.340855459097973E45

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v4}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-nez p1, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-wide v4, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    array-length v0, p1

    .line 116
    move v2, v3

    .line 117
    :goto_1
    if-ge v2, v0, :cond_7

    .line 118
    .line 119
    aget-object v4, p1, v2

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    const-wide v7, -0x36a5c1f5051405a7L    # -2.3408962929820036E45

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_6

    .line 147
    .line 148
    array-length v6, v5

    .line 149
    const/4 v7, 0x2

    .line 150
    if-ne v6, v7, :cond_6

    .line 151
    .line 152
    aget-object v6, v5, v3

    .line 153
    .line 154
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 155
    .line 156
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-nez v6, :cond_4

    .line 161
    .line 162
    aget-object v6, v5, v3

    .line 163
    .line 164
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_6

    .line 169
    .line 170
    :cond_4
    aget-object v6, v5, v1

    .line 171
    .line 172
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 173
    .line 174
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-nez v6, :cond_5

    .line 179
    .line 180
    aget-object v5, v5, v1

    .line 181
    .line 182
    invoke-static {v5, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_6

    .line 187
    .line 188
    :cond_5
    new-instance v5, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;

    .line 189
    .line 190
    invoke-direct {v5, p0, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v4, v5}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    .line 195
    .line 196
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :catch_0
    :cond_7
    :goto_2
    return-void

    .line 200
    :pswitch_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 201
    .line 202
    iget-object p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-nez p0, :cond_9

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_9
    const-wide v0, -0x36a5c262051405a7L    # -2.340747929870026E45

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    :try_start_1
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p0, p1, v3}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :catch_1
    :try_start_2
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const-wide/16 v0, 0x0

    .line 236
    .line 237
    invoke-static {p0, p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->setLongField(Ljava/lang/Object;Ljava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 238
    .line 239
    .line 240
    :catch_2
    :goto_3
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
