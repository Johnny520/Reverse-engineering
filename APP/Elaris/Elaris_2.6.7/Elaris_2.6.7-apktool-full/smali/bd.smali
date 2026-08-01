.class public final Lbd;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbd;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lbd;->b:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/16 p1, 0x52

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "media_click_to_load"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Led;->a([Ljava/lang/StackTraceElement;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-object v3, v0, Lbd;->a:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v0, "rich_media_unmatched"

    .line 29
    .line 30
    invoke-static {v0, v3, v1}, Led;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object v0, v0, Lbd;->b:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    if-eq v0, v2, :cond_1e

    .line 43
    .line 44
    const-class v4, Ljava/lang/Integer;

    .line 45
    .line 46
    if-ne v0, v4, :cond_2

    .line 47
    .line 48
    goto/16 :goto_e

    .line 49
    .line 50
    :cond_2
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-eq v0, v5, :cond_1d

    .line 53
    .line 54
    const-class v6, Ljava/lang/Long;

    .line 55
    .line 56
    if-ne v0, v6, :cond_3

    .line 57
    .line 58
    goto/16 :goto_d

    .line 59
    .line 60
    :cond_3
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-eq v0, v7, :cond_1c

    .line 63
    .line 64
    const-class v8, Ljava/lang/Short;

    .line 65
    .line 66
    if-ne v0, v8, :cond_4

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_4
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    if-eq v0, v9, :cond_1b

    .line 73
    .line 74
    const-class v10, Ljava/lang/Byte;

    .line 75
    .line 76
    if-ne v0, v10, :cond_5

    .line 77
    .line 78
    goto/16 :goto_b

    .line 79
    .line 80
    :cond_5
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    if-eq v0, v11, :cond_1a

    .line 83
    .line 84
    const-class v12, Ljava/lang/Float;

    .line 85
    .line 86
    if-ne v0, v12, :cond_6

    .line 87
    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :cond_6
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-eq v0, v13, :cond_19

    .line 93
    .line 94
    const-class v14, Ljava/lang/Double;

    .line 95
    .line 96
    if-ne v0, v14, :cond_7

    .line 97
    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_7
    if-eqz v0, :cond_18

    .line 101
    .line 102
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    if-ne v0, v15, :cond_8

    .line 105
    .line 106
    goto/16 :goto_8

    .line 107
    .line 108
    :cond_8
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    if-eq v0, v15, :cond_17

    .line 111
    .line 112
    const-class v15, Ljava/lang/Boolean;

    .line 113
    .line 114
    if-ne v0, v15, :cond_9

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    const/4 v15, 0x0

    .line 118
    if-eq v0, v9, :cond_16

    .line 119
    .line 120
    if-ne v0, v10, :cond_a

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_a
    if-eq v0, v7, :cond_15

    .line 124
    .line 125
    if-ne v0, v8, :cond_b

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_b
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 129
    .line 130
    if-eq v0, v7, :cond_14

    .line 131
    .line 132
    const-class v7, Ljava/lang/Character;

    .line 133
    .line 134
    if-ne v0, v7, :cond_c

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_c
    if-eq v0, v2, :cond_13

    .line 138
    .line 139
    if-ne v0, v4, :cond_d

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_d
    if-eq v0, v5, :cond_12

    .line 143
    .line 144
    if-ne v0, v6, :cond_e

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_e
    if-eq v0, v11, :cond_11

    .line 148
    .line 149
    if-ne v0, v12, :cond_f

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_f
    if-eq v0, v13, :cond_10

    .line 153
    .line 154
    if-ne v0, v14, :cond_18

    .line 155
    .line 156
    :cond_10
    const-wide/16 v4, 0x0

    .line 157
    .line 158
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_0
    move-object/from16 v2, p1

    .line 163
    .line 164
    goto :goto_f

    .line 165
    :cond_11
    :goto_1
    const/4 v0, 0x0

    .line 166
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    goto :goto_0

    .line 171
    :cond_12
    :goto_2
    const-wide/16 v4, 0x0

    .line 172
    .line 173
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_0

    .line 178
    :cond_13
    :goto_3
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_0

    .line 183
    :cond_14
    :goto_4
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    goto :goto_0

    .line 188
    :cond_15
    :goto_5
    invoke-static {v15}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_0

    .line 193
    :cond_16
    :goto_6
    invoke-static {v15}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_0

    .line 198
    :cond_17
    :goto_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_18
    :goto_8
    const/4 v0, 0x0

    .line 202
    goto :goto_0

    .line 203
    :cond_19
    :goto_9
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_0

    .line 213
    :cond_1a
    :goto_a
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    goto :goto_0

    .line 221
    :cond_1b
    :goto_b
    const/16 v0, 0x7f

    .line 222
    .line 223
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    goto :goto_0

    .line 228
    :cond_1c
    :goto_c
    const/16 v0, 0x7fff

    .line 229
    .line 230
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    goto :goto_0

    .line 235
    :cond_1d
    :goto_d
    const-wide v4, 0x7fffffffffffffffL

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    goto :goto_0

    .line 245
    :cond_1e
    :goto_e
    const v0, 0x7fffffff

    .line 246
    .line 247
    .line 248
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    goto :goto_0

    .line 253
    :goto_f
    invoke-virtual {v2, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    const-string v0, "rich_media_auto_load_blocked"

    .line 257
    .line 258
    invoke-static {v0, v3, v1}, Led;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V

    .line 259
    .line 260
    .line 261
    return-void
.end method
