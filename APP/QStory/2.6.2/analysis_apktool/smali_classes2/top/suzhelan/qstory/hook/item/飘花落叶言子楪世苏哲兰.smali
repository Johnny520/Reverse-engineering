.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;)V
    .locals 0

    .line 1
    const/16 p1, 0x19

    .line 2
    .line 3
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

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
    .locals 6

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

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
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    new-instance p0, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 26
    .line 27
    const/16 v1, 0xf

    .line 28
    .line 29
    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_1
    new-instance p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    invoke-direct {p0, v3}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :sswitch_2
    new-instance p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 60
    .line 61
    invoke-direct {p0, p1, v3}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Landroid/os/Handler;

    .line 65
    .line 66
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v0, 0xc8

    .line 74
    .line 75
    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :sswitch_3
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :sswitch_4
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-wide v0, -0x36a5ab3e051405a7L    # -2.3488112608365847E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-wide v0, -0x36a5ab07051405a7L    # -2.3488861229573073E45

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    const-wide v0, -0x36a5ab09051405a7L    # -2.348883400698372E45

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v1, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 135
    .line 136
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 137
    .line 138
    const-class v0, Ljava/lang/String;

    .line 139
    .line 140
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 145
    .line 146
    const-wide v0, -0x36a5aaf1051405a7L    # -2.3489160678055963E45

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const/4 v1, 0x0

    .line 160
    invoke-virtual {p0, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :sswitch_5
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :sswitch_6
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-nez p0, :cond_0

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_0
    const-wide v0, -0x36a5a296051405a7L    # -2.351827523736972E45

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    const/16 v2, 0xc9

    .line 209
    .line 210
    if-eq p1, v2, :cond_1

    .line 211
    .line 212
    const/16 v2, 0xca

    .line 213
    .line 214
    if-eq p1, v2, :cond_1

    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_1
    const-wide v4, -0x36a5a299051405a7L    # -2.3518234403485688E45

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {p0, p1, v3}, Lde/robv/android/xposed/XposedHelpers;->setBooleanField(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {p0, p1, v3}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    .line 235
    .line 236
    :catch_0
    :goto_0
    return-void

    .line 237
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_6
        0x9 -> :sswitch_5
        0xb -> :sswitch_4
        0x18 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-wide v1, -0x36a5b59d051405a7L    # -2.3451974620998843E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, -0x1

    .line 10
    const-wide v5, -0x36a5bb5e051405a7L    # -2.343192518393986E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const-wide v9, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 30
    .line 31
    aget-object p0, p0, v7

    .line 32
    .line 33
    const-wide v0, -0x36a52684051405a7L    # -2.3950597178895432E45

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-class v0, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    const-wide v0, -0x36a5268f051405a7L    # -2.3950447454653987E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    new-instance p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    invoke-direct {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 68
    .line 69
    .line 70
    const-wide v0, -0x36a52655051405a7L    # -2.3951236909745244E45

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-class v1, [B

    .line 80
    .line 81
    invoke-static {v1, v0, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, [B

    .line 86
    .line 87
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-wide v0, -0x36a5265f051405a7L    # -2.3951100796798475E45

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-wide v2, -0x36a52659051405a7L    # -2.3951182464566537E45

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    const/16 v5, 0x2dc

    .line 133
    .line 134
    if-ne v4, v5, :cond_0

    .line 135
    .line 136
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    const/16 v4, 0xc

    .line 145
    .line 146
    if-ne p1, v4, :cond_0

    .line 147
    .line 148
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const-wide v4, -0x36a5265b051405a7L    # -2.3951155241977183E45

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-wide v6, -0x36a52645051405a7L    # -2.3951454690460073E45

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const-wide v7, -0x36a52647051405a7L    # -2.395142746787072E45

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 240
    .line 241
    .line 242
    move-result-wide v1

    .line 243
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-static {v6}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {p1, p0, v0, v1, v2}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopBanInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 252
    .line 253
    .line 254
    :cond_0
    return-void

    .line 255
    :pswitch_2
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 262
    .line 263
    aget-object p0, p0, v7

    .line 264
    .line 265
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    check-cast p0, Ljava/lang/Long;

    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 274
    .line 275
    .line 276
    move-result-wide v0

    .line 277
    const-wide/16 v2, 0x0

    .line 278
    .line 279
    cmp-long p0, v0, v2

    .line 280
    .line 281
    if-gtz p0, :cond_1

    .line 282
    .line 283
    const-wide v0, -0x36a5de48051405a7L    # -2.3310267432118287E45

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_1
    const-wide/32 v4, 0x15180

    .line 298
    .line 299
    .line 300
    div-long v6, v0, v4

    .line 301
    .line 302
    rem-long v4, v0, v4

    .line 303
    .line 304
    const-wide/16 v8, 0xe10

    .line 305
    .line 306
    div-long/2addr v4, v8

    .line 307
    rem-long v8, v0, v8

    .line 308
    .line 309
    const-wide/16 v10, 0x3c

    .line 310
    .line 311
    div-long/2addr v8, v10

    .line 312
    rem-long/2addr v0, v10

    .line 313
    new-instance p0, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    cmp-long v10, v6, v2

    .line 319
    .line 320
    if-lez v10, :cond_2

    .line 321
    .line 322
    new-instance v10, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const/16 v6, 0x5929

    .line 331
    .line 332
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    :cond_2
    cmp-long v6, v4, v2

    .line 343
    .line 344
    if-lez v6, :cond_3

    .line 345
    .line 346
    new-instance v6, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    const/16 v4, 0x65f6

    .line 355
    .line 356
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    :cond_3
    cmp-long v4, v8, v2

    .line 367
    .line 368
    if-lez v4, :cond_4

    .line 369
    .line 370
    new-instance v4, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v5, 0x5206

    .line 379
    .line 380
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    :cond_4
    cmp-long v2, v0, v2

    .line 391
    .line 392
    if-gtz v2, :cond_5

    .line 393
    .line 394
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-nez v2, :cond_6

    .line 399
    .line 400
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const/16 v0, 0x79d2

    .line 409
    .line 410
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    :cond_6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :goto_0
    return-void

    .line 428
    :pswitch_3
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :pswitch_4
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_5
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 463
    .line 464
    const p1, 0x7fffffff

    .line 465
    .line 466
    .line 467
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    aput-object p1, p0, v3

    .line 472
    .line 473
    return-void

    .line 474
    :pswitch_6
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    :try_start_0
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 481
    .line 482
    aget-object p0, p0, v7

    .line 483
    .line 484
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    check-cast p0, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result p0

    .line 496
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 497
    .line 498
    const-wide v1, -0x36a5c0cc051405a7L    # -2.3413005484339057E45

    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    :try_start_1
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-static {v0, v1, p0}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 508
    .line 509
    .line 510
    const-wide v1, -0x36a5c0c9051405a7L    # -2.3413046318223088E45

    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    invoke-static {v0, v1, p0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 524
    .line 525
    .line 526
    :catch_0
    :try_start_2
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 527
    .line 528
    .line 529
    :catch_1
    return-void

    .line 530
    :pswitch_7
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :pswitch_8
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 547
    .line 548
    array-length v0, p0

    .line 549
    if-ne v0, v3, :cond_7

    .line 550
    .line 551
    aget-object p0, p0, v7

    .line 552
    .line 553
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    check-cast p0, Ljava/lang/Long;

    .line 560
    .line 561
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 562
    .line 563
    .line 564
    move-result-wide v0

    .line 565
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object p0

    .line 569
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    if-nez p0, :cond_7

    .line 578
    .line 579
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 580
    .line 581
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_7
    return-void

    .line 585
    :pswitch_9
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 592
    .line 593
    array-length v0, p0

    .line 594
    const/4 v1, 0x3

    .line 595
    if-ne v0, v1, :cond_8

    .line 596
    .line 597
    aget-object p0, p0, v3

    .line 598
    .line 599
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    check-cast p0, Ljava/lang/Long;

    .line 606
    .line 607
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 608
    .line 609
    .line 610
    move-result-wide v0

    .line 611
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-nez p0, :cond_8

    .line 624
    .line 625
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 626
    .line 627
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    :cond_8
    return-void

    .line 631
    :pswitch_a
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 638
    .line 639
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_b
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 650
    .line 651
    aget-object p0, p0, v7

    .line 652
    .line 653
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    check-cast p0, Ljava/lang/Integer;

    .line 660
    .line 661
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 662
    .line 663
    .line 664
    move-result p0

    .line 665
    if-lez p0, :cond_9

    .line 666
    .line 667
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 668
    .line 669
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 670
    .line 671
    .line 672
    move-result-object p1

    .line 673
    aput-object p1, p0, v7

    .line 674
    .line 675
    :cond_9
    return-void

    .line 676
    :pswitch_c
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-void

    .line 686
    :pswitch_d
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    return-void

    .line 696
    :pswitch_e
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    return-void

    .line 706
    :pswitch_f
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 713
    .line 714
    .line 715
    move-result-object p0

    .line 716
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    return-void

    .line 720
    :pswitch_10
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_11
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    :pswitch_12
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :pswitch_13
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :pswitch_14
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    return-void

    .line 770
    :pswitch_15
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    :pswitch_16
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 787
    .line 788
    aget-object p0, p0, v7

    .line 789
    .line 790
    instance-of p1, p0, Landroid/os/Bundle;

    .line 791
    .line 792
    if-eqz p1, :cond_a

    .line 793
    .line 794
    move-object v8, p0

    .line 795
    check-cast v8, Landroid/os/Bundle;

    .line 796
    .line 797
    :cond_a
    if-nez v8, :cond_b

    .line 798
    .line 799
    goto :goto_1

    .line 800
    :cond_b
    const-wide p0, -0x36a53353051405a7L    # -2.3905965743650082E45

    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object p0

    .line 809
    invoke-virtual {v8, p0, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 810
    .line 811
    .line 812
    move-result p0

    .line 813
    if-eqz p0, :cond_c

    .line 814
    .line 815
    goto :goto_1

    .line 816
    :cond_c
    const-wide p0, -0x36a5a097051405a7L    # -2.3525230608949583E45

    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v8, v0, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    const-wide v1, -0x36a5a09a051405a7L    # -2.3525189775065552E45

    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-virtual {v8, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    if-eqz v0, :cond_e

    .line 843
    .line 844
    if-eqz v3, :cond_e

    .line 845
    .line 846
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    if-nez v0, :cond_d

    .line 851
    .line 852
    goto :goto_1

    .line 853
    :cond_d
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object p0

    .line 857
    invoke-virtual {v8, p0, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 858
    .line 859
    .line 860
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object p0

    .line 864
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    invoke-virtual {v8, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    :cond_e
    :goto_1
    return-void

    .line 877
    :pswitch_17
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 884
    .line 885
    const-wide v0, -0x36a5a289051405a7L    # -2.3518452184200517E45

    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    const/4 p1, 0x1

    .line 897
    invoke-static {p1, p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰楪哲(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object p0

    .line 901
    if-nez p0, :cond_f

    .line 902
    .line 903
    goto :goto_2

    .line 904
    :cond_f
    const-wide v0, -0x36a5a276051405a7L    # -2.3518710798799377E45

    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    :try_start_3
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object p1

    .line 913
    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 914
    .line 915
    .line 916
    move-result p1

    .line 917
    const/16 v2, 0xc9

    .line 918
    .line 919
    if-eq p1, v2, :cond_10

    .line 920
    .line 921
    const/16 v2, 0xca

    .line 922
    .line 923
    if-eq p1, v2, :cond_10

    .line 924
    .line 925
    goto :goto_2

    .line 926
    :cond_10
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object p1

    .line 930
    invoke-static {p0, p1, v7}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 931
    .line 932
    .line 933
    :catch_2
    :goto_2
    return-void

    .line 934
    nop

    .line 935
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
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
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
