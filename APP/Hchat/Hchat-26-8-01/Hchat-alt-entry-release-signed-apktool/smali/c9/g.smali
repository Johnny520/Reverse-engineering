.class public final Lc9/g;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc9/g;->e:I

    .line 2
    .line 3
    invoke-direct {p0}, Lr8/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static k(Lr8/g;)V
    .locals 5

    .line 1
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lc9/f;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, Lc9/f;-><init>(Lr8/g;I)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    const-string v2, "shared:send_button"

    .line 12
    .line 13
    const-string v3, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 14
    .line 15
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 16
    .line 17
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lc9/f;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, p0, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 24
    .line 25
    .line 26
    const-string v2, "script_plugin:message"

    .line 27
    .line 28
    const-string v3, "\u811a\u672c\u63d2\u4ef6-\u6d88\u606f\u76d1\u542c"

    .line 29
    .line 30
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lc9/f;

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, p0, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 37
    .line 38
    .line 39
    const-string v2, "script_plugin:new_friend"

    .line 40
    .line 41
    const-string v3, "\u811a\u672c\u63d2\u4ef6-\u597d\u53cb\u7533\u8bf7"

    .line 42
    .line 43
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lc9/f;

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    invoke-direct {v0, p0, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 50
    .line 51
    .line 52
    const-string p0, "script_plugin:member_change"

    .line 53
    .line 54
    const-string v2, "\u811a\u672c\u63d2\u4ef6-\u6210\u5458\u53d8\u52a8"

    .line 55
    .line 56
    invoke-static {v1, v0, p0, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lc9/g;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "quick_terminate"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "message_affix"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "keyword_notification"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "auto_reply"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "protobuf_packet"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "wechat_keep_alive"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "auto_original_image"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_6
    const-string v0, "audio_transform"

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_7
    const-string v0, "block_at_all_notification"

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_8
    const-string v0, "group_chat_label"

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_9
    const-string v0, "floating_shortcut_menu"

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_a
    const-string v0, "sns_anti_recall"

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_b
    const-string v0, "script_plugin"

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_c
    const-string v0, "custom_notification"

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_d
    const-string v0, "conversation_group"

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    iget v0, p0, Lc9/g;->e:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ls8/d;

    .line 10
    .line 11
    const-string v0, "\u4ece\u5fae\u4fe1\u53f3\u4e0a\u89d2\u52a0\u53f7\u83dc\u5355\u5feb\u901f\u7ed3\u675f\u5fae\u4fe1\u8fdb\u7a0b"

    .line 12
    .line 13
    const-string v1, "practical"

    .line 14
    .line 15
    const-string v2, "quick_terminate"

    .line 16
    .line 17
    const-string v3, "\u5feb\u6377\u7ec8\u6b62"

    .line 18
    .line 19
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    new-instance p1, Ls8/d;

    .line 27
    .line 28
    const-string v0, "\u81ea\u5b9a\u4e49\u804a\u5929\u6587\u5b57\u6d88\u606f\u7684\u53d1\u9001\u683c\u5f0f"

    .line 29
    .line 30
    const-string v1, "practical"

    .line 31
    .line 32
    const-string v2, "message_affix"

    .line 33
    .line 34
    const-string v3, "\u53d1\u9001\u6587\u672c\u683c\u5f0f"

    .line 35
    .line 36
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    new-instance p1, Ls8/d;

    .line 44
    .line 45
    const-string v0, "\u6309\u5173\u952e\u8bcd\u3001@\u6211\u6216@\u6240\u6709\u4eba\u63d0\u9192\u6307\u5b9a\u804a\u5929\u6d88\u606f\uff0c\u652f\u6301\u94c3\u58f0\u548c\u9707\u52a8"

    .line 46
    .line 47
    const-string v1, "enhance"

    .line 48
    .line 49
    const-string v2, "keyword_notification"

    .line 50
    .line 51
    const-string v3, "\u5173\u952e\u8bcd\u901a\u77e5"

    .line 52
    .line 53
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    new-instance p1, Ls8/d;

    .line 61
    .line 62
    const-string v0, "\u6309\u89c4\u5219\u56de\u590d\u6d88\u606f\uff0c\u5904\u7406\u597d\u53cb\u7533\u8bf7\u548c\u901a\u8fc7\u540e\u7684\u6b22\u8fce\u8bed"

    .line 63
    .line 64
    const-string v1, "practical"

    .line 65
    .line 66
    const-string v2, "auto_reply"

    .line 67
    .line 68
    const-string v3, "\u81ea\u52a8\u56de\u590d"

    .line 69
    .line 70
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_3
    new-instance p1, Ls8/d;

    .line 78
    .line 79
    const-string v0, "\u6293\u5305\u548c\u81ea\u5b9a\u4e49\u53d1\u5305"

    .line 80
    .line 81
    const-string v1, "entertainment"

    .line 82
    .line 83
    const-string v2, "protobuf_packet"

    .line 84
    .line 85
    const-string v3, "Protobuf"

    .line 86
    .line 87
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_4
    new-instance p1, Ls8/d;

    .line 95
    .line 96
    const-string v0, "\u524d\u53f0\u670d\u52a1\u3001WakeLock \u548c Root \u767d\u540d\u5355\u63d0\u9ad8\u606f\u5c4f\u5b58\u6d3b\u7387"

    .line 97
    .line 98
    const-string v1, "practical"

    .line 99
    .line 100
    const-string v2, "wechat_keep_alive"

    .line 101
    .line 102
    const-string v3, "\u5fae\u4fe1\u5f3a\u4fdd\u6d3b"

    .line 103
    .line 104
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_5
    new-instance p1, Ls8/d;

    .line 112
    .line 113
    const-string v0, "\u53d1\u9001\u804a\u5929\u56fe\u7247\u65f6\u81ea\u52a8\u52fe\u9009\u539f\u56fe"

    .line 114
    .line 115
    const-string v1, "practical"

    .line 116
    .line 117
    const-string v2, "auto_original_image"

    .line 118
    .line 119
    const-string v3, "\u81ea\u52a8\u52fe\u9009\u539f\u56fe"

    .line 120
    .line 121
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_6
    new-instance p1, Ls8/d;

    .line 129
    .line 130
    const-string v0, "\u4efb\u610f\u97f3\u9891\u8f6c Silk \u4fdd\u5b58/\u53d1\u9001\uff0c\u6216\u628a Silk \u5bfc\u51fa\u4e3a MP3/M4A \u4fdd\u5b58"

    .line 131
    .line 132
    const-string v1, "practical"

    .line 133
    .line 134
    const-string v2, "audio_transform"

    .line 135
    .line 136
    const-string v3, "\u97f3\u9891\u8f6c\u6362"

    .line 137
    .line 138
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_7
    new-instance p1, Ls8/d;

    .line 146
    .line 147
    const-string v0, "\u6309\u9009\u62e9\u7684\u7fa4\u804a\u62e6\u622a\u827e\u7279\u6240\u6709\u4eba\u901a\u77e5"

    .line 148
    .line 149
    const-string v1, "practical"

    .line 150
    .line 151
    const-string v2, "block_at_all_notification"

    .line 152
    .line 153
    const-string v3, "\u5c4f\u853d\u827e\u7279\u6240\u6709\u4eba"

    .line 154
    .line 155
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_8
    new-instance p1, Lha/k0;

    .line 163
    .line 164
    const-string v0, "\u5206\u7c7b\u7ba1\u7406\u7fa4\u804a\uff0c\u5728\u540d\u5355\u9009\u62e9\u5668\u4e2d\u6309\u6807\u7b7e\u6279\u91cf\u9009\u62e9"

    .line 165
    .line 166
    const-string v1, "practical"

    .line 167
    .line 168
    const-string v2, "group_chat_label"

    .line 169
    .line 170
    const-string v3, "\u7fa4\u804a\u6807\u7b7e"

    .line 171
    .line 172
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_9
    new-instance p1, Lha/k0;

    .line 180
    .line 181
    const-string v0, "\u5c55\u5f00\u63d2\u4ef6 Agent\u3001\u81ea\u5b9a\u4e49\u5feb\u6377\u9879\u6216\u5fae\u4fe1\u9875\u9762"

    .line 182
    .line 183
    const-string v1, "practical"

    .line 184
    .line 185
    const-string v2, "floating_shortcut_menu"

    .line 186
    .line 187
    const-string v3, "\u60ac\u6d6e\u5feb\u6377\u83dc\u5355"

    .line 188
    .line 189
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_a
    new-instance p1, Lha/k0;

    .line 197
    .line 198
    const-string v0, "\u5df2\u7f13\u5b58\u7684\u670b\u53cb\u5708\u5728\u5bf9\u65b9\u5220\u9664\u6216\u9650\u5236\u53ef\u89c1\u8303\u56f4\u540e\u7ee7\u7eed\u663e\u793a"

    .line 199
    .line 200
    const-string v1, "practical"

    .line 201
    .line 202
    const-string v2, "sns_anti_recall"

    .line 203
    .line 204
    const-string v3, "\u670b\u53cb\u5708\u9632\u64a4\u56de"

    .line 205
    .line 206
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_b
    new-instance p1, Laa/g;

    .line 214
    .line 215
    const-string v0, "\u542f\u52a8\u65f6\u81ea\u52a8\u52a0\u8f7d\u5df2\u542f\u7528\u63d2\u4ef6"

    .line 216
    .line 217
    const-string v1, "enhance"

    .line 218
    .line 219
    const-string v2, "script_plugin"

    .line 220
    .line 221
    const-string v3, "\u63d2\u4ef6\u603b\u5f00\u5173"

    .line 222
    .line 223
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_c
    new-instance p1, Laa/g;

    .line 231
    .line 232
    const-string v0, "\u6309\u9ed8\u8ba4\u89c4\u5219\u6216\u4f1a\u8bdd\u89c4\u5219\u63a5\u7ba1\u5fae\u4fe1\u901a\u77e5\uff0c\u652f\u6301\u94c3\u58f0\u3001\u9707\u52a8\u3001\u9759\u9ed8\u3001\u7fa4\u6210\u5458\u8fc7\u6ee4\u3001\u5df2\u8bfb\u548c\u5feb\u6377\u56de\u590d"

    .line 233
    .line 234
    const-string v1, "enhance"

    .line 235
    .line 236
    const-string v2, "custom_notification"

    .line 237
    .line 238
    const-string v3, "\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 239
    .line 240
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_d
    new-instance p1, Laa/g;

    .line 248
    .line 249
    const-string v0, "\u6309\u81ea\u5b9a\u4e49\u5206\u7ec4\u6574\u7406\u804a\u5929\uff0c\u652f\u6301\u591a\u7ea7\u5206\u7c7b"

    .line 250
    .line 251
    const-string v1, "enhance"

    .line 252
    .line 253
    const-string v2, "conversation_group"

    .line 254
    .line 255
    const-string v3, "\u804a\u5929\u5206\u7ec4"

    .line 256
    .line 257
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final g(Lr8/g;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lc9/g;->e:I

    .line 6
    .line 7
    const/16 v4, 0x13

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/16 v6, 0xa

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 26
    .line 27
    const-string v3, "Hchat_message_affix_config"

    .line 28
    .line 29
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Lq9/a;

    .line 34
    .line 35
    invoke-direct {v3, v2, v1}, Lq9/a;-><init>(Landroid/content/SharedPreferences;Lc9/g;)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Leb/m0;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    .line 40
    new-instance v5, Le9/h;

    .line 41
    .line 42
    invoke-direct {v5, v4}, Le9/h;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v5, v2}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 46
    .line 47
    .line 48
    new-instance v4, Leb/k0;

    .line 49
    .line 50
    invoke-direct {v4, v3}, Leb/k0;-><init>(Lq9/a;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    new-instance v2, La2/a;

    .line 57
    .line 58
    invoke-direct {v2, v6}, La2/a;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v2, Lr8/e;->a:Landroid/os/Handler;

    .line 65
    .line 66
    const-string v2, "shared:send_button"

    .line 67
    .line 68
    const-string v3, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 69
    .line 70
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 71
    .line 72
    new-instance v5, Lc9/f;

    .line 73
    .line 74
    invoke-direct {v5, v0, v6}, Lc9/f;-><init>(Lr8/g;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v7, v5, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 78
    .line 79
    .line 80
    const-class v2, Lf8/e;

    .line 81
    .line 82
    new-instance v3, Leb/s;

    .line 83
    .line 84
    const/4 v4, 0x3

    .line 85
    invoke-direct {v3, v1, v0, v4}, Leb/s;-><init>(Lr8/a;Lr8/g;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-class v2, Lf8/e;

    .line 96
    .line 97
    new-instance v3, Le9/a;

    .line 98
    .line 99
    const/16 v4, 0xf

    .line 100
    .line 101
    invoke-direct {v3, v1, v4, v0}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 105
    .line 106
    .line 107
    const-class v2, Lf8/f;

    .line 108
    .line 109
    new-instance v3, Leb/s;

    .line 110
    .line 111
    invoke-direct {v3, v0}, Leb/s;-><init>(Lr8/g;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-class v2, Lf8/e;

    .line 122
    .line 123
    new-instance v3, Le9/a;

    .line 124
    .line 125
    const/16 v4, 0xe

    .line 126
    .line 127
    invoke-direct {v3, v1, v4, v0}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v2, Lr8/e;->a:Landroid/os/Handler;

    .line 138
    .line 139
    const-string v2, "protobuf_packet"

    .line 140
    .line 141
    const-string v3, "Protobuf"

    .line 142
    .line 143
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 144
    .line 145
    new-instance v5, Lsh/v1;

    .line 146
    .line 147
    const/4 v6, 0x5

    .line 148
    invoke-direct {v5, v0, v6, v1}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v7, v5, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 152
    .line 153
    .line 154
    const-class v2, Lf8/e;

    .line 155
    .line 156
    new-instance v3, Le9/a;

    .line 157
    .line 158
    const/16 v4, 0xd

    .line 159
    .line 160
    invoke-direct {v3, v1, v4, v0}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 171
    .line 172
    iget-object v0, v0, Lr8/g;->b:Landroid/content/Context;

    .line 173
    .line 174
    invoke-static {v2, v0}, Lw9/a;->a(Landroid/content/Context;Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v2, Lw8/a;

    .line 182
    .line 183
    invoke-direct {v2, v0}, Lw8/a;-><init>(Lr8/g;)V

    .line 184
    .line 185
    .line 186
    iget-object v3, v2, Lw8/a;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 187
    .line 188
    sget-object v0, Lw8/a;->d:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    move v5, v8

    .line 195
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Ljava/lang/String;

    .line 206
    .line 207
    iget-object v6, v2, Lw8/a;->a:Lr8/g;

    .line 208
    .line 209
    iget-object v6, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 210
    .line 211
    invoke-static {v0, v6}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_0

    .line 216
    .line 217
    const-string v6, "onCreate"

    .line 218
    .line 219
    const-class v7, Landroid/os/Bundle;

    .line 220
    .line 221
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {v0, v6, v7}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    if-eqz v6, :cond_0

    .line 230
    .line 231
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_1

    .line 236
    .line 237
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_1
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_4

    .line 249
    .line 250
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_2

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_2
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 262
    .line 263
    new-instance v7, Lb9/e;

    .line 264
    .line 265
    const/16 v9, 0x1c

    .line 266
    .line 267
    invoke-direct {v7, v2, v9}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :catchall_0
    move-exception v0

    .line 280
    new-instance v7, Lsf/f;

    .line 281
    .line 282
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    move-object v0, v7

    .line 286
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    if-nez v7, :cond_3

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_3
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const-string v6, "[Hchat:AutoOriginalImage] \u5b89\u88c5\u56fe\u7247\u53d1\u9001\u9875\u9762 Hook \u5931\u8d25: "

    .line 298
    .line 299
    invoke-static {v6, v0, v7}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 303
    .line 304
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    goto :goto_5

    .line 311
    :cond_4
    :goto_4
    move v0, v8

    .line 312
    :goto_5
    if-eqz v0, :cond_0

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_5
    if-nez v5, :cond_6

    .line 316
    .line 317
    const-string v0, "[Hchat:AutoOriginalImage] \u672a\u627e\u5230\u56fe\u7247\u53d1\u9001\u9875\u9762 onCreate Hook \u5165\u53e3"

    .line 318
    .line 319
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_6
    return-void

    .line 323
    :pswitch_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 331
    .line 332
    invoke-static {v0}, Le9/q;->i(Lr8/g;)V

    .line 333
    .line 334
    .line 335
    const-class v2, Lf8/e;

    .line 336
    .line 337
    new-instance v3, Le9/a;

    .line 338
    .line 339
    invoke-direct {v3, v1, v7, v0}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :pswitch_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    sget-object v2, Lk9/r;->a:Lk9/r;

    .line 354
    .line 355
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 356
    .line 357
    monitor-enter v2

    .line 358
    :try_start_1
    sget-boolean v6, Lk9/r;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 359
    .line 360
    if-eqz v6, :cond_7

    .line 361
    .line 362
    monitor-exit v2

    .line 363
    goto :goto_6

    .line 364
    :cond_7
    :try_start_2
    invoke-static {v0}, Loh/h;->L(Landroid/content/Context;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    const-string v6, "floating_shortcut_menu"

    .line 368
    .line 369
    invoke-static {v0, v6}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sget-object v6, Lk9/r;->k:Lk9/k;

    .line 374
    .line 375
    invoke-interface {v0, v6}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 376
    .line 377
    .line 378
    const-string v6, "enable"

    .line 379
    .line 380
    invoke-interface {v0, v6, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    sput-boolean v6, Lk9/r;->d:Z

    .line 385
    .line 386
    sput-object v0, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 387
    .line 388
    sput-boolean v5, Lk9/r;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 389
    .line 390
    monitor-exit v2

    .line 391
    :goto_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->lifecycle()Lq8/q;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-eqz v0, :cond_8

    .line 396
    .line 397
    new-instance v2, Lk9/a;

    .line 398
    .line 399
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    iget-object v0, v0, Lq8/q;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 403
    .line 404
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    new-instance v0, Ll3/w;

    .line 408
    .line 409
    const/16 v2, 0x14

    .line 410
    .line 411
    invoke-direct {v0, v2}, Ll3/w;-><init>(I)V

    .line 412
    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_8
    const/4 v0, 0x0

    .line 416
    :goto_7
    invoke-virtual {v1, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    if-eqz v0, :cond_9

    .line 424
    .line 425
    new-instance v2, Lk9/b;

    .line 426
    .line 427
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 428
    .line 429
    .line 430
    iget-object v0, v0, Lq8/m;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 431
    .line 432
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    new-instance v3, Ll3/w;

    .line 436
    .line 437
    invoke-direct {v3, v4}, Ll3/w;-><init>(I)V

    .line 438
    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_9
    const/4 v3, 0x0

    .line 442
    :goto_8
    invoke-virtual {v1, v3}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    if-eqz v0, :cond_a

    .line 450
    .line 451
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-eqz v0, :cond_a

    .line 456
    .line 457
    new-instance v2, Lk9/p;

    .line 458
    .line 459
    invoke-direct {v2, v0, v8}, Lk9/p;-><init>(Landroid/app/Activity;I)V

    .line 460
    .line 461
    .line 462
    invoke-static {v2}, Lk9/r;->p(Lfg/a;)V

    .line 463
    .line 464
    .line 465
    :cond_a
    return-void

    .line 466
    :catchall_1
    move-exception v0

    .line 467
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 468
    throw v0

    .line 469
    :pswitch_a
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v4, Lha/j0;

    .line 475
    .line 476
    invoke-direct {v4, v0}, Lha/j0;-><init>(Lr8/g;)V

    .line 477
    .line 478
    .line 479
    iget-object v7, v4, Lha/j0;->a:Lr8/g;

    .line 480
    .line 481
    iget-object v9, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 482
    .line 483
    iget-object v9, v9, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 484
    .line 485
    :goto_9
    if-eqz v9, :cond_b

    .line 486
    .line 487
    const-class v10, Ljava/lang/Object;

    .line 488
    .line 489
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    if-nez v10, :cond_b

    .line 494
    .line 495
    invoke-virtual {v4, v9}, Lha/j0;->h(Ljava/lang/Class;)I

    .line 496
    .line 497
    .line 498
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    goto :goto_9

    .line 503
    :cond_b
    const-string v9, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 504
    .line 505
    :try_start_4
    iget-object v10, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 506
    .line 507
    invoke-static {v9, v10}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    invoke-virtual {v4, v9}, Lha/j0;->h(Ljava/lang/Class;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 512
    .line 513
    .line 514
    :catchall_2
    const-string v9, "com.tencent.wcdb.compat.SQLiteDatabase"

    .line 515
    .line 516
    :try_start_5
    iget-object v10, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 517
    .line 518
    invoke-static {v9, v10}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-result-object v9

    .line 522
    invoke-virtual {v4, v9}, Lha/j0;->h(Ljava/lang/Class;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 523
    .line 524
    .line 525
    :catchall_3
    const-string v9, "android.database.sqlite.SQLiteDatabase"

    .line 526
    .line 527
    :try_start_6
    iget-object v7, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 528
    .line 529
    invoke-static {v9, v7}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    invoke-virtual {v4, v7}, Lha/j0;->h(Ljava/lang/Class;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 534
    .line 535
    .line 536
    :catchall_4
    iget-object v7, v4, Lha/j0;->c:Landroid/content/SharedPreferences;

    .line 537
    .line 538
    const-string v9, ""

    .line 539
    .line 540
    const-string v10, "enable_flutter_sns_page"

    .line 541
    .line 542
    iget-object v11, v0, Lr8/g;->a:Landroid/content/Context;

    .line 543
    .line 544
    iget-object v12, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 545
    .line 546
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-static {v11, v12}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    iget-object v11, v11, Ll8/i;->h:Ljava/lang/String;

    .line 554
    .line 555
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 556
    .line 557
    .line 558
    move-result v13

    .line 559
    if-nez v13, :cond_c

    .line 560
    .line 561
    goto :goto_a

    .line 562
    :cond_c
    const/4 v11, 0x0

    .line 563
    :goto_a
    if-eqz v11, :cond_d

    .line 564
    .line 565
    const-string v13, "|sns_anti_recall_v2"

    .line 566
    .line 567
    invoke-virtual {v11, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    goto :goto_b

    .line 572
    :cond_d
    const/4 v11, 0x0

    .line 573
    :goto_b
    if-nez v11, :cond_e

    .line 574
    .line 575
    move-object v11, v9

    .line 576
    :cond_e
    invoke-static {v7, v11, v12, v10}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 577
    .line 578
    .line 579
    move-result-object v13

    .line 580
    if-eqz v13, :cond_10

    .line 581
    .line 582
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    move-result-object v14

    .line 586
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    array-length v14, v14

    .line 590
    if-nez v14, :cond_f

    .line 591
    .line 592
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    move-result-object v14

    .line 596
    invoke-static {v14, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v14

    .line 600
    if-eqz v14, :cond_f

    .line 601
    .line 602
    goto :goto_c

    .line 603
    :cond_f
    const/4 v13, 0x0

    .line 604
    :goto_c
    if-eqz v13, :cond_10

    .line 605
    .line 606
    goto/16 :goto_13

    .line 607
    .line 608
    :cond_10
    :try_start_7
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 609
    .line 610
    new-instance v13, Lch/e;

    .line 611
    .line 612
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 613
    .line 614
    .line 615
    new-instance v14, Lfh/k;

    .line 616
    .line 617
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 618
    .line 619
    .line 620
    const-string v15, "enableFlutterSNSPage"

    .line 621
    .line 622
    const-string v3, "com.tencent.mm.plugin.sns.router.SnsRouter"

    .line 623
    .line 624
    filled-new-array {v15, v3}, [Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v14, v3}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    iput-object v14, v13, Lch/e;->h:Lfh/k;

    .line 632
    .line 633
    invoke-virtual {v0, v13}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    new-instance v3, Ljava/util/ArrayList;

    .line 638
    .line 639
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v13

    .line 650
    if-eqz v13, :cond_11

    .line 651
    .line 652
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v13

    .line 656
    check-cast v13, Lhh/o;

    .line 657
    .line 658
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v13}, Lhh/o;->p()Llh/d;

    .line 662
    .line 663
    .line 664
    move-result-object v13

    .line 665
    invoke-virtual {v13, v12}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 666
    .line 667
    .line 668
    move-result-object v13

    .line 669
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    goto :goto_d

    .line 673
    :catchall_5
    move-exception v0

    .line 674
    goto :goto_10

    .line 675
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    if-eqz v3, :cond_14

    .line 684
    .line 685
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    move-object v12, v3

    .line 690
    check-cast v12, Ljava/lang/reflect/Method;

    .line 691
    .line 692
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    move-result-object v13

    .line 696
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    array-length v13, v13

    .line 700
    if-nez v13, :cond_13

    .line 701
    .line 702
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    move-result-object v12

    .line 706
    invoke-static {v12, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v12

    .line 710
    if-eqz v12, :cond_13

    .line 711
    .line 712
    move v12, v5

    .line 713
    goto :goto_e

    .line 714
    :cond_13
    move v12, v8

    .line 715
    :goto_e
    if-eqz v12, :cond_12

    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_14
    const/4 v3, 0x0

    .line 719
    :goto_f
    check-cast v3, Ljava/lang/reflect/Method;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 720
    .line 721
    goto :goto_11

    .line 722
    :goto_10
    new-instance v3, Lsf/f;

    .line 723
    .line 724
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 725
    .line 726
    .line 727
    :goto_11
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    if-nez v0, :cond_15

    .line 732
    .line 733
    goto :goto_12

    .line 734
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const-string v3, "[Hchat:SnsAntiRecall] \u5b9a\u4f4d\u65e7\u7248\u670b\u53cb\u5708\u4e3b\u9875\u5f00\u5173\u5931\u8d25: "

    .line 739
    .line 740
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    const/4 v3, 0x0

    .line 744
    :goto_12
    move-object v13, v3

    .line 745
    check-cast v13, Ljava/lang/reflect/Method;

    .line 746
    .line 747
    if-eqz v13, :cond_16

    .line 748
    .line 749
    invoke-static {v7, v11, v10, v13}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 750
    .line 751
    .line 752
    goto :goto_13

    .line 753
    :cond_16
    const-string v0, "cache.key"

    .line 754
    .line 755
    :try_start_8
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    invoke-interface {v7, v0, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    invoke-static {v3, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    if-nez v3, :cond_17

    .line 768
    .line 769
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    invoke-interface {v3, v0, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 774
    .line 775
    .line 776
    :cond_17
    invoke-interface {v2, v10}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 781
    .line 782
    .line 783
    :catchall_6
    :goto_13
    if-eqz v13, :cond_19

    .line 784
    .line 785
    iget-object v0, v4, Lha/j0;->d:Ljava/util/Set;

    .line 786
    .line 787
    invoke-interface {v0, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    if-nez v0, :cond_18

    .line 792
    .line 793
    goto :goto_14

    .line 794
    :cond_18
    :try_start_9
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 795
    .line 796
    new-instance v2, Lb9/e;

    .line 797
    .line 798
    invoke-direct {v2, v4, v6}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v13, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 802
    .line 803
    .line 804
    goto :goto_14

    .line 805
    :catchall_7
    move-exception v0

    .line 806
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    const-string v3, "[Hchat:SnsAntiRecall] Hook\u65e7\u7248\u670b\u53cb\u5708\u4e3b\u9875\u5f00\u5173\u5931\u8d25: "

    .line 811
    .line 812
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 813
    .line 814
    .line 815
    :cond_19
    :goto_14
    return-void

    .line 816
    :pswitch_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    invoke-static {v0}, Lya/i;->a(Lr8/g;)V

    .line 820
    .line 821
    .line 822
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 823
    .line 824
    invoke-virtual {v2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->install(Lr8/g;)V

    .line 825
    .line 826
    .line 827
    invoke-static {v0}, Lc9/g;->k(Lr8/g;)V

    .line 828
    .line 829
    .line 830
    const-class v2, Lf8/e;

    .line 831
    .line 832
    new-instance v3, Leb/s;

    .line 833
    .line 834
    invoke-direct {v3, v1, v0, v8}, Leb/s;-><init>(Lr8/a;Lr8/g;I)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 838
    .line 839
    .line 840
    return-void

    .line 841
    :pswitch_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 845
    .line 846
    invoke-static {v0}, Le9/q;->i(Lr8/g;)V

    .line 847
    .line 848
    .line 849
    const-class v2, Lf8/e;

    .line 850
    .line 851
    new-instance v3, Le9/a;

    .line 852
    .line 853
    invoke-direct {v3, v1, v8, v0}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1, v2, v3}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 857
    .line 858
    .line 859
    return-void

    .line 860
    :pswitch_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    sget-object v2, Lr8/e;->a:Landroid/os/Handler;

    .line 864
    .line 865
    const-string v2, "conversation_group"

    .line 866
    .line 867
    const-string v3, "\u804a\u5929\u5206\u7ec4"

    .line 868
    .line 869
    sget-object v4, Lr8/c;->i:Lr8/c;

    .line 870
    .line 871
    new-instance v5, Lc9/f;

    .line 872
    .line 873
    invoke-direct {v5, v0, v8}, Lc9/f;-><init>(Lr8/g;I)V

    .line 874
    .line 875
    .line 876
    invoke-static {v7, v5, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    nop

    .line 881
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lc9/g;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "\u5feb\u6377\u7ec8\u6b62"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "\u53d1\u9001\u6587\u672c\u683c\u5f0f"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "\u5173\u952e\u8bcd\u901a\u77e5"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "\u81ea\u52a8\u56de\u590d"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "Protobuf"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "\u5fae\u4fe1\u5f3a\u4fdd\u6d3b"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "\u81ea\u52a8\u52fe\u9009\u539f\u56fe"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_6
    const-string v0, "\u97f3\u9891\u8f6c\u6362"

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_7
    const-string v0, "\u5c4f\u853d\u827e\u7279\u6240\u6709\u4eba"

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_8
    const-string v0, "\u7fa4\u804a\u6807\u7b7e"

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_9
    const-string v0, "\u60ac\u6d6e\u5feb\u6377\u83dc\u5355"

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_a
    const-string v0, "\u670b\u53cb\u5708\u9632\u64a4\u56de"

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_b
    const-string v0, "\u811a\u672c\u63d2\u4ef6"

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_c
    const-string v0, "\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_d
    const-string v0, "\u804a\u5929\u5206\u7ec4"

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
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
